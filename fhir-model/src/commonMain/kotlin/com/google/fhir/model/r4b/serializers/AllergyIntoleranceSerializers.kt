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

import com.google.fhir.model.r4b.AllergyIntolerance
import com.google.fhir.model.r4b.surrogates.AllergyIntoleranceReactionSurrogate
import com.google.fhir.model.r4b.surrogates.AllergyIntoleranceSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object AllergyIntoleranceReactionSerializer : KSerializer<AllergyIntolerance.Reaction> {
  internal val surrogateSerializer: KSerializer<AllergyIntoleranceReactionSurrogate> by lazy {
    AllergyIntoleranceReactionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Reaction", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AllergyIntolerance.Reaction =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AllergyIntolerance.Reaction) {
    surrogateSerializer.serialize(encoder, AllergyIntoleranceReactionSurrogate.fromModel(value))
  }
}

public object AllergyIntoleranceSerializer : KSerializer<AllergyIntolerance> {
  internal val surrogateSerializer: KSerializer<AllergyIntoleranceSurrogate> by lazy {
    AllergyIntoleranceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("AllergyIntolerance", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AllergyIntolerance =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AllergyIntolerance) {
    surrogateSerializer.serialize(encoder, AllergyIntoleranceSurrogate.fromModel(value))
  }
}
