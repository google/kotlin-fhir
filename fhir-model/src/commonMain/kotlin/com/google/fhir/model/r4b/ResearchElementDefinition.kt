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

import com.google.fhir.model.r4b.serializers.ResearchElementDefinitionCharacteristicSerializer
import com.google.fhir.model.r4b.serializers.ResearchElementDefinitionSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The ResearchElementDefinition resource describes a "PICO" element that knowledge (evidence,
 * assertion, recommendation) is about.
 */
@Serializable(with = ResearchElementDefinitionSerializer::class)
@SerialName("ResearchElementDefinition")
public data class ResearchElementDefinition(
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
   * An absolute URI that is used to identify this research element definition when it is referenced
   * in a specification, model, design or an instance; also called its canonical identifier. This
   * SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative
   * instance of this research element definition is (or will be) published. This URL can be the
   * target of a canonical reference. It SHALL remain the same when the research element definition
   * is stored on different servers.
   *
   * Can be a urn:uuid: or a urn:oid: but real http: addresses are preferred. Multiple instances may
   * share the same URL if they have a distinct version.
   *
   * The determination of when to create a new version of a resource (same url, new version) vs.
   * defining a new artifact is up to the author. Considerations for making this decision are found
   * in [Technical and Business Versions](resource.html#versions).
   *
   * In some cases, the resource can no longer be found at the stated url, but the url itself cannot
   * change. Implementations can use the [meta.source](resource.html#meta) element to indicate where
   * the current master source of the resource can be found.
   */
  public var url: Uri? = null,
  /**
   * A formal identifier that is used to identify this research element definition when it is
   * represented in other formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this research element definition outside of FHIR, where it is not
   * possible to use the logical URI.
   */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /**
   * The identifier that is used to identify this version of the research element definition when it
   * is referenced in a specification, model, design or instance. This is an arbitrary value managed
   * by the research element definition author and is not expected to be globally unique. For
   * example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There
   * is also no expectation that versions can be placed in a lexicographical sequence. To provide a
   * version consistent with the Decision Support Service specification, use the format
   * Major.Minor.Revision (e.g. 1.0.0). For more information on versioning knowledge assets, refer
   * to the Decision Support Service specification. Note that a version is required for
   * non-experimental active artifacts.
   *
   * There may be different research element definition instances that have the same identifier but
   * different versions. The version can be appended to the url in a reference to allow a reference
   * to a particular business version of the research element definition with the format
   * [url]|[version].
   */
  public var version: String? = null,
  /**
   * A natural language name identifying the research element definition. This name should be usable
   * as an identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the research element definition.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * The short title provides an alternate title for use in informal descriptive contexts where the
   * full, formal title is not necessary.
   */
  public var shortTitle: String? = null,
  /**
   * An explanatory or alternate title for the ResearchElementDefinition giving additional
   * information about its content.
   */
  public var subtitle: String? = null,
  /**
   * The status of this research element definition. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of research element definitions that are appropriate for use versus not.
   */
  public var status: Enumeration<PublicationStatus>,
  /**
   * A Boolean value to indicate that this research element definition is authored for testing
   * purposes (or education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of research element definitions that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The intended subjects for the ResearchElementDefinition. If this element is not provided, a
   * Patient subject is assumed, but the subject of the ResearchElementDefinition can be anything.
   *
   * The subject of the ResearchElementDefinition is critical in interpreting the criteria
   * definitions, as the logic in the ResearchElementDefinitions is evaluated with respect to a
   * particular subject. This corresponds roughly to the notion of a Compartment in that it limits
   * what content is available based on its relationship to the subject. In CQL, this corresponds to
   * the context declaration.
   */
  public var subject: Subject? = null,
  /**
   * The date (and optionally time) when the research element definition was published. The date
   * must change when the business version changes and it must change if the status code changes. In
   * addition, it should change when the substantive content of the research element definition
   * changes.
   *
   * Note that this is not the same as the resource last-modified-date, since the resource may be a
   * secondary representation of the research element definition. Additional specific dates may be
   * added as extensions or be found by consulting Provenances associated with past versions of the
   * resource.
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual that published the research element definition.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the research
   * element definition is the organization or individual primarily responsible for the maintenance
   * and upkeep of the research element definition. This is not necessarily the same individual or
   * organization that developed and initially authored the content. The publisher is the primary
   * point of contact for questions or issues with the research element definition. This item SHOULD
   * be populated unless the information is available from context.
   */
  public var publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * May be a web site, an email address, a telephone number, etc.
   */
  public var contact: MutableList<ContactDetail> = mutableListOf(),
  /**
   * A free text natural language description of the research element definition from a consumer's
   * perspective.
   *
   * This description can be used to capture details such as why the research element definition was
   * built, comments about misuse, instructions for clinical use and interpretation, literature
   * references, examples from the paper world, etc. It is not a rendering of the research element
   * definition as conveyed in the 'text' field of the resource itself. This item SHOULD be
   * populated unless the information is available from context (e.g. the language of the research
   * element definition is presumed to be the predominant language in the place the research element
   * definition was created).
   */
  public var description: Markdown? = null,
  /** A human-readable string to clarify or explain concepts about the resource. */
  public var comment: MutableList<String> = mutableListOf(),
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate research element definition instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: MutableList<UsageContext> = mutableListOf(),
  /**
   * A legal or geographic region in which the research element definition is intended to be used.
   *
   * It may be possible for the research element definition to be used in jurisdictions other than
   * those for which it was originally designed or intended.
   */
  public var jurisdiction: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * Explanation of why this research element definition is needed and why it has been designed as
   * it has.
   *
   * This element does not describe the usage of the research element definition. Instead, it
   * provides traceability of ''why'' the resource is either needed or ''why'' it is defined as it
   * is. This may be used to point to source materials or specifications that drove the structure of
   * this research element definition.
   */
  public var purpose: Markdown? = null,
  /**
   * A detailed description, from a clinical perspective, of how the ResearchElementDefinition is
   * used.
   */
  public var usage: String? = null,
  /**
   * A copyright statement relating to the research element definition and/or its contents.
   * Copyright statements are generally legal restrictions on the use and publishing of the research
   * element definition.
   */
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
   * The period during which the research element definition content was or is planned to be in
   * active use.
   *
   * The effective period for a research element definition determines when the content is
   * applicable for usage and is independent of publication and review dates. For example, a measure
   * intended to be used for the year 2016 might be published in 2015.
   */
  public var effectivePeriod: Period? = null,
  /**
   * Descriptive topics related to the content of the ResearchElementDefinition. Topics provide a
   * high-level categorization grouping types of ResearchElementDefinitions that can be useful for
   * filtering and searching.
   */
  public var topic: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * An individiual or organization primarily involved in the creation and maintenance of the
   * content.
   */
  public var author: MutableList<ContactDetail> = mutableListOf(),
  /** An individual or organization primarily responsible for internal coherence of the content. */
  public var editor: MutableList<ContactDetail> = mutableListOf(),
  /**
   * An individual or organization primarily responsible for review of some aspect of the content.
   */
  public var reviewer: MutableList<ContactDetail> = mutableListOf(),
  /**
   * An individual or organization responsible for officially endorsing the content for use in some
   * setting.
   */
  public var endorser: MutableList<ContactDetail> = mutableListOf(),
  /**
   * Related artifacts such as additional documentation, justification, or bibliographic references.
   *
   * Each related artifact is either an attachment, or a reference to another resource, but not
   * both.
   */
  public var relatedArtifact: MutableList<RelatedArtifact> = mutableListOf(),
  /**
   * A reference to a Library resource containing the formal logic used by the
   * ResearchElementDefinition.
   */
  public var library: MutableList<Canonical> = mutableListOf(),
  /** The type of research element, a population, an exposure, or an outcome. */
  public var type: Enumeration<ResearchElementType>,
  /** The type of the outcome (e.g. Dichotomous, Continuous, or Descriptive). */
  public var variableType: Enumeration<VariableType>? = null,
  /**
   * A characteristic that defines the members of the research element. Multiple characteristics are
   * applied with "and" semantics.
   *
   * Characteristics can be defined flexibly to accommodate different use cases for membership
   * criteria, ranging from simple codes, all the way to using an expression language to express the
   * criteria.
   */
  public var characteristic: MutableList<Characteristic> = mutableListOf(),
) : DomainResource() {
  /**
   * A characteristic that defines the members of the research element. Multiple characteristics are
   * applied with "and" semantics.
   */
  @Serializable(with = ResearchElementDefinitionCharacteristicSerializer::class)
  public class Characteristic(
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
     * Define members of the research element using Codes (such as condition, medication, or
     * observation), Expressions ( using an expression language such as FHIRPath or CQL) or
     * DataRequirements (such as Diabetes diagnosis onset in the last year).
     */
    public var definition: Definition,
    /**
     * Use UsageContext to define the members of the population, such as Age Ranges, Genders,
     * Settings.
     */
    public var usageContext: MutableList<UsageContext> = mutableListOf(),
    /** When true, members with this characteristic are excluded from the element. */
    public var exclude: Boolean? = null,
    /** Specifies the UCUM unit for the outcome. */
    public var unitOfMeasure: CodeableConcept? = null,
    /** A narrative description of the time period the study covers. */
    public var studyEffectiveDescription: String? = null,
    /** Indicates what effective period the study covers. */
    public var studyEffective: StudyEffective? = null,
    /** Indicates duration from the study initiation. */
    public var studyEffectiveTimeFromStart: Duration? = null,
    /** Indicates how elements are aggregated within the study effective period. */
    public var studyEffectiveGroupMeasure: Enumeration<GroupMeasure>? = null,
    /** A narrative description of the time period the study covers. */
    public var participantEffectiveDescription: String? = null,
    /** Indicates what effective period the study covers. */
    public var participantEffective: ParticipantEffective? = null,
    /** Indicates duration from the participant's study entry. */
    public var participantEffectiveTimeFromStart: Duration? = null,
    /** Indicates how elements are aggregated within the study effective period. */
    public var participantEffectiveGroupMeasure: Enumeration<GroupMeasure>? = null,
  ) : BackboneElement() {
    public sealed interface Definition {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asCanonical(): Canonical? = this as? Canonical

      public fun asExpression(): Expression? = this as? Expression

      public fun asDataRequirement(): DataRequirement? = this as? DataRequirement

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4b.CodeableConcept
      ) : Definition

      public data class Canonical(public val `value`: com.google.fhir.model.r4b.Canonical) :
        Definition

      public data class Expression(public val `value`: com.google.fhir.model.r4b.Expression) :
        Definition

      public data class DataRequirement(
        public val `value`: com.google.fhir.model.r4b.DataRequirement
      ) : Definition

      public companion object {
        internal fun from(
          codeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
          canonicalValue: com.google.fhir.model.r4b.Canonical?,
          expressionValue: com.google.fhir.model.r4b.Expression?,
          dataRequirementValue: com.google.fhir.model.r4b.DataRequirement?,
        ): Definition? {
          if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
          if (canonicalValue != null) return Canonical(canonicalValue)
          if (expressionValue != null) return Expression(expressionValue)
          if (dataRequirementValue != null) return DataRequirement(dataRequirementValue)
          return null
        }
      }
    }

    public sealed interface StudyEffective {
      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asPeriod(): Period? = this as? Period

      public fun asDuration(): Duration? = this as? Duration

      public fun asTiming(): Timing? = this as? Timing

      public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) :
        StudyEffective

      public data class Period(public val `value`: com.google.fhir.model.r4b.Period) :
        StudyEffective

      public data class Duration(public val `value`: com.google.fhir.model.r4b.Duration) :
        StudyEffective

      public data class Timing(public val `value`: com.google.fhir.model.r4b.Timing) :
        StudyEffective

      public companion object {
        internal fun from(
          dateTimeValue: com.google.fhir.model.r4b.DateTime?,
          periodValue: com.google.fhir.model.r4b.Period?,
          durationValue: com.google.fhir.model.r4b.Duration?,
          timingValue: com.google.fhir.model.r4b.Timing?,
        ): StudyEffective? {
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (periodValue != null) return Period(periodValue)
          if (durationValue != null) return Duration(durationValue)
          if (timingValue != null) return Timing(timingValue)
          return null
        }
      }
    }

    public sealed interface ParticipantEffective {
      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asPeriod(): Period? = this as? Period

      public fun asDuration(): Duration? = this as? Duration

      public fun asTiming(): Timing? = this as? Timing

      public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) :
        ParticipantEffective

      public data class Period(public val `value`: com.google.fhir.model.r4b.Period) :
        ParticipantEffective

      public data class Duration(public val `value`: com.google.fhir.model.r4b.Duration) :
        ParticipantEffective

      public data class Timing(public val `value`: com.google.fhir.model.r4b.Timing) :
        ParticipantEffective

      public companion object {
        internal fun from(
          dateTimeValue: com.google.fhir.model.r4b.DateTime?,
          periodValue: com.google.fhir.model.r4b.Period?,
          durationValue: com.google.fhir.model.r4b.Duration?,
          timingValue: com.google.fhir.model.r4b.Timing?,
        ): ParticipantEffective? {
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (periodValue != null) return Period(periodValue)
          if (durationValue != null) return Duration(durationValue)
          if (timingValue != null) return Timing(timingValue)
          return null
        }
      }
    }
  }

  public sealed interface Subject {
    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public fun asReference(): Reference? = this as? Reference

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r4b.CodeableConcept
    ) : Subject

    public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) : Subject

    public companion object {
      internal fun from(
        codeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
        referenceValue: com.google.fhir.model.r4b.Reference?,
      ): Subject? {
        if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
        if (referenceValue != null) return Reference(referenceValue)
        return null
      }
    }
  }

  /** Possible group measure aggregates (E.g. Mean, Median). */
  public enum class GroupMeasure(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Mean("mean", "http://hl7.org/fhir/group-measure", "Mean"),
    Median("median", "http://hl7.org/fhir/group-measure", "Median"),
    Mean_Of_Mean("mean-of-mean", "http://hl7.org/fhir/group-measure", "Mean of Study Means"),
    Mean_Of_Median("mean-of-median", "http://hl7.org/fhir/group-measure", "Mean of Study Medins"),
    Median_Of_Mean("median-of-mean", "http://hl7.org/fhir/group-measure", "Median of Study Means"),
    Median_Of_Median(
      "median-of-median",
      "http://hl7.org/fhir/group-measure",
      "Median of Study Medians",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): GroupMeasure =
        when (code) {
          "mean" -> Mean
          "median" -> Median
          "mean-of-mean" -> Mean_Of_Mean
          "mean-of-median" -> Mean_Of_Median
          "median-of-mean" -> Median_Of_Mean
          "median-of-median" -> Median_Of_Median
          else -> throw IllegalArgumentException("Unknown code $code for enum GroupMeasure")
        }
    }
  }

  /** The possible types of research elements (E.g. Population, Exposure, Outcome). */
  public enum class ResearchElementType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Population("population", "http://hl7.org/fhir/research-element-type", "Population"),
    Exposure("exposure", "http://hl7.org/fhir/research-element-type", "Exposure"),
    Outcome("outcome", "http://hl7.org/fhir/research-element-type", "Outcome");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): ResearchElementType =
        when (code) {
          "population" -> Population
          "exposure" -> Exposure
          "outcome" -> Outcome
          else -> throw IllegalArgumentException("Unknown code $code for enum ResearchElementType")
        }
    }
  }

  /**
   * The possible types of variables for exposures or outcomes (E.g. Dichotomous, Continuous,
   * Descriptive).
   */
  public enum class VariableType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Dichotomous("dichotomous", "http://hl7.org/fhir/variable-type", "Dichotomous"),
    Continuous("continuous", "http://hl7.org/fhir/variable-type", "Continuous"),
    Descriptive("descriptive", "http://hl7.org/fhir/variable-type", "Descriptive");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): VariableType =
        when (code) {
          "dichotomous" -> Dichotomous
          "continuous" -> Continuous
          "descriptive" -> Descriptive
          else -> throw IllegalArgumentException("Unknown code $code for enum VariableType")
        }
    }
  }
}
