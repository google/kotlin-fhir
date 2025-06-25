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

import com.google.fhir.model.r4.SpecimenDefinition
import com.google.fhir.model.r4.surrogates.SpecimenDefinitionSurrogate
import com.google.fhir.model.r4.surrogates.SpecimenDefinitionTypeTestedContainerAdditiveSurrogate
import com.google.fhir.model.r4.surrogates.SpecimenDefinitionTypeTestedContainerSurrogate
import com.google.fhir.model.r4.surrogates.SpecimenDefinitionTypeTestedHandlingSurrogate
import com.google.fhir.model.r4.surrogates.SpecimenDefinitionTypeTestedSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object SpecimenDefinitionTypeTestedContainerAdditiveSerializer :
  KSerializer<SpecimenDefinition.TypeTested.Container.Additive> {
  internal val surrogateSerializer:
    KSerializer<SpecimenDefinitionTypeTestedContainerAdditiveSurrogate> by lazy {
    SpecimenDefinitionTypeTestedContainerAdditiveSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Additive", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SpecimenDefinition.TypeTested.Container.Additive =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: SpecimenDefinition.TypeTested.Container.Additive,
  ) {
    surrogateSerializer.serialize(
      encoder,
      SpecimenDefinitionTypeTestedContainerAdditiveSurrogate.fromModel(value),
    )
  }
}

public object SpecimenDefinitionTypeTestedContainerSerializer :
  KSerializer<SpecimenDefinition.TypeTested.Container> {
  internal val surrogateSerializer:
    KSerializer<SpecimenDefinitionTypeTestedContainerSurrogate> by lazy {
    SpecimenDefinitionTypeTestedContainerSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Container", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SpecimenDefinition.TypeTested.Container =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SpecimenDefinition.TypeTested.Container) {
    surrogateSerializer.serialize(
      encoder,
      SpecimenDefinitionTypeTestedContainerSurrogate.fromModel(value),
    )
  }
}

public object SpecimenDefinitionTypeTestedHandlingSerializer :
  KSerializer<SpecimenDefinition.TypeTested.Handling> {
  internal val surrogateSerializer:
    KSerializer<SpecimenDefinitionTypeTestedHandlingSurrogate> by lazy {
    SpecimenDefinitionTypeTestedHandlingSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Handling", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SpecimenDefinition.TypeTested.Handling =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SpecimenDefinition.TypeTested.Handling) {
    surrogateSerializer.serialize(
      encoder,
      SpecimenDefinitionTypeTestedHandlingSurrogate.fromModel(value),
    )
  }
}

public object SpecimenDefinitionTypeTestedSerializer : KSerializer<SpecimenDefinition.TypeTested> {
  internal val surrogateSerializer: KSerializer<SpecimenDefinitionTypeTestedSurrogate> by lazy {
    SpecimenDefinitionTypeTestedSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("TypeTested", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SpecimenDefinition.TypeTested =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SpecimenDefinition.TypeTested) {
    surrogateSerializer.serialize(encoder, SpecimenDefinitionTypeTestedSurrogate.fromModel(value))
  }
}

public object SpecimenDefinitionSerializer : KSerializer<SpecimenDefinition> {
  internal val surrogateSerializer: KSerializer<SpecimenDefinitionSurrogate> by lazy {
    SpecimenDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SpecimenDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SpecimenDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SpecimenDefinition) {
    surrogateSerializer.serialize(encoder, SpecimenDefinitionSurrogate.fromModel(value))
  }
}
