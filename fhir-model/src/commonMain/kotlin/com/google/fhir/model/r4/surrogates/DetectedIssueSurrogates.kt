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

import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.DetectedIssue
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DetectedIssueEvidenceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: MutableList<CodeableConcept>? = null,
  public var detail: MutableList<Reference>? = null,
) {
  public fun toModel(): DetectedIssue.Evidence =
    DetectedIssue.Evidence(
      id = this@DetectedIssueEvidenceSurrogate.id,
      extension = this@DetectedIssueEvidenceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DetectedIssueEvidenceSurrogate.modifierExtension ?: mutableListOf(),
      code = this@DetectedIssueEvidenceSurrogate.code ?: mutableListOf(),
      detail = this@DetectedIssueEvidenceSurrogate.detail ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DetectedIssue.Evidence): DetectedIssueEvidenceSurrogate =
      with(model) {
        DetectedIssueEvidenceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.takeUnless { it.all { it == null } },
          detail = this@with.detail.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class DetectedIssueMitigationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var action: CodeableConcept,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var author: Reference? = null,
) {
  public fun toModel(): DetectedIssue.Mitigation =
    DetectedIssue.Mitigation(
      id = this@DetectedIssueMitigationSurrogate.id,
      extension = this@DetectedIssueMitigationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@DetectedIssueMitigationSurrogate.modifierExtension ?: mutableListOf(),
      action = this@DetectedIssueMitigationSurrogate.action,
      date =
        DateTime.of(
          FhirDateTime.fromString(this@DetectedIssueMitigationSurrogate.date),
          this@DetectedIssueMitigationSurrogate._date,
        ),
      author = this@DetectedIssueMitigationSurrogate.author,
    )

  public companion object {
    public fun fromModel(model: DetectedIssue.Mitigation): DetectedIssueMitigationSurrogate =
      with(model) {
        DetectedIssueMitigationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          action = this@with.action,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          author = this@with.author,
        )
      }
  }
}

@Serializable
internal data class DetectedIssueIdentifiedSurrogate(
  public var identifiedDateTime: KotlinString? = null,
  public var _identifiedDateTime: Element? = null,
  public var identifiedPeriod: Period? = null,
) {
  public fun toModel(): DetectedIssue.Identified =
    DetectedIssue.Identified.from(
      DateTime.of(
        FhirDateTime.fromString(this@DetectedIssueIdentifiedSurrogate.identifiedDateTime),
        this@DetectedIssueIdentifiedSurrogate._identifiedDateTime,
      ),
      this@DetectedIssueIdentifiedSurrogate.identifiedPeriod,
    )!!

  public companion object {
    public fun fromModel(model: DetectedIssue.Identified): DetectedIssueIdentifiedSurrogate =
      with(model) {
        DetectedIssueIdentifiedSurrogate(
          identifiedDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _identifiedDateTime = this@with.asDateTime()?.value?.toElement(),
          identifiedPeriod = this@with.asPeriod()?.value,
        )
      }
  }
}

@Serializable
internal data class DetectedIssueSurrogate(
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
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var code: CodeableConcept? = null,
  public var severity: KotlinString? = null,
  public var _severity: Element? = null,
  public var patient: Reference? = null,
  public var identified: DetectedIssue.Identified? = null,
  public var author: Reference? = null,
  public var implicated: MutableList<Reference>? = null,
  public var evidence: MutableList<DetectedIssue.Evidence>? = null,
  public var detail: KotlinString? = null,
  public var _detail: Element? = null,
  public var reference: KotlinString? = null,
  public var _reference: Element? = null,
  public var mitigation: MutableList<DetectedIssue.Mitigation>? = null,
) {
  public fun toModel(): DetectedIssue =
    DetectedIssue(
      id = this@DetectedIssueSurrogate.id,
      meta = this@DetectedIssueSurrogate.meta,
      implicitRules =
        Uri.of(
          this@DetectedIssueSurrogate.implicitRules,
          this@DetectedIssueSurrogate._implicitRules,
        ),
      language =
        Code.of(this@DetectedIssueSurrogate.language, this@DetectedIssueSurrogate._language),
      text = this@DetectedIssueSurrogate.text,
      contained = this@DetectedIssueSurrogate.contained ?: mutableListOf(),
      extension = this@DetectedIssueSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@DetectedIssueSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@DetectedIssueSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.DetectedIssue.ObservationStatus.fromCode(
            this@DetectedIssueSurrogate.status!!
          ),
          this@DetectedIssueSurrogate._status,
        ),
      code = this@DetectedIssueSurrogate.code,
      severity =
        this@DetectedIssueSurrogate.severity?.let {
          Enumeration.of(
            com.google.fhir.model.r4.DetectedIssue.DetectedIssueSeverity.fromCode(it!!),
            this@DetectedIssueSurrogate._severity,
          )
        },
      patient = this@DetectedIssueSurrogate.patient,
      identified = this@DetectedIssueSurrogate.identified,
      author = this@DetectedIssueSurrogate.author,
      implicated = this@DetectedIssueSurrogate.implicated ?: mutableListOf(),
      evidence = this@DetectedIssueSurrogate.evidence ?: mutableListOf(),
      detail = R4String.of(this@DetectedIssueSurrogate.detail, this@DetectedIssueSurrogate._detail),
      reference =
        Uri.of(this@DetectedIssueSurrogate.reference, this@DetectedIssueSurrogate._reference),
      mitigation = this@DetectedIssueSurrogate.mitigation ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: DetectedIssue): DetectedIssueSurrogate =
      with(model) {
        DetectedIssueSurrogate(
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
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          code = this@with.code,
          severity = this@with.severity?.value?.getCode(),
          _severity = this@with.severity?.toElement(),
          patient = this@with.patient,
          identified = this@with.identified,
          author = this@with.author,
          implicated = this@with.implicated.takeUnless { it.all { it == null } },
          evidence = this@with.evidence.takeUnless { it.all { it == null } },
          detail = this@with.detail?.value,
          _detail = this@with.detail?.toElement(),
          reference = this@with.reference?.value,
          _reference = this@with.reference?.toElement(),
          mitigation = this@with.mitigation.takeUnless { it.all { it == null } },
        )
      }
  }
}
