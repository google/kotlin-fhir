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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SupplyDeliverySuppliedItemSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var quantity: Quantity? = null,
  public var itemCodeableConcept: CodeableConcept? = null,
  public var itemReference: Reference? = null,
) {
  public fun toModel(): SupplyDelivery.SuppliedItem =
    SupplyDelivery.SuppliedItem(
      id = this@SupplyDeliverySuppliedItemSurrogate.id,
      extension = this@SupplyDeliverySuppliedItemSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SupplyDeliverySuppliedItemSurrogate.modifierExtension ?: mutableListOf(),
      quantity = this@SupplyDeliverySuppliedItemSurrogate.quantity,
      item =
        SupplyDelivery.SuppliedItem.Item?.from(
          this@SupplyDeliverySuppliedItemSurrogate.itemCodeableConcept,
          this@SupplyDeliverySuppliedItemSurrogate.itemReference,
        ),
    )

  public companion object {
    public fun fromModel(model: SupplyDelivery.SuppliedItem): SupplyDeliverySuppliedItemSurrogate =
      with(model) {
        SupplyDeliverySuppliedItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          quantity = this@with.quantity,
          itemCodeableConcept = this@with.item?.asCodeableConcept()?.value,
          itemReference = this@with.item?.asReference()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var partOf: MutableList<Reference>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var patient: Reference? = null,
  public var type: CodeableConcept? = null,
  public var suppliedItem: MutableList<SupplyDelivery.SuppliedItem>? = null,
  public var occurrenceDateTime: String? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var occurrenceTiming: Timing? = null,
  public var supplier: Reference? = null,
  public var destination: Reference? = null,
  public var `receiver`: MutableList<Reference>? = null,
) {
  public fun toModel(): SupplyDelivery =
    SupplyDelivery(
      id = this@SupplyDeliverySurrogate.id,
      meta = this@SupplyDeliverySurrogate.meta,
      implicitRules =
        Uri.of(
          this@SupplyDeliverySurrogate.implicitRules,
          this@SupplyDeliverySurrogate._implicitRules,
        ),
      language =
        Code.of(this@SupplyDeliverySurrogate.language, this@SupplyDeliverySurrogate._language),
      text = this@SupplyDeliverySurrogate.text,
      contained = this@SupplyDeliverySurrogate.contained ?: mutableListOf(),
      extension = this@SupplyDeliverySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@SupplyDeliverySurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@SupplyDeliverySurrogate.identifier ?: mutableListOf(),
      basedOn = this@SupplyDeliverySurrogate.basedOn ?: mutableListOf(),
      partOf = this@SupplyDeliverySurrogate.partOf ?: mutableListOf(),
      status =
        this@SupplyDeliverySurrogate.status?.let {
          Enumeration.of(
            com.google.fhir.model.r5.SupplyDelivery.SupplyDeliveryStatus.fromCode(it!!),
            this@SupplyDeliverySurrogate._status,
          )
        },
      patient = this@SupplyDeliverySurrogate.patient,
      type = this@SupplyDeliverySurrogate.type,
      suppliedItem = this@SupplyDeliverySurrogate.suppliedItem ?: mutableListOf(),
      occurrence =
        SupplyDelivery.Occurrence?.from(
          DateTime.of(
            FhirDateTime.fromString(this@SupplyDeliverySurrogate.occurrenceDateTime),
            this@SupplyDeliverySurrogate._occurrenceDateTime,
          ),
          this@SupplyDeliverySurrogate.occurrencePeriod,
          this@SupplyDeliverySurrogate.occurrenceTiming,
        ),
      supplier = this@SupplyDeliverySurrogate.supplier,
      destination = this@SupplyDeliverySurrogate.destination,
      `receiver` = this@SupplyDeliverySurrogate.`receiver` ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: SupplyDelivery): SupplyDeliverySurrogate =
      with(model) {
        SupplyDeliverySurrogate(
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
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          partOf = this@with.partOf.takeUnless { it.all { it == null } },
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          patient = this@with.patient,
          type = this@with.type,
          suppliedItem = this@with.suppliedItem.takeUnless { it.all { it == null } },
          occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.value?.toString(),
          _occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.toElement(),
          occurrencePeriod = this@with.occurrence?.asPeriod()?.value,
          occurrenceTiming = this@with.occurrence?.asTiming()?.value,
          supplier = this@with.supplier,
          destination = this@with.destination,
          `receiver` = this@with.`receiver`.takeUnless { it.all { it == null } },
        )
      }
  }
}
