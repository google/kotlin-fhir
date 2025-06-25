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

import com.google.fhir.model.r4.Attachment
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.ProdCharacteristic
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ProdCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var height: Quantity? = null,
  public var width: Quantity? = null,
  public var depth: Quantity? = null,
  public var weight: Quantity? = null,
  public var nominalVolume: Quantity? = null,
  public var externalDiameter: Quantity? = null,
  public var shape: KotlinString? = null,
  public var _shape: Element? = null,
  public var color: List<KotlinString?>? = null,
  public var _color: List<Element?>? = null,
  public var imprint: List<KotlinString?>? = null,
  public var _imprint: List<Element?>? = null,
  public var image: List<Attachment?>? = null,
  public var scoring: CodeableConcept? = null,
) {
  public fun toModel(): ProdCharacteristic =
    ProdCharacteristic().apply {
      id = this@ProdCharacteristicSurrogate.id
      extension = this@ProdCharacteristicSurrogate.extension
      modifierExtension = this@ProdCharacteristicSurrogate.modifierExtension
      height = this@ProdCharacteristicSurrogate.height
      width = this@ProdCharacteristicSurrogate.width
      depth = this@ProdCharacteristicSurrogate.depth
      weight = this@ProdCharacteristicSurrogate.weight
      nominalVolume = this@ProdCharacteristicSurrogate.nominalVolume
      externalDiameter = this@ProdCharacteristicSurrogate.externalDiameter
      shape =
        R4String.of(this@ProdCharacteristicSurrogate.shape, this@ProdCharacteristicSurrogate._shape)
      color =
        if (
          this@ProdCharacteristicSurrogate.color == null &&
            this@ProdCharacteristicSurrogate._color == null
        ) {
          null
        } else {
          (this@ProdCharacteristicSurrogate.color
              ?: List(this@ProdCharacteristicSurrogate._color!!.size) { null })
            .zip(
              this@ProdCharacteristicSurrogate._color
                ?: List(this@ProdCharacteristicSurrogate.color!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4String.of(value, element) }
        }
      imprint =
        if (
          this@ProdCharacteristicSurrogate.imprint == null &&
            this@ProdCharacteristicSurrogate._imprint == null
        ) {
          null
        } else {
          (this@ProdCharacteristicSurrogate.imprint
              ?: List(this@ProdCharacteristicSurrogate._imprint!!.size) { null })
            .zip(
              this@ProdCharacteristicSurrogate._imprint
                ?: List(this@ProdCharacteristicSurrogate.imprint!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4String.of(value, element) }
        }
      image = this@ProdCharacteristicSurrogate.image
      scoring = this@ProdCharacteristicSurrogate.scoring
    }

  public companion object {
    public fun fromModel(model: ProdCharacteristic): ProdCharacteristicSurrogate =
      with(model) {
        ProdCharacteristicSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          height = this@with.height
          width = this@with.width
          depth = this@with.depth
          weight = this@with.weight
          nominalVolume = this@with.nominalVolume
          externalDiameter = this@with.externalDiameter
          shape = this@with.shape?.value
          _shape = this@with.shape?.toElement()
          color = this@with.color?.map { it?.value }?.takeUnless { it.all { it == null } }
          _color = this@with.color?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          imprint = this@with.imprint?.map { it?.value }?.takeUnless { it.all { it == null } }
          _imprint =
            this@with.imprint?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          image = this@with.image
          scoring = this@with.scoring
        }
      }
  }
}
