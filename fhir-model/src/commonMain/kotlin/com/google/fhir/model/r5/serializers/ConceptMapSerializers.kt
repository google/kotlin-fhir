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

import com.google.fhir.model.r5.ConceptMap
import com.google.fhir.model.r5.surrogates.ConceptMapAdditionalAttributeSurrogate
import com.google.fhir.model.r5.surrogates.ConceptMapGroupElementSurrogate
import com.google.fhir.model.r5.surrogates.ConceptMapGroupElementTargetDependsOnSurrogate
import com.google.fhir.model.r5.surrogates.ConceptMapGroupElementTargetPropertySurrogate
import com.google.fhir.model.r5.surrogates.ConceptMapGroupElementTargetSurrogate
import com.google.fhir.model.r5.surrogates.ConceptMapGroupSurrogate
import com.google.fhir.model.r5.surrogates.ConceptMapGroupUnmappedSurrogate
import com.google.fhir.model.r5.surrogates.ConceptMapPropertySurrogate
import com.google.fhir.model.r5.surrogates.ConceptMapSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ConceptMapPropertySerializer : KSerializer<ConceptMap.Property> {
  internal val surrogateSerializer: KSerializer<ConceptMapPropertySurrogate> by lazy {
    ConceptMapPropertySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Property", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ConceptMap.Property =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ConceptMap.Property) {
    surrogateSerializer.serialize(encoder, ConceptMapPropertySurrogate.fromModel(value))
  }
}

public object ConceptMapAdditionalAttributeSerializer :
  KSerializer<ConceptMap.AdditionalAttribute> {
  internal val surrogateSerializer: KSerializer<ConceptMapAdditionalAttributeSurrogate> by lazy {
    ConceptMapAdditionalAttributeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("AdditionalAttribute", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ConceptMap.AdditionalAttribute =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ConceptMap.AdditionalAttribute) {
    surrogateSerializer.serialize(encoder, ConceptMapAdditionalAttributeSurrogate.fromModel(value))
  }
}

public object ConceptMapGroupElementTargetPropertySerializer :
  KSerializer<ConceptMap.Group.Element.Target.Property> {
  internal val surrogateSerializer:
    KSerializer<ConceptMapGroupElementTargetPropertySurrogate> by lazy {
    ConceptMapGroupElementTargetPropertySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Property", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ConceptMap.Group.Element.Target.Property =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ConceptMap.Group.Element.Target.Property) {
    surrogateSerializer.serialize(
      encoder,
      ConceptMapGroupElementTargetPropertySurrogate.fromModel(value),
    )
  }
}

public object ConceptMapGroupElementTargetDependsOnSerializer :
  KSerializer<ConceptMap.Group.Element.Target.DependsOn> {
  internal val surrogateSerializer:
    KSerializer<ConceptMapGroupElementTargetDependsOnSurrogate> by lazy {
    ConceptMapGroupElementTargetDependsOnSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DependsOn", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ConceptMap.Group.Element.Target.DependsOn =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ConceptMap.Group.Element.Target.DependsOn) {
    surrogateSerializer.serialize(
      encoder,
      ConceptMapGroupElementTargetDependsOnSurrogate.fromModel(value),
    )
  }
}

public object ConceptMapGroupElementTargetSerializer :
  KSerializer<ConceptMap.Group.Element.Target> {
  internal val surrogateSerializer: KSerializer<ConceptMapGroupElementTargetSurrogate> by lazy {
    ConceptMapGroupElementTargetSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Target", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ConceptMap.Group.Element.Target =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ConceptMap.Group.Element.Target) {
    surrogateSerializer.serialize(encoder, ConceptMapGroupElementTargetSurrogate.fromModel(value))
  }
}

public object ConceptMapGroupElementSerializer : KSerializer<ConceptMap.Group.Element> {
  internal val surrogateSerializer: KSerializer<ConceptMapGroupElementSurrogate> by lazy {
    ConceptMapGroupElementSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Element", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ConceptMap.Group.Element =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ConceptMap.Group.Element) {
    surrogateSerializer.serialize(encoder, ConceptMapGroupElementSurrogate.fromModel(value))
  }
}

public object ConceptMapGroupUnmappedSerializer : KSerializer<ConceptMap.Group.Unmapped> {
  internal val surrogateSerializer: KSerializer<ConceptMapGroupUnmappedSurrogate> by lazy {
    ConceptMapGroupUnmappedSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Unmapped", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ConceptMap.Group.Unmapped =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ConceptMap.Group.Unmapped) {
    surrogateSerializer.serialize(encoder, ConceptMapGroupUnmappedSurrogate.fromModel(value))
  }
}

public object ConceptMapGroupSerializer : KSerializer<ConceptMap.Group> {
  internal val surrogateSerializer: KSerializer<ConceptMapGroupSurrogate> by lazy {
    ConceptMapGroupSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Group", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ConceptMap.Group =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ConceptMap.Group) {
    surrogateSerializer.serialize(encoder, ConceptMapGroupSurrogate.fromModel(value))
  }
}

public object ConceptMapSerializer : KSerializer<ConceptMap> {
  internal val surrogateSerializer: KSerializer<ConceptMapSurrogate> by lazy {
    ConceptMapSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ConceptMap", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ConceptMap =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ConceptMap) {
    surrogateSerializer.serialize(encoder, ConceptMapSurrogate.fromModel(value))
  }
}
