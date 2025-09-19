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

import com.google.fhir.model.r4b.Boolean as R4bBoolean
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
import com.google.fhir.model.r4b.Range
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.SupplyRequest
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SupplyRequestParameterSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept? = null,
  public var `value`: SupplyRequest.Parameter.Value? = null,
) {
  public fun toModel(): SupplyRequest.Parameter =
    SupplyRequest.Parameter(
      id = this@SupplyRequestParameterSurrogate.id,
      extension = this@SupplyRequestParameterSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@SupplyRequestParameterSurrogate.modifierExtension ?: mutableListOf(),
      code = this@SupplyRequestParameterSurrogate.code,
      `value` = this@SupplyRequestParameterSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(model: SupplyRequest.Parameter): SupplyRequestParameterSurrogate =
      with(model) {
        SupplyRequestParameterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          code = this@with.code,
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class SupplyRequestItemSurrogate(
  public var itemCodeableConcept: CodeableConcept? = null,
  public var itemReference: Reference? = null,
) {
  public fun toModel(): SupplyRequest.Item =
    SupplyRequest.Item.from(
      this@SupplyRequestItemSurrogate.itemCodeableConcept,
      this@SupplyRequestItemSurrogate.itemReference,
    )!!

  public companion object {
    public fun fromModel(model: SupplyRequest.Item): SupplyRequestItemSurrogate =
      with(model) {
        SupplyRequestItemSurrogate(
          itemCodeableConcept = this@with.asCodeableConcept()?.value,
          itemReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class SupplyRequestParameterValueSurrogate(
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
) {
  public fun toModel(): SupplyRequest.Parameter.Value =
    SupplyRequest.Parameter.Value.from(
      this@SupplyRequestParameterValueSurrogate.valueCodeableConcept,
      this@SupplyRequestParameterValueSurrogate.valueQuantity,
      this@SupplyRequestParameterValueSurrogate.valueRange,
      R4bBoolean.of(
        this@SupplyRequestParameterValueSurrogate.valueBoolean,
        this@SupplyRequestParameterValueSurrogate._valueBoolean,
      ),
    )!!

  public companion object {
    public fun fromModel(
      model: SupplyRequest.Parameter.Value
    ): SupplyRequestParameterValueSurrogate =
      with(model) {
        SupplyRequestParameterValueSurrogate(
          valueCodeableConcept = this@with.asCodeableConcept()?.value,
          valueQuantity = this@with.asQuantity()?.value,
          valueRange = this@with.asRange()?.value,
          valueBoolean = this@with.asBoolean()?.value?.value,
          _valueBoolean = this@with.asBoolean()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class SupplyRequestOccurrenceSurrogate(
  public var occurrenceDateTime: String? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var occurrenceTiming: Timing? = null,
) {
  public fun toModel(): SupplyRequest.Occurrence =
    SupplyRequest.Occurrence.from(
      DateTime.of(
        FhirDateTime.fromString(this@SupplyRequestOccurrenceSurrogate.occurrenceDateTime),
        this@SupplyRequestOccurrenceSurrogate._occurrenceDateTime,
      ),
      this@SupplyRequestOccurrenceSurrogate.occurrencePeriod,
      this@SupplyRequestOccurrenceSurrogate.occurrenceTiming,
    )!!

  public companion object {
    public fun fromModel(model: SupplyRequest.Occurrence): SupplyRequestOccurrenceSurrogate =
      with(model) {
        SupplyRequestOccurrenceSurrogate(
          occurrenceDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _occurrenceDateTime = this@with.asDateTime()?.value?.toElement(),
          occurrencePeriod = this@with.asPeriod()?.value,
          occurrenceTiming = this@with.asTiming()?.value,
        )
      }
  }
}

@Serializable
internal data class SupplyRequestSurrogate(
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
  public var category: CodeableConcept? = null,
  public var priority: String? = null,
  public var _priority: Element? = null,
  public var item: SupplyRequest.Item,
  public var quantity: Quantity,
  public var parameter: MutableList<SupplyRequest.Parameter>? = null,
  public var occurrence: SupplyRequest.Occurrence? = null,
  public var authoredOn: String? = null,
  public var _authoredOn: Element? = null,
  public var requester: Reference? = null,
  public var supplier: MutableList<Reference>? = null,
  public var reasonCode: MutableList<CodeableConcept>? = null,
  public var reasonReference: MutableList<Reference>? = null,
  public var deliverFrom: Reference? = null,
  public var deliverTo: Reference? = null,
) {
  public fun toModel(): SupplyRequest =
    SupplyRequest(
      id = this@SupplyRequestSurrogate.id,
      meta = this@SupplyRequestSurrogate.meta,
      implicitRules =
        Uri.of(
          this@SupplyRequestSurrogate.implicitRules,
          this@SupplyRequestSurrogate._implicitRules,
        ),
      language =
        Code.of(this@SupplyRequestSurrogate.language, this@SupplyRequestSurrogate._language),
      text = this@SupplyRequestSurrogate.text,
      contained = this@SupplyRequestSurrogate.contained ?: mutableListOf(),
      extension = this@SupplyRequestSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@SupplyRequestSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@SupplyRequestSurrogate.identifier ?: mutableListOf(),
      status =
        this@SupplyRequestSurrogate.status?.let {
          Enumeration.of(
            SupplyRequest.SupplyRequestStatus.fromCode(it),
            this@SupplyRequestSurrogate._status,
          )
        },
      category = this@SupplyRequestSurrogate.category,
      priority =
        this@SupplyRequestSurrogate.priority?.let {
          Enumeration.of(
            SupplyRequest.RequestPriority.fromCode(it),
            this@SupplyRequestSurrogate._priority,
          )
        },
      item = this@SupplyRequestSurrogate.item,
      quantity = this@SupplyRequestSurrogate.quantity,
      parameter = this@SupplyRequestSurrogate.parameter ?: mutableListOf(),
      occurrence = this@SupplyRequestSurrogate.occurrence,
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@SupplyRequestSurrogate.authoredOn),
          this@SupplyRequestSurrogate._authoredOn,
        ),
      requester = this@SupplyRequestSurrogate.requester,
      supplier = this@SupplyRequestSurrogate.supplier ?: mutableListOf(),
      reasonCode = this@SupplyRequestSurrogate.reasonCode ?: mutableListOf(),
      reasonReference = this@SupplyRequestSurrogate.reasonReference ?: mutableListOf(),
      deliverFrom = this@SupplyRequestSurrogate.deliverFrom,
      deliverTo = this@SupplyRequestSurrogate.deliverTo,
    )

  public companion object {
    public fun fromModel(model: SupplyRequest): SupplyRequestSurrogate =
      with(model) {
        SupplyRequestSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeIf { it.isNotEmpty() },
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          category = this@with.category,
          priority = this@with.priority?.value?.getCode(),
          _priority = this@with.priority?.toElement(),
          item = this@with.item,
          quantity = this@with.quantity,
          parameter = this@with.parameter.takeIf { it.isNotEmpty() },
          occurrence = this@with.occurrence,
          authoredOn = this@with.authoredOn?.value?.toString(),
          _authoredOn = this@with.authoredOn?.toElement(),
          requester = this@with.requester,
          supplier = this@with.supplier.takeIf { it.isNotEmpty() },
          reasonCode = this@with.reasonCode.takeIf { it.isNotEmpty() },
          reasonReference = this@with.reasonReference.takeIf { it.isNotEmpty() },
          deliverFrom = this@with.deliverFrom,
          deliverTo = this@with.deliverTo,
        )
      }
  }
}
