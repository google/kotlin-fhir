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

import com.google.fhir.model.r5.Address
import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Decimal
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Integer
import com.google.fhir.model.r5.InventoryItem
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Ratio
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.Url
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class InventoryItemNameSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var nameType: Coding,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
) {
  public fun toModel(): InventoryItem.Name =
    InventoryItem.Name(
      id = this@InventoryItemNameSurrogate.id,
      extension = this@InventoryItemNameSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@InventoryItemNameSurrogate.modifierExtension ?: mutableListOf(),
      nameType = this@InventoryItemNameSurrogate.nameType,
      language =
        Code.of(
          this@InventoryItemNameSurrogate.language,
          this@InventoryItemNameSurrogate._language,
        )!!,
      name =
        R5String.of(this@InventoryItemNameSurrogate.name, this@InventoryItemNameSurrogate._name)!!,
    )

  public companion object {
    public fun fromModel(model: InventoryItem.Name): InventoryItemNameSurrogate =
      with(model) {
        InventoryItemNameSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          nameType = this@with.nameType,
          language = this@with.language.value,
          _language = this@with.language.toElement(),
          name = this@with.name.value,
          _name = this@with.name.toElement(),
        )
      }
  }
}

@Serializable
internal data class InventoryItemResponsibleOrganizationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var role: CodeableConcept,
  public var organization: Reference,
) {
  public fun toModel(): InventoryItem.ResponsibleOrganization =
    InventoryItem.ResponsibleOrganization(
      id = this@InventoryItemResponsibleOrganizationSurrogate.id,
      extension = this@InventoryItemResponsibleOrganizationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@InventoryItemResponsibleOrganizationSurrogate.modifierExtension ?: mutableListOf(),
      role = this@InventoryItemResponsibleOrganizationSurrogate.role,
      organization = this@InventoryItemResponsibleOrganizationSurrogate.organization,
    )

  public companion object {
    public fun fromModel(
      model: InventoryItem.ResponsibleOrganization
    ): InventoryItemResponsibleOrganizationSurrogate =
      with(model) {
        InventoryItemResponsibleOrganizationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          role = this@with.role,
          organization = this@with.organization,
        )
      }
  }
}

@Serializable
internal data class InventoryItemDescriptionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
) {
  public fun toModel(): InventoryItem.Description =
    InventoryItem.Description(
      id = this@InventoryItemDescriptionSurrogate.id,
      extension = this@InventoryItemDescriptionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@InventoryItemDescriptionSurrogate.modifierExtension ?: mutableListOf(),
      language =
        Code.of(
          this@InventoryItemDescriptionSurrogate.language,
          this@InventoryItemDescriptionSurrogate._language,
        ),
      description =
        R5String.of(
          this@InventoryItemDescriptionSurrogate.description,
          this@InventoryItemDescriptionSurrogate._description,
        ),
    )

  public companion object {
    public fun fromModel(model: InventoryItem.Description): InventoryItemDescriptionSurrogate =
      with(model) {
        InventoryItemDescriptionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
        )
      }
  }
}

@Serializable
internal data class InventoryItemAssociationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var associationType: CodeableConcept,
  public var relatedItem: Reference,
  public var quantity: Ratio,
) {
  public fun toModel(): InventoryItem.Association =
    InventoryItem.Association(
      id = this@InventoryItemAssociationSurrogate.id,
      extension = this@InventoryItemAssociationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@InventoryItemAssociationSurrogate.modifierExtension ?: mutableListOf(),
      associationType = this@InventoryItemAssociationSurrogate.associationType,
      relatedItem = this@InventoryItemAssociationSurrogate.relatedItem,
      quantity = this@InventoryItemAssociationSurrogate.quantity,
    )

  public companion object {
    public fun fromModel(model: InventoryItem.Association): InventoryItemAssociationSurrogate =
      with(model) {
        InventoryItemAssociationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          associationType = this@with.associationType,
          relatedItem = this@with.relatedItem,
          quantity = this@with.quantity,
        )
      }
  }
}

@Serializable
internal data class InventoryItemCharacteristicValueSurrogate(
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueInteger: Int? = null,
  public var _valueInteger: Element? = null,
  public var valueDecimal: Double? = null,
  public var _valueDecimal: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueUrl: KotlinString? = null,
  public var _valueUrl: Element? = null,
  public var valueDateTime: KotlinString? = null,
  public var _valueDateTime: Element? = null,
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
  public var valueRatio: Ratio? = null,
  public var valueAnnotation: Annotation? = null,
  public var valueAddress: Address? = null,
  public var valueDuration: Duration? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): InventoryItem.Characteristic.Value =
    InventoryItem.Characteristic.Value.from(
      R5String.of(
        this@InventoryItemCharacteristicValueSurrogate.valueString,
        this@InventoryItemCharacteristicValueSurrogate._valueString,
      ),
      Integer.of(
        this@InventoryItemCharacteristicValueSurrogate.valueInteger,
        this@InventoryItemCharacteristicValueSurrogate._valueInteger,
      ),
      Decimal.of(
        this@InventoryItemCharacteristicValueSurrogate.valueDecimal,
        this@InventoryItemCharacteristicValueSurrogate._valueDecimal,
      ),
      R5Boolean.of(
        this@InventoryItemCharacteristicValueSurrogate.valueBoolean,
        this@InventoryItemCharacteristicValueSurrogate._valueBoolean,
      ),
      Url.of(
        this@InventoryItemCharacteristicValueSurrogate.valueUrl,
        this@InventoryItemCharacteristicValueSurrogate._valueUrl,
      ),
      DateTime.of(
        FhirDateTime.fromString(this@InventoryItemCharacteristicValueSurrogate.valueDateTime),
        this@InventoryItemCharacteristicValueSurrogate._valueDateTime,
      ),
      this@InventoryItemCharacteristicValueSurrogate.valueQuantity,
      this@InventoryItemCharacteristicValueSurrogate.valueRange,
      this@InventoryItemCharacteristicValueSurrogate.valueRatio,
      this@InventoryItemCharacteristicValueSurrogate.valueAnnotation,
      this@InventoryItemCharacteristicValueSurrogate.valueAddress,
      this@InventoryItemCharacteristicValueSurrogate.valueDuration,
      this@InventoryItemCharacteristicValueSurrogate.valueCodeableConcept,
    )!!

  public companion object {
    public fun fromModel(
      model: InventoryItem.Characteristic.Value
    ): InventoryItemCharacteristicValueSurrogate =
      with(model) {
        InventoryItemCharacteristicValueSurrogate(
          valueString = this@with.asString()?.value?.value,
          _valueString = this@with.asString()?.value?.toElement(),
          valueInteger = this@with.asInteger()?.value?.value,
          _valueInteger = this@with.asInteger()?.value?.toElement(),
          valueDecimal = this@with.asDecimal()?.value?.value,
          _valueDecimal = this@with.asDecimal()?.value?.toElement(),
          valueBoolean = this@with.asBoolean()?.value?.value,
          _valueBoolean = this@with.asBoolean()?.value?.toElement(),
          valueUrl = this@with.asUrl()?.value?.value,
          _valueUrl = this@with.asUrl()?.value?.toElement(),
          valueDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _valueDateTime = this@with.asDateTime()?.value?.toElement(),
          valueQuantity = this@with.asQuantity()?.value,
          valueRange = this@with.asRange()?.value,
          valueRatio = this@with.asRatio()?.value,
          valueAnnotation = this@with.asAnnotation()?.value,
          valueAddress = this@with.asAddress()?.value,
          valueDuration = this@with.asDuration()?.value,
          valueCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class InventoryItemCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var characteristicType: CodeableConcept,
  public var `value`: InventoryItem.Characteristic.Value,
) {
  public fun toModel(): InventoryItem.Characteristic =
    InventoryItem.Characteristic(
      id = this@InventoryItemCharacteristicSurrogate.id,
      extension = this@InventoryItemCharacteristicSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@InventoryItemCharacteristicSurrogate.modifierExtension ?: mutableListOf(),
      characteristicType = this@InventoryItemCharacteristicSurrogate.characteristicType,
      `value` = this@InventoryItemCharacteristicSurrogate.`value`,
    )

  public companion object {
    public fun fromModel(
      model: InventoryItem.Characteristic
    ): InventoryItemCharacteristicSurrogate =
      with(model) {
        InventoryItemCharacteristicSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          characteristicType = this@with.characteristicType,
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class InventoryItemInstanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var lotNumber: KotlinString? = null,
  public var _lotNumber: Element? = null,
  public var expiry: KotlinString? = null,
  public var _expiry: Element? = null,
  public var subject: Reference? = null,
  public var location: Reference? = null,
) {
  public fun toModel(): InventoryItem.Instance =
    InventoryItem.Instance(
      id = this@InventoryItemInstanceSurrogate.id,
      extension = this@InventoryItemInstanceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@InventoryItemInstanceSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@InventoryItemInstanceSurrogate.identifier ?: mutableListOf(),
      lotNumber =
        R5String.of(
          this@InventoryItemInstanceSurrogate.lotNumber,
          this@InventoryItemInstanceSurrogate._lotNumber,
        ),
      expiry =
        DateTime.of(
          FhirDateTime.fromString(this@InventoryItemInstanceSurrogate.expiry),
          this@InventoryItemInstanceSurrogate._expiry,
        ),
      subject = this@InventoryItemInstanceSurrogate.subject,
      location = this@InventoryItemInstanceSurrogate.location,
    )

  public companion object {
    public fun fromModel(model: InventoryItem.Instance): InventoryItemInstanceSurrogate =
      with(model) {
        InventoryItemInstanceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          lotNumber = this@with.lotNumber?.value,
          _lotNumber = this@with.lotNumber?.toElement(),
          expiry = this@with.expiry?.value?.toString(),
          _expiry = this@with.expiry?.toElement(),
          subject = this@with.subject,
          location = this@with.location,
        )
      }
  }
}

@Serializable
internal data class InventoryItemSurrogate(
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
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var code: MutableList<CodeableConcept>? = null,
  public var name: MutableList<InventoryItem.Name>? = null,
  public var responsibleOrganization: MutableList<InventoryItem.ResponsibleOrganization>? = null,
  public var description: InventoryItem.Description? = null,
  public var inventoryStatus: MutableList<CodeableConcept>? = null,
  public var baseUnit: CodeableConcept? = null,
  public var netContent: Quantity? = null,
  public var association: MutableList<InventoryItem.Association>? = null,
  public var characteristic: MutableList<InventoryItem.Characteristic>? = null,
  public var instance: InventoryItem.Instance? = null,
  public var productReference: Reference? = null,
) {
  public fun toModel(): InventoryItem =
    InventoryItem(
      id = this@InventoryItemSurrogate.id,
      meta = this@InventoryItemSurrogate.meta,
      implicitRules =
        Uri.of(
          this@InventoryItemSurrogate.implicitRules,
          this@InventoryItemSurrogate._implicitRules,
        ),
      language =
        Code.of(this@InventoryItemSurrogate.language, this@InventoryItemSurrogate._language),
      text = this@InventoryItemSurrogate.text,
      contained = this@InventoryItemSurrogate.contained ?: mutableListOf(),
      extension = this@InventoryItemSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@InventoryItemSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@InventoryItemSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.InventoryItem.InventoryItemStatus.fromCode(
            this@InventoryItemSurrogate.status!!
          ),
          this@InventoryItemSurrogate._status,
        ),
      category = this@InventoryItemSurrogate.category ?: mutableListOf(),
      code = this@InventoryItemSurrogate.code ?: mutableListOf(),
      name = this@InventoryItemSurrogate.name ?: mutableListOf(),
      responsibleOrganization =
        this@InventoryItemSurrogate.responsibleOrganization ?: mutableListOf(),
      description = this@InventoryItemSurrogate.description,
      inventoryStatus = this@InventoryItemSurrogate.inventoryStatus ?: mutableListOf(),
      baseUnit = this@InventoryItemSurrogate.baseUnit,
      netContent = this@InventoryItemSurrogate.netContent,
      association = this@InventoryItemSurrogate.association ?: mutableListOf(),
      characteristic = this@InventoryItemSurrogate.characteristic ?: mutableListOf(),
      instance = this@InventoryItemSurrogate.instance,
      productReference = this@InventoryItemSurrogate.productReference,
    )

  public companion object {
    public fun fromModel(model: InventoryItem): InventoryItemSurrogate =
      with(model) {
        InventoryItemSurrogate(
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
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          code = this@with.code.takeUnless { it.all { it == null } },
          name = this@with.name.takeUnless { it.all { it == null } },
          responsibleOrganization =
            this@with.responsibleOrganization.takeUnless { it.all { it == null } },
          description = this@with.description,
          inventoryStatus = this@with.inventoryStatus.takeUnless { it.all { it == null } },
          baseUnit = this@with.baseUnit,
          netContent = this@with.netContent,
          association = this@with.association.takeUnless { it.all { it == null } },
          characteristic = this@with.characteristic.takeUnless { it.all { it == null } },
          instance = this@with.instance,
          productReference = this@with.productReference,
        )
      }
  }
}
