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
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Immunization
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ImmunizationPerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference? = null,
) {
  public fun toModel(): Immunization.Performer =
    Immunization.Performer().apply {
      id = this@ImmunizationPerformerSurrogate.id
      extension = this@ImmunizationPerformerSurrogate.extension
      modifierExtension = this@ImmunizationPerformerSurrogate.modifierExtension
      function = this@ImmunizationPerformerSurrogate.function
      actor = this@ImmunizationPerformerSurrogate.actor
    }

  public companion object {
    public fun fromModel(model: Immunization.Performer): ImmunizationPerformerSurrogate =
      with(model) {
        ImmunizationPerformerSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          function = this@with.function
          actor = this@with.actor
        }
      }
  }
}

@Serializable
internal data class ImmunizationProgramEligibilitySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var program: CodeableConcept? = null,
  public var programStatus: CodeableConcept? = null,
) {
  public fun toModel(): Immunization.ProgramEligibility =
    Immunization.ProgramEligibility().apply {
      id = this@ImmunizationProgramEligibilitySurrogate.id
      extension = this@ImmunizationProgramEligibilitySurrogate.extension
      modifierExtension = this@ImmunizationProgramEligibilitySurrogate.modifierExtension
      program = this@ImmunizationProgramEligibilitySurrogate.program
      programStatus = this@ImmunizationProgramEligibilitySurrogate.programStatus
    }

  public companion object {
    public fun fromModel(
      model: Immunization.ProgramEligibility
    ): ImmunizationProgramEligibilitySurrogate =
      with(model) {
        ImmunizationProgramEligibilitySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          program = this@with.program
          programStatus = this@with.programStatus
        }
      }
  }
}

@Serializable
internal data class ImmunizationReactionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var manifestation: CodeableReference? = null,
  public var reported: KotlinBoolean? = null,
  public var _reported: Element? = null,
) {
  public fun toModel(): Immunization.Reaction =
    Immunization.Reaction().apply {
      id = this@ImmunizationReactionSurrogate.id
      extension = this@ImmunizationReactionSurrogate.extension
      modifierExtension = this@ImmunizationReactionSurrogate.modifierExtension
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ImmunizationReactionSurrogate.date),
          this@ImmunizationReactionSurrogate._date,
        )
      manifestation = this@ImmunizationReactionSurrogate.manifestation
      reported =
        R5Boolean.of(
          this@ImmunizationReactionSurrogate.reported,
          this@ImmunizationReactionSurrogate._reported,
        )
    }

  public companion object {
    public fun fromModel(model: Immunization.Reaction): ImmunizationReactionSurrogate =
      with(model) {
        ImmunizationReactionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          manifestation = this@with.manifestation
          reported = this@with.reported?.value
          _reported = this@with.reported?.toElement()
        }
      }
  }
}

@Serializable
internal data class ImmunizationProtocolAppliedSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var series: KotlinString? = null,
  public var _series: Element? = null,
  public var authority: Reference? = null,
  public var targetDisease: List<CodeableConcept?>? = null,
  public var doseNumber: KotlinString? = null,
  public var _doseNumber: Element? = null,
  public var seriesDoses: KotlinString? = null,
  public var _seriesDoses: Element? = null,
) {
  public fun toModel(): Immunization.ProtocolApplied =
    Immunization.ProtocolApplied().apply {
      id = this@ImmunizationProtocolAppliedSurrogate.id
      extension = this@ImmunizationProtocolAppliedSurrogate.extension
      modifierExtension = this@ImmunizationProtocolAppliedSurrogate.modifierExtension
      series =
        R5String.of(
          this@ImmunizationProtocolAppliedSurrogate.series,
          this@ImmunizationProtocolAppliedSurrogate._series,
        )
      authority = this@ImmunizationProtocolAppliedSurrogate.authority
      targetDisease = this@ImmunizationProtocolAppliedSurrogate.targetDisease
      doseNumber =
        R5String.of(
          this@ImmunizationProtocolAppliedSurrogate.doseNumber,
          this@ImmunizationProtocolAppliedSurrogate._doseNumber,
        )
      seriesDoses =
        R5String.of(
          this@ImmunizationProtocolAppliedSurrogate.seriesDoses,
          this@ImmunizationProtocolAppliedSurrogate._seriesDoses,
        )
    }

  public companion object {
    public fun fromModel(
      model: Immunization.ProtocolApplied
    ): ImmunizationProtocolAppliedSurrogate =
      with(model) {
        ImmunizationProtocolAppliedSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          series = this@with.series?.value
          _series = this@with.series?.toElement()
          authority = this@with.authority
          targetDisease = this@with.targetDisease
          doseNumber = this@with.doseNumber?.value
          _doseNumber = this@with.doseNumber?.toElement()
          seriesDoses = this@with.seriesDoses?.value
          _seriesDoses = this@with.seriesDoses?.toElement()
        }
      }
  }
}

@Serializable
internal data class ImmunizationSurrogate(
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
  public var identifier: List<Identifier?>? = null,
  public var basedOn: List<Reference?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var vaccineCode: CodeableConcept? = null,
  public var administeredProduct: CodeableReference? = null,
  public var manufacturer: CodeableReference? = null,
  public var lotNumber: KotlinString? = null,
  public var _lotNumber: Element? = null,
  public var expirationDate: KotlinString? = null,
  public var _expirationDate: Element? = null,
  public var patient: Reference? = null,
  public var encounter: Reference? = null,
  public var supportingInformation: List<Reference?>? = null,
  public var occurrenceDateTime: KotlinString? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrenceString: KotlinString? = null,
  public var _occurrenceString: Element? = null,
  public var primarySource: KotlinBoolean? = null,
  public var _primarySource: Element? = null,
  public var informationSource: CodeableReference? = null,
  public var location: Reference? = null,
  public var site: CodeableConcept? = null,
  public var route: CodeableConcept? = null,
  public var doseQuantity: Quantity? = null,
  public var performer: List<Immunization.Performer>? = null,
  public var note: List<Annotation?>? = null,
  public var reason: List<CodeableReference?>? = null,
  public var isSubpotent: KotlinBoolean? = null,
  public var _isSubpotent: Element? = null,
  public var subpotentReason: List<CodeableConcept?>? = null,
  public var programEligibility: List<Immunization.ProgramEligibility>? = null,
  public var fundingSource: CodeableConcept? = null,
  public var reaction: List<Immunization.Reaction>? = null,
  public var protocolApplied: List<Immunization.ProtocolApplied>? = null,
) {
  public fun toModel(): Immunization =
    Immunization().apply {
      id = this@ImmunizationSurrogate.id
      meta = this@ImmunizationSurrogate.meta
      implicitRules =
        Uri.of(this@ImmunizationSurrogate.implicitRules, this@ImmunizationSurrogate._implicitRules)
      language = Code.of(this@ImmunizationSurrogate.language, this@ImmunizationSurrogate._language)
      text = this@ImmunizationSurrogate.text
      contained = this@ImmunizationSurrogate.contained
      extension = this@ImmunizationSurrogate.extension
      modifierExtension = this@ImmunizationSurrogate.modifierExtension
      identifier = this@ImmunizationSurrogate.identifier
      basedOn = this@ImmunizationSurrogate.basedOn
      status =
        Enumeration.of(
          this@ImmunizationSurrogate.status?.let {
            com.google.fhir.model.r5.Immunization.ImmunizationStatus.fromCode(it)
          },
          this@ImmunizationSurrogate._status,
        )
      statusReason = this@ImmunizationSurrogate.statusReason
      vaccineCode = this@ImmunizationSurrogate.vaccineCode
      administeredProduct = this@ImmunizationSurrogate.administeredProduct
      manufacturer = this@ImmunizationSurrogate.manufacturer
      lotNumber =
        R5String.of(this@ImmunizationSurrogate.lotNumber, this@ImmunizationSurrogate._lotNumber)
      expirationDate =
        Date.of(
          FhirDate.fromString(this@ImmunizationSurrogate.expirationDate),
          this@ImmunizationSurrogate._expirationDate,
        )
      patient = this@ImmunizationSurrogate.patient
      encounter = this@ImmunizationSurrogate.encounter
      supportingInformation = this@ImmunizationSurrogate.supportingInformation
      occurrence =
        Immunization.Occurrence?.from(
          DateTime.of(
            FhirDateTime.fromString(this@ImmunizationSurrogate.occurrenceDateTime),
            this@ImmunizationSurrogate._occurrenceDateTime,
          ),
          R5String.of(
            this@ImmunizationSurrogate.occurrenceString,
            this@ImmunizationSurrogate._occurrenceString,
          ),
        )
      primarySource =
        R5Boolean.of(
          this@ImmunizationSurrogate.primarySource,
          this@ImmunizationSurrogate._primarySource,
        )
      informationSource = this@ImmunizationSurrogate.informationSource
      location = this@ImmunizationSurrogate.location
      site = this@ImmunizationSurrogate.site
      route = this@ImmunizationSurrogate.route
      doseQuantity = this@ImmunizationSurrogate.doseQuantity
      performer = this@ImmunizationSurrogate.performer
      note = this@ImmunizationSurrogate.note
      reason = this@ImmunizationSurrogate.reason
      isSubpotent =
        R5Boolean.of(
          this@ImmunizationSurrogate.isSubpotent,
          this@ImmunizationSurrogate._isSubpotent,
        )
      subpotentReason = this@ImmunizationSurrogate.subpotentReason
      programEligibility = this@ImmunizationSurrogate.programEligibility
      fundingSource = this@ImmunizationSurrogate.fundingSource
      reaction = this@ImmunizationSurrogate.reaction
      protocolApplied = this@ImmunizationSurrogate.protocolApplied
    }

  public companion object {
    public fun fromModel(model: Immunization): ImmunizationSurrogate =
      with(model) {
        ImmunizationSurrogate().apply {
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
          basedOn = this@with.basedOn
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          statusReason = this@with.statusReason
          vaccineCode = this@with.vaccineCode
          administeredProduct = this@with.administeredProduct
          manufacturer = this@with.manufacturer
          lotNumber = this@with.lotNumber?.value
          _lotNumber = this@with.lotNumber?.toElement()
          expirationDate = this@with.expirationDate?.value?.toString()
          _expirationDate = this@with.expirationDate?.toElement()
          patient = this@with.patient
          encounter = this@with.encounter
          supportingInformation = this@with.supportingInformation
          occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.value?.toString()
          _occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.toElement()
          occurrenceString = this@with.occurrence?.asString()?.value?.value
          _occurrenceString = this@with.occurrence?.asString()?.value?.toElement()
          primarySource = this@with.primarySource?.value
          _primarySource = this@with.primarySource?.toElement()
          informationSource = this@with.informationSource
          location = this@with.location
          site = this@with.site
          route = this@with.route
          doseQuantity = this@with.doseQuantity
          performer = this@with.performer
          note = this@with.note
          reason = this@with.reason
          isSubpotent = this@with.isSubpotent?.value
          _isSubpotent = this@with.isSubpotent?.toElement()
          subpotentReason = this@with.subpotentReason
          programEligibility = this@with.programEligibility
          fundingSource = this@with.fundingSource
          reaction = this@with.reaction
          protocolApplied = this@with.protocolApplied
        }
      }
  }
}
