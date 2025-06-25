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

import com.google.fhir.model.r4b.Address
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class AddressSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var use: KotlinString? = null,
  public var _use: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var line: List<KotlinString?>? = null,
  public var _line: List<Element?>? = null,
  public var city: KotlinString? = null,
  public var _city: Element? = null,
  public var district: KotlinString? = null,
  public var _district: Element? = null,
  public var state: KotlinString? = null,
  public var _state: Element? = null,
  public var postalCode: KotlinString? = null,
  public var _postalCode: Element? = null,
  public var country: KotlinString? = null,
  public var _country: Element? = null,
  public var period: Period? = null,
) {
  public fun toModel(): Address =
    Address().apply {
      id = this@AddressSurrogate.id
      extension = this@AddressSurrogate.extension
      use =
        Enumeration.of(
          this@AddressSurrogate.use?.let {
            com.google.fhir.model.r4b.Address.AddressUse.fromCode(it)
          },
          this@AddressSurrogate._use,
        )
      type =
        Enumeration.of(
          this@AddressSurrogate.type?.let {
            com.google.fhir.model.r4b.Address.AddressType.fromCode(it)
          },
          this@AddressSurrogate._type,
        )
      text = R4bString.of(this@AddressSurrogate.text, this@AddressSurrogate._text)
      line =
        if (this@AddressSurrogate.line == null && this@AddressSurrogate._line == null) {
          null
        } else {
          (this@AddressSurrogate.line ?: List(this@AddressSurrogate._line!!.size) { null })
            .zip(this@AddressSurrogate._line ?: List(this@AddressSurrogate.line!!.size) { null })
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      city = R4bString.of(this@AddressSurrogate.city, this@AddressSurrogate._city)
      district = R4bString.of(this@AddressSurrogate.district, this@AddressSurrogate._district)
      state = R4bString.of(this@AddressSurrogate.state, this@AddressSurrogate._state)
      postalCode = R4bString.of(this@AddressSurrogate.postalCode, this@AddressSurrogate._postalCode)
      country = R4bString.of(this@AddressSurrogate.country, this@AddressSurrogate._country)
      period = this@AddressSurrogate.period
    }

  public companion object {
    public fun fromModel(model: Address): AddressSurrogate =
      with(model) {
        AddressSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          use = this@with.use?.value?.getCode()
          _use = this@with.use?.toElement()
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          text = this@with.text?.value
          _text = this@with.text?.toElement()
          line = this@with.line?.map { it?.value }?.takeUnless { it.all { it == null } }
          _line = this@with.line?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          city = this@with.city?.value
          _city = this@with.city?.toElement()
          district = this@with.district?.value
          _district = this@with.district?.toElement()
          state = this@with.state?.value
          _state = this@with.state?.toElement()
          postalCode = this@with.postalCode?.value
          _postalCode = this@with.postalCode?.toElement()
          country = this@with.country?.value
          _country = this@with.country?.toElement()
          period = this@with.period
        }
      }
  }
}
