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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class EpisodeOfCareStatusHistorySurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var period: Period,
) {
  public fun toModel(): EpisodeOfCare.StatusHistory =
    EpisodeOfCare.StatusHistory(
      id = this@EpisodeOfCareStatusHistorySurrogate.id,
      extension = this@EpisodeOfCareStatusHistorySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@EpisodeOfCareStatusHistorySurrogate.modifierExtension ?: mutableListOf(),
      status =
        Enumeration.of(
          EpisodeOfCare.EpisodeOfCareStatus.fromCode(
            this@EpisodeOfCareStatusHistorySurrogate.status!!
          ),
          this@EpisodeOfCareStatusHistorySurrogate._status,
        ),
      period = this@EpisodeOfCareStatusHistorySurrogate.period,
    )

  public companion object {
    public fun fromModel(model: EpisodeOfCare.StatusHistory): EpisodeOfCareStatusHistorySurrogate =
      with(model) {
        EpisodeOfCareStatusHistorySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          period = this@with.period,
        )
      }
  }
}

@Serializable
internal data class EpisodeOfCareReasonSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var use: CodeableConcept? = null,
  public var `value`: MutableList<CodeableReference>? = null,
) {
  public fun toModel(): EpisodeOfCare.Reason =
    EpisodeOfCare.Reason(
      id = this@EpisodeOfCareReasonSurrogate.id,
      extension = this@EpisodeOfCareReasonSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EpisodeOfCareReasonSurrogate.modifierExtension ?: mutableListOf(),
      use = this@EpisodeOfCareReasonSurrogate.use,
      `value` = this@EpisodeOfCareReasonSurrogate.`value` ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: EpisodeOfCare.Reason): EpisodeOfCareReasonSurrogate =
      with(model) {
        EpisodeOfCareReasonSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          use = this@with.use,
          `value` = this@with.`value`.takeIf { it.isNotEmpty() },
        )
      }
  }
}

@Serializable
internal data class EpisodeOfCareDiagnosisSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var condition: MutableList<CodeableReference>? = null,
  public var use: CodeableConcept? = null,
) {
  public fun toModel(): EpisodeOfCare.Diagnosis =
    EpisodeOfCare.Diagnosis(
      id = this@EpisodeOfCareDiagnosisSurrogate.id,
      extension = this@EpisodeOfCareDiagnosisSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EpisodeOfCareDiagnosisSurrogate.modifierExtension ?: mutableListOf(),
      condition = this@EpisodeOfCareDiagnosisSurrogate.condition ?: mutableListOf(),
      use = this@EpisodeOfCareDiagnosisSurrogate.use,
    )

  public companion object {
    public fun fromModel(model: EpisodeOfCare.Diagnosis): EpisodeOfCareDiagnosisSurrogate =
      with(model) {
        EpisodeOfCareDiagnosisSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          condition = this@with.condition.takeIf { it.isNotEmpty() },
          use = this@with.use,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var statusHistory: MutableList<EpisodeOfCare.StatusHistory>? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var reason: MutableList<EpisodeOfCare.Reason>? = null,
  public var diagnosis: MutableList<EpisodeOfCare.Diagnosis>? = null,
  public var patient: Reference,
  public var managingOrganization: Reference? = null,
  public var period: Period? = null,
  public var referralRequest: MutableList<Reference>? = null,
  public var careManager: Reference? = null,
  public var careTeam: MutableList<Reference>? = null,
  public var account: MutableList<Reference>? = null,
) {
  public fun toModel(): EpisodeOfCare =
    EpisodeOfCare(
      id = this@EpisodeOfCareSurrogate.id,
      meta = this@EpisodeOfCareSurrogate.meta,
      implicitRules =
        Uri.of(
          this@EpisodeOfCareSurrogate.implicitRules,
          this@EpisodeOfCareSurrogate._implicitRules,
        ),
      language =
        Code.of(this@EpisodeOfCareSurrogate.language, this@EpisodeOfCareSurrogate._language),
      text = this@EpisodeOfCareSurrogate.text,
      contained = this@EpisodeOfCareSurrogate.contained ?: mutableListOf(),
      extension = this@EpisodeOfCareSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EpisodeOfCareSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@EpisodeOfCareSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          EpisodeOfCare.EpisodeOfCareStatus.fromCode(this@EpisodeOfCareSurrogate.status!!),
          this@EpisodeOfCareSurrogate._status,
        ),
      statusHistory = this@EpisodeOfCareSurrogate.statusHistory ?: mutableListOf(),
      type = this@EpisodeOfCareSurrogate.type ?: mutableListOf(),
      reason = this@EpisodeOfCareSurrogate.reason ?: mutableListOf(),
      diagnosis = this@EpisodeOfCareSurrogate.diagnosis ?: mutableListOf(),
      patient = this@EpisodeOfCareSurrogate.patient,
      managingOrganization = this@EpisodeOfCareSurrogate.managingOrganization,
      period = this@EpisodeOfCareSurrogate.period,
      referralRequest = this@EpisodeOfCareSurrogate.referralRequest ?: mutableListOf(),
      careManager = this@EpisodeOfCareSurrogate.careManager,
      careTeam = this@EpisodeOfCareSurrogate.careTeam ?: mutableListOf(),
      account = this@EpisodeOfCareSurrogate.account ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: EpisodeOfCare): EpisodeOfCareSurrogate =
      with(model) {
        EpisodeOfCareSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeIf { it.isNotEmpty() },
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          statusHistory = this@with.statusHistory.takeIf { it.isNotEmpty() },
          type = this@with.type.takeIf { it.isNotEmpty() },
          reason = this@with.reason.takeIf { it.isNotEmpty() },
          diagnosis = this@with.diagnosis.takeIf { it.isNotEmpty() },
          patient = this@with.patient,
          managingOrganization = this@with.managingOrganization,
          period = this@with.period,
          referralRequest = this@with.referralRequest.takeIf { it.isNotEmpty() },
          careManager = this@with.careManager,
          careTeam = this@with.careTeam.takeIf { it.isNotEmpty() },
          account = this@with.account.takeIf { it.isNotEmpty() },
        )
      }
  }
}
