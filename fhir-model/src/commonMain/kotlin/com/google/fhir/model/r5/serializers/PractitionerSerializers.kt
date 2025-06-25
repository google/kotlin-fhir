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

import com.google.fhir.model.r5.Practitioner
import com.google.fhir.model.r5.surrogates.PractitionerCommunicationSurrogate
import com.google.fhir.model.r5.surrogates.PractitionerQualificationSurrogate
import com.google.fhir.model.r5.surrogates.PractitionerSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object PractitionerQualificationSerializer : KSerializer<Practitioner.Qualification> {
  internal val surrogateSerializer: KSerializer<PractitionerQualificationSurrogate> by lazy {
    PractitionerQualificationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Qualification", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Practitioner.Qualification =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Practitioner.Qualification) {
    surrogateSerializer.serialize(encoder, PractitionerQualificationSurrogate.fromModel(value))
  }
}

public object PractitionerCommunicationSerializer : KSerializer<Practitioner.Communication> {
  internal val surrogateSerializer: KSerializer<PractitionerCommunicationSurrogate> by lazy {
    PractitionerCommunicationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Communication", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Practitioner.Communication =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Practitioner.Communication) {
    surrogateSerializer.serialize(encoder, PractitionerCommunicationSurrogate.fromModel(value))
  }
}

public object PractitionerSerializer : KSerializer<Practitioner> {
  internal val surrogateSerializer: KSerializer<PractitionerSurrogate> by lazy {
    PractitionerSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Practitioner", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Practitioner =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Practitioner) {
    surrogateSerializer.serialize(encoder, PractitionerSurrogate.fromModel(value))
  }
}
