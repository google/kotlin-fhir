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
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Dosage
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.MedicationStatement
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Timing
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicationStatementAdherenceSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var reason: CodeableConcept? = null,
) {
  public fun toModel(): MedicationStatement.Adherence =
    MedicationStatement.Adherence().apply {
      id = this@MedicationStatementAdherenceSurrogate.id
      extension = this@MedicationStatementAdherenceSurrogate.extension
      modifierExtension = this@MedicationStatementAdherenceSurrogate.modifierExtension
      code = this@MedicationStatementAdherenceSurrogate.code
      reason = this@MedicationStatementAdherenceSurrogate.reason
    }

  public companion object {
    public fun fromModel(
      model: MedicationStatement.Adherence
    ): MedicationStatementAdherenceSurrogate =
      with(model) {
        MedicationStatementAdherenceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          reason = this@with.reason
        }
      }
  }
}

@Serializable
internal class MedicationStatementEffectiveSurrogate {
  public var effectiveDateTime: String? = null

  public var _effectiveDateTime: Element? = null

  public var effectivePeriod: Period? = null

  public var effectiveTiming: Timing? = null

  public fun toModel(): MedicationStatement.Effective =
    MedicationStatement.Effective?.from(
      DateTime.of(
        FhirDateTime.fromString(this@MedicationStatementEffectiveSurrogate.effectiveDateTime),
        this@MedicationStatementEffectiveSurrogate._effectiveDateTime,
      ),
      this@MedicationStatementEffectiveSurrogate.effectivePeriod,
      this@MedicationStatementEffectiveSurrogate.effectiveTiming,
    ) ?: MedicationStatement.Effective.Null

  public companion object {
    public fun fromModel(
      model: MedicationStatement.Effective
    ): MedicationStatementEffectiveSurrogate =
      with(model) {
        MedicationStatementEffectiveSurrogate().apply {
          effectiveDateTime = this@with.asDateTime()?.value?.value?.toString()
          _effectiveDateTime = this@with.asDateTime()?.value?.toElement()
          effectivePeriod = this@with.asPeriod()?.value
          effectiveTiming = this@with.asTiming()?.value
        }
      }
  }
}

@Serializable
internal data class MedicationStatementSurrogate(
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
  public var partOf: List<Reference?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var medication: CodeableReference? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var dateAsserted: String? = null,
  public var _dateAsserted: Element? = null,
  public var informationSource: List<Reference?>? = null,
  public var derivedFrom: List<Reference?>? = null,
  public var reason: List<CodeableReference?>? = null,
  public var note: List<Annotation?>? = null,
  public var relatedClinicalInformation: List<Reference?>? = null,
  public var renderedDosageInstruction: String? = null,
  public var _renderedDosageInstruction: Element? = null,
  public var dosage: List<Dosage?>? = null,
  public var adherence: MedicationStatement.Adherence? = null,
  public var effective: MedicationStatement.Effective? = null,
) {
  public fun toModel(): MedicationStatement =
    MedicationStatement().apply {
      id = this@MedicationStatementSurrogate.id
      meta = this@MedicationStatementSurrogate.meta
      implicitRules =
        Uri.of(
          this@MedicationStatementSurrogate.implicitRules,
          this@MedicationStatementSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@MedicationStatementSurrogate.language,
          this@MedicationStatementSurrogate._language,
        )
      text = this@MedicationStatementSurrogate.text
      contained = this@MedicationStatementSurrogate.contained
      extension = this@MedicationStatementSurrogate.extension
      modifierExtension = this@MedicationStatementSurrogate.modifierExtension
      identifier = this@MedicationStatementSurrogate.identifier
      partOf = this@MedicationStatementSurrogate.partOf
      status =
        Enumeration.of(
          this@MedicationStatementSurrogate.status?.let {
            com.google.fhir.model.r5.MedicationStatement.MedicationStatementStatus.fromCode(it)
          },
          this@MedicationStatementSurrogate._status,
        )
      category = this@MedicationStatementSurrogate.category
      medication = this@MedicationStatementSurrogate.medication
      subject = this@MedicationStatementSurrogate.subject
      encounter = this@MedicationStatementSurrogate.encounter
      effective = this@MedicationStatementSurrogate.effective
      dateAsserted =
        DateTime.of(
          FhirDateTime.fromString(this@MedicationStatementSurrogate.dateAsserted),
          this@MedicationStatementSurrogate._dateAsserted,
        )
      informationSource = this@MedicationStatementSurrogate.informationSource
      derivedFrom = this@MedicationStatementSurrogate.derivedFrom
      reason = this@MedicationStatementSurrogate.reason
      note = this@MedicationStatementSurrogate.note
      relatedClinicalInformation = this@MedicationStatementSurrogate.relatedClinicalInformation
      renderedDosageInstruction =
        Markdown.of(
          this@MedicationStatementSurrogate.renderedDosageInstruction,
          this@MedicationStatementSurrogate._renderedDosageInstruction,
        )
      dosage = this@MedicationStatementSurrogate.dosage
      adherence = this@MedicationStatementSurrogate.adherence
    }

  public companion object {
    public fun fromModel(model: MedicationStatement): MedicationStatementSurrogate =
      with(model) {
        MedicationStatementSurrogate().apply {
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
          partOf = this@with.partOf
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          category = this@with.category
          medication = this@with.medication
          subject = this@with.subject
          encounter = this@with.encounter
          effective = this@with.effective
          dateAsserted = this@with.dateAsserted?.value?.toString()
          _dateAsserted = this@with.dateAsserted?.toElement()
          informationSource = this@with.informationSource
          derivedFrom = this@with.derivedFrom
          reason = this@with.reason
          note = this@with.note
          relatedClinicalInformation = this@with.relatedClinicalInformation
          renderedDosageInstruction = this@with.renderedDosageInstruction?.value
          _renderedDosageInstruction = this@with.renderedDosageInstruction?.toElement()
          dosage = this@with.dosage
          adherence = this@with.adherence
        }
      }
  }
}
