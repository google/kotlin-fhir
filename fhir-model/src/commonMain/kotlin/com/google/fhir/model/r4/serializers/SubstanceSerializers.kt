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

import com.google.fhir.model.r4.Substance
import com.google.fhir.model.r4.surrogates.SubstanceIngredientSurrogate
import com.google.fhir.model.r4.surrogates.SubstanceInstanceSurrogate
import com.google.fhir.model.r4.surrogates.SubstanceSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object SubstanceInstanceSerializer : KSerializer<Substance.Instance> {
  internal val surrogateSerializer: KSerializer<SubstanceInstanceSurrogate> by lazy {
    SubstanceInstanceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Instance", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Substance.Instance =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Substance.Instance) {
    surrogateSerializer.serialize(encoder, SubstanceInstanceSurrogate.fromModel(value))
  }
}

public object SubstanceIngredientSerializer : KSerializer<Substance.Ingredient> {
  internal val surrogateSerializer: KSerializer<SubstanceIngredientSurrogate> by lazy {
    SubstanceIngredientSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Ingredient", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Substance.Ingredient =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Substance.Ingredient) {
    surrogateSerializer.serialize(encoder, SubstanceIngredientSurrogate.fromModel(value))
  }
}

public object SubstanceSerializer : KSerializer<Substance> {
  internal val surrogateSerializer: KSerializer<SubstanceSurrogate> by lazy {
    SubstanceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Substance", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Substance =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Substance) {
    surrogateSerializer.serialize(encoder, SubstanceSurrogate.fromModel(value))
  }
}
