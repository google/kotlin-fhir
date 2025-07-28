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

import com.google.fhir.model.r4.serializers.AppointmentParticipantSerializer
import com.google.fhir.model.r4.serializers.AppointmentSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or
 * device(s) for a specific date/time. This may result in one or more Encounter(s).
 */
@Serializable(with = AppointmentSerializer::class)
@SerialName("Appointment")
public data class Appointment(
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
   * This records identifiers associated with this appointment concern that are defined by business
   * processes and/or used to refer to it when a direct URL reference to the resource itself is not
   * appropriate (e.g. in CDA documents, or in written / printed documentation).
   */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /**
   * The overall status of the Appointment. Each of the participants has their own participation
   * status which indicates their involvement in the process, however this status indicates the
   * shared status.
   *
   * If the Appointment's status is "cancelled" then all participants are expected to have their
   * calendars released for the appointment period, and as such any Slots that were marked as BUSY
   * can be re-set to FREE.
   *
   * This element is labeled as a modifier because the status contains the code entered-in-error
   * that mark the Appointment as not currently valid.
   */
  public var status: Enumeration<AppointmentStatus>,
  /**
   * The coded reason for the appointment being cancelled. This is often used in
   * reporting/billing/futher processing to determine if further actions are required, or specific
   * fees apply.
   */
  public var cancelationReason: CodeableConcept? = null,
  /** A broad categorization of the service that is to be performed during this appointment. */
  public var serviceCategory: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * The specific service that is to be performed during this appointment.
   *
   * For a provider to provider appointment the code "FOLLOWUP" may be appropriate, as this is
   * expected to be discussing some patient that was seen in the past.
   */
  public var serviceType: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * The specialty of a practitioner that would be required to perform the service requested in this
   * appointment.
   */
  public var specialty: MutableList<CodeableConcept> = mutableListOf(),
  /** The style of appointment or patient that has been booked in the slot (not service type). */
  public var appointmentType: CodeableConcept? = null,
  /**
   * The coded reason that this appointment is being scheduled. This is more clinical than
   * administrative.
   */
  public var reasonCode: MutableList<CodeableConcept> = mutableListOf(),
  /**
   * Reason the appointment has been scheduled to take place, as specified using information from
   * another resource. When the patient arrives and the encounter begins it may be used as the
   * admission diagnosis. The indication will typically be a Condition (with other resources
   * referenced in the evidence.detail), or a Procedure.
   */
  public var reasonReference: MutableList<Reference> = mutableListOf(),
  /**
   * The priority of the appointment. Can be used to make informed decisions if needing to
   * re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as
   * lowest priority).
   *
   * Seeking implementer feedback on this property and how interoperable it is.
   *
   * Using an extension to record a CodeableConcept for named values may be tested at a future
   * connectathon.
   */
  public var priority: UnsignedInt? = null,
  /**
   * The brief description of the appointment as would be shown on a subject line in a meeting
   * request, or appointment list. Detailed or expanded information should be put in the comment
   * field.
   */
  public var description: String? = null,
  /** Additional information to support the appointment provided when making the appointment. */
  public var supportingInformation: MutableList<Reference> = mutableListOf(),
  /** Date/Time that the appointment is to take place. */
  public var start: Instant? = null,
  /** Date/Time that the appointment is to conclude. */
  public var end: Instant? = null,
  /**
   * Number of minutes that the appointment is to take. This can be less than the duration between
   * the start and end times. For example, where the actual time of appointment is only an estimate
   * or if a 30 minute appointment is being requested, but any time would work. Also, if there is,
   * for example, a planned 15 minute break in the middle of a long appointment, the duration may be
   * 15 minutes less than the difference between the start and end.
   */
  public var minutesDuration: PositiveInt? = null,
  /** The slots from the participants' schedules that will be filled by the appointment. */
  public var slot: MutableList<Reference> = mutableListOf(),
  /**
   * The date that this appointment was initially created. This could be different to the
   * meta.lastModified value on the initial entry, as this could have been before the resource was
   * created on the FHIR server, and should remain unchanged over the lifespan of the appointment.
   *
   * This property is required for many use cases where the age of an appointment is considered in
   * processing workflows for scheduling and billing of appointments.
   */
  public var created: DateTime? = null,
  /**
   * Additional comments about the appointment.
   *
   * Additional text to aid in facilitating the appointment. For instance, a comment might be,
   * "patient should proceed immediately to infusion room upon arrival"
   *
   * Where this is a planned appointment and the start/end dates are not set then this field can be
   * used to provide additional guidance on the details of the appointment request, including any
   * restrictions on when to book it.
   */
  public var comment: String? = null,
  /**
   * While Appointment.comment contains information for internal use,
   * Appointment.patientInstructions is used to capture patient facing information about the
   * Appointment (e.g. please bring your referral or fast from 8pm night before).
   */
  public var patientInstruction: String? = null,
  /**
   * The service request this appointment is allocated to assess (e.g. incoming referral or
   * procedure request).
   */
  public var basedOn: MutableList<Reference> = mutableListOf(),
  /** List of participants involved in the appointment. */
  public var participant: MutableList<Participant> = mutableListOf(),
  /**
   * A set of date ranges (potentially including times) that the appointment is preferred to be
   * scheduled within.
   *
   * The duration (usually in minutes) could also be provided to indicate the length of the
   * appointment to fill and populate the start/end times for the actual allocated time. However, in
   * other situations the duration may be calculated by the scheduling system.
   *
   * This does not introduce a capacity for recurring appointments.
   */
  public var requestedPeriod: MutableList<Period> = mutableListOf(),
) : DomainResource() {
  /** List of participants involved in the appointment. */
  @Serializable(with = AppointmentParticipantSerializer::class)
  public class Participant(
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
     * Role of participant in the appointment.
     *
     * The role of the participant can be used to declare what the actor will be doing in the scope
     * of this appointment.
     *
     * If the actor is not specified, then it is expected that the actor will be filled in at a
     * later stage of planning.
     *
     * This value SHALL be the same when creating an AppointmentResponse so that they can be
     * matched, and subsequently update the Appointment.
     */
    public var type: MutableList<CodeableConcept> = mutableListOf(),
    /** A Person, Location/HealthcareService or Device that is participating in the appointment. */
    public var actor: Reference? = null,
    /**
     * Whether this participant is required to be present at the meeting. This covers a use-case
     * where two doctors need to meet to discuss the results for a specific patient, and the patient
     * is not required to be present.
     */
    public var required: Enumeration<ParticipantRequired>? = null,
    /** Participation status of the actor. */
    public var status: Enumeration<ParticipationStatus>,
    /** Participation period of the actor. */
    public var period: Period? = null,
  ) : BackboneElement()

  /** Is the Participant required to attend the appointment. */
  public enum class ParticipantRequired(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Required("required", "http://hl7.org/fhir/participantrequired", "Required"),
    Optional("optional", "http://hl7.org/fhir/participantrequired", "Optional"),
    Information_Only(
      "information-only",
      "http://hl7.org/fhir/participantrequired",
      "Information Only",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): ParticipantRequired =
        when (code) {
          "required" -> Required
          "optional" -> Optional
          "information-only" -> Information_Only
          else -> throw IllegalArgumentException("Unknown code $code for enum ParticipantRequired")
        }
    }
  }

  /** The Participation status of an appointment. */
  public enum class ParticipationStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Accepted("accepted", "http://hl7.org/fhir/participationstatus", "Accepted"),
    Declined("declined", "http://hl7.org/fhir/participationstatus", "Declined"),
    Tentative("tentative", "http://hl7.org/fhir/participationstatus", "Tentative"),
    Needs_Action("needs-action", "http://hl7.org/fhir/participationstatus", "Needs Action");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): ParticipationStatus =
        when (code) {
          "accepted" -> Accepted
          "declined" -> Declined
          "tentative" -> Tentative
          "needs-action" -> Needs_Action
          else -> throw IllegalArgumentException("Unknown code $code for enum ParticipationStatus")
        }
    }
  }

  /** The free/busy status of an appointment. */
  public enum class AppointmentStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Proposed("proposed", "http://hl7.org/fhir/appointmentstatus", "Proposed"),
    Pending("pending", "http://hl7.org/fhir/appointmentstatus", "Pending"),
    Booked("booked", "http://hl7.org/fhir/appointmentstatus", "Booked"),
    Arrived("arrived", "http://hl7.org/fhir/appointmentstatus", "Arrived"),
    Fulfilled("fulfilled", "http://hl7.org/fhir/appointmentstatus", "Fulfilled"),
    Cancelled("cancelled", "http://hl7.org/fhir/appointmentstatus", "Cancelled"),
    Noshow("noshow", "http://hl7.org/fhir/appointmentstatus", "No Show"),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/appointmentstatus",
      "Entered in error",
    ),
    Checked_In("checked-in", "http://hl7.org/fhir/appointmentstatus", "Checked In"),
    Waitlist("waitlist", "http://hl7.org/fhir/appointmentstatus", "Waitlisted");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): AppointmentStatus =
        when (code) {
          "proposed" -> Proposed
          "pending" -> Pending
          "booked" -> Booked
          "arrived" -> Arrived
          "fulfilled" -> Fulfilled
          "cancelled" -> Cancelled
          "noshow" -> Noshow
          "entered-in-error" -> Entered_In_Error
          "checked-in" -> Checked_In
          "waitlist" -> Waitlist
          else -> throw IllegalArgumentException("Unknown code $code for enum AppointmentStatus")
        }
    }
  }
}
