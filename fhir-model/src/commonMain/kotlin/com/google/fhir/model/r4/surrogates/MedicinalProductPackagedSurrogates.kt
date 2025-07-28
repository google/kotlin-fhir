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
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.MarketingStatus
import com.google.fhir.model.r4.MedicinalProductPackaged
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.ProdCharacteristic
import com.google.fhir.model.r4.ProductShelfLife
import com.google.fhir.model.r4.Quantity
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
internal data class MedicinalProductPackagedBatchIdentifierSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var outerPackaging: Identifier,
  public var immediatePackaging: Identifier? = null,
) {
  public fun toModel(): MedicinalProductPackaged.BatchIdentifier =
    MedicinalProductPackaged.BatchIdentifier(
      id = this@MedicinalProductPackagedBatchIdentifierSurrogate.id,
      extension =
        this@MedicinalProductPackagedBatchIdentifierSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductPackagedBatchIdentifierSurrogate.modifierExtension ?: mutableListOf(),
      outerPackaging = this@MedicinalProductPackagedBatchIdentifierSurrogate.outerPackaging,
      immediatePackaging = this@MedicinalProductPackagedBatchIdentifierSurrogate.immediatePackaging,
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductPackaged.BatchIdentifier
    ): MedicinalProductPackagedBatchIdentifierSurrogate =
      with(model) {
        MedicinalProductPackagedBatchIdentifierSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          outerPackaging = this@with.outerPackaging,
          immediatePackaging = this@with.immediatePackaging,
        )
      }
  }
}

@Serializable
internal data class MedicinalProductPackagedPackageItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var type: CodeableConcept,
  public var quantity: Quantity,
  public var material: MutableList<CodeableConcept>? = null,
  public var alternateMaterial: MutableList<CodeableConcept>? = null,
  public var device: MutableList<Reference>? = null,
  public var manufacturedItem: MutableList<Reference>? = null,
  public var packageItem: MutableList<MedicinalProductPackaged.PackageItem>? = null,
  public var physicalCharacteristics: ProdCharacteristic? = null,
  public var otherCharacteristics: MutableList<CodeableConcept>? = null,
  public var shelfLifeStorage: MutableList<ProductShelfLife>? = null,
  public var manufacturer: MutableList<Reference>? = null,
) {
  public fun toModel(): MedicinalProductPackaged.PackageItem =
    MedicinalProductPackaged.PackageItem(
      id = this@MedicinalProductPackagedPackageItemSurrogate.id,
      extension = this@MedicinalProductPackagedPackageItemSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductPackagedPackageItemSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@MedicinalProductPackagedPackageItemSurrogate.identifier ?: mutableListOf(),
      type = this@MedicinalProductPackagedPackageItemSurrogate.type,
      quantity = this@MedicinalProductPackagedPackageItemSurrogate.quantity,
      material = this@MedicinalProductPackagedPackageItemSurrogate.material ?: mutableListOf(),
      alternateMaterial =
        this@MedicinalProductPackagedPackageItemSurrogate.alternateMaterial ?: mutableListOf(),
      device = this@MedicinalProductPackagedPackageItemSurrogate.device ?: mutableListOf(),
      manufacturedItem =
        this@MedicinalProductPackagedPackageItemSurrogate.manufacturedItem ?: mutableListOf(),
      packageItem =
        this@MedicinalProductPackagedPackageItemSurrogate.packageItem ?: mutableListOf(),
      physicalCharacteristics =
        this@MedicinalProductPackagedPackageItemSurrogate.physicalCharacteristics,
      otherCharacteristics =
        this@MedicinalProductPackagedPackageItemSurrogate.otherCharacteristics ?: mutableListOf(),
      shelfLifeStorage =
        this@MedicinalProductPackagedPackageItemSurrogate.shelfLifeStorage ?: mutableListOf(),
      manufacturer =
        this@MedicinalProductPackagedPackageItemSurrogate.manufacturer ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductPackaged.PackageItem
    ): MedicinalProductPackagedPackageItemSurrogate =
      with(model) {
        MedicinalProductPackagedPackageItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          type = this@with.type,
          quantity = this@with.quantity,
          material = this@with.material.takeUnless { it.all { it == null } },
          alternateMaterial = this@with.alternateMaterial.takeUnless { it.all { it == null } },
          device = this@with.device.takeUnless { it.all { it == null } },
          manufacturedItem = this@with.manufacturedItem.takeUnless { it.all { it == null } },
          packageItem = this@with.packageItem.takeUnless { it.all { it == null } },
          physicalCharacteristics = this@with.physicalCharacteristics,
          otherCharacteristics =
            this@with.otherCharacteristics.takeUnless { it.all { it == null } },
          shelfLifeStorage = this@with.shelfLifeStorage.takeUnless { it.all { it == null } },
          manufacturer = this@with.manufacturer.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class MedicinalProductPackagedSurrogate(
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
  public var subject: MutableList<Reference>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var legalStatusOfSupply: CodeableConcept? = null,
  public var marketingStatus: MutableList<MarketingStatus>? = null,
  public var marketingAuthorization: Reference? = null,
  public var manufacturer: MutableList<Reference>? = null,
  public var batchIdentifier: MutableList<MedicinalProductPackaged.BatchIdentifier>? = null,
  public var packageItem: MutableList<MedicinalProductPackaged.PackageItem>? = null,
) {
  public fun toModel(): MedicinalProductPackaged =
    MedicinalProductPackaged(
      id = this@MedicinalProductPackagedSurrogate.id,
      meta = this@MedicinalProductPackagedSurrogate.meta,
      implicitRules =
        Uri.of(
          this@MedicinalProductPackagedSurrogate.implicitRules,
          this@MedicinalProductPackagedSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@MedicinalProductPackagedSurrogate.language,
          this@MedicinalProductPackagedSurrogate._language,
        ),
      text = this@MedicinalProductPackagedSurrogate.text,
      contained = this@MedicinalProductPackagedSurrogate.contained ?: mutableListOf(),
      extension = this@MedicinalProductPackagedSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductPackagedSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@MedicinalProductPackagedSurrogate.identifier ?: mutableListOf(),
      subject = this@MedicinalProductPackagedSurrogate.subject ?: mutableListOf(),
      description =
        R4String.of(
          this@MedicinalProductPackagedSurrogate.description,
          this@MedicinalProductPackagedSurrogate._description,
        ),
      legalStatusOfSupply = this@MedicinalProductPackagedSurrogate.legalStatusOfSupply,
      marketingStatus = this@MedicinalProductPackagedSurrogate.marketingStatus ?: mutableListOf(),
      marketingAuthorization = this@MedicinalProductPackagedSurrogate.marketingAuthorization,
      manufacturer = this@MedicinalProductPackagedSurrogate.manufacturer ?: mutableListOf(),
      batchIdentifier = this@MedicinalProductPackagedSurrogate.batchIdentifier ?: mutableListOf(),
      packageItem = this@MedicinalProductPackagedSurrogate.packageItem ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: MedicinalProductPackaged): MedicinalProductPackagedSurrogate =
      with(model) {
        MedicinalProductPackagedSurrogate(
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
          subject = this@with.subject.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          legalStatusOfSupply = this@with.legalStatusOfSupply,
          marketingStatus = this@with.marketingStatus.takeUnless { it.all { it == null } },
          marketingAuthorization = this@with.marketingAuthorization,
          manufacturer = this@with.manufacturer.takeUnless { it.all { it == null } },
          batchIdentifier = this@with.batchIdentifier.takeUnless { it.all { it == null } },
          packageItem = this@with.packageItem.takeUnless { it.all { it == null } },
        )
      }
  }
}
