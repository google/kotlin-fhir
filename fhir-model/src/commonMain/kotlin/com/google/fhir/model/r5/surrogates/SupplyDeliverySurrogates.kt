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
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.SupplyDelivery
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
internal class SupplyDeliverySuppliedItemItemSurrogate {
  public var itemCodeableConcept: CodeableConcept? = null

  public var itemReference: Reference? = null

  public fun toModel(): SupplyDelivery.SuppliedItem.Item =
    SupplyDelivery.SuppliedItem.Item?.from(
      this@SupplyDeliverySuppliedItemItemSurrogate.itemCodeableConcept,
      this@SupplyDeliverySuppliedItemItemSurrogate.itemReference,
    ) ?: SupplyDelivery.SuppliedItem.Item.Null

  public companion object {
    public fun fromModel(
      model: SupplyDelivery.SuppliedItem.Item
    ): SupplyDeliverySuppliedItemItemSurrogate =
      with(model) {
        SupplyDeliverySuppliedItemItemSurrogate().apply {
          itemCodeableConcept = this@with.asCodeableConcept()?.value
          itemReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class SupplyDeliverySuppliedItemSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var quantity: Quantity? = null,
  public var item: SupplyDelivery.SuppliedItem.Item? = null,
) {
  public fun toModel(): SupplyDelivery.SuppliedItem =
    SupplyDelivery.SuppliedItem().apply {
      id = this@SupplyDeliverySuppliedItemSurrogate.id
      extension = this@SupplyDeliverySuppliedItemSurrogate.extension
      modifierExtension = this@SupplyDeliverySuppliedItemSurrogate.modifierExtension
      quantity = this@SupplyDeliverySuppliedItemSurrogate.quantity
      item = this@SupplyDeliverySuppliedItemSurrogate.item
    }

  public companion object {
    public fun fromModel(model: SupplyDelivery.SuppliedItem): SupplyDeliverySuppliedItemSurrogate =
      with(model) {
        SupplyDeliverySuppliedItemSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          quantity = this@with.quantity
          item = this@with.item
        }
      }
  }
}

@Serializable
internal class SupplyDeliveryOccurrenceSurrogate {
  public var occurrenceDateTime: String? = null

  public var _occurrenceDateTime: Element? = null

  public var occurrencePeriod: Period? = null

  public var occurrenceTiming: Timing? = null

  public fun toModel(): SupplyDelivery.Occurrence =
    SupplyDelivery.Occurrence?.from(
      DateTime.of(
        FhirDateTime.fromString(this@SupplyDeliveryOccurrenceSurrogate.occurrenceDateTime),
        this@SupplyDeliveryOccurrenceSurrogate._occurrenceDateTime,
      ),
      this@SupplyDeliveryOccurrenceSurrogate.occurrencePeriod,
      this@SupplyDeliveryOccurrenceSurrogate.occurrenceTiming,
    ) ?: SupplyDelivery.Occurrence.Null

  public companion object {
    public fun fromModel(model: SupplyDelivery.Occurrence): SupplyDeliveryOccurrenceSurrogate =
      with(model) {
        SupplyDeliveryOccurrenceSurrogate().apply {
          occurrenceDateTime = this@with.asDateTime()?.value?.value?.toString()
          _occurrenceDateTime = this@with.asDateTime()?.value?.toElement()
          occurrencePeriod = this@with.asPeriod()?.value
          occurrenceTiming = this@with.asTiming()?.value
        }
      }
  }
}

@Serializable
internal data class SupplyDeliverySurrogate(
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
  public var basedOn: List<Reference?>? = null,
  public var partOf: List<Reference?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var patient: Reference? = null,
  public var type: CodeableConcept? = null,
  public var suppliedItem: List<SupplyDelivery.SuppliedItem>? = null,
  public var supplier: Reference? = null,
  public var destination: Reference? = null,
  public var `receiver`: List<Reference?>? = null,
  public var occurrence: SupplyDelivery.Occurrence? = null,
) {
  public fun toModel(): SupplyDelivery =
    SupplyDelivery().apply {
      id = this@SupplyDeliverySurrogate.id
      meta = this@SupplyDeliverySurrogate.meta
      implicitRules =
        Uri.of(
          this@SupplyDeliverySurrogate.implicitRules,
          this@SupplyDeliverySurrogate._implicitRules,
        )
      language =
        Code.of(this@SupplyDeliverySurrogate.language, this@SupplyDeliverySurrogate._language)
      text = this@SupplyDeliverySurrogate.text
      contained = this@SupplyDeliverySurrogate.contained
      extension = this@SupplyDeliverySurrogate.extension
      modifierExtension = this@SupplyDeliverySurrogate.modifierExtension
      identifier = this@SupplyDeliverySurrogate.identifier
      basedOn = this@SupplyDeliverySurrogate.basedOn
      partOf = this@SupplyDeliverySurrogate.partOf
      status =
        Enumeration.of(
          this@SupplyDeliverySurrogate.status?.let {
            com.google.fhir.model.r5.SupplyDelivery.SupplyDeliveryStatus.fromCode(it)
          },
          this@SupplyDeliverySurrogate._status,
        )
      patient = this@SupplyDeliverySurrogate.patient
      type = this@SupplyDeliverySurrogate.type
      suppliedItem = this@SupplyDeliverySurrogate.suppliedItem
      occurrence = this@SupplyDeliverySurrogate.occurrence
      supplier = this@SupplyDeliverySurrogate.supplier
      destination = this@SupplyDeliverySurrogate.destination
      `receiver` = this@SupplyDeliverySurrogate.`receiver`
    }

  public companion object {
    public fun fromModel(model: SupplyDelivery): SupplyDeliverySurrogate =
      with(model) {
        SupplyDeliverySurrogate().apply {
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
          basedOn = this@with.basedOn
          partOf = this@with.partOf
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          patient = this@with.patient
          type = this@with.type
          suppliedItem = this@with.suppliedItem
          occurrence = this@with.occurrence
          supplier = this@with.supplier
          destination = this@with.destination
          `receiver` = this@with.`receiver`
        }
      }
  }
}
