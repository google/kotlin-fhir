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
import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.DiagnosticReport
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Instant
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DiagnosticReportSupportingInfoSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var reference: Reference,
) {
  public fun toModel(): DiagnosticReport.SupportingInfo =
    DiagnosticReport.SupportingInfo(
      id = this@DiagnosticReportSupportingInfoSurrogate.id,
      extension = this@DiagnosticReportSupportingInfoSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DiagnosticReportSupportingInfoSurrogate.modifierExtension ?: mutableListOf(),
      type = this@DiagnosticReportSupportingInfoSurrogate.type,
      reference = this@DiagnosticReportSupportingInfoSurrogate.reference,
    )

  public companion object {
    public fun fromModel(
      model: DiagnosticReport.SupportingInfo
    ): DiagnosticReportSupportingInfoSurrogate =
      with(model) {
        DiagnosticReportSupportingInfoSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          reference = this@with.reference,
        )
      }
  }
}

@Serializable
internal data class DiagnosticReportMediaSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
  public var link: Reference,
) {
  public fun toModel(): DiagnosticReport.Media =
    DiagnosticReport.Media(
      id = this@DiagnosticReportMediaSurrogate.id,
      extension = this@DiagnosticReportMediaSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DiagnosticReportMediaSurrogate.modifierExtension ?: mutableListOf(),
      comment =
        R5String.of(
          this@DiagnosticReportMediaSurrogate.comment,
          this@DiagnosticReportMediaSurrogate._comment,
        ),
      link = this@DiagnosticReportMediaSurrogate.link,
    )

  public companion object {
    public fun fromModel(model: DiagnosticReport.Media): DiagnosticReportMediaSurrogate =
      with(model) {
        DiagnosticReportMediaSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          comment = this@with.comment?.value,
          _comment = this@with.comment?.toElement(),
          link = this@with.link,
        )
      }
  }
}

@Serializable
internal data class DiagnosticReportEffectiveSurrogate(
  public var effectiveDateTime: KotlinString? = null,
  public var _effectiveDateTime: Element? = null,
  public var effectivePeriod: Period? = null,
) {
  public fun toModel(): DiagnosticReport.Effective =
    DiagnosticReport.Effective?.from(
      DateTime.of(
        FhirDateTime.fromString(this@DiagnosticReportEffectiveSurrogate.effectiveDateTime),
        this@DiagnosticReportEffectiveSurrogate._effectiveDateTime,
      ),
      this@DiagnosticReportEffectiveSurrogate.effectivePeriod,
    )!!

  public companion object {
    public fun fromModel(model: DiagnosticReport.Effective): DiagnosticReportEffectiveSurrogate =
      with(model) {
        DiagnosticReportEffectiveSurrogate(
          effectiveDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _effectiveDateTime = this@with.asDateTime()?.value?.toElement(),
          effectivePeriod = this@with.asPeriod()?.value,
        )
      }
  }
}

@Serializable
internal data class DiagnosticReportSurrogate(
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
  public var identifier: MutableList<Identifier>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var code: CodeableConcept,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var effective: DiagnosticReport.Effective? = null,
  public var issued: KotlinString? = null,
  public var _issued: Element? = null,
  public var performer: MutableList<Reference>? = null,
  public var resultsInterpreter: MutableList<Reference>? = null,
  public var specimen: MutableList<Reference>? = null,
  public var result: MutableList<Reference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var study: MutableList<Reference>? = null,
  public var supportingInfo: MutableList<DiagnosticReport.SupportingInfo>? = null,
  public var media: MutableList<DiagnosticReport.Media>? = null,
  public var composition: Reference? = null,
  public var conclusion: KotlinString? = null,
  public var _conclusion: Element? = null,
  public var conclusionCode: MutableList<CodeableConcept>? = null,
  public var presentedForm: MutableList<Attachment>? = null,
) {
  public fun toModel(): DiagnosticReport =
    DiagnosticReport(
      id = this@DiagnosticReportSurrogate.id,
      meta = this@DiagnosticReportSurrogate.meta,
      implicitRules =
        Uri.of(
          this@DiagnosticReportSurrogate.implicitRules,
          this@DiagnosticReportSurrogate._implicitRules,
        ),
      language =
        Code.of(this@DiagnosticReportSurrogate.language, this@DiagnosticReportSurrogate._language),
      text = this@DiagnosticReportSurrogate.text,
      contained = this@DiagnosticReportSurrogate.contained ?: mutableListOf(),
      extension = this@DiagnosticReportSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DiagnosticReportSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@DiagnosticReportSurrogate.identifier ?: mutableListOf(),
      basedOn = this@DiagnosticReportSurrogate.basedOn ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.DiagnosticReport.DiagnosticReportStatus.fromCode(
            this@DiagnosticReportSurrogate.status!!
          ),
          this@DiagnosticReportSurrogate._status,
        ),
      category = this@DiagnosticReportSurrogate.category ?: mutableListOf(),
      code = this@DiagnosticReportSurrogate.code,
      subject = this@DiagnosticReportSurrogate.subject,
      encounter = this@DiagnosticReportSurrogate.encounter,
      effective = this@DiagnosticReportSurrogate.effective,
      issued =
        Instant.of(
          FhirDateTime.fromString(this@DiagnosticReportSurrogate.issued),
          this@DiagnosticReportSurrogate._issued,
        ),
      performer = this@DiagnosticReportSurrogate.performer ?: mutableListOf(),
      resultsInterpreter = this@DiagnosticReportSurrogate.resultsInterpreter ?: mutableListOf(),
      specimen = this@DiagnosticReportSurrogate.specimen ?: mutableListOf(),
      result = this@DiagnosticReportSurrogate.result ?: mutableListOf(),
      note = this@DiagnosticReportSurrogate.note ?: mutableListOf(),
      study = this@DiagnosticReportSurrogate.study ?: mutableListOf(),
      supportingInfo = this@DiagnosticReportSurrogate.supportingInfo ?: mutableListOf(),
      media = this@DiagnosticReportSurrogate.media ?: mutableListOf(),
      composition = this@DiagnosticReportSurrogate.composition,
      conclusion =
        Markdown.of(
          this@DiagnosticReportSurrogate.conclusion,
          this@DiagnosticReportSurrogate._conclusion,
        ),
      conclusionCode = this@DiagnosticReportSurrogate.conclusionCode ?: mutableListOf(),
      presentedForm = this@DiagnosticReportSurrogate.presentedForm ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DiagnosticReport): DiagnosticReportSurrogate =
      with(model) {
        DiagnosticReportSurrogate(
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
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          code = this@with.code,
          subject = this@with.subject,
          encounter = this@with.encounter,
          effective = this@with.effective,
          issued = this@with.issued?.value?.toString(),
          _issued = this@with.issued?.toElement(),
          performer = this@with.performer.takeUnless { it.all { it == null } },
          resultsInterpreter = this@with.resultsInterpreter.takeUnless { it.all { it == null } },
          specimen = this@with.specimen.takeUnless { it.all { it == null } },
          result = this@with.result.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          study = this@with.study.takeUnless { it.all { it == null } },
          supportingInfo = this@with.supportingInfo.takeUnless { it.all { it == null } },
          media = this@with.media.takeUnless { it.all { it == null } },
          composition = this@with.composition,
          conclusion = this@with.conclusion?.value,
          _conclusion = this@with.conclusion?.toElement(),
          conclusionCode = this@with.conclusionCode.takeUnless { it.all { it == null } },
          presentedForm = this@with.presentedForm.takeUnless { it.all { it == null } },
        )
      }
  }
}
