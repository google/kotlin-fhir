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

import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.ChargeItem
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.MonetaryComponent
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Timing
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ChargeItemPerformerSurrogate(
  public var id: String? = null,
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
internal class ChargeItemOccurrenceSurrogate {
  public var occurrenceDateTime: String? = null

  public var _occurrenceDateTime: Element? = null

  public var occurrencePeriod: Period? = null

  public var occurrenceTiming: Timing? = null

  public fun toModel(): ChargeItem.Occurrence =
    ChargeItem.Occurrence?.from(
      DateTime.of(
        FhirDateTime.fromString(this@ChargeItemOccurrenceSurrogate.occurrenceDateTime),
        this@ChargeItemOccurrenceSurrogate._occurrenceDateTime,
      ),
      this@ChargeItemOccurrenceSurrogate.occurrencePeriod,
      this@ChargeItemOccurrenceSurrogate.occurrenceTiming,
    ) ?: ChargeItem.Occurrence.Null

  public companion object {
    public fun fromModel(model: ChargeItem.Occurrence): ChargeItemOccurrenceSurrogate =
      with(model) {
        ChargeItemOccurrenceSurrogate().apply {
          occurrenceDateTime = this@with.asDateTime()?.value?.value?.toString()
          _occurrenceDateTime = this@with.asDateTime()?.value?.toElement()
          occurrencePeriod = this@with.asPeriod()?.value
          occurrenceTiming = this@with.asTiming()?.value
        }
      }
  }
}

@Serializable
internal data class ChargeItemSurrogate(
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
  public var definitionUri: List<String?>? = null,
  public var _definitionUri: List<Element?>? = null,
  public var definitionCanonical: List<String?>? = null,
  public var _definitionCanonical: List<Element?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var partOf: List<Reference?>? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var performer: List<ChargeItem.Performer>? = null,
  public var performingOrganization: Reference? = null,
  public var requestingOrganization: Reference? = null,
  public var costCenter: Reference? = null,
  public var quantity: Quantity? = null,
  public var bodysite: List<CodeableConcept?>? = null,
  public var unitPriceComponent: MonetaryComponent? = null,
  public var totalPriceComponent: MonetaryComponent? = null,
  public var overrideReason: CodeableConcept? = null,
  public var enterer: Reference? = null,
  public var enteredDate: String? = null,
  public var _enteredDate: Element? = null,
  public var reason: List<CodeableConcept?>? = null,
  public var service: List<CodeableReference?>? = null,
  public var product: List<CodeableReference?>? = null,
  public var account: List<Reference?>? = null,
  public var note: List<Annotation?>? = null,
  public var supportingInformation: List<Reference?>? = null,
  public var occurrence: ChargeItem.Occurrence? = null,
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
            com.google.fhir.model.r5.ChargeItem.ChargeItemStatus.fromCode(it)
          },
          this@ChargeItemSurrogate._status,
        )
      partOf = this@ChargeItemSurrogate.partOf
      code = this@ChargeItemSurrogate.code
      subject = this@ChargeItemSurrogate.subject
      encounter = this@ChargeItemSurrogate.encounter
      occurrence = this@ChargeItemSurrogate.occurrence
      performer = this@ChargeItemSurrogate.performer
      performingOrganization = this@ChargeItemSurrogate.performingOrganization
      requestingOrganization = this@ChargeItemSurrogate.requestingOrganization
      costCenter = this@ChargeItemSurrogate.costCenter
      quantity = this@ChargeItemSurrogate.quantity
      bodysite = this@ChargeItemSurrogate.bodysite
      unitPriceComponent = this@ChargeItemSurrogate.unitPriceComponent
      totalPriceComponent = this@ChargeItemSurrogate.totalPriceComponent
      overrideReason = this@ChargeItemSurrogate.overrideReason
      enterer = this@ChargeItemSurrogate.enterer
      enteredDate =
        DateTime.of(
          FhirDateTime.fromString(this@ChargeItemSurrogate.enteredDate),
          this@ChargeItemSurrogate._enteredDate,
        )
      reason = this@ChargeItemSurrogate.reason
      service = this@ChargeItemSurrogate.service
      product = this@ChargeItemSurrogate.product
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
          encounter = this@with.encounter
          occurrence = this@with.occurrence
          performer = this@with.performer
          performingOrganization = this@with.performingOrganization
          requestingOrganization = this@with.requestingOrganization
          costCenter = this@with.costCenter
          quantity = this@with.quantity
          bodysite = this@with.bodysite
          unitPriceComponent = this@with.unitPriceComponent
          totalPriceComponent = this@with.totalPriceComponent
          overrideReason = this@with.overrideReason
          enterer = this@with.enterer
          enteredDate = this@with.enteredDate?.value?.toString()
          _enteredDate = this@with.enteredDate?.toElement()
          reason = this@with.reason
          service = this@with.service
          product = this@with.product
          account = this@with.account
          note = this@with.note
          supportingInformation = this@with.supportingInformation
        }
      }
  }
}
