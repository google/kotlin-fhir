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

package com.google.fhir.model.r4.surrogates

import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Date
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDate
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Money
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.PaymentNotice
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class PaymentNoticeSurrogate(
  public var id: String? = null,
  public var meta: Meta? = null,
  public var implicitRules: String? = null,
  public var _implicitRules: Element? = null,
  public var language: String? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var request: Reference? = null,
  public var response: Reference? = null,
  public var created: String? = null,
  public var _created: Element? = null,
  public var provider: Reference? = null,
  public var payment: Reference,
  public var paymentDate: String? = null,
  public var _paymentDate: Element? = null,
  public var payee: Reference? = null,
  public var recipient: Reference,
  public var amount: Money,
  public var paymentStatus: CodeableConcept? = null,
) {
  public fun toModel(): PaymentNotice =
    PaymentNotice(
      id = this@PaymentNoticeSurrogate.id,
      meta = this@PaymentNoticeSurrogate.meta,
      implicitRules =
        Uri.of(
          this@PaymentNoticeSurrogate.implicitRules,
          this@PaymentNoticeSurrogate._implicitRules,
        ),
      language =
        Code.of(this@PaymentNoticeSurrogate.language, this@PaymentNoticeSurrogate._language),
      text = this@PaymentNoticeSurrogate.text,
      contained = this@PaymentNoticeSurrogate.contained ?: mutableListOf(),
      extension = this@PaymentNoticeSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@PaymentNoticeSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@PaymentNoticeSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.PaymentNotice.FinancialResourceStatusCodes.fromCode(
            this@PaymentNoticeSurrogate.status!!
          ),
          this@PaymentNoticeSurrogate._status,
        ),
      request = this@PaymentNoticeSurrogate.request,
      response = this@PaymentNoticeSurrogate.response,
      created =
        DateTime.of(
          FhirDateTime.fromString(this@PaymentNoticeSurrogate.created),
          this@PaymentNoticeSurrogate._created,
        )!!,
      provider = this@PaymentNoticeSurrogate.provider,
      payment = this@PaymentNoticeSurrogate.payment,
      paymentDate =
        Date.of(
          FhirDate.fromString(this@PaymentNoticeSurrogate.paymentDate),
          this@PaymentNoticeSurrogate._paymentDate,
        ),
      payee = this@PaymentNoticeSurrogate.payee,
      recipient = this@PaymentNoticeSurrogate.recipient,
      amount = this@PaymentNoticeSurrogate.amount,
      paymentStatus = this@PaymentNoticeSurrogate.paymentStatus,
    )

  public companion object {
    public fun fromModel(model: PaymentNotice): PaymentNoticeSurrogate =
      with(model) {
        PaymentNoticeSurrogate(
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
          request = this@with.request,
          response = this@with.response,
          created = this@with.created.value?.toString(),
          _created = this@with.created.toElement(),
          provider = this@with.provider,
          payment = this@with.payment,
          paymentDate = this@with.paymentDate?.value?.toString(),
          _paymentDate = this@with.paymentDate?.toElement(),
          payee = this@with.payee,
          recipient = this@with.recipient,
          amount = this@with.amount,
          paymentStatus = this@with.paymentStatus,
        )
      }
  }
}
