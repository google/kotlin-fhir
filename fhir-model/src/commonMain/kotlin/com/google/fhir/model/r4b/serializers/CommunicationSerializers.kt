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

import com.google.fhir.model.r4b.Communication
import com.google.fhir.model.r4b.surrogates.CommunicationPayloadSurrogate
import com.google.fhir.model.r4b.surrogates.CommunicationSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object CommunicationPayloadSerializer : KSerializer<Communication.Payload> {
  internal val surrogateSerializer: KSerializer<CommunicationPayloadSurrogate> by lazy {
    CommunicationPayloadSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Payload", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Communication.Payload =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Communication.Payload) {
    surrogateSerializer.serialize(encoder, CommunicationPayloadSurrogate.fromModel(value))
  }
}

public object CommunicationSerializer : KSerializer<Communication> {
  internal val surrogateSerializer: KSerializer<CommunicationSurrogate> by lazy {
    CommunicationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Communication", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Communication =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Communication) {
    surrogateSerializer.serialize(encoder, CommunicationSurrogate.fromModel(value))
  }
}
