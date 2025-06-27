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

import com.google.fhir.model.r4b.ActivityDefinition
import com.google.fhir.model.r4b.surrogates.ActivityDefinitionDynamicValueSurrogate
import com.google.fhir.model.r4b.surrogates.ActivityDefinitionParticipantSurrogate
import com.google.fhir.model.r4b.surrogates.ActivityDefinitionSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ActivityDefinitionParticipantSerializer :
  KSerializer<ActivityDefinition.Participant> {
  internal val surrogateSerializer: KSerializer<ActivityDefinitionParticipantSurrogate> by lazy {
    ActivityDefinitionParticipantSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Participant", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ActivityDefinition.Participant =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ActivityDefinition.Participant) {
    surrogateSerializer.serialize(encoder, ActivityDefinitionParticipantSurrogate.fromModel(value))
  }
}

public object ActivityDefinitionDynamicValueSerializer :
  KSerializer<ActivityDefinition.DynamicValue> {
  internal val surrogateSerializer: KSerializer<ActivityDefinitionDynamicValueSurrogate> by lazy {
    ActivityDefinitionDynamicValueSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DynamicValue", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ActivityDefinition.DynamicValue =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ActivityDefinition.DynamicValue) {
    surrogateSerializer.serialize(encoder, ActivityDefinitionDynamicValueSurrogate.fromModel(value))
  }
}

public object ActivityDefinitionSerializer : KSerializer<ActivityDefinition> {
  internal val surrogateSerializer: KSerializer<ActivityDefinitionSurrogate> by lazy {
    ActivityDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ActivityDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ActivityDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ActivityDefinition) {
    surrogateSerializer.serialize(encoder, ActivityDefinitionSurrogate.fromModel(value))
  }
}
