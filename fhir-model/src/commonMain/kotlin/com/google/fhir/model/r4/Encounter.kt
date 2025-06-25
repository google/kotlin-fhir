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

import com.google.fhir.model.r4.serializers.EncounterClassHistorySerializer
import com.google.fhir.model.r4.serializers.EncounterDiagnosisSerializer
import com.google.fhir.model.r4.serializers.EncounterHospitalizationSerializer
import com.google.fhir.model.r4.serializers.EncounterLocationSerializer
import com.google.fhir.model.r4.serializers.EncounterParticipantSerializer
import com.google.fhir.model.r4.serializers.EncounterSerializer
import com.google.fhir.model.r4.serializers.EncounterStatusHistorySerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An interaction between a patient and healthcare provider(s) for the purpose of providing
 * healthcare service(s) or assessing the health status of a patient.
 */
@Serializable(with = EncounterSerializer::class)
@SerialName("Encounter")
public data class Encounter(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * The only time that a resource does not have an id is when it is being submitted to the server
   * using a create operation.
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
  /** Identifier(s) by which this encounter is known. */
  public var identifier: List<Identifier?>? = null,
  /**
   * planned | arrived | triaged | in-progress | onleave | finished | cancelled +.
   *
   * Note that internal business rules will determine the appropriate transitions that may occur
   * between statuses (and also classes).
   */
  public var status: Enumeration<EncounterStatus>? = null,
  /**
   * The status history permits the encounter resource to contain the status history without needing
   * to read through the historical versions of the resource, or even have the server store them.
   *
   * The current status is always found in the current version of the resource, not the status
   * history.
   */
  public var statusHistory: List<StatusHistory>? = null,
  /**
   * Concepts representing classification of patient encounter such as ambulatory (outpatient),
   * inpatient, emergency, home health or others due to local variations.
   */
  public var `class`: Coding? = null,
  /**
   * The class history permits the tracking of the encounters transitions without needing to go
   * through the resource history. This would be used for a case where an admission starts of as an
   * emergency encounter, then transitions into an inpatient scenario. Doing this and not restarting
   * a new encounter ensures that any lab/diagnostic results can more easily follow the patient and
   * not require re-processing and not get lost or cancelled during a kind of discharge from
   * emergency to inpatient.
   */
  public var classHistory: List<ClassHistory>? = null,
  /**
   * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing,
   * rehabilitation).
   *
   * Since there are many ways to further classify encounters, this element is 0..*.
   */
  public var type: List<CodeableConcept?>? = null,
  /** Broad categorization of the service that is to be provided (e.g. cardiology). */
  public var serviceType: CodeableConcept? = null,
  /** Indicates the urgency of the encounter. */
  public var priority: CodeableConcept? = null,
  /**
   * The patient or group present at the encounter.
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
   * Where a specific encounter should be classified as a part of a specific episode(s) of care this
   * field should be used. This association can facilitate grouping of related encounters together
   * for a specific purpose, such as government reporting, issue tracking, association via a common
   * problem. The association is recorded on the encounter as these are typically created after the
   * episode of care and grouped on entry rather than editing the episode of care to append another
   * encounter to it (the episode of care could span years).
   */
  public var episodeOfCare: List<Reference?>? = null,
  /** The request this encounter satisfies (e.g. incoming referral or procedure request). */
  public var basedOn: List<Reference?>? = null,
  /** The list of people responsible for providing the service. */
  public var participant: List<Participant>? = null,
  /** The appointment that scheduled this encounter. */
  public var appointment: List<Reference?>? = null,
  /**
   * The start and end time of the encounter.
   *
   * If not (yet) known, the end of the Period may be omitted.
   */
  public var period: Period? = null,
  /**
   * Quantity of time the encounter lasted. This excludes the time during leaves of absence.
   *
   * May differ from the time the Encounter.period lasted because of leave of absence.
   */
  public var length: Duration? = null,
  /**
   * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a
   * coded admission diagnosis.
   *
   * For systems that need to know which was the primary diagnosis, these will be marked with the
   * standard extension primaryDiagnosis (which is a sequence value rather than a flag, 1 = primary
   * diagnosis).
   */
  public var reasonCode: List<CodeableConcept?>? = null,
  /**
   * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a
   * coded admission diagnosis.
   *
   * For systems that need to know which was the primary diagnosis, these will be marked with the
   * standard extension primaryDiagnosis (which is a sequence value rather than a flag, 1 = primary
   * diagnosis).
   */
  public var reasonReference: List<Reference?>? = null,
  /** The list of diagnosis relevant to this encounter. */
  public var diagnosis: List<Diagnosis>? = null,
  /**
   * The set of accounts that may be used for billing for this Encounter.
   *
   * The billing system may choose to allocate billable items associated with the Encounter to
   * different referenced Accounts based on internal business rules.
   */
  public var account: List<Reference?>? = null,
  /**
   * Details about the admission to a healthcare service.
   *
   * An Encounter may cover more than just the inpatient stay. Contexts such as outpatients,
   * community clinics, and aged care facilities are also included.
   *
   * The duration recorded in the period of this encounter covers the entire scope of this
   * hospitalization record.
   */
  public var hospitalization: Hospitalization? = null,
  /**
   * List of locations where the patient has been during this encounter.
   *
   * Virtual encounters can be recorded in the Encounter by specifying a location reference to a
   * location of type "kind" such as "client's home" and an encounter.class = "virtual".
   */
  public var location: List<Location>? = null,
  /**
   * The organization that is primarily responsible for this Encounter's services. This MAY be the
   * same as the organization on the Patient record, however it could be different, such as if the
   * actor performing the services was from an external organization (which may be billed
   * seperately) for an external consultation. Refer to the example bundle showing an abbreviated
   * set of Encounters for a colonoscopy.
   */
  public var serviceProvider: Reference? = null,
  /**
   * Another Encounter of which this encounter is a part of (administratively or in time).
   *
   * This is also used for associating a child's encounter back to the mother's encounter.
   *
   * Refer to the Notes section in the Patient resource for further details.
   */
  public var partOf: Reference? = null,
) : DomainResource() {
  /**
   * The status history permits the encounter resource to contain the status history without needing
   * to read through the historical versions of the resource, or even have the server store them.
   */
  @Serializable(with = EncounterStatusHistorySerializer::class)
  public class StatusHistory(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: String? = null,
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
    /** planned | arrived | triaged | in-progress | onleave | finished | cancelled +. */
    public var status: Enumeration<EncounterStatus>? = null,
    /** The time that the episode was in the specified status. */
    public var period: Period? = null,
  ) : BackboneElement()

  /**
   * The class history permits the tracking of the encounters transitions without needing to go
   * through the resource history. This would be used for a case where an admission starts of as an
   * emergency encounter, then transitions into an inpatient scenario. Doing this and not restarting
   * a new encounter ensures that any lab/diagnostic results can more easily follow the patient and
   * not require re-processing and not get lost or cancelled during a kind of discharge from
   * emergency to inpatient.
   */
  @Serializable(with = EncounterClassHistorySerializer::class)
  public class ClassHistory(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: String? = null,
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
    /** inpatient | outpatient | ambulatory | emergency +. */
    public var `class`: Coding? = null,
    /** The time that the episode was in the specified class. */
    public var period: Period? = null,
  ) : BackboneElement()

  /** The list of people responsible for providing the service. */
  @Serializable(with = EncounterParticipantSerializer::class)
  public class Participant(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: String? = null,
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
    /**
     * Role of participant in encounter.
     *
     * The participant type indicates how an individual participates in an encounter. It includes
     * non-practitioner participants, and for practitioners this is to describe the action type in
     * the context of this encounter (e.g. Admitting Dr, Attending Dr, Translator, Consulting Dr).
     * This is different to the practitioner roles which are functional roles, derived from terms of
     * employment, education, licensing, etc.
     */
    public var type: List<CodeableConcept?>? = null,
    /**
     * The period of time that the specified participant participated in the encounter. These can
     * overlap or be sub-sets of the overall encounter's period.
     */
    public var period: Period? = null,
    /** Persons involved in the encounter other than the patient. */
    public var individual: Reference? = null,
  ) : BackboneElement()

  /** The list of diagnosis relevant to this encounter. */
  @Serializable(with = EncounterDiagnosisSerializer::class)
  public class Diagnosis(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: String? = null,
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
    /**
     * Reason the encounter takes place, as specified using information from another resource. For
     * admissions, this is the admission diagnosis. The indication will typically be a Condition
     * (with other resources referenced in the evidence.detail), or a Procedure.
     *
     * For systems that need to know which was the primary diagnosis, these will be marked with the
     * standard extension primaryDiagnosis (which is a sequence value rather than a flag, 1 =
     * primary diagnosis).
     */
    public var condition: Reference? = null,
    /** Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …). */
    public var use: CodeableConcept? = null,
    /** Ranking of the diagnosis (for each role type). */
    public var rank: PositiveInt? = null,
  ) : BackboneElement()

  /** Details about the admission to a healthcare service. */
  @Serializable(with = EncounterHospitalizationSerializer::class)
  public class Hospitalization(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: String? = null,
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
    /** Pre-admission identifier. */
    public var preAdmissionIdentifier: Identifier? = null,
    /** The location/organization from which the patient came before admission. */
    public var origin: Reference? = null,
    /** From where patient was admitted (physician referral, transfer). */
    public var admitSource: CodeableConcept? = null,
    /** Whether this hospitalization is a readmission and why if known. */
    public var reAdmission: CodeableConcept? = null,
    /**
     * Diet preferences reported by the patient.
     *
     * For example, a patient may request both a dairy-free and nut-free diet preference (not
     * mutually exclusive).
     */
    public var dietPreference: List<CodeableConcept?>? = null,
    /** Special courtesies (VIP, board member). */
    public var specialCourtesy: List<CodeableConcept?>? = null,
    /**
     * Any special requests that have been made for this hospitalization encounter, such as the
     * provision of specific equipment or other things.
     */
    public var specialArrangement: List<CodeableConcept?>? = null,
    /** Location/organization to which the patient is discharged. */
    public var destination: Reference? = null,
    /** Category or kind of location after discharge. */
    public var dischargeDisposition: CodeableConcept? = null,
  ) : BackboneElement()

  /** List of locations where the patient has been during this encounter. */
  @Serializable(with = EncounterLocationSerializer::class)
  public class Location(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: String? = null,
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
    /** The location where the encounter takes place. */
    public var location: Reference? = null,
    /**
     * The status of the participants' presence at the specified location during the period
     * specified. If the participant is no longer at the location, then the period will have an end
     * date/time.
     *
     * When the patient is no longer active at a location, then the period end date is entered, and
     * the status may be changed to completed.
     */
    public var status: Enumeration<EncounterLocationStatus>? = null,
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
    public var physicalType: CodeableConcept? = null,
    /** Time period during which the patient was present at the location. */
    public var period: Period? = null,
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
     * The Patient is present for the encounter, however is not currently meeting with a
     * practitioner.
     */
    Arrived(
      "arrived",
      "http://hl7.org/fhir/encounter-status",
      "Arrived",
      "The Patient is present for the encounter, however is not currently meeting with a practitioner.",
    ),
    /**
     * The patient has been assessed for the priority of their treatment based on the severity of
     * their condition.
     */
    Triaged(
      "triaged",
      "http://hl7.org/fhir/encounter-status",
      "Triaged",
      "The patient has been assessed for the priority of their treatment based on the severity of their condition.",
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
    /** The Encounter has begun, but the patient is temporarily on leave. */
    Onleave(
      "onleave",
      "http://hl7.org/fhir/encounter-status",
      "On Leave",
      "The Encounter has begun, but the patient is temporarily on leave.",
    ),
    /** The Encounter has ended. */
    Finished(
      "finished",
      "http://hl7.org/fhir/encounter-status",
      "Finished",
      "The Encounter has ended.",
    ),
    /** The Encounter has ended before it has begun. */
    Cancelled(
      "cancelled",
      "http://hl7.org/fhir/encounter-status",
      "Cancelled",
      "The Encounter has ended before it has begun.",
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
          "arrived" -> Arrived
          "triaged" -> Triaged
          "in-progress" -> In_Progress
          "onleave" -> Onleave
          "finished" -> Finished
          "cancelled" -> Cancelled
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum EncounterStatus")
        }
    }
  }

  /** The status of the location. */
  public enum class EncounterLocationStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /** The patient is planned to be moved to this location at some point in the future. */
    Planned(
      "planned",
      "http://hl7.org/fhir/encounter-location-status",
      "Planned",
      "The patient is planned to be moved to this location at some point in the future.",
    ),
    /**
     * The patient is currently at this location, or was between the period specified.
     *
     * A system may update these records when the patient leaves the location to either reserved, or
     * completed.
     */
    Active(
      "active",
      "http://hl7.org/fhir/encounter-location-status",
      "Active",
      "The patient is currently at this location, or was between the period specified.\r\rA system may update these records when the patient leaves the location to either reserved, or completed.",
    ),
    /** This location is held empty for this patient. */
    Reserved(
      "reserved",
      "http://hl7.org/fhir/encounter-location-status",
      "Reserved",
      "This location is held empty for this patient.",
    ),
    /**
     * The patient was at this location during the period specified.
     *
     * Not to be used when the patient is currently at the location.
     */
    Completed(
      "completed",
      "http://hl7.org/fhir/encounter-location-status",
      "Completed",
      "The patient was at this location during the period specified.\r\rNot to be used when the patient is currently at the location.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): EncounterLocationStatus =
        when (code) {
          "planned" -> Planned
          "active" -> Active
          "reserved" -> Reserved
          "completed" -> Completed
          else ->
            throw IllegalArgumentException("Unknown code $code for enum EncounterLocationStatus")
        }
    }
  }
}
