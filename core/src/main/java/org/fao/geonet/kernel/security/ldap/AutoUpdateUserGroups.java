/**
 * 
 */
package org.fao.geonet.kernel.security.ldap;

import org.fao.geonet.domain.Group;
import org.fao.geonet.domain.User;
import org.fao.geonet.events.user.GroupJoined;
import org.springframework.context.ApplicationListener;
import org.springframework.ldap.core.ContextSource;
import org.springframework.ldap.core.DirContextAdapter;
import org.springframework.ldap.core.DistinguishedName;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.security.ldap.LdapUtils;

import java.util.Map;
import javax.naming.Context;

/**
 * When a user-group relation is created, add it to LDAP
 * 
 * @author delawen
 * 
 * 
 */
public class AutoUpdateUserGroups implements ApplicationListener<GroupJoined> {

    private LdapTemplate template;
    private String baseDn = "ou=groups";
    private String groupAttribute = "cn";
    private Boolean withProfiles = true;
    private String profilePattern = "{0}_{1}";
    private Map<String, String> profileMapping;

    /**
     * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
     * @param event
     */
    @Override
    public void onApplicationEvent(GroupJoined event) {
        Group group = event.getUserGroup().getGroup();
        User user = event.getUserGroup().getUser();
        String identifier = group.getName();
        String username = user.getUsername();
        String p = event.getUserGroup().getProfile().name();

        if (!withProfiles) {
            saveUserGroup(identifier, username);
        } else {
            String profile = (profileMapping.containsKey(p) ? profileMapping
                    .get(p) : p);
            String id = profilePattern;
            id = id.replace("{0}", profile);
            id = id.replace("{1}", identifier);
            saveUserGroup(id, username);
        }
    }

    private void saveUserGroup(String identifier, String username) {
        DirContextAdapter group = getGroup(identifier);

        if (group != null) {
            String[] memberuids = group.getStringAttributes("memberUid");
            if(memberuids == null) {
                memberuids = new String[0];
            }
            String[] newmemberuids = new String[memberuids.length + 1];
            
            for(int i = 0; i < memberuids.length; i++) {
                newmemberuids[i] = memberuids[i];
                //is it already added?
                if(memberuids[i].equalsIgnoreCase(username)){
                    return;
                }
            }
            newmemberuids[newmemberuids.length - 1] = username;

            group.setAttributeValues("memberUid", newmemberuids);
            
            template.modifyAttributes(group);
            LdapUtils.closeContext((Context) group);
        }
    }

    public DistinguishedName buildDn(String s) {
        DistinguishedName dn = new DistinguishedName(baseDn);
        dn.add(groupAttribute, s);
        return dn;
    }

    public DirContextAdapter getGroup(String group) {
        DistinguishedName dn = buildDn(group);

        try {
            Object obj = template.lookup(dn);
            if (obj instanceof DirContextAdapter) {
                return (DirContextAdapter) obj;
            }
            return null;
        } catch (org.springframework.ldap.NameNotFoundException e) {
            return null;
        }
    }

    public void setTemplate(LdapTemplate template) {
        this.template = template;
    }

    public void setBaseDn(String baseDn) {
        this.baseDn = baseDn;
    }

    public void setGroupAttribute(String groupAttribute) {
        this.groupAttribute = groupAttribute;
    }

    public void setWithProfiles(Boolean withProfiles) {
        this.withProfiles = withProfiles;
    }

    public void setProfilePattern(String profilePattern) {
        this.profilePattern = profilePattern;
    }

    public void setContextSource(ContextSource contextSource) {
        this.template = new LdapTemplate(contextSource);
    }

    public void setProfileMapping(Map<String, String> profileMapping) {
        this.profileMapping = profileMapping;
    }
}