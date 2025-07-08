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
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DiagnosticReportSupportingInfoSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var reference: Reference? = null,
) {
  public fun toModel(): DiagnosticReport.SupportingInfo =
    DiagnosticReport.SupportingInfo().apply {
      id = this@DiagnosticReportSupportingInfoSurrogate.id
      extension = this@DiagnosticReportSupportingInfoSurrogate.extension
      modifierExtension = this@DiagnosticReportSupportingInfoSurrogate.modifierExtension
      type = this@DiagnosticReportSupportingInfoSurrogate.type
      reference = this@DiagnosticReportSupportingInfoSurrogate.reference
    }

  public companion object {
    public fun fromModel(
      model: DiagnosticReport.SupportingInfo
    ): DiagnosticReportSupportingInfoSurrogate =
      with(model) {
        DiagnosticReportSupportingInfoSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          reference = this@with.reference
        }
      }
  }
}

@Serializable
internal data class DiagnosticReportMediaSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
  public var link: Reference? = null,
) {
  public fun toModel(): DiagnosticReport.Media =
    DiagnosticReport.Media().apply {
      id = this@DiagnosticReportMediaSurrogate.id
      extension = this@DiagnosticReportMediaSurrogate.extension
      modifierExtension = this@DiagnosticReportMediaSurrogate.modifierExtension
      comment =
        R5String.of(
          this@DiagnosticReportMediaSurrogate.comment,
          this@DiagnosticReportMediaSurrogate._comment,
        )
      link = this@DiagnosticReportMediaSurrogate.link
    }

  public companion object {
    public fun fromModel(model: DiagnosticReport.Media): DiagnosticReportMediaSurrogate =
      with(model) {
        DiagnosticReportMediaSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          comment = this@with.comment?.value
          _comment = this@with.comment?.toElement()
          link = this@with.link
        }
      }
  }
}

@Serializable
internal class DiagnosticReportEffectiveSurrogate {
  public var effectiveDateTime: KotlinString? = null

  public var _effectiveDateTime: Element? = null

  public var effectivePeriod: Period? = null

  public fun toModel(): DiagnosticReport.Effective =
    DiagnosticReport.Effective?.from(
      DateTime.of(
        FhirDateTime.fromString(this@DiagnosticReportEffectiveSurrogate.effectiveDateTime),
        this@DiagnosticReportEffectiveSurrogate._effectiveDateTime,
      ),
      this@DiagnosticReportEffectiveSurrogate.effectivePeriod,
    ) ?: DiagnosticReport.Effective.Null

  public companion object {
    public fun fromModel(model: DiagnosticReport.Effective): DiagnosticReportEffectiveSurrogate =
      with(model) {
        DiagnosticReportEffectiveSurrogate().apply {
          effectiveDateTime = this@with.asDateTime()?.value?.value?.toString()
          _effectiveDateTime = this@with.asDateTime()?.value?.toElement()
          effectivePeriod = this@with.asPeriod()?.value
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var basedOn: List<Reference?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var issued: KotlinString? = null,
  public var _issued: Element? = null,
  public var performer: List<Reference?>? = null,
  public var resultsInterpreter: List<Reference?>? = null,
  public var specimen: List<Reference?>? = null,
  public var result: List<Reference?>? = null,
  public var note: List<Annotation?>? = null,
  public var study: List<Reference?>? = null,
  public var supportingInfo: List<DiagnosticReport.SupportingInfo>? = null,
  public var media: List<DiagnosticReport.Media>? = null,
  public var composition: Reference? = null,
  public var conclusion: KotlinString? = null,
  public var _conclusion: Element? = null,
  public var conclusionCode: List<CodeableConcept?>? = null,
  public var presentedForm: List<Attachment?>? = null,
  public var effective: DiagnosticReport.Effective? = null,
) {
  public fun toModel(): DiagnosticReport =
    DiagnosticReport().apply {
      id = this@DiagnosticReportSurrogate.id
      meta = this@DiagnosticReportSurrogate.meta
      implicitRules =
        Uri.of(
          this@DiagnosticReportSurrogate.implicitRules,
          this@DiagnosticReportSurrogate._implicitRules,
        )
      language =
        Code.of(this@DiagnosticReportSurrogate.language, this@DiagnosticReportSurrogate._language)
      text = this@DiagnosticReportSurrogate.text
      contained = this@DiagnosticReportSurrogate.contained
      extension = this@DiagnosticReportSurrogate.extension
      modifierExtension = this@DiagnosticReportSurrogate.modifierExtension
      identifier = this@DiagnosticReportSurrogate.identifier
      basedOn = this@DiagnosticReportSurrogate.basedOn
      status =
        Enumeration.of(
          this@DiagnosticReportSurrogate.status?.let {
            com.google.fhir.model.r5.DiagnosticReport.DiagnosticReportStatus.fromCode(it)
          },
          this@DiagnosticReportSurrogate._status,
        )
      category = this@DiagnosticReportSurrogate.category
      code = this@DiagnosticReportSurrogate.code
      subject = this@DiagnosticReportSurrogate.subject
      encounter = this@DiagnosticReportSurrogate.encounter
      effective = this@DiagnosticReportSurrogate.effective
      issued =
        Instant.of(
          FhirDateTime.fromString(this@DiagnosticReportSurrogate.issued),
          this@DiagnosticReportSurrogate._issued,
        )
      performer = this@DiagnosticReportSurrogate.performer
      resultsInterpreter = this@DiagnosticReportSurrogate.resultsInterpreter
      specimen = this@DiagnosticReportSurrogate.specimen
      result = this@DiagnosticReportSurrogate.result
      note = this@DiagnosticReportSurrogate.note
      study = this@DiagnosticReportSurrogate.study
      supportingInfo = this@DiagnosticReportSurrogate.supportingInfo
      media = this@DiagnosticReportSurrogate.media
      composition = this@DiagnosticReportSurrogate.composition
      conclusion =
        Markdown.of(
          this@DiagnosticReportSurrogate.conclusion,
          this@DiagnosticReportSurrogate._conclusion,
        )
      conclusionCode = this@DiagnosticReportSurrogate.conclusionCode
      presentedForm = this@DiagnosticReportSurrogate.presentedForm
    }

  public companion object {
    public fun fromModel(model: DiagnosticReport): DiagnosticReportSurrogate =
      with(model) {
        DiagnosticReportSurrogate().apply {
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
          identifier = this@with.identifier
          basedOn = this@with.basedOn
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          category = this@with.category
          code = this@with.code
          subject = this@with.subject
          encounter = this@with.encounter
          effective = this@with.effective
          issued = this@with.issued?.value?.toString()
          _issued = this@with.issued?.toElement()
          performer = this@with.performer
          resultsInterpreter = this@with.resultsInterpreter
          specimen = this@with.specimen
          result = this@with.result
          note = this@with.note
          study = this@with.study
          supportingInfo = this@with.supportingInfo
          media = this@with.media
          composition = this@with.composition
          conclusion = this@with.conclusion?.value
          _conclusion = this@with.conclusion?.toElement()
          conclusionCode = this@with.conclusionCode
          presentedForm = this@with.presentedForm
        }
      }
  }
}
