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

import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Date
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDate
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Signature
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.VerificationResult
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class VerificationResultPrimarySourceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var who: Reference? = null,
  public var type: List<CodeableConcept?>? = null,
  public var communicationMethod: List<CodeableConcept?>? = null,
  public var validationStatus: CodeableConcept? = null,
  public var validationDate: KotlinString? = null,
  public var _validationDate: Element? = null,
  public var canPushUpdates: CodeableConcept? = null,
  public var pushTypeAvailable: List<CodeableConcept?>? = null,
) {
  public fun toModel(): VerificationResult.PrimarySource =
    VerificationResult.PrimarySource().apply {
      id = this@VerificationResultPrimarySourceSurrogate.id
      extension = this@VerificationResultPrimarySourceSurrogate.extension
      modifierExtension = this@VerificationResultPrimarySourceSurrogate.modifierExtension
      who = this@VerificationResultPrimarySourceSurrogate.who
      type = this@VerificationResultPrimarySourceSurrogate.type
      communicationMethod = this@VerificationResultPrimarySourceSurrogate.communicationMethod
      validationStatus = this@VerificationResultPrimarySourceSurrogate.validationStatus
      validationDate =
        DateTime.of(
          FhirDateTime.fromString(this@VerificationResultPrimarySourceSurrogate.validationDate),
          this@VerificationResultPrimarySourceSurrogate._validationDate,
        )
      canPushUpdates = this@VerificationResultPrimarySourceSurrogate.canPushUpdates
      pushTypeAvailable = this@VerificationResultPrimarySourceSurrogate.pushTypeAvailable
    }

  public companion object {
    public fun fromModel(
      model: VerificationResult.PrimarySource
    ): VerificationResultPrimarySourceSurrogate =
      with(model) {
        VerificationResultPrimarySourceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          who = this@with.who
          type = this@with.type
          communicationMethod = this@with.communicationMethod
          validationStatus = this@with.validationStatus
          validationDate = this@with.validationDate?.value?.toString()
          _validationDate = this@with.validationDate?.toElement()
          canPushUpdates = this@with.canPushUpdates
          pushTypeAvailable = this@with.pushTypeAvailable
        }
      }
  }
}

@Serializable
internal data class VerificationResultAttestationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var who: Reference? = null,
  public var onBehalfOf: Reference? = null,
  public var communicationMethod: CodeableConcept? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var sourceIdentityCertificate: KotlinString? = null,
  public var _sourceIdentityCertificate: Element? = null,
  public var proxyIdentityCertificate: KotlinString? = null,
  public var _proxyIdentityCertificate: Element? = null,
  public var proxySignature: Signature? = null,
  public var sourceSignature: Signature? = null,
) {
  public fun toModel(): VerificationResult.Attestation =
    VerificationResult.Attestation().apply {
      id = this@VerificationResultAttestationSurrogate.id
      extension = this@VerificationResultAttestationSurrogate.extension
      modifierExtension = this@VerificationResultAttestationSurrogate.modifierExtension
      who = this@VerificationResultAttestationSurrogate.who
      onBehalfOf = this@VerificationResultAttestationSurrogate.onBehalfOf
      communicationMethod = this@VerificationResultAttestationSurrogate.communicationMethod
      date =
        Date.of(
          FhirDate.fromString(this@VerificationResultAttestationSurrogate.date),
          this@VerificationResultAttestationSurrogate._date,
        )
      sourceIdentityCertificate =
        R4bString.of(
          this@VerificationResultAttestationSurrogate.sourceIdentityCertificate,
          this@VerificationResultAttestationSurrogate._sourceIdentityCertificate,
        )
      proxyIdentityCertificate =
        R4bString.of(
          this@VerificationResultAttestationSurrogate.proxyIdentityCertificate,
          this@VerificationResultAttestationSurrogate._proxyIdentityCertificate,
        )
      proxySignature = this@VerificationResultAttestationSurrogate.proxySignature
      sourceSignature = this@VerificationResultAttestationSurrogate.sourceSignature
    }

  public companion object {
    public fun fromModel(
      model: VerificationResult.Attestation
    ): VerificationResultAttestationSurrogate =
      with(model) {
        VerificationResultAttestationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          who = this@with.who
          onBehalfOf = this@with.onBehalfOf
          communicationMethod = this@with.communicationMethod
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          sourceIdentityCertificate = this@with.sourceIdentityCertificate?.value
          _sourceIdentityCertificate = this@with.sourceIdentityCertificate?.toElement()
          proxyIdentityCertificate = this@with.proxyIdentityCertificate?.value
          _proxyIdentityCertificate = this@with.proxyIdentityCertificate?.toElement()
          proxySignature = this@with.proxySignature
          sourceSignature = this@with.sourceSignature
        }
      }
  }
}

@Serializable
internal data class VerificationResultValidatorSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var organization: Reference? = null,
  public var identityCertificate: KotlinString? = null,
  public var _identityCertificate: Element? = null,
  public var attestationSignature: Signature? = null,
) {
  public fun toModel(): VerificationResult.Validator =
    VerificationResult.Validator().apply {
      id = this@VerificationResultValidatorSurrogate.id
      extension = this@VerificationResultValidatorSurrogate.extension
      modifierExtension = this@VerificationResultValidatorSurrogate.modifierExtension
      organization = this@VerificationResultValidatorSurrogate.organization
      identityCertificate =
        R4bString.of(
          this@VerificationResultValidatorSurrogate.identityCertificate,
          this@VerificationResultValidatorSurrogate._identityCertificate,
        )
      attestationSignature = this@VerificationResultValidatorSurrogate.attestationSignature
    }

  public companion object {
    public fun fromModel(
      model: VerificationResult.Validator
    ): VerificationResultValidatorSurrogate =
      with(model) {
        VerificationResultValidatorSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          organization = this@with.organization
          identityCertificate = this@with.identityCertificate?.value
          _identityCertificate = this@with.identityCertificate?.toElement()
          attestationSignature = this@with.attestationSignature
        }
      }
  }
}

@Serializable
internal data class VerificationResultSurrogate(
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
  public var target: List<Reference?>? = null,
  public var targetLocation: List<KotlinString?>? = null,
  public var _targetLocation: List<Element?>? = null,
  public var need: CodeableConcept? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusDate: KotlinString? = null,
  public var _statusDate: Element? = null,
  public var validationType: CodeableConcept? = null,
  public var validationProcess: List<CodeableConcept?>? = null,
  public var frequency: Timing? = null,
  public var lastPerformed: KotlinString? = null,
  public var _lastPerformed: Element? = null,
  public var nextScheduled: KotlinString? = null,
  public var _nextScheduled: Element? = null,
  public var failureAction: CodeableConcept? = null,
  public var primarySource: List<VerificationResult.PrimarySource>? = null,
  public var attestation: VerificationResult.Attestation? = null,
  public var validator: List<VerificationResult.Validator>? = null,
) {
  public fun toModel(): VerificationResult =
    VerificationResult().apply {
      id = this@VerificationResultSurrogate.id
      meta = this@VerificationResultSurrogate.meta
      implicitRules =
        Uri.of(
          this@VerificationResultSurrogate.implicitRules,
          this@VerificationResultSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@VerificationResultSurrogate.language,
          this@VerificationResultSurrogate._language,
        )
      text = this@VerificationResultSurrogate.text
      contained = this@VerificationResultSurrogate.contained
      extension = this@VerificationResultSurrogate.extension
      modifierExtension = this@VerificationResultSurrogate.modifierExtension
      target = this@VerificationResultSurrogate.target
      targetLocation =
        if (
          this@VerificationResultSurrogate.targetLocation == null &&
            this@VerificationResultSurrogate._targetLocation == null
        ) {
          null
        } else {
          (this@VerificationResultSurrogate.targetLocation
              ?: List(this@VerificationResultSurrogate._targetLocation!!.size) { null })
            .zip(
              this@VerificationResultSurrogate._targetLocation
                ?: List(this@VerificationResultSurrogate.targetLocation!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      need = this@VerificationResultSurrogate.need
      status =
        Enumeration.of(
          this@VerificationResultSurrogate.status?.let {
            com.google.fhir.model.r4b.VerificationResult.Status.fromCode(it)
          },
          this@VerificationResultSurrogate._status,
        )
      statusDate =
        DateTime.of(
          FhirDateTime.fromString(this@VerificationResultSurrogate.statusDate),
          this@VerificationResultSurrogate._statusDate,
        )
      validationType = this@VerificationResultSurrogate.validationType
      validationProcess = this@VerificationResultSurrogate.validationProcess
      frequency = this@VerificationResultSurrogate.frequency
      lastPerformed =
        DateTime.of(
          FhirDateTime.fromString(this@VerificationResultSurrogate.lastPerformed),
          this@VerificationResultSurrogate._lastPerformed,
        )
      nextScheduled =
        Date.of(
          FhirDate.fromString(this@VerificationResultSurrogate.nextScheduled),
          this@VerificationResultSurrogate._nextScheduled,
        )
      failureAction = this@VerificationResultSurrogate.failureAction
      primarySource = this@VerificationResultSurrogate.primarySource
      attestation = this@VerificationResultSurrogate.attestation
      validator = this@VerificationResultSurrogate.validator
    }

  public companion object {
    public fun fromModel(model: VerificationResult): VerificationResultSurrogate =
      with(model) {
        VerificationResultSurrogate().apply {
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
          target = this@with.target
          targetLocation =
            this@with.targetLocation?.map { it?.value }?.takeUnless { it.all { it == null } }
          _targetLocation =
            this@with.targetLocation?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          need = this@with.need
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          statusDate = this@with.statusDate?.value?.toString()
          _statusDate = this@with.statusDate?.toElement()
          validationType = this@with.validationType
          validationProcess = this@with.validationProcess
          frequency = this@with.frequency
          lastPerformed = this@with.lastPerformed?.value?.toString()
          _lastPerformed = this@with.lastPerformed?.toElement()
          nextScheduled = this@with.nextScheduled?.value?.toString()
          _nextScheduled = this@with.nextScheduled?.toElement()
          failureAction = this@with.failureAction
          primarySource = this@with.primarySource
          attestation = this@with.attestation
          validator = this@with.validator
        }
      }
  }
}
