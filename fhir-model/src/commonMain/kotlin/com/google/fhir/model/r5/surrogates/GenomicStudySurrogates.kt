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
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal class GenomicStudyAnalysisInputGeneratedBySurrogate {
  public var generatedByIdentifier: Identifier? = null

  public var generatedByReference: Reference? = null

  public fun toModel(): GenomicStudy.Analysis.Input.GeneratedBy =
    GenomicStudy.Analysis.Input.GeneratedBy?.from(
      this@GenomicStudyAnalysisInputGeneratedBySurrogate.generatedByIdentifier,
      this@GenomicStudyAnalysisInputGeneratedBySurrogate.generatedByReference,
    ) ?: GenomicStudy.Analysis.Input.GeneratedBy.Null

  public companion object {
    public fun fromModel(
      model: GenomicStudy.Analysis.Input.GeneratedBy
    ): GenomicStudyAnalysisInputGeneratedBySurrogate =
      with(model) {
        GenomicStudyAnalysisInputGeneratedBySurrogate().apply {
          generatedByIdentifier = this@with.asIdentifier()?.value
          generatedByReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class GenomicStudyAnalysisInputSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var `file`: Reference? = null,
  public var type: CodeableConcept? = null,
  public var generatedBy: GenomicStudy.Analysis.Input.GeneratedBy? = null,
) {
  public fun toModel(): GenomicStudy.Analysis.Input =
    GenomicStudy.Analysis.Input().apply {
      id = this@GenomicStudyAnalysisInputSurrogate.id
      extension = this@GenomicStudyAnalysisInputSurrogate.extension
      modifierExtension = this@GenomicStudyAnalysisInputSurrogate.modifierExtension
      `file` = this@GenomicStudyAnalysisInputSurrogate.`file`
      type = this@GenomicStudyAnalysisInputSurrogate.type
      generatedBy = this@GenomicStudyAnalysisInputSurrogate.generatedBy
    }

  public companion object {
    public fun fromModel(model: GenomicStudy.Analysis.Input): GenomicStudyAnalysisInputSurrogate =
      with(model) {
        GenomicStudyAnalysisInputSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          `file` = this@with.`file`
          type = this@with.type
          generatedBy = this@with.generatedBy
        }
      }
  }
}

@Serializable
internal data class GenomicStudyAnalysisOutputSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var `file`: Reference? = null,
  public var type: CodeableConcept? = null,
) {
  public fun toModel(): GenomicStudy.Analysis.Output =
    GenomicStudy.Analysis.Output().apply {
      id = this@GenomicStudyAnalysisOutputSurrogate.id
      extension = this@GenomicStudyAnalysisOutputSurrogate.extension
      modifierExtension = this@GenomicStudyAnalysisOutputSurrogate.modifierExtension
      `file` = this@GenomicStudyAnalysisOutputSurrogate.`file`
      type = this@GenomicStudyAnalysisOutputSurrogate.type
    }

  public companion object {
    public fun fromModel(model: GenomicStudy.Analysis.Output): GenomicStudyAnalysisOutputSurrogate =
      with(model) {
        GenomicStudyAnalysisOutputSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          `file` = this@with.`file`
          type = this@with.type
        }
      }
  }
}

@Serializable
internal data class GenomicStudyAnalysisPerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var actor: Reference? = null,
  public var role: CodeableConcept? = null,
) {
  public fun toModel(): GenomicStudy.Analysis.Performer =
    GenomicStudy.Analysis.Performer().apply {
      id = this@GenomicStudyAnalysisPerformerSurrogate.id
      extension = this@GenomicStudyAnalysisPerformerSurrogate.extension
      modifierExtension = this@GenomicStudyAnalysisPerformerSurrogate.modifierExtension
      actor = this@GenomicStudyAnalysisPerformerSurrogate.actor
      role = this@GenomicStudyAnalysisPerformerSurrogate.role
    }

  public companion object {
    public fun fromModel(
      model: GenomicStudy.Analysis.Performer
    ): GenomicStudyAnalysisPerformerSurrogate =
      with(model) {
        GenomicStudyAnalysisPerformerSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          actor = this@with.actor
          role = this@with.role
        }
      }
  }
}

@Serializable
internal data class GenomicStudyAnalysisDeviceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var device: Reference? = null,
  public var function: CodeableConcept? = null,
) {
  public fun toModel(): GenomicStudy.Analysis.Device =
    GenomicStudy.Analysis.Device().apply {
      id = this@GenomicStudyAnalysisDeviceSurrogate.id
      extension = this@GenomicStudyAnalysisDeviceSurrogate.extension
      modifierExtension = this@GenomicStudyAnalysisDeviceSurrogate.modifierExtension
      device = this@GenomicStudyAnalysisDeviceSurrogate.device
      function = this@GenomicStudyAnalysisDeviceSurrogate.function
    }

  public companion object {
    public fun fromModel(model: GenomicStudy.Analysis.Device): GenomicStudyAnalysisDeviceSurrogate =
      with(model) {
        GenomicStudyAnalysisDeviceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          device = this@with.device
          function = this@with.function
        }
      }
  }
}

@Serializable
internal data class GenomicStudyAnalysisSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var methodType: List<CodeableConcept?>? = null,
  public var changeType: List<CodeableConcept?>? = null,
  public var genomeBuild: CodeableConcept? = null,
  public var instantiatesCanonical: KotlinString? = null,
  public var _instantiatesCanonical: Element? = null,
  public var instantiatesUri: KotlinString? = null,
  public var _instantiatesUri: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var focus: List<Reference?>? = null,
  public var specimen: List<Reference?>? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var note: List<Annotation?>? = null,
  public var protocolPerformed: Reference? = null,
  public var regionsStudied: List<Reference?>? = null,
  public var regionsCalled: List<Reference?>? = null,
  public var input: List<GenomicStudy.Analysis.Input>? = null,
  public var output: List<GenomicStudy.Analysis.Output>? = null,
  public var performer: List<GenomicStudy.Analysis.Performer>? = null,
  public var device: List<GenomicStudy.Analysis.Device>? = null,
) {
  public fun toModel(): GenomicStudy.Analysis =
    GenomicStudy.Analysis().apply {
      id = this@GenomicStudyAnalysisSurrogate.id
      extension = this@GenomicStudyAnalysisSurrogate.extension
      modifierExtension = this@GenomicStudyAnalysisSurrogate.modifierExtension
      identifier = this@GenomicStudyAnalysisSurrogate.identifier
      methodType = this@GenomicStudyAnalysisSurrogate.methodType
      changeType = this@GenomicStudyAnalysisSurrogate.changeType
      genomeBuild = this@GenomicStudyAnalysisSurrogate.genomeBuild
      instantiatesCanonical =
        Canonical.of(
          this@GenomicStudyAnalysisSurrogate.instantiatesCanonical,
          this@GenomicStudyAnalysisSurrogate._instantiatesCanonical,
        )
      instantiatesUri =
        Uri.of(
          this@GenomicStudyAnalysisSurrogate.instantiatesUri,
          this@GenomicStudyAnalysisSurrogate._instantiatesUri,
        )
      title =
        R5String.of(
          this@GenomicStudyAnalysisSurrogate.title,
          this@GenomicStudyAnalysisSurrogate._title,
        )
      focus = this@GenomicStudyAnalysisSurrogate.focus
      specimen = this@GenomicStudyAnalysisSurrogate.specimen
      date =
        DateTime.of(
          FhirDateTime.fromString(this@GenomicStudyAnalysisSurrogate.date),
          this@GenomicStudyAnalysisSurrogate._date,
        )
      note = this@GenomicStudyAnalysisSurrogate.note
      protocolPerformed = this@GenomicStudyAnalysisSurrogate.protocolPerformed
      regionsStudied = this@GenomicStudyAnalysisSurrogate.regionsStudied
      regionsCalled = this@GenomicStudyAnalysisSurrogate.regionsCalled
      input = this@GenomicStudyAnalysisSurrogate.input
      output = this@GenomicStudyAnalysisSurrogate.output
      performer = this@GenomicStudyAnalysisSurrogate.performer
      device = this@GenomicStudyAnalysisSurrogate.device
    }

  public companion object {
    public fun fromModel(model: GenomicStudy.Analysis): GenomicStudyAnalysisSurrogate =
      with(model) {
        GenomicStudyAnalysisSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          methodType = this@with.methodType
          changeType = this@with.changeType
          genomeBuild = this@with.genomeBuild
          instantiatesCanonical = this@with.instantiatesCanonical?.value
          _instantiatesCanonical = this@with.instantiatesCanonical?.toElement()
          instantiatesUri = this@with.instantiatesUri?.value
          _instantiatesUri = this@with.instantiatesUri?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          focus = this@with.focus
          specimen = this@with.specimen
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          note = this@with.note
          protocolPerformed = this@with.protocolPerformed
          regionsStudied = this@with.regionsStudied
          regionsCalled = this@with.regionsCalled
          input = this@with.input
          output = this@with.output
          performer = this@with.performer
          device = this@with.device
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var type: List<CodeableConcept?>? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var startDate: KotlinString? = null,
  public var _startDate: Element? = null,
  public var basedOn: List<Reference?>? = null,
  public var referrer: Reference? = null,
  public var interpreter: List<Reference?>? = null,
  public var reason: List<CodeableReference?>? = null,
  public var instantiatesCanonical: KotlinString? = null,
  public var _instantiatesCanonical: Element? = null,
  public var instantiatesUri: KotlinString? = null,
  public var _instantiatesUri: Element? = null,
  public var note: List<Annotation?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var analysis: List<GenomicStudy.Analysis>? = null,
) {
  public fun toModel(): GenomicStudy =
    GenomicStudy().apply {
      id = this@GenomicStudySurrogate.id
      meta = this@GenomicStudySurrogate.meta
      implicitRules =
        Uri.of(this@GenomicStudySurrogate.implicitRules, this@GenomicStudySurrogate._implicitRules)
      language = Code.of(this@GenomicStudySurrogate.language, this@GenomicStudySurrogate._language)
      text = this@GenomicStudySurrogate.text
      contained = this@GenomicStudySurrogate.contained
      extension = this@GenomicStudySurrogate.extension
      modifierExtension = this@GenomicStudySurrogate.modifierExtension
      identifier = this@GenomicStudySurrogate.identifier
      status =
        Enumeration.of(
          this@GenomicStudySurrogate.status?.let {
            com.google.fhir.model.r5.GenomicStudy.GenomicStudyStatus.fromCode(it)
          },
          this@GenomicStudySurrogate._status,
        )
      type = this@GenomicStudySurrogate.type
      subject = this@GenomicStudySurrogate.subject
      encounter = this@GenomicStudySurrogate.encounter
      startDate =
        DateTime.of(
          FhirDateTime.fromString(this@GenomicStudySurrogate.startDate),
          this@GenomicStudySurrogate._startDate,
        )
      basedOn = this@GenomicStudySurrogate.basedOn
      referrer = this@GenomicStudySurrogate.referrer
      interpreter = this@GenomicStudySurrogate.interpreter
      reason = this@GenomicStudySurrogate.reason
      instantiatesCanonical =
        Canonical.of(
          this@GenomicStudySurrogate.instantiatesCanonical,
          this@GenomicStudySurrogate._instantiatesCanonical,
        )
      instantiatesUri =
        Uri.of(
          this@GenomicStudySurrogate.instantiatesUri,
          this@GenomicStudySurrogate._instantiatesUri,
        )
      note = this@GenomicStudySurrogate.note
      description =
        Markdown.of(this@GenomicStudySurrogate.description, this@GenomicStudySurrogate._description)
      analysis = this@GenomicStudySurrogate.analysis
    }

  public companion object {
    public fun fromModel(model: GenomicStudy): GenomicStudySurrogate =
      with(model) {
        GenomicStudySurrogate().apply {
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
          type = this@with.type
          subject = this@with.subject
          encounter = this@with.encounter
          startDate = this@with.startDate?.value?.toString()
          _startDate = this@with.startDate?.toElement()
          basedOn = this@with.basedOn
          referrer = this@with.referrer
          interpreter = this@with.interpreter
          reason = this@with.reason
          instantiatesCanonical = this@with.instantiatesCanonical?.value
          _instantiatesCanonical = this@with.instantiatesCanonical?.toElement()
          instantiatesUri = this@with.instantiatesUri?.value
          _instantiatesUri = this@with.instantiatesUri?.toElement()
          note = this@with.note
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          analysis = this@with.analysis
        }
      }
  }
}
