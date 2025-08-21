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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ProcedurePerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference,
  public var onBehalfOf: Reference? = null,
  public var period: Period? = null,
) {
  public fun toModel(): Procedure.Performer =
    Procedure.Performer(
      id = this@ProcedurePerformerSurrogate.id,
      extension = this@ProcedurePerformerSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ProcedurePerformerSurrogate.modifierExtension ?: mutableListOf(),
      function = this@ProcedurePerformerSurrogate.function,
      actor = this@ProcedurePerformerSurrogate.actor,
      onBehalfOf = this@ProcedurePerformerSurrogate.onBehalfOf,
      period = this@ProcedurePerformerSurrogate.period,
    )

  public companion object {
    public fun fromModel(model: Procedure.Performer): ProcedurePerformerSurrogate =
      with(model) {
        ProcedurePerformerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          function = this@with.function,
          actor = this@with.actor,
          onBehalfOf = this@with.onBehalfOf,
          period = this@with.period,
        )
      }
  }
}

@Serializable
internal data class ProcedureFocalDeviceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var action: CodeableConcept? = null,
  public var manipulated: Reference,
) {
  public fun toModel(): Procedure.FocalDevice =
    Procedure.FocalDevice(
      id = this@ProcedureFocalDeviceSurrogate.id,
      extension = this@ProcedureFocalDeviceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ProcedureFocalDeviceSurrogate.modifierExtension ?: mutableListOf(),
      action = this@ProcedureFocalDeviceSurrogate.action,
      manipulated = this@ProcedureFocalDeviceSurrogate.manipulated,
    )

  public companion object {
    public fun fromModel(model: Procedure.FocalDevice): ProcedureFocalDeviceSurrogate =
      with(model) {
        ProcedureFocalDeviceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          action = this@with.action,
          manipulated = this@with.manipulated,
        )
      }
  }
}

@Serializable
internal data class ProcedureOccurrenceSurrogate(
  public var occurrenceDateTime: KotlinString? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
  public var occurrenceString: KotlinString? = null,
  public var _occurrenceString: Element? = null,
  public var occurrenceAge: Age? = null,
  public var occurrenceRange: Range? = null,
  public var occurrenceTiming: Timing? = null,
) {
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
    )!!

  public companion object {
    public fun fromModel(model: Procedure.Occurrence): ProcedureOccurrenceSurrogate =
      with(model) {
        ProcedureOccurrenceSurrogate(
          occurrenceDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _occurrenceDateTime = this@with.asDateTime()?.value?.toElement(),
          occurrencePeriod = this@with.asPeriod()?.value,
          occurrenceString = this@with.asString()?.value?.value,
          _occurrenceString = this@with.asString()?.value?.toElement(),
          occurrenceAge = this@with.asAge()?.value,
          occurrenceRange = this@with.asRange()?.value,
          occurrenceTiming = this@with.asTiming()?.value,
        )
      }
  }
}

@Serializable
internal data class ProcedureReportedSurrogate(
  public var reportedBoolean: KotlinBoolean? = null,
  public var _reportedBoolean: Element? = null,
  public var reportedReference: Reference? = null,
) {
  public fun toModel(): Procedure.Reported =
    Procedure.Reported?.from(
      R5Boolean.of(
        this@ProcedureReportedSurrogate.reportedBoolean,
        this@ProcedureReportedSurrogate._reportedBoolean,
      ),
      this@ProcedureReportedSurrogate.reportedReference,
    )!!

  public companion object {
    public fun fromModel(model: Procedure.Reported): ProcedureReportedSurrogate =
      with(model) {
        ProcedureReportedSurrogate(
          reportedBoolean = this@with.asBoolean()?.value?.value,
          _reportedBoolean = this@with.asBoolean()?.value?.toElement(),
          reportedReference = this@with.asReference()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var instantiatesCanonical: MutableList<KotlinString?>? = null,
  public var _instantiatesCanonical: MutableList<Element?>? = null,
  public var instantiatesUri: MutableList<KotlinString?>? = null,
  public var _instantiatesUri: MutableList<Element?>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var partOf: MutableList<Reference>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference,
  public var focus: Reference? = null,
  public var encounter: Reference? = null,
  public var occurrence: Procedure.Occurrence? = null,
  public var recorded: KotlinString? = null,
  public var _recorded: Element? = null,
  public var recorder: Reference? = null,
  public var reported: Procedure.Reported? = null,
  public var performer: MutableList<Procedure.Performer>? = null,
  public var location: Reference? = null,
  public var reason: MutableList<CodeableReference>? = null,
  public var bodySite: MutableList<CodeableConcept>? = null,
  public var outcome: CodeableConcept? = null,
  public var report: MutableList<Reference>? = null,
  public var complication: MutableList<CodeableReference>? = null,
  public var followUp: MutableList<CodeableConcept>? = null,
  public var note: MutableList<Annotation>? = null,
  public var focalDevice: MutableList<Procedure.FocalDevice>? = null,
  public var used: MutableList<CodeableReference>? = null,
  public var supportingInfo: MutableList<Reference>? = null,
) {
  public fun toModel(): Procedure =
    Procedure(
      id = this@ProcedureSurrogate.id,
      meta = this@ProcedureSurrogate.meta,
      implicitRules =
        Uri.of(this@ProcedureSurrogate.implicitRules, this@ProcedureSurrogate._implicitRules),
      language = Code.of(this@ProcedureSurrogate.language, this@ProcedureSurrogate._language),
      text = this@ProcedureSurrogate.text,
      contained = this@ProcedureSurrogate.contained ?: mutableListOf(),
      extension = this@ProcedureSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ProcedureSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ProcedureSurrogate.identifier ?: mutableListOf(),
      instantiatesCanonical =
        if (
          this@ProcedureSurrogate.instantiatesCanonical == null &&
            this@ProcedureSurrogate._instantiatesCanonical == null
        ) {
          mutableListOf()
        } else {
          (this@ProcedureSurrogate.instantiatesCanonical
              ?: List(this@ProcedureSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@ProcedureSurrogate._instantiatesCanonical
                ?: List(this@ProcedureSurrogate.instantiatesCanonical!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      instantiatesUri =
        if (
          this@ProcedureSurrogate.instantiatesUri == null &&
            this@ProcedureSurrogate._instantiatesUri == null
        ) {
          mutableListOf()
        } else {
          (this@ProcedureSurrogate.instantiatesUri
              ?: List(this@ProcedureSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@ProcedureSurrogate._instantiatesUri
                ?: List(this@ProcedureSurrogate.instantiatesUri!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      basedOn = this@ProcedureSurrogate.basedOn ?: mutableListOf(),
      partOf = this@ProcedureSurrogate.partOf ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.Procedure.EventStatus.fromCode(this@ProcedureSurrogate.status!!),
          this@ProcedureSurrogate._status,
        ),
      statusReason = this@ProcedureSurrogate.statusReason,
      category = this@ProcedureSurrogate.category ?: mutableListOf(),
      code = this@ProcedureSurrogate.code,
      subject = this@ProcedureSurrogate.subject,
      focus = this@ProcedureSurrogate.focus,
      encounter = this@ProcedureSurrogate.encounter,
      occurrence = this@ProcedureSurrogate.occurrence,
      recorded =
        DateTime.of(
          FhirDateTime.fromString(this@ProcedureSurrogate.recorded),
          this@ProcedureSurrogate._recorded,
        ),
      recorder = this@ProcedureSurrogate.recorder,
      reported = this@ProcedureSurrogate.reported,
      performer = this@ProcedureSurrogate.performer ?: mutableListOf(),
      location = this@ProcedureSurrogate.location,
      reason = this@ProcedureSurrogate.reason ?: mutableListOf(),
      bodySite = this@ProcedureSurrogate.bodySite ?: mutableListOf(),
      outcome = this@ProcedureSurrogate.outcome,
      report = this@ProcedureSurrogate.report ?: mutableListOf(),
      complication = this@ProcedureSurrogate.complication ?: mutableListOf(),
      followUp = this@ProcedureSurrogate.followUp ?: mutableListOf(),
      note = this@ProcedureSurrogate.note ?: mutableListOf(),
      focalDevice = this@ProcedureSurrogate.focalDevice ?: mutableListOf(),
      used = this@ProcedureSurrogate.used ?: mutableListOf(),
      supportingInfo = this@ProcedureSurrogate.supportingInfo ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Procedure): ProcedureSurrogate =
      with(model) {
        ProcedureSurrogate(
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
          instantiatesCanonical =
            this@with.instantiatesCanonical
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiatesCanonical =
            this@with.instantiatesCanonical
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          instantiatesUri =
            this@with.instantiatesUri
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiatesUri =
            this@with.instantiatesUri
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          partOf = this@with.partOf.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          statusReason = this@with.statusReason,
          category = this@with.category.takeUnless { it.all { it == null } },
          code = this@with.code,
          subject = this@with.subject,
          focus = this@with.focus,
          encounter = this@with.encounter,
          occurrence = this@with.occurrence,
          recorded = this@with.recorded?.value?.toString(),
          _recorded = this@with.recorded?.toElement(),
          recorder = this@with.recorder,
          reported = this@with.reported,
          performer = this@with.performer.takeUnless { it.all { it == null } },
          location = this@with.location,
          reason = this@with.reason.takeUnless { it.all { it == null } },
          bodySite = this@with.bodySite.takeUnless { it.all { it == null } },
          outcome = this@with.outcome,
          report = this@with.report.takeUnless { it.all { it == null } },
          complication = this@with.complication.takeUnless { it.all { it == null } },
          followUp = this@with.followUp.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          focalDevice = this@with.focalDevice.takeUnless { it.all { it == null } },
          used = this@with.used.takeUnless { it.all { it == null } },
          supportingInfo = this@with.supportingInfo.takeUnless { it.all { it == null } },
        )
      }
  }
}
