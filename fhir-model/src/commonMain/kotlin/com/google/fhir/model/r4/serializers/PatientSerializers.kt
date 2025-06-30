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

import com.google.fhir.model.r4.Patient
import com.google.fhir.model.r4.surrogates.PatientCommunicationSurrogate
import com.google.fhir.model.r4.surrogates.PatientContactSurrogate
import com.google.fhir.model.r4.surrogates.PatientLinkSurrogate
import com.google.fhir.model.r4.surrogates.PatientSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object PatientContactSerializer : KSerializer<Patient.Contact> {
  internal val surrogateSerializer: KSerializer<PatientContactSurrogate> by lazy {
    PatientContactSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Contact", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Patient.Contact =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Patient.Contact) {
    surrogateSerializer.serialize(encoder, PatientContactSurrogate.fromModel(value))
  }
}

public object PatientCommunicationSerializer : KSerializer<Patient.Communication> {
  internal val surrogateSerializer: KSerializer<PatientCommunicationSurrogate> by lazy {
    PatientCommunicationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Communication", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Patient.Communication =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Patient.Communication) {
    surrogateSerializer.serialize(encoder, PatientCommunicationSurrogate.fromModel(value))
  }
}

public object PatientLinkSerializer : KSerializer<Patient.Link> {
  internal val surrogateSerializer: KSerializer<PatientLinkSurrogate> by lazy {
    PatientLinkSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Link", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Patient.Link =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Patient.Link) {
    surrogateSerializer.serialize(encoder, PatientLinkSurrogate.fromModel(value))
  }
}

public object PatientSerializer : KSerializer<Patient> {
  internal val surrogateSerializer: KSerializer<PatientSurrogate> by lazy {
    PatientSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Patient", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Patient =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Patient) {
    surrogateSerializer.serialize(encoder, PatientSurrogate.fromModel(value))
  }
}
