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

import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Decimal
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.PositiveInt
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Time
import com.google.fhir.model.r5.Timing
import com.google.fhir.model.r5.UnsignedInt
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.datetime.LocalTime
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class TimingRepeatBoundsSurrogate(
  public var boundsDuration: Duration? = null,
  public var boundsRange: Range? = null,
  public var boundsPeriod: Period? = null,
) {
  public fun toModel(): Timing.Repeat.Bounds =
    Timing.Repeat.Bounds?.from(
      this@TimingRepeatBoundsSurrogate.boundsDuration,
      this@TimingRepeatBoundsSurrogate.boundsRange,
      this@TimingRepeatBoundsSurrogate.boundsPeriod,
    )!!

  public companion object {
    public fun fromModel(model: Timing.Repeat.Bounds): TimingRepeatBoundsSurrogate =
      with(model) {
        TimingRepeatBoundsSurrogate(
          boundsDuration = this@with.asDuration()?.value,
          boundsRange = this@with.asRange()?.value,
          boundsPeriod = this@with.asPeriod()?.value,
        )
      }
  }
}

@Serializable
internal data class TimingRepeatSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var bounds: Timing.Repeat.Bounds? = null,
  public var count: Int? = null,
  public var _count: Element? = null,
  public var countMax: Int? = null,
  public var _countMax: Element? = null,
  public var duration: Double? = null,
  public var _duration: Element? = null,
  public var durationMax: Double? = null,
  public var _durationMax: Element? = null,
  public var durationUnit: String? = null,
  public var _durationUnit: Element? = null,
  public var frequency: Int? = null,
  public var _frequency: Element? = null,
  public var frequencyMax: Int? = null,
  public var _frequencyMax: Element? = null,
  public var period: Double? = null,
  public var _period: Element? = null,
  public var periodMax: Double? = null,
  public var _periodMax: Element? = null,
  public var periodUnit: String? = null,
  public var _periodUnit: Element? = null,
  public var dayOfWeek: MutableList<String?>? = null,
  public var _dayOfWeek: MutableList<Element?>? = null,
  public var timeOfDay: MutableList<LocalTime?>? = null,
  public var _timeOfDay: MutableList<Element?>? = null,
  public var `when`: MutableList<String?>? = null,
  public var _when: MutableList<Element?>? = null,
  public var offset: Int? = null,
  public var _offset: Element? = null,
) {
  public fun toModel(): Timing.Repeat =
    Timing.Repeat(
      id = this@TimingRepeatSurrogate.id,
      extension = this@TimingRepeatSurrogate.extension ?: mutableListOf(),
      bounds = this@TimingRepeatSurrogate.bounds,
      count = PositiveInt.of(this@TimingRepeatSurrogate.count, this@TimingRepeatSurrogate._count),
      countMax =
        PositiveInt.of(this@TimingRepeatSurrogate.countMax, this@TimingRepeatSurrogate._countMax),
      duration =
        Decimal.of(this@TimingRepeatSurrogate.duration, this@TimingRepeatSurrogate._duration),
      durationMax =
        Decimal.of(this@TimingRepeatSurrogate.durationMax, this@TimingRepeatSurrogate._durationMax),
      durationUnit =
        this@TimingRepeatSurrogate.durationUnit?.let {
          Enumeration.of(
            com.google.fhir.model.r5.Timing.UnitsOfTime.fromCode(it!!),
            this@TimingRepeatSurrogate._durationUnit,
          )
        },
      frequency =
        PositiveInt.of(this@TimingRepeatSurrogate.frequency, this@TimingRepeatSurrogate._frequency),
      frequencyMax =
        PositiveInt.of(
          this@TimingRepeatSurrogate.frequencyMax,
          this@TimingRepeatSurrogate._frequencyMax,
        ),
      period = Decimal.of(this@TimingRepeatSurrogate.period, this@TimingRepeatSurrogate._period),
      periodMax =
        Decimal.of(this@TimingRepeatSurrogate.periodMax, this@TimingRepeatSurrogate._periodMax),
      periodUnit =
        this@TimingRepeatSurrogate.periodUnit?.let {
          Enumeration.of(
            com.google.fhir.model.r5.Timing.UnitsOfTime.fromCode(it!!),
            this@TimingRepeatSurrogate._periodUnit,
          )
        },
      dayOfWeek =
        if (
          this@TimingRepeatSurrogate.dayOfWeek == null &&
            this@TimingRepeatSurrogate._dayOfWeek == null
        ) {
          mutableListOf()
        } else {
          (this@TimingRepeatSurrogate.dayOfWeek
              ?: List(this@TimingRepeatSurrogate._dayOfWeek!!.size) { null })
            .zip(
              this@TimingRepeatSurrogate._dayOfWeek
                ?: List(this@TimingRepeatSurrogate.dayOfWeek!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let { com.google.fhir.model.r5.Timing.DayOfWeek.fromCode(it!!)!! },
                element,
              )
            }
            .toMutableList()
        },
      timeOfDay =
        if (
          this@TimingRepeatSurrogate.timeOfDay == null &&
            this@TimingRepeatSurrogate._timeOfDay == null
        ) {
          mutableListOf()
        } else {
          (this@TimingRepeatSurrogate.timeOfDay
              ?: List(this@TimingRepeatSurrogate._timeOfDay!!.size) { null })
            .zip(
              this@TimingRepeatSurrogate._timeOfDay
                ?: List(this@TimingRepeatSurrogate.timeOfDay!!.size) { null }
            )
            .map { (value, element) -> Time.of(value, element)!! }
            .toMutableList()
        },
      `when` =
        if (this@TimingRepeatSurrogate.`when` == null && this@TimingRepeatSurrogate._when == null) {
          mutableListOf()
        } else {
          (this@TimingRepeatSurrogate.`when`
              ?: List(this@TimingRepeatSurrogate._when!!.size) { null })
            .zip(
              this@TimingRepeatSurrogate._when
                ?: List(this@TimingRepeatSurrogate.`when`!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let { com.google.fhir.model.r5.Timing.EventTiming.fromCode(it!!)!! },
                element,
              )
            }
            .toMutableList()
        },
      offset = UnsignedInt.of(this@TimingRepeatSurrogate.offset, this@TimingRepeatSurrogate._offset),
    )

  public companion object {
    public fun fromModel(model: Timing.Repeat): TimingRepeatSurrogate =
      with(model) {
        TimingRepeatSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          bounds = this@with.bounds,
          count = this@with.count?.value,
          _count = this@with.count?.toElement(),
          countMax = this@with.countMax?.value,
          _countMax = this@with.countMax?.toElement(),
          duration = this@with.duration?.value,
          _duration = this@with.duration?.toElement(),
          durationMax = this@with.durationMax?.value,
          _durationMax = this@with.durationMax?.toElement(),
          durationUnit = this@with.durationUnit?.value?.getCode(),
          _durationUnit = this@with.durationUnit?.toElement(),
          frequency = this@with.frequency?.value,
          _frequency = this@with.frequency?.toElement(),
          frequencyMax = this@with.frequencyMax?.value,
          _frequencyMax = this@with.frequencyMax?.toElement(),
          period = this@with.period?.value,
          _period = this@with.period?.toElement(),
          periodMax = this@with.periodMax?.value,
          _periodMax = this@with.periodMax?.toElement(),
          periodUnit = this@with.periodUnit?.value?.getCode(),
          _periodUnit = this@with.periodUnit?.toElement(),
          dayOfWeek =
            this@with.dayOfWeek
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _dayOfWeek =
            this@with.dayOfWeek
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          timeOfDay =
            this@with.timeOfDay
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _timeOfDay =
            this@with.timeOfDay
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          `when` =
            this@with.`when`
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _when =
            this@with.`when`
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          offset = this@with.offset?.value,
          _offset = this@with.offset?.toElement(),
        )
      }
  }
}

@Serializable
internal data class TimingSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var event: MutableList<String?>? = null,
  public var _event: MutableList<Element?>? = null,
  public var repeat: Timing.Repeat? = null,
  public var code: CodeableConcept? = null,
) {
  public fun toModel(): Timing =
    Timing(
      id = this@TimingSurrogate.id,
      extension = this@TimingSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@TimingSurrogate.modifierExtension ?: mutableListOf(),
      event =
        if (this@TimingSurrogate.event == null && this@TimingSurrogate._event == null) {
          mutableListOf()
        } else {
          (this@TimingSurrogate.event ?: List(this@TimingSurrogate._event!!.size) { null })
            .zip(this@TimingSurrogate._event ?: List(this@TimingSurrogate.event!!.size) { null })
            .map { (value, element) -> DateTime.of(FhirDateTime.fromString(value), element)!! }
            .toMutableList()
        },
      repeat = this@TimingSurrogate.repeat,
      code = this@TimingSurrogate.code,
    )

  public companion object {
    public fun fromModel(model: Timing): TimingSurrogate =
      with(model) {
        TimingSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          event =
            this@with.event
              .map { it.value?.toString() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _event =
            this@with.event
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          repeat = this@with.repeat,
          code = this@with.code,
        )
      }
  }
}
