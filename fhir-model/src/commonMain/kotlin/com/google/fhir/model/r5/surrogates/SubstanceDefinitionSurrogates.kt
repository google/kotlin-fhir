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

import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Ratio
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.SubstanceDefinition
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SubstanceDefinitionMoietySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var role: CodeableConcept? = null,
  public var identifier: Identifier? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var stereochemistry: CodeableConcept? = null,
  public var opticalActivity: CodeableConcept? = null,
  public var molecularFormula: KotlinString? = null,
  public var _molecularFormula: Element? = null,
  public var amountQuantity: Quantity? = null,
  public var amountString: KotlinString? = null,
  public var _amountString: Element? = null,
  public var measurementType: CodeableConcept? = null,
) {
  public fun toModel(): SubstanceDefinition.Moiety =
    SubstanceDefinition.Moiety().apply {
      id = this@SubstanceDefinitionMoietySurrogate.id
      extension = this@SubstanceDefinitionMoietySurrogate.extension
      modifierExtension = this@SubstanceDefinitionMoietySurrogate.modifierExtension
      role = this@SubstanceDefinitionMoietySurrogate.role
      identifier = this@SubstanceDefinitionMoietySurrogate.identifier
      name =
        R5String.of(
          this@SubstanceDefinitionMoietySurrogate.name,
          this@SubstanceDefinitionMoietySurrogate._name,
        )
      stereochemistry = this@SubstanceDefinitionMoietySurrogate.stereochemistry
      opticalActivity = this@SubstanceDefinitionMoietySurrogate.opticalActivity
      molecularFormula =
        R5String.of(
          this@SubstanceDefinitionMoietySurrogate.molecularFormula,
          this@SubstanceDefinitionMoietySurrogate._molecularFormula,
        )
      amount =
        SubstanceDefinition.Moiety.Amount?.from(
          this@SubstanceDefinitionMoietySurrogate.amountQuantity,
          R5String.of(
            this@SubstanceDefinitionMoietySurrogate.amountString,
            this@SubstanceDefinitionMoietySurrogate._amountString,
          ),
        )
      measurementType = this@SubstanceDefinitionMoietySurrogate.measurementType
    }

  public companion object {
    public fun fromModel(model: SubstanceDefinition.Moiety): SubstanceDefinitionMoietySurrogate =
      with(model) {
        SubstanceDefinitionMoietySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          role = this@with.role
          identifier = this@with.identifier
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          stereochemistry = this@with.stereochemistry
          opticalActivity = this@with.opticalActivity
          molecularFormula = this@with.molecularFormula?.value
          _molecularFormula = this@with.molecularFormula?.toElement()
          amountQuantity = this@with.amount?.asQuantity()?.value
          amountString = this@with.amount?.asString()?.value?.value
          _amountString = this@with.amount?.asString()?.value?.toElement()
          measurementType = this@with.measurementType
        }
      }
  }
}

@Serializable
internal data class SubstanceDefinitionCharacterizationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var technique: CodeableConcept? = null,
  public var form: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var `file`: List<Attachment?>? = null,
) {
  public fun toModel(): SubstanceDefinition.Characterization =
    SubstanceDefinition.Characterization().apply {
      id = this@SubstanceDefinitionCharacterizationSurrogate.id
      extension = this@SubstanceDefinitionCharacterizationSurrogate.extension
      modifierExtension = this@SubstanceDefinitionCharacterizationSurrogate.modifierExtension
      technique = this@SubstanceDefinitionCharacterizationSurrogate.technique
      form = this@SubstanceDefinitionCharacterizationSurrogate.form
      description =
        Markdown.of(
          this@SubstanceDefinitionCharacterizationSurrogate.description,
          this@SubstanceDefinitionCharacterizationSurrogate._description,
        )
      `file` = this@SubstanceDefinitionCharacterizationSurrogate.`file`
    }

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Characterization
    ): SubstanceDefinitionCharacterizationSurrogate =
      with(model) {
        SubstanceDefinitionCharacterizationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          technique = this@with.technique
          form = this@with.form
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          `file` = this@with.`file`
        }
      }
  }
}

@Serializable
internal data class SubstanceDefinitionPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueDate: KotlinString? = null,
  public var _valueDate: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueAttachment: Attachment? = null,
) {
  public fun toModel(): SubstanceDefinition.Property =
    SubstanceDefinition.Property().apply {
      id = this@SubstanceDefinitionPropertySurrogate.id
      extension = this@SubstanceDefinitionPropertySurrogate.extension
      modifierExtension = this@SubstanceDefinitionPropertySurrogate.modifierExtension
      type = this@SubstanceDefinitionPropertySurrogate.type
      `value` =
        SubstanceDefinition.Property.Value?.from(
          this@SubstanceDefinitionPropertySurrogate.valueCodeableConcept,
          this@SubstanceDefinitionPropertySurrogate.valueQuantity,
          Date.of(
            FhirDate.fromString(this@SubstanceDefinitionPropertySurrogate.valueDate),
            this@SubstanceDefinitionPropertySurrogate._valueDate,
          ),
          R5Boolean.of(
            this@SubstanceDefinitionPropertySurrogate.valueBoolean,
            this@SubstanceDefinitionPropertySurrogate._valueBoolean,
          ),
          this@SubstanceDefinitionPropertySurrogate.valueAttachment,
        )
    }

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Property
    ): SubstanceDefinitionPropertySurrogate =
      with(model) {
        SubstanceDefinitionPropertySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueDate = this@with.`value`?.asDate()?.value?.value?.toString()
          _valueDate = this@with.`value`?.asDate()?.value?.toElement()
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement()
          valueAttachment = this@with.`value`?.asAttachment()?.value
        }
      }
  }
}

@Serializable
internal data class SubstanceDefinitionMolecularWeightSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var method: CodeableConcept? = null,
  public var type: CodeableConcept? = null,
  public var amount: Quantity? = null,
) {
  public fun toModel(): SubstanceDefinition.MolecularWeight =
    SubstanceDefinition.MolecularWeight().apply {
      id = this@SubstanceDefinitionMolecularWeightSurrogate.id
      extension = this@SubstanceDefinitionMolecularWeightSurrogate.extension
      modifierExtension = this@SubstanceDefinitionMolecularWeightSurrogate.modifierExtension
      method = this@SubstanceDefinitionMolecularWeightSurrogate.method
      type = this@SubstanceDefinitionMolecularWeightSurrogate.type
      amount = this@SubstanceDefinitionMolecularWeightSurrogate.amount
    }

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.MolecularWeight
    ): SubstanceDefinitionMolecularWeightSurrogate =
      with(model) {
        SubstanceDefinitionMolecularWeightSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          method = this@with.method
          type = this@with.type
          amount = this@with.amount
        }
      }
  }
}

@Serializable
internal data class SubstanceDefinitionStructureRepresentationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var representation: KotlinString? = null,
  public var _representation: Element? = null,
  public var format: CodeableConcept? = null,
  public var document: Reference? = null,
) {
  public fun toModel(): SubstanceDefinition.Structure.Representation =
    SubstanceDefinition.Structure.Representation().apply {
      id = this@SubstanceDefinitionStructureRepresentationSurrogate.id
      extension = this@SubstanceDefinitionStructureRepresentationSurrogate.extension
      modifierExtension = this@SubstanceDefinitionStructureRepresentationSurrogate.modifierExtension
      type = this@SubstanceDefinitionStructureRepresentationSurrogate.type
      representation =
        R5String.of(
          this@SubstanceDefinitionStructureRepresentationSurrogate.representation,
          this@SubstanceDefinitionStructureRepresentationSurrogate._representation,
        )
      format = this@SubstanceDefinitionStructureRepresentationSurrogate.format
      document = this@SubstanceDefinitionStructureRepresentationSurrogate.document
    }

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Structure.Representation
    ): SubstanceDefinitionStructureRepresentationSurrogate =
      with(model) {
        SubstanceDefinitionStructureRepresentationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          representation = this@with.representation?.value
          _representation = this@with.representation?.toElement()
          format = this@with.format
          document = this@with.document
        }
      }
  }
}

@Serializable
internal data class SubstanceDefinitionStructureSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var stereochemistry: CodeableConcept? = null,
  public var opticalActivity: CodeableConcept? = null,
  public var molecularFormula: KotlinString? = null,
  public var _molecularFormula: Element? = null,
  public var molecularFormulaByMoiety: KotlinString? = null,
  public var _molecularFormulaByMoiety: Element? = null,
  public var molecularWeight: SubstanceDefinition.MolecularWeight? = null,
  public var technique: List<CodeableConcept?>? = null,
  public var sourceDocument: List<Reference?>? = null,
  public var representation: List<SubstanceDefinition.Structure.Representation>? = null,
) {
  public fun toModel(): SubstanceDefinition.Structure =
    SubstanceDefinition.Structure().apply {
      id = this@SubstanceDefinitionStructureSurrogate.id
      extension = this@SubstanceDefinitionStructureSurrogate.extension
      modifierExtension = this@SubstanceDefinitionStructureSurrogate.modifierExtension
      stereochemistry = this@SubstanceDefinitionStructureSurrogate.stereochemistry
      opticalActivity = this@SubstanceDefinitionStructureSurrogate.opticalActivity
      molecularFormula =
        R5String.of(
          this@SubstanceDefinitionStructureSurrogate.molecularFormula,
          this@SubstanceDefinitionStructureSurrogate._molecularFormula,
        )
      molecularFormulaByMoiety =
        R5String.of(
          this@SubstanceDefinitionStructureSurrogate.molecularFormulaByMoiety,
          this@SubstanceDefinitionStructureSurrogate._molecularFormulaByMoiety,
        )
      molecularWeight = this@SubstanceDefinitionStructureSurrogate.molecularWeight
      technique = this@SubstanceDefinitionStructureSurrogate.technique
      sourceDocument = this@SubstanceDefinitionStructureSurrogate.sourceDocument
      representation = this@SubstanceDefinitionStructureSurrogate.representation
    }

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Structure
    ): SubstanceDefinitionStructureSurrogate =
      with(model) {
        SubstanceDefinitionStructureSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          stereochemistry = this@with.stereochemistry
          opticalActivity = this@with.opticalActivity
          molecularFormula = this@with.molecularFormula?.value
          _molecularFormula = this@with.molecularFormula?.toElement()
          molecularFormulaByMoiety = this@with.molecularFormulaByMoiety?.value
          _molecularFormulaByMoiety = this@with.molecularFormulaByMoiety?.toElement()
          molecularWeight = this@with.molecularWeight
          technique = this@with.technique
          sourceDocument = this@with.sourceDocument
          representation = this@with.representation
        }
      }
  }
}

@Serializable
internal data class SubstanceDefinitionCodeSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var status: CodeableConcept? = null,
  public var statusDate: KotlinString? = null,
  public var _statusDate: Element? = null,
  public var note: List<Annotation?>? = null,
  public var source: List<Reference?>? = null,
) {
  public fun toModel(): SubstanceDefinition.Code =
    SubstanceDefinition.Code().apply {
      id = this@SubstanceDefinitionCodeSurrogate.id
      extension = this@SubstanceDefinitionCodeSurrogate.extension
      modifierExtension = this@SubstanceDefinitionCodeSurrogate.modifierExtension
      code = this@SubstanceDefinitionCodeSurrogate.code
      status = this@SubstanceDefinitionCodeSurrogate.status
      statusDate =
        DateTime.of(
          FhirDateTime.fromString(this@SubstanceDefinitionCodeSurrogate.statusDate),
          this@SubstanceDefinitionCodeSurrogate._statusDate,
        )
      note = this@SubstanceDefinitionCodeSurrogate.note
      source = this@SubstanceDefinitionCodeSurrogate.source
    }

  public companion object {
    public fun fromModel(model: SubstanceDefinition.Code): SubstanceDefinitionCodeSurrogate =
      with(model) {
        SubstanceDefinitionCodeSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          status = this@with.status
          statusDate = this@with.statusDate?.value?.toString()
          _statusDate = this@with.statusDate?.toElement()
          note = this@with.note
          source = this@with.source
        }
      }
  }
}

@Serializable
internal data class SubstanceDefinitionNameOfficialSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var authority: CodeableConcept? = null,
  public var status: CodeableConcept? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
) {
  public fun toModel(): SubstanceDefinition.Name.Official =
    SubstanceDefinition.Name.Official().apply {
      id = this@SubstanceDefinitionNameOfficialSurrogate.id
      extension = this@SubstanceDefinitionNameOfficialSurrogate.extension
      modifierExtension = this@SubstanceDefinitionNameOfficialSurrogate.modifierExtension
      authority = this@SubstanceDefinitionNameOfficialSurrogate.authority
      status = this@SubstanceDefinitionNameOfficialSurrogate.status
      date =
        DateTime.of(
          FhirDateTime.fromString(this@SubstanceDefinitionNameOfficialSurrogate.date),
          this@SubstanceDefinitionNameOfficialSurrogate._date,
        )
    }

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Name.Official
    ): SubstanceDefinitionNameOfficialSurrogate =
      with(model) {
        SubstanceDefinitionNameOfficialSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          authority = this@with.authority
          status = this@with.status
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
        }
      }
  }
}

@Serializable
internal data class SubstanceDefinitionNameSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var type: CodeableConcept? = null,
  public var status: CodeableConcept? = null,
  public var preferred: KotlinBoolean? = null,
  public var _preferred: Element? = null,
  public var language: List<CodeableConcept?>? = null,
  public var domain: List<CodeableConcept?>? = null,
  public var jurisdiction: List<CodeableConcept?>? = null,
  public var synonym: List<SubstanceDefinition.Name?>? = null,
  public var translation: List<SubstanceDefinition.Name?>? = null,
  public var official: List<SubstanceDefinition.Name.Official>? = null,
  public var source: List<Reference?>? = null,
) {
  public fun toModel(): SubstanceDefinition.Name =
    SubstanceDefinition.Name().apply {
      id = this@SubstanceDefinitionNameSurrogate.id
      extension = this@SubstanceDefinitionNameSurrogate.extension
      modifierExtension = this@SubstanceDefinitionNameSurrogate.modifierExtension
      name =
        R5String.of(
          this@SubstanceDefinitionNameSurrogate.name,
          this@SubstanceDefinitionNameSurrogate._name,
        )
      type = this@SubstanceDefinitionNameSurrogate.type
      status = this@SubstanceDefinitionNameSurrogate.status
      preferred =
        R5Boolean.of(
          this@SubstanceDefinitionNameSurrogate.preferred,
          this@SubstanceDefinitionNameSurrogate._preferred,
        )
      language = this@SubstanceDefinitionNameSurrogate.language
      domain = this@SubstanceDefinitionNameSurrogate.domain
      jurisdiction = this@SubstanceDefinitionNameSurrogate.jurisdiction
      synonym = this@SubstanceDefinitionNameSurrogate.synonym
      translation = this@SubstanceDefinitionNameSurrogate.translation
      official = this@SubstanceDefinitionNameSurrogate.official
      source = this@SubstanceDefinitionNameSurrogate.source
    }

  public companion object {
    public fun fromModel(model: SubstanceDefinition.Name): SubstanceDefinitionNameSurrogate =
      with(model) {
        SubstanceDefinitionNameSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          type = this@with.type
          status = this@with.status
          preferred = this@with.preferred?.value
          _preferred = this@with.preferred?.toElement()
          language = this@with.language
          domain = this@with.domain
          jurisdiction = this@with.jurisdiction
          synonym = this@with.synonym
          translation = this@with.translation
          official = this@with.official
          source = this@with.source
        }
      }
  }
}

@Serializable
internal data class SubstanceDefinitionRelationshipSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var substanceDefinitionReference: Reference? = null,
  public var substanceDefinitionCodeableConcept: CodeableConcept? = null,
  public var type: CodeableConcept? = null,
  public var isDefining: KotlinBoolean? = null,
  public var _isDefining: Element? = null,
  public var amountQuantity: Quantity? = null,
  public var amountRatio: Ratio? = null,
  public var amountString: KotlinString? = null,
  public var _amountString: Element? = null,
  public var ratioHighLimitAmount: Ratio? = null,
  public var comparator: CodeableConcept? = null,
  public var source: List<Reference?>? = null,
) {
  public fun toModel(): SubstanceDefinition.Relationship =
    SubstanceDefinition.Relationship().apply {
      id = this@SubstanceDefinitionRelationshipSurrogate.id
      extension = this@SubstanceDefinitionRelationshipSurrogate.extension
      modifierExtension = this@SubstanceDefinitionRelationshipSurrogate.modifierExtension
      substanceDefinition =
        SubstanceDefinition.Relationship.SubstanceDefinition?.from(
          this@SubstanceDefinitionRelationshipSurrogate.substanceDefinitionReference,
          this@SubstanceDefinitionRelationshipSurrogate.substanceDefinitionCodeableConcept,
        )
      type = this@SubstanceDefinitionRelationshipSurrogate.type
      isDefining =
        R5Boolean.of(
          this@SubstanceDefinitionRelationshipSurrogate.isDefining,
          this@SubstanceDefinitionRelationshipSurrogate._isDefining,
        )
      amount =
        SubstanceDefinition.Relationship.Amount?.from(
          this@SubstanceDefinitionRelationshipSurrogate.amountQuantity,
          this@SubstanceDefinitionRelationshipSurrogate.amountRatio,
          R5String.of(
            this@SubstanceDefinitionRelationshipSurrogate.amountString,
            this@SubstanceDefinitionRelationshipSurrogate._amountString,
          ),
        )
      ratioHighLimitAmount = this@SubstanceDefinitionRelationshipSurrogate.ratioHighLimitAmount
      comparator = this@SubstanceDefinitionRelationshipSurrogate.comparator
      source = this@SubstanceDefinitionRelationshipSurrogate.source
    }

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Relationship
    ): SubstanceDefinitionRelationshipSurrogate =
      with(model) {
        SubstanceDefinitionRelationshipSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          substanceDefinitionReference = this@with.substanceDefinition?.asReference()?.value
          substanceDefinitionCodeableConcept =
            this@with.substanceDefinition?.asCodeableConcept()?.value
          type = this@with.type
          isDefining = this@with.isDefining?.value
          _isDefining = this@with.isDefining?.toElement()
          amountQuantity = this@with.amount?.asQuantity()?.value
          amountRatio = this@with.amount?.asRatio()?.value
          amountString = this@with.amount?.asString()?.value?.value
          _amountString = this@with.amount?.asString()?.value?.toElement()
          ratioHighLimitAmount = this@with.ratioHighLimitAmount
          comparator = this@with.comparator
          source = this@with.source
        }
      }
  }
}

@Serializable
internal data class SubstanceDefinitionSourceMaterialSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var genus: CodeableConcept? = null,
  public var species: CodeableConcept? = null,
  public var part: CodeableConcept? = null,
  public var countryOfOrigin: List<CodeableConcept?>? = null,
) {
  public fun toModel(): SubstanceDefinition.SourceMaterial =
    SubstanceDefinition.SourceMaterial().apply {
      id = this@SubstanceDefinitionSourceMaterialSurrogate.id
      extension = this@SubstanceDefinitionSourceMaterialSurrogate.extension
      modifierExtension = this@SubstanceDefinitionSourceMaterialSurrogate.modifierExtension
      type = this@SubstanceDefinitionSourceMaterialSurrogate.type
      genus = this@SubstanceDefinitionSourceMaterialSurrogate.genus
      species = this@SubstanceDefinitionSourceMaterialSurrogate.species
      part = this@SubstanceDefinitionSourceMaterialSurrogate.part
      countryOfOrigin = this@SubstanceDefinitionSourceMaterialSurrogate.countryOfOrigin
    }

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.SourceMaterial
    ): SubstanceDefinitionSourceMaterialSurrogate =
      with(model) {
        SubstanceDefinitionSourceMaterialSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          genus = this@with.genus
          species = this@with.species
          part = this@with.part
          countryOfOrigin = this@with.countryOfOrigin
        }
      }
  }
}

@Serializable
internal data class SubstanceDefinitionSurrogate(
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
  public var identifier: List<Identifier?>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var status: CodeableConcept? = null,
  public var classification: List<CodeableConcept?>? = null,
  public var domain: CodeableConcept? = null,
  public var grade: List<CodeableConcept?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var informationSource: List<Reference?>? = null,
  public var note: List<Annotation?>? = null,
  public var manufacturer: List<Reference?>? = null,
  public var supplier: List<Reference?>? = null,
  public var moiety: List<SubstanceDefinition.Moiety>? = null,
  public var characterization: List<SubstanceDefinition.Characterization>? = null,
  public var `property`: List<SubstanceDefinition.Property>? = null,
  public var referenceInformation: Reference? = null,
  public var molecularWeight: List<SubstanceDefinition.MolecularWeight>? = null,
  public var structure: SubstanceDefinition.Structure? = null,
  public var code: List<SubstanceDefinition.Code>? = null,
  public var name: List<SubstanceDefinition.Name>? = null,
  public var relationship: List<SubstanceDefinition.Relationship>? = null,
  public var nucleicAcid: Reference? = null,
  public var polymer: Reference? = null,
  public var protein: Reference? = null,
  public var sourceMaterial: SubstanceDefinition.SourceMaterial? = null,
) {
  public fun toModel(): SubstanceDefinition =
    SubstanceDefinition().apply {
      id = this@SubstanceDefinitionSurrogate.id
      meta = this@SubstanceDefinitionSurrogate.meta
      implicitRules =
        Uri.of(
          this@SubstanceDefinitionSurrogate.implicitRules,
          this@SubstanceDefinitionSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@SubstanceDefinitionSurrogate.language,
          this@SubstanceDefinitionSurrogate._language,
        )
      text = this@SubstanceDefinitionSurrogate.text
      contained = this@SubstanceDefinitionSurrogate.contained
      extension = this@SubstanceDefinitionSurrogate.extension
      modifierExtension = this@SubstanceDefinitionSurrogate.modifierExtension
      identifier = this@SubstanceDefinitionSurrogate.identifier
      version =
        R5String.of(
          this@SubstanceDefinitionSurrogate.version,
          this@SubstanceDefinitionSurrogate._version,
        )
      status = this@SubstanceDefinitionSurrogate.status
      classification = this@SubstanceDefinitionSurrogate.classification
      domain = this@SubstanceDefinitionSurrogate.domain
      grade = this@SubstanceDefinitionSurrogate.grade
      description =
        Markdown.of(
          this@SubstanceDefinitionSurrogate.description,
          this@SubstanceDefinitionSurrogate._description,
        )
      informationSource = this@SubstanceDefinitionSurrogate.informationSource
      note = this@SubstanceDefinitionSurrogate.note
      manufacturer = this@SubstanceDefinitionSurrogate.manufacturer
      supplier = this@SubstanceDefinitionSurrogate.supplier
      moiety = this@SubstanceDefinitionSurrogate.moiety
      characterization = this@SubstanceDefinitionSurrogate.characterization
      `property` = this@SubstanceDefinitionSurrogate.`property`
      referenceInformation = this@SubstanceDefinitionSurrogate.referenceInformation
      molecularWeight = this@SubstanceDefinitionSurrogate.molecularWeight
      structure = this@SubstanceDefinitionSurrogate.structure
      code = this@SubstanceDefinitionSurrogate.code
      name = this@SubstanceDefinitionSurrogate.name
      relationship = this@SubstanceDefinitionSurrogate.relationship
      nucleicAcid = this@SubstanceDefinitionSurrogate.nucleicAcid
      polymer = this@SubstanceDefinitionSurrogate.polymer
      protein = this@SubstanceDefinitionSurrogate.protein
      sourceMaterial = this@SubstanceDefinitionSurrogate.sourceMaterial
    }

  public companion object {
    public fun fromModel(model: SubstanceDefinition): SubstanceDefinitionSurrogate =
      with(model) {
        SubstanceDefinitionSurrogate().apply {
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
          identifier = this@with.identifier
          version = this@with.version?.value
          _version = this@with.version?.toElement()
          status = this@with.status
          classification = this@with.classification
          domain = this@with.domain
          grade = this@with.grade
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          informationSource = this@with.informationSource
          note = this@with.note
          manufacturer = this@with.manufacturer
          supplier = this@with.supplier
          moiety = this@with.moiety
          characterization = this@with.characterization
          `property` = this@with.`property`
          referenceInformation = this@with.referenceInformation
          molecularWeight = this@with.molecularWeight
          structure = this@with.structure
          code = this@with.code
          name = this@with.name
          relationship = this@with.relationship
          nucleicAcid = this@with.nucleicAcid
          polymer = this@with.polymer
          protein = this@with.protein
          sourceMaterial = this@with.sourceMaterial
        }
      }
  }
}
