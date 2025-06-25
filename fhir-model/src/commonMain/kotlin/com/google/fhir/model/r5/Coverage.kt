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

import com.google.fhir.model.r5.serializers.CoverageClassSerializer
import com.google.fhir.model.r5.serializers.CoverageCostToBeneficiaryExceptionSerializer
import com.google.fhir.model.r5.serializers.CoverageCostToBeneficiarySerializer
import com.google.fhir.model.r5.serializers.CoveragePaymentBySerializer
import com.google.fhir.model.r5.serializers.CoverageSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Financial instrument which may be used to reimburse or pay for health care products and services.
 * Includes both insurance and self-payment.
 */
@Serializable(with = CoverageSerializer::class)
@SerialName("Coverage")
public data class Coverage(
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
   * The identifier of the coverage as issued by the insurer.
   *
   * The main (and possibly only) identifier for the coverage - often referred to as a Member Id,
   * Certificate number, Personal Health Number or Case ID. May be constructed as the concatenation
   * of the Coverage.SubscriberID and the Coverage.dependant. Note that not all insurers issue
   * unique member IDs therefore searches may result in multiple responses.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The status of the resource instance.
   *
   * This element is labeled as a modifier because the status contains the code entered-in-error
   * that marks the coverage as not currently valid.
   */
  public var status: Enumeration<CoverageStatus>? = null,
  /** The nature of the coverage be it insurance, or cash payment such as self-pay. */
  public var kind: Enumeration<CoverageKind>? = null,
  /** Link to the paying party and optionally what specifically they will be responsible to pay. */
  public var paymentBy: List<PaymentBy>? = null,
  /**
   * The type of coverage: social program, medical plan, accident coverage (workers compensation,
   * auto), group health or payment by an individual or organization.
   */
  public var type: CodeableConcept? = null,
  /**
   * The party who 'owns' the insurance policy.
   *
   * For example: may be an individual, corporation or the subscriber's employer.
   */
  public var policyHolder: Reference? = null,
  /**
   * The party who has signed-up for or 'owns' the contractual relationship to the policy or to whom
   * the benefit of the policy for services rendered to them or their family is due.
   *
   * May be self or a parent in the case of dependants. A subscriber is only required on certain
   * types of policies not all policies and that it is appropriate to have just a policyholder and a
   * beneficiary when not other party can join that policy instance.
   */
  public var subscriber: Reference? = null,
  /** The insurer assigned ID for the Subscriber. */
  public var subscriberId: List<Identifier?>? = null,
  /**
   * The party who benefits from the insurance coverage; the patient when products and/or services
   * are provided.
   */
  public var beneficiary: Reference? = null,
  /**
   * A designator for a dependent under the coverage.
   *
   * Sometimes the member number is constructed from the subscriberId and the dependant number.
   */
  public var dependent: String? = null,
  /**
   * The relationship of beneficiary (patient) to the subscriber.
   *
   * Typically, an individual uses policies which are theirs (relationship='self') before policies
   * owned by others.
   */
  public var relationship: CodeableConcept? = null,
  /**
   * Time period during which the coverage is in force. A missing start date indicates the start
   * date isn't known, a missing end date means the coverage is continuing to be in force.
   */
  public var period: Period? = null,
  /**
   * The program or plan underwriter, payor, insurance company.
   *
   * May provide multiple identifiers such as insurance company identifier or business identifier
   * (BIN number).
   */
  public var insurer: Reference? = null,
  /**
   * A suite of underwriter specific classifiers.
   *
   * For example, class may be used to identify a class of coverage or employer group, policy, or
   * plan.
   */
  public var `class`: List<Class>? = null,
  /**
   * The order of applicability of this coverage relative to other coverages which are currently in
   * force. Note, there may be gaps in the numbering and this does not imply primary, secondary etc.
   * as the specific positioning of coverages depends upon the episode of care. For example; a
   * patient might have (0) auto insurance (1) their own health insurance and (2) spouse's health
   * insurance. When claiming for treatments which were not the result of an auto accident then only
   * coverages (1) and (2) above would be applicatble and would apply in the order specified in
   * parenthesis.
   */
  public var order: PositiveInt? = null,
  /**
   * The insurer-specific identifier for the insurer-defined network of providers to which the
   * beneficiary may seek treatment which will be covered at the 'in-network' rate, otherwise 'out
   * of network' terms and conditions apply.
   */
  public var network: String? = null,
  /**
   * A suite of codes indicating the cost category and associated amount which have been detailed in
   * the policy and may have been included on the health card.
   *
   * For example by knowing the patient visit co-pay, the provider can collect the amount prior to
   * undertaking treatment.
   */
  public var costToBeneficiary: List<CostToBeneficiary>? = null,
  /**
   * When 'subrogation=true' this insurance instance has been included not for adjudication but to
   * provide insurers with the details to recover costs.
   *
   * Typically, automotive and worker's compensation policies would be flagged with
   * 'subrogation=true' to enable healthcare payors to collect against accident claims.
   */
  public var subrogation: Boolean? = null,
  /** The policy(s) which constitute this insurance coverage. */
  public var contract: List<Reference?>? = null,
  /** The insurance plan details, benefits and costs, which constitute this insurance coverage. */
  public var insurancePlan: Reference? = null,
) : DomainResource() {
  /** Link to the paying party and optionally what specifically they will be responsible to pay. */
  @Serializable(with = CoveragePaymentBySerializer::class)
  public class PaymentBy(
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
    /** The list of parties providing non-insurance payment for the treatment costs. */
    public var party: Reference? = null,
    /** Description of the financial responsibility. */
    public var responsibility: String? = null,
  ) : BackboneElement()

  /** A suite of underwriter specific classifiers. */
  @Serializable(with = CoverageClassSerializer::class)
  public class Class(
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
     * The type of classification for which an insurer-specific class label or number and optional
     * name is provided. For example, type may be used to identify a class of coverage or employer
     * group, policy, or plan.
     */
    public var type: CodeableConcept? = null,
    /**
     * The alphanumeric identifier associated with the insurer issued label.
     *
     * For example, the Group or Plan number.
     */
    public var `value`: Identifier? = null,
    /** A short description for the class. */
    public var name: String? = null,
  ) : BackboneElement()

  /**
   * A suite of codes indicating the cost category and associated amount which have been detailed in
   * the policy and may have been included on the health card.
   */
  @Serializable(with = CoverageCostToBeneficiarySerializer::class)
  public class CostToBeneficiary(
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
     * The category of patient centric costs associated with treatment.
     *
     * For example visit, specialist visits, emergency, inpatient care, etc.
     */
    public var type: CodeableConcept? = null,
    /**
     * Code to identify the general type of benefits under which products and services are provided.
     *
     * Examples include Medical Care, Periodontics, Renal Dialysis, Vision Coverage.
     */
    public var category: CodeableConcept? = null,
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
    /**
     * The amount due from the patient for the cost category.
     *
     * Amount may be expressed as a percentage of the service/product cost or a fixed amount of
     * currency.
     */
    public var `value`: Value? = null,
    /**
     * A suite of codes indicating exceptions or reductions to patient costs and their effective
     * periods.
     */
    public var exception: List<Exception>? = null,
  ) : BackboneElement() {
    /**
     * A suite of codes indicating exceptions or reductions to patient costs and their effective
     * periods.
     */
    @Serializable(with = CoverageCostToBeneficiaryExceptionSerializer::class)
    public class Exception(
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
      /** The code for the specific exception. */
      public var type: CodeableConcept? = null,
      /** The timeframe the exception is in force. */
      public var period: Period? = null,
    ) : BackboneElement()

    public sealed interface Value {
      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asMoney(): Money? = this as? Money

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

      public data class Money(public val `value`: com.google.fhir.model.r5.Money) : Value

      public companion object {
        public fun from(
          QuantityValue: com.google.fhir.model.r5.Quantity?,
          MoneyValue: com.google.fhir.model.r5.Money?,
        ): Value? {
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (MoneyValue != null) return Money(MoneyValue)
          return null
        }
      }
    }
  }

  /** This value set includes Status codes. */
  public enum class CoverageStatus(
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
      public fun fromCode(code: kotlin.String): CoverageStatus =
        when (code) {
          "active" -> Active
          "cancelled" -> Cancelled
          "draft" -> Draft
          "entered-in-error" -> Entered_In_Error
          else -> throw IllegalArgumentException("Unknown code $code for enum CoverageStatus")
        }
    }
  }

  /** The kind of coverage: insurance, selfpay or other. */
  public enum class CoverageKind(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The Coverage provides the identifiers and card-level details of an insurance policy. */
    Insurance(
      "insurance",
      "http://hl7.org/fhir/coverage-kind",
      "Insurance",
      "The Coverage provides the identifiers and card-level details of an insurance policy.",
    ),
    /** One or more persons and/or organizations are paying for the services rendered. */
    Self_Pay(
      "self-pay",
      "http://hl7.org/fhir/coverage-kind",
      "Self-pay",
      "One or more persons and/or organizations are paying for the services rendered.",
    ),
    /** Some other organization is paying for the service. */
    Other(
      "other",
      "http://hl7.org/fhir/coverage-kind",
      "Other",
      "Some other organization is paying for the service.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): CoverageKind =
        when (code) {
          "insurance" -> Insurance
          "self-pay" -> Self_Pay
          "other" -> Other
          else -> throw IllegalArgumentException("Unknown code $code for enum CoverageKind")
        }
    }
  }
}
