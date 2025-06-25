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
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class EndpointPayloadSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: List<CodeableConcept?>? = null,
  public var mimeType: List<KotlinString?>? = null,
  public var _mimeType: List<Element?>? = null,
) {
  public fun toModel(): Endpoint.Payload =
    Endpoint.Payload().apply {
      id = this@EndpointPayloadSurrogate.id
      extension = this@EndpointPayloadSurrogate.extension
      modifierExtension = this@EndpointPayloadSurrogate.modifierExtension
      type = this@EndpointPayloadSurrogate.type
      mimeType =
        if (
          this@EndpointPayloadSurrogate.mimeType == null &&
            this@EndpointPayloadSurrogate._mimeType == null
        ) {
          null
        } else {
          (this@EndpointPayloadSurrogate.mimeType
              ?: List(this@EndpointPayloadSurrogate._mimeType!!.size) { null })
            .zip(
              this@EndpointPayloadSurrogate._mimeType
                ?: List(this@EndpointPayloadSurrogate.mimeType!!.size) { null }
            )
            .mapNotNull { (value, element) -> Code.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(model: Endpoint.Payload): EndpointPayloadSurrogate =
      with(model) {
        EndpointPayloadSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          mimeType = this@with.mimeType?.map { it?.value }?.takeUnless { it.all { it == null } }
          _mimeType =
            this@with.mimeType?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var connectionType: List<CodeableConcept?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var environmentType: List<CodeableConcept?>? = null,
  public var managingOrganization: Reference? = null,
  public var contact: List<ContactPoint?>? = null,
  public var period: Period? = null,
  public var payload: List<Endpoint.Payload>? = null,
  public var address: KotlinString? = null,
  public var _address: Element? = null,
  public var `header`: List<KotlinString?>? = null,
  public var _header: List<Element?>? = null,
) {
  public fun toModel(): Endpoint =
    Endpoint().apply {
      id = this@EndpointSurrogate.id
      meta = this@EndpointSurrogate.meta
      implicitRules =
        Uri.of(this@EndpointSurrogate.implicitRules, this@EndpointSurrogate._implicitRules)
      language = Code.of(this@EndpointSurrogate.language, this@EndpointSurrogate._language)
      text = this@EndpointSurrogate.text
      contained = this@EndpointSurrogate.contained
      extension = this@EndpointSurrogate.extension
      modifierExtension = this@EndpointSurrogate.modifierExtension
      identifier = this@EndpointSurrogate.identifier
      status =
        Enumeration.of(
          this@EndpointSurrogate.status?.let {
            com.google.fhir.model.r5.Endpoint.EndpointStatus.fromCode(it)
          },
          this@EndpointSurrogate._status,
        )
      connectionType = this@EndpointSurrogate.connectionType
      name = R5String.of(this@EndpointSurrogate.name, this@EndpointSurrogate._name)
      description =
        R5String.of(this@EndpointSurrogate.description, this@EndpointSurrogate._description)
      environmentType = this@EndpointSurrogate.environmentType
      managingOrganization = this@EndpointSurrogate.managingOrganization
      contact = this@EndpointSurrogate.contact
      period = this@EndpointSurrogate.period
      payload = this@EndpointSurrogate.payload
      address = Url.of(this@EndpointSurrogate.address, this@EndpointSurrogate._address)
      `header` =
        if (this@EndpointSurrogate.`header` == null && this@EndpointSurrogate._header == null) {
          null
        } else {
          (this@EndpointSurrogate.`header` ?: List(this@EndpointSurrogate._header!!.size) { null })
            .zip(
              this@EndpointSurrogate._header
                ?: List(this@EndpointSurrogate.`header`!!.size) { null }
            )
            .mapNotNull { (value, element) -> R5String.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(model: Endpoint): EndpointSurrogate =
      with(model) {
        EndpointSurrogate().apply {
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
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          connectionType = this@with.connectionType
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          environmentType = this@with.environmentType
          managingOrganization = this@with.managingOrganization
          contact = this@with.contact
          period = this@with.period
          payload = this@with.payload
          address = this@with.address?.value
          _address = this@with.address?.toElement()
          `header` = this@with.`header`?.map { it?.value }?.takeUnless { it.all { it == null } }
          _header =
            this@with.`header`?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
        }
      }
  }
}
