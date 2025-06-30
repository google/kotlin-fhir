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
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.EpisodeOfCare
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.PositiveInt
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Int
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
            com.google.fhir.model.r4b.EpisodeOfCare.EpisodeOfCareStatus.fromCode(it)
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
internal data class EpisodeOfCareDiagnosisSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var condition: Reference? = null,
  public var role: CodeableConcept? = null,
  public var rank: Int? = null,
  public var _rank: Element? = null,
) {
  public fun toModel(): EpisodeOfCare.Diagnosis =
    EpisodeOfCare.Diagnosis().apply {
      id = this@EpisodeOfCareDiagnosisSurrogate.id
      extension = this@EpisodeOfCareDiagnosisSurrogate.extension
      modifierExtension = this@EpisodeOfCareDiagnosisSurrogate.modifierExtension
      condition = this@EpisodeOfCareDiagnosisSurrogate.condition
      role = this@EpisodeOfCareDiagnosisSurrogate.role
      rank =
        PositiveInt.of(
          this@EpisodeOfCareDiagnosisSurrogate.rank,
          this@EpisodeOfCareDiagnosisSurrogate._rank,
        )
    }

  public companion object {
    public fun fromModel(model: EpisodeOfCare.Diagnosis): EpisodeOfCareDiagnosisSurrogate =
      with(model) {
        EpisodeOfCareDiagnosisSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          condition = this@with.condition
          role = this@with.role
          rank = this@with.rank?.value
          _rank = this@with.rank?.toElement()
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
  public var diagnosis: List<EpisodeOfCare.Diagnosis>? = null,
  public var patient: Reference? = null,
  public var managingOrganization: Reference? = null,
  public var period: Period? = null,
  public var referralRequest: List<Reference?>? = null,
  public var careManager: Reference? = null,
  public var team: List<Reference?>? = null,
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
            com.google.fhir.model.r4b.EpisodeOfCare.EpisodeOfCareStatus.fromCode(it)
          },
          this@EpisodeOfCareSurrogate._status,
        )
      statusHistory = this@EpisodeOfCareSurrogate.statusHistory
      type = this@EpisodeOfCareSurrogate.type
      diagnosis = this@EpisodeOfCareSurrogate.diagnosis
      patient = this@EpisodeOfCareSurrogate.patient
      managingOrganization = this@EpisodeOfCareSurrogate.managingOrganization
      period = this@EpisodeOfCareSurrogate.period
      referralRequest = this@EpisodeOfCareSurrogate.referralRequest
      careManager = this@EpisodeOfCareSurrogate.careManager
      team = this@EpisodeOfCareSurrogate.team
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
          diagnosis = this@with.diagnosis
          patient = this@with.patient
          managingOrganization = this@with.managingOrganization
          period = this@with.period
          referralRequest = this@with.referralRequest
          careManager = this@with.careManager
          team = this@with.team
          account = this@with.account
        }
      }
  }
}
