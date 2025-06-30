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

import com.google.fhir.model.r5.DeviceUsage
import com.google.fhir.model.r5.surrogates.DeviceUsageAdherenceSurrogate
import com.google.fhir.model.r5.surrogates.DeviceUsageSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object DeviceUsageAdherenceSerializer : KSerializer<DeviceUsage.Adherence> {
  internal val surrogateSerializer: KSerializer<DeviceUsageAdherenceSurrogate> by lazy {
    DeviceUsageAdherenceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Adherence", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DeviceUsage.Adherence =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DeviceUsage.Adherence) {
    surrogateSerializer.serialize(encoder, DeviceUsageAdherenceSurrogate.fromModel(value))
  }
}

public object DeviceUsageSerializer : KSerializer<DeviceUsage> {
  internal val surrogateSerializer: KSerializer<DeviceUsageSurrogate> by lazy {
    DeviceUsageSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DeviceUsage", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DeviceUsage =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DeviceUsage) {
    surrogateSerializer.serialize(encoder, DeviceUsageSurrogate.fromModel(value))
  }
}
