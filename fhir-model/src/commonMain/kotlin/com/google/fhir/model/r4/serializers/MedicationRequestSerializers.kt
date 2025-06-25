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

import com.google.fhir.model.r4.MedicationRequest
import com.google.fhir.model.r4.surrogates.MedicationRequestDispenseRequestInitialFillSurrogate
import com.google.fhir.model.r4.surrogates.MedicationRequestDispenseRequestSurrogate
import com.google.fhir.model.r4.surrogates.MedicationRequestSubstitutionSurrogate
import com.google.fhir.model.r4.surrogates.MedicationRequestSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object MedicationRequestDispenseRequestInitialFillSerializer :
  KSerializer<MedicationRequest.DispenseRequest.InitialFill> {
  internal val surrogateSerializer:
    KSerializer<MedicationRequestDispenseRequestInitialFillSurrogate> by lazy {
    MedicationRequestDispenseRequestInitialFillSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("InitialFill", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationRequest.DispenseRequest.InitialFill =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationRequest.DispenseRequest.InitialFill) {
    surrogateSerializer.serialize(
      encoder,
      MedicationRequestDispenseRequestInitialFillSurrogate.fromModel(value),
    )
  }
}

public object MedicationRequestDispenseRequestSerializer :
  KSerializer<MedicationRequest.DispenseRequest> {
  internal val surrogateSerializer: KSerializer<MedicationRequestDispenseRequestSurrogate> by lazy {
    MedicationRequestDispenseRequestSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DispenseRequest", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationRequest.DispenseRequest =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationRequest.DispenseRequest) {
    surrogateSerializer.serialize(
      encoder,
      MedicationRequestDispenseRequestSurrogate.fromModel(value),
    )
  }
}

public object MedicationRequestSubstitutionSerializer :
  KSerializer<MedicationRequest.Substitution> {
  internal val surrogateSerializer: KSerializer<MedicationRequestSubstitutionSurrogate> by lazy {
    MedicationRequestSubstitutionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Substitution", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationRequest.Substitution =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationRequest.Substitution) {
    surrogateSerializer.serialize(encoder, MedicationRequestSubstitutionSurrogate.fromModel(value))
  }
}

public object MedicationRequestSerializer : KSerializer<MedicationRequest> {
  internal val surrogateSerializer: KSerializer<MedicationRequestSurrogate> by lazy {
    MedicationRequestSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("MedicationRequest", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationRequest =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationRequest) {
    surrogateSerializer.serialize(encoder, MedicationRequestSurrogate.fromModel(value))
  }
}
