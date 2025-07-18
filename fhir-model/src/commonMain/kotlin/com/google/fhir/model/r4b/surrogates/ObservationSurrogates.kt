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
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Instant
import com.google.fhir.model.r4b.Integer
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Observation
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Range
import com.google.fhir.model.r4b.Ratio
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.SampledData
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Time
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.datetime.LocalTime
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ObservationReferenceRangeSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var low: Quantity? = null,
  public var high: Quantity? = null,
  public var type: CodeableConcept? = null,
  public var appliesTo: MutableList<CodeableConcept>? = null,
  public var age: Range? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
) {
  public fun toModel(): Observation.ReferenceRange =
    Observation.ReferenceRange(
      id = this@ObservationReferenceRangeSurrogate.id,
      extension = this@ObservationReferenceRangeSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ObservationReferenceRangeSurrogate.modifierExtension ?: mutableListOf(),
      low = this@ObservationReferenceRangeSurrogate.low,
      high = this@ObservationReferenceRangeSurrogate.high,
      type = this@ObservationReferenceRangeSurrogate.type,
      appliesTo = this@ObservationReferenceRangeSurrogate.appliesTo ?: mutableListOf(),
      age = this@ObservationReferenceRangeSurrogate.age,
      text =
        R4bString.of(
          this@ObservationReferenceRangeSurrogate.text,
          this@ObservationReferenceRangeSurrogate._text,
        ),
    )

  public companion object {
    public fun fromModel(model: Observation.ReferenceRange): ObservationReferenceRangeSurrogate =
      with(model) {
        ObservationReferenceRangeSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          low = this@with.low,
          high = this@with.high,
          type = this@with.type,
          appliesTo = this@with.appliesTo.takeUnless { it.all { it == null } },
          age = this@with.age,
          text = this@with.text?.value,
          _text = this@with.text?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ObservationComponentSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept,
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
  public var interpretation: MutableList<CodeableConcept>? = null,
  public var referenceRange: MutableList<Observation.ReferenceRange>? = null,
) {
  public fun toModel(): Observation.Component =
    Observation.Component(
      id = this@ObservationComponentSurrogate.id,
      extension = this@ObservationComponentSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ObservationComponentSurrogate.modifierExtension ?: mutableListOf(),
      code = this@ObservationComponentSurrogate.code,
      `value` =
        Observation.Component.Value?.from(
          this@ObservationComponentSurrogate.valueQuantity,
          this@ObservationComponentSurrogate.valueCodeableConcept,
          R4bString.of(
            this@ObservationComponentSurrogate.valueString,
            this@ObservationComponentSurrogate._valueString,
          ),
          R4bBoolean.of(
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
        ),
      dataAbsentReason = this@ObservationComponentSurrogate.dataAbsentReason,
      interpretation = this@ObservationComponentSurrogate.interpretation ?: mutableListOf(),
      referenceRange = this@ObservationComponentSurrogate.referenceRange ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Observation.Component): ObservationComponentSurrogate =
      with(model) {
        ObservationComponentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          valueQuantity = this@with.`value`?.asQuantity()?.value,
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value,
          valueString = this@with.`value`?.asString()?.value?.value,
          _valueString = this@with.`value`?.asString()?.value?.toElement(),
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value,
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement(),
          valueInteger = this@with.`value`?.asInteger()?.value?.value,
          _valueInteger = this@with.`value`?.asInteger()?.value?.toElement(),
          valueRange = this@with.`value`?.asRange()?.value,
          valueRatio = this@with.`value`?.asRatio()?.value,
          valueSampledData = this@with.`value`?.asSampledData()?.value,
          valueTime = this@with.`value`?.asTime()?.value?.value,
          _valueTime = this@with.`value`?.asTime()?.value?.toElement(),
          valueDateTime = this@with.`value`?.asDateTime()?.value?.value?.toString(),
          _valueDateTime = this@with.`value`?.asDateTime()?.value?.toElement(),
          valuePeriod = this@with.`value`?.asPeriod()?.value,
          dataAbsentReason = this@with.dataAbsentReason,
          interpretation = this@with.interpretation.takeUnless { it.all { it == null } },
          referenceRange = this@with.referenceRange.takeUnless { it.all { it == null } },
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var partOf: MutableList<Reference>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var code: CodeableConcept,
  public var subject: Reference? = null,
  public var focus: MutableList<Reference>? = null,
  public var encounter: Reference? = null,
  public var effectiveDateTime: KotlinString? = null,
  public var _effectiveDateTime: Element? = null,
  public var effectivePeriod: Period? = null,
  public var effectiveTiming: Timing? = null,
  public var effectiveInstant: KotlinString? = null,
  public var _effectiveInstant: Element? = null,
  public var issued: KotlinString? = null,
  public var _issued: Element? = null,
  public var performer: MutableList<Reference>? = null,
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
  public var interpretation: MutableList<CodeableConcept>? = null,
  public var note: MutableList<Annotation>? = null,
  public var bodySite: CodeableConcept? = null,
  public var method: CodeableConcept? = null,
  public var specimen: Reference? = null,
  public var device: Reference? = null,
  public var referenceRange: MutableList<Observation.ReferenceRange>? = null,
  public var hasMember: MutableList<Reference>? = null,
  public var derivedFrom: MutableList<Reference>? = null,
  public var component: MutableList<Observation.Component>? = null,
) {
  public fun toModel(): Observation =
    Observation(
      id = this@ObservationSurrogate.id,
      meta = this@ObservationSurrogate.meta,
      implicitRules =
        Uri.of(this@ObservationSurrogate.implicitRules, this@ObservationSurrogate._implicitRules),
      language = Code.of(this@ObservationSurrogate.language, this@ObservationSurrogate._language),
      text = this@ObservationSurrogate.text,
      contained = this@ObservationSurrogate.contained ?: mutableListOf(),
      extension = this@ObservationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ObservationSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ObservationSurrogate.identifier ?: mutableListOf(),
      basedOn = this@ObservationSurrogate.basedOn ?: mutableListOf(),
      partOf = this@ObservationSurrogate.partOf ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.Observation.ObservationStatus.fromCode(
            this@ObservationSurrogate.status!!
          ),
          this@ObservationSurrogate._status,
        ),
      category = this@ObservationSurrogate.category ?: mutableListOf(),
      code = this@ObservationSurrogate.code,
      subject = this@ObservationSurrogate.subject,
      focus = this@ObservationSurrogate.focus ?: mutableListOf(),
      encounter = this@ObservationSurrogate.encounter,
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
        ),
      issued =
        Instant.of(
          FhirDateTime.fromString(this@ObservationSurrogate.issued),
          this@ObservationSurrogate._issued,
        ),
      performer = this@ObservationSurrogate.performer ?: mutableListOf(),
      `value` =
        Observation.Value?.from(
          this@ObservationSurrogate.valueQuantity,
          this@ObservationSurrogate.valueCodeableConcept,
          R4bString.of(
            this@ObservationSurrogate.valueString,
            this@ObservationSurrogate._valueString,
          ),
          R4bBoolean.of(
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
        ),
      dataAbsentReason = this@ObservationSurrogate.dataAbsentReason,
      interpretation = this@ObservationSurrogate.interpretation ?: mutableListOf(),
      note = this@ObservationSurrogate.note ?: mutableListOf(),
      bodySite = this@ObservationSurrogate.bodySite,
      method = this@ObservationSurrogate.method,
      specimen = this@ObservationSurrogate.specimen,
      device = this@ObservationSurrogate.device,
      referenceRange = this@ObservationSurrogate.referenceRange ?: mutableListOf(),
      hasMember = this@ObservationSurrogate.hasMember ?: mutableListOf(),
      derivedFrom = this@ObservationSurrogate.derivedFrom ?: mutableListOf(),
      component = this@ObservationSurrogate.component ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Observation): ObservationSurrogate =
      with(model) {
        ObservationSurrogate(
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
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          code = this@with.code,
          subject = this@with.subject,
          focus = this@with.focus.takeUnless { it.all { it == null } },
          encounter = this@with.encounter,
          effectiveDateTime = this@with.effective?.asDateTime()?.value?.value?.toString(),
          _effectiveDateTime = this@with.effective?.asDateTime()?.value?.toElement(),
          effectivePeriod = this@with.effective?.asPeriod()?.value,
          effectiveTiming = this@with.effective?.asTiming()?.value,
          effectiveInstant = this@with.effective?.asInstant()?.value?.value?.toString(),
          _effectiveInstant = this@with.effective?.asInstant()?.value?.toElement(),
          issued = this@with.issued?.value?.toString(),
          _issued = this@with.issued?.toElement(),
          performer = this@with.performer.takeUnless { it.all { it == null } },
          valueQuantity = this@with.`value`?.asQuantity()?.value,
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value,
          valueString = this@with.`value`?.asString()?.value?.value,
          _valueString = this@with.`value`?.asString()?.value?.toElement(),
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value,
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement(),
          valueInteger = this@with.`value`?.asInteger()?.value?.value,
          _valueInteger = this@with.`value`?.asInteger()?.value?.toElement(),
          valueRange = this@with.`value`?.asRange()?.value,
          valueRatio = this@with.`value`?.asRatio()?.value,
          valueSampledData = this@with.`value`?.asSampledData()?.value,
          valueTime = this@with.`value`?.asTime()?.value?.value,
          _valueTime = this@with.`value`?.asTime()?.value?.toElement(),
          valueDateTime = this@with.`value`?.asDateTime()?.value?.value?.toString(),
          _valueDateTime = this@with.`value`?.asDateTime()?.value?.toElement(),
          valuePeriod = this@with.`value`?.asPeriod()?.value,
          dataAbsentReason = this@with.dataAbsentReason,
          interpretation = this@with.interpretation.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          bodySite = this@with.bodySite,
          method = this@with.method,
          specimen = this@with.specimen,
          device = this@with.device,
          referenceRange = this@with.referenceRange.takeUnless { it.all { it == null } },
          hasMember = this@with.hasMember.takeUnless { it.all { it == null } },
          derivedFrom = this@with.derivedFrom.takeUnless { it.all { it == null } },
          component = this@with.component.takeUnless { it.all { it == null } },
        )
      }
  }
}
