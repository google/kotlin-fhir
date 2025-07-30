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

import com.google.fhir.model.r4b.Age
import com.google.fhir.model.r4b.Annotation
import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Procedure
import com.google.fhir.model.r4b.Range
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
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
) {
  public fun toModel(): Procedure.Performer =
    Procedure.Performer(
      id = this@ProcedurePerformerSurrogate.id,
      extension = this@ProcedurePerformerSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ProcedurePerformerSurrogate.modifierExtension ?: mutableListOf(),
      function = this@ProcedurePerformerSurrogate.function,
      actor = this@ProcedurePerformerSurrogate.actor,
      onBehalfOf = this@ProcedurePerformerSurrogate.onBehalfOf,
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
internal data class ProcedurePerformedSurrogate(
  public var performedDateTime: KotlinString? = null,
  public var _performedDateTime: Element? = null,
  public var performedPeriod: Period? = null,
  public var performedString: KotlinString? = null,
  public var _performedString: Element? = null,
  public var performedAge: Age? = null,
  public var performedRange: Range? = null,
) {
  public fun toModel(): Procedure.Performed =
    Procedure.Performed?.from(
      DateTime.of(
        FhirDateTime.fromString(this@ProcedurePerformedSurrogate.performedDateTime),
        this@ProcedurePerformedSurrogate._performedDateTime,
      ),
      this@ProcedurePerformedSurrogate.performedPeriod,
      R4bString.of(
        this@ProcedurePerformedSurrogate.performedString,
        this@ProcedurePerformedSurrogate._performedString,
      ),
      this@ProcedurePerformedSurrogate.performedAge,
      this@ProcedurePerformedSurrogate.performedRange,
    )!!

  public companion object {
    public fun fromModel(model: Procedure.Performed): ProcedurePerformedSurrogate =
      with(model) {
        ProcedurePerformedSurrogate(
          performedDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _performedDateTime = this@with.asDateTime()?.value?.toElement(),
          performedPeriod = this@with.asPeriod()?.value,
          performedString = this@with.asString()?.value?.value,
          _performedString = this@with.asString()?.value?.toElement(),
          performedAge = this@with.asAge()?.value,
          performedRange = this@with.asRange()?.value,
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
  public var category: CodeableConcept? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference,
  public var encounter: Reference? = null,
  public var recorder: Reference? = null,
  public var asserter: Reference? = null,
  public var performer: MutableList<Procedure.Performer>? = null,
  public var location: Reference? = null,
  public var reasonCode: MutableList<CodeableConcept>? = null,
  public var reasonReference: MutableList<Reference>? = null,
  public var bodySite: MutableList<CodeableConcept>? = null,
  public var outcome: CodeableConcept? = null,
  public var report: MutableList<Reference>? = null,
  public var complication: MutableList<CodeableConcept>? = null,
  public var complicationDetail: MutableList<Reference>? = null,
  public var followUp: MutableList<CodeableConcept>? = null,
  public var note: MutableList<Annotation>? = null,
  public var focalDevice: MutableList<Procedure.FocalDevice>? = null,
  public var usedReference: MutableList<Reference>? = null,
  public var usedCode: MutableList<CodeableConcept>? = null,
  public var performed: Procedure.Performed? = null,
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
          com.google.fhir.model.r4b.Procedure.ProcedureStatus.fromCode(
            this@ProcedureSurrogate.status!!
          ),
          this@ProcedureSurrogate._status,
        ),
      statusReason = this@ProcedureSurrogate.statusReason,
      category = this@ProcedureSurrogate.category,
      code = this@ProcedureSurrogate.code,
      subject = this@ProcedureSurrogate.subject,
      encounter = this@ProcedureSurrogate.encounter,
      performed = this@ProcedureSurrogate.performed,
      recorder = this@ProcedureSurrogate.recorder,
      asserter = this@ProcedureSurrogate.asserter,
      performer = this@ProcedureSurrogate.performer ?: mutableListOf(),
      location = this@ProcedureSurrogate.location,
      reasonCode = this@ProcedureSurrogate.reasonCode ?: mutableListOf(),
      reasonReference = this@ProcedureSurrogate.reasonReference ?: mutableListOf(),
      bodySite = this@ProcedureSurrogate.bodySite ?: mutableListOf(),
      outcome = this@ProcedureSurrogate.outcome,
      report = this@ProcedureSurrogate.report ?: mutableListOf(),
      complication = this@ProcedureSurrogate.complication ?: mutableListOf(),
      complicationDetail = this@ProcedureSurrogate.complicationDetail ?: mutableListOf(),
      followUp = this@ProcedureSurrogate.followUp ?: mutableListOf(),
      note = this@ProcedureSurrogate.note ?: mutableListOf(),
      focalDevice = this@ProcedureSurrogate.focalDevice ?: mutableListOf(),
      usedReference = this@ProcedureSurrogate.usedReference ?: mutableListOf(),
      usedCode = this@ProcedureSurrogate.usedCode ?: mutableListOf(),
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
          category = this@with.category,
          code = this@with.code,
          subject = this@with.subject,
          encounter = this@with.encounter,
          performed = this@with.performed,
          recorder = this@with.recorder,
          asserter = this@with.asserter,
          performer = this@with.performer.takeUnless { it.all { it == null } },
          location = this@with.location,
          reasonCode = this@with.reasonCode.takeUnless { it.all { it == null } },
          reasonReference = this@with.reasonReference.takeUnless { it.all { it == null } },
          bodySite = this@with.bodySite.takeUnless { it.all { it == null } },
          outcome = this@with.outcome,
          report = this@with.report.takeUnless { it.all { it == null } },
          complication = this@with.complication.takeUnless { it.all { it == null } },
          complicationDetail = this@with.complicationDetail.takeUnless { it.all { it == null } },
          followUp = this@with.followUp.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          focalDevice = this@with.focalDevice.takeUnless { it.all { it == null } },
          usedReference = this@with.usedReference.takeUnless { it.all { it == null } },
          usedCode = this@with.usedCode.takeUnless { it.all { it == null } },
        )
      }
  }
}
