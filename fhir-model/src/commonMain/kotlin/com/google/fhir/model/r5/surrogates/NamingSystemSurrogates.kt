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

import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.NamingSystem
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
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
  public var authoritative: KotlinBoolean? = null,
  public var _authoritative: Element? = null,
) {
  public fun toModel(): NamingSystem.UniqueId =
    NamingSystem.UniqueId().apply {
      id = this@NamingSystemUniqueIdSurrogate.id
      extension = this@NamingSystemUniqueIdSurrogate.extension
      modifierExtension = this@NamingSystemUniqueIdSurrogate.modifierExtension
      type =
        Enumeration.of(
          this@NamingSystemUniqueIdSurrogate.type?.let {
            com.google.fhir.model.r5.NamingSystem.NamingSystemIdentifierType.fromCode(it)
          },
          this@NamingSystemUniqueIdSurrogate._type,
        )
      `value` =
        R5String.of(
          this@NamingSystemUniqueIdSurrogate.`value`,
          this@NamingSystemUniqueIdSurrogate._value,
        )
      preferred =
        R5Boolean.of(
          this@NamingSystemUniqueIdSurrogate.preferred,
          this@NamingSystemUniqueIdSurrogate._preferred,
        )
      comment =
        R5String.of(
          this@NamingSystemUniqueIdSurrogate.comment,
          this@NamingSystemUniqueIdSurrogate._comment,
        )
      period = this@NamingSystemUniqueIdSurrogate.period
      authoritative =
        R5Boolean.of(
          this@NamingSystemUniqueIdSurrogate.authoritative,
          this@NamingSystemUniqueIdSurrogate._authoritative,
        )
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
          authoritative = this@with.authoritative?.value
          _authoritative = this@with.authoritative?.toElement()
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
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: List<Identifier?>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var kind: KotlinString? = null,
  public var _kind: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
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
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var copyrightLabel: KotlinString? = null,
  public var _copyrightLabel: Element? = null,
  public var approvalDate: KotlinString? = null,
  public var _approvalDate: Element? = null,
  public var lastReviewDate: KotlinString? = null,
  public var _lastReviewDate: Element? = null,
  public var effectivePeriod: Period? = null,
  public var topic: List<CodeableConcept?>? = null,
  public var author: List<ContactDetail?>? = null,
  public var editor: List<ContactDetail?>? = null,
  public var reviewer: List<ContactDetail?>? = null,
  public var endorser: List<ContactDetail?>? = null,
  public var relatedArtifact: List<RelatedArtifact?>? = null,
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
      url = Uri.of(this@NamingSystemSurrogate.url, this@NamingSystemSurrogate._url)
      identifier = this@NamingSystemSurrogate.identifier
      version = R5String.of(this@NamingSystemSurrogate.version, this@NamingSystemSurrogate._version)
      versionAlgorithm =
        NamingSystem.VersionAlgorithm?.from(
          R5String.of(
            this@NamingSystemSurrogate.versionAlgorithmString,
            this@NamingSystemSurrogate._versionAlgorithmString,
          ),
          this@NamingSystemSurrogate.versionAlgorithmCoding,
        )
      name = R5String.of(this@NamingSystemSurrogate.name, this@NamingSystemSurrogate._name)
      title = R5String.of(this@NamingSystemSurrogate.title, this@NamingSystemSurrogate._title)
      status =
        Enumeration.of(
          this@NamingSystemSurrogate.status?.let {
            com.google.fhir.model.r5.PublicationStatus.fromCode(it)
          },
          this@NamingSystemSurrogate._status,
        )
      kind =
        Enumeration.of(
          this@NamingSystemSurrogate.kind?.let {
            com.google.fhir.model.r5.NamingSystem.NamingSystemType.fromCode(it)
          },
          this@NamingSystemSurrogate._kind,
        )
      experimental =
        R5Boolean.of(
          this@NamingSystemSurrogate.experimental,
          this@NamingSystemSurrogate._experimental,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@NamingSystemSurrogate.date),
          this@NamingSystemSurrogate._date,
        )
      publisher =
        R5String.of(this@NamingSystemSurrogate.publisher, this@NamingSystemSurrogate._publisher)
      contact = this@NamingSystemSurrogate.contact
      responsible =
        R5String.of(this@NamingSystemSurrogate.responsible, this@NamingSystemSurrogate._responsible)
      type = this@NamingSystemSurrogate.type
      description =
        Markdown.of(this@NamingSystemSurrogate.description, this@NamingSystemSurrogate._description)
      useContext = this@NamingSystemSurrogate.useContext
      jurisdiction = this@NamingSystemSurrogate.jurisdiction
      purpose = Markdown.of(this@NamingSystemSurrogate.purpose, this@NamingSystemSurrogate._purpose)
      copyright =
        Markdown.of(this@NamingSystemSurrogate.copyright, this@NamingSystemSurrogate._copyright)
      copyrightLabel =
        R5String.of(
          this@NamingSystemSurrogate.copyrightLabel,
          this@NamingSystemSurrogate._copyrightLabel,
        )
      approvalDate =
        Date.of(
          FhirDate.fromString(this@NamingSystemSurrogate.approvalDate),
          this@NamingSystemSurrogate._approvalDate,
        )
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@NamingSystemSurrogate.lastReviewDate),
          this@NamingSystemSurrogate._lastReviewDate,
        )
      effectivePeriod = this@NamingSystemSurrogate.effectivePeriod
      topic = this@NamingSystemSurrogate.topic
      author = this@NamingSystemSurrogate.author
      editor = this@NamingSystemSurrogate.editor
      reviewer = this@NamingSystemSurrogate.reviewer
      endorser = this@NamingSystemSurrogate.endorser
      relatedArtifact = this@NamingSystemSurrogate.relatedArtifact
      usage = R5String.of(this@NamingSystemSurrogate.usage, this@NamingSystemSurrogate._usage)
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
          url = this@with.url?.value
          _url = this@with.url?.toElement()
          identifier = this@with.identifier
          version = this@with.version?.value
          _version = this@with.version?.toElement()
          versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.value
          _versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.toElement()
          versionAlgorithmCoding = this@with.versionAlgorithm?.asCoding()?.value
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          kind = this@with.kind?.value?.getCode()
          _kind = this@with.kind?.toElement()
          experimental = this@with.experimental?.value
          _experimental = this@with.experimental?.toElement()
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
          purpose = this@with.purpose?.value
          _purpose = this@with.purpose?.toElement()
          copyright = this@with.copyright?.value
          _copyright = this@with.copyright?.toElement()
          copyrightLabel = this@with.copyrightLabel?.value
          _copyrightLabel = this@with.copyrightLabel?.toElement()
          approvalDate = this@with.approvalDate?.value?.toString()
          _approvalDate = this@with.approvalDate?.toElement()
          lastReviewDate = this@with.lastReviewDate?.value?.toString()
          _lastReviewDate = this@with.lastReviewDate?.toElement()
          effectivePeriod = this@with.effectivePeriod
          topic = this@with.topic
          author = this@with.author
          editor = this@with.editor
          reviewer = this@with.reviewer
          endorser = this@with.endorser
          relatedArtifact = this@with.relatedArtifact
          usage = this@with.usage?.value
          _usage = this@with.usage?.toElement()
          uniqueId = this@with.uniqueId
        }
      }
  }
}
