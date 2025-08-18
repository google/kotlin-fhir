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

import com.google.fhir.model.r5.EvidenceReport
import com.google.fhir.model.r5.FhirJsonTransformer
import com.google.fhir.model.r5.surrogates.EvidenceReportCiteAsSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceReportRelatesToSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceReportRelatesToTargetSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceReportSectionSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceReportSubjectCharacteristicSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceReportSubjectCharacteristicValueSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceReportSubjectSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceReportSurrogate
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

public object EvidenceReportSubjectCharacteristicValueSerializer :
  KSerializer<EvidenceReport.Subject.Characteristic.Value> {
  internal val surrogateSerializer:
    KSerializer<EvidenceReportSubjectCharacteristicValueSurrogate> by lazy {
    EvidenceReportSubjectCharacteristicValueSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Value", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): EvidenceReport.Subject.Characteristic.Value =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: EvidenceReport.Subject.Characteristic.Value) {
    surrogateSerializer.serialize(
      encoder,
      EvidenceReportSubjectCharacteristicValueSurrogate.fromModel(value),
    )
  }
}

public object EvidenceReportSubjectCharacteristicSerializer :
  KSerializer<EvidenceReport.Subject.Characteristic> {
  internal val surrogateSerializer:
    KSerializer<EvidenceReportSubjectCharacteristicSurrogate> by lazy {
    EvidenceReportSubjectCharacteristicSurrogate.serializer()
  }

  private val resourceType: String? = null

  private val multiChoiceProperties: List<String> = listOf("value")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Characteristic", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): EvidenceReport.Subject.Characteristic {
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

  override fun serialize(encoder: Encoder, `value`: EvidenceReport.Subject.Characteristic) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = EvidenceReportSubjectCharacteristicSurrogate.fromModel(value)
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

public object EvidenceReportSubjectSerializer : KSerializer<EvidenceReport.Subject> {
  internal val surrogateSerializer: KSerializer<EvidenceReportSubjectSurrogate> by lazy {
    EvidenceReportSubjectSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Subject", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): EvidenceReport.Subject =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: EvidenceReport.Subject) {
    surrogateSerializer.serialize(encoder, EvidenceReportSubjectSurrogate.fromModel(value))
  }
}

public object EvidenceReportRelatesToTargetSerializer :
  KSerializer<EvidenceReport.RelatesTo.Target> {
  internal val surrogateSerializer: KSerializer<EvidenceReportRelatesToTargetSurrogate> by lazy {
    EvidenceReportRelatesToTargetSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Target", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): EvidenceReport.RelatesTo.Target =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: EvidenceReport.RelatesTo.Target) {
    surrogateSerializer.serialize(encoder, EvidenceReportRelatesToTargetSurrogate.fromModel(value))
  }
}

public object EvidenceReportRelatesToSerializer : KSerializer<EvidenceReport.RelatesTo> {
  internal val surrogateSerializer: KSerializer<EvidenceReportRelatesToSurrogate> by lazy {
    EvidenceReportRelatesToSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("RelatesTo", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): EvidenceReport.RelatesTo =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: EvidenceReport.RelatesTo) {
    surrogateSerializer.serialize(encoder, EvidenceReportRelatesToSurrogate.fromModel(value))
  }
}

public object EvidenceReportSectionSerializer : KSerializer<EvidenceReport.Section> {
  internal val surrogateSerializer: KSerializer<EvidenceReportSectionSurrogate> by lazy {
    EvidenceReportSectionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Section", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): EvidenceReport.Section =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: EvidenceReport.Section) {
    surrogateSerializer.serialize(encoder, EvidenceReportSectionSurrogate.fromModel(value))
  }
}

public object EvidenceReportCiteAsSerializer : KSerializer<EvidenceReport.CiteAs> {
  internal val surrogateSerializer: KSerializer<EvidenceReportCiteAsSurrogate> by lazy {
    EvidenceReportCiteAsSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("CiteAs", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): EvidenceReport.CiteAs =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: EvidenceReport.CiteAs) {
    surrogateSerializer.serialize(encoder, EvidenceReportCiteAsSurrogate.fromModel(value))
  }
}

public object EvidenceReportSerializer : KSerializer<EvidenceReport> {
  internal val surrogateSerializer: KSerializer<EvidenceReportSurrogate> by lazy {
    EvidenceReportSurrogate.serializer()
  }

  private val resourceType: String? = "EvidenceReport"

  private val multiChoiceProperties: List<String> = listOf("citeAs")

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("EvidenceReport", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): EvidenceReport {
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

  override fun serialize(encoder: Encoder, `value`: EvidenceReport) {
    val jsonEncoder =
      encoder as? JsonEncoder ?: error("This serializer only supports JSON encoding")
    val surrogate = EvidenceReportSurrogate.fromModel(value)
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
