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

@file:UseSerializers(DoubleSerializer::class, LocalTimeSerializer::class)
@file:Suppress("RedundantVisibilityModifier", "PropertyName")

package com.google.fhir.model.r5.surrogates

import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.SubstanceSourceMaterial
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SubstanceSourceMaterialFractionDescriptionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var fraction: KotlinString? = null,
  public var _fraction: Element? = null,
  public var materialType: CodeableConcept? = null,
) {
  public fun toModel(): SubstanceSourceMaterial.FractionDescription =
    SubstanceSourceMaterial.FractionDescription().apply {
      id = this@SubstanceSourceMaterialFractionDescriptionSurrogate.id
      extension = this@SubstanceSourceMaterialFractionDescriptionSurrogate.extension
      modifierExtension = this@SubstanceSourceMaterialFractionDescriptionSurrogate.modifierExtension
      fraction =
        R5String.of(
          this@SubstanceSourceMaterialFractionDescriptionSurrogate.fraction,
          this@SubstanceSourceMaterialFractionDescriptionSurrogate._fraction,
        )
      materialType = this@SubstanceSourceMaterialFractionDescriptionSurrogate.materialType
    }

  public companion object {
    public fun fromModel(
      model: SubstanceSourceMaterial.FractionDescription
    ): SubstanceSourceMaterialFractionDescriptionSurrogate =
      with(model) {
        SubstanceSourceMaterialFractionDescriptionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          fraction = this@with.fraction?.value
          _fraction = this@with.fraction?.toElement()
          materialType = this@with.materialType
        }
      }
  }
}

@Serializable
internal data class SubstanceSourceMaterialOrganismAuthorSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var authorType: CodeableConcept? = null,
  public var authorDescription: KotlinString? = null,
  public var _authorDescription: Element? = null,
) {
  public fun toModel(): SubstanceSourceMaterial.Organism.Author =
    SubstanceSourceMaterial.Organism.Author().apply {
      id = this@SubstanceSourceMaterialOrganismAuthorSurrogate.id
      extension = this@SubstanceSourceMaterialOrganismAuthorSurrogate.extension
      modifierExtension = this@SubstanceSourceMaterialOrganismAuthorSurrogate.modifierExtension
      authorType = this@SubstanceSourceMaterialOrganismAuthorSurrogate.authorType
      authorDescription =
        R5String.of(
          this@SubstanceSourceMaterialOrganismAuthorSurrogate.authorDescription,
          this@SubstanceSourceMaterialOrganismAuthorSurrogate._authorDescription,
        )
    }

  public companion object {
    public fun fromModel(
      model: SubstanceSourceMaterial.Organism.Author
    ): SubstanceSourceMaterialOrganismAuthorSurrogate =
      with(model) {
        SubstanceSourceMaterialOrganismAuthorSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          authorType = this@with.authorType
          authorDescription = this@with.authorDescription?.value
          _authorDescription = this@with.authorDescription?.toElement()
        }
      }
  }
}

@Serializable
internal data class SubstanceSourceMaterialOrganismHybridSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var maternalOrganismId: KotlinString? = null,
  public var _maternalOrganismId: Element? = null,
  public var maternalOrganismName: KotlinString? = null,
  public var _maternalOrganismName: Element? = null,
  public var paternalOrganismId: KotlinString? = null,
  public var _paternalOrganismId: Element? = null,
  public var paternalOrganismName: KotlinString? = null,
  public var _paternalOrganismName: Element? = null,
  public var hybridType: CodeableConcept? = null,
) {
  public fun toModel(): SubstanceSourceMaterial.Organism.Hybrid =
    SubstanceSourceMaterial.Organism.Hybrid().apply {
      id = this@SubstanceSourceMaterialOrganismHybridSurrogate.id
      extension = this@SubstanceSourceMaterialOrganismHybridSurrogate.extension
      modifierExtension = this@SubstanceSourceMaterialOrganismHybridSurrogate.modifierExtension
      maternalOrganismId =
        R5String.of(
          this@SubstanceSourceMaterialOrganismHybridSurrogate.maternalOrganismId,
          this@SubstanceSourceMaterialOrganismHybridSurrogate._maternalOrganismId,
        )
      maternalOrganismName =
        R5String.of(
          this@SubstanceSourceMaterialOrganismHybridSurrogate.maternalOrganismName,
          this@SubstanceSourceMaterialOrganismHybridSurrogate._maternalOrganismName,
        )
      paternalOrganismId =
        R5String.of(
          this@SubstanceSourceMaterialOrganismHybridSurrogate.paternalOrganismId,
          this@SubstanceSourceMaterialOrganismHybridSurrogate._paternalOrganismId,
        )
      paternalOrganismName =
        R5String.of(
          this@SubstanceSourceMaterialOrganismHybridSurrogate.paternalOrganismName,
          this@SubstanceSourceMaterialOrganismHybridSurrogate._paternalOrganismName,
        )
      hybridType = this@SubstanceSourceMaterialOrganismHybridSurrogate.hybridType
    }

  public companion object {
    public fun fromModel(
      model: SubstanceSourceMaterial.Organism.Hybrid
    ): SubstanceSourceMaterialOrganismHybridSurrogate =
      with(model) {
        SubstanceSourceMaterialOrganismHybridSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          maternalOrganismId = this@with.maternalOrganismId?.value
          _maternalOrganismId = this@with.maternalOrganismId?.toElement()
          maternalOrganismName = this@with.maternalOrganismName?.value
          _maternalOrganismName = this@with.maternalOrganismName?.toElement()
          paternalOrganismId = this@with.paternalOrganismId?.value
          _paternalOrganismId = this@with.paternalOrganismId?.toElement()
          paternalOrganismName = this@with.paternalOrganismName?.value
          _paternalOrganismName = this@with.paternalOrganismName?.toElement()
          hybridType = this@with.hybridType
        }
      }
  }
}

@Serializable
internal data class SubstanceSourceMaterialOrganismOrganismGeneralSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var kingdom: CodeableConcept? = null,
  public var phylum: CodeableConcept? = null,
  public var `class`: CodeableConcept? = null,
  public var order: CodeableConcept? = null,
) {
  public fun toModel(): SubstanceSourceMaterial.Organism.OrganismGeneral =
    SubstanceSourceMaterial.Organism.OrganismGeneral().apply {
      id = this@SubstanceSourceMaterialOrganismOrganismGeneralSurrogate.id
      extension = this@SubstanceSourceMaterialOrganismOrganismGeneralSurrogate.extension
      modifierExtension =
        this@SubstanceSourceMaterialOrganismOrganismGeneralSurrogate.modifierExtension
      kingdom = this@SubstanceSourceMaterialOrganismOrganismGeneralSurrogate.kingdom
      phylum = this@SubstanceSourceMaterialOrganismOrganismGeneralSurrogate.phylum
      `class` = this@SubstanceSourceMaterialOrganismOrganismGeneralSurrogate.`class`
      order = this@SubstanceSourceMaterialOrganismOrganismGeneralSurrogate.order
    }

  public companion object {
    public fun fromModel(
      model: SubstanceSourceMaterial.Organism.OrganismGeneral
    ): SubstanceSourceMaterialOrganismOrganismGeneralSurrogate =
      with(model) {
        SubstanceSourceMaterialOrganismOrganismGeneralSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          kingdom = this@with.kingdom
          phylum = this@with.phylum
          `class` = this@with.`class`
          order = this@with.order
        }
      }
  }
}

@Serializable
internal data class SubstanceSourceMaterialOrganismSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var family: CodeableConcept? = null,
  public var genus: CodeableConcept? = null,
  public var species: CodeableConcept? = null,
  public var intraspecificType: CodeableConcept? = null,
  public var intraspecificDescription: KotlinString? = null,
  public var _intraspecificDescription: Element? = null,
  public var author: List<SubstanceSourceMaterial.Organism.Author>? = null,
  public var hybrid: SubstanceSourceMaterial.Organism.Hybrid? = null,
  public var organismGeneral: SubstanceSourceMaterial.Organism.OrganismGeneral? = null,
) {
  public fun toModel(): SubstanceSourceMaterial.Organism =
    SubstanceSourceMaterial.Organism().apply {
      id = this@SubstanceSourceMaterialOrganismSurrogate.id
      extension = this@SubstanceSourceMaterialOrganismSurrogate.extension
      modifierExtension = this@SubstanceSourceMaterialOrganismSurrogate.modifierExtension
      family = this@SubstanceSourceMaterialOrganismSurrogate.family
      genus = this@SubstanceSourceMaterialOrganismSurrogate.genus
      species = this@SubstanceSourceMaterialOrganismSurrogate.species
      intraspecificType = this@SubstanceSourceMaterialOrganismSurrogate.intraspecificType
      intraspecificDescription =
        R5String.of(
          this@SubstanceSourceMaterialOrganismSurrogate.intraspecificDescription,
          this@SubstanceSourceMaterialOrganismSurrogate._intraspecificDescription,
        )
      author = this@SubstanceSourceMaterialOrganismSurrogate.author
      hybrid = this@SubstanceSourceMaterialOrganismSurrogate.hybrid
      organismGeneral = this@SubstanceSourceMaterialOrganismSurrogate.organismGeneral
    }

  public companion object {
    public fun fromModel(
      model: SubstanceSourceMaterial.Organism
    ): SubstanceSourceMaterialOrganismSurrogate =
      with(model) {
        SubstanceSourceMaterialOrganismSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          family = this@with.family
          genus = this@with.genus
          species = this@with.species
          intraspecificType = this@with.intraspecificType
          intraspecificDescription = this@with.intraspecificDescription?.value
          _intraspecificDescription = this@with.intraspecificDescription?.toElement()
          author = this@with.author
          hybrid = this@with.hybrid
          organismGeneral = this@with.organismGeneral
        }
      }
  }
}

@Serializable
internal data class SubstanceSourceMaterialPartDescriptionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var part: CodeableConcept? = null,
  public var partLocation: CodeableConcept? = null,
) {
  public fun toModel(): SubstanceSourceMaterial.PartDescription =
    SubstanceSourceMaterial.PartDescription().apply {
      id = this@SubstanceSourceMaterialPartDescriptionSurrogate.id
      extension = this@SubstanceSourceMaterialPartDescriptionSurrogate.extension
      modifierExtension = this@SubstanceSourceMaterialPartDescriptionSurrogate.modifierExtension
      part = this@SubstanceSourceMaterialPartDescriptionSurrogate.part
      partLocation = this@SubstanceSourceMaterialPartDescriptionSurrogate.partLocation
    }

  public companion object {
    public fun fromModel(
      model: SubstanceSourceMaterial.PartDescription
    ): SubstanceSourceMaterialPartDescriptionSurrogate =
      with(model) {
        SubstanceSourceMaterialPartDescriptionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          part = this@with.part
          partLocation = this@with.partLocation
        }
      }
  }
}

@Serializable
internal data class SubstanceSourceMaterialSurrogate(
  public var id: KotlinString? = null,
  public var meta: Meta? = null,
  public var implicitRules: KotlinString? = null,
  public var _implicitRules: Element? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sourceMaterialClass: CodeableConcept? = null,
  public var sourceMaterialType: CodeableConcept? = null,
  public var sourceMaterialState: CodeableConcept? = null,
  public var organismId: Identifier? = null,
  public var organismName: KotlinString? = null,
  public var _organismName: Element? = null,
  public var parentSubstanceId: List<Identifier?>? = null,
  public var parentSubstanceName: List<KotlinString?>? = null,
  public var _parentSubstanceName: List<Element?>? = null,
  public var countryOfOrigin: List<CodeableConcept?>? = null,
  public var geographicalLocation: List<KotlinString?>? = null,
  public var _geographicalLocation: List<Element?>? = null,
  public var developmentStage: CodeableConcept? = null,
  public var fractionDescription: List<SubstanceSourceMaterial.FractionDescription>? = null,
  public var organism: SubstanceSourceMaterial.Organism? = null,
  public var partDescription: List<SubstanceSourceMaterial.PartDescription>? = null,
) {
  public fun toModel(): SubstanceSourceMaterial =
    SubstanceSourceMaterial().apply {
      id = this@SubstanceSourceMaterialSurrogate.id
      meta = this@SubstanceSourceMaterialSurrogate.meta
      implicitRules =
        Uri.of(
          this@SubstanceSourceMaterialSurrogate.implicitRules,
          this@SubstanceSourceMaterialSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@SubstanceSourceMaterialSurrogate.language,
          this@SubstanceSourceMaterialSurrogate._language,
        )
      text = this@SubstanceSourceMaterialSurrogate.text
      contained = this@SubstanceSourceMaterialSurrogate.contained
      extension = this@SubstanceSourceMaterialSurrogate.extension
      modifierExtension = this@SubstanceSourceMaterialSurrogate.modifierExtension
      sourceMaterialClass = this@SubstanceSourceMaterialSurrogate.sourceMaterialClass
      sourceMaterialType = this@SubstanceSourceMaterialSurrogate.sourceMaterialType
      sourceMaterialState = this@SubstanceSourceMaterialSurrogate.sourceMaterialState
      organismId = this@SubstanceSourceMaterialSurrogate.organismId
      organismName =
        R5String.of(
          this@SubstanceSourceMaterialSurrogate.organismName,
          this@SubstanceSourceMaterialSurrogate._organismName,
        )
      parentSubstanceId = this@SubstanceSourceMaterialSurrogate.parentSubstanceId
      parentSubstanceName =
        if (
          this@SubstanceSourceMaterialSurrogate.parentSubstanceName == null &&
            this@SubstanceSourceMaterialSurrogate._parentSubstanceName == null
        ) {
          null
        } else {
          (this@SubstanceSourceMaterialSurrogate.parentSubstanceName
              ?: List(this@SubstanceSourceMaterialSurrogate._parentSubstanceName!!.size) { null })
            .zip(
              this@SubstanceSourceMaterialSurrogate._parentSubstanceName
                ?: List(this@SubstanceSourceMaterialSurrogate.parentSubstanceName!!.size) { null }
            )
            .mapNotNull { (value, element) -> R5String.of(value, element) }
        }
      countryOfOrigin = this@SubstanceSourceMaterialSurrogate.countryOfOrigin
      geographicalLocation =
        if (
          this@SubstanceSourceMaterialSurrogate.geographicalLocation == null &&
            this@SubstanceSourceMaterialSurrogate._geographicalLocation == null
        ) {
          null
        } else {
          (this@SubstanceSourceMaterialSurrogate.geographicalLocation
              ?: List(this@SubstanceSourceMaterialSurrogate._geographicalLocation!!.size) { null })
            .zip(
              this@SubstanceSourceMaterialSurrogate._geographicalLocation
                ?: List(this@SubstanceSourceMaterialSurrogate.geographicalLocation!!.size) { null }
            )
            .mapNotNull { (value, element) -> R5String.of(value, element) }
        }
      developmentStage = this@SubstanceSourceMaterialSurrogate.developmentStage
      fractionDescription = this@SubstanceSourceMaterialSurrogate.fractionDescription
      organism = this@SubstanceSourceMaterialSurrogate.organism
      partDescription = this@SubstanceSourceMaterialSurrogate.partDescription
    }

  public companion object {
    public fun fromModel(model: SubstanceSourceMaterial): SubstanceSourceMaterialSurrogate =
      with(model) {
        SubstanceSourceMaterialSurrogate().apply {
          id = this@with.id
          meta = this@with.meta
          implicitRules = this@with.implicitRules?.value
          _implicitRules = this@with.implicitRules?.toElement()
          language = this@with.language?.value
          _language = this@with.language?.toElement()
          text = this@with.text
          contained = this@with.contained
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sourceMaterialClass = this@with.sourceMaterialClass
          sourceMaterialType = this@with.sourceMaterialType
          sourceMaterialState = this@with.sourceMaterialState
          organismId = this@with.organismId
          organismName = this@with.organismName?.value
          _organismName = this@with.organismName?.toElement()
          parentSubstanceId = this@with.parentSubstanceId
          parentSubstanceName =
            this@with.parentSubstanceName?.map { it?.value }?.takeUnless { it.all { it == null } }
          _parentSubstanceName =
            this@with.parentSubstanceName
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          countryOfOrigin = this@with.countryOfOrigin
          geographicalLocation =
            this@with.geographicalLocation?.map { it?.value }?.takeUnless { it.all { it == null } }
          _geographicalLocation =
            this@with.geographicalLocation
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          developmentStage = this@with.developmentStage
          fractionDescription = this@with.fractionDescription
          organism = this@with.organism
          partDescription = this@with.partDescription
        }
      }
  }
}
