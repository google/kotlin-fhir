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

import com.google.fhir.model.r4.serializers.ImmunizationEvaluationSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes a comparison of an immunization event against published recommendations to determine if
 * the administration is "valid" in relation to those recommendations.
 */
@Serializable(with = ImmunizationEvaluationSerializer::class)
@SerialName("ImmunizationEvaluation")
public data class ImmunizationEvaluation(
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
  /** A unique identifier assigned to this immunization evaluation record. */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /** Indicates the current status of the evaluation of the vaccination administration event. */
  public var status: Enumeration<ImmunizationEvaluationStatus>,
  /** The individual for whom the evaluation is being done. */
  public var patient: Reference,
  /** The date the evaluation of the vaccine administration event was performed. */
  public var date: DateTime? = null,
  /** Indicates the authority who published the protocol (e.g. ACIP). */
  public var authority: Reference? = null,
  /** The vaccine preventable disease the dose is being evaluated against. */
  public var targetDisease: CodeableConcept,
  /** The vaccine administration event being evaluated. */
  public var immunizationEvent: Reference,
  /** Indicates if the dose is valid or not valid with respect to the published recommendations. */
  public var doseStatus: CodeableConcept,
  /**
   * Provides an explanation as to why the vaccine administration event is valid or not relative to
   * the published recommendations.
   */
  public var doseStatusReason: MutableList<CodeableConcept> = mutableListOf(),
  /** Additional information about the evaluation. */
  public var description: String? = null,
  /**
   * One possible path to achieve presumed immunity against a disease - within the context of an
   * authority.
   */
  public var series: String? = null,
  /**
   * Nominal position in a series.
   *
   * The use of an integer is preferred if known. A string should only be used in cases where an
   * integer is not available (such as when documenting a recurring booster dose).
   */
  public var doseNumber: DoseNumber? = null,
  /**
   * The recommended number of doses to achieve immunity.
   *
   * The use of an integer is preferred if known. A string should only be used in cases where an
   * integer is not available (such as when documenting a recurring booster dose).
   */
  public var seriesDoses: SeriesDoses? = null,
) : DomainResource() {
  public sealed interface DoseNumber {
    public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

    public fun asString(): String? = this as? String

    public data class PositiveInt(public val `value`: com.google.fhir.model.r4.PositiveInt) :
      DoseNumber

    public data class String(public val `value`: com.google.fhir.model.r4.String) : DoseNumber

    public companion object {
      internal fun from(
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
      internal fun from(
        positiveIntValue: com.google.fhir.model.r4.PositiveInt?,
        stringValue: com.google.fhir.model.r4.String?,
      ): SeriesDoses? {
        if (positiveIntValue != null) return PositiveInt(positiveIntValue)
        if (stringValue != null) return String(stringValue)
        return null
      }
    }
  }

  /**
   * The value set to instantiate this attribute should be drawn from a terminologically robust code
   * system that consists of or contains concepts to support describing the current status of the
   * evaluation for vaccine administration event.
   */
  public enum class ImmunizationEvaluationStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Completed(
      "completed",
      "http://terminology.hl7.org/CodeSystem/medication-admin-status",
      "Completed",
    ),
    Entered_In_Error(
      "entered-in-error",
      "http://terminology.hl7.org/CodeSystem/medication-admin-status",
      "Entered in Error",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): ImmunizationEvaluationStatus =
        when (code) {
          "completed" -> Completed
          "entered-in-error" -> Entered_In_Error
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum ImmunizationEvaluationStatus"
            )
        }
    }
  }
}
