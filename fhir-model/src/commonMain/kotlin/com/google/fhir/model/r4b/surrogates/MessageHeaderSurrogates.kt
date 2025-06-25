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

import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Coding
import com.google.fhir.model.r4b.ContactPoint
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Id
import com.google.fhir.model.r4b.MessageHeader
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.Url
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MessageHeaderDestinationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var target: Reference? = null,
  public var endpoint: KotlinString? = null,
  public var _endpoint: Element? = null,
  public var `receiver`: Reference? = null,
) {
  public fun toModel(): MessageHeader.Destination =
    MessageHeader.Destination().apply {
      id = this@MessageHeaderDestinationSurrogate.id
      extension = this@MessageHeaderDestinationSurrogate.extension
      modifierExtension = this@MessageHeaderDestinationSurrogate.modifierExtension
      name =
        R4bString.of(
          this@MessageHeaderDestinationSurrogate.name,
          this@MessageHeaderDestinationSurrogate._name,
        )
      target = this@MessageHeaderDestinationSurrogate.target
      endpoint =
        Url.of(
          this@MessageHeaderDestinationSurrogate.endpoint,
          this@MessageHeaderDestinationSurrogate._endpoint,
        )
      `receiver` = this@MessageHeaderDestinationSurrogate.`receiver`
    }

  public companion object {
    public fun fromModel(model: MessageHeader.Destination): MessageHeaderDestinationSurrogate =
      with(model) {
        MessageHeaderDestinationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          target = this@with.target
          endpoint = this@with.endpoint?.value
          _endpoint = this@with.endpoint?.toElement()
          `receiver` = this@with.`receiver`
        }
      }
  }
}

@Serializable
internal data class MessageHeaderSourceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var software: KotlinString? = null,
  public var _software: Element? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var contact: ContactPoint? = null,
  public var endpoint: KotlinString? = null,
  public var _endpoint: Element? = null,
) {
  public fun toModel(): MessageHeader.Source =
    MessageHeader.Source().apply {
      id = this@MessageHeaderSourceSurrogate.id
      extension = this@MessageHeaderSourceSurrogate.extension
      modifierExtension = this@MessageHeaderSourceSurrogate.modifierExtension
      name =
        R4bString.of(
          this@MessageHeaderSourceSurrogate.name,
          this@MessageHeaderSourceSurrogate._name,
        )
      software =
        R4bString.of(
          this@MessageHeaderSourceSurrogate.software,
          this@MessageHeaderSourceSurrogate._software,
        )
      version =
        R4bString.of(
          this@MessageHeaderSourceSurrogate.version,
          this@MessageHeaderSourceSurrogate._version,
        )
      contact = this@MessageHeaderSourceSurrogate.contact
      endpoint =
        Url.of(
          this@MessageHeaderSourceSurrogate.endpoint,
          this@MessageHeaderSourceSurrogate._endpoint,
        )
    }

  public companion object {
    public fun fromModel(model: MessageHeader.Source): MessageHeaderSourceSurrogate =
      with(model) {
        MessageHeaderSourceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          software = this@with.software?.value
          _software = this@with.software?.toElement()
          version = this@with.version?.value
          _version = this@with.version?.toElement()
          contact = this@with.contact
          endpoint = this@with.endpoint?.value
          _endpoint = this@with.endpoint?.toElement()
        }
      }
  }
}

@Serializable
internal data class MessageHeaderResponseSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: KotlinString? = null,
  public var _identifier: Element? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var details: Reference? = null,
) {
  public fun toModel(): MessageHeader.Response =
    MessageHeader.Response().apply {
      id = this@MessageHeaderResponseSurrogate.id
      extension = this@MessageHeaderResponseSurrogate.extension
      modifierExtension = this@MessageHeaderResponseSurrogate.modifierExtension
      identifier =
        Id.of(
          this@MessageHeaderResponseSurrogate.identifier,
          this@MessageHeaderResponseSurrogate._identifier,
        )
      code =
        Enumeration.of(
          this@MessageHeaderResponseSurrogate.code?.let {
            com.google.fhir.model.r4b.MessageHeader.ResponseType.fromCode(it)
          },
          this@MessageHeaderResponseSurrogate._code,
        )
      details = this@MessageHeaderResponseSurrogate.details
    }

  public companion object {
    public fun fromModel(model: MessageHeader.Response): MessageHeaderResponseSurrogate =
      with(model) {
        MessageHeaderResponseSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier?.value
          _identifier = this@with.identifier?.toElement()
          code = this@with.code?.value?.getCode()
          _code = this@with.code?.toElement()
          details = this@with.details
        }
      }
  }
}

@Serializable
internal data class MessageHeaderSurrogate(
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
  public var eventCoding: Coding? = null,
  public var eventUri: KotlinString? = null,
  public var _eventUri: Element? = null,
  public var destination: List<MessageHeader.Destination>? = null,
  public var sender: Reference? = null,
  public var enterer: Reference? = null,
  public var author: Reference? = null,
  public var source: MessageHeader.Source? = null,
  public var responsible: Reference? = null,
  public var reason: CodeableConcept? = null,
  public var response: MessageHeader.Response? = null,
  public var focus: List<Reference?>? = null,
  public var definition: KotlinString? = null,
  public var _definition: Element? = null,
) {
  public fun toModel(): MessageHeader =
    MessageHeader().apply {
      id = this@MessageHeaderSurrogate.id
      meta = this@MessageHeaderSurrogate.meta
      implicitRules =
        Uri.of(
          this@MessageHeaderSurrogate.implicitRules,
          this@MessageHeaderSurrogate._implicitRules,
        )
      language =
        Code.of(this@MessageHeaderSurrogate.language, this@MessageHeaderSurrogate._language)
      text = this@MessageHeaderSurrogate.text
      contained = this@MessageHeaderSurrogate.contained
      extension = this@MessageHeaderSurrogate.extension
      modifierExtension = this@MessageHeaderSurrogate.modifierExtension
      event =
        MessageHeader.Event?.from(
          this@MessageHeaderSurrogate.eventCoding,
          Uri.of(this@MessageHeaderSurrogate.eventUri, this@MessageHeaderSurrogate._eventUri),
        )
      destination = this@MessageHeaderSurrogate.destination
      sender = this@MessageHeaderSurrogate.sender
      enterer = this@MessageHeaderSurrogate.enterer
      author = this@MessageHeaderSurrogate.author
      source = this@MessageHeaderSurrogate.source
      responsible = this@MessageHeaderSurrogate.responsible
      reason = this@MessageHeaderSurrogate.reason
      response = this@MessageHeaderSurrogate.response
      focus = this@MessageHeaderSurrogate.focus
      definition =
        Canonical.of(
          this@MessageHeaderSurrogate.definition,
          this@MessageHeaderSurrogate._definition,
        )
    }

  public companion object {
    public fun fromModel(model: MessageHeader): MessageHeaderSurrogate =
      with(model) {
        MessageHeaderSurrogate().apply {
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
          eventCoding = this@with.event?.asCoding()?.value
          eventUri = this@with.event?.asUri()?.value?.value
          _eventUri = this@with.event?.asUri()?.value?.toElement()
          destination = this@with.destination
          sender = this@with.sender
          enterer = this@with.enterer
          author = this@with.author
          source = this@with.source
          responsible = this@with.responsible
          reason = this@with.reason
          response = this@with.response
          focus = this@with.focus
          definition = this@with.definition?.value
          _definition = this@with.definition?.toElement()
        }
      }
  }
}
