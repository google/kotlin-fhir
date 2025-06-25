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

import com.google.fhir.model.r5.Requirements
import com.google.fhir.model.r5.surrogates.RequirementsStatementSurrogate
import com.google.fhir.model.r5.surrogates.RequirementsSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object RequirementsStatementSerializer : KSerializer<Requirements.Statement> {
  internal val surrogateSerializer: KSerializer<RequirementsStatementSurrogate> by lazy {
    RequirementsStatementSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Statement", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Requirements.Statement =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Requirements.Statement) {
    surrogateSerializer.serialize(encoder, RequirementsStatementSurrogate.fromModel(value))
  }
}

public object RequirementsSerializer : KSerializer<Requirements> {
  internal val surrogateSerializer: KSerializer<RequirementsSurrogate> by lazy {
    RequirementsSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Requirements", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Requirements =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Requirements) {
    surrogateSerializer.serialize(encoder, RequirementsSurrogate.fromModel(value))
  }
}
