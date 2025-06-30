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

@file:Suppress("RedundantVisibilityModifier", "PropertyName")

package com.google.fhir.model.r4b.serializers

import com.google.fhir.model.r4b.Ingredient
import com.google.fhir.model.r4b.surrogates.IngredientManufacturerSurrogate
import com.google.fhir.model.r4b.surrogates.IngredientSubstanceStrengthReferenceStrengthSurrogate
import com.google.fhir.model.r4b.surrogates.IngredientSubstanceStrengthSurrogate
import com.google.fhir.model.r4b.surrogates.IngredientSubstanceSurrogate
import com.google.fhir.model.r4b.surrogates.IngredientSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object IngredientManufacturerSerializer : KSerializer<Ingredient.Manufacturer> {
  internal val surrogateSerializer: KSerializer<IngredientManufacturerSurrogate> by lazy {
    IngredientManufacturerSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Manufacturer", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Ingredient.Manufacturer =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Ingredient.Manufacturer) {
    surrogateSerializer.serialize(encoder, IngredientManufacturerSurrogate.fromModel(value))
  }
}

public object IngredientSubstanceStrengthReferenceStrengthSerializer :
  KSerializer<Ingredient.Substance.Strength.ReferenceStrength> {
  internal val surrogateSerializer:
    KSerializer<IngredientSubstanceStrengthReferenceStrengthSurrogate> by lazy {
    IngredientSubstanceStrengthReferenceStrengthSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ReferenceStrength", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Ingredient.Substance.Strength.ReferenceStrength =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: Ingredient.Substance.Strength.ReferenceStrength,
  ) {
    surrogateSerializer.serialize(
      encoder,
      IngredientSubstanceStrengthReferenceStrengthSurrogate.fromModel(value),
    )
  }
}

public object IngredientSubstanceStrengthSerializer : KSerializer<Ingredient.Substance.Strength> {
  internal val surrogateSerializer: KSerializer<IngredientSubstanceStrengthSurrogate> by lazy {
    IngredientSubstanceStrengthSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Strength", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Ingredient.Substance.Strength =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Ingredient.Substance.Strength) {
    surrogateSerializer.serialize(encoder, IngredientSubstanceStrengthSurrogate.fromModel(value))
  }
}

public object IngredientSubstanceSerializer : KSerializer<Ingredient.Substance> {
  internal val surrogateSerializer: KSerializer<IngredientSubstanceSurrogate> by lazy {
    IngredientSubstanceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Substance", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Ingredient.Substance =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Ingredient.Substance) {
    surrogateSerializer.serialize(encoder, IngredientSubstanceSurrogate.fromModel(value))
  }
}

public object IngredientSerializer : KSerializer<Ingredient> {
  internal val surrogateSerializer: KSerializer<IngredientSurrogate> by lazy {
    IngredientSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Ingredient", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Ingredient =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Ingredient) {
    surrogateSerializer.serialize(encoder, IngredientSurrogate.fromModel(value))
  }
}
