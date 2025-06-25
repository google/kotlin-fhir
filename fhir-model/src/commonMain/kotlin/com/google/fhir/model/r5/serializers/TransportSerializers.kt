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

import com.google.fhir.model.r5.Transport
import com.google.fhir.model.r5.surrogates.TransportInputSurrogate
import com.google.fhir.model.r5.surrogates.TransportOutputSurrogate
import com.google.fhir.model.r5.surrogates.TransportRestrictionSurrogate
import com.google.fhir.model.r5.surrogates.TransportSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object TransportRestrictionSerializer : KSerializer<Transport.Restriction> {
  internal val surrogateSerializer: KSerializer<TransportRestrictionSurrogate> by lazy {
    TransportRestrictionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Restriction", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Transport.Restriction =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Transport.Restriction) {
    surrogateSerializer.serialize(encoder, TransportRestrictionSurrogate.fromModel(value))
  }
}

public object TransportInputSerializer : KSerializer<Transport.Input> {
  internal val surrogateSerializer: KSerializer<TransportInputSurrogate> by lazy {
    TransportInputSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Input", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Transport.Input =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Transport.Input) {
    surrogateSerializer.serialize(encoder, TransportInputSurrogate.fromModel(value))
  }
}

public object TransportOutputSerializer : KSerializer<Transport.Output> {
  internal val surrogateSerializer: KSerializer<TransportOutputSurrogate> by lazy {
    TransportOutputSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Output", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Transport.Output =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Transport.Output) {
    surrogateSerializer.serialize(encoder, TransportOutputSurrogate.fromModel(value))
  }
}

public object TransportSerializer : KSerializer<Transport> {
  internal val surrogateSerializer: KSerializer<TransportSurrogate> by lazy {
    TransportSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Transport", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Transport =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Transport) {
    surrogateSerializer.serialize(encoder, TransportSurrogate.fromModel(value))
  }
}
