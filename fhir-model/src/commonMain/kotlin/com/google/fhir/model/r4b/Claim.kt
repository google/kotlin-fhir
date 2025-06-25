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

import com.google.fhir.model.r4b.serializers.ClaimAccidentSerializer
import com.google.fhir.model.r4b.serializers.ClaimCareTeamSerializer
import com.google.fhir.model.r4b.serializers.ClaimDiagnosisSerializer
import com.google.fhir.model.r4b.serializers.ClaimInsuranceSerializer
import com.google.fhir.model.r4b.serializers.ClaimItemDetailSerializer
import com.google.fhir.model.r4b.serializers.ClaimItemDetailSubDetailSerializer
import com.google.fhir.model.r4b.serializers.ClaimItemSerializer
import com.google.fhir.model.r4b.serializers.ClaimPayeeSerializer
import com.google.fhir.model.r4b.serializers.ClaimProcedureSerializer
import com.google.fhir.model.r4b.serializers.ClaimRelatedSerializer
import com.google.fhir.model.r4b.serializers.ClaimSerializer
import com.google.fhir.model.r4b.serializers.ClaimSupportingInfoSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A provider issued list of professional services and products which have been provided, or are to
 * be provided, to a patient which is sent to an insurer for reimbursement.
 */
@Serializable(with = ClaimSerializer::class)
@SerialName("Claim")
public data class Claim(
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
  /** A unique identifier assigned to this claim. */
  public var identifier: List<Identifier?>? = null,
  /**
   * The status of the resource instance.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<ClaimStatus>? = null,
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
   * This may contain the local bill type codes, for example the US UB-04 bill type code or the CMS
   * bill type.
   */
  public var subType: CodeableConcept? = null,
  /**
   * A code to indicate whether the nature of the request is: to request adjudication of products
   * and services previously rendered; or requesting authorization and adjudication for provision in
   * the future; or requesting the non-binding adjudication of the listed products and services
   * which could be provided in the future.
   */
  public var use: Enumeration<Use>? = null,
  /**
   * The party to whom the professional services and/or products have been supplied or are being
   * considered and for whom actual or forecast reimbursement is sought.
   */
  public var patient: Reference? = null,
  /**
   * The period for which charges are being submitted.
   *
   * Typically this would be today or in the past for a claim, and today or in the future for
   * preauthorizations and predeterminations. Typically line item dates of service should fall
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
  public var created: DateTime? = null,
  /** Individual who created the claim, predetermination or preauthorization. */
  public var enterer: Reference? = null,
  /** The Insurer who is target of the request. */
  public var insurer: Reference? = null,
  /**
   * The provider which is responsible for the claim, predetermination or preauthorization.
   *
   * Typically this field would be 1..1 where this party is responsible for the claim but not
   * necessarily professionally responsible for the provision of the individual products and
   * services listed below.
   */
  public var provider: Reference? = null,
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
  public var fundsReserve: CodeableConcept? = null,
  /**
   * Other claims which are related to this claim such as prior submissions or claims for related
   * services or for the same event.
   *
   * For example, for the original treatment and follow-up exams.
   */
  public var related: List<Related>? = null,
  /** Prescription to support the dispensing of pharmacy, device or vision products. */
  public var prescription: Reference? = null,
  /**
   * Original prescription which has been superseded by this prescription to support the dispensing
   * of pharmacy services, medications or products.
   *
   * For example, a physician may prescribe a medication which the pharmacy determines is
   * contraindicated, or for which the patient has an intolerance, and therefore issues a new
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
   * patient. The insurer may decline to pay the provider and choose to pay the subscriber instead.
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
   * Details of an accident which resulted in injuries which required the products and services
   * listed in the claim.
   */
  public var accident: Accident? = null,
  /**
   * A claim line. Either a simple product or service or a 'group' of details which can each be a
   * simple items or groups of sub-details.
   */
  public var item: List<Item>? = null,
  /** The total value of the all the items in the claim. */
  public var total: Money? = null,
) : DomainResource() {
  /**
   * Other claims which are related to this claim such as prior submissions or claims for related
   * services or for the same event.
   */
  @Serializable(with = ClaimRelatedSerializer::class)
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
     * For example, Property/Casualty insurer claim # or Workers Compensation case # .
     */
    public var reference: Identifier? = null,
  ) : BackboneElement()

  /**
   * The party to be reimbursed for cost of the products and services according to the terms of the
   * policy.
   */
  @Serializable(with = ClaimPayeeSerializer::class)
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
    /** Type of Party to be reimbursed: subscriber, provider, other. */
    public var type: CodeableConcept? = null,
    /**
     * Reference to the individual or organization to whom any payment will be made.
     *
     * Not required if the payee is 'subscriber' or 'provider'.
     */
    public var party: Reference? = null,
  ) : BackboneElement()

  /** The members of the team who provided the products and services. */
  @Serializable(with = ClaimCareTeamSerializer::class)
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
    /** The qualification of the practitioner which is applicable for this service. */
    public var qualification: CodeableConcept? = null,
  ) : BackboneElement()

  /**
   * Additional information codes regarding exceptions, special considerations, the condition,
   * situation, prior or concurrent issues.
   */
  @Serializable(with = ClaimSupportingInfoSerializer::class)
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
     */
    public var code: CodeableConcept? = null,
    /** The date when or period to which this information refers. */
    public var timing: Timing? = null,
    /**
     * Additional data or information such as resources, documents, images etc. including references
     * to the data or the actual inclusion of the data.
     *
     * Could be used to provide references to other resources, document. For example could contain a
     * PDF in an Attachment of the Police Report for an Accident.
     */
    public var `value`: Value? = null,
    /**
     * Provides the reason in the situation where a reason code is required in addition to the
     * content.
     *
     * For example: the reason for the additional stay, or why a tooth is missing.
     */
    public var reason: CodeableConcept? = null,
  ) : BackboneElement() {
    public sealed interface Timing {
      public fun asDate(): Date? = this as? Date

      public fun asPeriod(): Period? = this as? Period

      public data class Date(public val `value`: com.google.fhir.model.r4b.Date) : Timing

      public data class Period(public val `value`: com.google.fhir.model.r4b.Period) : Timing

      public companion object {
        public fun from(
          dateValue: com.google.fhir.model.r4b.Date?,
          PeriodValue: com.google.fhir.model.r4b.Period?,
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

      public data class Boolean(public val `value`: com.google.fhir.model.r4b.Boolean) : Value

      public data class String(public val `value`: com.google.fhir.model.r4b.String) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r4b.Quantity) : Value

      public data class Attachment(public val `value`: com.google.fhir.model.r4b.Attachment) :
        Value

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) : Value

      public companion object {
        public fun from(
          booleanValue: com.google.fhir.model.r4b.Boolean?,
          stringValue: com.google.fhir.model.r4b.String?,
          QuantityValue: com.google.fhir.model.r4b.Quantity?,
          AttachmentValue: com.google.fhir.model.r4b.Attachment?,
          ReferenceValue: com.google.fhir.model.r4b.Reference?,
        ): Value? {
          if (booleanValue != null) return Boolean(booleanValue)
          if (stringValue != null) return String(stringValue)
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  /** Information about diagnoses relevant to the claim items. */
  @Serializable(with = ClaimDiagnosisSerializer::class)
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
    /**
     * A package billing code or bundle code used to group products and services to a particular
     * health condition (such as heart attack) which is based on a predetermined grouping code
     * system.
     *
     * For example DRG (Diagnosis Related Group) or a bundled billing code. A patient may have a
     * diagnosis of a Myocardial Infarction and a DRG for HeartAttack would be assigned. The Claim
     * item (and possible subsequent claims) would refer to the DRG for those line items that were
     * for services related to the heart attack event.
     */
    public var packageCode: CodeableConcept? = null,
  ) : BackboneElement() {
    public sealed interface Diagnosis {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4b.CodeableConcept
      ) : Diagnosis

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
        Diagnosis

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
          ReferenceValue: com.google.fhir.model.r4b.Reference?,
        ): Diagnosis? {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  /** Procedures performed on the patient relevant to the billing items with the claim. */
  @Serializable(with = ClaimProcedureSerializer::class)
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
    /** A number to uniquely identify procedure entries. */
    public var sequence: PositiveInt? = null,
    /**
     * When the condition was observed or the relative ranking.
     *
     * For example: primary, secondary.
     */
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
        public val `value`: com.google.fhir.model.r4b.CodeableConcept
      ) : Procedure

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
        Procedure

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
          ReferenceValue: com.google.fhir.model.r4b.Reference?,
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
  @Serializable(with = ClaimInsuranceSerializer::class)
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
     * A number to uniquely identify insurance entries and provide a sequence of coverages to convey
     * coordination of benefit order.
     */
    public var sequence: PositiveInt? = null,
    /**
     * A flag to indicate that this Coverage is to be used for adjudication of this claim when set
     * to true.
     *
     * A patient may (will) have multiple insurance policies which provide reimbursement for
     * healthcare services and products. For example a person may also be covered by their spouse's
     * policy and both appear in the list (and may be from the same insurer). This flag will be set
     * to true for only one of the listed policies and that policy will be used for adjudicating
     * this claim. Other claims would be created to request adjudication against the other listed
     * policies.
     */
    public var focal: Boolean? = null,
    /**
     * The business identifier to be used when the claim is sent for adjudication against this
     * insurance policy.
     *
     * Only required in jurisdictions where insurers, rather than the provider, are required to send
     * claims to insurers that appear after them in the list. This element is not required when
     * 'subrogation=true'.
     */
    public var identifier: Identifier? = null,
    /**
     * Reference to the insurance card level information contained in the Coverage resource. The
     * coverage issuing insurer will use these details to locate the patient's actual coverage
     * within the insurer's information system.
     */
    public var coverage: Reference? = null,
    /**
     * A business agreement number established between the provider and the insurer for special
     * business processing purposes.
     */
    public var businessArrangement: String? = null,
    /**
     * Reference numbers previously provided by the insurer to the provider to be quoted on
     * subsequent claims containing services or products related to the prior authorization.
     *
     * This value is an alphanumeric string that may be provided over the phone, via text, via
     * paper, or within a ClaimResponse resource and is not a FHIR Identifier.
     */
    public var preAuthRef: List<String?>? = null,
    /**
     * The result of the adjudication of the line items for the Coverage specified in this
     * insurance.
     *
     * Must not be specified when 'focal=true' for this insurance.
     */
    public var claimResponse: Reference? = null,
  ) : BackboneElement()

  /**
   * Details of an accident which resulted in injuries which required the products and services
   * listed in the claim.
   */
  @Serializable(with = ClaimAccidentSerializer::class)
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

      public data class Address(public val `value`: com.google.fhir.model.r4b.Address) : Location

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
        Location

      public companion object {
        public fun from(
          AddressValue: com.google.fhir.model.r4b.Address?,
          ReferenceValue: com.google.fhir.model.r4b.Reference?,
        ): Location? {
          if (AddressValue != null) return Address(AddressValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  /**
   * A claim line. Either a simple product or service or a 'group' of details which can each be a
   * simple items or groups of sub-details.
   */
  @Serializable(with = ClaimItemSerializer::class)
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
    /** A number to uniquely identify item entries. */
    public var sequence: PositiveInt? = null,
    /** CareTeam members related to this service or product. */
    public var careTeamSequence: List<PositiveInt?>? = null,
    /** Diagnosis applicable for this service or product. */
    public var diagnosisSequence: List<PositiveInt?>? = null,
    /** Procedures applicable for this service or product. */
    public var procedureSequence: List<PositiveInt?>? = null,
    /**
     * Exceptions, special conditions and supporting information applicable for this service or
     * product.
     */
    public var informationSequence: List<PositiveInt?>? = null,
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
    public var productOrService: CodeableConcept? = null,
    /**
     * Item typification or modifiers codes to convey additional context for the product or service.
     *
     * For example in Oral whether the treatment is cosmetic or associated with TMJ, or for Medical
     * whether the treatment was outside the clinic or outside of office hours.
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
    public var udi: List<Reference?>? = null,
    /**
     * Physical service site on the patient (limb, tooth, etc.).
     *
     * For example: Providing a tooth code, allows an insurer to identify a provider performing a
     * filling on a tooth that was previously removed.
     */
    public var bodySite: CodeableConcept? = null,
    /** A region or surface of the bodySite, e.g. limb region or tooth surface(s). */
    public var subSite: List<CodeableConcept?>? = null,
    /**
     * The Encounters during which this Claim was created or to which the creation of this record is
     * tightly associated.
     *
     * This will typically be the encounter the event occurred within, but some activities may be
     * initiated prior to or after the official completion of an encounter but still be tied to the
     * context of the encounter.
     */
    public var encounter: List<Reference?>? = null,
    /**
     * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details which
     * are simple items.
     */
    public var detail: List<Detail>? = null,
  ) : BackboneElement() {
    /**
     * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details which
     * are simple items.
     */
    @Serializable(with = ClaimItemDetailSerializer::class)
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
      override var extension: List<Extension?>? = null,
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
      override var modifierExtension: List<Extension?>? = null,
      /** A number to uniquely identify item entries. */
      public var sequence: PositiveInt? = null,
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
       * RxNorm, ACHI, CCI). If a grouping item then use a group code to indicate the type of thing
       * being grouped e.g. 'glasses' or 'compound'.
       */
      public var productOrService: CodeableConcept? = null,
      /**
       * Item typification or modifiers codes to convey additional context for the product or
       * service.
       *
       * For example in Oral whether the treatment is cosmetic or associated with TMJ, or for
       * Medical whether the treatment was outside the clinic or out of office hours.
       */
      public var modifier: List<CodeableConcept?>? = null,
      /**
       * Identifies the program under which this may be recovered.
       *
       * For example: Neonatal program, child dental program or drug users recovery program.
       */
      public var programCode: List<CodeableConcept?>? = null,
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
      public var udi: List<Reference?>? = null,
      /**
       * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details
       * which are simple items.
       */
      public var subDetail: List<SubDetail>? = null,
    ) : BackboneElement() {
      /**
       * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details
       * which are simple items.
       */
      @Serializable(with = ClaimItemDetailSubDetailSerializer::class)
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
        override var extension: List<Extension?>? = null,
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
        override var modifierExtension: List<Extension?>? = null,
        /** A number to uniquely identify item entries. */
        public var sequence: PositiveInt? = null,
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
        public var productOrService: CodeableConcept? = null,
        /**
         * Item typification or modifiers codes to convey additional context for the product or
         * service.
         *
         * For example in Oral whether the treatment is cosmetic or associated with TMJ, or for
         * Medical whether the treatment was outside the clinic or out of office hours.
         */
        public var modifier: List<CodeableConcept?>? = null,
        /**
         * Identifies the program under which this may be recovered.
         *
         * For example: Neonatal program, child dental program or drug users recovery program.
         */
        public var programCode: List<CodeableConcept?>? = null,
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
        public var udi: List<Reference?>? = null,
      ) : BackboneElement()
    }

    public sealed interface Serviced {
      public fun asDate(): Date? = this as? Date

      public fun asPeriod(): Period? = this as? Period

      public data class Date(public val `value`: com.google.fhir.model.r4b.Date) : Serviced

      public data class Period(public val `value`: com.google.fhir.model.r4b.Period) : Serviced

      public companion object {
        public fun from(
          dateValue: com.google.fhir.model.r4b.Date?,
          PeriodValue: com.google.fhir.model.r4b.Period?,
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
        public val `value`: com.google.fhir.model.r4b.CodeableConcept
      ) : Location

      public data class Address(public val `value`: com.google.fhir.model.r4b.Address) : Location

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
        Location

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
          AddressValue: com.google.fhir.model.r4b.Address?,
          ReferenceValue: com.google.fhir.model.r4b.Reference?,
        ): Location? {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (AddressValue != null) return Address(AddressValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  /** This value set includes Status codes. */
  public enum class ClaimStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The instance is currently in-force. */
    Active(
      "active",
      "http://hl7.org/fhir/fm-status",
      "Active",
      "The instance is currently in-force.",
    ),
    /** The instance is withdrawn, rescinded or reversed. */
    Cancelled(
      "cancelled",
      "http://hl7.org/fhir/fm-status",
      "Cancelled",
      "The instance is withdrawn, rescinded or reversed.",
    ),
    /** A new instance the contents of which is not complete. */
    Draft(
      "draft",
      "http://hl7.org/fhir/fm-status",
      "Draft",
      "A new instance the contents of which is not complete.",
    ),
    /** The instance was entered in error. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/fm-status",
      "Entered in Error",
      "The instance was entered in error.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ClaimStatus =
        when (code) {
          "active" -> Active
          "cancelled" -> Cancelled
          "draft" -> Draft
          "entered-in-error" -> Entered_In_Error
          else -> throw IllegalArgumentException("Unknown code $code for enum ClaimStatus")
        }
    }
  }

  /** The purpose of the Claim: predetermination, preauthorization, claim. */
  public enum class Use(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The treatment is complete and this represents a Claim for the services. */
    Claim(
      "claim",
      "http://hl7.org/fhir/claim-use",
      "Claim",
      "The treatment is complete and this represents a Claim for the services.",
    ),
    /** The treatment is proposed and this represents a Pre-authorization for the services. */
    Preauthorization(
      "preauthorization",
      "http://hl7.org/fhir/claim-use",
      "Preauthorization",
      "The treatment is proposed and this represents a Pre-authorization for the services.",
    ),
    /** The treatment is proposed and this represents a Pre-determination for the services. */
    Predetermination(
      "predetermination",
      "http://hl7.org/fhir/claim-use",
      "Predetermination",
      "The treatment is proposed and this represents a Pre-determination for the services.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

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
}
