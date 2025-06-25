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
import kotlin.collections.List
import kotlinx.datetime.LocalTime
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class TimingRepeatSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var boundsDuration: Duration? = null,
  public var boundsRange: Range? = null,
  public var boundsPeriod: Period? = null,
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
  public var dayOfWeek: List<String?>? = null,
  public var _dayOfWeek: List<Element?>? = null,
  public var timeOfDay: List<LocalTime?>? = null,
  public var _timeOfDay: List<Element?>? = null,
  public var `when`: List<String?>? = null,
  public var _when: List<Element?>? = null,
  public var offset: Int? = null,
  public var _offset: Element? = null,
) {
  public fun toModel(): Timing.Repeat =
    Timing.Repeat().apply {
      id = this@TimingRepeatSurrogate.id
      extension = this@TimingRepeatSurrogate.extension
      bounds =
        Timing.Repeat.Bounds?.from(
          this@TimingRepeatSurrogate.boundsDuration,
          this@TimingRepeatSurrogate.boundsRange,
          this@TimingRepeatSurrogate.boundsPeriod,
        )
      count = PositiveInt.of(this@TimingRepeatSurrogate.count, this@TimingRepeatSurrogate._count)
      countMax =
        PositiveInt.of(this@TimingRepeatSurrogate.countMax, this@TimingRepeatSurrogate._countMax)
      duration =
        Decimal.of(this@TimingRepeatSurrogate.duration, this@TimingRepeatSurrogate._duration)
      durationMax =
        Decimal.of(this@TimingRepeatSurrogate.durationMax, this@TimingRepeatSurrogate._durationMax)
      durationUnit =
        Code.of(this@TimingRepeatSurrogate.durationUnit, this@TimingRepeatSurrogate._durationUnit)
      frequency =
        PositiveInt.of(this@TimingRepeatSurrogate.frequency, this@TimingRepeatSurrogate._frequency)
      frequencyMax =
        PositiveInt.of(
          this@TimingRepeatSurrogate.frequencyMax,
          this@TimingRepeatSurrogate._frequencyMax,
        )
      period = Decimal.of(this@TimingRepeatSurrogate.period, this@TimingRepeatSurrogate._period)
      periodMax =
        Decimal.of(this@TimingRepeatSurrogate.periodMax, this@TimingRepeatSurrogate._periodMax)
      periodUnit =
        Code.of(this@TimingRepeatSurrogate.periodUnit, this@TimingRepeatSurrogate._periodUnit)
      dayOfWeek =
        if (
          this@TimingRepeatSurrogate.dayOfWeek == null &&
            this@TimingRepeatSurrogate._dayOfWeek == null
        ) {
          null
        } else {
          (this@TimingRepeatSurrogate.dayOfWeek
              ?: List(this@TimingRepeatSurrogate._dayOfWeek!!.size) { null })
            .zip(
              this@TimingRepeatSurrogate._dayOfWeek
                ?: List(this@TimingRepeatSurrogate.dayOfWeek!!.size) { null }
            )
            .mapNotNull { (value, element) ->
              Enumeration.of(
                value?.let { com.google.fhir.model.r5.Timing.DayOfWeek.fromCode(it) },
                element,
              )
            }
        }
      timeOfDay =
        if (
          this@TimingRepeatSurrogate.timeOfDay == null &&
            this@TimingRepeatSurrogate._timeOfDay == null
        ) {
          null
        } else {
          (this@TimingRepeatSurrogate.timeOfDay
              ?: List(this@TimingRepeatSurrogate._timeOfDay!!.size) { null })
            .zip(
              this@TimingRepeatSurrogate._timeOfDay
                ?: List(this@TimingRepeatSurrogate.timeOfDay!!.size) { null }
            )
            .mapNotNull { (value, element) -> Time.of(value, element) }
        }
      `when` =
        if (this@TimingRepeatSurrogate.`when` == null && this@TimingRepeatSurrogate._when == null) {
          null
        } else {
          (this@TimingRepeatSurrogate.`when`
              ?: List(this@TimingRepeatSurrogate._when!!.size) { null })
            .zip(
              this@TimingRepeatSurrogate._when
                ?: List(this@TimingRepeatSurrogate.`when`!!.size) { null }
            )
            .mapNotNull { (value, element) ->
              Enumeration.of(
                value?.let { com.google.fhir.model.r5.Timing.EventTiming.fromCode(it) },
                element,
              )
            }
        }
      offset = UnsignedInt.of(this@TimingRepeatSurrogate.offset, this@TimingRepeatSurrogate._offset)
    }

  public companion object {
    public fun fromModel(model: Timing.Repeat): TimingRepeatSurrogate =
      with(model) {
        TimingRepeatSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          boundsDuration = this@with.bounds?.asDuration()?.value
          boundsRange = this@with.bounds?.asRange()?.value
          boundsPeriod = this@with.bounds?.asPeriod()?.value
          count = this@with.count?.value
          _count = this@with.count?.toElement()
          countMax = this@with.countMax?.value
          _countMax = this@with.countMax?.toElement()
          duration = this@with.duration?.value
          _duration = this@with.duration?.toElement()
          durationMax = this@with.durationMax?.value
          _durationMax = this@with.durationMax?.toElement()
          durationUnit = this@with.durationUnit?.value
          _durationUnit = this@with.durationUnit?.toElement()
          frequency = this@with.frequency?.value
          _frequency = this@with.frequency?.toElement()
          frequencyMax = this@with.frequencyMax?.value
          _frequencyMax = this@with.frequencyMax?.toElement()
          period = this@with.period?.value
          _period = this@with.period?.toElement()
          periodMax = this@with.periodMax?.value
          _periodMax = this@with.periodMax?.toElement()
          periodUnit = this@with.periodUnit?.value
          _periodUnit = this@with.periodUnit?.toElement()
          dayOfWeek =
            this@with.dayOfWeek?.map { it?.value?.getCode() }?.takeUnless { it.all { it == null } }
          _dayOfWeek =
            this@with.dayOfWeek?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          timeOfDay = this@with.timeOfDay?.map { it?.value }?.takeUnless { it.all { it == null } }
          _timeOfDay =
            this@with.timeOfDay?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          `when` =
            this@with.`when`?.map { it?.value?.getCode() }?.takeUnless { it.all { it == null } }
          _when = this@with.`when`?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          offset = this@with.offset?.value
          _offset = this@with.offset?.toElement()
        }
      }
  }
}

@Serializable
internal data class TimingSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var event: List<String?>? = null,
  public var _event: List<Element?>? = null,
  public var repeat: Timing.Repeat? = null,
  public var code: CodeableConcept? = null,
) {
  public fun toModel(): Timing =
    Timing().apply {
      id = this@TimingSurrogate.id
      extension = this@TimingSurrogate.extension
      modifierExtension = this@TimingSurrogate.modifierExtension
      event =
        if (this@TimingSurrogate.event == null && this@TimingSurrogate._event == null) {
          null
        } else {
          (this@TimingSurrogate.event ?: List(this@TimingSurrogate._event!!.size) { null })
            .zip(this@TimingSurrogate._event ?: List(this@TimingSurrogate.event!!.size) { null })
            .mapNotNull { (value, element) -> DateTime.of(FhirDateTime.fromString(value), element) }
        }
      repeat = this@TimingSurrogate.repeat
      code = this@TimingSurrogate.code
    }

  public companion object {
    public fun fromModel(model: Timing): TimingSurrogate =
      with(model) {
        TimingSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          event =
            this@with.event?.map { it?.value?.toString() }?.takeUnless { it.all { it == null } }
          _event = this@with.event?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          repeat = this@with.repeat
          code = this@with.code
        }
      }
  }
}
