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

import com.google.fhir.model.r4.Annotation
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.MedicationAdministration
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Ratio
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicationAdministrationPerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference,
) {
  public fun toModel(): MedicationAdministration.Performer =
    MedicationAdministration.Performer(
      id = this@MedicationAdministrationPerformerSurrogate.id,
      extension = this@MedicationAdministrationPerformerSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationAdministrationPerformerSurrogate.modifierExtension ?: mutableListOf(),
      function = this@MedicationAdministrationPerformerSurrogate.function,
      actor = this@MedicationAdministrationPerformerSurrogate.actor,
    )

  public companion object {
    public fun fromModel(
      model: MedicationAdministration.Performer
    ): MedicationAdministrationPerformerSurrogate =
      with(model) {
        MedicationAdministrationPerformerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          function = this@with.function,
          actor = this@with.actor,
        )
      }
  }
}

@Serializable
internal data class MedicationAdministrationDosageSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
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
    MedicationAdministration.Dosage(
      id = this@MedicationAdministrationDosageSurrogate.id,
      extension = this@MedicationAdministrationDosageSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationAdministrationDosageSurrogate.modifierExtension ?: mutableListOf(),
      text =
        R4String.of(
          this@MedicationAdministrationDosageSurrogate.text,
          this@MedicationAdministrationDosageSurrogate._text,
        ),
      site = this@MedicationAdministrationDosageSurrogate.site,
      route = this@MedicationAdministrationDosageSurrogate.route,
      method = this@MedicationAdministrationDosageSurrogate.method,
      dose = this@MedicationAdministrationDosageSurrogate.dose,
      rate =
        MedicationAdministration.Dosage.Rate?.from(
          this@MedicationAdministrationDosageSurrogate.rateRatio,
          this@MedicationAdministrationDosageSurrogate.rateQuantity,
        ),
    )

  public companion object {
    public fun fromModel(
      model: MedicationAdministration.Dosage
    ): MedicationAdministrationDosageSurrogate =
      with(model) {
        MedicationAdministrationDosageSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          text = this@with.text?.value,
          _text = this@with.text?.toElement(),
          site = this@with.site,
          route = this@with.route,
          method = this@with.method,
          dose = this@with.dose,
          rateRatio = this@with.rate?.asRatio()?.value,
          rateQuantity = this@with.rate?.asQuantity()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var instantiates: MutableList<KotlinString?>? = null,
  public var _instantiates: MutableList<Element?>? = null,
  public var partOf: MutableList<Reference>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: MutableList<CodeableConcept>? = null,
  public var category: CodeableConcept? = null,
  public var medicationCodeableConcept: CodeableConcept? = null,
  public var medicationReference: Reference? = null,
  public var subject: Reference,
  public var context: Reference? = null,
  public var supportingInformation: MutableList<Reference>? = null,
  public var effectiveDateTime: KotlinString? = null,
  public var _effectiveDateTime: Element? = null,
  public var effectivePeriod: Period? = null,
  public var performer: MutableList<MedicationAdministration.Performer>? = null,
  public var reasonCode: MutableList<CodeableConcept>? = null,
  public var reasonReference: MutableList<Reference>? = null,
  public var request: Reference? = null,
  public var device: MutableList<Reference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var dosage: MedicationAdministration.Dosage? = null,
  public var eventHistory: MutableList<Reference>? = null,
) {
  public fun toModel(): MedicationAdministration =
    MedicationAdministration(
      id = this@MedicationAdministrationSurrogate.id,
      meta = this@MedicationAdministrationSurrogate.meta,
      implicitRules =
        Uri.of(
          this@MedicationAdministrationSurrogate.implicitRules,
          this@MedicationAdministrationSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@MedicationAdministrationSurrogate.language,
          this@MedicationAdministrationSurrogate._language,
        ),
      text = this@MedicationAdministrationSurrogate.text,
      contained = this@MedicationAdministrationSurrogate.contained ?: mutableListOf(),
      extension = this@MedicationAdministrationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationAdministrationSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@MedicationAdministrationSurrogate.identifier ?: mutableListOf(),
      instantiates =
        if (
          this@MedicationAdministrationSurrogate.instantiates == null &&
            this@MedicationAdministrationSurrogate._instantiates == null
        ) {
          mutableListOf()
        } else {
          (this@MedicationAdministrationSurrogate.instantiates
              ?: List(this@MedicationAdministrationSurrogate._instantiates!!.size) { null })
            .zip(
              this@MedicationAdministrationSurrogate._instantiates
                ?: List(this@MedicationAdministrationSurrogate.instantiates!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      partOf = this@MedicationAdministrationSurrogate.partOf ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.MedicationAdministration.MedicationAdministrationStatus.fromCode(
            this@MedicationAdministrationSurrogate.status!!
          ),
          this@MedicationAdministrationSurrogate._status,
        ),
      statusReason = this@MedicationAdministrationSurrogate.statusReason ?: mutableListOf(),
      category = this@MedicationAdministrationSurrogate.category,
      medication =
        MedicationAdministration.Medication.from(
          this@MedicationAdministrationSurrogate.medicationCodeableConcept,
          this@MedicationAdministrationSurrogate.medicationReference,
        )!!,
      subject = this@MedicationAdministrationSurrogate.subject,
      context = this@MedicationAdministrationSurrogate.context,
      supportingInformation =
        this@MedicationAdministrationSurrogate.supportingInformation ?: mutableListOf(),
      effective =
        MedicationAdministration.Effective.from(
          DateTime.of(
            FhirDateTime.fromString(this@MedicationAdministrationSurrogate.effectiveDateTime),
            this@MedicationAdministrationSurrogate._effectiveDateTime,
          ),
          this@MedicationAdministrationSurrogate.effectivePeriod,
        )!!,
      performer = this@MedicationAdministrationSurrogate.performer ?: mutableListOf(),
      reasonCode = this@MedicationAdministrationSurrogate.reasonCode ?: mutableListOf(),
      reasonReference = this@MedicationAdministrationSurrogate.reasonReference ?: mutableListOf(),
      request = this@MedicationAdministrationSurrogate.request,
      device = this@MedicationAdministrationSurrogate.device ?: mutableListOf(),
      note = this@MedicationAdministrationSurrogate.note ?: mutableListOf(),
      dosage = this@MedicationAdministrationSurrogate.dosage,
      eventHistory = this@MedicationAdministrationSurrogate.eventHistory ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: MedicationAdministration): MedicationAdministrationSurrogate =
      with(model) {
        MedicationAdministrationSurrogate(
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
          instantiates =
            this@with.instantiates
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiates =
            this@with.instantiates
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          partOf = this@with.partOf.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          statusReason = this@with.statusReason.takeUnless { it.all { it == null } },
          category = this@with.category,
          medicationCodeableConcept = this@with.medication?.asCodeableConcept()?.value,
          medicationReference = this@with.medication?.asReference()?.value,
          subject = this@with.subject,
          context = this@with.context,
          supportingInformation =
            this@with.supportingInformation.takeUnless { it.all { it == null } },
          effectiveDateTime = this@with.effective?.asDateTime()?.value?.value?.toString(),
          _effectiveDateTime = this@with.effective?.asDateTime()?.value?.toElement(),
          effectivePeriod = this@with.effective?.asPeriod()?.value,
          performer = this@with.performer.takeUnless { it.all { it == null } },
          reasonCode = this@with.reasonCode.takeUnless { it.all { it == null } },
          reasonReference = this@with.reasonReference.takeUnless { it.all { it == null } },
          request = this@with.request,
          device = this@with.device.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          dosage = this@with.dosage,
          eventHistory = this@with.eventHistory.takeUnless { it.all { it == null } },
        )
      }
  }
}
