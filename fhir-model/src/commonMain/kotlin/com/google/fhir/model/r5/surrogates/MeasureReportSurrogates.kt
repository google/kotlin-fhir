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

import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Integer
import com.google.fhir.model.r5.MeasureReport
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MeasureReportGroupPopulationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var code: CodeableConcept? = null,
  public var count: Int? = null,
  public var _count: Element? = null,
  public var subjectResults: Reference? = null,
  public var subjectReport: List<Reference?>? = null,
  public var subjects: Reference? = null,
) {
  public fun toModel(): MeasureReport.Group.Population =
    MeasureReport.Group.Population().apply {
      id = this@MeasureReportGroupPopulationSurrogate.id
      extension = this@MeasureReportGroupPopulationSurrogate.extension
      modifierExtension = this@MeasureReportGroupPopulationSurrogate.modifierExtension
      linkId =
        R5String.of(
          this@MeasureReportGroupPopulationSurrogate.linkId,
          this@MeasureReportGroupPopulationSurrogate._linkId,
        )
      code = this@MeasureReportGroupPopulationSurrogate.code
      count =
        Integer.of(
          this@MeasureReportGroupPopulationSurrogate.count,
          this@MeasureReportGroupPopulationSurrogate._count,
        )
      subjectResults = this@MeasureReportGroupPopulationSurrogate.subjectResults
      subjectReport = this@MeasureReportGroupPopulationSurrogate.subjectReport
      subjects = this@MeasureReportGroupPopulationSurrogate.subjects
    }

  public companion object {
    public fun fromModel(
      model: MeasureReport.Group.Population
    ): MeasureReportGroupPopulationSurrogate =
      with(model) {
        MeasureReportGroupPopulationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          linkId = this@with.linkId?.value
          _linkId = this@with.linkId?.toElement()
          code = this@with.code
          count = this@with.count?.value
          _count = this@with.count?.toElement()
          subjectResults = this@with.subjectResults
          subjectReport = this@with.subjectReport
          subjects = this@with.subjects
        }
      }
  }
}

@Serializable
internal data class MeasureReportGroupStratifierStratumComponentSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var code: CodeableConcept? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
  public var valueReference: Reference? = null,
) {
  public fun toModel(): MeasureReport.Group.Stratifier.Stratum.Component =
    MeasureReport.Group.Stratifier.Stratum.Component().apply {
      id = this@MeasureReportGroupStratifierStratumComponentSurrogate.id
      extension = this@MeasureReportGroupStratifierStratumComponentSurrogate.extension
      modifierExtension =
        this@MeasureReportGroupStratifierStratumComponentSurrogate.modifierExtension
      linkId =
        R5String.of(
          this@MeasureReportGroupStratifierStratumComponentSurrogate.linkId,
          this@MeasureReportGroupStratifierStratumComponentSurrogate._linkId,
        )
      code = this@MeasureReportGroupStratifierStratumComponentSurrogate.code
      `value` =
        MeasureReport.Group.Stratifier.Stratum.Component.Value?.from(
          this@MeasureReportGroupStratifierStratumComponentSurrogate.valueCodeableConcept,
          R5Boolean.of(
            this@MeasureReportGroupStratifierStratumComponentSurrogate.valueBoolean,
            this@MeasureReportGroupStratifierStratumComponentSurrogate._valueBoolean,
          ),
          this@MeasureReportGroupStratifierStratumComponentSurrogate.valueQuantity,
          this@MeasureReportGroupStratifierStratumComponentSurrogate.valueRange,
          this@MeasureReportGroupStratifierStratumComponentSurrogate.valueReference,
        )
    }

  public companion object {
    public fun fromModel(
      model: MeasureReport.Group.Stratifier.Stratum.Component
    ): MeasureReportGroupStratifierStratumComponentSurrogate =
      with(model) {
        MeasureReportGroupStratifierStratumComponentSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          linkId = this@with.linkId?.value
          _linkId = this@with.linkId?.toElement()
          code = this@with.code
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement()
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueRange = this@with.`value`?.asRange()?.value
          valueReference = this@with.`value`?.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class MeasureReportGroupStratifierStratumPopulationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var code: CodeableConcept? = null,
  public var count: Int? = null,
  public var _count: Element? = null,
  public var subjectResults: Reference? = null,
  public var subjectReport: List<Reference?>? = null,
  public var subjects: Reference? = null,
) {
  public fun toModel(): MeasureReport.Group.Stratifier.Stratum.Population =
    MeasureReport.Group.Stratifier.Stratum.Population().apply {
      id = this@MeasureReportGroupStratifierStratumPopulationSurrogate.id
      extension = this@MeasureReportGroupStratifierStratumPopulationSurrogate.extension
      modifierExtension =
        this@MeasureReportGroupStratifierStratumPopulationSurrogate.modifierExtension
      linkId =
        R5String.of(
          this@MeasureReportGroupStratifierStratumPopulationSurrogate.linkId,
          this@MeasureReportGroupStratifierStratumPopulationSurrogate._linkId,
        )
      code = this@MeasureReportGroupStratifierStratumPopulationSurrogate.code
      count =
        Integer.of(
          this@MeasureReportGroupStratifierStratumPopulationSurrogate.count,
          this@MeasureReportGroupStratifierStratumPopulationSurrogate._count,
        )
      subjectResults = this@MeasureReportGroupStratifierStratumPopulationSurrogate.subjectResults
      subjectReport = this@MeasureReportGroupStratifierStratumPopulationSurrogate.subjectReport
      subjects = this@MeasureReportGroupStratifierStratumPopulationSurrogate.subjects
    }

  public companion object {
    public fun fromModel(
      model: MeasureReport.Group.Stratifier.Stratum.Population
    ): MeasureReportGroupStratifierStratumPopulationSurrogate =
      with(model) {
        MeasureReportGroupStratifierStratumPopulationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          linkId = this@with.linkId?.value
          _linkId = this@with.linkId?.toElement()
          code = this@with.code
          count = this@with.count?.value
          _count = this@with.count?.toElement()
          subjectResults = this@with.subjectResults
          subjectReport = this@with.subjectReport
          subjects = this@with.subjects
        }
      }
  }
}

@Serializable
internal data class MeasureReportGroupStratifierStratumSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
  public var valueReference: Reference? = null,
  public var component: List<MeasureReport.Group.Stratifier.Stratum.Component>? = null,
  public var population: List<MeasureReport.Group.Stratifier.Stratum.Population>? = null,
  public var measureScoreQuantity: Quantity? = null,
  public var measureScoreDateTime: KotlinString? = null,
  public var _measureScoreDateTime: Element? = null,
  public var measureScoreCodeableConcept: CodeableConcept? = null,
  public var measureScorePeriod: Period? = null,
  public var measureScoreRange: Range? = null,
  public var measureScoreDuration: Duration? = null,
) {
  public fun toModel(): MeasureReport.Group.Stratifier.Stratum =
    MeasureReport.Group.Stratifier.Stratum().apply {
      id = this@MeasureReportGroupStratifierStratumSurrogate.id
      extension = this@MeasureReportGroupStratifierStratumSurrogate.extension
      modifierExtension = this@MeasureReportGroupStratifierStratumSurrogate.modifierExtension
      `value` =
        MeasureReport.Group.Stratifier.Stratum.Value?.from(
          this@MeasureReportGroupStratifierStratumSurrogate.valueCodeableConcept,
          R5Boolean.of(
            this@MeasureReportGroupStratifierStratumSurrogate.valueBoolean,
            this@MeasureReportGroupStratifierStratumSurrogate._valueBoolean,
          ),
          this@MeasureReportGroupStratifierStratumSurrogate.valueQuantity,
          this@MeasureReportGroupStratifierStratumSurrogate.valueRange,
          this@MeasureReportGroupStratifierStratumSurrogate.valueReference,
        )
      component = this@MeasureReportGroupStratifierStratumSurrogate.component
      population = this@MeasureReportGroupStratifierStratumSurrogate.population
      measureScore =
        MeasureReport.Group.Stratifier.Stratum.MeasureScore?.from(
          this@MeasureReportGroupStratifierStratumSurrogate.measureScoreQuantity,
          DateTime.of(
            FhirDateTime.fromString(
              this@MeasureReportGroupStratifierStratumSurrogate.measureScoreDateTime
            ),
            this@MeasureReportGroupStratifierStratumSurrogate._measureScoreDateTime,
          ),
          this@MeasureReportGroupStratifierStratumSurrogate.measureScoreCodeableConcept,
          this@MeasureReportGroupStratifierStratumSurrogate.measureScorePeriod,
          this@MeasureReportGroupStratifierStratumSurrogate.measureScoreRange,
          this@MeasureReportGroupStratifierStratumSurrogate.measureScoreDuration,
        )
    }

  public companion object {
    public fun fromModel(
      model: MeasureReport.Group.Stratifier.Stratum
    ): MeasureReportGroupStratifierStratumSurrogate =
      with(model) {
        MeasureReportGroupStratifierStratumSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement()
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueRange = this@with.`value`?.asRange()?.value
          valueReference = this@with.`value`?.asReference()?.value
          component = this@with.component
          population = this@with.population
          measureScoreQuantity = this@with.measureScore?.asQuantity()?.value
          measureScoreDateTime = this@with.measureScore?.asDateTime()?.value?.value?.toString()
          _measureScoreDateTime = this@with.measureScore?.asDateTime()?.value?.toElement()
          measureScoreCodeableConcept = this@with.measureScore?.asCodeableConcept()?.value
          measureScorePeriod = this@with.measureScore?.asPeriod()?.value
          measureScoreRange = this@with.measureScore?.asRange()?.value
          measureScoreDuration = this@with.measureScore?.asDuration()?.value
        }
      }
  }
}

@Serializable
internal data class MeasureReportGroupStratifierSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var code: CodeableConcept? = null,
  public var stratum: List<MeasureReport.Group.Stratifier.Stratum>? = null,
) {
  public fun toModel(): MeasureReport.Group.Stratifier =
    MeasureReport.Group.Stratifier().apply {
      id = this@MeasureReportGroupStratifierSurrogate.id
      extension = this@MeasureReportGroupStratifierSurrogate.extension
      modifierExtension = this@MeasureReportGroupStratifierSurrogate.modifierExtension
      linkId =
        R5String.of(
          this@MeasureReportGroupStratifierSurrogate.linkId,
          this@MeasureReportGroupStratifierSurrogate._linkId,
        )
      code = this@MeasureReportGroupStratifierSurrogate.code
      stratum = this@MeasureReportGroupStratifierSurrogate.stratum
    }

  public companion object {
    public fun fromModel(
      model: MeasureReport.Group.Stratifier
    ): MeasureReportGroupStratifierSurrogate =
      with(model) {
        MeasureReportGroupStratifierSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          linkId = this@with.linkId?.value
          _linkId = this@with.linkId?.toElement()
          code = this@with.code
          stratum = this@with.stratum
        }
      }
  }
}

@Serializable
internal data class MeasureReportGroupSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var population: List<MeasureReport.Group.Population>? = null,
  public var measureScoreQuantity: Quantity? = null,
  public var measureScoreDateTime: KotlinString? = null,
  public var _measureScoreDateTime: Element? = null,
  public var measureScoreCodeableConcept: CodeableConcept? = null,
  public var measureScorePeriod: Period? = null,
  public var measureScoreRange: Range? = null,
  public var measureScoreDuration: Duration? = null,
  public var stratifier: List<MeasureReport.Group.Stratifier>? = null,
) {
  public fun toModel(): MeasureReport.Group =
    MeasureReport.Group().apply {
      id = this@MeasureReportGroupSurrogate.id
      extension = this@MeasureReportGroupSurrogate.extension
      modifierExtension = this@MeasureReportGroupSurrogate.modifierExtension
      linkId =
        R5String.of(
          this@MeasureReportGroupSurrogate.linkId,
          this@MeasureReportGroupSurrogate._linkId,
        )
      code = this@MeasureReportGroupSurrogate.code
      subject = this@MeasureReportGroupSurrogate.subject
      population = this@MeasureReportGroupSurrogate.population
      measureScore =
        MeasureReport.Group.MeasureScore?.from(
          this@MeasureReportGroupSurrogate.measureScoreQuantity,
          DateTime.of(
            FhirDateTime.fromString(this@MeasureReportGroupSurrogate.measureScoreDateTime),
            this@MeasureReportGroupSurrogate._measureScoreDateTime,
          ),
          this@MeasureReportGroupSurrogate.measureScoreCodeableConcept,
          this@MeasureReportGroupSurrogate.measureScorePeriod,
          this@MeasureReportGroupSurrogate.measureScoreRange,
          this@MeasureReportGroupSurrogate.measureScoreDuration,
        )
      stratifier = this@MeasureReportGroupSurrogate.stratifier
    }

  public companion object {
    public fun fromModel(model: MeasureReport.Group): MeasureReportGroupSurrogate =
      with(model) {
        MeasureReportGroupSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          linkId = this@with.linkId?.value
          _linkId = this@with.linkId?.toElement()
          code = this@with.code
          subject = this@with.subject
          population = this@with.population
          measureScoreQuantity = this@with.measureScore?.asQuantity()?.value
          measureScoreDateTime = this@with.measureScore?.asDateTime()?.value?.value?.toString()
          _measureScoreDateTime = this@with.measureScore?.asDateTime()?.value?.toElement()
          measureScoreCodeableConcept = this@with.measureScore?.asCodeableConcept()?.value
          measureScorePeriod = this@with.measureScore?.asPeriod()?.value
          measureScoreRange = this@with.measureScore?.asRange()?.value
          measureScoreDuration = this@with.measureScore?.asDuration()?.value
          stratifier = this@with.stratifier
        }
      }
  }
}

@Serializable
internal data class MeasureReportSurrogate(
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
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var dataUpdateType: KotlinString? = null,
  public var _dataUpdateType: Element? = null,
  public var measure: KotlinString? = null,
  public var _measure: Element? = null,
  public var subject: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var reporter: Reference? = null,
  public var reportingVendor: Reference? = null,
  public var location: Reference? = null,
  public var period: Period? = null,
  public var inputParameters: Reference? = null,
  public var scoring: CodeableConcept? = null,
  public var improvementNotation: CodeableConcept? = null,
  public var group: List<MeasureReport.Group>? = null,
  public var supplementalData: List<Reference?>? = null,
  public var evaluatedResource: List<Reference?>? = null,
) {
  public fun toModel(): MeasureReport =
    MeasureReport().apply {
      id = this@MeasureReportSurrogate.id
      meta = this@MeasureReportSurrogate.meta
      implicitRules =
        Uri.of(
          this@MeasureReportSurrogate.implicitRules,
          this@MeasureReportSurrogate._implicitRules,
        )
      language =
        Code.of(this@MeasureReportSurrogate.language, this@MeasureReportSurrogate._language)
      text = this@MeasureReportSurrogate.text
      contained = this@MeasureReportSurrogate.contained
      extension = this@MeasureReportSurrogate.extension
      modifierExtension = this@MeasureReportSurrogate.modifierExtension
      identifier = this@MeasureReportSurrogate.identifier
      status =
        Enumeration.of(
          this@MeasureReportSurrogate.status?.let {
            com.google.fhir.model.r5.MeasureReport.MeasureReportStatus.fromCode(it)
          },
          this@MeasureReportSurrogate._status,
        )
      type =
        Enumeration.of(
          this@MeasureReportSurrogate.type?.let {
            com.google.fhir.model.r5.MeasureReport.MeasureReportType.fromCode(it)
          },
          this@MeasureReportSurrogate._type,
        )
      dataUpdateType =
        Enumeration.of(
          this@MeasureReportSurrogate.dataUpdateType?.let {
            com.google.fhir.model.r5.MeasureReport.SubmitDataUpdateType.fromCode(it)
          },
          this@MeasureReportSurrogate._dataUpdateType,
        )
      measure =
        Canonical.of(this@MeasureReportSurrogate.measure, this@MeasureReportSurrogate._measure)
      subject = this@MeasureReportSurrogate.subject
      date =
        DateTime.of(
          FhirDateTime.fromString(this@MeasureReportSurrogate.date),
          this@MeasureReportSurrogate._date,
        )
      reporter = this@MeasureReportSurrogate.reporter
      reportingVendor = this@MeasureReportSurrogate.reportingVendor
      location = this@MeasureReportSurrogate.location
      period = this@MeasureReportSurrogate.period
      inputParameters = this@MeasureReportSurrogate.inputParameters
      scoring = this@MeasureReportSurrogate.scoring
      improvementNotation = this@MeasureReportSurrogate.improvementNotation
      group = this@MeasureReportSurrogate.group
      supplementalData = this@MeasureReportSurrogate.supplementalData
      evaluatedResource = this@MeasureReportSurrogate.evaluatedResource
    }

  public companion object {
    public fun fromModel(model: MeasureReport): MeasureReportSurrogate =
      with(model) {
        MeasureReportSurrogate().apply {
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
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          dataUpdateType = this@with.dataUpdateType?.value?.getCode()
          _dataUpdateType = this@with.dataUpdateType?.toElement()
          measure = this@with.measure?.value
          _measure = this@with.measure?.toElement()
          subject = this@with.subject
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          reporter = this@with.reporter
          reportingVendor = this@with.reportingVendor
          location = this@with.location
          period = this@with.period
          inputParameters = this@with.inputParameters
          scoring = this@with.scoring
          improvementNotation = this@with.improvementNotation
          group = this@with.group
          supplementalData = this@with.supplementalData
          evaluatedResource = this@with.evaluatedResource
        }
      }
  }
}
