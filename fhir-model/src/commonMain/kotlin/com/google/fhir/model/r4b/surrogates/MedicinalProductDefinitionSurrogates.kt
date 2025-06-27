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

package com.google.fhir.model.r4b.surrogates

import com.google.fhir.model.r4b.Attachment
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.CodeableReference
import com.google.fhir.model.r4b.Coding
import com.google.fhir.model.r4b.Date
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDate
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Markdown
import com.google.fhir.model.r4b.MarketingStatus
import com.google.fhir.model.r4b.MedicinalProductDefinition
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicinalProductDefinitionContactSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var contact: Reference? = null,
) {
  public fun toModel(): MedicinalProductDefinition.Contact =
    MedicinalProductDefinition.Contact().apply {
      id = this@MedicinalProductDefinitionContactSurrogate.id
      extension = this@MedicinalProductDefinitionContactSurrogate.extension
      modifierExtension = this@MedicinalProductDefinitionContactSurrogate.modifierExtension
      type = this@MedicinalProductDefinitionContactSurrogate.type
      contact = this@MedicinalProductDefinitionContactSurrogate.contact
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.Contact
    ): MedicinalProductDefinitionContactSurrogate =
      with(model) {
        MedicinalProductDefinitionContactSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          contact = this@with.contact
        }
      }
  }
}

@Serializable
internal data class MedicinalProductDefinitionNameNamePartSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var part: KotlinString? = null,
  public var _part: Element? = null,
  public var type: CodeableConcept? = null,
) {
  public fun toModel(): MedicinalProductDefinition.Name.NamePart =
    MedicinalProductDefinition.Name.NamePart().apply {
      id = this@MedicinalProductDefinitionNameNamePartSurrogate.id
      extension = this@MedicinalProductDefinitionNameNamePartSurrogate.extension
      modifierExtension = this@MedicinalProductDefinitionNameNamePartSurrogate.modifierExtension
      part =
        R4bString.of(
          this@MedicinalProductDefinitionNameNamePartSurrogate.part,
          this@MedicinalProductDefinitionNameNamePartSurrogate._part,
        )
      type = this@MedicinalProductDefinitionNameNamePartSurrogate.type
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.Name.NamePart
    ): MedicinalProductDefinitionNameNamePartSurrogate =
      with(model) {
        MedicinalProductDefinitionNameNamePartSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          part = this@with.part?.value
          _part = this@with.part?.toElement()
          type = this@with.type
        }
      }
  }
}

@Serializable
internal data class MedicinalProductDefinitionNameCountryLanguageSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var country: CodeableConcept? = null,
  public var jurisdiction: CodeableConcept? = null,
  public var language: CodeableConcept? = null,
) {
  public fun toModel(): MedicinalProductDefinition.Name.CountryLanguage =
    MedicinalProductDefinition.Name.CountryLanguage().apply {
      id = this@MedicinalProductDefinitionNameCountryLanguageSurrogate.id
      extension = this@MedicinalProductDefinitionNameCountryLanguageSurrogate.extension
      modifierExtension =
        this@MedicinalProductDefinitionNameCountryLanguageSurrogate.modifierExtension
      country = this@MedicinalProductDefinitionNameCountryLanguageSurrogate.country
      jurisdiction = this@MedicinalProductDefinitionNameCountryLanguageSurrogate.jurisdiction
      language = this@MedicinalProductDefinitionNameCountryLanguageSurrogate.language
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.Name.CountryLanguage
    ): MedicinalProductDefinitionNameCountryLanguageSurrogate =
      with(model) {
        MedicinalProductDefinitionNameCountryLanguageSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          country = this@with.country
          jurisdiction = this@with.jurisdiction
          language = this@with.language
        }
      }
  }
}

@Serializable
internal data class MedicinalProductDefinitionNameSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var productName: KotlinString? = null,
  public var _productName: Element? = null,
  public var type: CodeableConcept? = null,
  public var namePart: List<MedicinalProductDefinition.Name.NamePart>? = null,
  public var countryLanguage: List<MedicinalProductDefinition.Name.CountryLanguage>? = null,
) {
  public fun toModel(): MedicinalProductDefinition.Name =
    MedicinalProductDefinition.Name().apply {
      id = this@MedicinalProductDefinitionNameSurrogate.id
      extension = this@MedicinalProductDefinitionNameSurrogate.extension
      modifierExtension = this@MedicinalProductDefinitionNameSurrogate.modifierExtension
      productName =
        R4bString.of(
          this@MedicinalProductDefinitionNameSurrogate.productName,
          this@MedicinalProductDefinitionNameSurrogate._productName,
        )
      type = this@MedicinalProductDefinitionNameSurrogate.type
      namePart = this@MedicinalProductDefinitionNameSurrogate.namePart
      countryLanguage = this@MedicinalProductDefinitionNameSurrogate.countryLanguage
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.Name
    ): MedicinalProductDefinitionNameSurrogate =
      with(model) {
        MedicinalProductDefinitionNameSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          productName = this@with.productName?.value
          _productName = this@with.productName?.toElement()
          type = this@with.type
          namePart = this@with.namePart
          countryLanguage = this@with.countryLanguage
        }
      }
  }
}

@Serializable
internal data class MedicinalProductDefinitionCrossReferenceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var product: CodeableReference? = null,
  public var type: CodeableConcept? = null,
) {
  public fun toModel(): MedicinalProductDefinition.CrossReference =
    MedicinalProductDefinition.CrossReference().apply {
      id = this@MedicinalProductDefinitionCrossReferenceSurrogate.id
      extension = this@MedicinalProductDefinitionCrossReferenceSurrogate.extension
      modifierExtension = this@MedicinalProductDefinitionCrossReferenceSurrogate.modifierExtension
      product = this@MedicinalProductDefinitionCrossReferenceSurrogate.product
      type = this@MedicinalProductDefinitionCrossReferenceSurrogate.type
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.CrossReference
    ): MedicinalProductDefinitionCrossReferenceSurrogate =
      with(model) {
        MedicinalProductDefinitionCrossReferenceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          product = this@with.product
          type = this@with.type
        }
      }
  }
}

@Serializable
internal data class MedicinalProductDefinitionOperationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableReference? = null,
  public var effectiveDate: Period? = null,
  public var organization: List<Reference?>? = null,
  public var confidentialityIndicator: CodeableConcept? = null,
) {
  public fun toModel(): MedicinalProductDefinition.Operation =
    MedicinalProductDefinition.Operation().apply {
      id = this@MedicinalProductDefinitionOperationSurrogate.id
      extension = this@MedicinalProductDefinitionOperationSurrogate.extension
      modifierExtension = this@MedicinalProductDefinitionOperationSurrogate.modifierExtension
      type = this@MedicinalProductDefinitionOperationSurrogate.type
      effectiveDate = this@MedicinalProductDefinitionOperationSurrogate.effectiveDate
      organization = this@MedicinalProductDefinitionOperationSurrogate.organization
      confidentialityIndicator =
        this@MedicinalProductDefinitionOperationSurrogate.confidentialityIndicator
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.Operation
    ): MedicinalProductDefinitionOperationSurrogate =
      with(model) {
        MedicinalProductDefinitionOperationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          effectiveDate = this@with.effectiveDate
          organization = this@with.organization
          confidentialityIndicator = this@with.confidentialityIndicator
        }
      }
  }
}

@Serializable
internal data class MedicinalProductDefinitionCharacteristicSurrogate(
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
  public fun toModel(): MedicinalProductDefinition.Characteristic =
    MedicinalProductDefinition.Characteristic().apply {
      id = this@MedicinalProductDefinitionCharacteristicSurrogate.id
      extension = this@MedicinalProductDefinitionCharacteristicSurrogate.extension
      modifierExtension = this@MedicinalProductDefinitionCharacteristicSurrogate.modifierExtension
      type = this@MedicinalProductDefinitionCharacteristicSurrogate.type
      `value` =
        MedicinalProductDefinition.Characteristic.Value?.from(
          this@MedicinalProductDefinitionCharacteristicSurrogate.valueCodeableConcept,
          this@MedicinalProductDefinitionCharacteristicSurrogate.valueQuantity,
          Date.of(
            FhirDate.fromString(this@MedicinalProductDefinitionCharacteristicSurrogate.valueDate),
            this@MedicinalProductDefinitionCharacteristicSurrogate._valueDate,
          ),
          R4bBoolean.of(
            this@MedicinalProductDefinitionCharacteristicSurrogate.valueBoolean,
            this@MedicinalProductDefinitionCharacteristicSurrogate._valueBoolean,
          ),
          this@MedicinalProductDefinitionCharacteristicSurrogate.valueAttachment,
        )
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.Characteristic
    ): MedicinalProductDefinitionCharacteristicSurrogate =
      with(model) {
        MedicinalProductDefinitionCharacteristicSurrogate().apply {
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
internal data class MedicinalProductDefinitionSurrogate(
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
  public var type: CodeableConcept? = null,
  public var domain: CodeableConcept? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var status: CodeableConcept? = null,
  public var statusDate: KotlinString? = null,
  public var _statusDate: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var combinedPharmaceuticalDoseForm: CodeableConcept? = null,
  public var route: List<CodeableConcept?>? = null,
  public var indication: KotlinString? = null,
  public var _indication: Element? = null,
  public var legalStatusOfSupply: CodeableConcept? = null,
  public var additionalMonitoringIndicator: CodeableConcept? = null,
  public var specialMeasures: List<CodeableConcept?>? = null,
  public var pediatricUseIndicator: CodeableConcept? = null,
  public var classification: List<CodeableConcept?>? = null,
  public var marketingStatus: List<MarketingStatus?>? = null,
  public var packagedMedicinalProduct: List<CodeableConcept?>? = null,
  public var ingredient: List<CodeableConcept?>? = null,
  public var impurity: List<CodeableReference?>? = null,
  public var attachedDocument: List<Reference?>? = null,
  public var masterFile: List<Reference?>? = null,
  public var contact: List<MedicinalProductDefinition.Contact>? = null,
  public var clinicalTrial: List<Reference?>? = null,
  public var code: List<Coding?>? = null,
  public var name: List<MedicinalProductDefinition.Name>? = null,
  public var crossReference: List<MedicinalProductDefinition.CrossReference>? = null,
  public var operation: List<MedicinalProductDefinition.Operation>? = null,
  public var characteristic: List<MedicinalProductDefinition.Characteristic>? = null,
) {
  public fun toModel(): MedicinalProductDefinition =
    MedicinalProductDefinition().apply {
      id = this@MedicinalProductDefinitionSurrogate.id
      meta = this@MedicinalProductDefinitionSurrogate.meta
      implicitRules =
        Uri.of(
          this@MedicinalProductDefinitionSurrogate.implicitRules,
          this@MedicinalProductDefinitionSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@MedicinalProductDefinitionSurrogate.language,
          this@MedicinalProductDefinitionSurrogate._language,
        )
      text = this@MedicinalProductDefinitionSurrogate.text
      contained = this@MedicinalProductDefinitionSurrogate.contained
      extension = this@MedicinalProductDefinitionSurrogate.extension
      modifierExtension = this@MedicinalProductDefinitionSurrogate.modifierExtension
      identifier = this@MedicinalProductDefinitionSurrogate.identifier
      type = this@MedicinalProductDefinitionSurrogate.type
      domain = this@MedicinalProductDefinitionSurrogate.domain
      version =
        R4bString.of(
          this@MedicinalProductDefinitionSurrogate.version,
          this@MedicinalProductDefinitionSurrogate._version,
        )
      status = this@MedicinalProductDefinitionSurrogate.status
      statusDate =
        DateTime.of(
          FhirDateTime.fromString(this@MedicinalProductDefinitionSurrogate.statusDate),
          this@MedicinalProductDefinitionSurrogate._statusDate,
        )
      description =
        Markdown.of(
          this@MedicinalProductDefinitionSurrogate.description,
          this@MedicinalProductDefinitionSurrogate._description,
        )
      combinedPharmaceuticalDoseForm =
        this@MedicinalProductDefinitionSurrogate.combinedPharmaceuticalDoseForm
      route = this@MedicinalProductDefinitionSurrogate.route
      indication =
        Markdown.of(
          this@MedicinalProductDefinitionSurrogate.indication,
          this@MedicinalProductDefinitionSurrogate._indication,
        )
      legalStatusOfSupply = this@MedicinalProductDefinitionSurrogate.legalStatusOfSupply
      additionalMonitoringIndicator =
        this@MedicinalProductDefinitionSurrogate.additionalMonitoringIndicator
      specialMeasures = this@MedicinalProductDefinitionSurrogate.specialMeasures
      pediatricUseIndicator = this@MedicinalProductDefinitionSurrogate.pediatricUseIndicator
      classification = this@MedicinalProductDefinitionSurrogate.classification
      marketingStatus = this@MedicinalProductDefinitionSurrogate.marketingStatus
      packagedMedicinalProduct = this@MedicinalProductDefinitionSurrogate.packagedMedicinalProduct
      ingredient = this@MedicinalProductDefinitionSurrogate.ingredient
      impurity = this@MedicinalProductDefinitionSurrogate.impurity
      attachedDocument = this@MedicinalProductDefinitionSurrogate.attachedDocument
      masterFile = this@MedicinalProductDefinitionSurrogate.masterFile
      contact = this@MedicinalProductDefinitionSurrogate.contact
      clinicalTrial = this@MedicinalProductDefinitionSurrogate.clinicalTrial
      code = this@MedicinalProductDefinitionSurrogate.code
      name = this@MedicinalProductDefinitionSurrogate.name
      crossReference = this@MedicinalProductDefinitionSurrogate.crossReference
      operation = this@MedicinalProductDefinitionSurrogate.operation
      characteristic = this@MedicinalProductDefinitionSurrogate.characteristic
    }

  public companion object {
    public fun fromModel(model: MedicinalProductDefinition): MedicinalProductDefinitionSurrogate =
      with(model) {
        MedicinalProductDefinitionSurrogate().apply {
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
          domain = this@with.domain
          version = this@with.version?.value
          _version = this@with.version?.toElement()
          status = this@with.status
          statusDate = this@with.statusDate?.value?.toString()
          _statusDate = this@with.statusDate?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          combinedPharmaceuticalDoseForm = this@with.combinedPharmaceuticalDoseForm
          route = this@with.route
          indication = this@with.indication?.value
          _indication = this@with.indication?.toElement()
          legalStatusOfSupply = this@with.legalStatusOfSupply
          additionalMonitoringIndicator = this@with.additionalMonitoringIndicator
          specialMeasures = this@with.specialMeasures
          pediatricUseIndicator = this@with.pediatricUseIndicator
          classification = this@with.classification
          marketingStatus = this@with.marketingStatus
          packagedMedicinalProduct = this@with.packagedMedicinalProduct
          ingredient = this@with.ingredient
          impurity = this@with.impurity
          attachedDocument = this@with.attachedDocument
          masterFile = this@with.masterFile
          contact = this@with.contact
          clinicalTrial = this@with.clinicalTrial
          code = this@with.code
          name = this@with.name
          crossReference = this@with.crossReference
          operation = this@with.operation
          characteristic = this@with.characteristic
        }
      }
  }
}
