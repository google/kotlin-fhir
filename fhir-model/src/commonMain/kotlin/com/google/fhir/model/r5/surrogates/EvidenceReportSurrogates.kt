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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class EvidenceReportSubjectCharacteristicValueSurrogate(
  public var valueReference: Reference? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
) {
  public fun toModel(): EvidenceReport.Subject.Characteristic.Value =
    EvidenceReport.Subject.Characteristic.Value.from(
      this@EvidenceReportSubjectCharacteristicValueSurrogate.valueReference,
      this@EvidenceReportSubjectCharacteristicValueSurrogate.valueCodeableConcept,
      R5Boolean.of(
        this@EvidenceReportSubjectCharacteristicValueSurrogate.valueBoolean,
        this@EvidenceReportSubjectCharacteristicValueSurrogate._valueBoolean,
      ),
      this@EvidenceReportSubjectCharacteristicValueSurrogate.valueQuantity,
      this@EvidenceReportSubjectCharacteristicValueSurrogate.valueRange,
    )!!

  public companion object {
    public fun fromModel(
      model: EvidenceReport.Subject.Characteristic.Value
    ): EvidenceReportSubjectCharacteristicValueSurrogate =
      with(model) {
        EvidenceReportSubjectCharacteristicValueSurrogate(
          valueReference = this@with.asReference()?.value,
          valueCodeableConcept = this@with.asCodeableConcept()?.value,
          valueBoolean = this@with.asBoolean()?.value?.value,
          _valueBoolean = this@with.asBoolean()?.value?.toElement(),
          valueQuantity = this@with.asQuantity()?.value,
          valueRange = this@with.asRange()?.value,
        )
      }
  }
}

@Serializable
internal data class EvidenceReportSubjectCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept,
  public var exclude: KotlinBoolean? = null,
  public var _exclude: Element? = null,
  public var period: Period? = null,
  public var `value`: EvidenceReport.Subject.Characteristic.Value,
) {
  public fun toModel(): EvidenceReport.Subject.Characteristic =
    EvidenceReport.Subject.Characteristic(
      id = this@EvidenceReportSubjectCharacteristicSurrogate.id,
      extension = this@EvidenceReportSubjectCharacteristicSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@EvidenceReportSubjectCharacteristicSurrogate.modifierExtension ?: mutableListOf(),
      code = this@EvidenceReportSubjectCharacteristicSurrogate.code,
      `value` = this@EvidenceReportSubjectCharacteristicSurrogate.`value`,
      exclude =
        R5Boolean.of(
          this@EvidenceReportSubjectCharacteristicSurrogate.exclude,
          this@EvidenceReportSubjectCharacteristicSurrogate._exclude,
        ),
      period = this@EvidenceReportSubjectCharacteristicSurrogate.period,
    )

  public companion object {
    public fun fromModel(
      model: EvidenceReport.Subject.Characteristic
    ): EvidenceReportSubjectCharacteristicSurrogate =
      with(model) {
        EvidenceReportSubjectCharacteristicSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          `value` = this@with.`value`,
          exclude = this@with.exclude?.value,
          _exclude = this@with.exclude?.toElement(),
          period = this@with.period,
        )
      }
  }
}

@Serializable
internal data class EvidenceReportSubjectSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var characteristic: MutableList<EvidenceReport.Subject.Characteristic>? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): EvidenceReport.Subject =
    EvidenceReport.Subject(
      id = this@EvidenceReportSubjectSurrogate.id,
      extension = this@EvidenceReportSubjectSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EvidenceReportSubjectSurrogate.modifierExtension ?: mutableListOf(),
      characteristic = this@EvidenceReportSubjectSurrogate.characteristic ?: mutableListOf(),
      note = this@EvidenceReportSubjectSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: EvidenceReport.Subject): EvidenceReportSubjectSurrogate =
      with(model) {
        EvidenceReportSubjectSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          characteristic = this@with.characteristic.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class EvidenceReportRelatesToTargetSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: Identifier? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
  public var resource: Reference? = null,
) {
  public fun toModel(): EvidenceReport.RelatesTo.Target =
    EvidenceReport.RelatesTo.Target(
      id = this@EvidenceReportRelatesToTargetSurrogate.id,
      extension = this@EvidenceReportRelatesToTargetSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@EvidenceReportRelatesToTargetSurrogate.modifierExtension ?: mutableListOf(),
      url =
        Uri.of(
          this@EvidenceReportRelatesToTargetSurrogate.url,
          this@EvidenceReportRelatesToTargetSurrogate._url,
        ),
      identifier = this@EvidenceReportRelatesToTargetSurrogate.identifier,
      display =
        Markdown.of(
          this@EvidenceReportRelatesToTargetSurrogate.display,
          this@EvidenceReportRelatesToTargetSurrogate._display,
        ),
      resource = this@EvidenceReportRelatesToTargetSurrogate.resource,
    )

  public companion object {
    public fun fromModel(
      model: EvidenceReport.RelatesTo.Target
    ): EvidenceReportRelatesToTargetSurrogate =
      with(model) {
        EvidenceReportRelatesToTargetSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
          identifier = this@with.identifier,
          display = this@with.display?.value,
          _display = this@with.display?.toElement(),
          resource = this@with.resource,
        )
      }
  }
}

@Serializable
internal data class EvidenceReportRelatesToSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var target: EvidenceReport.RelatesTo.Target,
) {
  public fun toModel(): EvidenceReport.RelatesTo =
    EvidenceReport.RelatesTo(
      id = this@EvidenceReportRelatesToSurrogate.id,
      extension = this@EvidenceReportRelatesToSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@EvidenceReportRelatesToSurrogate.modifierExtension ?: mutableListOf(),
      code =
        Enumeration.of(
          com.google.fhir.model.r5.EvidenceReport.ReportRelationshipType.fromCode(
            this@EvidenceReportRelatesToSurrogate.code!!
          ),
          this@EvidenceReportRelatesToSurrogate._code,
        ),
      target = this@EvidenceReportRelatesToSurrogate.target,
    )

  public companion object {
    public fun fromModel(model: EvidenceReport.RelatesTo): EvidenceReportRelatesToSurrogate =
      with(model) {
        EvidenceReportRelatesToSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value?.getCode(),
          _code = this@with.code.toElement(),
          target = this@with.target,
        )
      }
  }
}

@Serializable
internal data class EvidenceReportSectionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var focus: CodeableConcept? = null,
  public var focusReference: Reference? = null,
  public var author: MutableList<Reference>? = null,
  public var text: Narrative? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var orderedBy: CodeableConcept? = null,
  public var entryClassifier: MutableList<CodeableConcept>? = null,
  public var entryReference: MutableList<Reference>? = null,
  public var entryQuantity: MutableList<Quantity>? = null,
  public var emptyReason: CodeableConcept? = null,
  public var section: MutableList<EvidenceReport.Section>? = null,
) {
  public fun toModel(): EvidenceReport.Section =
    EvidenceReport.Section(
      id = this@EvidenceReportSectionSurrogate.id,
      extension = this@EvidenceReportSectionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EvidenceReportSectionSurrogate.modifierExtension ?: mutableListOf(),
      title =
        R5String.of(
          this@EvidenceReportSectionSurrogate.title,
          this@EvidenceReportSectionSurrogate._title,
        ),
      focus = this@EvidenceReportSectionSurrogate.focus,
      focusReference = this@EvidenceReportSectionSurrogate.focusReference,
      author = this@EvidenceReportSectionSurrogate.author ?: mutableListOf(),
      text = this@EvidenceReportSectionSurrogate.text,
      mode =
        this@EvidenceReportSectionSurrogate.mode?.let {
          Enumeration.of(
            com.google.fhir.model.r5.EvidenceReport.SectionMode.fromCode(it!!),
            this@EvidenceReportSectionSurrogate._mode,
          )
        },
      orderedBy = this@EvidenceReportSectionSurrogate.orderedBy,
      entryClassifier = this@EvidenceReportSectionSurrogate.entryClassifier ?: mutableListOf(),
      entryReference = this@EvidenceReportSectionSurrogate.entryReference ?: mutableListOf(),
      entryQuantity = this@EvidenceReportSectionSurrogate.entryQuantity ?: mutableListOf(),
      emptyReason = this@EvidenceReportSectionSurrogate.emptyReason,
      section = this@EvidenceReportSectionSurrogate.section ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: EvidenceReport.Section): EvidenceReportSectionSurrogate =
      with(model) {
        EvidenceReportSectionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          focus = this@with.focus,
          focusReference = this@with.focusReference,
          author = this@with.author.takeUnless { it.all { it == null } },
          text = this@with.text,
          mode = this@with.mode?.value?.getCode(),
          _mode = this@with.mode?.toElement(),
          orderedBy = this@with.orderedBy,
          entryClassifier = this@with.entryClassifier.takeUnless { it.all { it == null } },
          entryReference = this@with.entryReference.takeUnless { it.all { it == null } },
          entryQuantity = this@with.entryQuantity.takeUnless { it.all { it == null } },
          emptyReason = this@with.emptyReason,
          section = this@with.section.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class EvidenceReportCiteAsSurrogate(
  public var citeAsReference: Reference? = null,
  public var citeAsMarkdown: KotlinString? = null,
  public var _citeAsMarkdown: Element? = null,
) {
  public fun toModel(): EvidenceReport.CiteAs? =
    EvidenceReport.CiteAs?.from(
      this@EvidenceReportCiteAsSurrogate.citeAsReference,
      Markdown.of(
        this@EvidenceReportCiteAsSurrogate.citeAsMarkdown,
        this@EvidenceReportCiteAsSurrogate._citeAsMarkdown,
      ),
    )

  public companion object {
    public fun fromModel(model: EvidenceReport.CiteAs): EvidenceReportCiteAsSurrogate =
      with(model) {
        EvidenceReportCiteAsSurrogate(
          citeAsReference = this@with.asReference()?.value,
          citeAsMarkdown = this@with.asMarkdown()?.value?.value,
          _citeAsMarkdown = this@with.asMarkdown()?.value?.toElement(),
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var useContext: MutableList<UsageContext>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var relatedIdentifier: MutableList<Identifier>? = null,
  public var type: CodeableConcept? = null,
  public var note: MutableList<Annotation>? = null,
  public var relatedArtifact: MutableList<RelatedArtifact>? = null,
  public var subject: EvidenceReport.Subject,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: MutableList<ContactDetail>? = null,
  public var author: MutableList<ContactDetail>? = null,
  public var editor: MutableList<ContactDetail>? = null,
  public var reviewer: MutableList<ContactDetail>? = null,
  public var endorser: MutableList<ContactDetail>? = null,
  public var relatesTo: MutableList<EvidenceReport.RelatesTo>? = null,
  public var section: MutableList<EvidenceReport.Section>? = null,
  public var citeAs: EvidenceReport.CiteAs? = null,
) {
  public fun toModel(): EvidenceReport =
    EvidenceReport(
      id = this@EvidenceReportSurrogate.id,
      meta = this@EvidenceReportSurrogate.meta,
      implicitRules =
        Uri.of(
          this@EvidenceReportSurrogate.implicitRules,
          this@EvidenceReportSurrogate._implicitRules,
        ),
      language =
        Code.of(this@EvidenceReportSurrogate.language, this@EvidenceReportSurrogate._language),
      text = this@EvidenceReportSurrogate.text,
      contained = this@EvidenceReportSurrogate.contained ?: mutableListOf(),
      extension = this@EvidenceReportSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EvidenceReportSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@EvidenceReportSurrogate.url, this@EvidenceReportSurrogate._url),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.PublicationStatus.fromCode(
            this@EvidenceReportSurrogate.status!!
          ),
          this@EvidenceReportSurrogate._status,
        ),
      useContext = this@EvidenceReportSurrogate.useContext ?: mutableListOf(),
      identifier = this@EvidenceReportSurrogate.identifier ?: mutableListOf(),
      relatedIdentifier = this@EvidenceReportSurrogate.relatedIdentifier ?: mutableListOf(),
      citeAs = this@EvidenceReportSurrogate.citeAs,
      type = this@EvidenceReportSurrogate.type,
      note = this@EvidenceReportSurrogate.note ?: mutableListOf(),
      relatedArtifact = this@EvidenceReportSurrogate.relatedArtifact ?: mutableListOf(),
      subject = this@EvidenceReportSurrogate.subject,
      publisher =
        R5String.of(
          this@EvidenceReportSurrogate.publisher,
          this@EvidenceReportSurrogate._publisher,
        ),
      contact = this@EvidenceReportSurrogate.contact ?: mutableListOf(),
      author = this@EvidenceReportSurrogate.author ?: mutableListOf(),
      editor = this@EvidenceReportSurrogate.editor ?: mutableListOf(),
      reviewer = this@EvidenceReportSurrogate.reviewer ?: mutableListOf(),
      endorser = this@EvidenceReportSurrogate.endorser ?: mutableListOf(),
      relatesTo = this@EvidenceReportSurrogate.relatesTo ?: mutableListOf(),
      section = this@EvidenceReportSurrogate.section ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: EvidenceReport): EvidenceReportSurrogate =
      with(model) {
        EvidenceReportSurrogate(
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
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          relatedIdentifier = this@with.relatedIdentifier.takeUnless { it.all { it == null } },
          citeAs = this@with.citeAs,
          type = this@with.type,
          note = this@with.note.takeUnless { it.all { it == null } },
          relatedArtifact = this@with.relatedArtifact.takeUnless { it.all { it == null } },
          subject = this@with.subject,
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeUnless { it.all { it == null } },
          author = this@with.author.takeUnless { it.all { it == null } },
          editor = this@with.editor.takeUnless { it.all { it == null } },
          reviewer = this@with.reviewer.takeUnless { it.all { it == null } },
          endorser = this@with.endorser.takeUnless { it.all { it == null } },
          relatesTo = this@with.relatesTo.takeUnless { it.all { it == null } },
          section = this@with.section.takeUnless { it.all { it == null } },
        )
      }
  }
}
