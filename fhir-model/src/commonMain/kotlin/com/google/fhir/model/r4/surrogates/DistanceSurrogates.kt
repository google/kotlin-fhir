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

import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.Decimal
import com.google.fhir.model.r4.Distance
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DistanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var `value`: Double? = null,
  public var _value: Element? = null,
  public var comparator: KotlinString? = null,
  public var _comparator: Element? = null,
  public var unit: KotlinString? = null,
  public var _unit: Element? = null,
  public var system: KotlinString? = null,
  public var _system: Element? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
) {
  public fun toModel(): Distance =
    Distance().apply {
      id = this@DistanceSurrogate.id
      extension = this@DistanceSurrogate.extension
      `value` = Decimal.of(this@DistanceSurrogate.`value`, this@DistanceSurrogate._value)
      comparator =
        Enumeration.of(
          this@DistanceSurrogate.comparator?.let {
            com.google.fhir.model.r4.Quantity.QuantityComparator.fromCode(it)
          },
          this@DistanceSurrogate._comparator,
        )
      unit = R4String.of(this@DistanceSurrogate.unit, this@DistanceSurrogate._unit)
      system = Uri.of(this@DistanceSurrogate.system, this@DistanceSurrogate._system)
      code = Code.of(this@DistanceSurrogate.code, this@DistanceSurrogate._code)
    }

  public companion object {
    public fun fromModel(model: Distance): DistanceSurrogate =
      with(model) {
        DistanceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          `value` = this@with.`value`?.value
          _value = this@with.`value`?.toElement()
          comparator = this@with.comparator?.value?.getCode()
          _comparator = this@with.comparator?.toElement()
          unit = this@with.unit?.value
          _unit = this@with.unit?.toElement()
          system = this@with.system?.value
          _system = this@with.system?.toElement()
          code = this@with.code?.value
          _code = this@with.code?.toElement()
        }
      }
  }
}
