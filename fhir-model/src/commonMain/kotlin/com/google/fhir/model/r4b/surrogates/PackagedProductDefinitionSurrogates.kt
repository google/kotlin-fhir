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
import com.google.fhir.model.r4b.Date
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Duration
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDate
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Integer
import com.google.fhir.model.r4b.Markdown
import com.google.fhir.model.r4b.MarketingStatus
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.PackagedProductDefinition
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class PackagedProductDefinitionLegalStatusOfSupplySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var jurisdiction: CodeableConcept? = null,
) {
  public fun toModel(): PackagedProductDefinition.LegalStatusOfSupply =
    PackagedProductDefinition.LegalStatusOfSupply().apply {
      id = this@PackagedProductDefinitionLegalStatusOfSupplySurrogate.id
      extension = this@PackagedProductDefinitionLegalStatusOfSupplySurrogate.extension
      modifierExtension =
        this@PackagedProductDefinitionLegalStatusOfSupplySurrogate.modifierExtension
      code = this@PackagedProductDefinitionLegalStatusOfSupplySurrogate.code
      jurisdiction = this@PackagedProductDefinitionLegalStatusOfSupplySurrogate.jurisdiction
    }

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.LegalStatusOfSupply
    ): PackagedProductDefinitionLegalStatusOfSupplySurrogate =
      with(model) {
        PackagedProductDefinitionLegalStatusOfSupplySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          jurisdiction = this@with.jurisdiction
        }
      }
  }
}

@Serializable
internal data class PackagedProductDefinitionPackageShelfLifeStorageSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var periodDuration: Duration? = null,
  public var periodString: KotlinString? = null,
  public var _periodString: Element? = null,
  public var specialPrecautionsForStorage: List<CodeableConcept?>? = null,
) {
  public fun toModel(): PackagedProductDefinition.Package.ShelfLifeStorage =
    PackagedProductDefinition.Package.ShelfLifeStorage().apply {
      id = this@PackagedProductDefinitionPackageShelfLifeStorageSurrogate.id
      extension = this@PackagedProductDefinitionPackageShelfLifeStorageSurrogate.extension
      modifierExtension =
        this@PackagedProductDefinitionPackageShelfLifeStorageSurrogate.modifierExtension
      type = this@PackagedProductDefinitionPackageShelfLifeStorageSurrogate.type
      period =
        PackagedProductDefinition.Package.ShelfLifeStorage.Period?.from(
          this@PackagedProductDefinitionPackageShelfLifeStorageSurrogate.periodDuration,
          R4bString.of(
            this@PackagedProductDefinitionPackageShelfLifeStorageSurrogate.periodString,
            this@PackagedProductDefinitionPackageShelfLifeStorageSurrogate._periodString,
          ),
        )
      specialPrecautionsForStorage =
        this@PackagedProductDefinitionPackageShelfLifeStorageSurrogate.specialPrecautionsForStorage
    }

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Package.ShelfLifeStorage
    ): PackagedProductDefinitionPackageShelfLifeStorageSurrogate =
      with(model) {
        PackagedProductDefinitionPackageShelfLifeStorageSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          periodDuration = this@with.period?.asDuration()?.value
          periodString = this@with.period?.asString()?.value?.value
          _periodString = this@with.period?.asString()?.value?.toElement()
          specialPrecautionsForStorage = this@with.specialPrecautionsForStorage
        }
      }
  }
}

@Serializable
internal data class PackagedProductDefinitionPackagePropertySurrogate(
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
  public fun toModel(): PackagedProductDefinition.Package.Property =
    PackagedProductDefinition.Package.Property().apply {
      id = this@PackagedProductDefinitionPackagePropertySurrogate.id
      extension = this@PackagedProductDefinitionPackagePropertySurrogate.extension
      modifierExtension = this@PackagedProductDefinitionPackagePropertySurrogate.modifierExtension
      type = this@PackagedProductDefinitionPackagePropertySurrogate.type
      `value` =
        PackagedProductDefinition.Package.Property.Value?.from(
          this@PackagedProductDefinitionPackagePropertySurrogate.valueCodeableConcept,
          this@PackagedProductDefinitionPackagePropertySurrogate.valueQuantity,
          Date.of(
            FhirDate.fromString(this@PackagedProductDefinitionPackagePropertySurrogate.valueDate),
            this@PackagedProductDefinitionPackagePropertySurrogate._valueDate,
          ),
          R4bBoolean.of(
            this@PackagedProductDefinitionPackagePropertySurrogate.valueBoolean,
            this@PackagedProductDefinitionPackagePropertySurrogate._valueBoolean,
          ),
          this@PackagedProductDefinitionPackagePropertySurrogate.valueAttachment,
        )
    }

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Package.Property
    ): PackagedProductDefinitionPackagePropertySurrogate =
      with(model) {
        PackagedProductDefinitionPackagePropertySurrogate().apply {
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
internal data class PackagedProductDefinitionPackageContainedItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var item: CodeableReference? = null,
  public var amount: Quantity? = null,
) {
  public fun toModel(): PackagedProductDefinition.Package.ContainedItem =
    PackagedProductDefinition.Package.ContainedItem().apply {
      id = this@PackagedProductDefinitionPackageContainedItemSurrogate.id
      extension = this@PackagedProductDefinitionPackageContainedItemSurrogate.extension
      modifierExtension =
        this@PackagedProductDefinitionPackageContainedItemSurrogate.modifierExtension
      item = this@PackagedProductDefinitionPackageContainedItemSurrogate.item
      amount = this@PackagedProductDefinitionPackageContainedItemSurrogate.amount
    }

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Package.ContainedItem
    ): PackagedProductDefinitionPackageContainedItemSurrogate =
      with(model) {
        PackagedProductDefinitionPackageContainedItemSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          item = this@with.item
          amount = this@with.amount
        }
      }
  }
}

@Serializable
internal data class PackagedProductDefinitionPackageSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var type: CodeableConcept? = null,
  public var quantity: Int? = null,
  public var _quantity: Element? = null,
  public var material: List<CodeableConcept?>? = null,
  public var alternateMaterial: List<CodeableConcept?>? = null,
  public var shelfLifeStorage: List<PackagedProductDefinition.Package.ShelfLifeStorage>? = null,
  public var manufacturer: List<Reference?>? = null,
  public var `property`: List<PackagedProductDefinition.Package.Property>? = null,
  public var containedItem: List<PackagedProductDefinition.Package.ContainedItem>? = null,
  public var `package`: List<PackagedProductDefinition.Package?>? = null,
) {
  public fun toModel(): PackagedProductDefinition.Package =
    PackagedProductDefinition.Package().apply {
      id = this@PackagedProductDefinitionPackageSurrogate.id
      extension = this@PackagedProductDefinitionPackageSurrogate.extension
      modifierExtension = this@PackagedProductDefinitionPackageSurrogate.modifierExtension
      identifier = this@PackagedProductDefinitionPackageSurrogate.identifier
      type = this@PackagedProductDefinitionPackageSurrogate.type
      quantity =
        Integer.of(
          this@PackagedProductDefinitionPackageSurrogate.quantity,
          this@PackagedProductDefinitionPackageSurrogate._quantity,
        )
      material = this@PackagedProductDefinitionPackageSurrogate.material
      alternateMaterial = this@PackagedProductDefinitionPackageSurrogate.alternateMaterial
      shelfLifeStorage = this@PackagedProductDefinitionPackageSurrogate.shelfLifeStorage
      manufacturer = this@PackagedProductDefinitionPackageSurrogate.manufacturer
      `property` = this@PackagedProductDefinitionPackageSurrogate.`property`
      containedItem = this@PackagedProductDefinitionPackageSurrogate.containedItem
      `package` = this@PackagedProductDefinitionPackageSurrogate.`package`
    }

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Package
    ): PackagedProductDefinitionPackageSurrogate =
      with(model) {
        PackagedProductDefinitionPackageSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          type = this@with.type
          quantity = this@with.quantity?.value
          _quantity = this@with.quantity?.toElement()
          material = this@with.material
          alternateMaterial = this@with.alternateMaterial
          shelfLifeStorage = this@with.shelfLifeStorage
          manufacturer = this@with.manufacturer
          `property` = this@with.`property`
          containedItem = this@with.containedItem
          `package` = this@with.`package`
        }
      }
  }
}

@Serializable
internal data class PackagedProductDefinitionSurrogate(
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
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var type: CodeableConcept? = null,
  public var packageFor: List<Reference?>? = null,
  public var status: CodeableConcept? = null,
  public var statusDate: KotlinString? = null,
  public var _statusDate: Element? = null,
  public var containedItemQuantity: List<Quantity?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var legalStatusOfSupply: List<PackagedProductDefinition.LegalStatusOfSupply>? = null,
  public var marketingStatus: List<MarketingStatus?>? = null,
  public var characteristic: List<CodeableConcept?>? = null,
  public var copackagedIndicator: KotlinBoolean? = null,
  public var _copackagedIndicator: Element? = null,
  public var manufacturer: List<Reference?>? = null,
  public var `package`: PackagedProductDefinition.Package? = null,
) {
  public fun toModel(): PackagedProductDefinition =
    PackagedProductDefinition().apply {
      id = this@PackagedProductDefinitionSurrogate.id
      meta = this@PackagedProductDefinitionSurrogate.meta
      implicitRules =
        Uri.of(
          this@PackagedProductDefinitionSurrogate.implicitRules,
          this@PackagedProductDefinitionSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@PackagedProductDefinitionSurrogate.language,
          this@PackagedProductDefinitionSurrogate._language,
        )
      text = this@PackagedProductDefinitionSurrogate.text
      contained = this@PackagedProductDefinitionSurrogate.contained
      extension = this@PackagedProductDefinitionSurrogate.extension
      modifierExtension = this@PackagedProductDefinitionSurrogate.modifierExtension
      identifier = this@PackagedProductDefinitionSurrogate.identifier
      name =
        R4bString.of(
          this@PackagedProductDefinitionSurrogate.name,
          this@PackagedProductDefinitionSurrogate._name,
        )
      type = this@PackagedProductDefinitionSurrogate.type
      packageFor = this@PackagedProductDefinitionSurrogate.packageFor
      status = this@PackagedProductDefinitionSurrogate.status
      statusDate =
        DateTime.of(
          FhirDateTime.fromString(this@PackagedProductDefinitionSurrogate.statusDate),
          this@PackagedProductDefinitionSurrogate._statusDate,
        )
      containedItemQuantity = this@PackagedProductDefinitionSurrogate.containedItemQuantity
      description =
        Markdown.of(
          this@PackagedProductDefinitionSurrogate.description,
          this@PackagedProductDefinitionSurrogate._description,
        )
      legalStatusOfSupply = this@PackagedProductDefinitionSurrogate.legalStatusOfSupply
      marketingStatus = this@PackagedProductDefinitionSurrogate.marketingStatus
      characteristic = this@PackagedProductDefinitionSurrogate.characteristic
      copackagedIndicator =
        R4bBoolean.of(
          this@PackagedProductDefinitionSurrogate.copackagedIndicator,
          this@PackagedProductDefinitionSurrogate._copackagedIndicator,
        )
      manufacturer = this@PackagedProductDefinitionSurrogate.manufacturer
      `package` = this@PackagedProductDefinitionSurrogate.`package`
    }

  public companion object {
    public fun fromModel(model: PackagedProductDefinition): PackagedProductDefinitionSurrogate =
      with(model) {
        PackagedProductDefinitionSurrogate().apply {
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
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          type = this@with.type
          packageFor = this@with.packageFor
          status = this@with.status
          statusDate = this@with.statusDate?.value?.toString()
          _statusDate = this@with.statusDate?.toElement()
          containedItemQuantity = this@with.containedItemQuantity
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          legalStatusOfSupply = this@with.legalStatusOfSupply
          marketingStatus = this@with.marketingStatus
          characteristic = this@with.characteristic
          copackagedIndicator = this@with.copackagedIndicator?.value
          _copackagedIndicator = this@with.copackagedIndicator?.toElement()
          manufacturer = this@with.manufacturer
          `package` = this@with.`package`
        }
      }
  }
}
