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
import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.ChargeItem
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Decimal
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Money
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ChargeItemPerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference? = null,
) {
  public fun toModel(): ChargeItem.Performer =
    ChargeItem.Performer().apply {
      id = this@ChargeItemPerformerSurrogate.id
      extension = this@ChargeItemPerformerSurrogate.extension
      modifierExtension = this@ChargeItemPerformerSurrogate.modifierExtension
      function = this@ChargeItemPerformerSurrogate.function
      actor = this@ChargeItemPerformerSurrogate.actor
    }

  public companion object {
    public fun fromModel(model: ChargeItem.Performer): ChargeItemPerformerSurrogate =
      with(model) {
        ChargeItemPerformerSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          function = this@with.function
          actor = this@with.actor
        }
      }
  }
}

@Serializable
internal data class ChargeItemSurrogate(
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
  public var definitionUri: List<KotlinString?>? = null,
  public var _definitionUri: List<Element?>? = null,
  public var definitionCanonical: List<KotlinString?>? = null,
  public var _definitionCanonical: List<Element?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var partOf: List<Reference?>? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var context: Reference? = null,
  public var occurrenceDateTime: KotlinString? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var occurrenceTiming: Timing? = null,
  public var performer: List<ChargeItem.Performer>? = null,
  public var performingOrganization: Reference? = null,
  public var requestingOrganization: Reference? = null,
  public var costCenter: Reference? = null,
  public var quantity: Quantity? = null,
  public var bodysite: List<CodeableConcept?>? = null,
  public var factorOverride: Double? = null,
  public var _factorOverride: Element? = null,
  public var priceOverride: Money? = null,
  public var overrideReason: KotlinString? = null,
  public var _overrideReason: Element? = null,
  public var enterer: Reference? = null,
  public var enteredDate: KotlinString? = null,
  public var _enteredDate: Element? = null,
  public var reason: List<CodeableConcept?>? = null,
  public var service: List<Reference?>? = null,
  public var productReference: Reference? = null,
  public var productCodeableConcept: CodeableConcept? = null,
  public var account: List<Reference?>? = null,
  public var note: List<Annotation?>? = null,
  public var supportingInformation: List<Reference?>? = null,
) {
  public fun toModel(): ChargeItem =
    ChargeItem().apply {
      id = this@ChargeItemSurrogate.id
      meta = this@ChargeItemSurrogate.meta
      implicitRules =
        Uri.of(this@ChargeItemSurrogate.implicitRules, this@ChargeItemSurrogate._implicitRules)
      language = Code.of(this@ChargeItemSurrogate.language, this@ChargeItemSurrogate._language)
      text = this@ChargeItemSurrogate.text
      contained = this@ChargeItemSurrogate.contained
      extension = this@ChargeItemSurrogate.extension
      modifierExtension = this@ChargeItemSurrogate.modifierExtension
      identifier = this@ChargeItemSurrogate.identifier
      definitionUri =
        if (
          this@ChargeItemSurrogate.definitionUri == null &&
            this@ChargeItemSurrogate._definitionUri == null
        ) {
          null
        } else {
          (this@ChargeItemSurrogate.definitionUri
              ?: List(this@ChargeItemSurrogate._definitionUri!!.size) { null })
            .zip(
              this@ChargeItemSurrogate._definitionUri
                ?: List(this@ChargeItemSurrogate.definitionUri!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      definitionCanonical =
        if (
          this@ChargeItemSurrogate.definitionCanonical == null &&
            this@ChargeItemSurrogate._definitionCanonical == null
        ) {
          null
        } else {
          (this@ChargeItemSurrogate.definitionCanonical
              ?: List(this@ChargeItemSurrogate._definitionCanonical!!.size) { null })
            .zip(
              this@ChargeItemSurrogate._definitionCanonical
                ?: List(this@ChargeItemSurrogate.definitionCanonical!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      status =
        Enumeration.of(
          this@ChargeItemSurrogate.status?.let {
            com.google.fhir.model.r4b.ChargeItem.ChargeItemStatus.fromCode(it)
          },
          this@ChargeItemSurrogate._status,
        )
      partOf = this@ChargeItemSurrogate.partOf
      code = this@ChargeItemSurrogate.code
      subject = this@ChargeItemSurrogate.subject
      context = this@ChargeItemSurrogate.context
      occurrence =
        ChargeItem.Occurrence?.from(
          DateTime.of(
            FhirDateTime.fromString(this@ChargeItemSurrogate.occurrenceDateTime),
            this@ChargeItemSurrogate._occurrenceDateTime,
          ),
          this@ChargeItemSurrogate.occurrencePeriod,
          this@ChargeItemSurrogate.occurrenceTiming,
        )
      performer = this@ChargeItemSurrogate.performer
      performingOrganization = this@ChargeItemSurrogate.performingOrganization
      requestingOrganization = this@ChargeItemSurrogate.requestingOrganization
      costCenter = this@ChargeItemSurrogate.costCenter
      quantity = this@ChargeItemSurrogate.quantity
      bodysite = this@ChargeItemSurrogate.bodysite
      factorOverride =
        Decimal.of(
          this@ChargeItemSurrogate.factorOverride,
          this@ChargeItemSurrogate._factorOverride,
        )
      priceOverride = this@ChargeItemSurrogate.priceOverride
      overrideReason =
        R4bString.of(
          this@ChargeItemSurrogate.overrideReason,
          this@ChargeItemSurrogate._overrideReason,
        )
      enterer = this@ChargeItemSurrogate.enterer
      enteredDate =
        DateTime.of(
          FhirDateTime.fromString(this@ChargeItemSurrogate.enteredDate),
          this@ChargeItemSurrogate._enteredDate,
        )
      reason = this@ChargeItemSurrogate.reason
      service = this@ChargeItemSurrogate.service
      product =
        ChargeItem.Product?.from(
          this@ChargeItemSurrogate.productReference,
          this@ChargeItemSurrogate.productCodeableConcept,
        )
      account = this@ChargeItemSurrogate.account
      note = this@ChargeItemSurrogate.note
      supportingInformation = this@ChargeItemSurrogate.supportingInformation
    }

  public companion object {
    public fun fromModel(model: ChargeItem): ChargeItemSurrogate =
      with(model) {
        ChargeItemSurrogate().apply {
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
          definitionUri =
            this@with.definitionUri?.map { it?.value }?.takeUnless { it.all { it == null } }
          _definitionUri =
            this@with.definitionUri?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          definitionCanonical =
            this@with.definitionCanonical?.map { it?.value }?.takeUnless { it.all { it == null } }
          _definitionCanonical =
            this@with.definitionCanonical
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          partOf = this@with.partOf
          code = this@with.code
          subject = this@with.subject
          context = this@with.context
          occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.value?.toString()
          _occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.toElement()
          occurrencePeriod = this@with.occurrence?.asPeriod()?.value
          occurrenceTiming = this@with.occurrence?.asTiming()?.value
          performer = this@with.performer
          performingOrganization = this@with.performingOrganization
          requestingOrganization = this@with.requestingOrganization
          costCenter = this@with.costCenter
          quantity = this@with.quantity
          bodysite = this@with.bodysite
          factorOverride = this@with.factorOverride?.value
          _factorOverride = this@with.factorOverride?.toElement()
          priceOverride = this@with.priceOverride
          overrideReason = this@with.overrideReason?.value
          _overrideReason = this@with.overrideReason?.toElement()
          enterer = this@with.enterer
          enteredDate = this@with.enteredDate?.value?.toString()
          _enteredDate = this@with.enteredDate?.toElement()
          reason = this@with.reason
          service = this@with.service
          productReference = this@with.product?.asReference()?.value
          productCodeableConcept = this@with.product?.asCodeableConcept()?.value
          account = this@with.account
          note = this@with.note
          supportingInformation = this@with.supportingInformation
        }
      }
  }
}
