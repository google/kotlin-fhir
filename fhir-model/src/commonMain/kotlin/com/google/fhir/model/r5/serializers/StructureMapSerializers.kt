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

import com.google.fhir.model.r5.StructureMap
import com.google.fhir.model.r5.surrogates.StructureMapConstSurrogate
import com.google.fhir.model.r5.surrogates.StructureMapGroupInputSurrogate
import com.google.fhir.model.r5.surrogates.StructureMapGroupRuleDependentSurrogate
import com.google.fhir.model.r5.surrogates.StructureMapGroupRuleSourceSurrogate
import com.google.fhir.model.r5.surrogates.StructureMapGroupRuleSurrogate
import com.google.fhir.model.r5.surrogates.StructureMapGroupRuleTargetParameterSurrogate
import com.google.fhir.model.r5.surrogates.StructureMapGroupRuleTargetSurrogate
import com.google.fhir.model.r5.surrogates.StructureMapGroupSurrogate
import com.google.fhir.model.r5.surrogates.StructureMapStructureSurrogate
import com.google.fhir.model.r5.surrogates.StructureMapSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object StructureMapStructureSerializer : KSerializer<StructureMap.Structure> {
  internal val surrogateSerializer: KSerializer<StructureMapStructureSurrogate> by lazy {
    StructureMapStructureSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Structure", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): StructureMap.Structure =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: StructureMap.Structure) {
    surrogateSerializer.serialize(encoder, StructureMapStructureSurrogate.fromModel(value))
  }
}

public object StructureMapConstSerializer : KSerializer<StructureMap.Const> {
  internal val surrogateSerializer: KSerializer<StructureMapConstSurrogate> by lazy {
    StructureMapConstSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Const", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): StructureMap.Const =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: StructureMap.Const) {
    surrogateSerializer.serialize(encoder, StructureMapConstSurrogate.fromModel(value))
  }
}

public object StructureMapGroupInputSerializer : KSerializer<StructureMap.Group.Input> {
  internal val surrogateSerializer: KSerializer<StructureMapGroupInputSurrogate> by lazy {
    StructureMapGroupInputSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Input", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): StructureMap.Group.Input =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: StructureMap.Group.Input) {
    surrogateSerializer.serialize(encoder, StructureMapGroupInputSurrogate.fromModel(value))
  }
}

public object StructureMapGroupRuleSourceSerializer : KSerializer<StructureMap.Group.Rule.Source> {
  internal val surrogateSerializer: KSerializer<StructureMapGroupRuleSourceSurrogate> by lazy {
    StructureMapGroupRuleSourceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Source", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): StructureMap.Group.Rule.Source =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: StructureMap.Group.Rule.Source) {
    surrogateSerializer.serialize(encoder, StructureMapGroupRuleSourceSurrogate.fromModel(value))
  }
}

public object StructureMapGroupRuleTargetParameterSerializer :
  KSerializer<StructureMap.Group.Rule.Target.Parameter> {
  internal val surrogateSerializer:
    KSerializer<StructureMapGroupRuleTargetParameterSurrogate> by lazy {
    StructureMapGroupRuleTargetParameterSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Parameter", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): StructureMap.Group.Rule.Target.Parameter =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: StructureMap.Group.Rule.Target.Parameter) {
    surrogateSerializer.serialize(
      encoder,
      StructureMapGroupRuleTargetParameterSurrogate.fromModel(value),
    )
  }
}

public object StructureMapGroupRuleTargetSerializer : KSerializer<StructureMap.Group.Rule.Target> {
  internal val surrogateSerializer: KSerializer<StructureMapGroupRuleTargetSurrogate> by lazy {
    StructureMapGroupRuleTargetSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Target", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): StructureMap.Group.Rule.Target =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: StructureMap.Group.Rule.Target) {
    surrogateSerializer.serialize(encoder, StructureMapGroupRuleTargetSurrogate.fromModel(value))
  }
}

public object StructureMapGroupRuleDependentSerializer :
  KSerializer<StructureMap.Group.Rule.Dependent> {
  internal val surrogateSerializer: KSerializer<StructureMapGroupRuleDependentSurrogate> by lazy {
    StructureMapGroupRuleDependentSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Dependent", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): StructureMap.Group.Rule.Dependent =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: StructureMap.Group.Rule.Dependent) {
    surrogateSerializer.serialize(encoder, StructureMapGroupRuleDependentSurrogate.fromModel(value))
  }
}

public object StructureMapGroupRuleSerializer : KSerializer<StructureMap.Group.Rule> {
  internal val surrogateSerializer: KSerializer<StructureMapGroupRuleSurrogate> by lazy {
    StructureMapGroupRuleSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Rule", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): StructureMap.Group.Rule =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: StructureMap.Group.Rule) {
    surrogateSerializer.serialize(encoder, StructureMapGroupRuleSurrogate.fromModel(value))
  }
}

public object StructureMapGroupSerializer : KSerializer<StructureMap.Group> {
  internal val surrogateSerializer: KSerializer<StructureMapGroupSurrogate> by lazy {
    StructureMapGroupSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Group", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): StructureMap.Group =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: StructureMap.Group) {
    surrogateSerializer.serialize(encoder, StructureMapGroupSurrogate.fromModel(value))
  }
}

public object StructureMapSerializer : KSerializer<StructureMap> {
  internal val surrogateSerializer: KSerializer<StructureMapSurrogate> by lazy {
    StructureMapSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("StructureMap", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): StructureMap =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: StructureMap) {
    surrogateSerializer.serialize(encoder, StructureMapSurrogate.fromModel(value))
  }
}
