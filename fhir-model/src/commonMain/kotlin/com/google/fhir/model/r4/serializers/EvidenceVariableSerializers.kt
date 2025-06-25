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

package com.google.fhir.model.r4.serializers

import com.google.fhir.model.r4.EvidenceVariable
import com.google.fhir.model.r4.surrogates.EvidenceVariableCharacteristicSurrogate
import com.google.fhir.model.r4.surrogates.EvidenceVariableSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object EvidenceVariableCharacteristicSerializer :
  KSerializer<EvidenceVariable.Characteristic> {
  internal val surrogateSerializer: KSerializer<EvidenceVariableCharacteristicSurrogate> by lazy {
    EvidenceVariableCharacteristicSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Characteristic", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): EvidenceVariable.Characteristic =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: EvidenceVariable.Characteristic) {
    surrogateSerializer.serialize(encoder, EvidenceVariableCharacteristicSurrogate.fromModel(value))
  }
}

public object EvidenceVariableSerializer : KSerializer<EvidenceVariable> {
  internal val surrogateSerializer: KSerializer<EvidenceVariableSurrogate> by lazy {
    EvidenceVariableSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("EvidenceVariable", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): EvidenceVariable =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: EvidenceVariable) {
    surrogateSerializer.serialize(encoder, EvidenceVariableSurrogate.fromModel(value))
  }
}
