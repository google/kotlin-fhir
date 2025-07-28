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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ImmunizationPerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference,
) {
  public fun toModel(): Immunization.Performer =
    Immunization.Performer(
      id = this@ImmunizationPerformerSurrogate.id,
      extension = this@ImmunizationPerformerSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ImmunizationPerformerSurrogate.modifierExtension ?: mutableListOf(),
      function = this@ImmunizationPerformerSurrogate.function,
      actor = this@ImmunizationPerformerSurrogate.actor,
    )

  public companion object {
    public fun fromModel(model: Immunization.Performer): ImmunizationPerformerSurrogate =
      with(model) {
        ImmunizationPerformerSurrogate(
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
internal data class ImmunizationProgramEligibilitySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var program: CodeableConcept,
  public var programStatus: CodeableConcept,
) {
  public fun toModel(): Immunization.ProgramEligibility =
    Immunization.ProgramEligibility(
      id = this@ImmunizationProgramEligibilitySurrogate.id,
      extension = this@ImmunizationProgramEligibilitySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImmunizationProgramEligibilitySurrogate.modifierExtension ?: mutableListOf(),
      program = this@ImmunizationProgramEligibilitySurrogate.program,
      programStatus = this@ImmunizationProgramEligibilitySurrogate.programStatus,
    )

  public companion object {
    public fun fromModel(
      model: Immunization.ProgramEligibility
    ): ImmunizationProgramEligibilitySurrogate =
      with(model) {
        ImmunizationProgramEligibilitySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          program = this@with.program,
          programStatus = this@with.programStatus,
        )
      }
  }
}

@Serializable
internal data class ImmunizationReactionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var manifestation: CodeableReference? = null,
  public var reported: KotlinBoolean? = null,
  public var _reported: Element? = null,
) {
  public fun toModel(): Immunization.Reaction =
    Immunization.Reaction(
      id = this@ImmunizationReactionSurrogate.id,
      extension = this@ImmunizationReactionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ImmunizationReactionSurrogate.modifierExtension ?: mutableListOf(),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ImmunizationReactionSurrogate.date),
          this@ImmunizationReactionSurrogate._date,
        ),
      manifestation = this@ImmunizationReactionSurrogate.manifestation,
      reported =
        R5Boolean.of(
          this@ImmunizationReactionSurrogate.reported,
          this@ImmunizationReactionSurrogate._reported,
        ),
    )

  public companion object {
    public fun fromModel(model: Immunization.Reaction): ImmunizationReactionSurrogate =
      with(model) {
        ImmunizationReactionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          manifestation = this@with.manifestation,
          reported = this@with.reported?.value,
          _reported = this@with.reported?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ImmunizationProtocolAppliedSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var series: KotlinString? = null,
  public var _series: Element? = null,
  public var authority: Reference? = null,
  public var targetDisease: MutableList<CodeableConcept>? = null,
  public var doseNumber: KotlinString? = null,
  public var _doseNumber: Element? = null,
  public var seriesDoses: KotlinString? = null,
  public var _seriesDoses: Element? = null,
) {
  public fun toModel(): Immunization.ProtocolApplied =
    Immunization.ProtocolApplied(
      id = this@ImmunizationProtocolAppliedSurrogate.id,
      extension = this@ImmunizationProtocolAppliedSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImmunizationProtocolAppliedSurrogate.modifierExtension ?: mutableListOf(),
      series =
        R5String.of(
          this@ImmunizationProtocolAppliedSurrogate.series,
          this@ImmunizationProtocolAppliedSurrogate._series,
        ),
      authority = this@ImmunizationProtocolAppliedSurrogate.authority,
      targetDisease = this@ImmunizationProtocolAppliedSurrogate.targetDisease ?: mutableListOf(),
      doseNumber =
        R5String.of(
          this@ImmunizationProtocolAppliedSurrogate.doseNumber,
          this@ImmunizationProtocolAppliedSurrogate._doseNumber,
        )!!,
      seriesDoses =
        R5String.of(
          this@ImmunizationProtocolAppliedSurrogate.seriesDoses,
          this@ImmunizationProtocolAppliedSurrogate._seriesDoses,
        ),
    )

  public companion object {
    public fun fromModel(
      model: Immunization.ProtocolApplied
    ): ImmunizationProtocolAppliedSurrogate =
      with(model) {
        ImmunizationProtocolAppliedSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          series = this@with.series?.value,
          _series = this@with.series?.toElement(),
          authority = this@with.authority,
          targetDisease = this@with.targetDisease.takeUnless { it.all { it == null } },
          doseNumber = this@with.doseNumber.value,
          _doseNumber = this@with.doseNumber.toElement(),
          seriesDoses = this@with.seriesDoses?.value,
          _seriesDoses = this@with.seriesDoses?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ImmunizationOccurrenceSurrogate(
  public var occurrenceDateTime: KotlinString? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrenceString: KotlinString? = null,
  public var _occurrenceString: Element? = null,
) {
  public fun toModel(): Immunization.Occurrence =
    Immunization.Occurrence.from(
      DateTime.of(
        FhirDateTime.fromString(this@ImmunizationOccurrenceSurrogate.occurrenceDateTime),
        this@ImmunizationOccurrenceSurrogate._occurrenceDateTime,
      ),
      R5String.of(
        this@ImmunizationOccurrenceSurrogate.occurrenceString,
        this@ImmunizationOccurrenceSurrogate._occurrenceString,
      ),
    )!!

  public companion object {
    public fun fromModel(model: Immunization.Occurrence): ImmunizationOccurrenceSurrogate =
      with(model) {
        ImmunizationOccurrenceSurrogate().apply {
          Immunization.Occurrence.from(
            DateTime.of(
              FhirDateTime.fromString(this@ImmunizationOccurrenceSurrogate.occurrenceDateTime),
              this@ImmunizationOccurrenceSurrogate._occurrenceDateTime,
            ),
            R5String.of(
              this@ImmunizationOccurrenceSurrogate.occurrenceString,
              this@ImmunizationOccurrenceSurrogate._occurrenceString,
            ),
          )!!
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var vaccineCode: CodeableConcept,
  public var administeredProduct: CodeableReference? = null,
  public var manufacturer: CodeableReference? = null,
  public var lotNumber: KotlinString? = null,
  public var _lotNumber: Element? = null,
  public var expirationDate: KotlinString? = null,
  public var _expirationDate: Element? = null,
  public var patient: Reference,
  public var encounter: Reference? = null,
  public var supportingInformation: MutableList<Reference>? = null,
  public var primarySource: KotlinBoolean? = null,
  public var _primarySource: Element? = null,
  public var informationSource: CodeableReference? = null,
  public var location: Reference? = null,
  public var site: CodeableConcept? = null,
  public var route: CodeableConcept? = null,
  public var doseQuantity: Quantity? = null,
  public var performer: MutableList<Immunization.Performer>? = null,
  public var note: MutableList<Annotation>? = null,
  public var reason: MutableList<CodeableReference>? = null,
  public var isSubpotent: KotlinBoolean? = null,
  public var _isSubpotent: Element? = null,
  public var subpotentReason: MutableList<CodeableConcept>? = null,
  public var programEligibility: MutableList<Immunization.ProgramEligibility>? = null,
  public var fundingSource: CodeableConcept? = null,
  public var reaction: MutableList<Immunization.Reaction>? = null,
  public var protocolApplied: MutableList<Immunization.ProtocolApplied>? = null,
  public var occurrence: Immunization.Occurrence,
) {
  public fun toModel(): Immunization =
    Immunization(
      id = this@ImmunizationSurrogate.id,
      meta = this@ImmunizationSurrogate.meta,
      implicitRules =
        Uri.of(this@ImmunizationSurrogate.implicitRules, this@ImmunizationSurrogate._implicitRules),
      language = Code.of(this@ImmunizationSurrogate.language, this@ImmunizationSurrogate._language),
      text = this@ImmunizationSurrogate.text,
      contained = this@ImmunizationSurrogate.contained ?: mutableListOf(),
      extension = this@ImmunizationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ImmunizationSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ImmunizationSurrogate.identifier ?: mutableListOf(),
      basedOn = this@ImmunizationSurrogate.basedOn ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.Immunization.ImmunizationStatus.fromCode(
            this@ImmunizationSurrogate.status!!
          ),
          this@ImmunizationSurrogate._status,
        ),
      statusReason = this@ImmunizationSurrogate.statusReason,
      vaccineCode = this@ImmunizationSurrogate.vaccineCode,
      administeredProduct = this@ImmunizationSurrogate.administeredProduct,
      manufacturer = this@ImmunizationSurrogate.manufacturer,
      lotNumber =
        R5String.of(this@ImmunizationSurrogate.lotNumber, this@ImmunizationSurrogate._lotNumber),
      expirationDate =
        Date.of(
          FhirDate.fromString(this@ImmunizationSurrogate.expirationDate),
          this@ImmunizationSurrogate._expirationDate,
        ),
      patient = this@ImmunizationSurrogate.patient,
      encounter = this@ImmunizationSurrogate.encounter,
      supportingInformation = this@ImmunizationSurrogate.supportingInformation ?: mutableListOf(),
      occurrence = this@ImmunizationSurrogate.occurrence,
      primarySource =
        R5Boolean.of(
          this@ImmunizationSurrogate.primarySource,
          this@ImmunizationSurrogate._primarySource,
        ),
      informationSource = this@ImmunizationSurrogate.informationSource,
      location = this@ImmunizationSurrogate.location,
      site = this@ImmunizationSurrogate.site,
      route = this@ImmunizationSurrogate.route,
      doseQuantity = this@ImmunizationSurrogate.doseQuantity,
      performer = this@ImmunizationSurrogate.performer ?: mutableListOf(),
      note = this@ImmunizationSurrogate.note ?: mutableListOf(),
      reason = this@ImmunizationSurrogate.reason ?: mutableListOf(),
      isSubpotent =
        R5Boolean.of(
          this@ImmunizationSurrogate.isSubpotent,
          this@ImmunizationSurrogate._isSubpotent,
        ),
      subpotentReason = this@ImmunizationSurrogate.subpotentReason ?: mutableListOf(),
      programEligibility = this@ImmunizationSurrogate.programEligibility ?: mutableListOf(),
      fundingSource = this@ImmunizationSurrogate.fundingSource,
      reaction = this@ImmunizationSurrogate.reaction ?: mutableListOf(),
      protocolApplied = this@ImmunizationSurrogate.protocolApplied ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Immunization): ImmunizationSurrogate =
      with(model) {
        ImmunizationSurrogate(
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
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          statusReason = this@with.statusReason,
          vaccineCode = this@with.vaccineCode,
          administeredProduct = this@with.administeredProduct,
          manufacturer = this@with.manufacturer,
          lotNumber = this@with.lotNumber?.value,
          _lotNumber = this@with.lotNumber?.toElement(),
          expirationDate = this@with.expirationDate?.value?.toString(),
          _expirationDate = this@with.expirationDate?.toElement(),
          patient = this@with.patient,
          encounter = this@with.encounter,
          supportingInformation =
            this@with.supportingInformation.takeUnless { it.all { it == null } },
          occurrence = this@with.occurrence,
          primarySource = this@with.primarySource?.value,
          _primarySource = this@with.primarySource?.toElement(),
          informationSource = this@with.informationSource,
          location = this@with.location,
          site = this@with.site,
          route = this@with.route,
          doseQuantity = this@with.doseQuantity,
          performer = this@with.performer.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          reason = this@with.reason.takeUnless { it.all { it == null } },
          isSubpotent = this@with.isSubpotent?.value,
          _isSubpotent = this@with.isSubpotent?.toElement(),
          subpotentReason = this@with.subpotentReason.takeUnless { it.all { it == null } },
          programEligibility = this@with.programEligibility.takeUnless { it.all { it == null } },
          fundingSource = this@with.fundingSource,
          reaction = this@with.reaction.takeUnless { it.all { it == null } },
          protocolApplied = this@with.protocolApplied.takeUnless { it.all { it == null } },
        )
      }
  }
}
