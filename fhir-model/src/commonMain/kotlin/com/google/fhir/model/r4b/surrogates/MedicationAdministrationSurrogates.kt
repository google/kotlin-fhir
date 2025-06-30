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
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.MedicationAdministration
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Ratio
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicationAdministrationPerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference? = null,
) {
  public fun toModel(): MedicationAdministration.Performer =
    MedicationAdministration.Performer().apply {
      id = this@MedicationAdministrationPerformerSurrogate.id
      extension = this@MedicationAdministrationPerformerSurrogate.extension
      modifierExtension = this@MedicationAdministrationPerformerSurrogate.modifierExtension
      function = this@MedicationAdministrationPerformerSurrogate.function
      actor = this@MedicationAdministrationPerformerSurrogate.actor
    }

  public companion object {
    public fun fromModel(
      model: MedicationAdministration.Performer
    ): MedicationAdministrationPerformerSurrogate =
      with(model) {
        MedicationAdministrationPerformerSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          function = this@with.function
          actor = this@with.actor
        }
      }
  }
}

@Serializable
internal data class MedicationAdministrationDosageSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var site: CodeableConcept? = null,
  public var route: CodeableConcept? = null,
  public var method: CodeableConcept? = null,
  public var dose: Quantity? = null,
  public var rateRatio: Ratio? = null,
  public var rateQuantity: Quantity? = null,
) {
  public fun toModel(): MedicationAdministration.Dosage =
    MedicationAdministration.Dosage().apply {
      id = this@MedicationAdministrationDosageSurrogate.id
      extension = this@MedicationAdministrationDosageSurrogate.extension
      modifierExtension = this@MedicationAdministrationDosageSurrogate.modifierExtension
      text =
        R4bString.of(
          this@MedicationAdministrationDosageSurrogate.text,
          this@MedicationAdministrationDosageSurrogate._text,
        )
      site = this@MedicationAdministrationDosageSurrogate.site
      route = this@MedicationAdministrationDosageSurrogate.route
      method = this@MedicationAdministrationDosageSurrogate.method
      dose = this@MedicationAdministrationDosageSurrogate.dose
      rate =
        MedicationAdministration.Dosage.Rate?.from(
          this@MedicationAdministrationDosageSurrogate.rateRatio,
          this@MedicationAdministrationDosageSurrogate.rateQuantity,
        )
    }

  public companion object {
    public fun fromModel(
      model: MedicationAdministration.Dosage
    ): MedicationAdministrationDosageSurrogate =
      with(model) {
        MedicationAdministrationDosageSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          text = this@with.text?.value
          _text = this@with.text?.toElement()
          site = this@with.site
          route = this@with.route
          method = this@with.method
          dose = this@with.dose
          rateRatio = this@with.rate?.asRatio()?.value
          rateQuantity = this@with.rate?.asQuantity()?.value
        }
      }
  }
}

@Serializable
internal data class MedicationAdministrationSurrogate(
  public var id: KotlinString? = null,
  public var meta: Meta? = null,
  public var implicitRules: KotlinString? = null,
  public var _implicitRules: Element? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var instantiates: List<KotlinString?>? = null,
  public var _instantiates: List<Element?>? = null,
  public var partOf: List<Reference?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: List<CodeableConcept?>? = null,
  public var category: CodeableConcept? = null,
  public var medicationCodeableConcept: CodeableConcept? = null,
  public var medicationReference: Reference? = null,
  public var subject: Reference? = null,
  public var context: Reference? = null,
  public var supportingInformation: List<Reference?>? = null,
  public var effectiveDateTime: KotlinString? = null,
  public var _effectiveDateTime: Element? = null,
  public var effectivePeriod: Period? = null,
  public var performer: List<MedicationAdministration.Performer>? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var reasonReference: List<Reference?>? = null,
  public var request: Reference? = null,
  public var device: List<Reference?>? = null,
  public var note: List<Annotation?>? = null,
  public var dosage: MedicationAdministration.Dosage? = null,
  public var eventHistory: List<Reference?>? = null,
) {
  public fun toModel(): MedicationAdministration =
    MedicationAdministration().apply {
      id = this@MedicationAdministrationSurrogate.id
      meta = this@MedicationAdministrationSurrogate.meta
      implicitRules =
        Uri.of(
          this@MedicationAdministrationSurrogate.implicitRules,
          this@MedicationAdministrationSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@MedicationAdministrationSurrogate.language,
          this@MedicationAdministrationSurrogate._language,
        )
      text = this@MedicationAdministrationSurrogate.text
      contained = this@MedicationAdministrationSurrogate.contained
      extension = this@MedicationAdministrationSurrogate.extension
      modifierExtension = this@MedicationAdministrationSurrogate.modifierExtension
      identifier = this@MedicationAdministrationSurrogate.identifier
      instantiates =
        if (
          this@MedicationAdministrationSurrogate.instantiates == null &&
            this@MedicationAdministrationSurrogate._instantiates == null
        ) {
          null
        } else {
          (this@MedicationAdministrationSurrogate.instantiates
              ?: List(this@MedicationAdministrationSurrogate._instantiates!!.size) { null })
            .zip(
              this@MedicationAdministrationSurrogate._instantiates
                ?: List(this@MedicationAdministrationSurrogate.instantiates!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      partOf = this@MedicationAdministrationSurrogate.partOf
      status =
        Enumeration.of(
          this@MedicationAdministrationSurrogate.status?.let {
            com.google.fhir.model.r4b.MedicationAdministration.MedicationAdministrationStatus
              .fromCode(it)
          },
          this@MedicationAdministrationSurrogate._status,
        )
      statusReason = this@MedicationAdministrationSurrogate.statusReason
      category = this@MedicationAdministrationSurrogate.category
      medication =
        MedicationAdministration.Medication?.from(
          this@MedicationAdministrationSurrogate.medicationCodeableConcept,
          this@MedicationAdministrationSurrogate.medicationReference,
        )
      subject = this@MedicationAdministrationSurrogate.subject
      context = this@MedicationAdministrationSurrogate.context
      supportingInformation = this@MedicationAdministrationSurrogate.supportingInformation
      effective =
        MedicationAdministration.Effective?.from(
          DateTime.of(
            FhirDateTime.fromString(this@MedicationAdministrationSurrogate.effectiveDateTime),
            this@MedicationAdministrationSurrogate._effectiveDateTime,
          ),
          this@MedicationAdministrationSurrogate.effectivePeriod,
        )
      performer = this@MedicationAdministrationSurrogate.performer
      reasonCode = this@MedicationAdministrationSurrogate.reasonCode
      reasonReference = this@MedicationAdministrationSurrogate.reasonReference
      request = this@MedicationAdministrationSurrogate.request
      device = this@MedicationAdministrationSurrogate.device
      note = this@MedicationAdministrationSurrogate.note
      dosage = this@MedicationAdministrationSurrogate.dosage
      eventHistory = this@MedicationAdministrationSurrogate.eventHistory
    }

  public companion object {
    public fun fromModel(model: MedicationAdministration): MedicationAdministrationSurrogate =
      with(model) {
        MedicationAdministrationSurrogate().apply {
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
          instantiates =
            this@with.instantiates?.map { it?.value }?.takeUnless { it.all { it == null } }
          _instantiates =
            this@with.instantiates?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          partOf = this@with.partOf
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          statusReason = this@with.statusReason
          category = this@with.category
          medicationCodeableConcept = this@with.medication?.asCodeableConcept()?.value
          medicationReference = this@with.medication?.asReference()?.value
          subject = this@with.subject
          context = this@with.context
          supportingInformation = this@with.supportingInformation
          effectiveDateTime = this@with.effective?.asDateTime()?.value?.value?.toString()
          _effectiveDateTime = this@with.effective?.asDateTime()?.value?.toElement()
          effectivePeriod = this@with.effective?.asPeriod()?.value
          performer = this@with.performer
          reasonCode = this@with.reasonCode
          reasonReference = this@with.reasonReference
          request = this@with.request
          device = this@with.device
          note = this@with.note
          dosage = this@with.dosage
          eventHistory = this@with.eventHistory
        }
      }
  }
}
