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

import com.google.fhir.model.r4b.serializers.MedicationAdministrationDosageSerializer
import com.google.fhir.model.r4b.serializers.MedicationAdministrationPerformerSerializer
import com.google.fhir.model.r4b.serializers.MedicationAdministrationSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes the event of a patient consuming or otherwise being administered a medication. This may
 * be as simple as swallowing a tablet or it may be a long running infusion. Related resources tie
 * this event to the authorizing prescription, and the specific encounter between patient and health
 * care practitioner.
 */
@Serializable(with = MedicationAdministrationSerializer::class)
@SerialName("MedicationAdministration")
public data class MedicationAdministration(
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
   * Identifiers associated with this Medication Administration that are defined by business
   * processes and/or used to refer to it when a direct URL reference to the resource itself is not
   * appropriate. They are business identifiers assigned to this resource by the performer or other
   * systems and remain constant as the resource is updated and propagates from server to server.
   *
   * This is a business identifier, not a resource identifier.
   */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /**
   * A protocol, guideline, orderset, or other definition that was adhered to in whole or in part by
   * this event.
   */
  public var instantiates: MutableList<Uri> = mutableListOf(),
  /** A larger event of which this particular event is a component or step. */
  public var partOf: MutableList<Reference> = mutableListOf(),
  /**
   * Will generally be set to show that the administration has been completed. For some long running
   * administrations such as infusions, it is possible for an administration to be started but not
   * completed or it may be paused while some other process is under way.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<MedicationAdministrationStatus>,
  /** A code indicating why the administration was not performed. */
  public var statusReason: MutableList<CodeableConcept> = mutableListOf(),
  /** Indicates where the medication is expected to be consumed or administered. */
  public var category: CodeableConcept? = null,
  /**
   * Identifies the medication that was administered. This is either a link to a resource
   * representing the details of the medication or a simple attribute carrying a code that
   * identifies the medication from a known list of medications.
   *
   * If only a code is specified, then it needs to be a code for a specific product. If more
   * information is required, then the use of the medication resource is recommended. For example,
   * if you require form or lot number, then you must reference the Medication resource.
   */
  public var medication: Medication,
  /** The person or animal or group receiving the medication. */
  public var subject: Reference,
  /**
   * The visit, admission, or other contact between patient and health care provider during which
   * the medication administration was performed.
   */
  public var context: Reference? = null,
  /**
   * Additional information (for example, patient height and weight) that supports the
   * administration of the medication.
   */
  public var supportingInformation: MutableList<Reference> = mutableListOf(),
  /**
   * A specific date/time or interval of time during which the administration took place (or did not
   * take place, when the 'notGiven' attribute is true). For many administrations, such as
   * swallowing a tablet the use of dateTime is more appropriate.
   */
  public var effective: Effective,
  /** Indicates who or what performed the medication administration and how they were involved. */
  public var performer: MutableList<Performer> = mutableListOf(),
  /** A code indicating why the medication was given. */
  public var reasonCode: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * Condition or observation that supports why the medication was administered.
   *
   * This is a reference to a condition that is the reason for the medication request. If only a
   * code exists, use reasonCode.
   */
  public var reasonReference: MutableList<Reference> = mutableListOf(),
  /**
   * The original request, instruction or authority to perform the administration.
   *
   * This is a reference to the MedicationRequest where the intent is either order or
   * instance-order. It should not reference MedicationRequests where the intent is any other value.
   */
  public var request: Reference? = null,
  /**
   * The device used in administering the medication to the patient. For example, a particular
   * infusion pump.
   */
  public var device: MutableList<Reference> = mutableListOf(),
  /**
   * Extra information about the medication administration that is not conveyed by the other
   * attributes.
   */
  public var note: MutableList<Annotation> = mutableListOf(),
  /** Describes the medication dosage information details e.g. dose, rate, site, route, etc. */
  public var dosage: Dosage? = null,
  /**
   * A summary of the events of interest that have occurred, such as when the administration was
   * verified.
   *
   * This might not include provenances for all versions of the request – only those deemed
   * “relevant” or important. This SHALL NOT include the Provenance associated with this current
   * version of the resource. (If that provenance is deemed to be a “relevant” change, it will need
   * to be added as part of a later update. Until then, it can be queried directly as the Provenance
   * that points to this version using _revinclude All Provenances should have some historical
   * version of this Request as their subject.
   */
  public var eventHistory: MutableList<Reference> = mutableListOf(),
) : DomainResource() {
  /** Indicates who or what performed the medication administration and how they were involved. */
  @Serializable(with = MedicationAdministrationPerformerSerializer::class)
  public class Performer(
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
    /** Distinguishes the type of involvement of the performer in the medication administration. */
    public var function: CodeableConcept? = null,
    /** Indicates who or what performed the medication administration. */
    public var actor: Reference,
  ) : BackboneElement()

  /** Describes the medication dosage information details e.g. dose, rate, site, route, etc. */
  @Serializable(with = MedicationAdministrationDosageSerializer::class)
  public class Dosage(
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
     * Free text dosage can be used for cases where the dosage administered is too complex to code.
     * When coded dosage is present, the free text dosage may still be present for display to
     * humans.
     *
     * The dosage instructions should reflect the dosage of the medication that was administered.
     */
    public var text: String? = null,
    /**
     * A coded specification of the anatomic site where the medication first entered the body. For
     * example, "left arm".
     *
     * If the use case requires attributes from the BodySite resource (e.g. to identify and track
     * separately) then use the standard extension [bodySite](extension-bodysite.html). May be a
     * summary code, or a reference to a very precise definition of the location, or both.
     */
    public var site: CodeableConcept? = null,
    /**
     * A code specifying the route or physiological path of administration of a therapeutic agent
     * into or onto the patient. For example, topical, intravenous, etc.
     */
    public var route: CodeableConcept? = null,
    /**
     * A coded value indicating the method by which the medication is intended to be or was
     * introduced into or on the body. This attribute will most often NOT be populated. It is most
     * commonly used for injections. For example, Slow Push, Deep IV.
     *
     * One of the reasons this attribute is not used often, is that the method is often
     * pre-coordinated with the route and/or form of administration. This means the codes used in
     * route or form may pre-coordinate the method in the route code or the form code. The
     * implementation decision about what coding system to use for route or form code will determine
     * how frequently the method code will be populated e.g. if route or form code pre-coordinate
     * method code, then this attribute will not be populated often; if there is no pre-coordination
     * then method code may be used frequently.
     */
    public var method: CodeableConcept? = null,
    /**
     * The amount of the medication given at one administration event. Use this value when the
     * administration is essentially an instantaneous event such as a swallowing a tablet or giving
     * an injection.
     *
     * If the administration is not instantaneous (rate is present), this can be specified to convey
     * the total amount administered over period of time of a single administration.
     */
    public var dose: Quantity? = null,
    /**
     * Identifies the speed with which the medication was or will be introduced into the patient.
     * Typically, the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr. May also be
     * expressed as a rate per unit of time, e.g. 500 ml per 2 hours. Other examples: 200 mcg/min or
     * 200 mcg/1 minute; 1 liter/8 hours.
     *
     * If the rate changes over time, and you want to capture this in MedicationAdministration, then
     * each change should be captured as a distinct MedicationAdministration, with a specific
     * MedicationAdministration.dosage.rate, and the date time when the rate change occurred.
     * Typically, the MedicationAdministration.dosage.rate element is not used to convey an average
     * rate.
     */
    public var rate: Rate? = null,
  ) : BackboneElement() {
    public sealed interface Rate {
      public fun asRatio(): Ratio? = this as? Ratio

      public fun asQuantity(): Quantity? = this as? Quantity

      public data class Ratio(public val `value`: com.google.fhir.model.r4b.Ratio) : Rate

      public data class Quantity(public val `value`: com.google.fhir.model.r4b.Quantity) : Rate

      public companion object {
        internal fun from(
          ratioValue: com.google.fhir.model.r4b.Ratio?,
          quantityValue: com.google.fhir.model.r4b.Quantity?,
        ): Rate? {
          if (ratioValue != null) return Ratio(ratioValue)
          if (quantityValue != null) return Quantity(quantityValue)
          return null
        }
      }
    }
  }

  public sealed interface Medication {
    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public fun asReference(): Reference? = this as? Reference

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r4b.CodeableConcept
    ) : Medication

    public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
      Medication

    public companion object {
      internal fun from(
        codeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
        referenceValue: com.google.fhir.model.r4b.Reference?,
      ): Medication? {
        if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
        if (referenceValue != null) return Reference(referenceValue)
        return null
      }
    }
  }

  public sealed interface Effective {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) : Effective

    public data class Period(public val `value`: com.google.fhir.model.r4b.Period) : Effective

    public companion object {
      internal fun from(
        dateTimeValue: com.google.fhir.model.r4b.DateTime?,
        periodValue: com.google.fhir.model.r4b.Period?,
      ): Effective? {
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (periodValue != null) return Period(periodValue)
        return null
      }
    }
  }

  /** MedicationAdministration Status Codes */
  public enum class MedicationAdministrationStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    In_Progress(
      "in-progress",
      "http://terminology.hl7.org/CodeSystem/medication-admin-status",
      "In Progress",
    ),
    Not_Done(
      "not-done",
      "http://terminology.hl7.org/CodeSystem/medication-admin-status",
      "Not Done",
    ),
    On_Hold("on-hold", "http://terminology.hl7.org/CodeSystem/medication-admin-status", "On Hold"),
    Completed(
      "completed",
      "http://terminology.hl7.org/CodeSystem/medication-admin-status",
      "Completed",
    ),
    Entered_In_Error(
      "entered-in-error",
      "http://terminology.hl7.org/CodeSystem/medication-admin-status",
      "Entered in Error",
    ),
    Stopped("stopped", "http://terminology.hl7.org/CodeSystem/medication-admin-status", "Stopped"),
    Unknown("unknown", "http://terminology.hl7.org/CodeSystem/medication-admin-status", "Unknown");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): MedicationAdministrationStatus =
        when (code) {
          "in-progress" -> In_Progress
          "not-done" -> Not_Done
          "on-hold" -> On_Hold
          "completed" -> Completed
          "entered-in-error" -> Entered_In_Error
          "stopped" -> Stopped
          "unknown" -> Unknown
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum MedicationAdministrationStatus"
            )
        }
    }
  }
}
