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

import com.google.fhir.model.r4b.MedicationAdministration
import com.google.fhir.model.r4b.surrogates.MedicationAdministrationDosageSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationAdministrationPerformerSurrogate
import com.google.fhir.model.r4b.surrogates.MedicationAdministrationSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object MedicationAdministrationPerformerSerializer :
  KSerializer<MedicationAdministration.Performer> {
  internal val surrogateSerializer:
    KSerializer<MedicationAdministrationPerformerSurrogate> by lazy {
    MedicationAdministrationPerformerSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Performer", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationAdministration.Performer =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationAdministration.Performer) {
    surrogateSerializer.serialize(
      encoder,
      MedicationAdministrationPerformerSurrogate.fromModel(value),
    )
  }
}

public object MedicationAdministrationDosageSerializer :
  KSerializer<MedicationAdministration.Dosage> {
  internal val surrogateSerializer: KSerializer<MedicationAdministrationDosageSurrogate> by lazy {
    MedicationAdministrationDosageSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Dosage", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationAdministration.Dosage =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationAdministration.Dosage) {
    surrogateSerializer.serialize(encoder, MedicationAdministrationDosageSurrogate.fromModel(value))
  }
}

public object MedicationAdministrationSerializer : KSerializer<MedicationAdministration> {
  internal val surrogateSerializer: KSerializer<MedicationAdministrationSurrogate> by lazy {
    MedicationAdministrationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("MedicationAdministration", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicationAdministration =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicationAdministration) {
    surrogateSerializer.serialize(encoder, MedicationAdministrationSurrogate.fromModel(value))
  }
}
