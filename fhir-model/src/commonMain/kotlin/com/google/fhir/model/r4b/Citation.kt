/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("RedundantVisibilityModifier", "PropertyName")

package com.google.fhir.model.r4b

import com.google.fhir.model.r4b.serializers.CitationCitedArtifactAbstractSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactClassificationSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactClassificationWhoClassifiedSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactContributorshipEntryAffiliationInfoSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactContributorshipEntryContributionInstanceSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactContributorshipEntrySerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactContributorshipSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactContributorshipSummarySerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactPartSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactPublicationFormPeriodicReleaseDateOfPublicationSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactPublicationFormPeriodicReleaseSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactPublicationFormPublishedInSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactPublicationFormSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactRelatesToSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactStatusDateSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactTitleSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactVersionSerializer
import com.google.fhir.model.r4b.serializers.CitationCitedArtifactWebLocationSerializer
import com.google.fhir.model.r4b.serializers.CitationClassificationSerializer
import com.google.fhir.model.r4b.serializers.CitationRelatesToSerializer
import com.google.fhir.model.r4b.serializers.CitationSerializer
import com.google.fhir.model.r4b.serializers.CitationStatusDateSerializer
import com.google.fhir.model.r4b.serializers.CitationSummarySerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The Citation Resource enables reference to any knowledge artifact for purposes of identification
 * and attribution. The Citation Resource supports existing reference structures and developing
 * publication practices such as versioning, expressing complex contributorship roles, and
 * referencing computable resources.
 */
@Serializable(with = CitationSerializer::class)
@SerialName("Citation")
public data class Citation(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * The only time that a resource does not have an id is when it is being submitted to the server
   * using a create operation.
   */
  override var id: kotlin.String? = null,
  /**
   * The metadata about the resource. This is content that is maintained by the infrastructure.
   * Changes to the content might not always be associated with version changes to the resource.
   */
  override var meta: Meta? = null,
  /**
   * A reference to a set of rules that were followed when the resource was constructed, and which
   * must be understood when processing the content. Often, this is a reference to an implementation
   * guide that defines the special rules along with other profiles etc.
   *
   * Asserting this rule set restricts the content to be only understood by a limited set of trading
   * partners. This inherently limits the usefulness of the data in the long term. However, the
   * existing health eco-system is highly fractured, and not yet ready to define, collect, and
   * exchange data in a generally computable sense. Wherever possible, implementers and/or
   * specification writers should avoid using this element. Often, when used, the URL is a reference
   * to an implementation guide that defines these special rules as part of it's narrative along
   * with other profiles, value sets, etc.
   */
  override var implicitRules: Uri? = null,
  /**
   * The base language in which the resource is written.
   *
   * Language is provided to support indexing and accessibility (typically, services such as text to
   * speech use the language tag). The html language tag in the narrative applies to the narrative.
   * The language tag on the resource may be used to specify the language of other presentations
   * generated from the data in the resource. Not all the content has to be in the base language.
   * The Resource.language should not be assumed to apply to the narrative automatically. If a
   * language is specified, it should it also be specified on the div element in the html (see rules
   * in HTML5 for information about the relationship between xml:lang and the html lang attribute).
   */
  override var language: Code? = null,
  /**
   * A human-readable narrative that contains a summary of the resource and can be used to represent
   * the content of the resource to a human. The narrative need not encode all the structured data,
   * but is required to contain sufficient detail to make it "clinically safe" for a human to just
   * read the narrative. Resource definitions may define what content should be represented in the
   * narrative to ensure clinical safety.
   *
   * Contained resources do not have narrative. Resources that are not contained SHOULD have a
   * narrative. In some cases, a resource may only have text with little or no additional discrete
   * data (as long as all minOccurs=1 elements are satisfied). This may be necessary for data from
   * legacy systems where information is captured as a "text blob" or where text is additionally
   * entered raw or narrated and encoded information is added later.
   */
  override var text: Narrative? = null,
  /**
   * These resources do not have an independent existence apart from the resource that contains
   * them - they cannot be identified independently, and nor can they have their own independent
   * transaction scope.
   *
   * This should never be done when the content can be identified properly, as once identification
   * is lost, it is extremely difficult (and context dependent) to restore it again. Contained
   * resources may have profiles and tags In their meta elements, but SHALL NOT have security
   * labels.
   */
  override var contained: MutableList<Resource> = mutableListOf(),
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * resource. To make the use of extensions safe and manageable, there is a strict set of
   * governance applied to the definition and use of extensions. Though any implementer can define
   * an extension, there is a set of requirements that SHALL be met as part of the definition of the
   * extension.
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override var extension: MutableList<Extension> = mutableListOf(),
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * resource and that modifies the understanding of the element that contains it and/or the
   * understanding of the containing element's descendants. Usually modifier elements provide
   * negation or qualification. To make the use of extensions safe and manageable, there is a strict
   * set of governance applied to the definition and use of extensions. Though any implementer is
   * allowed to define an extension, there is a set of requirements that SHALL be met as part of the
   * definition of the extension. Applications processing a resource are required to check for
   * modifier extensions.
   *
   * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource
   * (including cannot change the meaning of modifierExtension itself).
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override var modifierExtension: MutableList<Extension> = mutableListOf(),
  /**
   * An absolute URI that is used to identify this citation when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which at which an authoritative instance
   * of this summary is (or will be) published. This URL can be the target of a canonical reference.
   * It SHALL remain the same when the summary is stored on different servers.
   *
   * Can be a urn:uuid: or a urn:oid: but real http: addresses are preferred. Multiple instances may
   * share the same URL if they have a distinct version.
   */
  public var url: Uri? = null,
  /**
   * A formal identifier that is used to identify this citation when it is represented in other
   * formats, or referenced in a specification, model, design or an instance.
   *
   * May include DOI, PMID, PMCID, etc. This element will contain unique identifiers that support
   * de-duplication of citations. This identifier can be valid for only one citation resource.
   */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /**
   * The identifier that is used to identify this version of the citation when it is referenced in a
   * specification, model, design or instance. This is an arbitrary value managed by the citation
   * author and is not expected to be globally unique. For example, it might be a timestamp (e.g.
   * yyyymmdd) if a managed version is not available. There is also no expectation that versions can
   * be placed in a lexicographical sequence.
   *
   * There may be different citation instances that have the same identifier but different versions.
   * The version can be appended to the url in a reference to allow a reference to a particular
   * business version of the citation with the format [url]|[version].
   */
  public var version: String? = null,
  /**
   * A natural language name identifying the citation. This name should be usable as an identifier
   * for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the citation.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * The status of this summary. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of summarys s that are appropriate for use versus not.
   */
  public var status: Enumeration<PublicationStatus>,
  /**
   * A Boolean value to indicate that this citation is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of citations that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the citation was published. The date must change when the
   * business version changes and it must change if the status code changes. In addition, it should
   * change when the substantive content of the citation changes.
   *
   * Note that this is not the same as the resource last-modified-date, since the resource may be a
   * secondary representation of the citation. Additional specific dates may be added as extensions
   * or be found by consulting Provenances associated with past versions of the resource.
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual that published the citation.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the citation is
   * the organization or individual primarily responsible for the maintenance and upkeep of the
   * citation. This is not necessarily the same individual or organization that developed and
   * initially authored the content. The publisher is the primary point of contact for questions or
   * issues with the citation. This item SHOULD be populated unless the information is available
   * from context.
   */
  public var publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * May be a web site, an email address, a telephone number, etc.
   */
  public var contact: MutableList<ContactDetail> = mutableListOf(),
  /**
   * A free text natural language description of the citation from a consumer's perspective.
   *
   * This description can be used to capture details such as why the citation was built, comments
   * about misuse, instructions for clinical use and interpretation, literature references, examples
   * from the paper world, etc. It is not a rendering of the citation as conveyed in the 'text'
   * field of the resource itself. This item SHOULD be populated unless the information is available
   * from context (e.g. the language of the citation is presumed to be the predominant language in
   * the place the citation was created).
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate citation instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: MutableList<UsageContext> = mutableListOf(),
  /**
   * A legal or geographic region in which the citation is intended to be used.
   *
   * It may be possible for the citation to be used in jurisdictions other than those for which it
   * was originally designed or intended.
   */
  public var jurisdiction: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * Explanation of why this citation is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the citation. Instead, it provides traceability of
   * ''why'' the resource is either needed or ''why'' it is defined as it is. This may be used to
   * point to source materials or specifications that drove the structure of this citation.
   */
  public var purpose: Markdown? = null,
  /** Use and/or publishing restrictions for the Citation, not for the cited artifact. */
  public var copyright: Markdown? = null,
  /**
   * The date on which the resource content was approved by the publisher. Approval happens once
   * when the content is officially approved for usage.
   *
   * The 'date' element may be more recent than the approval date because of minor changes or
   * editorial corrections.
   */
  public var approvalDate: Date? = null,
  /**
   * The date on which the resource content was last reviewed. Review happens periodically after
   * approval but does not change the original approval date.
   *
   * If specified, this date follows the original approval date.
   */
  public var lastReviewDate: Date? = null,
  /**
   * The period during which the citation content was or is planned to be in active use.
   *
   * The effective period for a citation determines when the content is applicable for usage and is
   * independent of publication and review dates. For example, a measure intended to be used for the
   * year 2016 might be published in 2015.
   */
  public var effectivePeriod: Period? = null,
  /** Who authored the Citation. */
  public var author: MutableList<ContactDetail> = mutableListOf(),
  /** Who edited the Citation. */
  public var editor: MutableList<ContactDetail> = mutableListOf(),
  /** Who reviewed the Citation. */
  public var reviewer: MutableList<ContactDetail> = mutableListOf(),
  /** Who endorsed the Citation. */
  public var endorser: MutableList<ContactDetail> = mutableListOf(),
  /** A human-readable display of the citation. */
  public var summary: MutableList<Summary> = mutableListOf(),
  /** The assignment to an organizing scheme. */
  public var classification: MutableList<Classification> = mutableListOf(),
  /** Used for general notes and annotations not coded elsewhere. */
  public var note: MutableList<Annotation> = mutableListOf(),
  /** The status of the citation. */
  public var currentState: MutableList<CodeableConcept> = mutableListOf(),
  /** An effective date or period for a status of the citation. */
  public var statusDate: MutableList<StatusDate> = mutableListOf(),
  /** Artifact related to the Citation Resource. */
  public var relatesTo: MutableList<RelatesTo> = mutableListOf(),
  /** The article or artifact being described. */
  public var citedArtifact: CitedArtifact? = null,
) : DomainResource() {
  /** A human-readable display of the citation. */
  @Serializable(with = CitationSummarySerializer::class)
  public class Summary(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and manageable, there is a strict set of
     * governance applied to the definition and use of extensions. Though any implementer can define
     * an extension, there is a set of requirements that SHALL be met as part of the definition of
     * the extension.
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var extension: MutableList<Extension> = mutableListOf(),
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element and that modifies the understanding of the element in which it is contained
     * and/or the understanding of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe and manageable, there
     * is a strict set of governance applied to the definition and use of extensions. Though any
     * implementer can define an extension, there is a set of requirements that SHALL be met as part
     * of the definition of the extension. Applications processing a resource are required to check
     * for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     * DomainResource (including cannot change the meaning of modifierExtension itself).
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /** Format for display of the citation. */
    public var style: CodeableConcept? = null,
    /** The human-readable display of the citation. */
    public var text: Markdown,
  ) : BackboneElement()

  /** The assignment to an organizing scheme. */
  @Serializable(with = CitationClassificationSerializer::class)
  public class Classification(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and manageable, there is a strict set of
     * governance applied to the definition and use of extensions. Though any implementer can define
     * an extension, there is a set of requirements that SHALL be met as part of the definition of
     * the extension.
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var extension: MutableList<Extension> = mutableListOf(),
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element and that modifies the understanding of the element in which it is contained
     * and/or the understanding of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe and manageable, there
     * is a strict set of governance applied to the definition and use of extensions. Though any
     * implementer can define an extension, there is a set of requirements that SHALL be met as part
     * of the definition of the extension. Applications processing a resource are required to check
     * for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     * DomainResource (including cannot change the meaning of modifierExtension itself).
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /** The kind of classifier (e.g. publication type, keyword). */
    public var type: CodeableConcept? = null,
    /** The specific classification value. */
    public var classifier: MutableList<CodeableConcept> = mutableListOf(),
  ) : BackboneElement()

  /** An effective date or period for a status of the citation. */
  @Serializable(with = CitationStatusDateSerializer::class)
  public class StatusDate(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and manageable, there is a strict set of
     * governance applied to the definition and use of extensions. Though any implementer can define
     * an extension, there is a set of requirements that SHALL be met as part of the definition of
     * the extension.
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var extension: MutableList<Extension> = mutableListOf(),
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element and that modifies the understanding of the element in which it is contained
     * and/or the understanding of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe and manageable, there
     * is a strict set of governance applied to the definition and use of extensions. Though any
     * implementer can define an extension, there is a set of requirements that SHALL be met as part
     * of the definition of the extension. Applications processing a resource are required to check
     * for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     * DomainResource (including cannot change the meaning of modifierExtension itself).
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /** Classification of the status. */
    public var activity: CodeableConcept,
    /** Either occurred or expected. */
    public var `actual`: Boolean? = null,
    /**
     * When the status started and/or ended.
     *
     * For an instance, place the same value in both start and end elements.
     */
    public var period: Period,
  ) : BackboneElement()

  /** Artifact related to the Citation Resource. */
  @Serializable(with = CitationRelatesToSerializer::class)
  public class RelatesTo(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and manageable, there is a strict set of
     * governance applied to the definition and use of extensions. Though any implementer can define
     * an extension, there is a set of requirements that SHALL be met as part of the definition of
     * the extension.
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var extension: MutableList<Extension> = mutableListOf(),
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element and that modifies the understanding of the element in which it is contained
     * and/or the understanding of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe and manageable, there
     * is a strict set of governance applied to the definition and use of extensions. Though any
     * implementer can define an extension, there is a set of requirements that SHALL be met as part
     * of the definition of the extension. Applications processing a resource are required to check
     * for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     * DomainResource (including cannot change the meaning of modifierExtension itself).
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /** How the Citation resource relates to the target artifact. */
    public var relationshipType: CodeableConcept,
    /** The clasification of the related artifact. */
    public var targetClassifier: MutableList<CodeableConcept> = mutableListOf(),
    /** The article or artifact that the Citation Resource is related to. */
    public var target: Target,
  ) : BackboneElement() {
    public sealed interface Target {
      public fun asUri(): Uri? = this as? Uri

      public fun asIdentifier(): Identifier? = this as? Identifier

      public fun asReference(): Reference? = this as? Reference

      public fun asAttachment(): Attachment? = this as? Attachment

      public data class Uri(public val `value`: com.google.fhir.model.r4b.Uri) : Target

      public data class Identifier(public val `value`: com.google.fhir.model.r4b.Identifier) :
        Target

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) : Target

      public data class Attachment(public val `value`: com.google.fhir.model.r4b.Attachment) :
        Target

      public companion object {
        internal fun from(
          uriValue: com.google.fhir.model.r4b.Uri?,
          identifierValue: com.google.fhir.model.r4b.Identifier?,
          referenceValue: com.google.fhir.model.r4b.Reference?,
          attachmentValue: com.google.fhir.model.r4b.Attachment?,
        ): Target? {
          if (uriValue != null) return Uri(uriValue)
          if (identifierValue != null) return Identifier(identifierValue)
          if (referenceValue != null) return Reference(referenceValue)
          if (attachmentValue != null) return Attachment(attachmentValue)
          return null
        }
      }
    }
  }

  /** The article or artifact being described. */
  @Serializable(with = CitationCitedArtifactSerializer::class)
  public class CitedArtifact(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and manageable, there is a strict set of
     * governance applied to the definition and use of extensions. Though any implementer can define
     * an extension, there is a set of requirements that SHALL be met as part of the definition of
     * the extension.
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var extension: MutableList<Extension> = mutableListOf(),
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element and that modifies the understanding of the element in which it is contained
     * and/or the understanding of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe and manageable, there
     * is a strict set of governance applied to the definition and use of extensions. Though any
     * implementer can define an extension, there is a set of requirements that SHALL be met as part
     * of the definition of the extension. Applications processing a resource are required to check
     * for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     * DomainResource (including cannot change the meaning of modifierExtension itself).
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var modifierExtension: MutableList<Extension> = mutableListOf(),
    /**
     * A formal identifier that is used to identify this citation when it is represented in other
     * formats, or referenced in a specification, model, design or an instance.
     *
     * May include DOI, PMID, PMCID, etc. This element will contain unique identifiers that support
     * de-duplication of citations. This identifier can be valid for only one citation resource.
     */
    public var identifier: MutableList<Identifier> = mutableListOf(),
    /**
     * A formal identifier that is used to identify things closely related to this citation.
     *
     * May include trial registry identifiers, e.g. NCT04372602 from clinicaltrials.gov. This
     * identifier can be valid for multiple citation resources.
     */
    public var relatedIdentifier: MutableList<Identifier> = mutableListOf(),
    /** When the cited artifact was accessed. */
    public var dateAccessed: DateTime? = null,
    /** The defined version of the cited artifact. */
    public var version: Version? = null,
    /** The status of the cited artifact. */
    public var currentState: MutableList<CodeableConcept> = mutableListOf(),
    /** An effective date or period for a status of the cited artifact. */
    public var statusDate: MutableList<StatusDate> = mutableListOf(),
    /** The title details of the article or artifact. */
    public var title: MutableList<Title> = mutableListOf(),
    /** Summary of the article or artifact. */
    public var `abstract`: MutableList<Abstract> = mutableListOf(),
    /** The component of the article or artifact. */
    public var part: Part? = null,
    /** The artifact related to the cited artifact. */
    public var relatesTo: MutableList<RelatesTo> = mutableListOf(),
    /**
     * If multiple, used to represent alternative forms of the article that are not separate
     * citations.
     *
     * A common use is a journal article with a publication date and pagination for a print version
     * and a different publication date for the online version of the same article.
     */
    public var publicationForm: MutableList<PublicationForm> = mutableListOf(),
    /** Used for any URL for the article or artifact cited. */
    public var webLocation: MutableList<WebLocation> = mutableListOf(),
    /** The assignment to an organizing scheme. */
    public var classification: MutableList<Classification> = mutableListOf(),
    /**
     * This element is used to list authors and other contributors, their contact information,
     * specific contributions, and summary statements.
     */
    public var contributorship: Contributorship? = null,
    /** Any additional information or content for the article or artifact. */
    public var note: MutableList<Annotation> = mutableListOf(),
  ) : BackboneElement() {
    /** The defined version of the cited artifact. */
    @Serializable(with = CitationCitedArtifactVersionSerializer::class)
    public class Version(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: MutableList<Extension> = mutableListOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /** The version number or other version identifier. */
      public var `value`: String,
      /** Citation for the main version of the cited artifact. */
      public var baseCitation: Reference? = null,
    ) : BackboneElement()

    /** An effective date or period for a status of the cited artifact. */
    @Serializable(with = CitationCitedArtifactStatusDateSerializer::class)
    public class StatusDate(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: MutableList<Extension> = mutableListOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /** Classification of the status. */
      public var activity: CodeableConcept,
      /** Either occurred or expected. */
      public var `actual`: Boolean? = null,
      /**
       * When the status started and/or ended.
       *
       * For an instance, place the same value in both start and end elements.
       */
      public var period: Period,
    ) : BackboneElement()

    /** The title details of the article or artifact. */
    @Serializable(with = CitationCitedArtifactTitleSerializer::class)
    public class Title(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: MutableList<Extension> = mutableListOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /** Used to express the reason or specific aspect for the title. */
      public var type: MutableList<CodeableConcept> = mutableListOf(),
      /** Used to express the specific language. */
      public var language: CodeableConcept? = null,
      /** The title of the article or artifact. */
      public var text: Markdown,
    ) : BackboneElement()

    /** Summary of the article or artifact. */
    @Serializable(with = CitationCitedArtifactAbstractSerializer::class)
    public class Abstract(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: MutableList<Extension> = mutableListOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /** Used to express the reason or specific aspect for the abstract. */
      public var type: CodeableConcept? = null,
      /** Used to express the specific language. */
      public var language: CodeableConcept? = null,
      /** Abstract content. */
      public var text: Markdown,
      /** Copyright notice for the abstract. */
      public var copyright: Markdown? = null,
    ) : BackboneElement()

    /** The component of the article or artifact. */
    @Serializable(with = CitationCitedArtifactPartSerializer::class)
    public class Part(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: MutableList<Extension> = mutableListOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /** The kind of component. */
      public var type: CodeableConcept? = null,
      /** The specification of the component. */
      public var `value`: String? = null,
      /** The citation for the full article or artifact. */
      public var baseCitation: Reference? = null,
    ) : BackboneElement()

    /** The artifact related to the cited artifact. */
    @Serializable(with = CitationCitedArtifactRelatesToSerializer::class)
    public class RelatesTo(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: MutableList<Extension> = mutableListOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /** How the cited artifact relates to the target artifact. */
      public var relationshipType: CodeableConcept,
      /** The clasification of the related artifact. */
      public var targetClassifier: MutableList<CodeableConcept> = mutableListOf(),
      /** The article or artifact that the cited artifact is related to. */
      public var target: Target,
    ) : BackboneElement() {
      public sealed interface Target {
        public fun asUri(): Uri? = this as? Uri

        public fun asIdentifier(): Identifier? = this as? Identifier

        public fun asReference(): Reference? = this as? Reference

        public fun asAttachment(): Attachment? = this as? Attachment

        public data class Uri(public val `value`: com.google.fhir.model.r4b.Uri) : Target

        public data class Identifier(public val `value`: com.google.fhir.model.r4b.Identifier) :
          Target

        public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
          Target

        public data class Attachment(public val `value`: com.google.fhir.model.r4b.Attachment) :
          Target

        public companion object {
          internal fun from(
            uriValue: com.google.fhir.model.r4b.Uri?,
            identifierValue: com.google.fhir.model.r4b.Identifier?,
            referenceValue: com.google.fhir.model.r4b.Reference?,
            attachmentValue: com.google.fhir.model.r4b.Attachment?,
          ): Target? {
            if (uriValue != null) return Uri(uriValue)
            if (identifierValue != null) return Identifier(identifierValue)
            if (referenceValue != null) return Reference(referenceValue)
            if (attachmentValue != null) return Attachment(attachmentValue)
            return null
          }
        }
      }
    }

    /**
     * If multiple, used to represent alternative forms of the article that are not separate
     * citations.
     */
    @Serializable(with = CitationCitedArtifactPublicationFormSerializer::class)
    public class PublicationForm(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: MutableList<Extension> = mutableListOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /** The collection the cited article or artifact is published in. */
      public var publishedIn: PublishedIn? = null,
      /** The specific issue in which the cited article resides. */
      public var periodicRelease: PeriodicRelease? = null,
      /**
       * The date the article was added to the database, or the date the article was released (which
       * may differ from the journal issue publication date).
       */
      public var articleDate: DateTime? = null,
      /** The date the article was last revised or updated in the database. */
      public var lastRevisionDate: DateTime? = null,
      /**
       * Language in which this form of the article is published.
       *
       * Language is provided to support indexing and accessibility (typically, services such as
       * text to speech use the language tag). The html language tag in the narrative applies to the
       * narrative. The language tag on the resource may be used to specify the language of other
       * presentations generated from the data in the resource. Not all the content has to be in the
       * base language. The Resource.language should not be assumed to apply to the narrative
       * automatically. If a language is specified, it should it also be specified on the div
       * element in the html (see rules in HTML5 for information about the relationship between
       * xml:lang and the html lang attribute).
       */
      public var language: MutableList<CodeableConcept> = mutableListOf(),
      /** Entry number or identifier for inclusion in a database. */
      public var accessionNumber: String? = null,
      /** Used for full display of pagination. */
      public var pageString: String? = null,
      /** Used for isolated representation of first page. */
      public var firstPage: String? = null,
      /** Used for isolated representation of last page. */
      public var lastPage: String? = null,
      /** Actual or approximate number of pages or screens. */
      public var pageCount: String? = null,
      /** Copyright notice for the full article or artifact. */
      public var copyright: Markdown? = null,
    ) : BackboneElement() {
      /** The collection the cited article or artifact is published in. */
      @Serializable(with = CitationCitedArtifactPublicationFormPublishedInSerializer::class)
      public class PublishedIn(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met as part of the
         * definition of the extension.
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var extension: MutableList<Extension> = mutableListOf(),
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
         * DomainResource (including cannot change the meaning of modifierExtension itself).
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var modifierExtension: MutableList<Extension> = mutableListOf(),
        /**
         * Kind of container (e.g. Periodical, database, or book).
         *
         * Journals and newspapers are coded as Periodical.
         */
        public var type: CodeableConcept? = null,
        /**
         * Journal identifiers include ISSN, ISO Abbreviation and NLMuniqueID; Book identifiers
         * include ISBN.
         */
        public var identifier: MutableList<Identifier> = mutableListOf(),
        /**
         * Name of the database or title of the book or journal.
         *
         * ClinicalTrials.gov is a name of a database.
         */
        public var title: String? = null,
        /** Name of the publisher. */
        public var publisher: Reference? = null,
        /** Geographic location of the publisher. */
        public var publisherLocation: String? = null,
      ) : BackboneElement()

      /** The specific issue in which the cited article resides. */
      @Serializable(with = CitationCitedArtifactPublicationFormPeriodicReleaseSerializer::class)
      public class PeriodicRelease(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met as part of the
         * definition of the extension.
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var extension: MutableList<Extension> = mutableListOf(),
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
         * DomainResource (including cannot change the meaning of modifierExtension itself).
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var modifierExtension: MutableList<Extension> = mutableListOf(),
        /**
         * Describes the form of the medium cited. Common codes are "Internet" or "Print".
         *
         * National Library of Medicine uses the codes "Internet" or "Print".
         */
        public var citedMedium: CodeableConcept? = null,
        /** Volume number of journal in which the article is published. */
        public var volume: String? = null,
        /** Issue, part or supplement of journal in which the article is published. */
        public var issue: String? = null,
        /** Defining the date on which the issue of the journal was published. */
        public var dateOfPublication: DateOfPublication? = null,
      ) : BackboneElement() {
        /** Defining the date on which the issue of the journal was published. */
        @Serializable(
          with =
            CitationCitedArtifactPublicationFormPeriodicReleaseDateOfPublicationSerializer::class
        )
        public class DateOfPublication(
          /**
           * Unique id for the element within a resource (for internal references). This may be any
           * string value that does not contain spaces.
           */
          override var id: kotlin.String? = null,
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element. To make the use of extensions safe and manageable, there is
           * a strict set of governance applied to the definition and use of extensions. Though any
           * implementer can define an extension, there is a set of requirements that SHALL be met
           * as part of the definition of the extension.
           *
           * There can be no stigma associated with the use of extensions by any application,
           * project, or standard - regardless of the institution or jurisdiction that uses or
           * defines the extensions. The use of extensions is what allows the FHIR specification to
           * retain a core level of simplicity for everyone.
           */
          override var extension: MutableList<Extension> = mutableListOf(),
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element and that modifies the understanding of the element in which
           * it is contained and/or the understanding of the containing element's descendants.
           * Usually modifier elements provide negation or qualification. To make the use of
           * extensions safe and manageable, there is a strict set of governance applied to the
           * definition and use of extensions. Though any implementer can define an extension, there
           * is a set of requirements that SHALL be met as part of the definition of the extension.
           * Applications processing a resource are required to check for modifier extensions.
           *
           * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
           * DomainResource (including cannot change the meaning of modifierExtension itself).
           *
           * There can be no stigma associated with the use of extensions by any application,
           * project, or standard - regardless of the institution or jurisdiction that uses or
           * defines the extensions. The use of extensions is what allows the FHIR specification to
           * retain a core level of simplicity for everyone.
           */
          override var modifierExtension: MutableList<Extension> = mutableListOf(),
          /** Date on which the issue of the journal was published. */
          public var date: Date? = null,
          /** Year on which the issue of the journal was published. */
          public var year: String? = null,
          /** Month on which the issue of the journal was published. */
          public var month: String? = null,
          /** Day on which the issue of the journal was published. */
          public var day: String? = null,
          /** Spring, Summer, Fall/Autumn, Winter. */
          public var season: String? = null,
          /** Text representation of the date of which the issue of the journal was published. */
          public var text: String? = null,
        ) : BackboneElement()
      }
    }

    /** Used for any URL for the article or artifact cited. */
    @Serializable(with = CitationCitedArtifactWebLocationSerializer::class)
    public class WebLocation(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: MutableList<Extension> = mutableListOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /** Code the reason for different URLs, e.g. abstract and full-text. */
      public var type: CodeableConcept? = null,
      /**
       * The specific URL.
       *
       * Persistent URLs, like doi, are preferred.
       */
      public var url: Uri? = null,
    ) : BackboneElement()

    /** The assignment to an organizing scheme. */
    @Serializable(with = CitationCitedArtifactClassificationSerializer::class)
    public class Classification(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: MutableList<Extension> = mutableListOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /** The kind of classifier (e.g. publication type, keyword). */
      public var type: CodeableConcept? = null,
      /** The specific classification value. */
      public var classifier: MutableList<CodeableConcept> = mutableListOf(),
      /** Provenance and copyright of classification. */
      public var whoClassified: WhoClassified? = null,
    ) : BackboneElement() {
      /** Provenance and copyright of classification. */
      @Serializable(with = CitationCitedArtifactClassificationWhoClassifiedSerializer::class)
      public class WhoClassified(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met as part of the
         * definition of the extension.
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var extension: MutableList<Extension> = mutableListOf(),
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
         * DomainResource (including cannot change the meaning of modifierExtension itself).
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var modifierExtension: MutableList<Extension> = mutableListOf(),
        /** Person who created the classification. */
        public var person: Reference? = null,
        /** Organization who created the classification. */
        public var organization: Reference? = null,
        /**
         * The publisher of the classification, not the publisher of the article or artifact being
         * cited.
         */
        public var publisher: Reference? = null,
        /** Rights management statement for the classification. */
        public var classifierCopyright: String? = null,
        /** Acceptable to re-use the classification. */
        public var freeToShare: Boolean? = null,
      ) : BackboneElement()
    }

    /**
     * This element is used to list authors and other contributors, their contact information,
     * specific contributions, and summary statements.
     */
    @Serializable(with = CitationCitedArtifactContributorshipSerializer::class)
    public class Contributorship(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: MutableList<Extension> = mutableListOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /**
       * Indicates if the list includes all authors and/or contributors.
       *
       * If list is incomplete "et al" can be appended to Contributorship.summary.value for display
       * purposes.
       */
      public var complete: Boolean? = null,
      /**
       * An individual entity named in the author list or contributor list.
       *
       * Used to report contributorship in individualized ways.
       */
      public var entry: MutableList<Entry> = mutableListOf(),
      /**
       * Used to record a display of the author/contributor list without separate coding for each
       * list member.
       */
      public var summary: MutableList<Summary> = mutableListOf(),
    ) : BackboneElement() {
      /** An individual entity named in the author list or contributor list. */
      @Serializable(with = CitationCitedArtifactContributorshipEntrySerializer::class)
      public class Entry(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met as part of the
         * definition of the extension.
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var extension: MutableList<Extension> = mutableListOf(),
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
         * DomainResource (including cannot change the meaning of modifierExtension itself).
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var modifierExtension: MutableList<Extension> = mutableListOf(),
        /**
         * A name associated with the individual.
         *
         * humanName.family can match MEDLINE-based lastName (used for surname or single name),
         * humanName.given can match MEDLINE-based forename (used for remainder of name except for
         * suffix), humanName.suffix can match MEDLINE-based suffix (eg 2nd, 3rd, Jr, Sr).
         */
        public var name: HumanName? = null,
        /**
         * Initials for forename.
         *
         * This element is used in Medline based citations, but not supported fully by FHIR
         * HumanName datatype.
         */
        public var initials: String? = null,
        /**
         * Used for collective or corporate name as an author.
         *
         * This element is used in Medline based citations, but not supported fully by FHIR
         * HumanName datatype.
         */
        public var collectiveName: String? = null,
        /**
         * Unique person identifier.
         *
         * Avoids needing to disambiguate common last names or changes of name. ORCID is commonly
         * used as author identifier.
         */
        public var identifier: MutableList<Identifier> = mutableListOf(),
        /** Organization affiliated with the entity. */
        public var affiliationInfo: MutableList<AffiliationInfo> = mutableListOf(),
        /** Physical mailing address for the author or contributor. */
        public var address: MutableList<Address> = mutableListOf(),
        /** Email or telephone contact methods for the author or contributor. */
        public var telecom: MutableList<ContactPoint> = mutableListOf(),
        /**
         * This element identifies the specific nature of an individual’s contribution with respect
         * to the cited work.
         *
         * The CreDiT taxonomy provides a way to encode contribution information inside article XML
         * files. The purpose of CRediT is to provide transparency in contributions to scholarly
         * published work, to enable improved systems of attribution, credit, and accountability.
         */
        public var contributionType: MutableList<CodeableConcept> = mutableListOf(),
        /** The role of the contributor (e.g. author, editor, reviewer). */
        public var role: CodeableConcept? = null,
        /** Contributions with accounting for time or number. */
        public var contributionInstance: MutableList<ContributionInstance> = mutableListOf(),
        /** Indication of which contributor is the corresponding contributor for the role. */
        public var correspondingContact: Boolean? = null,
        /** Used to code order of authors. */
        public var listOrder: PositiveInt? = null,
      ) : BackboneElement() {
        /** Organization affiliated with the entity. */
        @Serializable(
          with = CitationCitedArtifactContributorshipEntryAffiliationInfoSerializer::class
        )
        public class AffiliationInfo(
          /**
           * Unique id for the element within a resource (for internal references). This may be any
           * string value that does not contain spaces.
           */
          override var id: kotlin.String? = null,
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element. To make the use of extensions safe and manageable, there is
           * a strict set of governance applied to the definition and use of extensions. Though any
           * implementer can define an extension, there is a set of requirements that SHALL be met
           * as part of the definition of the extension.
           *
           * There can be no stigma associated with the use of extensions by any application,
           * project, or standard - regardless of the institution or jurisdiction that uses or
           * defines the extensions. The use of extensions is what allows the FHIR specification to
           * retain a core level of simplicity for everyone.
           */
          override var extension: MutableList<Extension> = mutableListOf(),
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element and that modifies the understanding of the element in which
           * it is contained and/or the understanding of the containing element's descendants.
           * Usually modifier elements provide negation or qualification. To make the use of
           * extensions safe and manageable, there is a strict set of governance applied to the
           * definition and use of extensions. Though any implementer can define an extension, there
           * is a set of requirements that SHALL be met as part of the definition of the extension.
           * Applications processing a resource are required to check for modifier extensions.
           *
           * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
           * DomainResource (including cannot change the meaning of modifierExtension itself).
           *
           * There can be no stigma associated with the use of extensions by any application,
           * project, or standard - regardless of the institution or jurisdiction that uses or
           * defines the extensions. The use of extensions is what allows the FHIR specification to
           * retain a core level of simplicity for everyone.
           */
          override var modifierExtension: MutableList<Extension> = mutableListOf(),
          /** Display for the organization. */
          public var affiliation: String? = null,
          /** Role within the organization, such as professional title. */
          public var role: String? = null,
          /** Identifier for the organization. */
          public var identifier: MutableList<Identifier> = mutableListOf(),
        ) : BackboneElement()

        /** Contributions with accounting for time or number. */
        @Serializable(
          with = CitationCitedArtifactContributorshipEntryContributionInstanceSerializer::class
        )
        public class ContributionInstance(
          /**
           * Unique id for the element within a resource (for internal references). This may be any
           * string value that does not contain spaces.
           */
          override var id: kotlin.String? = null,
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element. To make the use of extensions safe and manageable, there is
           * a strict set of governance applied to the definition and use of extensions. Though any
           * implementer can define an extension, there is a set of requirements that SHALL be met
           * as part of the definition of the extension.
           *
           * There can be no stigma associated with the use of extensions by any application,
           * project, or standard - regardless of the institution or jurisdiction that uses or
           * defines the extensions. The use of extensions is what allows the FHIR specification to
           * retain a core level of simplicity for everyone.
           */
          override var extension: MutableList<Extension> = mutableListOf(),
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element and that modifies the understanding of the element in which
           * it is contained and/or the understanding of the containing element's descendants.
           * Usually modifier elements provide negation or qualification. To make the use of
           * extensions safe and manageable, there is a strict set of governance applied to the
           * definition and use of extensions. Though any implementer can define an extension, there
           * is a set of requirements that SHALL be met as part of the definition of the extension.
           * Applications processing a resource are required to check for modifier extensions.
           *
           * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
           * DomainResource (including cannot change the meaning of modifierExtension itself).
           *
           * There can be no stigma associated with the use of extensions by any application,
           * project, or standard - regardless of the institution or jurisdiction that uses or
           * defines the extensions. The use of extensions is what allows the FHIR specification to
           * retain a core level of simplicity for everyone.
           */
          override var modifierExtension: MutableList<Extension> = mutableListOf(),
          /** The specific contribution. */
          public var type: CodeableConcept,
          /** The time that the contribution was made. */
          public var time: DateTime? = null,
        ) : BackboneElement()
      }

      /**
       * Used to record a display of the author/contributor list without separate coding for each
       * list member.
       */
      @Serializable(with = CitationCitedArtifactContributorshipSummarySerializer::class)
      public class Summary(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met as part of the
         * definition of the extension.
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var extension: MutableList<Extension> = mutableListOf(),
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
         * DomainResource (including cannot change the meaning of modifierExtension itself).
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var modifierExtension: MutableList<Extension> = mutableListOf(),
        /** Used most commonly to express an author list or a contributorship statement. */
        public var type: CodeableConcept? = null,
        /** The format for the display string. */
        public var style: CodeableConcept? = null,
        /** Used to code the producer or rule for creating the display string. */
        public var source: CodeableConcept? = null,
        /**
         * The display string for the author list, contributor list, or contributorship statement.
         */
        public var `value`: Markdown,
      ) : BackboneElement()
    }
  }
}
