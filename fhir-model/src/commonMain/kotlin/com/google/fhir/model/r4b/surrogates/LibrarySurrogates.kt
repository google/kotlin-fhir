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

import com.google.fhir.model.r4b.Attachment
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.ContactDetail
import com.google.fhir.model.r4b.DataRequirement
import com.google.fhir.model.r4b.Date
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDate
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Library
import com.google.fhir.model.r4b.Markdown
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.ParameterDefinition
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.RelatedArtifact
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.UsageContext
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import com.google.fhir.model.r4b.terminologies.PublicationStatus
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class LibrarySubjectSurrogate(
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
) {
  public fun toModel(): Library.Subject =
    Library.Subject.from(
      this@LibrarySubjectSurrogate.subjectCodeableConcept,
      this@LibrarySubjectSurrogate.subjectReference,
    )!!

  public companion object {
    public fun fromModel(model: Library.Subject): LibrarySubjectSurrogate =
      with(model) {
        LibrarySubjectSurrogate(
          subjectCodeableConcept = this@with.asCodeableConcept()?.value,
          subjectReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class LibrarySurrogate(
  public var id: KotlinString? = null,
  public var meta: Meta? = null,
  public var implicitRules: KotlinString? = null,
  public var _implicitRules: Element? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource>? = null,
  public var extension: List<Extension>? = null,
  public var modifierExtension: List<Extension>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: List<Identifier>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var subtitle: KotlinString? = null,
  public var _subtitle: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var type: CodeableConcept,
  public var subject: Library.Subject? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: List<ContactDetail>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: List<UsageContext>? = null,
  public var jurisdiction: List<CodeableConcept>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var usage: KotlinString? = null,
  public var _usage: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var approvalDate: KotlinString? = null,
  public var _approvalDate: Element? = null,
  public var lastReviewDate: KotlinString? = null,
  public var _lastReviewDate: Element? = null,
  public var effectivePeriod: Period? = null,
  public var topic: List<CodeableConcept>? = null,
  public var author: List<ContactDetail>? = null,
  public var editor: List<ContactDetail>? = null,
  public var reviewer: List<ContactDetail>? = null,
  public var endorser: List<ContactDetail>? = null,
  public var relatedArtifact: List<RelatedArtifact>? = null,
  public var parameter: List<ParameterDefinition>? = null,
  public var dataRequirement: List<DataRequirement>? = null,
  public var content: List<Attachment>? = null,
) {
  public fun toModel(): Library =
    Library(
      id = this@LibrarySurrogate.id,
      meta = this@LibrarySurrogate.meta,
      implicitRules =
        Uri.of(this@LibrarySurrogate.implicitRules, this@LibrarySurrogate._implicitRules),
      language = Code.of(this@LibrarySurrogate.language, this@LibrarySurrogate._language),
      text = this@LibrarySurrogate.text,
      contained = this@LibrarySurrogate.contained ?: listOf(),
      extension = this@LibrarySurrogate.extension ?: listOf(),
      modifierExtension = this@LibrarySurrogate.modifierExtension ?: listOf(),
      url = Uri.of(this@LibrarySurrogate.url, this@LibrarySurrogate._url),
      identifier = this@LibrarySurrogate.identifier ?: listOf(),
      version = R4bString.of(this@LibrarySurrogate.version, this@LibrarySurrogate._version),
      name = R4bString.of(this@LibrarySurrogate.name, this@LibrarySurrogate._name),
      title = R4bString.of(this@LibrarySurrogate.title, this@LibrarySurrogate._title),
      subtitle = R4bString.of(this@LibrarySurrogate.subtitle, this@LibrarySurrogate._subtitle),
      status =
        Enumeration.of(
          PublicationStatus.fromCode(this@LibrarySurrogate.status!!),
          this@LibrarySurrogate._status,
        ),
      experimental =
        R4bBoolean.of(this@LibrarySurrogate.experimental, this@LibrarySurrogate._experimental),
      type = this@LibrarySurrogate.type,
      subject = this@LibrarySurrogate.subject,
      date =
        DateTime.of(
          FhirDateTime.fromString(this@LibrarySurrogate.date),
          this@LibrarySurrogate._date,
        ),
      publisher = R4bString.of(this@LibrarySurrogate.publisher, this@LibrarySurrogate._publisher),
      contact = this@LibrarySurrogate.contact ?: listOf(),
      description =
        Markdown.of(this@LibrarySurrogate.description, this@LibrarySurrogate._description),
      useContext = this@LibrarySurrogate.useContext ?: listOf(),
      jurisdiction = this@LibrarySurrogate.jurisdiction ?: listOf(),
      purpose = Markdown.of(this@LibrarySurrogate.purpose, this@LibrarySurrogate._purpose),
      usage = R4bString.of(this@LibrarySurrogate.usage, this@LibrarySurrogate._usage),
      copyright = Markdown.of(this@LibrarySurrogate.copyright, this@LibrarySurrogate._copyright),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@LibrarySurrogate.approvalDate),
          this@LibrarySurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@LibrarySurrogate.lastReviewDate),
          this@LibrarySurrogate._lastReviewDate,
        ),
      effectivePeriod = this@LibrarySurrogate.effectivePeriod,
      topic = this@LibrarySurrogate.topic ?: listOf(),
      author = this@LibrarySurrogate.author ?: listOf(),
      editor = this@LibrarySurrogate.editor ?: listOf(),
      reviewer = this@LibrarySurrogate.reviewer ?: listOf(),
      endorser = this@LibrarySurrogate.endorser ?: listOf(),
      relatedArtifact = this@LibrarySurrogate.relatedArtifact ?: listOf(),
      parameter = this@LibrarySurrogate.parameter ?: listOf(),
      dataRequirement = this@LibrarySurrogate.dataRequirement ?: listOf(),
      content = this@LibrarySurrogate.content ?: listOf(),
    )

  public companion object {
    public fun fromModel(model: Library): LibrarySurrogate =
      with(model) {
        LibrarySurrogate(
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
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          subtitle = this@with.subtitle?.value,
          _subtitle = this@with.subtitle?.toElement(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          type = this@with.type,
          subject = this@with.subject,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeIf { it.isNotEmpty() },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          useContext = this@with.useContext.takeIf { it.isNotEmpty() },
          jurisdiction = this@with.jurisdiction.takeIf { it.isNotEmpty() },
          purpose = this@with.purpose?.value,
          _purpose = this@with.purpose?.toElement(),
          usage = this@with.usage?.value,
          _usage = this@with.usage?.toElement(),
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
          approvalDate = this@with.approvalDate?.value?.toString(),
          _approvalDate = this@with.approvalDate?.toElement(),
          lastReviewDate = this@with.lastReviewDate?.value?.toString(),
          _lastReviewDate = this@with.lastReviewDate?.toElement(),
          effectivePeriod = this@with.effectivePeriod,
          topic = this@with.topic.takeIf { it.isNotEmpty() },
          author = this@with.author.takeIf { it.isNotEmpty() },
          editor = this@with.editor.takeIf { it.isNotEmpty() },
          reviewer = this@with.reviewer.takeIf { it.isNotEmpty() },
          endorser = this@with.endorser.takeIf { it.isNotEmpty() },
          relatedArtifact = this@with.relatedArtifact.takeIf { it.isNotEmpty() },
          parameter = this@with.parameter.takeIf { it.isNotEmpty() },
          dataRequirement = this@with.dataRequirement.takeIf { it.isNotEmpty() },
          content = this@with.content.takeIf { it.isNotEmpty() },
        )
      }
  }
}
