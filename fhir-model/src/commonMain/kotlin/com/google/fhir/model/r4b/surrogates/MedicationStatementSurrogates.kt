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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicationStatementMedicationSurrogate(
  public var medicationCodeableConcept: CodeableConcept? = null,
  public var medicationReference: Reference? = null,
) {
  public fun toModel(): MedicationStatement.Medication =
    MedicationStatement.Medication.from(
      this@MedicationStatementMedicationSurrogate.medicationCodeableConcept,
      this@MedicationStatementMedicationSurrogate.medicationReference,
    )!!

  public companion object {
    public fun fromModel(
      model: MedicationStatement.Medication
    ): MedicationStatementMedicationSurrogate =
      with(model) {
        MedicationStatementMedicationSurrogate().apply {
          MedicationStatement.Medication.from(
            this@MedicationStatementMedicationSurrogate.medicationCodeableConcept,
            this@MedicationStatementMedicationSurrogate.medicationReference,
          )!!
        }
      }
  }
}

@Serializable
internal data class MedicationStatementEffectiveSurrogate(
  public var effectiveDateTime: String? = null,
  public var _effectiveDateTime: Element? = null,
  public var effectivePeriod: Period? = null,
) {
  public fun toModel(): MedicationStatement.Effective? =
    MedicationStatement.Effective?.from(
      DateTime.of(
        FhirDateTime.fromString(this@MedicationStatementEffectiveSurrogate.effectiveDateTime),
        this@MedicationStatementEffectiveSurrogate._effectiveDateTime,
      ),
      this@MedicationStatementEffectiveSurrogate.effectivePeriod,
    )

  public companion object {
    public fun fromModel(
      model: MedicationStatement.Effective
    ): MedicationStatementEffectiveSurrogate =
      with(model) {
        MedicationStatementEffectiveSurrogate().apply {
          MedicationStatement.Effective?.from(
            DateTime.of(
              FhirDateTime.fromString(this@MedicationStatementEffectiveSurrogate.effectiveDateTime),
              this@MedicationStatementEffectiveSurrogate._effectiveDateTime,
            ),
            this@MedicationStatementEffectiveSurrogate.effectivePeriod,
          )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var partOf: MutableList<Reference>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var statusReason: MutableList<CodeableConcept>? = null,
  public var category: CodeableConcept? = null,
  public var subject: Reference,
  public var context: Reference? = null,
  public var dateAsserted: String? = null,
  public var _dateAsserted: Element? = null,
  public var informationSource: Reference? = null,
  public var derivedFrom: MutableList<Reference>? = null,
  public var reasonCode: MutableList<CodeableConcept>? = null,
  public var reasonReference: MutableList<Reference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var dosage: MutableList<Dosage>? = null,
  public var medication: MedicationStatement.Medication,
  public var effective: MedicationStatement.Effective? = null,
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
      basedOn = this@MedicationStatementSurrogate.basedOn ?: mutableListOf(),
      partOf = this@MedicationStatementSurrogate.partOf ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.MedicationStatement.MedicationStatementStatus.fromCode(
            this@MedicationStatementSurrogate.status!!
          ),
          this@MedicationStatementSurrogate._status,
        ),
      statusReason = this@MedicationStatementSurrogate.statusReason ?: mutableListOf(),
      category = this@MedicationStatementSurrogate.category,
      medication = this@MedicationStatementSurrogate.medication,
      subject = this@MedicationStatementSurrogate.subject,
      context = this@MedicationStatementSurrogate.context,
      effective = this@MedicationStatementSurrogate.effective,
      dateAsserted =
        DateTime.of(
          FhirDateTime.fromString(this@MedicationStatementSurrogate.dateAsserted),
          this@MedicationStatementSurrogate._dateAsserted,
        ),
      informationSource = this@MedicationStatementSurrogate.informationSource,
      derivedFrom = this@MedicationStatementSurrogate.derivedFrom ?: mutableListOf(),
      reasonCode = this@MedicationStatementSurrogate.reasonCode ?: mutableListOf(),
      reasonReference = this@MedicationStatementSurrogate.reasonReference ?: mutableListOf(),
      note = this@MedicationStatementSurrogate.note ?: mutableListOf(),
      dosage = this@MedicationStatementSurrogate.dosage ?: mutableListOf(),
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
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          partOf = this@with.partOf.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          statusReason = this@with.statusReason.takeUnless { it.all { it == null } },
          category = this@with.category,
          medication = this@with.medication,
          subject = this@with.subject,
          context = this@with.context,
          effective = this@with.effective,
          dateAsserted = this@with.dateAsserted?.value?.toString(),
          _dateAsserted = this@with.dateAsserted?.toElement(),
          informationSource = this@with.informationSource,
          derivedFrom = this@with.derivedFrom.takeUnless { it.all { it == null } },
          reasonCode = this@with.reasonCode.takeUnless { it.all { it == null } },
          reasonReference = this@with.reasonReference.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          dosage = this@with.dosage.takeUnless { it.all { it == null } },
        )
      }
  }
}
