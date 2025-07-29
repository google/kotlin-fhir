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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SubstanceDefinitionMoietyAmountSurrogate(
  public var amountQuantity: Quantity? = null,
  public var amountString: KotlinString? = null,
  public var _amountString: Element? = null,
) {
  public fun toModel(): SubstanceDefinition.Moiety.Amount? =
    SubstanceDefinition.Moiety.Amount?.from(
      this@SubstanceDefinitionMoietyAmountSurrogate.amountQuantity,
      R5String.of(
        this@SubstanceDefinitionMoietyAmountSurrogate.amountString,
        this@SubstanceDefinitionMoietyAmountSurrogate._amountString,
      ),
    )

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Moiety.Amount
    ): SubstanceDefinitionMoietyAmountSurrogate =
      with(model) {
        SubstanceDefinitionMoietyAmountSurrogate(
          amountQuantity = this@with.asQuantity()?.value,
          amountString = this@with.asString()?.value?.value,
          _amountString = this@with.asString()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class SubstanceDefinitionMoietySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var role: CodeableConcept? = null,
  public var identifier: Identifier? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var stereochemistry: CodeableConcept? = null,
  public var opticalActivity: CodeableConcept? = null,
  public var molecularFormula: KotlinString? = null,
  public var _molecularFormula: Element? = null,
  public var measurementType: CodeableConcept? = null,
  public var amount: SubstanceDefinition.Moiety.Amount? = null,
) {
  public fun toModel(): SubstanceDefinition.Moiety =
    SubstanceDefinition.Moiety(
      id = this@SubstanceDefinitionMoietySurrogate.id,
      extension = this@SubstanceDefinitionMoietySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceDefinitionMoietySurrogate.modifierExtension ?: mutableListOf(),
      role = this@SubstanceDefinitionMoietySurrogate.role,
      identifier = this@SubstanceDefinitionMoietySurrogate.identifier,
      name =
        R5String.of(
          this@SubstanceDefinitionMoietySurrogate.name,
          this@SubstanceDefinitionMoietySurrogate._name,
        ),
      stereochemistry = this@SubstanceDefinitionMoietySurrogate.stereochemistry,
      opticalActivity = this@SubstanceDefinitionMoietySurrogate.opticalActivity,
      molecularFormula =
        R5String.of(
          this@SubstanceDefinitionMoietySurrogate.molecularFormula,
          this@SubstanceDefinitionMoietySurrogate._molecularFormula,
        ),
      amount = this@SubstanceDefinitionMoietySurrogate.amount,
      measurementType = this@SubstanceDefinitionMoietySurrogate.measurementType,
    )

  public companion object {
    public fun fromModel(model: SubstanceDefinition.Moiety): SubstanceDefinitionMoietySurrogate =
      with(model) {
        SubstanceDefinitionMoietySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          role = this@with.role,
          identifier = this@with.identifier,
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          stereochemistry = this@with.stereochemistry,
          opticalActivity = this@with.opticalActivity,
          molecularFormula = this@with.molecularFormula?.value,
          _molecularFormula = this@with.molecularFormula?.toElement(),
          amount = this@with.amount,
          measurementType = this@with.measurementType,
        )
      }
  }
}

@Serializable
internal data class SubstanceDefinitionCharacterizationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var technique: CodeableConcept? = null,
  public var form: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var `file`: MutableList<Attachment>? = null,
) {
  public fun toModel(): SubstanceDefinition.Characterization =
    SubstanceDefinition.Characterization(
      id = this@SubstanceDefinitionCharacterizationSurrogate.id,
      extension = this@SubstanceDefinitionCharacterizationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceDefinitionCharacterizationSurrogate.modifierExtension ?: mutableListOf(),
      technique = this@SubstanceDefinitionCharacterizationSurrogate.technique,
      form = this@SubstanceDefinitionCharacterizationSurrogate.form,
      description =
        Markdown.of(
          this@SubstanceDefinitionCharacterizationSurrogate.description,
          this@SubstanceDefinitionCharacterizationSurrogate._description,
        ),
      `file` = this@SubstanceDefinitionCharacterizationSurrogate.`file` ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Characterization
    ): SubstanceDefinitionCharacterizationSurrogate =
      with(model) {
        SubstanceDefinitionCharacterizationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          technique = this@with.technique,
          form = this@with.form,
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          `file` = this@with.`file`.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class SubstanceDefinitionPropertyValueSurrogate(
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueDate: KotlinString? = null,
  public var _valueDate: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueAttachment: Attachment? = null,
) {
  public fun toModel(): SubstanceDefinition.Property.Value? =
    SubstanceDefinition.Property.Value?.from(
      this@SubstanceDefinitionPropertyValueSurrogate.valueCodeableConcept,
      this@SubstanceDefinitionPropertyValueSurrogate.valueQuantity,
      Date.of(
        FhirDate.fromString(this@SubstanceDefinitionPropertyValueSurrogate.valueDate),
        this@SubstanceDefinitionPropertyValueSurrogate._valueDate,
      ),
      R5Boolean.of(
        this@SubstanceDefinitionPropertyValueSurrogate.valueBoolean,
        this@SubstanceDefinitionPropertyValueSurrogate._valueBoolean,
      ),
      this@SubstanceDefinitionPropertyValueSurrogate.valueAttachment,
    )

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Property.Value
    ): SubstanceDefinitionPropertyValueSurrogate =
      with(model) {
        SubstanceDefinitionPropertyValueSurrogate(
          valueCodeableConcept = this@with.asCodeableConcept()?.value,
          valueQuantity = this@with.asQuantity()?.value,
          valueDate = this@with.asDate()?.value?.value?.toString(),
          _valueDate = this@with.asDate()?.value?.toElement(),
          valueBoolean = this@with.asBoolean()?.value?.value,
          _valueBoolean = this@with.asBoolean()?.value?.toElement(),
          valueAttachment = this@with.asAttachment()?.value,
        )
      }
  }
}

@Serializable
internal data class SubstanceDefinitionPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var `value`: SubstanceDefinition.Property.Value? = null,
) {
  public fun toModel(): SubstanceDefinition.Property =
    SubstanceDefinition.Property(
      id = this@SubstanceDefinitionPropertySurrogate.id,
      extension = this@SubstanceDefinitionPropertySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceDefinitionPropertySurrogate.modifierExtension ?: mutableListOf(),
      type = this@SubstanceDefinitionPropertySurrogate.type,
      `value` = this@SubstanceDefinitionPropertySurrogate.`value`,
    )

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Property
    ): SubstanceDefinitionPropertySurrogate =
      with(model) {
        SubstanceDefinitionPropertySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class SubstanceDefinitionMolecularWeightSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var method: CodeableConcept? = null,
  public var type: CodeableConcept? = null,
  public var amount: Quantity,
) {
  public fun toModel(): SubstanceDefinition.MolecularWeight =
    SubstanceDefinition.MolecularWeight(
      id = this@SubstanceDefinitionMolecularWeightSurrogate.id,
      extension = this@SubstanceDefinitionMolecularWeightSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceDefinitionMolecularWeightSurrogate.modifierExtension ?: mutableListOf(),
      method = this@SubstanceDefinitionMolecularWeightSurrogate.method,
      type = this@SubstanceDefinitionMolecularWeightSurrogate.type,
      amount = this@SubstanceDefinitionMolecularWeightSurrogate.amount,
    )

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.MolecularWeight
    ): SubstanceDefinitionMolecularWeightSurrogate =
      with(model) {
        SubstanceDefinitionMolecularWeightSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          method = this@with.method,
          type = this@with.type,
          amount = this@with.amount,
        )
      }
  }
}

@Serializable
internal data class SubstanceDefinitionStructureRepresentationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var representation: KotlinString? = null,
  public var _representation: Element? = null,
  public var format: CodeableConcept? = null,
  public var document: Reference? = null,
) {
  public fun toModel(): SubstanceDefinition.Structure.Representation =
    SubstanceDefinition.Structure.Representation(
      id = this@SubstanceDefinitionStructureRepresentationSurrogate.id,
      extension =
        this@SubstanceDefinitionStructureRepresentationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceDefinitionStructureRepresentationSurrogate.modifierExtension
          ?: mutableListOf(),
      type = this@SubstanceDefinitionStructureRepresentationSurrogate.type,
      representation =
        R5String.of(
          this@SubstanceDefinitionStructureRepresentationSurrogate.representation,
          this@SubstanceDefinitionStructureRepresentationSurrogate._representation,
        ),
      format = this@SubstanceDefinitionStructureRepresentationSurrogate.format,
      document = this@SubstanceDefinitionStructureRepresentationSurrogate.document,
    )

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Structure.Representation
    ): SubstanceDefinitionStructureRepresentationSurrogate =
      with(model) {
        SubstanceDefinitionStructureRepresentationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          representation = this@with.representation?.value,
          _representation = this@with.representation?.toElement(),
          format = this@with.format,
          document = this@with.document,
        )
      }
  }
}

@Serializable
internal data class SubstanceDefinitionStructureSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var stereochemistry: CodeableConcept? = null,
  public var opticalActivity: CodeableConcept? = null,
  public var molecularFormula: KotlinString? = null,
  public var _molecularFormula: Element? = null,
  public var molecularFormulaByMoiety: KotlinString? = null,
  public var _molecularFormulaByMoiety: Element? = null,
  public var molecularWeight: SubstanceDefinition.MolecularWeight? = null,
  public var technique: MutableList<CodeableConcept>? = null,
  public var sourceDocument: MutableList<Reference>? = null,
  public var representation: MutableList<SubstanceDefinition.Structure.Representation>? = null,
) {
  public fun toModel(): SubstanceDefinition.Structure =
    SubstanceDefinition.Structure(
      id = this@SubstanceDefinitionStructureSurrogate.id,
      extension = this@SubstanceDefinitionStructureSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceDefinitionStructureSurrogate.modifierExtension ?: mutableListOf(),
      stereochemistry = this@SubstanceDefinitionStructureSurrogate.stereochemistry,
      opticalActivity = this@SubstanceDefinitionStructureSurrogate.opticalActivity,
      molecularFormula =
        R5String.of(
          this@SubstanceDefinitionStructureSurrogate.molecularFormula,
          this@SubstanceDefinitionStructureSurrogate._molecularFormula,
        ),
      molecularFormulaByMoiety =
        R5String.of(
          this@SubstanceDefinitionStructureSurrogate.molecularFormulaByMoiety,
          this@SubstanceDefinitionStructureSurrogate._molecularFormulaByMoiety,
        ),
      molecularWeight = this@SubstanceDefinitionStructureSurrogate.molecularWeight,
      technique = this@SubstanceDefinitionStructureSurrogate.technique ?: mutableListOf(),
      sourceDocument = this@SubstanceDefinitionStructureSurrogate.sourceDocument ?: mutableListOf(),
      representation = this@SubstanceDefinitionStructureSurrogate.representation ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Structure
    ): SubstanceDefinitionStructureSurrogate =
      with(model) {
        SubstanceDefinitionStructureSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          stereochemistry = this@with.stereochemistry,
          opticalActivity = this@with.opticalActivity,
          molecularFormula = this@with.molecularFormula?.value,
          _molecularFormula = this@with.molecularFormula?.toElement(),
          molecularFormulaByMoiety = this@with.molecularFormulaByMoiety?.value,
          _molecularFormulaByMoiety = this@with.molecularFormulaByMoiety?.toElement(),
          molecularWeight = this@with.molecularWeight,
          technique = this@with.technique.takeUnless { it.all { it == null } },
          sourceDocument = this@with.sourceDocument.takeUnless { it.all { it == null } },
          representation = this@with.representation.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class SubstanceDefinitionCodeSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept? = null,
  public var status: CodeableConcept? = null,
  public var statusDate: KotlinString? = null,
  public var _statusDate: Element? = null,
  public var note: MutableList<Annotation>? = null,
  public var source: MutableList<Reference>? = null,
) {
  public fun toModel(): SubstanceDefinition.Code =
    SubstanceDefinition.Code(
      id = this@SubstanceDefinitionCodeSurrogate.id,
      extension = this@SubstanceDefinitionCodeSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceDefinitionCodeSurrogate.modifierExtension ?: mutableListOf(),
      code = this@SubstanceDefinitionCodeSurrogate.code,
      status = this@SubstanceDefinitionCodeSurrogate.status,
      statusDate =
        DateTime.of(
          FhirDateTime.fromString(this@SubstanceDefinitionCodeSurrogate.statusDate),
          this@SubstanceDefinitionCodeSurrogate._statusDate,
        ),
      note = this@SubstanceDefinitionCodeSurrogate.note ?: mutableListOf(),
      source = this@SubstanceDefinitionCodeSurrogate.source ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: SubstanceDefinition.Code): SubstanceDefinitionCodeSurrogate =
      with(model) {
        SubstanceDefinitionCodeSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          status = this@with.status,
          statusDate = this@with.statusDate?.value?.toString(),
          _statusDate = this@with.statusDate?.toElement(),
          note = this@with.note.takeUnless { it.all { it == null } },
          source = this@with.source.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class SubstanceDefinitionNameOfficialSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var authority: CodeableConcept? = null,
  public var status: CodeableConcept? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
) {
  public fun toModel(): SubstanceDefinition.Name.Official =
    SubstanceDefinition.Name.Official(
      id = this@SubstanceDefinitionNameOfficialSurrogate.id,
      extension = this@SubstanceDefinitionNameOfficialSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceDefinitionNameOfficialSurrogate.modifierExtension ?: mutableListOf(),
      authority = this@SubstanceDefinitionNameOfficialSurrogate.authority,
      status = this@SubstanceDefinitionNameOfficialSurrogate.status,
      date =
        DateTime.of(
          FhirDateTime.fromString(this@SubstanceDefinitionNameOfficialSurrogate.date),
          this@SubstanceDefinitionNameOfficialSurrogate._date,
        ),
    )

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Name.Official
    ): SubstanceDefinitionNameOfficialSurrogate =
      with(model) {
        SubstanceDefinitionNameOfficialSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          authority = this@with.authority,
          status = this@with.status,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
        )
      }
  }
}

@Serializable
internal data class SubstanceDefinitionNameSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var type: CodeableConcept? = null,
  public var status: CodeableConcept? = null,
  public var preferred: KotlinBoolean? = null,
  public var _preferred: Element? = null,
  public var language: MutableList<CodeableConcept>? = null,
  public var domain: MutableList<CodeableConcept>? = null,
  public var jurisdiction: MutableList<CodeableConcept>? = null,
  public var synonym: MutableList<SubstanceDefinition.Name>? = null,
  public var translation: MutableList<SubstanceDefinition.Name>? = null,
  public var official: MutableList<SubstanceDefinition.Name.Official>? = null,
  public var source: MutableList<Reference>? = null,
) {
  public fun toModel(): SubstanceDefinition.Name =
    SubstanceDefinition.Name(
      id = this@SubstanceDefinitionNameSurrogate.id,
      extension = this@SubstanceDefinitionNameSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceDefinitionNameSurrogate.modifierExtension ?: mutableListOf(),
      name =
        R5String.of(
          this@SubstanceDefinitionNameSurrogate.name,
          this@SubstanceDefinitionNameSurrogate._name,
        )!!,
      type = this@SubstanceDefinitionNameSurrogate.type,
      status = this@SubstanceDefinitionNameSurrogate.status,
      preferred =
        R5Boolean.of(
          this@SubstanceDefinitionNameSurrogate.preferred,
          this@SubstanceDefinitionNameSurrogate._preferred,
        ),
      language = this@SubstanceDefinitionNameSurrogate.language ?: mutableListOf(),
      domain = this@SubstanceDefinitionNameSurrogate.domain ?: mutableListOf(),
      jurisdiction = this@SubstanceDefinitionNameSurrogate.jurisdiction ?: mutableListOf(),
      synonym = this@SubstanceDefinitionNameSurrogate.synonym ?: mutableListOf(),
      translation = this@SubstanceDefinitionNameSurrogate.translation ?: mutableListOf(),
      official = this@SubstanceDefinitionNameSurrogate.official ?: mutableListOf(),
      source = this@SubstanceDefinitionNameSurrogate.source ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: SubstanceDefinition.Name): SubstanceDefinitionNameSurrogate =
      with(model) {
        SubstanceDefinitionNameSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          type = this@with.type,
          status = this@with.status,
          preferred = this@with.preferred?.value,
          _preferred = this@with.preferred?.toElement(),
          language = this@with.language.takeUnless { it.all { it == null } },
          domain = this@with.domain.takeUnless { it.all { it == null } },
          jurisdiction = this@with.jurisdiction.takeUnless { it.all { it == null } },
          synonym = this@with.synonym.takeUnless { it.all { it == null } },
          translation = this@with.translation.takeUnless { it.all { it == null } },
          official = this@with.official.takeUnless { it.all { it == null } },
          source = this@with.source.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class SubstanceDefinitionRelationshipSubstanceDefinitionSurrogate(
  public var substanceDefinitionReference: Reference? = null,
  public var substanceDefinitionCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): SubstanceDefinition.Relationship.SubstanceDefinition? =
    SubstanceDefinition.Relationship.SubstanceDefinition?.from(
      this@SubstanceDefinitionRelationshipSubstanceDefinitionSurrogate.substanceDefinitionReference,
      this@SubstanceDefinitionRelationshipSubstanceDefinitionSurrogate
        .substanceDefinitionCodeableConcept,
    )

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Relationship.SubstanceDefinition
    ): SubstanceDefinitionRelationshipSubstanceDefinitionSurrogate =
      with(model) {
        SubstanceDefinitionRelationshipSubstanceDefinitionSurrogate(
          substanceDefinitionReference = this@with.asReference()?.value,
          substanceDefinitionCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class SubstanceDefinitionRelationshipAmountSurrogate(
  public var amountQuantity: Quantity? = null,
  public var amountRatio: Ratio? = null,
  public var amountString: KotlinString? = null,
  public var _amountString: Element? = null,
) {
  public fun toModel(): SubstanceDefinition.Relationship.Amount? =
    SubstanceDefinition.Relationship.Amount?.from(
      this@SubstanceDefinitionRelationshipAmountSurrogate.amountQuantity,
      this@SubstanceDefinitionRelationshipAmountSurrogate.amountRatio,
      R5String.of(
        this@SubstanceDefinitionRelationshipAmountSurrogate.amountString,
        this@SubstanceDefinitionRelationshipAmountSurrogate._amountString,
      ),
    )

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Relationship.Amount
    ): SubstanceDefinitionRelationshipAmountSurrogate =
      with(model) {
        SubstanceDefinitionRelationshipAmountSurrogate(
          amountQuantity = this@with.asQuantity()?.value,
          amountRatio = this@with.asRatio()?.value,
          amountString = this@with.asString()?.value?.value,
          _amountString = this@with.asString()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class SubstanceDefinitionRelationshipSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var isDefining: KotlinBoolean? = null,
  public var _isDefining: Element? = null,
  public var ratioHighLimitAmount: Ratio? = null,
  public var comparator: CodeableConcept? = null,
  public var source: MutableList<Reference>? = null,
  public var substanceDefinition: SubstanceDefinition.Relationship.SubstanceDefinition? = null,
  public var amount: SubstanceDefinition.Relationship.Amount? = null,
) {
  public fun toModel(): SubstanceDefinition.Relationship =
    SubstanceDefinition.Relationship(
      id = this@SubstanceDefinitionRelationshipSurrogate.id,
      extension = this@SubstanceDefinitionRelationshipSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceDefinitionRelationshipSurrogate.modifierExtension ?: mutableListOf(),
      substanceDefinition = this@SubstanceDefinitionRelationshipSurrogate.substanceDefinition,
      type = this@SubstanceDefinitionRelationshipSurrogate.type,
      isDefining =
        R5Boolean.of(
          this@SubstanceDefinitionRelationshipSurrogate.isDefining,
          this@SubstanceDefinitionRelationshipSurrogate._isDefining,
        ),
      amount = this@SubstanceDefinitionRelationshipSurrogate.amount,
      ratioHighLimitAmount = this@SubstanceDefinitionRelationshipSurrogate.ratioHighLimitAmount,
      comparator = this@SubstanceDefinitionRelationshipSurrogate.comparator,
      source = this@SubstanceDefinitionRelationshipSurrogate.source ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.Relationship
    ): SubstanceDefinitionRelationshipSurrogate =
      with(model) {
        SubstanceDefinitionRelationshipSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          substanceDefinition = this@with.substanceDefinition,
          type = this@with.type,
          isDefining = this@with.isDefining?.value,
          _isDefining = this@with.isDefining?.toElement(),
          amount = this@with.amount,
          ratioHighLimitAmount = this@with.ratioHighLimitAmount,
          comparator = this@with.comparator,
          source = this@with.source.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class SubstanceDefinitionSourceMaterialSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var genus: CodeableConcept? = null,
  public var species: CodeableConcept? = null,
  public var part: CodeableConcept? = null,
  public var countryOfOrigin: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): SubstanceDefinition.SourceMaterial =
    SubstanceDefinition.SourceMaterial(
      id = this@SubstanceDefinitionSourceMaterialSurrogate.id,
      extension = this@SubstanceDefinitionSourceMaterialSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceDefinitionSourceMaterialSurrogate.modifierExtension ?: mutableListOf(),
      type = this@SubstanceDefinitionSourceMaterialSurrogate.type,
      genus = this@SubstanceDefinitionSourceMaterialSurrogate.genus,
      species = this@SubstanceDefinitionSourceMaterialSurrogate.species,
      part = this@SubstanceDefinitionSourceMaterialSurrogate.part,
      countryOfOrigin =
        this@SubstanceDefinitionSourceMaterialSurrogate.countryOfOrigin ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: SubstanceDefinition.SourceMaterial
    ): SubstanceDefinitionSourceMaterialSurrogate =
      with(model) {
        SubstanceDefinitionSourceMaterialSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          genus = this@with.genus,
          species = this@with.species,
          part = this@with.part,
          countryOfOrigin = this@with.countryOfOrigin.takeUnless { it.all { it == null } },
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var status: CodeableConcept? = null,
  public var classification: MutableList<CodeableConcept>? = null,
  public var domain: CodeableConcept? = null,
  public var grade: MutableList<CodeableConcept>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var informationSource: MutableList<Reference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var manufacturer: MutableList<Reference>? = null,
  public var supplier: MutableList<Reference>? = null,
  public var moiety: MutableList<SubstanceDefinition.Moiety>? = null,
  public var characterization: MutableList<SubstanceDefinition.Characterization>? = null,
  public var `property`: MutableList<SubstanceDefinition.Property>? = null,
  public var referenceInformation: Reference? = null,
  public var molecularWeight: MutableList<SubstanceDefinition.MolecularWeight>? = null,
  public var structure: SubstanceDefinition.Structure? = null,
  public var code: MutableList<SubstanceDefinition.Code>? = null,
  public var name: MutableList<SubstanceDefinition.Name>? = null,
  public var relationship: MutableList<SubstanceDefinition.Relationship>? = null,
  public var nucleicAcid: Reference? = null,
  public var polymer: Reference? = null,
  public var protein: Reference? = null,
  public var sourceMaterial: SubstanceDefinition.SourceMaterial? = null,
) {
  public fun toModel(): SubstanceDefinition =
    SubstanceDefinition(
      id = this@SubstanceDefinitionSurrogate.id,
      meta = this@SubstanceDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@SubstanceDefinitionSurrogate.implicitRules,
          this@SubstanceDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@SubstanceDefinitionSurrogate.language,
          this@SubstanceDefinitionSurrogate._language,
        ),
      text = this@SubstanceDefinitionSurrogate.text,
      contained = this@SubstanceDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@SubstanceDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@SubstanceDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@SubstanceDefinitionSurrogate.identifier ?: mutableListOf(),
      version =
        R5String.of(
          this@SubstanceDefinitionSurrogate.version,
          this@SubstanceDefinitionSurrogate._version,
        ),
      status = this@SubstanceDefinitionSurrogate.status,
      classification = this@SubstanceDefinitionSurrogate.classification ?: mutableListOf(),
      domain = this@SubstanceDefinitionSurrogate.domain,
      grade = this@SubstanceDefinitionSurrogate.grade ?: mutableListOf(),
      description =
        Markdown.of(
          this@SubstanceDefinitionSurrogate.description,
          this@SubstanceDefinitionSurrogate._description,
        ),
      informationSource = this@SubstanceDefinitionSurrogate.informationSource ?: mutableListOf(),
      note = this@SubstanceDefinitionSurrogate.note ?: mutableListOf(),
      manufacturer = this@SubstanceDefinitionSurrogate.manufacturer ?: mutableListOf(),
      supplier = this@SubstanceDefinitionSurrogate.supplier ?: mutableListOf(),
      moiety = this@SubstanceDefinitionSurrogate.moiety ?: mutableListOf(),
      characterization = this@SubstanceDefinitionSurrogate.characterization ?: mutableListOf(),
      `property` = this@SubstanceDefinitionSurrogate.`property` ?: mutableListOf(),
      referenceInformation = this@SubstanceDefinitionSurrogate.referenceInformation,
      molecularWeight = this@SubstanceDefinitionSurrogate.molecularWeight ?: mutableListOf(),
      structure = this@SubstanceDefinitionSurrogate.structure,
      code = this@SubstanceDefinitionSurrogate.code ?: mutableListOf(),
      name = this@SubstanceDefinitionSurrogate.name ?: mutableListOf(),
      relationship = this@SubstanceDefinitionSurrogate.relationship ?: mutableListOf(),
      nucleicAcid = this@SubstanceDefinitionSurrogate.nucleicAcid,
      polymer = this@SubstanceDefinitionSurrogate.polymer,
      protein = this@SubstanceDefinitionSurrogate.protein,
      sourceMaterial = this@SubstanceDefinitionSurrogate.sourceMaterial,
    )

  public companion object {
    public fun fromModel(model: SubstanceDefinition): SubstanceDefinitionSurrogate =
      with(model) {
        SubstanceDefinitionSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeUnless { it.all { it == null } },
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          status = this@with.status,
          classification = this@with.classification.takeUnless { it.all { it == null } },
          domain = this@with.domain,
          grade = this@with.grade.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          informationSource = this@with.informationSource.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          manufacturer = this@with.manufacturer.takeUnless { it.all { it == null } },
          supplier = this@with.supplier.takeUnless { it.all { it == null } },
          moiety = this@with.moiety.takeUnless { it.all { it == null } },
          characterization = this@with.characterization.takeUnless { it.all { it == null } },
          `property` = this@with.`property`.takeUnless { it.all { it == null } },
          referenceInformation = this@with.referenceInformation,
          molecularWeight = this@with.molecularWeight.takeUnless { it.all { it == null } },
          structure = this@with.structure,
          code = this@with.code.takeUnless { it.all { it == null } },
          name = this@with.name.takeUnless { it.all { it == null } },
          relationship = this@with.relationship.takeUnless { it.all { it == null } },
          nucleicAcid = this@with.nucleicAcid,
          polymer = this@with.polymer,
          protein = this@with.protein,
          sourceMaterial = this@with.sourceMaterial,
        )
      }
  }
}
