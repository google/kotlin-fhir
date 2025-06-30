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

import com.google.fhir.model.r5.ConditionDefinition
import com.google.fhir.model.r5.surrogates.ConditionDefinitionMedicationSurrogate
import com.google.fhir.model.r5.surrogates.ConditionDefinitionObservationSurrogate
import com.google.fhir.model.r5.surrogates.ConditionDefinitionPlanSurrogate
import com.google.fhir.model.r5.surrogates.ConditionDefinitionPreconditionSurrogate
import com.google.fhir.model.r5.surrogates.ConditionDefinitionQuestionnaireSurrogate
import com.google.fhir.model.r5.surrogates.ConditionDefinitionSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ConditionDefinitionObservationSerializer :
  KSerializer<ConditionDefinition.Observation> {
  internal val surrogateSerializer: KSerializer<ConditionDefinitionObservationSurrogate> by lazy {
    ConditionDefinitionObservationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Observation", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ConditionDefinition.Observation =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ConditionDefinition.Observation) {
    surrogateSerializer.serialize(encoder, ConditionDefinitionObservationSurrogate.fromModel(value))
  }
}

public object ConditionDefinitionMedicationSerializer :
  KSerializer<ConditionDefinition.Medication> {
  internal val surrogateSerializer: KSerializer<ConditionDefinitionMedicationSurrogate> by lazy {
    ConditionDefinitionMedicationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Medication", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ConditionDefinition.Medication =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ConditionDefinition.Medication) {
    surrogateSerializer.serialize(encoder, ConditionDefinitionMedicationSurrogate.fromModel(value))
  }
}

public object ConditionDefinitionPreconditionSerializer :
  KSerializer<ConditionDefinition.Precondition> {
  internal val surrogateSerializer: KSerializer<ConditionDefinitionPreconditionSurrogate> by lazy {
    ConditionDefinitionPreconditionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Precondition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ConditionDefinition.Precondition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ConditionDefinition.Precondition) {
    surrogateSerializer.serialize(
      encoder,
      ConditionDefinitionPreconditionSurrogate.fromModel(value),
    )
  }
}

public object ConditionDefinitionQuestionnaireSerializer :
  KSerializer<ConditionDefinition.Questionnaire> {
  internal val surrogateSerializer: KSerializer<ConditionDefinitionQuestionnaireSurrogate> by lazy {
    ConditionDefinitionQuestionnaireSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Questionnaire", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ConditionDefinition.Questionnaire =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ConditionDefinition.Questionnaire) {
    surrogateSerializer.serialize(
      encoder,
      ConditionDefinitionQuestionnaireSurrogate.fromModel(value),
    )
  }
}

public object ConditionDefinitionPlanSerializer : KSerializer<ConditionDefinition.Plan> {
  internal val surrogateSerializer: KSerializer<ConditionDefinitionPlanSurrogate> by lazy {
    ConditionDefinitionPlanSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Plan", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ConditionDefinition.Plan =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ConditionDefinition.Plan) {
    surrogateSerializer.serialize(encoder, ConditionDefinitionPlanSurrogate.fromModel(value))
  }
}

public object ConditionDefinitionSerializer : KSerializer<ConditionDefinition> {
  internal val surrogateSerializer: KSerializer<ConditionDefinitionSurrogate> by lazy {
    ConditionDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ConditionDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ConditionDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ConditionDefinition) {
    surrogateSerializer.serialize(encoder, ConditionDefinitionSurrogate.fromModel(value))
  }
}
