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

import com.google.fhir.model.r5.ObservationDefinition
import com.google.fhir.model.r5.surrogates.ObservationDefinitionComponentSurrogate
import com.google.fhir.model.r5.surrogates.ObservationDefinitionQualifiedValueSurrogate
import com.google.fhir.model.r5.surrogates.ObservationDefinitionSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ObservationDefinitionQualifiedValueSerializer :
  KSerializer<ObservationDefinition.QualifiedValue> {
  internal val surrogateSerializer:
    KSerializer<ObservationDefinitionQualifiedValueSurrogate> by lazy {
    ObservationDefinitionQualifiedValueSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("QualifiedValue", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ObservationDefinition.QualifiedValue =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ObservationDefinition.QualifiedValue) {
    surrogateSerializer.serialize(
      encoder,
      ObservationDefinitionQualifiedValueSurrogate.fromModel(value),
    )
  }
}

public object ObservationDefinitionComponentSerializer :
  KSerializer<ObservationDefinition.Component> {
  internal val surrogateSerializer: KSerializer<ObservationDefinitionComponentSurrogate> by lazy {
    ObservationDefinitionComponentSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Component", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ObservationDefinition.Component =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ObservationDefinition.Component) {
    surrogateSerializer.serialize(encoder, ObservationDefinitionComponentSurrogate.fromModel(value))
  }
}

public object ObservationDefinitionSerializer : KSerializer<ObservationDefinition> {
  internal val surrogateSerializer: KSerializer<ObservationDefinitionSurrogate> by lazy {
    ObservationDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ObservationDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ObservationDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ObservationDefinition) {
    surrogateSerializer.serialize(encoder, ObservationDefinitionSurrogate.fromModel(value))
  }
}
