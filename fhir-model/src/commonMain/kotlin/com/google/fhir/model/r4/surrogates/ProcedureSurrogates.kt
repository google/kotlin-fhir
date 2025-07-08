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

import com.google.fhir.model.r4.Age
import com.google.fhir.model.r4.Annotation
import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Procedure
import com.google.fhir.model.r4.Range
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
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
) {
  public fun toModel(): Procedure.Performer =
    Procedure.Performer().apply {
      id = this@ProcedurePerformerSurrogate.id
      extension = this@ProcedurePerformerSurrogate.extension
      modifierExtension = this@ProcedurePerformerSurrogate.modifierExtension
      function = this@ProcedurePerformerSurrogate.function
      actor = this@ProcedurePerformerSurrogate.actor
      onBehalfOf = this@ProcedurePerformerSurrogate.onBehalfOf
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
internal class ProcedurePerformedSurrogate {
  public var performedDateTime: KotlinString? = null

  public var _performedDateTime: Element? = null

  public var performedPeriod: Period? = null

  public var performedString: KotlinString? = null

  public var _performedString: Element? = null

  public var performedAge: Age? = null

  public var performedRange: Range? = null

  public fun toModel(): Procedure.Performed =
    Procedure.Performed?.from(
      DateTime.of(
        FhirDateTime.fromString(this@ProcedurePerformedSurrogate.performedDateTime),
        this@ProcedurePerformedSurrogate._performedDateTime,
      ),
      this@ProcedurePerformedSurrogate.performedPeriod,
      R4String.of(
        this@ProcedurePerformedSurrogate.performedString,
        this@ProcedurePerformedSurrogate._performedString,
      ),
      this@ProcedurePerformedSurrogate.performedAge,
      this@ProcedurePerformedSurrogate.performedRange,
    ) ?: Procedure.Performed.Null

  public companion object {
    public fun fromModel(model: Procedure.Performed): ProcedurePerformedSurrogate =
      with(model) {
        ProcedurePerformedSurrogate().apply {
          performedDateTime = this@with.asDateTime()?.value?.value?.toString()
          _performedDateTime = this@with.asDateTime()?.value?.toElement()
          performedPeriod = this@with.asPeriod()?.value
          performedString = this@with.asString()?.value?.value
          _performedString = this@with.asString()?.value?.toElement()
          performedAge = this@with.asAge()?.value
          performedRange = this@with.asRange()?.value
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
  public var category: CodeableConcept? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var recorder: Reference? = null,
  public var asserter: Reference? = null,
  public var performer: List<Procedure.Performer>? = null,
  public var location: Reference? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var reasonReference: List<Reference?>? = null,
  public var bodySite: List<CodeableConcept?>? = null,
  public var outcome: CodeableConcept? = null,
  public var report: List<Reference?>? = null,
  public var complication: List<CodeableConcept?>? = null,
  public var complicationDetail: List<Reference?>? = null,
  public var followUp: List<CodeableConcept?>? = null,
  public var note: List<Annotation?>? = null,
  public var focalDevice: List<Procedure.FocalDevice>? = null,
  public var usedReference: List<Reference?>? = null,
  public var usedCode: List<CodeableConcept?>? = null,
  public var performed: Procedure.Performed? = null,
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
            com.google.fhir.model.r4.Procedure.ProcedureStatus.fromCode(it)
          },
          this@ProcedureSurrogate._status,
        )
      statusReason = this@ProcedureSurrogate.statusReason
      category = this@ProcedureSurrogate.category
      code = this@ProcedureSurrogate.code
      subject = this@ProcedureSurrogate.subject
      encounter = this@ProcedureSurrogate.encounter
      performed = this@ProcedureSurrogate.performed
      recorder = this@ProcedureSurrogate.recorder
      asserter = this@ProcedureSurrogate.asserter
      performer = this@ProcedureSurrogate.performer
      location = this@ProcedureSurrogate.location
      reasonCode = this@ProcedureSurrogate.reasonCode
      reasonReference = this@ProcedureSurrogate.reasonReference
      bodySite = this@ProcedureSurrogate.bodySite
      outcome = this@ProcedureSurrogate.outcome
      report = this@ProcedureSurrogate.report
      complication = this@ProcedureSurrogate.complication
      complicationDetail = this@ProcedureSurrogate.complicationDetail
      followUp = this@ProcedureSurrogate.followUp
      note = this@ProcedureSurrogate.note
      focalDevice = this@ProcedureSurrogate.focalDevice
      usedReference = this@ProcedureSurrogate.usedReference
      usedCode = this@ProcedureSurrogate.usedCode
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
          encounter = this@with.encounter
          performed = this@with.performed
          recorder = this@with.recorder
          asserter = this@with.asserter
          performer = this@with.performer
          location = this@with.location
          reasonCode = this@with.reasonCode
          reasonReference = this@with.reasonReference
          bodySite = this@with.bodySite
          outcome = this@with.outcome
          report = this@with.report
          complication = this@with.complication
          complicationDetail = this@with.complicationDetail
          followUp = this@with.followUp
          note = this@with.note
          focalDevice = this@with.focalDevice
          usedReference = this@with.usedReference
          usedCode = this@with.usedCode
        }
      }
  }
}
