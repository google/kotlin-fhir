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

import com.google.fhir.model.r4b.ElementDefinition
import com.google.fhir.model.r4b.surrogates.ElementDefinitionBaseSurrogate
import com.google.fhir.model.r4b.surrogates.ElementDefinitionBindingSurrogate
import com.google.fhir.model.r4b.surrogates.ElementDefinitionConstraintSurrogate
import com.google.fhir.model.r4b.surrogates.ElementDefinitionExampleSurrogate
import com.google.fhir.model.r4b.surrogates.ElementDefinitionMappingSurrogate
import com.google.fhir.model.r4b.surrogates.ElementDefinitionSlicingDiscriminatorSurrogate
import com.google.fhir.model.r4b.surrogates.ElementDefinitionSlicingSurrogate
import com.google.fhir.model.r4b.surrogates.ElementDefinitionSurrogate
import com.google.fhir.model.r4b.surrogates.ElementDefinitionTypeSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ElementDefinitionSlicingDiscriminatorSerializer :
  KSerializer<ElementDefinition.Slicing.Discriminator> {
  internal val surrogateSerializer:
    KSerializer<ElementDefinitionSlicingDiscriminatorSurrogate> by lazy {
    ElementDefinitionSlicingDiscriminatorSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Discriminator", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ElementDefinition.Slicing.Discriminator =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ElementDefinition.Slicing.Discriminator) {
    surrogateSerializer.serialize(
      encoder,
      ElementDefinitionSlicingDiscriminatorSurrogate.fromModel(value),
    )
  }
}

public object ElementDefinitionSlicingSerializer : KSerializer<ElementDefinition.Slicing> {
  internal val surrogateSerializer: KSerializer<ElementDefinitionSlicingSurrogate> by lazy {
    ElementDefinitionSlicingSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Slicing", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ElementDefinition.Slicing =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ElementDefinition.Slicing) {
    surrogateSerializer.serialize(encoder, ElementDefinitionSlicingSurrogate.fromModel(value))
  }
}

public object ElementDefinitionBaseSerializer : KSerializer<ElementDefinition.Base> {
  internal val surrogateSerializer: KSerializer<ElementDefinitionBaseSurrogate> by lazy {
    ElementDefinitionBaseSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Base", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ElementDefinition.Base =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ElementDefinition.Base) {
    surrogateSerializer.serialize(encoder, ElementDefinitionBaseSurrogate.fromModel(value))
  }
}

public object ElementDefinitionTypeSerializer : KSerializer<ElementDefinition.Type> {
  internal val surrogateSerializer: KSerializer<ElementDefinitionTypeSurrogate> by lazy {
    ElementDefinitionTypeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Type", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ElementDefinition.Type =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ElementDefinition.Type) {
    surrogateSerializer.serialize(encoder, ElementDefinitionTypeSurrogate.fromModel(value))
  }
}

public object ElementDefinitionExampleSerializer : KSerializer<ElementDefinition.Example> {
  internal val surrogateSerializer: KSerializer<ElementDefinitionExampleSurrogate> by lazy {
    ElementDefinitionExampleSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Example", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ElementDefinition.Example =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ElementDefinition.Example) {
    surrogateSerializer.serialize(encoder, ElementDefinitionExampleSurrogate.fromModel(value))
  }
}

public object ElementDefinitionConstraintSerializer : KSerializer<ElementDefinition.Constraint> {
  internal val surrogateSerializer: KSerializer<ElementDefinitionConstraintSurrogate> by lazy {
    ElementDefinitionConstraintSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Constraint", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ElementDefinition.Constraint =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ElementDefinition.Constraint) {
    surrogateSerializer.serialize(encoder, ElementDefinitionConstraintSurrogate.fromModel(value))
  }
}

public object ElementDefinitionBindingSerializer : KSerializer<ElementDefinition.Binding> {
  internal val surrogateSerializer: KSerializer<ElementDefinitionBindingSurrogate> by lazy {
    ElementDefinitionBindingSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Binding", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ElementDefinition.Binding =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ElementDefinition.Binding) {
    surrogateSerializer.serialize(encoder, ElementDefinitionBindingSurrogate.fromModel(value))
  }
}

public object ElementDefinitionMappingSerializer : KSerializer<ElementDefinition.Mapping> {
  internal val surrogateSerializer: KSerializer<ElementDefinitionMappingSurrogate> by lazy {
    ElementDefinitionMappingSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Mapping", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ElementDefinition.Mapping =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ElementDefinition.Mapping) {
    surrogateSerializer.serialize(encoder, ElementDefinitionMappingSurrogate.fromModel(value))
  }
}

public object ElementDefinitionSerializer : KSerializer<ElementDefinition> {
  internal val surrogateSerializer: KSerializer<ElementDefinitionSurrogate> by lazy {
    ElementDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ElementDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ElementDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ElementDefinition) {
    surrogateSerializer.serialize(encoder, ElementDefinitionSurrogate.fromModel(value))
  }
}
