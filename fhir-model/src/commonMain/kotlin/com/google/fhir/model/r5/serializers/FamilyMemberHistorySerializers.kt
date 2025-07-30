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

import com.google.fhir.model.r5.FamilyMemberHistory
import com.google.fhir.model.r5.FhirJsonTransformer
import com.google.fhir.model.r5.surrogates.FamilyMemberHistoryAgeSurrogate
import com.google.fhir.model.r5.surrogates.FamilyMemberHistoryBornSurrogate
import com.google.fhir.model.r5.surrogates.FamilyMemberHistoryConditionOnsetSurrogate
import com.google.fhir.model.r5.surrogates.FamilyMemberHistoryConditionSurrogate
import com.google.fhir.model.r5.surrogates.FamilyMemberHistoryDeceasedSurrogate
import com.google.fhir.model.r5.surrogates.FamilyMemberHistoryParticipantSurrogate
import com.google.fhir.model.r5.surrogates.FamilyMemberHistoryProcedurePerformedSurrogate
import com.google.fhir.model.r5.surrogates.FamilyMemberHistoryProcedureSurrogate
import com.google.fhir.model.r5.surrogates.FamilyMemberHistorySurrogate
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

public object FamilyMemberHistoryParticipantSerializer :
  KSerializer<FamilyMemberHistory.Participant> {
  internal val surrogateSerializer: KSerializer<FamilyMemberHistoryParticipantSurrogate> by lazy {
    FamilyMemberHistoryParticipantSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Participant", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): FamilyMemberHistory.Participant =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: FamilyMemberHistory.Participant) {
    surrogateSerializer.serialize(encoder, FamilyMemberHistoryParticipantSurrogate.fromModel(value))
  }
}

public object FamilyMemberHistoryConditionOnsetSerializer :
  KSerializer<FamilyMemberHistory.Condition.Onset> {
  internal val surrogateSerializer:
    KSerializer<FamilyMemberHistoryConditionOnsetSurrogate> by lazy {
    FamilyMemberHistoryConditionOnsetSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Onset", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): FamilyMemberHistory.Condition.Onset =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: FamilyMemberHistory.Condition.Onset) {
    surrogateSerializer.serialize(
      encoder,
      FamilyMemberHistoryConditionOnsetSurrogate.fromModel(value),
    )
  }
}

public object FamilyMemberHistoryConditionSerializer : KSerializer<FamilyMemberHistory.Condition> {
  internal val surrogateSerializer: KSerializer<FamilyMemberHistoryConditionSurrogate> by lazy {
    FamilyMemberHistoryConditionSurrogate.serializer()
  }

  private val resourceType: String? = null

  private val multiChoiceProperties: List<String> = listOf("onset")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Condition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): FamilyMemberHistory.Condition {
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

  override fun serialize(encoder: Encoder, `value`: FamilyMemberHistory.Condition) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = FamilyMemberHistoryConditionSurrogate.fromModel(value)
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

public object FamilyMemberHistoryProcedurePerformedSerializer :
  KSerializer<FamilyMemberHistory.Procedure.Performed> {
  internal val surrogateSerializer:
    KSerializer<FamilyMemberHistoryProcedurePerformedSurrogate> by lazy {
    FamilyMemberHistoryProcedurePerformedSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Performed", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): FamilyMemberHistory.Procedure.Performed =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: FamilyMemberHistory.Procedure.Performed) {
    surrogateSerializer.serialize(
      encoder,
      FamilyMemberHistoryProcedurePerformedSurrogate.fromModel(value),
    )
  }
}

public object FamilyMemberHistoryProcedureSerializer : KSerializer<FamilyMemberHistory.Procedure> {
  internal val surrogateSerializer: KSerializer<FamilyMemberHistoryProcedureSurrogate> by lazy {
    FamilyMemberHistoryProcedureSurrogate.serializer()
  }

  private val resourceType: String? = null

  private val multiChoiceProperties: List<String> = listOf("performed")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Procedure", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): FamilyMemberHistory.Procedure {
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

  override fun serialize(encoder: Encoder, `value`: FamilyMemberHistory.Procedure) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = FamilyMemberHistoryProcedureSurrogate.fromModel(value)
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

public object FamilyMemberHistoryBornSerializer : KSerializer<FamilyMemberHistory.Born> {
  internal val surrogateSerializer: KSerializer<FamilyMemberHistoryBornSurrogate> by lazy {
    FamilyMemberHistoryBornSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Born", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): FamilyMemberHistory.Born =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: FamilyMemberHistory.Born) {
    surrogateSerializer.serialize(encoder, FamilyMemberHistoryBornSurrogate.fromModel(value))
  }
}

public object FamilyMemberHistoryAgeSerializer : KSerializer<FamilyMemberHistory.Age> {
  internal val surrogateSerializer: KSerializer<FamilyMemberHistoryAgeSurrogate> by lazy {
    FamilyMemberHistoryAgeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Age", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): FamilyMemberHistory.Age =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: FamilyMemberHistory.Age) {
    surrogateSerializer.serialize(encoder, FamilyMemberHistoryAgeSurrogate.fromModel(value))
  }
}

public object FamilyMemberHistoryDeceasedSerializer : KSerializer<FamilyMemberHistory.Deceased> {
  internal val surrogateSerializer: KSerializer<FamilyMemberHistoryDeceasedSurrogate> by lazy {
    FamilyMemberHistoryDeceasedSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Deceased", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): FamilyMemberHistory.Deceased =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: FamilyMemberHistory.Deceased) {
    surrogateSerializer.serialize(encoder, FamilyMemberHistoryDeceasedSurrogate.fromModel(value))
  }
}

public object FamilyMemberHistorySerializer : KSerializer<FamilyMemberHistory> {
  internal val surrogateSerializer: KSerializer<FamilyMemberHistorySurrogate> by lazy {
    FamilyMemberHistorySurrogate.serializer()
  }

  private val resourceType: String? = "FamilyMemberHistory"

  private val multiChoiceProperties: List<String> = listOf("born", "age", "deceased")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("FamilyMemberHistory", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): FamilyMemberHistory {
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

  override fun serialize(encoder: Encoder, `value`: FamilyMemberHistory) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = FamilyMemberHistorySurrogate.fromModel(value)
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
