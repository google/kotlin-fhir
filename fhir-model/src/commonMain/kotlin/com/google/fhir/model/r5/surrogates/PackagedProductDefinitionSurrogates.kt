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
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.PackagedProductDefinition
import com.google.fhir.model.r5.ProductShelfLife
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
internal data class PackagedProductDefinitionPackagingPropertySurrogate(
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
  public fun toModel(): PackagedProductDefinition.Packaging.Property =
    PackagedProductDefinition.Packaging.Property().apply {
      id = this@PackagedProductDefinitionPackagingPropertySurrogate.id
      extension = this@PackagedProductDefinitionPackagingPropertySurrogate.extension
      modifierExtension = this@PackagedProductDefinitionPackagingPropertySurrogate.modifierExtension
      type = this@PackagedProductDefinitionPackagingPropertySurrogate.type
      `value` =
        PackagedProductDefinition.Packaging.Property.Value?.from(
          this@PackagedProductDefinitionPackagingPropertySurrogate.valueCodeableConcept,
          this@PackagedProductDefinitionPackagingPropertySurrogate.valueQuantity,
          Date.of(
            FhirDate.fromString(this@PackagedProductDefinitionPackagingPropertySurrogate.valueDate),
            this@PackagedProductDefinitionPackagingPropertySurrogate._valueDate,
          ),
          R5Boolean.of(
            this@PackagedProductDefinitionPackagingPropertySurrogate.valueBoolean,
            this@PackagedProductDefinitionPackagingPropertySurrogate._valueBoolean,
          ),
          this@PackagedProductDefinitionPackagingPropertySurrogate.valueAttachment,
        )
    }

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Packaging.Property
    ): PackagedProductDefinitionPackagingPropertySurrogate =
      with(model) {
        PackagedProductDefinitionPackagingPropertySurrogate().apply {
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
internal data class PackagedProductDefinitionPackagingContainedItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var item: CodeableReference? = null,
  public var amount: Quantity? = null,
) {
  public fun toModel(): PackagedProductDefinition.Packaging.ContainedItem =
    PackagedProductDefinition.Packaging.ContainedItem().apply {
      id = this@PackagedProductDefinitionPackagingContainedItemSurrogate.id
      extension = this@PackagedProductDefinitionPackagingContainedItemSurrogate.extension
      modifierExtension =
        this@PackagedProductDefinitionPackagingContainedItemSurrogate.modifierExtension
      item = this@PackagedProductDefinitionPackagingContainedItemSurrogate.item
      amount = this@PackagedProductDefinitionPackagingContainedItemSurrogate.amount
    }

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Packaging.ContainedItem
    ): PackagedProductDefinitionPackagingContainedItemSurrogate =
      with(model) {
        PackagedProductDefinitionPackagingContainedItemSurrogate().apply {
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
internal data class PackagedProductDefinitionPackagingSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var type: CodeableConcept? = null,
  public var componentPart: KotlinBoolean? = null,
  public var _componentPart: Element? = null,
  public var quantity: Int? = null,
  public var _quantity: Element? = null,
  public var material: List<CodeableConcept?>? = null,
  public var alternateMaterial: List<CodeableConcept?>? = null,
  public var shelfLifeStorage: List<ProductShelfLife?>? = null,
  public var manufacturer: List<Reference?>? = null,
  public var `property`: List<PackagedProductDefinition.Packaging.Property>? = null,
  public var containedItem: List<PackagedProductDefinition.Packaging.ContainedItem>? = null,
  public var packaging: List<PackagedProductDefinition.Packaging?>? = null,
) {
  public fun toModel(): PackagedProductDefinition.Packaging =
    PackagedProductDefinition.Packaging().apply {
      id = this@PackagedProductDefinitionPackagingSurrogate.id
      extension = this@PackagedProductDefinitionPackagingSurrogate.extension
      modifierExtension = this@PackagedProductDefinitionPackagingSurrogate.modifierExtension
      identifier = this@PackagedProductDefinitionPackagingSurrogate.identifier
      type = this@PackagedProductDefinitionPackagingSurrogate.type
      componentPart =
        R5Boolean.of(
          this@PackagedProductDefinitionPackagingSurrogate.componentPart,
          this@PackagedProductDefinitionPackagingSurrogate._componentPart,
        )
      quantity =
        Integer.of(
          this@PackagedProductDefinitionPackagingSurrogate.quantity,
          this@PackagedProductDefinitionPackagingSurrogate._quantity,
        )
      material = this@PackagedProductDefinitionPackagingSurrogate.material
      alternateMaterial = this@PackagedProductDefinitionPackagingSurrogate.alternateMaterial
      shelfLifeStorage = this@PackagedProductDefinitionPackagingSurrogate.shelfLifeStorage
      manufacturer = this@PackagedProductDefinitionPackagingSurrogate.manufacturer
      `property` = this@PackagedProductDefinitionPackagingSurrogate.`property`
      containedItem = this@PackagedProductDefinitionPackagingSurrogate.containedItem
      packaging = this@PackagedProductDefinitionPackagingSurrogate.packaging
    }

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Packaging
    ): PackagedProductDefinitionPackagingSurrogate =
      with(model) {
        PackagedProductDefinitionPackagingSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          type = this@with.type
          componentPart = this@with.componentPart?.value
          _componentPart = this@with.componentPart?.toElement()
          quantity = this@with.quantity?.value
          _quantity = this@with.quantity?.toElement()
          material = this@with.material
          alternateMaterial = this@with.alternateMaterial
          shelfLifeStorage = this@with.shelfLifeStorage
          manufacturer = this@with.manufacturer
          `property` = this@with.`property`
          containedItem = this@with.containedItem
          packaging = this@with.packaging
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
  public var copackagedIndicator: KotlinBoolean? = null,
  public var _copackagedIndicator: Element? = null,
  public var manufacturer: List<Reference?>? = null,
  public var attachedDocument: List<Reference?>? = null,
  public var packaging: PackagedProductDefinition.Packaging? = null,
  public var characteristic: List<PackagedProductDefinition.Packaging.Property?>? = null,
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
        R5String.of(
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
      copackagedIndicator =
        R5Boolean.of(
          this@PackagedProductDefinitionSurrogate.copackagedIndicator,
          this@PackagedProductDefinitionSurrogate._copackagedIndicator,
        )
      manufacturer = this@PackagedProductDefinitionSurrogate.manufacturer
      attachedDocument = this@PackagedProductDefinitionSurrogate.attachedDocument
      packaging = this@PackagedProductDefinitionSurrogate.packaging
      characteristic = this@PackagedProductDefinitionSurrogate.characteristic
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
          copackagedIndicator = this@with.copackagedIndicator?.value
          _copackagedIndicator = this@with.copackagedIndicator?.toElement()
          manufacturer = this@with.manufacturer
          attachedDocument = this@with.attachedDocument
          packaging = this@with.packaging
          characteristic = this@with.characteristic
        }
      }
  }
}
