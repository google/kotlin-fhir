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

import com.google.fhir.model.r4b.Decimal
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Money
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MoneySurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var `value`: Double? = null,
  public var _value: Element? = null,
  public var currency: String? = null,
  public var _currency: Element? = null,
) {
  public fun toModel(): Money =
    Money(
      id = this@MoneySurrogate.id,
      extension = this@MoneySurrogate.extension ?: mutableListOf(),
      `value` = Decimal.of(this@MoneySurrogate.`value`, this@MoneySurrogate._value),
      currency =
        this@MoneySurrogate.currency?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.CurrencyCode.fromCode(it!!),
            this@MoneySurrogate._currency,
          )
        },
    )

  public companion object {
    public fun fromModel(model: Money): MoneySurrogate =
      with(model) {
        MoneySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          `value` = this@with.`value`?.value,
          _value = this@with.`value`?.toElement(),
          currency = this@with.currency?.value?.getCode(),
          _currency = this@with.currency?.toElement(),
        )
      }
  }
}
