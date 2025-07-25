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

import com.google.fhir.model.r5.serializers.ClinicalImpressionFindingSerializer
import com.google.fhir.model.r5.serializers.ClinicalImpressionSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient
 * and before planning the treatments or management strategies that are best to manage a patient's
 * condition. Assessments are often 1:1 with a clinical consultation / encounter, but this varies
 * greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather
 * than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar
 * score.
 */
@Serializable(with = ClinicalImpressionSerializer::class)
@SerialName("ClinicalImpression")
public data class ClinicalImpression(
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
   * Business identifiers assigned to this clinical impression by the performer or other systems
   * which remain constant as the resource is updated and propagates from server to server.
   *
   * This is a business identifier, not a resource identifier (see
   * [discussion](resource.html#identifiers)). It is best practice for the identifier to only appear
   * on a single resource instance, however business practices may occasionally dictate that
   * multiple resource instances with the same identifier can exist - possibly even with different
   * resource types. For example, multiple Patient and a Person resource instance might share the
   * same social insurance number.
   */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /**
   * Identifies the workflow status of the assessment.
   *
   * This element is labeled as a modifier because the status contains the code entered-in-error
   * that marks the clinical impression as not currently valid.
   */
  public var status: Enumeration<ClinicalImpressionStatus>,
  /**
   * Captures the reason for the current state of the ClinicalImpression.
   *
   * This is generally only used for "exception" statuses such as "not-done", "on-hold" or
   * "stopped".
   */
  public var statusReason: CodeableConcept? = null,
  /**
   * A summary of the context and/or cause of the assessment - why / where it was performed, and
   * what patient events/status prompted it.
   */
  public var description: String? = null,
  /** The patient or group of individuals assessed as part of this record. */
  public var subject: Reference,
  /**
   * The Encounter during which this ClinicalImpression was created or to which the creation of this
   * record is tightly associated.
   *
   * This will typically be the encounter the event occurred within, but some activities may be
   * initiated prior to or after the official completion of an encounter but still be tied to the
   * context of the encounter.
   */
  public var encounter: Reference? = null,
  /**
   * The point in time or period over which the subject was assessed.
   *
   * This SHOULD be accurate to at least the minute, though some assessments only have a known date.
   */
  public var effective: Effective? = null,
  /** Indicates when the documentation of the assessment was complete. */
  public var date: DateTime? = null,
  /** The clinician performing the assessment. */
  public var performer: Reference? = null,
  /**
   * A reference to the last assessment that was conducted on this patient. Assessments are
   * often/usually ongoing in nature; a care provider (practitioner or team) will make new
   * assessments on an ongoing basis as new data arises or the patient's conditions changes.
   *
   * It is always likely that multiple previous assessments exist for a patient. The point of
   * quoting a previous assessment is that this assessment is relative to it (see resolved).
   */
  public var previous: Reference? = null,
  /**
   * A list of the relevant problems/conditions for a patient.
   *
   * e.g. The patient is a pregnant, has congestive heart failure, has an ‎Adenocarcinoma, and is
   * allergic to penicillin.
   */
  public var problem: MutableList<Reference> = mutableListOf(),
  /**
   * Change in the status/pattern of a subject's condition since previously assessed, such as
   * worsening, improving, or no change. It is a subjective assessment of the direction of the
   * change.
   */
  public var changePattern: CodeableConcept? = null,
  /**
   * Reference to a specific published clinical protocol that was followed during this assessment,
   * and/or that provides evidence in support of the diagnosis.
   */
  public var protocol: MutableList<Uri> = mutableListOf(),
  /** A text summary of the investigations and the diagnosis. */
  public var summary: String? = null,
  /**
   * Specific findings or diagnoses that were considered likely or relevant to ongoing treatment.
   */
  public var finding: MutableList<Finding> = mutableListOf(),
  /** Estimate of likely outcome. */
  public var prognosisCodeableConcept: MutableList<CodeableConcept> = mutableListOf(),
  /** RiskAssessment expressing likely outcome. */
  public var prognosisReference: MutableList<Reference> = mutableListOf(),
  /** Information supporting the clinical impression, which can contain investigation results. */
  public var supportingInfo: MutableList<Reference> = mutableListOf(),
  /**
   * Commentary about the impression, typically recorded after the impression itself was made,
   * though supplemental notes by the original author could also appear.
   *
   * Don't use this element for content that should more properly appear as one of the specific
   * elements of the impression.
   */
  public var note: MutableList<Annotation> = mutableListOf(),
) : DomainResource() {
  /**
   * Specific findings or diagnoses that were considered likely or relevant to ongoing treatment.
   */
  @Serializable(with = ClinicalImpressionFindingSerializer::class)
  public class Finding(
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
     * Specific text, code or reference for finding or diagnosis, which may include ruled-out or
     * resolved conditions.
     */
    public var item: CodeableReference? = null,
    /** Which investigations support finding or diagnosis. */
    public var basis: String? = null,
  ) : BackboneElement()

  public sealed interface Effective {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Effective

    public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Effective

    public companion object {
      internal fun from(
        dateTimeValue: com.google.fhir.model.r5.DateTime?,
        periodValue: com.google.fhir.model.r5.Period?,
      ): Effective? {
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (periodValue != null) return Period(periodValue)
        return null
      }
    }
  }

  /** Codes identifying the lifecycle stage of an event. */
  public enum class ClinicalImpressionStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Preparation("preparation", "http://hl7.org/fhir/event-status", "Preparation"),
    In_Progress("in-progress", "http://hl7.org/fhir/event-status", "In Progress"),
    Not_Done("not-done", "http://hl7.org/fhir/event-status", "Not Done"),
    On_Hold("on-hold", "http://hl7.org/fhir/event-status", "On Hold"),
    Stopped("stopped", "http://hl7.org/fhir/event-status", "Stopped"),
    Completed("completed", "http://hl7.org/fhir/event-status", "Completed"),
    Entered_In_Error("entered-in-error", "http://hl7.org/fhir/event-status", "Entered in Error"),
    Unknown("unknown", "http://hl7.org/fhir/event-status", "Unknown");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): ClinicalImpressionStatus =
        when (code) {
          "preparation" -> Preparation
          "in-progress" -> In_Progress
          "not-done" -> Not_Done
          "on-hold" -> On_Hold
          "stopped" -> Stopped
          "completed" -> Completed
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ClinicalImpressionStatus")
        }
    }
  }
}
