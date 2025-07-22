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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicationAdministrationPerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var function: CodeableConcept? = null,
  public var actor: CodeableReference,
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
        R5String.of(
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
  public var basedOn: MutableList<Reference>? = null,
  public var partOf: MutableList<Reference>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: MutableList<CodeableConcept>? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var medication: CodeableReference,
  public var subject: Reference,
  public var encounter: Reference? = null,
  public var supportingInformation: MutableList<Reference>? = null,
  public var occurenceDateTime: KotlinString? = null,
  public var _occurenceDateTime: Element? = null,
  public var occurencePeriod: Period? = null,
  public var occurenceTiming: Timing? = null,
  public var recorded: KotlinString? = null,
  public var _recorded: Element? = null,
  public var isSubPotent: KotlinBoolean? = null,
  public var _isSubPotent: Element? = null,
  public var subPotentReason: MutableList<CodeableConcept>? = null,
  public var performer: MutableList<MedicationAdministration.Performer>? = null,
  public var reason: MutableList<CodeableReference>? = null,
  public var request: Reference? = null,
  public var device: MutableList<CodeableReference>? = null,
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
      basedOn = this@MedicationAdministrationSurrogate.basedOn ?: mutableListOf(),
      partOf = this@MedicationAdministrationSurrogate.partOf ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.MedicationAdministration.MedicationAdministrationStatus.fromCode(
            this@MedicationAdministrationSurrogate.status!!
          ),
          this@MedicationAdministrationSurrogate._status,
        ),
      statusReason = this@MedicationAdministrationSurrogate.statusReason ?: mutableListOf(),
      category = this@MedicationAdministrationSurrogate.category ?: mutableListOf(),
      medication = this@MedicationAdministrationSurrogate.medication,
      subject = this@MedicationAdministrationSurrogate.subject,
      encounter = this@MedicationAdministrationSurrogate.encounter,
      supportingInformation =
        this@MedicationAdministrationSurrogate.supportingInformation ?: mutableListOf(),
      occurence =
        MedicationAdministration.Occurence.from(
          DateTime.of(
            FhirDateTime.fromString(this@MedicationAdministrationSurrogate.occurenceDateTime),
            this@MedicationAdministrationSurrogate._occurenceDateTime,
          ),
          this@MedicationAdministrationSurrogate.occurencePeriod,
          this@MedicationAdministrationSurrogate.occurenceTiming,
        )!!,
      recorded =
        DateTime.of(
          FhirDateTime.fromString(this@MedicationAdministrationSurrogate.recorded),
          this@MedicationAdministrationSurrogate._recorded,
        ),
      isSubPotent =
        R5Boolean.of(
          this@MedicationAdministrationSurrogate.isSubPotent,
          this@MedicationAdministrationSurrogate._isSubPotent,
        ),
      subPotentReason = this@MedicationAdministrationSurrogate.subPotentReason ?: mutableListOf(),
      performer = this@MedicationAdministrationSurrogate.performer ?: mutableListOf(),
      reason = this@MedicationAdministrationSurrogate.reason ?: mutableListOf(),
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
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          partOf = this@with.partOf.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          statusReason = this@with.statusReason.takeUnless { it.all { it == null } },
          category = this@with.category.takeUnless { it.all { it == null } },
          medication = this@with.medication,
          subject = this@with.subject,
          encounter = this@with.encounter,
          supportingInformation =
            this@with.supportingInformation.takeUnless { it.all { it == null } },
          occurenceDateTime = this@with.occurence?.asDateTime()?.value?.value?.toString(),
          _occurenceDateTime = this@with.occurence?.asDateTime()?.value?.toElement(),
          occurencePeriod = this@with.occurence?.asPeriod()?.value,
          occurenceTiming = this@with.occurence?.asTiming()?.value,
          recorded = this@with.recorded?.value?.toString(),
          _recorded = this@with.recorded?.toElement(),
          isSubPotent = this@with.isSubPotent?.value,
          _isSubPotent = this@with.isSubPotent?.toElement(),
          subPotentReason = this@with.subPotentReason.takeUnless { it.all { it == null } },
          performer = this@with.performer.takeUnless { it.all { it == null } },
          reason = this@with.reason.takeUnless { it.all { it == null } },
          request = this@with.request,
          device = this@with.device.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          dosage = this@with.dosage,
          eventHistory = this@with.eventHistory.takeUnless { it.all { it == null } },
        )
      }
  }
}
