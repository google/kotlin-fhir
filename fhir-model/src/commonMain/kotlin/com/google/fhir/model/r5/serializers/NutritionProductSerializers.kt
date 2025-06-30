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

package com.google.fhir.model.r5.serializers

import com.google.fhir.model.r5.NutritionProduct
import com.google.fhir.model.r5.surrogates.NutritionProductCharacteristicSurrogate
import com.google.fhir.model.r5.surrogates.NutritionProductIngredientSurrogate
import com.google.fhir.model.r5.surrogates.NutritionProductInstanceSurrogate
import com.google.fhir.model.r5.surrogates.NutritionProductNutrientSurrogate
import com.google.fhir.model.r5.surrogates.NutritionProductSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object NutritionProductNutrientSerializer : KSerializer<NutritionProduct.Nutrient> {
  internal val surrogateSerializer: KSerializer<NutritionProductNutrientSurrogate> by lazy {
    NutritionProductNutrientSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Nutrient", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionProduct.Nutrient =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionProduct.Nutrient) {
    surrogateSerializer.serialize(encoder, NutritionProductNutrientSurrogate.fromModel(value))
  }
}

public object NutritionProductIngredientSerializer : KSerializer<NutritionProduct.Ingredient> {
  internal val surrogateSerializer: KSerializer<NutritionProductIngredientSurrogate> by lazy {
    NutritionProductIngredientSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Ingredient", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionProduct.Ingredient =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionProduct.Ingredient) {
    surrogateSerializer.serialize(encoder, NutritionProductIngredientSurrogate.fromModel(value))
  }
}

public object NutritionProductCharacteristicSerializer :
  KSerializer<NutritionProduct.Characteristic> {
  internal val surrogateSerializer: KSerializer<NutritionProductCharacteristicSurrogate> by lazy {
    NutritionProductCharacteristicSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Characteristic", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionProduct.Characteristic =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionProduct.Characteristic) {
    surrogateSerializer.serialize(encoder, NutritionProductCharacteristicSurrogate.fromModel(value))
  }
}

public object NutritionProductInstanceSerializer : KSerializer<NutritionProduct.Instance> {
  internal val surrogateSerializer: KSerializer<NutritionProductInstanceSurrogate> by lazy {
    NutritionProductInstanceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Instance", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionProduct.Instance =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionProduct.Instance) {
    surrogateSerializer.serialize(encoder, NutritionProductInstanceSurrogate.fromModel(value))
  }
}

public object NutritionProductSerializer : KSerializer<NutritionProduct> {
  internal val surrogateSerializer: KSerializer<NutritionProductSurrogate> by lazy {
    NutritionProductSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("NutritionProduct", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionProduct =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionProduct) {
    surrogateSerializer.serialize(encoder, NutritionProductSurrogate.fromModel(value))
  }
}
