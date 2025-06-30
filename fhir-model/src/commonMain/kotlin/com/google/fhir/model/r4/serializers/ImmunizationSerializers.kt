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

import com.google.fhir.model.r4.Immunization
import com.google.fhir.model.r4.surrogates.ImmunizationEducationSurrogate
import com.google.fhir.model.r4.surrogates.ImmunizationPerformerSurrogate
import com.google.fhir.model.r4.surrogates.ImmunizationProtocolAppliedSurrogate
import com.google.fhir.model.r4.surrogates.ImmunizationReactionSurrogate
import com.google.fhir.model.r4.surrogates.ImmunizationSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ImmunizationPerformerSerializer : KSerializer<Immunization.Performer> {
  internal val surrogateSerializer: KSerializer<ImmunizationPerformerSurrogate> by lazy {
    ImmunizationPerformerSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Performer", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Immunization.Performer =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Immunization.Performer) {
    surrogateSerializer.serialize(encoder, ImmunizationPerformerSurrogate.fromModel(value))
  }
}

public object ImmunizationEducationSerializer : KSerializer<Immunization.Education> {
  internal val surrogateSerializer: KSerializer<ImmunizationEducationSurrogate> by lazy {
    ImmunizationEducationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Education", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Immunization.Education =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Immunization.Education) {
    surrogateSerializer.serialize(encoder, ImmunizationEducationSurrogate.fromModel(value))
  }
}

public object ImmunizationReactionSerializer : KSerializer<Immunization.Reaction> {
  internal val surrogateSerializer: KSerializer<ImmunizationReactionSurrogate> by lazy {
    ImmunizationReactionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Reaction", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Immunization.Reaction =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Immunization.Reaction) {
    surrogateSerializer.serialize(encoder, ImmunizationReactionSurrogate.fromModel(value))
  }
}

public object ImmunizationProtocolAppliedSerializer : KSerializer<Immunization.ProtocolApplied> {
  internal val surrogateSerializer: KSerializer<ImmunizationProtocolAppliedSurrogate> by lazy {
    ImmunizationProtocolAppliedSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ProtocolApplied", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Immunization.ProtocolApplied =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Immunization.ProtocolApplied) {
    surrogateSerializer.serialize(encoder, ImmunizationProtocolAppliedSurrogate.fromModel(value))
  }
}

public object ImmunizationSerializer : KSerializer<Immunization> {
  internal val surrogateSerializer: KSerializer<ImmunizationSurrogate> by lazy {
    ImmunizationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Immunization", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Immunization =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Immunization) {
    surrogateSerializer.serialize(encoder, ImmunizationSurrogate.fromModel(value))
  }
}
