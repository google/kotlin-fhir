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
import com.google.fhir.model.r4.PaymentReconciliation
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class PaymentReconciliationDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: Identifier? = null,
  public var predecessor: Identifier? = null,
  public var type: CodeableConcept,
  public var request: Reference? = null,
  public var submitter: Reference? = null,
  public var response: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var responsible: Reference? = null,
  public var payee: Reference? = null,
  public var amount: Money? = null,
) {
  public fun toModel(): PaymentReconciliation.Detail =
    PaymentReconciliation.Detail(
      id = this@PaymentReconciliationDetailSurrogate.id,
      extension = this@PaymentReconciliationDetailSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PaymentReconciliationDetailSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@PaymentReconciliationDetailSurrogate.identifier,
      predecessor = this@PaymentReconciliationDetailSurrogate.predecessor,
      type = this@PaymentReconciliationDetailSurrogate.type,
      request = this@PaymentReconciliationDetailSurrogate.request,
      submitter = this@PaymentReconciliationDetailSurrogate.submitter,
      response = this@PaymentReconciliationDetailSurrogate.response,
      date =
        Date.of(
          FhirDate.fromString(this@PaymentReconciliationDetailSurrogate.date),
          this@PaymentReconciliationDetailSurrogate._date,
        ),
      responsible = this@PaymentReconciliationDetailSurrogate.responsible,
      payee = this@PaymentReconciliationDetailSurrogate.payee,
      amount = this@PaymentReconciliationDetailSurrogate.amount,
    )

  public companion object {
    public fun fromModel(
      model: PaymentReconciliation.Detail
    ): PaymentReconciliationDetailSurrogate =
      with(model) {
        PaymentReconciliationDetailSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier,
          predecessor = this@with.predecessor,
          type = this@with.type,
          request = this@with.request,
          submitter = this@with.submitter,
          response = this@with.response,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          responsible = this@with.responsible,
          payee = this@with.payee,
          amount = this@with.amount,
        )
      }
  }
}

@Serializable
internal data class PaymentReconciliationProcessNoteSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
) {
  public fun toModel(): PaymentReconciliation.ProcessNote =
    PaymentReconciliation.ProcessNote(
      id = this@PaymentReconciliationProcessNoteSurrogate.id,
      extension = this@PaymentReconciliationProcessNoteSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PaymentReconciliationProcessNoteSurrogate.modifierExtension ?: mutableListOf(),
      type =
        this@PaymentReconciliationProcessNoteSurrogate.type?.let {
          Enumeration.of(
            com.google.fhir.model.r4.NoteType.fromCode(it!!),
            this@PaymentReconciliationProcessNoteSurrogate._type,
          )
        },
      text =
        R4String.of(
          this@PaymentReconciliationProcessNoteSurrogate.text,
          this@PaymentReconciliationProcessNoteSurrogate._text,
        ),
    )

  public companion object {
    public fun fromModel(
      model: PaymentReconciliation.ProcessNote
    ): PaymentReconciliationProcessNoteSurrogate =
      with(model) {
        PaymentReconciliationProcessNoteSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type?.value?.getCode(),
          _type = this@with.type?.toElement(),
          text = this@with.text?.value,
          _text = this@with.text?.toElement(),
        )
      }
  }
}

@Serializable
internal data class PaymentReconciliationSurrogate(
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
  public var period: Period? = null,
  public var created: KotlinString? = null,
  public var _created: Element? = null,
  public var paymentIssuer: Reference? = null,
  public var request: Reference? = null,
  public var requestor: Reference? = null,
  public var outcome: KotlinString? = null,
  public var _outcome: Element? = null,
  public var disposition: KotlinString? = null,
  public var _disposition: Element? = null,
  public var paymentDate: KotlinString? = null,
  public var _paymentDate: Element? = null,
  public var paymentAmount: Money,
  public var paymentIdentifier: Identifier? = null,
  public var detail: MutableList<PaymentReconciliation.Detail>? = null,
  public var formCode: CodeableConcept? = null,
  public var processNote: MutableList<PaymentReconciliation.ProcessNote>? = null,
) {
  public fun toModel(): PaymentReconciliation =
    PaymentReconciliation(
      id = this@PaymentReconciliationSurrogate.id,
      meta = this@PaymentReconciliationSurrogate.meta,
      implicitRules =
        Uri.of(
          this@PaymentReconciliationSurrogate.implicitRules,
          this@PaymentReconciliationSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@PaymentReconciliationSurrogate.language,
          this@PaymentReconciliationSurrogate._language,
        ),
      text = this@PaymentReconciliationSurrogate.text,
      contained = this@PaymentReconciliationSurrogate.contained ?: mutableListOf(),
      extension = this@PaymentReconciliationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@PaymentReconciliationSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@PaymentReconciliationSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.PaymentReconciliation.PaymentReconciliationStatus.fromCode(
            this@PaymentReconciliationSurrogate.status!!
          ),
          this@PaymentReconciliationSurrogate._status,
        ),
      period = this@PaymentReconciliationSurrogate.period,
      created =
        DateTime.of(
          FhirDateTime.fromString(this@PaymentReconciliationSurrogate.created),
          this@PaymentReconciliationSurrogate._created,
        )!!,
      paymentIssuer = this@PaymentReconciliationSurrogate.paymentIssuer,
      request = this@PaymentReconciliationSurrogate.request,
      requestor = this@PaymentReconciliationSurrogate.requestor,
      outcome =
        this@PaymentReconciliationSurrogate.outcome?.let {
          Enumeration.of(
            com.google.fhir.model.r4.RemittanceOutcome.fromCode(it!!),
            this@PaymentReconciliationSurrogate._outcome,
          )
        },
      disposition =
        R4String.of(
          this@PaymentReconciliationSurrogate.disposition,
          this@PaymentReconciliationSurrogate._disposition,
        ),
      paymentDate =
        Date.of(
          FhirDate.fromString(this@PaymentReconciliationSurrogate.paymentDate),
          this@PaymentReconciliationSurrogate._paymentDate,
        )!!,
      paymentAmount = this@PaymentReconciliationSurrogate.paymentAmount,
      paymentIdentifier = this@PaymentReconciliationSurrogate.paymentIdentifier,
      detail = this@PaymentReconciliationSurrogate.detail ?: mutableListOf(),
      formCode = this@PaymentReconciliationSurrogate.formCode,
      processNote = this@PaymentReconciliationSurrogate.processNote ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: PaymentReconciliation): PaymentReconciliationSurrogate =
      with(model) {
        PaymentReconciliationSurrogate(
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
          period = this@with.period,
          created = this@with.created.value?.toString(),
          _created = this@with.created.toElement(),
          paymentIssuer = this@with.paymentIssuer,
          request = this@with.request,
          requestor = this@with.requestor,
          outcome = this@with.outcome?.value?.getCode(),
          _outcome = this@with.outcome?.toElement(),
          disposition = this@with.disposition?.value,
          _disposition = this@with.disposition?.toElement(),
          paymentDate = this@with.paymentDate.value?.toString(),
          _paymentDate = this@with.paymentDate.toElement(),
          paymentAmount = this@with.paymentAmount,
          paymentIdentifier = this@with.paymentIdentifier,
          detail = this@with.detail.takeUnless { it.all { it == null } },
          formCode = this@with.formCode,
          processNote = this@with.processNote.takeUnless { it.all { it == null } },
        )
      }
  }
}
