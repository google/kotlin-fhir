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

import com.google.fhir.model.r4b.serializers.InvoiceLineItemPriceComponentSerializer
import com.google.fhir.model.r4b.serializers.InvoiceLineItemSerializer
import com.google.fhir.model.r4b.serializers.InvoiceParticipantSerializer
import com.google.fhir.model.r4b.serializers.InvoiceSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Invoice containing collected ChargeItems from an Account with calculated individual and total
 * price for Billing purpose.
 */
@Serializable(with = InvoiceSerializer::class)
@SerialName("Invoice")
public data class Invoice(
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
  /**
   * Identifier of this Invoice, often used for reference in correspondence about this invoice or
   * for tracking of payments.
   */
  public var identifier: List<Identifier?>? = null,
  /** The current state of the Invoice. */
  public var status: Enumeration<InvoiceStatus>? = null,
  /**
   * In case of Invoice cancellation a reason must be given (entered in error, superseded by
   * corrected invoice etc.).
   *
   * Derived Profiles may choose to add invariants requiring this field to be populated if either
   * priceOverride or factorOverride have been filled.
   */
  public var cancelledReason: String? = null,
  /**
   * Type of Invoice depending on domain, realm an usage (e.g. internal/external, dental,
   * preliminary).
   */
  public var type: CodeableConcept? = null,
  /**
   * The individual or set of individuals receiving the goods and services billed in this invoice.
   */
  public var subject: Reference? = null,
  /** The individual or Organization responsible for balancing of this invoice. */
  public var recipient: Reference? = null,
  /**
   * Date/time(s) of when this Invoice was posted.
   *
   * The list of types may be constrained as appropriate for the type of charge item.
   */
  public var date: DateTime? = null,
  /** Indicates who or what performed or participated in the charged service. */
  public var participant: List<Participant>? = null,
  /**
   * The organizationissuing the Invoice.
   *
   * Practitioners and Devices can be associated with multiple organizations. It has to be made
   * clear, on behalf of which Organization the services have been rendered.
   */
  public var issuer: Reference? = null,
  /**
   * Account which is supposed to be balanced with this Invoice.
   *
   * Systems posting the ChargeItems might not always be able to determine, which accounts the Items
   * need to be places into. It is up to the potprocessing Financial System to apply internal rules
   * to decide based on the Encounter/EpisodeOfCare/Patient/Coverage context and the type of
   * ChargeItem, which Account is appropriate.
   */
  public var account: Reference? = null,
  /**
   * Each line item represents one charge for goods and services rendered. Details such as date,
   * code and amount are found in the referenced ChargeItem resource.
   */
  public var lineItem: List<LineItem>? = null,
  /**
   * The total amount for the Invoice may be calculated as the sum of the line items with
   * surcharges/deductions that apply in certain conditions. The priceComponent element can be used
   * to offer transparency to the recipient of the Invoice of how the total price was calculated.
   */
  public var totalPriceComponent: List<LineItem.PriceComponent?>? = null,
  /**
   * Invoice total , taxes excluded.
   *
   * There is no reason to carry the price in the instance of a ChargeItem unless circumstances
   * require a manual override. The list prices or are usually defined in a back catalogue of the
   * billing codes (see ChargeItem.definition). Derived profiles may require a
   * ChargeItem.overrideReason to be provided if either factor or price are manually overridden.
   */
  public var totalNet: Money? = null,
  /**
   * Invoice total, tax included.
   *
   * There is no reason to carry the price in the instance of a ChargeItem unless circumstances
   * require a manual override. The list prices or are usually defined in a back catalogue of the
   * billing codes (see ChargeItem.definition). Derived profiles may require a
   * ChargeItem.overrideReason to be provided if either factor or price are manually overridden.
   */
  public var totalGross: Money? = null,
  /**
   * Payment details such as banking details, period of payment, deductibles, methods of payment.
   *
   * Derived Profiles may chose to add invariants requiring this field to be populated if either
   * priceOverride or factorOverride have been filled.
   */
  public var paymentTerms: Markdown? = null,
  /** Comments made about the invoice by the issuer, subject, or other participants. */
  public var note: List<Annotation?>? = null,
) : DomainResource() {
  /** Indicates who or what performed or participated in the charged service. */
  @Serializable(with = InvoiceParticipantSerializer::class)
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
     * Describes the type of involvement (e.g. transcriptionist, creator etc.). If the invoice has
     * been created automatically, the Participant may be a billing engine or another kind of
     * device.
     */
    public var role: CodeableConcept? = null,
    /** The device, practitioner, etc. who performed or participated in the service. */
    public var actor: Reference? = null,
  ) : BackboneElement()

  /**
   * Each line item represents one charge for goods and services rendered. Details such as date,
   * code and amount are found in the referenced ChargeItem resource.
   */
  @Serializable(with = InvoiceLineItemSerializer::class)
  public class LineItem(
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
    /** Sequence in which the items appear on the invoice. */
    public var sequence: PositiveInt? = null,
    /**
     * The ChargeItem contains information such as the billing code, date, amount etc. If no further
     * details are required for the lineItem, inline billing codes can be added using the
     * CodeableConcept data type instead of the Reference.
     */
    public var chargeItem: ChargeItem? = null,
    /**
     * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that
     * apply in certain conditions. A ChargeItemDefinition resource that defines the prices, factors
     * and conditions that apply to a billing code is currently under development. The
     * priceComponent element can be used to offer transparency to the recipient of the Invoice as
     * to how the prices have been calculated.
     */
    public var priceComponent: List<PriceComponent>? = null,
  ) : BackboneElement() {
    /**
     * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that
     * apply in certain conditions. A ChargeItemDefinition resource that defines the prices, factors
     * and conditions that apply to a billing code is currently under development. The
     * priceComponent element can be used to offer transparency to the recipient of the Invoice as
     * to how the prices have been calculated.
     */
    @Serializable(with = InvoiceLineItemPriceComponentSerializer::class)
    public class PriceComponent(
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
      /** This code identifies the type of the component. */
      public var type: Enumeration<InvoicePriceComponentType>? = null,
      /**
       * A code that identifies the component. Codes may be used to differentiate between kinds of
       * taxes, surcharges, discounts etc.
       */
      public var code: CodeableConcept? = null,
      /**
       * The factor that has been applied on the base price for calculating this component.
       *
       * There is no reason to carry the price in the instance of a ChargeItem unless circumstances
       * require a manual override. The list prices or are usually defined in a back catalogue of
       * the billing codes (see ChargeItem.definition). Derived profiles may require a
       * ChargeItem.overrideReason to be provided if either factor or price are manually overridden.
       */
      public var factor: Decimal? = null,
      /**
       * The amount calculated for this component.
       *
       * There is no reason to carry the price in the instance of a ChargeItem unless circumstances
       * require a manual override. The list prices or are usually defined in a back catalogue of
       * the billing codes (see ChargeItem.definition). Derived profiles may require a
       * ChargeItem.overrideReason to be provided if either factor or price are manually overridden.
       */
      public var amount: Money? = null,
    ) : BackboneElement()

    public sealed interface ChargeItem {
      public fun asReference(): Reference? = this as? Reference

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
        ChargeItem

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4b.CodeableConcept
      ) : ChargeItem

      public companion object {
        public fun from(
          ReferenceValue: com.google.fhir.model.r4b.Reference?,
          CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
        ): ChargeItem? {
          if (ReferenceValue != null) return Reference(ReferenceValue)
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          return null
        }
      }
    }
  }

  /** Codes indicating the kind of the price component. */
  public enum class InvoicePriceComponentType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * the amount is the base price used for calculating the total price before applying surcharges,
     * discount or taxes.
     */
    Base(
      "base",
      "http://hl7.org/fhir/invoice-priceComponentType",
      "base price",
      "the amount is the base price used for calculating the total price before applying surcharges, discount or taxes.",
    ),
    /** the amount is a surcharge applied on the base price. */
    Surcharge(
      "surcharge",
      "http://hl7.org/fhir/invoice-priceComponentType",
      "surcharge",
      "the amount is a surcharge applied on the base price.",
    ),
    /** the amount is a deduction applied on the base price. */
    Deduction(
      "deduction",
      "http://hl7.org/fhir/invoice-priceComponentType",
      "deduction",
      "the amount is a deduction applied on the base price.",
    ),
    /** the amount is a discount applied on the base price. */
    Discount(
      "discount",
      "http://hl7.org/fhir/invoice-priceComponentType",
      "discount",
      "the amount is a discount applied on the base price.",
    ),
    /** the amount is the tax component of the total price. */
    Tax(
      "tax",
      "http://hl7.org/fhir/invoice-priceComponentType",
      "tax",
      "the amount is the tax component of the total price.",
    ),
    /**
     * the amount is of informational character, it has not been applied in the calculation of the
     * total price.
     */
    Informational(
      "informational",
      "http://hl7.org/fhir/invoice-priceComponentType",
      "informational",
      "the amount is of informational character, it has not been applied in the calculation of the total price.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): InvoicePriceComponentType =
        when (code) {
          "base" -> Base
          "surcharge" -> Surcharge
          "deduction" -> Deduction
          "discount" -> Discount
          "tax" -> Tax
          "informational" -> Informational
          else ->
            throw IllegalArgumentException("Unknown code $code for enum InvoicePriceComponentType")
        }
    }
  }

  /** Codes identifying the lifecycle stage of an Invoice. */
  public enum class InvoiceStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** the invoice has been prepared but not yet finalized. */
    Draft(
      "draft",
      "http://hl7.org/fhir/invoice-status",
      "draft",
      "the invoice has been prepared but not yet finalized.",
    ),
    /** the invoice has been finalized and sent to the recipient. */
    Issued(
      "issued",
      "http://hl7.org/fhir/invoice-status",
      "issued",
      "the invoice has been finalized and sent to the recipient.",
    ),
    /** the invoice has been balaced / completely paid. */
    Balanced(
      "balanced",
      "http://hl7.org/fhir/invoice-status",
      "balanced",
      "the invoice has been balaced / completely paid.",
    ),
    /** the invoice was cancelled. */
    Cancelled(
      "cancelled",
      "http://hl7.org/fhir/invoice-status",
      "cancelled",
      "the invoice was cancelled.",
    ),
    /** the invoice was determined as entered in error before it was issued. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/invoice-status",
      "entered in error",
      "the invoice was determined as entered in error before it was issued.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): InvoiceStatus =
        when (code) {
          "draft" -> Draft
          "issued" -> Issued
          "balanced" -> Balanced
          "cancelled" -> Cancelled
          "entered-in-error" -> Entered_In_Error
          else -> throw IllegalArgumentException("Unknown code $code for enum InvoiceStatus")
        }
    }
  }
}
