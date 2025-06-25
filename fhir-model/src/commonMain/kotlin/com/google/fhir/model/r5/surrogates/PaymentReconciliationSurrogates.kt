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
import com.google.fhir.model.r5.PaymentReconciliation
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.PositiveInt
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class PaymentReconciliationAllocationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: Identifier? = null,
  public var predecessor: Identifier? = null,
  public var target: Reference? = null,
  public var targetItemString: KotlinString? = null,
  public var _targetItemString: Element? = null,
  public var targetItemIdentifier: Identifier? = null,
  public var targetItemPositiveInt: Int? = null,
  public var _targetItemPositiveInt: Element? = null,
  public var encounter: Reference? = null,
  public var account: Reference? = null,
  public var type: CodeableConcept? = null,
  public var submitter: Reference? = null,
  public var response: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var responsible: Reference? = null,
  public var payee: Reference? = null,
  public var amount: Money? = null,
) {
  public fun toModel(): PaymentReconciliation.Allocation =
    PaymentReconciliation.Allocation().apply {
      id = this@PaymentReconciliationAllocationSurrogate.id
      extension = this@PaymentReconciliationAllocationSurrogate.extension
      modifierExtension = this@PaymentReconciliationAllocationSurrogate.modifierExtension
      identifier = this@PaymentReconciliationAllocationSurrogate.identifier
      predecessor = this@PaymentReconciliationAllocationSurrogate.predecessor
      target = this@PaymentReconciliationAllocationSurrogate.target
      targetItem =
        PaymentReconciliation.Allocation.TargetItem?.from(
          R5String.of(
            this@PaymentReconciliationAllocationSurrogate.targetItemString,
            this@PaymentReconciliationAllocationSurrogate._targetItemString,
          ),
          this@PaymentReconciliationAllocationSurrogate.targetItemIdentifier,
          PositiveInt.of(
            this@PaymentReconciliationAllocationSurrogate.targetItemPositiveInt,
            this@PaymentReconciliationAllocationSurrogate._targetItemPositiveInt,
          ),
        )
      encounter = this@PaymentReconciliationAllocationSurrogate.encounter
      account = this@PaymentReconciliationAllocationSurrogate.account
      type = this@PaymentReconciliationAllocationSurrogate.type
      submitter = this@PaymentReconciliationAllocationSurrogate.submitter
      response = this@PaymentReconciliationAllocationSurrogate.response
      date =
        Date.of(
          FhirDate.fromString(this@PaymentReconciliationAllocationSurrogate.date),
          this@PaymentReconciliationAllocationSurrogate._date,
        )
      responsible = this@PaymentReconciliationAllocationSurrogate.responsible
      payee = this@PaymentReconciliationAllocationSurrogate.payee
      amount = this@PaymentReconciliationAllocationSurrogate.amount
    }

  public companion object {
    public fun fromModel(
      model: PaymentReconciliation.Allocation
    ): PaymentReconciliationAllocationSurrogate =
      with(model) {
        PaymentReconciliationAllocationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          predecessor = this@with.predecessor
          target = this@with.target
          targetItemString = this@with.targetItem?.asString()?.value?.value
          _targetItemString = this@with.targetItem?.asString()?.value?.toElement()
          targetItemIdentifier = this@with.targetItem?.asIdentifier()?.value
          targetItemPositiveInt = this@with.targetItem?.asPositiveInt()?.value?.value
          _targetItemPositiveInt = this@with.targetItem?.asPositiveInt()?.value?.toElement()
          encounter = this@with.encounter
          account = this@with.account
          type = this@with.type
          submitter = this@with.submitter
          response = this@with.response
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          responsible = this@with.responsible
          payee = this@with.payee
          amount = this@with.amount
        }
      }
  }
}

@Serializable
internal data class PaymentReconciliationProcessNoteSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
) {
  public fun toModel(): PaymentReconciliation.ProcessNote =
    PaymentReconciliation.ProcessNote().apply {
      id = this@PaymentReconciliationProcessNoteSurrogate.id
      extension = this@PaymentReconciliationProcessNoteSurrogate.extension
      modifierExtension = this@PaymentReconciliationProcessNoteSurrogate.modifierExtension
      type =
        Enumeration.of(
          this@PaymentReconciliationProcessNoteSurrogate.type?.let {
            com.google.fhir.model.r5.NoteType.fromCode(it)
          },
          this@PaymentReconciliationProcessNoteSurrogate._type,
        )
      text =
        R5String.of(
          this@PaymentReconciliationProcessNoteSurrogate.text,
          this@PaymentReconciliationProcessNoteSurrogate._text,
        )
    }

  public companion object {
    public fun fromModel(
      model: PaymentReconciliation.ProcessNote
    ): PaymentReconciliationProcessNoteSurrogate =
      with(model) {
        PaymentReconciliationProcessNoteSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          text = this@with.text?.value
          _text = this@with.text?.toElement()
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var type: CodeableConcept? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var kind: CodeableConcept? = null,
  public var period: Period? = null,
  public var created: KotlinString? = null,
  public var _created: Element? = null,
  public var enterer: Reference? = null,
  public var issuerType: CodeableConcept? = null,
  public var paymentIssuer: Reference? = null,
  public var request: Reference? = null,
  public var requestor: Reference? = null,
  public var outcome: KotlinString? = null,
  public var _outcome: Element? = null,
  public var disposition: KotlinString? = null,
  public var _disposition: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var location: Reference? = null,
  public var method: CodeableConcept? = null,
  public var cardBrand: KotlinString? = null,
  public var _cardBrand: Element? = null,
  public var accountNumber: KotlinString? = null,
  public var _accountNumber: Element? = null,
  public var expirationDate: KotlinString? = null,
  public var _expirationDate: Element? = null,
  public var processor: KotlinString? = null,
  public var _processor: Element? = null,
  public var referenceNumber: KotlinString? = null,
  public var _referenceNumber: Element? = null,
  public var authorization: KotlinString? = null,
  public var _authorization: Element? = null,
  public var tenderedAmount: Money? = null,
  public var returnedAmount: Money? = null,
  public var amount: Money? = null,
  public var paymentIdentifier: Identifier? = null,
  public var allocation: List<PaymentReconciliation.Allocation>? = null,
  public var formCode: CodeableConcept? = null,
  public var processNote: List<PaymentReconciliation.ProcessNote>? = null,
) {
  public fun toModel(): PaymentReconciliation =
    PaymentReconciliation().apply {
      id = this@PaymentReconciliationSurrogate.id
      meta = this@PaymentReconciliationSurrogate.meta
      implicitRules =
        Uri.of(
          this@PaymentReconciliationSurrogate.implicitRules,
          this@PaymentReconciliationSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@PaymentReconciliationSurrogate.language,
          this@PaymentReconciliationSurrogate._language,
        )
      text = this@PaymentReconciliationSurrogate.text
      contained = this@PaymentReconciliationSurrogate.contained
      extension = this@PaymentReconciliationSurrogate.extension
      modifierExtension = this@PaymentReconciliationSurrogate.modifierExtension
      identifier = this@PaymentReconciliationSurrogate.identifier
      type = this@PaymentReconciliationSurrogate.type
      status =
        Enumeration.of(
          this@PaymentReconciliationSurrogate.status?.let {
            com.google.fhir.model.r5.PaymentReconciliation.PaymentReconciliationStatus.fromCode(it)
          },
          this@PaymentReconciliationSurrogate._status,
        )
      kind = this@PaymentReconciliationSurrogate.kind
      period = this@PaymentReconciliationSurrogate.period
      created =
        DateTime.of(
          FhirDateTime.fromString(this@PaymentReconciliationSurrogate.created),
          this@PaymentReconciliationSurrogate._created,
        )
      enterer = this@PaymentReconciliationSurrogate.enterer
      issuerType = this@PaymentReconciliationSurrogate.issuerType
      paymentIssuer = this@PaymentReconciliationSurrogate.paymentIssuer
      request = this@PaymentReconciliationSurrogate.request
      requestor = this@PaymentReconciliationSurrogate.requestor
      outcome =
        Enumeration.of(
          this@PaymentReconciliationSurrogate.outcome?.let {
            com.google.fhir.model.r5.PaymentReconciliation.PaymentOutcome.fromCode(it)
          },
          this@PaymentReconciliationSurrogate._outcome,
        )
      disposition =
        R5String.of(
          this@PaymentReconciliationSurrogate.disposition,
          this@PaymentReconciliationSurrogate._disposition,
        )
      date =
        Date.of(
          FhirDate.fromString(this@PaymentReconciliationSurrogate.date),
          this@PaymentReconciliationSurrogate._date,
        )
      location = this@PaymentReconciliationSurrogate.location
      method = this@PaymentReconciliationSurrogate.method
      cardBrand =
        R5String.of(
          this@PaymentReconciliationSurrogate.cardBrand,
          this@PaymentReconciliationSurrogate._cardBrand,
        )
      accountNumber =
        R5String.of(
          this@PaymentReconciliationSurrogate.accountNumber,
          this@PaymentReconciliationSurrogate._accountNumber,
        )
      expirationDate =
        Date.of(
          FhirDate.fromString(this@PaymentReconciliationSurrogate.expirationDate),
          this@PaymentReconciliationSurrogate._expirationDate,
        )
      processor =
        R5String.of(
          this@PaymentReconciliationSurrogate.processor,
          this@PaymentReconciliationSurrogate._processor,
        )
      referenceNumber =
        R5String.of(
          this@PaymentReconciliationSurrogate.referenceNumber,
          this@PaymentReconciliationSurrogate._referenceNumber,
        )
      authorization =
        R5String.of(
          this@PaymentReconciliationSurrogate.authorization,
          this@PaymentReconciliationSurrogate._authorization,
        )
      tenderedAmount = this@PaymentReconciliationSurrogate.tenderedAmount
      returnedAmount = this@PaymentReconciliationSurrogate.returnedAmount
      amount = this@PaymentReconciliationSurrogate.amount
      paymentIdentifier = this@PaymentReconciliationSurrogate.paymentIdentifier
      allocation = this@PaymentReconciliationSurrogate.allocation
      formCode = this@PaymentReconciliationSurrogate.formCode
      processNote = this@PaymentReconciliationSurrogate.processNote
    }

  public companion object {
    public fun fromModel(model: PaymentReconciliation): PaymentReconciliationSurrogate =
      with(model) {
        PaymentReconciliationSurrogate().apply {
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
          type = this@with.type
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          kind = this@with.kind
          period = this@with.period
          created = this@with.created?.value?.toString()
          _created = this@with.created?.toElement()
          enterer = this@with.enterer
          issuerType = this@with.issuerType
          paymentIssuer = this@with.paymentIssuer
          request = this@with.request
          requestor = this@with.requestor
          outcome = this@with.outcome?.value?.getCode()
          _outcome = this@with.outcome?.toElement()
          disposition = this@with.disposition?.value
          _disposition = this@with.disposition?.toElement()
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          location = this@with.location
          method = this@with.method
          cardBrand = this@with.cardBrand?.value
          _cardBrand = this@with.cardBrand?.toElement()
          accountNumber = this@with.accountNumber?.value
          _accountNumber = this@with.accountNumber?.toElement()
          expirationDate = this@with.expirationDate?.value?.toString()
          _expirationDate = this@with.expirationDate?.toElement()
          processor = this@with.processor?.value
          _processor = this@with.processor?.toElement()
          referenceNumber = this@with.referenceNumber?.value
          _referenceNumber = this@with.referenceNumber?.toElement()
          authorization = this@with.authorization?.value
          _authorization = this@with.authorization?.toElement()
          tenderedAmount = this@with.tenderedAmount
          returnedAmount = this@with.returnedAmount
          amount = this@with.amount
          paymentIdentifier = this@with.paymentIdentifier
          allocation = this@with.allocation
          formCode = this@with.formCode
          processNote = this@with.processNote
        }
      }
  }
}
