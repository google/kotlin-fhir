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

import com.google.fhir.model.r4b.DeviceRequest
import com.google.fhir.model.r4b.surrogates.DeviceRequestParameterSurrogate
import com.google.fhir.model.r4b.surrogates.DeviceRequestSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object DeviceRequestParameterSerializer : KSerializer<DeviceRequest.Parameter> {
  internal val surrogateSerializer: KSerializer<DeviceRequestParameterSurrogate> by lazy {
    DeviceRequestParameterSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Parameter", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DeviceRequest.Parameter =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DeviceRequest.Parameter) {
    surrogateSerializer.serialize(encoder, DeviceRequestParameterSurrogate.fromModel(value))
  }
}

public object DeviceRequestSerializer : KSerializer<DeviceRequest> {
  internal val surrogateSerializer: KSerializer<DeviceRequestSurrogate> by lazy {
    DeviceRequestSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DeviceRequest", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DeviceRequest =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DeviceRequest) {
    surrogateSerializer.serialize(encoder, DeviceRequestSurrogate.fromModel(value))
  }
}
