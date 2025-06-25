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

import com.google.fhir.model.r5.serializers.EncounterHistoryLocationSerializer
import com.google.fhir.model.r5.serializers.EncounterHistorySerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** A record of significant events/milestones key data throughout the history of an Encounter */
@Serializable(with = EncounterHistorySerializer::class)
@SerialName("EncounterHistory")
public data class EncounterHistory(
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
   * The Encounter associated with this set of historic values.
   *
   * This is also used for associating a child's encounter back to the mother's encounter.
   *
   * Refer to the Notes section in the Patient resource for further details.
   */
  public var encounter: Reference? = null,
  /** Identifier(s) by which this encounter is known. */
  public var identifier: List<Identifier?>? = null,
  /**
   * planned | in-progress | on-hold | discharged | completed | cancelled | discontinued |
   * entered-in-error | unknown.
   *
   * Note that internal business rules will determine the appropriate transitions that may occur
   * between statuses (and also classes).
   */
  public var status: Enumeration<EncounterStatus>? = null,
  /**
   * Concepts representing classification of patient encounter such as ambulatory (outpatient),
   * inpatient, emergency, home health or others due to local variations.
   */
  public var `class`: CodeableConcept? = null,
  /**
   * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing,
   * rehabilitation).
   *
   * Since there are many ways to further classify encounters, this element is 0..*.
   */
  public var type: List<CodeableConcept?>? = null,
  /** Broad categorization of the service that is to be provided (e.g. cardiology). */
  public var serviceType: List<CodeableReference?>? = null,
  /**
   * The patient or group related to this encounter. In some use-cases the patient MAY not be
   * present, such as a case meeting about a patient between several practitioners or a careteam.
   *
   * While the encounter is always about the patient, the patient might not actually be known in all
   * contexts of use, and there may be a group of patients that could be anonymous (such as in a
   * group therapy for Alcoholics Anonymous - where the recording of the encounter could be used for
   * billing on the number of people/staff and not important to the context of the specific
   * patients) or alternately in veterinary care a herd of sheep receiving treatment (where the
   * animals are not individually tracked).
   */
  public var subject: Reference? = null,
  /**
   * The subjectStatus value can be used to track the patient's status within the encounter. It
   * details whether the patient has arrived or departed, has been triaged or is currently in a
   * waiting status.
   */
  public var subjectStatus: CodeableConcept? = null,
  /**
   * The start and end time associated with this set of values associated with the encounter, may be
   * different to the planned times for various reasons.
   */
  public var actualPeriod: Period? = null,
  /** The planned start date/time (or admission date) of the encounter. */
  public var plannedStartDate: DateTime? = null,
  /** The planned end date/time (or discharge date) of the encounter. */
  public var plannedEndDate: DateTime? = null,
  /**
   * Actual quantity of time the encounter lasted. This excludes the time during leaves of absence.
   *
   * When missing it is the time in between the start and end values.
   *
   * If the precision on these values is low (e.g. to the day only) then this may be considered was
   * an all day (or multi-day) encounter, unless the duration is included, where that amount of time
   * occurred sometime during the interval.
   *
   * May differ from the time in `Encounter.period` due to leave of absence(s).
   */
  public var length: Duration? = null,
  /**
   * The location of the patient at this point in the encounter, the multiple cardinality permits
   * de-normalizing the levels of the location hierarchy, such as site/ward/room/bed.
   *
   * Virtual encounters can be recorded in the Encounter by specifying a location reference to a
   * location of type "kind" such as "client's home" and an encounter.class = "virtual".
   */
  public var location: List<Location>? = null,
) : DomainResource() {
  /**
   * The location of the patient at this point in the encounter, the multiple cardinality permits
   * de-normalizing the levels of the location hierarchy, such as site/ward/room/bed.
   */
  @Serializable(with = EncounterHistoryLocationSerializer::class)
  public class Location(
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
    /** The location where the encounter takes place. */
    public var location: Reference? = null,
    /**
     * This will be used to specify the required levels (bed/ward/room/etc.) desired to be recorded
     * to simplify either messaging or query.
     *
     * This information is de-normalized from the Location resource to support the easier
     * understanding of the encounter resource and processing in messaging or query.
     *
     * There may be many levels in the hierachy, and this may only pic specific levels that are
     * required for a specific usage scenario.
     */
    public var form: CodeableConcept? = null,
  ) : BackboneElement()

  /** Current state of the encounter. */
  public enum class EncounterStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /** The Encounter has not yet started. */
    Planned(
      "planned",
      "http://hl7.org/fhir/encounter-status",
      "Planned",
      "The Encounter has not yet started.",
    ),
    /**
     * The Encounter has begun and the patient is present / the practitioner and the patient are
     * meeting.
     */
    In_Progress(
      "in-progress",
      "http://hl7.org/fhir/encounter-status",
      "In Progress",
      "The Encounter has begun and the patient is present / the practitioner and the patient are meeting.",
    ),
    /**
     * The Encounter has begun, but is currently on hold, e.g. because the patient is temporarily on
     * leave.
     */
    On_Hold(
      "on-hold",
      "http://hl7.org/fhir/encounter-status",
      "On Hold",
      "The Encounter has begun, but is currently on hold, e.g. because the patient is temporarily on leave.",
    ),
    /**
     * The Encounter has been clinically completed, the patient has been discharged from the
     * facility or the visit has ended, and the patient may have departed (refer to subjectStatus).
     * While the encounter is in this status, administrative activities are usually performed,
     * collating all required documentation and charge information before being released for
     * billing, at which point the status will move to completed.
     */
    Discharged(
      "discharged",
      "http://hl7.org/fhir/encounter-status",
      "Discharged",
      "The Encounter has been clinically completed, the patient has been discharged from the facility or the visit has ended, and the patient may have departed (refer to subjectStatus). While the encounter is in this status, administrative activities are usually performed, collating all required documentation and charge information before being released for billing, at which point the status will move to completed.",
    ),
    /** The Encounter has ended. */
    Completed(
      "completed",
      "http://hl7.org/fhir/encounter-status",
      "Completed",
      "The Encounter has ended.",
    ),
    /** The Encounter has ended before it has begun. */
    Cancelled(
      "cancelled",
      "http://hl7.org/fhir/encounter-status",
      "Cancelled",
      "The Encounter has ended before it has begun.",
    ),
    /**
     * The Encounter has started, but was not able to be completed. Further action may need to be
     * performed, such as rescheduling appointments related to this encounter.
     */
    Discontinued(
      "discontinued",
      "http://hl7.org/fhir/encounter-status",
      "Discontinued",
      "The Encounter has started, but was not able to be completed. Further action may need to be performed, such as rescheduling appointments related to this encounter.",
    ),
    /** This instance should not have been part of this patient's medical record. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/encounter-status",
      "Entered in Error",
      "This instance should not have been part of this patient's medical record.",
    ),
    /**
     * The encounter status is unknown. Note that "unknown" is a value of last resort and every
     * attempt should be made to provide a meaningful value other than "unknown".
     */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/encounter-status",
      "Unknown",
      "The encounter status is unknown. Note that \"unknown\" is a value of last resort and every attempt should be made to provide a meaningful value other than \"unknown\".",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): EncounterStatus =
        when (code) {
          "planned" -> Planned
          "in-progress" -> In_Progress
          "on-hold" -> On_Hold
          "discharged" -> Discharged
          "completed" -> Completed
          "cancelled" -> Cancelled
          "discontinued" -> Discontinued
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum EncounterStatus")
        }
    }
  }
}
