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

import com.google.fhir.model.r4b.Questionnaire
import com.google.fhir.model.r4b.surrogates.QuestionnaireItemAnswerOptionSurrogate
import com.google.fhir.model.r4b.surrogates.QuestionnaireItemEnableWhenSurrogate
import com.google.fhir.model.r4b.surrogates.QuestionnaireItemInitialSurrogate
import com.google.fhir.model.r4b.surrogates.QuestionnaireItemSurrogate
import com.google.fhir.model.r4b.surrogates.QuestionnaireSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object QuestionnaireItemEnableWhenSerializer : KSerializer<Questionnaire.Item.EnableWhen> {
  internal val surrogateSerializer: KSerializer<QuestionnaireItemEnableWhenSurrogate> by lazy {
    QuestionnaireItemEnableWhenSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("EnableWhen", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Questionnaire.Item.EnableWhen =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Questionnaire.Item.EnableWhen) {
    surrogateSerializer.serialize(encoder, QuestionnaireItemEnableWhenSurrogate.fromModel(value))
  }
}

public object QuestionnaireItemAnswerOptionSerializer :
  KSerializer<Questionnaire.Item.AnswerOption> {
  internal val surrogateSerializer: KSerializer<QuestionnaireItemAnswerOptionSurrogate> by lazy {
    QuestionnaireItemAnswerOptionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("AnswerOption", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Questionnaire.Item.AnswerOption =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Questionnaire.Item.AnswerOption) {
    surrogateSerializer.serialize(encoder, QuestionnaireItemAnswerOptionSurrogate.fromModel(value))
  }
}

public object QuestionnaireItemInitialSerializer : KSerializer<Questionnaire.Item.Initial> {
  internal val surrogateSerializer: KSerializer<QuestionnaireItemInitialSurrogate> by lazy {
    QuestionnaireItemInitialSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Initial", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Questionnaire.Item.Initial =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Questionnaire.Item.Initial) {
    surrogateSerializer.serialize(encoder, QuestionnaireItemInitialSurrogate.fromModel(value))
  }
}

public object QuestionnaireItemSerializer : KSerializer<Questionnaire.Item> {
  internal val surrogateSerializer: KSerializer<QuestionnaireItemSurrogate> by lazy {
    QuestionnaireItemSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Item", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Questionnaire.Item =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Questionnaire.Item) {
    surrogateSerializer.serialize(encoder, QuestionnaireItemSurrogate.fromModel(value))
  }
}

public object QuestionnaireSerializer : KSerializer<Questionnaire> {
  internal val surrogateSerializer: KSerializer<QuestionnaireSurrogate> by lazy {
    QuestionnaireSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Questionnaire", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Questionnaire =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Questionnaire) {
    surrogateSerializer.serialize(encoder, QuestionnaireSurrogate.fromModel(value))
  }
}
