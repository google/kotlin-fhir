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
import com.google.fhir.model.r4.FhirJsonTransformer
import com.google.fhir.model.r4.surrogates.ChargeItemOccurrenceSurrogate
import com.google.fhir.model.r4.surrogates.ChargeItemPerformerSurrogate
import com.google.fhir.model.r4.surrogates.ChargeItemProductSurrogate
import com.google.fhir.model.r4.surrogates.ChargeItemSurrogate
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonEncoder
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonObject

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

public object ChargeItemOccurrenceSerializer : KSerializer<ChargeItem.Occurrence> {
  internal val surrogateSerializer: KSerializer<ChargeItemOccurrenceSurrogate> by lazy {
    ChargeItemOccurrenceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Occurrence", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ChargeItem.Occurrence =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ChargeItem.Occurrence) {
    surrogateSerializer.serialize(encoder, ChargeItemOccurrenceSurrogate.fromModel(value))
  }
}

public object ChargeItemProductSerializer : KSerializer<ChargeItem.Product> {
  internal val surrogateSerializer: KSerializer<ChargeItemProductSurrogate> by lazy {
    ChargeItemProductSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Product", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ChargeItem.Product =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ChargeItem.Product) {
    surrogateSerializer.serialize(encoder, ChargeItemProductSurrogate.fromModel(value))
  }
}

public object ChargeItemSerializer : KSerializer<ChargeItem> {
  internal val surrogateSerializer: KSerializer<ChargeItemSurrogate> by lazy {
    ChargeItemSurrogate.serializer()
  }

  private val resourceType: String? = "ChargeItem"

  private val multiChoiceProperties: List<String> = listOf("occurrence", "product")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ChargeItem", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ChargeItem {
    val jsonDecoder =
      decoder as? JsonDecoder ?: error("This serializer only supports JSON decoding")
    val oldJsonObject =
      if (resourceType.isNullOrBlank()) {
        jsonDecoder.decodeJsonElement().jsonObject
      } else
        JsonObject(
          jsonDecoder.decodeJsonElement().jsonObject.toMutableMap().apply { remove("resourceType") }
        )
    val unflattenedJsonObject = FhirJsonTransformer.unflatten(oldJsonObject, multiChoiceProperties)
    val surrogate =
      jsonDecoder.json.decodeFromJsonElement(surrogateSerializer, unflattenedJsonObject)
    return surrogate.toModel()
  }

  override fun serialize(encoder: Encoder, `value`: ChargeItem) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = ChargeItemSurrogate.fromModel(value)
    val oldJsonObject =
      if (resourceType.isNullOrBlank()) {
        jsonEncoder.json.encodeToJsonElement(surrogateSerializer, surrogate).jsonObject
      } else {
        JsonObject(
          mutableMapOf("resourceType" to JsonPrimitive(resourceType))
            .plus(jsonEncoder.json.encodeToJsonElement(surrogateSerializer, surrogate).jsonObject)
        )
      }
    val flattenedJsonObject = FhirJsonTransformer.flatten(oldJsonObject, multiChoiceProperties)
    jsonEncoder.encodeJsonElement(flattenedJsonObject)
  }
}
