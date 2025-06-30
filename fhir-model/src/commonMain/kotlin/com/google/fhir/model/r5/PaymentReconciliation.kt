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

import com.google.fhir.model.r5.serializers.PaymentReconciliationAllocationSerializer
import com.google.fhir.model.r5.serializers.PaymentReconciliationProcessNoteSerializer
import com.google.fhir.model.r5.serializers.PaymentReconciliationSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This resource provides the details including amount of a payment and allocates the payment items
 * being paid.
 */
@Serializable(with = PaymentReconciliationSerializer::class)
@SerialName("PaymentReconciliation")
public data class PaymentReconciliation(
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
  /** A unique identifier assigned to this payment reconciliation. */
  public var identifier: List<Identifier?>? = null,
  /** Code to indicate the nature of the payment such as payment, adjustment. */
  public var type: CodeableConcept? = null,
  /**
   * The status of the resource instance.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<PaymentReconciliationStatus>? = null,
  /**
   * The workflow or activity which gave rise to or during which the payment ocurred such as a
   * kiosk, deposit on account, periodic payment etc.
   */
  public var kind: CodeableConcept? = null,
  /**
   * The period of time for which payments have been gathered into this bulk payment for settlement.
   */
  public var period: Period? = null,
  /** The date when the resource was created. */
  public var created: DateTime? = null,
  /** Payment enterer if not the actual payment issuer. */
  public var enterer: Reference? = null,
  /** The type of the source such as patient or insurance. */
  public var issuerType: CodeableConcept? = null,
  /**
   * The party who generated the payment.
   *
   * This party is also responsible for the reconciliation.
   */
  public var paymentIssuer: Reference? = null,
  /** Original request resource reference. */
  public var request: Reference? = null,
  /** The practitioner who is responsible for the services rendered to the patient. */
  public var requestor: Reference? = null,
  /**
   * The outcome of a request for a reconciliation.
   *
   * The resource may be used to indicate that: the request has been held (queued) for processing;
   * that it has been processed and errors found (error); that no errors were found and that some of
   * the adjudication has been undertaken (partial) or that all of the adjudication has been
   * undertaken (complete).
   */
  public var outcome: Enumeration<PaymentOutcome>? = null,
  /** A human readable description of the status of the request for the reconciliation. */
  public var disposition: String? = null,
  /** The date of payment as indicated on the financial instrument. */
  public var date: Date? = null,
  /**
   * The location of the site or device for electronic transfers or physical location for cash
   * payments.
   */
  public var location: Reference? = null,
  /** The means of payment such as check, card cash, or electronic funds transfer. */
  public var method: CodeableConcept? = null,
  /** The card brand such as debit, Visa, Amex etc. used if a card is the method of payment. */
  public var cardBrand: String? = null,
  /**
   * A portion of the account number, often the last 4 digits, used for verification not charging
   * purposes.
   */
  public var accountNumber: String? = null,
  /** The year and month (YYYY-MM) when the instrument, typically card, expires. */
  public var expirationDate: Date? = null,
  /** The name of the card processor, etf processor, bank for checks. */
  public var processor: String? = null,
  /** The check number, eft reference, car processor reference. */
  public var referenceNumber: String? = null,
  /** An alphanumeric issued by the processor to confirm the successful issuance of payment. */
  public var authorization: String? = null,
  /**
   * The amount offered by the issuer, typically applies to cash when the issuer provides an amount
   * in bank note denominations equal to or excess of the amount actually being paid.
   */
  public var tenderedAmount: Money? = null,
  /**
   * The amount returned by the receiver which is excess to the amount payable, often referred to as
   * 'change'.
   */
  public var returnedAmount: Money? = null,
  /** Total payment amount as indicated on the financial instrument. */
  public var amount: Money? = null,
  /**
   * Issuer's unique identifier for the payment instrument.
   *
   * For example: EFT number or check number.
   */
  public var paymentIdentifier: Identifier? = null,
  /** Distribution of the payment amount for a previously acknowledged payable. */
  public var allocation: List<Allocation>? = null,
  /**
   * A code for the form to be used for printing the content.
   *
   * May be needed to identify specific jurisdictional forms.
   */
  public var formCode: CodeableConcept? = null,
  /** A note that describes or explains the processing in a human readable form. */
  public var processNote: List<ProcessNote>? = null,
) : DomainResource() {
  /** Distribution of the payment amount for a previously acknowledged payable. */
  @Serializable(with = PaymentReconciliationAllocationSerializer::class)
  public class Allocation(
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
    /** Unique identifier for the current payment item for the referenced payable. */
    public var identifier: Identifier? = null,
    /** Unique identifier for the prior payment item for the referenced payable. */
    public var predecessor: Identifier? = null,
    /** Specific resource to which the payment/adjustment/advance applies. */
    public var target: Reference? = null,
    /**
     * Identifies the claim line item, encounter or other sub-element being paid. Note payment may
     * be partial, that is not match the then outstanding balance or amount incurred.
     */
    public var targetItem: TargetItem? = null,
    /**
     * The Encounter to which this payment applies, may be completed by the receiver, used for
     * search.
     */
    public var encounter: Reference? = null,
    /**
     * The Account to which this payment applies, may be completed by the receiver, used for search.
     */
    public var account: Reference? = null,
    /**
     * Code to indicate the nature of the payment.
     *
     * For example: payment, adjustment, funds advance, etc.
     */
    public var type: CodeableConcept? = null,
    /** The party which submitted the claim or financial transaction. */
    public var submitter: Reference? = null,
    /** A resource, such as a ClaimResponse, which contains a commitment to payment. */
    public var response: Reference? = null,
    /** The date from the response resource containing a commitment to pay. */
    public var date: Date? = null,
    /**
     * A reference to the individual who is responsible for inquiries regarding the response and its
     * payment.
     */
    public var responsible: Reference? = null,
    /** The party which is receiving the payment. */
    public var payee: Reference? = null,
    /** The monetary amount allocated from the total payment to the payable. */
    public var amount: Money? = null,
  ) : BackboneElement() {
    public sealed interface TargetItem {
      public fun asString(): String? = this as? String

      public fun asIdentifier(): Identifier? = this as? Identifier

      public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

      public data class String(public val `value`: com.google.fhir.model.r5.String) : TargetItem

      public data class Identifier(public val `value`: com.google.fhir.model.r5.Identifier) :
        TargetItem

      public data class PositiveInt(public val `value`: com.google.fhir.model.r5.PositiveInt) :
        TargetItem

      public companion object {
        public fun from(
          stringValue: com.google.fhir.model.r5.String?,
          IdentifierValue: com.google.fhir.model.r5.Identifier?,
          positiveIntValue: com.google.fhir.model.r5.PositiveInt?,
        ): TargetItem? {
          if (stringValue != null) return String(stringValue)
          if (IdentifierValue != null) return Identifier(IdentifierValue)
          if (positiveIntValue != null) return PositiveInt(positiveIntValue)
          return null
        }
      }
    }
  }

  /** A note that describes or explains the processing in a human readable form. */
  @Serializable(with = PaymentReconciliationProcessNoteSerializer::class)
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
    /** The business purpose of the note text. */
    public var type: Enumeration<NoteType>? = null,
    /** The explanation or description associated with the processing. */
    public var text: String? = null,
  ) : BackboneElement()

  /** This value set includes Status codes. */
  public enum class PaymentReconciliationStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Active("active", "http://hl7.org/fhir/fm-status", "Active", null),
    Cancelled("cancelled", "http://hl7.org/fhir/fm-status", "Cancelled", null),
    Draft("draft", "http://hl7.org/fhir/fm-status", "Draft", null),
    Entered_In_Error("entered-in-error", "http://hl7.org/fhir/fm-status", "Entered in Error", null);

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): PaymentReconciliationStatus =
        when (code) {
          "active" -> Active
          "cancelled" -> Cancelled
          "draft" -> Draft
          "entered-in-error" -> Entered_In_Error
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum PaymentReconciliationStatus"
            )
        }
    }
  }

  /** The outcome of the processing. */
  public enum class PaymentOutcome(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Queued("queued", "http://hl7.org/fhir/payment-outcome", "Queued", null),
    Complete("complete", "http://hl7.org/fhir/payment-outcome", "Processing Complete", null),
    Error("error", "http://hl7.org/fhir/payment-outcome", "Error", null),
    Partial("partial", "http://hl7.org/fhir/payment-outcome", "Partial Processing", null);

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): PaymentOutcome =
        when (code) {
          "queued" -> Queued
          "complete" -> Complete
          "error" -> Error
          "partial" -> Partial
          else -> throw IllegalArgumentException("Unknown code $code for enum PaymentOutcome")
        }
    }
  }
}
