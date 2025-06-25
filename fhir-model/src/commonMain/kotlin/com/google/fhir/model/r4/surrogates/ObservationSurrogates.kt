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

import com.google.fhir.model.r4.Annotation
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Instant
import com.google.fhir.model.r4.Integer
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Observation
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Range
import com.google.fhir.model.r4.Ratio
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.SampledData
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Time
import com.google.fhir.model.r4.Timing
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.datetime.LocalTime
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ObservationReferenceRangeSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var low: Quantity? = null,
  public var high: Quantity? = null,
  public var type: CodeableConcept? = null,
  public var appliesTo: List<CodeableConcept?>? = null,
  public var age: Range? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
) {
  public fun toModel(): Observation.ReferenceRange =
    Observation.ReferenceRange().apply {
      id = this@ObservationReferenceRangeSurrogate.id
      extension = this@ObservationReferenceRangeSurrogate.extension
      modifierExtension = this@ObservationReferenceRangeSurrogate.modifierExtension
      low = this@ObservationReferenceRangeSurrogate.low
      high = this@ObservationReferenceRangeSurrogate.high
      type = this@ObservationReferenceRangeSurrogate.type
      appliesTo = this@ObservationReferenceRangeSurrogate.appliesTo
      age = this@ObservationReferenceRangeSurrogate.age
      text =
        R4String.of(
          this@ObservationReferenceRangeSurrogate.text,
          this@ObservationReferenceRangeSurrogate._text,
        )
    }

  public companion object {
    public fun fromModel(model: Observation.ReferenceRange): ObservationReferenceRangeSurrogate =
      with(model) {
        ObservationReferenceRangeSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          low = this@with.low
          high = this@with.high
          type = this@with.type
          appliesTo = this@with.appliesTo
          age = this@with.age
          text = this@with.text?.value
          _text = this@with.text?.toElement()
        }
      }
  }
}

@Serializable
internal data class ObservationComponentSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueInteger: Int? = null,
  public var _valueInteger: Element? = null,
  public var valueRange: Range? = null,
  public var valueRatio: Ratio? = null,
  public var valueSampledData: SampledData? = null,
  public var valueTime: LocalTime? = null,
  public var _valueTime: Element? = null,
  public var valueDateTime: KotlinString? = null,
  public var _valueDateTime: Element? = null,
  public var valuePeriod: Period? = null,
  public var dataAbsentReason: CodeableConcept? = null,
  public var interpretation: List<CodeableConcept?>? = null,
  public var referenceRange: List<Observation.ReferenceRange?>? = null,
) {
  public fun toModel(): Observation.Component =
    Observation.Component().apply {
      id = this@ObservationComponentSurrogate.id
      extension = this@ObservationComponentSurrogate.extension
      modifierExtension = this@ObservationComponentSurrogate.modifierExtension
      code = this@ObservationComponentSurrogate.code
      `value` =
        Observation.Component.Value?.from(
          this@ObservationComponentSurrogate.valueQuantity,
          this@ObservationComponentSurrogate.valueCodeableConcept,
          R4String.of(
            this@ObservationComponentSurrogate.valueString,
            this@ObservationComponentSurrogate._valueString,
          ),
          R4Boolean.of(
            this@ObservationComponentSurrogate.valueBoolean,
            this@ObservationComponentSurrogate._valueBoolean,
          ),
          Integer.of(
            this@ObservationComponentSurrogate.valueInteger,
            this@ObservationComponentSurrogate._valueInteger,
          ),
          this@ObservationComponentSurrogate.valueRange,
          this@ObservationComponentSurrogate.valueRatio,
          this@ObservationComponentSurrogate.valueSampledData,
          Time.of(
            this@ObservationComponentSurrogate.valueTime,
            this@ObservationComponentSurrogate._valueTime,
          ),
          DateTime.of(
            FhirDateTime.fromString(this@ObservationComponentSurrogate.valueDateTime),
            this@ObservationComponentSurrogate._valueDateTime,
          ),
          this@ObservationComponentSurrogate.valuePeriod,
        )
      dataAbsentReason = this@ObservationComponentSurrogate.dataAbsentReason
      interpretation = this@ObservationComponentSurrogate.interpretation
      referenceRange = this@ObservationComponentSurrogate.referenceRange
    }

  public companion object {
    public fun fromModel(model: Observation.Component): ObservationComponentSurrogate =
      with(model) {
        ObservationComponentSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value
          valueString = this@with.`value`?.asString()?.value?.value
          _valueString = this@with.`value`?.asString()?.value?.toElement()
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement()
          valueInteger = this@with.`value`?.asInteger()?.value?.value
          _valueInteger = this@with.`value`?.asInteger()?.value?.toElement()
          valueRange = this@with.`value`?.asRange()?.value
          valueRatio = this@with.`value`?.asRatio()?.value
          valueSampledData = this@with.`value`?.asSampledData()?.value
          valueTime = this@with.`value`?.asTime()?.value?.value
          _valueTime = this@with.`value`?.asTime()?.value?.toElement()
          valueDateTime = this@with.`value`?.asDateTime()?.value?.value?.toString()
          _valueDateTime = this@with.`value`?.asDateTime()?.value?.toElement()
          valuePeriod = this@with.`value`?.asPeriod()?.value
          dataAbsentReason = this@with.dataAbsentReason
          interpretation = this@with.interpretation
          referenceRange = this@with.referenceRange
        }
      }
  }
}

@Serializable
internal data class ObservationSurrogate(
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
  public var basedOn: List<Reference?>? = null,
  public var partOf: List<Reference?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var focus: List<Reference?>? = null,
  public var encounter: Reference? = null,
  public var effectiveDateTime: KotlinString? = null,
  public var _effectiveDateTime: Element? = null,
  public var effectivePeriod: Period? = null,
  public var effectiveTiming: Timing? = null,
  public var effectiveInstant: KotlinString? = null,
  public var _effectiveInstant: Element? = null,
  public var issued: KotlinString? = null,
  public var _issued: Element? = null,
  public var performer: List<Reference?>? = null,
  public var valueQuantity: Quantity? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueInteger: Int? = null,
  public var _valueInteger: Element? = null,
  public var valueRange: Range? = null,
  public var valueRatio: Ratio? = null,
  public var valueSampledData: SampledData? = null,
  public var valueTime: LocalTime? = null,
  public var _valueTime: Element? = null,
  public var valueDateTime: KotlinString? = null,
  public var _valueDateTime: Element? = null,
  public var valuePeriod: Period? = null,
  public var dataAbsentReason: CodeableConcept? = null,
  public var interpretation: List<CodeableConcept?>? = null,
  public var note: List<Annotation?>? = null,
  public var bodySite: CodeableConcept? = null,
  public var method: CodeableConcept? = null,
  public var specimen: Reference? = null,
  public var device: Reference? = null,
  public var referenceRange: List<Observation.ReferenceRange>? = null,
  public var hasMember: List<Reference?>? = null,
  public var derivedFrom: List<Reference?>? = null,
  public var component: List<Observation.Component>? = null,
) {
  public fun toModel(): Observation =
    Observation().apply {
      id = this@ObservationSurrogate.id
      meta = this@ObservationSurrogate.meta
      implicitRules =
        Uri.of(this@ObservationSurrogate.implicitRules, this@ObservationSurrogate._implicitRules)
      language = Code.of(this@ObservationSurrogate.language, this@ObservationSurrogate._language)
      text = this@ObservationSurrogate.text
      contained = this@ObservationSurrogate.contained
      extension = this@ObservationSurrogate.extension
      modifierExtension = this@ObservationSurrogate.modifierExtension
      identifier = this@ObservationSurrogate.identifier
      basedOn = this@ObservationSurrogate.basedOn
      partOf = this@ObservationSurrogate.partOf
      status =
        Enumeration.of(
          this@ObservationSurrogate.status?.let {
            com.google.fhir.model.r4.Observation.ObservationStatus.fromCode(it)
          },
          this@ObservationSurrogate._status,
        )
      category = this@ObservationSurrogate.category
      code = this@ObservationSurrogate.code
      subject = this@ObservationSurrogate.subject
      focus = this@ObservationSurrogate.focus
      encounter = this@ObservationSurrogate.encounter
      effective =
        Observation.Effective?.from(
          DateTime.of(
            FhirDateTime.fromString(this@ObservationSurrogate.effectiveDateTime),
            this@ObservationSurrogate._effectiveDateTime,
          ),
          this@ObservationSurrogate.effectivePeriod,
          this@ObservationSurrogate.effectiveTiming,
          Instant.of(
            FhirDateTime.fromString(this@ObservationSurrogate.effectiveInstant),
            this@ObservationSurrogate._effectiveInstant,
          ),
        )
      issued =
        Instant.of(
          FhirDateTime.fromString(this@ObservationSurrogate.issued),
          this@ObservationSurrogate._issued,
        )
      performer = this@ObservationSurrogate.performer
      `value` =
        Observation.Value?.from(
          this@ObservationSurrogate.valueQuantity,
          this@ObservationSurrogate.valueCodeableConcept,
          R4String.of(
            this@ObservationSurrogate.valueString,
            this@ObservationSurrogate._valueString,
          ),
          R4Boolean.of(
            this@ObservationSurrogate.valueBoolean,
            this@ObservationSurrogate._valueBoolean,
          ),
          Integer.of(
            this@ObservationSurrogate.valueInteger,
            this@ObservationSurrogate._valueInteger,
          ),
          this@ObservationSurrogate.valueRange,
          this@ObservationSurrogate.valueRatio,
          this@ObservationSurrogate.valueSampledData,
          Time.of(this@ObservationSurrogate.valueTime, this@ObservationSurrogate._valueTime),
          DateTime.of(
            FhirDateTime.fromString(this@ObservationSurrogate.valueDateTime),
            this@ObservationSurrogate._valueDateTime,
          ),
          this@ObservationSurrogate.valuePeriod,
        )
      dataAbsentReason = this@ObservationSurrogate.dataAbsentReason
      interpretation = this@ObservationSurrogate.interpretation
      note = this@ObservationSurrogate.note
      bodySite = this@ObservationSurrogate.bodySite
      method = this@ObservationSurrogate.method
      specimen = this@ObservationSurrogate.specimen
      device = this@ObservationSurrogate.device
      referenceRange = this@ObservationSurrogate.referenceRange
      hasMember = this@ObservationSurrogate.hasMember
      derivedFrom = this@ObservationSurrogate.derivedFrom
      component = this@ObservationSurrogate.component
    }

  public companion object {
    public fun fromModel(model: Observation): ObservationSurrogate =
      with(model) {
        ObservationSurrogate().apply {
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
          category = this@with.category
          code = this@with.code
          subject = this@with.subject
          focus = this@with.focus
          encounter = this@with.encounter
          effectiveDateTime = this@with.effective?.asDateTime()?.value?.value?.toString()
          _effectiveDateTime = this@with.effective?.asDateTime()?.value?.toElement()
          effectivePeriod = this@with.effective?.asPeriod()?.value
          effectiveTiming = this@with.effective?.asTiming()?.value
          effectiveInstant = this@with.effective?.asInstant()?.value?.value?.toString()
          _effectiveInstant = this@with.effective?.asInstant()?.value?.toElement()
          issued = this@with.issued?.value?.toString()
          _issued = this@with.issued?.toElement()
          performer = this@with.performer
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value
          valueString = this@with.`value`?.asString()?.value?.value
          _valueString = this@with.`value`?.asString()?.value?.toElement()
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement()
          valueInteger = this@with.`value`?.asInteger()?.value?.value
          _valueInteger = this@with.`value`?.asInteger()?.value?.toElement()
          valueRange = this@with.`value`?.asRange()?.value
          valueRatio = this@with.`value`?.asRatio()?.value
          valueSampledData = this@with.`value`?.asSampledData()?.value
          valueTime = this@with.`value`?.asTime()?.value?.value
          _valueTime = this@with.`value`?.asTime()?.value?.toElement()
          valueDateTime = this@with.`value`?.asDateTime()?.value?.value?.toString()
          _valueDateTime = this@with.`value`?.asDateTime()?.value?.toElement()
          valuePeriod = this@with.`value`?.asPeriod()?.value
          dataAbsentReason = this@with.dataAbsentReason
          interpretation = this@with.interpretation
          note = this@with.note
          bodySite = this@with.bodySite
          method = this@with.method
          specimen = this@with.specimen
          device = this@with.device
          referenceRange = this@with.referenceRange
          hasMember = this@with.hasMember
          derivedFrom = this@with.derivedFrom
          component = this@with.component
        }
      }
  }
}
