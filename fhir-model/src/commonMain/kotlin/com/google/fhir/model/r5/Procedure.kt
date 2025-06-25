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

import com.google.fhir.model.r5.serializers.ProcedureFocalDeviceSerializer
import com.google.fhir.model.r5.serializers.ProcedurePerformerSerializer
import com.google.fhir.model.r5.serializers.ProcedureSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An action that is or was performed on or for a patient, practitioner, device, organization, or
 * location. For example, this can be a physical intervention on a patient like an operation, or
 * less invasive like long term services, counseling, or hypnotherapy. This can be a quality or
 * safety inspection for a location, organization, or device. This can be an accreditation procedure
 * on a practitioner for licensing.
 */
@Serializable(with = ProcedureSerializer::class)
@SerialName("Procedure")
public data class Procedure(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * Within the context of the FHIR RESTful interactions, the resource has an id except for cases
   * like the create and conditional update. Otherwise, the use of the resouce id depends on the
   * given use case.
   */
  override var id: String? = null,
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
   * Business identifiers assigned to this procedure by the performer or other systems which remain
   * constant as the resource is updated and is propagated from server to server.
   *
   * This is a business identifier, not a resource identifier (see
   * [discussion](resource.html#identifiers)). It is best practice for the identifier to only appear
   * on a single resource instance, however business practices may occasionally dictate that
   * multiple resource instances with the same identifier can exist - possibly even with different
   * resource types. For example, multiple Patient and Person resource instances might share the
   * same social insurance number.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The URL pointing to a FHIR-defined protocol, guideline, order set or other definition that is
   * adhered to in whole or in part by this Procedure.
   */
  public var instantiatesCanonical: List<Canonical?>? = null,
  /**
   * The URL pointing to an externally maintained protocol, guideline, order set or other definition
   * that is adhered to in whole or in part by this Procedure.
   *
   * This might be an HTML page, PDF, etc. or could just be a non-resolvable URI identifier.
   */
  public var instantiatesUri: List<Uri?>? = null,
  /** A reference to a resource that contains details of the request for this procedure. */
  public var basedOn: List<Reference?>? = null,
  /**
   * A larger event of which this particular procedure is a component or step.
   *
   * The MedicationAdministration resource has a partOf reference to Procedure, but this is not a
   * circular reference. For example, the anesthesia MedicationAdministration is part of the
   * surgical Procedure (MedicationAdministration.partOf = Procedure). For example, the procedure to
   * insert the IV port for an IV medication administration is part of the medication administration
   * (Procedure.partOf = MedicationAdministration).
   */
  public var partOf: List<Reference?>? = null,
  /**
   * A code specifying the state of the procedure. Generally, this will be the in-progress or
   * completed state.
   *
   * The "unknown" code is not to be used to convey other statuses. The "unknown" code should be
   * used when one of the statuses applies, but the authoring system doesn't know the current state
   * of the procedure.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<ProcedureStatus>? = null,
  /**
   * Captures the reason for the current state of the procedure.
   *
   * This is generally only used for "exception" statuses such as "not-done", "suspended" or
   * "aborted". The reason for performing the event at all is captured in reasonCode, not here.
   */
  public var statusReason: CodeableConcept? = null,
  /**
   * A code that classifies the procedure for searching, sorting and display purposes (e.g.
   * "Surgical Procedure").
   */
  public var category: List<CodeableConcept?>? = null,
  /**
   * The specific procedure that is performed. Use text if the exact nature of the procedure cannot
   * be coded (e.g. "Laparoscopic Appendectomy").
   */
  public var code: CodeableConcept? = null,
  /**
   * On whom or on what the procedure was performed. This is usually an individual human, but can
   * also be performed on animals, groups of humans or animals, organizations or practitioners (for
   * licensing), locations or devices (for safety inspections or regulatory authorizations). If the
   * actual focus of the procedure is different from the subject, the focus element specifies the
   * actual focus of the procedure.
   */
  public var subject: Reference? = null,
  /**
   * Who is the target of the procedure when it is not the subject of record only. If focus is not
   * present, then subject is the focus. If focus is present and the subject is one of the targets
   * of the procedure, include subject as a focus as well. If focus is present and the subject is
   * not included in focus, it implies that the procedure was only targeted on the focus. For
   * example, when a caregiver is given education for a patient, the caregiver would be the focus
   * and the procedure record is associated with the subject (e.g. patient). For example, use focus
   * when recording the target of the education, training, or counseling is the parent or relative
   * of a patient.
   */
  public var focus: Reference? = null,
  /**
   * The Encounter during which this Procedure was created or performed or to which the creation of
   * this record is tightly associated.
   *
   * This will typically be the encounter the event occurred within, but some activities may be
   * initiated prior to or after the official completion of an encounter but still be tied to the
   * context of the encounter.
   */
  public var encounter: Reference? = null,
  /**
   * Estimated or actual date, date-time, period, or age when the procedure did occur or is
   * occurring. Allows a period to support complex procedures that span more than one date, and also
   * allows for the length of the procedure to be captured.
   *
   * This indicates when the procedure actually occurred or is occurring, not when it was
   * asked/requested/ordered to occur. For the latter, look at the occurence element of the Request
   * this Procedure is "basedOn". The status code allows differentiation of whether the timing
   * reflects a historic event or an ongoing event. Ongoing events should not include an upper bound
   * in the Period or Timing.bounds.
   *
   * Age is generally used when the patient reports an age at which the procedure was performed.
   * Range is generally used when the patient reports an age range when the procedure was performed,
   * such as sometime between 20-25 years old. dateTime supports a range of precision due to some
   * procedures being reported as past procedures that might not have millisecond precision while
   * other procedures performed and documented during the encounter might have more precise UTC
   * timestamps with timezone.
   */
  public var occurrence: Occurrence? = null,
  /**
   * The date the occurrence of the procedure was first captured in the record regardless of
   * Procedure.status (potentially after the occurrence of the event).
   */
  public var recorded: DateTime? = null,
  /** Individual who recorded the record and takes responsibility for its content. */
  public var recorder: Reference? = null,
  /**
   * Indicates if this record was captured as a secondary 'reported' record rather than as an
   * original primary source-of-truth record. It may also indicate the source of the report.
   */
  public var reported: Reported? = null,
  /** Indicates who or what performed the procedure and how they were involved. */
  public var performer: List<Performer>? = null,
  /**
   * The location where the procedure actually happened. E.g. a newborn at home, a tracheostomy at a
   * restaurant.
   */
  public var location: Reference? = null,
  /**
   * The coded reason or reference why the procedure was performed. This may be a coded entity of
   * some type, be present as text, or be a reference to one of several resources that justify the
   * procedure.
   *
   * Use Procedure.reason.concept when a code sufficiently describes the reason. Use
   * Procedure.reason.reference when referencing a resource, which allows more information to be
   * conveyed, such as onset date. For a single Procedure.reason, if both Procedure.reason.concept
   * and Procedure.reason.reference are present, they are expected to be consistent with each other.
   */
  public var reason: List<CodeableReference?>? = null,
  /**
   * Detailed and structured anatomical location information. Multiple locations are allowed - e.g.
   * multiple punch biopsies of a lesion.
   *
   * If the use case requires attributes from the BodySite resource (e.g. to identify and track
   * separately) then use the standard extension
   * [http://hl7.org/fhir/StructureDefinition/procedure-targetBodyStructure](http://hl7.org/fhir/extensions/StructureDefinition-procedure-targetBodyStructure.html).
   */
  public var bodySite: List<CodeableConcept?>? = null,
  /**
   * The outcome of the procedure - did it resolve the reasons for the procedure being performed?
   *
   * If outcome contains narrative text only, it can be captured using the CodeableConcept.text.
   */
  public var outcome: CodeableConcept? = null,
  /**
   * This could be a histology result, pathology report, surgical report, etc.
   *
   * There could potentially be multiple reports - e.g. if this was a procedure which took multiple
   * biopsies resulting in a number of anatomical pathology reports.
   */
  public var report: List<Reference?>? = null,
  /**
   * Any complications that occurred during the procedure, or in the immediate post-performance
   * period. These are generally tracked separately from the notes, which will typically describe
   * the procedure itself rather than any 'post procedure' issues.
   *
   * If complications are only expressed by the narrative text, they can be captured using the
   * CodeableReference.concept.text.
   */
  public var complication: List<CodeableReference?>? = null,
  /**
   * If the procedure required specific follow up - e.g. removal of sutures. The follow up may be
   * represented as a simple note or could potentially be more complex, in which case the CarePlan
   * resource can be used.
   */
  public var followUp: List<CodeableConcept?>? = null,
  /** Any other notes and comments about the procedure. */
  public var note: List<Annotation?>? = null,
  /**
   * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement,
   * fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
   */
  public var focalDevice: List<FocalDevice>? = null,
  /**
   * Identifies medications, devices and any other substance used as part of the procedure.
   *
   * For devices actually implanted or removed, use Procedure.focalDevice.manipulated.
   */
  public var used: List<CodeableReference?>? = null,
  /**
   * Other resources from the patient record that may be relevant to the procedure. The information
   * from these resources was either used to create the instance or is provided to help with its
   * interpretation. This extension should not be used if more specific inline elements or
   * extensions are available.
   */
  public var supportingInfo: List<Reference?>? = null,
) : DomainResource() {
  /** Indicates who or what performed the procedure and how they were involved. */
  @Serializable(with = ProcedurePerformerSerializer::class)
  public class Performer(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: String? = null,
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
     * Distinguishes the type of involvement of the performer in the procedure. For example,
     * surgeon, anaesthetist, endoscopist.
     */
    public var function: CodeableConcept? = null,
    /** Indicates who or what performed the procedure. */
    public var actor: Reference? = null,
    /**
     * The Organization the Patient, RelatedPerson, Device, CareTeam, and HealthcareService was
     * acting on behalf of.
     *
     * Organization, Patient, RelatedPerson, Device, CareTeam, and HealthcareService can be
     * associated with multiple organizations. This element indicates which organization they were
     * acting on behalf of when performing the action.
     */
    public var onBehalfOf: Reference? = null,
    /** Time period during which the performer performed the procedure. */
    public var period: Period? = null,
  ) : BackboneElement()

  /**
   * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement,
   * fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
   */
  @Serializable(with = ProcedureFocalDeviceSerializer::class)
  public class FocalDevice(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: String? = null,
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
    /** The kind of change that happened to the device during the procedure. */
    public var action: CodeableConcept? = null,
    /** The device that was manipulated (changed) during the procedure. */
    public var manipulated: Reference? = null,
  ) : BackboneElement()

  public sealed interface Occurrence {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public fun asString(): String? = this as? String

    public fun asAge(): Age? = this as? Age

    public fun asRange(): Range? = this as? Range

    public fun asTiming(): Timing? = this as? Timing

    public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Occurrence

    public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Occurrence

    public data class String(public val `value`: com.google.fhir.model.r5.String) : Occurrence

    public data class Age(public val `value`: com.google.fhir.model.r5.Age) : Occurrence

    public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Occurrence

    public data class Timing(public val `value`: com.google.fhir.model.r5.Timing) : Occurrence

    public companion object {
      public fun from(
        dateTimeValue: com.google.fhir.model.r5.DateTime?,
        PeriodValue: com.google.fhir.model.r5.Period?,
        stringValue: com.google.fhir.model.r5.String?,
        AgeValue: com.google.fhir.model.r5.Age?,
        RangeValue: com.google.fhir.model.r5.Range?,
        TimingValue: com.google.fhir.model.r5.Timing?,
      ): Occurrence? {
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (PeriodValue != null) return Period(PeriodValue)
        if (stringValue != null) return String(stringValue)
        if (AgeValue != null) return Age(AgeValue)
        if (RangeValue != null) return Range(RangeValue)
        if (TimingValue != null) return Timing(TimingValue)
        return null
      }
    }
  }

  public sealed interface Reported {
    public fun asBoolean(): Boolean? = this as? Boolean

    public fun asReference(): Reference? = this as? Reference

    public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Reported

    public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Reported

    public companion object {
      public fun from(
        booleanValue: com.google.fhir.model.r5.Boolean?,
        ReferenceValue: com.google.fhir.model.r5.Reference?,
      ): Reported? {
        if (booleanValue != null) return Boolean(booleanValue)
        if (ReferenceValue != null) return Reference(ReferenceValue)
        return null
      }
    }
  }

  /** Codes identifying the lifecycle stage of an event. */
  public enum class ProcedureStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /**
     * The core event has not started yet, but some staging activities have begun (e.g. surgical
     * suite preparation). Preparation stages may be tracked for billing purposes.
     */
    Preparation(
      "preparation",
      "http://hl7.org/fhir/event-status",
      "Preparation",
      "The core event has not started yet, but some staging activities have begun (e.g. surgical suite preparation).  Preparation stages may be tracked for billing purposes.",
    ),
    /** The event is currently occurring. */
    In_Progress(
      "in-progress",
      "http://hl7.org/fhir/event-status",
      "In Progress",
      "The event is currently occurring.",
    ),
    /**
     * The event was terminated prior to any activity beyond preparation. I.e. The 'main' activity
     * has not yet begun. The boundary between preparatory and the 'main' activity is
     * context-specific.
     */
    Not_Done(
      "not-done",
      "http://hl7.org/fhir/event-status",
      "Not Done",
      "The event was terminated prior to any activity beyond preparation.  I.e. The 'main' activity has not yet begun.  The boundary between preparatory and the 'main' activity is context-specific.",
    ),
    /** The event has been temporarily stopped but is expected to resume in the future. */
    On_Hold(
      "on-hold",
      "http://hl7.org/fhir/event-status",
      "On Hold",
      "The event has been temporarily stopped but is expected to resume in the future.",
    ),
    /**
     * The event was terminated prior to the full completion of the intended activity but after at
     * least some of the 'main' activity (beyond preparation) has occurred.
     */
    Stopped(
      "stopped",
      "http://hl7.org/fhir/event-status",
      "Stopped",
      "The event was terminated prior to the full completion of the intended activity but after at least some of the 'main' activity (beyond preparation) has occurred.",
    ),
    /** The event has now concluded. */
    Completed(
      "completed",
      "http://hl7.org/fhir/event-status",
      "Completed",
      "The event has now concluded.",
    ),
    /**
     * This electronic record should never have existed, though it is possible that real-world
     * decisions were based on it. (If real-world activity has occurred, the status should be
     * "stopped" rather than "entered-in-error".).
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/event-status",
      "Entered in Error",
      "This electronic record should never have existed, though it is possible that real-world decisions were based on it.  (If real-world activity has occurred, the status should be \"stopped\" rather than \"entered-in-error\".).",
    ),
    /**
     * The authoring/source system does not know which of the status values currently applies for
     * this event. Note: This concept is not to be used for "other" - one of the listed statuses is
     * presumed to apply, but the authoring/source system does not know which.
     */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/event-status",
      "Unknown",
      "The authoring/source system does not know which of the status values currently applies for this event.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply,  but the authoring/source system does not know which.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): ProcedureStatus =
        when (code) {
          "preparation" -> Preparation
          "in-progress" -> In_Progress
          "not-done" -> Not_Done
          "on-hold" -> On_Hold
          "stopped" -> Stopped
          "completed" -> Completed
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum ProcedureStatus")
        }
    }
  }
}
