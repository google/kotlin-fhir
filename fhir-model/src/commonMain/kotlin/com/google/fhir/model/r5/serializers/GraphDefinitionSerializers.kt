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

import com.google.fhir.model.r5.GraphDefinition
import com.google.fhir.model.r5.surrogates.GraphDefinitionLinkCompartmentSurrogate
import com.google.fhir.model.r5.surrogates.GraphDefinitionLinkSurrogate
import com.google.fhir.model.r5.surrogates.GraphDefinitionNodeSurrogate
import com.google.fhir.model.r5.surrogates.GraphDefinitionSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object GraphDefinitionNodeSerializer : KSerializer<GraphDefinition.Node> {
  internal val surrogateSerializer: KSerializer<GraphDefinitionNodeSurrogate> by lazy {
    GraphDefinitionNodeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Node", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): GraphDefinition.Node =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: GraphDefinition.Node) {
    surrogateSerializer.serialize(encoder, GraphDefinitionNodeSurrogate.fromModel(value))
  }
}

public object GraphDefinitionLinkCompartmentSerializer :
  KSerializer<GraphDefinition.Link.Compartment> {
  internal val surrogateSerializer: KSerializer<GraphDefinitionLinkCompartmentSurrogate> by lazy {
    GraphDefinitionLinkCompartmentSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Compartment", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): GraphDefinition.Link.Compartment =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: GraphDefinition.Link.Compartment) {
    surrogateSerializer.serialize(encoder, GraphDefinitionLinkCompartmentSurrogate.fromModel(value))
  }
}

public object GraphDefinitionLinkSerializer : KSerializer<GraphDefinition.Link> {
  internal val surrogateSerializer: KSerializer<GraphDefinitionLinkSurrogate> by lazy {
    GraphDefinitionLinkSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Link", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): GraphDefinition.Link =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: GraphDefinition.Link) {
    surrogateSerializer.serialize(encoder, GraphDefinitionLinkSurrogate.fromModel(value))
  }
}

public object GraphDefinitionSerializer : KSerializer<GraphDefinition> {
  internal val surrogateSerializer: KSerializer<GraphDefinitionSurrogate> by lazy {
    GraphDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("GraphDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): GraphDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: GraphDefinition) {
    surrogateSerializer.serialize(encoder, GraphDefinitionSurrogate.fromModel(value))
  }
}
