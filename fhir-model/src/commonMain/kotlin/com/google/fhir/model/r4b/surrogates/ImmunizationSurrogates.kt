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
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Date
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDate
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Immunization
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.PositiveInt
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
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
internal data class ImmunizationEducationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var documentType: KotlinString? = null,
  public var _documentType: Element? = null,
  public var reference: KotlinString? = null,
  public var _reference: Element? = null,
  public var publicationDate: KotlinString? = null,
  public var _publicationDate: Element? = null,
  public var presentationDate: KotlinString? = null,
  public var _presentationDate: Element? = null,
) {
  public fun toModel(): Immunization.Education =
    Immunization.Education(
      id = this@ImmunizationEducationSurrogate.id,
      extension = this@ImmunizationEducationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ImmunizationEducationSurrogate.modifierExtension ?: mutableListOf(),
      documentType =
        R4bString.of(
          this@ImmunizationEducationSurrogate.documentType,
          this@ImmunizationEducationSurrogate._documentType,
        ),
      reference =
        Uri.of(
          this@ImmunizationEducationSurrogate.reference,
          this@ImmunizationEducationSurrogate._reference,
        ),
      publicationDate =
        DateTime.of(
          FhirDateTime.fromString(this@ImmunizationEducationSurrogate.publicationDate),
          this@ImmunizationEducationSurrogate._publicationDate,
        ),
      presentationDate =
        DateTime.of(
          FhirDateTime.fromString(this@ImmunizationEducationSurrogate.presentationDate),
          this@ImmunizationEducationSurrogate._presentationDate,
        ),
    )

  public companion object {
    public fun fromModel(model: Immunization.Education): ImmunizationEducationSurrogate =
      with(model) {
        ImmunizationEducationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          documentType = this@with.documentType?.value,
          _documentType = this@with.documentType?.toElement(),
          reference = this@with.reference?.value,
          _reference = this@with.reference?.toElement(),
          publicationDate = this@with.publicationDate?.value?.toString(),
          _publicationDate = this@with.publicationDate?.toElement(),
          presentationDate = this@with.presentationDate?.value?.toString(),
          _presentationDate = this@with.presentationDate?.toElement(),
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
  public var detail: Reference? = null,
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
      detail = this@ImmunizationReactionSurrogate.detail,
      reported =
        R4bBoolean.of(
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
          detail = this@with.detail,
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
  public var doseNumberPositiveInt: Int? = null,
  public var _doseNumberPositiveInt: Element? = null,
  public var doseNumberString: KotlinString? = null,
  public var _doseNumberString: Element? = null,
  public var seriesDosesPositiveInt: Int? = null,
  public var _seriesDosesPositiveInt: Element? = null,
  public var seriesDosesString: KotlinString? = null,
  public var _seriesDosesString: Element? = null,
) {
  public fun toModel(): Immunization.ProtocolApplied =
    Immunization.ProtocolApplied(
      id = this@ImmunizationProtocolAppliedSurrogate.id,
      extension = this@ImmunizationProtocolAppliedSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImmunizationProtocolAppliedSurrogate.modifierExtension ?: mutableListOf(),
      series =
        R4bString.of(
          this@ImmunizationProtocolAppliedSurrogate.series,
          this@ImmunizationProtocolAppliedSurrogate._series,
        ),
      authority = this@ImmunizationProtocolAppliedSurrogate.authority,
      targetDisease = this@ImmunizationProtocolAppliedSurrogate.targetDisease ?: mutableListOf(),
      doseNumber =
        Immunization.ProtocolApplied.DoseNumber.from(
          PositiveInt.of(
            this@ImmunizationProtocolAppliedSurrogate.doseNumberPositiveInt,
            this@ImmunizationProtocolAppliedSurrogate._doseNumberPositiveInt,
          ),
          R4bString.of(
            this@ImmunizationProtocolAppliedSurrogate.doseNumberString,
            this@ImmunizationProtocolAppliedSurrogate._doseNumberString,
          ),
        )!!,
      seriesDoses =
        Immunization.ProtocolApplied.SeriesDoses?.from(
          PositiveInt.of(
            this@ImmunizationProtocolAppliedSurrogate.seriesDosesPositiveInt,
            this@ImmunizationProtocolAppliedSurrogate._seriesDosesPositiveInt,
          ),
          R4bString.of(
            this@ImmunizationProtocolAppliedSurrogate.seriesDosesString,
            this@ImmunizationProtocolAppliedSurrogate._seriesDosesString,
          ),
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
          doseNumberPositiveInt = this@with.doseNumber?.asPositiveInt()?.value?.value,
          _doseNumberPositiveInt = this@with.doseNumber?.asPositiveInt()?.value?.toElement(),
          doseNumberString = this@with.doseNumber?.asString()?.value?.value,
          _doseNumberString = this@with.doseNumber?.asString()?.value?.toElement(),
          seriesDosesPositiveInt = this@with.seriesDoses?.asPositiveInt()?.value?.value,
          _seriesDosesPositiveInt = this@with.seriesDoses?.asPositiveInt()?.value?.toElement(),
          seriesDosesString = this@with.seriesDoses?.asString()?.value?.value,
          _seriesDosesString = this@with.seriesDoses?.asString()?.value?.toElement(),
        )
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
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var vaccineCode: CodeableConcept,
  public var patient: Reference,
  public var encounter: Reference? = null,
  public var occurrenceDateTime: KotlinString? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrenceString: KotlinString? = null,
  public var _occurrenceString: Element? = null,
  public var recorded: KotlinString? = null,
  public var _recorded: Element? = null,
  public var primarySource: KotlinBoolean? = null,
  public var _primarySource: Element? = null,
  public var reportOrigin: CodeableConcept? = null,
  public var location: Reference? = null,
  public var manufacturer: Reference? = null,
  public var lotNumber: KotlinString? = null,
  public var _lotNumber: Element? = null,
  public var expirationDate: KotlinString? = null,
  public var _expirationDate: Element? = null,
  public var site: CodeableConcept? = null,
  public var route: CodeableConcept? = null,
  public var doseQuantity: Quantity? = null,
  public var performer: MutableList<Immunization.Performer>? = null,
  public var note: MutableList<Annotation>? = null,
  public var reasonCode: MutableList<CodeableConcept>? = null,
  public var reasonReference: MutableList<Reference>? = null,
  public var isSubpotent: KotlinBoolean? = null,
  public var _isSubpotent: Element? = null,
  public var subpotentReason: MutableList<CodeableConcept>? = null,
  public var education: MutableList<Immunization.Education>? = null,
  public var programEligibility: MutableList<CodeableConcept>? = null,
  public var fundingSource: CodeableConcept? = null,
  public var reaction: MutableList<Immunization.Reaction>? = null,
  public var protocolApplied: MutableList<Immunization.ProtocolApplied>? = null,
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
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.Immunization.ImmunizationStatus.fromCode(
            this@ImmunizationSurrogate.status!!
          ),
          this@ImmunizationSurrogate._status,
        ),
      statusReason = this@ImmunizationSurrogate.statusReason,
      vaccineCode = this@ImmunizationSurrogate.vaccineCode,
      patient = this@ImmunizationSurrogate.patient,
      encounter = this@ImmunizationSurrogate.encounter,
      occurrence =
        Immunization.Occurrence.from(
          DateTime.of(
            FhirDateTime.fromString(this@ImmunizationSurrogate.occurrenceDateTime),
            this@ImmunizationSurrogate._occurrenceDateTime,
          ),
          R4bString.of(
            this@ImmunizationSurrogate.occurrenceString,
            this@ImmunizationSurrogate._occurrenceString,
          ),
        )!!,
      recorded =
        DateTime.of(
          FhirDateTime.fromString(this@ImmunizationSurrogate.recorded),
          this@ImmunizationSurrogate._recorded,
        ),
      primarySource =
        R4bBoolean.of(
          this@ImmunizationSurrogate.primarySource,
          this@ImmunizationSurrogate._primarySource,
        ),
      reportOrigin = this@ImmunizationSurrogate.reportOrigin,
      location = this@ImmunizationSurrogate.location,
      manufacturer = this@ImmunizationSurrogate.manufacturer,
      lotNumber =
        R4bString.of(this@ImmunizationSurrogate.lotNumber, this@ImmunizationSurrogate._lotNumber),
      expirationDate =
        Date.of(
          FhirDate.fromString(this@ImmunizationSurrogate.expirationDate),
          this@ImmunizationSurrogate._expirationDate,
        ),
      site = this@ImmunizationSurrogate.site,
      route = this@ImmunizationSurrogate.route,
      doseQuantity = this@ImmunizationSurrogate.doseQuantity,
      performer = this@ImmunizationSurrogate.performer ?: mutableListOf(),
      note = this@ImmunizationSurrogate.note ?: mutableListOf(),
      reasonCode = this@ImmunizationSurrogate.reasonCode ?: mutableListOf(),
      reasonReference = this@ImmunizationSurrogate.reasonReference ?: mutableListOf(),
      isSubpotent =
        R4bBoolean.of(
          this@ImmunizationSurrogate.isSubpotent,
          this@ImmunizationSurrogate._isSubpotent,
        ),
      subpotentReason = this@ImmunizationSurrogate.subpotentReason ?: mutableListOf(),
      education = this@ImmunizationSurrogate.education ?: mutableListOf(),
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
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          statusReason = this@with.statusReason,
          vaccineCode = this@with.vaccineCode,
          patient = this@with.patient,
          encounter = this@with.encounter,
          occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.value?.toString(),
          _occurrenceDateTime = this@with.occurrence?.asDateTime()?.value?.toElement(),
          occurrenceString = this@with.occurrence?.asString()?.value?.value,
          _occurrenceString = this@with.occurrence?.asString()?.value?.toElement(),
          recorded = this@with.recorded?.value?.toString(),
          _recorded = this@with.recorded?.toElement(),
          primarySource = this@with.primarySource?.value,
          _primarySource = this@with.primarySource?.toElement(),
          reportOrigin = this@with.reportOrigin,
          location = this@with.location,
          manufacturer = this@with.manufacturer,
          lotNumber = this@with.lotNumber?.value,
          _lotNumber = this@with.lotNumber?.toElement(),
          expirationDate = this@with.expirationDate?.value?.toString(),
          _expirationDate = this@with.expirationDate?.toElement(),
          site = this@with.site,
          route = this@with.route,
          doseQuantity = this@with.doseQuantity,
          performer = this@with.performer.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          reasonCode = this@with.reasonCode.takeUnless { it.all { it == null } },
          reasonReference = this@with.reasonReference.takeUnless { it.all { it == null } },
          isSubpotent = this@with.isSubpotent?.value,
          _isSubpotent = this@with.isSubpotent?.toElement(),
          subpotentReason = this@with.subpotentReason.takeUnless { it.all { it == null } },
          education = this@with.education.takeUnless { it.all { it == null } },
          programEligibility = this@with.programEligibility.takeUnless { it.all { it == null } },
          fundingSource = this@with.fundingSource,
          reaction = this@with.reaction.takeUnless { it.all { it == null } },
          protocolApplied = this@with.protocolApplied.takeUnless { it.all { it == null } },
        )
      }
  }
}
