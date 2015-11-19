/**
 * 
 */
package org.schema;

import java.util.Date;

/**
 * 
 * TODO
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
     * FIXME The author of this content.Please note that author is special in
     * that HTML 5 provides a special mechanism for indicating authorship via
     * the rel tag. That is equivalent to this and may be used interchangeably.
     */
    private Person author;
    private Organization author2;

    /**
     * An award won by or for this item. Supersedes awards.
     */
    private String award;

    /**
     * Fictional person connected with a creative work.
     */
    private Person character;

    /**
     * FIXME A citation or reference to another creative work, such as another
     * publication, web page, scholarly article, etc.
     */
    private String citation;
    private CreativeWork citation2;

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
     * FIXME A secondary contributor to the CreativeWork.
     */
    private Person contributor;
    private Organization contributor2;

    /**
     * FIXME The party holding the legal copyright to the CreativeWork.
     */
    private Person copyrightHolder;
    private Organization copyrightHolder2;

    /**
     * The year during which the claimed copyright for the CreativeWork was
     * first asserted.
     */
    private Number copyrightYear;

    /**
     * FIXME The creator/ author of this CreativeWork.This is the same as the
     * Author property for CreativeWork.
     */
    private Person creator;
    private Organization creator2;

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
     *  Genre of the creative work or group.
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
     * FIXME The language of the content or performance or used in an
     * action.Please use one of the language codes from the IETF BCP 47
     * standard.Supersedes language.
     */
    private String inLanguage;
    private Language inLanguage2;

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
     * FIXME A license document that applies to this content, typically
     * indicated by URL.
     */
    private String license;
    private CreativeWork license2;

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
     * FIXME The position of an item in a series or sequence of items. private
     * producer Person or private Organization The person or organization who
     * produced the
     * 
     * work (e.g. music album, movie, tv/radio series etc.).
     */
    private Integer position;
    private String position2;

    /**
     * FIXME The service provider, service operator, or service performer; the
     * goods
     * 
     * producer. Another party (a seller) may offer those services or goods on
     * behalf of the provider. A provider may also serve as the seller.
     * Supersedes carrier.
     * 
     */
    private Person provider;
    private Organization provider2;

    /**
     * A publication event associated with the item.
     */
    private PublicationEvent publication;

    /**
     * FIXME The publisher of the creative work.
     */
    private Person publisher;
    private Organization publisher2;

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
     * Indicates (by URL or string) a particular version of a schema used
     * in some CreativeWork. For example, a document could declare a
     * schemaVersion using a URL such as http://schema.org/version/2.0/ if
     * precise indication of schema version was required by some application.
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
     * FIXME Organization or person who adapts a creative work to different
     * languages, regional differences and technical requirements of a target
     * market.
     */
    private Person translator;
    private Organization translator2;

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
}
