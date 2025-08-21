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

import com.google.fhir.model.r4b.serializers.RiskAssessmentOccurrenceSerializer
import com.google.fhir.model.r4b.serializers.RiskAssessmentPredictionProbabilitySerializer
import com.google.fhir.model.r4b.serializers.RiskAssessmentPredictionSerializer
import com.google.fhir.model.r4b.serializers.RiskAssessmentPredictionWhenSerializer
import com.google.fhir.model.r4b.serializers.RiskAssessmentSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood
 * of each outcome.
 */
@Serializable(with = RiskAssessmentSerializer::class)
@SerialName("RiskAssessment")
public data class RiskAssessment(
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
  /** Business identifier assigned to the risk assessment. */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /** A reference to the request that is fulfilled by this risk assessment. */
  public var basedOn: Reference? = null,
  /** A reference to a resource that this risk assessment is part of, such as a Procedure. */
  public var parent: Reference? = null,
  /** The status of the RiskAssessment, using the same statuses as an Observation. */
  public var status: Enumeration<ObservationStatus>,
  /** The algorithm, process or mechanism used to evaluate the risk. */
  public var method: CodeableConcept? = null,
  /** The type of the risk assessment performed. */
  public var code: CodeableConcept? = null,
  /** The patient or group the risk assessment applies to. */
  public var subject: Reference,
  /** The encounter where the assessment was performed. */
  public var encounter: Reference? = null,
  /** The date (and possibly time) the risk assessment was performed. */
  public var occurrence: Occurrence? = null,
  /**
   * For assessments or prognosis specific to a particular condition, indicates the condition being
   * assessed.
   */
  public var condition: Reference? = null,
  /** The provider or software application that performed the assessment. */
  public var performer: Reference? = null,
  /** The reason the risk assessment was performed. */
  public var reasonCode: MutableList<CodeableConcept> = mutableListOf(),
  /** Resources supporting the reason the risk assessment was performed. */
  public var reasonReference: MutableList<Reference> = mutableListOf(),
  /**
   * Indicates the source data considered as part of the assessment (for example, FamilyHistory,
   * Observations, Procedures, Conditions, etc.).
   */
  public var basis: MutableList<Reference> = mutableListOf(),
  /**
   * Describes the expected outcome for the subject.
   *
   * Multiple repetitions can be used to identify the same type of outcome in different timeframes
   * as well as different types of outcomes.
   */
  public var prediction: MutableList<Prediction> = mutableListOf(),
  /** A description of the steps that might be taken to reduce the identified risk(s). */
  public var mitigation: String? = null,
  /** Additional comments about the risk assessment. */
  public var note: MutableList<Annotation> = mutableListOf(),
) : DomainResource() {
  /** Describes the expected outcome for the subject. */
  @Serializable(with = RiskAssessmentPredictionSerializer::class)
  public class Prediction(
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
     * One of the potential outcomes for the patient (e.g. remission, death, a particular
     * condition).
     */
    public var outcome: CodeableConcept? = null,
    /**
     * Indicates how likely the outcome is (in the specified timeframe).
     *
     * If range is used, it represents the lower and upper bounds of certainty; e.g. 40-60% Decimal
     * values are expressed as percentages as well (max = 100).
     */
    public var probability: Probability? = null,
    /**
     * Indicates how likely the outcome is (in the specified timeframe), expressed as a qualitative
     * value (e.g. low, medium, or high).
     */
    public var qualitativeRisk: CodeableConcept? = null,
    /**
     * Indicates the risk for this particular subject (with their specific characteristics) divided
     * by the risk of the population in general. (Numbers greater than 1 = higher risk than the
     * population, numbers less than 1 = lower risk.).
     */
    public var relativeRisk: Decimal? = null,
    /**
     * Indicates the period of time or age range of the subject to which the specified probability
     * applies.
     *
     * If not specified, the risk applies "over the subject's lifespan".
     */
    public var `when`: When? = null,
    /** Additional information explaining the basis for the prediction. */
    public var rationale: String? = null,
  ) : BackboneElement() {
    @Serializable(with = RiskAssessmentPredictionProbabilitySerializer::class)
    public sealed interface Probability {
      public fun asDecimal(): Decimal? = this as? Decimal

      public fun asRange(): Range? = this as? Range

      public data class Decimal(public val `value`: com.google.fhir.model.r4b.Decimal) :
        Probability

      public data class Range(public val `value`: com.google.fhir.model.r4b.Range) : Probability

      public companion object {
        internal fun from(
          decimalValue: com.google.fhir.model.r4b.Decimal?,
          rangeValue: com.google.fhir.model.r4b.Range?,
        ): Probability? {
          if (decimalValue != null) return Decimal(decimalValue)
          if (rangeValue != null) return Range(rangeValue)
          return null
        }
      }
    }

    @Serializable(with = RiskAssessmentPredictionWhenSerializer::class)
    public sealed interface When {
      public fun asPeriod(): Period? = this as? Period

      public fun asRange(): Range? = this as? Range

      public data class Period(public val `value`: com.google.fhir.model.r4b.Period) : When

      public data class Range(public val `value`: com.google.fhir.model.r4b.Range) : When

      public companion object {
        internal fun from(
          periodValue: com.google.fhir.model.r4b.Period?,
          rangeValue: com.google.fhir.model.r4b.Range?,
        ): When? {
          if (periodValue != null) return Period(periodValue)
          if (rangeValue != null) return Range(rangeValue)
          return null
        }
      }
    }
  }

  @Serializable(with = RiskAssessmentOccurrenceSerializer::class)
  public sealed interface Occurrence {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) : Occurrence

    public data class Period(public val `value`: com.google.fhir.model.r4b.Period) : Occurrence

    public companion object {
      internal fun from(
        dateTimeValue: com.google.fhir.model.r4b.DateTime?,
        periodValue: com.google.fhir.model.r4b.Period?,
      ): Occurrence? {
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (periodValue != null) return Period(periodValue)
        return null
      }
    }
  }

  /** Codes providing the status of an observation. */
  public enum class ObservationStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Registered("registered", "http://hl7.org/fhir/observation-status", "Registered"),
    Preliminary("preliminary", "http://hl7.org/fhir/observation-status", "Preliminary"),
    Final("final", "http://hl7.org/fhir/observation-status", "Final"),
    Amended("amended", "http://hl7.org/fhir/observation-status", "Amended"),
    Corrected("corrected", "http://hl7.org/fhir/observation-status", "Corrected"),
    Cancelled("cancelled", "http://hl7.org/fhir/observation-status", "Cancelled"),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/observation-status",
      "Entered in Error",
    ),
    Unknown("unknown", "http://hl7.org/fhir/observation-status", "Unknown");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): ObservationStatus =
        when (code) {
          "registered" -> Registered
          "preliminary" -> Preliminary
          "final" -> Final
          "amended" -> Amended
          "corrected" -> Corrected
          "cancelled" -> Cancelled
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum ObservationStatus")
        }
    }
  }
}
