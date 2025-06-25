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

import com.google.fhir.model.r5.DiagnosticReport
import com.google.fhir.model.r5.surrogates.DiagnosticReportMediaSurrogate
import com.google.fhir.model.r5.surrogates.DiagnosticReportSupportingInfoSurrogate
import com.google.fhir.model.r5.surrogates.DiagnosticReportSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object DiagnosticReportSupportingInfoSerializer :
  KSerializer<DiagnosticReport.SupportingInfo> {
  internal val surrogateSerializer: KSerializer<DiagnosticReportSupportingInfoSurrogate> by lazy {
    DiagnosticReportSupportingInfoSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SupportingInfo", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DiagnosticReport.SupportingInfo =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DiagnosticReport.SupportingInfo) {
    surrogateSerializer.serialize(encoder, DiagnosticReportSupportingInfoSurrogate.fromModel(value))
  }
}

public object DiagnosticReportMediaSerializer : KSerializer<DiagnosticReport.Media> {
  internal val surrogateSerializer: KSerializer<DiagnosticReportMediaSurrogate> by lazy {
    DiagnosticReportMediaSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Media", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DiagnosticReport.Media =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DiagnosticReport.Media) {
    surrogateSerializer.serialize(encoder, DiagnosticReportMediaSurrogate.fromModel(value))
  }
}

public object DiagnosticReportSerializer : KSerializer<DiagnosticReport> {
  internal val surrogateSerializer: KSerializer<DiagnosticReportSurrogate> by lazy {
    DiagnosticReportSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DiagnosticReport", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DiagnosticReport =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DiagnosticReport) {
    surrogateSerializer.serialize(encoder, DiagnosticReportSurrogate.fromModel(value))
  }
}
