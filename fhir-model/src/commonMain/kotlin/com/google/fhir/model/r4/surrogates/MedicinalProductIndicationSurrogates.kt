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
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.MedicinalProductIndication
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Population
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal class MedicinalProductIndicationOtherTherapyMedicationSurrogate {
  public var medicationCodeableConcept: CodeableConcept? = null

  public var medicationReference: Reference? = null

  public fun toModel(): MedicinalProductIndication.OtherTherapy.Medication =
    MedicinalProductIndication.OtherTherapy.Medication?.from(
      this@MedicinalProductIndicationOtherTherapyMedicationSurrogate.medicationCodeableConcept,
      this@MedicinalProductIndicationOtherTherapyMedicationSurrogate.medicationReference,
    ) ?: MedicinalProductIndication.OtherTherapy.Medication.Null

  public companion object {
    public fun fromModel(
      model: MedicinalProductIndication.OtherTherapy.Medication
    ): MedicinalProductIndicationOtherTherapyMedicationSurrogate =
      with(model) {
        MedicinalProductIndicationOtherTherapyMedicationSurrogate().apply {
          medicationCodeableConcept = this@with.asCodeableConcept()?.value
          medicationReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class MedicinalProductIndicationOtherTherapySurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var therapyRelationshipType: CodeableConcept? = null,
  public var medication: MedicinalProductIndication.OtherTherapy.Medication? = null,
) {
  public fun toModel(): MedicinalProductIndication.OtherTherapy =
    MedicinalProductIndication.OtherTherapy().apply {
      id = this@MedicinalProductIndicationOtherTherapySurrogate.id
      extension = this@MedicinalProductIndicationOtherTherapySurrogate.extension
      modifierExtension = this@MedicinalProductIndicationOtherTherapySurrogate.modifierExtension
      therapyRelationshipType =
        this@MedicinalProductIndicationOtherTherapySurrogate.therapyRelationshipType
      medication = this@MedicinalProductIndicationOtherTherapySurrogate.medication
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductIndication.OtherTherapy
    ): MedicinalProductIndicationOtherTherapySurrogate =
      with(model) {
        MedicinalProductIndicationOtherTherapySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          therapyRelationshipType = this@with.therapyRelationshipType
          medication = this@with.medication
        }
      }
  }
}

@Serializable
internal data class MedicinalProductIndicationSurrogate(
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
  public var subject: List<Reference?>? = null,
  public var diseaseSymptomProcedure: CodeableConcept? = null,
  public var diseaseStatus: CodeableConcept? = null,
  public var comorbidity: List<CodeableConcept?>? = null,
  public var intendedEffect: CodeableConcept? = null,
  public var duration: Quantity? = null,
  public var otherTherapy: List<MedicinalProductIndication.OtherTherapy>? = null,
  public var undesirableEffect: List<Reference?>? = null,
  public var population: List<Population?>? = null,
) {
  public fun toModel(): MedicinalProductIndication =
    MedicinalProductIndication().apply {
      id = this@MedicinalProductIndicationSurrogate.id
      meta = this@MedicinalProductIndicationSurrogate.meta
      implicitRules =
        Uri.of(
          this@MedicinalProductIndicationSurrogate.implicitRules,
          this@MedicinalProductIndicationSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@MedicinalProductIndicationSurrogate.language,
          this@MedicinalProductIndicationSurrogate._language,
        )
      text = this@MedicinalProductIndicationSurrogate.text
      contained = this@MedicinalProductIndicationSurrogate.contained
      extension = this@MedicinalProductIndicationSurrogate.extension
      modifierExtension = this@MedicinalProductIndicationSurrogate.modifierExtension
      subject = this@MedicinalProductIndicationSurrogate.subject
      diseaseSymptomProcedure = this@MedicinalProductIndicationSurrogate.diseaseSymptomProcedure
      diseaseStatus = this@MedicinalProductIndicationSurrogate.diseaseStatus
      comorbidity = this@MedicinalProductIndicationSurrogate.comorbidity
      intendedEffect = this@MedicinalProductIndicationSurrogate.intendedEffect
      duration = this@MedicinalProductIndicationSurrogate.duration
      otherTherapy = this@MedicinalProductIndicationSurrogate.otherTherapy
      undesirableEffect = this@MedicinalProductIndicationSurrogate.undesirableEffect
      population = this@MedicinalProductIndicationSurrogate.population
    }

  public companion object {
    public fun fromModel(model: MedicinalProductIndication): MedicinalProductIndicationSurrogate =
      with(model) {
        MedicinalProductIndicationSurrogate().apply {
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
          subject = this@with.subject
          diseaseSymptomProcedure = this@with.diseaseSymptomProcedure
          diseaseStatus = this@with.diseaseStatus
          comorbidity = this@with.comorbidity
          intendedEffect = this@with.intendedEffect
          duration = this@with.duration
          otherTherapy = this@with.otherTherapy
          undesirableEffect = this@with.undesirableEffect
          population = this@with.population
        }
      }
  }
}
