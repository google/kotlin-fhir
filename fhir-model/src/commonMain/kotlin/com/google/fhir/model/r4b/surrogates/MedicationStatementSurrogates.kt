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
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Dosage
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.MedicationStatement
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal class MedicationStatementMedicationSurrogate {
  public var medicationCodeableConcept: CodeableConcept? = null

  public var medicationReference: Reference? = null

  public fun toModel(): MedicationStatement.Medication =
    MedicationStatement.Medication?.from(
      this@MedicationStatementMedicationSurrogate.medicationCodeableConcept,
      this@MedicationStatementMedicationSurrogate.medicationReference,
    ) ?: MedicationStatement.Medication.Null

  public companion object {
    public fun fromModel(
      model: MedicationStatement.Medication
    ): MedicationStatementMedicationSurrogate =
      with(model) {
        MedicationStatementMedicationSurrogate().apply {
          medicationCodeableConcept = this@with.asCodeableConcept()?.value
          medicationReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal class MedicationStatementEffectiveSurrogate {
  public var effectiveDateTime: String? = null

  public var _effectiveDateTime: Element? = null

  public var effectivePeriod: Period? = null

  public fun toModel(): MedicationStatement.Effective =
    MedicationStatement.Effective?.from(
      DateTime.of(
        FhirDateTime.fromString(this@MedicationStatementEffectiveSurrogate.effectiveDateTime),
        this@MedicationStatementEffectiveSurrogate._effectiveDateTime,
      ),
      this@MedicationStatementEffectiveSurrogate.effectivePeriod,
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
  public var basedOn: List<Reference?>? = null,
  public var partOf: List<Reference?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var statusReason: List<CodeableConcept?>? = null,
  public var category: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var context: Reference? = null,
  public var dateAsserted: String? = null,
  public var _dateAsserted: Element? = null,
  public var informationSource: Reference? = null,
  public var derivedFrom: List<Reference?>? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var reasonReference: List<Reference?>? = null,
  public var note: List<Annotation?>? = null,
  public var dosage: List<Dosage?>? = null,
  public var medication: MedicationStatement.Medication? = null,
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
      basedOn = this@MedicationStatementSurrogate.basedOn
      partOf = this@MedicationStatementSurrogate.partOf
      status =
        Enumeration.of(
          this@MedicationStatementSurrogate.status?.let {
            com.google.fhir.model.r4b.MedicationStatement.MedicationStatementStatus.fromCode(it)
          },
          this@MedicationStatementSurrogate._status,
        )
      statusReason = this@MedicationStatementSurrogate.statusReason
      category = this@MedicationStatementSurrogate.category
      medication = this@MedicationStatementSurrogate.medication
      subject = this@MedicationStatementSurrogate.subject
      context = this@MedicationStatementSurrogate.context
      effective = this@MedicationStatementSurrogate.effective
      dateAsserted =
        DateTime.of(
          FhirDateTime.fromString(this@MedicationStatementSurrogate.dateAsserted),
          this@MedicationStatementSurrogate._dateAsserted,
        )
      informationSource = this@MedicationStatementSurrogate.informationSource
      derivedFrom = this@MedicationStatementSurrogate.derivedFrom
      reasonCode = this@MedicationStatementSurrogate.reasonCode
      reasonReference = this@MedicationStatementSurrogate.reasonReference
      note = this@MedicationStatementSurrogate.note
      dosage = this@MedicationStatementSurrogate.dosage
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
          basedOn = this@with.basedOn
          partOf = this@with.partOf
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          statusReason = this@with.statusReason
          category = this@with.category
          medication = this@with.medication
          subject = this@with.subject
          context = this@with.context
          effective = this@with.effective
          dateAsserted = this@with.dateAsserted?.value?.toString()
          _dateAsserted = this@with.dateAsserted?.toElement()
          informationSource = this@with.informationSource
          derivedFrom = this@with.derivedFrom
          reasonCode = this@with.reasonCode
          reasonReference = this@with.reasonReference
          note = this@with.note
          dosage = this@with.dosage
        }
      }
  }
}
