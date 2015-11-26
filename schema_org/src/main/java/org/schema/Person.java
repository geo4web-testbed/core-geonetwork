/**
 * 
 */
package org.schema;

import java.util.Date;

import org.schema.exception.IllegalArgumentException;

/**
 * 
 * 
 * https://schema.org/Person
 * 
 * @author María Arias de Reyna (@delawen)
 * 
 * 
 */
public class Person extends Thing {
    /**
     * An additional name for a Person, can be used for a middle name.
     */
    private String additionalName;

    /**
     * Physical address of the item.
     * 
     */
    private Object address;
    /**
     * An organization that this person is affiliated with. For example, a
     * school/university, a club, or a team.
     */
    private Organization affiliation;

    /**
     * An organization that the person is an alumni of. Inverse property:
     * alumni.
     */
    private Organization alumniOf;

    /**
     * An award won by or for this item. Supersedes awards.
     */
    private String award;

    /**
     * Date of birth.
     */
    private Date birthDate;

    /**
     * The place where the person was born.
     */
    private Place birthPlace;

    /**
     * The brand(s) associated with a product or service, or the brand(s)
     * maintained by an organization or business person.
     */
    private Thing brand;

    /**
     * A child of the person.
     */
    private Person children;

    /**
     * A colleague of the person. Supersedes colleagues.
     */
    private Person colleague;

    /**
     * A contact point for a person or organization. Supersedes contactPoints.
     */
    private ContactPoint contactPoint;
    /**
     * Date of death.
     */
    private Date deathDate;
    /**
     * The place where the person died.
     */
    private Place deathPlace;
    /**
     * The Dun & Bradstreet DUNS number for identifying an organization or
     * business person.
     */
    private String duns;
    /**
     * Email address.
     */
    private String email;
    /**
     * Family name. In the U.S., the last name of an Person. This can be used
     * along with givenName instead of the name property.
     */
    private String familyName;
    /**
     * The fax number.
     */
    private String faxNumber;

    /**
     * The most generic uni-directional social relation.
     */
    private Person follows;
    /**
     * Gender of the person.
     */
    private String gender;

    /**
     * Given name. In the U.S., the first name of a Person. This can be used
     * along with familyName instead of the name property.
     */
    private String givenName;

    /**
     * The Global Location Number (GLN, sometimes also referred to as
     * International Location Number or ILN) of the respective organization,
     * person, or place. The GLN is a 13-digit number used to identify parties
     * and physical locations.
     */
    private String globalLocationNumber;

    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or
     * Service.
     */
    private OfferCatalog hasOfferCatalog;

    /**
     * Points-of-Sales operated by the organization or person.
     */
    private Place hasPOS;

    /**
     * The height of the item.
     */
    private Intangible height;

    /**
     * A contact location for a person's residence.
     */
    private ContactPoint homeLocation;
    private Place homeLocation2;
    /**
     * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
     */
    private String honorificPrefix;
    /**
     * An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
     */
    private String honorificSuffix;
    /**
     * The International Standard of Industrial Classification of All Economic
     * Activities (ISIC), Revision 4 code for a particular organization,
     * business person, or place.
     */
    private String isicV4;
    /**
     * The job title of the person (for example, Financial Manager).
     */
    private String jobTitle;

    /**
     * The most generic bi-directional social/work relation.
     */
    private Person knows;

    /**
     * A pointer to products or services offered by the organization or person.
     * Inverse property: offeredBy
     */
    private Offer makesOffer;
    /**
     * An Organization (or ProgramMembership) to which this Person or
     * Organization belongs. Inverse property: member.
     */
    private Organization memberOf;
    private ProgramMembership memberOf2;

    /**
     * The North American Industry Classification System (NAICS) code for a
     * particular organization or business person.
     */
    private String naics;
    /**
     * Nationality of the person.
     */
    private Country nationality;
    /**
     * The total financial value of the person as calculated by subtracting
     * assets from liabilities.
     */
    private PriceSpecification netWorth;
    /**
     * Products owned by the organization or person.
     */
    private OwnershipInfo owns;
    private Product owns2;

    /**
     * A parent of this person. Supersedes parents.
     */
    private Person parent;
    /**
     * Event that this person is a performer or participant in.
     */
    private Event performerIn;
    /**
     * The most generic familial relation.
     */
    private Person relatedTo;
    /**
     * A pointer to products or services sought by the organization or person
     * (demand).
     */
    private Demand seeks;
    /**
     * A sibling of the person. Supersedes siblings.
     */
    private Person sibling;
    /**
     * The person's spouse.
     */
    private Person spouse;
    /**
     * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US
     * or the CIF/NIF in Spain.
     */
    private String taxID;
    /**
     * The telephone number.
     */
    private String telephone;
    /**
     * The Value-added Tax ID of the organization or person.
     */
    private String vatID;
    /**
     * The weight of the product or person.
     */
    private QuantitativeValue weight;
    /**
     * A contact location for a person's place of work.
     */
    private ContactPoint workLocation;
    private Place workLocation2;
    /**
     * Organizations that the person works for.
     */
    private Organization worksFor;

    public String getAdditionalName() {
        return additionalName;
    }

    public void setAdditionalName(String additionalName) {
        this.additionalName = additionalName;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        if (address instanceof PostalAddress) {
            this.address = address;
        } else {
            this.address = address.toString();
        }
    }

    public Organization getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Organization affiliation) {
        this.affiliation = affiliation;
    }

    public Organization getAlumniOf() {
        return alumniOf;
    }

    public void setAlumniOf(Organization alumniOf) {
        this.alumniOf = alumniOf;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Place getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(Place birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Thing getBrand() {
        return brand;
    }

    public void setBrand(Thing brand) {
        if (brand instanceof Brand || brand instanceof Organization) {
            this.brand = brand;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "Brand", "Organization" });
        }
    }

    public Person getChildren() {
        return children;
    }

    public void setChildren(Person children) {
        this.children = children;
    }

    public Person getColleague() {
        return colleague;
    }

    public void setColleague(Person colleague) {
        this.colleague = colleague;
    }

    public ContactPoint getContactPoint() {
        return contactPoint;
    }

    public void setContactPoint(ContactPoint contactPoint) {
        this.contactPoint = contactPoint;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public Place getDeathPlace() {
        return deathPlace;
    }

    public void setDeathPlace(Place deathPlace) {
        this.deathPlace = deathPlace;
    }

    public String getDuns() {
        return duns;
    }

    public void setDuns(String duns) {
        this.duns = duns;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public Person getFollows() {
        return follows;
    }

    public void setFollows(Person follows) {
        this.follows = follows;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getGlobalLocationNumber() {
        return globalLocationNumber;
    }

    public void setGlobalLocationNumber(String globalLocationNumber) {
        this.globalLocationNumber = globalLocationNumber;
    }

    public OfferCatalog getHasOfferCatalog() {
        return hasOfferCatalog;
    }

    public void setHasOfferCatalog(OfferCatalog hasOfferCatalog) {
        this.hasOfferCatalog = hasOfferCatalog;
    }

    public Place getHasPOS() {
        return hasPOS;
    }

    public void setHasPOS(Place hasPOS) {
        this.hasPOS = hasPOS;
    }

    public Intangible getHeight() {
        return height;
    }

    public void setHeight(Intangible height) {
        if (height instanceof QuantitativeValue || height instanceof Distance) {
            this.height = height;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "QuantitativeValue", "Distance" });
        }
    }

    public ContactPoint getHomeLocation() {
        return homeLocation;
    }

    public void setHomeLocation(ContactPoint homeLocation) {
        this.homeLocation = homeLocation;
    }

    public String getHonorificPrefix() {
        return honorificPrefix;
    }

    public void setHonorificPrefix(String honorificPrefix) {
        this.honorificPrefix = honorificPrefix;
    }

    public String getHonorificSuffix() {
        return honorificSuffix;
    }

    public void setHonorificSuffix(String honorificSuffix) {
        this.honorificSuffix = honorificSuffix;
    }

    public String getIsicV4() {
        return isicV4;
    }

    public void setIsicV4(String isicV4) {
        this.isicV4 = isicV4;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Person getKnows() {
        return knows;
    }

    public void setKnows(Person knows) {
        this.knows = knows;
    }

    public Offer getMakesOffer() {
        return makesOffer;
    }

    public void setMakesOffer(Offer makesOffer) {
        this.makesOffer = makesOffer;
    }

    public Organization getMemberOf() {
        return memberOf;
    }

    public void setMemberOf(Organization memberOf) {
        this.memberOf = memberOf;
    }

    public String getNaics() {
        return naics;
    }

    public void setNaics(String naics) {
        this.naics = naics;
    }

    public Country getNationality() {
        return nationality;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public PriceSpecification getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(PriceSpecification netWorth) {
        this.netWorth = netWorth;
    }

    public OwnershipInfo getOwns() {
        return owns;
    }

    public void setOwns(OwnershipInfo owns) {
        this.owns = owns;
    }

    public Person getParent() {
        return parent;
    }

    public void setParent(Person parent) {
        this.parent = parent;
    }

    public Event getPerformerIn() {
        return performerIn;
    }

    public void setPerformerIn(Event performerIn) {
        this.performerIn = performerIn;
    }

    public Person getRelatedTo() {
        return relatedTo;
    }

    public void setRelatedTo(Person relatedTo) {
        this.relatedTo = relatedTo;
    }

    public Demand getSeeks() {
        return seeks;
    }

    public void setSeeks(Demand seeks) {
        this.seeks = seeks;
    }

    public Person getSibling() {
        return sibling;
    }

    public void setSibling(Person sibling) {
        this.sibling = sibling;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getVatID() {
        return vatID;
    }

    public void setVatID(String vatID) {
        this.vatID = vatID;
    }

    public QuantitativeValue getWeight() {
        return weight;
    }

    public void setWeight(QuantitativeValue weight) {
        this.weight = weight;
    }

    public ContactPoint getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(ContactPoint workLocation) {
        this.workLocation = workLocation;
    }

    public Organization getWorksFor() {
        return worksFor;
    }

    public void setWorksFor(Organization worksFor) {
        this.worksFor = worksFor;
    }

}
