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

import com.google.fhir.model.r4b.OperationOutcome
import com.google.fhir.model.r4b.surrogates.OperationOutcomeIssueSurrogate
import com.google.fhir.model.r4b.surrogates.OperationOutcomeSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object OperationOutcomeIssueSerializer : KSerializer<OperationOutcome.Issue> {
  internal val surrogateSerializer: KSerializer<OperationOutcomeIssueSurrogate> by lazy {
    OperationOutcomeIssueSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Issue", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): OperationOutcome.Issue =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: OperationOutcome.Issue) {
    surrogateSerializer.serialize(encoder, OperationOutcomeIssueSurrogate.fromModel(value))
  }
}

public object OperationOutcomeSerializer : KSerializer<OperationOutcome> {
  internal val surrogateSerializer: KSerializer<OperationOutcomeSurrogate> by lazy {
    OperationOutcomeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("OperationOutcome", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): OperationOutcome =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: OperationOutcome) {
    surrogateSerializer.serialize(encoder, OperationOutcomeSurrogate.fromModel(value))
  }
}
