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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicinalProductNameSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var productName: KotlinString? = null,
  public var _productName: Element? = null,
  public var namePart: MutableList<MedicinalProduct.Name.NamePart>? = null,
  public var countryLanguage: MutableList<MedicinalProduct.Name.CountryLanguage>? = null,
) {
  public fun toModel(): MedicinalProduct.Name =
    MedicinalProduct.Name(
      id = this@MedicinalProductNameSurrogate.id,
      extension = this@MedicinalProductNameSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MedicinalProductNameSurrogate.modifierExtension ?: mutableListOf(),
      productName =
        R4String.of(
          this@MedicinalProductNameSurrogate.productName,
          this@MedicinalProductNameSurrogate._productName,
        )!!,
      namePart = this@MedicinalProductNameSurrogate.namePart ?: mutableListOf(),
      countryLanguage = this@MedicinalProductNameSurrogate.countryLanguage ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: MedicinalProduct.Name): MedicinalProductNameSurrogate =
      with(model) {
        MedicinalProductNameSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          productName = this@with.productName.value,
          _productName = this@with.productName.toElement(),
          namePart = this@with.namePart.takeUnless { it.all { it == null } },
          countryLanguage = this@with.countryLanguage.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class MedicinalProductNameNamePartSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var part: KotlinString? = null,
  public var _part: Element? = null,
  public var type: Coding,
) {
  public fun toModel(): MedicinalProduct.Name.NamePart =
    MedicinalProduct.Name.NamePart(
      id = this@MedicinalProductNameNamePartSurrogate.id,
      extension = this@MedicinalProductNameNamePartSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductNameNamePartSurrogate.modifierExtension ?: mutableListOf(),
      part =
        R4String.of(
          this@MedicinalProductNameNamePartSurrogate.part,
          this@MedicinalProductNameNamePartSurrogate._part,
        )!!,
      type = this@MedicinalProductNameNamePartSurrogate.type,
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProduct.Name.NamePart
    ): MedicinalProductNameNamePartSurrogate =
      with(model) {
        MedicinalProductNameNamePartSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          part = this@with.part.value,
          _part = this@with.part.toElement(),
          type = this@with.type,
        )
      }
  }
}

@Serializable
internal data class MedicinalProductNameCountryLanguageSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var country: CodeableConcept,
  public var jurisdiction: CodeableConcept? = null,
  public var language: CodeableConcept,
) {
  public fun toModel(): MedicinalProduct.Name.CountryLanguage =
    MedicinalProduct.Name.CountryLanguage(
      id = this@MedicinalProductNameCountryLanguageSurrogate.id,
      extension = this@MedicinalProductNameCountryLanguageSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductNameCountryLanguageSurrogate.modifierExtension ?: mutableListOf(),
      country = this@MedicinalProductNameCountryLanguageSurrogate.country,
      jurisdiction = this@MedicinalProductNameCountryLanguageSurrogate.jurisdiction,
      language = this@MedicinalProductNameCountryLanguageSurrogate.language,
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProduct.Name.CountryLanguage
    ): MedicinalProductNameCountryLanguageSurrogate =
      with(model) {
        MedicinalProductNameCountryLanguageSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          country = this@with.country,
          jurisdiction = this@with.jurisdiction,
          language = this@with.language,
        )
      }
  }
}

@Serializable
internal data class MedicinalProductManufacturingBusinessOperationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var operationType: CodeableConcept? = null,
  public var authorisationReferenceNumber: Identifier? = null,
  public var effectiveDate: KotlinString? = null,
  public var _effectiveDate: Element? = null,
  public var confidentialityIndicator: CodeableConcept? = null,
  public var manufacturer: MutableList<Reference>? = null,
  public var regulator: Reference? = null,
) {
  public fun toModel(): MedicinalProduct.ManufacturingBusinessOperation =
    MedicinalProduct.ManufacturingBusinessOperation(
      id = this@MedicinalProductManufacturingBusinessOperationSurrogate.id,
      extension =
        this@MedicinalProductManufacturingBusinessOperationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductManufacturingBusinessOperationSurrogate.modifierExtension
          ?: mutableListOf(),
      operationType = this@MedicinalProductManufacturingBusinessOperationSurrogate.operationType,
      authorisationReferenceNumber =
        this@MedicinalProductManufacturingBusinessOperationSurrogate.authorisationReferenceNumber,
      effectiveDate =
        DateTime.of(
          FhirDateTime.fromString(
            this@MedicinalProductManufacturingBusinessOperationSurrogate.effectiveDate
          ),
          this@MedicinalProductManufacturingBusinessOperationSurrogate._effectiveDate,
        ),
      confidentialityIndicator =
        this@MedicinalProductManufacturingBusinessOperationSurrogate.confidentialityIndicator,
      manufacturer =
        this@MedicinalProductManufacturingBusinessOperationSurrogate.manufacturer
          ?: mutableListOf(),
      regulator = this@MedicinalProductManufacturingBusinessOperationSurrogate.regulator,
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProduct.ManufacturingBusinessOperation
    ): MedicinalProductManufacturingBusinessOperationSurrogate =
      with(model) {
        MedicinalProductManufacturingBusinessOperationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          operationType = this@with.operationType,
          authorisationReferenceNumber = this@with.authorisationReferenceNumber,
          effectiveDate = this@with.effectiveDate?.value?.toString(),
          _effectiveDate = this@with.effectiveDate?.toElement(),
          confidentialityIndicator = this@with.confidentialityIndicator,
          manufacturer = this@with.manufacturer.takeUnless { it.all { it == null } },
          regulator = this@with.regulator,
        )
      }
  }
}

@Serializable
internal data class MedicinalProductSpecialDesignationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var type: CodeableConcept? = null,
  public var intendedUse: CodeableConcept? = null,
  public var indication: MedicinalProduct.SpecialDesignation.Indication? = null,
  public var status: CodeableConcept? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var species: CodeableConcept? = null,
) {
  public fun toModel(): MedicinalProduct.SpecialDesignation =
    MedicinalProduct.SpecialDesignation(
      id = this@MedicinalProductSpecialDesignationSurrogate.id,
      extension = this@MedicinalProductSpecialDesignationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductSpecialDesignationSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@MedicinalProductSpecialDesignationSurrogate.identifier ?: mutableListOf(),
      type = this@MedicinalProductSpecialDesignationSurrogate.type,
      intendedUse = this@MedicinalProductSpecialDesignationSurrogate.intendedUse,
      indication = this@MedicinalProductSpecialDesignationSurrogate.indication,
      status = this@MedicinalProductSpecialDesignationSurrogate.status,
      date =
        DateTime.of(
          FhirDateTime.fromString(this@MedicinalProductSpecialDesignationSurrogate.date),
          this@MedicinalProductSpecialDesignationSurrogate._date,
        ),
      species = this@MedicinalProductSpecialDesignationSurrogate.species,
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProduct.SpecialDesignation
    ): MedicinalProductSpecialDesignationSurrogate =
      with(model) {
        MedicinalProductSpecialDesignationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          type = this@with.type,
          intendedUse = this@with.intendedUse,
          indication = this@with.indication,
          status = this@with.status,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          species = this@with.species,
        )
      }
  }
}

@Serializable
internal data class MedicinalProductSpecialDesignationIndicationSurrogate(
  public var indicationCodeableConcept: CodeableConcept? = null,
  public var indicationReference: Reference? = null,
) {
  public fun toModel(): MedicinalProduct.SpecialDesignation.Indication =
    MedicinalProduct.SpecialDesignation.Indication.from(
      this@MedicinalProductSpecialDesignationIndicationSurrogate.indicationCodeableConcept,
      this@MedicinalProductSpecialDesignationIndicationSurrogate.indicationReference,
    )!!

  public companion object {
    public fun fromModel(
      model: MedicinalProduct.SpecialDesignation.Indication
    ): MedicinalProductSpecialDesignationIndicationSurrogate =
      with(model) {
        MedicinalProductSpecialDesignationIndicationSurrogate(
          indicationCodeableConcept = this@with.asCodeableConcept()?.value,
          indicationReference = this@with.asReference()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var type: CodeableConcept? = null,
  public var domain: Coding? = null,
  public var combinedPharmaceuticalDoseForm: CodeableConcept? = null,
  public var legalStatusOfSupply: CodeableConcept? = null,
  public var additionalMonitoringIndicator: CodeableConcept? = null,
  public var specialMeasures: MutableList<KotlinString?>? = null,
  public var _specialMeasures: MutableList<Element?>? = null,
  public var paediatricUseIndicator: CodeableConcept? = null,
  public var productClassification: MutableList<CodeableConcept>? = null,
  public var marketingStatus: MutableList<MarketingStatus>? = null,
  public var pharmaceuticalProduct: MutableList<Reference>? = null,
  public var packagedMedicinalProduct: MutableList<Reference>? = null,
  public var attachedDocument: MutableList<Reference>? = null,
  public var masterFile: MutableList<Reference>? = null,
  public var contact: MutableList<Reference>? = null,
  public var clinicalTrial: MutableList<Reference>? = null,
  public var name: MutableList<MedicinalProduct.Name>? = null,
  public var crossReference: MutableList<Identifier>? = null,
  public var manufacturingBusinessOperation:
    MutableList<MedicinalProduct.ManufacturingBusinessOperation>? =
    null,
  public var specialDesignation: MutableList<MedicinalProduct.SpecialDesignation>? = null,
) {
  public fun toModel(): MedicinalProduct =
    MedicinalProduct(
      id = this@MedicinalProductSurrogate.id,
      meta = this@MedicinalProductSurrogate.meta,
      implicitRules =
        Uri.of(
          this@MedicinalProductSurrogate.implicitRules,
          this@MedicinalProductSurrogate._implicitRules,
        ),
      language =
        Code.of(this@MedicinalProductSurrogate.language, this@MedicinalProductSurrogate._language),
      text = this@MedicinalProductSurrogate.text,
      contained = this@MedicinalProductSurrogate.contained ?: mutableListOf(),
      extension = this@MedicinalProductSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MedicinalProductSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@MedicinalProductSurrogate.identifier ?: mutableListOf(),
      type = this@MedicinalProductSurrogate.type,
      domain = this@MedicinalProductSurrogate.domain,
      combinedPharmaceuticalDoseForm =
        this@MedicinalProductSurrogate.combinedPharmaceuticalDoseForm,
      legalStatusOfSupply = this@MedicinalProductSurrogate.legalStatusOfSupply,
      additionalMonitoringIndicator = this@MedicinalProductSurrogate.additionalMonitoringIndicator,
      specialMeasures =
        if (
          this@MedicinalProductSurrogate.specialMeasures == null &&
            this@MedicinalProductSurrogate._specialMeasures == null
        ) {
          mutableListOf()
        } else {
          (this@MedicinalProductSurrogate.specialMeasures
              ?: List(this@MedicinalProductSurrogate._specialMeasures!!.size) { null })
            .zip(
              this@MedicinalProductSurrogate._specialMeasures
                ?: List(this@MedicinalProductSurrogate.specialMeasures!!.size) { null }
            )
            .map { (value, element) -> R4String.of(value, element)!! }
            .toMutableList()
        },
      paediatricUseIndicator = this@MedicinalProductSurrogate.paediatricUseIndicator,
      productClassification =
        this@MedicinalProductSurrogate.productClassification ?: mutableListOf(),
      marketingStatus = this@MedicinalProductSurrogate.marketingStatus ?: mutableListOf(),
      pharmaceuticalProduct =
        this@MedicinalProductSurrogate.pharmaceuticalProduct ?: mutableListOf(),
      packagedMedicinalProduct =
        this@MedicinalProductSurrogate.packagedMedicinalProduct ?: mutableListOf(),
      attachedDocument = this@MedicinalProductSurrogate.attachedDocument ?: mutableListOf(),
      masterFile = this@MedicinalProductSurrogate.masterFile ?: mutableListOf(),
      contact = this@MedicinalProductSurrogate.contact ?: mutableListOf(),
      clinicalTrial = this@MedicinalProductSurrogate.clinicalTrial ?: mutableListOf(),
      name = this@MedicinalProductSurrogate.name ?: mutableListOf(),
      crossReference = this@MedicinalProductSurrogate.crossReference ?: mutableListOf(),
      manufacturingBusinessOperation =
        this@MedicinalProductSurrogate.manufacturingBusinessOperation ?: mutableListOf(),
      specialDesignation = this@MedicinalProductSurrogate.specialDesignation ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: MedicinalProduct): MedicinalProductSurrogate =
      with(model) {
        MedicinalProductSurrogate(
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
          type = this@with.type,
          domain = this@with.domain,
          combinedPharmaceuticalDoseForm = this@with.combinedPharmaceuticalDoseForm,
          legalStatusOfSupply = this@with.legalStatusOfSupply,
          additionalMonitoringIndicator = this@with.additionalMonitoringIndicator,
          specialMeasures =
            this@with.specialMeasures
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _specialMeasures =
            this@with.specialMeasures
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          paediatricUseIndicator = this@with.paediatricUseIndicator,
          productClassification =
            this@with.productClassification.takeUnless { it.all { it == null } },
          marketingStatus = this@with.marketingStatus.takeUnless { it.all { it == null } },
          pharmaceuticalProduct =
            this@with.pharmaceuticalProduct.takeUnless { it.all { it == null } },
          packagedMedicinalProduct =
            this@with.packagedMedicinalProduct.takeUnless { it.all { it == null } },
          attachedDocument = this@with.attachedDocument.takeUnless { it.all { it == null } },
          masterFile = this@with.masterFile.takeUnless { it.all { it == null } },
          contact = this@with.contact.takeUnless { it.all { it == null } },
          clinicalTrial = this@with.clinicalTrial.takeUnless { it.all { it == null } },
          name = this@with.name.takeUnless { it.all { it == null } },
          crossReference = this@with.crossReference.takeUnless { it.all { it == null } },
          manufacturingBusinessOperation =
            this@with.manufacturingBusinessOperation.takeUnless { it.all { it == null } },
          specialDesignation = this@with.specialDesignation.takeUnless { it.all { it == null } },
        )
      }
  }
}
