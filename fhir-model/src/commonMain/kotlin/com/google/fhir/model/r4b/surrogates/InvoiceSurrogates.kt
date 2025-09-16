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

@file:UseSerializers(DoubleSerializer::class, LocalTimeSerializer::class)
@file:Suppress("RedundantVisibilityModifier", "PropertyName")

package com.google.fhir.model.r4b.surrogates

import com.google.fhir.model.r4b.Annotation
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Decimal
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Invoice
import com.google.fhir.model.r4b.Markdown
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Money
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.PositiveInt
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class InvoiceParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var role: CodeableConcept? = null,
  public var actor: Reference,
) {
  public fun toModel(): Invoice.Participant =
    Invoice.Participant(
      id = this@InvoiceParticipantSurrogate.id,
      extension = this@InvoiceParticipantSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@InvoiceParticipantSurrogate.modifierExtension ?: mutableListOf(),
      role = this@InvoiceParticipantSurrogate.role,
      actor = this@InvoiceParticipantSurrogate.actor,
    )

  public companion object {
    public fun fromModel(model: Invoice.Participant): InvoiceParticipantSurrogate =
      with(model) {
        InvoiceParticipantSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          role = this@with.role,
          actor = this@with.actor,
        )
      }
  }
}

@Serializable
internal data class InvoiceLineItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var chargeItem: Invoice.LineItem.ChargeItem,
  public var priceComponent: MutableList<Invoice.LineItem.PriceComponent>? = null,
) {
  public fun toModel(): Invoice.LineItem =
    Invoice.LineItem(
      id = this@InvoiceLineItemSurrogate.id,
      extension = this@InvoiceLineItemSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@InvoiceLineItemSurrogate.modifierExtension ?: mutableListOf(),
      sequence =
        PositiveInt.of(
          this@InvoiceLineItemSurrogate.sequence,
          this@InvoiceLineItemSurrogate._sequence,
        ),
      chargeItem = this@InvoiceLineItemSurrogate.chargeItem,
      priceComponent = this@InvoiceLineItemSurrogate.priceComponent ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Invoice.LineItem): InvoiceLineItemSurrogate =
      with(model) {
        InvoiceLineItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          sequence = this@with.sequence?.value,
          _sequence = this@with.sequence?.toElement(),
          chargeItem = this@with.chargeItem,
          priceComponent = this@with.priceComponent.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class InvoiceLineItemPriceComponentSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var code: CodeableConcept? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var amount: Money? = null,
) {
  public fun toModel(): Invoice.LineItem.PriceComponent =
    Invoice.LineItem.PriceComponent(
      id = this@InvoiceLineItemPriceComponentSurrogate.id,
      extension = this@InvoiceLineItemPriceComponentSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@InvoiceLineItemPriceComponentSurrogate.modifierExtension ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r4b.Invoice.InvoicePriceComponentType.fromCode(
            this@InvoiceLineItemPriceComponentSurrogate.type!!
          ),
          this@InvoiceLineItemPriceComponentSurrogate._type,
        ),
      code = this@InvoiceLineItemPriceComponentSurrogate.code,
      factor =
        Decimal.of(
          this@InvoiceLineItemPriceComponentSurrogate.factor,
          this@InvoiceLineItemPriceComponentSurrogate._factor,
        ),
      amount = this@InvoiceLineItemPriceComponentSurrogate.amount,
    )

  public companion object {
    public fun fromModel(
      model: Invoice.LineItem.PriceComponent
    ): InvoiceLineItemPriceComponentSurrogate =
      with(model) {
        InvoiceLineItemPriceComponentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          code = this@with.code,
          factor = this@with.factor?.value,
          _factor = this@with.factor?.toElement(),
          amount = this@with.amount,
        )
      }
  }
}

@Serializable
internal data class InvoiceLineItemChargeItemSurrogate(
  public var chargeItemReference: Reference? = null,
  public var chargeItemCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): Invoice.LineItem.ChargeItem =
    Invoice.LineItem.ChargeItem.from(
      this@InvoiceLineItemChargeItemSurrogate.chargeItemReference,
      this@InvoiceLineItemChargeItemSurrogate.chargeItemCodeableConcept,
    )!! !!

  public companion object {
    public fun fromModel(model: Invoice.LineItem.ChargeItem): InvoiceLineItemChargeItemSurrogate =
      with(model) {
        InvoiceLineItemChargeItemSurrogate(
          chargeItemReference = this@with.asReference()?.value,
          chargeItemCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class InvoiceSurrogate(
  public var id: KotlinString? = null,
  public var meta: Meta? = null,
  public var implicitRules: KotlinString? = null,
  public var _implicitRules: Element? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var cancelledReason: KotlinString? = null,
  public var _cancelledReason: Element? = null,
  public var type: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var recipient: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var participant: MutableList<Invoice.Participant>? = null,
  public var issuer: Reference? = null,
  public var account: Reference? = null,
  public var lineItem: MutableList<Invoice.LineItem>? = null,
  public var totalPriceComponent: MutableList<Invoice.LineItem.PriceComponent>? = null,
  public var totalNet: Money? = null,
  public var totalGross: Money? = null,
  public var paymentTerms: KotlinString? = null,
  public var _paymentTerms: Element? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): Invoice =
    Invoice(
      id = this@InvoiceSurrogate.id,
      meta = this@InvoiceSurrogate.meta,
      implicitRules =
        Uri.of(this@InvoiceSurrogate.implicitRules, this@InvoiceSurrogate._implicitRules),
      language = Code.of(this@InvoiceSurrogate.language, this@InvoiceSurrogate._language),
      text = this@InvoiceSurrogate.text,
      contained = this@InvoiceSurrogate.contained ?: mutableListOf(),
      extension = this@InvoiceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@InvoiceSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@InvoiceSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.Invoice.InvoiceStatus.fromCode(this@InvoiceSurrogate.status!!),
          this@InvoiceSurrogate._status,
        ),
      cancelledReason =
        R4bString.of(this@InvoiceSurrogate.cancelledReason, this@InvoiceSurrogate._cancelledReason),
      type = this@InvoiceSurrogate.type,
      subject = this@InvoiceSurrogate.subject,
      recipient = this@InvoiceSurrogate.recipient,
      date =
        DateTime.of(
          FhirDateTime.fromString(this@InvoiceSurrogate.date),
          this@InvoiceSurrogate._date,
        ),
      participant = this@InvoiceSurrogate.participant ?: mutableListOf(),
      issuer = this@InvoiceSurrogate.issuer,
      account = this@InvoiceSurrogate.account,
      lineItem = this@InvoiceSurrogate.lineItem ?: mutableListOf(),
      totalPriceComponent = this@InvoiceSurrogate.totalPriceComponent ?: mutableListOf(),
      totalNet = this@InvoiceSurrogate.totalNet,
      totalGross = this@InvoiceSurrogate.totalGross,
      paymentTerms =
        Markdown.of(this@InvoiceSurrogate.paymentTerms, this@InvoiceSurrogate._paymentTerms),
      note = this@InvoiceSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Invoice): InvoiceSurrogate =
      with(model) {
        InvoiceSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeUnless { it.all { it == null } },
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          cancelledReason = this@with.cancelledReason?.value,
          _cancelledReason = this@with.cancelledReason?.toElement(),
          type = this@with.type,
          subject = this@with.subject,
          recipient = this@with.recipient,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          participant = this@with.participant.takeUnless { it.all { it == null } },
          issuer = this@with.issuer,
          account = this@with.account,
          lineItem = this@with.lineItem.takeUnless { it.all { it == null } },
          totalPriceComponent = this@with.totalPriceComponent.takeUnless { it.all { it == null } },
          totalNet = this@with.totalNet,
          totalGross = this@with.totalGross,
          paymentTerms = this@with.paymentTerms?.value,
          _paymentTerms = this@with.paymentTerms?.toElement(),
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}
