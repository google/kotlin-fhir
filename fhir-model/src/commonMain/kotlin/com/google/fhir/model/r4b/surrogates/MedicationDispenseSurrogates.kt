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
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Dosage
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.MedicationDispense
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicationDispensePerformerSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference,
) {
  public fun toModel(): MedicationDispense.Performer =
    MedicationDispense.Performer(
      id = this@MedicationDispensePerformerSurrogate.id,
      extension = this@MedicationDispensePerformerSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationDispensePerformerSurrogate.modifierExtension ?: mutableListOf(),
      function = this@MedicationDispensePerformerSurrogate.function,
      actor = this@MedicationDispensePerformerSurrogate.actor,
    )

  public companion object {
    public fun fromModel(
      model: MedicationDispense.Performer
    ): MedicationDispensePerformerSurrogate =
      with(model) {
        MedicationDispensePerformerSurrogate(
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
internal data class MedicationDispenseSubstitutionSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var wasSubstituted: KotlinBoolean? = null,
  public var _wasSubstituted: Element? = null,
  public var type: CodeableConcept? = null,
  public var reason: MutableList<CodeableConcept>? = null,
  public var responsibleParty: MutableList<Reference>? = null,
) {
  public fun toModel(): MedicationDispense.Substitution =
    MedicationDispense.Substitution(
      id = this@MedicationDispenseSubstitutionSurrogate.id,
      extension = this@MedicationDispenseSubstitutionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationDispenseSubstitutionSurrogate.modifierExtension ?: mutableListOf(),
      wasSubstituted =
        R4bBoolean.of(
          this@MedicationDispenseSubstitutionSurrogate.wasSubstituted,
          this@MedicationDispenseSubstitutionSurrogate._wasSubstituted,
        )!!,
      type = this@MedicationDispenseSubstitutionSurrogate.type,
      reason = this@MedicationDispenseSubstitutionSurrogate.reason ?: mutableListOf(),
      responsibleParty =
        this@MedicationDispenseSubstitutionSurrogate.responsibleParty ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: MedicationDispense.Substitution
    ): MedicationDispenseSubstitutionSurrogate =
      with(model) {
        MedicationDispenseSubstitutionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          wasSubstituted = this@with.wasSubstituted.value,
          _wasSubstituted = this@with.wasSubstituted.toElement(),
          type = this@with.type,
          reason = this@with.reason.takeUnless { it.all { it == null } },
          responsibleParty = this@with.responsibleParty.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class MedicationDispenseSurrogate(
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
  public var statusReasonCodeableConcept: CodeableConcept? = null,
  public var statusReasonReference: Reference? = null,
  public var category: CodeableConcept? = null,
  public var medicationCodeableConcept: CodeableConcept? = null,
  public var medicationReference: Reference? = null,
  public var subject: Reference? = null,
  public var context: Reference? = null,
  public var supportingInformation: MutableList<Reference>? = null,
  public var performer: MutableList<MedicationDispense.Performer>? = null,
  public var location: Reference? = null,
  public var authorizingPrescription: MutableList<Reference>? = null,
  public var type: CodeableConcept? = null,
  public var quantity: Quantity? = null,
  public var daysSupply: Quantity? = null,
  public var whenPrepared: String? = null,
  public var _whenPrepared: Element? = null,
  public var whenHandedOver: String? = null,
  public var _whenHandedOver: Element? = null,
  public var destination: Reference? = null,
  public var `receiver`: MutableList<Reference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var dosageInstruction: MutableList<Dosage>? = null,
  public var substitution: MedicationDispense.Substitution? = null,
  public var detectedIssue: MutableList<Reference>? = null,
  public var eventHistory: MutableList<Reference>? = null,
) {
  public fun toModel(): MedicationDispense =
    MedicationDispense(
      id = this@MedicationDispenseSurrogate.id,
      meta = this@MedicationDispenseSurrogate.meta,
      implicitRules =
        Uri.of(
          this@MedicationDispenseSurrogate.implicitRules,
          this@MedicationDispenseSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@MedicationDispenseSurrogate.language,
          this@MedicationDispenseSurrogate._language,
        ),
      text = this@MedicationDispenseSurrogate.text,
      contained = this@MedicationDispenseSurrogate.contained ?: mutableListOf(),
      extension = this@MedicationDispenseSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MedicationDispenseSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@MedicationDispenseSurrogate.identifier ?: mutableListOf(),
      partOf = this@MedicationDispenseSurrogate.partOf ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.MedicationDispense.MedicationDispenseStatus.fromCode(
            this@MedicationDispenseSurrogate.status!!
          ),
          this@MedicationDispenseSurrogate._status,
        ),
      statusReason =
        MedicationDispense.StatusReason?.from(
          this@MedicationDispenseSurrogate.statusReasonCodeableConcept,
          this@MedicationDispenseSurrogate.statusReasonReference,
        ),
      category = this@MedicationDispenseSurrogate.category,
      medication =
        MedicationDispense.Medication.from(
          this@MedicationDispenseSurrogate.medicationCodeableConcept,
          this@MedicationDispenseSurrogate.medicationReference,
        )!!,
      subject = this@MedicationDispenseSurrogate.subject,
      context = this@MedicationDispenseSurrogate.context,
      supportingInformation =
        this@MedicationDispenseSurrogate.supportingInformation ?: mutableListOf(),
      performer = this@MedicationDispenseSurrogate.performer ?: mutableListOf(),
      location = this@MedicationDispenseSurrogate.location,
      authorizingPrescription =
        this@MedicationDispenseSurrogate.authorizingPrescription ?: mutableListOf(),
      type = this@MedicationDispenseSurrogate.type,
      quantity = this@MedicationDispenseSurrogate.quantity,
      daysSupply = this@MedicationDispenseSurrogate.daysSupply,
      whenPrepared =
        DateTime.of(
          FhirDateTime.fromString(this@MedicationDispenseSurrogate.whenPrepared),
          this@MedicationDispenseSurrogate._whenPrepared,
        ),
      whenHandedOver =
        DateTime.of(
          FhirDateTime.fromString(this@MedicationDispenseSurrogate.whenHandedOver),
          this@MedicationDispenseSurrogate._whenHandedOver,
        ),
      destination = this@MedicationDispenseSurrogate.destination,
      `receiver` = this@MedicationDispenseSurrogate.`receiver` ?: mutableListOf(),
      note = this@MedicationDispenseSurrogate.note ?: mutableListOf(),
      dosageInstruction = this@MedicationDispenseSurrogate.dosageInstruction ?: mutableListOf(),
      substitution = this@MedicationDispenseSurrogate.substitution,
      detectedIssue = this@MedicationDispenseSurrogate.detectedIssue ?: mutableListOf(),
      eventHistory = this@MedicationDispenseSurrogate.eventHistory ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: MedicationDispense): MedicationDispenseSurrogate =
      with(model) {
        MedicationDispenseSurrogate(
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
          statusReasonCodeableConcept = this@with.statusReason?.asCodeableConcept()?.value,
          statusReasonReference = this@with.statusReason?.asReference()?.value,
          category = this@with.category,
          medicationCodeableConcept = this@with.medication?.asCodeableConcept()?.value,
          medicationReference = this@with.medication?.asReference()?.value,
          subject = this@with.subject,
          context = this@with.context,
          supportingInformation =
            this@with.supportingInformation.takeUnless { it.all { it == null } },
          performer = this@with.performer.takeUnless { it.all { it == null } },
          location = this@with.location,
          authorizingPrescription =
            this@with.authorizingPrescription.takeUnless { it.all { it == null } },
          type = this@with.type,
          quantity = this@with.quantity,
          daysSupply = this@with.daysSupply,
          whenPrepared = this@with.whenPrepared?.value?.toString(),
          _whenPrepared = this@with.whenPrepared?.toElement(),
          whenHandedOver = this@with.whenHandedOver?.value?.toString(),
          _whenHandedOver = this@with.whenHandedOver?.toElement(),
          destination = this@with.destination,
          `receiver` = this@with.`receiver`.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          dosageInstruction = this@with.dosageInstruction.takeUnless { it.all { it == null } },
          substitution = this@with.substitution,
          detectedIssue = this@with.detectedIssue.takeUnless { it.all { it == null } },
          eventHistory = this@with.eventHistory.takeUnless { it.all { it == null } },
        )
      }
  }
}
