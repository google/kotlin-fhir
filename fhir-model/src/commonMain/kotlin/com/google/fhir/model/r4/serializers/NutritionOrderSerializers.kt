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

package com.google.fhir.model.r4.serializers

import com.google.fhir.model.r4.NutritionOrder
import com.google.fhir.model.r4.surrogates.NutritionOrderEnteralFormulaAdministrationSurrogate
import com.google.fhir.model.r4.surrogates.NutritionOrderEnteralFormulaSurrogate
import com.google.fhir.model.r4.surrogates.NutritionOrderOralDietNutrientSurrogate
import com.google.fhir.model.r4.surrogates.NutritionOrderOralDietSurrogate
import com.google.fhir.model.r4.surrogates.NutritionOrderOralDietTextureSurrogate
import com.google.fhir.model.r4.surrogates.NutritionOrderSupplementSurrogate
import com.google.fhir.model.r4.surrogates.NutritionOrderSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object NutritionOrderOralDietNutrientSerializer :
  KSerializer<NutritionOrder.OralDiet.Nutrient> {
  internal val surrogateSerializer: KSerializer<NutritionOrderOralDietNutrientSurrogate> by lazy {
    NutritionOrderOralDietNutrientSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Nutrient", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionOrder.OralDiet.Nutrient =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionOrder.OralDiet.Nutrient) {
    surrogateSerializer.serialize(encoder, NutritionOrderOralDietNutrientSurrogate.fromModel(value))
  }
}

public object NutritionOrderOralDietTextureSerializer :
  KSerializer<NutritionOrder.OralDiet.Texture> {
  internal val surrogateSerializer: KSerializer<NutritionOrderOralDietTextureSurrogate> by lazy {
    NutritionOrderOralDietTextureSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Texture", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionOrder.OralDiet.Texture =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionOrder.OralDiet.Texture) {
    surrogateSerializer.serialize(encoder, NutritionOrderOralDietTextureSurrogate.fromModel(value))
  }
}

public object NutritionOrderOralDietSerializer : KSerializer<NutritionOrder.OralDiet> {
  internal val surrogateSerializer: KSerializer<NutritionOrderOralDietSurrogate> by lazy {
    NutritionOrderOralDietSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("OralDiet", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionOrder.OralDiet =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionOrder.OralDiet) {
    surrogateSerializer.serialize(encoder, NutritionOrderOralDietSurrogate.fromModel(value))
  }
}

public object NutritionOrderSupplementSerializer : KSerializer<NutritionOrder.Supplement> {
  internal val surrogateSerializer: KSerializer<NutritionOrderSupplementSurrogate> by lazy {
    NutritionOrderSupplementSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Supplement", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionOrder.Supplement =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionOrder.Supplement) {
    surrogateSerializer.serialize(encoder, NutritionOrderSupplementSurrogate.fromModel(value))
  }
}

public object NutritionOrderEnteralFormulaAdministrationSerializer :
  KSerializer<NutritionOrder.EnteralFormula.Administration> {
  internal val surrogateSerializer:
    KSerializer<NutritionOrderEnteralFormulaAdministrationSurrogate> by lazy {
    NutritionOrderEnteralFormulaAdministrationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Administration", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionOrder.EnteralFormula.Administration =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionOrder.EnteralFormula.Administration) {
    surrogateSerializer.serialize(
      encoder,
      NutritionOrderEnteralFormulaAdministrationSurrogate.fromModel(value),
    )
  }
}

public object NutritionOrderEnteralFormulaSerializer : KSerializer<NutritionOrder.EnteralFormula> {
  internal val surrogateSerializer: KSerializer<NutritionOrderEnteralFormulaSurrogate> by lazy {
    NutritionOrderEnteralFormulaSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("EnteralFormula", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionOrder.EnteralFormula =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionOrder.EnteralFormula) {
    surrogateSerializer.serialize(encoder, NutritionOrderEnteralFormulaSurrogate.fromModel(value))
  }
}

public object NutritionOrderSerializer : KSerializer<NutritionOrder> {
  internal val surrogateSerializer: KSerializer<NutritionOrderSurrogate> by lazy {
    NutritionOrderSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("NutritionOrder", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionOrder =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionOrder) {
    surrogateSerializer.serialize(encoder, NutritionOrderSurrogate.fromModel(value))
  }
}
