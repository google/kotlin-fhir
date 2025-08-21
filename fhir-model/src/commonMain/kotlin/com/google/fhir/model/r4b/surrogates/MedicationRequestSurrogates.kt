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
import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Dosage
import com.google.fhir.model.r4b.Duration
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.MedicationRequest
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.UnsignedInt
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
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
  public var performer: Reference? = null,
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
      performer = this@MedicationRequestDispenseRequestSurrogate.performer,
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
          performer = this@with.performer,
        )
      }
  }
}

@Serializable
internal data class MedicationRequestSubstitutionAllowedSurrogate(
  public var allowedBoolean: KotlinBoolean? = null,
  public var _allowedBoolean: Element? = null,
  public var allowedCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): MedicationRequest.Substitution.Allowed =
    MedicationRequest.Substitution.Allowed.from(
      R4bBoolean.of(
        this@MedicationRequestSubstitutionAllowedSurrogate.allowedBoolean,
        this@MedicationRequestSubstitutionAllowedSurrogate._allowedBoolean,
      ),
      this@MedicationRequestSubstitutionAllowedSurrogate.allowedCodeableConcept,
    )!! !!

  public companion object {
    public fun fromModel(
      model: MedicationRequest.Substitution.Allowed
    ): MedicationRequestSubstitutionAllowedSurrogate =
      with(model) {
        MedicationRequestSubstitutionAllowedSurrogate(
          allowedBoolean = this@with.asBoolean()?.value?.value,
          _allowedBoolean = this@with.asBoolean()?.value?.toElement(),
          allowedCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class MedicationRequestSubstitutionSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var allowed: MedicationRequest.Substitution.Allowed,
  public var reason: CodeableConcept? = null,
) {
  public fun toModel(): MedicationRequest.Substitution =
    MedicationRequest.Substitution(
      id = this@MedicationRequestSubstitutionSurrogate.id,
      extension = this@MedicationRequestSubstitutionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicationRequestSubstitutionSurrogate.modifierExtension ?: mutableListOf(),
      allowed = this@MedicationRequestSubstitutionSurrogate.allowed,
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
          allowed = this@with.allowed,
          reason = this@with.reason,
        )
      }
  }
}

@Serializable
internal data class MedicationRequestReportedSurrogate(
  public var reportedBoolean: KotlinBoolean? = null,
  public var _reportedBoolean: Element? = null,
  public var reportedReference: Reference? = null,
) {
  public fun toModel(): MedicationRequest.Reported =
    MedicationRequest.Reported?.from(
      R4bBoolean.of(
        this@MedicationRequestReportedSurrogate.reportedBoolean,
        this@MedicationRequestReportedSurrogate._reportedBoolean,
      ),
      this@MedicationRequestReportedSurrogate.reportedReference,
    )!!

  public companion object {
    public fun fromModel(model: MedicationRequest.Reported): MedicationRequestReportedSurrogate =
      with(model) {
        MedicationRequestReportedSurrogate(
          reportedBoolean = this@with.asBoolean()?.value?.value,
          _reportedBoolean = this@with.asBoolean()?.value?.toElement(),
          reportedReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class MedicationRequestMedicationSurrogate(
  public var medicationCodeableConcept: CodeableConcept? = null,
  public var medicationReference: Reference? = null,
) {
  public fun toModel(): MedicationRequest.Medication =
    MedicationRequest.Medication.from(
      this@MedicationRequestMedicationSurrogate.medicationCodeableConcept,
      this@MedicationRequestMedicationSurrogate.medicationReference,
    )!! !!

  public companion object {
    public fun fromModel(
      model: MedicationRequest.Medication
    ): MedicationRequestMedicationSurrogate =
      with(model) {
        MedicationRequestMedicationSurrogate(
          medicationCodeableConcept = this@with.asCodeableConcept()?.value,
          medicationReference = this@with.asReference()?.value,
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
  public var status: String? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var intent: String? = null,
  public var _intent: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var priority: String? = null,
  public var _priority: Element? = null,
  public var doNotPerform: KotlinBoolean? = null,
  public var _doNotPerform: Element? = null,
  public var reported: MedicationRequest.Reported? = null,
  public var medication: MedicationRequest.Medication,
  public var subject: Reference,
  public var encounter: Reference? = null,
  public var supportingInformation: MutableList<Reference>? = null,
  public var authoredOn: String? = null,
  public var _authoredOn: Element? = null,
  public var requester: Reference? = null,
  public var performer: Reference? = null,
  public var performerType: CodeableConcept? = null,
  public var recorder: Reference? = null,
  public var reasonCode: MutableList<CodeableConcept>? = null,
  public var reasonReference: MutableList<Reference>? = null,
  public var instantiatesCanonical: MutableList<String?>? = null,
  public var _instantiatesCanonical: MutableList<Element?>? = null,
  public var instantiatesUri: MutableList<String?>? = null,
  public var _instantiatesUri: MutableList<Element?>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var groupIdentifier: Identifier? = null,
  public var courseOfTherapyType: CodeableConcept? = null,
  public var insurance: MutableList<Reference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var dosageInstruction: MutableList<Dosage>? = null,
  public var dispenseRequest: MedicationRequest.DispenseRequest? = null,
  public var substitution: MedicationRequest.Substitution? = null,
  public var priorPrescription: Reference? = null,
  public var detectedIssue: MutableList<Reference>? = null,
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
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.MedicationRequest.MedicationrequestStatus.fromCode(
            this@MedicationRequestSurrogate.status!!
          ),
          this@MedicationRequestSurrogate._status,
        ),
      statusReason = this@MedicationRequestSurrogate.statusReason,
      intent =
        Enumeration.of(
          com.google.fhir.model.r4b.MedicationRequest.MedicationRequestIntent.fromCode(
            this@MedicationRequestSurrogate.intent!!
          ),
          this@MedicationRequestSurrogate._intent,
        ),
      category = this@MedicationRequestSurrogate.category ?: mutableListOf(),
      priority =
        this@MedicationRequestSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.MedicationRequest.RequestPriority.fromCode(it!!),
            this@MedicationRequestSurrogate._priority,
          )
        },
      doNotPerform =
        R4bBoolean.of(
          this@MedicationRequestSurrogate.doNotPerform,
          this@MedicationRequestSurrogate._doNotPerform,
        ),
      reported = this@MedicationRequestSurrogate.reported,
      medication = this@MedicationRequestSurrogate.medication,
      subject = this@MedicationRequestSurrogate.subject,
      encounter = this@MedicationRequestSurrogate.encounter,
      supportingInformation =
        this@MedicationRequestSurrogate.supportingInformation ?: mutableListOf(),
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@MedicationRequestSurrogate.authoredOn),
          this@MedicationRequestSurrogate._authoredOn,
        ),
      requester = this@MedicationRequestSurrogate.requester,
      performer = this@MedicationRequestSurrogate.performer,
      performerType = this@MedicationRequestSurrogate.performerType,
      recorder = this@MedicationRequestSurrogate.recorder,
      reasonCode = this@MedicationRequestSurrogate.reasonCode ?: mutableListOf(),
      reasonReference = this@MedicationRequestSurrogate.reasonReference ?: mutableListOf(),
      instantiatesCanonical =
        if (
          this@MedicationRequestSurrogate.instantiatesCanonical == null &&
            this@MedicationRequestSurrogate._instantiatesCanonical == null
        ) {
          mutableListOf()
        } else {
          (this@MedicationRequestSurrogate.instantiatesCanonical
              ?: List(this@MedicationRequestSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@MedicationRequestSurrogate._instantiatesCanonical
                ?: List(this@MedicationRequestSurrogate.instantiatesCanonical!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      instantiatesUri =
        if (
          this@MedicationRequestSurrogate.instantiatesUri == null &&
            this@MedicationRequestSurrogate._instantiatesUri == null
        ) {
          mutableListOf()
        } else {
          (this@MedicationRequestSurrogate.instantiatesUri
              ?: List(this@MedicationRequestSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@MedicationRequestSurrogate._instantiatesUri
                ?: List(this@MedicationRequestSurrogate.instantiatesUri!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      basedOn = this@MedicationRequestSurrogate.basedOn ?: mutableListOf(),
      groupIdentifier = this@MedicationRequestSurrogate.groupIdentifier,
      courseOfTherapyType = this@MedicationRequestSurrogate.courseOfTherapyType,
      insurance = this@MedicationRequestSurrogate.insurance ?: mutableListOf(),
      note = this@MedicationRequestSurrogate.note ?: mutableListOf(),
      dosageInstruction = this@MedicationRequestSurrogate.dosageInstruction ?: mutableListOf(),
      dispenseRequest = this@MedicationRequestSurrogate.dispenseRequest,
      substitution = this@MedicationRequestSurrogate.substitution,
      priorPrescription = this@MedicationRequestSurrogate.priorPrescription,
      detectedIssue = this@MedicationRequestSurrogate.detectedIssue ?: mutableListOf(),
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
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          statusReason = this@with.statusReason,
          intent = this@with.intent.value?.getCode(),
          _intent = this@with.intent.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          priority = this@with.priority?.value?.getCode(),
          _priority = this@with.priority?.toElement(),
          doNotPerform = this@with.doNotPerform?.value,
          _doNotPerform = this@with.doNotPerform?.toElement(),
          reported = this@with.reported,
          medication = this@with.medication,
          subject = this@with.subject,
          encounter = this@with.encounter,
          supportingInformation =
            this@with.supportingInformation.takeUnless { it.all { it == null } },
          authoredOn = this@with.authoredOn?.value?.toString(),
          _authoredOn = this@with.authoredOn?.toElement(),
          requester = this@with.requester,
          performer = this@with.performer,
          performerType = this@with.performerType,
          recorder = this@with.recorder,
          reasonCode = this@with.reasonCode.takeUnless { it.all { it == null } },
          reasonReference = this@with.reasonReference.takeUnless { it.all { it == null } },
          instantiatesCanonical =
            this@with.instantiatesCanonical
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiatesCanonical =
            this@with.instantiatesCanonical
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          instantiatesUri =
            this@with.instantiatesUri
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiatesUri =
            this@with.instantiatesUri
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          groupIdentifier = this@with.groupIdentifier,
          courseOfTherapyType = this@with.courseOfTherapyType,
          insurance = this@with.insurance.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          dosageInstruction = this@with.dosageInstruction.takeUnless { it.all { it == null } },
          dispenseRequest = this@with.dispenseRequest,
          substitution = this@with.substitution,
          priorPrescription = this@with.priorPrescription,
          detectedIssue = this@with.detectedIssue.takeUnless { it.all { it == null } },
          eventHistory = this@with.eventHistory.takeUnless { it.all { it == null } },
        )
      }
  }
}
