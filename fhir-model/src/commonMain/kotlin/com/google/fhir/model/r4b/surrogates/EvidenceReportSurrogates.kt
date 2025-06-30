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

import com.google.fhir.model.r4b.Annotation
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.ContactDetail
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.EvidenceReport
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Markdown
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Range
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.RelatedArtifact
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.UsageContext
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal class EvidenceReportSubjectCharacteristicValueSurrogate {
  public var valueReference: Reference? = null

  public var valueCodeableConcept: CodeableConcept? = null

  public var valueBoolean: KotlinBoolean? = null

  public var _valueBoolean: Element? = null

  public var valueQuantity: Quantity? = null

  public var valueRange: Range? = null

  public fun toModel(): EvidenceReport.Subject.Characteristic.Value =
    EvidenceReport.Subject.Characteristic.Value?.from(
      this@EvidenceReportSubjectCharacteristicValueSurrogate.valueReference,
      this@EvidenceReportSubjectCharacteristicValueSurrogate.valueCodeableConcept,
      R4bBoolean.of(
        this@EvidenceReportSubjectCharacteristicValueSurrogate.valueBoolean,
        this@EvidenceReportSubjectCharacteristicValueSurrogate._valueBoolean,
      ),
      this@EvidenceReportSubjectCharacteristicValueSurrogate.valueQuantity,
      this@EvidenceReportSubjectCharacteristicValueSurrogate.valueRange,
    ) ?: EvidenceReport.Subject.Characteristic.Value.Null

  public companion object {
    public fun fromModel(
      model: EvidenceReport.Subject.Characteristic.Value
    ): EvidenceReportSubjectCharacteristicValueSurrogate =
      with(model) {
        EvidenceReportSubjectCharacteristicValueSurrogate().apply {
          valueReference = this@with.asReference()?.value
          valueCodeableConcept = this@with.asCodeableConcept()?.value
          valueBoolean = this@with.asBoolean()?.value?.value
          _valueBoolean = this@with.asBoolean()?.value?.toElement()
          valueQuantity = this@with.asQuantity()?.value
          valueRange = this@with.asRange()?.value
        }
      }
  }
}

@Serializable
internal data class EvidenceReportSubjectCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var exclude: KotlinBoolean? = null,
  public var _exclude: Element? = null,
  public var period: Period? = null,
  public var `value`: EvidenceReport.Subject.Characteristic.Value? = null,
) {
  public fun toModel(): EvidenceReport.Subject.Characteristic =
    EvidenceReport.Subject.Characteristic().apply {
      id = this@EvidenceReportSubjectCharacteristicSurrogate.id
      extension = this@EvidenceReportSubjectCharacteristicSurrogate.extension
      modifierExtension = this@EvidenceReportSubjectCharacteristicSurrogate.modifierExtension
      code = this@EvidenceReportSubjectCharacteristicSurrogate.code
      `value` = this@EvidenceReportSubjectCharacteristicSurrogate.`value`
      exclude =
        R4bBoolean.of(
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
          `value` = this@with.`value`
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
internal class EvidenceReportRelatesToTargetSurrogate {
  public var targetIdentifier: Identifier? = null

  public var targetReference: Reference? = null

  public fun toModel(): EvidenceReport.RelatesTo.Target =
    EvidenceReport.RelatesTo.Target?.from(
      this@EvidenceReportRelatesToTargetSurrogate.targetIdentifier,
      this@EvidenceReportRelatesToTargetSurrogate.targetReference,
    ) ?: EvidenceReport.RelatesTo.Target.Null

  public companion object {
    public fun fromModel(
      model: EvidenceReport.RelatesTo.Target
    ): EvidenceReportRelatesToTargetSurrogate =
      with(model) {
        EvidenceReportRelatesToTargetSurrogate().apply {
          targetIdentifier = this@with.asIdentifier()?.value
          targetReference = this@with.asReference()?.value
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
            com.google.fhir.model.r4b.EvidenceReport.ReportRelationshipType.fromCode(it)
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
        R4bString.of(
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
            com.google.fhir.model.r4b.EvidenceReport.SectionMode.fromCode(it)
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
internal class EvidenceReportCiteAsSurrogate {
  public var citeAsReference: Reference? = null

  public var citeAsMarkdown: KotlinString? = null

  public var _citeAsMarkdown: Element? = null

  public fun toModel(): EvidenceReport.CiteAs =
    EvidenceReport.CiteAs?.from(
      this@EvidenceReportCiteAsSurrogate.citeAsReference,
      Markdown.of(
        this@EvidenceReportCiteAsSurrogate.citeAsMarkdown,
        this@EvidenceReportCiteAsSurrogate._citeAsMarkdown,
      ),
    ) ?: EvidenceReport.CiteAs.Null

  public companion object {
    public fun fromModel(model: EvidenceReport.CiteAs): EvidenceReportCiteAsSurrogate =
      with(model) {
        EvidenceReportCiteAsSurrogate().apply {
          citeAsReference = this@with.asReference()?.value
          citeAsMarkdown = this@with.asMarkdown()?.value?.value
          _citeAsMarkdown = this@with.asMarkdown()?.value?.toElement()
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
  public var citeAs: EvidenceReport.CiteAs? = null,
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
            com.google.fhir.model.r4b.PublicationStatus.fromCode(it)
          },
          this@EvidenceReportSurrogate._status,
        )
      useContext = this@EvidenceReportSurrogate.useContext
      identifier = this@EvidenceReportSurrogate.identifier
      relatedIdentifier = this@EvidenceReportSurrogate.relatedIdentifier
      citeAs = this@EvidenceReportSurrogate.citeAs
      type = this@EvidenceReportSurrogate.type
      note = this@EvidenceReportSurrogate.note
      relatedArtifact = this@EvidenceReportSurrogate.relatedArtifact
      subject = this@EvidenceReportSurrogate.subject
      publisher =
        R4bString.of(
          this@EvidenceReportSurrogate.publisher,
          this@EvidenceReportSurrogate._publisher,
        )
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
          citeAs = this@with.citeAs
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
