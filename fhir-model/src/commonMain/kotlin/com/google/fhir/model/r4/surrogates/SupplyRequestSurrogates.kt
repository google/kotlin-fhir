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

import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Range
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.SupplyRequest
import com.google.fhir.model.r4.Timing
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
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
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
) {
  public fun toModel(): SupplyRequest.Parameter =
    SupplyRequest.Parameter(
      id = this@SupplyRequestParameterSurrogate.id,
      extension = this@SupplyRequestParameterSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@SupplyRequestParameterSurrogate.modifierExtension ?: mutableListOf(),
      code = this@SupplyRequestParameterSurrogate.code,
      `value` =
        SupplyRequest.Parameter.Value?.from(
          this@SupplyRequestParameterSurrogate.valueCodeableConcept,
          this@SupplyRequestParameterSurrogate.valueQuantity,
          this@SupplyRequestParameterSurrogate.valueRange,
          R4Boolean.of(
            this@SupplyRequestParameterSurrogate.valueBoolean,
            this@SupplyRequestParameterSurrogate._valueBoolean,
          ),
        ),
    )

  public companion object {
    public fun fromModel(model: SupplyRequest.Parameter): SupplyRequestParameterSurrogate =
      with(model) {
        SupplyRequestParameterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value,
          valueQuantity = this@with.`value`?.asQuantity()?.value,
          valueRange = this@with.`value`?.asRange()?.value,
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value,
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement(),
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
  public var itemCodeableConcept: CodeableConcept? = null,
  public var itemReference: Reference? = null,
  public var quantity: Quantity,
  public var parameter: MutableList<SupplyRequest.Parameter>? = null,
  public var occurrenceDateTime: String? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var occurrenceTiming: Timing? = null,
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
            com.google.fhir.model.r4.SupplyRequest.SupplyRequestStatus.fromCode(it!!),
            this@SupplyRequestSurrogate._status,
          )
        },
      category = this@SupplyRequestSurrogate.category,
      priority =
        this@SupplyRequestSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r4.SupplyRequest.RequestPriority.fromCode(it!!),
            this@SupplyRequestSurrogate._priority,
          )
        },
      item =
        SupplyRequest.Item.from(
          this@SupplyRequestSurrogate.itemCodeableConcept,
          this@SupplyRequestSurrogate.itemReference,
        )!!,
      quantity = this@SupplyRequestSurrogate.quantity,
      parameter = this@SupplyRequestSurrogate.parameter ?: mutableListOf(),
      occurrence =
        SupplyRequest.Occurrence?.from(
          DateTime.of(
            FhirDateTime.fromString(this@SupplyRequestSurrogate.occurrenceDateTime),
            this@SupplyRequestSurrogate._occurrenceDateTime,
          ),
          this@SupplyRequestSurrogate.occurrencePeriod,
          this@SupplyRequestSurrogate.occurrenceTiming,
        ),
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
          contained = this@with.contained.takeUnless { it.all { it == null } },
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          category = this@with.category,
          priority = this@with.priority?.value?.getCode(),
          _priority = this@with.priority?.toElement(),
          itemCodeableConcept = this@with.item?.asCodeableConcept()?.value,
          itemReference = this@with.item?.asReference()?.value,
          quantity = this@with.quantity,
          parameter = this@with.parameter.takeUnless { it.all { it == null } },
          occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.value?.toString(),
          _occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.toElement(),
          occurrencePeriod = this@with.occurrence?.asPeriod()?.value,
          occurrenceTiming = this@with.occurrence?.asTiming()?.value,
          authoredOn = this@with.authoredOn?.value?.toString(),
          _authoredOn = this@with.authoredOn?.toElement(),
          requester = this@with.requester,
          supplier = this@with.supplier.takeUnless { it.all { it == null } },
          reasonCode = this@with.reasonCode.takeUnless { it.all { it == null } },
          reasonReference = this@with.reasonReference.takeUnless { it.all { it == null } },
          deliverFrom = this@with.deliverFrom,
          deliverTo = this@with.deliverTo,
        )
      }
  }
}
