/**
 * 
 */
package org.schema;

/**
 * 
 * 
 * https://schema.org/ContactPoint
 * 
 * @author María Arias de Reyna (@delawen)
 * 
 * 
 */
public class ContactPoint extends StructuredValue {

    /**
     * The geographic area where a service or offered item is provided.
     * Supersedes serviceArea.
     */
    private Object areaServed;

    /**
     * A language someone may use with the item.
     */
    private Language availableLanguage;

    /**
     * An option available on this contact point (e.g. a toll-free number or
     * support for hearing-impaired callers).
     */
    private ContactPointOption contactOption;

    /**
     * A person or organization can have different contact points, for different
     * purposes. For example, a sales contact point, a PR contact point and so
     * on. This property is used to specify the kind of contact point.
     */
    private String contactType;

    /**
     * Email address.
     */
    private String email;

    /**
     * The fax number.
     */
    private String faxNumber;

    /**
     * The hours during which this service or contact is available.
     */
    private OpeningHoursSpecification hoursAvailable;

    /**
     * The product or service this support contact point is related to (such as
     * product support for a particular product line). This can be a specific
     * product or product line (e.g. "iPhone") or a general category of products
     * or services (e.g. "smartphones").
     */
    private Object productSupported;

    /**
     * The telephone number.
     */
    private String telephone;

    public Object getAreaServed() {
        return areaServed;
    }

    public void setAreaServed(Object areaServed) {

        if ((areaServed instanceof AdministrativeArea)
                || (areaServed instanceof Place)
                || (areaServed instanceof GeoShape)) {
            this.areaServed = areaServed;
        } else {
            this.areaServed = areaServed.toString();
        }
    }

    public Language getAvailableLanguage() {
        return availableLanguage;
    }

    public void setAvailableLanguage(Language availableLanguage) {
        this.availableLanguage = availableLanguage;
    }

    public ContactPointOption getContactOption() {
        return contactOption;
    }

    public void setContactOption(ContactPointOption contactOption) {
        this.contactOption = contactOption;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public OpeningHoursSpecification getHoursAvailable() {
        return hoursAvailable;
    }

    public void setHoursAvailable(OpeningHoursSpecification hoursAvailable) {
        this.hoursAvailable = hoursAvailable;
    }

    public Object getProductSupported() {
        return productSupported;
    }

    public void setProductSupported(Object productSupported) {
        if (productSupported instanceof Product) {
            this.productSupported = productSupported;
        } else {
            this.productSupported = productSupported.toString();
        }
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
