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

import com.google.fhir.model.r4.Decimal
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.PositiveInt
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.SampledData
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SampledDataSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var origin: Quantity? = null,
  public var period: Double? = null,
  public var _period: Element? = null,
  public var factor: Double? = null,
  public var _factor: Element? = null,
  public var lowerLimit: Double? = null,
  public var _lowerLimit: Element? = null,
  public var upperLimit: Double? = null,
  public var _upperLimit: Element? = null,
  public var dimensions: Int? = null,
  public var _dimensions: Element? = null,
  public var `data`: KotlinString? = null,
  public var _data: Element? = null,
) {
  public fun toModel(): SampledData =
    SampledData().apply {
      id = this@SampledDataSurrogate.id
      extension = this@SampledDataSurrogate.extension
      origin = this@SampledDataSurrogate.origin
      period = Decimal.of(this@SampledDataSurrogate.period, this@SampledDataSurrogate._period)
      factor = Decimal.of(this@SampledDataSurrogate.factor, this@SampledDataSurrogate._factor)
      lowerLimit =
        Decimal.of(this@SampledDataSurrogate.lowerLimit, this@SampledDataSurrogate._lowerLimit)
      upperLimit =
        Decimal.of(this@SampledDataSurrogate.upperLimit, this@SampledDataSurrogate._upperLimit)
      dimensions =
        PositiveInt.of(this@SampledDataSurrogate.dimensions, this@SampledDataSurrogate._dimensions)
      `data` = R4String.of(this@SampledDataSurrogate.`data`, this@SampledDataSurrogate._data)
    }

  public companion object {
    public fun fromModel(model: SampledData): SampledDataSurrogate =
      with(model) {
        SampledDataSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          origin = this@with.origin
          period = this@with.period?.value
          _period = this@with.period?.toElement()
          factor = this@with.factor?.value
          _factor = this@with.factor?.toElement()
          lowerLimit = this@with.lowerLimit?.value
          _lowerLimit = this@with.lowerLimit?.toElement()
          upperLimit = this@with.upperLimit?.value
          _upperLimit = this@with.upperLimit?.toElement()
          dimensions = this@with.dimensions?.value
          _dimensions = this@with.dimensions?.toElement()
          `data` = this@with.`data`?.value
          _data = this@with.`data`?.toElement()
        }
      }
  }
}
