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

import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Integer
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.MarketingStatus
import com.google.fhir.model.r5.MedicinalProductDefinition
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
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
internal data class MedicinalProductDefinitionNamePartSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var part: KotlinString? = null,
  public var _part: Element? = null,
  public var type: CodeableConcept? = null,
) {
  public fun toModel(): MedicinalProductDefinition.Name.Part =
    MedicinalProductDefinition.Name.Part().apply {
      id = this@MedicinalProductDefinitionNamePartSurrogate.id
      extension = this@MedicinalProductDefinitionNamePartSurrogate.extension
      modifierExtension = this@MedicinalProductDefinitionNamePartSurrogate.modifierExtension
      part =
        R5String.of(
          this@MedicinalProductDefinitionNamePartSurrogate.part,
          this@MedicinalProductDefinitionNamePartSurrogate._part,
        )
      type = this@MedicinalProductDefinitionNamePartSurrogate.type
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.Name.Part
    ): MedicinalProductDefinitionNamePartSurrogate =
      with(model) {
        MedicinalProductDefinitionNamePartSurrogate().apply {
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
internal data class MedicinalProductDefinitionNameUsageSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var country: CodeableConcept? = null,
  public var jurisdiction: CodeableConcept? = null,
  public var language: CodeableConcept? = null,
) {
  public fun toModel(): MedicinalProductDefinition.Name.Usage =
    MedicinalProductDefinition.Name.Usage().apply {
      id = this@MedicinalProductDefinitionNameUsageSurrogate.id
      extension = this@MedicinalProductDefinitionNameUsageSurrogate.extension
      modifierExtension = this@MedicinalProductDefinitionNameUsageSurrogate.modifierExtension
      country = this@MedicinalProductDefinitionNameUsageSurrogate.country
      jurisdiction = this@MedicinalProductDefinitionNameUsageSurrogate.jurisdiction
      language = this@MedicinalProductDefinitionNameUsageSurrogate.language
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.Name.Usage
    ): MedicinalProductDefinitionNameUsageSurrogate =
      with(model) {
        MedicinalProductDefinitionNameUsageSurrogate().apply {
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
  public var part: List<MedicinalProductDefinition.Name.Part>? = null,
  public var usage: List<MedicinalProductDefinition.Name.Usage>? = null,
) {
  public fun toModel(): MedicinalProductDefinition.Name =
    MedicinalProductDefinition.Name().apply {
      id = this@MedicinalProductDefinitionNameSurrogate.id
      extension = this@MedicinalProductDefinitionNameSurrogate.extension
      modifierExtension = this@MedicinalProductDefinitionNameSurrogate.modifierExtension
      productName =
        R5String.of(
          this@MedicinalProductDefinitionNameSurrogate.productName,
          this@MedicinalProductDefinitionNameSurrogate._productName,
        )
      type = this@MedicinalProductDefinitionNameSurrogate.type
      part = this@MedicinalProductDefinitionNameSurrogate.part
      usage = this@MedicinalProductDefinitionNameSurrogate.usage
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
          part = this@with.part
          usage = this@with.usage
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
  public var valueMarkdown: KotlinString? = null,
  public var _valueMarkdown: Element? = null,
  public var valueQuantity: Quantity? = null,
  public var valueInteger: Int? = null,
  public var _valueInteger: Element? = null,
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
          Markdown.of(
            this@MedicinalProductDefinitionCharacteristicSurrogate.valueMarkdown,
            this@MedicinalProductDefinitionCharacteristicSurrogate._valueMarkdown,
          ),
          this@MedicinalProductDefinitionCharacteristicSurrogate.valueQuantity,
          Integer.of(
            this@MedicinalProductDefinitionCharacteristicSurrogate.valueInteger,
            this@MedicinalProductDefinitionCharacteristicSurrogate._valueInteger,
          ),
          Date.of(
            FhirDate.fromString(this@MedicinalProductDefinitionCharacteristicSurrogate.valueDate),
            this@MedicinalProductDefinitionCharacteristicSurrogate._valueDate,
          ),
          R5Boolean.of(
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
          valueMarkdown = this@with.`value`?.asMarkdown()?.value?.value
          _valueMarkdown = this@with.`value`?.asMarkdown()?.value?.toElement()
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueInteger = this@with.`value`?.asInteger()?.value?.value
          _valueInteger = this@with.`value`?.asInteger()?.value?.toElement()
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
  public var comprisedOf: List<Reference?>? = null,
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
        R5String.of(
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
      comprisedOf = this@MedicinalProductDefinitionSurrogate.comprisedOf
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
          comprisedOf = this@with.comprisedOf
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
