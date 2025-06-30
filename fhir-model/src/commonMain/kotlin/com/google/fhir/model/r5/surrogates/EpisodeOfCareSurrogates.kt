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

import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.EpisodeOfCare
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class EpisodeOfCareStatusHistorySurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var period: Period? = null,
) {
  public fun toModel(): EpisodeOfCare.StatusHistory =
    EpisodeOfCare.StatusHistory().apply {
      id = this@EpisodeOfCareStatusHistorySurrogate.id
      extension = this@EpisodeOfCareStatusHistorySurrogate.extension
      modifierExtension = this@EpisodeOfCareStatusHistorySurrogate.modifierExtension
      status =
        Enumeration.of(
          this@EpisodeOfCareStatusHistorySurrogate.status?.let {
            com.google.fhir.model.r5.EpisodeOfCare.EpisodeOfCareStatus.fromCode(it)
          },
          this@EpisodeOfCareStatusHistorySurrogate._status,
        )
      period = this@EpisodeOfCareStatusHistorySurrogate.period
    }

  public companion object {
    public fun fromModel(model: EpisodeOfCare.StatusHistory): EpisodeOfCareStatusHistorySurrogate =
      with(model) {
        EpisodeOfCareStatusHistorySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          period = this@with.period
        }
      }
  }
}

@Serializable
internal data class EpisodeOfCareReasonSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var use: CodeableConcept? = null,
  public var `value`: List<CodeableReference?>? = null,
) {
  public fun toModel(): EpisodeOfCare.Reason =
    EpisodeOfCare.Reason().apply {
      id = this@EpisodeOfCareReasonSurrogate.id
      extension = this@EpisodeOfCareReasonSurrogate.extension
      modifierExtension = this@EpisodeOfCareReasonSurrogate.modifierExtension
      use = this@EpisodeOfCareReasonSurrogate.use
      `value` = this@EpisodeOfCareReasonSurrogate.`value`
    }

  public companion object {
    public fun fromModel(model: EpisodeOfCare.Reason): EpisodeOfCareReasonSurrogate =
      with(model) {
        EpisodeOfCareReasonSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          use = this@with.use
          `value` = this@with.`value`
        }
      }
  }
}

@Serializable
internal data class EpisodeOfCareDiagnosisSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var condition: List<CodeableReference?>? = null,
  public var use: CodeableConcept? = null,
) {
  public fun toModel(): EpisodeOfCare.Diagnosis =
    EpisodeOfCare.Diagnosis().apply {
      id = this@EpisodeOfCareDiagnosisSurrogate.id
      extension = this@EpisodeOfCareDiagnosisSurrogate.extension
      modifierExtension = this@EpisodeOfCareDiagnosisSurrogate.modifierExtension
      condition = this@EpisodeOfCareDiagnosisSurrogate.condition
      use = this@EpisodeOfCareDiagnosisSurrogate.use
    }

  public companion object {
    public fun fromModel(model: EpisodeOfCare.Diagnosis): EpisodeOfCareDiagnosisSurrogate =
      with(model) {
        EpisodeOfCareDiagnosisSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          condition = this@with.condition
          use = this@with.use
        }
      }
  }
}

@Serializable
internal data class EpisodeOfCareSurrogate(
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
  public var statusHistory: List<EpisodeOfCare.StatusHistory>? = null,
  public var type: List<CodeableConcept?>? = null,
  public var reason: List<EpisodeOfCare.Reason>? = null,
  public var diagnosis: List<EpisodeOfCare.Diagnosis>? = null,
  public var patient: Reference? = null,
  public var managingOrganization: Reference? = null,
  public var period: Period? = null,
  public var referralRequest: List<Reference?>? = null,
  public var careManager: Reference? = null,
  public var careTeam: List<Reference?>? = null,
  public var account: List<Reference?>? = null,
) {
  public fun toModel(): EpisodeOfCare =
    EpisodeOfCare().apply {
      id = this@EpisodeOfCareSurrogate.id
      meta = this@EpisodeOfCareSurrogate.meta
      implicitRules =
        Uri.of(
          this@EpisodeOfCareSurrogate.implicitRules,
          this@EpisodeOfCareSurrogate._implicitRules,
        )
      language =
        Code.of(this@EpisodeOfCareSurrogate.language, this@EpisodeOfCareSurrogate._language)
      text = this@EpisodeOfCareSurrogate.text
      contained = this@EpisodeOfCareSurrogate.contained
      extension = this@EpisodeOfCareSurrogate.extension
      modifierExtension = this@EpisodeOfCareSurrogate.modifierExtension
      identifier = this@EpisodeOfCareSurrogate.identifier
      status =
        Enumeration.of(
          this@EpisodeOfCareSurrogate.status?.let {
            com.google.fhir.model.r5.EpisodeOfCare.EpisodeOfCareStatus.fromCode(it)
          },
          this@EpisodeOfCareSurrogate._status,
        )
      statusHistory = this@EpisodeOfCareSurrogate.statusHistory
      type = this@EpisodeOfCareSurrogate.type
      reason = this@EpisodeOfCareSurrogate.reason
      diagnosis = this@EpisodeOfCareSurrogate.diagnosis
      patient = this@EpisodeOfCareSurrogate.patient
      managingOrganization = this@EpisodeOfCareSurrogate.managingOrganization
      period = this@EpisodeOfCareSurrogate.period
      referralRequest = this@EpisodeOfCareSurrogate.referralRequest
      careManager = this@EpisodeOfCareSurrogate.careManager
      careTeam = this@EpisodeOfCareSurrogate.careTeam
      account = this@EpisodeOfCareSurrogate.account
    }

  public companion object {
    public fun fromModel(model: EpisodeOfCare): EpisodeOfCareSurrogate =
      with(model) {
        EpisodeOfCareSurrogate().apply {
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
          statusHistory = this@with.statusHistory
          type = this@with.type
          reason = this@with.reason
          diagnosis = this@with.diagnosis
          patient = this@with.patient
          managingOrganization = this@with.managingOrganization
          period = this@with.period
          referralRequest = this@with.referralRequest
          careManager = this@with.careManager
          careTeam = this@with.careTeam
          account = this@with.account
        }
      }
  }
}
