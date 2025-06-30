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

import com.google.fhir.model.r5.DetectedIssue
import com.google.fhir.model.r5.surrogates.DetectedIssueEvidenceSurrogate
import com.google.fhir.model.r5.surrogates.DetectedIssueMitigationSurrogate
import com.google.fhir.model.r5.surrogates.DetectedIssueSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object DetectedIssueEvidenceSerializer : KSerializer<DetectedIssue.Evidence> {
  internal val surrogateSerializer: KSerializer<DetectedIssueEvidenceSurrogate> by lazy {
    DetectedIssueEvidenceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Evidence", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DetectedIssue.Evidence =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DetectedIssue.Evidence) {
    surrogateSerializer.serialize(encoder, DetectedIssueEvidenceSurrogate.fromModel(value))
  }
}

public object DetectedIssueMitigationSerializer : KSerializer<DetectedIssue.Mitigation> {
  internal val surrogateSerializer: KSerializer<DetectedIssueMitigationSurrogate> by lazy {
    DetectedIssueMitigationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Mitigation", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DetectedIssue.Mitigation =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DetectedIssue.Mitigation) {
    surrogateSerializer.serialize(encoder, DetectedIssueMitigationSurrogate.fromModel(value))
  }
}

public object DetectedIssueSerializer : KSerializer<DetectedIssue> {
  internal val surrogateSerializer: KSerializer<DetectedIssueSurrogate> by lazy {
    DetectedIssueSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DetectedIssue", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DetectedIssue =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DetectedIssue) {
    surrogateSerializer.serialize(encoder, DetectedIssueSurrogate.fromModel(value))
  }
}
