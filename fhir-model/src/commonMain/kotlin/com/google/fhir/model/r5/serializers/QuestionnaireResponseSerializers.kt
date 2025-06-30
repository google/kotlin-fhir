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

import com.google.fhir.model.r5.QuestionnaireResponse
import com.google.fhir.model.r5.surrogates.QuestionnaireResponseItemAnswerSurrogate
import com.google.fhir.model.r5.surrogates.QuestionnaireResponseItemSurrogate
import com.google.fhir.model.r5.surrogates.QuestionnaireResponseSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object QuestionnaireResponseItemAnswerSerializer :
  KSerializer<QuestionnaireResponse.Item.Answer> {
  internal val surrogateSerializer: KSerializer<QuestionnaireResponseItemAnswerSurrogate> by lazy {
    QuestionnaireResponseItemAnswerSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Answer", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): QuestionnaireResponse.Item.Answer =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: QuestionnaireResponse.Item.Answer) {
    surrogateSerializer.serialize(
      encoder,
      QuestionnaireResponseItemAnswerSurrogate.fromModel(value),
    )
  }
}

public object QuestionnaireResponseItemSerializer : KSerializer<QuestionnaireResponse.Item> {
  internal val surrogateSerializer: KSerializer<QuestionnaireResponseItemSurrogate> by lazy {
    QuestionnaireResponseItemSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Item", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): QuestionnaireResponse.Item =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: QuestionnaireResponse.Item) {
    surrogateSerializer.serialize(encoder, QuestionnaireResponseItemSurrogate.fromModel(value))
  }
}

public object QuestionnaireResponseSerializer : KSerializer<QuestionnaireResponse> {
  internal val surrogateSerializer: KSerializer<QuestionnaireResponseSurrogate> by lazy {
    QuestionnaireResponseSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("QuestionnaireResponse", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): QuestionnaireResponse =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: QuestionnaireResponse) {
    surrogateSerializer.serialize(encoder, QuestionnaireResponseSurrogate.fromModel(value))
  }
}
