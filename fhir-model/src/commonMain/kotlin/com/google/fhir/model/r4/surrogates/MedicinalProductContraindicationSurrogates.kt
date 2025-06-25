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
import com.google.fhir.model.r4.MedicinalProductContraindication
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Population
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
internal data class MedicinalProductContraindicationOtherTherapySurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var therapyRelationshipType: CodeableConcept? = null,
  public var medicationCodeableConcept: CodeableConcept? = null,
  public var medicationReference: Reference? = null,
) {
  public fun toModel(): MedicinalProductContraindication.OtherTherapy =
    MedicinalProductContraindication.OtherTherapy().apply {
      id = this@MedicinalProductContraindicationOtherTherapySurrogate.id
      extension = this@MedicinalProductContraindicationOtherTherapySurrogate.extension
      modifierExtension =
        this@MedicinalProductContraindicationOtherTherapySurrogate.modifierExtension
      therapyRelationshipType =
        this@MedicinalProductContraindicationOtherTherapySurrogate.therapyRelationshipType
      medication =
        MedicinalProductContraindication.OtherTherapy.Medication?.from(
          this@MedicinalProductContraindicationOtherTherapySurrogate.medicationCodeableConcept,
          this@MedicinalProductContraindicationOtherTherapySurrogate.medicationReference,
        )
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductContraindication.OtherTherapy
    ): MedicinalProductContraindicationOtherTherapySurrogate =
      with(model) {
        MedicinalProductContraindicationOtherTherapySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          therapyRelationshipType = this@with.therapyRelationshipType
          medicationCodeableConcept = this@with.medication?.asCodeableConcept()?.value
          medicationReference = this@with.medication?.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class MedicinalProductContraindicationSurrogate(
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
  public var disease: CodeableConcept? = null,
  public var diseaseStatus: CodeableConcept? = null,
  public var comorbidity: List<CodeableConcept?>? = null,
  public var therapeuticIndication: List<Reference?>? = null,
  public var otherTherapy: List<MedicinalProductContraindication.OtherTherapy>? = null,
  public var population: List<Population?>? = null,
) {
  public fun toModel(): MedicinalProductContraindication =
    MedicinalProductContraindication().apply {
      id = this@MedicinalProductContraindicationSurrogate.id
      meta = this@MedicinalProductContraindicationSurrogate.meta
      implicitRules =
        Uri.of(
          this@MedicinalProductContraindicationSurrogate.implicitRules,
          this@MedicinalProductContraindicationSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@MedicinalProductContraindicationSurrogate.language,
          this@MedicinalProductContraindicationSurrogate._language,
        )
      text = this@MedicinalProductContraindicationSurrogate.text
      contained = this@MedicinalProductContraindicationSurrogate.contained
      extension = this@MedicinalProductContraindicationSurrogate.extension
      modifierExtension = this@MedicinalProductContraindicationSurrogate.modifierExtension
      subject = this@MedicinalProductContraindicationSurrogate.subject
      disease = this@MedicinalProductContraindicationSurrogate.disease
      diseaseStatus = this@MedicinalProductContraindicationSurrogate.diseaseStatus
      comorbidity = this@MedicinalProductContraindicationSurrogate.comorbidity
      therapeuticIndication = this@MedicinalProductContraindicationSurrogate.therapeuticIndication
      otherTherapy = this@MedicinalProductContraindicationSurrogate.otherTherapy
      population = this@MedicinalProductContraindicationSurrogate.population
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductContraindication
    ): MedicinalProductContraindicationSurrogate =
      with(model) {
        MedicinalProductContraindicationSurrogate().apply {
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
          disease = this@with.disease
          diseaseStatus = this@with.diseaseStatus
          comorbidity = this@with.comorbidity
          therapeuticIndication = this@with.therapeuticIndication
          otherTherapy = this@with.otherTherapy
          population = this@with.population
        }
      }
  }
}
