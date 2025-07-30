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

import com.google.fhir.model.r5.FhirJsonTransformer
import com.google.fhir.model.r5.Specimen
import com.google.fhir.model.r5.surrogates.SpecimenCollectionCollectedSurrogate
import com.google.fhir.model.r5.surrogates.SpecimenCollectionFastingStatusSurrogate
import com.google.fhir.model.r5.surrogates.SpecimenCollectionSurrogate
import com.google.fhir.model.r5.surrogates.SpecimenContainerSurrogate
import com.google.fhir.model.r5.surrogates.SpecimenFeatureSurrogate
import com.google.fhir.model.r5.surrogates.SpecimenProcessingSurrogate
import com.google.fhir.model.r5.surrogates.SpecimenProcessingTimeSurrogate
import com.google.fhir.model.r5.surrogates.SpecimenSurrogate
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

public object SpecimenFeatureSerializer : KSerializer<Specimen.Feature> {
  internal val surrogateSerializer: KSerializer<SpecimenFeatureSurrogate> by lazy {
    SpecimenFeatureSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Feature", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Specimen.Feature =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Specimen.Feature) {
    surrogateSerializer.serialize(encoder, SpecimenFeatureSurrogate.fromModel(value))
  }
}

public object SpecimenCollectionCollectedSerializer : KSerializer<Specimen.Collection.Collected> {
  internal val surrogateSerializer: KSerializer<SpecimenCollectionCollectedSurrogate> by lazy {
    SpecimenCollectionCollectedSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Collected", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Specimen.Collection.Collected =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Specimen.Collection.Collected) {
    surrogateSerializer.serialize(encoder, SpecimenCollectionCollectedSurrogate.fromModel(value))
  }
}

public object SpecimenCollectionFastingStatusSerializer :
  KSerializer<Specimen.Collection.FastingStatus> {
  internal val surrogateSerializer: KSerializer<SpecimenCollectionFastingStatusSurrogate> by lazy {
    SpecimenCollectionFastingStatusSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("FastingStatus", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Specimen.Collection.FastingStatus =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Specimen.Collection.FastingStatus) {
    surrogateSerializer.serialize(
      encoder,
      SpecimenCollectionFastingStatusSurrogate.fromModel(value),
    )
  }
}

public object SpecimenCollectionSerializer : KSerializer<Specimen.Collection> {
  internal val surrogateSerializer: KSerializer<SpecimenCollectionSurrogate> by lazy {
    SpecimenCollectionSurrogate.serializer()
  }

  private val resourceType: String? = null

  private val multiChoiceProperties: List<String> = listOf("collected", "fastingStatus")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Collection", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Specimen.Collection {
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

  override fun serialize(encoder: Encoder, `value`: Specimen.Collection) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = SpecimenCollectionSurrogate.fromModel(value)
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

public object SpecimenProcessingTimeSerializer : KSerializer<Specimen.Processing.Time> {
  internal val surrogateSerializer: KSerializer<SpecimenProcessingTimeSurrogate> by lazy {
    SpecimenProcessingTimeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Time", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Specimen.Processing.Time =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Specimen.Processing.Time) {
    surrogateSerializer.serialize(encoder, SpecimenProcessingTimeSurrogate.fromModel(value))
  }
}

public object SpecimenProcessingSerializer : KSerializer<Specimen.Processing> {
  internal val surrogateSerializer: KSerializer<SpecimenProcessingSurrogate> by lazy {
    SpecimenProcessingSurrogate.serializer()
  }

  private val resourceType: String? = null

  private val multiChoiceProperties: List<String> = listOf("time")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Processing", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Specimen.Processing {
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

  override fun serialize(encoder: Encoder, `value`: Specimen.Processing) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = SpecimenProcessingSurrogate.fromModel(value)
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

public object SpecimenContainerSerializer : KSerializer<Specimen.Container> {
  internal val surrogateSerializer: KSerializer<SpecimenContainerSurrogate> by lazy {
    SpecimenContainerSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Container", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Specimen.Container =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Specimen.Container) {
    surrogateSerializer.serialize(encoder, SpecimenContainerSurrogate.fromModel(value))
  }
}

public object SpecimenSerializer : KSerializer<Specimen> {
  internal val surrogateSerializer: KSerializer<SpecimenSurrogate> by lazy {
    SpecimenSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Specimen", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Specimen =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Specimen) {
    surrogateSerializer.serialize(encoder, SpecimenSurrogate.fromModel(value))
  }
}
