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

import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Coding
import com.google.fhir.model.r4.ContactDetail
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.MessageDefinition
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.UnsignedInt
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.UsageContext
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MessageDefinitionFocusSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var profile: KotlinString? = null,
  public var _profile: Element? = null,
  public var min: Int? = null,
  public var _min: Element? = null,
  public var max: KotlinString? = null,
  public var _max: Element? = null,
) {
  public fun toModel(): MessageDefinition.Focus =
    MessageDefinition.Focus(
      id = this@MessageDefinitionFocusSurrogate.id,
      extension = this@MessageDefinitionFocusSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MessageDefinitionFocusSurrogate.modifierExtension ?: mutableListOf(),
      code =
        Enumeration.of(
          com.google.fhir.model.r4.ResourceType.fromCode(
            this@MessageDefinitionFocusSurrogate.code!!
          ),
          this@MessageDefinitionFocusSurrogate._code,
        ),
      profile =
        Canonical.of(
          this@MessageDefinitionFocusSurrogate.profile,
          this@MessageDefinitionFocusSurrogate._profile,
        ),
      min =
        UnsignedInt.of(
          this@MessageDefinitionFocusSurrogate.min,
          this@MessageDefinitionFocusSurrogate._min,
        )!!,
      max =
        R4String.of(
          this@MessageDefinitionFocusSurrogate.max,
          this@MessageDefinitionFocusSurrogate._max,
        ),
    )

  public companion object {
    public fun fromModel(model: MessageDefinition.Focus): MessageDefinitionFocusSurrogate =
      with(model) {
        MessageDefinitionFocusSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value?.getCode(),
          _code = this@with.code.toElement(),
          profile = this@with.profile?.value,
          _profile = this@with.profile?.toElement(),
          min = this@with.min.value,
          _min = this@with.min.toElement(),
          max = this@with.max?.value,
          _max = this@with.max?.toElement(),
        )
      }
  }
}

@Serializable
internal data class MessageDefinitionAllowedResponseSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var message: KotlinString? = null,
  public var _message: Element? = null,
  public var situation: KotlinString? = null,
  public var _situation: Element? = null,
) {
  public fun toModel(): MessageDefinition.AllowedResponse =
    MessageDefinition.AllowedResponse(
      id = this@MessageDefinitionAllowedResponseSurrogate.id,
      extension = this@MessageDefinitionAllowedResponseSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MessageDefinitionAllowedResponseSurrogate.modifierExtension ?: mutableListOf(),
      message =
        Canonical.of(
          this@MessageDefinitionAllowedResponseSurrogate.message,
          this@MessageDefinitionAllowedResponseSurrogate._message,
        )!!,
      situation =
        Markdown.of(
          this@MessageDefinitionAllowedResponseSurrogate.situation,
          this@MessageDefinitionAllowedResponseSurrogate._situation,
        ),
    )

  public companion object {
    public fun fromModel(
      model: MessageDefinition.AllowedResponse
    ): MessageDefinitionAllowedResponseSurrogate =
      with(model) {
        MessageDefinitionAllowedResponseSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          message = this@with.message.value,
          _message = this@with.message.toElement(),
          situation = this@with.situation?.value,
          _situation = this@with.situation?.toElement(),
        )
      }
  }
}

@Serializable
internal data class MessageDefinitionSurrogate(
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
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var replaces: MutableList<KotlinString?>? = null,
  public var _replaces: MutableList<Element?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: MutableList<ContactDetail>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: MutableList<UsageContext>? = null,
  public var jurisdiction: MutableList<CodeableConcept>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var base: KotlinString? = null,
  public var _base: Element? = null,
  public var parent: MutableList<KotlinString?>? = null,
  public var _parent: MutableList<Element?>? = null,
  public var eventCoding: Coding? = null,
  public var eventUri: KotlinString? = null,
  public var _eventUri: Element? = null,
  public var category: KotlinString? = null,
  public var _category: Element? = null,
  public var focus: MutableList<MessageDefinition.Focus>? = null,
  public var responseRequired: KotlinString? = null,
  public var _responseRequired: Element? = null,
  public var allowedResponse: MutableList<MessageDefinition.AllowedResponse>? = null,
  public var graph: MutableList<KotlinString?>? = null,
  public var _graph: MutableList<Element?>? = null,
) {
  public fun toModel(): MessageDefinition =
    MessageDefinition(
      id = this@MessageDefinitionSurrogate.id,
      meta = this@MessageDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@MessageDefinitionSurrogate.implicitRules,
          this@MessageDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@MessageDefinitionSurrogate.language,
          this@MessageDefinitionSurrogate._language,
        ),
      text = this@MessageDefinitionSurrogate.text,
      contained = this@MessageDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@MessageDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MessageDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@MessageDefinitionSurrogate.url, this@MessageDefinitionSurrogate._url),
      identifier = this@MessageDefinitionSurrogate.identifier ?: mutableListOf(),
      version =
        R4String.of(
          this@MessageDefinitionSurrogate.version,
          this@MessageDefinitionSurrogate._version,
        ),
      name =
        R4String.of(this@MessageDefinitionSurrogate.name, this@MessageDefinitionSurrogate._name),
      title =
        R4String.of(this@MessageDefinitionSurrogate.title, this@MessageDefinitionSurrogate._title),
      replaces =
        if (
          this@MessageDefinitionSurrogate.replaces == null &&
            this@MessageDefinitionSurrogate._replaces == null
        ) {
          mutableListOf()
        } else {
          (this@MessageDefinitionSurrogate.replaces
              ?: List(this@MessageDefinitionSurrogate._replaces!!.size) { null })
            .zip(
              this@MessageDefinitionSurrogate._replaces
                ?: List(this@MessageDefinitionSurrogate.replaces!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      status =
        Enumeration.of(
          com.google.fhir.model.r4.PublicationStatus.fromCode(
            this@MessageDefinitionSurrogate.status!!
          ),
          this@MessageDefinitionSurrogate._status,
        ),
      experimental =
        R4Boolean.of(
          this@MessageDefinitionSurrogate.experimental,
          this@MessageDefinitionSurrogate._experimental,
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@MessageDefinitionSurrogate.date),
          this@MessageDefinitionSurrogate._date,
        )!!,
      publisher =
        R4String.of(
          this@MessageDefinitionSurrogate.publisher,
          this@MessageDefinitionSurrogate._publisher,
        ),
      contact = this@MessageDefinitionSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@MessageDefinitionSurrogate.description,
          this@MessageDefinitionSurrogate._description,
        ),
      useContext = this@MessageDefinitionSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@MessageDefinitionSurrogate.jurisdiction ?: mutableListOf(),
      purpose =
        Markdown.of(
          this@MessageDefinitionSurrogate.purpose,
          this@MessageDefinitionSurrogate._purpose,
        ),
      copyright =
        Markdown.of(
          this@MessageDefinitionSurrogate.copyright,
          this@MessageDefinitionSurrogate._copyright,
        ),
      base =
        Canonical.of(this@MessageDefinitionSurrogate.base, this@MessageDefinitionSurrogate._base),
      parent =
        if (
          this@MessageDefinitionSurrogate.parent == null &&
            this@MessageDefinitionSurrogate._parent == null
        ) {
          mutableListOf()
        } else {
          (this@MessageDefinitionSurrogate.parent
              ?: List(this@MessageDefinitionSurrogate._parent!!.size) { null })
            .zip(
              this@MessageDefinitionSurrogate._parent
                ?: List(this@MessageDefinitionSurrogate.parent!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      event =
        MessageDefinition.Event.from(
          this@MessageDefinitionSurrogate.eventCoding,
          Uri.of(
            this@MessageDefinitionSurrogate.eventUri,
            this@MessageDefinitionSurrogate._eventUri,
          ),
        )!!,
      category =
        this@MessageDefinitionSurrogate.category?.let {
          Enumeration.of(
            com.google.fhir.model.r4.MessageDefinition.MessageSignificanceCategory.fromCode(it!!),
            this@MessageDefinitionSurrogate._category,
          )
        },
      focus = this@MessageDefinitionSurrogate.focus ?: mutableListOf(),
      responseRequired =
        this@MessageDefinitionSurrogate.responseRequired?.let {
          Enumeration.of(
            com.google.fhir.model.r4.MessageDefinition.MessageheaderResponseRequest.fromCode(it!!),
            this@MessageDefinitionSurrogate._responseRequired,
          )
        },
      allowedResponse = this@MessageDefinitionSurrogate.allowedResponse ?: mutableListOf(),
      graph =
        if (
          this@MessageDefinitionSurrogate.graph == null &&
            this@MessageDefinitionSurrogate._graph == null
        ) {
          mutableListOf()
        } else {
          (this@MessageDefinitionSurrogate.graph
              ?: List(this@MessageDefinitionSurrogate._graph!!.size) { null })
            .zip(
              this@MessageDefinitionSurrogate._graph
                ?: List(this@MessageDefinitionSurrogate.graph!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(model: MessageDefinition): MessageDefinitionSurrogate =
      with(model) {
        MessageDefinitionSurrogate(
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
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          replaces =
            this@with.replaces
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _replaces =
            this@with.replaces
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          date = this@with.date.value?.toString(),
          _date = this@with.date.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          jurisdiction = this@with.jurisdiction.takeUnless { it.all { it == null } },
          purpose = this@with.purpose?.value,
          _purpose = this@with.purpose?.toElement(),
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
          base = this@with.base?.value,
          _base = this@with.base?.toElement(),
          parent =
            this@with.parent.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _parent =
            this@with.parent
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          eventCoding = this@with.event?.asCoding()?.value,
          eventUri = this@with.event?.asUri()?.value?.value,
          _eventUri = this@with.event?.asUri()?.value?.toElement(),
          category = this@with.category?.value?.getCode(),
          _category = this@with.category?.toElement(),
          focus = this@with.focus.takeUnless { it.all { it == null } },
          responseRequired = this@with.responseRequired?.value?.getCode(),
          _responseRequired = this@with.responseRequired?.toElement(),
          allowedResponse = this@with.allowedResponse.takeUnless { it.all { it == null } },
          graph =
            this@with.graph.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _graph =
            this@with.graph
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}
