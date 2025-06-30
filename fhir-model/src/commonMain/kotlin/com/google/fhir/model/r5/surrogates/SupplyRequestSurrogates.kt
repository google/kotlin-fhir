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

import com.google.fhir.model.r5.Boolean as R5Boolean
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
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.SupplyRequest
import com.google.fhir.model.r5.Timing
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal class SupplyRequestParameterValueSurrogate {
  public var valueCodeableConcept: CodeableConcept? = null

  public var valueQuantity: Quantity? = null

  public var valueRange: Range? = null

  public var valueBoolean: KotlinBoolean? = null

  public var _valueBoolean: Element? = null

  public fun toModel(): SupplyRequest.Parameter.Value =
    SupplyRequest.Parameter.Value?.from(
      this@SupplyRequestParameterValueSurrogate.valueCodeableConcept,
      this@SupplyRequestParameterValueSurrogate.valueQuantity,
      this@SupplyRequestParameterValueSurrogate.valueRange,
      R5Boolean.of(
        this@SupplyRequestParameterValueSurrogate.valueBoolean,
        this@SupplyRequestParameterValueSurrogate._valueBoolean,
      ),
    ) ?: SupplyRequest.Parameter.Value.Null

  public companion object {
    public fun fromModel(
      model: SupplyRequest.Parameter.Value
    ): SupplyRequestParameterValueSurrogate =
      with(model) {
        SupplyRequestParameterValueSurrogate().apply {
          valueCodeableConcept = this@with.asCodeableConcept()?.value
          valueQuantity = this@with.asQuantity()?.value
          valueRange = this@with.asRange()?.value
          valueBoolean = this@with.asBoolean()?.value?.value
          _valueBoolean = this@with.asBoolean()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class SupplyRequestParameterSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var `value`: SupplyRequest.Parameter.Value? = null,
) {
  public fun toModel(): SupplyRequest.Parameter =
    SupplyRequest.Parameter().apply {
      id = this@SupplyRequestParameterSurrogate.id
      extension = this@SupplyRequestParameterSurrogate.extension
      modifierExtension = this@SupplyRequestParameterSurrogate.modifierExtension
      code = this@SupplyRequestParameterSurrogate.code
      `value` = this@SupplyRequestParameterSurrogate.`value`
    }

  public companion object {
    public fun fromModel(model: SupplyRequest.Parameter): SupplyRequestParameterSurrogate =
      with(model) {
        SupplyRequestParameterSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          `value` = this@with.`value`
        }
      }
  }
}

@Serializable
internal class SupplyRequestOccurrenceSurrogate {
  public var occurrenceDateTime: String? = null

  public var _occurrenceDateTime: Element? = null

  public var occurrencePeriod: Period? = null

  public var occurrenceTiming: Timing? = null

  public fun toModel(): SupplyRequest.Occurrence =
    SupplyRequest.Occurrence?.from(
      DateTime.of(
        FhirDateTime.fromString(this@SupplyRequestOccurrenceSurrogate.occurrenceDateTime),
        this@SupplyRequestOccurrenceSurrogate._occurrenceDateTime,
      ),
      this@SupplyRequestOccurrenceSurrogate.occurrencePeriod,
      this@SupplyRequestOccurrenceSurrogate.occurrenceTiming,
    ) ?: SupplyRequest.Occurrence.Null

  public companion object {
    public fun fromModel(model: SupplyRequest.Occurrence): SupplyRequestOccurrenceSurrogate =
      with(model) {
        SupplyRequestOccurrenceSurrogate().apply {
          occurrenceDateTime = this@with.asDateTime()?.value?.value?.toString()
          _occurrenceDateTime = this@with.asDateTime()?.value?.toElement()
          occurrencePeriod = this@with.asPeriod()?.value
          occurrenceTiming = this@with.asTiming()?.value
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
  public var basedOn: List<Reference?>? = null,
  public var category: CodeableConcept? = null,
  public var priority: String? = null,
  public var _priority: Element? = null,
  public var deliverFor: Reference? = null,
  public var item: CodeableReference? = null,
  public var quantity: Quantity? = null,
  public var parameter: List<SupplyRequest.Parameter>? = null,
  public var authoredOn: String? = null,
  public var _authoredOn: Element? = null,
  public var requester: Reference? = null,
  public var supplier: List<Reference?>? = null,
  public var reason: List<CodeableReference?>? = null,
  public var deliverFrom: Reference? = null,
  public var deliverTo: Reference? = null,
  public var occurrence: SupplyRequest.Occurrence? = null,
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
            com.google.fhir.model.r5.SupplyRequest.SupplyRequestStatus.fromCode(it)
          },
          this@SupplyRequestSurrogate._status,
        )
      basedOn = this@SupplyRequestSurrogate.basedOn
      category = this@SupplyRequestSurrogate.category
      priority =
        Enumeration.of(
          this@SupplyRequestSurrogate.priority?.let {
            com.google.fhir.model.r5.SupplyRequest.RequestPriority.fromCode(it)
          },
          this@SupplyRequestSurrogate._priority,
        )
      deliverFor = this@SupplyRequestSurrogate.deliverFor
      item = this@SupplyRequestSurrogate.item
      quantity = this@SupplyRequestSurrogate.quantity
      parameter = this@SupplyRequestSurrogate.parameter
      occurrence = this@SupplyRequestSurrogate.occurrence
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@SupplyRequestSurrogate.authoredOn),
          this@SupplyRequestSurrogate._authoredOn,
        )
      requester = this@SupplyRequestSurrogate.requester
      supplier = this@SupplyRequestSurrogate.supplier
      reason = this@SupplyRequestSurrogate.reason
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
          basedOn = this@with.basedOn
          category = this@with.category
          priority = this@with.priority?.value?.getCode()
          _priority = this@with.priority?.toElement()
          deliverFor = this@with.deliverFor
          item = this@with.item
          quantity = this@with.quantity
          parameter = this@with.parameter
          occurrence = this@with.occurrence
          authoredOn = this@with.authoredOn?.value?.toString()
          _authoredOn = this@with.authoredOn?.toElement()
          requester = this@with.requester
          supplier = this@with.supplier
          reason = this@with.reason
          deliverFrom = this@with.deliverFrom
          deliverTo = this@with.deliverTo
        }
      }
  }
}
