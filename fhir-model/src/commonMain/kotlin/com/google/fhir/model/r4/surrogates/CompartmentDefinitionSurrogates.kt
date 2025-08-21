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
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CompartmentDefinition
import com.google.fhir.model.r4.ContactDetail
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.UsageContext
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CompartmentDefinitionResourceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var `param`: MutableList<KotlinString?>? = null,
  public var _param: MutableList<Element?>? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
) {
  public fun toModel(): CompartmentDefinition.Resource =
    CompartmentDefinition.Resource(
      id = this@CompartmentDefinitionResourceSurrogate.id,
      extension = this@CompartmentDefinitionResourceSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CompartmentDefinitionResourceSurrogate.modifierExtension ?: mutableListOf(),
      code =
        Enumeration.of(
          com.google.fhir.model.r4.terminologies.ResourceType.fromCode(
            this@CompartmentDefinitionResourceSurrogate.code!!
          ),
          this@CompartmentDefinitionResourceSurrogate._code,
        ),
      `param` =
        if (
          this@CompartmentDefinitionResourceSurrogate.`param` == null &&
            this@CompartmentDefinitionResourceSurrogate._param == null
        ) {
          mutableListOf()
        } else {
          (this@CompartmentDefinitionResourceSurrogate.`param`
              ?: List(this@CompartmentDefinitionResourceSurrogate._param!!.size) { null })
            .zip(
              this@CompartmentDefinitionResourceSurrogate._param
                ?: List(this@CompartmentDefinitionResourceSurrogate.`param`!!.size) { null }
            )
            .map { (value, element) -> R4String.of(value, element)!! }
            .toMutableList()
        },
      documentation =
        R4String.of(
          this@CompartmentDefinitionResourceSurrogate.documentation,
          this@CompartmentDefinitionResourceSurrogate._documentation,
        ),
    )

  public companion object {
    public fun fromModel(
      model: CompartmentDefinition.Resource
    ): CompartmentDefinitionResourceSurrogate =
      with(model) {
        CompartmentDefinitionResourceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value?.getCode(),
          _code = this@with.code.toElement(),
          `param` =
            this@with.`param`.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _param =
            this@with.`param`
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          documentation = this@with.documentation?.value,
          _documentation = this@with.documentation?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CompartmentDefinitionSurrogate(
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
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
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
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var search: KotlinBoolean? = null,
  public var _search: Element? = null,
  public var resource: MutableList<CompartmentDefinition.Resource>? = null,
) {
  public fun toModel(): CompartmentDefinition =
    CompartmentDefinition(
      id = this@CompartmentDefinitionSurrogate.id,
      meta = this@CompartmentDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@CompartmentDefinitionSurrogate.implicitRules,
          this@CompartmentDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@CompartmentDefinitionSurrogate.language,
          this@CompartmentDefinitionSurrogate._language,
        ),
      text = this@CompartmentDefinitionSurrogate.text,
      contained = this@CompartmentDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@CompartmentDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CompartmentDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      url =
        Uri.of(this@CompartmentDefinitionSurrogate.url, this@CompartmentDefinitionSurrogate._url)!!,
      version =
        R4String.of(
          this@CompartmentDefinitionSurrogate.version,
          this@CompartmentDefinitionSurrogate._version,
        ),
      name =
        R4String.of(
          this@CompartmentDefinitionSurrogate.name,
          this@CompartmentDefinitionSurrogate._name,
        )!!,
      status =
        Enumeration.of(
          com.google.fhir.model.r4.terminologies.PublicationStatus.fromCode(
            this@CompartmentDefinitionSurrogate.status!!
          ),
          this@CompartmentDefinitionSurrogate._status,
        ),
      experimental =
        R4Boolean.of(
          this@CompartmentDefinitionSurrogate.experimental,
          this@CompartmentDefinitionSurrogate._experimental,
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@CompartmentDefinitionSurrogate.date),
          this@CompartmentDefinitionSurrogate._date,
        ),
      publisher =
        R4String.of(
          this@CompartmentDefinitionSurrogate.publisher,
          this@CompartmentDefinitionSurrogate._publisher,
        ),
      contact = this@CompartmentDefinitionSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@CompartmentDefinitionSurrogate.description,
          this@CompartmentDefinitionSurrogate._description,
        ),
      useContext = this@CompartmentDefinitionSurrogate.useContext ?: mutableListOf(),
      purpose =
        Markdown.of(
          this@CompartmentDefinitionSurrogate.purpose,
          this@CompartmentDefinitionSurrogate._purpose,
        ),
      code =
        Enumeration.of(
          com.google.fhir.model.r4.CompartmentDefinition.CompartmentType.fromCode(
            this@CompartmentDefinitionSurrogate.code!!
          ),
          this@CompartmentDefinitionSurrogate._code,
        ),
      search =
        R4Boolean.of(
          this@CompartmentDefinitionSurrogate.search,
          this@CompartmentDefinitionSurrogate._search,
        )!!,
      resource = this@CompartmentDefinitionSurrogate.resource ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: CompartmentDefinition): CompartmentDefinitionSurrogate =
      with(model) {
        CompartmentDefinitionSurrogate(
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
          url = this@with.url.value,
          _url = this@with.url.toElement(),
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          purpose = this@with.purpose?.value,
          _purpose = this@with.purpose?.toElement(),
          code = this@with.code.value?.getCode(),
          _code = this@with.code.toElement(),
          search = this@with.search.value,
          _search = this@with.search.toElement(),
          resource = this@with.resource.takeUnless { it.all { it == null } },
        )
      }
  }
}
