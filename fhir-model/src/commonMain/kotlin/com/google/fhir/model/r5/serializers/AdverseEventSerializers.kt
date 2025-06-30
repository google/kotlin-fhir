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

import com.google.fhir.model.r5.AdverseEvent
import com.google.fhir.model.r5.surrogates.AdverseEventContributingFactorSurrogate
import com.google.fhir.model.r5.surrogates.AdverseEventMitigatingActionSurrogate
import com.google.fhir.model.r5.surrogates.AdverseEventParticipantSurrogate
import com.google.fhir.model.r5.surrogates.AdverseEventPreventiveActionSurrogate
import com.google.fhir.model.r5.surrogates.AdverseEventSupportingInfoSurrogate
import com.google.fhir.model.r5.surrogates.AdverseEventSurrogate
import com.google.fhir.model.r5.surrogates.AdverseEventSuspectEntityCausalitySurrogate
import com.google.fhir.model.r5.surrogates.AdverseEventSuspectEntitySurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object AdverseEventParticipantSerializer : KSerializer<AdverseEvent.Participant> {
  internal val surrogateSerializer: KSerializer<AdverseEventParticipantSurrogate> by lazy {
    AdverseEventParticipantSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Participant", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AdverseEvent.Participant =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AdverseEvent.Participant) {
    surrogateSerializer.serialize(encoder, AdverseEventParticipantSurrogate.fromModel(value))
  }
}

public object AdverseEventSuspectEntityCausalitySerializer :
  KSerializer<AdverseEvent.SuspectEntity.Causality> {
  internal val surrogateSerializer:
    KSerializer<AdverseEventSuspectEntityCausalitySurrogate> by lazy {
    AdverseEventSuspectEntityCausalitySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Causality", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AdverseEvent.SuspectEntity.Causality =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AdverseEvent.SuspectEntity.Causality) {
    surrogateSerializer.serialize(
      encoder,
      AdverseEventSuspectEntityCausalitySurrogate.fromModel(value),
    )
  }
}

public object AdverseEventSuspectEntitySerializer : KSerializer<AdverseEvent.SuspectEntity> {
  internal val surrogateSerializer: KSerializer<AdverseEventSuspectEntitySurrogate> by lazy {
    AdverseEventSuspectEntitySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SuspectEntity", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AdverseEvent.SuspectEntity =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AdverseEvent.SuspectEntity) {
    surrogateSerializer.serialize(encoder, AdverseEventSuspectEntitySurrogate.fromModel(value))
  }
}

public object AdverseEventContributingFactorSerializer :
  KSerializer<AdverseEvent.ContributingFactor> {
  internal val surrogateSerializer: KSerializer<AdverseEventContributingFactorSurrogate> by lazy {
    AdverseEventContributingFactorSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ContributingFactor", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AdverseEvent.ContributingFactor =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AdverseEvent.ContributingFactor) {
    surrogateSerializer.serialize(encoder, AdverseEventContributingFactorSurrogate.fromModel(value))
  }
}

public object AdverseEventPreventiveActionSerializer : KSerializer<AdverseEvent.PreventiveAction> {
  internal val surrogateSerializer: KSerializer<AdverseEventPreventiveActionSurrogate> by lazy {
    AdverseEventPreventiveActionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("PreventiveAction", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AdverseEvent.PreventiveAction =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AdverseEvent.PreventiveAction) {
    surrogateSerializer.serialize(encoder, AdverseEventPreventiveActionSurrogate.fromModel(value))
  }
}

public object AdverseEventMitigatingActionSerializer : KSerializer<AdverseEvent.MitigatingAction> {
  internal val surrogateSerializer: KSerializer<AdverseEventMitigatingActionSurrogate> by lazy {
    AdverseEventMitigatingActionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("MitigatingAction", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AdverseEvent.MitigatingAction =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AdverseEvent.MitigatingAction) {
    surrogateSerializer.serialize(encoder, AdverseEventMitigatingActionSurrogate.fromModel(value))
  }
}

public object AdverseEventSupportingInfoSerializer : KSerializer<AdverseEvent.SupportingInfo> {
  internal val surrogateSerializer: KSerializer<AdverseEventSupportingInfoSurrogate> by lazy {
    AdverseEventSupportingInfoSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SupportingInfo", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AdverseEvent.SupportingInfo =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AdverseEvent.SupportingInfo) {
    surrogateSerializer.serialize(encoder, AdverseEventSupportingInfoSurrogate.fromModel(value))
  }
}

public object AdverseEventSerializer : KSerializer<AdverseEvent> {
  internal val surrogateSerializer: KSerializer<AdverseEventSurrogate> by lazy {
    AdverseEventSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("AdverseEvent", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): AdverseEvent =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: AdverseEvent) {
    surrogateSerializer.serialize(encoder, AdverseEventSurrogate.fromModel(value))
  }
}
