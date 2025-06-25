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

import com.google.fhir.model.r4.MessageDefinition
import com.google.fhir.model.r4.surrogates.MessageDefinitionAllowedResponseSurrogate
import com.google.fhir.model.r4.surrogates.MessageDefinitionFocusSurrogate
import com.google.fhir.model.r4.surrogates.MessageDefinitionSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object MessageDefinitionFocusSerializer : KSerializer<MessageDefinition.Focus> {
  internal val surrogateSerializer: KSerializer<MessageDefinitionFocusSurrogate> by lazy {
    MessageDefinitionFocusSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Focus", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MessageDefinition.Focus =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MessageDefinition.Focus) {
    surrogateSerializer.serialize(encoder, MessageDefinitionFocusSurrogate.fromModel(value))
  }
}

public object MessageDefinitionAllowedResponseSerializer :
  KSerializer<MessageDefinition.AllowedResponse> {
  internal val surrogateSerializer: KSerializer<MessageDefinitionAllowedResponseSurrogate> by lazy {
    MessageDefinitionAllowedResponseSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("AllowedResponse", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MessageDefinition.AllowedResponse =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MessageDefinition.AllowedResponse) {
    surrogateSerializer.serialize(
      encoder,
      MessageDefinitionAllowedResponseSurrogate.fromModel(value),
    )
  }
}

public object MessageDefinitionSerializer : KSerializer<MessageDefinition> {
  internal val surrogateSerializer: KSerializer<MessageDefinitionSurrogate> by lazy {
    MessageDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("MessageDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MessageDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MessageDefinition) {
    surrogateSerializer.serialize(encoder, MessageDefinitionSurrogate.fromModel(value))
  }
}
