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
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SupplyRequestParameterSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
) {
  public fun toModel(): SupplyRequest.Parameter =
    SupplyRequest.Parameter().apply {
      id = this@SupplyRequestParameterSurrogate.id
      extension = this@SupplyRequestParameterSurrogate.extension
      modifierExtension = this@SupplyRequestParameterSurrogate.modifierExtension
      code = this@SupplyRequestParameterSurrogate.code
      `value` =
        SupplyRequest.Parameter.Value?.from(
          this@SupplyRequestParameterSurrogate.valueCodeableConcept,
          this@SupplyRequestParameterSurrogate.valueQuantity,
          this@SupplyRequestParameterSurrogate.valueRange,
          R4bBoolean.of(
            this@SupplyRequestParameterSurrogate.valueBoolean,
            this@SupplyRequestParameterSurrogate._valueBoolean,
          ),
        )
    }

  public companion object {
    public fun fromModel(model: SupplyRequest.Parameter): SupplyRequestParameterSurrogate =
      with(model) {
        SupplyRequestParameterSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueRange = this@with.`value`?.asRange()?.value
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement()
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var category: CodeableConcept? = null,
  public var priority: String? = null,
  public var _priority: Element? = null,
  public var itemCodeableConcept: CodeableConcept? = null,
  public var itemReference: Reference? = null,
  public var quantity: Quantity? = null,
  public var parameter: List<SupplyRequest.Parameter>? = null,
  public var occurrenceDateTime: String? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var occurrenceTiming: Timing? = null,
  public var authoredOn: String? = null,
  public var _authoredOn: Element? = null,
  public var requester: Reference? = null,
  public var supplier: List<Reference?>? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var reasonReference: List<Reference?>? = null,
  public var deliverFrom: Reference? = null,
  public var deliverTo: Reference? = null,
) {
  public fun toModel(): SupplyRequest =
    SupplyRequest().apply {
      id = this@SupplyRequestSurrogate.id
      meta = this@SupplyRequestSurrogate.meta
      implicitRules =
        Uri.of(
          this@SupplyRequestSurrogate.implicitRules,
          this@SupplyRequestSurrogate._implicitRules,
        )
      language =
        Code.of(this@SupplyRequestSurrogate.language, this@SupplyRequestSurrogate._language)
      text = this@SupplyRequestSurrogate.text
      contained = this@SupplyRequestSurrogate.contained
      extension = this@SupplyRequestSurrogate.extension
      modifierExtension = this@SupplyRequestSurrogate.modifierExtension
      identifier = this@SupplyRequestSurrogate.identifier
      status =
        Enumeration.of(
          this@SupplyRequestSurrogate.status?.let {
            com.google.fhir.model.r4b.SupplyRequest.SupplyRequestStatus.fromCode(it)
          },
          this@SupplyRequestSurrogate._status,
        )
      category = this@SupplyRequestSurrogate.category
      priority =
        Enumeration.of(
          this@SupplyRequestSurrogate.priority?.let {
            com.google.fhir.model.r4b.SupplyRequest.RequestPriority.fromCode(it)
          },
          this@SupplyRequestSurrogate._priority,
        )
      item =
        SupplyRequest.Item?.from(
          this@SupplyRequestSurrogate.itemCodeableConcept,
          this@SupplyRequestSurrogate.itemReference,
        )
      quantity = this@SupplyRequestSurrogate.quantity
      parameter = this@SupplyRequestSurrogate.parameter
      occurrence =
        SupplyRequest.Occurrence?.from(
          DateTime.of(
            FhirDateTime.fromString(this@SupplyRequestSurrogate.occurrenceDateTime),
            this@SupplyRequestSurrogate._occurrenceDateTime,
          ),
          this@SupplyRequestSurrogate.occurrencePeriod,
          this@SupplyRequestSurrogate.occurrenceTiming,
        )
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@SupplyRequestSurrogate.authoredOn),
          this@SupplyRequestSurrogate._authoredOn,
        )
      requester = this@SupplyRequestSurrogate.requester
      supplier = this@SupplyRequestSurrogate.supplier
      reasonCode = this@SupplyRequestSurrogate.reasonCode
      reasonReference = this@SupplyRequestSurrogate.reasonReference
      deliverFrom = this@SupplyRequestSurrogate.deliverFrom
      deliverTo = this@SupplyRequestSurrogate.deliverTo
    }

  public companion object {
    public fun fromModel(model: SupplyRequest): SupplyRequestSurrogate =
      with(model) {
        SupplyRequestSurrogate().apply {
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
          category = this@with.category
          priority = this@with.priority?.value?.getCode()
          _priority = this@with.priority?.toElement()
          itemCodeableConcept = this@with.item?.asCodeableConcept()?.value
          itemReference = this@with.item?.asReference()?.value
          quantity = this@with.quantity
          parameter = this@with.parameter
          occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.value?.toString()
          _occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.toElement()
          occurrencePeriod = this@with.occurrence?.asPeriod()?.value
          occurrenceTiming = this@with.occurrence?.asTiming()?.value
          authoredOn = this@with.authoredOn?.value?.toString()
          _authoredOn = this@with.authoredOn?.toElement()
          requester = this@with.requester
          supplier = this@with.supplier
          reasonCode = this@with.reasonCode
          reasonReference = this@with.reasonReference
          deliverFrom = this@with.deliverFrom
          deliverTo = this@with.deliverTo
        }
      }
  }
}
