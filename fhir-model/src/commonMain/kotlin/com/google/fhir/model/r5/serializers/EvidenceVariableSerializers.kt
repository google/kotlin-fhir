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

import com.google.fhir.model.r5.EvidenceVariable
import com.google.fhir.model.r5.surrogates.EvidenceVariableCategorySurrogate
import com.google.fhir.model.r5.surrogates.EvidenceVariableCharacteristicDefinitionByCombinationSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceVariableCharacteristicSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceVariableCharacteristicTimeFromEventSurrogate
import com.google.fhir.model.r5.surrogates.EvidenceVariableSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object EvidenceVariableCharacteristicDefinitionByTypeAndValueSerializer :
  KSerializer<EvidenceVariable.Characteristic.DefinitionByTypeAndValue> {
  internal val surrogateSerializer:
    KSerializer<EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate> by lazy {
    EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DefinitionByTypeAndValue", surrogateSerializer.descriptor)
  }

  override fun deserialize(
    decoder: Decoder
  ): EvidenceVariable.Characteristic.DefinitionByTypeAndValue =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: EvidenceVariable.Characteristic.DefinitionByTypeAndValue,
  ) {
    surrogateSerializer.serialize(
      encoder,
      EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.fromModel(value),
    )
  }
}

public object EvidenceVariableCharacteristicDefinitionByCombinationSerializer :
  KSerializer<EvidenceVariable.Characteristic.DefinitionByCombination> {
  internal val surrogateSerializer:
    KSerializer<EvidenceVariableCharacteristicDefinitionByCombinationSurrogate> by lazy {
    EvidenceVariableCharacteristicDefinitionByCombinationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DefinitionByCombination", surrogateSerializer.descriptor)
  }

  override fun deserialize(
    decoder: Decoder
  ): EvidenceVariable.Characteristic.DefinitionByCombination =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: EvidenceVariable.Characteristic.DefinitionByCombination,
  ) {
    surrogateSerializer.serialize(
      encoder,
      EvidenceVariableCharacteristicDefinitionByCombinationSurrogate.fromModel(value),
    )
  }
}

public object EvidenceVariableCharacteristicTimeFromEventSerializer :
  KSerializer<EvidenceVariable.Characteristic.TimeFromEvent> {
  internal val surrogateSerializer:
    KSerializer<EvidenceVariableCharacteristicTimeFromEventSurrogate> by lazy {
    EvidenceVariableCharacteristicTimeFromEventSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("TimeFromEvent", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): EvidenceVariable.Characteristic.TimeFromEvent =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: EvidenceVariable.Characteristic.TimeFromEvent) {
    surrogateSerializer.serialize(
      encoder,
      EvidenceVariableCharacteristicTimeFromEventSurrogate.fromModel(value),
    )
  }
}

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

public object EvidenceVariableCategorySerializer : KSerializer<EvidenceVariable.Category> {
  internal val surrogateSerializer: KSerializer<EvidenceVariableCategorySurrogate> by lazy {
    EvidenceVariableCategorySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Category", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): EvidenceVariable.Category =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: EvidenceVariable.Category) {
    surrogateSerializer.serialize(encoder, EvidenceVariableCategorySurrogate.fromModel(value))
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
