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

import com.google.fhir.model.r4b.SupplyDelivery
import com.google.fhir.model.r4b.surrogates.SupplyDeliverySuppliedItemSurrogate
import com.google.fhir.model.r4b.surrogates.SupplyDeliverySurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object SupplyDeliverySuppliedItemSerializer : KSerializer<SupplyDelivery.SuppliedItem> {
  internal val surrogateSerializer: KSerializer<SupplyDeliverySuppliedItemSurrogate> by lazy {
    SupplyDeliverySuppliedItemSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SuppliedItem", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SupplyDelivery.SuppliedItem =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SupplyDelivery.SuppliedItem) {
    surrogateSerializer.serialize(encoder, SupplyDeliverySuppliedItemSurrogate.fromModel(value))
  }
}

public object SupplyDeliverySerializer : KSerializer<SupplyDelivery> {
  internal val surrogateSerializer: KSerializer<SupplyDeliverySurrogate> by lazy {
    SupplyDeliverySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SupplyDelivery", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SupplyDelivery =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SupplyDelivery) {
    surrogateSerializer.serialize(encoder, SupplyDeliverySurrogate.fromModel(value))
  }
}
