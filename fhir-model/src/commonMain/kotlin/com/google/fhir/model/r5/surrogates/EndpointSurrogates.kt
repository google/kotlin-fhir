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

import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.ContactPoint
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Endpoint
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.Url
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class EndpointPayloadSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var mimeType: MutableList<KotlinString?>? = null,
  public var _mimeType: MutableList<Element?>? = null,
) {
  public fun toModel(): Endpoint.Payload =
    Endpoint.Payload(
      id = this@EndpointPayloadSurrogate.id,
      extension = this@EndpointPayloadSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EndpointPayloadSurrogate.modifierExtension ?: mutableListOf(),
      type = this@EndpointPayloadSurrogate.type ?: mutableListOf(),
      mimeType =
        if (
          this@EndpointPayloadSurrogate.mimeType == null &&
            this@EndpointPayloadSurrogate._mimeType == null
        ) {
          mutableListOf()
        } else {
          (this@EndpointPayloadSurrogate.mimeType
              ?: List(this@EndpointPayloadSurrogate._mimeType!!.size) { null })
            .zip(
              this@EndpointPayloadSurrogate._mimeType
                ?: List(this@EndpointPayloadSurrogate.mimeType!!.size) { null }
            )
            .map { (value, element) -> Code.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(model: Endpoint.Payload): EndpointPayloadSurrogate =
      with(model) {
        EndpointPayloadSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          type = this@with.type.takeIf { it.isNotEmpty() },
          mimeType =
            this@with.mimeType
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _mimeType =
            this@with.mimeType
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class EndpointSurrogate(
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
  public var connectionType: MutableList<CodeableConcept>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var environmentType: MutableList<CodeableConcept>? = null,
  public var managingOrganization: Reference? = null,
  public var contact: MutableList<ContactPoint>? = null,
  public var period: Period? = null,
  public var payload: MutableList<Endpoint.Payload>? = null,
  public var address: KotlinString? = null,
  public var _address: Element? = null,
  public var `header`: MutableList<KotlinString?>? = null,
  public var _header: MutableList<Element?>? = null,
) {
  public fun toModel(): Endpoint =
    Endpoint(
      id = this@EndpointSurrogate.id,
      meta = this@EndpointSurrogate.meta,
      implicitRules =
        Uri.of(this@EndpointSurrogate.implicitRules, this@EndpointSurrogate._implicitRules),
      language = Code.of(this@EndpointSurrogate.language, this@EndpointSurrogate._language),
      text = this@EndpointSurrogate.text,
      contained = this@EndpointSurrogate.contained ?: mutableListOf(),
      extension = this@EndpointSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EndpointSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@EndpointSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          Endpoint.EndpointStatus.fromCode(this@EndpointSurrogate.status!!),
          this@EndpointSurrogate._status,
        ),
      connectionType = this@EndpointSurrogate.connectionType ?: mutableListOf(),
      name = R5String.of(this@EndpointSurrogate.name, this@EndpointSurrogate._name),
      description =
        R5String.of(this@EndpointSurrogate.description, this@EndpointSurrogate._description),
      environmentType = this@EndpointSurrogate.environmentType ?: mutableListOf(),
      managingOrganization = this@EndpointSurrogate.managingOrganization,
      contact = this@EndpointSurrogate.contact ?: mutableListOf(),
      period = this@EndpointSurrogate.period,
      payload = this@EndpointSurrogate.payload ?: mutableListOf(),
      address = Url.of(this@EndpointSurrogate.address, this@EndpointSurrogate._address)!!,
      `header` =
        if (this@EndpointSurrogate.`header` == null && this@EndpointSurrogate._header == null) {
          mutableListOf()
        } else {
          (this@EndpointSurrogate.`header` ?: List(this@EndpointSurrogate._header!!.size) { null })
            .zip(
              this@EndpointSurrogate._header
                ?: List(this@EndpointSurrogate.`header`!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(model: Endpoint): EndpointSurrogate =
      with(model) {
        EndpointSurrogate(
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
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          connectionType = this@with.connectionType.takeIf { it.isNotEmpty() },
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          environmentType = this@with.environmentType.takeIf { it.isNotEmpty() },
          managingOrganization = this@with.managingOrganization,
          contact = this@with.contact.takeIf { it.isNotEmpty() },
          period = this@with.period,
          payload = this@with.payload.takeIf { it.isNotEmpty() },
          address = this@with.address.value,
          _address = this@with.address.toElement(),
          `header` =
            this@with.`header`
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _header =
            this@with.`header`
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}
