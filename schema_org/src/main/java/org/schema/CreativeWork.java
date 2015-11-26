/**
 * 
 */
package org.schema;

import java.util.Date;

import org.schema.exception.IllegalArgumentException;

/**
 * 
 * 
 * https://schema.org/CreativeWork
 * 
 * @author María Arias de Reyna (@delawen)
 * 
 * 
 */
public class CreativeWork extends Thing {

    /**
     * The subject matter of the content.
     */
    private Thing about;
    /**
     * Indicates that the resource is compatible with the referenced
     * accessibility API.
     */
    private String accessibilityAPI;
    /**
     * Identifies input methods that are sufficient to fully control the
     * described resource (WebSchemas wiki lists possible values).
     */
    private String accessibilityControl;
    /**
     * Content features of the resource, such as accessible media, alternatives
     * and supported enhancements for accessibility (WebSchemas wiki lists
     * possible values).
     */
    private String accessibilityFeature;
    /**
     * A characteristic of the described resource that is physiologically
     * dangerous to some users. Related to WCAG 2.0 guideline 2.3 (WebSchemas
     * wiki lists possible values).
     * 
     */
    private String accessibilityHazard;
    /**
     * Specifies the Person that is legally accountable for the CreativeWork.
     */
    private Person accountablePerson;

    /**
     * The overall rating, based on a collection of reviews or ratings, of the
     * item.
     */
    private AggregateRating aggregateRating;

    /**
     * A secondary title of the CreativeWork.
     */
    private String alternativeHeadline;

    /**
     * A media object that encodes this CreativeWork.This property is a synonym
     * for encoding.
     */
    private MediaObject associatedMedia;

    /**
     * An intended audience, i.e.a group for whom something was created.
     * Supersedes serviceAudience.
     */
    private Audience audience;
    /**
     * An embedded audio object.
     */
    private AudioObject audio;

    /**
     * The author of this content.Please note that author is special in that
     * HTML 5 provides a special mechanism for indicating authorship via the rel
     * tag. That is equivalent to this and may be used interchangeably.
     */
    private Thing author;

    /**
     * An award won by or for this item. Supersedes awards.
     */
    private String award;

    /**
     * Fictional person connected with a creative work.
     */
    private Person character;

    /**
     * A citation or reference to another creative work, such as another
     * publication, web page, scholarly article, etc.
     */
    private Object citation;

    /**
     * Comment Comments, typically from users.
     */
    private Comment comment;

    /**
     * The number of comments this
     * 
     * CreativeWork (e.g. Article, Question or Answer) has received. This is
     * most applicable to works published in Web sites with commenting system;
     * additional comments may exist elsewhere.
     * 
     */
    private Integer commentCount;

    /**
     * The location depicted or described in the content. For example, the
     * location in a photograph or painting.
     */
    private Place contentLocation;

    /**
     * 
     * Official rating of a piece of content—for example,'MPAA PG-13'.
     */
    private String contentRating;

    /**
     * A secondary contributor to the CreativeWork.
     */
    private Thing contributor;

    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    private Thing copyrightHolder;

    /**
     * The year during which the claimed copyright for the CreativeWork was
     * first asserted.
     */
    private Number copyrightYear;

    /**
     * The creator/ author of this CreativeWork.This is the same as the Author
     * property for CreativeWork.
     */
    private Thing creator;

    /**
     * The date on which the CreativeWork was created or the item was added to a
     * DataFeed.
     */
    private Date dateCreated;

    /**
     * The date on which the CreativeWork was most recently modified or when the
     * item's entry was modified within a DataFeed.
     */
    private Date dateModified;

    /**
     * 
     * Date of first broadcast/publication.
     */
    private Date datePublished;

    /**
     * A link to the page containing the comments of the CreativeWork.
     */
    private String discussionUrl;

    /**
     * Specifies the Person who edited the CreativeWork.
     */
    private Person editor;

    /**
     * An alignment to an established educational framework.
     */
    private AlignmentObject educationalAlignment;

    /**
     * The purpose of a work in the context of education;for
     * example,'assignment','group work'.
     */
    private String educationalUse;

    /**
     * A media object that encodes this CreativeWork.This property is a synonym
     * for associatedMedia.Supersedes encodings.
     */
    private MediaObject encoding;

    /**
     * A creative work that this work is an example/instance/realization/
     * derivation of. Inverse property:workExample.
     */
    private CreativeWork exampleOfWork;

    /**
     * Media type (aka MIME format, see IANA site) of the content e.g.
     * application/zip of a SoftwareApplication binary. In cases where a
     * CreativeWork has several media type representations, 'encoding' can be
     * used to indicate each MediaObject alongside particular fileFormat
     * information.
     * 
     */
    private String fileFormat;

    /**
     * Genre of the creative work or group.
     */
    private String genre;

    /**
     * 
     * Indicates a CreativeWork that is (in some sense) a part of this
     * CreativeWork. Inverse property:isPartOf.
     */
    private CreativeWork hasPart;

    /**
     * Headline of the article.
     */
    private String headline;

    /**
     * The language of the content or performance or used in an action.Please
     * use one of the language codes from the IETF BCP 47 standard.Supersedes
     * language.
     */
    private Object inLanguage;

    /**
     * The number of interactions for the CreativeWork using the WebSite or
     * SoftwareApplication.The most specific child type of InteractionCounter
     * should be used. Supersedes interactionCount.
     */
    private InteractionCounter interactionStatistic;

    /**
     * The predominant mode of learning supported by the learning resource.
     * Acceptable values are'active','expositive',or'mixed'.
     */
    private String interactivityType;

    /**
     * A resource that was used in the creation of this resource.This term can
     * be repeated for multiple sources. For example, http://
     * example.com/great-multiplication-intro.html.
     */
    private String isBasedOnUrl;

    /**
     * Indicates whether this content is family friendly.
     */
    private Boolean isFamilyFriendly;

    /**
     * 
     * Indicates a CreativeWork that this CreativeWork is (in some sense) part
     * of. Inverse property:hasPart.
     */
    private CreativeWork isPartOf;

    /**
     * Keywords or tags used to describe this content.Multiple entries in a
     * keywords list are typically delimited by commas.
     */
    private String keywords;

    /**
     * The predominant type or kind characterizing the learning resource.For
     * example,'presentation','handout'.
     */
    private String learningResourceType;

    /**
     * A license document that applies to this content, typically indicated by
     * URL.
     */
    private Object license;

    /**
     * The location where the CreativeWork was created, which may not be the
     * same as the location depicted in the CreativeWork.
     */
    private Place locationCreated;

    /**
     * Indicates the primary entity described in some page or other
     * CreativeWork.
     * 
     * 
     * Inverse property:mainEntityOfPage.
     */
    private Thing mainEntity;

    /**
     * Indicates that the CreativeWork contains a reference to, but is not
     * necessarily about a concept.
     */
    private Thing mentions;

    /**
     * An offer to provide this item—for example, an offer to sell a product,
     * rent the DVD of a movie, perform a service, or give away tickets to an
     * event.
     */
    private Offer offers;

    /**
     * The position of an item in a series or sequence of items. private
     * producer Person or private Organization The person or organization who
     * produced the
     * 
     * work (e.g. music album, movie, tv/radio series etc.).
     */
    private String position;

    /**
     * The service provider, service operator, or service performer; the goods
     * 
     * producer. Another party (a seller) may offer those services or goods on
     * behalf of the provider. A provider may also serve as the seller.
     * Supersedes carrier.
     * 
     */
    private Thing provider;

    /**
     * A publication event associated with the item.
     */
    private PublicationEvent publication;

    /**
     * The publisher of the creative work.
     */
    private Thing publisher;

    /**
     * Link to page describing the editorial principles of the organization
     * primarily responsible for the creation of the CreativeWork.
     */
    private String publishingPrinciples;

    /**
     * The Event where the CreativeWork was recorded.The CreativeWork may
     * capture all or part of the event.
     * 
     * Inverse property:recordedIn.
     */
    private Event recordedAt;

    /**
     * The place and time the release was issued, expressed as a
     * PublicationEvent.
     */
    private PublicationEvent releasedEvent;

    /**
     * A review of the item.Supersedes reviews.
     */
    private Review review;

    /**
     * Indicates (by URL or string) a particular version of a schema used in
     * some CreativeWork. For example, a document could declare a schemaVersion
     * using a URL such as http://schema.org/version/2.0/ if precise indication
     * of schema version was required by some application.
     */
    private String schemaVersion;

    /**
     * The Organization on whose behalf the creator was working.
     * 
     */
    private Organization sourceOrganization;

    /**
     * The textual content of this CreativeWork.
     */
    private String text;

    /**
     * A thumbnail image relevant to the Thing.
     */
    private String thumbnailUrl;

    /**
     * Approximate or typical time it takes to work with or through this
     * learning resource for the typical intended target
     * audience,e.g.'P30M','P1H25M'.
     */
    private Duration timeRequired;

    /**
     * Organization or person who adapts a creative work to different languages,
     * regional differences and technical requirements of a target market.
     */
    private Thing translator;

    /**
     * 
     * The typical expected age range,e.g.'7-9','11-'.
     */
    private String typicalAgeRange;

    /**
     * 
     * The version of the CreativeWork embodied by a specified resource.
     */
    private Number version;
    /**
     * 
     * An embedded video object.
     */
    private VideoObject video;

    /**
     * Example/instance/realization/ derivation of the concept of this creative
     * work. eg.The paperback edition, first edition, or eBook.Inverse
     * property:exampleOfWork.
     */
    private CreativeWork workExample;

    public Thing getAbout() {
        return about;
    }

    public void setAbout(Thing about) {
        this.about = about;
    }

    public String getAccessibilityAPI() {
        return accessibilityAPI;
    }

    public void setAccessibilityAPI(String accessibilityAPI) {
        this.accessibilityAPI = accessibilityAPI;
    }

    public String getAccessibilityControl() {
        return accessibilityControl;
    }

    public void setAccessibilityControl(String accessibilityControl) {
        this.accessibilityControl = accessibilityControl;
    }

    public String getAccessibilityFeature() {
        return accessibilityFeature;
    }

    public void setAccessibilityFeature(String accessibilityFeature) {
        this.accessibilityFeature = accessibilityFeature;
    }

    public String getAccessibilityHazard() {
        return accessibilityHazard;
    }

    public void setAccessibilityHazard(String accessibilityHazard) {
        this.accessibilityHazard = accessibilityHazard;
    }

    public Person getAccountablePerson() {
        return accountablePerson;
    }

    public void setAccountablePerson(Person accountablePerson) {
        this.accountablePerson = accountablePerson;
    }

    public AggregateRating getAggregateRating() {
        return aggregateRating;
    }

    public void setAggregateRating(AggregateRating aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public String getAlternativeHeadline() {
        return alternativeHeadline;
    }

    public void setAlternativeHeadline(String alternativeHeadline) {
        this.alternativeHeadline = alternativeHeadline;
    }

    public MediaObject getAssociatedMedia() {
        return associatedMedia;
    }

    public void setAssociatedMedia(MediaObject associatedMedia) {
        this.associatedMedia = associatedMedia;
    }

    public Audience getAudience() {
        return audience;
    }

    public void setAudience(Audience audience) {
        this.audience = audience;
    }

    public AudioObject getAudio() {
        return audio;
    }

    public void setAudio(AudioObject audio) {
        this.audio = audio;
    }

    public Thing getAuthor() {
        return author;
    }

    public void setAuthor(Thing author) {
        if (author instanceof Organization || author instanceof Person) {
            this.author = author;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "Organization", "Person" });
        }
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public Person getCharacter() {
        return character;
    }

    public void setCharacter(Person character) {
        this.character = character;
    }

    public Object getCitation() {
        return citation;
    }

    public void setCitation(Object citation) {
        if (citation instanceof CreativeWork) {
            this.citation = citation;
        } else {
            this.citation = citation.toString();
        }
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Place getContentLocation() {
        return contentLocation;
    }

    public void setContentLocation(Place contentLocation) {
        this.contentLocation = contentLocation;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public Thing getContributor() {
        return contributor;
    }

    public void setContributor(Thing contributor) {
        if (contributor instanceof Organization
                || contributor instanceof Person) {
            this.contributor = contributor;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "Organization", "Person" });
        }
    }

    public Thing getCopyrightHolder() {
        return copyrightHolder;
    }

    public void setCopyrightHolder(Thing copyrightHolder) {
        if (copyrightHolder instanceof Organization
                || copyrightHolder instanceof Person) {
            this.copyrightHolder = copyrightHolder;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "Organization", "Person" });
        }
    }

    public Number getCopyrightYear() {
        return copyrightYear;
    }

    public void setCopyrightYear(Number copyrightYear) {
        this.copyrightYear = copyrightYear;
    }

    public Thing getCreator() {
        return creator;
    }

    public void setCreator(Thing creator) {
        if (creator instanceof Organization || creator instanceof Person) {
            this.creator = creator;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "Organization", "Person" });
        }
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    public String getDiscussionUrl() {
        return discussionUrl;
    }

    public void setDiscussionUrl(String discussionUrl) {
        this.discussionUrl = discussionUrl;
    }

    public Person getEditor() {
        return editor;
    }

    public void setEditor(Person editor) {
        this.editor = editor;
    }

    public AlignmentObject getEducationalAlignment() {
        return educationalAlignment;
    }

    public void setEducationalAlignment(AlignmentObject educationalAlignment) {
        this.educationalAlignment = educationalAlignment;
    }

    public String getEducationalUse() {
        return educationalUse;
    }

    public void setEducationalUse(String educationalUse) {
        this.educationalUse = educationalUse;
    }

    public MediaObject getEncoding() {
        return encoding;
    }

    public void setEncoding(MediaObject encoding) {
        this.encoding = encoding;
    }

    public CreativeWork getExampleOfWork() {
        return exampleOfWork;
    }

    public void setExampleOfWork(CreativeWork exampleOfWork) {
        this.exampleOfWork = exampleOfWork;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public CreativeWork getHasPart() {
        return hasPart;
    }

    public void setHasPart(CreativeWork hasPart) {
        this.hasPart = hasPart;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public Object getInLanguage() {
        return inLanguage;
    }

    public void setInLanguage(Object inLanguage) {
        if (inLanguage instanceof Language) {
            this.inLanguage = inLanguage;
        } else {
            this.inLanguage = inLanguage.toString();
        }
    }

    public InteractionCounter getInteractionStatistic() {
        return interactionStatistic;
    }

    public void setInteractionStatistic(
            InteractionCounter interactionStatistic) {
        this.interactionStatistic = interactionStatistic;
    }

    public String getInteractivityType() {
        return interactivityType;
    }

    public void setInteractivityType(String interactivityType) {
        this.interactivityType = interactivityType;
    }

    public String getIsBasedOnUrl() {
        return isBasedOnUrl;
    }

    public void setIsBasedOnUrl(String isBasedOnUrl) {
        this.isBasedOnUrl = isBasedOnUrl;
    }

    public Boolean getIsFamilyFriendly() {
        return isFamilyFriendly;
    }

    public void setIsFamilyFriendly(Boolean isFamilyFriendly) {
        this.isFamilyFriendly = isFamilyFriendly;
    }

    public CreativeWork getIsPartOf() {
        return isPartOf;
    }

    public void setIsPartOf(CreativeWork isPartOf) {
        this.isPartOf = isPartOf;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getLearningResourceType() {
        return learningResourceType;
    }

    public void setLearningResourceType(String learningResourceType) {
        this.learningResourceType = learningResourceType;
    }

    public Object getLicense() {
        return license;
    }

    public void setLicense(Object license) {
        if (license instanceof CreativeWork) {
            this.license = license;
        } else {
            this.license = license.toString();
        }
    }

    public Place getLocationCreated() {
        return locationCreated;
    }

    public void setLocationCreated(Place locationCreated) {
        this.locationCreated = locationCreated;
    }

    public Thing getMainEntity() {
        return mainEntity;
    }

    public void setMainEntity(Thing mainEntity) {
        this.mainEntity = mainEntity;
    }

    public Thing getMentions() {
        return mentions;
    }

    public void setMentions(Thing mentions) {
        this.mentions = mentions;
    }

    public Offer getOffers() {
        return offers;
    }

    public void setOffers(Offer offers) {
        this.offers = offers;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Thing getProvider() {
        return provider;
    }

    public void setProvider(Thing provider) {
        if (provider instanceof Organization || provider instanceof Person) {
            this.provider = provider;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "Organization", "Person" });
        }
    }

    public PublicationEvent getPublication() {
        return publication;
    }

    public void setPublication(PublicationEvent publication) {
        this.publication = publication;
    }

    public Thing getPublisher() {
        return publisher;
    }

    public void setPublisher(Thing publisher) {
        if (publisher instanceof Organization || publisher instanceof Person) {
            this.publisher = publisher;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "Organization", "Person" });
        }
    }

    public String getPublishingPrinciples() {
        return publishingPrinciples;
    }

    public void setPublishingPrinciples(String publishingPrinciples) {
        this.publishingPrinciples = publishingPrinciples;
    }

    public Event getRecordedAt() {
        return recordedAt;
    }

    public void setRecordedAt(Event recordedAt) {
        this.recordedAt = recordedAt;
    }

    public PublicationEvent getReleasedEvent() {
        return releasedEvent;
    }

    public void setReleasedEvent(PublicationEvent releasedEvent) {
        this.releasedEvent = releasedEvent;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public String getSchemaVersion() {
        return schemaVersion;
    }

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    public Organization getSourceOrganization() {
        return sourceOrganization;
    }

    public void setSourceOrganization(Organization sourceOrganization) {
        this.sourceOrganization = sourceOrganization;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Duration getTimeRequired() {
        return timeRequired;
    }

    public void setTimeRequired(Duration timeRequired) {
        this.timeRequired = timeRequired;
    }

    public Thing getTranslator() {
        return translator;
    }

    public void setTranslator(Thing translator) {
        if (translator instanceof Organization
                || translator instanceof Person) {
            this.translator = translator;
        } else {
            throw new IllegalArgumentException(
                    new String[] { "Organization", "Person" });
        }
    }

    public String getTypicalAgeRange() {
        return typicalAgeRange;
    }

    public void setTypicalAgeRange(String typicalAgeRange) {
        this.typicalAgeRange = typicalAgeRange;
    }

    public Number getVersion() {
        return version;
    }

    public void setVersion(Number version) {
        this.version = version;
    }

    public VideoObject getVideo() {
        return video;
    }

    public void setVideo(VideoObject video) {
        this.video = video;
    }

    public CreativeWork getWorkExample() {
        return workExample;
    }

    public void setWorkExample(CreativeWork workExample) {
        this.workExample = workExample;
    }
}
