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

import com.google.fhir.model.r4b.RiskAssessment
import com.google.fhir.model.r4b.surrogates.RiskAssessmentPredictionSurrogate
import com.google.fhir.model.r4b.surrogates.RiskAssessmentSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object RiskAssessmentPredictionSerializer : KSerializer<RiskAssessment.Prediction> {
  internal val surrogateSerializer: KSerializer<RiskAssessmentPredictionSurrogate> by lazy {
    RiskAssessmentPredictionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Prediction", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): RiskAssessment.Prediction =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: RiskAssessment.Prediction) {
    surrogateSerializer.serialize(encoder, RiskAssessmentPredictionSurrogate.fromModel(value))
  }
}

public object RiskAssessmentSerializer : KSerializer<RiskAssessment> {
  internal val surrogateSerializer: KSerializer<RiskAssessmentSurrogate> by lazy {
    RiskAssessmentSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("RiskAssessment", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): RiskAssessment =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: RiskAssessment) {
    surrogateSerializer.serialize(encoder, RiskAssessmentSurrogate.fromModel(value))
  }
}
