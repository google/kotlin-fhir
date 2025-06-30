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

import com.google.fhir.model.r5.AuditEvent
import com.google.fhir.model.r5.surrogates.AuditEventAgentSurrogate
import com.google.fhir.model.r5.surrogates.AuditEventEntityDetailSurrogate
import com.google.fhir.model.r5.surrogates.AuditEventEntitySurrogate
import com.google.fhir.model.r5.surrogates.AuditEventOutcomeSurrogate
import com.google.fhir.model.r5.surrogates.AuditEventSourceSurrogate
import com.google.fhir.model.r5.surrogates.AuditEventSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object AuditEventOutcomeSerializer : KSerializer<AuditEvent.Outcome> {
  internal val surrogateSerializer: KSerializer<AuditEventOutcomeSurrogate> by lazy {
    AuditEventOutcomeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Outcome", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AuditEvent.Outcome =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AuditEvent.Outcome) {
    surrogateSerializer.serialize(encoder, AuditEventOutcomeSurrogate.fromModel(value))
  }
}

public object AuditEventAgentSerializer : KSerializer<AuditEvent.Agent> {
  internal val surrogateSerializer: KSerializer<AuditEventAgentSurrogate> by lazy {
    AuditEventAgentSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Agent", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AuditEvent.Agent =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AuditEvent.Agent) {
    surrogateSerializer.serialize(encoder, AuditEventAgentSurrogate.fromModel(value))
  }
}

public object AuditEventSourceSerializer : KSerializer<AuditEvent.Source> {
  internal val surrogateSerializer: KSerializer<AuditEventSourceSurrogate> by lazy {
    AuditEventSourceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Source", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AuditEvent.Source =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AuditEvent.Source) {
    surrogateSerializer.serialize(encoder, AuditEventSourceSurrogate.fromModel(value))
  }
}

public object AuditEventEntityDetailSerializer : KSerializer<AuditEvent.Entity.Detail> {
  internal val surrogateSerializer: KSerializer<AuditEventEntityDetailSurrogate> by lazy {
    AuditEventEntityDetailSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Detail", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AuditEvent.Entity.Detail =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AuditEvent.Entity.Detail) {
    surrogateSerializer.serialize(encoder, AuditEventEntityDetailSurrogate.fromModel(value))
  }
}

public object AuditEventEntitySerializer : KSerializer<AuditEvent.Entity> {
  internal val surrogateSerializer: KSerializer<AuditEventEntitySurrogate> by lazy {
    AuditEventEntitySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Entity", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AuditEvent.Entity =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AuditEvent.Entity) {
    surrogateSerializer.serialize(encoder, AuditEventEntitySurrogate.fromModel(value))
  }
}

public object AuditEventSerializer : KSerializer<AuditEvent> {
  internal val surrogateSerializer: KSerializer<AuditEventSurrogate> by lazy {
    AuditEventSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("AuditEvent", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AuditEvent =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AuditEvent) {
    surrogateSerializer.serialize(encoder, AuditEventSurrogate.fromModel(value))
  }
}
