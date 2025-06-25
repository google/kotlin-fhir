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

import com.google.fhir.model.r5.GenomicStudy
import com.google.fhir.model.r5.surrogates.GenomicStudyAnalysisDeviceSurrogate
import com.google.fhir.model.r5.surrogates.GenomicStudyAnalysisInputSurrogate
import com.google.fhir.model.r5.surrogates.GenomicStudyAnalysisOutputSurrogate
import com.google.fhir.model.r5.surrogates.GenomicStudyAnalysisPerformerSurrogate
import com.google.fhir.model.r5.surrogates.GenomicStudyAnalysisSurrogate
import com.google.fhir.model.r5.surrogates.GenomicStudySurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object GenomicStudyAnalysisInputSerializer : KSerializer<GenomicStudy.Analysis.Input> {
  internal val surrogateSerializer: KSerializer<GenomicStudyAnalysisInputSurrogate> by lazy {
    GenomicStudyAnalysisInputSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Input", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): GenomicStudy.Analysis.Input =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: GenomicStudy.Analysis.Input) {
    surrogateSerializer.serialize(encoder, GenomicStudyAnalysisInputSurrogate.fromModel(value))
  }
}

public object GenomicStudyAnalysisOutputSerializer : KSerializer<GenomicStudy.Analysis.Output> {
  internal val surrogateSerializer: KSerializer<GenomicStudyAnalysisOutputSurrogate> by lazy {
    GenomicStudyAnalysisOutputSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Output", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): GenomicStudy.Analysis.Output =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: GenomicStudy.Analysis.Output) {
    surrogateSerializer.serialize(encoder, GenomicStudyAnalysisOutputSurrogate.fromModel(value))
  }
}

public object GenomicStudyAnalysisPerformerSerializer :
  KSerializer<GenomicStudy.Analysis.Performer> {
  internal val surrogateSerializer: KSerializer<GenomicStudyAnalysisPerformerSurrogate> by lazy {
    GenomicStudyAnalysisPerformerSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Performer", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): GenomicStudy.Analysis.Performer =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: GenomicStudy.Analysis.Performer) {
    surrogateSerializer.serialize(encoder, GenomicStudyAnalysisPerformerSurrogate.fromModel(value))
  }
}

public object GenomicStudyAnalysisDeviceSerializer : KSerializer<GenomicStudy.Analysis.Device> {
  internal val surrogateSerializer: KSerializer<GenomicStudyAnalysisDeviceSurrogate> by lazy {
    GenomicStudyAnalysisDeviceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Device", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): GenomicStudy.Analysis.Device =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: GenomicStudy.Analysis.Device) {
    surrogateSerializer.serialize(encoder, GenomicStudyAnalysisDeviceSurrogate.fromModel(value))
  }
}

public object GenomicStudyAnalysisSerializer : KSerializer<GenomicStudy.Analysis> {
  internal val surrogateSerializer: KSerializer<GenomicStudyAnalysisSurrogate> by lazy {
    GenomicStudyAnalysisSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Analysis", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): GenomicStudy.Analysis =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: GenomicStudy.Analysis) {
    surrogateSerializer.serialize(encoder, GenomicStudyAnalysisSurrogate.fromModel(value))
  }
}

public object GenomicStudySerializer : KSerializer<GenomicStudy> {
  internal val surrogateSerializer: KSerializer<GenomicStudySurrogate> by lazy {
    GenomicStudySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("GenomicStudy", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): GenomicStudy =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: GenomicStudy) {
    surrogateSerializer.serialize(encoder, GenomicStudySurrogate.fromModel(value))
  }
}
