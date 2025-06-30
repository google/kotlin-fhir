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

import com.google.fhir.model.r4.Annotation
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.ContactPoint
import com.google.fhir.model.r4.DeviceDefinition
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Identifier
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
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DeviceDefinitionUdiDeviceIdentifierSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var deviceIdentifier: KotlinString? = null,
  public var _deviceIdentifier: Element? = null,
  public var issuer: KotlinString? = null,
  public var _issuer: Element? = null,
  public var jurisdiction: KotlinString? = null,
  public var _jurisdiction: Element? = null,
) {
  public fun toModel(): DeviceDefinition.UdiDeviceIdentifier =
    DeviceDefinition.UdiDeviceIdentifier().apply {
      id = this@DeviceDefinitionUdiDeviceIdentifierSurrogate.id
      extension = this@DeviceDefinitionUdiDeviceIdentifierSurrogate.extension
      modifierExtension = this@DeviceDefinitionUdiDeviceIdentifierSurrogate.modifierExtension
      deviceIdentifier =
        R4String.of(
          this@DeviceDefinitionUdiDeviceIdentifierSurrogate.deviceIdentifier,
          this@DeviceDefinitionUdiDeviceIdentifierSurrogate._deviceIdentifier,
        )
      issuer =
        Uri.of(
          this@DeviceDefinitionUdiDeviceIdentifierSurrogate.issuer,
          this@DeviceDefinitionUdiDeviceIdentifierSurrogate._issuer,
        )
      jurisdiction =
        Uri.of(
          this@DeviceDefinitionUdiDeviceIdentifierSurrogate.jurisdiction,
          this@DeviceDefinitionUdiDeviceIdentifierSurrogate._jurisdiction,
        )
    }

  public companion object {
    public fun fromModel(
      model: DeviceDefinition.UdiDeviceIdentifier
    ): DeviceDefinitionUdiDeviceIdentifierSurrogate =
      with(model) {
        DeviceDefinitionUdiDeviceIdentifierSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          deviceIdentifier = this@with.deviceIdentifier?.value
          _deviceIdentifier = this@with.deviceIdentifier?.toElement()
          issuer = this@with.issuer?.value
          _issuer = this@with.issuer?.toElement()
          jurisdiction = this@with.jurisdiction?.value
          _jurisdiction = this@with.jurisdiction?.toElement()
        }
      }
  }
}

@Serializable
internal data class DeviceDefinitionDeviceNameSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
) {
  public fun toModel(): DeviceDefinition.DeviceName =
    DeviceDefinition.DeviceName().apply {
      id = this@DeviceDefinitionDeviceNameSurrogate.id
      extension = this@DeviceDefinitionDeviceNameSurrogate.extension
      modifierExtension = this@DeviceDefinitionDeviceNameSurrogate.modifierExtension
      name =
        R4String.of(
          this@DeviceDefinitionDeviceNameSurrogate.name,
          this@DeviceDefinitionDeviceNameSurrogate._name,
        )
      type =
        Enumeration.of(
          this@DeviceDefinitionDeviceNameSurrogate.type?.let {
            com.google.fhir.model.r4.DeviceDefinition.DeviceNameType.fromCode(it)
          },
          this@DeviceDefinitionDeviceNameSurrogate._type,
        )
    }

  public companion object {
    public fun fromModel(model: DeviceDefinition.DeviceName): DeviceDefinitionDeviceNameSurrogate =
      with(model) {
        DeviceDefinitionDeviceNameSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
        }
      }
  }
}

@Serializable
internal data class DeviceDefinitionSpecializationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var systemType: KotlinString? = null,
  public var _systemType: Element? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
) {
  public fun toModel(): DeviceDefinition.Specialization =
    DeviceDefinition.Specialization().apply {
      id = this@DeviceDefinitionSpecializationSurrogate.id
      extension = this@DeviceDefinitionSpecializationSurrogate.extension
      modifierExtension = this@DeviceDefinitionSpecializationSurrogate.modifierExtension
      systemType =
        R4String.of(
          this@DeviceDefinitionSpecializationSurrogate.systemType,
          this@DeviceDefinitionSpecializationSurrogate._systemType,
        )
      version =
        R4String.of(
          this@DeviceDefinitionSpecializationSurrogate.version,
          this@DeviceDefinitionSpecializationSurrogate._version,
        )
    }

  public companion object {
    public fun fromModel(
      model: DeviceDefinition.Specialization
    ): DeviceDefinitionSpecializationSurrogate =
      with(model) {
        DeviceDefinitionSpecializationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          systemType = this@with.systemType?.value
          _systemType = this@with.systemType?.toElement()
          version = this@with.version?.value
          _version = this@with.version?.toElement()
        }
      }
  }
}

@Serializable
internal data class DeviceDefinitionCapabilitySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var description: List<CodeableConcept?>? = null,
) {
  public fun toModel(): DeviceDefinition.Capability =
    DeviceDefinition.Capability().apply {
      id = this@DeviceDefinitionCapabilitySurrogate.id
      extension = this@DeviceDefinitionCapabilitySurrogate.extension
      modifierExtension = this@DeviceDefinitionCapabilitySurrogate.modifierExtension
      type = this@DeviceDefinitionCapabilitySurrogate.type
      description = this@DeviceDefinitionCapabilitySurrogate.description
    }

  public companion object {
    public fun fromModel(model: DeviceDefinition.Capability): DeviceDefinitionCapabilitySurrogate =
      with(model) {
        DeviceDefinitionCapabilitySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          description = this@with.description
        }
      }
  }
}

@Serializable
internal data class DeviceDefinitionPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var valueQuantity: List<Quantity?>? = null,
  public var valueCode: List<CodeableConcept?>? = null,
) {
  public fun toModel(): DeviceDefinition.Property =
    DeviceDefinition.Property().apply {
      id = this@DeviceDefinitionPropertySurrogate.id
      extension = this@DeviceDefinitionPropertySurrogate.extension
      modifierExtension = this@DeviceDefinitionPropertySurrogate.modifierExtension
      type = this@DeviceDefinitionPropertySurrogate.type
      valueQuantity = this@DeviceDefinitionPropertySurrogate.valueQuantity
      valueCode = this@DeviceDefinitionPropertySurrogate.valueCode
    }

  public companion object {
    public fun fromModel(model: DeviceDefinition.Property): DeviceDefinitionPropertySurrogate =
      with(model) {
        DeviceDefinitionPropertySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          valueQuantity = this@with.valueQuantity
          valueCode = this@with.valueCode
        }
      }
  }
}

@Serializable
internal data class DeviceDefinitionMaterialSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var substance: CodeableConcept? = null,
  public var alternate: KotlinBoolean? = null,
  public var _alternate: Element? = null,
  public var allergenicIndicator: KotlinBoolean? = null,
  public var _allergenicIndicator: Element? = null,
) {
  public fun toModel(): DeviceDefinition.Material =
    DeviceDefinition.Material().apply {
      id = this@DeviceDefinitionMaterialSurrogate.id
      extension = this@DeviceDefinitionMaterialSurrogate.extension
      modifierExtension = this@DeviceDefinitionMaterialSurrogate.modifierExtension
      substance = this@DeviceDefinitionMaterialSurrogate.substance
      alternate =
        R4Boolean.of(
          this@DeviceDefinitionMaterialSurrogate.alternate,
          this@DeviceDefinitionMaterialSurrogate._alternate,
        )
      allergenicIndicator =
        R4Boolean.of(
          this@DeviceDefinitionMaterialSurrogate.allergenicIndicator,
          this@DeviceDefinitionMaterialSurrogate._allergenicIndicator,
        )
    }

  public companion object {
    public fun fromModel(model: DeviceDefinition.Material): DeviceDefinitionMaterialSurrogate =
      with(model) {
        DeviceDefinitionMaterialSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          substance = this@with.substance
          alternate = this@with.alternate?.value
          _alternate = this@with.alternate?.toElement()
          allergenicIndicator = this@with.allergenicIndicator?.value
          _allergenicIndicator = this@with.allergenicIndicator?.toElement()
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var udiDeviceIdentifier: List<DeviceDefinition.UdiDeviceIdentifier>? = null,
  public var manufacturerString: KotlinString? = null,
  public var _manufacturerString: Element? = null,
  public var manufacturerReference: Reference? = null,
  public var deviceName: List<DeviceDefinition.DeviceName>? = null,
  public var modelNumber: KotlinString? = null,
  public var _modelNumber: Element? = null,
  public var type: CodeableConcept? = null,
  public var specialization: List<DeviceDefinition.Specialization>? = null,
  public var version: List<KotlinString?>? = null,
  public var _version: List<Element?>? = null,
  public var safety: List<CodeableConcept?>? = null,
  public var shelfLifeStorage: List<ProductShelfLife?>? = null,
  public var physicalCharacteristics: ProdCharacteristic? = null,
  public var languageCode: List<CodeableConcept?>? = null,
  public var capability: List<DeviceDefinition.Capability>? = null,
  public var `property`: List<DeviceDefinition.Property>? = null,
  public var owner: Reference? = null,
  public var contact: List<ContactPoint?>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var onlineInformation: KotlinString? = null,
  public var _onlineInformation: Element? = null,
  public var note: List<Annotation?>? = null,
  public var quantity: Quantity? = null,
  public var parentDevice: Reference? = null,
  public var material: List<DeviceDefinition.Material>? = null,
) {
  public fun toModel(): DeviceDefinition =
    DeviceDefinition().apply {
      id = this@DeviceDefinitionSurrogate.id
      meta = this@DeviceDefinitionSurrogate.meta
      implicitRules =
        Uri.of(
          this@DeviceDefinitionSurrogate.implicitRules,
          this@DeviceDefinitionSurrogate._implicitRules,
        )
      language =
        Code.of(this@DeviceDefinitionSurrogate.language, this@DeviceDefinitionSurrogate._language)
      text = this@DeviceDefinitionSurrogate.text
      contained = this@DeviceDefinitionSurrogate.contained
      extension = this@DeviceDefinitionSurrogate.extension
      modifierExtension = this@DeviceDefinitionSurrogate.modifierExtension
      identifier = this@DeviceDefinitionSurrogate.identifier
      udiDeviceIdentifier = this@DeviceDefinitionSurrogate.udiDeviceIdentifier
      manufacturer =
        DeviceDefinition.Manufacturer?.from(
          R4String.of(
            this@DeviceDefinitionSurrogate.manufacturerString,
            this@DeviceDefinitionSurrogate._manufacturerString,
          ),
          this@DeviceDefinitionSurrogate.manufacturerReference,
        )
      deviceName = this@DeviceDefinitionSurrogate.deviceName
      modelNumber =
        R4String.of(
          this@DeviceDefinitionSurrogate.modelNumber,
          this@DeviceDefinitionSurrogate._modelNumber,
        )
      type = this@DeviceDefinitionSurrogate.type
      specialization = this@DeviceDefinitionSurrogate.specialization
      version =
        if (
          this@DeviceDefinitionSurrogate.version == null &&
            this@DeviceDefinitionSurrogate._version == null
        ) {
          null
        } else {
          (this@DeviceDefinitionSurrogate.version
              ?: List(this@DeviceDefinitionSurrogate._version!!.size) { null })
            .zip(
              this@DeviceDefinitionSurrogate._version
                ?: List(this@DeviceDefinitionSurrogate.version!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4String.of(value, element) }
        }
      safety = this@DeviceDefinitionSurrogate.safety
      shelfLifeStorage = this@DeviceDefinitionSurrogate.shelfLifeStorage
      physicalCharacteristics = this@DeviceDefinitionSurrogate.physicalCharacteristics
      languageCode = this@DeviceDefinitionSurrogate.languageCode
      capability = this@DeviceDefinitionSurrogate.capability
      `property` = this@DeviceDefinitionSurrogate.`property`
      owner = this@DeviceDefinitionSurrogate.owner
      contact = this@DeviceDefinitionSurrogate.contact
      url = Uri.of(this@DeviceDefinitionSurrogate.url, this@DeviceDefinitionSurrogate._url)
      onlineInformation =
        Uri.of(
          this@DeviceDefinitionSurrogate.onlineInformation,
          this@DeviceDefinitionSurrogate._onlineInformation,
        )
      note = this@DeviceDefinitionSurrogate.note
      quantity = this@DeviceDefinitionSurrogate.quantity
      parentDevice = this@DeviceDefinitionSurrogate.parentDevice
      material = this@DeviceDefinitionSurrogate.material
    }

  public companion object {
    public fun fromModel(model: DeviceDefinition): DeviceDefinitionSurrogate =
      with(model) {
        DeviceDefinitionSurrogate().apply {
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
          udiDeviceIdentifier = this@with.udiDeviceIdentifier
          manufacturerString = this@with.manufacturer?.asString()?.value?.value
          _manufacturerString = this@with.manufacturer?.asString()?.value?.toElement()
          manufacturerReference = this@with.manufacturer?.asReference()?.value
          deviceName = this@with.deviceName
          modelNumber = this@with.modelNumber?.value
          _modelNumber = this@with.modelNumber?.toElement()
          type = this@with.type
          specialization = this@with.specialization
          version = this@with.version?.map { it?.value }?.takeUnless { it.all { it == null } }
          _version =
            this@with.version?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          safety = this@with.safety
          shelfLifeStorage = this@with.shelfLifeStorage
          physicalCharacteristics = this@with.physicalCharacteristics
          languageCode = this@with.languageCode
          capability = this@with.capability
          `property` = this@with.`property`
          owner = this@with.owner
          contact = this@with.contact
          url = this@with.url?.value
          _url = this@with.url?.toElement()
          onlineInformation = this@with.onlineInformation?.value
          _onlineInformation = this@with.onlineInformation?.toElement()
          note = this@with.note
          quantity = this@with.quantity
          parentDevice = this@with.parentDevice
          material = this@with.material
        }
      }
  }
}
