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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicinalProductIndicationOtherTherapySurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var therapyRelationshipType: CodeableConcept,
  public var medicationCodeableConcept: CodeableConcept? = null,
  public var medicationReference: Reference? = null,
) {
  public fun toModel(): MedicinalProductIndication.OtherTherapy =
    MedicinalProductIndication.OtherTherapy(
      id = this@MedicinalProductIndicationOtherTherapySurrogate.id,
      extension = this@MedicinalProductIndicationOtherTherapySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductIndicationOtherTherapySurrogate.modifierExtension ?: mutableListOf(),
      therapyRelationshipType =
        this@MedicinalProductIndicationOtherTherapySurrogate.therapyRelationshipType,
      medication =
        MedicinalProductIndication.OtherTherapy.Medication.from(
          this@MedicinalProductIndicationOtherTherapySurrogate.medicationCodeableConcept,
          this@MedicinalProductIndicationOtherTherapySurrogate.medicationReference,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductIndication.OtherTherapy
    ): MedicinalProductIndicationOtherTherapySurrogate =
      with(model) {
        MedicinalProductIndicationOtherTherapySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          therapyRelationshipType = this@with.therapyRelationshipType,
          medicationCodeableConcept = this@with.medication?.asCodeableConcept()?.value,
          medicationReference = this@with.medication?.asReference()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var subject: MutableList<Reference>? = null,
  public var diseaseSymptomProcedure: CodeableConcept? = null,
  public var diseaseStatus: CodeableConcept? = null,
  public var comorbidity: MutableList<CodeableConcept>? = null,
  public var intendedEffect: CodeableConcept? = null,
  public var duration: Quantity? = null,
  public var otherTherapy: MutableList<MedicinalProductIndication.OtherTherapy>? = null,
  public var undesirableEffect: MutableList<Reference>? = null,
  public var population: MutableList<Population>? = null,
) {
  public fun toModel(): MedicinalProductIndication =
    MedicinalProductIndication(
      id = this@MedicinalProductIndicationSurrogate.id,
      meta = this@MedicinalProductIndicationSurrogate.meta,
      implicitRules =
        Uri.of(
          this@MedicinalProductIndicationSurrogate.implicitRules,
          this@MedicinalProductIndicationSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@MedicinalProductIndicationSurrogate.language,
          this@MedicinalProductIndicationSurrogate._language,
        ),
      text = this@MedicinalProductIndicationSurrogate.text,
      contained = this@MedicinalProductIndicationSurrogate.contained ?: mutableListOf(),
      extension = this@MedicinalProductIndicationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductIndicationSurrogate.modifierExtension ?: mutableListOf(),
      subject = this@MedicinalProductIndicationSurrogate.subject ?: mutableListOf(),
      diseaseSymptomProcedure = this@MedicinalProductIndicationSurrogate.diseaseSymptomProcedure,
      diseaseStatus = this@MedicinalProductIndicationSurrogate.diseaseStatus,
      comorbidity = this@MedicinalProductIndicationSurrogate.comorbidity ?: mutableListOf(),
      intendedEffect = this@MedicinalProductIndicationSurrogate.intendedEffect,
      duration = this@MedicinalProductIndicationSurrogate.duration,
      otherTherapy = this@MedicinalProductIndicationSurrogate.otherTherapy ?: mutableListOf(),
      undesirableEffect =
        this@MedicinalProductIndicationSurrogate.undesirableEffect ?: mutableListOf(),
      population = this@MedicinalProductIndicationSurrogate.population ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: MedicinalProductIndication): MedicinalProductIndicationSurrogate =
      with(model) {
        MedicinalProductIndicationSurrogate(
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
          subject = this@with.subject.takeUnless { it.all { it == null } },
          diseaseSymptomProcedure = this@with.diseaseSymptomProcedure,
          diseaseStatus = this@with.diseaseStatus,
          comorbidity = this@with.comorbidity.takeUnless { it.all { it == null } },
          intendedEffect = this@with.intendedEffect,
          duration = this@with.duration,
          otherTherapy = this@with.otherTherapy.takeUnless { it.all { it == null } },
          undesirableEffect = this@with.undesirableEffect.takeUnless { it.all { it == null } },
          population = this@with.population.takeUnless { it.all { it == null } },
        )
      }
  }
}
