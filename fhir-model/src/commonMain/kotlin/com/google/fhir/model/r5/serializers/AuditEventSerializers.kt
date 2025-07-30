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

import com.google.fhir.model.r5.AuditEvent
import com.google.fhir.model.r5.FhirJsonTransformer
import com.google.fhir.model.r5.surrogates.AuditEventAgentNetworkSurrogate
import com.google.fhir.model.r5.surrogates.AuditEventAgentSurrogate
import com.google.fhir.model.r5.surrogates.AuditEventEntityDetailSurrogate
import com.google.fhir.model.r5.surrogates.AuditEventEntityDetailValueSurrogate
import com.google.fhir.model.r5.surrogates.AuditEventEntitySurrogate
import com.google.fhir.model.r5.surrogates.AuditEventOccurredSurrogate
import com.google.fhir.model.r5.surrogates.AuditEventOutcomeSurrogate
import com.google.fhir.model.r5.surrogates.AuditEventSourceSurrogate
import com.google.fhir.model.r5.surrogates.AuditEventSurrogate
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

public object AuditEventOutcomeSerializer : KSerializer<AuditEvent.Outcome> {
  internal val surrogateSerializer: KSerializer<AuditEventOutcomeSurrogate> by lazy {
    AuditEventOutcomeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Outcome", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AuditEvent.Outcome =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AuditEvent.Outcome) {
    surrogateSerializer.serialize(encoder, AuditEventOutcomeSurrogate.fromModel(value))
  }
}

public object AuditEventAgentNetworkSerializer : KSerializer<AuditEvent.Agent.Network> {
  internal val surrogateSerializer: KSerializer<AuditEventAgentNetworkSurrogate> by lazy {
    AuditEventAgentNetworkSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Network", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AuditEvent.Agent.Network =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AuditEvent.Agent.Network) {
    surrogateSerializer.serialize(encoder, AuditEventAgentNetworkSurrogate.fromModel(value))
  }
}

public object AuditEventAgentSerializer : KSerializer<AuditEvent.Agent> {
  internal val surrogateSerializer: KSerializer<AuditEventAgentSurrogate> by lazy {
    AuditEventAgentSurrogate.serializer()
  }

  private val resourceType: String? = null

  private val multiChoiceProperties: List<String> = listOf("network")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Agent", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AuditEvent.Agent {
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

  override fun serialize(encoder: Encoder, `value`: AuditEvent.Agent) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = AuditEventAgentSurrogate.fromModel(value)
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

public object AuditEventSourceSerializer : KSerializer<AuditEvent.Source> {
  internal val surrogateSerializer: KSerializer<AuditEventSourceSurrogate> by lazy {
    AuditEventSourceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Source", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AuditEvent.Source =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AuditEvent.Source) {
    surrogateSerializer.serialize(encoder, AuditEventSourceSurrogate.fromModel(value))
  }
}

public object AuditEventEntityDetailValueSerializer : KSerializer<AuditEvent.Entity.Detail.Value> {
  internal val surrogateSerializer: KSerializer<AuditEventEntityDetailValueSurrogate> by lazy {
    AuditEventEntityDetailValueSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Value", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AuditEvent.Entity.Detail.Value =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AuditEvent.Entity.Detail.Value) {
    surrogateSerializer.serialize(encoder, AuditEventEntityDetailValueSurrogate.fromModel(value))
  }
}

public object AuditEventEntityDetailSerializer : KSerializer<AuditEvent.Entity.Detail> {
  internal val surrogateSerializer: KSerializer<AuditEventEntityDetailSurrogate> by lazy {
    AuditEventEntityDetailSurrogate.serializer()
  }

  private val resourceType: String? = null

  private val multiChoiceProperties: List<String> = listOf("value")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Detail", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AuditEvent.Entity.Detail {
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

  override fun serialize(encoder: Encoder, `value`: AuditEvent.Entity.Detail) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = AuditEventEntityDetailSurrogate.fromModel(value)
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

public object AuditEventEntitySerializer : KSerializer<AuditEvent.Entity> {
  internal val surrogateSerializer: KSerializer<AuditEventEntitySurrogate> by lazy {
    AuditEventEntitySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Entity", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AuditEvent.Entity =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AuditEvent.Entity) {
    surrogateSerializer.serialize(encoder, AuditEventEntitySurrogate.fromModel(value))
  }
}

public object AuditEventOccurredSerializer : KSerializer<AuditEvent.Occurred> {
  internal val surrogateSerializer: KSerializer<AuditEventOccurredSurrogate> by lazy {
    AuditEventOccurredSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Occurred", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AuditEvent.Occurred =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AuditEvent.Occurred) {
    surrogateSerializer.serialize(encoder, AuditEventOccurredSurrogate.fromModel(value))
  }
}

public object AuditEventSerializer : KSerializer<AuditEvent> {
  internal val surrogateSerializer: KSerializer<AuditEventSurrogate> by lazy {
    AuditEventSurrogate.serializer()
  }

  private val resourceType: String? = "AuditEvent"

  private val multiChoiceProperties: List<String> = listOf("occurred")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("AuditEvent", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AuditEvent {
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

  override fun serialize(encoder: Encoder, `value`: AuditEvent) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = AuditEventSurrogate.fromModel(value)
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
