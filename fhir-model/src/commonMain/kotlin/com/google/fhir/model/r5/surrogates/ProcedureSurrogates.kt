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

import com.google.fhir.model.r5.Age
import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Procedure
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Timing
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
internal data class ProcedurePerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference? = null,
  public var onBehalfOf: Reference? = null,
  public var period: Period? = null,
) {
  public fun toModel(): Procedure.Performer =
    Procedure.Performer().apply {
      id = this@ProcedurePerformerSurrogate.id
      extension = this@ProcedurePerformerSurrogate.extension
      modifierExtension = this@ProcedurePerformerSurrogate.modifierExtension
      function = this@ProcedurePerformerSurrogate.function
      actor = this@ProcedurePerformerSurrogate.actor
      onBehalfOf = this@ProcedurePerformerSurrogate.onBehalfOf
      period = this@ProcedurePerformerSurrogate.period
    }

  public companion object {
    public fun fromModel(model: Procedure.Performer): ProcedurePerformerSurrogate =
      with(model) {
        ProcedurePerformerSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          function = this@with.function
          actor = this@with.actor
          onBehalfOf = this@with.onBehalfOf
          period = this@with.period
        }
      }
  }
}

@Serializable
internal data class ProcedureFocalDeviceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var action: CodeableConcept? = null,
  public var manipulated: Reference? = null,
) {
  public fun toModel(): Procedure.FocalDevice =
    Procedure.FocalDevice().apply {
      id = this@ProcedureFocalDeviceSurrogate.id
      extension = this@ProcedureFocalDeviceSurrogate.extension
      modifierExtension = this@ProcedureFocalDeviceSurrogate.modifierExtension
      action = this@ProcedureFocalDeviceSurrogate.action
      manipulated = this@ProcedureFocalDeviceSurrogate.manipulated
    }

  public companion object {
    public fun fromModel(model: Procedure.FocalDevice): ProcedureFocalDeviceSurrogate =
      with(model) {
        ProcedureFocalDeviceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          action = this@with.action
          manipulated = this@with.manipulated
        }
      }
  }
}

@Serializable
internal class ProcedureOccurrenceSurrogate {
  public var occurrenceDateTime: KotlinString? = null

  public var _occurrenceDateTime: Element? = null

  public var occurrencePeriod: Period? = null

  public var occurrenceString: KotlinString? = null

  public var _occurrenceString: Element? = null

  public var occurrenceAge: Age? = null

  public var occurrenceRange: Range? = null

  public var occurrenceTiming: Timing? = null

  public fun toModel(): Procedure.Occurrence =
    Procedure.Occurrence?.from(
      DateTime.of(
        FhirDateTime.fromString(this@ProcedureOccurrenceSurrogate.occurrenceDateTime),
        this@ProcedureOccurrenceSurrogate._occurrenceDateTime,
      ),
      this@ProcedureOccurrenceSurrogate.occurrencePeriod,
      R5String.of(
        this@ProcedureOccurrenceSurrogate.occurrenceString,
        this@ProcedureOccurrenceSurrogate._occurrenceString,
      ),
      this@ProcedureOccurrenceSurrogate.occurrenceAge,
      this@ProcedureOccurrenceSurrogate.occurrenceRange,
      this@ProcedureOccurrenceSurrogate.occurrenceTiming,
    ) ?: Procedure.Occurrence.Null

  public companion object {
    public fun fromModel(model: Procedure.Occurrence): ProcedureOccurrenceSurrogate =
      with(model) {
        ProcedureOccurrenceSurrogate().apply {
          occurrenceDateTime = this@with.asDateTime()?.value?.value?.toString()
          _occurrenceDateTime = this@with.asDateTime()?.value?.toElement()
          occurrencePeriod = this@with.asPeriod()?.value
          occurrenceString = this@with.asString()?.value?.value
          _occurrenceString = this@with.asString()?.value?.toElement()
          occurrenceAge = this@with.asAge()?.value
          occurrenceRange = this@with.asRange()?.value
          occurrenceTiming = this@with.asTiming()?.value
        }
      }
  }
}

@Serializable
internal class ProcedureReportedSurrogate {
  public var reportedBoolean: KotlinBoolean? = null

  public var _reportedBoolean: Element? = null

  public var reportedReference: Reference? = null

  public fun toModel(): Procedure.Reported =
    Procedure.Reported?.from(
      R5Boolean.of(
        this@ProcedureReportedSurrogate.reportedBoolean,
        this@ProcedureReportedSurrogate._reportedBoolean,
      ),
      this@ProcedureReportedSurrogate.reportedReference,
    ) ?: Procedure.Reported.Null

  public companion object {
    public fun fromModel(model: Procedure.Reported): ProcedureReportedSurrogate =
      with(model) {
        ProcedureReportedSurrogate().apply {
          reportedBoolean = this@with.asBoolean()?.value?.value
          _reportedBoolean = this@with.asBoolean()?.value?.toElement()
          reportedReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class ProcedureSurrogate(
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
  public var instantiatesCanonical: List<KotlinString?>? = null,
  public var _instantiatesCanonical: List<Element?>? = null,
  public var instantiatesUri: List<KotlinString?>? = null,
  public var _instantiatesUri: List<Element?>? = null,
  public var basedOn: List<Reference?>? = null,
  public var partOf: List<Reference?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var category: List<CodeableConcept?>? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var focus: Reference? = null,
  public var encounter: Reference? = null,
  public var recorded: KotlinString? = null,
  public var _recorded: Element? = null,
  public var recorder: Reference? = null,
  public var performer: List<Procedure.Performer>? = null,
  public var location: Reference? = null,
  public var reason: List<CodeableReference?>? = null,
  public var bodySite: List<CodeableConcept?>? = null,
  public var outcome: CodeableConcept? = null,
  public var report: List<Reference?>? = null,
  public var complication: List<CodeableReference?>? = null,
  public var followUp: List<CodeableConcept?>? = null,
  public var note: List<Annotation?>? = null,
  public var focalDevice: List<Procedure.FocalDevice>? = null,
  public var used: List<CodeableReference?>? = null,
  public var supportingInfo: List<Reference?>? = null,
  public var occurrence: Procedure.Occurrence? = null,
  public var reported: Procedure.Reported? = null,
) {
  public fun toModel(): Procedure =
    Procedure().apply {
      id = this@ProcedureSurrogate.id
      meta = this@ProcedureSurrogate.meta
      implicitRules =
        Uri.of(this@ProcedureSurrogate.implicitRules, this@ProcedureSurrogate._implicitRules)
      language = Code.of(this@ProcedureSurrogate.language, this@ProcedureSurrogate._language)
      text = this@ProcedureSurrogate.text
      contained = this@ProcedureSurrogate.contained
      extension = this@ProcedureSurrogate.extension
      modifierExtension = this@ProcedureSurrogate.modifierExtension
      identifier = this@ProcedureSurrogate.identifier
      instantiatesCanonical =
        if (
          this@ProcedureSurrogate.instantiatesCanonical == null &&
            this@ProcedureSurrogate._instantiatesCanonical == null
        ) {
          null
        } else {
          (this@ProcedureSurrogate.instantiatesCanonical
              ?: List(this@ProcedureSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@ProcedureSurrogate._instantiatesCanonical
                ?: List(this@ProcedureSurrogate.instantiatesCanonical!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      instantiatesUri =
        if (
          this@ProcedureSurrogate.instantiatesUri == null &&
            this@ProcedureSurrogate._instantiatesUri == null
        ) {
          null
        } else {
          (this@ProcedureSurrogate.instantiatesUri
              ?: List(this@ProcedureSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@ProcedureSurrogate._instantiatesUri
                ?: List(this@ProcedureSurrogate.instantiatesUri!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      basedOn = this@ProcedureSurrogate.basedOn
      partOf = this@ProcedureSurrogate.partOf
      status =
        Enumeration.of(
          this@ProcedureSurrogate.status?.let {
            com.google.fhir.model.r5.Procedure.ProcedureStatus.fromCode(it)
          },
          this@ProcedureSurrogate._status,
        )
      statusReason = this@ProcedureSurrogate.statusReason
      category = this@ProcedureSurrogate.category
      code = this@ProcedureSurrogate.code
      subject = this@ProcedureSurrogate.subject
      focus = this@ProcedureSurrogate.focus
      encounter = this@ProcedureSurrogate.encounter
      occurrence = this@ProcedureSurrogate.occurrence
      recorded =
        DateTime.of(
          FhirDateTime.fromString(this@ProcedureSurrogate.recorded),
          this@ProcedureSurrogate._recorded,
        )
      recorder = this@ProcedureSurrogate.recorder
      reported = this@ProcedureSurrogate.reported
      performer = this@ProcedureSurrogate.performer
      location = this@ProcedureSurrogate.location
      reason = this@ProcedureSurrogate.reason
      bodySite = this@ProcedureSurrogate.bodySite
      outcome = this@ProcedureSurrogate.outcome
      report = this@ProcedureSurrogate.report
      complication = this@ProcedureSurrogate.complication
      followUp = this@ProcedureSurrogate.followUp
      note = this@ProcedureSurrogate.note
      focalDevice = this@ProcedureSurrogate.focalDevice
      used = this@ProcedureSurrogate.used
      supportingInfo = this@ProcedureSurrogate.supportingInfo
    }

  public companion object {
    public fun fromModel(model: Procedure): ProcedureSurrogate =
      with(model) {
        ProcedureSurrogate().apply {
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
          partOf = this@with.partOf
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          statusReason = this@with.statusReason
          category = this@with.category
          code = this@with.code
          subject = this@with.subject
          focus = this@with.focus
          encounter = this@with.encounter
          occurrence = this@with.occurrence
          recorded = this@with.recorded?.value?.toString()
          _recorded = this@with.recorded?.toElement()
          recorder = this@with.recorder
          reported = this@with.reported
          performer = this@with.performer
          location = this@with.location
          reason = this@with.reason
          bodySite = this@with.bodySite
          outcome = this@with.outcome
          report = this@with.report
          complication = this@with.complication
          followUp = this@with.followUp
          note = this@with.note
          focalDevice = this@with.focalDevice
          used = this@with.used
          supportingInfo = this@with.supportingInfo
        }
      }
  }
}
