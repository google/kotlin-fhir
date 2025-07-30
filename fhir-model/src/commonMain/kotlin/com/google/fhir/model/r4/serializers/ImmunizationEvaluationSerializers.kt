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

import com.google.fhir.model.r4.FhirJsonTransformer
import com.google.fhir.model.r4.ImmunizationEvaluation
import com.google.fhir.model.r4.surrogates.ImmunizationEvaluationDoseNumberSurrogate
import com.google.fhir.model.r4.surrogates.ImmunizationEvaluationSeriesDosesSurrogate
import com.google.fhir.model.r4.surrogates.ImmunizationEvaluationSurrogate
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

public object ImmunizationEvaluationDoseNumberSerializer :
  KSerializer<ImmunizationEvaluation.DoseNumber> {
  internal val surrogateSerializer: KSerializer<ImmunizationEvaluationDoseNumberSurrogate> by lazy {
    ImmunizationEvaluationDoseNumberSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DoseNumber", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ImmunizationEvaluation.DoseNumber =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ImmunizationEvaluation.DoseNumber) {
    surrogateSerializer.serialize(
      encoder,
      ImmunizationEvaluationDoseNumberSurrogate.fromModel(value),
    )
  }
}

public object ImmunizationEvaluationSeriesDosesSerializer :
  KSerializer<ImmunizationEvaluation.SeriesDoses> {
  internal val surrogateSerializer:
    KSerializer<ImmunizationEvaluationSeriesDosesSurrogate> by lazy {
    ImmunizationEvaluationSeriesDosesSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SeriesDoses", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ImmunizationEvaluation.SeriesDoses =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ImmunizationEvaluation.SeriesDoses) {
    surrogateSerializer.serialize(
      encoder,
      ImmunizationEvaluationSeriesDosesSurrogate.fromModel(value),
    )
  }
}

public object ImmunizationEvaluationSerializer : KSerializer<ImmunizationEvaluation> {
  internal val surrogateSerializer: KSerializer<ImmunizationEvaluationSurrogate> by lazy {
    ImmunizationEvaluationSurrogate.serializer()
  }

  private val resourceType: String? = "ImmunizationEvaluation"

  private val multiChoiceProperties: List<String> = listOf("doseNumber", "seriesDoses")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ImmunizationEvaluation", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ImmunizationEvaluation {
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

  override fun serialize(encoder: Encoder, `value`: ImmunizationEvaluation) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = ImmunizationEvaluationSurrogate.fromModel(value)
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
