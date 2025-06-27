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

import com.google.fhir.model.r4b.ManufacturedItemDefinition
import com.google.fhir.model.r4b.surrogates.ManufacturedItemDefinitionPropertySurrogate
import com.google.fhir.model.r4b.surrogates.ManufacturedItemDefinitionSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ManufacturedItemDefinitionPropertySerializer :
  KSerializer<ManufacturedItemDefinition.Property> {
  internal val surrogateSerializer:
    KSerializer<ManufacturedItemDefinitionPropertySurrogate> by lazy {
    ManufacturedItemDefinitionPropertySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Property", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ManufacturedItemDefinition.Property =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ManufacturedItemDefinition.Property) {
    surrogateSerializer.serialize(
      encoder,
      ManufacturedItemDefinitionPropertySurrogate.fromModel(value),
    )
  }
}

public object ManufacturedItemDefinitionSerializer : KSerializer<ManufacturedItemDefinition> {
  internal val surrogateSerializer: KSerializer<ManufacturedItemDefinitionSurrogate> by lazy {
    ManufacturedItemDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ManufacturedItemDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ManufacturedItemDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ManufacturedItemDefinition) {
    surrogateSerializer.serialize(encoder, ManufacturedItemDefinitionSurrogate.fromModel(value))
  }
}
