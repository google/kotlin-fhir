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

import com.google.fhir.model.r5.serializers.MedicationAdministrationDosageSerializer
import com.google.fhir.model.r5.serializers.MedicationAdministrationPerformerSerializer
import com.google.fhir.model.r5.serializers.MedicationAdministrationSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes the event of a patient consuming or otherwise being administered a medication. This may
 * be as simple as swallowing a tablet or it may be a long running infusion. Related resources tie
 * this event to the authorizing prescription, and the specific encounter between patient and health
 * care practitioner. This event can also be used to record waste using a status of not-done and the
 * appropriate statusReason.
 */
@Serializable(with = MedicationAdministrationSerializer::class)
@SerialName("MedicationAdministration")
public data class MedicationAdministration(
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
  /**
   * Identifiers associated with this Medication Administration that are defined by business
   * processes and/or used to refer to it when a direct URL reference to the resource itself is not
   * appropriate. They are business identifiers assigned to this resource by the performer or other
   * systems and remain constant as the resource is updated and propagates from server to server.
   *
   * This is a business identifier, not a resource identifier.
   */
  public var identifier: List<Identifier?>? = null,
  /** A plan that is fulfilled in whole or in part by this MedicationAdministration. */
  public var basedOn: List<Reference?>? = null,
  /**
   * A larger event of which this particular event is a component or step.
   *
   * MedicationDispense will be used to indicate waste.
   */
  public var partOf: List<Reference?>? = null,
  /**
   * Will generally be set to show that the administration has been completed. For some long running
   * administrations such as infusions, it is possible for an administration to be started but not
   * completed or it may be paused while some other process is under way.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<MedicationAdministrationStatus>? = null,
  /** A code indicating why the administration was not performed. */
  public var statusReason: List<CodeableConcept?>? = null,
  /**
   * The type of medication administration (for example, drug classification like ATC, where meds
   * would be administered, legal category of the medication).
   */
  public var category: List<CodeableConcept?>? = null,
  /**
   * Identifies the medication that was administered. This is either a link to a resource
   * representing the details of the medication or a simple attribute carrying a code that
   * identifies the medication from a known list of medications.
   *
   * If only a code is specified, then it needs to be a code for a specific product. If more
   * information is required, then the use of the medication resource is recommended. For example,
   * if you require form or lot number, then you must reference the Medication resource.
   */
  public var medication: CodeableReference? = null,
  /** The person or animal or group receiving the medication. */
  public var subject: Reference? = null,
  /**
   * The visit, admission, or other contact between patient and health care provider during which
   * the medication administration was performed.
   */
  public var encounter: Reference? = null,
  /**
   * Additional information (for example, patient height and weight) that supports the
   * administration of the medication. This attribute can be used to provide documentation of
   * specific characteristics of the patient present at the time of administration. For example, if
   * the dose says "give "x" if the heartrate exceeds "y"", then the heart rate can be included
   * using this attribute.
   */
  public var supportingInformation: List<Reference?>? = null,
  /**
   * A specific date/time or interval of time during which the administration took place (or did not
   * take place). For many administrations, such as swallowing a tablet the use of dateTime is more
   * appropriate.
   */
  public var occurence: Occurence? = null,
  /**
   * The date the occurrence of the MedicationAdministration was first captured in the record -
   * potentially significantly after the occurrence of the event.
   */
  public var recorded: DateTime? = null,
  /** An indication that the full dose was not administered. */
  public var isSubPotent: Boolean? = null,
  /** The reason or reasons why the full dose was not administered. */
  public var subPotentReason: List<CodeableConcept?>? = null,
  /**
   * The performer of the medication treatment. For devices this is the device that performed the
   * administration of the medication. An IV Pump would be an example of a device that is performing
   * the administration. Both the IV Pump and the practitioner that set the rate or bolus on the
   * pump can be listed as performers.
   */
  public var performer: List<Performer>? = null,
  /** A code, Condition or observation that supports why the medication was administered. */
  public var reason: List<CodeableReference?>? = null,
  /**
   * The original request, instruction or authority to perform the administration.
   *
   * This is a reference to the MedicationRequest where the intent is either order or
   * instance-order. It should not reference MedicationRequests where the intent is any other value.
   */
  public var request: Reference? = null,
  /**
   * The device that is to be used for the administration of the medication (for example, PCA Pump).
   */
  public var device: List<CodeableReference?>? = null,
  /**
   * Extra information about the medication administration that is not conveyed by the other
   * attributes.
   */
  public var note: List<Annotation?>? = null,
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
  public var eventHistory: List<Reference?>? = null,
) : DomainResource() {
  /**
   * The performer of the medication treatment. For devices this is the device that performed the
   * administration of the medication. An IV Pump would be an example of a device that is performing
   * the administration. Both the IV Pump and the practitioner that set the rate or bolus on the
   * pump can be listed as performers.
   */
  @Serializable(with = MedicationAdministrationPerformerSerializer::class)
  public class Performer(
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
    /** Distinguishes the type of involvement of the performer in the medication administration. */
    public var function: CodeableConcept? = null,
    /** Indicates who or what performed the medication administration. */
    public var actor: CodeableReference? = null,
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
     * separately) then use the standard extension
     * [http://hl7.org/fhir/StructureDefinition/bodySite](http://hl7.org/fhir/extensions/StructureDefinition-bodySite.html).
     * May be a summary code, or a reference to a very precise definition of the location, or both.
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

      public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Rate

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Rate

      public companion object {
        public fun from(
          RatioValue: com.google.fhir.model.r5.Ratio?,
          QuantityValue: com.google.fhir.model.r5.Quantity?,
        ): Rate? {
          if (RatioValue != null) return Ratio(RatioValue)
          if (QuantityValue != null) return Quantity(QuantityValue)
          return null
        }
      }
    }
  }

  public sealed interface Occurence {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public fun asTiming(): Timing? = this as? Timing

    public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Occurence

    public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Occurence

    public data class Timing(public val `value`: com.google.fhir.model.r5.Timing) : Occurence

    public companion object {
      public fun from(
        dateTimeValue: com.google.fhir.model.r5.DateTime?,
        PeriodValue: com.google.fhir.model.r5.Period?,
        TimingValue: com.google.fhir.model.r5.Timing?,
      ): Occurence? {
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (PeriodValue != null) return Period(PeriodValue)
        if (TimingValue != null) return Timing(TimingValue)
        return null
      }
    }
  }

  /** MedicationAdministration Status Codes */
  public enum class MedicationAdministrationStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    In_Progress(
      "in-progress",
      "http://hl7.org/fhir/CodeSystem/medication-admin-status",
      "In Progress",
      null,
    ),
    Not_Done(
      "not-done",
      "http://hl7.org/fhir/CodeSystem/medication-admin-status",
      "Not Done",
      null,
    ),
    On_Hold("on-hold", "http://hl7.org/fhir/CodeSystem/medication-admin-status", "On Hold", null),
    Completed(
      "completed",
      "http://hl7.org/fhir/CodeSystem/medication-admin-status",
      "Completed",
      null,
    ),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/CodeSystem/medication-admin-status",
      "Entered in Error",
      null,
    ),
    Stopped("stopped", "http://hl7.org/fhir/CodeSystem/medication-admin-status", "Stopped", null),
    Unknown("unknown", "http://hl7.org/fhir/CodeSystem/medication-admin-status", "Unknown", null);

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

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
