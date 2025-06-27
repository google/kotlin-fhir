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
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.DetectedIssue
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DetectedIssueEvidenceSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: List<CodeableConcept?>? = null,
  public var detail: List<Reference?>? = null,
) {
  public fun toModel(): DetectedIssue.Evidence =
    DetectedIssue.Evidence().apply {
      id = this@DetectedIssueEvidenceSurrogate.id
      extension = this@DetectedIssueEvidenceSurrogate.extension
      modifierExtension = this@DetectedIssueEvidenceSurrogate.modifierExtension
      code = this@DetectedIssueEvidenceSurrogate.code
      detail = this@DetectedIssueEvidenceSurrogate.detail
    }

  public companion object {
    public fun fromModel(model: DetectedIssue.Evidence): DetectedIssueEvidenceSurrogate =
      with(model) {
        DetectedIssueEvidenceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          detail = this@with.detail
        }
      }
  }
}

@Serializable
internal data class DetectedIssueMitigationSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var action: CodeableConcept? = null,
  public var date: String? = null,
  public var _date: Element? = null,
  public var author: Reference? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): DetectedIssue.Mitigation =
    DetectedIssue.Mitigation().apply {
      id = this@DetectedIssueMitigationSurrogate.id
      extension = this@DetectedIssueMitigationSurrogate.extension
      modifierExtension = this@DetectedIssueMitigationSurrogate.modifierExtension
      action = this@DetectedIssueMitigationSurrogate.action
      date =
        DateTime.of(
          FhirDateTime.fromString(this@DetectedIssueMitigationSurrogate.date),
          this@DetectedIssueMitigationSurrogate._date,
        )
      author = this@DetectedIssueMitigationSurrogate.author
      note = this@DetectedIssueMitigationSurrogate.note
    }

  public companion object {
    public fun fromModel(model: DetectedIssue.Mitigation): DetectedIssueMitigationSurrogate =
      with(model) {
        DetectedIssueMitigationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          action = this@with.action
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          author = this@with.author
          note = this@with.note
        }
      }
  }
}

@Serializable
internal data class DetectedIssueSurrogate(
  public var id: String? = null,
  public var meta: Meta? = null,
  public var implicitRules: String? = null,
  public var _implicitRules: Element? = null,
  public var language: String? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var code: CodeableConcept? = null,
  public var severity: String? = null,
  public var _severity: Element? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var identifiedDateTime: String? = null,
  public var _identifiedDateTime: Element? = null,
  public var identifiedPeriod: Period? = null,
  public var author: Reference? = null,
  public var implicated: List<Reference?>? = null,
  public var evidence: List<DetectedIssue.Evidence>? = null,
  public var detail: String? = null,
  public var _detail: Element? = null,
  public var reference: String? = null,
  public var _reference: Element? = null,
  public var mitigation: List<DetectedIssue.Mitigation>? = null,
) {
  public fun toModel(): DetectedIssue =
    DetectedIssue().apply {
      id = this@DetectedIssueSurrogate.id
      meta = this@DetectedIssueSurrogate.meta
      implicitRules =
        Uri.of(
          this@DetectedIssueSurrogate.implicitRules,
          this@DetectedIssueSurrogate._implicitRules,
        )
      language =
        Code.of(this@DetectedIssueSurrogate.language, this@DetectedIssueSurrogate._language)
      text = this@DetectedIssueSurrogate.text
      contained = this@DetectedIssueSurrogate.contained
      extension = this@DetectedIssueSurrogate.extension
      modifierExtension = this@DetectedIssueSurrogate.modifierExtension
      identifier = this@DetectedIssueSurrogate.identifier
      status =
        Enumeration.of(
          this@DetectedIssueSurrogate.status?.let {
            com.google.fhir.model.r5.DetectedIssue.DetectedIssueStatus.fromCode(it)
          },
          this@DetectedIssueSurrogate._status,
        )
      category = this@DetectedIssueSurrogate.category
      code = this@DetectedIssueSurrogate.code
      severity =
        Enumeration.of(
          this@DetectedIssueSurrogate.severity?.let {
            com.google.fhir.model.r5.DetectedIssue.DetectedIssueSeverity.fromCode(it)
          },
          this@DetectedIssueSurrogate._severity,
        )
      subject = this@DetectedIssueSurrogate.subject
      encounter = this@DetectedIssueSurrogate.encounter
      identified =
        DetectedIssue.Identified?.from(
          DateTime.of(
            FhirDateTime.fromString(this@DetectedIssueSurrogate.identifiedDateTime),
            this@DetectedIssueSurrogate._identifiedDateTime,
          ),
          this@DetectedIssueSurrogate.identifiedPeriod,
        )
      author = this@DetectedIssueSurrogate.author
      implicated = this@DetectedIssueSurrogate.implicated
      evidence = this@DetectedIssueSurrogate.evidence
      detail = Markdown.of(this@DetectedIssueSurrogate.detail, this@DetectedIssueSurrogate._detail)
      reference =
        Uri.of(this@DetectedIssueSurrogate.reference, this@DetectedIssueSurrogate._reference)
      mitigation = this@DetectedIssueSurrogate.mitigation
    }

  public companion object {
    public fun fromModel(model: DetectedIssue): DetectedIssueSurrogate =
      with(model) {
        DetectedIssueSurrogate().apply {
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
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          category = this@with.category
          code = this@with.code
          severity = this@with.severity?.value?.getCode()
          _severity = this@with.severity?.toElement()
          subject = this@with.subject
          encounter = this@with.encounter
          identifiedDateTime = this@with.identified?.asDateTime()?.value?.value?.toString()
          _identifiedDateTime = this@with.identified?.asDateTime()?.value?.toElement()
          identifiedPeriod = this@with.identified?.asPeriod()?.value
          author = this@with.author
          implicated = this@with.implicated
          evidence = this@with.evidence
          detail = this@with.detail?.value
          _detail = this@with.detail?.toElement()
          reference = this@with.reference?.value
          _reference = this@with.reference?.toElement()
          mitigation = this@with.mitigation
        }
      }
  }
}
