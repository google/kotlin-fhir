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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class PackagedProductDefinitionLegalStatusOfSupplySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept? = null,
  public var jurisdiction: CodeableConcept? = null,
) {
  public fun toModel(): PackagedProductDefinition.LegalStatusOfSupply =
    PackagedProductDefinition.LegalStatusOfSupply(
      id = this@PackagedProductDefinitionLegalStatusOfSupplySurrogate.id,
      extension =
        this@PackagedProductDefinitionLegalStatusOfSupplySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PackagedProductDefinitionLegalStatusOfSupplySurrogate.modifierExtension
          ?: mutableListOf(),
      code = this@PackagedProductDefinitionLegalStatusOfSupplySurrogate.code,
      jurisdiction = this@PackagedProductDefinitionLegalStatusOfSupplySurrogate.jurisdiction,
    )

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.LegalStatusOfSupply
    ): PackagedProductDefinitionLegalStatusOfSupplySurrogate =
      with(model) {
        PackagedProductDefinitionLegalStatusOfSupplySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          jurisdiction = this@with.jurisdiction,
        )
      }
  }
}

@Serializable
internal data class PackagedProductDefinitionPackagingSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var type: CodeableConcept? = null,
  public var componentPart: KotlinBoolean? = null,
  public var _componentPart: Element? = null,
  public var quantity: Int? = null,
  public var _quantity: Element? = null,
  public var material: MutableList<CodeableConcept>? = null,
  public var alternateMaterial: MutableList<CodeableConcept>? = null,
  public var shelfLifeStorage: MutableList<ProductShelfLife>? = null,
  public var manufacturer: MutableList<Reference>? = null,
  public var `property`: MutableList<PackagedProductDefinition.Packaging.Property>? = null,
  public var containedItem: MutableList<PackagedProductDefinition.Packaging.ContainedItem>? = null,
  public var packaging: MutableList<PackagedProductDefinition.Packaging>? = null,
) {
  public fun toModel(): PackagedProductDefinition.Packaging =
    PackagedProductDefinition.Packaging(
      id = this@PackagedProductDefinitionPackagingSurrogate.id,
      extension = this@PackagedProductDefinitionPackagingSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PackagedProductDefinitionPackagingSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@PackagedProductDefinitionPackagingSurrogate.identifier ?: mutableListOf(),
      type = this@PackagedProductDefinitionPackagingSurrogate.type,
      componentPart =
        R5Boolean.of(
          this@PackagedProductDefinitionPackagingSurrogate.componentPart,
          this@PackagedProductDefinitionPackagingSurrogate._componentPart,
        ),
      quantity =
        Integer.of(
          this@PackagedProductDefinitionPackagingSurrogate.quantity,
          this@PackagedProductDefinitionPackagingSurrogate._quantity,
        ),
      material = this@PackagedProductDefinitionPackagingSurrogate.material ?: mutableListOf(),
      alternateMaterial =
        this@PackagedProductDefinitionPackagingSurrogate.alternateMaterial ?: mutableListOf(),
      shelfLifeStorage =
        this@PackagedProductDefinitionPackagingSurrogate.shelfLifeStorage ?: mutableListOf(),
      manufacturer =
        this@PackagedProductDefinitionPackagingSurrogate.manufacturer ?: mutableListOf(),
      `property` = this@PackagedProductDefinitionPackagingSurrogate.`property` ?: mutableListOf(),
      containedItem =
        this@PackagedProductDefinitionPackagingSurrogate.containedItem ?: mutableListOf(),
      packaging = this@PackagedProductDefinitionPackagingSurrogate.packaging ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Packaging
    ): PackagedProductDefinitionPackagingSurrogate =
      with(model) {
        PackagedProductDefinitionPackagingSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          type = this@with.type,
          componentPart = this@with.componentPart?.value,
          _componentPart = this@with.componentPart?.toElement(),
          quantity = this@with.quantity?.value,
          _quantity = this@with.quantity?.toElement(),
          material = this@with.material.takeUnless { it.all { it == null } },
          alternateMaterial = this@with.alternateMaterial.takeUnless { it.all { it == null } },
          shelfLifeStorage = this@with.shelfLifeStorage.takeUnless { it.all { it == null } },
          manufacturer = this@with.manufacturer.takeUnless { it.all { it == null } },
          `property` = this@with.`property`.takeUnless { it.all { it == null } },
          containedItem = this@with.containedItem.takeUnless { it.all { it == null } },
          packaging = this@with.packaging.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class PackagedProductDefinitionPackagingPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var `value`: PackagedProductDefinition.Packaging.Property.Value? = null,
) {
  public fun toModel(): PackagedProductDefinition.Packaging.Property =
    PackagedProductDefinition.Packaging.Property(
      id = this@PackagedProductDefinitionPackagingPropertySurrogate.id,
      extension =
        this@PackagedProductDefinitionPackagingPropertySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PackagedProductDefinitionPackagingPropertySurrogate.modifierExtension
          ?: mutableListOf(),
      type = this@PackagedProductDefinitionPackagingPropertySurrogate.type,
      `value` = this@PackagedProductDefinitionPackagingPropertySurrogate.`value`,
    )

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Packaging.Property
    ): PackagedProductDefinitionPackagingPropertySurrogate =
      with(model) {
        PackagedProductDefinitionPackagingPropertySurrogate(
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
internal data class PackagedProductDefinitionPackagingContainedItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var item: CodeableReference,
  public var amount: Quantity? = null,
) {
  public fun toModel(): PackagedProductDefinition.Packaging.ContainedItem =
    PackagedProductDefinition.Packaging.ContainedItem(
      id = this@PackagedProductDefinitionPackagingContainedItemSurrogate.id,
      extension =
        this@PackagedProductDefinitionPackagingContainedItemSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PackagedProductDefinitionPackagingContainedItemSurrogate.modifierExtension
          ?: mutableListOf(),
      item = this@PackagedProductDefinitionPackagingContainedItemSurrogate.item,
      amount = this@PackagedProductDefinitionPackagingContainedItemSurrogate.amount,
    )

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Packaging.ContainedItem
    ): PackagedProductDefinitionPackagingContainedItemSurrogate =
      with(model) {
        PackagedProductDefinitionPackagingContainedItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          item = this@with.item,
          amount = this@with.amount,
        )
      }
  }
}

@Serializable
internal data class PackagedProductDefinitionPackagingPropertyValueSurrogate(
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueDate: KotlinString? = null,
  public var _valueDate: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueAttachment: Attachment? = null,
) {
  public fun toModel(): PackagedProductDefinition.Packaging.Property.Value =
    PackagedProductDefinition.Packaging.Property.Value.from(
      this@PackagedProductDefinitionPackagingPropertyValueSurrogate.valueCodeableConcept,
      this@PackagedProductDefinitionPackagingPropertyValueSurrogate.valueQuantity,
      Date.of(
        FhirDate.fromString(
          this@PackagedProductDefinitionPackagingPropertyValueSurrogate.valueDate
        ),
        this@PackagedProductDefinitionPackagingPropertyValueSurrogate._valueDate,
      ),
      R5Boolean.of(
        this@PackagedProductDefinitionPackagingPropertyValueSurrogate.valueBoolean,
        this@PackagedProductDefinitionPackagingPropertyValueSurrogate._valueBoolean,
      ),
      this@PackagedProductDefinitionPackagingPropertyValueSurrogate.valueAttachment,
    )!!

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Packaging.Property.Value
    ): PackagedProductDefinitionPackagingPropertyValueSurrogate =
      with(model) {
        PackagedProductDefinitionPackagingPropertyValueSurrogate(
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
internal data class PackagedProductDefinitionSurrogate(
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
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var type: CodeableConcept? = null,
  public var packageFor: MutableList<Reference>? = null,
  public var status: CodeableConcept? = null,
  public var statusDate: KotlinString? = null,
  public var _statusDate: Element? = null,
  public var containedItemQuantity: MutableList<Quantity>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var legalStatusOfSupply: MutableList<PackagedProductDefinition.LegalStatusOfSupply>? =
    null,
  public var marketingStatus: MutableList<MarketingStatus>? = null,
  public var copackagedIndicator: KotlinBoolean? = null,
  public var _copackagedIndicator: Element? = null,
  public var manufacturer: MutableList<Reference>? = null,
  public var attachedDocument: MutableList<Reference>? = null,
  public var packaging: PackagedProductDefinition.Packaging? = null,
  public var characteristic: MutableList<PackagedProductDefinition.Packaging.Property>? = null,
) {
  public fun toModel(): PackagedProductDefinition =
    PackagedProductDefinition(
      id = this@PackagedProductDefinitionSurrogate.id,
      meta = this@PackagedProductDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@PackagedProductDefinitionSurrogate.implicitRules,
          this@PackagedProductDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@PackagedProductDefinitionSurrogate.language,
          this@PackagedProductDefinitionSurrogate._language,
        ),
      text = this@PackagedProductDefinitionSurrogate.text,
      contained = this@PackagedProductDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@PackagedProductDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PackagedProductDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@PackagedProductDefinitionSurrogate.identifier ?: mutableListOf(),
      name =
        R5String.of(
          this@PackagedProductDefinitionSurrogate.name,
          this@PackagedProductDefinitionSurrogate._name,
        ),
      type = this@PackagedProductDefinitionSurrogate.type,
      packageFor = this@PackagedProductDefinitionSurrogate.packageFor ?: mutableListOf(),
      status = this@PackagedProductDefinitionSurrogate.status,
      statusDate =
        DateTime.of(
          FhirDateTime.fromString(this@PackagedProductDefinitionSurrogate.statusDate),
          this@PackagedProductDefinitionSurrogate._statusDate,
        ),
      containedItemQuantity =
        this@PackagedProductDefinitionSurrogate.containedItemQuantity ?: mutableListOf(),
      description =
        Markdown.of(
          this@PackagedProductDefinitionSurrogate.description,
          this@PackagedProductDefinitionSurrogate._description,
        ),
      legalStatusOfSupply =
        this@PackagedProductDefinitionSurrogate.legalStatusOfSupply ?: mutableListOf(),
      marketingStatus = this@PackagedProductDefinitionSurrogate.marketingStatus ?: mutableListOf(),
      copackagedIndicator =
        R5Boolean.of(
          this@PackagedProductDefinitionSurrogate.copackagedIndicator,
          this@PackagedProductDefinitionSurrogate._copackagedIndicator,
        ),
      manufacturer = this@PackagedProductDefinitionSurrogate.manufacturer ?: mutableListOf(),
      attachedDocument =
        this@PackagedProductDefinitionSurrogate.attachedDocument ?: mutableListOf(),
      packaging = this@PackagedProductDefinitionSurrogate.packaging,
      characteristic = this@PackagedProductDefinitionSurrogate.characteristic ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: PackagedProductDefinition): PackagedProductDefinitionSurrogate =
      with(model) {
        PackagedProductDefinitionSurrogate(
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
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          type = this@with.type,
          packageFor = this@with.packageFor.takeUnless { it.all { it == null } },
          status = this@with.status,
          statusDate = this@with.statusDate?.value?.toString(),
          _statusDate = this@with.statusDate?.toElement(),
          containedItemQuantity =
            this@with.containedItemQuantity.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          legalStatusOfSupply = this@with.legalStatusOfSupply.takeUnless { it.all { it == null } },
          marketingStatus = this@with.marketingStatus.takeUnless { it.all { it == null } },
          copackagedIndicator = this@with.copackagedIndicator?.value,
          _copackagedIndicator = this@with.copackagedIndicator?.toElement(),
          manufacturer = this@with.manufacturer.takeUnless { it.all { it == null } },
          attachedDocument = this@with.attachedDocument.takeUnless { it.all { it == null } },
          packaging = this@with.packaging,
          characteristic = this@with.characteristic.takeUnless { it.all { it == null } },
        )
      }
  }
}
