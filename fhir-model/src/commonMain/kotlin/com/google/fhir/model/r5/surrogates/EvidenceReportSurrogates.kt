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

import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.EvidenceReport
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Reference
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
internal data class EvidenceReportSubjectCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var valueReference: Reference? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
  public var exclude: KotlinBoolean? = null,
  public var _exclude: Element? = null,
  public var period: Period? = null,
) {
  public fun toModel(): EvidenceReport.Subject.Characteristic =
    EvidenceReport.Subject.Characteristic().apply {
      id = this@EvidenceReportSubjectCharacteristicSurrogate.id
      extension = this@EvidenceReportSubjectCharacteristicSurrogate.extension
      modifierExtension = this@EvidenceReportSubjectCharacteristicSurrogate.modifierExtension
      code = this@EvidenceReportSubjectCharacteristicSurrogate.code
      `value` =
        EvidenceReport.Subject.Characteristic.Value?.from(
          this@EvidenceReportSubjectCharacteristicSurrogate.valueReference,
          this@EvidenceReportSubjectCharacteristicSurrogate.valueCodeableConcept,
          R5Boolean.of(
            this@EvidenceReportSubjectCharacteristicSurrogate.valueBoolean,
            this@EvidenceReportSubjectCharacteristicSurrogate._valueBoolean,
          ),
          this@EvidenceReportSubjectCharacteristicSurrogate.valueQuantity,
          this@EvidenceReportSubjectCharacteristicSurrogate.valueRange,
        )
      exclude =
        R5Boolean.of(
          this@EvidenceReportSubjectCharacteristicSurrogate.exclude,
          this@EvidenceReportSubjectCharacteristicSurrogate._exclude,
        )
      period = this@EvidenceReportSubjectCharacteristicSurrogate.period
    }

  public companion object {
    public fun fromModel(
      model: EvidenceReport.Subject.Characteristic
    ): EvidenceReportSubjectCharacteristicSurrogate =
      with(model) {
        EvidenceReportSubjectCharacteristicSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          valueReference = this@with.`value`?.asReference()?.value
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement()
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueRange = this@with.`value`?.asRange()?.value
          exclude = this@with.exclude?.value
          _exclude = this@with.exclude?.toElement()
          period = this@with.period
        }
      }
  }
}

@Serializable
internal data class EvidenceReportSubjectSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var characteristic: List<EvidenceReport.Subject.Characteristic>? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): EvidenceReport.Subject =
    EvidenceReport.Subject().apply {
      id = this@EvidenceReportSubjectSurrogate.id
      extension = this@EvidenceReportSubjectSurrogate.extension
      modifierExtension = this@EvidenceReportSubjectSurrogate.modifierExtension
      characteristic = this@EvidenceReportSubjectSurrogate.characteristic
      note = this@EvidenceReportSubjectSurrogate.note
    }

  public companion object {
    public fun fromModel(model: EvidenceReport.Subject): EvidenceReportSubjectSurrogate =
      with(model) {
        EvidenceReportSubjectSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          characteristic = this@with.characteristic
          note = this@with.note
        }
      }
  }
}

@Serializable
internal data class EvidenceReportRelatesToTargetSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: Identifier? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
  public var resource: Reference? = null,
) {
  public fun toModel(): EvidenceReport.RelatesTo.Target =
    EvidenceReport.RelatesTo.Target().apply {
      id = this@EvidenceReportRelatesToTargetSurrogate.id
      extension = this@EvidenceReportRelatesToTargetSurrogate.extension
      modifierExtension = this@EvidenceReportRelatesToTargetSurrogate.modifierExtension
      url =
        Uri.of(
          this@EvidenceReportRelatesToTargetSurrogate.url,
          this@EvidenceReportRelatesToTargetSurrogate._url,
        )
      identifier = this@EvidenceReportRelatesToTargetSurrogate.identifier
      display =
        Markdown.of(
          this@EvidenceReportRelatesToTargetSurrogate.display,
          this@EvidenceReportRelatesToTargetSurrogate._display,
        )
      resource = this@EvidenceReportRelatesToTargetSurrogate.resource
    }

  public companion object {
    public fun fromModel(
      model: EvidenceReport.RelatesTo.Target
    ): EvidenceReportRelatesToTargetSurrogate =
      with(model) {
        EvidenceReportRelatesToTargetSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          url = this@with.url?.value
          _url = this@with.url?.toElement()
          identifier = this@with.identifier
          display = this@with.display?.value
          _display = this@with.display?.toElement()
          resource = this@with.resource
        }
      }
  }
}

@Serializable
internal data class EvidenceReportRelatesToSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var target: EvidenceReport.RelatesTo.Target? = null,
) {
  public fun toModel(): EvidenceReport.RelatesTo =
    EvidenceReport.RelatesTo().apply {
      id = this@EvidenceReportRelatesToSurrogate.id
      extension = this@EvidenceReportRelatesToSurrogate.extension
      modifierExtension = this@EvidenceReportRelatesToSurrogate.modifierExtension
      code =
        Enumeration.of(
          this@EvidenceReportRelatesToSurrogate.code?.let {
            com.google.fhir.model.r5.EvidenceReport.ReportRelationshipType.fromCode(it)
          },
          this@EvidenceReportRelatesToSurrogate._code,
        )
      target = this@EvidenceReportRelatesToSurrogate.target
    }

  public companion object {
    public fun fromModel(model: EvidenceReport.RelatesTo): EvidenceReportRelatesToSurrogate =
      with(model) {
        EvidenceReportRelatesToSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code?.value?.getCode()
          _code = this@with.code?.toElement()
          target = this@with.target
        }
      }
  }
}

@Serializable
internal data class EvidenceReportSectionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var focus: CodeableConcept? = null,
  public var focusReference: Reference? = null,
  public var author: List<Reference?>? = null,
  public var text: Narrative? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var orderedBy: CodeableConcept? = null,
  public var entryClassifier: List<CodeableConcept?>? = null,
  public var entryReference: List<Reference?>? = null,
  public var entryQuantity: List<Quantity?>? = null,
  public var emptyReason: CodeableConcept? = null,
  public var section: List<EvidenceReport.Section?>? = null,
) {
  public fun toModel(): EvidenceReport.Section =
    EvidenceReport.Section().apply {
      id = this@EvidenceReportSectionSurrogate.id
      extension = this@EvidenceReportSectionSurrogate.extension
      modifierExtension = this@EvidenceReportSectionSurrogate.modifierExtension
      title =
        R5String.of(
          this@EvidenceReportSectionSurrogate.title,
          this@EvidenceReportSectionSurrogate._title,
        )
      focus = this@EvidenceReportSectionSurrogate.focus
      focusReference = this@EvidenceReportSectionSurrogate.focusReference
      author = this@EvidenceReportSectionSurrogate.author
      text = this@EvidenceReportSectionSurrogate.text
      mode =
        Enumeration.of(
          this@EvidenceReportSectionSurrogate.mode?.let {
            com.google.fhir.model.r5.EvidenceReport.SectionMode.fromCode(it)
          },
          this@EvidenceReportSectionSurrogate._mode,
        )
      orderedBy = this@EvidenceReportSectionSurrogate.orderedBy
      entryClassifier = this@EvidenceReportSectionSurrogate.entryClassifier
      entryReference = this@EvidenceReportSectionSurrogate.entryReference
      entryQuantity = this@EvidenceReportSectionSurrogate.entryQuantity
      emptyReason = this@EvidenceReportSectionSurrogate.emptyReason
      section = this@EvidenceReportSectionSurrogate.section
    }

  public companion object {
    public fun fromModel(model: EvidenceReport.Section): EvidenceReportSectionSurrogate =
      with(model) {
        EvidenceReportSectionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          focus = this@with.focus
          focusReference = this@with.focusReference
          author = this@with.author
          text = this@with.text
          mode = this@with.mode?.value?.getCode()
          _mode = this@with.mode?.toElement()
          orderedBy = this@with.orderedBy
          entryClassifier = this@with.entryClassifier
          entryReference = this@with.entryReference
          entryQuantity = this@with.entryQuantity
          emptyReason = this@with.emptyReason
          section = this@with.section
        }
      }
  }
}

@Serializable
internal data class EvidenceReportSurrogate(
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
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var useContext: List<UsageContext?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var relatedIdentifier: List<Identifier?>? = null,
  public var citeAsReference: Reference? = null,
  public var citeAsMarkdown: KotlinString? = null,
  public var _citeAsMarkdown: Element? = null,
  public var type: CodeableConcept? = null,
  public var note: List<Annotation?>? = null,
  public var relatedArtifact: List<RelatedArtifact?>? = null,
  public var subject: EvidenceReport.Subject? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: List<ContactDetail?>? = null,
  public var author: List<ContactDetail?>? = null,
  public var editor: List<ContactDetail?>? = null,
  public var reviewer: List<ContactDetail?>? = null,
  public var endorser: List<ContactDetail?>? = null,
  public var relatesTo: List<EvidenceReport.RelatesTo>? = null,
  public var section: List<EvidenceReport.Section>? = null,
) {
  public fun toModel(): EvidenceReport =
    EvidenceReport().apply {
      id = this@EvidenceReportSurrogate.id
      meta = this@EvidenceReportSurrogate.meta
      implicitRules =
        Uri.of(
          this@EvidenceReportSurrogate.implicitRules,
          this@EvidenceReportSurrogate._implicitRules,
        )
      language =
        Code.of(this@EvidenceReportSurrogate.language, this@EvidenceReportSurrogate._language)
      text = this@EvidenceReportSurrogate.text
      contained = this@EvidenceReportSurrogate.contained
      extension = this@EvidenceReportSurrogate.extension
      modifierExtension = this@EvidenceReportSurrogate.modifierExtension
      url = Uri.of(this@EvidenceReportSurrogate.url, this@EvidenceReportSurrogate._url)
      status =
        Enumeration.of(
          this@EvidenceReportSurrogate.status?.let {
            com.google.fhir.model.r5.PublicationStatus.fromCode(it)
          },
          this@EvidenceReportSurrogate._status,
        )
      useContext = this@EvidenceReportSurrogate.useContext
      identifier = this@EvidenceReportSurrogate.identifier
      relatedIdentifier = this@EvidenceReportSurrogate.relatedIdentifier
      citeAs =
        EvidenceReport.CiteAs?.from(
          this@EvidenceReportSurrogate.citeAsReference,
          Markdown.of(
            this@EvidenceReportSurrogate.citeAsMarkdown,
            this@EvidenceReportSurrogate._citeAsMarkdown,
          ),
        )
      type = this@EvidenceReportSurrogate.type
      note = this@EvidenceReportSurrogate.note
      relatedArtifact = this@EvidenceReportSurrogate.relatedArtifact
      subject = this@EvidenceReportSurrogate.subject
      publisher =
        R5String.of(this@EvidenceReportSurrogate.publisher, this@EvidenceReportSurrogate._publisher)
      contact = this@EvidenceReportSurrogate.contact
      author = this@EvidenceReportSurrogate.author
      editor = this@EvidenceReportSurrogate.editor
      reviewer = this@EvidenceReportSurrogate.reviewer
      endorser = this@EvidenceReportSurrogate.endorser
      relatesTo = this@EvidenceReportSurrogate.relatesTo
      section = this@EvidenceReportSurrogate.section
    }

  public companion object {
    public fun fromModel(model: EvidenceReport): EvidenceReportSurrogate =
      with(model) {
        EvidenceReportSurrogate().apply {
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
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          useContext = this@with.useContext
          identifier = this@with.identifier
          relatedIdentifier = this@with.relatedIdentifier
          citeAsReference = this@with.citeAs?.asReference()?.value
          citeAsMarkdown = this@with.citeAs?.asMarkdown()?.value?.value
          _citeAsMarkdown = this@with.citeAs?.asMarkdown()?.value?.toElement()
          type = this@with.type
          note = this@with.note
          relatedArtifact = this@with.relatedArtifact
          subject = this@with.subject
          publisher = this@with.publisher?.value
          _publisher = this@with.publisher?.toElement()
          contact = this@with.contact
          author = this@with.author
          editor = this@with.editor
          reviewer = this@with.reviewer
          endorser = this@with.endorser
          relatesTo = this@with.relatesTo
          section = this@with.section
        }
      }
  }
}
