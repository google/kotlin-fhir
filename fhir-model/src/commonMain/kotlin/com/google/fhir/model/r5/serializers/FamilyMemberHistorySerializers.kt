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

import com.google.fhir.model.r5.FamilyMemberHistory
import com.google.fhir.model.r5.surrogates.FamilyMemberHistoryConditionSurrogate
import com.google.fhir.model.r5.surrogates.FamilyMemberHistoryParticipantSurrogate
import com.google.fhir.model.r5.surrogates.FamilyMemberHistoryProcedureSurrogate
import com.google.fhir.model.r5.surrogates.FamilyMemberHistorySurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object FamilyMemberHistoryParticipantSerializer :
  KSerializer<FamilyMemberHistory.Participant> {
  internal val surrogateSerializer: KSerializer<FamilyMemberHistoryParticipantSurrogate> by lazy {
    FamilyMemberHistoryParticipantSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Participant", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): FamilyMemberHistory.Participant =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: FamilyMemberHistory.Participant) {
    surrogateSerializer.serialize(encoder, FamilyMemberHistoryParticipantSurrogate.fromModel(value))
  }
}

public object FamilyMemberHistoryConditionSerializer : KSerializer<FamilyMemberHistory.Condition> {
  internal val surrogateSerializer: KSerializer<FamilyMemberHistoryConditionSurrogate> by lazy {
    FamilyMemberHistoryConditionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Condition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): FamilyMemberHistory.Condition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: FamilyMemberHistory.Condition) {
    surrogateSerializer.serialize(encoder, FamilyMemberHistoryConditionSurrogate.fromModel(value))
  }
}

public object FamilyMemberHistoryProcedureSerializer : KSerializer<FamilyMemberHistory.Procedure> {
  internal val surrogateSerializer: KSerializer<FamilyMemberHistoryProcedureSurrogate> by lazy {
    FamilyMemberHistoryProcedureSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Procedure", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): FamilyMemberHistory.Procedure =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: FamilyMemberHistory.Procedure) {
    surrogateSerializer.serialize(encoder, FamilyMemberHistoryProcedureSurrogate.fromModel(value))
  }
}

public object FamilyMemberHistorySerializer : KSerializer<FamilyMemberHistory> {
  internal val surrogateSerializer: KSerializer<FamilyMemberHistorySurrogate> by lazy {
    FamilyMemberHistorySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("FamilyMemberHistory", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): FamilyMemberHistory =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: FamilyMemberHistory) {
    surrogateSerializer.serialize(encoder, FamilyMemberHistorySurrogate.fromModel(value))
  }
}
