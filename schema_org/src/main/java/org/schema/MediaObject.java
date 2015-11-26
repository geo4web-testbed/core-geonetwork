/**
 * 
 */
package org.schema;

import java.util.Date;

import org.schema.exception.IllegalArgumentException;

/**
 * 
 * 
 * https://schema.org/MediaObject
 * 
 * @author María Arias de Reyna (@delawen)
 * 
 * 
 */
public class MediaObject extends CreativeWork {
    /**
     * A NewsArticle associated with the Media Object.
     */
    private NewsArticle associatedArticle;
    /**
     * The bitrate of the media object.
     */
    private String bitrate;
    /**
     * File size in (mega/kilo) bytes.
     */
    private String contentSize;
    /**
     * Actual bytes of the media object, for example the image file or video
     * file.
     */
    private String contentUrl;

    /**
     * The duration of the item (movie, audio recording, event, etc.) in ISO
     * 8601 date format.
     */
    private Duration duration;

    /**
     * A URL pointing to a player for a specific video. In general, this is the
     * information in the src element of an embed tag and should not be the same
     * as the content of the loc tag.
     */
    private String embedUrl;

    /**
     * The CreativeWork encoded by this media object.
     */
    private CreativeWork encodesCreativeWork;

    /**
     * mp3, mpeg4, etc.
     */
    private String encodingFormat;

    /**
     * Date the content expires and is no longer useful or available. Useful for
     * videos.
     */
    private Date expires;

    /**
     * The height of the item.
     */
    private Thing height;

    /**
     * Player type required—for example, Flash or Silverlight.
     */
    private String playerType;

    /**
     * The production company or studio responsible for the item e.g. series,
     * video game, episode etc.
     */
    private Organization productionCompany;

    /**
     * The regions where the media is allowed. If not specified, then it's
     * assumed to be allowed everywhere. Specify the countries in ISO 3166
     * format.
     */
    private Place regionsAllowed;

    /**
     * Indicates if use of the media require a subscription (either paid or
     * free). Allowed values are true or false (note that an earlier version had
     * 'yes', 'no').
     */
    private Boolean requiresSubscription;

    /**
     * Date when this media object was uploaded to this site.
     */
    private Date uploadDate;

    /**
     * The width of the item.
     */
    private Thing width;

    public NewsArticle getAssociatedArticle() {
        return associatedArticle;
    }

    public void setAssociatedArticle(NewsArticle associatedArticle) {
        this.associatedArticle = associatedArticle;
    }

    public String getBitrate() {
        return bitrate;
    }

    public void setBitrate(String bitrate) {
        this.bitrate = bitrate;
    }

    public String getContentSize() {
        return contentSize;
    }

    public void setContentSize(String contentSize) {
        this.contentSize = contentSize;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getEmbedUrl() {
        return embedUrl;
    }

    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

    public CreativeWork getEncodesCreativeWork() {
        return encodesCreativeWork;
    }

    public void setEncodesCreativeWork(CreativeWork encodesCreativeWork) {
        this.encodesCreativeWork = encodesCreativeWork;
    }

    public String getEncodingFormat() {
        return encodingFormat;
    }

    public void setEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
    }

    public Date getExpires() {
        return expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
    }

    public Thing getHeight() {
        return height;
    }

    public void setHeight(Thing height) {
        if (height instanceof QuantitativeValue || height instanceof Distance) {
            this.height = height;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "QuantitativeValue", "Distance" });
        }
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public Organization getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(Organization productionCompany) {
        this.productionCompany = productionCompany;
    }

    public Place getRegionsAllowed() {
        return regionsAllowed;
    }

    public void setRegionsAllowed(Place regionsAllowed) {
        this.regionsAllowed = regionsAllowed;
    }

    public Boolean getRequiresSubscription() {
        return requiresSubscription;
    }

    public void setRequiresSubscription(Boolean requiresSubscription) {
        this.requiresSubscription = requiresSubscription;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Thing getWidth() {
        return width;
    }

    public void setWidth(Thing width) {
        if (width instanceof QuantitativeValue || width instanceof Distance) {
            this.width = width;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "QuantitativeValue", "Distance" });
        }
    }

}
