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

package com.google.fhir.model.r5

import com.google.fhir.model.r5.serializers.EvidenceReportRelatesToSerializer
import com.google.fhir.model.r5.serializers.EvidenceReportRelatesToTargetSerializer
import com.google.fhir.model.r5.serializers.EvidenceReportSectionSerializer
import com.google.fhir.model.r5.serializers.EvidenceReportSerializer
import com.google.fhir.model.r5.serializers.EvidenceReportSubjectCharacteristicSerializer
import com.google.fhir.model.r5.serializers.EvidenceReportSubjectSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The EvidenceReport Resource is a specialized container for a collection of resources and codeable
 * concepts, adapted to support compositions of Evidence, EvidenceVariable, and Citation resources
 * and related concepts.
 */
@Serializable(with = EvidenceReportSerializer::class)
@SerialName("EvidenceReport")
public data class EvidenceReport(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * Within the context of the FHIR RESTful interactions, the resource has an id except for cases
   * like the create and conditional update. Otherwise, the use of the resouce id depends on the
   * given use case.
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
   * to an implementation guide that defines these special rules as part of its narrative along with
   * other profiles, value sets, etc.
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
   * Contained resources do not have a narrative. Resources that are not contained SHOULD have a
   * narrative. In some cases, a resource may only have text with little or no additional discrete
   * data (as long as all minOccurs=1 elements are satisfied). This may be necessary for data from
   * legacy systems where information is captured as a "text blob" or where text is additionally
   * entered raw or narrated and encoded information is added later.
   */
  override var text: Narrative? = null,
  /**
   * These resources do not have an independent existence apart from the resource that contains
   * them - they cannot be identified independently, nor can they have their own independent
   * transaction scope. This is allowed to be a Parameters resource if and only if it is referenced
   * by a resource that provides context/meaning.
   *
   * This should never be done when the content can be identified properly, as once identification
   * is lost, it is extremely difficult (and context dependent) to restore it again. Contained
   * resources may have profiles and tags in their meta elements, but SHALL NOT have security
   * labels.
   */
  override var contained: MutableList<Resource> = mutableListOf(),
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * resource. To make the use of extensions safe and managable, there is a strict set of governance
   * applied to the definition and use of extensions. Though any implementer can define an
   * extension, there is a set of requirements that SHALL be met as part of the definition of the
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
   * negation or qualification. To make the use of extensions safe and managable, there is a strict
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
   * An absolute URI that is used to identify this EvidenceReport when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which an authoritative instance of this
   * summary is (or will be) published. This URL can be the target of a canonical reference. It
   * SHALL remain the same when the summary is stored on different servers.
   *
   * Can be a urn:uuid: or a urn:oid: but real http: addresses are preferred. Multiple instances may
   * share the same URL if they have a distinct version.
   */
  public var url: Uri? = null,
  /**
   * The status of this summary. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of summaries that are appropriate for use versus not.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var status: Enumeration<PublicationStatus>,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate evidence report instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: MutableList<UsageContext> = mutableListOf(),
  /**
   * A formal identifier that is used to identify this EvidenceReport when it is represented in
   * other formats, or referenced in a specification, model, design or an instance.
   *
   * This element will contain unique identifiers that support de-duplication of EvidenceReports.
   * This identifier can be valid for only one EvidenceReport resource.
   */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /**
   * A formal identifier that is used to identify things closely related to this EvidenceReport.
   *
   * May include trial registry identifiers, e.g. NCT04372602 from clinicaltrials.gov. This
   * identifier can be valid for multiple EvidenceReport resources.
   */
  public var relatedIdentifier: MutableList<Identifier> = mutableListOf(),
  /**
   * Citation Resource or display of suggested citation for this report.
   *
   * used for reports for which external citation is expected, such as use in support of scholarly
   * publications.
   */
  public var citeAs: CiteAs? = null,
  /**
   * Specifies the kind of report, such as grouping of classifiers, search results, or
   * human-compiled expression.
   */
  public var type: CodeableConcept? = null,
  /** Used for footnotes and annotations. */
  public var note: MutableList<Annotation> = mutableListOf(),
  /** Link, description or reference to artifact associated with the report. */
  public var relatedArtifact: MutableList<RelatedArtifact> = mutableListOf(),
  /**
   * Specifies the subject or focus of the report. Answers "What is this report about?".
   *
   * May be used as an expression for search queries and search results
   */
  public var subject: Subject,
  /**
   * The name of the organization or individual responsible for the release and ongoing maintenance
   * of the evidence report.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the evidence
   * report is the organization or individual primarily responsible for the maintenance and upkeep
   * of the evidence report. This is not necessarily the same individual or organization that
   * developed and initially authored the content. The publisher is the primary point of contact for
   * questions or issues with the evidence report. This item SHOULD be populated unless the
   * information is available from context.
   */
  public var publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var contact: MutableList<ContactDetail> = mutableListOf(),
  /**
   * An individiual, organization, or device primarily involved in the creation and maintenance of
   * the content.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
   */
  public var author: MutableList<ContactDetail> = mutableListOf(),
  /**
   * An individiual, organization, or device primarily responsible for internal coherence of the
   * content.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
   */
  public var editor: MutableList<ContactDetail> = mutableListOf(),
  /**
   * An individiual, organization, or device primarily responsible for review of some aspect of the
   * content.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var reviewer: MutableList<ContactDetail> = mutableListOf(),
  /**
   * An individiual, organization, or device responsible for officially endorsing the content for
   * use in some setting.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (see [Clinical Reasoning Module](clinicalreasoning-module.html)).
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var endorser: MutableList<ContactDetail> = mutableListOf(),
  /**
   * Relationships that this composition has with other compositions or documents that already
   * exist.
   *
   * A document is a version specific composition.
   */
  public var relatesTo: MutableList<RelatesTo> = mutableListOf(),
  /** The root of the sections that make up the composition. */
  public var section: MutableList<Section> = mutableListOf(),
) : DomainResource() {
  /** Specifies the subject or focus of the report. Answers "What is this report about?". */
  @Serializable(with = EvidenceReportSubjectSerializer::class)
  public class Subject(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and managable, there is a strict set of
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
     * provide negation or qualification. To make the use of extensions safe and managable, there is
     * a strict set of governance applied to the definition and use of extensions. Though any
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
    /** Characteristic. */
    public var characteristic: MutableList<Characteristic> = mutableListOf(),
    /** Used for general notes and annotations not coded elsewhere. */
    public var note: MutableList<Annotation> = mutableListOf(),
  ) : BackboneElement() {
    /** Characteristic. */
    @Serializable(with = EvidenceReportSubjectCharacteristicSerializer::class)
    public class Characteristic(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and managable, there is a strict set of
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
       * provide negation or qualification. To make the use of extensions safe and managable, there
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
       * Characteristic code.
       *
       * Example 1 is a Citation. Example 2 is a type of outcome. Example 3 is a specific outcome.
       */
      public var code: CodeableConcept,
      /**
       * Characteristic value.
       *
       * Example 1 is Citation #37. Example 2 is selecting clinical outcomes. Example 3 is 1-year
       * mortality.
       */
      public var `value`: Value,
      /** Is used to express not the characteristic. */
      public var exclude: Boolean? = null,
      /** Timeframe for the characteristic. */
      public var period: Period? = null,
    ) : BackboneElement() {
      public sealed interface Value {
        public fun asReference(): Reference? = this as? Reference

        public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

        public fun asBoolean(): Boolean? = this as? Boolean

        public fun asQuantity(): Quantity? = this as? Quantity

        public fun asRange(): Range? = this as? Range

        public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Value

        public data class CodeableConcept(
          public val `value`: com.google.fhir.model.r5.CodeableConcept
        ) : Value

        public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

        public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

        public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Value

        public companion object {
          internal fun from(
            referenceValue: com.google.fhir.model.r5.Reference?,
            codeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
            booleanValue: com.google.fhir.model.r5.Boolean?,
            quantityValue: com.google.fhir.model.r5.Quantity?,
            rangeValue: com.google.fhir.model.r5.Range?,
          ): Value? {
            if (referenceValue != null) return Reference(referenceValue)
            if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
            if (booleanValue != null) return Boolean(booleanValue)
            if (quantityValue != null) return Quantity(quantityValue)
            if (rangeValue != null) return Range(rangeValue)
            return null
          }
        }
      }
    }
  }

  /**
   * Relationships that this composition has with other compositions or documents that already
   * exist.
   */
  @Serializable(with = EvidenceReportRelatesToSerializer::class)
  public class RelatesTo(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and managable, there is a strict set of
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
     * provide negation or qualification. To make the use of extensions safe and managable, there is
     * a strict set of governance applied to the definition and use of extensions. Though any
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
     * The type of relationship that this composition has with anther composition or document.
     *
     * If this document appends another document, then the document cannot be fully understood
     * without also accessing the referenced document.
     */
    public var code: Enumeration<ReportRelationshipType>,
    /** The target composition/document of this relationship. */
    public var target: Target,
  ) : BackboneElement() {
    /** The target composition/document of this relationship. */
    @Serializable(with = EvidenceReportRelatesToTargetSerializer::class)
    public class Target(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and managable, there is a strict set of
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
       * provide negation or qualification. To make the use of extensions safe and managable, there
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
      /** Target of the relationship URL. */
      public var url: Uri? = null,
      /** Target of the relationship Identifier. */
      public var identifier: Identifier? = null,
      /** Target of the relationship Display. */
      public var display: Markdown? = null,
      /** Target of the relationship Resource reference. */
      public var resource: Reference? = null,
    ) : BackboneElement()
  }

  /** The root of the sections that make up the composition. */
  @Serializable(with = EvidenceReportSectionSerializer::class)
  public class Section(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and managable, there is a strict set of
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
     * provide negation or qualification. To make the use of extensions safe and managable, there is
     * a strict set of governance applied to the definition and use of extensions. Though any
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
     * The label for this particular section. This will be part of the rendered content for the
     * document, and is often used to build a table of contents.
     *
     * The title identifies the section for a human reader. The title must be consistent with the
     * narrative of the resource that is the target of the section.content reference. Generally,
     * sections SHOULD have titles, but in some documents, it is unnecessary or inappropriate.
     * Typically, this is where a section has subsections that have their own adequately
     * distinguishing title, or documents that only have a single section.
     */
    public var title: String? = null,
    /**
     * A code identifying the kind of content contained within the section. This should be
     * consistent with the section title.
     *
     * The code identifies the section for an automated processor of the document. This is
     * particularly relevant when using profiles to control the structure of the document.
     *
     * If the section has content (instead of sub-sections), the section.code does not change the
     * meaning or interpretation of the resource that is the content of the section in the comments
     * for the section.code.
     */
    public var focus: CodeableConcept? = null,
    /**
     * A definitional Resource identifying the kind of content contained within the section. This
     * should be consistent with the section title.
     */
    public var focusReference: Reference? = null,
    /**
     * Identifies who is responsible for the information in this section, not necessarily who typed
     * it in.
     */
    public var author: MutableList<Reference> = mutableListOf(),
    /**
     * A human-readable narrative that contains the attested content of the section, used to
     * represent the content of the resource to a human. The narrative need not encode all the
     * structured data, but is peferred to contain sufficient detail to make it acceptable for a
     * human to just read the narrative.
     *
     * Document profiles may define what content should be represented in the narrative.
     */
    public var text: Narrative? = null,
    /**
     * How the entry list was prepared - whether it is a working list that is suitable for being
     * maintained on an ongoing basis, or if it represents a snapshot of a list of items from
     * another source, or whether it is a prepared list where items may be marked as added, modified
     * or deleted.
     *
     * This element is labeled as a modifier because a change list must not be misunderstood as a
     * complete list.
     */
    public var mode: Enumeration<SectionMode>? = null,
    /**
     * Specifies the order applied to the items in the section entries.
     *
     * Applications SHOULD render ordered lists in the order provided, but MAY allow users to
     * re-order based on their own preferences as well. If there is no order specified, the order is
     * unknown, though there may still be some order.
     */
    public var orderedBy: CodeableConcept? = null,
    /** Specifies any type of classification of the evidence report. */
    public var entryClassifier: MutableList<CodeableConcept> = mutableListOf(),
    /**
     * A reference to the actual resource from which the narrative in the section is derived.
     *
     * If there are no entries in the list, an emptyReason SHOULD be provided.
     */
    public var entryReference: MutableList<Reference> = mutableListOf(),
    /** Quantity as content. */
    public var entryQuantity: MutableList<Quantity> = mutableListOf(),
    /**
     * If the section is empty, why the list is empty. An empty section typically has some text
     * explaining the empty reason.
     *
     * The various reasons for an empty section make a significant interpretation to its
     * interpretation. Note that this code is for use when the entire section content has been
     * suppressed, and not for when individual items are omitted - implementers may consider using a
     * text note or a flag on an entry in these cases.
     */
    public var emptyReason: CodeableConcept? = null,
    /**
     * A nested sub-section within this section.
     *
     * Nested sections are primarily used to help human readers navigate to particular portions of
     * the document.
     */
    public var section: MutableList<Section> = mutableListOf(),
  ) : BackboneElement()

  public sealed interface CiteAs {
    public fun asReference(): Reference? = this as? Reference

    public fun asMarkdown(): Markdown? = this as? Markdown

    public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : CiteAs

    public data class Markdown(public val `value`: com.google.fhir.model.r5.Markdown) : CiteAs

    public companion object {
      internal fun from(
        referenceValue: com.google.fhir.model.r5.Reference?,
        markdownValue: com.google.fhir.model.r5.Markdown?,
      ): CiteAs? {
        if (referenceValue != null) return Reference(referenceValue)
        if (markdownValue != null) return Markdown(markdownValue)
        return null
      }
    }
  }

  /** The type of relationship between reports. */
  public enum class ReportRelationshipType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Replaces("replaces", "http://hl7.org/fhir/report-relation-type", "Replaces"),
    Amends("amends", "http://hl7.org/fhir/report-relation-type", "Amends"),
    Appends("appends", "http://hl7.org/fhir/report-relation-type", "Appends"),
    Transforms("transforms", "http://hl7.org/fhir/report-relation-type", "Transforms"),
    ReplacedWith("replacedWith", "http://hl7.org/fhir/report-relation-type", "Replaced With"),
    AmendedWith("amendedWith", "http://hl7.org/fhir/report-relation-type", "Amended With"),
    AppendedWith("appendedWith", "http://hl7.org/fhir/report-relation-type", "Appended With"),
    TransformedWith(
      "transformedWith",
      "http://hl7.org/fhir/report-relation-type",
      "Transformed With",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): ReportRelationshipType =
        when (code) {
          "replaces" -> Replaces
          "amends" -> Amends
          "appends" -> Appends
          "transforms" -> Transforms
          "replacedWith" -> ReplacedWith
          "amendedWith" -> AmendedWith
          "appendedWith" -> AppendedWith
          "transformedWith" -> TransformedWith
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ReportRelationshipType")
        }
    }
  }

  /** The processing mode that applies to this list. */
  public enum class SectionMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Working("working", "http://hl7.org/fhir/list-mode", "Working List"),
    Snapshot("snapshot", "http://hl7.org/fhir/list-mode", "Snapshot List"),
    Changes("changes", "http://hl7.org/fhir/list-mode", "Change List");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): SectionMode =
        when (code) {
          "working" -> Working
          "snapshot" -> Snapshot
          "changes" -> Changes
          else -> throw IllegalArgumentException("Unknown code $code for enum SectionMode")
        }
    }
  }
}
