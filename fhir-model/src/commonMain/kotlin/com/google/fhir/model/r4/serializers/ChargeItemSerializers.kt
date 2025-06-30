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

import com.google.fhir.model.r4.ChargeItem
import com.google.fhir.model.r4.surrogates.ChargeItemPerformerSurrogate
import com.google.fhir.model.r4.surrogates.ChargeItemSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ChargeItemPerformerSerializer : KSerializer<ChargeItem.Performer> {
  internal val surrogateSerializer: KSerializer<ChargeItemPerformerSurrogate> by lazy {
    ChargeItemPerformerSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Performer", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ChargeItem.Performer =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ChargeItem.Performer) {
    surrogateSerializer.serialize(encoder, ChargeItemPerformerSurrogate.fromModel(value))
  }
}

public object ChargeItemSerializer : KSerializer<ChargeItem> {
  internal val surrogateSerializer: KSerializer<ChargeItemSurrogate> by lazy {
    ChargeItemSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ChargeItem", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ChargeItem =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ChargeItem) {
    surrogateSerializer.serialize(encoder, ChargeItemSurrogate.fromModel(value))
  }
}
