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

import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Coding
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.MarketingStatus
import com.google.fhir.model.r4.MedicinalProduct
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicinalProductNameNamePartSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var part: KotlinString? = null,
  public var _part: Element? = null,
  public var type: Coding? = null,
) {
  public fun toModel(): MedicinalProduct.Name.NamePart =
    MedicinalProduct.Name.NamePart().apply {
      id = this@MedicinalProductNameNamePartSurrogate.id
      extension = this@MedicinalProductNameNamePartSurrogate.extension
      modifierExtension = this@MedicinalProductNameNamePartSurrogate.modifierExtension
      part =
        R4String.of(
          this@MedicinalProductNameNamePartSurrogate.part,
          this@MedicinalProductNameNamePartSurrogate._part,
        )
      type = this@MedicinalProductNameNamePartSurrogate.type
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProduct.Name.NamePart
    ): MedicinalProductNameNamePartSurrogate =
      with(model) {
        MedicinalProductNameNamePartSurrogate().apply {
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
internal data class MedicinalProductNameCountryLanguageSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var country: CodeableConcept? = null,
  public var jurisdiction: CodeableConcept? = null,
  public var language: CodeableConcept? = null,
) {
  public fun toModel(): MedicinalProduct.Name.CountryLanguage =
    MedicinalProduct.Name.CountryLanguage().apply {
      id = this@MedicinalProductNameCountryLanguageSurrogate.id
      extension = this@MedicinalProductNameCountryLanguageSurrogate.extension
      modifierExtension = this@MedicinalProductNameCountryLanguageSurrogate.modifierExtension
      country = this@MedicinalProductNameCountryLanguageSurrogate.country
      jurisdiction = this@MedicinalProductNameCountryLanguageSurrogate.jurisdiction
      language = this@MedicinalProductNameCountryLanguageSurrogate.language
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProduct.Name.CountryLanguage
    ): MedicinalProductNameCountryLanguageSurrogate =
      with(model) {
        MedicinalProductNameCountryLanguageSurrogate().apply {
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
internal data class MedicinalProductNameSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var productName: KotlinString? = null,
  public var _productName: Element? = null,
  public var namePart: List<MedicinalProduct.Name.NamePart>? = null,
  public var countryLanguage: List<MedicinalProduct.Name.CountryLanguage>? = null,
) {
  public fun toModel(): MedicinalProduct.Name =
    MedicinalProduct.Name().apply {
      id = this@MedicinalProductNameSurrogate.id
      extension = this@MedicinalProductNameSurrogate.extension
      modifierExtension = this@MedicinalProductNameSurrogate.modifierExtension
      productName =
        R4String.of(
          this@MedicinalProductNameSurrogate.productName,
          this@MedicinalProductNameSurrogate._productName,
        )
      namePart = this@MedicinalProductNameSurrogate.namePart
      countryLanguage = this@MedicinalProductNameSurrogate.countryLanguage
    }

  public companion object {
    public fun fromModel(model: MedicinalProduct.Name): MedicinalProductNameSurrogate =
      with(model) {
        MedicinalProductNameSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          productName = this@with.productName?.value
          _productName = this@with.productName?.toElement()
          namePart = this@with.namePart
          countryLanguage = this@with.countryLanguage
        }
      }
  }
}

@Serializable
internal data class MedicinalProductManufacturingBusinessOperationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var operationType: CodeableConcept? = null,
  public var authorisationReferenceNumber: Identifier? = null,
  public var effectiveDate: KotlinString? = null,
  public var _effectiveDate: Element? = null,
  public var confidentialityIndicator: CodeableConcept? = null,
  public var manufacturer: List<Reference?>? = null,
  public var regulator: Reference? = null,
) {
  public fun toModel(): MedicinalProduct.ManufacturingBusinessOperation =
    MedicinalProduct.ManufacturingBusinessOperation().apply {
      id = this@MedicinalProductManufacturingBusinessOperationSurrogate.id
      extension = this@MedicinalProductManufacturingBusinessOperationSurrogate.extension
      modifierExtension =
        this@MedicinalProductManufacturingBusinessOperationSurrogate.modifierExtension
      operationType = this@MedicinalProductManufacturingBusinessOperationSurrogate.operationType
      authorisationReferenceNumber =
        this@MedicinalProductManufacturingBusinessOperationSurrogate.authorisationReferenceNumber
      effectiveDate =
        DateTime.of(
          FhirDateTime.fromString(
            this@MedicinalProductManufacturingBusinessOperationSurrogate.effectiveDate
          ),
          this@MedicinalProductManufacturingBusinessOperationSurrogate._effectiveDate,
        )
      confidentialityIndicator =
        this@MedicinalProductManufacturingBusinessOperationSurrogate.confidentialityIndicator
      manufacturer = this@MedicinalProductManufacturingBusinessOperationSurrogate.manufacturer
      regulator = this@MedicinalProductManufacturingBusinessOperationSurrogate.regulator
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProduct.ManufacturingBusinessOperation
    ): MedicinalProductManufacturingBusinessOperationSurrogate =
      with(model) {
        MedicinalProductManufacturingBusinessOperationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          operationType = this@with.operationType
          authorisationReferenceNumber = this@with.authorisationReferenceNumber
          effectiveDate = this@with.effectiveDate?.value?.toString()
          _effectiveDate = this@with.effectiveDate?.toElement()
          confidentialityIndicator = this@with.confidentialityIndicator
          manufacturer = this@with.manufacturer
          regulator = this@with.regulator
        }
      }
  }
}

@Serializable
internal data class MedicinalProductSpecialDesignationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var type: CodeableConcept? = null,
  public var intendedUse: CodeableConcept? = null,
  public var indicationCodeableConcept: CodeableConcept? = null,
  public var indicationReference: Reference? = null,
  public var status: CodeableConcept? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var species: CodeableConcept? = null,
) {
  public fun toModel(): MedicinalProduct.SpecialDesignation =
    MedicinalProduct.SpecialDesignation().apply {
      id = this@MedicinalProductSpecialDesignationSurrogate.id
      extension = this@MedicinalProductSpecialDesignationSurrogate.extension
      modifierExtension = this@MedicinalProductSpecialDesignationSurrogate.modifierExtension
      identifier = this@MedicinalProductSpecialDesignationSurrogate.identifier
      type = this@MedicinalProductSpecialDesignationSurrogate.type
      intendedUse = this@MedicinalProductSpecialDesignationSurrogate.intendedUse
      indication =
        MedicinalProduct.SpecialDesignation.Indication?.from(
          this@MedicinalProductSpecialDesignationSurrogate.indicationCodeableConcept,
          this@MedicinalProductSpecialDesignationSurrogate.indicationReference,
        )
      status = this@MedicinalProductSpecialDesignationSurrogate.status
      date =
        DateTime.of(
          FhirDateTime.fromString(this@MedicinalProductSpecialDesignationSurrogate.date),
          this@MedicinalProductSpecialDesignationSurrogate._date,
        )
      species = this@MedicinalProductSpecialDesignationSurrogate.species
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProduct.SpecialDesignation
    ): MedicinalProductSpecialDesignationSurrogate =
      with(model) {
        MedicinalProductSpecialDesignationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          type = this@with.type
          intendedUse = this@with.intendedUse
          indicationCodeableConcept = this@with.indication?.asCodeableConcept()?.value
          indicationReference = this@with.indication?.asReference()?.value
          status = this@with.status
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          species = this@with.species
        }
      }
  }
}

@Serializable
internal data class MedicinalProductSurrogate(
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
  public var domain: Coding? = null,
  public var combinedPharmaceuticalDoseForm: CodeableConcept? = null,
  public var legalStatusOfSupply: CodeableConcept? = null,
  public var additionalMonitoringIndicator: CodeableConcept? = null,
  public var specialMeasures: List<KotlinString?>? = null,
  public var _specialMeasures: List<Element?>? = null,
  public var paediatricUseIndicator: CodeableConcept? = null,
  public var productClassification: List<CodeableConcept?>? = null,
  public var marketingStatus: List<MarketingStatus?>? = null,
  public var pharmaceuticalProduct: List<Reference?>? = null,
  public var packagedMedicinalProduct: List<Reference?>? = null,
  public var attachedDocument: List<Reference?>? = null,
  public var masterFile: List<Reference?>? = null,
  public var contact: List<Reference?>? = null,
  public var clinicalTrial: List<Reference?>? = null,
  public var name: List<MedicinalProduct.Name>? = null,
  public var crossReference: List<Identifier?>? = null,
  public var manufacturingBusinessOperation:
    List<MedicinalProduct.ManufacturingBusinessOperation>? =
    null,
  public var specialDesignation: List<MedicinalProduct.SpecialDesignation>? = null,
) {
  public fun toModel(): MedicinalProduct =
    MedicinalProduct().apply {
      id = this@MedicinalProductSurrogate.id
      meta = this@MedicinalProductSurrogate.meta
      implicitRules =
        Uri.of(
          this@MedicinalProductSurrogate.implicitRules,
          this@MedicinalProductSurrogate._implicitRules,
        )
      language =
        Code.of(this@MedicinalProductSurrogate.language, this@MedicinalProductSurrogate._language)
      text = this@MedicinalProductSurrogate.text
      contained = this@MedicinalProductSurrogate.contained
      extension = this@MedicinalProductSurrogate.extension
      modifierExtension = this@MedicinalProductSurrogate.modifierExtension
      identifier = this@MedicinalProductSurrogate.identifier
      type = this@MedicinalProductSurrogate.type
      domain = this@MedicinalProductSurrogate.domain
      combinedPharmaceuticalDoseForm = this@MedicinalProductSurrogate.combinedPharmaceuticalDoseForm
      legalStatusOfSupply = this@MedicinalProductSurrogate.legalStatusOfSupply
      additionalMonitoringIndicator = this@MedicinalProductSurrogate.additionalMonitoringIndicator
      specialMeasures =
        if (
          this@MedicinalProductSurrogate.specialMeasures == null &&
            this@MedicinalProductSurrogate._specialMeasures == null
        ) {
          null
        } else {
          (this@MedicinalProductSurrogate.specialMeasures
              ?: List(this@MedicinalProductSurrogate._specialMeasures!!.size) { null })
            .zip(
              this@MedicinalProductSurrogate._specialMeasures
                ?: List(this@MedicinalProductSurrogate.specialMeasures!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4String.of(value, element) }
        }
      paediatricUseIndicator = this@MedicinalProductSurrogate.paediatricUseIndicator
      productClassification = this@MedicinalProductSurrogate.productClassification
      marketingStatus = this@MedicinalProductSurrogate.marketingStatus
      pharmaceuticalProduct = this@MedicinalProductSurrogate.pharmaceuticalProduct
      packagedMedicinalProduct = this@MedicinalProductSurrogate.packagedMedicinalProduct
      attachedDocument = this@MedicinalProductSurrogate.attachedDocument
      masterFile = this@MedicinalProductSurrogate.masterFile
      contact = this@MedicinalProductSurrogate.contact
      clinicalTrial = this@MedicinalProductSurrogate.clinicalTrial
      name = this@MedicinalProductSurrogate.name
      crossReference = this@MedicinalProductSurrogate.crossReference
      manufacturingBusinessOperation = this@MedicinalProductSurrogate.manufacturingBusinessOperation
      specialDesignation = this@MedicinalProductSurrogate.specialDesignation
    }

  public companion object {
    public fun fromModel(model: MedicinalProduct): MedicinalProductSurrogate =
      with(model) {
        MedicinalProductSurrogate().apply {
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
          combinedPharmaceuticalDoseForm = this@with.combinedPharmaceuticalDoseForm
          legalStatusOfSupply = this@with.legalStatusOfSupply
          additionalMonitoringIndicator = this@with.additionalMonitoringIndicator
          specialMeasures =
            this@with.specialMeasures?.map { it?.value }?.takeUnless { it.all { it == null } }
          _specialMeasures =
            this@with.specialMeasures?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          paediatricUseIndicator = this@with.paediatricUseIndicator
          productClassification = this@with.productClassification
          marketingStatus = this@with.marketingStatus
          pharmaceuticalProduct = this@with.pharmaceuticalProduct
          packagedMedicinalProduct = this@with.packagedMedicinalProduct
          attachedDocument = this@with.attachedDocument
          masterFile = this@with.masterFile
          contact = this@with.contact
          clinicalTrial = this@with.clinicalTrial
          name = this@with.name
          crossReference = this@with.crossReference
          manufacturingBusinessOperation = this@with.manufacturingBusinessOperation
          specialDesignation = this@with.specialDesignation
        }
      }
  }
}
