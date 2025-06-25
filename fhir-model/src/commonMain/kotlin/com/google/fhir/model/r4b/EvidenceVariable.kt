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

import com.google.fhir.model.r4b.serializers.EvidenceVariableCategorySerializer
import com.google.fhir.model.r4b.serializers.EvidenceVariableCharacteristicSerializer
import com.google.fhir.model.r4b.serializers.EvidenceVariableCharacteristicTimeFromStartSerializer
import com.google.fhir.model.r4b.serializers.EvidenceVariableSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** The EvidenceVariable resource describes an element that knowledge (Evidence) is about. */
@Serializable(with = EvidenceVariableSerializer::class)
@SerialName("EvidenceVariable")
public data class EvidenceVariable(
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
  override var contained: List<Resource?>? = null,
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
  override var extension: List<Extension?>? = null,
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
  override var modifierExtension: List<Extension?>? = null,
  /**
   * An absolute URI that is used to identify this evidence variable when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which at which an authoritative instance
   * of this evidence variable is (or will be) published. This URL can be the target of a canonical
   * reference. It SHALL remain the same when the evidence variable is stored on different servers.
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
   * A formal identifier that is used to identify this evidence variable when it is represented in
   * other formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this evidence variable outside of FHIR, where it is not possible to
   * use the logical URI.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier that is used to identify this version of the evidence variable when it is
   * referenced in a specification, model, design or instance. This is an arbitrary value managed by
   * the evidence variable author and is not expected to be globally unique. For example, it might
   * be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no
   * expectation that versions can be placed in a lexicographical sequence. To provide a version
   * consistent with the Decision Support Service specification, use the format Major.Minor.Revision
   * (e.g. 1.0.0). For more information on versioning knowledge assets, refer to the Decision
   * Support Service specification. Note that a version is required for non-experimental active
   * artifacts.
   *
   * There may be different evidence variable instances that have the same identifier but different
   * versions. The version can be appended to the url in a reference to allow a reference to a
   * particular business version of the evidence variable with the format [url]|[version].
   */
  public var version: String? = null,
  /**
   * A natural language name identifying the evidence variable. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the evidence variable.
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
   * An explanatory or alternate title for the EvidenceVariable giving additional information about
   * its content.
   */
  public var subtitle: String? = null,
  /**
   * The status of this evidence variable. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of evidence variables that are appropriate for use versus not.
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * The date (and optionally time) when the evidence variable was published. The date must change
   * when the business version changes and it must change if the status code changes. In addition,
   * it should change when the substantive content of the evidence variable changes.
   *
   * Note that this is not the same as the resource last-modified-date, since the resource may be a
   * secondary representation of the evidence variable. Additional specific dates may be added as
   * extensions or be found by consulting Provenances associated with past versions of the resource.
   */
  public var date: DateTime? = null,
  /**
   * A free text natural language description of the evidence variable from a consumer's
   * perspective.
   *
   * This description can be used to capture details such as why the evidence variable was built,
   * comments about misuse, instructions for clinical use and interpretation, literature references,
   * examples from the paper world, etc. It is not a rendering of the evidence variable as conveyed
   * in the 'text' field of the resource itself. This item SHOULD be populated unless the
   * information is available from context (e.g. the language of the evidence variable is presumed
   * to be the predominant language in the place the evidence variable was created).
   */
  public var description: Markdown? = null,
  /** A human-readable string to clarify or explain concepts about the resource. */
  public var note: List<Annotation?>? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate evidence variable instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * The name of the organization or individual that published the evidence variable.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the evidence
   * variable is the organization or individual primarily responsible for the maintenance and upkeep
   * of the evidence variable. This is not necessarily the same individual or organization that
   * developed and initially authored the content. The publisher is the primary point of contact for
   * questions or issues with the evidence variable. This item SHOULD be populated unless the
   * information is available from context.
   */
  public var publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (Details at: http://build.fhir.org/clinicalreasoning-module.html).
   */
  public var contact: List<ContactDetail?>? = null,
  /**
   * An individiual or organization primarily involved in the creation and maintenance of the
   * content.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (Details at: http://build.fhir.org/clinicalreasoning-module.html).
   */
  public var author: List<ContactDetail?>? = null,
  /**
   * An individual or organization primarily responsible for internal coherence of the content.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (Details at: http://build.fhir.org/clinicalreasoning-module.html).
   */
  public var editor: List<ContactDetail?>? = null,
  /**
   * An individual or organization primarily responsible for review of some aspect of the content.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (Details at: http://build.fhir.org/clinicalreasoning-module.html).
   */
  public var reviewer: List<ContactDetail?>? = null,
  /**
   * An individual or organization responsible for officially endorsing the content for use in some
   * setting.
   *
   * Extensions to ContactDetail include: contactReference, contactAddress, and contributionTime
   * (Details at: http://build.fhir.org/clinicalreasoning-module.html).
   */
  public var endorser: List<ContactDetail?>? = null,
  /**
   * Related artifacts such as additional documentation, justification, or bibliographic references.
   *
   * Each related artifact is either an attachment, or a reference to another resource, but not
   * both.
   */
  public var relatedArtifact: List<RelatedArtifact?>? = null,
  /**
   * True if the actual variable measured, false if a conceptual representation of the intended
   * variable.
   */
  public var `actual`: Boolean? = null,
  /** Used to specify if two or more characteristics are combined with OR or AND. */
  public var characteristicCombination: Enumeration<CharacteristicCombination>? = null,
  /**
   * A characteristic that defines the members of the evidence element. Multiple characteristics are
   * applied with "and" semantics.
   *
   * Characteristics can be defined flexibly to accommodate different use cases for membership
   * criteria, ranging from simple codes, all the way to using an expression language to express the
   * criteria.
   */
  public var characteristic: List<Characteristic>? = null,
  /** Used for an outcome to classify. */
  public var handling: Enumeration<EvidenceVariableHandling>? = null,
  /**
   * A grouping (or set of values) described along with other groupings to specify the set of
   * groupings allowed for the variable.
   */
  public var category: List<Category>? = null,
) : DomainResource() {
  /**
   * A characteristic that defines the members of the evidence element. Multiple characteristics are
   * applied with "and" semantics.
   */
  @Serializable(with = EvidenceVariableCharacteristicSerializer::class)
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
    override var extension: List<Extension?>? = null,
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
    override var modifierExtension: List<Extension?>? = null,
    /**
     * A short, natural language description of the characteristic that could be used to communicate
     * the criteria to an end-user.
     */
    public var description: String? = null,
    /**
     * Define members of the evidence element using Codes (such as condition, medication, or
     * observation), Expressions ( using an expression language such as FHIRPath or CQL) or
     * DataRequirements (such as Diabetes diagnosis onset in the last year).
     */
    public var definition: Definition? = null,
    /** Method used for describing characteristic. */
    public var method: CodeableConcept? = null,
    /** Device used for determining characteristic. */
    public var device: Reference? = null,
    /** When true, members with this characteristic are excluded from the element. */
    public var exclude: Boolean? = null,
    /** Indicates duration, period, or point of observation from the participant's study entry. */
    public var timeFromStart: TimeFromStart? = null,
    /** Indicates how elements are aggregated within the study effective period. */
    public var groupMeasure: Enumeration<GroupMeasure>? = null,
  ) : BackboneElement() {
    /** Indicates duration, period, or point of observation from the participant's study entry. */
    @Serializable(with = EvidenceVariableCharacteristicTimeFromStartSerializer::class)
    public class TimeFromStart(
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
      override var extension: List<Extension?>? = null,
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
      override var modifierExtension: List<Extension?>? = null,
      /** A short, natural language description. */
      public var description: String? = null,
      /** Used to express the observation at a defined amount of time after the study start. */
      public var quantity: Quantity? = null,
      /** Used to express the observation within a period after the study start. */
      public var range: Range? = null,
      /** A human-readable string to clarify or explain concepts about the resource. */
      public var note: List<Annotation?>? = null,
    ) : BackboneElement()

    public sealed interface Definition {
      public fun asReference(): Reference? = this as? Reference

      public fun asCanonical(): Canonical? = this as? Canonical

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asExpression(): Expression? = this as? Expression

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
        Definition

      public data class Canonical(public val `value`: com.google.fhir.model.r4b.Canonical) :
        Definition

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4b.CodeableConcept
      ) : Definition

      public data class Expression(public val `value`: com.google.fhir.model.r4b.Expression) :
        Definition

      public companion object {
        public fun from(
          ReferenceValue: com.google.fhir.model.r4b.Reference?,
          canonicalValue: com.google.fhir.model.r4b.Canonical?,
          CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
          ExpressionValue: com.google.fhir.model.r4b.Expression?,
        ): Definition? {
          if (ReferenceValue != null) return Reference(ReferenceValue)
          if (canonicalValue != null) return Canonical(canonicalValue)
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (ExpressionValue != null) return Expression(ExpressionValue)
          return null
        }
      }
    }
  }

  /**
   * A grouping (or set of values) described along with other groupings to specify the set of
   * groupings allowed for the variable.
   */
  @Serializable(with = EvidenceVariableCategorySerializer::class)
  public class Category(
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
    override var extension: List<Extension?>? = null,
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
    override var modifierExtension: List<Extension?>? = null,
    /** A human-readable title or representation of the grouping. */
    public var name: String? = null,
    /** Value or set of values that define the grouping. */
    public var `value`: Value? = null,
  ) : BackboneElement() {
    public sealed interface Value {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asRange(): Range? = this as? Range

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4b.CodeableConcept
      ) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r4b.Quantity) : Value

      public data class Range(public val `value`: com.google.fhir.model.r4b.Range) : Value

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
          QuantityValue: com.google.fhir.model.r4b.Quantity?,
          RangeValue: com.google.fhir.model.r4b.Range?,
        ): Value? {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (RangeValue != null) return Range(RangeValue)
          return null
        }
      }
    }
  }

  /** Possible group measure aggregates (E.g. Mean, Median). */
  public enum class GroupMeasure(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Aggregated using Mean of participant values. */
    Mean(
      "mean",
      "http://hl7.org/fhir/group-measure",
      "Mean",
      "Aggregated using Mean of participant values.",
    ),
    /** Aggregated using Median of participant values. */
    Median(
      "median",
      "http://hl7.org/fhir/group-measure",
      "Median",
      "Aggregated using Median of participant values.",
    ),
    /** Aggregated using Mean of study mean values. */
    Mean_Of_Mean(
      "mean-of-mean",
      "http://hl7.org/fhir/group-measure",
      "Mean of Study Means",
      "Aggregated using Mean of study mean values.",
    ),
    /** Aggregated using Mean of study median values. */
    Mean_Of_Median(
      "mean-of-median",
      "http://hl7.org/fhir/group-measure",
      "Mean of Study Medins",
      "Aggregated using Mean of study median values.",
    ),
    /** Aggregated using Median of study mean values. */
    Median_Of_Mean(
      "median-of-mean",
      "http://hl7.org/fhir/group-measure",
      "Median of Study Means",
      "Aggregated using Median of study mean values.",
    ),
    /** Aggregated using Median of study median values. */
    Median_Of_Median(
      "median-of-median",
      "http://hl7.org/fhir/group-measure",
      "Median of Study Medians",
      "Aggregated using Median of study median values.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

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

  /** Logical grouping of characteristics. */
  public enum class CharacteristicCombination(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Combine characteristics with AND. */
    Intersection(
      "intersection",
      "http://hl7.org/fhir/characteristic-combination",
      "intersection",
      "Combine characteristics with AND.",
    ),
    /** Combine characteristics with OR. */
    Union(
      "union",
      "http://hl7.org/fhir/characteristic-combination",
      "union",
      "Combine characteristics with OR.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): CharacteristicCombination =
        when (code) {
          "intersection" -> Intersection
          "union" -> Union
          else ->
            throw IllegalArgumentException("Unknown code $code for enum CharacteristicCombination")
        }
    }
  }

  /**
   * The handling of the variable in statistical analysis for exposures or outcomes (E.g.
   * Dichotomous, Continuous, Descriptive).
   */
  public enum class EvidenceVariableHandling(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * A continuous variable is one for which, within the limits the variable ranges, any value is
     * possible (from STATO http://purl.obolibrary.org/obo/STATO_0000251).
     */
    Continuous(
      "continuous",
      "http://hl7.org/fhir/variable-handling",
      "continuous variable",
      "A continuous variable is one for which, within the limits the variable ranges, any value is possible (from STATO http://purl.obolibrary.org/obo/STATO_0000251).",
    ),
    /**
     * A dichotomous variable is a categorical variable which is defined to have only 2 categories
     * or possible values (from STATO http://purl.obolibrary.org/obo/STATO_0000090).
     */
    Dichotomous(
      "dichotomous",
      "http://hl7.org/fhir/variable-handling",
      "dichotomous variable",
      "A dichotomous variable is a categorical variable which is defined to have only 2 categories or possible values (from STATO http://purl.obolibrary.org/obo/STATO_0000090).",
    ),
    /**
     * An ordinal variable is a categorical variable where the discrete possible values are ordered
     * or correspond to an implicit ranking (from STATO
     * http://purl.obolibrary.org/obo/STATO_0000228).
     */
    Ordinal(
      "ordinal",
      "http://hl7.org/fhir/variable-handling",
      "ordinal variable",
      "An ordinal variable is a categorical variable where the discrete possible values are ordered or correspond to an implicit ranking (from STATO http://purl.obolibrary.org/obo/STATO_0000228).",
    ),
    /**
     * A polychotomous variable is a categorical variable which is defined to have minimally 2
     * categories or possible values. (from STATO http://purl.obolibrary.org/obo/STATO_0000087).
     * Suggestion to limit code use to situations when neither dichotomous nor ordinal variables
     * apply.
     */
    Polychotomous(
      "polychotomous",
      "http://hl7.org/fhir/variable-handling",
      "polychotomous variable",
      "A polychotomous variable is a categorical variable which is defined to have minimally 2 categories or possible values. (from STATO  http://purl.obolibrary.org/obo/STATO_0000087).  Suggestion to limit code use to situations when neither dichotomous nor ordinal variables apply.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): EvidenceVariableHandling =
        when (code) {
          "continuous" -> Continuous
          "dichotomous" -> Dichotomous
          "ordinal" -> Ordinal
          "polychotomous" -> Polychotomous
          else ->
            throw IllegalArgumentException("Unknown code $code for enum EvidenceVariableHandling")
        }
    }
  }
}
