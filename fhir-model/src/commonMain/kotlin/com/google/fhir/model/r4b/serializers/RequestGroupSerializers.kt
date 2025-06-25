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

import com.google.fhir.model.r4b.RequestGroup
import com.google.fhir.model.r4b.surrogates.RequestGroupActionConditionSurrogate
import com.google.fhir.model.r4b.surrogates.RequestGroupActionRelatedActionSurrogate
import com.google.fhir.model.r4b.surrogates.RequestGroupActionSurrogate
import com.google.fhir.model.r4b.surrogates.RequestGroupSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object RequestGroupActionConditionSerializer : KSerializer<RequestGroup.Action.Condition> {
  internal val surrogateSerializer: KSerializer<RequestGroupActionConditionSurrogate> by lazy {
    RequestGroupActionConditionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Condition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): RequestGroup.Action.Condition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: RequestGroup.Action.Condition) {
    surrogateSerializer.serialize(encoder, RequestGroupActionConditionSurrogate.fromModel(value))
  }
}

public object RequestGroupActionRelatedActionSerializer :
  KSerializer<RequestGroup.Action.RelatedAction> {
  internal val surrogateSerializer: KSerializer<RequestGroupActionRelatedActionSurrogate> by lazy {
    RequestGroupActionRelatedActionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("RelatedAction", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): RequestGroup.Action.RelatedAction =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: RequestGroup.Action.RelatedAction) {
    surrogateSerializer.serialize(
      encoder,
      RequestGroupActionRelatedActionSurrogate.fromModel(value),
    )
  }
}

public object RequestGroupActionSerializer : KSerializer<RequestGroup.Action> {
  internal val surrogateSerializer: KSerializer<RequestGroupActionSurrogate> by lazy {
    RequestGroupActionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Action", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): RequestGroup.Action =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: RequestGroup.Action) {
    surrogateSerializer.serialize(encoder, RequestGroupActionSurrogate.fromModel(value))
  }
}

public object RequestGroupSerializer : KSerializer<RequestGroup> {
  internal val surrogateSerializer: KSerializer<RequestGroupSurrogate> by lazy {
    RequestGroupSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("RequestGroup", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): RequestGroup =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: RequestGroup) {
    surrogateSerializer.serialize(encoder, RequestGroupSurrogate.fromModel(value))
  }
}
