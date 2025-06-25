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
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Dosage
import com.google.fhir.model.r4.Duration
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.MedicationRequest
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.UnsignedInt
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicationRequestDispenseRequestInitialFillSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var quantity: Quantity? = null,
  public var duration: Duration? = null,
) {
  public fun toModel(): MedicationRequest.DispenseRequest.InitialFill =
    MedicationRequest.DispenseRequest.InitialFill().apply {
      id = this@MedicationRequestDispenseRequestInitialFillSurrogate.id
      extension = this@MedicationRequestDispenseRequestInitialFillSurrogate.extension
      modifierExtension =
        this@MedicationRequestDispenseRequestInitialFillSurrogate.modifierExtension
      quantity = this@MedicationRequestDispenseRequestInitialFillSurrogate.quantity
      duration = this@MedicationRequestDispenseRequestInitialFillSurrogate.duration
    }

  public companion object {
    public fun fromModel(
      model: MedicationRequest.DispenseRequest.InitialFill
    ): MedicationRequestDispenseRequestInitialFillSurrogate =
      with(model) {
        MedicationRequestDispenseRequestInitialFillSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          quantity = this@with.quantity
          duration = this@with.duration
        }
      }
  }
}

@Serializable
internal data class MedicationRequestDispenseRequestSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
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
    MedicationRequest.DispenseRequest().apply {
      id = this@MedicationRequestDispenseRequestSurrogate.id
      extension = this@MedicationRequestDispenseRequestSurrogate.extension
      modifierExtension = this@MedicationRequestDispenseRequestSurrogate.modifierExtension
      initialFill = this@MedicationRequestDispenseRequestSurrogate.initialFill
      dispenseInterval = this@MedicationRequestDispenseRequestSurrogate.dispenseInterval
      validityPeriod = this@MedicationRequestDispenseRequestSurrogate.validityPeriod
      numberOfRepeatsAllowed =
        UnsignedInt.of(
          this@MedicationRequestDispenseRequestSurrogate.numberOfRepeatsAllowed,
          this@MedicationRequestDispenseRequestSurrogate._numberOfRepeatsAllowed,
        )
      quantity = this@MedicationRequestDispenseRequestSurrogate.quantity
      expectedSupplyDuration = this@MedicationRequestDispenseRequestSurrogate.expectedSupplyDuration
      performer = this@MedicationRequestDispenseRequestSurrogate.performer
    }

  public companion object {
    public fun fromModel(
      model: MedicationRequest.DispenseRequest
    ): MedicationRequestDispenseRequestSurrogate =
      with(model) {
        MedicationRequestDispenseRequestSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          initialFill = this@with.initialFill
          dispenseInterval = this@with.dispenseInterval
          validityPeriod = this@with.validityPeriod
          numberOfRepeatsAllowed = this@with.numberOfRepeatsAllowed?.value
          _numberOfRepeatsAllowed = this@with.numberOfRepeatsAllowed?.toElement()
          quantity = this@with.quantity
          expectedSupplyDuration = this@with.expectedSupplyDuration
          performer = this@with.performer
        }
      }
  }
}

@Serializable
internal data class MedicationRequestSubstitutionSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var allowedBoolean: KotlinBoolean? = null,
  public var _allowedBoolean: Element? = null,
  public var allowedCodeableConcept: CodeableConcept? = null,
  public var reason: CodeableConcept? = null,
) {
  public fun toModel(): MedicationRequest.Substitution =
    MedicationRequest.Substitution().apply {
      id = this@MedicationRequestSubstitutionSurrogate.id
      extension = this@MedicationRequestSubstitutionSurrogate.extension
      modifierExtension = this@MedicationRequestSubstitutionSurrogate.modifierExtension
      allowed =
        MedicationRequest.Substitution.Allowed?.from(
          R4Boolean.of(
            this@MedicationRequestSubstitutionSurrogate.allowedBoolean,
            this@MedicationRequestSubstitutionSurrogate._allowedBoolean,
          ),
          this@MedicationRequestSubstitutionSurrogate.allowedCodeableConcept,
        )
      reason = this@MedicationRequestSubstitutionSurrogate.reason
    }

  public companion object {
    public fun fromModel(
      model: MedicationRequest.Substitution
    ): MedicationRequestSubstitutionSurrogate =
      with(model) {
        MedicationRequestSubstitutionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          allowedBoolean = this@with.allowed?.asBoolean()?.value?.value
          _allowedBoolean = this@with.allowed?.asBoolean()?.value?.toElement()
          allowedCodeableConcept = this@with.allowed?.asCodeableConcept()?.value
          reason = this@with.reason
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var intent: String? = null,
  public var _intent: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var priority: String? = null,
  public var _priority: Element? = null,
  public var doNotPerform: KotlinBoolean? = null,
  public var _doNotPerform: Element? = null,
  public var reportedBoolean: KotlinBoolean? = null,
  public var _reportedBoolean: Element? = null,
  public var reportedReference: Reference? = null,
  public var medicationCodeableConcept: CodeableConcept? = null,
  public var medicationReference: Reference? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var supportingInformation: List<Reference?>? = null,
  public var authoredOn: String? = null,
  public var _authoredOn: Element? = null,
  public var requester: Reference? = null,
  public var performer: Reference? = null,
  public var performerType: CodeableConcept? = null,
  public var recorder: Reference? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var reasonReference: List<Reference?>? = null,
  public var instantiatesCanonical: List<String?>? = null,
  public var _instantiatesCanonical: List<Element?>? = null,
  public var instantiatesUri: List<String?>? = null,
  public var _instantiatesUri: List<Element?>? = null,
  public var basedOn: List<Reference?>? = null,
  public var groupIdentifier: Identifier? = null,
  public var courseOfTherapyType: CodeableConcept? = null,
  public var insurance: List<Reference?>? = null,
  public var note: List<Annotation?>? = null,
  public var dosageInstruction: List<Dosage?>? = null,
  public var dispenseRequest: MedicationRequest.DispenseRequest? = null,
  public var substitution: MedicationRequest.Substitution? = null,
  public var priorPrescription: Reference? = null,
  public var detectedIssue: List<Reference?>? = null,
  public var eventHistory: List<Reference?>? = null,
) {
  public fun toModel(): MedicationRequest =
    MedicationRequest().apply {
      id = this@MedicationRequestSurrogate.id
      meta = this@MedicationRequestSurrogate.meta
      implicitRules =
        Uri.of(
          this@MedicationRequestSurrogate.implicitRules,
          this@MedicationRequestSurrogate._implicitRules,
        )
      language =
        Code.of(this@MedicationRequestSurrogate.language, this@MedicationRequestSurrogate._language)
      text = this@MedicationRequestSurrogate.text
      contained = this@MedicationRequestSurrogate.contained
      extension = this@MedicationRequestSurrogate.extension
      modifierExtension = this@MedicationRequestSurrogate.modifierExtension
      identifier = this@MedicationRequestSurrogate.identifier
      status =
        Enumeration.of(
          this@MedicationRequestSurrogate.status?.let {
            com.google.fhir.model.r4.MedicationRequest.MedicationRequestStatus.fromCode(it)
          },
          this@MedicationRequestSurrogate._status,
        )
      statusReason = this@MedicationRequestSurrogate.statusReason
      intent =
        Enumeration.of(
          this@MedicationRequestSurrogate.intent?.let {
            com.google.fhir.model.r4.MedicationRequest.MedicationRequestIntent.fromCode(it)
          },
          this@MedicationRequestSurrogate._intent,
        )
      category = this@MedicationRequestSurrogate.category
      priority =
        Enumeration.of(
          this@MedicationRequestSurrogate.priority?.let {
            com.google.fhir.model.r4.MedicationRequest.MedicationRequestPriority.fromCode(it)
          },
          this@MedicationRequestSurrogate._priority,
        )
      doNotPerform =
        R4Boolean.of(
          this@MedicationRequestSurrogate.doNotPerform,
          this@MedicationRequestSurrogate._doNotPerform,
        )
      reported =
        MedicationRequest.Reported?.from(
          R4Boolean.of(
            this@MedicationRequestSurrogate.reportedBoolean,
            this@MedicationRequestSurrogate._reportedBoolean,
          ),
          this@MedicationRequestSurrogate.reportedReference,
        )
      medication =
        MedicationRequest.Medication?.from(
          this@MedicationRequestSurrogate.medicationCodeableConcept,
          this@MedicationRequestSurrogate.medicationReference,
        )
      subject = this@MedicationRequestSurrogate.subject
      encounter = this@MedicationRequestSurrogate.encounter
      supportingInformation = this@MedicationRequestSurrogate.supportingInformation
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@MedicationRequestSurrogate.authoredOn),
          this@MedicationRequestSurrogate._authoredOn,
        )
      requester = this@MedicationRequestSurrogate.requester
      performer = this@MedicationRequestSurrogate.performer
      performerType = this@MedicationRequestSurrogate.performerType
      recorder = this@MedicationRequestSurrogate.recorder
      reasonCode = this@MedicationRequestSurrogate.reasonCode
      reasonReference = this@MedicationRequestSurrogate.reasonReference
      instantiatesCanonical =
        if (
          this@MedicationRequestSurrogate.instantiatesCanonical == null &&
            this@MedicationRequestSurrogate._instantiatesCanonical == null
        ) {
          null
        } else {
          (this@MedicationRequestSurrogate.instantiatesCanonical
              ?: List(this@MedicationRequestSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@MedicationRequestSurrogate._instantiatesCanonical
                ?: List(this@MedicationRequestSurrogate.instantiatesCanonical!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      instantiatesUri =
        if (
          this@MedicationRequestSurrogate.instantiatesUri == null &&
            this@MedicationRequestSurrogate._instantiatesUri == null
        ) {
          null
        } else {
          (this@MedicationRequestSurrogate.instantiatesUri
              ?: List(this@MedicationRequestSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@MedicationRequestSurrogate._instantiatesUri
                ?: List(this@MedicationRequestSurrogate.instantiatesUri!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      basedOn = this@MedicationRequestSurrogate.basedOn
      groupIdentifier = this@MedicationRequestSurrogate.groupIdentifier
      courseOfTherapyType = this@MedicationRequestSurrogate.courseOfTherapyType
      insurance = this@MedicationRequestSurrogate.insurance
      note = this@MedicationRequestSurrogate.note
      dosageInstruction = this@MedicationRequestSurrogate.dosageInstruction
      dispenseRequest = this@MedicationRequestSurrogate.dispenseRequest
      substitution = this@MedicationRequestSurrogate.substitution
      priorPrescription = this@MedicationRequestSurrogate.priorPrescription
      detectedIssue = this@MedicationRequestSurrogate.detectedIssue
      eventHistory = this@MedicationRequestSurrogate.eventHistory
    }

  public companion object {
    public fun fromModel(model: MedicationRequest): MedicationRequestSurrogate =
      with(model) {
        MedicationRequestSurrogate().apply {
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
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          statusReason = this@with.statusReason
          intent = this@with.intent?.value?.getCode()
          _intent = this@with.intent?.toElement()
          category = this@with.category
          priority = this@with.priority?.value?.getCode()
          _priority = this@with.priority?.toElement()
          doNotPerform = this@with.doNotPerform?.value
          _doNotPerform = this@with.doNotPerform?.toElement()
          reportedBoolean = this@with.reported?.asBoolean()?.value?.value
          _reportedBoolean = this@with.reported?.asBoolean()?.value?.toElement()
          reportedReference = this@with.reported?.asReference()?.value
          medicationCodeableConcept = this@with.medication?.asCodeableConcept()?.value
          medicationReference = this@with.medication?.asReference()?.value
          subject = this@with.subject
          encounter = this@with.encounter
          supportingInformation = this@with.supportingInformation
          authoredOn = this@with.authoredOn?.value?.toString()
          _authoredOn = this@with.authoredOn?.toElement()
          requester = this@with.requester
          performer = this@with.performer
          performerType = this@with.performerType
          recorder = this@with.recorder
          reasonCode = this@with.reasonCode
          reasonReference = this@with.reasonReference
          instantiatesCanonical =
            this@with.instantiatesCanonical?.map { it?.value }?.takeUnless { it.all { it == null } }
          _instantiatesCanonical =
            this@with.instantiatesCanonical
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          instantiatesUri =
            this@with.instantiatesUri?.map { it?.value }?.takeUnless { it.all { it == null } }
          _instantiatesUri =
            this@with.instantiatesUri?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          basedOn = this@with.basedOn
          groupIdentifier = this@with.groupIdentifier
          courseOfTherapyType = this@with.courseOfTherapyType
          insurance = this@with.insurance
          note = this@with.note
          dosageInstruction = this@with.dosageInstruction
          dispenseRequest = this@with.dispenseRequest
          substitution = this@with.substitution
          priorPrescription = this@with.priorPrescription
          detectedIssue = this@with.detectedIssue
          eventHistory = this@with.eventHistory
        }
      }
  }
}
