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

import com.google.fhir.model.r4b.Parameters
import com.google.fhir.model.r4b.surrogates.ParametersParameterSurrogate
import com.google.fhir.model.r4b.surrogates.ParametersSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ParametersParameterSerializer : KSerializer<Parameters.Parameter> {
  internal val surrogateSerializer: KSerializer<ParametersParameterSurrogate> by lazy {
    ParametersParameterSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Parameter", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Parameters.Parameter =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Parameters.Parameter) {
    surrogateSerializer.serialize(encoder, ParametersParameterSurrogate.fromModel(value))
  }
}

public object ParametersSerializer : KSerializer<Parameters> {
  internal val surrogateSerializer: KSerializer<ParametersSurrogate> by lazy {
    ParametersSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Parameters", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Parameters =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Parameters) {
    surrogateSerializer.serialize(encoder, ParametersSurrogate.fromModel(value))
  }
}
