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

import com.google.fhir.model.r5.ImplementationGuide
import com.google.fhir.model.r5.surrogates.ImplementationGuideDefinitionGroupingSurrogate
import com.google.fhir.model.r5.surrogates.ImplementationGuideDefinitionPageSurrogate
import com.google.fhir.model.r5.surrogates.ImplementationGuideDefinitionParameterSurrogate
import com.google.fhir.model.r5.surrogates.ImplementationGuideDefinitionResourceSurrogate
import com.google.fhir.model.r5.surrogates.ImplementationGuideDefinitionSurrogate
import com.google.fhir.model.r5.surrogates.ImplementationGuideDefinitionTemplateSurrogate
import com.google.fhir.model.r5.surrogates.ImplementationGuideDependsOnSurrogate
import com.google.fhir.model.r5.surrogates.ImplementationGuideGlobalSurrogate
import com.google.fhir.model.r5.surrogates.ImplementationGuideManifestPageSurrogate
import com.google.fhir.model.r5.surrogates.ImplementationGuideManifestResourceSurrogate
import com.google.fhir.model.r5.surrogates.ImplementationGuideManifestSurrogate
import com.google.fhir.model.r5.surrogates.ImplementationGuideSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object ImplementationGuideDependsOnSerializer : KSerializer<ImplementationGuide.DependsOn> {
  internal val surrogateSerializer: KSerializer<ImplementationGuideDependsOnSurrogate> by lazy {
    ImplementationGuideDependsOnSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DependsOn", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ImplementationGuide.DependsOn =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ImplementationGuide.DependsOn) {
    surrogateSerializer.serialize(encoder, ImplementationGuideDependsOnSurrogate.fromModel(value))
  }
}

public object ImplementationGuideGlobalSerializer : KSerializer<ImplementationGuide.Global> {
  internal val surrogateSerializer: KSerializer<ImplementationGuideGlobalSurrogate> by lazy {
    ImplementationGuideGlobalSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Global", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ImplementationGuide.Global =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ImplementationGuide.Global) {
    surrogateSerializer.serialize(encoder, ImplementationGuideGlobalSurrogate.fromModel(value))
  }
}

public object ImplementationGuideDefinitionGroupingSerializer :
  KSerializer<ImplementationGuide.Definition.Grouping> {
  internal val surrogateSerializer:
    KSerializer<ImplementationGuideDefinitionGroupingSurrogate> by lazy {
    ImplementationGuideDefinitionGroupingSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Grouping", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ImplementationGuide.Definition.Grouping =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ImplementationGuide.Definition.Grouping) {
    surrogateSerializer.serialize(
      encoder,
      ImplementationGuideDefinitionGroupingSurrogate.fromModel(value),
    )
  }
}

public object ImplementationGuideDefinitionResourceSerializer :
  KSerializer<ImplementationGuide.Definition.Resource> {
  internal val surrogateSerializer:
    KSerializer<ImplementationGuideDefinitionResourceSurrogate> by lazy {
    ImplementationGuideDefinitionResourceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Resource", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ImplementationGuide.Definition.Resource =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ImplementationGuide.Definition.Resource) {
    surrogateSerializer.serialize(
      encoder,
      ImplementationGuideDefinitionResourceSurrogate.fromModel(value),
    )
  }
}

public object ImplementationGuideDefinitionPageSerializer :
  KSerializer<ImplementationGuide.Definition.Page> {
  internal val surrogateSerializer:
    KSerializer<ImplementationGuideDefinitionPageSurrogate> by lazy {
    ImplementationGuideDefinitionPageSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Page", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ImplementationGuide.Definition.Page =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ImplementationGuide.Definition.Page) {
    surrogateSerializer.serialize(
      encoder,
      ImplementationGuideDefinitionPageSurrogate.fromModel(value),
    )
  }
}

public object ImplementationGuideDefinitionParameterSerializer :
  KSerializer<ImplementationGuide.Definition.Parameter> {
  internal val surrogateSerializer:
    KSerializer<ImplementationGuideDefinitionParameterSurrogate> by lazy {
    ImplementationGuideDefinitionParameterSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Parameter", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ImplementationGuide.Definition.Parameter =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ImplementationGuide.Definition.Parameter) {
    surrogateSerializer.serialize(
      encoder,
      ImplementationGuideDefinitionParameterSurrogate.fromModel(value),
    )
  }
}

public object ImplementationGuideDefinitionTemplateSerializer :
  KSerializer<ImplementationGuide.Definition.Template> {
  internal val surrogateSerializer:
    KSerializer<ImplementationGuideDefinitionTemplateSurrogate> by lazy {
    ImplementationGuideDefinitionTemplateSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Template", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ImplementationGuide.Definition.Template =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ImplementationGuide.Definition.Template) {
    surrogateSerializer.serialize(
      encoder,
      ImplementationGuideDefinitionTemplateSurrogate.fromModel(value),
    )
  }
}

public object ImplementationGuideDefinitionSerializer :
  KSerializer<ImplementationGuide.Definition> {
  internal val surrogateSerializer: KSerializer<ImplementationGuideDefinitionSurrogate> by lazy {
    ImplementationGuideDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Definition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ImplementationGuide.Definition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ImplementationGuide.Definition) {
    surrogateSerializer.serialize(encoder, ImplementationGuideDefinitionSurrogate.fromModel(value))
  }
}

public object ImplementationGuideManifestResourceSerializer :
  KSerializer<ImplementationGuide.Manifest.Resource> {
  internal val surrogateSerializer:
    KSerializer<ImplementationGuideManifestResourceSurrogate> by lazy {
    ImplementationGuideManifestResourceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Resource", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ImplementationGuide.Manifest.Resource =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ImplementationGuide.Manifest.Resource) {
    surrogateSerializer.serialize(
      encoder,
      ImplementationGuideManifestResourceSurrogate.fromModel(value),
    )
  }
}

public object ImplementationGuideManifestPageSerializer :
  KSerializer<ImplementationGuide.Manifest.Page> {
  internal val surrogateSerializer: KSerializer<ImplementationGuideManifestPageSurrogate> by lazy {
    ImplementationGuideManifestPageSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Page", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ImplementationGuide.Manifest.Page =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ImplementationGuide.Manifest.Page) {
    surrogateSerializer.serialize(
      encoder,
      ImplementationGuideManifestPageSurrogate.fromModel(value),
    )
  }
}

public object ImplementationGuideManifestSerializer : KSerializer<ImplementationGuide.Manifest> {
  internal val surrogateSerializer: KSerializer<ImplementationGuideManifestSurrogate> by lazy {
    ImplementationGuideManifestSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Manifest", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ImplementationGuide.Manifest =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ImplementationGuide.Manifest) {
    surrogateSerializer.serialize(encoder, ImplementationGuideManifestSurrogate.fromModel(value))
  }
}

public object ImplementationGuideSerializer : KSerializer<ImplementationGuide> {
  internal val surrogateSerializer: KSerializer<ImplementationGuideSurrogate> by lazy {
    ImplementationGuideSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ImplementationGuide", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): ImplementationGuide =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: ImplementationGuide) {
    surrogateSerializer.serialize(encoder, ImplementationGuideSurrogate.fromModel(value))
  }
}
