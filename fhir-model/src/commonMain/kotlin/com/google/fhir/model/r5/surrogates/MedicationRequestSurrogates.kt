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
import com.google.fhir.model.r5.Dosage
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.MedicationRequest
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.UnsignedInt
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicationRequestDispenseRequestInitialFillSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var quantity: Quantity? = null,
  public var duration: Duration? = null,
) {
  public fun toModel(): MedicationRequest.DispenseRequest.InitialFill =
    MedicationRequest.DispenseRequest.InitialFill(
      id = this@MedicationRequestDispenseRequestInitialFillSurrogate.id,
      extension =
        this@MedicationRequestDispenseRequestInitialFillSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationRequestDispenseRequestInitialFillSurrogate.modifierExtension
          ?: mutableListOf(),
      quantity = this@MedicationRequestDispenseRequestInitialFillSurrogate.quantity,
      duration = this@MedicationRequestDispenseRequestInitialFillSurrogate.duration,
    )

  public companion object {
    public fun fromModel(
      model: MedicationRequest.DispenseRequest.InitialFill
    ): MedicationRequestDispenseRequestInitialFillSurrogate =
      with(model) {
        MedicationRequestDispenseRequestInitialFillSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          quantity = this@with.quantity,
          duration = this@with.duration,
        )
      }
  }
}

@Serializable
internal data class MedicationRequestDispenseRequestSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var initialFill: MedicationRequest.DispenseRequest.InitialFill? = null,
  public var dispenseInterval: Duration? = null,
  public var validityPeriod: Period? = null,
  public var numberOfRepeatsAllowed: Int? = null,
  public var _numberOfRepeatsAllowed: Element? = null,
  public var quantity: Quantity? = null,
  public var expectedSupplyDuration: Duration? = null,
  public var dispenser: Reference? = null,
  public var dispenserInstruction: MutableList<Annotation>? = null,
  public var doseAdministrationAid: CodeableConcept? = null,
) {
  public fun toModel(): MedicationRequest.DispenseRequest =
    MedicationRequest.DispenseRequest(
      id = this@MedicationRequestDispenseRequestSurrogate.id,
      extension = this@MedicationRequestDispenseRequestSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationRequestDispenseRequestSurrogate.modifierExtension ?: mutableListOf(),
      initialFill = this@MedicationRequestDispenseRequestSurrogate.initialFill,
      dispenseInterval = this@MedicationRequestDispenseRequestSurrogate.dispenseInterval,
      validityPeriod = this@MedicationRequestDispenseRequestSurrogate.validityPeriod,
      numberOfRepeatsAllowed =
        UnsignedInt.of(
          this@MedicationRequestDispenseRequestSurrogate.numberOfRepeatsAllowed,
          this@MedicationRequestDispenseRequestSurrogate._numberOfRepeatsAllowed,
        ),
      quantity = this@MedicationRequestDispenseRequestSurrogate.quantity,
      expectedSupplyDuration =
        this@MedicationRequestDispenseRequestSurrogate.expectedSupplyDuration,
      dispenser = this@MedicationRequestDispenseRequestSurrogate.dispenser,
      dispenserInstruction =
        this@MedicationRequestDispenseRequestSurrogate.dispenserInstruction ?: mutableListOf(),
      doseAdministrationAid = this@MedicationRequestDispenseRequestSurrogate.doseAdministrationAid,
    )

  public companion object {
    public fun fromModel(
      model: MedicationRequest.DispenseRequest
    ): MedicationRequestDispenseRequestSurrogate =
      with(model) {
        MedicationRequestDispenseRequestSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          initialFill = this@with.initialFill,
          dispenseInterval = this@with.dispenseInterval,
          validityPeriod = this@with.validityPeriod,
          numberOfRepeatsAllowed = this@with.numberOfRepeatsAllowed?.value,
          _numberOfRepeatsAllowed = this@with.numberOfRepeatsAllowed?.toElement(),
          quantity = this@with.quantity,
          expectedSupplyDuration = this@with.expectedSupplyDuration,
          dispenser = this@with.dispenser,
          dispenserInstruction =
            this@with.dispenserInstruction.takeUnless { it.all { it == null } },
          doseAdministrationAid = this@with.doseAdministrationAid,
        )
      }
  }
}

@Serializable
internal data class MedicationRequestSubstitutionSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var allowedBoolean: KotlinBoolean? = null,
  public var _allowedBoolean: Element? = null,
  public var allowedCodeableConcept: CodeableConcept? = null,
  public var reason: CodeableConcept? = null,
) {
  public fun toModel(): MedicationRequest.Substitution =
    MedicationRequest.Substitution(
      id = this@MedicationRequestSubstitutionSurrogate.id,
      extension = this@MedicationRequestSubstitutionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationRequestSubstitutionSurrogate.modifierExtension ?: mutableListOf(),
      allowed =
        MedicationRequest.Substitution.Allowed.from(
          R5Boolean.of(
            this@MedicationRequestSubstitutionSurrogate.allowedBoolean,
            this@MedicationRequestSubstitutionSurrogate._allowedBoolean,
          ),
          this@MedicationRequestSubstitutionSurrogate.allowedCodeableConcept,
        )!!,
      reason = this@MedicationRequestSubstitutionSurrogate.reason,
    )

  public companion object {
    public fun fromModel(
      model: MedicationRequest.Substitution
    ): MedicationRequestSubstitutionSurrogate =
      with(model) {
        MedicationRequestSubstitutionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          allowedBoolean = this@with.allowed?.asBoolean()?.value?.value,
          _allowedBoolean = this@with.allowed?.asBoolean()?.value?.toElement(),
          allowedCodeableConcept = this@with.allowed?.asCodeableConcept()?.value,
          reason = this@with.reason,
        )
      }
  }
}

@Serializable
internal data class MedicationRequestSurrogate(
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
  public var priorPrescription: Reference? = null,
  public var groupIdentifier: Identifier? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var statusChanged: String? = null,
  public var _statusChanged: Element? = null,
  public var intent: String? = null,
  public var _intent: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var priority: String? = null,
  public var _priority: Element? = null,
  public var doNotPerform: KotlinBoolean? = null,
  public var _doNotPerform: Element? = null,
  public var medication: CodeableReference,
  public var subject: Reference,
  public var informationSource: MutableList<Reference>? = null,
  public var encounter: Reference? = null,
  public var supportingInformation: MutableList<Reference>? = null,
  public var authoredOn: String? = null,
  public var _authoredOn: Element? = null,
  public var requester: Reference? = null,
  public var reported: KotlinBoolean? = null,
  public var _reported: Element? = null,
  public var performerType: CodeableConcept? = null,
  public var performer: MutableList<Reference>? = null,
  public var device: MutableList<CodeableReference>? = null,
  public var recorder: Reference? = null,
  public var reason: MutableList<CodeableReference>? = null,
  public var courseOfTherapyType: CodeableConcept? = null,
  public var insurance: MutableList<Reference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var renderedDosageInstruction: String? = null,
  public var _renderedDosageInstruction: Element? = null,
  public var effectiveDosePeriod: Period? = null,
  public var dosageInstruction: MutableList<Dosage>? = null,
  public var dispenseRequest: MedicationRequest.DispenseRequest? = null,
  public var substitution: MedicationRequest.Substitution? = null,
  public var eventHistory: MutableList<Reference>? = null,
) {
  public fun toModel(): MedicationRequest =
    MedicationRequest(
      id = this@MedicationRequestSurrogate.id,
      meta = this@MedicationRequestSurrogate.meta,
      implicitRules =
        Uri.of(
          this@MedicationRequestSurrogate.implicitRules,
          this@MedicationRequestSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@MedicationRequestSurrogate.language,
          this@MedicationRequestSurrogate._language,
        ),
      text = this@MedicationRequestSurrogate.text,
      contained = this@MedicationRequestSurrogate.contained ?: mutableListOf(),
      extension = this@MedicationRequestSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MedicationRequestSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@MedicationRequestSurrogate.identifier ?: mutableListOf(),
      basedOn = this@MedicationRequestSurrogate.basedOn ?: mutableListOf(),
      priorPrescription = this@MedicationRequestSurrogate.priorPrescription,
      groupIdentifier = this@MedicationRequestSurrogate.groupIdentifier,
      status =
        Enumeration.of(
          com.google.fhir.model.r5.MedicationRequest.MedicationRequestStatus.fromCode(
            this@MedicationRequestSurrogate.status!!
          ),
          this@MedicationRequestSurrogate._status,
        ),
      statusReason = this@MedicationRequestSurrogate.statusReason,
      statusChanged =
        DateTime.of(
          FhirDateTime.fromString(this@MedicationRequestSurrogate.statusChanged),
          this@MedicationRequestSurrogate._statusChanged,
        ),
      intent =
        Enumeration.of(
          com.google.fhir.model.r5.MedicationRequest.MedicationRequestIntent.fromCode(
            this@MedicationRequestSurrogate.intent!!
          ),
          this@MedicationRequestSurrogate._intent,
        ),
      category = this@MedicationRequestSurrogate.category ?: mutableListOf(),
      priority =
        this@MedicationRequestSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r5.MedicationRequest.MedicationRequestPriority.fromCode(it!!),
            this@MedicationRequestSurrogate._priority,
          )
        },
      doNotPerform =
        R5Boolean.of(
          this@MedicationRequestSurrogate.doNotPerform,
          this@MedicationRequestSurrogate._doNotPerform,
        ),
      medication = this@MedicationRequestSurrogate.medication,
      subject = this@MedicationRequestSurrogate.subject,
      informationSource = this@MedicationRequestSurrogate.informationSource ?: mutableListOf(),
      encounter = this@MedicationRequestSurrogate.encounter,
      supportingInformation =
        this@MedicationRequestSurrogate.supportingInformation ?: mutableListOf(),
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@MedicationRequestSurrogate.authoredOn),
          this@MedicationRequestSurrogate._authoredOn,
        ),
      requester = this@MedicationRequestSurrogate.requester,
      reported =
        R5Boolean.of(
          this@MedicationRequestSurrogate.reported,
          this@MedicationRequestSurrogate._reported,
        ),
      performerType = this@MedicationRequestSurrogate.performerType,
      performer = this@MedicationRequestSurrogate.performer ?: mutableListOf(),
      device = this@MedicationRequestSurrogate.device ?: mutableListOf(),
      recorder = this@MedicationRequestSurrogate.recorder,
      reason = this@MedicationRequestSurrogate.reason ?: mutableListOf(),
      courseOfTherapyType = this@MedicationRequestSurrogate.courseOfTherapyType,
      insurance = this@MedicationRequestSurrogate.insurance ?: mutableListOf(),
      note = this@MedicationRequestSurrogate.note ?: mutableListOf(),
      renderedDosageInstruction =
        Markdown.of(
          this@MedicationRequestSurrogate.renderedDosageInstruction,
          this@MedicationRequestSurrogate._renderedDosageInstruction,
        ),
      effectiveDosePeriod = this@MedicationRequestSurrogate.effectiveDosePeriod,
      dosageInstruction = this@MedicationRequestSurrogate.dosageInstruction ?: mutableListOf(),
      dispenseRequest = this@MedicationRequestSurrogate.dispenseRequest,
      substitution = this@MedicationRequestSurrogate.substitution,
      eventHistory = this@MedicationRequestSurrogate.eventHistory ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: MedicationRequest): MedicationRequestSurrogate =
      with(model) {
        MedicationRequestSurrogate(
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
          priorPrescription = this@with.priorPrescription,
          groupIdentifier = this@with.groupIdentifier,
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          statusReason = this@with.statusReason,
          statusChanged = this@with.statusChanged?.value?.toString(),
          _statusChanged = this@with.statusChanged?.toElement(),
          intent = this@with.intent.value?.getCode(),
          _intent = this@with.intent.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          priority = this@with.priority?.value?.getCode(),
          _priority = this@with.priority?.toElement(),
          doNotPerform = this@with.doNotPerform?.value,
          _doNotPerform = this@with.doNotPerform?.toElement(),
          medication = this@with.medication,
          subject = this@with.subject,
          informationSource = this@with.informationSource.takeUnless { it.all { it == null } },
          encounter = this@with.encounter,
          supportingInformation =
            this@with.supportingInformation.takeUnless { it.all { it == null } },
          authoredOn = this@with.authoredOn?.value?.toString(),
          _authoredOn = this@with.authoredOn?.toElement(),
          requester = this@with.requester,
          reported = this@with.reported?.value,
          _reported = this@with.reported?.toElement(),
          performerType = this@with.performerType,
          performer = this@with.performer.takeUnless { it.all { it == null } },
          device = this@with.device.takeUnless { it.all { it == null } },
          recorder = this@with.recorder,
          reason = this@with.reason.takeUnless { it.all { it == null } },
          courseOfTherapyType = this@with.courseOfTherapyType,
          insurance = this@with.insurance.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          renderedDosageInstruction = this@with.renderedDosageInstruction?.value,
          _renderedDosageInstruction = this@with.renderedDosageInstruction?.toElement(),
          effectiveDosePeriod = this@with.effectiveDosePeriod,
          dosageInstruction = this@with.dosageInstruction.takeUnless { it.all { it == null } },
          dispenseRequest = this@with.dispenseRequest,
          substitution = this@with.substitution,
          eventHistory = this@with.eventHistory.takeUnless { it.all { it == null } },
        )
      }
  }
}
