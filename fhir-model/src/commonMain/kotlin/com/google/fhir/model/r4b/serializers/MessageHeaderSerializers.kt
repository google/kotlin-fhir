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

import com.google.fhir.model.r4b.MessageHeader
import com.google.fhir.model.r4b.surrogates.MessageHeaderDestinationSurrogate
import com.google.fhir.model.r4b.surrogates.MessageHeaderResponseSurrogate
import com.google.fhir.model.r4b.surrogates.MessageHeaderSourceSurrogate
import com.google.fhir.model.r4b.surrogates.MessageHeaderSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object MessageHeaderDestinationSerializer : KSerializer<MessageHeader.Destination> {
  internal val surrogateSerializer: KSerializer<MessageHeaderDestinationSurrogate> by lazy {
    MessageHeaderDestinationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Destination", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MessageHeader.Destination =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MessageHeader.Destination) {
    surrogateSerializer.serialize(encoder, MessageHeaderDestinationSurrogate.fromModel(value))
  }
}

public object MessageHeaderSourceSerializer : KSerializer<MessageHeader.Source> {
  internal val surrogateSerializer: KSerializer<MessageHeaderSourceSurrogate> by lazy {
    MessageHeaderSourceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Source", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MessageHeader.Source =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MessageHeader.Source) {
    surrogateSerializer.serialize(encoder, MessageHeaderSourceSurrogate.fromModel(value))
  }
}

public object MessageHeaderResponseSerializer : KSerializer<MessageHeader.Response> {
  internal val surrogateSerializer: KSerializer<MessageHeaderResponseSurrogate> by lazy {
    MessageHeaderResponseSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Response", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MessageHeader.Response =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MessageHeader.Response) {
    surrogateSerializer.serialize(encoder, MessageHeaderResponseSurrogate.fromModel(value))
  }
}

public object MessageHeaderSerializer : KSerializer<MessageHeader> {
  internal val surrogateSerializer: KSerializer<MessageHeaderSurrogate> by lazy {
    MessageHeaderSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("MessageHeader", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MessageHeader =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MessageHeader) {
    surrogateSerializer.serialize(encoder, MessageHeaderSurrogate.fromModel(value))
  }
}
