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

import com.google.fhir.model.r4b.Age
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.Decimal
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class AgeSurrogate(
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
  public fun toModel(): Age =
    Age().apply {
      id = this@AgeSurrogate.id
      extension = this@AgeSurrogate.extension
      `value` = Decimal.of(this@AgeSurrogate.`value`, this@AgeSurrogate._value)
      comparator =
        Enumeration.of(
          this@AgeSurrogate.comparator?.let {
            com.google.fhir.model.r4b.Quantity.QuantityComparator.fromCode(it)
          },
          this@AgeSurrogate._comparator,
        )
      unit = R4bString.of(this@AgeSurrogate.unit, this@AgeSurrogate._unit)
      system = Uri.of(this@AgeSurrogate.system, this@AgeSurrogate._system)
      code = Code.of(this@AgeSurrogate.code, this@AgeSurrogate._code)
    }

  public companion object {
    public fun fromModel(model: Age): AgeSurrogate =
      with(model) {
        AgeSurrogate().apply {
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
