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
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.GenomicStudy
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class GenomicStudyAnalysisInputSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var `file`: Reference? = null,
  public var type: CodeableConcept? = null,
  public var generatedByIdentifier: Identifier? = null,
  public var generatedByReference: Reference? = null,
) {
  public fun toModel(): GenomicStudy.Analysis.Input =
    GenomicStudy.Analysis.Input(
      id = this@GenomicStudyAnalysisInputSurrogate.id,
      extension = this@GenomicStudyAnalysisInputSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@GenomicStudyAnalysisInputSurrogate.modifierExtension ?: mutableListOf(),
      `file` = this@GenomicStudyAnalysisInputSurrogate.`file`,
      type = this@GenomicStudyAnalysisInputSurrogate.type,
      generatedBy =
        GenomicStudy.Analysis.Input.GeneratedBy?.from(
          this@GenomicStudyAnalysisInputSurrogate.generatedByIdentifier,
          this@GenomicStudyAnalysisInputSurrogate.generatedByReference,
        ),
    )

  public companion object {
    public fun fromModel(model: GenomicStudy.Analysis.Input): GenomicStudyAnalysisInputSurrogate =
      with(model) {
        GenomicStudyAnalysisInputSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          `file` = this@with.`file`,
          type = this@with.type,
          generatedByIdentifier = this@with.generatedBy?.asIdentifier()?.value,
          generatedByReference = this@with.generatedBy?.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class GenomicStudyAnalysisOutputSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var `file`: Reference? = null,
  public var type: CodeableConcept? = null,
) {
  public fun toModel(): GenomicStudy.Analysis.Output =
    GenomicStudy.Analysis.Output(
      id = this@GenomicStudyAnalysisOutputSurrogate.id,
      extension = this@GenomicStudyAnalysisOutputSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@GenomicStudyAnalysisOutputSurrogate.modifierExtension ?: mutableListOf(),
      `file` = this@GenomicStudyAnalysisOutputSurrogate.`file`,
      type = this@GenomicStudyAnalysisOutputSurrogate.type,
    )

  public companion object {
    public fun fromModel(model: GenomicStudy.Analysis.Output): GenomicStudyAnalysisOutputSurrogate =
      with(model) {
        GenomicStudyAnalysisOutputSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          `file` = this@with.`file`,
          type = this@with.type,
        )
      }
  }
}

@Serializable
internal data class GenomicStudyAnalysisPerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var actor: Reference? = null,
  public var role: CodeableConcept? = null,
) {
  public fun toModel(): GenomicStudy.Analysis.Performer =
    GenomicStudy.Analysis.Performer(
      id = this@GenomicStudyAnalysisPerformerSurrogate.id,
      extension = this@GenomicStudyAnalysisPerformerSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@GenomicStudyAnalysisPerformerSurrogate.modifierExtension ?: mutableListOf(),
      actor = this@GenomicStudyAnalysisPerformerSurrogate.actor,
      role = this@GenomicStudyAnalysisPerformerSurrogate.role,
    )

  public companion object {
    public fun fromModel(
      model: GenomicStudy.Analysis.Performer
    ): GenomicStudyAnalysisPerformerSurrogate =
      with(model) {
        GenomicStudyAnalysisPerformerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          actor = this@with.actor,
          role = this@with.role,
        )
      }
  }
}

@Serializable
internal data class GenomicStudyAnalysisDeviceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var device: Reference? = null,
  public var function: CodeableConcept? = null,
) {
  public fun toModel(): GenomicStudy.Analysis.Device =
    GenomicStudy.Analysis.Device(
      id = this@GenomicStudyAnalysisDeviceSurrogate.id,
      extension = this@GenomicStudyAnalysisDeviceSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@GenomicStudyAnalysisDeviceSurrogate.modifierExtension ?: mutableListOf(),
      device = this@GenomicStudyAnalysisDeviceSurrogate.device,
      function = this@GenomicStudyAnalysisDeviceSurrogate.function,
    )

  public companion object {
    public fun fromModel(model: GenomicStudy.Analysis.Device): GenomicStudyAnalysisDeviceSurrogate =
      with(model) {
        GenomicStudyAnalysisDeviceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          device = this@with.device,
          function = this@with.function,
        )
      }
  }
}

@Serializable
internal data class GenomicStudyAnalysisSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var methodType: MutableList<CodeableConcept>? = null,
  public var changeType: MutableList<CodeableConcept>? = null,
  public var genomeBuild: CodeableConcept? = null,
  public var instantiatesCanonical: KotlinString? = null,
  public var _instantiatesCanonical: Element? = null,
  public var instantiatesUri: KotlinString? = null,
  public var _instantiatesUri: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var focus: MutableList<Reference>? = null,
  public var specimen: MutableList<Reference>? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var note: MutableList<Annotation>? = null,
  public var protocolPerformed: Reference? = null,
  public var regionsStudied: MutableList<Reference>? = null,
  public var regionsCalled: MutableList<Reference>? = null,
  public var input: MutableList<GenomicStudy.Analysis.Input>? = null,
  public var output: MutableList<GenomicStudy.Analysis.Output>? = null,
  public var performer: MutableList<GenomicStudy.Analysis.Performer>? = null,
  public var device: MutableList<GenomicStudy.Analysis.Device>? = null,
) {
  public fun toModel(): GenomicStudy.Analysis =
    GenomicStudy.Analysis(
      id = this@GenomicStudyAnalysisSurrogate.id,
      extension = this@GenomicStudyAnalysisSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@GenomicStudyAnalysisSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@GenomicStudyAnalysisSurrogate.identifier ?: mutableListOf(),
      methodType = this@GenomicStudyAnalysisSurrogate.methodType ?: mutableListOf(),
      changeType = this@GenomicStudyAnalysisSurrogate.changeType ?: mutableListOf(),
      genomeBuild = this@GenomicStudyAnalysisSurrogate.genomeBuild,
      instantiatesCanonical =
        Canonical.of(
          this@GenomicStudyAnalysisSurrogate.instantiatesCanonical,
          this@GenomicStudyAnalysisSurrogate._instantiatesCanonical,
        ),
      instantiatesUri =
        Uri.of(
          this@GenomicStudyAnalysisSurrogate.instantiatesUri,
          this@GenomicStudyAnalysisSurrogate._instantiatesUri,
        ),
      title =
        R5String.of(
          this@GenomicStudyAnalysisSurrogate.title,
          this@GenomicStudyAnalysisSurrogate._title,
        ),
      focus = this@GenomicStudyAnalysisSurrogate.focus ?: mutableListOf(),
      specimen = this@GenomicStudyAnalysisSurrogate.specimen ?: mutableListOf(),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@GenomicStudyAnalysisSurrogate.date),
          this@GenomicStudyAnalysisSurrogate._date,
        ),
      note = this@GenomicStudyAnalysisSurrogate.note ?: mutableListOf(),
      protocolPerformed = this@GenomicStudyAnalysisSurrogate.protocolPerformed,
      regionsStudied = this@GenomicStudyAnalysisSurrogate.regionsStudied ?: mutableListOf(),
      regionsCalled = this@GenomicStudyAnalysisSurrogate.regionsCalled ?: mutableListOf(),
      input = this@GenomicStudyAnalysisSurrogate.input ?: mutableListOf(),
      output = this@GenomicStudyAnalysisSurrogate.output ?: mutableListOf(),
      performer = this@GenomicStudyAnalysisSurrogate.performer ?: mutableListOf(),
      device = this@GenomicStudyAnalysisSurrogate.device ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: GenomicStudy.Analysis): GenomicStudyAnalysisSurrogate =
      with(model) {
        GenomicStudyAnalysisSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          methodType = this@with.methodType.takeUnless { it.all { it == null } },
          changeType = this@with.changeType.takeUnless { it.all { it == null } },
          genomeBuild = this@with.genomeBuild,
          instantiatesCanonical = this@with.instantiatesCanonical?.value,
          _instantiatesCanonical = this@with.instantiatesCanonical?.toElement(),
          instantiatesUri = this@with.instantiatesUri?.value,
          _instantiatesUri = this@with.instantiatesUri?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          focus = this@with.focus.takeUnless { it.all { it == null } },
          specimen = this@with.specimen.takeUnless { it.all { it == null } },
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          note = this@with.note.takeUnless { it.all { it == null } },
          protocolPerformed = this@with.protocolPerformed,
          regionsStudied = this@with.regionsStudied.takeUnless { it.all { it == null } },
          regionsCalled = this@with.regionsCalled.takeUnless { it.all { it == null } },
          input = this@with.input.takeUnless { it.all { it == null } },
          output = this@with.output.takeUnless { it.all { it == null } },
          performer = this@with.performer.takeUnless { it.all { it == null } },
          device = this@with.device.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class GenomicStudySurrogate(
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
  public var type: MutableList<CodeableConcept>? = null,
  public var subject: Reference,
  public var encounter: Reference? = null,
  public var startDate: KotlinString? = null,
  public var _startDate: Element? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var referrer: Reference? = null,
  public var interpreter: MutableList<Reference>? = null,
  public var reason: MutableList<CodeableReference>? = null,
  public var instantiatesCanonical: KotlinString? = null,
  public var _instantiatesCanonical: Element? = null,
  public var instantiatesUri: KotlinString? = null,
  public var _instantiatesUri: Element? = null,
  public var note: MutableList<Annotation>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var analysis: MutableList<GenomicStudy.Analysis>? = null,
) {
  public fun toModel(): GenomicStudy =
    GenomicStudy(
      id = this@GenomicStudySurrogate.id,
      meta = this@GenomicStudySurrogate.meta,
      implicitRules =
        Uri.of(this@GenomicStudySurrogate.implicitRules, this@GenomicStudySurrogate._implicitRules),
      language = Code.of(this@GenomicStudySurrogate.language, this@GenomicStudySurrogate._language),
      text = this@GenomicStudySurrogate.text,
      contained = this@GenomicStudySurrogate.contained ?: mutableListOf(),
      extension = this@GenomicStudySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@GenomicStudySurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@GenomicStudySurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.GenomicStudy.GenomicStudyStatus.fromCode(
            this@GenomicStudySurrogate.status!!
          ),
          this@GenomicStudySurrogate._status,
        ),
      type = this@GenomicStudySurrogate.type ?: mutableListOf(),
      subject = this@GenomicStudySurrogate.subject,
      encounter = this@GenomicStudySurrogate.encounter,
      startDate =
        DateTime.of(
          FhirDateTime.fromString(this@GenomicStudySurrogate.startDate),
          this@GenomicStudySurrogate._startDate,
        ),
      basedOn = this@GenomicStudySurrogate.basedOn ?: mutableListOf(),
      referrer = this@GenomicStudySurrogate.referrer,
      interpreter = this@GenomicStudySurrogate.interpreter ?: mutableListOf(),
      reason = this@GenomicStudySurrogate.reason ?: mutableListOf(),
      instantiatesCanonical =
        Canonical.of(
          this@GenomicStudySurrogate.instantiatesCanonical,
          this@GenomicStudySurrogate._instantiatesCanonical,
        ),
      instantiatesUri =
        Uri.of(
          this@GenomicStudySurrogate.instantiatesUri,
          this@GenomicStudySurrogate._instantiatesUri,
        ),
      note = this@GenomicStudySurrogate.note ?: mutableListOf(),
      description =
        Markdown.of(
          this@GenomicStudySurrogate.description,
          this@GenomicStudySurrogate._description,
        ),
      analysis = this@GenomicStudySurrogate.analysis ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: GenomicStudy): GenomicStudySurrogate =
      with(model) {
        GenomicStudySurrogate(
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
          type = this@with.type.takeUnless { it.all { it == null } },
          subject = this@with.subject,
          encounter = this@with.encounter,
          startDate = this@with.startDate?.value?.toString(),
          _startDate = this@with.startDate?.toElement(),
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          referrer = this@with.referrer,
          interpreter = this@with.interpreter.takeUnless { it.all { it == null } },
          reason = this@with.reason.takeUnless { it.all { it == null } },
          instantiatesCanonical = this@with.instantiatesCanonical?.value,
          _instantiatesCanonical = this@with.instantiatesCanonical?.toElement(),
          instantiatesUri = this@with.instantiatesUri?.value,
          _instantiatesUri = this@with.instantiatesUri?.toElement(),
          note = this@with.note.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          analysis = this@with.analysis.takeUnless { it.all { it == null } },
        )
      }
  }
}
