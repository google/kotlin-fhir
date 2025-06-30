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

import com.google.fhir.model.r5.serializers.MedicationRequestDispenseRequestInitialFillSerializer
import com.google.fhir.model.r5.serializers.MedicationRequestDispenseRequestSerializer
import com.google.fhir.model.r5.serializers.MedicationRequestSerializer
import com.google.fhir.model.r5.serializers.MedicationRequestSubstitutionAllowedSerializer
import com.google.fhir.model.r5.serializers.MedicationRequestSubstitutionSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An order or request for both supply of the medication and the instructions for administration of
 * the medication to a patient. The resource is called "MedicationRequest" rather than
 * "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and
 * outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
 */
@Serializable(with = MedicationRequestSerializer::class)
@SerialName("MedicationRequest")
public data class MedicationRequest(
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
   * Identifiers associated with this medication request that are defined by business processes
   * and/or used to refer to it when a direct URL reference to the resource itself is not
   * appropriate. They are business identifiers assigned to this resource by the performer or other
   * systems and remain constant as the resource is updated and propagates from server to server.
   *
   * This is a business identifier, not a resource identifier.
   */
  public var identifier: List<Identifier?>? = null,
  /** A plan or request that is fulfilled in whole or in part by this medication request. */
  public var basedOn: List<Reference?>? = null,
  /** Reference to an order/prescription that is being replaced by this MedicationRequest. */
  public var priorPrescription: Reference? = null,
  /**
   * A shared identifier common to multiple independent Request instances that were
   * activated/authorized more or less simultaneously by a single author. The presence of the same
   * identifier on each request ties those requests together and may have business ramifications in
   * terms of reporting of results, billing, etc. E.g. a requisition number shared by a set of lab
   * tests ordered together, or a prescription number shared by all meds ordered at one time.
   */
  public var groupIdentifier: Identifier? = null,
  /**
   * A code specifying the current state of the order. Generally, this will be active or completed
   * state.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   *
   * Clinical decision support systems should take the status into account when determining which
   * medications to include in their algorithms.
   */
  public var status: Enumeration<MedicationRequestStatus>? = null,
  /**
   * Captures the reason for the current state of the MedicationRequest.
   *
   * This is generally only used for "exception" statuses such as "suspended" or "cancelled". The
   * reason why the MedicationRequest was created at all is captured in reasonCode, not here.
   */
  public var statusReason: CodeableConcept? = null,
  /** The date (and perhaps time) when the status was changed. */
  public var statusChanged: DateTime? = null,
  /**
   * Whether the request is a proposal, plan, or an original order.
   *
   * It is expected that the type of requester will be restricted for different stages of a
   * MedicationRequest. For example, Proposals can be created by a patient, relatedPerson,
   * Practitioner or Device. Plans can be created by Practitioners, Patients, RelatedPersons and
   * Devices. Original orders can be created by a Practitioner only.
   *
   * An instance-order is an instantiation of a request or order and may be used to populate
   * Medication Administration Record.
   *
   * This element is labeled as a modifier because the intent alters when and how the resource is
   * actually applicable.
   */
  public var intent: Enumeration<MedicationRequestIntent>? = null,
  /**
   * An arbitrary categorization or grouping of the medication request. It could be used for
   * indicating where meds are intended to be administered, eg. in an inpatient setting or in a
   * patient's home, or a legal category of the medication.
   *
   * The category can be used to include where the medication is expected to be consumed or other
   * types of requests. The examplar value set represents where the meds are intended to be
   * administered and is just one example of request categorization.
   */
  public var category: List<CodeableConcept?>? = null,
  /**
   * Indicates how quickly the Medication Request should be addressed with respect to other
   * requests.
   */
  public var priority: Enumeration<MedicationRequestPriority>? = null,
  /**
   * If true, indicates that the provider is asking for the patient to either stop taking or to not
   * start taking the specified medication. For example, the patient is taking an existing
   * medication and the provider is changing their medication. They want to create two seperate
   * requests: one to stop using the current medication and another to start the new medication.
   *
   * If do not perform is not specified, the request is a positive request e.g. "do perform".
   */
  public var doNotPerform: Boolean? = null,
  /**
   * Identifies the medication being requested. This is a link to a resource that represents the
   * medication which may be the details of the medication or simply an attribute carrying a code
   * that identifies the medication from a known list of medications.
   *
   * If only a code is specified, then it needs to be a code for a specific product. If more
   * information is required, then the use of the Medication resource is recommended. For example,
   * if you require form or lot number or if the medication is compounded or extemporaneously
   * prepared, then you must reference the Medication resource.
   */
  public var medication: CodeableReference? = null,
  /**
   * The individual or group for whom the medication has been requested.
   *
   * The subject on a medication request is mandatory. For the secondary use case where the actual
   * subject is not provided, there still must be an anonymized subject specified.
   */
  public var subject: Reference? = null,
  /**
   * The person or organization who provided the information about this request, if the source is
   * someone other than the requestor. This is often used when the MedicationRequest is reported by
   * another person.
   */
  public var informationSource: List<Reference?>? = null,
  /**
   * The Encounter during which this [x] was created or to which the creation of this record is
   * tightly associated.
   *
   * This will typically be the encounter the event occurred within, but some activities may be
   * initiated prior to or after the official completion of an encounter but still be tied to the
   * context of the encounter." If there is a need to link to episodes of care they will be handled
   * with an extension.
   */
  public var encounter: Reference? = null,
  /**
   * Information to support fulfilling (i.e. dispensing or administering) of the medication, for
   * example, patient height and weight, a MedicationStatement for the patient).
   *
   * This attribute can be used to reference a MedicationStatement about the patients' medication
   * use.
   */
  public var supportingInformation: List<Reference?>? = null,
  /** The date (and perhaps time) when the prescription was initially written or authored on. */
  public var authoredOn: DateTime? = null,
  /**
   * The individual, organization, or device that initiated the request and has responsibility for
   * its activation.
   */
  public var requester: Reference? = null,
  /**
   * Indicates if this record was captured as a secondary 'reported' record rather than as an
   * original primary source-of-truth record. It may also indicate the source of the report.
   *
   * If not populated, then assume that this is the original record and not reported
   */
  public var reported: Boolean? = null,
  /**
   * Indicates the type of performer of the administration of the medication.
   *
   * If specified without indicating a performer, this indicates that the performer must be of the
   * specified type. If specified with a performer then it indicates the requirements of the
   * performer if the designated performer is not available.
   */
  public var performerType: CodeableConcept? = null,
  /**
   * The specified desired performer of the medication treatment (e.g. the performer of the
   * medication administration). For devices, this is the device that is intended to perform the
   * administration of the medication. An IV Pump would be an example of a device that is performing
   * the administration. Both the IV Pump and the practitioner that set the rate or bolus on the
   * pump can be listed as performers.
   */
  public var performer: List<Reference?>? = null,
  /**
   * The intended type of device that is to be used for the administration of the medication (for
   * example, PCA Pump).
   */
  public var device: List<CodeableReference?>? = null,
  /**
   * The person who entered the order on behalf of another individual for example in the case of a
   * verbal or a telephone order.
   */
  public var recorder: Reference? = null,
  /**
   * The reason or the indication for ordering or not ordering the medication.
   *
   * This could be a diagnosis code. If a full condition record exists or additional detail is
   * needed, use reasonReference.
   */
  public var reason: List<CodeableReference?>? = null,
  /**
   * The description of the overall pattern of the administration of the medication to the patient.
   *
   * This attribute should not be confused with the protocol of the medication.
   */
  public var courseOfTherapyType: CodeableConcept? = null,
  /**
   * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be
   * required for delivering the requested service.
   */
  public var insurance: List<Reference?>? = null,
  /**
   * Extra information about the prescription that could not be conveyed by the other attributes.
   */
  public var note: List<Annotation?>? = null,
  /**
   * The full representation of the dose of the medication included in all dosage instructions. To
   * be used when multiple dosage instructions are included to represent complex dosing such as
   * increasing or tapering doses.
   */
  public var renderedDosageInstruction: Markdown? = null,
  /**
   * The period over which the medication is to be taken. Where there are multiple dosageInstruction
   * lines (for example, tapering doses), this is the earliest date and the latest end date of the
   * dosageInstructions.
   */
  public var effectiveDosePeriod: Period? = null,
  /**
   * Specific instructions for how the medication is to be used by the patient.
   *
   * There are examples where a medication request may include the option of an oral dose or an
   * Intravenous or Intramuscular dose. For example, "Ondansetron 8mg orally or IV twice a day as
   * needed for nausea" or "Compazine® (prochlorperazine) 5-10mg PO or 25mg PR bid prn nausea or
   * vomiting". In these cases, two medication requests would be created that could be grouped
   * together. The decision on which dose and route of administration to use is based on the
   * patient's condition at the time the dose is needed. In general, each prescribed drug will be a
   * separate Medication Request.
   *
   * When drug orders are grouped together at the time of order entry, but each of the drugs can be
   * manipulated independently e.g. changing the status of one order to "completed" or "cancelled",
   * changing another order status to "on-hold", the method to "group" all of the medication
   * requests together is to use MedicationRequest.groupIdentifier element. All of the orders
   * grouped together in this manner will have the same groupIdentifier, and separately, each order
   * in the group may have a unique identifier.
   *
   * There are cases that require grouping of Medication orders together when it is necessary to
   * specify optionality e.g. order two drugs at one time, but stating either of these drugs may be
   * used to treat the patient. The use of a RequestOrchestration should be used as a parent for the
   * Medication orders that require this type of grouping. An example when it may be necessary to
   * group medication orders together is when you specify timing relationships e.g. order drug "xyz"
   * with dose 123, then taper the same drug to a different dose after some interval of time
   * precedence: e.g. give drug "abc" followed by drug "def" e.g. give drug 30 minutes before some
   * procedure was performed more generically this supports - hierarchical groups of actions, where
   * each specific action references the action to be performed (in terms of a Request resource),
   * and each group describes additional behavior, relationships, and applicable conditions between
   * the actions in the overall group. Note that one should NOT use the List or Composition resource
   * to accomplish the above requirements. You may use List or Composition for other business
   * requirements, but not to address the specific requirements of grouping medication orders.
   */
  public var dosageInstruction: List<Dosage?>? = null,
  /**
   * Indicates the specific details for the dispense or medication supply part of a medication
   * request (also known as a Medication Prescription or Medication Order). Note that this
   * information is not always sent with the order. There may be in some settings (e.g. hospitals)
   * institutional or system support for completing the dispense details in the pharmacy department.
   */
  public var dispenseRequest: DispenseRequest? = null,
  /**
   * Indicates whether or not substitution can or should be part of the dispense. In some cases,
   * substitution must happen, in other cases substitution must not happen. This block explains the
   * prescriber's intent. If nothing is specified substitution may be done.
   */
  public var substitution: Substitution? = null,
  /**
   * Links to Provenance records for past versions of this resource or fulfilling request or event
   * resources that identify key state transitions or updates that are likely to be relevant to a
   * user looking at the current version of the resource.
   *
   * This might not include provenances for all versions of the request – only those deemed
   * "relevant" or important. This SHALL NOT include the provenance associated with this current
   * version of the resource. (If that provenance is deemed to be a "relevant" change, it will need
   * to be added as part of a later update. Until then, it can be queried directly as the provenance
   * that points to this version using _revinclude All Provenances should have some historical
   * version of this Request as their subject.).
   */
  public var eventHistory: List<Reference?>? = null,
) : DomainResource() {
  /**
   * Indicates the specific details for the dispense or medication supply part of a medication
   * request (also known as a Medication Prescription or Medication Order). Note that this
   * information is not always sent with the order. There may be in some settings (e.g. hospitals)
   * institutional or system support for completing the dispense details in the pharmacy department.
   */
  @Serializable(with = MedicationRequestDispenseRequestSerializer::class)
  public class DispenseRequest(
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
     * Indicates the quantity or duration for the first dispense of the medication.
     *
     * If populating this element, either the quantity or the duration must be included.
     */
    public var initialFill: InitialFill? = null,
    /** The minimum period of time that must occur between dispenses of the medication. */
    public var dispenseInterval: Duration? = null,
    /**
     * This indicates the validity period of a prescription (stale dating the Prescription).
     *
     * It reflects the prescribers' perspective for the validity of the prescription. Dispenses must
     * not be made against the prescription outside of this period. The lower-bound of the
     * Dispensing Window signifies the earliest date that the prescription can be filled for the
     * first time. If an upper-bound is not specified then the Prescription is open-ended or will
     * default to a stale-date based on regulations.
     */
    public var validityPeriod: Period? = null,
    /**
     * An integer indicating the number of times, in addition to the original dispense, (aka refills
     * or repeats) that the patient can receive the prescribed medication. Usage Notes: This integer
     * does not include the original order dispense. This means that if an order indicates dispense
     * 30 tablets plus "3 repeats", then the order can be dispensed a total of 4 times and the
     * patient can receive a total of 120 tablets. A prescriber may explicitly say that zero refills
     * are permitted after the initial dispense.
     *
     * If displaying "number of authorized fills", add 1 to this number.
     */
    public var numberOfRepeatsAllowed: UnsignedInt? = null,
    /** The amount that is to be dispensed for one fill. */
    public var quantity: Quantity? = null,
    /**
     * Identifies the period time over which the supplied product is expected to be used, or the
     * length of time the dispense is expected to last.
     *
     * In some situations, this attribute may be used instead of quantity to identify the amount
     * supplied by how long it is expected to last, rather than the physical quantity issued, e.g.
     * 90 days supply of medication (based on an ordered dosage). When possible, it is always better
     * to specify quantity, as this tends to be more precise. expectedSupplyDuration will always be
     * an estimate that can be influenced by external factors.
     */
    public var expectedSupplyDuration: Duration? = null,
    /**
     * Indicates the intended performing Organization that will dispense the medication as specified
     * by the prescriber.
     */
    public var dispenser: Reference? = null,
    /**
     * Provides additional information to the dispenser, for example, counselling to be provided to
     * the patient.
     */
    public var dispenserInstruction: List<Annotation?>? = null,
    /**
     * Provides information about the type of adherence packaging to be supplied for the medication
     * dispense.
     */
    public var doseAdministrationAid: CodeableConcept? = null,
  ) : BackboneElement() {
    /** Indicates the quantity or duration for the first dispense of the medication. */
    @Serializable(with = MedicationRequestDispenseRequestInitialFillSerializer::class)
    public class InitialFill(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and managable, there is a strict set of
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
       * provide negation or qualification. To make the use of extensions safe and managable, there
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
      /** The amount or quantity to provide as part of the first dispense. */
      public var quantity: Quantity? = null,
      /** The length of time that the first dispense is expected to last. */
      public var duration: Duration? = null,
    ) : BackboneElement()
  }

  /**
   * Indicates whether or not substitution can or should be part of the dispense. In some cases,
   * substitution must happen, in other cases substitution must not happen. This block explains the
   * prescriber's intent. If nothing is specified substitution may be done.
   */
  @Serializable(with = MedicationRequestSubstitutionSerializer::class)
  public class Substitution(
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
     * True if the prescriber allows a different drug to be dispensed from what was prescribed.
     *
     * This element is labeled as a modifier because whether substitution is allow or not, it cannot
     * be ignored.
     */
    public var allowed: Allowed? = null,
    /**
     * Indicates the reason for the substitution, or why substitution must or must not be performed.
     */
    public var reason: CodeableConcept? = null,
  ) : BackboneElement() {
    @Serializable(with = MedicationRequestSubstitutionAllowedSerializer::class)
    public sealed interface Allowed {
      public fun asBoolean(): Boolean? = this as? Boolean

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Allowed

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Allowed

      public data object Null : Allowed

      public companion object {
        public fun from(
          booleanValue: com.google.fhir.model.r5.Boolean?,
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
        ): Allowed {
          if (booleanValue != null) return Boolean(booleanValue)
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          return Null
        }
      }
    }
  }

  /** MedicationRequest Status Codes */
  public enum class MedicationRequestStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /**
     * The request is 'actionable', but not all actions that are implied by it have occurred yet.
     */
    Active(
      "active",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-status",
      "Active",
      "The request is 'actionable', but not all actions that are implied by it have occurred yet.",
    ),
    /**
     * Actions implied by the request are to be temporarily halted. The request might or might not
     * be resumed. May also be called 'suspended'.
     */
    On_Hold(
      "on-hold",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-status",
      "On Hold",
      "Actions implied by the request are to be temporarily halted. The request might or might not be resumed. May also be called 'suspended'.",
    ),
    /**
     * The request is no longer active and the subject should no longer be taking the medication.
     */
    Ended(
      "ended",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-status",
      "Ended",
      "The request is no longer active and the subject should no longer be taking the medication.",
    ),
    /**
     * Actions implied by the request are to be permanently halted, before all of the
     * administrations occurred. This should not be used if the original order was entered in error
     */
    Stopped(
      "stopped",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-status",
      "Stopped",
      "Actions implied by the request are to be permanently halted, before all of the administrations occurred. This should not be used if the original order was entered in error",
    ),
    /** All actions that are implied by the request have occurred. */
    Completed(
      "completed",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-status",
      "Completed",
      "All actions that are implied by the request have occurred.",
    ),
    /** The request has been withdrawn before any administrations have occurred */
    Cancelled(
      "cancelled",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-status",
      "Cancelled",
      "The request has been withdrawn before any administrations have occurred",
    ),
    /**
     * The request was recorded against the wrong patient or for some reason should not have been
     * recorded (e.g. wrong medication, wrong dose, etc.). Some of the actions that are implied by
     * the medication request may have occurred. For example, the medication may have been dispensed
     * and the patient may have taken some of the medication.
     */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-status",
      "Entered in Error",
      "The request was recorded against the wrong patient or for some reason should not have been recorded (e.g. wrong medication, wrong dose, etc.). Some of the actions that are implied by the medication request may have occurred. For example, the medication may have been dispensed and the patient may have taken some of the medication.",
    ),
    /**
     * The request is not yet 'actionable', e.g. it is a work in progress, requires sign-off,
     * verification or needs to be run through decision support process.
     */
    Draft(
      "draft",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-status",
      "Draft",
      "The request is not yet 'actionable', e.g. it is a work in progress, requires sign-off, verification or needs to be run through decision support process.",
    ),
    /**
     * The authoring/source system does not know which of the status values currently applies for
     * this request. Note: This concept is not to be used for 'other' - one of the listed statuses
     * is presumed to apply, but the authoring/source system does not know which.
     */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-status",
      "Unknown",
      "The authoring/source system does not know which of the status values currently applies for this request. Note: This concept is not to be used for 'other' - one of the listed statuses is presumed to apply, but the authoring/source system does not know which.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): MedicationRequestStatus =
        when (code) {
          "active" -> Active
          "on-hold" -> On_Hold
          "ended" -> Ended
          "stopped" -> Stopped
          "completed" -> Completed
          "cancelled" -> Cancelled
          "entered-in-error" -> Entered_In_Error
          "draft" -> Draft
          "unknown" -> Unknown
          else ->
            throw IllegalArgumentException("Unknown code $code for enum MedicationRequestStatus")
        }
    }
  }

  /** MedicationRequest Intent Codes */
  public enum class MedicationRequestIntent(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /**
     * The request is a suggestion made by someone/something that doesn't have an intention to
     * ensure it occurs and without providing an authorization to act
     */
    Proposal(
      "proposal",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-intent",
      "Proposal",
      "The request is a suggestion made by someone/something that doesn't have an intention to ensure it occurs and without providing an authorization to act",
    ),
    /**
     * The request represents an intention to ensure something occurs without providing an
     * authorization for others to act.
     */
    Plan(
      "plan",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-intent",
      "Plan",
      "The request represents an intention to ensure something occurs without providing an authorization for others to act.",
    ),
    /** The request represents a request/demand and authorization for action */
    Order(
      "order",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-intent",
      "Order",
      "The request represents a request/demand and authorization for action",
    ),
    /** The request represents the original authorization for the medication request. */
    Original_Order(
      "original-order",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-intent",
      "Original Order",
      "The request represents the original authorization for the medication request.",
    ),
    /**
     * The request represents an automatically generated supplemental authorization for action based
     * on a parent authorization together with initial results of the action taken against that
     * parent authorization..
     */
    Reflex_Order(
      "reflex-order",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-intent",
      "Reflex Order",
      "The request represents an automatically generated supplemental authorization for action based on a parent authorization together with initial results of the action taken against that parent authorization..",
    ),
    /**
     * The request represents the view of an authorization instantiated by a fulfilling system
     * representing the details of the fulfiller's intention to act upon a submitted order.
     */
    Filler_Order(
      "filler-order",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-intent",
      "Filler Order",
      "The request represents the view of an authorization instantiated by a fulfilling system representing the details of the fulfiller's intention to act upon a submitted order.",
    ),
    /**
     * The request represents an instance for the particular order and is used to generate a
     * schedule of requests on a medication administration record (MAR).
     */
    Instance_Order(
      "instance-order",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-intent",
      "Instance Order",
      "The request represents an instance for the particular order and is used to generate a schedule of requests on a medication administration record (MAR).",
    ),
    /**
     * The request represents a component or option for a RequestOrchestration that establishes
     * timing, conditionality and/or other constraints among a set of requests.
     */
    Option(
      "option",
      "http://hl7.org/fhir/CodeSystem/medicationrequest-intent",
      "Option",
      "The request represents a component or option for a RequestOrchestration that establishes timing, conditionality and/or  other constraints among a set of requests.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): MedicationRequestIntent =
        when (code) {
          "proposal" -> Proposal
          "plan" -> Plan
          "order" -> Order
          "original-order" -> Original_Order
          "reflex-order" -> Reflex_Order
          "filler-order" -> Filler_Order
          "instance-order" -> Instance_Order
          "option" -> Option
          else ->
            throw IllegalArgumentException("Unknown code $code for enum MedicationRequestIntent")
        }
    }
  }

  /** Identifies the level of importance to be assigned to actioning the request. */
  public enum class MedicationRequestPriority(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /** The request has normal priority. */
    Routine(
      "routine",
      "http://hl7.org/fhir/request-priority",
      "Routine",
      "The request has normal priority.",
    ),
    /** The request should be actioned promptly - higher priority than routine. */
    Urgent(
      "urgent",
      "http://hl7.org/fhir/request-priority",
      "Urgent",
      "The request should be actioned promptly - higher priority than routine.",
    ),
    /** The request should be actioned as soon as possible - higher priority than urgent. */
    Asap(
      "asap",
      "http://hl7.org/fhir/request-priority",
      "ASAP",
      "The request should be actioned as soon as possible - higher priority than urgent.",
    ),
    /**
     * The request should be actioned immediately - highest possible priority. E.g. an emergency.
     */
    Stat(
      "stat",
      "http://hl7.org/fhir/request-priority",
      "STAT",
      "The request should be actioned immediately - highest possible priority.  E.g. an emergency.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): MedicationRequestPriority =
        when (code) {
          "routine" -> Routine
          "urgent" -> Urgent
          "asap" -> Asap
          "stat" -> Stat
          else ->
            throw IllegalArgumentException("Unknown code $code for enum MedicationRequestPriority")
        }
    }
  }
}
