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

import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactPoint
import com.google.fhir.model.r5.DeviceDefinition
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Integer
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.ProductShelfLife
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
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
internal data class DeviceDefinitionUdiDeviceIdentifierMarketDistributionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var marketPeriod: Period,
  public var subJurisdiction: KotlinString? = null,
  public var _subJurisdiction: Element? = null,
) {
  public fun toModel(): DeviceDefinition.UdiDeviceIdentifier.MarketDistribution =
    DeviceDefinition.UdiDeviceIdentifier.MarketDistribution(
      id = this@DeviceDefinitionUdiDeviceIdentifierMarketDistributionSurrogate.id,
      extension =
        this@DeviceDefinitionUdiDeviceIdentifierMarketDistributionSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@DeviceDefinitionUdiDeviceIdentifierMarketDistributionSurrogate.modifierExtension
          ?: mutableListOf(),
      marketPeriod =
        this@DeviceDefinitionUdiDeviceIdentifierMarketDistributionSurrogate.marketPeriod,
      subJurisdiction =
        Uri.of(
          this@DeviceDefinitionUdiDeviceIdentifierMarketDistributionSurrogate.subJurisdiction,
          this@DeviceDefinitionUdiDeviceIdentifierMarketDistributionSurrogate._subJurisdiction,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: DeviceDefinition.UdiDeviceIdentifier.MarketDistribution
    ): DeviceDefinitionUdiDeviceIdentifierMarketDistributionSurrogate =
      with(model) {
        DeviceDefinitionUdiDeviceIdentifierMarketDistributionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          marketPeriod = this@with.marketPeriod,
          subJurisdiction = this@with.subJurisdiction.value,
          _subJurisdiction = this@with.subJurisdiction.toElement(),
        )
      }
  }
}

@Serializable
internal data class DeviceDefinitionUdiDeviceIdentifierSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var deviceIdentifier: KotlinString? = null,
  public var _deviceIdentifier: Element? = null,
  public var issuer: KotlinString? = null,
  public var _issuer: Element? = null,
  public var jurisdiction: KotlinString? = null,
  public var _jurisdiction: Element? = null,
  public var marketDistribution:
    MutableList<DeviceDefinition.UdiDeviceIdentifier.MarketDistribution>? =
    null,
) {
  public fun toModel(): DeviceDefinition.UdiDeviceIdentifier =
    DeviceDefinition.UdiDeviceIdentifier(
      id = this@DeviceDefinitionUdiDeviceIdentifierSurrogate.id,
      extension = this@DeviceDefinitionUdiDeviceIdentifierSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DeviceDefinitionUdiDeviceIdentifierSurrogate.modifierExtension ?: mutableListOf(),
      deviceIdentifier =
        R5String.of(
          this@DeviceDefinitionUdiDeviceIdentifierSurrogate.deviceIdentifier,
          this@DeviceDefinitionUdiDeviceIdentifierSurrogate._deviceIdentifier,
        )!!,
      issuer =
        Uri.of(
          this@DeviceDefinitionUdiDeviceIdentifierSurrogate.issuer,
          this@DeviceDefinitionUdiDeviceIdentifierSurrogate._issuer,
        )!!,
      jurisdiction =
        Uri.of(
          this@DeviceDefinitionUdiDeviceIdentifierSurrogate.jurisdiction,
          this@DeviceDefinitionUdiDeviceIdentifierSurrogate._jurisdiction,
        )!!,
      marketDistribution =
        this@DeviceDefinitionUdiDeviceIdentifierSurrogate.marketDistribution ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: DeviceDefinition.UdiDeviceIdentifier
    ): DeviceDefinitionUdiDeviceIdentifierSurrogate =
      with(model) {
        DeviceDefinitionUdiDeviceIdentifierSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          deviceIdentifier = this@with.deviceIdentifier.value,
          _deviceIdentifier = this@with.deviceIdentifier.toElement(),
          issuer = this@with.issuer.value,
          _issuer = this@with.issuer.toElement(),
          jurisdiction = this@with.jurisdiction.value,
          _jurisdiction = this@with.jurisdiction.toElement(),
          marketDistribution = this@with.marketDistribution.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class DeviceDefinitionRegulatoryIdentifierSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var deviceIdentifier: KotlinString? = null,
  public var _deviceIdentifier: Element? = null,
  public var issuer: KotlinString? = null,
  public var _issuer: Element? = null,
  public var jurisdiction: KotlinString? = null,
  public var _jurisdiction: Element? = null,
) {
  public fun toModel(): DeviceDefinition.RegulatoryIdentifier =
    DeviceDefinition.RegulatoryIdentifier(
      id = this@DeviceDefinitionRegulatoryIdentifierSurrogate.id,
      extension = this@DeviceDefinitionRegulatoryIdentifierSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DeviceDefinitionRegulatoryIdentifierSurrogate.modifierExtension ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r5.DeviceDefinition.DeviceRegulatoryIdentifierType.fromCode(
            this@DeviceDefinitionRegulatoryIdentifierSurrogate.type!!
          ),
          this@DeviceDefinitionRegulatoryIdentifierSurrogate._type,
        ),
      deviceIdentifier =
        R5String.of(
          this@DeviceDefinitionRegulatoryIdentifierSurrogate.deviceIdentifier,
          this@DeviceDefinitionRegulatoryIdentifierSurrogate._deviceIdentifier,
        )!!,
      issuer =
        Uri.of(
          this@DeviceDefinitionRegulatoryIdentifierSurrogate.issuer,
          this@DeviceDefinitionRegulatoryIdentifierSurrogate._issuer,
        )!!,
      jurisdiction =
        Uri.of(
          this@DeviceDefinitionRegulatoryIdentifierSurrogate.jurisdiction,
          this@DeviceDefinitionRegulatoryIdentifierSurrogate._jurisdiction,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: DeviceDefinition.RegulatoryIdentifier
    ): DeviceDefinitionRegulatoryIdentifierSurrogate =
      with(model) {
        DeviceDefinitionRegulatoryIdentifierSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          deviceIdentifier = this@with.deviceIdentifier.value,
          _deviceIdentifier = this@with.deviceIdentifier.toElement(),
          issuer = this@with.issuer.value,
          _issuer = this@with.issuer.toElement(),
          jurisdiction = this@with.jurisdiction.value,
          _jurisdiction = this@with.jurisdiction.toElement(),
        )
      }
  }
}

@Serializable
internal data class DeviceDefinitionDeviceNameSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
) {
  public fun toModel(): DeviceDefinition.DeviceName =
    DeviceDefinition.DeviceName(
      id = this@DeviceDefinitionDeviceNameSurrogate.id,
      extension = this@DeviceDefinitionDeviceNameSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DeviceDefinitionDeviceNameSurrogate.modifierExtension ?: mutableListOf(),
      name =
        R5String.of(
          this@DeviceDefinitionDeviceNameSurrogate.name,
          this@DeviceDefinitionDeviceNameSurrogate._name,
        )!!,
      type =
        Enumeration.of(
          com.google.fhir.model.r5.DeviceDefinition.DeviceNameType.fromCode(
            this@DeviceDefinitionDeviceNameSurrogate.type!!
          ),
          this@DeviceDefinitionDeviceNameSurrogate._type,
        ),
    )

  public companion object {
    public fun fromModel(model: DeviceDefinition.DeviceName): DeviceDefinitionDeviceNameSurrogate =
      with(model) {
        DeviceDefinitionDeviceNameSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
        )
      }
  }
}

@Serializable
internal data class DeviceDefinitionClassificationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var justification: MutableList<RelatedArtifact>? = null,
) {
  public fun toModel(): DeviceDefinition.Classification =
    DeviceDefinition.Classification(
      id = this@DeviceDefinitionClassificationSurrogate.id,
      extension = this@DeviceDefinitionClassificationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DeviceDefinitionClassificationSurrogate.modifierExtension ?: mutableListOf(),
      type = this@DeviceDefinitionClassificationSurrogate.type,
      justification = this@DeviceDefinitionClassificationSurrogate.justification ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: DeviceDefinition.Classification
    ): DeviceDefinitionClassificationSurrogate =
      with(model) {
        DeviceDefinitionClassificationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          justification = this@with.justification.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class DeviceDefinitionConformsToSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var category: CodeableConcept? = null,
  public var specification: CodeableConcept,
  public var version: MutableList<KotlinString?>? = null,
  public var _version: MutableList<Element?>? = null,
  public var source: MutableList<RelatedArtifact>? = null,
) {
  public fun toModel(): DeviceDefinition.ConformsTo =
    DeviceDefinition.ConformsTo(
      id = this@DeviceDefinitionConformsToSurrogate.id,
      extension = this@DeviceDefinitionConformsToSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DeviceDefinitionConformsToSurrogate.modifierExtension ?: mutableListOf(),
      category = this@DeviceDefinitionConformsToSurrogate.category,
      specification = this@DeviceDefinitionConformsToSurrogate.specification,
      version =
        if (
          this@DeviceDefinitionConformsToSurrogate.version == null &&
            this@DeviceDefinitionConformsToSurrogate._version == null
        ) {
          mutableListOf()
        } else {
          (this@DeviceDefinitionConformsToSurrogate.version
              ?: List(this@DeviceDefinitionConformsToSurrogate._version!!.size) { null })
            .zip(
              this@DeviceDefinitionConformsToSurrogate._version
                ?: List(this@DeviceDefinitionConformsToSurrogate.version!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      source = this@DeviceDefinitionConformsToSurrogate.source ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DeviceDefinition.ConformsTo): DeviceDefinitionConformsToSurrogate =
      with(model) {
        DeviceDefinitionConformsToSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          category = this@with.category,
          specification = this@with.specification,
          version =
            this@with.version.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _version =
            this@with.version
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          source = this@with.source.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class DeviceDefinitionHasPartSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var reference: Reference,
  public var count: Int? = null,
  public var _count: Element? = null,
) {
  public fun toModel(): DeviceDefinition.HasPart =
    DeviceDefinition.HasPart(
      id = this@DeviceDefinitionHasPartSurrogate.id,
      extension = this@DeviceDefinitionHasPartSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DeviceDefinitionHasPartSurrogate.modifierExtension ?: mutableListOf(),
      reference = this@DeviceDefinitionHasPartSurrogate.reference,
      count =
        Integer.of(
          this@DeviceDefinitionHasPartSurrogate.count,
          this@DeviceDefinitionHasPartSurrogate._count,
        ),
    )

  public companion object {
    public fun fromModel(model: DeviceDefinition.HasPart): DeviceDefinitionHasPartSurrogate =
      with(model) {
        DeviceDefinitionHasPartSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          reference = this@with.reference,
          count = this@with.count?.value,
          _count = this@with.count?.toElement(),
        )
      }
  }
}

@Serializable
internal data class DeviceDefinitionPackagingDistributorSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var organizationReference: MutableList<Reference>? = null,
) {
  public fun toModel(): DeviceDefinition.Packaging.Distributor =
    DeviceDefinition.Packaging.Distributor(
      id = this@DeviceDefinitionPackagingDistributorSurrogate.id,
      extension = this@DeviceDefinitionPackagingDistributorSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DeviceDefinitionPackagingDistributorSurrogate.modifierExtension ?: mutableListOf(),
      name =
        R5String.of(
          this@DeviceDefinitionPackagingDistributorSurrogate.name,
          this@DeviceDefinitionPackagingDistributorSurrogate._name,
        ),
      organizationReference =
        this@DeviceDefinitionPackagingDistributorSurrogate.organizationReference ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: DeviceDefinition.Packaging.Distributor
    ): DeviceDefinitionPackagingDistributorSurrogate =
      with(model) {
        DeviceDefinitionPackagingDistributorSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          organizationReference =
            this@with.organizationReference.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class DeviceDefinitionPackagingSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: Identifier? = null,
  public var type: CodeableConcept? = null,
  public var count: Int? = null,
  public var _count: Element? = null,
  public var distributor: MutableList<DeviceDefinition.Packaging.Distributor>? = null,
  public var udiDeviceIdentifier: MutableList<DeviceDefinition.UdiDeviceIdentifier>? = null,
  public var packaging: MutableList<DeviceDefinition.Packaging>? = null,
) {
  public fun toModel(): DeviceDefinition.Packaging =
    DeviceDefinition.Packaging(
      id = this@DeviceDefinitionPackagingSurrogate.id,
      extension = this@DeviceDefinitionPackagingSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DeviceDefinitionPackagingSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@DeviceDefinitionPackagingSurrogate.identifier,
      type = this@DeviceDefinitionPackagingSurrogate.type,
      count =
        Integer.of(
          this@DeviceDefinitionPackagingSurrogate.count,
          this@DeviceDefinitionPackagingSurrogate._count,
        ),
      distributor = this@DeviceDefinitionPackagingSurrogate.distributor ?: mutableListOf(),
      udiDeviceIdentifier =
        this@DeviceDefinitionPackagingSurrogate.udiDeviceIdentifier ?: mutableListOf(),
      packaging = this@DeviceDefinitionPackagingSurrogate.packaging ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DeviceDefinition.Packaging): DeviceDefinitionPackagingSurrogate =
      with(model) {
        DeviceDefinitionPackagingSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier,
          type = this@with.type,
          count = this@with.count?.value,
          _count = this@with.count?.toElement(),
          distributor = this@with.distributor.takeUnless { it.all { it == null } },
          udiDeviceIdentifier = this@with.udiDeviceIdentifier.takeUnless { it.all { it == null } },
          packaging = this@with.packaging.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class DeviceDefinitionVersionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var component: Identifier? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
) {
  public fun toModel(): DeviceDefinition.Version =
    DeviceDefinition.Version(
      id = this@DeviceDefinitionVersionSurrogate.id,
      extension = this@DeviceDefinitionVersionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DeviceDefinitionVersionSurrogate.modifierExtension ?: mutableListOf(),
      type = this@DeviceDefinitionVersionSurrogate.type,
      component = this@DeviceDefinitionVersionSurrogate.component,
      `value` =
        R5String.of(
          this@DeviceDefinitionVersionSurrogate.`value`,
          this@DeviceDefinitionVersionSurrogate._value,
        )!!,
    )

  public companion object {
    public fun fromModel(model: DeviceDefinition.Version): DeviceDefinitionVersionSurrogate =
      with(model) {
        DeviceDefinitionVersionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          component = this@with.component,
          `value` = this@with.`value`.value,
          _value = this@with.`value`.toElement(),
        )
      }
  }
}

@Serializable
internal data class DeviceDefinitionPropertyValueSurrogate(
  public var valueQuantity: Quantity? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueString: KotlinString? = null,
  public var _valueString: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueInteger: Int? = null,
  public var _valueInteger: Element? = null,
  public var valueRange: Range? = null,
  public var valueAttachment: Attachment? = null,
) {
  public fun toModel(): DeviceDefinition.Property.Value =
    DeviceDefinition.Property.Value.from(
      this@DeviceDefinitionPropertyValueSurrogate.valueQuantity,
      this@DeviceDefinitionPropertyValueSurrogate.valueCodeableConcept,
      R5String.of(
        this@DeviceDefinitionPropertyValueSurrogate.valueString,
        this@DeviceDefinitionPropertyValueSurrogate._valueString,
      ),
      R5Boolean.of(
        this@DeviceDefinitionPropertyValueSurrogate.valueBoolean,
        this@DeviceDefinitionPropertyValueSurrogate._valueBoolean,
      ),
      Integer.of(
        this@DeviceDefinitionPropertyValueSurrogate.valueInteger,
        this@DeviceDefinitionPropertyValueSurrogate._valueInteger,
      ),
      this@DeviceDefinitionPropertyValueSurrogate.valueRange,
      this@DeviceDefinitionPropertyValueSurrogate.valueAttachment,
    )!!

  public companion object {
    public fun fromModel(
      model: DeviceDefinition.Property.Value
    ): DeviceDefinitionPropertyValueSurrogate =
      with(model) {
        DeviceDefinitionPropertyValueSurrogate().apply {
          DeviceDefinition.Property.Value.from(
            this@DeviceDefinitionPropertyValueSurrogate.valueQuantity,
            this@DeviceDefinitionPropertyValueSurrogate.valueCodeableConcept,
            R5String.of(
              this@DeviceDefinitionPropertyValueSurrogate.valueString,
              this@DeviceDefinitionPropertyValueSurrogate._valueString,
            ),
            R5Boolean.of(
              this@DeviceDefinitionPropertyValueSurrogate.valueBoolean,
              this@DeviceDefinitionPropertyValueSurrogate._valueBoolean,
            ),
            Integer.of(
              this@DeviceDefinitionPropertyValueSurrogate.valueInteger,
              this@DeviceDefinitionPropertyValueSurrogate._valueInteger,
            ),
            this@DeviceDefinitionPropertyValueSurrogate.valueRange,
            this@DeviceDefinitionPropertyValueSurrogate.valueAttachment,
          )!!
        }
      }
  }
}

@Serializable
internal data class DeviceDefinitionPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var `value`: DeviceDefinition.Property.Value,
) {
  public fun toModel(): DeviceDefinition.Property =
    DeviceDefinition.Property(
      id = this@DeviceDefinitionPropertySurrogate.id,
      extension = this@DeviceDefinitionPropertySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DeviceDefinitionPropertySurrogate.modifierExtension ?: mutableListOf(),
      type = this@DeviceDefinitionPropertySurrogate.type,
      `value` = this@DeviceDefinitionPropertySurrogate.`value`,
    )

  public companion object {
    public fun fromModel(model: DeviceDefinition.Property): DeviceDefinitionPropertySurrogate =
      with(model) {
        DeviceDefinitionPropertySurrogate(
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
internal data class DeviceDefinitionLinkSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var relation: Coding,
  public var relatedDevice: CodeableReference,
) {
  public fun toModel(): DeviceDefinition.Link =
    DeviceDefinition.Link(
      id = this@DeviceDefinitionLinkSurrogate.id,
      extension = this@DeviceDefinitionLinkSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DeviceDefinitionLinkSurrogate.modifierExtension ?: mutableListOf(),
      relation = this@DeviceDefinitionLinkSurrogate.relation,
      relatedDevice = this@DeviceDefinitionLinkSurrogate.relatedDevice,
    )

  public companion object {
    public fun fromModel(model: DeviceDefinition.Link): DeviceDefinitionLinkSurrogate =
      with(model) {
        DeviceDefinitionLinkSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          relation = this@with.relation,
          relatedDevice = this@with.relatedDevice,
        )
      }
  }
}

@Serializable
internal data class DeviceDefinitionMaterialSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var substance: CodeableConcept,
  public var alternate: KotlinBoolean? = null,
  public var _alternate: Element? = null,
  public var allergenicIndicator: KotlinBoolean? = null,
  public var _allergenicIndicator: Element? = null,
) {
  public fun toModel(): DeviceDefinition.Material =
    DeviceDefinition.Material(
      id = this@DeviceDefinitionMaterialSurrogate.id,
      extension = this@DeviceDefinitionMaterialSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DeviceDefinitionMaterialSurrogate.modifierExtension ?: mutableListOf(),
      substance = this@DeviceDefinitionMaterialSurrogate.substance,
      alternate =
        R5Boolean.of(
          this@DeviceDefinitionMaterialSurrogate.alternate,
          this@DeviceDefinitionMaterialSurrogate._alternate,
        ),
      allergenicIndicator =
        R5Boolean.of(
          this@DeviceDefinitionMaterialSurrogate.allergenicIndicator,
          this@DeviceDefinitionMaterialSurrogate._allergenicIndicator,
        ),
    )

  public companion object {
    public fun fromModel(model: DeviceDefinition.Material): DeviceDefinitionMaterialSurrogate =
      with(model) {
        DeviceDefinitionMaterialSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          substance = this@with.substance,
          alternate = this@with.alternate?.value,
          _alternate = this@with.alternate?.toElement(),
          allergenicIndicator = this@with.allergenicIndicator?.value,
          _allergenicIndicator = this@with.allergenicIndicator?.toElement(),
        )
      }
  }
}

@Serializable
internal data class DeviceDefinitionGuidelineSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var useContext: MutableList<UsageContext>? = null,
  public var usageInstruction: KotlinString? = null,
  public var _usageInstruction: Element? = null,
  public var relatedArtifact: MutableList<RelatedArtifact>? = null,
  public var indication: MutableList<CodeableConcept>? = null,
  public var contraindication: MutableList<CodeableConcept>? = null,
  public var warning: MutableList<CodeableConcept>? = null,
  public var intendedUse: KotlinString? = null,
  public var _intendedUse: Element? = null,
) {
  public fun toModel(): DeviceDefinition.Guideline =
    DeviceDefinition.Guideline(
      id = this@DeviceDefinitionGuidelineSurrogate.id,
      extension = this@DeviceDefinitionGuidelineSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DeviceDefinitionGuidelineSurrogate.modifierExtension ?: mutableListOf(),
      useContext = this@DeviceDefinitionGuidelineSurrogate.useContext ?: mutableListOf(),
      usageInstruction =
        Markdown.of(
          this@DeviceDefinitionGuidelineSurrogate.usageInstruction,
          this@DeviceDefinitionGuidelineSurrogate._usageInstruction,
        ),
      relatedArtifact = this@DeviceDefinitionGuidelineSurrogate.relatedArtifact ?: mutableListOf(),
      indication = this@DeviceDefinitionGuidelineSurrogate.indication ?: mutableListOf(),
      contraindication =
        this@DeviceDefinitionGuidelineSurrogate.contraindication ?: mutableListOf(),
      warning = this@DeviceDefinitionGuidelineSurrogate.warning ?: mutableListOf(),
      intendedUse =
        R5String.of(
          this@DeviceDefinitionGuidelineSurrogate.intendedUse,
          this@DeviceDefinitionGuidelineSurrogate._intendedUse,
        ),
    )

  public companion object {
    public fun fromModel(model: DeviceDefinition.Guideline): DeviceDefinitionGuidelineSurrogate =
      with(model) {
        DeviceDefinitionGuidelineSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          usageInstruction = this@with.usageInstruction?.value,
          _usageInstruction = this@with.usageInstruction?.toElement(),
          relatedArtifact = this@with.relatedArtifact.takeUnless { it.all { it == null } },
          indication = this@with.indication.takeUnless { it.all { it == null } },
          contraindication = this@with.contraindication.takeUnless { it.all { it == null } },
          warning = this@with.warning.takeUnless { it.all { it == null } },
          intendedUse = this@with.intendedUse?.value,
          _intendedUse = this@with.intendedUse?.toElement(),
        )
      }
  }
}

@Serializable
internal data class DeviceDefinitionCorrectiveActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var recall: KotlinBoolean? = null,
  public var _recall: Element? = null,
  public var scope: KotlinString? = null,
  public var _scope: Element? = null,
  public var period: Period,
) {
  public fun toModel(): DeviceDefinition.CorrectiveAction =
    DeviceDefinition.CorrectiveAction(
      id = this@DeviceDefinitionCorrectiveActionSurrogate.id,
      extension = this@DeviceDefinitionCorrectiveActionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DeviceDefinitionCorrectiveActionSurrogate.modifierExtension ?: mutableListOf(),
      recall =
        R5Boolean.of(
          this@DeviceDefinitionCorrectiveActionSurrogate.recall,
          this@DeviceDefinitionCorrectiveActionSurrogate._recall,
        )!!,
      scope =
        this@DeviceDefinitionCorrectiveActionSurrogate.scope?.let {
          Enumeration.of(
            com.google.fhir.model.r5.DeviceDefinition.DeviceCorrectiveActionScope.fromCode(it!!),
            this@DeviceDefinitionCorrectiveActionSurrogate._scope,
          )
        },
      period = this@DeviceDefinitionCorrectiveActionSurrogate.period,
    )

  public companion object {
    public fun fromModel(
      model: DeviceDefinition.CorrectiveAction
    ): DeviceDefinitionCorrectiveActionSurrogate =
      with(model) {
        DeviceDefinitionCorrectiveActionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          recall = this@with.recall.value,
          _recall = this@with.recall.toElement(),
          scope = this@with.scope?.value?.getCode(),
          _scope = this@with.scope?.toElement(),
          period = this@with.period,
        )
      }
  }
}

@Serializable
internal data class DeviceDefinitionChargeItemSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var chargeItemCode: CodeableReference,
  public var count: Quantity,
  public var effectivePeriod: Period? = null,
  public var useContext: MutableList<UsageContext>? = null,
) {
  public fun toModel(): DeviceDefinition.ChargeItem =
    DeviceDefinition.ChargeItem(
      id = this@DeviceDefinitionChargeItemSurrogate.id,
      extension = this@DeviceDefinitionChargeItemSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DeviceDefinitionChargeItemSurrogate.modifierExtension ?: mutableListOf(),
      chargeItemCode = this@DeviceDefinitionChargeItemSurrogate.chargeItemCode,
      count = this@DeviceDefinitionChargeItemSurrogate.count,
      effectivePeriod = this@DeviceDefinitionChargeItemSurrogate.effectivePeriod,
      useContext = this@DeviceDefinitionChargeItemSurrogate.useContext ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DeviceDefinition.ChargeItem): DeviceDefinitionChargeItemSurrogate =
      with(model) {
        DeviceDefinitionChargeItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          chargeItemCode = this@with.chargeItemCode,
          count = this@with.count,
          effectivePeriod = this@with.effectivePeriod,
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class DeviceDefinitionSurrogate(
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
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var udiDeviceIdentifier: MutableList<DeviceDefinition.UdiDeviceIdentifier>? = null,
  public var regulatoryIdentifier: MutableList<DeviceDefinition.RegulatoryIdentifier>? = null,
  public var partNumber: KotlinString? = null,
  public var _partNumber: Element? = null,
  public var manufacturer: Reference? = null,
  public var deviceName: MutableList<DeviceDefinition.DeviceName>? = null,
  public var modelNumber: KotlinString? = null,
  public var _modelNumber: Element? = null,
  public var classification: MutableList<DeviceDefinition.Classification>? = null,
  public var conformsTo: MutableList<DeviceDefinition.ConformsTo>? = null,
  public var hasPart: MutableList<DeviceDefinition.HasPart>? = null,
  public var packaging: MutableList<DeviceDefinition.Packaging>? = null,
  public var version: MutableList<DeviceDefinition.Version>? = null,
  public var safety: MutableList<CodeableConcept>? = null,
  public var shelfLifeStorage: MutableList<ProductShelfLife>? = null,
  public var languageCode: MutableList<CodeableConcept>? = null,
  public var `property`: MutableList<DeviceDefinition.Property>? = null,
  public var owner: Reference? = null,
  public var contact: MutableList<ContactPoint>? = null,
  public var link: MutableList<DeviceDefinition.Link>? = null,
  public var note: MutableList<Annotation>? = null,
  public var material: MutableList<DeviceDefinition.Material>? = null,
  public var productionIdentifierInUDI: MutableList<KotlinString?>? = null,
  public var _productionIdentifierInUDI: MutableList<Element?>? = null,
  public var guideline: DeviceDefinition.Guideline? = null,
  public var correctiveAction: DeviceDefinition.CorrectiveAction? = null,
  public var chargeItem: MutableList<DeviceDefinition.ChargeItem>? = null,
) {
  public fun toModel(): DeviceDefinition =
    DeviceDefinition(
      id = this@DeviceDefinitionSurrogate.id,
      meta = this@DeviceDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@DeviceDefinitionSurrogate.implicitRules,
          this@DeviceDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(this@DeviceDefinitionSurrogate.language, this@DeviceDefinitionSurrogate._language),
      text = this@DeviceDefinitionSurrogate.text,
      contained = this@DeviceDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@DeviceDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DeviceDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      description =
        Markdown.of(
          this@DeviceDefinitionSurrogate.description,
          this@DeviceDefinitionSurrogate._description,
        ),
      identifier = this@DeviceDefinitionSurrogate.identifier ?: mutableListOf(),
      udiDeviceIdentifier = this@DeviceDefinitionSurrogate.udiDeviceIdentifier ?: mutableListOf(),
      regulatoryIdentifier = this@DeviceDefinitionSurrogate.regulatoryIdentifier ?: mutableListOf(),
      partNumber =
        R5String.of(
          this@DeviceDefinitionSurrogate.partNumber,
          this@DeviceDefinitionSurrogate._partNumber,
        ),
      manufacturer = this@DeviceDefinitionSurrogate.manufacturer,
      deviceName = this@DeviceDefinitionSurrogate.deviceName ?: mutableListOf(),
      modelNumber =
        R5String.of(
          this@DeviceDefinitionSurrogate.modelNumber,
          this@DeviceDefinitionSurrogate._modelNumber,
        ),
      classification = this@DeviceDefinitionSurrogate.classification ?: mutableListOf(),
      conformsTo = this@DeviceDefinitionSurrogate.conformsTo ?: mutableListOf(),
      hasPart = this@DeviceDefinitionSurrogate.hasPart ?: mutableListOf(),
      packaging = this@DeviceDefinitionSurrogate.packaging ?: mutableListOf(),
      version = this@DeviceDefinitionSurrogate.version ?: mutableListOf(),
      safety = this@DeviceDefinitionSurrogate.safety ?: mutableListOf(),
      shelfLifeStorage = this@DeviceDefinitionSurrogate.shelfLifeStorage ?: mutableListOf(),
      languageCode = this@DeviceDefinitionSurrogate.languageCode ?: mutableListOf(),
      `property` = this@DeviceDefinitionSurrogate.`property` ?: mutableListOf(),
      owner = this@DeviceDefinitionSurrogate.owner,
      contact = this@DeviceDefinitionSurrogate.contact ?: mutableListOf(),
      link = this@DeviceDefinitionSurrogate.link ?: mutableListOf(),
      note = this@DeviceDefinitionSurrogate.note ?: mutableListOf(),
      material = this@DeviceDefinitionSurrogate.material ?: mutableListOf(),
      productionIdentifierInUDI =
        if (
          this@DeviceDefinitionSurrogate.productionIdentifierInUDI == null &&
            this@DeviceDefinitionSurrogate._productionIdentifierInUDI == null
        ) {
          mutableListOf()
        } else {
          (this@DeviceDefinitionSurrogate.productionIdentifierInUDI
              ?: List(this@DeviceDefinitionSurrogate._productionIdentifierInUDI!!.size) { null })
            .zip(
              this@DeviceDefinitionSurrogate._productionIdentifierInUDI
                ?: List(this@DeviceDefinitionSurrogate.productionIdentifierInUDI!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let {
                  com.google.fhir.model.r5.DeviceDefinition.DeviceProductionIdentifierInUDI
                    .fromCode(it!!)!!
                },
                element,
              )
            }
            .toMutableList()
        },
      guideline = this@DeviceDefinitionSurrogate.guideline,
      correctiveAction = this@DeviceDefinitionSurrogate.correctiveAction,
      chargeItem = this@DeviceDefinitionSurrogate.chargeItem ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DeviceDefinition): DeviceDefinitionSurrogate =
      with(model) {
        DeviceDefinitionSurrogate(
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
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          udiDeviceIdentifier = this@with.udiDeviceIdentifier.takeUnless { it.all { it == null } },
          regulatoryIdentifier =
            this@with.regulatoryIdentifier.takeUnless { it.all { it == null } },
          partNumber = this@with.partNumber?.value,
          _partNumber = this@with.partNumber?.toElement(),
          manufacturer = this@with.manufacturer,
          deviceName = this@with.deviceName.takeUnless { it.all { it == null } },
          modelNumber = this@with.modelNumber?.value,
          _modelNumber = this@with.modelNumber?.toElement(),
          classification = this@with.classification.takeUnless { it.all { it == null } },
          conformsTo = this@with.conformsTo.takeUnless { it.all { it == null } },
          hasPart = this@with.hasPart.takeUnless { it.all { it == null } },
          packaging = this@with.packaging.takeUnless { it.all { it == null } },
          version = this@with.version.takeUnless { it.all { it == null } },
          safety = this@with.safety.takeUnless { it.all { it == null } },
          shelfLifeStorage = this@with.shelfLifeStorage.takeUnless { it.all { it == null } },
          languageCode = this@with.languageCode.takeUnless { it.all { it == null } },
          `property` = this@with.`property`.takeUnless { it.all { it == null } },
          owner = this@with.owner,
          contact = this@with.contact.takeUnless { it.all { it == null } },
          link = this@with.link.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          material = this@with.material.takeUnless { it.all { it == null } },
          productionIdentifierInUDI =
            this@with.productionIdentifierInUDI
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _productionIdentifierInUDI =
            this@with.productionIdentifierInUDI
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          guideline = this@with.guideline,
          correctiveAction = this@with.correctiveAction,
          chargeItem = this@with.chargeItem.takeUnless { it.all { it == null } },
        )
      }
  }
}
