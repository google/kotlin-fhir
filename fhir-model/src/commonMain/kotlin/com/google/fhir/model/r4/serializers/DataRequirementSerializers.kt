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

import com.google.fhir.model.r4.DataRequirement
import com.google.fhir.model.r4.surrogates.DataRequirementCodeFilterSurrogate
import com.google.fhir.model.r4.surrogates.DataRequirementDateFilterSurrogate
import com.google.fhir.model.r4.surrogates.DataRequirementSortSurrogate
import com.google.fhir.model.r4.surrogates.DataRequirementSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object DataRequirementCodeFilterSerializer : KSerializer<DataRequirement.CodeFilter> {
  internal val surrogateSerializer: KSerializer<DataRequirementCodeFilterSurrogate> by lazy {
    DataRequirementCodeFilterSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("CodeFilter", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DataRequirement.CodeFilter =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DataRequirement.CodeFilter) {
    surrogateSerializer.serialize(encoder, DataRequirementCodeFilterSurrogate.fromModel(value))
  }
}

public object DataRequirementDateFilterSerializer : KSerializer<DataRequirement.DateFilter> {
  internal val surrogateSerializer: KSerializer<DataRequirementDateFilterSurrogate> by lazy {
    DataRequirementDateFilterSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DateFilter", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DataRequirement.DateFilter =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DataRequirement.DateFilter) {
    surrogateSerializer.serialize(encoder, DataRequirementDateFilterSurrogate.fromModel(value))
  }
}

public object DataRequirementSortSerializer : KSerializer<DataRequirement.Sort> {
  internal val surrogateSerializer: KSerializer<DataRequirementSortSurrogate> by lazy {
    DataRequirementSortSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Sort", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DataRequirement.Sort =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DataRequirement.Sort) {
    surrogateSerializer.serialize(encoder, DataRequirementSortSurrogate.fromModel(value))
  }
}

public object DataRequirementSerializer : KSerializer<DataRequirement> {
  internal val surrogateSerializer: KSerializer<DataRequirementSurrogate> by lazy {
    DataRequirementSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DataRequirement", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DataRequirement =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DataRequirement) {
    surrogateSerializer.serialize(encoder, DataRequirementSurrogate.fromModel(value))
  }
}
