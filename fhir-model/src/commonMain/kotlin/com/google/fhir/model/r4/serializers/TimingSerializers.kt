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

import com.google.fhir.model.r4.Timing
import com.google.fhir.model.r4.surrogates.TimingRepeatSurrogate
import com.google.fhir.model.r4.surrogates.TimingSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object TimingRepeatSerializer : KSerializer<Timing.Repeat> {
  internal val surrogateSerializer: KSerializer<TimingRepeatSurrogate> by lazy {
    TimingRepeatSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Repeat", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Timing.Repeat =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Timing.Repeat) {
    surrogateSerializer.serialize(encoder, TimingRepeatSurrogate.fromModel(value))
  }
}

public object TimingSerializer : KSerializer<Timing> {
  internal val surrogateSerializer: KSerializer<TimingSurrogate> by lazy {
    TimingSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Timing", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Timing =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Timing) {
    surrogateSerializer.serialize(encoder, TimingSurrogate.fromModel(value))
  }
}
