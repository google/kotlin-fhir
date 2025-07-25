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

import com.google.fhir.model.r4.Attachment
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.ContactDetail
import com.google.fhir.model.r4.DataRequirement
import com.google.fhir.model.r4.Date
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDate
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Library
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.ParameterDefinition
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.RelatedArtifact
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
internal data class LibrarySurrogate(
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
  public var subtitle: KotlinString? = null,
  public var _subtitle: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var type: CodeableConcept,
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
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
  public var usage: KotlinString? = null,
  public var _usage: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var approvalDate: KotlinString? = null,
  public var _approvalDate: Element? = null,
  public var lastReviewDate: KotlinString? = null,
  public var _lastReviewDate: Element? = null,
  public var effectivePeriod: Period? = null,
  public var topic: MutableList<CodeableConcept>? = null,
  public var author: MutableList<ContactDetail>? = null,
  public var editor: MutableList<ContactDetail>? = null,
  public var reviewer: MutableList<ContactDetail>? = null,
  public var endorser: MutableList<ContactDetail>? = null,
  public var relatedArtifact: MutableList<RelatedArtifact>? = null,
  public var parameter: MutableList<ParameterDefinition>? = null,
  public var dataRequirement: MutableList<DataRequirement>? = null,
  public var content: MutableList<Attachment>? = null,
) {
  public fun toModel(): Library =
    Library(
      id = this@LibrarySurrogate.id,
      meta = this@LibrarySurrogate.meta,
      implicitRules =
        Uri.of(this@LibrarySurrogate.implicitRules, this@LibrarySurrogate._implicitRules),
      language = Code.of(this@LibrarySurrogate.language, this@LibrarySurrogate._language),
      text = this@LibrarySurrogate.text,
      contained = this@LibrarySurrogate.contained ?: mutableListOf(),
      extension = this@LibrarySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@LibrarySurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@LibrarySurrogate.url, this@LibrarySurrogate._url),
      identifier = this@LibrarySurrogate.identifier ?: mutableListOf(),
      version = R4String.of(this@LibrarySurrogate.version, this@LibrarySurrogate._version),
      name = R4String.of(this@LibrarySurrogate.name, this@LibrarySurrogate._name),
      title = R4String.of(this@LibrarySurrogate.title, this@LibrarySurrogate._title),
      subtitle = R4String.of(this@LibrarySurrogate.subtitle, this@LibrarySurrogate._subtitle),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.PublicationStatus.fromCode(this@LibrarySurrogate.status!!),
          this@LibrarySurrogate._status,
        ),
      experimental =
        R4Boolean.of(this@LibrarySurrogate.experimental, this@LibrarySurrogate._experimental),
      type = this@LibrarySurrogate.type,
      subject =
        Library.Subject?.from(
          this@LibrarySurrogate.subjectCodeableConcept,
          this@LibrarySurrogate.subjectReference,
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@LibrarySurrogate.date),
          this@LibrarySurrogate._date,
        ),
      publisher = R4String.of(this@LibrarySurrogate.publisher, this@LibrarySurrogate._publisher),
      contact = this@LibrarySurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(this@LibrarySurrogate.description, this@LibrarySurrogate._description),
      useContext = this@LibrarySurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@LibrarySurrogate.jurisdiction ?: mutableListOf(),
      purpose = Markdown.of(this@LibrarySurrogate.purpose, this@LibrarySurrogate._purpose),
      usage = R4String.of(this@LibrarySurrogate.usage, this@LibrarySurrogate._usage),
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
      topic = this@LibrarySurrogate.topic ?: mutableListOf(),
      author = this@LibrarySurrogate.author ?: mutableListOf(),
      editor = this@LibrarySurrogate.editor ?: mutableListOf(),
      reviewer = this@LibrarySurrogate.reviewer ?: mutableListOf(),
      endorser = this@LibrarySurrogate.endorser ?: mutableListOf(),
      relatedArtifact = this@LibrarySurrogate.relatedArtifact ?: mutableListOf(),
      parameter = this@LibrarySurrogate.parameter ?: mutableListOf(),
      dataRequirement = this@LibrarySurrogate.dataRequirement ?: mutableListOf(),
      content = this@LibrarySurrogate.content ?: mutableListOf(),
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
          subtitle = this@with.subtitle?.value,
          _subtitle = this@with.subtitle?.toElement(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          type = this@with.type,
          subjectCodeableConcept = this@with.subject?.asCodeableConcept()?.value,
          subjectReference = this@with.subject?.asReference()?.value,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          jurisdiction = this@with.jurisdiction.takeUnless { it.all { it == null } },
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
          topic = this@with.topic.takeUnless { it.all { it == null } },
          author = this@with.author.takeUnless { it.all { it == null } },
          editor = this@with.editor.takeUnless { it.all { it == null } },
          reviewer = this@with.reviewer.takeUnless { it.all { it == null } },
          endorser = this@with.endorser.takeUnless { it.all { it == null } },
          relatedArtifact = this@with.relatedArtifact.takeUnless { it.all { it == null } },
          parameter = this@with.parameter.takeUnless { it.all { it == null } },
          dataRequirement = this@with.dataRequirement.takeUnless { it.all { it == null } },
          content = this@with.content.takeUnless { it.all { it == null } },
        )
      }
  }
}
