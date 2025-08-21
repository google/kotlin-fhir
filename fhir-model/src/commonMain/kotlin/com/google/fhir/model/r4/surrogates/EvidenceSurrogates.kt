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

import com.google.fhir.model.r4.Annotation
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.ContactDetail
import com.google.fhir.model.r4.Date
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Evidence
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDate
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.RelatedArtifact
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.UsageContext
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class EvidenceSurrogate(
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
  public var shortTitle: KotlinString? = null,
  public var _shortTitle: Element? = null,
  public var subtitle: KotlinString? = null,
  public var _subtitle: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: MutableList<ContactDetail>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var note: MutableList<Annotation>? = null,
  public var useContext: MutableList<UsageContext>? = null,
  public var jurisdiction: MutableList<CodeableConcept>? = null,
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
  public var exposureBackground: Reference,
  public var exposureVariant: MutableList<Reference>? = null,
  public var outcome: MutableList<Reference>? = null,
) {
  public fun toModel(): Evidence =
    Evidence(
      id = this@EvidenceSurrogate.id,
      meta = this@EvidenceSurrogate.meta,
      implicitRules =
        Uri.of(this@EvidenceSurrogate.implicitRules, this@EvidenceSurrogate._implicitRules),
      language = Code.of(this@EvidenceSurrogate.language, this@EvidenceSurrogate._language),
      text = this@EvidenceSurrogate.text,
      contained = this@EvidenceSurrogate.contained ?: mutableListOf(),
      extension = this@EvidenceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EvidenceSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@EvidenceSurrogate.url, this@EvidenceSurrogate._url),
      identifier = this@EvidenceSurrogate.identifier ?: mutableListOf(),
      version = R4String.of(this@EvidenceSurrogate.version, this@EvidenceSurrogate._version),
      name = R4String.of(this@EvidenceSurrogate.name, this@EvidenceSurrogate._name),
      title = R4String.of(this@EvidenceSurrogate.title, this@EvidenceSurrogate._title),
      shortTitle =
        R4String.of(this@EvidenceSurrogate.shortTitle, this@EvidenceSurrogate._shortTitle),
      subtitle = R4String.of(this@EvidenceSurrogate.subtitle, this@EvidenceSurrogate._subtitle),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.terminologies.PublicationStatus.fromCode(
            this@EvidenceSurrogate.status!!
          ),
          this@EvidenceSurrogate._status,
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@EvidenceSurrogate.date),
          this@EvidenceSurrogate._date,
        ),
      publisher = R4String.of(this@EvidenceSurrogate.publisher, this@EvidenceSurrogate._publisher),
      contact = this@EvidenceSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(this@EvidenceSurrogate.description, this@EvidenceSurrogate._description),
      note = this@EvidenceSurrogate.note ?: mutableListOf(),
      useContext = this@EvidenceSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@EvidenceSurrogate.jurisdiction ?: mutableListOf(),
      copyright = Markdown.of(this@EvidenceSurrogate.copyright, this@EvidenceSurrogate._copyright),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@EvidenceSurrogate.approvalDate),
          this@EvidenceSurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@EvidenceSurrogate.lastReviewDate),
          this@EvidenceSurrogate._lastReviewDate,
        ),
      effectivePeriod = this@EvidenceSurrogate.effectivePeriod,
      topic = this@EvidenceSurrogate.topic ?: mutableListOf(),
      author = this@EvidenceSurrogate.author ?: mutableListOf(),
      editor = this@EvidenceSurrogate.editor ?: mutableListOf(),
      reviewer = this@EvidenceSurrogate.reviewer ?: mutableListOf(),
      endorser = this@EvidenceSurrogate.endorser ?: mutableListOf(),
      relatedArtifact = this@EvidenceSurrogate.relatedArtifact ?: mutableListOf(),
      exposureBackground = this@EvidenceSurrogate.exposureBackground,
      exposureVariant = this@EvidenceSurrogate.exposureVariant ?: mutableListOf(),
      outcome = this@EvidenceSurrogate.outcome ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Evidence): EvidenceSurrogate =
      with(model) {
        EvidenceSurrogate(
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
          shortTitle = this@with.shortTitle?.value,
          _shortTitle = this@with.shortTitle?.toElement(),
          subtitle = this@with.subtitle?.value,
          _subtitle = this@with.subtitle?.toElement(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          note = this@with.note.takeUnless { it.all { it == null } },
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          jurisdiction = this@with.jurisdiction.takeUnless { it.all { it == null } },
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
          exposureBackground = this@with.exposureBackground,
          exposureVariant = this@with.exposureVariant.takeUnless { it.all { it == null } },
          outcome = this@with.outcome.takeUnless { it.all { it == null } },
        )
      }
  }
}
