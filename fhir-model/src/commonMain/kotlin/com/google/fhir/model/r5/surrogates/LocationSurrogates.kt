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
import com.google.fhir.model.r5.Availability
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.Decimal
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.ExtendedContactDetail
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Location
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.VirtualServiceDetail
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class LocationPositionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var longitude: Double? = null,
  public var _longitude: Element? = null,
  public var latitude: Double? = null,
  public var _latitude: Element? = null,
  public var altitude: Double? = null,
  public var _altitude: Element? = null,
) {
  public fun toModel(): Location.Position =
    Location.Position(
      id = this@LocationPositionSurrogate.id,
      extension = this@LocationPositionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@LocationPositionSurrogate.modifierExtension ?: mutableListOf(),
      longitude =
        Decimal.of(
          this@LocationPositionSurrogate.longitude,
          this@LocationPositionSurrogate._longitude,
        )!!,
      latitude =
        Decimal.of(
          this@LocationPositionSurrogate.latitude,
          this@LocationPositionSurrogate._latitude,
        )!!,
      altitude =
        Decimal.of(
          this@LocationPositionSurrogate.altitude,
          this@LocationPositionSurrogate._altitude,
        ),
    )

  public companion object {
    public fun fromModel(model: Location.Position): LocationPositionSurrogate =
      with(model) {
        LocationPositionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          longitude = this@with.longitude.value,
          _longitude = this@with.longitude.toElement(),
          latitude = this@with.latitude.value,
          _latitude = this@with.latitude.toElement(),
          altitude = this@with.altitude?.value,
          _altitude = this@with.altitude?.toElement(),
        )
      }
  }
}

@Serializable
internal data class LocationSurrogate(
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
  public var operationalStatus: Coding? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var alias: MutableList<KotlinString?>? = null,
  public var _alias: MutableList<Element?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var contact: MutableList<ExtendedContactDetail>? = null,
  public var address: Address? = null,
  public var form: CodeableConcept? = null,
  public var position: Location.Position? = null,
  public var managingOrganization: Reference? = null,
  public var partOf: Reference? = null,
  public var characteristic: MutableList<CodeableConcept>? = null,
  public var hoursOfOperation: MutableList<Availability>? = null,
  public var virtualService: MutableList<VirtualServiceDetail>? = null,
  public var endpoint: MutableList<Reference>? = null,
) {
  public fun toModel(): Location =
    Location(
      id = this@LocationSurrogate.id,
      meta = this@LocationSurrogate.meta,
      implicitRules =
        Uri.of(this@LocationSurrogate.implicitRules, this@LocationSurrogate._implicitRules),
      language = Code.of(this@LocationSurrogate.language, this@LocationSurrogate._language),
      text = this@LocationSurrogate.text,
      contained = this@LocationSurrogate.contained ?: mutableListOf(),
      extension = this@LocationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@LocationSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@LocationSurrogate.identifier ?: mutableListOf(),
      status =
        this@LocationSurrogate.status?.let {
          Enumeration.of(
            com.google.fhir.model.r5.Location.LocationStatus.fromCode(it!!),
            this@LocationSurrogate._status,
          )
        },
      operationalStatus = this@LocationSurrogate.operationalStatus,
      name = R5String.of(this@LocationSurrogate.name, this@LocationSurrogate._name),
      alias =
        if (this@LocationSurrogate.alias == null && this@LocationSurrogate._alias == null) {
          mutableListOf()
        } else {
          (this@LocationSurrogate.alias ?: List(this@LocationSurrogate._alias!!.size) { null })
            .zip(
              this@LocationSurrogate._alias ?: List(this@LocationSurrogate.alias!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      description =
        Markdown.of(this@LocationSurrogate.description, this@LocationSurrogate._description),
      mode =
        this@LocationSurrogate.mode?.let {
          Enumeration.of(
            com.google.fhir.model.r5.Location.LocationMode.fromCode(it!!),
            this@LocationSurrogate._mode,
          )
        },
      type = this@LocationSurrogate.type ?: mutableListOf(),
      contact = this@LocationSurrogate.contact ?: mutableListOf(),
      address = this@LocationSurrogate.address,
      form = this@LocationSurrogate.form,
      position = this@LocationSurrogate.position,
      managingOrganization = this@LocationSurrogate.managingOrganization,
      partOf = this@LocationSurrogate.partOf,
      characteristic = this@LocationSurrogate.characteristic ?: mutableListOf(),
      hoursOfOperation = this@LocationSurrogate.hoursOfOperation ?: mutableListOf(),
      virtualService = this@LocationSurrogate.virtualService ?: mutableListOf(),
      endpoint = this@LocationSurrogate.endpoint ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Location): LocationSurrogate =
      with(model) {
        LocationSurrogate(
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
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          operationalStatus = this@with.operationalStatus,
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          alias =
            this@with.alias.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _alias =
            this@with.alias
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          mode = this@with.mode?.value?.getCode(),
          _mode = this@with.mode?.toElement(),
          type = this@with.type.takeUnless { it.all { it == null } },
          contact = this@with.contact.takeUnless { it.all { it == null } },
          address = this@with.address,
          form = this@with.form,
          position = this@with.position,
          managingOrganization = this@with.managingOrganization,
          partOf = this@with.partOf,
          characteristic = this@with.characteristic.takeUnless { it.all { it == null } },
          hoursOfOperation = this@with.hoursOfOperation.takeUnless { it.all { it == null } },
          virtualService = this@with.virtualService.takeUnless { it.all { it == null } },
          endpoint = this@with.endpoint.takeUnless { it.all { it == null } },
        )
      }
  }
}
