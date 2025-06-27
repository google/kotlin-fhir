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

import com.google.fhir.model.r4b.Provenance
import com.google.fhir.model.r4b.surrogates.ProvenanceAgentSurrogate
import com.google.fhir.model.r4b.surrogates.ProvenanceEntitySurrogate
import com.google.fhir.model.r4b.surrogates.ProvenanceSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ProvenanceAgentSerializer : KSerializer<Provenance.Agent> {
  internal val surrogateSerializer: KSerializer<ProvenanceAgentSurrogate> by lazy {
    ProvenanceAgentSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Agent", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Provenance.Agent =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Provenance.Agent) {
    surrogateSerializer.serialize(encoder, ProvenanceAgentSurrogate.fromModel(value))
  }
}

public object ProvenanceEntitySerializer : KSerializer<Provenance.Entity> {
  internal val surrogateSerializer: KSerializer<ProvenanceEntitySurrogate> by lazy {
    ProvenanceEntitySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Entity", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Provenance.Entity =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Provenance.Entity) {
    surrogateSerializer.serialize(encoder, ProvenanceEntitySurrogate.fromModel(value))
  }
}

public object ProvenanceSerializer : KSerializer<Provenance> {
  internal val surrogateSerializer: KSerializer<ProvenanceSurrogate> by lazy {
    ProvenanceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Provenance", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Provenance =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Provenance) {
    surrogateSerializer.serialize(encoder, ProvenanceSurrogate.fromModel(value))
  }
}
