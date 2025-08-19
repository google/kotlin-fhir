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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicationStatementAdherenceSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept,
  public var reason: CodeableConcept? = null,
) {
  public fun toModel(): MedicationStatement.Adherence =
    MedicationStatement.Adherence(
      id = this@MedicationStatementAdherenceSurrogate.id,
      extension = this@MedicationStatementAdherenceSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationStatementAdherenceSurrogate.modifierExtension ?: mutableListOf(),
      code = this@MedicationStatementAdherenceSurrogate.code,
      reason = this@MedicationStatementAdherenceSurrogate.reason,
    )

  public companion object {
    public fun fromModel(
      model: MedicationStatement.Adherence
    ): MedicationStatementAdherenceSurrogate =
      with(model) {
        MedicationStatementAdherenceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          reason = this@with.reason,
        )
      }
  }
}

@Serializable
internal data class MedicationStatementEffectiveSurrogate(
  public var effectiveDateTime: String? = null,
  public var _effectiveDateTime: Element? = null,
  public var effectivePeriod: Period? = null,
  public var effectiveTiming: Timing? = null,
) {
  public fun toModel(): MedicationStatement.Effective =
    MedicationStatement.Effective?.from(
      DateTime.of(
        FhirDateTime.fromString(this@MedicationStatementEffectiveSurrogate.effectiveDateTime),
        this@MedicationStatementEffectiveSurrogate._effectiveDateTime,
      ),
      this@MedicationStatementEffectiveSurrogate.effectivePeriod,
      this@MedicationStatementEffectiveSurrogate.effectiveTiming,
    )!!

  public companion object {
    public fun fromModel(
      model: MedicationStatement.Effective
    ): MedicationStatementEffectiveSurrogate =
      with(model) {
        MedicationStatementEffectiveSurrogate(
          effectiveDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _effectiveDateTime = this@with.asDateTime()?.value?.toElement(),
          effectivePeriod = this@with.asPeriod()?.value,
          effectiveTiming = this@with.asTiming()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var partOf: MutableList<Reference>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var medication: CodeableReference,
  public var subject: Reference,
  public var encounter: Reference? = null,
  public var effective: MedicationStatement.Effective? = null,
  public var dateAsserted: String? = null,
  public var _dateAsserted: Element? = null,
  public var informationSource: MutableList<Reference>? = null,
  public var derivedFrom: MutableList<Reference>? = null,
  public var reason: MutableList<CodeableReference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var relatedClinicalInformation: MutableList<Reference>? = null,
  public var renderedDosageInstruction: String? = null,
  public var _renderedDosageInstruction: Element? = null,
  public var dosage: MutableList<Dosage>? = null,
  public var adherence: MedicationStatement.Adherence? = null,
) {
  public fun toModel(): MedicationStatement =
    MedicationStatement(
      id = this@MedicationStatementSurrogate.id,
      meta = this@MedicationStatementSurrogate.meta,
      implicitRules =
        Uri.of(
          this@MedicationStatementSurrogate.implicitRules,
          this@MedicationStatementSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@MedicationStatementSurrogate.language,
          this@MedicationStatementSurrogate._language,
        ),
      text = this@MedicationStatementSurrogate.text,
      contained = this@MedicationStatementSurrogate.contained ?: mutableListOf(),
      extension = this@MedicationStatementSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MedicationStatementSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@MedicationStatementSurrogate.identifier ?: mutableListOf(),
      partOf = this@MedicationStatementSurrogate.partOf ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.MedicationStatement.MedicationStatementStatusCodes.fromCode(
            this@MedicationStatementSurrogate.status!!
          ),
          this@MedicationStatementSurrogate._status,
        ),
      category = this@MedicationStatementSurrogate.category ?: mutableListOf(),
      medication = this@MedicationStatementSurrogate.medication,
      subject = this@MedicationStatementSurrogate.subject,
      encounter = this@MedicationStatementSurrogate.encounter,
      effective = this@MedicationStatementSurrogate.effective,
      dateAsserted =
        DateTime.of(
          FhirDateTime.fromString(this@MedicationStatementSurrogate.dateAsserted),
          this@MedicationStatementSurrogate._dateAsserted,
        ),
      informationSource = this@MedicationStatementSurrogate.informationSource ?: mutableListOf(),
      derivedFrom = this@MedicationStatementSurrogate.derivedFrom ?: mutableListOf(),
      reason = this@MedicationStatementSurrogate.reason ?: mutableListOf(),
      note = this@MedicationStatementSurrogate.note ?: mutableListOf(),
      relatedClinicalInformation =
        this@MedicationStatementSurrogate.relatedClinicalInformation ?: mutableListOf(),
      renderedDosageInstruction =
        Markdown.of(
          this@MedicationStatementSurrogate.renderedDosageInstruction,
          this@MedicationStatementSurrogate._renderedDosageInstruction,
        ),
      dosage = this@MedicationStatementSurrogate.dosage ?: mutableListOf(),
      adherence = this@MedicationStatementSurrogate.adherence,
    )

  public companion object {
    public fun fromModel(model: MedicationStatement): MedicationStatementSurrogate =
      with(model) {
        MedicationStatementSurrogate(
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
          partOf = this@with.partOf.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          medication = this@with.medication,
          subject = this@with.subject,
          encounter = this@with.encounter,
          effective = this@with.effective,
          dateAsserted = this@with.dateAsserted?.value?.toString(),
          _dateAsserted = this@with.dateAsserted?.toElement(),
          informationSource = this@with.informationSource.takeUnless { it.all { it == null } },
          derivedFrom = this@with.derivedFrom.takeUnless { it.all { it == null } },
          reason = this@with.reason.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          relatedClinicalInformation =
            this@with.relatedClinicalInformation.takeUnless { it.all { it == null } },
          renderedDosageInstruction = this@with.renderedDosageInstruction?.value,
          _renderedDosageInstruction = this@with.renderedDosageInstruction?.toElement(),
          dosage = this@with.dosage.takeUnless { it.all { it == null } },
          adherence = this@with.adherence,
        )
      }
  }
}
