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

import com.google.fhir.model.r4.SubstanceSpecification
import com.google.fhir.model.r4.surrogates.SubstanceSpecificationCodeSurrogate
import com.google.fhir.model.r4.surrogates.SubstanceSpecificationMoietySurrogate
import com.google.fhir.model.r4.surrogates.SubstanceSpecificationNameOfficialSurrogate
import com.google.fhir.model.r4.surrogates.SubstanceSpecificationNameSurrogate
import com.google.fhir.model.r4.surrogates.SubstanceSpecificationPropertySurrogate
import com.google.fhir.model.r4.surrogates.SubstanceSpecificationRelationshipSurrogate
import com.google.fhir.model.r4.surrogates.SubstanceSpecificationStructureIsotopeMolecularWeightSurrogate
import com.google.fhir.model.r4.surrogates.SubstanceSpecificationStructureIsotopeSurrogate
import com.google.fhir.model.r4.surrogates.SubstanceSpecificationStructureRepresentationSurrogate
import com.google.fhir.model.r4.surrogates.SubstanceSpecificationStructureSurrogate
import com.google.fhir.model.r4.surrogates.SubstanceSpecificationSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object SubstanceSpecificationMoietySerializer : KSerializer<SubstanceSpecification.Moiety> {
  internal val surrogateSerializer: KSerializer<SubstanceSpecificationMoietySurrogate> by lazy {
    SubstanceSpecificationMoietySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Moiety", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceSpecification.Moiety =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceSpecification.Moiety) {
    surrogateSerializer.serialize(encoder, SubstanceSpecificationMoietySurrogate.fromModel(value))
  }
}

public object SubstanceSpecificationPropertySerializer :
  KSerializer<SubstanceSpecification.Property> {
  internal val surrogateSerializer: KSerializer<SubstanceSpecificationPropertySurrogate> by lazy {
    SubstanceSpecificationPropertySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Property", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceSpecification.Property =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceSpecification.Property) {
    surrogateSerializer.serialize(encoder, SubstanceSpecificationPropertySurrogate.fromModel(value))
  }
}

public object SubstanceSpecificationStructureIsotopeMolecularWeightSerializer :
  KSerializer<SubstanceSpecification.Structure.Isotope.MolecularWeight> {
  internal val surrogateSerializer:
    KSerializer<SubstanceSpecificationStructureIsotopeMolecularWeightSurrogate> by lazy {
    SubstanceSpecificationStructureIsotopeMolecularWeightSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("MolecularWeight", surrogateSerializer.descriptor)
  }

  override fun deserialize(
    decoder: Decoder
  ): SubstanceSpecification.Structure.Isotope.MolecularWeight =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: SubstanceSpecification.Structure.Isotope.MolecularWeight,
  ) {
    surrogateSerializer.serialize(
      encoder,
      SubstanceSpecificationStructureIsotopeMolecularWeightSurrogate.fromModel(value),
    )
  }
}

public object SubstanceSpecificationStructureIsotopeSerializer :
  KSerializer<SubstanceSpecification.Structure.Isotope> {
  internal val surrogateSerializer:
    KSerializer<SubstanceSpecificationStructureIsotopeSurrogate> by lazy {
    SubstanceSpecificationStructureIsotopeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Isotope", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceSpecification.Structure.Isotope =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceSpecification.Structure.Isotope) {
    surrogateSerializer.serialize(
      encoder,
      SubstanceSpecificationStructureIsotopeSurrogate.fromModel(value),
    )
  }
}

public object SubstanceSpecificationStructureRepresentationSerializer :
  KSerializer<SubstanceSpecification.Structure.Representation> {
  internal val surrogateSerializer:
    KSerializer<SubstanceSpecificationStructureRepresentationSurrogate> by lazy {
    SubstanceSpecificationStructureRepresentationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Representation", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceSpecification.Structure.Representation =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: SubstanceSpecification.Structure.Representation,
  ) {
    surrogateSerializer.serialize(
      encoder,
      SubstanceSpecificationStructureRepresentationSurrogate.fromModel(value),
    )
  }
}

public object SubstanceSpecificationStructureSerializer :
  KSerializer<SubstanceSpecification.Structure> {
  internal val surrogateSerializer: KSerializer<SubstanceSpecificationStructureSurrogate> by lazy {
    SubstanceSpecificationStructureSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Structure", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceSpecification.Structure =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceSpecification.Structure) {
    surrogateSerializer.serialize(
      encoder,
      SubstanceSpecificationStructureSurrogate.fromModel(value),
    )
  }
}

public object SubstanceSpecificationCodeSerializer : KSerializer<SubstanceSpecification.Code> {
  internal val surrogateSerializer: KSerializer<SubstanceSpecificationCodeSurrogate> by lazy {
    SubstanceSpecificationCodeSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Code", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceSpecification.Code =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceSpecification.Code) {
    surrogateSerializer.serialize(encoder, SubstanceSpecificationCodeSurrogate.fromModel(value))
  }
}

public object SubstanceSpecificationNameOfficialSerializer :
  KSerializer<SubstanceSpecification.Name.Official> {
  internal val surrogateSerializer:
    KSerializer<SubstanceSpecificationNameOfficialSurrogate> by lazy {
    SubstanceSpecificationNameOfficialSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Official", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceSpecification.Name.Official =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceSpecification.Name.Official) {
    surrogateSerializer.serialize(
      encoder,
      SubstanceSpecificationNameOfficialSurrogate.fromModel(value),
    )
  }
}

public object SubstanceSpecificationNameSerializer : KSerializer<SubstanceSpecification.Name> {
  internal val surrogateSerializer: KSerializer<SubstanceSpecificationNameSurrogate> by lazy {
    SubstanceSpecificationNameSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Name", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceSpecification.Name =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceSpecification.Name) {
    surrogateSerializer.serialize(encoder, SubstanceSpecificationNameSurrogate.fromModel(value))
  }
}

public object SubstanceSpecificationRelationshipSerializer :
  KSerializer<SubstanceSpecification.Relationship> {
  internal val surrogateSerializer:
    KSerializer<SubstanceSpecificationRelationshipSurrogate> by lazy {
    SubstanceSpecificationRelationshipSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Relationship", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceSpecification.Relationship =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceSpecification.Relationship) {
    surrogateSerializer.serialize(
      encoder,
      SubstanceSpecificationRelationshipSurrogate.fromModel(value),
    )
  }
}

public object SubstanceSpecificationSerializer : KSerializer<SubstanceSpecification> {
  internal val surrogateSerializer: KSerializer<SubstanceSpecificationSurrogate> by lazy {
    SubstanceSpecificationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SubstanceSpecification", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): SubstanceSpecification =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: SubstanceSpecification) {
    surrogateSerializer.serialize(encoder, SubstanceSpecificationSurrogate.fromModel(value))
  }
}
