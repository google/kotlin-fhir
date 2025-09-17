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
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          code = this@with.code,
          jurisdiction = this@with.jurisdiction,
        )
      }
  }
}

@Serializable
internal data class PackagedProductDefinitionPackageSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var type: CodeableConcept? = null,
  public var quantity: Int? = null,
  public var _quantity: Element? = null,
  public var material: MutableList<CodeableConcept>? = null,
  public var alternateMaterial: MutableList<CodeableConcept>? = null,
  public var shelfLifeStorage: MutableList<PackagedProductDefinition.Package.ShelfLifeStorage>? =
    null,
  public var manufacturer: MutableList<Reference>? = null,
  public var `property`: MutableList<PackagedProductDefinition.Package.Property>? = null,
  public var containedItem: MutableList<PackagedProductDefinition.Package.ContainedItem>? = null,
  public var `package`: MutableList<PackagedProductDefinition.Package>? = null,
) {
  public fun toModel(): PackagedProductDefinition.Package =
    PackagedProductDefinition.Package(
      id = this@PackagedProductDefinitionPackageSurrogate.id,
      extension = this@PackagedProductDefinitionPackageSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PackagedProductDefinitionPackageSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@PackagedProductDefinitionPackageSurrogate.identifier ?: mutableListOf(),
      type = this@PackagedProductDefinitionPackageSurrogate.type,
      quantity =
        Integer.of(
          this@PackagedProductDefinitionPackageSurrogate.quantity,
          this@PackagedProductDefinitionPackageSurrogate._quantity,
        ),
      material = this@PackagedProductDefinitionPackageSurrogate.material ?: mutableListOf(),
      alternateMaterial =
        this@PackagedProductDefinitionPackageSurrogate.alternateMaterial ?: mutableListOf(),
      shelfLifeStorage =
        this@PackagedProductDefinitionPackageSurrogate.shelfLifeStorage ?: mutableListOf(),
      manufacturer = this@PackagedProductDefinitionPackageSurrogate.manufacturer ?: mutableListOf(),
      `property` = this@PackagedProductDefinitionPackageSurrogate.`property` ?: mutableListOf(),
      containedItem =
        this@PackagedProductDefinitionPackageSurrogate.containedItem ?: mutableListOf(),
      `package` = this@PackagedProductDefinitionPackageSurrogate.`package` ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Package
    ): PackagedProductDefinitionPackageSurrogate =
      with(model) {
        PackagedProductDefinitionPackageSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
          type = this@with.type,
          quantity = this@with.quantity?.value,
          _quantity = this@with.quantity?.toElement(),
          material = this@with.material.takeIf { it.isNotEmpty() },
          alternateMaterial = this@with.alternateMaterial.takeIf { it.isNotEmpty() },
          shelfLifeStorage = this@with.shelfLifeStorage.takeIf { it.isNotEmpty() },
          manufacturer = this@with.manufacturer.takeIf { it.isNotEmpty() },
          `property` = this@with.`property`.takeIf { it.isNotEmpty() },
          containedItem = this@with.containedItem.takeIf { it.isNotEmpty() },
          `package` = this@with.`package`.takeIf { it.isNotEmpty() },
        )
      }
  }
}

@Serializable
internal data class PackagedProductDefinitionPackageShelfLifeStorageSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var period: PackagedProductDefinition.Package.ShelfLifeStorage.Period? = null,
  public var specialPrecautionsForStorage: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): PackagedProductDefinition.Package.ShelfLifeStorage =
    PackagedProductDefinition.Package.ShelfLifeStorage(
      id = this@PackagedProductDefinitionPackageShelfLifeStorageSurrogate.id,
      extension =
        this@PackagedProductDefinitionPackageShelfLifeStorageSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PackagedProductDefinitionPackageShelfLifeStorageSurrogate.modifierExtension
          ?: mutableListOf(),
      type = this@PackagedProductDefinitionPackageShelfLifeStorageSurrogate.type,
      period = this@PackagedProductDefinitionPackageShelfLifeStorageSurrogate.period,
      specialPrecautionsForStorage =
        this@PackagedProductDefinitionPackageShelfLifeStorageSurrogate.specialPrecautionsForStorage
          ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Package.ShelfLifeStorage
    ): PackagedProductDefinitionPackageShelfLifeStorageSurrogate =
      with(model) {
        PackagedProductDefinitionPackageShelfLifeStorageSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          type = this@with.type,
          period = this@with.period,
          specialPrecautionsForStorage =
            this@with.specialPrecautionsForStorage.takeIf { it.isNotEmpty() },
        )
      }
  }
}

@Serializable
internal data class PackagedProductDefinitionPackagePropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var `value`: PackagedProductDefinition.Package.Property.Value? = null,
) {
  public fun toModel(): PackagedProductDefinition.Package.Property =
    PackagedProductDefinition.Package.Property(
      id = this@PackagedProductDefinitionPackagePropertySurrogate.id,
      extension =
        this@PackagedProductDefinitionPackagePropertySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PackagedProductDefinitionPackagePropertySurrogate.modifierExtension ?: mutableListOf(),
      type = this@PackagedProductDefinitionPackagePropertySurrogate.type,
      `value` = this@PackagedProductDefinitionPackagePropertySurrogate.`value`,
    )

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Package.Property
    ): PackagedProductDefinitionPackagePropertySurrogate =
      with(model) {
        PackagedProductDefinitionPackagePropertySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          type = this@with.type,
          `value` = this@with.`value`,
        )
      }
  }
}

@Serializable
internal data class PackagedProductDefinitionPackageContainedItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var item: CodeableReference,
  public var amount: Quantity? = null,
) {
  public fun toModel(): PackagedProductDefinition.Package.ContainedItem =
    PackagedProductDefinition.Package.ContainedItem(
      id = this@PackagedProductDefinitionPackageContainedItemSurrogate.id,
      extension =
        this@PackagedProductDefinitionPackageContainedItemSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@PackagedProductDefinitionPackageContainedItemSurrogate.modifierExtension
          ?: mutableListOf(),
      item = this@PackagedProductDefinitionPackageContainedItemSurrogate.item,
      amount = this@PackagedProductDefinitionPackageContainedItemSurrogate.amount,
    )

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Package.ContainedItem
    ): PackagedProductDefinitionPackageContainedItemSurrogate =
      with(model) {
        PackagedProductDefinitionPackageContainedItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          item = this@with.item,
          amount = this@with.amount,
        )
      }
  }
}

@Serializable
internal data class PackagedProductDefinitionPackageShelfLifeStoragePeriodSurrogate(
  public var periodDuration: Duration? = null,
  public var periodString: KotlinString? = null,
  public var _periodString: Element? = null,
) {
  public fun toModel(): PackagedProductDefinition.Package.ShelfLifeStorage.Period =
    PackagedProductDefinition.Package.ShelfLifeStorage.Period.from(
      this@PackagedProductDefinitionPackageShelfLifeStoragePeriodSurrogate.periodDuration,
      R4bString.of(
        this@PackagedProductDefinitionPackageShelfLifeStoragePeriodSurrogate.periodString,
        this@PackagedProductDefinitionPackageShelfLifeStoragePeriodSurrogate._periodString,
      ),
    )!!

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Package.ShelfLifeStorage.Period
    ): PackagedProductDefinitionPackageShelfLifeStoragePeriodSurrogate =
      with(model) {
        PackagedProductDefinitionPackageShelfLifeStoragePeriodSurrogate(
          periodDuration = this@with.asDuration()?.value,
          periodString = this@with.asString()?.value?.value,
          _periodString = this@with.asString()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class PackagedProductDefinitionPackagePropertyValueSurrogate(
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueDate: KotlinString? = null,
  public var _valueDate: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueAttachment: Attachment? = null,
) {
  public fun toModel(): PackagedProductDefinition.Package.Property.Value =
    PackagedProductDefinition.Package.Property.Value.from(
      this@PackagedProductDefinitionPackagePropertyValueSurrogate.valueCodeableConcept,
      this@PackagedProductDefinitionPackagePropertyValueSurrogate.valueQuantity,
      Date.of(
        FhirDate.fromString(this@PackagedProductDefinitionPackagePropertyValueSurrogate.valueDate),
        this@PackagedProductDefinitionPackagePropertyValueSurrogate._valueDate,
      ),
      R4bBoolean.of(
        this@PackagedProductDefinitionPackagePropertyValueSurrogate.valueBoolean,
        this@PackagedProductDefinitionPackagePropertyValueSurrogate._valueBoolean,
      ),
      this@PackagedProductDefinitionPackagePropertyValueSurrogate.valueAttachment,
    )!!

  public companion object {
    public fun fromModel(
      model: PackagedProductDefinition.Package.Property.Value
    ): PackagedProductDefinitionPackagePropertyValueSurrogate =
      with(model) {
        PackagedProductDefinitionPackagePropertyValueSurrogate(
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
  public var characteristic: MutableList<CodeableConcept>? = null,
  public var copackagedIndicator: KotlinBoolean? = null,
  public var _copackagedIndicator: Element? = null,
  public var manufacturer: MutableList<Reference>? = null,
  public var `package`: PackagedProductDefinition.Package? = null,
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
        R4bString.of(
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
      characteristic = this@PackagedProductDefinitionSurrogate.characteristic ?: mutableListOf(),
      copackagedIndicator =
        R4bBoolean.of(
          this@PackagedProductDefinitionSurrogate.copackagedIndicator,
          this@PackagedProductDefinitionSurrogate._copackagedIndicator,
        ),
      manufacturer = this@PackagedProductDefinitionSurrogate.manufacturer ?: mutableListOf(),
      `package` = this@PackagedProductDefinitionSurrogate.`package`,
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
          contained = this@with.contained.takeIf { it.isNotEmpty() },
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          type = this@with.type,
          packageFor = this@with.packageFor.takeIf { it.isNotEmpty() },
          status = this@with.status,
          statusDate = this@with.statusDate?.value?.toString(),
          _statusDate = this@with.statusDate?.toElement(),
          containedItemQuantity = this@with.containedItemQuantity.takeIf { it.isNotEmpty() },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          legalStatusOfSupply = this@with.legalStatusOfSupply.takeIf { it.isNotEmpty() },
          marketingStatus = this@with.marketingStatus.takeIf { it.isNotEmpty() },
          characteristic = this@with.characteristic.takeIf { it.isNotEmpty() },
          copackagedIndicator = this@with.copackagedIndicator?.value,
          _copackagedIndicator = this@with.copackagedIndicator?.toElement(),
          manufacturer = this@with.manufacturer.takeIf { it.isNotEmpty() },
          `package` = this@with.`package`,
        )
      }
  }
}
