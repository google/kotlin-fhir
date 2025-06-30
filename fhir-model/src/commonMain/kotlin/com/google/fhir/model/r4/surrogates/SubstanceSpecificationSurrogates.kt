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

package com.google.fhir.model.r4.surrogates

import com.google.fhir.model.r4.Attachment
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Range
import com.google.fhir.model.r4.Ratio
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.SubstanceSpecification
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SubstanceSpecificationMoietySurrogate(
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
) {
  public fun toModel(): SubstanceSpecification.Moiety =
    SubstanceSpecification.Moiety().apply {
      id = this@SubstanceSpecificationMoietySurrogate.id
      extension = this@SubstanceSpecificationMoietySurrogate.extension
      modifierExtension = this@SubstanceSpecificationMoietySurrogate.modifierExtension
      role = this@SubstanceSpecificationMoietySurrogate.role
      identifier = this@SubstanceSpecificationMoietySurrogate.identifier
      name =
        R4String.of(
          this@SubstanceSpecificationMoietySurrogate.name,
          this@SubstanceSpecificationMoietySurrogate._name,
        )
      stereochemistry = this@SubstanceSpecificationMoietySurrogate.stereochemistry
      opticalActivity = this@SubstanceSpecificationMoietySurrogate.opticalActivity
      molecularFormula =
        R4String.of(
          this@SubstanceSpecificationMoietySurrogate.molecularFormula,
          this@SubstanceSpecificationMoietySurrogate._molecularFormula,
        )
      amount =
        SubstanceSpecification.Moiety.Amount?.from(
          this@SubstanceSpecificationMoietySurrogate.amountQuantity,
          R4String.of(
            this@SubstanceSpecificationMoietySurrogate.amountString,
            this@SubstanceSpecificationMoietySurrogate._amountString,
          ),
        )
    }

  public companion object {
    public fun fromModel(
      model: SubstanceSpecification.Moiety
    ): SubstanceSpecificationMoietySurrogate =
      with(model) {
        SubstanceSpecificationMoietySurrogate().apply {
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
        }
      }
  }
}

@Serializable
internal data class SubstanceSpecificationPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var category: CodeableConcept? = null,
  public var code: CodeableConcept? = null,
  public var parameters: KotlinString? = null,
  public var _parameters: Element? = null,
  public var definingSubstanceReference: Reference? = null,
  public var definingSubstanceCodeableConcept: CodeableConcept? = null,
  public var amountQuantity: Quantity? = null,
  public var amountString: KotlinString? = null,
  public var _amountString: Element? = null,
) {
  public fun toModel(): SubstanceSpecification.Property =
    SubstanceSpecification.Property().apply {
      id = this@SubstanceSpecificationPropertySurrogate.id
      extension = this@SubstanceSpecificationPropertySurrogate.extension
      modifierExtension = this@SubstanceSpecificationPropertySurrogate.modifierExtension
      category = this@SubstanceSpecificationPropertySurrogate.category
      code = this@SubstanceSpecificationPropertySurrogate.code
      parameters =
        R4String.of(
          this@SubstanceSpecificationPropertySurrogate.parameters,
          this@SubstanceSpecificationPropertySurrogate._parameters,
        )
      definingSubstance =
        SubstanceSpecification.Property.DefiningSubstance?.from(
          this@SubstanceSpecificationPropertySurrogate.definingSubstanceReference,
          this@SubstanceSpecificationPropertySurrogate.definingSubstanceCodeableConcept,
        )
      amount =
        SubstanceSpecification.Property.Amount?.from(
          this@SubstanceSpecificationPropertySurrogate.amountQuantity,
          R4String.of(
            this@SubstanceSpecificationPropertySurrogate.amountString,
            this@SubstanceSpecificationPropertySurrogate._amountString,
          ),
        )
    }

  public companion object {
    public fun fromModel(
      model: SubstanceSpecification.Property
    ): SubstanceSpecificationPropertySurrogate =
      with(model) {
        SubstanceSpecificationPropertySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          category = this@with.category
          code = this@with.code
          parameters = this@with.parameters?.value
          _parameters = this@with.parameters?.toElement()
          definingSubstanceReference = this@with.definingSubstance?.asReference()?.value
          definingSubstanceCodeableConcept = this@with.definingSubstance?.asCodeableConcept()?.value
          amountQuantity = this@with.amount?.asQuantity()?.value
          amountString = this@with.amount?.asString()?.value?.value
          _amountString = this@with.amount?.asString()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class SubstanceSpecificationStructureIsotopeMolecularWeightSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var method: CodeableConcept? = null,
  public var type: CodeableConcept? = null,
  public var amount: Quantity? = null,
) {
  public fun toModel(): SubstanceSpecification.Structure.Isotope.MolecularWeight =
    SubstanceSpecification.Structure.Isotope.MolecularWeight().apply {
      id = this@SubstanceSpecificationStructureIsotopeMolecularWeightSurrogate.id
      extension = this@SubstanceSpecificationStructureIsotopeMolecularWeightSurrogate.extension
      modifierExtension =
        this@SubstanceSpecificationStructureIsotopeMolecularWeightSurrogate.modifierExtension
      method = this@SubstanceSpecificationStructureIsotopeMolecularWeightSurrogate.method
      type = this@SubstanceSpecificationStructureIsotopeMolecularWeightSurrogate.type
      amount = this@SubstanceSpecificationStructureIsotopeMolecularWeightSurrogate.amount
    }

  public companion object {
    public fun fromModel(
      model: SubstanceSpecification.Structure.Isotope.MolecularWeight
    ): SubstanceSpecificationStructureIsotopeMolecularWeightSurrogate =
      with(model) {
        SubstanceSpecificationStructureIsotopeMolecularWeightSurrogate().apply {
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
internal data class SubstanceSpecificationStructureIsotopeSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: Identifier? = null,
  public var name: CodeableConcept? = null,
  public var substitution: CodeableConcept? = null,
  public var halfLife: Quantity? = null,
  public var molecularWeight: SubstanceSpecification.Structure.Isotope.MolecularWeight? = null,
) {
  public fun toModel(): SubstanceSpecification.Structure.Isotope =
    SubstanceSpecification.Structure.Isotope().apply {
      id = this@SubstanceSpecificationStructureIsotopeSurrogate.id
      extension = this@SubstanceSpecificationStructureIsotopeSurrogate.extension
      modifierExtension = this@SubstanceSpecificationStructureIsotopeSurrogate.modifierExtension
      identifier = this@SubstanceSpecificationStructureIsotopeSurrogate.identifier
      name = this@SubstanceSpecificationStructureIsotopeSurrogate.name
      substitution = this@SubstanceSpecificationStructureIsotopeSurrogate.substitution
      halfLife = this@SubstanceSpecificationStructureIsotopeSurrogate.halfLife
      molecularWeight = this@SubstanceSpecificationStructureIsotopeSurrogate.molecularWeight
    }

  public companion object {
    public fun fromModel(
      model: SubstanceSpecification.Structure.Isotope
    ): SubstanceSpecificationStructureIsotopeSurrogate =
      with(model) {
        SubstanceSpecificationStructureIsotopeSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          name = this@with.name
          substitution = this@with.substitution
          halfLife = this@with.halfLife
          molecularWeight = this@with.molecularWeight
        }
      }
  }
}

@Serializable
internal data class SubstanceSpecificationStructureRepresentationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var representation: KotlinString? = null,
  public var _representation: Element? = null,
  public var attachment: Attachment? = null,
) {
  public fun toModel(): SubstanceSpecification.Structure.Representation =
    SubstanceSpecification.Structure.Representation().apply {
      id = this@SubstanceSpecificationStructureRepresentationSurrogate.id
      extension = this@SubstanceSpecificationStructureRepresentationSurrogate.extension
      modifierExtension =
        this@SubstanceSpecificationStructureRepresentationSurrogate.modifierExtension
      type = this@SubstanceSpecificationStructureRepresentationSurrogate.type
      representation =
        R4String.of(
          this@SubstanceSpecificationStructureRepresentationSurrogate.representation,
          this@SubstanceSpecificationStructureRepresentationSurrogate._representation,
        )
      attachment = this@SubstanceSpecificationStructureRepresentationSurrogate.attachment
    }

  public companion object {
    public fun fromModel(
      model: SubstanceSpecification.Structure.Representation
    ): SubstanceSpecificationStructureRepresentationSurrogate =
      with(model) {
        SubstanceSpecificationStructureRepresentationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          representation = this@with.representation?.value
          _representation = this@with.representation?.toElement()
          attachment = this@with.attachment
        }
      }
  }
}

@Serializable
internal data class SubstanceSpecificationStructureSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var stereochemistry: CodeableConcept? = null,
  public var opticalActivity: CodeableConcept? = null,
  public var molecularFormula: KotlinString? = null,
  public var _molecularFormula: Element? = null,
  public var molecularFormulaByMoiety: KotlinString? = null,
  public var _molecularFormulaByMoiety: Element? = null,
  public var isotope: List<SubstanceSpecification.Structure.Isotope>? = null,
  public var molecularWeight: SubstanceSpecification.Structure.Isotope.MolecularWeight? = null,
  public var source: List<Reference?>? = null,
  public var representation: List<SubstanceSpecification.Structure.Representation>? = null,
) {
  public fun toModel(): SubstanceSpecification.Structure =
    SubstanceSpecification.Structure().apply {
      id = this@SubstanceSpecificationStructureSurrogate.id
      extension = this@SubstanceSpecificationStructureSurrogate.extension
      modifierExtension = this@SubstanceSpecificationStructureSurrogate.modifierExtension
      stereochemistry = this@SubstanceSpecificationStructureSurrogate.stereochemistry
      opticalActivity = this@SubstanceSpecificationStructureSurrogate.opticalActivity
      molecularFormula =
        R4String.of(
          this@SubstanceSpecificationStructureSurrogate.molecularFormula,
          this@SubstanceSpecificationStructureSurrogate._molecularFormula,
        )
      molecularFormulaByMoiety =
        R4String.of(
          this@SubstanceSpecificationStructureSurrogate.molecularFormulaByMoiety,
          this@SubstanceSpecificationStructureSurrogate._molecularFormulaByMoiety,
        )
      isotope = this@SubstanceSpecificationStructureSurrogate.isotope
      molecularWeight = this@SubstanceSpecificationStructureSurrogate.molecularWeight
      source = this@SubstanceSpecificationStructureSurrogate.source
      representation = this@SubstanceSpecificationStructureSurrogate.representation
    }

  public companion object {
    public fun fromModel(
      model: SubstanceSpecification.Structure
    ): SubstanceSpecificationStructureSurrogate =
      with(model) {
        SubstanceSpecificationStructureSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          stereochemistry = this@with.stereochemistry
          opticalActivity = this@with.opticalActivity
          molecularFormula = this@with.molecularFormula?.value
          _molecularFormula = this@with.molecularFormula?.toElement()
          molecularFormulaByMoiety = this@with.molecularFormulaByMoiety?.value
          _molecularFormulaByMoiety = this@with.molecularFormulaByMoiety?.toElement()
          isotope = this@with.isotope
          molecularWeight = this@with.molecularWeight
          source = this@with.source
          representation = this@with.representation
        }
      }
  }
}

@Serializable
internal data class SubstanceSpecificationCodeSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var status: CodeableConcept? = null,
  public var statusDate: KotlinString? = null,
  public var _statusDate: Element? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
  public var source: List<Reference?>? = null,
) {
  public fun toModel(): SubstanceSpecification.Code =
    SubstanceSpecification.Code().apply {
      id = this@SubstanceSpecificationCodeSurrogate.id
      extension = this@SubstanceSpecificationCodeSurrogate.extension
      modifierExtension = this@SubstanceSpecificationCodeSurrogate.modifierExtension
      code = this@SubstanceSpecificationCodeSurrogate.code
      status = this@SubstanceSpecificationCodeSurrogate.status
      statusDate =
        DateTime.of(
          FhirDateTime.fromString(this@SubstanceSpecificationCodeSurrogate.statusDate),
          this@SubstanceSpecificationCodeSurrogate._statusDate,
        )
      comment =
        R4String.of(
          this@SubstanceSpecificationCodeSurrogate.comment,
          this@SubstanceSpecificationCodeSurrogate._comment,
        )
      source = this@SubstanceSpecificationCodeSurrogate.source
    }

  public companion object {
    public fun fromModel(model: SubstanceSpecification.Code): SubstanceSpecificationCodeSurrogate =
      with(model) {
        SubstanceSpecificationCodeSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          status = this@with.status
          statusDate = this@with.statusDate?.value?.toString()
          _statusDate = this@with.statusDate?.toElement()
          comment = this@with.comment?.value
          _comment = this@with.comment?.toElement()
          source = this@with.source
        }
      }
  }
}

@Serializable
internal data class SubstanceSpecificationNameOfficialSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var authority: CodeableConcept? = null,
  public var status: CodeableConcept? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
) {
  public fun toModel(): SubstanceSpecification.Name.Official =
    SubstanceSpecification.Name.Official().apply {
      id = this@SubstanceSpecificationNameOfficialSurrogate.id
      extension = this@SubstanceSpecificationNameOfficialSurrogate.extension
      modifierExtension = this@SubstanceSpecificationNameOfficialSurrogate.modifierExtension
      authority = this@SubstanceSpecificationNameOfficialSurrogate.authority
      status = this@SubstanceSpecificationNameOfficialSurrogate.status
      date =
        DateTime.of(
          FhirDateTime.fromString(this@SubstanceSpecificationNameOfficialSurrogate.date),
          this@SubstanceSpecificationNameOfficialSurrogate._date,
        )
    }

  public companion object {
    public fun fromModel(
      model: SubstanceSpecification.Name.Official
    ): SubstanceSpecificationNameOfficialSurrogate =
      with(model) {
        SubstanceSpecificationNameOfficialSurrogate().apply {
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
internal data class SubstanceSpecificationNameSurrogate(
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
  public var synonym: List<SubstanceSpecification.Name?>? = null,
  public var translation: List<SubstanceSpecification.Name?>? = null,
  public var official: List<SubstanceSpecification.Name.Official>? = null,
  public var source: List<Reference?>? = null,
) {
  public fun toModel(): SubstanceSpecification.Name =
    SubstanceSpecification.Name().apply {
      id = this@SubstanceSpecificationNameSurrogate.id
      extension = this@SubstanceSpecificationNameSurrogate.extension
      modifierExtension = this@SubstanceSpecificationNameSurrogate.modifierExtension
      name =
        R4String.of(
          this@SubstanceSpecificationNameSurrogate.name,
          this@SubstanceSpecificationNameSurrogate._name,
        )
      type = this@SubstanceSpecificationNameSurrogate.type
      status = this@SubstanceSpecificationNameSurrogate.status
      preferred =
        R4Boolean.of(
          this@SubstanceSpecificationNameSurrogate.preferred,
          this@SubstanceSpecificationNameSurrogate._preferred,
        )
      language = this@SubstanceSpecificationNameSurrogate.language
      domain = this@SubstanceSpecificationNameSurrogate.domain
      jurisdiction = this@SubstanceSpecificationNameSurrogate.jurisdiction
      synonym = this@SubstanceSpecificationNameSurrogate.synonym
      translation = this@SubstanceSpecificationNameSurrogate.translation
      official = this@SubstanceSpecificationNameSurrogate.official
      source = this@SubstanceSpecificationNameSurrogate.source
    }

  public companion object {
    public fun fromModel(model: SubstanceSpecification.Name): SubstanceSpecificationNameSurrogate =
      with(model) {
        SubstanceSpecificationNameSurrogate().apply {
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
internal data class SubstanceSpecificationRelationshipSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var substanceReference: Reference? = null,
  public var substanceCodeableConcept: CodeableConcept? = null,
  public var relationship: CodeableConcept? = null,
  public var isDefining: KotlinBoolean? = null,
  public var _isDefining: Element? = null,
  public var amountQuantity: Quantity? = null,
  public var amountRange: Range? = null,
  public var amountRatio: Ratio? = null,
  public var amountString: KotlinString? = null,
  public var _amountString: Element? = null,
  public var amountRatioLowLimit: Ratio? = null,
  public var amountType: CodeableConcept? = null,
  public var source: List<Reference?>? = null,
) {
  public fun toModel(): SubstanceSpecification.Relationship =
    SubstanceSpecification.Relationship().apply {
      id = this@SubstanceSpecificationRelationshipSurrogate.id
      extension = this@SubstanceSpecificationRelationshipSurrogate.extension
      modifierExtension = this@SubstanceSpecificationRelationshipSurrogate.modifierExtension
      substance =
        SubstanceSpecification.Relationship.Substance?.from(
          this@SubstanceSpecificationRelationshipSurrogate.substanceReference,
          this@SubstanceSpecificationRelationshipSurrogate.substanceCodeableConcept,
        )
      relationship = this@SubstanceSpecificationRelationshipSurrogate.relationship
      isDefining =
        R4Boolean.of(
          this@SubstanceSpecificationRelationshipSurrogate.isDefining,
          this@SubstanceSpecificationRelationshipSurrogate._isDefining,
        )
      amount =
        SubstanceSpecification.Relationship.Amount?.from(
          this@SubstanceSpecificationRelationshipSurrogate.amountQuantity,
          this@SubstanceSpecificationRelationshipSurrogate.amountRange,
          this@SubstanceSpecificationRelationshipSurrogate.amountRatio,
          R4String.of(
            this@SubstanceSpecificationRelationshipSurrogate.amountString,
            this@SubstanceSpecificationRelationshipSurrogate._amountString,
          ),
        )
      amountRatioLowLimit = this@SubstanceSpecificationRelationshipSurrogate.amountRatioLowLimit
      amountType = this@SubstanceSpecificationRelationshipSurrogate.amountType
      source = this@SubstanceSpecificationRelationshipSurrogate.source
    }

  public companion object {
    public fun fromModel(
      model: SubstanceSpecification.Relationship
    ): SubstanceSpecificationRelationshipSurrogate =
      with(model) {
        SubstanceSpecificationRelationshipSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          substanceReference = this@with.substance?.asReference()?.value
          substanceCodeableConcept = this@with.substance?.asCodeableConcept()?.value
          relationship = this@with.relationship
          isDefining = this@with.isDefining?.value
          _isDefining = this@with.isDefining?.toElement()
          amountQuantity = this@with.amount?.asQuantity()?.value
          amountRange = this@with.amount?.asRange()?.value
          amountRatio = this@with.amount?.asRatio()?.value
          amountString = this@with.amount?.asString()?.value?.value
          _amountString = this@with.amount?.asString()?.value?.toElement()
          amountRatioLowLimit = this@with.amountRatioLowLimit
          amountType = this@with.amountType
          source = this@with.source
        }
      }
  }
}

@Serializable
internal data class SubstanceSpecificationSurrogate(
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
  public var identifier: Identifier? = null,
  public var type: CodeableConcept? = null,
  public var status: CodeableConcept? = null,
  public var domain: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var source: List<Reference?>? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
  public var moiety: List<SubstanceSpecification.Moiety>? = null,
  public var `property`: List<SubstanceSpecification.Property>? = null,
  public var referenceInformation: Reference? = null,
  public var structure: SubstanceSpecification.Structure? = null,
  public var code: List<SubstanceSpecification.Code>? = null,
  public var name: List<SubstanceSpecification.Name>? = null,
  public var molecularWeight: List<SubstanceSpecification.Structure.Isotope.MolecularWeight?>? =
    null,
  public var relationship: List<SubstanceSpecification.Relationship>? = null,
  public var nucleicAcid: Reference? = null,
  public var polymer: Reference? = null,
  public var protein: Reference? = null,
  public var sourceMaterial: Reference? = null,
) {
  public fun toModel(): SubstanceSpecification =
    SubstanceSpecification().apply {
      id = this@SubstanceSpecificationSurrogate.id
      meta = this@SubstanceSpecificationSurrogate.meta
      implicitRules =
        Uri.of(
          this@SubstanceSpecificationSurrogate.implicitRules,
          this@SubstanceSpecificationSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@SubstanceSpecificationSurrogate.language,
          this@SubstanceSpecificationSurrogate._language,
        )
      text = this@SubstanceSpecificationSurrogate.text
      contained = this@SubstanceSpecificationSurrogate.contained
      extension = this@SubstanceSpecificationSurrogate.extension
      modifierExtension = this@SubstanceSpecificationSurrogate.modifierExtension
      identifier = this@SubstanceSpecificationSurrogate.identifier
      type = this@SubstanceSpecificationSurrogate.type
      status = this@SubstanceSpecificationSurrogate.status
      domain = this@SubstanceSpecificationSurrogate.domain
      description =
        R4String.of(
          this@SubstanceSpecificationSurrogate.description,
          this@SubstanceSpecificationSurrogate._description,
        )
      source = this@SubstanceSpecificationSurrogate.source
      comment =
        R4String.of(
          this@SubstanceSpecificationSurrogate.comment,
          this@SubstanceSpecificationSurrogate._comment,
        )
      moiety = this@SubstanceSpecificationSurrogate.moiety
      `property` = this@SubstanceSpecificationSurrogate.`property`
      referenceInformation = this@SubstanceSpecificationSurrogate.referenceInformation
      structure = this@SubstanceSpecificationSurrogate.structure
      code = this@SubstanceSpecificationSurrogate.code
      name = this@SubstanceSpecificationSurrogate.name
      molecularWeight = this@SubstanceSpecificationSurrogate.molecularWeight
      relationship = this@SubstanceSpecificationSurrogate.relationship
      nucleicAcid = this@SubstanceSpecificationSurrogate.nucleicAcid
      polymer = this@SubstanceSpecificationSurrogate.polymer
      protein = this@SubstanceSpecificationSurrogate.protein
      sourceMaterial = this@SubstanceSpecificationSurrogate.sourceMaterial
    }

  public companion object {
    public fun fromModel(model: SubstanceSpecification): SubstanceSpecificationSurrogate =
      with(model) {
        SubstanceSpecificationSurrogate().apply {
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
          type = this@with.type
          status = this@with.status
          domain = this@with.domain
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          source = this@with.source
          comment = this@with.comment?.value
          _comment = this@with.comment?.toElement()
          moiety = this@with.moiety
          `property` = this@with.`property`
          referenceInformation = this@with.referenceInformation
          structure = this@with.structure
          code = this@with.code
          name = this@with.name
          molecularWeight = this@with.molecularWeight
          relationship = this@with.relationship
          nucleicAcid = this@with.nucleicAcid
          polymer = this@with.polymer
          protein = this@with.protein
          sourceMaterial = this@with.sourceMaterial
        }
      }
  }
}
