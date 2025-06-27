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

import com.google.fhir.model.r5.Condition
import com.google.fhir.model.r5.surrogates.ConditionParticipantSurrogate
import com.google.fhir.model.r5.surrogates.ConditionStageSurrogate
import com.google.fhir.model.r5.surrogates.ConditionSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ConditionParticipantSerializer : KSerializer<Condition.Participant> {
  internal val surrogateSerializer: KSerializer<ConditionParticipantSurrogate> by lazy {
    ConditionParticipantSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Participant", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Condition.Participant =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Condition.Participant) {
    surrogateSerializer.serialize(encoder, ConditionParticipantSurrogate.fromModel(value))
  }
}

public object ConditionStageSerializer : KSerializer<Condition.Stage> {
  internal val surrogateSerializer: KSerializer<ConditionStageSurrogate> by lazy {
    ConditionStageSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Stage", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Condition.Stage =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Condition.Stage) {
    surrogateSerializer.serialize(encoder, ConditionStageSurrogate.fromModel(value))
  }
}

public object ConditionSerializer : KSerializer<Condition> {
  internal val surrogateSerializer: KSerializer<ConditionSurrogate> by lazy {
    ConditionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Condition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Condition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Condition) {
    surrogateSerializer.serialize(encoder, ConditionSurrogate.fromModel(value))
  }
}
