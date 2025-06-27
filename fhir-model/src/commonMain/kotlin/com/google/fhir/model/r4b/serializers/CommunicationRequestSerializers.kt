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

import com.google.fhir.model.r4b.CommunicationRequest
import com.google.fhir.model.r4b.surrogates.CommunicationRequestPayloadSurrogate
import com.google.fhir.model.r4b.surrogates.CommunicationRequestSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object CommunicationRequestPayloadSerializer : KSerializer<CommunicationRequest.Payload> {
  internal val surrogateSerializer: KSerializer<CommunicationRequestPayloadSurrogate> by lazy {
    CommunicationRequestPayloadSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Payload", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CommunicationRequest.Payload =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CommunicationRequest.Payload) {
    surrogateSerializer.serialize(encoder, CommunicationRequestPayloadSurrogate.fromModel(value))
  }
}

public object CommunicationRequestSerializer : KSerializer<CommunicationRequest> {
  internal val surrogateSerializer: KSerializer<CommunicationRequestSurrogate> by lazy {
    CommunicationRequestSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("CommunicationRequest", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CommunicationRequest =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CommunicationRequest) {
    surrogateSerializer.serialize(encoder, CommunicationRequestSurrogate.fromModel(value))
  }
}
