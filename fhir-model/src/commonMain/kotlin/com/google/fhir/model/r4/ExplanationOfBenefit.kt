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

import com.google.fhir.model.r4.serializers.ExplanationOfBenefitAccidentSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitAddItemDetailSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitAddItemDetailSubDetailSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitAddItemSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitBenefitBalanceFinancialSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitBenefitBalanceSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitCareTeamSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitDiagnosisSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitInsuranceSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitItemAdjudicationSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitItemDetailSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitItemDetailSubDetailSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitItemSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitPayeeSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitPaymentSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitProcedureSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitProcessNoteSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitRelatedSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitSupportingInfoSerializer
import com.google.fhir.model.r4.serializers.ExplanationOfBenefitTotalSerializer
import kotlin.Suppress
import kotlin.collections.MutableList
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
  /** A unique identifier assigned to this explanation of benefit. */
  public var identifier: MutableList<Identifier> = mutableListOf(),
  /**
   * The status of the resource instance.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<ExplanationOfBenefitStatus>,
  /**
   * The category of claim, e.g. oral, pharmacy, vision, institutional, professional.
   *
   * The majority of jurisdictions use: oral, pharmacy, vision, professional and institutional, or
   * variants on those terms, as the general styles of claims. The valueset is extensible to
   * accommodate other jurisdictional requirements.
   */
  public var type: CodeableConcept,
  /**
   * A finer grained suite of claim type codes which may convey additional information such as
   * Inpatient vs Outpatient and/or a specialty service.
   *
   * This may contain the local bill type codes such as the US UB-04 bill type code.
   */
  public var subType: CodeableConcept? = null,
  /**
   * A code to indicate whether the nature of the request is: to request adjudication of products
   * and services previously rendered; or requesting authorization and adjudication for provision in
   * the future; or requesting the non-binding adjudication of the listed products and services
   * which could be provided in the future.
   */
  public var use: Enumeration<Use>,
  /**
   * The party to whom the professional services and/or products have been supplied or are being
   * considered and for whom actual for forecast reimbursement is sought.
   */
  public var patient: Reference,
  /**
   * The period for which charges are being submitted.
   *
   * Typically this would be today or in the past for a claim, and today or in the future for
   * preauthorizations and prodeterminations. Typically line item dates of service should fall
   * within the billing period if one is specified.
   */
  public var billablePeriod: Period? = null,
  /**
   * The date this resource was created.
   *
   * This field is independent of the date of creation of the resource as it may reflect the
   * creation date of a source document prior to digitization. Typically for claims all services
   * must be completed as of this date.
   */
  public var created: DateTime,
  /** Individual who created the claim, predetermination or preauthorization. */
  public var enterer: Reference? = null,
  /** The party responsible for authorization, adjudication and reimbursement. */
  public var insurer: Reference,
  /**
   * The provider which is responsible for the claim, predetermination or preauthorization.
   *
   * Typically this field would be 1..1 where this party is responsible for the claim but not
   * necessarily professionally responsible for the provision of the individual products and
   * services listed below.
   */
  public var provider: Reference,
  /**
   * The provider-required urgency of processing the request. Typical values include: stat, routine
   * deferred.
   *
   * If a claim processor is unable to complete the processing as per the priority then they should
   * generate and error and not process the request.
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
  public var related: MutableList<Related> = mutableListOf(),
  /** Prescription to support the dispensing of pharmacy, device or vision products. */
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
   * A reference to a referral resource.
   *
   * The referral resource which lists the date, practitioner, reason and other supporting
   * information.
   */
  public var referral: Reference? = null,
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
   * The resource may be used to indicate that: the request has been held (queued) for processing;
   * that it has been processed and errors found (error); that no errors were found and that some of
   * the adjudication has been undertaken (partial) or that all of the adjudication has been
   * undertaken (complete).
   */
  public var outcome: Enumeration<RemittanceOutcome>,
  /** A human readable description of the status of the adjudication. */
  public var disposition: String? = null,
  /**
   * Reference from the Insurer which is used in later communications which refers to this
   * adjudication.
   *
   * This value is only present on preauthorization adjudications.
   */
  public var preAuthRef: MutableList<String> = mutableListOf(),
  /**
   * The timeframe during which the supplied preauthorization reference may be quoted on claims to
   * obtain the adjudication as provided.
   *
   * This value is only present on preauthorization adjudications.
   */
  public var preAuthRefPeriod: MutableList<Period> = mutableListOf(),
  /** The members of the team who provided the products and services. */
  public var careTeam: MutableList<CareTeam> = mutableListOf(),
  /**
   * Additional information codes regarding exceptions, special considerations, the condition,
   * situation, prior or concurrent issues.
   *
   * Often there are multiple jurisdiction specific valuesets which are required.
   */
  public var supportingInfo: MutableList<SupportingInfo> = mutableListOf(),
  /** Information about diagnoses relevant to the claim items. */
  public var diagnosis: MutableList<Diagnosis> = mutableListOf(),
  /** Procedures performed on the patient relevant to the billing items with the claim. */
  public var procedure: MutableList<Procedure> = mutableListOf(),
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
  public var insurance: MutableList<Insurance> = mutableListOf(),
  /**
   * Details of a accident which resulted in injuries which required the products and services
   * listed in the claim.
   */
  public var accident: Accident? = null,
  /**
   * A claim line. Either a simple (a product or service) or a 'group' of details which can also be
   * a simple items or groups of sub-details.
   */
  public var item: MutableList<Item> = mutableListOf(),
  /** The first-tier service adjudications for payor added product or service lines. */
  public var addItem: MutableList<AddItem> = mutableListOf(),
  /**
   * The adjudication results which are presented at the header level rather than at the line-item
   * or add-item levels.
   */
  public var adjudication: MutableList<Item.Adjudication> = mutableListOf(),
  /**
   * Categorized monetary totals for the adjudication.
   *
   * Totals for amounts submitted, co-pays, benefits payable etc.
   */
  public var total: MutableList<Total> = mutableListOf(),
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
  public var processNote: MutableList<ProcessNote> = mutableListOf(),
  /**
   * The term of the benefits documented in this response.
   *
   * Not applicable when use=claim.
   */
  public var benefitPeriod: Period? = null,
  /** Balance by Benefit Category. */
  public var benefitBalance: MutableList<BenefitBalance> = mutableListOf(),
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
    /** A number to uniquely identify care team entries. */
    public var sequence: PositiveInt,
    /** Member of the team who provided the product or service. */
    public var provider: Reference,
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
    /** The qualification of the practitioner which is applicable for this service. */
    public var qualification: CodeableConcept? = null,
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
    /** A number to uniquely identify supporting information entries. */
    public var sequence: PositiveInt,
    /**
     * The general class of the information supplied: information; exception; accident, employment;
     * onset, etc.
     *
     * This may contain a category for the local bill type codes.
     */
    public var category: CodeableConcept,
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

      public data class Date(public val `value`: com.google.fhir.model.r4.Date) : Timing

      public data class Period(public val `value`: com.google.fhir.model.r4.Period) : Timing

      public companion object {
        internal fun from(
          dateValue: com.google.fhir.model.r4.Date?,
          periodValue: com.google.fhir.model.r4.Period?,
        ): Timing? {
          if (dateValue != null) return Date(dateValue)
          if (periodValue != null) return Period(periodValue)
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

      public data class Boolean(public val `value`: com.google.fhir.model.r4.Boolean) : Value

      public data class String(public val `value`: com.google.fhir.model.r4.String) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r4.Quantity) : Value

      public data class Attachment(public val `value`: com.google.fhir.model.r4.Attachment) : Value

      public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) : Value

      public companion object {
        internal fun from(
          booleanValue: com.google.fhir.model.r4.Boolean?,
          stringValue: com.google.fhir.model.r4.String?,
          quantityValue: com.google.fhir.model.r4.Quantity?,
          attachmentValue: com.google.fhir.model.r4.Attachment?,
          referenceValue: com.google.fhir.model.r4.Reference?,
        ): Value? {
          if (booleanValue != null) return Boolean(booleanValue)
          if (stringValue != null) return String(stringValue)
          if (quantityValue != null) return Quantity(quantityValue)
          if (attachmentValue != null) return Attachment(attachmentValue)
          if (referenceValue != null) return Reference(referenceValue)
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
     * A number to uniquely identify diagnosis entries.
     *
     * Diagnosis are presented in list order to their expected importance: primary, secondary, etc.
     */
    public var sequence: PositiveInt,
    /**
     * The nature of illness or problem in a coded form or as a reference to an external defined
     * Condition.
     */
    public var diagnosis: Diagnosis,
    /**
     * When the condition was observed or the relative ranking.
     *
     * For example: admitting, primary, secondary, discharge.
     */
    public var type: MutableList<CodeableConcept> = mutableListOf(),
    /** Indication of whether the diagnosis was present on admission to a facility. */
    public var onAdmission: CodeableConcept? = null,
    /**
     * A package billing code or bundle code used to group products and services to a particular
     * health condition (such as heart attack) which is based on a predetermined grouping code
     * system.
     *
     * For example, DRG (Diagnosis Related Group) or a bundled billing code. A patient may have a
     * diagnosis of a Myocardio-infarction and a DRG for HeartAttack would assigned. The Claim item
     * (and possible subsequent claims) would refer to the DRG for those line items that were for
     * services related to the heart attack event.
     */
    public var packageCode: CodeableConcept? = null,
  ) : BackboneElement() {
    public sealed interface Diagnosis {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4.CodeableConcept
      ) : Diagnosis

      public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) :
        Diagnosis

      public companion object {
        internal fun from(
          codeableConceptValue: com.google.fhir.model.r4.CodeableConcept?,
          referenceValue: com.google.fhir.model.r4.Reference?,
        ): Diagnosis? {
          if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
          if (referenceValue != null) return Reference(referenceValue)
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
    /** A number to uniquely identify procedure entries. */
    public var sequence: PositiveInt,
    /** When the condition was observed or the relative ranking. */
    public var type: MutableList<CodeableConcept> = mutableListOf(),
    /** Date and optionally time the procedure was performed. */
    public var date: DateTime? = null,
    /**
     * The code or reference to a Procedure resource which identifies the clinical intervention
     * performed.
     */
    public var procedure: Procedure,
    /** Unique Device Identifiers associated with this line item. */
    public var udi: MutableList<Reference> = mutableListOf(),
  ) : BackboneElement() {
    public sealed interface Procedure {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4.CodeableConcept
      ) : Procedure

      public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) :
        Procedure

      public companion object {
        internal fun from(
          codeableConceptValue: com.google.fhir.model.r4.CodeableConcept?,
          referenceValue: com.google.fhir.model.r4.Reference?,
        ): Procedure? {
          if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
          if (referenceValue != null) return Reference(referenceValue)
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
    public var focal: Boolean,
    /**
     * Reference to the insurance card level information contained in the Coverage resource. The
     * coverage issuing insurer will use these details to locate the patient's actual coverage
     * within the insurer's information system.
     */
    public var coverage: Reference,
    /**
     * Reference numbers previously provided by the insurer to the provider to be quoted on
     * subsequent claims containing services or products related to the prior authorization.
     *
     * This value is an alphanumeric string that may be provided over the phone, via text, via
     * paper, or within a ClaimResponse resource and is not a FHIR Identifier.
     */
    public var preAuthRef: MutableList<String> = mutableListOf(),
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

      public data class Address(public val `value`: com.google.fhir.model.r4.Address) : Location

      public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) :
        Location

      public companion object {
        internal fun from(
          addressValue: com.google.fhir.model.r4.Address?,
          referenceValue: com.google.fhir.model.r4.Reference?,
        ): Location? {
          if (addressValue != null) return Address(addressValue)
          if (referenceValue != null) return Reference(referenceValue)
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
    /** A number to uniquely identify item entries. */
    public var sequence: PositiveInt,
    /** Care team members related to this service or product. */
    public var careTeamSequence: MutableList<PositiveInt> = mutableListOf(),
    /** Diagnoses applicable for this service or product. */
    public var diagnosisSequence: MutableList<PositiveInt> = mutableListOf(),
    /** Procedures applicable for this service or product. */
    public var procedureSequence: MutableList<PositiveInt> = mutableListOf(),
    /**
     * Exceptions, special conditions and supporting information applicable for this service or
     * product.
     */
    public var informationSequence: MutableList<PositiveInt> = mutableListOf(),
    /** The type of revenue or cost center providing the product and/or service. */
    public var revenue: CodeableConcept? = null,
    /**
     * Code to identify the general type of benefits under which products and services are provided.
     *
     * Examples include Medical Care, Periodontics, Renal Dialysis, Vision Coverage.
     */
    public var category: CodeableConcept? = null,
    /**
     * When the value is a group code then this item collects a set of related claim details,
     * otherwise this contains the product, service, drug or other billing code for the item.
     *
     * If this is an actual service or product line, i.e. not a Group, then use code to indicate the
     * Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN, RxNorm,
     * ACHI, CCI). If a grouping item then use a group code to indicate the type of thing being
     * grouped e.g. 'glasses' or 'compound'.
     */
    public var productOrService: CodeableConcept,
    /**
     * Item typification or modifiers codes to convey additional context for the product or service.
     *
     * For example, in Oral whether the treatment is cosmetic or associated with TMJ, or for Medical
     * whether the treatment was outside the clinic or out of office hours.
     */
    public var modifier: MutableList<CodeableConcept> = mutableListOf(),
    /**
     * Identifies the program under which this may be recovered.
     *
     * For example: Neonatal program, child dental program or drug users recovery program.
     */
    public var programCode: MutableList<CodeableConcept> = mutableListOf(),
    /** The date or dates when the service or product was supplied, performed or completed. */
    public var serviced: Serviced? = null,
    /** Where the product or service was provided. */
    public var location: Location? = null,
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
    /**
     * The quantity times the unit price for an additional service or product or charge.
     *
     * For example, the formula: quantity * unitPrice * factor = net. Quantity and factor are
     * assumed to be 1 if not supplied.
     */
    public var net: Money? = null,
    /** Unique Device Identifiers associated with this line item. */
    public var udi: MutableList<Reference> = mutableListOf(),
    /**
     * Physical service site on the patient (limb, tooth, etc.).
     *
     * For example: Providing a tooth code, allows an insurer to identify a provider performing a
     * filling on a tooth that was previously removed.
     */
    public var bodySite: CodeableConcept? = null,
    /** A region or surface of the bodySite, e.g. limb region or tooth surface(s). */
    public var subSite: MutableList<CodeableConcept> = mutableListOf(),
    /** A billed item may include goods or services provided in multiple encounters. */
    public var encounter: MutableList<Reference> = mutableListOf(),
    /** The numbers associated with notes below which apply to the adjudication of this item. */
    public var noteNumber: MutableList<PositiveInt> = mutableListOf(),
    /**
     * If this item is a group then the values here are a summary of the adjudication of the detail
     * items. If this item is a simple product or service then this is the result of the
     * adjudication of this item.
     */
    public var adjudication: MutableList<Adjudication> = mutableListOf(),
    /** Second-tier of goods and services. */
    public var detail: MutableList<Detail> = mutableListOf(),
  ) : BackboneElement() {
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
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: MutableList<Extension> = mutableListOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
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
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /**
       * A code to indicate the information type of this adjudication record. Information types may
       * include: the value submitted, maximum values or percentages allowed or payable under the
       * plan, amounts that the patient is responsible for in-aggregate or pertaining to this item,
       * amounts paid by other coverages, and the benefit payable for this item.
       *
       * For example, codes indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
       */
      public var category: CodeableConcept,
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
      public var `value`: Decimal? = null,
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
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: MutableList<Extension> = mutableListOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
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
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /**
       * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details
       * which are simple items.
       */
      public var sequence: PositiveInt,
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
       * When the value is a group code then this item collects a set of related claim details,
       * otherwise this contains the product, service, drug or other billing code for the item.
       *
       * If this is an actual service or product line, i.e. not a Group, then use code to indicate
       * the Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN,
       * RxNorm, ACHI, CCI). If a grouping item then use a group code to indicate the type of thing
       * being grouped e.g. 'glasses' or 'compound'.
       */
      public var productOrService: CodeableConcept,
      /**
       * Item typification or modifiers codes to convey additional context for the product or
       * service.
       *
       * For example, in Oral whether the treatment is cosmetic or associated with TMJ, or for
       * Medical whether the treatment was outside the clinic or out of office hours.
       */
      public var modifier: MutableList<CodeableConcept> = mutableListOf(),
      /**
       * Identifies the program under which this may be recovered.
       *
       * For example: Neonatal program, child dental program or drug users recovery program.
       */
      public var programCode: MutableList<CodeableConcept> = mutableListOf(),
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
      /**
       * The quantity times the unit price for an additional service or product or charge.
       *
       * For example, the formula: quantity * unitPrice * factor = net. Quantity and factor are
       * assumed to be 1 if not supplied.
       */
      public var net: Money? = null,
      /** Unique Device Identifiers associated with this line item. */
      public var udi: MutableList<Reference> = mutableListOf(),
      /** The numbers associated with notes below which apply to the adjudication of this item. */
      public var noteNumber: MutableList<PositiveInt> = mutableListOf(),
      /** The adjudication results. */
      public var adjudication: MutableList<Adjudication> = mutableListOf(),
      /** Third-tier of goods and services. */
      public var subDetail: MutableList<SubDetail> = mutableListOf(),
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
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met as part of the
         * definition of the extension.
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var extension: MutableList<Extension> = mutableListOf(),
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
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
        override var modifierExtension: MutableList<Extension> = mutableListOf(),
        /**
         * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details
         * which are simple items.
         */
        public var sequence: PositiveInt,
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
         * When the value is a group code then this item collects a set of related claim details,
         * otherwise this contains the product, service, drug or other billing code for the item.
         *
         * If this is an actual service or product line, i.e. not a Group, then use code to indicate
         * the Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN,
         * RxNorm, ACHI, CCI). If a grouping item then use a group code to indicate the type of
         * thing being grouped e.g. 'glasses' or 'compound'.
         */
        public var productOrService: CodeableConcept,
        /**
         * Item typification or modifiers codes to convey additional context for the product or
         * service.
         *
         * For example, in Oral whether the treatment is cosmetic or associated with TMJ, or for
         * Medical whether the treatment was outside the clinic or outside of office hours.
         */
        public var modifier: MutableList<CodeableConcept> = mutableListOf(),
        /**
         * Identifies the program under which this may be recovered.
         *
         * For example: Neonatal program, child dental program or drug users recovery program.
         */
        public var programCode: MutableList<CodeableConcept> = mutableListOf(),
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
        /**
         * The quantity times the unit price for an additional service or product or charge.
         *
         * For example, the formula: quantity * unitPrice * factor = net. Quantity and factor are
         * assumed to be 1 if not supplied.
         */
        public var net: Money? = null,
        /** Unique Device Identifiers associated with this line item. */
        public var udi: MutableList<Reference> = mutableListOf(),
        /** The numbers associated with notes below which apply to the adjudication of this item. */
        public var noteNumber: MutableList<PositiveInt> = mutableListOf(),
        /** The adjudication results. */
        public var adjudication: MutableList<Adjudication> = mutableListOf(),
      ) : BackboneElement()
    }

    public sealed interface Serviced {
      public fun asDate(): Date? = this as? Date

      public fun asPeriod(): Period? = this as? Period

      public data class Date(public val `value`: com.google.fhir.model.r4.Date) : Serviced

      public data class Period(public val `value`: com.google.fhir.model.r4.Period) : Serviced

      public companion object {
        internal fun from(
          dateValue: com.google.fhir.model.r4.Date?,
          periodValue: com.google.fhir.model.r4.Period?,
        ): Serviced? {
          if (dateValue != null) return Date(dateValue)
          if (periodValue != null) return Period(periodValue)
          return null
        }
      }
    }

    public sealed interface Location {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asAddress(): Address? = this as? Address

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4.CodeableConcept
      ) : Location

      public data class Address(public val `value`: com.google.fhir.model.r4.Address) : Location

      public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) :
        Location

      public companion object {
        internal fun from(
          codeableConceptValue: com.google.fhir.model.r4.CodeableConcept?,
          addressValue: com.google.fhir.model.r4.Address?,
          referenceValue: com.google.fhir.model.r4.Reference?,
        ): Location? {
          if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
          if (addressValue != null) return Address(addressValue)
          if (referenceValue != null) return Reference(referenceValue)
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
    /** Claim items which this service line is intended to replace. */
    public var itemSequence: MutableList<PositiveInt> = mutableListOf(),
    /**
     * The sequence number of the details within the claim item which this line is intended to
     * replace.
     */
    public var detailSequence: MutableList<PositiveInt> = mutableListOf(),
    /**
     * The sequence number of the sub-details woithin the details within the claim item which this
     * line is intended to replace.
     */
    public var subDetailSequence: MutableList<PositiveInt> = mutableListOf(),
    /** The providers who are authorized for the services rendered to the patient. */
    public var provider: MutableList<Reference> = mutableListOf(),
    /**
     * When the value is a group code then this item collects a set of related claim details,
     * otherwise this contains the product, service, drug or other billing code for the item.
     *
     * If this is an actual service or product line, i.e. not a Group, then use code to indicate the
     * Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN, RxNorm,
     * ACHI, CCI). If a grouping item then use a group code to indicate the type of thing being
     * grouped e.g. 'glasses' or 'compound'.
     */
    public var productOrService: CodeableConcept,
    /**
     * Item typification or modifiers codes to convey additional context for the product or service.
     *
     * For example, in Oral whether the treatment is cosmetic or associated with TMJ, or for Medical
     * whether the treatment was outside the clinic or out of office hours.
     */
    public var modifier: MutableList<CodeableConcept> = mutableListOf(),
    /**
     * Identifies the program under which this may be recovered.
     *
     * For example: Neonatal program, child dental program or drug users recovery program.
     */
    public var programCode: MutableList<CodeableConcept> = mutableListOf(),
    /** The date or dates when the service or product was supplied, performed or completed. */
    public var serviced: Serviced? = null,
    /** Where the product or service was provided. */
    public var location: Location? = null,
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
    /**
     * The quantity times the unit price for an additional service or product or charge.
     *
     * For example, the formula: quantity * unitPrice * factor = net. Quantity and factor are
     * assumed to be 1 if not supplied.
     */
    public var net: Money? = null,
    /**
     * Physical service site on the patient (limb, tooth, etc.).
     *
     * For example, providing a tooth code allows an insurer to identify a provider performing a
     * filling on a tooth that was previously removed.
     */
    public var bodySite: CodeableConcept? = null,
    /** A region or surface of the bodySite, e.g. limb region or tooth surface(s). */
    public var subSite: MutableList<CodeableConcept> = mutableListOf(),
    /** The numbers associated with notes below which apply to the adjudication of this item. */
    public var noteNumber: MutableList<PositiveInt> = mutableListOf(),
    /** The adjudication results. */
    public var adjudication: MutableList<Item.Adjudication> = mutableListOf(),
    /** The second-tier service adjudications for payor added services. */
    public var detail: MutableList<Detail> = mutableListOf(),
  ) : BackboneElement() {
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
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: MutableList<Extension> = mutableListOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
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
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /**
       * When the value is a group code then this item collects a set of related claim details,
       * otherwise this contains the product, service, drug or other billing code for the item.
       *
       * If this is an actual service or product line, i.e. not a Group, then use code to indicate
       * the Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN,
       * RxNorm, ACHI, CCI). If a grouping item then use a group code to indicate the type of thing
       * being grouped e.g. 'glasses' or 'compound'.
       */
      public var productOrService: CodeableConcept,
      /**
       * Item typification or modifiers codes to convey additional context for the product or
       * service.
       *
       * For example, in Oral whether the treatment is cosmetic or associated with TMJ, or for
       * Medical whether the treatment was outside the clinic or out of office hours.
       */
      public var modifier: MutableList<CodeableConcept> = mutableListOf(),
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
      /**
       * The quantity times the unit price for an additional service or product or charge.
       *
       * For example, the formula: quantity * unitPrice * factor = net. Quantity and factor are
       * assumed to be 1 if not supplied.
       */
      public var net: Money? = null,
      /** The numbers associated with notes below which apply to the adjudication of this item. */
      public var noteNumber: MutableList<PositiveInt> = mutableListOf(),
      /** The adjudication results. */
      public var adjudication: MutableList<Item.Adjudication> = mutableListOf(),
      /** The third-tier service adjudications for payor added services. */
      public var subDetail: MutableList<SubDetail> = mutableListOf(),
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
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met as part of the
         * definition of the extension.
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var extension: MutableList<Extension> = mutableListOf(),
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
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
        override var modifierExtension: MutableList<Extension> = mutableListOf(),
        /**
         * When the value is a group code then this item collects a set of related claim details,
         * otherwise this contains the product, service, drug or other billing code for the item.
         *
         * If this is an actual service or product line, i.e. not a Group, then use code to indicate
         * the Professional Service or Product supplied (e.g. CTP, HCPCS, USCLS, ICD10, NCPDP, DIN,
         * RxNorm, ACHI, CCI). If a grouping item then use a group code to indicate the type of
         * thing being grouped e.g. 'glasses' or 'compound'.
         */
        public var productOrService: CodeableConcept,
        /**
         * Item typification or modifiers codes to convey additional context for the product or
         * service.
         *
         * For example, in Oral whether the treatment is cosmetic or associated with TMJ, or for
         * Medical whether the treatment was outside the clinic or out of office hours.
         */
        public var modifier: MutableList<CodeableConcept> = mutableListOf(),
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
        /**
         * The quantity times the unit price for an additional service or product or charge.
         *
         * For example, the formula: quantity * unitPrice * factor = net. Quantity and factor are
         * assumed to be 1 if not supplied.
         */
        public var net: Money? = null,
        /** The numbers associated with notes below which apply to the adjudication of this item. */
        public var noteNumber: MutableList<PositiveInt> = mutableListOf(),
        /** The adjudication results. */
        public var adjudication: MutableList<Item.Adjudication> = mutableListOf(),
      ) : BackboneElement()
    }

    public sealed interface Serviced {
      public fun asDate(): Date? = this as? Date

      public fun asPeriod(): Period? = this as? Period

      public data class Date(public val `value`: com.google.fhir.model.r4.Date) : Serviced

      public data class Period(public val `value`: com.google.fhir.model.r4.Period) : Serviced

      public companion object {
        internal fun from(
          dateValue: com.google.fhir.model.r4.Date?,
          periodValue: com.google.fhir.model.r4.Period?,
        ): Serviced? {
          if (dateValue != null) return Date(dateValue)
          if (periodValue != null) return Period(periodValue)
          return null
        }
      }
    }

    public sealed interface Location {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asAddress(): Address? = this as? Address

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4.CodeableConcept
      ) : Location

      public data class Address(public val `value`: com.google.fhir.model.r4.Address) : Location

      public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) :
        Location

      public companion object {
        internal fun from(
          codeableConceptValue: com.google.fhir.model.r4.CodeableConcept?,
          addressValue: com.google.fhir.model.r4.Address?,
          referenceValue: com.google.fhir.model.r4.Reference?,
        ): Location? {
          if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
          if (addressValue != null) return Address(addressValue)
          if (referenceValue != null) return Reference(referenceValue)
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
     * A code to indicate the information type of this adjudication record. Information types may
     * include: the value submitted, maximum values or percentages allowed or payable under the
     * plan, amounts that the patient is responsible for in aggregate or pertaining to this item,
     * amounts paid by other coverages, and the benefit payable for this item.
     *
     * For example, codes indicating: Co-Pay, deductible, eligible, benefit, tax, etc.
     */
    public var category: CodeableConcept,
    /** Monetary total amount associated with the category. */
    public var amount: Money,
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
    /** A number to uniquely identify a note entry. */
    public var number: PositiveInt? = null,
    /** The business purpose of the note text. */
    public var type: Enumeration<NoteType>? = null,
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
     * Code to identify the general type of benefits under which products and services are provided.
     *
     * Examples include Medical Care, Periodontics, Renal Dialysis, Vision Coverage.
     */
    public var category: CodeableConcept,
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
    public var financial: MutableList<Financial> = mutableListOf(),
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
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: MutableList<Extension> = mutableListOf(),
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
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
      override var modifierExtension: MutableList<Extension> = mutableListOf(),
      /**
       * Classification of benefit being provided.
       *
       * For example: deductible, visits, benefit amount.
       */
      public var type: CodeableConcept,
      /** The quantity of the benefit which is permitted under the coverage. */
      public var allowed: Allowed? = null,
      /** The quantity of the benefit which have been consumed to date. */
      public var used: Used? = null,
    ) : BackboneElement() {
      public sealed interface Allowed {
        public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

        public fun asString(): String? = this as? String

        public fun asMoney(): Money? = this as? Money

        public data class UnsignedInt(public val `value`: com.google.fhir.model.r4.UnsignedInt) :
          Allowed

        public data class String(public val `value`: com.google.fhir.model.r4.String) : Allowed

        public data class Money(public val `value`: com.google.fhir.model.r4.Money) : Allowed

        public companion object {
          internal fun from(
            unsignedIntValue: com.google.fhir.model.r4.UnsignedInt?,
            stringValue: com.google.fhir.model.r4.String?,
            moneyValue: com.google.fhir.model.r4.Money?,
          ): Allowed? {
            if (unsignedIntValue != null) return UnsignedInt(unsignedIntValue)
            if (stringValue != null) return String(stringValue)
            if (moneyValue != null) return Money(moneyValue)
            return null
          }
        }
      }

      public sealed interface Used {
        public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

        public fun asMoney(): Money? = this as? Money

        public data class UnsignedInt(public val `value`: com.google.fhir.model.r4.UnsignedInt) :
          Used

        public data class Money(public val `value`: com.google.fhir.model.r4.Money) : Used

        public companion object {
          internal fun from(
            unsignedIntValue: com.google.fhir.model.r4.UnsignedInt?,
            moneyValue: com.google.fhir.model.r4.Money?,
          ): Used? {
            if (unsignedIntValue != null) return UnsignedInt(unsignedIntValue)
            if (moneyValue != null) return Money(moneyValue)
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
  public enum class RemittanceOutcome(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Queued("queued", "http://hl7.org/fhir/remittance-outcome", "Queued"),
    Complete("complete", "http://hl7.org/fhir/remittance-outcome", "Processing Complete"),
    Error("error", "http://hl7.org/fhir/remittance-outcome", "Error"),
    Partial("partial", "http://hl7.org/fhir/remittance-outcome", "Partial Processing");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): RemittanceOutcome =
        when (code) {
          "queued" -> Queued
          "complete" -> Complete
          "error" -> Error
          "partial" -> Partial
          else -> throw IllegalArgumentException("Unknown code $code for enum RemittanceOutcome")
        }
    }
  }
}
