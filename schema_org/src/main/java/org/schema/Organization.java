/**
 * 
 */
package org.schema;

import java.util.Date;

import org.schema.exception.IllegalArgumentException;

/**
 * 
 * 
 * https://schema.org/Organization
 * 
 * @author María Arias de Reyna (@delawen)
 * 
 * 
 */
public class Organization extends Thing {

    /**
     * Physical address of the item.
     */
    private Object address;

    /**
     * The overall rating, based on a collection of reviews or ratings, of the
     * item.
     */
    private AggregateRating aggregateRating;

    /**
     * Alumni of an organization. Inverse property: alumniOf.
     * 
     */
    private Person alumni;

    /**
     * The geographic area where a service or offered item is provided.
     * Supersedes serviceArea.
     */
    private Object areaServed;

    /**
     * An award won by or for this item. Supersedes awards.
     */
    private String award;
    /**
     * The brand(s) associated with a product or service, or the brand(s)
     * maintained by an organization or business person.
     */
    private Thing brand;

    /**
     * A contact point for a person or organization. Supersedes contactPoints.
     */
    private ContactPoint contactPoint;

    /**
     * A relationship between an organization and a department of that
     * organization, also described as an organization (allowing different urls,
     * logos, opening hours). For example: a store with a pharmacy, or a bakery
     * with a cafe.
     */
    private Organization department;

    /**
     * The date that this organization was dissolved.
     */
    private Date dissolutionDate;
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
     * Someone working for this organization. Supersedes employees.
     */
    private Person employee;

    /**
     * Upcoming or past event associated with this place, organization, or
     * action. Supersedes events.
     */
    private Event event;

    /**
     * The fax number.
     */
    private String faxNumber;

    /**
     * A person who founded this organization. Supersedes founders.
     */
    private Person founder;

    /**
     * The date that this organization was founded.
     */
    private Date foundingDate;
    /**
     * The place where the Organization was founded.
     */
    private Place foundingLocation;
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
     * 
     */
    private OfferCatalog hasOfferCatalog;
    /**
     * Points-of-Sales operated by the organization or person.
     */
    private Place hasPOS;
    /**
     * The International Standard of Industrial Classification of All Economic
     * Activities (ISIC), Revision 4 code for a particular organization,
     * business person, or place.
     */
    private String isicV4;
    /**
     * The official name of the organization, e.g. the registered company name.
     */
    private String legalName;
    /**
     * The location of for example where the event is happening, an organization
     * is located, or where an action takes place.
     */
    private Object location;

    /**
     * An associated logo.
     */
    private Object logo;

    /**
     * A pointer to products or services offered by the organization or person.
     * Inverse property: offeredBy.
     */
    private Offer makesOffer;
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be
     * members of organizations; ProgramMembership is typically for individuals.
     * Supersedes musicGroupMember, members. Inverse property: memberOf.
     */
    private Thing member;

    /**
     * An Organization (or ProgramMembership) to which this Person or
     * Organization belongs. Inverse property: member.
     */
    private Thing memberOf;

    /**
     * The North American Industry Classification System (NAICS) code for a
     * particular organization or business person.
     */
    private String naics;

    /**
     * The number of employees in an organization e.g. business.
     */
    private QuantitativeValue numberOfEmployees;

    /**
     * Products owned by the organization or person.
     */
    private Thing owns;

    /**
     * The larger organization that this organization is a branch of, if any.
     * Supersedes branchOf. Inverse property: subOrganization.
     */
    private Organization parentOrganization;

    /**
     * A review of the item. Supersedes reviews.
     */
    private Review review;
    /**
     * A pointer to products or services sought by the organization or person
     * (demand).
     */
    private Demand seeks;
    /**
     * 
     * A relationship between two organizations where the first includes the
     * second, e.g., as a subsidiary. See also: the more specific 'department'
     * property.
     *
     * Inverse property: parentOrganization.
     * 
     */
    private Organization subOrganization;
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

    public AggregateRating getAggregateRating() {
        return aggregateRating;
    }

    public void setAggregateRating(AggregateRating aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public Person getAlumni() {
        return alumni;
    }

    public void setAlumni(Person alumni) {
        this.alumni = alumni;
    }

    public Object getAreaServed() {
        return areaServed;
    }

    public void setAreaServed(Object areaServed) {
        if (areaServed instanceof Place || areaServed instanceof GeoShape
                || areaServed instanceof AdministrativeArea) {
            this.areaServed = areaServed;
        } else {
            this.areaServed = areaServed.toString();
        }
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
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

    public ContactPoint getContactPoint() {
        return contactPoint;
    }

    public void setContactPoint(ContactPoint contactPoint) {
        this.contactPoint = contactPoint;
    }

    public Organization getDepartment() {
        return department;
    }

    public void setDepartment(Organization department) {
        this.department = department;
    }

    public Date getDissolutionDate() {
        return dissolutionDate;
    }

    public void setDissolutionDate(Date dissolutionDate) {
        this.dissolutionDate = dissolutionDate;
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

    public Person getEmployee() {
        return employee;
    }

    public void setEmployee(Person employee) {
        this.employee = employee;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public Person getFounder() {
        return founder;
    }

    public void setFounder(Person founder) {
        this.founder = founder;
    }

    public Date getFoundingDate() {
        return foundingDate;
    }

    public void setFoundingDate(Date foundingDate) {
        this.foundingDate = foundingDate;
    }

    public Place getFoundingLocation() {
        return foundingLocation;
    }

    public void setFoundingLocation(Place foundingLocation) {
        this.foundingLocation = foundingLocation;
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

    public String getIsicV4() {
        return isicV4;
    }

    public void setIsicV4(String isicV4) {
        this.isicV4 = isicV4;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        if (location instanceof Place || location instanceof PostalAddress) {
            this.location = location;
        } else {
            this.location = location.toString();
        }
    }

    public Object getLogo() {
        return logo;
    }

    public void setLogo(Object logo) {
        if (logo instanceof ImageObject) {
            this.logo = logo;
        } else {
            this.logo = logo.toString();
        }
    }

    public Offer getMakesOffer() {
        return makesOffer;
    }

    public void setMakesOffer(Offer makesOffer) {
        this.makesOffer = makesOffer;
    }

    public Thing getMember() {
        return member;
    }

    public void setMember(Thing member) {
        if (member instanceof Person || member instanceof Organization) {
            this.member = member;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "Person", "Organization" });
        }
    }

    public Thing getMemberOf() {
        return memberOf;
    }

    public void setMemberOf(Thing memberOf) {
        if (memberOf instanceof ProgramMembership
                || memberOf instanceof Organization) {
            this.memberOf = memberOf;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "ProgramMembership", "Organization" });
        }
    }

    public String getNaics() {
        return naics;
    }

    public void setNaics(String naics) {
        this.naics = naics;
    }

    public QuantitativeValue getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(QuantitativeValue numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Thing getOwns() {
        return owns;
    }

    public void setOwns(Thing owns) {
        if (owns instanceof OwnershipInfo || owns instanceof Product) {
            this.owns = owns;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "OwnershipInfo", "Product" });
        }
    }

    public Organization getParentOrganization() {
        return parentOrganization;
    }

    public void setParentOrganization(Organization parentOrganization) {
        this.parentOrganization = parentOrganization;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public Demand getSeeks() {
        return seeks;
    }

    public void setSeeks(Demand seeks) {
        this.seeks = seeks;
    }

    public Organization getSubOrganization() {
        return subOrganization;
    }

    public void setSubOrganization(Organization subOrganization) {
        this.subOrganization = subOrganization;
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
}
