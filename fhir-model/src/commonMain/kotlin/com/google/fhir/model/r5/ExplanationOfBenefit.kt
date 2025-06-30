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

import com.google.fhir.model.r5.serializers.ExplanationOfBenefitAccidentSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitAddItemBodySiteSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitAddItemDetailSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitAddItemDetailSubDetailSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitAddItemSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitBenefitBalanceFinancialSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitBenefitBalanceSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitCareTeamSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitDiagnosisSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitEventSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitInsuranceSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitItemAdjudicationSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitItemBodySiteSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitItemDetailSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitItemDetailSubDetailSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitItemReviewOutcomeSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitItemSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitPayeeSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitPaymentSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitProcedureSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitProcessNoteSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitRelatedSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitSupportingInfoSerializer
import com.google.fhir.model.r5.serializers.ExplanationOfBenefitTotalSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This resource provides: the claim details; adjudication details from the processing of a Claim;
 * and optionally account balance information, for informing the subscriber of the benefits
 * provided.
 */
@Serializable(with = ExplanationOfBenefitSerializer::class)
@SerialName("ExplanationOfBenefit")
public data class ExplanationOfBenefit(
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
  /** A unique identifier assigned to this explanation of benefit. */
  public var identifier: List<Identifier?>? = null,
  /**
   * Trace number for tracking purposes. May be defined at the jurisdiction level or between trading
   * partners.
   */
  public var traceNumber: List<Identifier?>? = null,
  /**
   * The status of the resource instance.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<ExplanationOfBenefitStatus>? = null,
  /**
   * The category of claim, e.g. oral, pharmacy, vision, institutional, professional.
   *
   * The majority of jurisdictions use: oral, pharmacy, vision, professional and institutional, or
   * variants on those terms, as the general styles of claims. The valueset is extensible to
   * accommodate other jurisdictional requirements.
   */
  public var type: CodeableConcept? = null,
  /**
   * A finer grained suite of claim type codes which may convey additional information such as
   * Inpatient vs Outpatient and/or a specialty service.
   *
   * This may contain the local bill type codes such as the US UB-04 bill type code.
   */
  public var subType: CodeableConcept? = null,
  /**
   * A code to indicate whether the nature of the request is: Claim - A request to an Insurer to
   * adjudicate the supplied charges for health care goods and services under the identified policy
   * and to pay the determined Benefit amount, if any; Preauthorization - A request to an Insurer to
   * adjudicate the supplied proposed future charges for health care goods and services under the
   * identified policy and to approve the services and provide the expected benefit amounts and
   * potentially to reserve funds to pay the benefits when Claims for the indicated services are
   * later submitted; or, Pre-determination - A request to an Insurer to adjudicate the supplied
   * 'what if' charges for health care goods and services under the identified policy and report
   * back what the Benefit payable would be had the services actually been provided.
   */
  public var use: Enumeration<Use>? = null,
  /**
   * The party to whom the professional services and/or products have been supplied or are being
   * considered and for whom actual for forecast reimbursement is sought.
   */
  public var patient: Reference? = null,
  /**
   * The period for which charges are being submitted.
   *
   * Typically this would be today or in the past for a claim, and today or in the future for
   * preauthorizations and prodeterminations. Typically line item dates of service should fall
   * within the billing period if one is specified.
   */
  public var billablePeriod: Period? = null,
  /** The date this resource was created. */
  public var created: DateTime? = null,
  /** Individual who created the claim, predetermination or preauthorization. */
  public var enterer: Reference? = null,
  /** The party responsible for authorization, adjudication and reimbursement. */
  public var insurer: Reference? = null,
  /**
   * The provider which is responsible for the claim, predetermination or preauthorization.
   *
   * Typically this field would be 1..1 where this party is accountable for the data content within
   * the claim but is not necessarily the facility, provider group or practitioner who provided the
   * products and services listed within this claim resource. This field is the Billing Provider,
   * for example, a facility, provider group, lab or practitioner.
   */
  public var provider: Reference? = null,
  /**
   * The provider-required urgency of processing the request. Typical values include: stat, normal
   * deferred.
   *
   * If a claim processor is unable to complete the processing as per the priority then they should
   * generate an error and not process the request.
   */
  public var priority: CodeableConcept? = null,
  /**
   * A code to indicate whether and for whom funds are to be reserved for future claims.
   *
   * This field is only used for preauthorizations.
   */
  public var fundsReserveRequested: CodeableConcept? = null,
  /**
   * A code, used only on a response to a preauthorization, to indicate whether the benefits payable
   * have been reserved and for whom.
   *
   * Fund would be release by a future claim quoting the preAuthRef of this response. Examples of
   * values include: provider, patient, none.
   */
  public var fundsReserve: CodeableConcept? = null,
  /**
   * Other claims which are related to this claim such as prior submissions or claims for related
   * services or for the same event.
   *
   * For example, for the original treatment and follow-up exams.
   */
  public var related: List<Related>? = null,
  /**
   * Prescription is the document/authorization given to the claim author for them to provide
   * products and services for which consideration (reimbursement) is sought. Could be a RX for
   * medications, an 'order' for oxygen or wheelchair or physiotherapy treatments.
   */
  public var prescription: Reference? = null,
  /**
   * Original prescription which has been superseded by this prescription to support the dispensing
   * of pharmacy services, medications or products.
   *
   * For example, a physician may prescribe a medication which the pharmacy determines is
   * contraindicated, or for which the patient has an intolerance, and therefor issues a new
   * prescription for an alternate medication which has the same therapeutic intent. The
   * prescription from the pharmacy becomes the 'prescription' and that from the physician becomes
   * the 'original prescription'.
   */
  public var originalPrescription: Reference? = null,
  /** Information code for an event with a corresponding date or period. */
  public var event: List<Event>? = null,
  /**
   * The party to be reimbursed for cost of the products and services according to the terms of the
   * policy.
   *
   * Often providers agree to receive the benefits payable to reduce the near-term costs to the
   * patient. The insurer may decline to pay the provider and may choose to pay the subscriber
   * instead.
   */
  public var payee: Payee? = null,
  /**
   * The referral information received by the claim author, it is not to be used when the author
   * generates a referral for a patient. A copy of that referral may be provided as supporting
   * information. Some insurers require proof of referral to pay for services or to pay specialist
   * rates for services.
   *
   * The referral resource which lists the date, practitioner, reason and other supporting
   * information.
   */
  public var referral: Reference? = null,
  /** Healthcare encounters related to this claim. */
  public var encounter: List<Reference?>? = null,
  /** Facility where the services were provided. */
  public var facility: Reference? = null,
  /**
   * The business identifier for the instance of the adjudication request: claim predetermination or
   * preauthorization.
   */
  public var claim: Reference? = null,
  /**
   * The business identifier for the instance of the adjudication response: claim, predetermination
   * or preauthorization response.
   */
  public var claimResponse: Reference? = null,
  /**
   * The outcome of the claim, predetermination, or preauthorization processing.
   *
   * The resource may be used to indicate that the Claim/Preauthorization/Pre-determination has been
   * received but processing has not begun (queued); that it has been processed and one or more
   * errors have been detected (error); no errors were detected and some of the adjudication
   * processing has been performed (partial); or all of the adjudication processing has completed
   * without errors (complete).
   */
  public var outcome: Enumeration<ClaimOutcome>? = null,
  /**
   * The result of the claim, predetermination, or preauthorization adjudication.
   *
   * The element is used to indicate the current state of the adjudication overall for the claim
   * resource, for example: the request has been held (pended) for adjudication processing, for
   * manual review or other reasons; that it has been processed and will be paid, or the outstanding
   * paid, as submitted (approved); that no amount will be paid (denied); or that some amount
   * between zero and the submitted amoutn will be paid (partial).
   */
  public var decision: CodeableConcept? = null,
  /** A human readable description of the status of the adjudication. */
  public var disposition: String? = null,
  /**
   * Reference from the Insurer which is used in later communications which refers to this
   * adjudication.
   *
   * This value is only present on preauthorization adjudications.
   */
  public var preAuthRef: List<String?>? = null,
  /**
   * The timeframe during which the supplied preauthorization reference may be quoted on claims to
   * obtain the adjudication as provided.
   *
   * This value is only present on preauthorization adjudications.
   */
  public var preAuthRefPeriod: List<Period?>? = null,
  /**
   * A package billing code or bundle code used to group products and services to a particular
   * health condition (such as heart attack) which is based on a predetermined grouping code system.
   *
   * For example DRG (Diagnosis Related Group) or a bundled billing code. A patient may have a
   * diagnosis of a Myocardial Infarction and a DRG for HeartAttack would be assigned. The Claim
   * item (and possible subsequent claims) would refer to the DRG for those line items that were for
   * services related to the heart attack event.
   */
  public var diagnosisRelatedGroup: CodeableConcept? = null,
  /** The members of the team who provided the products and services. */
  public var careTeam: List<CareTeam>? = null,
  /**
   * Additional information codes regarding exceptions, special considerations, the condition,
   * situation, prior or concurrent issues.
   *
   * Often there are multiple jurisdiction specific valuesets which are required.
   */
  public var supportingInfo: List<SupportingInfo>? = null,
  /** Information about diagnoses relevant to the claim items. */
  public var diagnosis: List<Diagnosis>? = null,
  /** Procedures performed on the patient relevant to the billing items with the claim. */
  public var procedure: List<Procedure>? = null,
  /**
   * This indicates the relative order of a series of EOBs related to different coverages for the
   * same suite of services.
   */
  public var precedence: PositiveInt? = null,
  /**
   * Financial instruments for reimbursement for the health care products and services specified on
   * the claim.
   *
   * All insurance coverages for the patient which may be applicable for reimbursement, of the
   * products and services listed in the claim, are typically provided in the claim to allow
   * insurers to confirm the ordering of the insurance coverages relative to local 'coordination of
   * benefit' rules. One coverage (and only one) with 'focal=true' is to be used in the adjudication
   * of this claim. Coverages appearing before the focal Coverage in the list, and where
   * 'Coverage.subrogation=false', should provide a reference to the ClaimResponse containing the
   * adjudication results of the prior claim.
   */
  public var insurance: List<Insurance>? = null,
  /**
   * Details of a accident which resulted in injuries which required the products and services
   * listed in the claim.
   */
  public var accident: Accident? = null,
  /**
   * The amount paid by the patient, in total at the claim claim level or specifically for the item
   * and detail level, to the provider for goods and services.
   */
  public var patientPaid: Money? = null,
  /**
   * A claim line. Either a simple (a product or service) or a 'group' of details which can also be
   * a simple items or groups of sub-details.
   */
  public var item: List<Item>? = null,
  /** The first-tier service adjudications for payor added product or service lines. */
  public var addItem: List<AddItem>? = null,
  /**
   * The adjudication results which are presented at the header level rather than at the line-item
   * or add-item levels.
   */
  public var adjudication: List<Item.Adjudication?>? = null,
  /**
   * Categorized monetary totals for the adjudication.
   *
   * Totals for amounts submitted, co-pays, benefits payable etc.
   */
  public var total: List<Total>? = null,
  /** Payment details for the adjudication of the claim. */
  public var payment: Payment? = null,
  /**
   * A code for the form to be used for printing the content.
   *
   * May be needed to identify specific jurisdictional forms.
   */
  public var formCode: CodeableConcept? = null,
  /**
   * The actual form, by reference or inclusion, for printing the content or an EOB.
   *
   * Needed to permit insurers to include the actual form.
   */
  public var form: Attachment? = null,
  /** A note that describes or explains adjudication results in a human readable form. */
  public var processNote: List<ProcessNote>? = null,
  /**
   * The term of the benefits documented in this response.
   *
   * Not applicable when use=claim.
   */
  public var benefitPeriod: Period? = null,
  /** Balance by Benefit Category. */
  public var benefitBalance: List<BenefitBalance>? = null,
) : DomainResource() {
  /**
   * Other claims which are related to this claim such as prior submissions or claims for related
   * services or for the same event.
   */
  @Serializable(with = ExplanationOfBenefitRelatedSerializer::class)
  public class Related(
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
    /** Reference to a related claim. */
    public var claim: Reference? = null,
    /**
     * A code to convey how the claims are related.
     *
     * For example, prior claim or umbrella.
     */
    public var relationship: CodeableConcept? = null,
    /**
     * An alternate organizational reference to the case or file to which this particular claim
     * pertains.
     *
     * For example, Property/Casualty insurer claim number or Workers Compensation case number.
     */
    public var reference: Identifier? = null,
  ) : BackboneElement()

  /** Information code for an event with a corresponding date or period. */
  @Serializable(with = ExplanationOfBenefitEventSerializer::class)
  public class Event(
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
    /** A coded event such as when a service is expected or a card printed. */
    public var type: CodeableConcept? = null,
    /**
     * A date or period in the past or future indicating when the event occurred or is expectd to
     * occur.
     */
    public var `when`: When? = null,
  ) : BackboneElement() {
    public sealed interface When {
      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asPeriod(): Period? = this as? Period

      public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : When

      public data class Period(public val `value`: com.google.fhir.model.r5.Period) : When

      public companion object {
        public fun from(
          dateTimeValue: com.google.fhir.model.r5.DateTime?,
          PeriodValue: com.google.fhir.model.r5.Period?,
        ): When? {
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (PeriodValue != null) return Period(PeriodValue)
          return null
        }
      }
    }
  }

  /**
   * The party to be reimbursed for cost of the products and services according to the terms of the
   * policy.
   */
  @Serializable(with = ExplanationOfBenefitPayeeSerializer::class)
  public class Payee(
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
    /** Type of Party to be reimbursed: Subscriber, provider, other. */
    public var type: CodeableConcept? = null,
    /**
     * Reference to the individual or organization to whom any payment will be made.
     *
     * Not required if the payee is 'subscriber' or 'provider'.
     */
    public var party: Reference? = null,
  ) : BackboneElement()

  /** The members of the team who provided the products and services. */
  @Serializable(with = ExplanationOfBenefitCareTeamSerializer::class)
  public class CareTeam(
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
    /** A number to uniquely identify care team entries. */
    public var sequence: PositiveInt? = null,
    /** Member of the team who provided the product or service. */
    public var provider: Reference? = null,
    /**
     * The party who is billing and/or responsible for the claimed products or services.
     *
     * Responsible might not be required when there is only a single provider listed.
     */
    public var responsible: Boolean? = null,
    /**
     * The lead, assisting or supervising practitioner and their discipline if a multidisciplinary
     * team.
     *
     * Role might not be required when there is only a single provider listed.
     */
    public var role: CodeableConcept? = null,
    /** The specialization of the practitioner or provider which is applicable for this service. */
    public var specialty: CodeableConcept? = null,
  ) : BackboneElement()

  /**
   * Additional information codes regarding exceptions, special considerations, the condition,
   * situation, prior or concurrent issues.
   */
  @Serializable(with = ExplanationOfBenefitSupportingInfoSerializer::class)
  public class SupportingInfo(
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
    /** A number to uniquely identify supporting information entries. */
    public var sequence: PositiveInt? = null,
    /**
     * The general class of the information supplied: information; exception; accident, employment;
     * onset, etc.
     *
     * This may contain a category for the local bill type codes.
     */
    public var category: CodeableConcept? = null,
    /**
     * System and code pertaining to the specific information regarding special conditions relating
     * to the setting, treatment or patient for which care is sought.
     *
     * This may contain the local bill type codes such as the US UB-04 bill type code.
     */
    public var code: CodeableConcept? = null,
    /** The date when or period to which this information refers. */
    public var timing: Timing? = null,
    /**
     * Additional data or information such as resources, documents, images etc. including references
     * to the data or the actual inclusion of the data.
     *
     * Could be used to provide references to other resources, document. For example, could contain
     * a PDF in an Attachment of the Police Report for an Accident.
     */
    public var `value`: Value? = null,
    /**
     * Provides the reason in the situation where a reason code is required in addition to the
     * content.
     *
     * For example: the reason for the additional stay, or why a tooth is missing.
     */
    public var reason: Coding? = null,
  ) : BackboneElement() {
    public sealed interface Timing {
      public fun asDate(): Date? = this as? Date

      public fun asPeriod(): Period? = this as? Period

      public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Timing

      public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Timing

      public companion object {
        public fun from(
          dateValue: com.google.fhir.model.r5.Date?,
          PeriodValue: com.google.fhir.model.r5.Period?,
        ): Timing? {
          if (dateValue != null) return Date(dateValue)
          if (PeriodValue != null) return Period(PeriodValue)
          return null
        }
      }
    }

    public sealed interface Value {
      public fun asBoolean(): Boolean? = this as? Boolean

      public fun asString(): String? = this as? String

      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asAttachment(): Attachment? = this as? Attachment

      public fun asReference(): Reference? = this as? Reference

      public fun asIdentifier(): Identifier? = this as? Identifier

      public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

      public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

      public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) : Value

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Value

      public data class Identifier(public val `value`: com.google.fhir.model.r5.Identifier) : Value

      public companion object {
        public fun from(
          booleanValue: com.google.fhir.model.r5.Boolean?,
          stringValue: com.google.fhir.model.r5.String?,
          QuantityValue: com.google.fhir.model.r5.Quantity?,
          AttachmentValue: com.google.fhir.model.r5.Attachment?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
          IdentifierValue: com.google.fhir.model.r5.Identifier?,
        ): Value? {
          if (booleanValue != null) return Boolean(booleanValue)
          if (stringValue != null) return String(stringValue)
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          if (IdentifierValue != null) return Identifier(IdentifierValue)
          return null
        }
      }
    }
  }

  /** Information about diagnoses relevant to the claim items. */
  @Serializable(with = ExplanationOfBenefitDiagnosisSerializer::class)
  public class Diagnosis(
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
     * A number to uniquely identify diagnosis entries.
     *
     * Diagnosis are presented in list order to their expected importance: primary, secondary, etc.
     */
    public var sequence: PositiveInt? = null,
    /**
     * The nature of illness or problem in a coded form or as a reference to an external defined
     * Condition.
     */
    public var diagnosis: Diagnosis? = null,
    /**
     * When the condition was observed or the relative ranking.
     *
     * For example: admitting, primary, secondary, discharge.
     */
    public var type: List<CodeableConcept?>? = null,
    /** Indication of whether the diagnosis was present on admission to a facility. */
    public var onAdmission: CodeableConcept? = null,
  ) : BackboneElement() {
    public sealed interface Diagnosis {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Diagnosis

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) :
        Diagnosis

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
        ): Diagnosis? {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  /** Procedures performed on the patient relevant to the billing items with the claim. */
  @Serializable(with = ExplanationOfBenefitProcedureSerializer::class)
  public class Procedure(
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
    /** A number to uniquely identify procedure entries. */
    public var sequence: PositiveInt? = null,
    /** When the condition was observed or the relative ranking. */
    public var type: List<CodeableConcept?>? = null,
    /** Date and optionally time the procedure was performed. */
    public var date: DateTime? = null,
    /**
     * The code or reference to a Procedure resource which identifies the clinical intervention
     * performed.
     */
    public var procedure: Procedure? = null,
    /** Unique Device Identifiers associated with this line item. */
    public var udi: List<Reference?>? = null,
  ) : BackboneElement() {
    public sealed interface Procedure {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Procedure

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) :
        Procedure

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
        ): Procedure? {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  /**
   * Financial instruments for reimbursement for the health care products and services specified on
   * the claim.
   */
  @Serializable(with = ExplanationOfBenefitInsuranceSerializer::class)
  public class Insurance(
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
     * A flag to indicate that this Coverage is to be used for adjudication of this claim when set
     * to true.
     *
     * A patient may (will) have multiple insurance policies which provide reimbursement for
     * healthcare services and products. For example, a person may also be covered by their spouse's
     * policy and both appear in the list (and may be from the same insurer). This flag will be set
     * to true for only one of the listed policies and that policy will be used for adjudicating
     * this claim. Other claims would be created to request adjudication against the other listed
     * policies.
     */
    public var focal: Boolean? = null,
    /**
     * Reference to the insurance card level information contained in the Coverage resource. The
     * coverage issuing insurer will use these details to locate the patient's actual coverage
     * within the insurer's information system.
     */
    public var coverage: Reference? = null,
    /**
     * Reference numbers previously provided by the insurer to the provider to be quoted on
     * subsequent claims containing services or products related to the prior authorization.
     *
     * This value is an alphanumeric string that may be provided over the phone, via text, via
     * paper, or within a ClaimResponse resource and is not a FHIR Identifier.
     */
    public var preAuthRef: List<String?>? = null,
  ) : BackboneElement()

  /**
   * Details of a accident which resulted in injuries which required the products and services
   * listed in the claim.
   */
  @Serializable(with = ExplanationOfBenefitAccidentSerializer::class)
  public class Accident(
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
     * Date of an accident event related to the products and services contained in the claim.
     *
     * The date of the accident has to precede the dates of the products and services but within a
     * reasonable timeframe.
     */
    public var date: Date? = null,
    /**
     * The type or context of the accident event for the purposes of selection of potential
     * insurance coverages and determination of coordination between insurers.
     */
    public var type: CodeableConcept? = null,
    /** The physical location of the accident event. */
    public var location: Location? = null,
  ) : BackboneElement() {
    public sealed interface Location {
      public fun asAddress(): Address? = this as? Address

      public fun asReference(): Reference? = this as? Reference

      public data class Address(public val `value`: com.google.fhir.model.r5.Address) : Location

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) :
        Location

      public companion object {
        public fun from(
          AddressValue: com.google.fhir.model.r5.Address?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
        ): Location? {
          if (AddressValue != null) return Address(AddressValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  /**
   * A claim line. Either a simple (a product or service) or a 'group' of details which can also be
   * a simple items or groups of sub-details.
   */
  @Serializable(with = ExplanationOfBenefitItemSerializer::class)
  public class Item(
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
    /** A number to uniquely identify item entries. */
    public var sequence: PositiveInt? = null,
    /** Care team members related to this service or product. */
    public var careTeamSequence: List<PositiveInt?>? = null,
    /** Diagnoses applicable for this service or product. */
    public var diagnosisSequence: List<PositiveInt?>? = null,
    /** Procedures applicable for this service or product. */
    public var procedureSequence: List<PositiveInt?>? = null,
    /**
     * Exceptions, special conditions and supporting information applicable for this service or
     * product.
     */
    public var informationSequence: List<PositiveInt?>? = null,
    /**
     * Trace number for tracking purposes. May be defined at the jurisdiction level or between
     * trading partners.
     */
    public var traceNumber: List<Identifier?>? = null,
    /** The type of revenue or cost center providing the product and/or service. */
    public var revenue: CodeableConcept? = null,
    /**
     * Code to identify the general type of benefits under which products and services are provided.
     *
     * Examples include Medical Care, Periodontics, Renal Dialysis, Vision Coverage.
     */
    public var category: CodeableConcept? = null,
    /**
     * When the value is a group code then this item collects a set of related item details,
     * otherwise this contains the product, service, drug or other billing code for the item. This
     * element may be the start of a range of .productOrService codes used in conjunction with
     * .productOrServiceEnd or it may be a solo element where .productOrServiceEnd is not used.
     *
     * If this is an actual service or product line, i.e. not a Group, then use code to indicate the
     * Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN, RxNorm,
     * ACHI, CCI). If a grouping item then use a group code to indicate the type of thing being
     * grouped e.g. 'glasses' or 'compound'.
     */
    public var productOrService: CodeableConcept? = null,
    /**
     * This contains the end of a range of product, service, drug or other billing codes for the
     * item. This element is not used when the .productOrService is a group code. This value may
     * only be present when a .productOfService code has been provided to convey the start of the
     * range. Typically this value may be used only with preauthorizations and not with claims.
     */
    public var productOrServiceEnd: CodeableConcept? = null,
    /** Request or Referral for Goods or Service to be rendered. */
    public var request: List<Reference?>? = null,
    /**
     * Item typification or modifiers codes to convey additional context for the product or service.
     *
     * For example, in Oral whether the treatment is cosmetic or associated with TMJ, or for Medical
     * whether the treatment was outside the clinic or out of office hours.
     */
    public var modifier: List<CodeableConcept?>? = null,
    /**
     * Identifies the program under which this may be recovered.
     *
     * For example: Neonatal program, child dental program or drug users recovery program.
     */
    public var programCode: List<CodeableConcept?>? = null,
    /** The date or dates when the service or product was supplied, performed or completed. */
    public var serviced: Serviced? = null,
    /** Where the product or service was provided. */
    public var location: Location? = null,
    /**
     * The amount paid by the patient, in total at the claim claim level or specifically for the
     * item and detail level, to the provider for goods and services.
     */
    public var patientPaid: Money? = null,
    /** The number of repetitions of a service or product. */
    public var quantity: Quantity? = null,
    /**
     * If the item is not a group then this is the fee for the product or service, otherwise this is
     * the total of the fees for the details of the group.
     */
    public var unitPrice: Money? = null,
    /**
     * A real number that represents a multiplier used in determining the overall value of services
     * delivered and/or goods received. The concept of a Factor allows for a discount or surcharge
     * multiplier to be applied to a monetary amount.
     *
     * To show a 10% senior's discount, the value entered is: 0.90 (1.00 - 0.10).
     */
    public var factor: Decimal? = null,
    /** The total of taxes applicable for this product or service. */
    public var tax: Money? = null,
    /**
     * The total amount claimed for the group (if a grouper) or the line item. Net = unit price *
     * quantity * factor.
     *
     * For example, the formula: quantity * unitPrice * factor = net. Quantity and factor are
     * assumed to be 1 if not supplied.
     */
    public var net: Money? = null,
    /** Unique Device Identifiers associated with this line item. */
    public var udi: List<Reference?>? = null,
    /** Physical location where the service is performed or applies. */
    public var bodySite: List<BodySite>? = null,
    /** Healthcare encounters related to this claim. */
    public var encounter: List<Reference?>? = null,
    /** The numbers associated with notes below which apply to the adjudication of this item. */
    public var noteNumber: List<PositiveInt?>? = null,
    /** The high-level results of the adjudication if adjudication has been performed. */
    public var reviewOutcome: ReviewOutcome? = null,
    /**
     * If this item is a group then the values here are a summary of the adjudication of the detail
     * items. If this item is a simple product or service then this is the result of the
     * adjudication of this item.
     */
    public var adjudication: List<Adjudication>? = null,
    /** Second-tier of goods and services. */
    public var detail: List<Detail>? = null,
  ) : BackboneElement() {
    /** Physical location where the service is performed or applies. */
    @Serializable(with = ExplanationOfBenefitItemBodySiteSerializer::class)
    public class BodySite(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      /**
       * Physical service site on the patient (limb, tooth, etc.).
       *
       * For example: Providing a tooth code, allows an insurer to identify a provider performing a
       * filling on a tooth that was previously removed.
       */
      public var site: List<CodeableReference?>? = null,
      /** A region or surface of the bodySite, e.g. limb region or tooth surface(s). */
      public var subSite: List<CodeableConcept?>? = null,
    ) : BackboneElement()

    /** The high-level results of the adjudication if adjudication has been performed. */
    @Serializable(with = ExplanationOfBenefitItemReviewOutcomeSerializer::class)
    public class ReviewOutcome(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      /**
       * The result of the claim, predetermination, or preauthorization adjudication.
       *
       * The element is used to indicate the current state of the adjudication overall for the claim
       * resource, for example: the request has been held (pended) for adjudication processing, for
       * manual review or other reasons; that it has been processed and will be paid, or the
       * outstanding paid, as submitted (approved); that no amount will be paid (denied); or that
       * some amount between zero and the submitted amount will be paid (partial).
       */
      public var decision: CodeableConcept? = null,
      /**
       * The reasons for the result of the claim, predetermination, or preauthorization
       * adjudication.
       */
      public var reason: List<CodeableConcept?>? = null,
      /**
       * Reference from the Insurer which is used in later communications which refers to this
       * adjudication.
       *
       * This value is only present on preauthorization adjudications.
       */
      public var preAuthRef: String? = null,
      /** The time frame during which this authorization is effective. */
      public var preAuthPeriod: Period? = null,
    ) : BackboneElement()

    /**
     * If this item is a group then the values here are a summary of the adjudication of the detail
     * items. If this item is a simple product or service then this is the result of the
     * adjudication of this item.
     */
    @Serializable(with = ExplanationOfBenefitItemAdjudicationSerializer::class)
    public class Adjudication(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      /**
       * A code to indicate the information type of this adjudication record. Information types may
       * include: the value submitted, maximum values or percentages allowed or payable under the
       * plan, amounts that the patient is responsible for in-aggregate or pertaining to this item,
       * amounts paid by other coverages, and the benefit payable for this item.
       *
       * For example, codes indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
       */
      public var category: CodeableConcept? = null,
      /**
       * A code supporting the understanding of the adjudication result and explaining variance from
       * expected amount.
       *
       * For example, may indicate that the funds for this benefit type have been exhausted.
       */
      public var reason: CodeableConcept? = null,
      /**
       * Monetary amount associated with the category.
       *
       * For example, amount submitted, eligible amount, co-payment, and benefit payable.
       */
      public var amount: Money? = null,
      /**
       * A non-monetary value associated with the category. Mutually exclusive to the amount element
       * above.
       *
       * For example: eligible percentage or co-payment percentage.
       */
      public var quantity: Quantity? = null,
    ) : BackboneElement()

    /** Second-tier of goods and services. */
    @Serializable(with = ExplanationOfBenefitItemDetailSerializer::class)
    public class Detail(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      /**
       * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details
       * which are simple items.
       */
      public var sequence: PositiveInt? = null,
      /**
       * Trace number for tracking purposes. May be defined at the jurisdiction level or between
       * trading partners.
       */
      public var traceNumber: List<Identifier?>? = null,
      /** The type of revenue or cost center providing the product and/or service. */
      public var revenue: CodeableConcept? = null,
      /**
       * Code to identify the general type of benefits under which products and services are
       * provided.
       *
       * Examples include: Medical Care, Periodontics, Renal Dialysis, Vision Coverage.
       */
      public var category: CodeableConcept? = null,
      /**
       * When the value is a group code then this item collects a set of related item details,
       * otherwise this contains the product, service, drug or other billing code for the item. This
       * element may be the start of a range of .productOrService codes used in conjunction with
       * .productOrServiceEnd or it may be a solo element where .productOrServiceEnd is not used.
       *
       * If this is an actual service or product line, i.e. not a Group, then use code to indicate
       * the Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN,
       * RxNorm, ACHI, CCI). If a grouping item then use a group code to indicate the type of thing
       * being grouped e.g. 'glasses' or 'compound'.
       */
      public var productOrService: CodeableConcept? = null,
      /**
       * This contains the end of a range of product, service, drug or other billing codes for the
       * item. This element is not used when the .productOrService is a group code. This value may
       * only be present when a .productOfService code has been provided to convey the start of the
       * range. Typically this value may be used only with preauthorizations and not with claims.
       */
      public var productOrServiceEnd: CodeableConcept? = null,
      /**
       * Item typification or modifiers codes to convey additional context for the product or
       * service.
       *
       * For example, in Oral whether the treatment is cosmetic or associated with TMJ, or for
       * Medical whether the treatment was outside the clinic or out of office hours.
       */
      public var modifier: List<CodeableConcept?>? = null,
      /**
       * Identifies the program under which this may be recovered.
       *
       * For example: Neonatal program, child dental program or drug users recovery program.
       */
      public var programCode: List<CodeableConcept?>? = null,
      /**
       * The amount paid by the patient, in total at the claim claim level or specifically for the
       * item and detail level, to the provider for goods and services.
       */
      public var patientPaid: Money? = null,
      /** The number of repetitions of a service or product. */
      public var quantity: Quantity? = null,
      /**
       * If the item is not a group then this is the fee for the product or service, otherwise this
       * is the total of the fees for the details of the group.
       */
      public var unitPrice: Money? = null,
      /**
       * A real number that represents a multiplier used in determining the overall value of
       * services delivered and/or goods received. The concept of a Factor allows for a discount or
       * surcharge multiplier to be applied to a monetary amount.
       *
       * To show a 10% senior's discount, the value entered is: 0.90 (1.00 - 0.10).
       */
      public var factor: Decimal? = null,
      /** The total of taxes applicable for this product or service. */
      public var tax: Money? = null,
      /**
       * The total amount claimed for the group (if a grouper) or the line item.detail. Net = unit
       * price * quantity * factor.
       *
       * For example, the formula: quantity * unitPrice * factor = net. Quantity and factor are
       * assumed to be 1 if not supplied.
       */
      public var net: Money? = null,
      /** Unique Device Identifiers associated with this line item. */
      public var udi: List<Reference?>? = null,
      /** The numbers associated with notes below which apply to the adjudication of this item. */
      public var noteNumber: List<PositiveInt?>? = null,
      /** The high-level results of the adjudication if adjudication has been performed. */
      public var reviewOutcome: ReviewOutcome? = null,
      /** The adjudication results. */
      public var adjudication: List<Adjudication?>? = null,
      /** Third-tier of goods and services. */
      public var subDetail: List<SubDetail>? = null,
    ) : BackboneElement() {
      /** Third-tier of goods and services. */
      @Serializable(with = ExplanationOfBenefitItemDetailSubDetailSerializer::class)
      public class SubDetail(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and managable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
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
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and managable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
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
         * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details
         * which are simple items.
         */
        public var sequence: PositiveInt? = null,
        /**
         * Trace number for tracking purposes. May be defined at the jurisdiction level or between
         * trading partners.
         */
        public var traceNumber: List<Identifier?>? = null,
        /** The type of revenue or cost center providing the product and/or service. */
        public var revenue: CodeableConcept? = null,
        /**
         * Code to identify the general type of benefits under which products and services are
         * provided.
         *
         * Examples include Medical Care, Periodontics, Renal Dialysis, Vision Coverage.
         */
        public var category: CodeableConcept? = null,
        /**
         * When the value is a group code then this item collects a set of related item details,
         * otherwise this contains the product, service, drug or other billing code for the item.
         * This element may be the start of a range of .productOrService codes used in conjunction
         * with .productOrServiceEnd or it may be a solo element where .productOrServiceEnd is not
         * used.
         *
         * If this is an actual service or product line, i.e. not a Group, then use code to indicate
         * the Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN,
         * RxNorm, ACHI, CCI). If a grouping item then use a group code to indicate the type of
         * thing being grouped e.g. 'glasses' or 'compound'.
         */
        public var productOrService: CodeableConcept? = null,
        /**
         * This contains the end of a range of product, service, drug or other billing codes for the
         * item. This element is not used when the .productOrService is a group code. This value may
         * only be present when a .productOfService code has been provided to convey the start of
         * the range. Typically this value may be used only with preauthorizations and not with
         * claims.
         */
        public var productOrServiceEnd: CodeableConcept? = null,
        /**
         * Item typification or modifiers codes to convey additional context for the product or
         * service.
         *
         * For example, in Oral whether the treatment is cosmetic or associated with TMJ, or for
         * Medical whether the treatment was outside the clinic or outside of office hours.
         */
        public var modifier: List<CodeableConcept?>? = null,
        /**
         * Identifies the program under which this may be recovered.
         *
         * For example: Neonatal program, child dental program or drug users recovery program.
         */
        public var programCode: List<CodeableConcept?>? = null,
        /**
         * The amount paid by the patient, in total at the claim claim level or specifically for the
         * item and detail level, to the provider for goods and services.
         */
        public var patientPaid: Money? = null,
        /** The number of repetitions of a service or product. */
        public var quantity: Quantity? = null,
        /**
         * If the item is not a group then this is the fee for the product or service, otherwise
         * this is the total of the fees for the details of the group.
         */
        public var unitPrice: Money? = null,
        /**
         * A real number that represents a multiplier used in determining the overall value of
         * services delivered and/or goods received. The concept of a Factor allows for a discount
         * or surcharge multiplier to be applied to a monetary amount.
         *
         * To show a 10% senior's discount, the value entered is: 0.90 (1.00 - 0.10).
         */
        public var factor: Decimal? = null,
        /** The total of taxes applicable for this product or service. */
        public var tax: Money? = null,
        /**
         * The total amount claimed for the line item.detail.subDetail. Net = unit price *
         * quantity * factor.
         *
         * For example, the formula: quantity * unitPrice * factor = net. Quantity and factor are
         * assumed to be 1 if not supplied.
         */
        public var net: Money? = null,
        /** Unique Device Identifiers associated with this line item. */
        public var udi: List<Reference?>? = null,
        /** The numbers associated with notes below which apply to the adjudication of this item. */
        public var noteNumber: List<PositiveInt?>? = null,
        /** The high-level results of the adjudication if adjudication has been performed. */
        public var reviewOutcome: ReviewOutcome? = null,
        /** The adjudication results. */
        public var adjudication: List<Adjudication?>? = null,
      ) : BackboneElement()
    }

    public sealed interface Serviced {
      public fun asDate(): Date? = this as? Date

      public fun asPeriod(): Period? = this as? Period

      public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Serviced

      public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Serviced

      public companion object {
        public fun from(
          dateValue: com.google.fhir.model.r5.Date?,
          PeriodValue: com.google.fhir.model.r5.Period?,
        ): Serviced? {
          if (dateValue != null) return Date(dateValue)
          if (PeriodValue != null) return Period(PeriodValue)
          return null
        }
      }
    }

    public sealed interface Location {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asAddress(): Address? = this as? Address

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Location

      public data class Address(public val `value`: com.google.fhir.model.r5.Address) : Location

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) :
        Location

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          AddressValue: com.google.fhir.model.r5.Address?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
        ): Location? {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (AddressValue != null) return Address(AddressValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  /** The first-tier service adjudications for payor added product or service lines. */
  @Serializable(with = ExplanationOfBenefitAddItemSerializer::class)
  public class AddItem(
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
    /** Claim items which this service line is intended to replace. */
    public var itemSequence: List<PositiveInt?>? = null,
    /**
     * The sequence number of the details within the claim item which this line is intended to
     * replace.
     */
    public var detailSequence: List<PositiveInt?>? = null,
    /**
     * The sequence number of the sub-details woithin the details within the claim item which this
     * line is intended to replace.
     */
    public var subDetailSequence: List<PositiveInt?>? = null,
    /**
     * Trace number for tracking purposes. May be defined at the jurisdiction level or between
     * trading partners.
     */
    public var traceNumber: List<Identifier?>? = null,
    /** The providers who are authorized for the services rendered to the patient. */
    public var provider: List<Reference?>? = null,
    /** The type of revenue or cost center providing the product and/or service. */
    public var revenue: CodeableConcept? = null,
    /**
     * When the value is a group code then this item collects a set of related item details,
     * otherwise this contains the product, service, drug or other billing code for the item. This
     * element may be the start of a range of .productOrService codes used in conjunction with
     * .productOrServiceEnd or it may be a solo element where .productOrServiceEnd is not used.
     *
     * If this is an actual service or product line, i.e. not a Group, then use code to indicate the
     * Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN, RxNorm,
     * ACHI, CCI). If a grouping item then use a group code to indicate the type of thing being
     * grouped e.g. 'glasses' or 'compound'.
     */
    public var productOrService: CodeableConcept? = null,
    /**
     * This contains the end of a range of product, service, drug or other billing codes for the
     * item. This element is not used when the .productOrService is a group code. This value may
     * only be present when a .productOfService code has been provided to convey the start of the
     * range. Typically this value may be used only with preauthorizations and not with claims.
     */
    public var productOrServiceEnd: CodeableConcept? = null,
    /** Request or Referral for Goods or Service to be rendered. */
    public var request: List<Reference?>? = null,
    /**
     * Item typification or modifiers codes to convey additional context for the product or service.
     *
     * For example, in Oral whether the treatment is cosmetic or associated with TMJ, or for Medical
     * whether the treatment was outside the clinic or out of office hours.
     */
    public var modifier: List<CodeableConcept?>? = null,
    /**
     * Identifies the program under which this may be recovered.
     *
     * For example: Neonatal program, child dental program or drug users recovery program.
     */
    public var programCode: List<CodeableConcept?>? = null,
    /** The date or dates when the service or product was supplied, performed or completed. */
    public var serviced: Serviced? = null,
    /** Where the product or service was provided. */
    public var location: Location? = null,
    /**
     * The amount paid by the patient, in total at the claim claim level or specifically for the
     * item and detail level, to the provider for goods and services.
     */
    public var patientPaid: Money? = null,
    /** The number of repetitions of a service or product. */
    public var quantity: Quantity? = null,
    /**
     * If the item is not a group then this is the fee for the product or service, otherwise this is
     * the total of the fees for the details of the group.
     */
    public var unitPrice: Money? = null,
    /**
     * A real number that represents a multiplier used in determining the overall value of services
     * delivered and/or goods received. The concept of a Factor allows for a discount or surcharge
     * multiplier to be applied to a monetary amount.
     *
     * To show a 10% senior's discount, the value entered is: 0.90 (1.00 - 0.10).
     */
    public var factor: Decimal? = null,
    /** The total of taxes applicable for this product or service. */
    public var tax: Money? = null,
    /**
     * The total amount claimed for the group (if a grouper) or the addItem. Net = unit price *
     * quantity * factor.
     *
     * For example, the formula: quantity * unitPrice * factor = net. Quantity and factor are
     * assumed to be 1 if not supplied.
     */
    public var net: Money? = null,
    /** Physical location where the service is performed or applies. */
    public var bodySite: List<BodySite>? = null,
    /** The numbers associated with notes below which apply to the adjudication of this item. */
    public var noteNumber: List<PositiveInt?>? = null,
    /** The high-level results of the adjudication if adjudication has been performed. */
    public var reviewOutcome: Item.ReviewOutcome? = null,
    /** The adjudication results. */
    public var adjudication: List<Item.Adjudication?>? = null,
    /** The second-tier service adjudications for payor added services. */
    public var detail: List<Detail>? = null,
  ) : BackboneElement() {
    /** Physical location where the service is performed or applies. */
    @Serializable(with = ExplanationOfBenefitAddItemBodySiteSerializer::class)
    public class BodySite(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      /**
       * Physical service site on the patient (limb, tooth, etc.).
       *
       * For example, providing a tooth code allows an insurer to identify a provider performing a
       * filling on a tooth that was previously removed.
       */
      public var site: List<CodeableReference?>? = null,
      /** A region or surface of the bodySite, e.g. limb region or tooth surface(s). */
      public var subSite: List<CodeableConcept?>? = null,
    ) : BackboneElement()

    /** The second-tier service adjudications for payor added services. */
    @Serializable(with = ExplanationOfBenefitAddItemDetailSerializer::class)
    public class Detail(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      /**
       * Trace number for tracking purposes. May be defined at the jurisdiction level or between
       * trading partners.
       */
      public var traceNumber: List<Identifier?>? = null,
      /** The type of revenue or cost center providing the product and/or service. */
      public var revenue: CodeableConcept? = null,
      /**
       * When the value is a group code then this item collects a set of related item details,
       * otherwise this contains the product, service, drug or other billing code for the item. This
       * element may be the start of a range of .productOrService codes used in conjunction with
       * .productOrServiceEnd or it may be a solo element where .productOrServiceEnd is not used.
       *
       * If this is an actual service or product line, i.e. not a Group, then use code to indicate
       * the Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN,
       * RxNorm, ACHI, CCI). If a grouping item then use a group code to indicate the type of thing
       * being grouped e.g. 'glasses' or 'compound'.
       */
      public var productOrService: CodeableConcept? = null,
      /**
       * This contains the end of a range of product, service, drug or other billing codes for the
       * item. This element is not used when the .productOrService is a group code. This value may
       * only be present when a .productOfService code has been provided to convey the start of the
       * range. Typically this value may be used only with preauthorizations and not with claims.
       */
      public var productOrServiceEnd: CodeableConcept? = null,
      /**
       * Item typification or modifiers codes to convey additional context for the product or
       * service.
       *
       * For example, in Oral whether the treatment is cosmetic or associated with TMJ, or for
       * Medical whether the treatment was outside the clinic or out of office hours.
       */
      public var modifier: List<CodeableConcept?>? = null,
      /**
       * The amount paid by the patient, in total at the claim claim level or specifically for the
       * item and detail level, to the provider for goods and services.
       */
      public var patientPaid: Money? = null,
      /** The number of repetitions of a service or product. */
      public var quantity: Quantity? = null,
      /**
       * If the item is not a group then this is the fee for the product or service, otherwise this
       * is the total of the fees for the details of the group.
       */
      public var unitPrice: Money? = null,
      /**
       * A real number that represents a multiplier used in determining the overall value of
       * services delivered and/or goods received. The concept of a Factor allows for a discount or
       * surcharge multiplier to be applied to a monetary amount.
       *
       * To show a 10% senior's discount, the value entered is: 0.90 (1.00 - 0.10).
       */
      public var factor: Decimal? = null,
      /** The total of taxes applicable for this product or service. */
      public var tax: Money? = null,
      /**
       * The total amount claimed for the group (if a grouper) or the addItem.detail. Net = unit
       * price * quantity * factor.
       *
       * For example, the formula: quantity * unitPrice * factor = net. Quantity and factor are
       * assumed to be 1 if not supplied.
       */
      public var net: Money? = null,
      /** The numbers associated with notes below which apply to the adjudication of this item. */
      public var noteNumber: List<PositiveInt?>? = null,
      /** The high-level results of the adjudication if adjudication has been performed. */
      public var reviewOutcome: Item.ReviewOutcome? = null,
      /** The adjudication results. */
      public var adjudication: List<Item.Adjudication?>? = null,
      /** The third-tier service adjudications for payor added services. */
      public var subDetail: List<SubDetail>? = null,
    ) : BackboneElement() {
      /** The third-tier service adjudications for payor added services. */
      @Serializable(with = ExplanationOfBenefitAddItemDetailSubDetailSerializer::class)
      public class SubDetail(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and managable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
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
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and managable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
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
         * Trace number for tracking purposes. May be defined at the jurisdiction level or between
         * trading partners.
         */
        public var traceNumber: List<Identifier?>? = null,
        /** The type of revenue or cost center providing the product and/or service. */
        public var revenue: CodeableConcept? = null,
        /**
         * When the value is a group code then this item collects a set of related item details,
         * otherwise this contains the product, service, drug or other billing code for the item.
         * This element may be the start of a range of .productOrService codes used in conjunction
         * with .productOrServiceEnd or it may be a solo element where .productOrServiceEnd is not
         * used.
         *
         * If this is an actual service or product line, i.e. not a Group, then use code to indicate
         * the Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN,
         * RxNorm, ACHI, CCI). If a grouping item then use a group code to indicate the type of
         * thing being grouped e.g. 'glasses' or 'compound'.
         */
        public var productOrService: CodeableConcept? = null,
        /**
         * This contains the end of a range of product, service, drug or other billing codes for the
         * item. This element is not used when the .productOrService is a group code. This value may
         * only be present when a .productOfService code has been provided to convey the start of
         * the range. Typically this value may be used only with preauthorizations and not with
         * claims.
         */
        public var productOrServiceEnd: CodeableConcept? = null,
        /**
         * Item typification or modifiers codes to convey additional context for the product or
         * service.
         *
         * For example, in Oral whether the treatment is cosmetic or associated with TMJ, or for
         * Medical whether the treatment was outside the clinic or out of office hours.
         */
        public var modifier: List<CodeableConcept?>? = null,
        /**
         * The amount paid by the patient, in total at the claim claim level or specifically for the
         * item and detail level, to the provider for goods and services.
         */
        public var patientPaid: Money? = null,
        /** The number of repetitions of a service or product. */
        public var quantity: Quantity? = null,
        /**
         * If the item is not a group then this is the fee for the product or service, otherwise
         * this is the total of the fees for the details of the group.
         */
        public var unitPrice: Money? = null,
        /**
         * A real number that represents a multiplier used in determining the overall value of
         * services delivered and/or goods received. The concept of a Factor allows for a discount
         * or surcharge multiplier to be applied to a monetary amount.
         *
         * To show a 10% senior's discount, the value entered is: 0.90 (1.00 - 0.10).
         */
        public var factor: Decimal? = null,
        /** The total of taxes applicable for this product or service. */
        public var tax: Money? = null,
        /**
         * The total amount claimed for the addItem.detail.subDetail. Net = unit price * quantity *
         * factor.
         *
         * For example, the formula: quantity * unitPrice * factor = net. Quantity and factor are
         * assumed to be 1 if not supplied.
         */
        public var net: Money? = null,
        /** The numbers associated with notes below which apply to the adjudication of this item. */
        public var noteNumber: List<PositiveInt?>? = null,
        /** The high-level results of the adjudication if adjudication has been performed. */
        public var reviewOutcome: Item.ReviewOutcome? = null,
        /** The adjudication results. */
        public var adjudication: List<Item.Adjudication?>? = null,
      ) : BackboneElement()
    }

    public sealed interface Serviced {
      public fun asDate(): Date? = this as? Date

      public fun asPeriod(): Period? = this as? Period

      public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Serviced

      public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Serviced

      public companion object {
        public fun from(
          dateValue: com.google.fhir.model.r5.Date?,
          PeriodValue: com.google.fhir.model.r5.Period?,
        ): Serviced? {
          if (dateValue != null) return Date(dateValue)
          if (PeriodValue != null) return Period(PeriodValue)
          return null
        }
      }
    }

    public sealed interface Location {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asAddress(): Address? = this as? Address

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Location

      public data class Address(public val `value`: com.google.fhir.model.r5.Address) : Location

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) :
        Location

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          AddressValue: com.google.fhir.model.r5.Address?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
        ): Location? {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (AddressValue != null) return Address(AddressValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  /** Categorized monetary totals for the adjudication. */
  @Serializable(with = ExplanationOfBenefitTotalSerializer::class)
  public class Total(
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
     * A code to indicate the information type of this adjudication record. Information types may
     * include: the value submitted, maximum values or percentages allowed or payable under the
     * plan, amounts that the patient is responsible for in aggregate or pertaining to this item,
     * amounts paid by other coverages, and the benefit payable for this item.
     *
     * For example, codes indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
     */
    public var category: CodeableConcept? = null,
    /** Monetary total amount associated with the category. */
    public var amount: Money? = null,
  ) : BackboneElement()

  /** Payment details for the adjudication of the claim. */
  @Serializable(with = ExplanationOfBenefitPaymentSerializer::class)
  public class Payment(
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
    /** Whether this represents partial or complete payment of the benefits payable. */
    public var type: CodeableConcept? = null,
    /**
     * Total amount of all adjustments to this payment included in this transaction which are not
     * related to this claim's adjudication.
     *
     * Insurers will deduct amounts owing from the provider (adjustment), such as a prior
     * overpayment, from the amount owing to the provider (benefits payable) when payment is made to
     * the provider.
     */
    public var adjustment: Money? = null,
    /** Reason for the payment adjustment. */
    public var adjustmentReason: CodeableConcept? = null,
    /** Estimated date the payment will be issued or the actual issue date of payment. */
    public var date: Date? = null,
    /** Benefits payable less any payment adjustment. */
    public var amount: Money? = null,
    /**
     * Issuer's unique identifier for the payment instrument.
     *
     * For example: EFT number or check number.
     */
    public var identifier: Identifier? = null,
  ) : BackboneElement()

  /** A note that describes or explains adjudication results in a human readable form. */
  @Serializable(with = ExplanationOfBenefitProcessNoteSerializer::class)
  public class ProcessNote(
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
    /** A number to uniquely identify a note entry. */
    public var number: PositiveInt? = null,
    /** The business purpose of the note text. */
    public var type: CodeableConcept? = null,
    /** The explanation or description associated with the processing. */
    public var text: String? = null,
    /**
     * A code to define the language used in the text of the note.
     *
     * Only required if the language is different from the resource language.
     */
    public var language: CodeableConcept? = null,
  ) : BackboneElement()

  /** Balance by Benefit Category. */
  @Serializable(with = ExplanationOfBenefitBenefitBalanceSerializer::class)
  public class BenefitBalance(
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
     * Code to identify the general type of benefits under which products and services are provided.
     *
     * Examples include Medical Care, Periodontics, Renal Dialysis, Vision Coverage.
     */
    public var category: CodeableConcept? = null,
    /**
     * True if the indicated class of service is excluded from the plan, missing or False indicates
     * the product or service is included in the coverage.
     */
    public var excluded: Boolean? = null,
    /**
     * A short name or tag for the benefit.
     *
     * For example: MED01, or DENT2.
     */
    public var name: String? = null,
    /**
     * A richer description of the benefit or services covered.
     *
     * For example, 'DENT2 covers 100% of basic, 50% of major but excludes Ortho, Implants and
     * Cosmetic services'.
     */
    public var description: String? = null,
    /**
     * Is a flag to indicate whether the benefits refer to in-network providers or out-of-network
     * providers.
     */
    public var network: CodeableConcept? = null,
    /** Indicates if the benefits apply to an individual or to the family. */
    public var unit: CodeableConcept? = null,
    /**
     * The term or period of the values such as 'maximum lifetime benefit' or 'maximum annual
     * visits'.
     */
    public var term: CodeableConcept? = null,
    /** Benefits Used to date. */
    public var financial: List<Financial>? = null,
  ) : BackboneElement() {
    /** Benefits Used to date. */
    @Serializable(with = ExplanationOfBenefitBenefitBalanceFinancialSerializer::class)
    public class Financial(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
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
      /**
       * Classification of benefit being provided.
       *
       * For example: deductible, visits, benefit amount.
       */
      public var type: CodeableConcept? = null,
      /** The quantity of the benefit which is permitted under the coverage. */
      public var allowed: Allowed? = null,
      /** The quantity of the benefit which have been consumed to date. */
      public var used: Used? = null,
    ) : BackboneElement() {
      public sealed interface Allowed {
        public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

        public fun asString(): String? = this as? String

        public fun asMoney(): Money? = this as? Money

        public data class UnsignedInt(public val `value`: com.google.fhir.model.r5.UnsignedInt) :
          Allowed

        public data class String(public val `value`: com.google.fhir.model.r5.String) : Allowed

        public data class Money(public val `value`: com.google.fhir.model.r5.Money) : Allowed

        public companion object {
          public fun from(
            unsignedIntValue: com.google.fhir.model.r5.UnsignedInt?,
            stringValue: com.google.fhir.model.r5.String?,
            MoneyValue: com.google.fhir.model.r5.Money?,
          ): Allowed? {
            if (unsignedIntValue != null) return UnsignedInt(unsignedIntValue)
            if (stringValue != null) return String(stringValue)
            if (MoneyValue != null) return Money(MoneyValue)
            return null
          }
        }
      }

      public sealed interface Used {
        public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

        public fun asMoney(): Money? = this as? Money

        public data class UnsignedInt(public val `value`: com.google.fhir.model.r5.UnsignedInt) :
          Used

        public data class Money(public val `value`: com.google.fhir.model.r5.Money) : Used

        public companion object {
          public fun from(
            unsignedIntValue: com.google.fhir.model.r5.UnsignedInt?,
            MoneyValue: com.google.fhir.model.r5.Money?,
          ): Used? {
            if (unsignedIntValue != null) return UnsignedInt(unsignedIntValue)
            if (MoneyValue != null) return Money(MoneyValue)
            return null
          }
        }
      }
    }
  }

  /** A code specifying the state of the resource instance. */
  public enum class ExplanationOfBenefitStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Active("active", "http://hl7.org/fhir/explanationofbenefit-status", "Active"),
    Cancelled("cancelled", "http://hl7.org/fhir/explanationofbenefit-status", "Cancelled"),
    Draft("draft", "http://hl7.org/fhir/explanationofbenefit-status", "Draft"),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/explanationofbenefit-status",
      "Entered In Error",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): ExplanationOfBenefitStatus =
        when (code) {
          "active" -> Active
          "cancelled" -> Cancelled
          "draft" -> Draft
          "entered-in-error" -> Entered_In_Error
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ExplanationOfBenefitStatus")
        }
    }
  }

  /** The purpose of the Claim: predetermination, preauthorization, claim. */
  public enum class Use(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Claim("claim", "http://hl7.org/fhir/claim-use", "Claim"),
    Preauthorization("preauthorization", "http://hl7.org/fhir/claim-use", "Preauthorization"),
    Predetermination("predetermination", "http://hl7.org/fhir/claim-use", "Predetermination");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): Use =
        when (code) {
          "claim" -> Claim
          "preauthorization" -> Preauthorization
          "predetermination" -> Predetermination
          else -> throw IllegalArgumentException("Unknown code $code for enum Use")
        }
    }
  }

  /** This value set includes Claim Processing Outcome codes. */
  public enum class ClaimOutcome(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Queued("queued", "http://hl7.org/fhir/claim-outcome", "Queued"),
    Complete("complete", "http://hl7.org/fhir/claim-outcome", "Processing Complete"),
    Error("error", "http://hl7.org/fhir/claim-outcome", "Error"),
    Partial("partial", "http://hl7.org/fhir/claim-outcome", "Partial Processing");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): ClaimOutcome =
        when (code) {
          "queued" -> Queued
          "complete" -> Complete
          "error" -> Error
          "partial" -> Partial
          else -> throw IllegalArgumentException("Unknown code $code for enum ClaimOutcome")
        }
    }
  }
}
