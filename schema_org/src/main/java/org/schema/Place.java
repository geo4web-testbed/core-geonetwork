/**
 * 
 */
package org.schema;

import org.schema.exception.IllegalArgumentException;

/**
 * 
 * TODO
 * 
 * https://schema.org/Place
 * 
 * @author María Arias de Reyna (@delawen)
 * 
 * 
 */
public class Place extends Thing {

    /**
     * A property-value pair representing an additional characteristics of the
     * entitity, e.g. a product feature or another characteristic for which
     * there is no matching property in schema.org.
     *
     * Note: Publishers should be aware that applications designed to use
     * specific schema.org properties (e.g. http://schema.org/width,
     * http://schema.org/color, http://schema.org/gtin13, ...) will typically
     * expect such data to be provided using those properties, rather than using
     * the generic property/value mechanism.
     * 
     */
    private PropertyValue additionalProperty;

    /**
     * Physical address of the item.
     * 
     */
    private PostalAddress address;

    /**
     * The overall rating, based on a collection of reviews or ratings, of the
     * item.
     */
    private AggregateRating aggregateRating;

    /**
     * A short textual code (also called "store code") that uniquely identifies
     * a place of business. The code is typically assigned by the
     * parentOrganization and used in structured URLs.
     *
     * For example, in the URL
     * http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code "3047"
     * is a branchCode for a particular branch.
     * 
     */
    private String branchCode;

    /**
     * The basic containment relation between a place and one that contains it.
     * Supersedes containedIn.
     * 
     * Inverse property: containsPlace.
     */
    private Place containedInPlace;

    /**
     * The basic containment relation between a place and another that it
     * contains. Inverse property: containsPlace.
     */
    private Place containsPlace;

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
     * The geo coordinates of the place.
     * 
     */
    private StructuredValue geo;

    /**
     * The Global Location Number (GLN, sometimes also referred to as
     * International Location Number or ILN) of the respective organization,
     * person, or place. The GLN is a 13-digit number used to identify parties
     * and physical locations.
     */
    private String globalLocationNumber;

    /**
     * A URL to a map of the place. Supersedes map, maps.
     * 
     */
    private Map hasMap;

    /**
     * The International Standard of Industrial Classification of All Economic
     * Activities (ISIC), Revision 4 code for a particular organization,
     * business person, or place.
     */
    private String isicV4;

    /**
     *  An associated logo.
     */
    private ImageObject logo;

    /**
     * The opening hours of a certain place.
     */
    private OpeningHoursSpecification openingHoursSpecification;

    /**
     * A photograph of this place. Supersedes photos.
     */
    private CreativeWork photo;
    /**
     * A review of the item. Supersedes reviews.
     */
    private Review review;
    /**
     * The telephone number.
     */
    private String telephone;

    public PropertyValue getAdditionalProperty() {
        return additionalProperty;
    }

    public void setAdditionalProperty(PropertyValue additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public PostalAddress getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        if (address instanceof PostalAddress) {
            this.address = (PostalAddress) address;
        } else { //URL == Text
            //workaround as java.lang.String cannot be extended
            this.address = new PostalAddress();
            //this.address.setUrl(address.toString());
            //TODO
        }
    }

    public AggregateRating getAggregateRating() {
        return aggregateRating;
    }

    public void setAggregateRating(AggregateRating aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public Place getContainedInPlace() {
        return containedInPlace;
    }

    public void setContainedInPlace(Place containedInPlace) {
        this.containedInPlace = containedInPlace;
    }

    public Place getContainsPlace() {
        return containsPlace;
    }

    public void setContainsPlace(Place containsPlace) {
        this.containsPlace = containsPlace;
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

    public StructuredValue getGeo() {
        return geo;
    }

    public void setGeo(StructuredValue geo) {
        if (geo instanceof GeoShape || geo instanceof GeoCoordinates) {
            this.geo = geo;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "GeoShape", "GeoCoordinates" });
        }
    }

    public String getGlobalLocationNumber() {
        return globalLocationNumber;
    }

    public void setGlobalLocationNumber(String globalLocationNumber) {
        this.globalLocationNumber = globalLocationNumber;
    }

    public Map getHasMap() {
        return hasMap;
    }

    public void setHasMap(Map hasMap) {
        if (hasMap instanceof Map) {
            this.hasMap = (Map) hasMap;
        } else { //URL == Text
            //workaround as java.lang.String cannot be extended
            this.hasMap = new Map();
            this.hasMap.setUrl(hasMap.toString());
        }
    }

    public String getIsicV4() {
        return isicV4;
    }

    public void setIsicV4(String isicV4) {
        this.isicV4 = isicV4;
    }

    public ImageObject getLogo() {
        return logo;
    }

    public void setLogo(Object logo) {
        if (logo instanceof ImageObject) {
            this.logo = (ImageObject) logo;
        } else { //URL == Text
            //workaround as java.lang.String cannot be extended
            this.logo = new ImageObject();
            this.logo.setUrl(logo.toString());
        }
    }

    public OpeningHoursSpecification getOpeningHoursSpecification() {
        return openingHoursSpecification;
    }

    public void setOpeningHoursSpecification(
            OpeningHoursSpecification openingHoursSpecification) {
        this.openingHoursSpecification = openingHoursSpecification;
    }

    public CreativeWork getPhoto() {
        return photo;
    }

    public void setPhoto(CreativeWork photo) {
        if (photo instanceof Photograph || photo instanceof MediaObject) {
            this.photo = photo;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "Photograph", "MediaObject" });
        }
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
