/**
 * 
 */
package org.schema;

/**
 * 
 * https://schema.org/Thing
 * 
 * The most generic type of item.
 * 
 * @author María Arias de Reyna (@delawen)
 * 
 * 
 */
public class Thing {

    /**
     * An additional type for the item, typically used for adding more specific
     * types from external vocabularies in microdata syntax. This is a
     * relationship between something and a class that the thing is in. In RDFa
     * syntax, it is better to use the native RDFa syntax - the 'typeof'
     * attribute - for multiple types. Schema.org tools may have only weaker
     * understanding of extra types, in particular those defined externally.
     */
    private String additionalType;

    /**
     * An alias for the item.
     */
    private String alternateName;

    /**
     * A short description of the item.
     */
    private String description;

    /**
     * An image of the item. This can be a URL or a fully described ImageObject.
     */
    private Thing image;

    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main
     * entity being described.
     * 
     * See background notes for details. Inverse property: mainEntity.
     */
    private Thing mainEntityOfPage;

    /**
     * The name of the item.
     */
    private String name;

    /**
     * Indicates a potential Action, which describes an idealized action in
     * which this thing would play an 'object' role.
     */
    private Action potentialAction;

    /**
     * URL of a reference Web page that unambiguously indicates the item's
     * identity. E.g. the URL of the item's Wikipedia page, Freebase page, or
     * official website.
     */
    private String sameAs;

    /**
     * URL of the item.
     */
    private String url;

    public String getAdditionalType() {
        return additionalType;
    }

    public void setAdditionalType(String additionalType) {
        this.additionalType = additionalType;
    }

    public String getAlternateName() {
        return alternateName;
    }

    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Thing getImage() {
        return image;
    }

    public void setImage(Thing image) {
        if (image instanceof ImageObject) {
            this.image = image;
        } else { //URL == Text
            //workaround as java.lang.String cannot be extended
            this.image = new ImageObject();
            this.image.setUrl(image.toString());
        }
    }

    public Thing getMainEntityOfPage() {
        return mainEntityOfPage;
    }

    public void setMainEntityOfPage(Thing mainEntityOfPage) {
        if (mainEntityOfPage instanceof CreativeWork) {
            this.mainEntityOfPage = mainEntityOfPage;
        } else { //URL == Text
            //workaround as java.lang.String cannot be extended
            this.mainEntityOfPage = new CreativeWork();
            this.mainEntityOfPage.setUrl(mainEntityOfPage.toString());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Action getPotentialAction() {
        return potentialAction;
    }

    public void setPotentialAction(Action potentialAction) {
        this.potentialAction = potentialAction;
    }

    public String getSameAs() {
        return sameAs;
    }

    public void setSameAs(String sameAs) {
        this.sameAs = sameAs;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
