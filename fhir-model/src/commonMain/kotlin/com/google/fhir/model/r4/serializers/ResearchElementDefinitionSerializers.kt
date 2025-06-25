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

import com.google.fhir.model.r4.ResearchElementDefinition
import com.google.fhir.model.r4.surrogates.ResearchElementDefinitionCharacteristicSurrogate
import com.google.fhir.model.r4.surrogates.ResearchElementDefinitionSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ResearchElementDefinitionCharacteristicSerializer :
  KSerializer<ResearchElementDefinition.Characteristic> {
  internal val surrogateSerializer:
    KSerializer<ResearchElementDefinitionCharacteristicSurrogate> by lazy {
    ResearchElementDefinitionCharacteristicSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Characteristic", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ResearchElementDefinition.Characteristic =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ResearchElementDefinition.Characteristic) {
    surrogateSerializer.serialize(
      encoder,
      ResearchElementDefinitionCharacteristicSurrogate.fromModel(value),
    )
  }
}

public object ResearchElementDefinitionSerializer : KSerializer<ResearchElementDefinition> {
  internal val surrogateSerializer: KSerializer<ResearchElementDefinitionSurrogate> by lazy {
    ResearchElementDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ResearchElementDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ResearchElementDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ResearchElementDefinition) {
    surrogateSerializer.serialize(encoder, ResearchElementDefinitionSurrogate.fromModel(value))
  }
}
