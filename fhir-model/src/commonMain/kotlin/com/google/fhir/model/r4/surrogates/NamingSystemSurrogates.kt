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
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.ContactDetail
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.NamingSystem
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.UsageContext
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class NamingSystemUniqueIdSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
  public var preferred: KotlinBoolean? = null,
  public var _preferred: Element? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
  public var period: Period? = null,
) {
  public fun toModel(): NamingSystem.UniqueId =
    NamingSystem.UniqueId().apply {
      id = this@NamingSystemUniqueIdSurrogate.id
      extension = this@NamingSystemUniqueIdSurrogate.extension
      modifierExtension = this@NamingSystemUniqueIdSurrogate.modifierExtension
      type =
        Enumeration.of(
          this@NamingSystemUniqueIdSurrogate.type?.let {
            com.google.fhir.model.r4.NamingSystem.NamingSystemIdentifierType.fromCode(it)
          },
          this@NamingSystemUniqueIdSurrogate._type,
        )
      `value` =
        R4String.of(
          this@NamingSystemUniqueIdSurrogate.`value`,
          this@NamingSystemUniqueIdSurrogate._value,
        )
      preferred =
        R4Boolean.of(
          this@NamingSystemUniqueIdSurrogate.preferred,
          this@NamingSystemUniqueIdSurrogate._preferred,
        )
      comment =
        R4String.of(
          this@NamingSystemUniqueIdSurrogate.comment,
          this@NamingSystemUniqueIdSurrogate._comment,
        )
      period = this@NamingSystemUniqueIdSurrogate.period
    }

  public companion object {
    public fun fromModel(model: NamingSystem.UniqueId): NamingSystemUniqueIdSurrogate =
      with(model) {
        NamingSystemUniqueIdSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          `value` = this@with.`value`?.value
          _value = this@with.`value`?.toElement()
          preferred = this@with.preferred?.value
          _preferred = this@with.preferred?.toElement()
          comment = this@with.comment?.value
          _comment = this@with.comment?.toElement()
          period = this@with.period
        }
      }
  }
}

@Serializable
internal data class NamingSystemSurrogate(
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
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var kind: KotlinString? = null,
  public var _kind: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: List<ContactDetail?>? = null,
  public var responsible: KotlinString? = null,
  public var _responsible: Element? = null,
  public var type: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: List<UsageContext?>? = null,
  public var jurisdiction: List<CodeableConcept?>? = null,
  public var usage: KotlinString? = null,
  public var _usage: Element? = null,
  public var uniqueId: List<NamingSystem.UniqueId>? = null,
) {
  public fun toModel(): NamingSystem =
    NamingSystem().apply {
      id = this@NamingSystemSurrogate.id
      meta = this@NamingSystemSurrogate.meta
      implicitRules =
        Uri.of(this@NamingSystemSurrogate.implicitRules, this@NamingSystemSurrogate._implicitRules)
      language = Code.of(this@NamingSystemSurrogate.language, this@NamingSystemSurrogate._language)
      text = this@NamingSystemSurrogate.text
      contained = this@NamingSystemSurrogate.contained
      extension = this@NamingSystemSurrogate.extension
      modifierExtension = this@NamingSystemSurrogate.modifierExtension
      name = R4String.of(this@NamingSystemSurrogate.name, this@NamingSystemSurrogate._name)
      status =
        Enumeration.of(
          this@NamingSystemSurrogate.status?.let {
            com.google.fhir.model.r4.PublicationStatus.fromCode(it)
          },
          this@NamingSystemSurrogate._status,
        )
      kind =
        Enumeration.of(
          this@NamingSystemSurrogate.kind?.let {
            com.google.fhir.model.r4.NamingSystem.NamingSystemType.fromCode(it)
          },
          this@NamingSystemSurrogate._kind,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@NamingSystemSurrogate.date),
          this@NamingSystemSurrogate._date,
        )
      publisher =
        R4String.of(this@NamingSystemSurrogate.publisher, this@NamingSystemSurrogate._publisher)
      contact = this@NamingSystemSurrogate.contact
      responsible =
        R4String.of(this@NamingSystemSurrogate.responsible, this@NamingSystemSurrogate._responsible)
      type = this@NamingSystemSurrogate.type
      description =
        Markdown.of(this@NamingSystemSurrogate.description, this@NamingSystemSurrogate._description)
      useContext = this@NamingSystemSurrogate.useContext
      jurisdiction = this@NamingSystemSurrogate.jurisdiction
      usage = R4String.of(this@NamingSystemSurrogate.usage, this@NamingSystemSurrogate._usage)
      uniqueId = this@NamingSystemSurrogate.uniqueId
    }

  public companion object {
    public fun fromModel(model: NamingSystem): NamingSystemSurrogate =
      with(model) {
        NamingSystemSurrogate().apply {
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
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          kind = this@with.kind?.value?.getCode()
          _kind = this@with.kind?.toElement()
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          publisher = this@with.publisher?.value
          _publisher = this@with.publisher?.toElement()
          contact = this@with.contact
          responsible = this@with.responsible?.value
          _responsible = this@with.responsible?.toElement()
          type = this@with.type
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          useContext = this@with.useContext
          jurisdiction = this@with.jurisdiction
          usage = this@with.usage?.value
          _usage = this@with.usage?.toElement()
          uniqueId = this@with.uniqueId
        }
      }
  }
}
