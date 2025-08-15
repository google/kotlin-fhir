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

import com.google.fhir.model.r4b.ClaimResponse
import com.google.fhir.model.r4b.FhirJsonTransformer
import com.google.fhir.model.r4b.surrogates.ClaimResponseAddItemDetailSubDetailSurrogate
import com.google.fhir.model.r4b.surrogates.ClaimResponseAddItemDetailSurrogate
import com.google.fhir.model.r4b.surrogates.ClaimResponseAddItemLocationSurrogate
import com.google.fhir.model.r4b.surrogates.ClaimResponseAddItemServicedSurrogate
import com.google.fhir.model.r4b.surrogates.ClaimResponseAddItemSurrogate
import com.google.fhir.model.r4b.surrogates.ClaimResponseErrorSurrogate
import com.google.fhir.model.r4b.surrogates.ClaimResponseInsuranceSurrogate
import com.google.fhir.model.r4b.surrogates.ClaimResponseItemAdjudicationSurrogate
import com.google.fhir.model.r4b.surrogates.ClaimResponseItemDetailSubDetailSurrogate
import com.google.fhir.model.r4b.surrogates.ClaimResponseItemDetailSurrogate
import com.google.fhir.model.r4b.surrogates.ClaimResponseItemSurrogate
import com.google.fhir.model.r4b.surrogates.ClaimResponsePaymentSurrogate
import com.google.fhir.model.r4b.surrogates.ClaimResponseProcessNoteSurrogate
import com.google.fhir.model.r4b.surrogates.ClaimResponseSurrogate
import com.google.fhir.model.r4b.surrogates.ClaimResponseTotalSurrogate
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

public object ClaimResponseItemAdjudicationSerializer :
  KSerializer<ClaimResponse.Item.Adjudication> {
  internal val surrogateSerializer: KSerializer<ClaimResponseItemAdjudicationSurrogate> by lazy {
    ClaimResponseItemAdjudicationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Adjudication", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClaimResponse.Item.Adjudication =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClaimResponse.Item.Adjudication) {
    surrogateSerializer.serialize(encoder, ClaimResponseItemAdjudicationSurrogate.fromModel(value))
  }
}

public object ClaimResponseItemDetailSubDetailSerializer :
  KSerializer<ClaimResponse.Item.Detail.SubDetail> {
  internal val surrogateSerializer: KSerializer<ClaimResponseItemDetailSubDetailSurrogate> by lazy {
    ClaimResponseItemDetailSubDetailSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SubDetail", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClaimResponse.Item.Detail.SubDetail =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClaimResponse.Item.Detail.SubDetail) {
    surrogateSerializer.serialize(
      encoder,
      ClaimResponseItemDetailSubDetailSurrogate.fromModel(value),
    )
  }
}

public object ClaimResponseItemDetailSerializer : KSerializer<ClaimResponse.Item.Detail> {
  internal val surrogateSerializer: KSerializer<ClaimResponseItemDetailSurrogate> by lazy {
    ClaimResponseItemDetailSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Detail", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClaimResponse.Item.Detail =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClaimResponse.Item.Detail) {
    surrogateSerializer.serialize(encoder, ClaimResponseItemDetailSurrogate.fromModel(value))
  }
}

public object ClaimResponseItemSerializer : KSerializer<ClaimResponse.Item> {
  internal val surrogateSerializer: KSerializer<ClaimResponseItemSurrogate> by lazy {
    ClaimResponseItemSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Item", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClaimResponse.Item =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClaimResponse.Item) {
    surrogateSerializer.serialize(encoder, ClaimResponseItemSurrogate.fromModel(value))
  }
}

public object ClaimResponseAddItemDetailSubDetailSerializer :
  KSerializer<ClaimResponse.AddItem.Detail.SubDetail> {
  internal val surrogateSerializer:
    KSerializer<ClaimResponseAddItemDetailSubDetailSurrogate> by lazy {
    ClaimResponseAddItemDetailSubDetailSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SubDetail", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClaimResponse.AddItem.Detail.SubDetail =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClaimResponse.AddItem.Detail.SubDetail) {
    surrogateSerializer.serialize(
      encoder,
      ClaimResponseAddItemDetailSubDetailSurrogate.fromModel(value),
    )
  }
}

public object ClaimResponseAddItemDetailSerializer : KSerializer<ClaimResponse.AddItem.Detail> {
  internal val surrogateSerializer: KSerializer<ClaimResponseAddItemDetailSurrogate> by lazy {
    ClaimResponseAddItemDetailSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Detail", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClaimResponse.AddItem.Detail =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClaimResponse.AddItem.Detail) {
    surrogateSerializer.serialize(encoder, ClaimResponseAddItemDetailSurrogate.fromModel(value))
  }
}

public object ClaimResponseAddItemServicedSerializer : KSerializer<ClaimResponse.AddItem.Serviced> {
  internal val surrogateSerializer: KSerializer<ClaimResponseAddItemServicedSurrogate> by lazy {
    ClaimResponseAddItemServicedSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Serviced", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClaimResponse.AddItem.Serviced =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClaimResponse.AddItem.Serviced) {
    surrogateSerializer.serialize(encoder, ClaimResponseAddItemServicedSurrogate.fromModel(value))
  }
}

public object ClaimResponseAddItemLocationSerializer : KSerializer<ClaimResponse.AddItem.Location> {
  internal val surrogateSerializer: KSerializer<ClaimResponseAddItemLocationSurrogate> by lazy {
    ClaimResponseAddItemLocationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Location", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClaimResponse.AddItem.Location =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClaimResponse.AddItem.Location) {
    surrogateSerializer.serialize(encoder, ClaimResponseAddItemLocationSurrogate.fromModel(value))
  }
}

public object ClaimResponseAddItemSerializer : KSerializer<ClaimResponse.AddItem> {
  internal val surrogateSerializer: KSerializer<ClaimResponseAddItemSurrogate> by lazy {
    ClaimResponseAddItemSurrogate.serializer()
  }

  private val resourceType: String? = null

  private val multiChoiceProperties: List<String> = listOf("serviced", "location")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("AddItem", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClaimResponse.AddItem {
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

  override fun serialize(encoder: Encoder, `value`: ClaimResponse.AddItem) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = ClaimResponseAddItemSurrogate.fromModel(value)
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

public object ClaimResponseTotalSerializer : KSerializer<ClaimResponse.Total> {
  internal val surrogateSerializer: KSerializer<ClaimResponseTotalSurrogate> by lazy {
    ClaimResponseTotalSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Total", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClaimResponse.Total =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClaimResponse.Total) {
    surrogateSerializer.serialize(encoder, ClaimResponseTotalSurrogate.fromModel(value))
  }
}

public object ClaimResponsePaymentSerializer : KSerializer<ClaimResponse.Payment> {
  internal val surrogateSerializer: KSerializer<ClaimResponsePaymentSurrogate> by lazy {
    ClaimResponsePaymentSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Payment", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClaimResponse.Payment =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClaimResponse.Payment) {
    surrogateSerializer.serialize(encoder, ClaimResponsePaymentSurrogate.fromModel(value))
  }
}

public object ClaimResponseProcessNoteSerializer : KSerializer<ClaimResponse.ProcessNote> {
  internal val surrogateSerializer: KSerializer<ClaimResponseProcessNoteSurrogate> by lazy {
    ClaimResponseProcessNoteSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ProcessNote", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClaimResponse.ProcessNote =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClaimResponse.ProcessNote) {
    surrogateSerializer.serialize(encoder, ClaimResponseProcessNoteSurrogate.fromModel(value))
  }
}

public object ClaimResponseInsuranceSerializer : KSerializer<ClaimResponse.Insurance> {
  internal val surrogateSerializer: KSerializer<ClaimResponseInsuranceSurrogate> by lazy {
    ClaimResponseInsuranceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Insurance", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClaimResponse.Insurance =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClaimResponse.Insurance) {
    surrogateSerializer.serialize(encoder, ClaimResponseInsuranceSurrogate.fromModel(value))
  }
}

public object ClaimResponseErrorSerializer : KSerializer<ClaimResponse.Error> {
  internal val surrogateSerializer: KSerializer<ClaimResponseErrorSurrogate> by lazy {
    ClaimResponseErrorSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Error", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClaimResponse.Error =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClaimResponse.Error) {
    surrogateSerializer.serialize(encoder, ClaimResponseErrorSurrogate.fromModel(value))
  }
}

public object ClaimResponseSerializer : KSerializer<ClaimResponse> {
  internal val surrogateSerializer: KSerializer<ClaimResponseSurrogate> by lazy {
    ClaimResponseSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ClaimResponse", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ClaimResponse =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ClaimResponse) {
    surrogateSerializer.serialize(encoder, ClaimResponseSurrogate.fromModel(value))
  }
}
