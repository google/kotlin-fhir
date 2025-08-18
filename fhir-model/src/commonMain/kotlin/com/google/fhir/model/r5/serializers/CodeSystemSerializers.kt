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

import com.google.fhir.model.r5.CodeSystem
import com.google.fhir.model.r5.FhirJsonTransformer
import com.google.fhir.model.r5.surrogates.CodeSystemConceptDesignationSurrogate
import com.google.fhir.model.r5.surrogates.CodeSystemConceptPropertySurrogate
import com.google.fhir.model.r5.surrogates.CodeSystemConceptPropertyValueSurrogate
import com.google.fhir.model.r5.surrogates.CodeSystemConceptSurrogate
import com.google.fhir.model.r5.surrogates.CodeSystemFilterSurrogate
import com.google.fhir.model.r5.surrogates.CodeSystemPropertySurrogate
import com.google.fhir.model.r5.surrogates.CodeSystemSurrogate
import com.google.fhir.model.r5.surrogates.CodeSystemVersionAlgorithmSurrogate
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

public object CodeSystemFilterSerializer : KSerializer<CodeSystem.Filter> {
  internal val surrogateSerializer: KSerializer<CodeSystemFilterSurrogate> by lazy {
    CodeSystemFilterSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Filter", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CodeSystem.Filter =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CodeSystem.Filter) {
    surrogateSerializer.serialize(encoder, CodeSystemFilterSurrogate.fromModel(value))
  }
}

public object CodeSystemPropertySerializer : KSerializer<CodeSystem.Property> {
  internal val surrogateSerializer: KSerializer<CodeSystemPropertySurrogate> by lazy {
    CodeSystemPropertySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Property", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CodeSystem.Property =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CodeSystem.Property) {
    surrogateSerializer.serialize(encoder, CodeSystemPropertySurrogate.fromModel(value))
  }
}

public object CodeSystemConceptDesignationSerializer : KSerializer<CodeSystem.Concept.Designation> {
  internal val surrogateSerializer: KSerializer<CodeSystemConceptDesignationSurrogate> by lazy {
    CodeSystemConceptDesignationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Designation", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CodeSystem.Concept.Designation =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CodeSystem.Concept.Designation) {
    surrogateSerializer.serialize(encoder, CodeSystemConceptDesignationSurrogate.fromModel(value))
  }
}

public object CodeSystemConceptPropertyValueSerializer :
  KSerializer<CodeSystem.Concept.Property.Value> {
  internal val surrogateSerializer: KSerializer<CodeSystemConceptPropertyValueSurrogate> by lazy {
    CodeSystemConceptPropertyValueSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Value", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CodeSystem.Concept.Property.Value =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CodeSystem.Concept.Property.Value) {
    surrogateSerializer.serialize(encoder, CodeSystemConceptPropertyValueSurrogate.fromModel(value))
  }
}

public object CodeSystemConceptPropertySerializer : KSerializer<CodeSystem.Concept.Property> {
  internal val surrogateSerializer: KSerializer<CodeSystemConceptPropertySurrogate> by lazy {
    CodeSystemConceptPropertySurrogate.serializer()
  }

  private val resourceType: String? = null

  private val multiChoiceProperties: List<String> = listOf("value")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Property", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CodeSystem.Concept.Property {
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

  override fun serialize(encoder: Encoder, `value`: CodeSystem.Concept.Property) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = CodeSystemConceptPropertySurrogate.fromModel(value)
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

public object CodeSystemConceptSerializer : KSerializer<CodeSystem.Concept> {
  internal val surrogateSerializer: KSerializer<CodeSystemConceptSurrogate> by lazy {
    CodeSystemConceptSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Concept", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CodeSystem.Concept =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CodeSystem.Concept) {
    surrogateSerializer.serialize(encoder, CodeSystemConceptSurrogate.fromModel(value))
  }
}

public object CodeSystemVersionAlgorithmSerializer : KSerializer<CodeSystem.VersionAlgorithm> {
  internal val surrogateSerializer: KSerializer<CodeSystemVersionAlgorithmSurrogate> by lazy {
    CodeSystemVersionAlgorithmSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("VersionAlgorithm", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CodeSystem.VersionAlgorithm =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CodeSystem.VersionAlgorithm) {
    surrogateSerializer.serialize(encoder, CodeSystemVersionAlgorithmSurrogate.fromModel(value))
  }
}

public object CodeSystemSerializer : KSerializer<CodeSystem> {
  internal val surrogateSerializer: KSerializer<CodeSystemSurrogate> by lazy {
    CodeSystemSurrogate.serializer()
  }

  private val resourceType: String? = "CodeSystem"

  private val multiChoiceProperties: List<String> = listOf("versionAlgorithm")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("CodeSystem", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CodeSystem {
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

  override fun serialize(encoder: Encoder, `value`: CodeSystem) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = CodeSystemSurrogate.fromModel(value)
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
