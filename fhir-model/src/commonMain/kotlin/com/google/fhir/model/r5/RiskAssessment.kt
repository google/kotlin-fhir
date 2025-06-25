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

import com.google.fhir.model.r5.serializers.RiskAssessmentPredictionSerializer
import com.google.fhir.model.r5.serializers.RiskAssessmentSerializer
import kotlin.Suppress
import kotlin.collections.List
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
  override var contained: List<Resource?>? = null,
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
  override var extension: List<Extension?>? = null,
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
  override var modifierExtension: List<Extension?>? = null,
  /** Business identifier assigned to the risk assessment. */
  public var identifier: List<Identifier?>? = null,
  /** A reference to the request that is fulfilled by this risk assessment. */
  public var basedOn: Reference? = null,
  /** A reference to a resource that this risk assessment is part of, such as a Procedure. */
  public var parent: Reference? = null,
  /** The status of the RiskAssessment, using the same statuses as an Observation. */
  public var status: Enumeration<RiskAssessmentStatus>? = null,
  /** The algorithm, process or mechanism used to evaluate the risk. */
  public var method: CodeableConcept? = null,
  /** The type of the risk assessment performed. */
  public var code: CodeableConcept? = null,
  /** The patient or group the risk assessment applies to. */
  public var subject: Reference? = null,
  /** The encounter where the assessment was performed. */
  public var encounter: Reference? = null,
  /** The date (and possibly time) the risk assessment was performed. */
  public var occurrence: Occurrence? = null,
  /**
   * For assessments or prognosis specific to a particular condition, indicates the condition being
   * assessed.
   */
  public var condition: Reference? = null,
  /**
   * The provider, patient, related person, or software application that performed the assessment.
   */
  public var performer: Reference? = null,
  /** The reason the risk assessment was performed. */
  public var reason: List<CodeableReference?>? = null,
  /**
   * Indicates the source data considered as part of the assessment (for example, FamilyHistory,
   * Observations, Procedures, Conditions, etc.).
   */
  public var basis: List<Reference?>? = null,
  /**
   * Describes the expected outcome for the subject.
   *
   * Multiple repetitions can be used to identify the same type of outcome in different timeframes
   * as well as different types of outcomes.
   */
  public var prediction: List<Prediction>? = null,
  /** A description of the steps that might be taken to reduce the identified risk(s). */
  public var mitigation: String? = null,
  /** Additional comments about the risk assessment. */
  public var note: List<Annotation?>? = null,
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
    override var extension: List<Extension?>? = null,
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
    override var modifierExtension: List<Extension?>? = null,
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
    public sealed interface Probability {
      public fun asDecimal(): Decimal? = this as? Decimal

      public fun asRange(): Range? = this as? Range

      public data class Decimal(public val `value`: com.google.fhir.model.r5.Decimal) : Probability

      public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Probability

      public companion object {
        public fun from(
          decimalValue: com.google.fhir.model.r5.Decimal?,
          RangeValue: com.google.fhir.model.r5.Range?,
        ): Probability? {
          if (decimalValue != null) return Decimal(decimalValue)
          if (RangeValue != null) return Range(RangeValue)
          return null
        }
      }
    }

    public sealed interface When {
      public fun asPeriod(): Period? = this as? Period

      public fun asRange(): Range? = this as? Range

      public data class Period(public val `value`: com.google.fhir.model.r5.Period) : When

      public data class Range(public val `value`: com.google.fhir.model.r5.Range) : When

      public companion object {
        public fun from(
          PeriodValue: com.google.fhir.model.r5.Period?,
          RangeValue: com.google.fhir.model.r5.Range?,
        ): When? {
          if (PeriodValue != null) return Period(PeriodValue)
          if (RangeValue != null) return Range(RangeValue)
          return null
        }
      }
    }
  }

  public sealed interface Occurrence {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Occurrence

    public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Occurrence

    public companion object {
      public fun from(
        dateTimeValue: com.google.fhir.model.r5.DateTime?,
        PeriodValue: com.google.fhir.model.r5.Period?,
      ): Occurrence? {
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (PeriodValue != null) return Period(PeriodValue)
        return null
      }
    }
  }

  /** Codes providing the status of an observation. */
  public enum class RiskAssessmentStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The existence of the observation is registered, but there is no result yet available. */
    Registered(
      "registered",
      "http://hl7.org/fhir/observation-status",
      "Registered",
      "The existence of the observation is registered, but there is no result yet available.",
    ),
    /** This is an initial or interim observation: data may be incomplete or unverified. */
    Preliminary(
      "preliminary",
      "http://hl7.org/fhir/observation-status",
      "Preliminary",
      "This is an initial or interim observation: data may be incomplete or unverified.",
    ),
    /**
     * The observation is complete and there are no further actions needed. Additional information
     * such "released", "signed", etc. would be represented using [Provenance](provenance.html)
     * which provides not only the act but also the actors and dates and other related data. These
     * act states would be associated with an observation status of `preliminary` until they are all
     * completed and then a status of `final` would be applied.
     */
    Final(
      "final",
      "http://hl7.org/fhir/observation-status",
      "Final",
      "The observation is complete and there are no further actions needed. Additional information such \"released\", \"signed\", etc. would be represented using [Provenance](provenance.html) which provides not only the act but also the actors and dates and other related data. These act states would be associated with an observation status of `preliminary` until they are all completed and then a status of `final` would be applied.",
    ),
    /**
     * Subsequent to being Final, the observation has been modified subsequent. This includes
     * updates/new information and corrections.
     */
    Amended(
      "amended",
      "http://hl7.org/fhir/observation-status",
      "Amended",
      "Subsequent to being Final, the observation has been modified subsequent.  This includes updates/new information and corrections.",
    ),
    /**
     * Subsequent to being Final, the observation has been modified to correct an error in the test
     * result.
     */
    Corrected(
      "corrected",
      "http://hl7.org/fhir/observation-status",
      "Corrected",
      "Subsequent to being Final, the observation has been modified to correct an error in the test result.",
    ),
    /**
     * The observation is unavailable because the measurement was not started or not completed (also
     * sometimes called "aborted").
     */
    Cancelled(
      "cancelled",
      "http://hl7.org/fhir/observation-status",
      "Cancelled",
      "The observation is unavailable because the measurement was not started or not completed (also sometimes called \"aborted\").",
    ),
    /**
     * The observation has been withdrawn following previous final release. This electronic record
     * should never have existed, though it is possible that real-world decisions were based on it.
     * (If real-world activity has occurred, the status should be "cancelled" rather than
     * "entered-in-error".).
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/observation-status",
      "Entered in Error",
      "The observation has been withdrawn following previous final release.  This electronic record should never have existed, though it is possible that real-world decisions were based on it. (If real-world activity has occurred, the status should be \"cancelled\" rather than \"entered-in-error\".).",
    ),
    /**
     * The authoring/source system does not know which of the status values currently applies for
     * this observation. Note: This concept is not to be used for "other" - one of the listed
     * statuses is presumed to apply, but the authoring/source system does not know which.
     */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/observation-status",
      "Unknown",
      "The authoring/source system does not know which of the status values currently applies for this observation. Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): RiskAssessmentStatus =
        when (code) {
          "registered" -> Registered
          "preliminary" -> Preliminary
          "final" -> Final
          "amended" -> Amended
          "corrected" -> Corrected
          "cancelled" -> Cancelled
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum RiskAssessmentStatus")
        }
    }
  }
}
