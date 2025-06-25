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

import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Coding
import com.google.fhir.model.r4.Duration
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Encounter
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.PositiveInt
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class EncounterStatusHistorySurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var period: Period? = null,
) {
  public fun toModel(): Encounter.StatusHistory =
    Encounter.StatusHistory().apply {
      id = this@EncounterStatusHistorySurrogate.id
      extension = this@EncounterStatusHistorySurrogate.extension
      modifierExtension = this@EncounterStatusHistorySurrogate.modifierExtension
      status =
        Enumeration.of(
          this@EncounterStatusHistorySurrogate.status?.let {
            com.google.fhir.model.r4.Encounter.EncounterStatus.fromCode(it)
          },
          this@EncounterStatusHistorySurrogate._status,
        )
      period = this@EncounterStatusHistorySurrogate.period
    }

  public companion object {
    public fun fromModel(model: Encounter.StatusHistory): EncounterStatusHistorySurrogate =
      with(model) {
        EncounterStatusHistorySurrogate().apply {
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
internal data class EncounterClassHistorySurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var `class`: Coding? = null,
  public var period: Period? = null,
) {
  public fun toModel(): Encounter.ClassHistory =
    Encounter.ClassHistory().apply {
      id = this@EncounterClassHistorySurrogate.id
      extension = this@EncounterClassHistorySurrogate.extension
      modifierExtension = this@EncounterClassHistorySurrogate.modifierExtension
      `class` = this@EncounterClassHistorySurrogate.`class`
      period = this@EncounterClassHistorySurrogate.period
    }

  public companion object {
    public fun fromModel(model: Encounter.ClassHistory): EncounterClassHistorySurrogate =
      with(model) {
        EncounterClassHistorySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          `class` = this@with.`class`
          period = this@with.period
        }
      }
  }
}

@Serializable
internal data class EncounterParticipantSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: List<CodeableConcept?>? = null,
  public var period: Period? = null,
  public var individual: Reference? = null,
) {
  public fun toModel(): Encounter.Participant =
    Encounter.Participant().apply {
      id = this@EncounterParticipantSurrogate.id
      extension = this@EncounterParticipantSurrogate.extension
      modifierExtension = this@EncounterParticipantSurrogate.modifierExtension
      type = this@EncounterParticipantSurrogate.type
      period = this@EncounterParticipantSurrogate.period
      individual = this@EncounterParticipantSurrogate.individual
    }

  public companion object {
    public fun fromModel(model: Encounter.Participant): EncounterParticipantSurrogate =
      with(model) {
        EncounterParticipantSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          period = this@with.period
          individual = this@with.individual
        }
      }
  }
}

@Serializable
internal data class EncounterDiagnosisSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var condition: Reference? = null,
  public var use: CodeableConcept? = null,
  public var rank: Int? = null,
  public var _rank: Element? = null,
) {
  public fun toModel(): Encounter.Diagnosis =
    Encounter.Diagnosis().apply {
      id = this@EncounterDiagnosisSurrogate.id
      extension = this@EncounterDiagnosisSurrogate.extension
      modifierExtension = this@EncounterDiagnosisSurrogate.modifierExtension
      condition = this@EncounterDiagnosisSurrogate.condition
      use = this@EncounterDiagnosisSurrogate.use
      rank =
        PositiveInt.of(
          this@EncounterDiagnosisSurrogate.rank,
          this@EncounterDiagnosisSurrogate._rank,
        )
    }

  public companion object {
    public fun fromModel(model: Encounter.Diagnosis): EncounterDiagnosisSurrogate =
      with(model) {
        EncounterDiagnosisSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          condition = this@with.condition
          use = this@with.use
          rank = this@with.rank?.value
          _rank = this@with.rank?.toElement()
        }
      }
  }
}

@Serializable
internal data class EncounterHospitalizationSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var preAdmissionIdentifier: Identifier? = null,
  public var origin: Reference? = null,
  public var admitSource: CodeableConcept? = null,
  public var reAdmission: CodeableConcept? = null,
  public var dietPreference: List<CodeableConcept?>? = null,
  public var specialCourtesy: List<CodeableConcept?>? = null,
  public var specialArrangement: List<CodeableConcept?>? = null,
  public var destination: Reference? = null,
  public var dischargeDisposition: CodeableConcept? = null,
) {
  public fun toModel(): Encounter.Hospitalization =
    Encounter.Hospitalization().apply {
      id = this@EncounterHospitalizationSurrogate.id
      extension = this@EncounterHospitalizationSurrogate.extension
      modifierExtension = this@EncounterHospitalizationSurrogate.modifierExtension
      preAdmissionIdentifier = this@EncounterHospitalizationSurrogate.preAdmissionIdentifier
      origin = this@EncounterHospitalizationSurrogate.origin
      admitSource = this@EncounterHospitalizationSurrogate.admitSource
      reAdmission = this@EncounterHospitalizationSurrogate.reAdmission
      dietPreference = this@EncounterHospitalizationSurrogate.dietPreference
      specialCourtesy = this@EncounterHospitalizationSurrogate.specialCourtesy
      specialArrangement = this@EncounterHospitalizationSurrogate.specialArrangement
      destination = this@EncounterHospitalizationSurrogate.destination
      dischargeDisposition = this@EncounterHospitalizationSurrogate.dischargeDisposition
    }

  public companion object {
    public fun fromModel(model: Encounter.Hospitalization): EncounterHospitalizationSurrogate =
      with(model) {
        EncounterHospitalizationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          preAdmissionIdentifier = this@with.preAdmissionIdentifier
          origin = this@with.origin
          admitSource = this@with.admitSource
          reAdmission = this@with.reAdmission
          dietPreference = this@with.dietPreference
          specialCourtesy = this@with.specialCourtesy
          specialArrangement = this@with.specialArrangement
          destination = this@with.destination
          dischargeDisposition = this@with.dischargeDisposition
        }
      }
  }
}

@Serializable
internal data class EncounterLocationSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var location: Reference? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var physicalType: CodeableConcept? = null,
  public var period: Period? = null,
) {
  public fun toModel(): Encounter.Location =
    Encounter.Location().apply {
      id = this@EncounterLocationSurrogate.id
      extension = this@EncounterLocationSurrogate.extension
      modifierExtension = this@EncounterLocationSurrogate.modifierExtension
      location = this@EncounterLocationSurrogate.location
      status =
        Enumeration.of(
          this@EncounterLocationSurrogate.status?.let {
            com.google.fhir.model.r4.Encounter.EncounterLocationStatus.fromCode(it)
          },
          this@EncounterLocationSurrogate._status,
        )
      physicalType = this@EncounterLocationSurrogate.physicalType
      period = this@EncounterLocationSurrogate.period
    }

  public companion object {
    public fun fromModel(model: Encounter.Location): EncounterLocationSurrogate =
      with(model) {
        EncounterLocationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          location = this@with.location
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          physicalType = this@with.physicalType
          period = this@with.period
        }
      }
  }
}

@Serializable
internal data class EncounterSurrogate(
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
  public var statusHistory: List<Encounter.StatusHistory>? = null,
  public var `class`: Coding? = null,
  public var classHistory: List<Encounter.ClassHistory>? = null,
  public var type: List<CodeableConcept?>? = null,
  public var serviceType: CodeableConcept? = null,
  public var priority: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var episodeOfCare: List<Reference?>? = null,
  public var basedOn: List<Reference?>? = null,
  public var participant: List<Encounter.Participant>? = null,
  public var appointment: List<Reference?>? = null,
  public var period: Period? = null,
  public var length: Duration? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var reasonReference: List<Reference?>? = null,
  public var diagnosis: List<Encounter.Diagnosis>? = null,
  public var account: List<Reference?>? = null,
  public var hospitalization: Encounter.Hospitalization? = null,
  public var location: List<Encounter.Location>? = null,
  public var serviceProvider: Reference? = null,
  public var partOf: Reference? = null,
) {
  public fun toModel(): Encounter =
    Encounter().apply {
      id = this@EncounterSurrogate.id
      meta = this@EncounterSurrogate.meta
      implicitRules =
        Uri.of(this@EncounterSurrogate.implicitRules, this@EncounterSurrogate._implicitRules)
      language = Code.of(this@EncounterSurrogate.language, this@EncounterSurrogate._language)
      text = this@EncounterSurrogate.text
      contained = this@EncounterSurrogate.contained
      extension = this@EncounterSurrogate.extension
      modifierExtension = this@EncounterSurrogate.modifierExtension
      identifier = this@EncounterSurrogate.identifier
      status =
        Enumeration.of(
          this@EncounterSurrogate.status?.let {
            com.google.fhir.model.r4.Encounter.EncounterStatus.fromCode(it)
          },
          this@EncounterSurrogate._status,
        )
      statusHistory = this@EncounterSurrogate.statusHistory
      `class` = this@EncounterSurrogate.`class`
      classHistory = this@EncounterSurrogate.classHistory
      type = this@EncounterSurrogate.type
      serviceType = this@EncounterSurrogate.serviceType
      priority = this@EncounterSurrogate.priority
      subject = this@EncounterSurrogate.subject
      episodeOfCare = this@EncounterSurrogate.episodeOfCare
      basedOn = this@EncounterSurrogate.basedOn
      participant = this@EncounterSurrogate.participant
      appointment = this@EncounterSurrogate.appointment
      period = this@EncounterSurrogate.period
      length = this@EncounterSurrogate.length
      reasonCode = this@EncounterSurrogate.reasonCode
      reasonReference = this@EncounterSurrogate.reasonReference
      diagnosis = this@EncounterSurrogate.diagnosis
      account = this@EncounterSurrogate.account
      hospitalization = this@EncounterSurrogate.hospitalization
      location = this@EncounterSurrogate.location
      serviceProvider = this@EncounterSurrogate.serviceProvider
      partOf = this@EncounterSurrogate.partOf
    }

  public companion object {
    public fun fromModel(model: Encounter): EncounterSurrogate =
      with(model) {
        EncounterSurrogate().apply {
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
          `class` = this@with.`class`
          classHistory = this@with.classHistory
          type = this@with.type
          serviceType = this@with.serviceType
          priority = this@with.priority
          subject = this@with.subject
          episodeOfCare = this@with.episodeOfCare
          basedOn = this@with.basedOn
          participant = this@with.participant
          appointment = this@with.appointment
          period = this@with.period
          length = this@with.length
          reasonCode = this@with.reasonCode
          reasonReference = this@with.reasonReference
          diagnosis = this@with.diagnosis
          account = this@with.account
          hospitalization = this@with.hospitalization
          location = this@with.location
          serviceProvider = this@with.serviceProvider
          partOf = this@with.partOf
        }
      }
  }
}
