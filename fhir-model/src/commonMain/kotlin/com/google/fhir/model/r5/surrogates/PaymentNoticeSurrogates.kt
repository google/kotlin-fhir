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

package com.google.fhir.model.r5.surrogates

import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Money
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.PaymentNotice
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var request: Reference? = null,
  public var response: Reference? = null,
  public var created: String? = null,
  public var _created: Element? = null,
  public var reporter: Reference? = null,
  public var payment: Reference? = null,
  public var paymentDate: String? = null,
  public var _paymentDate: Element? = null,
  public var payee: Reference? = null,
  public var recipient: Reference? = null,
  public var amount: Money? = null,
  public var paymentStatus: CodeableConcept? = null,
) {
  public fun toModel(): PaymentNotice =
    PaymentNotice().apply {
      id = this@PaymentNoticeSurrogate.id
      meta = this@PaymentNoticeSurrogate.meta
      implicitRules =
        Uri.of(
          this@PaymentNoticeSurrogate.implicitRules,
          this@PaymentNoticeSurrogate._implicitRules,
        )
      language =
        Code.of(this@PaymentNoticeSurrogate.language, this@PaymentNoticeSurrogate._language)
      text = this@PaymentNoticeSurrogate.text
      contained = this@PaymentNoticeSurrogate.contained
      extension = this@PaymentNoticeSurrogate.extension
      modifierExtension = this@PaymentNoticeSurrogate.modifierExtension
      identifier = this@PaymentNoticeSurrogate.identifier
      status =
        Enumeration.of(
          this@PaymentNoticeSurrogate.status?.let {
            com.google.fhir.model.r5.PaymentNotice.PaymentNoticeStatus.fromCode(it)
          },
          this@PaymentNoticeSurrogate._status,
        )
      request = this@PaymentNoticeSurrogate.request
      response = this@PaymentNoticeSurrogate.response
      created =
        DateTime.of(
          FhirDateTime.fromString(this@PaymentNoticeSurrogate.created),
          this@PaymentNoticeSurrogate._created,
        )
      reporter = this@PaymentNoticeSurrogate.reporter
      payment = this@PaymentNoticeSurrogate.payment
      paymentDate =
        Date.of(
          FhirDate.fromString(this@PaymentNoticeSurrogate.paymentDate),
          this@PaymentNoticeSurrogate._paymentDate,
        )
      payee = this@PaymentNoticeSurrogate.payee
      recipient = this@PaymentNoticeSurrogate.recipient
      amount = this@PaymentNoticeSurrogate.amount
      paymentStatus = this@PaymentNoticeSurrogate.paymentStatus
    }

  public companion object {
    public fun fromModel(model: PaymentNotice): PaymentNoticeSurrogate =
      with(model) {
        PaymentNoticeSurrogate().apply {
          id = this@with.id
          meta = this@with.meta
          implicitRules = this@with.implicitRules?.value
          _implicitRules = this@with.implicitRules?.toElement()
          language = this@with.language?.value
          _language = this@with.language?.toElement()
          text = this@with.text
          contained = this@with.contained
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          request = this@with.request
          response = this@with.response
          created = this@with.created?.value?.toString()
          _created = this@with.created?.toElement()
          reporter = this@with.reporter
          payment = this@with.payment
          paymentDate = this@with.paymentDate?.value?.toString()
          _paymentDate = this@with.paymentDate?.toElement()
          payee = this@with.payee
          recipient = this@with.recipient
          amount = this@with.amount
          paymentStatus = this@with.paymentStatus
        }
      }
  }
}
