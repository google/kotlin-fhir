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

import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Id
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.ResearchSubject
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ResearchSubjectProgressSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var subjectState: CodeableConcept? = null,
  public var milestone: CodeableConcept? = null,
  public var reason: CodeableConcept? = null,
  public var startDate: String? = null,
  public var _startDate: Element? = null,
  public var endDate: String? = null,
  public var _endDate: Element? = null,
) {
  public fun toModel(): ResearchSubject.Progress =
    ResearchSubject.Progress(
      id = this@ResearchSubjectProgressSurrogate.id,
      extension = this@ResearchSubjectProgressSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ResearchSubjectProgressSurrogate.modifierExtension ?: mutableListOf(),
      type = this@ResearchSubjectProgressSurrogate.type,
      subjectState = this@ResearchSubjectProgressSurrogate.subjectState,
      milestone = this@ResearchSubjectProgressSurrogate.milestone,
      reason = this@ResearchSubjectProgressSurrogate.reason,
      startDate =
        DateTime.of(
          FhirDateTime.fromString(this@ResearchSubjectProgressSurrogate.startDate),
          this@ResearchSubjectProgressSurrogate._startDate,
        ),
      endDate =
        DateTime.of(
          FhirDateTime.fromString(this@ResearchSubjectProgressSurrogate.endDate),
          this@ResearchSubjectProgressSurrogate._endDate,
        ),
    )

  public companion object {
    public fun fromModel(model: ResearchSubject.Progress): ResearchSubjectProgressSurrogate =
      with(model) {
        ResearchSubjectProgressSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          subjectState = this@with.subjectState,
          milestone = this@with.milestone,
          reason = this@with.reason,
          startDate = this@with.startDate?.value?.toString(),
          _startDate = this@with.startDate?.toElement(),
          endDate = this@with.endDate?.value?.toString(),
          _endDate = this@with.endDate?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ResearchSubjectSurrogate(
  public var id: String? = null,
  public var meta: Meta? = null,
  public var implicitRules: String? = null,
  public var _implicitRules: Element? = null,
  public var language: String? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var progress: MutableList<ResearchSubject.Progress>? = null,
  public var period: Period? = null,
  public var study: Reference,
  public var subject: Reference,
  public var assignedComparisonGroup: String? = null,
  public var _assignedComparisonGroup: Element? = null,
  public var actualComparisonGroup: String? = null,
  public var _actualComparisonGroup: Element? = null,
  public var consent: MutableList<Reference>? = null,
) {
  public fun toModel(): ResearchSubject =
    ResearchSubject(
      id = this@ResearchSubjectSurrogate.id,
      meta = this@ResearchSubjectSurrogate.meta,
      implicitRules =
        Uri.of(
          this@ResearchSubjectSurrogate.implicitRules,
          this@ResearchSubjectSurrogate._implicitRules,
        ),
      language =
        Code.of(this@ResearchSubjectSurrogate.language, this@ResearchSubjectSurrogate._language),
      text = this@ResearchSubjectSurrogate.text,
      contained = this@ResearchSubjectSurrogate.contained ?: mutableListOf(),
      extension = this@ResearchSubjectSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ResearchSubjectSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ResearchSubjectSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.PublicationStatus.fromCode(
            this@ResearchSubjectSurrogate.status!!
          ),
          this@ResearchSubjectSurrogate._status,
        ),
      progress = this@ResearchSubjectSurrogate.progress ?: mutableListOf(),
      period = this@ResearchSubjectSurrogate.period,
      study = this@ResearchSubjectSurrogate.study,
      subject = this@ResearchSubjectSurrogate.subject,
      assignedComparisonGroup =
        Id.of(
          this@ResearchSubjectSurrogate.assignedComparisonGroup,
          this@ResearchSubjectSurrogate._assignedComparisonGroup,
        ),
      actualComparisonGroup =
        Id.of(
          this@ResearchSubjectSurrogate.actualComparisonGroup,
          this@ResearchSubjectSurrogate._actualComparisonGroup,
        ),
      consent = this@ResearchSubjectSurrogate.consent ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ResearchSubject): ResearchSubjectSurrogate =
      with(model) {
        ResearchSubjectSurrogate(
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
          progress = this@with.progress.takeUnless { it.all { it == null } },
          period = this@with.period,
          study = this@with.study,
          subject = this@with.subject,
          assignedComparisonGroup = this@with.assignedComparisonGroup?.value,
          _assignedComparisonGroup = this@with.assignedComparisonGroup?.toElement(),
          actualComparisonGroup = this@with.actualComparisonGroup?.value,
          _actualComparisonGroup = this@with.actualComparisonGroup?.toElement(),
          consent = this@with.consent.takeUnless { it.all { it == null } },
        )
      }
  }
}
