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

package com.google.fhir.model.r4

import com.google.fhir.model.r4.serializers.ImmunizationRecommendationRecommendationDateCriterionSerializer
import com.google.fhir.model.r4.serializers.ImmunizationRecommendationRecommendationSerializer
import com.google.fhir.model.r4.serializers.ImmunizationRecommendationSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published
 * schedule with optional supporting justification.
 */
@Serializable(with = ImmunizationRecommendationSerializer::class)
@SerialName("ImmunizationRecommendation")
public data class ImmunizationRecommendation(
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
  /** A unique identifier assigned to this particular recommendation record. */
  public var identifier: List<Identifier?>? = null,
  /** The patient the recommendation(s) are for. */
  public var patient: Reference? = null,
  /** The date the immunization recommendation(s) were created. */
  public var date: DateTime? = null,
  /** Indicates the authority who published the protocol (e.g. ACIP). */
  public var authority: Reference? = null,
  /** Vaccine administration recommendations. */
  public var recommendation: List<Recommendation>? = null,
) : DomainResource() {
  /** Vaccine administration recommendations. */
  @Serializable(with = ImmunizationRecommendationRecommendationSerializer::class)
  public class Recommendation(
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
    /** Vaccine(s) or vaccine group that pertain to the recommendation. */
    public var vaccineCode: List<CodeableConcept?>? = null,
    /** The targeted disease for the recommendation. */
    public var targetDisease: CodeableConcept? = null,
    /** Vaccine(s) which should not be used to fulfill the recommendation. */
    public var contraindicatedVaccineCode: List<CodeableConcept?>? = null,
    /** Indicates the patient status with respect to the path to immunity for the target disease. */
    public var forecastStatus: CodeableConcept? = null,
    /** The reason for the assigned forecast status. */
    public var forecastReason: List<CodeableConcept?>? = null,
    /**
     * Vaccine date recommendations. For example, earliest date to administer, latest date to
     * administer, etc.
     */
    public var dateCriterion: List<DateCriterion>? = null,
    /** Contains the description about the protocol under which the vaccine was administered. */
    public var description: String? = null,
    /**
     * One possible path to achieve presumed immunity against a disease - within the context of an
     * authority.
     */
    public var series: String? = null,
    /**
     * Nominal position of the recommended dose in a series (e.g. dose 2 is the next recommended
     * dose).
     *
     * The use of an integer is prefered if known. A string should only be used in cases where an
     * interger is not available (such as when documenting a recurring booster dose).
     */
    public var doseNumber: DoseNumber? = null,
    /**
     * The recommended number of doses to achieve immunity.
     *
     * The use of an integer is prefered if known. A string should only be used in cases where an
     * interger is not available (such as when documenting a recurring booster dose).
     */
    public var seriesDoses: SeriesDoses? = null,
    /** Immunization event history and/or evaluation that supports the status and recommendation. */
    public var supportingImmunization: List<Reference?>? = null,
    /**
     * Patient Information that supports the status and recommendation. This includes patient
     * observations, adverse reactions and allergy/intolerance information.
     */
    public var supportingPatientInformation: List<Reference?>? = null,
  ) : BackboneElement() {
    /**
     * Vaccine date recommendations. For example, earliest date to administer, latest date to
     * administer, etc.
     */
    @Serializable(with = ImmunizationRecommendationRecommendationDateCriterionSerializer::class)
    public class DateCriterion(
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
      /**
       * Date classification of recommendation. For example, earliest date to give, latest date to
       * give, etc.
       */
      public var code: CodeableConcept? = null,
      /** The date whose meaning is specified by dateCriterion.code. */
      public var `value`: DateTime? = null,
    ) : BackboneElement()

    public sealed interface DoseNumber {
      public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

      public fun asString(): String? = this as? String

      public data class PositiveInt(public val `value`: com.google.fhir.model.r4.PositiveInt) :
        DoseNumber

      public data class String(public val `value`: com.google.fhir.model.r4.String) : DoseNumber

      public companion object {
        public fun from(
          positiveIntValue: com.google.fhir.model.r4.PositiveInt?,
          stringValue: com.google.fhir.model.r4.String?,
        ): DoseNumber? {
          if (positiveIntValue != null) return PositiveInt(positiveIntValue)
          if (stringValue != null) return String(stringValue)
          return null
        }
      }
    }

    public sealed interface SeriesDoses {
      public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

      public fun asString(): String? = this as? String

      public data class PositiveInt(public val `value`: com.google.fhir.model.r4.PositiveInt) :
        SeriesDoses

      public data class String(public val `value`: com.google.fhir.model.r4.String) : SeriesDoses

      public companion object {
        public fun from(
          positiveIntValue: com.google.fhir.model.r4.PositiveInt?,
          stringValue: com.google.fhir.model.r4.String?,
        ): SeriesDoses? {
          if (positiveIntValue != null) return PositiveInt(positiveIntValue)
          if (stringValue != null) return String(stringValue)
          return null
        }
      }
    }
  }
}
