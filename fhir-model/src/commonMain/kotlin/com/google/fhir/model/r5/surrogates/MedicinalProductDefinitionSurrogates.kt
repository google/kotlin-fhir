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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicinalProductDefinitionContactSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var contact: Reference,
) {
  public fun toModel(): MedicinalProductDefinition.Contact =
    MedicinalProductDefinition.Contact(
      id = this@MedicinalProductDefinitionContactSurrogate.id,
      extension = this@MedicinalProductDefinitionContactSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductDefinitionContactSurrogate.modifierExtension ?: mutableListOf(),
      type = this@MedicinalProductDefinitionContactSurrogate.type,
      contact = this@MedicinalProductDefinitionContactSurrogate.contact,
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.Contact
    ): MedicinalProductDefinitionContactSurrogate =
      with(model) {
        MedicinalProductDefinitionContactSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          contact = this@with.contact,
        )
      }
  }
}

@Serializable
internal data class MedicinalProductDefinitionNameSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var productName: KotlinString? = null,
  public var _productName: Element? = null,
  public var type: CodeableConcept? = null,
  public var part: MutableList<MedicinalProductDefinition.Name.Part>? = null,
  public var usage: MutableList<MedicinalProductDefinition.Name.Usage>? = null,
) {
  public fun toModel(): MedicinalProductDefinition.Name =
    MedicinalProductDefinition.Name(
      id = this@MedicinalProductDefinitionNameSurrogate.id,
      extension = this@MedicinalProductDefinitionNameSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductDefinitionNameSurrogate.modifierExtension ?: mutableListOf(),
      productName =
        R5String.of(
          this@MedicinalProductDefinitionNameSurrogate.productName,
          this@MedicinalProductDefinitionNameSurrogate._productName,
        )!!,
      type = this@MedicinalProductDefinitionNameSurrogate.type,
      part = this@MedicinalProductDefinitionNameSurrogate.part ?: mutableListOf(),
      usage = this@MedicinalProductDefinitionNameSurrogate.usage ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.Name
    ): MedicinalProductDefinitionNameSurrogate =
      with(model) {
        MedicinalProductDefinitionNameSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          productName = this@with.productName.value,
          _productName = this@with.productName.toElement(),
          type = this@with.type,
          part = this@with.part.takeUnless { it.all { it == null } },
          usage = this@with.usage.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class MedicinalProductDefinitionNamePartSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var part: KotlinString? = null,
  public var _part: Element? = null,
  public var type: CodeableConcept,
) {
  public fun toModel(): MedicinalProductDefinition.Name.Part =
    MedicinalProductDefinition.Name.Part(
      id = this@MedicinalProductDefinitionNamePartSurrogate.id,
      extension = this@MedicinalProductDefinitionNamePartSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductDefinitionNamePartSurrogate.modifierExtension ?: mutableListOf(),
      part =
        R5String.of(
          this@MedicinalProductDefinitionNamePartSurrogate.part,
          this@MedicinalProductDefinitionNamePartSurrogate._part,
        )!!,
      type = this@MedicinalProductDefinitionNamePartSurrogate.type,
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.Name.Part
    ): MedicinalProductDefinitionNamePartSurrogate =
      with(model) {
        MedicinalProductDefinitionNamePartSurrogate(
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
internal data class MedicinalProductDefinitionNameUsageSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var country: CodeableConcept,
  public var jurisdiction: CodeableConcept? = null,
  public var language: CodeableConcept,
) {
  public fun toModel(): MedicinalProductDefinition.Name.Usage =
    MedicinalProductDefinition.Name.Usage(
      id = this@MedicinalProductDefinitionNameUsageSurrogate.id,
      extension = this@MedicinalProductDefinitionNameUsageSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductDefinitionNameUsageSurrogate.modifierExtension ?: mutableListOf(),
      country = this@MedicinalProductDefinitionNameUsageSurrogate.country,
      jurisdiction = this@MedicinalProductDefinitionNameUsageSurrogate.jurisdiction,
      language = this@MedicinalProductDefinitionNameUsageSurrogate.language,
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.Name.Usage
    ): MedicinalProductDefinitionNameUsageSurrogate =
      with(model) {
        MedicinalProductDefinitionNameUsageSurrogate(
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
internal data class MedicinalProductDefinitionCrossReferenceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var product: CodeableReference,
  public var type: CodeableConcept? = null,
) {
  public fun toModel(): MedicinalProductDefinition.CrossReference =
    MedicinalProductDefinition.CrossReference(
      id = this@MedicinalProductDefinitionCrossReferenceSurrogate.id,
      extension =
        this@MedicinalProductDefinitionCrossReferenceSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductDefinitionCrossReferenceSurrogate.modifierExtension ?: mutableListOf(),
      product = this@MedicinalProductDefinitionCrossReferenceSurrogate.product,
      type = this@MedicinalProductDefinitionCrossReferenceSurrogate.type,
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.CrossReference
    ): MedicinalProductDefinitionCrossReferenceSurrogate =
      with(model) {
        MedicinalProductDefinitionCrossReferenceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          product = this@with.product,
          type = this@with.type,
        )
      }
  }
}

@Serializable
internal data class MedicinalProductDefinitionOperationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableReference? = null,
  public var effectiveDate: Period? = null,
  public var organization: MutableList<Reference>? = null,
  public var confidentialityIndicator: CodeableConcept? = null,
) {
  public fun toModel(): MedicinalProductDefinition.Operation =
    MedicinalProductDefinition.Operation(
      id = this@MedicinalProductDefinitionOperationSurrogate.id,
      extension = this@MedicinalProductDefinitionOperationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductDefinitionOperationSurrogate.modifierExtension ?: mutableListOf(),
      type = this@MedicinalProductDefinitionOperationSurrogate.type,
      effectiveDate = this@MedicinalProductDefinitionOperationSurrogate.effectiveDate,
      organization =
        this@MedicinalProductDefinitionOperationSurrogate.organization ?: mutableListOf(),
      confidentialityIndicator =
        this@MedicinalProductDefinitionOperationSurrogate.confidentialityIndicator,
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.Operation
    ): MedicinalProductDefinitionOperationSurrogate =
      with(model) {
        MedicinalProductDefinitionOperationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          effectiveDate = this@with.effectiveDate,
          organization = this@with.organization.takeUnless { it.all { it == null } },
          confidentialityIndicator = this@with.confidentialityIndicator,
        )
      }
  }
}

@Serializable
internal data class MedicinalProductDefinitionCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var `value`: MedicinalProductDefinition.Characteristic.Value? = null,
) {
  public fun toModel(): MedicinalProductDefinition.Characteristic =
    MedicinalProductDefinition.Characteristic(
      id = this@MedicinalProductDefinitionCharacteristicSurrogate.id,
      extension =
        this@MedicinalProductDefinitionCharacteristicSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductDefinitionCharacteristicSurrogate.modifierExtension ?: mutableListOf(),
      type = this@MedicinalProductDefinitionCharacteristicSurrogate.type,
      `value` = this@MedicinalProductDefinitionCharacteristicSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.Characteristic
    ): MedicinalProductDefinitionCharacteristicSurrogate =
      with(model) {
        MedicinalProductDefinitionCharacteristicSurrogate(
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
internal data class MedicinalProductDefinitionCharacteristicValueSurrogate(
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
  public fun toModel(): MedicinalProductDefinition.Characteristic.Value =
    MedicinalProductDefinition.Characteristic.Value.from(
      this@MedicinalProductDefinitionCharacteristicValueSurrogate.valueCodeableConcept,
      Markdown.of(
        this@MedicinalProductDefinitionCharacteristicValueSurrogate.valueMarkdown,
        this@MedicinalProductDefinitionCharacteristicValueSurrogate._valueMarkdown,
      ),
      this@MedicinalProductDefinitionCharacteristicValueSurrogate.valueQuantity,
      Integer.of(
        this@MedicinalProductDefinitionCharacteristicValueSurrogate.valueInteger,
        this@MedicinalProductDefinitionCharacteristicValueSurrogate._valueInteger,
      ),
      Date.of(
        FhirDate.fromString(this@MedicinalProductDefinitionCharacteristicValueSurrogate.valueDate),
        this@MedicinalProductDefinitionCharacteristicValueSurrogate._valueDate,
      ),
      R5Boolean.of(
        this@MedicinalProductDefinitionCharacteristicValueSurrogate.valueBoolean,
        this@MedicinalProductDefinitionCharacteristicValueSurrogate._valueBoolean,
      ),
      this@MedicinalProductDefinitionCharacteristicValueSurrogate.valueAttachment,
    )!!

  public companion object {
    public fun fromModel(
      model: MedicinalProductDefinition.Characteristic.Value
    ): MedicinalProductDefinitionCharacteristicValueSurrogate =
      with(model) {
        MedicinalProductDefinitionCharacteristicValueSurrogate(
          valueCodeableConcept = this@with.asCodeableConcept()?.value,
          valueMarkdown = this@with.asMarkdown()?.value?.value,
          _valueMarkdown = this@with.asMarkdown()?.value?.toElement(),
          valueQuantity = this@with.asQuantity()?.value,
          valueInteger = this@with.asInteger()?.value?.value,
          _valueInteger = this@with.asInteger()?.value?.toElement(),
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
internal data class MedicinalProductDefinitionSurrogate(
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
  public var domain: CodeableConcept? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var status: CodeableConcept? = null,
  public var statusDate: KotlinString? = null,
  public var _statusDate: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var combinedPharmaceuticalDoseForm: CodeableConcept? = null,
  public var route: MutableList<CodeableConcept>? = null,
  public var indication: KotlinString? = null,
  public var _indication: Element? = null,
  public var legalStatusOfSupply: CodeableConcept? = null,
  public var additionalMonitoringIndicator: CodeableConcept? = null,
  public var specialMeasures: MutableList<CodeableConcept>? = null,
  public var pediatricUseIndicator: CodeableConcept? = null,
  public var classification: MutableList<CodeableConcept>? = null,
  public var marketingStatus: MutableList<MarketingStatus>? = null,
  public var packagedMedicinalProduct: MutableList<CodeableConcept>? = null,
  public var comprisedOf: MutableList<Reference>? = null,
  public var ingredient: MutableList<CodeableConcept>? = null,
  public var impurity: MutableList<CodeableReference>? = null,
  public var attachedDocument: MutableList<Reference>? = null,
  public var masterFile: MutableList<Reference>? = null,
  public var contact: MutableList<MedicinalProductDefinition.Contact>? = null,
  public var clinicalTrial: MutableList<Reference>? = null,
  public var code: MutableList<Coding>? = null,
  public var name: MutableList<MedicinalProductDefinition.Name>? = null,
  public var crossReference: MutableList<MedicinalProductDefinition.CrossReference>? = null,
  public var operation: MutableList<MedicinalProductDefinition.Operation>? = null,
  public var characteristic: MutableList<MedicinalProductDefinition.Characteristic>? = null,
) {
  public fun toModel(): MedicinalProductDefinition =
    MedicinalProductDefinition(
      id = this@MedicinalProductDefinitionSurrogate.id,
      meta = this@MedicinalProductDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@MedicinalProductDefinitionSurrogate.implicitRules,
          this@MedicinalProductDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@MedicinalProductDefinitionSurrogate.language,
          this@MedicinalProductDefinitionSurrogate._language,
        ),
      text = this@MedicinalProductDefinitionSurrogate.text,
      contained = this@MedicinalProductDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@MedicinalProductDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@MedicinalProductDefinitionSurrogate.identifier ?: mutableListOf(),
      type = this@MedicinalProductDefinitionSurrogate.type,
      domain = this@MedicinalProductDefinitionSurrogate.domain,
      version =
        R5String.of(
          this@MedicinalProductDefinitionSurrogate.version,
          this@MedicinalProductDefinitionSurrogate._version,
        ),
      status = this@MedicinalProductDefinitionSurrogate.status,
      statusDate =
        DateTime.of(
          FhirDateTime.fromString(this@MedicinalProductDefinitionSurrogate.statusDate),
          this@MedicinalProductDefinitionSurrogate._statusDate,
        ),
      description =
        Markdown.of(
          this@MedicinalProductDefinitionSurrogate.description,
          this@MedicinalProductDefinitionSurrogate._description,
        ),
      combinedPharmaceuticalDoseForm =
        this@MedicinalProductDefinitionSurrogate.combinedPharmaceuticalDoseForm,
      route = this@MedicinalProductDefinitionSurrogate.route ?: mutableListOf(),
      indication =
        Markdown.of(
          this@MedicinalProductDefinitionSurrogate.indication,
          this@MedicinalProductDefinitionSurrogate._indication,
        ),
      legalStatusOfSupply = this@MedicinalProductDefinitionSurrogate.legalStatusOfSupply,
      additionalMonitoringIndicator =
        this@MedicinalProductDefinitionSurrogate.additionalMonitoringIndicator,
      specialMeasures = this@MedicinalProductDefinitionSurrogate.specialMeasures ?: mutableListOf(),
      pediatricUseIndicator = this@MedicinalProductDefinitionSurrogate.pediatricUseIndicator,
      classification = this@MedicinalProductDefinitionSurrogate.classification ?: mutableListOf(),
      marketingStatus = this@MedicinalProductDefinitionSurrogate.marketingStatus ?: mutableListOf(),
      packagedMedicinalProduct =
        this@MedicinalProductDefinitionSurrogate.packagedMedicinalProduct ?: mutableListOf(),
      comprisedOf = this@MedicinalProductDefinitionSurrogate.comprisedOf ?: mutableListOf(),
      ingredient = this@MedicinalProductDefinitionSurrogate.ingredient ?: mutableListOf(),
      impurity = this@MedicinalProductDefinitionSurrogate.impurity ?: mutableListOf(),
      attachedDocument =
        this@MedicinalProductDefinitionSurrogate.attachedDocument ?: mutableListOf(),
      masterFile = this@MedicinalProductDefinitionSurrogate.masterFile ?: mutableListOf(),
      contact = this@MedicinalProductDefinitionSurrogate.contact ?: mutableListOf(),
      clinicalTrial = this@MedicinalProductDefinitionSurrogate.clinicalTrial ?: mutableListOf(),
      code = this@MedicinalProductDefinitionSurrogate.code ?: mutableListOf(),
      name = this@MedicinalProductDefinitionSurrogate.name ?: mutableListOf(),
      crossReference = this@MedicinalProductDefinitionSurrogate.crossReference ?: mutableListOf(),
      operation = this@MedicinalProductDefinitionSurrogate.operation ?: mutableListOf(),
      characteristic = this@MedicinalProductDefinitionSurrogate.characteristic ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: MedicinalProductDefinition): MedicinalProductDefinitionSurrogate =
      with(model) {
        MedicinalProductDefinitionSurrogate(
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
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          status = this@with.status,
          statusDate = this@with.statusDate?.value?.toString(),
          _statusDate = this@with.statusDate?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          combinedPharmaceuticalDoseForm = this@with.combinedPharmaceuticalDoseForm,
          route = this@with.route.takeUnless { it.all { it == null } },
          indication = this@with.indication?.value,
          _indication = this@with.indication?.toElement(),
          legalStatusOfSupply = this@with.legalStatusOfSupply,
          additionalMonitoringIndicator = this@with.additionalMonitoringIndicator,
          specialMeasures = this@with.specialMeasures.takeUnless { it.all { it == null } },
          pediatricUseIndicator = this@with.pediatricUseIndicator,
          classification = this@with.classification.takeUnless { it.all { it == null } },
          marketingStatus = this@with.marketingStatus.takeUnless { it.all { it == null } },
          packagedMedicinalProduct =
            this@with.packagedMedicinalProduct.takeUnless { it.all { it == null } },
          comprisedOf = this@with.comprisedOf.takeUnless { it.all { it == null } },
          ingredient = this@with.ingredient.takeUnless { it.all { it == null } },
          impurity = this@with.impurity.takeUnless { it.all { it == null } },
          attachedDocument = this@with.attachedDocument.takeUnless { it.all { it == null } },
          masterFile = this@with.masterFile.takeUnless { it.all { it == null } },
          contact = this@with.contact.takeUnless { it.all { it == null } },
          clinicalTrial = this@with.clinicalTrial.takeUnless { it.all { it == null } },
          code = this@with.code.takeUnless { it.all { it == null } },
          name = this@with.name.takeUnless { it.all { it == null } },
          crossReference = this@with.crossReference.takeUnless { it.all { it == null } },
          operation = this@with.operation.takeUnless { it.all { it == null } },
          characteristic = this@with.characteristic.takeUnless { it.all { it == null } },
        )
      }
  }
}
