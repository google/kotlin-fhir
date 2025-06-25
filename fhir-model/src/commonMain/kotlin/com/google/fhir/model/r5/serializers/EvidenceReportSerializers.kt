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
import com.google.fhir.model.r5.surrogates.EvidenceReportRelatesToSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceReportRelatesToTargetSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceReportSectionSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceReportSubjectCharacteristicSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceReportSubjectSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceReportSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object EvidenceReportSubjectCharacteristicSerializer :
  KSerializer<EvidenceReport.Subject.Characteristic> {
  internal val surrogateSerializer:
    KSerializer<EvidenceReportSubjectCharacteristicSurrogate> by lazy {
    EvidenceReportSubjectCharacteristicSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Characteristic", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): EvidenceReport.Subject.Characteristic =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: EvidenceReport.Subject.Characteristic) {
    surrogateSerializer.serialize(
      encoder,
      EvidenceReportSubjectCharacteristicSurrogate.fromModel(value),
    )
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

public object EvidenceReportSerializer : KSerializer<EvidenceReport> {
  internal val surrogateSerializer: KSerializer<EvidenceReportSurrogate> by lazy {
    EvidenceReportSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("EvidenceReport", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): EvidenceReport =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: EvidenceReport) {
    surrogateSerializer.serialize(encoder, EvidenceReportSurrogate.fromModel(value))
  }
}
