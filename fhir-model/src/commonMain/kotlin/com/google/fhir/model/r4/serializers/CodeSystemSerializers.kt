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

import com.google.fhir.model.r4.CodeSystem
import com.google.fhir.model.r4.surrogates.CodeSystemConceptDesignationSurrogate
import com.google.fhir.model.r4.surrogates.CodeSystemConceptPropertySurrogate
import com.google.fhir.model.r4.surrogates.CodeSystemConceptSurrogate
import com.google.fhir.model.r4.surrogates.CodeSystemFilterSurrogate
import com.google.fhir.model.r4.surrogates.CodeSystemPropertySurrogate
import com.google.fhir.model.r4.surrogates.CodeSystemSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object CodeSystemFilterSerializer : KSerializer<CodeSystem.Filter> {
  internal val surrogateSerializer: KSerializer<CodeSystemFilterSurrogate> by lazy {
    CodeSystemFilterSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Filter", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CodeSystem.Filter =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CodeSystem.Filter) {
    surrogateSerializer.serialize(encoder, CodeSystemFilterSurrogate.fromModel(value))
  }
}

public object CodeSystemPropertySerializer : KSerializer<CodeSystem.Property> {
  internal val surrogateSerializer: KSerializer<CodeSystemPropertySurrogate> by lazy {
    CodeSystemPropertySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Property", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CodeSystem.Property =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CodeSystem.Property) {
    surrogateSerializer.serialize(encoder, CodeSystemPropertySurrogate.fromModel(value))
  }
}

public object CodeSystemConceptDesignationSerializer : KSerializer<CodeSystem.Concept.Designation> {
  internal val surrogateSerializer: KSerializer<CodeSystemConceptDesignationSurrogate> by lazy {
    CodeSystemConceptDesignationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Designation", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CodeSystem.Concept.Designation =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CodeSystem.Concept.Designation) {
    surrogateSerializer.serialize(encoder, CodeSystemConceptDesignationSurrogate.fromModel(value))
  }
}

public object CodeSystemConceptPropertySerializer : KSerializer<CodeSystem.Concept.Property> {
  internal val surrogateSerializer: KSerializer<CodeSystemConceptPropertySurrogate> by lazy {
    CodeSystemConceptPropertySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Property", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CodeSystem.Concept.Property =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CodeSystem.Concept.Property) {
    surrogateSerializer.serialize(encoder, CodeSystemConceptPropertySurrogate.fromModel(value))
  }
}

public object CodeSystemConceptSerializer : KSerializer<CodeSystem.Concept> {
  internal val surrogateSerializer: KSerializer<CodeSystemConceptSurrogate> by lazy {
    CodeSystemConceptSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Concept", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CodeSystem.Concept =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CodeSystem.Concept) {
    surrogateSerializer.serialize(encoder, CodeSystemConceptSurrogate.fromModel(value))
  }
}

public object CodeSystemSerializer : KSerializer<CodeSystem> {
  internal val surrogateSerializer: KSerializer<CodeSystemSurrogate> by lazy {
    CodeSystemSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("CodeSystem", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): CodeSystem =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: CodeSystem) {
    surrogateSerializer.serialize(encoder, CodeSystemSurrogate.fromModel(value))
  }
}
