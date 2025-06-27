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

import com.google.fhir.model.r5.NutritionIntake
import com.google.fhir.model.r5.surrogates.NutritionIntakeConsumedItemSurrogate
import com.google.fhir.model.r5.surrogates.NutritionIntakeIngredientLabelSurrogate
import com.google.fhir.model.r5.surrogates.NutritionIntakePerformerSurrogate
import com.google.fhir.model.r5.surrogates.NutritionIntakeSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object NutritionIntakeConsumedItemSerializer : KSerializer<NutritionIntake.ConsumedItem> {
  internal val surrogateSerializer: KSerializer<NutritionIntakeConsumedItemSurrogate> by lazy {
    NutritionIntakeConsumedItemSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ConsumedItem", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionIntake.ConsumedItem =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionIntake.ConsumedItem) {
    surrogateSerializer.serialize(encoder, NutritionIntakeConsumedItemSurrogate.fromModel(value))
  }
}

public object NutritionIntakeIngredientLabelSerializer :
  KSerializer<NutritionIntake.IngredientLabel> {
  internal val surrogateSerializer: KSerializer<NutritionIntakeIngredientLabelSurrogate> by lazy {
    NutritionIntakeIngredientLabelSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("IngredientLabel", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionIntake.IngredientLabel =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionIntake.IngredientLabel) {
    surrogateSerializer.serialize(encoder, NutritionIntakeIngredientLabelSurrogate.fromModel(value))
  }
}

public object NutritionIntakePerformerSerializer : KSerializer<NutritionIntake.Performer> {
  internal val surrogateSerializer: KSerializer<NutritionIntakePerformerSurrogate> by lazy {
    NutritionIntakePerformerSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Performer", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionIntake.Performer =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionIntake.Performer) {
    surrogateSerializer.serialize(encoder, NutritionIntakePerformerSurrogate.fromModel(value))
  }
}

public object NutritionIntakeSerializer : KSerializer<NutritionIntake> {
  internal val surrogateSerializer: KSerializer<NutritionIntakeSurrogate> by lazy {
    NutritionIntakeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("NutritionIntake", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): NutritionIntake =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: NutritionIntake) {
    surrogateSerializer.serialize(encoder, NutritionIntakeSurrogate.fromModel(value))
  }
}
