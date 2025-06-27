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

import com.google.fhir.model.r5.SubstanceDefinition
import com.google.fhir.model.r5.surrogates.SubstanceDefinitionCharacterizationSurrogate
import com.google.fhir.model.r5.surrogates.SubstanceDefinitionCodeSurrogate
import com.google.fhir.model.r5.surrogates.SubstanceDefinitionMoietySurrogate
import com.google.fhir.model.r5.surrogates.SubstanceDefinitionMolecularWeightSurrogate
import com.google.fhir.model.r5.surrogates.SubstanceDefinitionNameOfficialSurrogate
import com.google.fhir.model.r5.surrogates.SubstanceDefinitionNameSurrogate
import com.google.fhir.model.r5.surrogates.SubstanceDefinitionPropertySurrogate
import com.google.fhir.model.r5.surrogates.SubstanceDefinitionRelationshipSurrogate
import com.google.fhir.model.r5.surrogates.SubstanceDefinitionSourceMaterialSurrogate
import com.google.fhir.model.r5.surrogates.SubstanceDefinitionStructureRepresentationSurrogate
import com.google.fhir.model.r5.surrogates.SubstanceDefinitionStructureSurrogate
import com.google.fhir.model.r5.surrogates.SubstanceDefinitionSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object SubstanceDefinitionMoietySerializer : KSerializer<SubstanceDefinition.Moiety> {
  internal val surrogateSerializer: KSerializer<SubstanceDefinitionMoietySurrogate> by lazy {
    SubstanceDefinitionMoietySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Moiety", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceDefinition.Moiety =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceDefinition.Moiety) {
    surrogateSerializer.serialize(encoder, SubstanceDefinitionMoietySurrogate.fromModel(value))
  }
}

public object SubstanceDefinitionCharacterizationSerializer :
  KSerializer<SubstanceDefinition.Characterization> {
  internal val surrogateSerializer:
    KSerializer<SubstanceDefinitionCharacterizationSurrogate> by lazy {
    SubstanceDefinitionCharacterizationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Characterization", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceDefinition.Characterization =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceDefinition.Characterization) {
    surrogateSerializer.serialize(
      encoder,
      SubstanceDefinitionCharacterizationSurrogate.fromModel(value),
    )
  }
}

public object SubstanceDefinitionPropertySerializer : KSerializer<SubstanceDefinition.Property> {
  internal val surrogateSerializer: KSerializer<SubstanceDefinitionPropertySurrogate> by lazy {
    SubstanceDefinitionPropertySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Property", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceDefinition.Property =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceDefinition.Property) {
    surrogateSerializer.serialize(encoder, SubstanceDefinitionPropertySurrogate.fromModel(value))
  }
}

public object SubstanceDefinitionMolecularWeightSerializer :
  KSerializer<SubstanceDefinition.MolecularWeight> {
  internal val surrogateSerializer:
    KSerializer<SubstanceDefinitionMolecularWeightSurrogate> by lazy {
    SubstanceDefinitionMolecularWeightSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("MolecularWeight", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceDefinition.MolecularWeight =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceDefinition.MolecularWeight) {
    surrogateSerializer.serialize(
      encoder,
      SubstanceDefinitionMolecularWeightSurrogate.fromModel(value),
    )
  }
}

public object SubstanceDefinitionStructureRepresentationSerializer :
  KSerializer<SubstanceDefinition.Structure.Representation> {
  internal val surrogateSerializer:
    KSerializer<SubstanceDefinitionStructureRepresentationSurrogate> by lazy {
    SubstanceDefinitionStructureRepresentationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Representation", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceDefinition.Structure.Representation =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceDefinition.Structure.Representation) {
    surrogateSerializer.serialize(
      encoder,
      SubstanceDefinitionStructureRepresentationSurrogate.fromModel(value),
    )
  }
}

public object SubstanceDefinitionStructureSerializer : KSerializer<SubstanceDefinition.Structure> {
  internal val surrogateSerializer: KSerializer<SubstanceDefinitionStructureSurrogate> by lazy {
    SubstanceDefinitionStructureSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Structure", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceDefinition.Structure =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceDefinition.Structure) {
    surrogateSerializer.serialize(encoder, SubstanceDefinitionStructureSurrogate.fromModel(value))
  }
}

public object SubstanceDefinitionCodeSerializer : KSerializer<SubstanceDefinition.Code> {
  internal val surrogateSerializer: KSerializer<SubstanceDefinitionCodeSurrogate> by lazy {
    SubstanceDefinitionCodeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Code", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceDefinition.Code =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceDefinition.Code) {
    surrogateSerializer.serialize(encoder, SubstanceDefinitionCodeSurrogate.fromModel(value))
  }
}

public object SubstanceDefinitionNameOfficialSerializer :
  KSerializer<SubstanceDefinition.Name.Official> {
  internal val surrogateSerializer: KSerializer<SubstanceDefinitionNameOfficialSurrogate> by lazy {
    SubstanceDefinitionNameOfficialSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Official", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceDefinition.Name.Official =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceDefinition.Name.Official) {
    surrogateSerializer.serialize(
      encoder,
      SubstanceDefinitionNameOfficialSurrogate.fromModel(value),
    )
  }
}

public object SubstanceDefinitionNameSerializer : KSerializer<SubstanceDefinition.Name> {
  internal val surrogateSerializer: KSerializer<SubstanceDefinitionNameSurrogate> by lazy {
    SubstanceDefinitionNameSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Name", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceDefinition.Name =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceDefinition.Name) {
    surrogateSerializer.serialize(encoder, SubstanceDefinitionNameSurrogate.fromModel(value))
  }
}

public object SubstanceDefinitionRelationshipSerializer :
  KSerializer<SubstanceDefinition.Relationship> {
  internal val surrogateSerializer: KSerializer<SubstanceDefinitionRelationshipSurrogate> by lazy {
    SubstanceDefinitionRelationshipSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Relationship", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceDefinition.Relationship =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceDefinition.Relationship) {
    surrogateSerializer.serialize(
      encoder,
      SubstanceDefinitionRelationshipSurrogate.fromModel(value),
    )
  }
}

public object SubstanceDefinitionSourceMaterialSerializer :
  KSerializer<SubstanceDefinition.SourceMaterial> {
  internal val surrogateSerializer:
    KSerializer<SubstanceDefinitionSourceMaterialSurrogate> by lazy {
    SubstanceDefinitionSourceMaterialSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SourceMaterial", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceDefinition.SourceMaterial =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceDefinition.SourceMaterial) {
    surrogateSerializer.serialize(
      encoder,
      SubstanceDefinitionSourceMaterialSurrogate.fromModel(value),
    )
  }
}

public object SubstanceDefinitionSerializer : KSerializer<SubstanceDefinition> {
  internal val surrogateSerializer: KSerializer<SubstanceDefinitionSurrogate> by lazy {
    SubstanceDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SubstanceDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceDefinition) {
    surrogateSerializer.serialize(encoder, SubstanceDefinitionSurrogate.fromModel(value))
  }
}
