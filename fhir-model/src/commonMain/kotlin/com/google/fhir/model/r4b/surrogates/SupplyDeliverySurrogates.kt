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

import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.SupplyDelivery
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SupplyDeliverySuppliedItemSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var quantity: Quantity? = null,
  public var itemCodeableConcept: CodeableConcept? = null,
  public var itemReference: Reference? = null,
) {
  public fun toModel(): SupplyDelivery.SuppliedItem =
    SupplyDelivery.SuppliedItem().apply {
      id = this@SupplyDeliverySuppliedItemSurrogate.id
      extension = this@SupplyDeliverySuppliedItemSurrogate.extension
      modifierExtension = this@SupplyDeliverySuppliedItemSurrogate.modifierExtension
      quantity = this@SupplyDeliverySuppliedItemSurrogate.quantity
      item =
        SupplyDelivery.SuppliedItem.Item?.from(
          this@SupplyDeliverySuppliedItemSurrogate.itemCodeableConcept,
          this@SupplyDeliverySuppliedItemSurrogate.itemReference,
        )
    }

  public companion object {
    public fun fromModel(model: SupplyDelivery.SuppliedItem): SupplyDeliverySuppliedItemSurrogate =
      with(model) {
        SupplyDeliverySuppliedItemSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          quantity = this@with.quantity
          itemCodeableConcept = this@with.item?.asCodeableConcept()?.value
          itemReference = this@with.item?.asReference()?.value
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
  public var suppliedItem: SupplyDelivery.SuppliedItem? = null,
  public var occurrenceDateTime: String? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var occurrenceTiming: Timing? = null,
  public var supplier: Reference? = null,
  public var destination: Reference? = null,
  public var `receiver`: List<Reference?>? = null,
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
            com.google.fhir.model.r4b.SupplyDelivery.SupplyDeliveryStatus.fromCode(it)
          },
          this@SupplyDeliverySurrogate._status,
        )
      patient = this@SupplyDeliverySurrogate.patient
      type = this@SupplyDeliverySurrogate.type
      suppliedItem = this@SupplyDeliverySurrogate.suppliedItem
      occurrence =
        SupplyDelivery.Occurrence?.from(
          DateTime.of(
            FhirDateTime.fromString(this@SupplyDeliverySurrogate.occurrenceDateTime),
            this@SupplyDeliverySurrogate._occurrenceDateTime,
          ),
          this@SupplyDeliverySurrogate.occurrencePeriod,
          this@SupplyDeliverySurrogate.occurrenceTiming,
        )
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
          occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.value?.toString()
          _occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.toElement()
          occurrencePeriod = this@with.occurrence?.asPeriod()?.value
          occurrenceTiming = this@with.occurrence?.asTiming()?.value
          supplier = this@with.supplier
          destination = this@with.destination
          `receiver` = this@with.`receiver`
        }
      }
  }
}
