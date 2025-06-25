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

import com.google.fhir.model.r4b.PlanDefinition
import com.google.fhir.model.r4b.surrogates.PlanDefinitionActionConditionSurrogate
import com.google.fhir.model.r4b.surrogates.PlanDefinitionActionDynamicValueSurrogate
import com.google.fhir.model.r4b.surrogates.PlanDefinitionActionParticipantSurrogate
import com.google.fhir.model.r4b.surrogates.PlanDefinitionActionRelatedActionSurrogate
import com.google.fhir.model.r4b.surrogates.PlanDefinitionActionSurrogate
import com.google.fhir.model.r4b.surrogates.PlanDefinitionGoalSurrogate
import com.google.fhir.model.r4b.surrogates.PlanDefinitionGoalTargetSurrogate
import com.google.fhir.model.r4b.surrogates.PlanDefinitionSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object PlanDefinitionGoalTargetSerializer : KSerializer<PlanDefinition.Goal.Target> {
  internal val surrogateSerializer: KSerializer<PlanDefinitionGoalTargetSurrogate> by lazy {
    PlanDefinitionGoalTargetSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Target", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): PlanDefinition.Goal.Target =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: PlanDefinition.Goal.Target) {
    surrogateSerializer.serialize(encoder, PlanDefinitionGoalTargetSurrogate.fromModel(value))
  }
}

public object PlanDefinitionGoalSerializer : KSerializer<PlanDefinition.Goal> {
  internal val surrogateSerializer: KSerializer<PlanDefinitionGoalSurrogate> by lazy {
    PlanDefinitionGoalSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Goal", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): PlanDefinition.Goal =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: PlanDefinition.Goal) {
    surrogateSerializer.serialize(encoder, PlanDefinitionGoalSurrogate.fromModel(value))
  }
}

public object PlanDefinitionActionConditionSerializer :
  KSerializer<PlanDefinition.Action.Condition> {
  internal val surrogateSerializer: KSerializer<PlanDefinitionActionConditionSurrogate> by lazy {
    PlanDefinitionActionConditionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Condition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): PlanDefinition.Action.Condition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: PlanDefinition.Action.Condition) {
    surrogateSerializer.serialize(encoder, PlanDefinitionActionConditionSurrogate.fromModel(value))
  }
}

public object PlanDefinitionActionRelatedActionSerializer :
  KSerializer<PlanDefinition.Action.RelatedAction> {
  internal val surrogateSerializer:
    KSerializer<PlanDefinitionActionRelatedActionSurrogate> by lazy {
    PlanDefinitionActionRelatedActionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("RelatedAction", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): PlanDefinition.Action.RelatedAction =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: PlanDefinition.Action.RelatedAction) {
    surrogateSerializer.serialize(
      encoder,
      PlanDefinitionActionRelatedActionSurrogate.fromModel(value),
    )
  }
}

public object PlanDefinitionActionParticipantSerializer :
  KSerializer<PlanDefinition.Action.Participant> {
  internal val surrogateSerializer: KSerializer<PlanDefinitionActionParticipantSurrogate> by lazy {
    PlanDefinitionActionParticipantSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Participant", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): PlanDefinition.Action.Participant =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: PlanDefinition.Action.Participant) {
    surrogateSerializer.serialize(
      encoder,
      PlanDefinitionActionParticipantSurrogate.fromModel(value),
    )
  }
}

public object PlanDefinitionActionDynamicValueSerializer :
  KSerializer<PlanDefinition.Action.DynamicValue> {
  internal val surrogateSerializer: KSerializer<PlanDefinitionActionDynamicValueSurrogate> by lazy {
    PlanDefinitionActionDynamicValueSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DynamicValue", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): PlanDefinition.Action.DynamicValue =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: PlanDefinition.Action.DynamicValue) {
    surrogateSerializer.serialize(
      encoder,
      PlanDefinitionActionDynamicValueSurrogate.fromModel(value),
    )
  }
}

public object PlanDefinitionActionSerializer : KSerializer<PlanDefinition.Action> {
  internal val surrogateSerializer: KSerializer<PlanDefinitionActionSurrogate> by lazy {
    PlanDefinitionActionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Action", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): PlanDefinition.Action =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: PlanDefinition.Action) {
    surrogateSerializer.serialize(encoder, PlanDefinitionActionSurrogate.fromModel(value))
  }
}

public object PlanDefinitionSerializer : KSerializer<PlanDefinition> {
  internal val surrogateSerializer: KSerializer<PlanDefinitionSurrogate> by lazy {
    PlanDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("PlanDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): PlanDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: PlanDefinition) {
    surrogateSerializer.serialize(encoder, PlanDefinitionSurrogate.fromModel(value))
  }
}
