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
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.MedicationAdministration
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Ratio
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Timing
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
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
  public var actor: CodeableReference? = null,
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
        R5String.of(
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
  public var basedOn: List<Reference?>? = null,
  public var partOf: List<Reference?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: List<CodeableConcept?>? = null,
  public var category: List<CodeableConcept?>? = null,
  public var medication: CodeableReference? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var supportingInformation: List<Reference?>? = null,
  public var occurenceDateTime: KotlinString? = null,
  public var _occurenceDateTime: Element? = null,
  public var occurencePeriod: Period? = null,
  public var occurenceTiming: Timing? = null,
  public var recorded: KotlinString? = null,
  public var _recorded: Element? = null,
  public var isSubPotent: KotlinBoolean? = null,
  public var _isSubPotent: Element? = null,
  public var subPotentReason: List<CodeableConcept?>? = null,
  public var performer: List<MedicationAdministration.Performer>? = null,
  public var reason: List<CodeableReference?>? = null,
  public var request: Reference? = null,
  public var device: List<CodeableReference?>? = null,
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
      basedOn = this@MedicationAdministrationSurrogate.basedOn
      partOf = this@MedicationAdministrationSurrogate.partOf
      status =
        Enumeration.of(
          this@MedicationAdministrationSurrogate.status?.let {
            com.google.fhir.model.r5.MedicationAdministration.MedicationAdministrationStatus
              .fromCode(it)
          },
          this@MedicationAdministrationSurrogate._status,
        )
      statusReason = this@MedicationAdministrationSurrogate.statusReason
      category = this@MedicationAdministrationSurrogate.category
      medication = this@MedicationAdministrationSurrogate.medication
      subject = this@MedicationAdministrationSurrogate.subject
      encounter = this@MedicationAdministrationSurrogate.encounter
      supportingInformation = this@MedicationAdministrationSurrogate.supportingInformation
      occurence =
        MedicationAdministration.Occurence?.from(
          DateTime.of(
            FhirDateTime.fromString(this@MedicationAdministrationSurrogate.occurenceDateTime),
            this@MedicationAdministrationSurrogate._occurenceDateTime,
          ),
          this@MedicationAdministrationSurrogate.occurencePeriod,
          this@MedicationAdministrationSurrogate.occurenceTiming,
        )
      recorded =
        DateTime.of(
          FhirDateTime.fromString(this@MedicationAdministrationSurrogate.recorded),
          this@MedicationAdministrationSurrogate._recorded,
        )
      isSubPotent =
        R5Boolean.of(
          this@MedicationAdministrationSurrogate.isSubPotent,
          this@MedicationAdministrationSurrogate._isSubPotent,
        )
      subPotentReason = this@MedicationAdministrationSurrogate.subPotentReason
      performer = this@MedicationAdministrationSurrogate.performer
      reason = this@MedicationAdministrationSurrogate.reason
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
          basedOn = this@with.basedOn
          partOf = this@with.partOf
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          statusReason = this@with.statusReason
          category = this@with.category
          medication = this@with.medication
          subject = this@with.subject
          encounter = this@with.encounter
          supportingInformation = this@with.supportingInformation
          occurenceDateTime = this@with.occurence?.asDateTime()?.value?.value?.toString()
          _occurenceDateTime = this@with.occurence?.asDateTime()?.value?.toElement()
          occurencePeriod = this@with.occurence?.asPeriod()?.value
          occurenceTiming = this@with.occurence?.asTiming()?.value
          recorded = this@with.recorded?.value?.toString()
          _recorded = this@with.recorded?.toElement()
          isSubPotent = this@with.isSubPotent?.value
          _isSubPotent = this@with.isSubPotent?.toElement()
          subPotentReason = this@with.subPotentReason
          performer = this@with.performer
          reason = this@with.reason
          request = this@with.request
          device = this@with.device
          note = this@with.note
          dosage = this@with.dosage
          eventHistory = this@with.eventHistory
        }
      }
  }
}
