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
import com.google.fhir.model.r5.Base64Binary
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.ContactPoint
import com.google.fhir.model.r5.Count
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Device
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Integer
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
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
internal data class DeviceUdiCarrierSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var deviceIdentifier: KotlinString? = null,
  public var _deviceIdentifier: Element? = null,
  public var issuer: KotlinString? = null,
  public var _issuer: Element? = null,
  public var jurisdiction: KotlinString? = null,
  public var _jurisdiction: Element? = null,
  public var carrierAIDC: KotlinString? = null,
  public var _carrierAIDC: Element? = null,
  public var carrierHRF: KotlinString? = null,
  public var _carrierHRF: Element? = null,
  public var entryType: KotlinString? = null,
  public var _entryType: Element? = null,
) {
  public fun toModel(): Device.UdiCarrier =
    Device.UdiCarrier(
      id = this@DeviceUdiCarrierSurrogate.id,
      extension = this@DeviceUdiCarrierSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DeviceUdiCarrierSurrogate.modifierExtension ?: mutableListOf(),
      deviceIdentifier =
        R5String.of(
          this@DeviceUdiCarrierSurrogate.deviceIdentifier,
          this@DeviceUdiCarrierSurrogate._deviceIdentifier,
        )!!,
      issuer =
        Uri.of(this@DeviceUdiCarrierSurrogate.issuer, this@DeviceUdiCarrierSurrogate._issuer)!!,
      jurisdiction =
        Uri.of(
          this@DeviceUdiCarrierSurrogate.jurisdiction,
          this@DeviceUdiCarrierSurrogate._jurisdiction,
        ),
      carrierAIDC =
        Base64Binary.of(
          this@DeviceUdiCarrierSurrogate.carrierAIDC,
          this@DeviceUdiCarrierSurrogate._carrierAIDC,
        ),
      carrierHRF =
        R5String.of(
          this@DeviceUdiCarrierSurrogate.carrierHRF,
          this@DeviceUdiCarrierSurrogate._carrierHRF,
        ),
      entryType =
        this@DeviceUdiCarrierSurrogate.entryType?.let {
          Enumeration.of(
            com.google.fhir.model.r5.Device.UDIEntryType.fromCode(it!!),
            this@DeviceUdiCarrierSurrogate._entryType,
          )
        },
    )

  public companion object {
    public fun fromModel(model: Device.UdiCarrier): DeviceUdiCarrierSurrogate =
      with(model) {
        DeviceUdiCarrierSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          deviceIdentifier = this@with.deviceIdentifier.value,
          _deviceIdentifier = this@with.deviceIdentifier.toElement(),
          issuer = this@with.issuer.value,
          _issuer = this@with.issuer.toElement(),
          jurisdiction = this@with.jurisdiction?.value,
          _jurisdiction = this@with.jurisdiction?.toElement(),
          carrierAIDC = this@with.carrierAIDC?.value,
          _carrierAIDC = this@with.carrierAIDC?.toElement(),
          carrierHRF = this@with.carrierHRF?.value,
          _carrierHRF = this@with.carrierHRF?.toElement(),
          entryType = this@with.entryType?.value?.getCode(),
          _entryType = this@with.entryType?.toElement(),
        )
      }
  }
}

@Serializable
internal data class DeviceNameSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var display: KotlinBoolean? = null,
  public var _display: Element? = null,
) {
  public fun toModel(): Device.Name =
    Device.Name(
      id = this@DeviceNameSurrogate.id,
      extension = this@DeviceNameSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DeviceNameSurrogate.modifierExtension ?: mutableListOf(),
      `value` = R5String.of(this@DeviceNameSurrogate.`value`, this@DeviceNameSurrogate._value)!!,
      type =
        Enumeration.of(
          com.google.fhir.model.r5.Device.DeviceNameType.fromCode(this@DeviceNameSurrogate.type!!),
          this@DeviceNameSurrogate._type,
        ),
      display = R5Boolean.of(this@DeviceNameSurrogate.display, this@DeviceNameSurrogate._display),
    )

  public companion object {
    public fun fromModel(model: Device.Name): DeviceNameSurrogate =
      with(model) {
        DeviceNameSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          `value` = this@with.`value`.value,
          _value = this@with.`value`.toElement(),
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          display = this@with.display?.value,
          _display = this@with.display?.toElement(),
        )
      }
  }
}

@Serializable
internal data class DeviceVersionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var component: Identifier? = null,
  public var installDate: KotlinString? = null,
  public var _installDate: Element? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
) {
  public fun toModel(): Device.Version =
    Device.Version(
      id = this@DeviceVersionSurrogate.id,
      extension = this@DeviceVersionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DeviceVersionSurrogate.modifierExtension ?: mutableListOf(),
      type = this@DeviceVersionSurrogate.type,
      component = this@DeviceVersionSurrogate.component,
      installDate =
        DateTime.of(
          FhirDateTime.fromString(this@DeviceVersionSurrogate.installDate),
          this@DeviceVersionSurrogate._installDate,
        ),
      `value` =
        R5String.of(this@DeviceVersionSurrogate.`value`, this@DeviceVersionSurrogate._value)!!,
    )

  public companion object {
    public fun fromModel(model: Device.Version): DeviceVersionSurrogate =
      with(model) {
        DeviceVersionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          component = this@with.component,
          installDate = this@with.installDate?.value?.toString(),
          _installDate = this@with.installDate?.toElement(),
          `value` = this@with.`value`.value,
          _value = this@with.`value`.toElement(),
        )
      }
  }
}

@Serializable
internal data class DeviceConformsToSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var category: CodeableConcept? = null,
  public var specification: CodeableConcept,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
) {
  public fun toModel(): Device.ConformsTo =
    Device.ConformsTo(
      id = this@DeviceConformsToSurrogate.id,
      extension = this@DeviceConformsToSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DeviceConformsToSurrogate.modifierExtension ?: mutableListOf(),
      category = this@DeviceConformsToSurrogate.category,
      specification = this@DeviceConformsToSurrogate.specification,
      version =
        R5String.of(this@DeviceConformsToSurrogate.version, this@DeviceConformsToSurrogate._version),
    )

  public companion object {
    public fun fromModel(model: Device.ConformsTo): DeviceConformsToSurrogate =
      with(model) {
        DeviceConformsToSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          category = this@with.category,
          specification = this@with.specification,
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
        )
      }
  }
}

@Serializable
internal data class DevicePropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
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
  public fun toModel(): Device.Property =
    Device.Property(
      id = this@DevicePropertySurrogate.id,
      extension = this@DevicePropertySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DevicePropertySurrogate.modifierExtension ?: mutableListOf(),
      type = this@DevicePropertySurrogate.type,
      `value` =
        Device.Property.Value.from(
          this@DevicePropertySurrogate.valueQuantity,
          this@DevicePropertySurrogate.valueCodeableConcept,
          R5String.of(
            this@DevicePropertySurrogate.valueString,
            this@DevicePropertySurrogate._valueString,
          ),
          R5Boolean.of(
            this@DevicePropertySurrogate.valueBoolean,
            this@DevicePropertySurrogate._valueBoolean,
          ),
          Integer.of(
            this@DevicePropertySurrogate.valueInteger,
            this@DevicePropertySurrogate._valueInteger,
          ),
          this@DevicePropertySurrogate.valueRange,
          this@DevicePropertySurrogate.valueAttachment,
        )!!,
    )

  public companion object {
    public fun fromModel(model: Device.Property): DevicePropertySurrogate =
      with(model) {
        DevicePropertySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          valueQuantity = this@with.`value`?.asQuantity()?.value,
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value,
          valueString = this@with.`value`?.asString()?.value?.value,
          _valueString = this@with.`value`?.asString()?.value?.toElement(),
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value,
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement(),
          valueInteger = this@with.`value`?.asInteger()?.value?.value,
          _valueInteger = this@with.`value`?.asInteger()?.value?.toElement(),
          valueRange = this@with.`value`?.asRange()?.value,
          valueAttachment = this@with.`value`?.asAttachment()?.value,
        )
      }
  }
}

@Serializable
internal data class DeviceSurrogate(
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
  public var displayName: KotlinString? = null,
  public var _displayName: Element? = null,
  public var definition: CodeableReference? = null,
  public var udiCarrier: MutableList<Device.UdiCarrier>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var availabilityStatus: CodeableConcept? = null,
  public var biologicalSourceEvent: Identifier? = null,
  public var manufacturer: KotlinString? = null,
  public var _manufacturer: Element? = null,
  public var manufactureDate: KotlinString? = null,
  public var _manufactureDate: Element? = null,
  public var expirationDate: KotlinString? = null,
  public var _expirationDate: Element? = null,
  public var lotNumber: KotlinString? = null,
  public var _lotNumber: Element? = null,
  public var serialNumber: KotlinString? = null,
  public var _serialNumber: Element? = null,
  public var name: MutableList<Device.Name>? = null,
  public var modelNumber: KotlinString? = null,
  public var _modelNumber: Element? = null,
  public var partNumber: KotlinString? = null,
  public var _partNumber: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var version: MutableList<Device.Version>? = null,
  public var conformsTo: MutableList<Device.ConformsTo>? = null,
  public var `property`: MutableList<Device.Property>? = null,
  public var mode: CodeableConcept? = null,
  public var cycle: Count? = null,
  public var duration: Duration? = null,
  public var owner: Reference? = null,
  public var contact: MutableList<ContactPoint>? = null,
  public var location: Reference? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var endpoint: MutableList<Reference>? = null,
  public var gateway: MutableList<CodeableReference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var safety: MutableList<CodeableConcept>? = null,
  public var parent: Reference? = null,
) {
  public fun toModel(): Device =
    Device(
      id = this@DeviceSurrogate.id,
      meta = this@DeviceSurrogate.meta,
      implicitRules =
        Uri.of(this@DeviceSurrogate.implicitRules, this@DeviceSurrogate._implicitRules),
      language = Code.of(this@DeviceSurrogate.language, this@DeviceSurrogate._language),
      text = this@DeviceSurrogate.text,
      contained = this@DeviceSurrogate.contained ?: mutableListOf(),
      extension = this@DeviceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DeviceSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@DeviceSurrogate.identifier ?: mutableListOf(),
      displayName =
        R5String.of(this@DeviceSurrogate.displayName, this@DeviceSurrogate._displayName),
      definition = this@DeviceSurrogate.definition,
      udiCarrier = this@DeviceSurrogate.udiCarrier ?: mutableListOf(),
      status =
        this@DeviceSurrogate.status?.let {
          Enumeration.of(
            com.google.fhir.model.r5.Device.FHIRDeviceStatus.fromCode(it!!),
            this@DeviceSurrogate._status,
          )
        },
      availabilityStatus = this@DeviceSurrogate.availabilityStatus,
      biologicalSourceEvent = this@DeviceSurrogate.biologicalSourceEvent,
      manufacturer =
        R5String.of(this@DeviceSurrogate.manufacturer, this@DeviceSurrogate._manufacturer),
      manufactureDate =
        DateTime.of(
          FhirDateTime.fromString(this@DeviceSurrogate.manufactureDate),
          this@DeviceSurrogate._manufactureDate,
        ),
      expirationDate =
        DateTime.of(
          FhirDateTime.fromString(this@DeviceSurrogate.expirationDate),
          this@DeviceSurrogate._expirationDate,
        ),
      lotNumber = R5String.of(this@DeviceSurrogate.lotNumber, this@DeviceSurrogate._lotNumber),
      serialNumber =
        R5String.of(this@DeviceSurrogate.serialNumber, this@DeviceSurrogate._serialNumber),
      name = this@DeviceSurrogate.name ?: mutableListOf(),
      modelNumber =
        R5String.of(this@DeviceSurrogate.modelNumber, this@DeviceSurrogate._modelNumber),
      partNumber = R5String.of(this@DeviceSurrogate.partNumber, this@DeviceSurrogate._partNumber),
      category = this@DeviceSurrogate.category ?: mutableListOf(),
      type = this@DeviceSurrogate.type ?: mutableListOf(),
      version = this@DeviceSurrogate.version ?: mutableListOf(),
      conformsTo = this@DeviceSurrogate.conformsTo ?: mutableListOf(),
      `property` = this@DeviceSurrogate.`property` ?: mutableListOf(),
      mode = this@DeviceSurrogate.mode,
      cycle = this@DeviceSurrogate.cycle,
      duration = this@DeviceSurrogate.duration,
      owner = this@DeviceSurrogate.owner,
      contact = this@DeviceSurrogate.contact ?: mutableListOf(),
      location = this@DeviceSurrogate.location,
      url = Uri.of(this@DeviceSurrogate.url, this@DeviceSurrogate._url),
      endpoint = this@DeviceSurrogate.endpoint ?: mutableListOf(),
      gateway = this@DeviceSurrogate.gateway ?: mutableListOf(),
      note = this@DeviceSurrogate.note ?: mutableListOf(),
      safety = this@DeviceSurrogate.safety ?: mutableListOf(),
      parent = this@DeviceSurrogate.parent,
    )

  public companion object {
    public fun fromModel(model: Device): DeviceSurrogate =
      with(model) {
        DeviceSurrogate(
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
          displayName = this@with.displayName?.value,
          _displayName = this@with.displayName?.toElement(),
          definition = this@with.definition,
          udiCarrier = this@with.udiCarrier.takeUnless { it.all { it == null } },
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          availabilityStatus = this@with.availabilityStatus,
          biologicalSourceEvent = this@with.biologicalSourceEvent,
          manufacturer = this@with.manufacturer?.value,
          _manufacturer = this@with.manufacturer?.toElement(),
          manufactureDate = this@with.manufactureDate?.value?.toString(),
          _manufactureDate = this@with.manufactureDate?.toElement(),
          expirationDate = this@with.expirationDate?.value?.toString(),
          _expirationDate = this@with.expirationDate?.toElement(),
          lotNumber = this@with.lotNumber?.value,
          _lotNumber = this@with.lotNumber?.toElement(),
          serialNumber = this@with.serialNumber?.value,
          _serialNumber = this@with.serialNumber?.toElement(),
          name = this@with.name.takeUnless { it.all { it == null } },
          modelNumber = this@with.modelNumber?.value,
          _modelNumber = this@with.modelNumber?.toElement(),
          partNumber = this@with.partNumber?.value,
          _partNumber = this@with.partNumber?.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          type = this@with.type.takeUnless { it.all { it == null } },
          version = this@with.version.takeUnless { it.all { it == null } },
          conformsTo = this@with.conformsTo.takeUnless { it.all { it == null } },
          `property` = this@with.`property`.takeUnless { it.all { it == null } },
          mode = this@with.mode,
          cycle = this@with.cycle,
          duration = this@with.duration,
          owner = this@with.owner,
          contact = this@with.contact.takeUnless { it.all { it == null } },
          location = this@with.location,
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
          endpoint = this@with.endpoint.takeUnless { it.all { it == null } },
          gateway = this@with.gateway.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          safety = this@with.safety.takeUnless { it.all { it == null } },
          parent = this@with.parent,
        )
      }
  }
}
