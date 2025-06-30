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

import com.google.fhir.model.r4.Annotation
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.ContactDetail
import com.google.fhir.model.r4.Date
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Decimal
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDate
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Integer
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.RelatedArtifact
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.RiskEvidenceSynthesis
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.UsageContext
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class RiskEvidenceSynthesisSampleSizeSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var numberOfStudies: Int? = null,
  public var _numberOfStudies: Element? = null,
  public var numberOfParticipants: Int? = null,
  public var _numberOfParticipants: Element? = null,
) {
  public fun toModel(): RiskEvidenceSynthesis.SampleSize =
    RiskEvidenceSynthesis.SampleSize().apply {
      id = this@RiskEvidenceSynthesisSampleSizeSurrogate.id
      extension = this@RiskEvidenceSynthesisSampleSizeSurrogate.extension
      modifierExtension = this@RiskEvidenceSynthesisSampleSizeSurrogate.modifierExtension
      description =
        R4String.of(
          this@RiskEvidenceSynthesisSampleSizeSurrogate.description,
          this@RiskEvidenceSynthesisSampleSizeSurrogate._description,
        )
      numberOfStudies =
        Integer.of(
          this@RiskEvidenceSynthesisSampleSizeSurrogate.numberOfStudies,
          this@RiskEvidenceSynthesisSampleSizeSurrogate._numberOfStudies,
        )
      numberOfParticipants =
        Integer.of(
          this@RiskEvidenceSynthesisSampleSizeSurrogate.numberOfParticipants,
          this@RiskEvidenceSynthesisSampleSizeSurrogate._numberOfParticipants,
        )
    }

  public companion object {
    public fun fromModel(
      model: RiskEvidenceSynthesis.SampleSize
    ): RiskEvidenceSynthesisSampleSizeSurrogate =
      with(model) {
        RiskEvidenceSynthesisSampleSizeSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          numberOfStudies = this@with.numberOfStudies?.value
          _numberOfStudies = this@with.numberOfStudies?.toElement()
          numberOfParticipants = this@with.numberOfParticipants?.value
          _numberOfParticipants = this@with.numberOfParticipants?.toElement()
        }
      }
  }
}

@Serializable
internal data class RiskEvidenceSynthesisRiskEstimatePrecisionEstimateSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var level: Double? = null,
  public var _level: Element? = null,
  public var from: Double? = null,
  public var _from: Element? = null,
  public var to: Double? = null,
  public var _to: Element? = null,
) {
  public fun toModel(): RiskEvidenceSynthesis.RiskEstimate.PrecisionEstimate =
    RiskEvidenceSynthesis.RiskEstimate.PrecisionEstimate().apply {
      id = this@RiskEvidenceSynthesisRiskEstimatePrecisionEstimateSurrogate.id
      extension = this@RiskEvidenceSynthesisRiskEstimatePrecisionEstimateSurrogate.extension
      modifierExtension =
        this@RiskEvidenceSynthesisRiskEstimatePrecisionEstimateSurrogate.modifierExtension
      type = this@RiskEvidenceSynthesisRiskEstimatePrecisionEstimateSurrogate.type
      level =
        Decimal.of(
          this@RiskEvidenceSynthesisRiskEstimatePrecisionEstimateSurrogate.level,
          this@RiskEvidenceSynthesisRiskEstimatePrecisionEstimateSurrogate._level,
        )
      from =
        Decimal.of(
          this@RiskEvidenceSynthesisRiskEstimatePrecisionEstimateSurrogate.from,
          this@RiskEvidenceSynthesisRiskEstimatePrecisionEstimateSurrogate._from,
        )
      to =
        Decimal.of(
          this@RiskEvidenceSynthesisRiskEstimatePrecisionEstimateSurrogate.to,
          this@RiskEvidenceSynthesisRiskEstimatePrecisionEstimateSurrogate._to,
        )
    }

  public companion object {
    public fun fromModel(
      model: RiskEvidenceSynthesis.RiskEstimate.PrecisionEstimate
    ): RiskEvidenceSynthesisRiskEstimatePrecisionEstimateSurrogate =
      with(model) {
        RiskEvidenceSynthesisRiskEstimatePrecisionEstimateSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          level = this@with.level?.value
          _level = this@with.level?.toElement()
          from = this@with.from?.value
          _from = this@with.from?.toElement()
          to = this@with.to?.value
          _to = this@with.to?.toElement()
        }
      }
  }
}

@Serializable
internal data class RiskEvidenceSynthesisRiskEstimateSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var type: CodeableConcept? = null,
  public var `value`: Double? = null,
  public var _value: Element? = null,
  public var unitOfMeasure: CodeableConcept? = null,
  public var denominatorCount: Int? = null,
  public var _denominatorCount: Element? = null,
  public var numeratorCount: Int? = null,
  public var _numeratorCount: Element? = null,
  public var precisionEstimate: List<RiskEvidenceSynthesis.RiskEstimate.PrecisionEstimate>? = null,
) {
  public fun toModel(): RiskEvidenceSynthesis.RiskEstimate =
    RiskEvidenceSynthesis.RiskEstimate().apply {
      id = this@RiskEvidenceSynthesisRiskEstimateSurrogate.id
      extension = this@RiskEvidenceSynthesisRiskEstimateSurrogate.extension
      modifierExtension = this@RiskEvidenceSynthesisRiskEstimateSurrogate.modifierExtension
      description =
        R4String.of(
          this@RiskEvidenceSynthesisRiskEstimateSurrogate.description,
          this@RiskEvidenceSynthesisRiskEstimateSurrogate._description,
        )
      type = this@RiskEvidenceSynthesisRiskEstimateSurrogate.type
      `value` =
        Decimal.of(
          this@RiskEvidenceSynthesisRiskEstimateSurrogate.`value`,
          this@RiskEvidenceSynthesisRiskEstimateSurrogate._value,
        )
      unitOfMeasure = this@RiskEvidenceSynthesisRiskEstimateSurrogate.unitOfMeasure
      denominatorCount =
        Integer.of(
          this@RiskEvidenceSynthesisRiskEstimateSurrogate.denominatorCount,
          this@RiskEvidenceSynthesisRiskEstimateSurrogate._denominatorCount,
        )
      numeratorCount =
        Integer.of(
          this@RiskEvidenceSynthesisRiskEstimateSurrogate.numeratorCount,
          this@RiskEvidenceSynthesisRiskEstimateSurrogate._numeratorCount,
        )
      precisionEstimate = this@RiskEvidenceSynthesisRiskEstimateSurrogate.precisionEstimate
    }

  public companion object {
    public fun fromModel(
      model: RiskEvidenceSynthesis.RiskEstimate
    ): RiskEvidenceSynthesisRiskEstimateSurrogate =
      with(model) {
        RiskEvidenceSynthesisRiskEstimateSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          type = this@with.type
          `value` = this@with.`value`?.value
          _value = this@with.`value`?.toElement()
          unitOfMeasure = this@with.unitOfMeasure
          denominatorCount = this@with.denominatorCount?.value
          _denominatorCount = this@with.denominatorCount?.toElement()
          numeratorCount = this@with.numeratorCount?.value
          _numeratorCount = this@with.numeratorCount?.toElement()
          precisionEstimate = this@with.precisionEstimate
        }
      }
  }
}

@Serializable
internal data class RiskEvidenceSynthesisCertaintyCertaintySubcomponentSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var rating: List<CodeableConcept?>? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): RiskEvidenceSynthesis.Certainty.CertaintySubcomponent =
    RiskEvidenceSynthesis.Certainty.CertaintySubcomponent().apply {
      id = this@RiskEvidenceSynthesisCertaintyCertaintySubcomponentSurrogate.id
      extension = this@RiskEvidenceSynthesisCertaintyCertaintySubcomponentSurrogate.extension
      modifierExtension =
        this@RiskEvidenceSynthesisCertaintyCertaintySubcomponentSurrogate.modifierExtension
      type = this@RiskEvidenceSynthesisCertaintyCertaintySubcomponentSurrogate.type
      rating = this@RiskEvidenceSynthesisCertaintyCertaintySubcomponentSurrogate.rating
      note = this@RiskEvidenceSynthesisCertaintyCertaintySubcomponentSurrogate.note
    }

  public companion object {
    public fun fromModel(
      model: RiskEvidenceSynthesis.Certainty.CertaintySubcomponent
    ): RiskEvidenceSynthesisCertaintyCertaintySubcomponentSurrogate =
      with(model) {
        RiskEvidenceSynthesisCertaintyCertaintySubcomponentSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          rating = this@with.rating
          note = this@with.note
        }
      }
  }
}

@Serializable
internal data class RiskEvidenceSynthesisCertaintySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var rating: List<CodeableConcept?>? = null,
  public var note: List<Annotation?>? = null,
  public var certaintySubcomponent: List<RiskEvidenceSynthesis.Certainty.CertaintySubcomponent>? =
    null,
) {
  public fun toModel(): RiskEvidenceSynthesis.Certainty =
    RiskEvidenceSynthesis.Certainty().apply {
      id = this@RiskEvidenceSynthesisCertaintySurrogate.id
      extension = this@RiskEvidenceSynthesisCertaintySurrogate.extension
      modifierExtension = this@RiskEvidenceSynthesisCertaintySurrogate.modifierExtension
      rating = this@RiskEvidenceSynthesisCertaintySurrogate.rating
      note = this@RiskEvidenceSynthesisCertaintySurrogate.note
      certaintySubcomponent = this@RiskEvidenceSynthesisCertaintySurrogate.certaintySubcomponent
    }

  public companion object {
    public fun fromModel(
      model: RiskEvidenceSynthesis.Certainty
    ): RiskEvidenceSynthesisCertaintySurrogate =
      with(model) {
        RiskEvidenceSynthesisCertaintySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          rating = this@with.rating
          note = this@with.note
          certaintySubcomponent = this@with.certaintySubcomponent
        }
      }
  }
}

@Serializable
internal data class RiskEvidenceSynthesisSurrogate(
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
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: List<Identifier?>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: List<ContactDetail?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var note: List<Annotation?>? = null,
  public var useContext: List<UsageContext?>? = null,
  public var jurisdiction: List<CodeableConcept?>? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var approvalDate: KotlinString? = null,
  public var _approvalDate: Element? = null,
  public var lastReviewDate: KotlinString? = null,
  public var _lastReviewDate: Element? = null,
  public var effectivePeriod: Period? = null,
  public var topic: List<CodeableConcept?>? = null,
  public var author: List<ContactDetail?>? = null,
  public var editor: List<ContactDetail?>? = null,
  public var reviewer: List<ContactDetail?>? = null,
  public var endorser: List<ContactDetail?>? = null,
  public var relatedArtifact: List<RelatedArtifact?>? = null,
  public var synthesisType: CodeableConcept? = null,
  public var studyType: CodeableConcept? = null,
  public var population: Reference? = null,
  public var exposure: Reference? = null,
  public var outcome: Reference? = null,
  public var sampleSize: RiskEvidenceSynthesis.SampleSize? = null,
  public var riskEstimate: RiskEvidenceSynthesis.RiskEstimate? = null,
  public var certainty: List<RiskEvidenceSynthesis.Certainty>? = null,
) {
  public fun toModel(): RiskEvidenceSynthesis =
    RiskEvidenceSynthesis().apply {
      id = this@RiskEvidenceSynthesisSurrogate.id
      meta = this@RiskEvidenceSynthesisSurrogate.meta
      implicitRules =
        Uri.of(
          this@RiskEvidenceSynthesisSurrogate.implicitRules,
          this@RiskEvidenceSynthesisSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@RiskEvidenceSynthesisSurrogate.language,
          this@RiskEvidenceSynthesisSurrogate._language,
        )
      text = this@RiskEvidenceSynthesisSurrogate.text
      contained = this@RiskEvidenceSynthesisSurrogate.contained
      extension = this@RiskEvidenceSynthesisSurrogate.extension
      modifierExtension = this@RiskEvidenceSynthesisSurrogate.modifierExtension
      url =
        Uri.of(this@RiskEvidenceSynthesisSurrogate.url, this@RiskEvidenceSynthesisSurrogate._url)
      identifier = this@RiskEvidenceSynthesisSurrogate.identifier
      version =
        R4String.of(
          this@RiskEvidenceSynthesisSurrogate.version,
          this@RiskEvidenceSynthesisSurrogate._version,
        )
      name =
        R4String.of(
          this@RiskEvidenceSynthesisSurrogate.name,
          this@RiskEvidenceSynthesisSurrogate._name,
        )
      title =
        R4String.of(
          this@RiskEvidenceSynthesisSurrogate.title,
          this@RiskEvidenceSynthesisSurrogate._title,
        )
      status =
        Enumeration.of(
          this@RiskEvidenceSynthesisSurrogate.status?.let {
            com.google.fhir.model.r4.PublicationStatus.fromCode(it)
          },
          this@RiskEvidenceSynthesisSurrogate._status,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@RiskEvidenceSynthesisSurrogate.date),
          this@RiskEvidenceSynthesisSurrogate._date,
        )
      publisher =
        R4String.of(
          this@RiskEvidenceSynthesisSurrogate.publisher,
          this@RiskEvidenceSynthesisSurrogate._publisher,
        )
      contact = this@RiskEvidenceSynthesisSurrogate.contact
      description =
        Markdown.of(
          this@RiskEvidenceSynthesisSurrogate.description,
          this@RiskEvidenceSynthesisSurrogate._description,
        )
      note = this@RiskEvidenceSynthesisSurrogate.note
      useContext = this@RiskEvidenceSynthesisSurrogate.useContext
      jurisdiction = this@RiskEvidenceSynthesisSurrogate.jurisdiction
      copyright =
        Markdown.of(
          this@RiskEvidenceSynthesisSurrogate.copyright,
          this@RiskEvidenceSynthesisSurrogate._copyright,
        )
      approvalDate =
        Date.of(
          FhirDate.fromString(this@RiskEvidenceSynthesisSurrogate.approvalDate),
          this@RiskEvidenceSynthesisSurrogate._approvalDate,
        )
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@RiskEvidenceSynthesisSurrogate.lastReviewDate),
          this@RiskEvidenceSynthesisSurrogate._lastReviewDate,
        )
      effectivePeriod = this@RiskEvidenceSynthesisSurrogate.effectivePeriod
      topic = this@RiskEvidenceSynthesisSurrogate.topic
      author = this@RiskEvidenceSynthesisSurrogate.author
      editor = this@RiskEvidenceSynthesisSurrogate.editor
      reviewer = this@RiskEvidenceSynthesisSurrogate.reviewer
      endorser = this@RiskEvidenceSynthesisSurrogate.endorser
      relatedArtifact = this@RiskEvidenceSynthesisSurrogate.relatedArtifact
      synthesisType = this@RiskEvidenceSynthesisSurrogate.synthesisType
      studyType = this@RiskEvidenceSynthesisSurrogate.studyType
      population = this@RiskEvidenceSynthesisSurrogate.population
      exposure = this@RiskEvidenceSynthesisSurrogate.exposure
      outcome = this@RiskEvidenceSynthesisSurrogate.outcome
      sampleSize = this@RiskEvidenceSynthesisSurrogate.sampleSize
      riskEstimate = this@RiskEvidenceSynthesisSurrogate.riskEstimate
      certainty = this@RiskEvidenceSynthesisSurrogate.certainty
    }

  public companion object {
    public fun fromModel(model: RiskEvidenceSynthesis): RiskEvidenceSynthesisSurrogate =
      with(model) {
        RiskEvidenceSynthesisSurrogate().apply {
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
          url = this@with.url?.value
          _url = this@with.url?.toElement()
          identifier = this@with.identifier
          version = this@with.version?.value
          _version = this@with.version?.toElement()
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          publisher = this@with.publisher?.value
          _publisher = this@with.publisher?.toElement()
          contact = this@with.contact
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          note = this@with.note
          useContext = this@with.useContext
          jurisdiction = this@with.jurisdiction
          copyright = this@with.copyright?.value
          _copyright = this@with.copyright?.toElement()
          approvalDate = this@with.approvalDate?.value?.toString()
          _approvalDate = this@with.approvalDate?.toElement()
          lastReviewDate = this@with.lastReviewDate?.value?.toString()
          _lastReviewDate = this@with.lastReviewDate?.toElement()
          effectivePeriod = this@with.effectivePeriod
          topic = this@with.topic
          author = this@with.author
          editor = this@with.editor
          reviewer = this@with.reviewer
          endorser = this@with.endorser
          relatedArtifact = this@with.relatedArtifact
          synthesisType = this@with.synthesisType
          studyType = this@with.studyType
          population = this@with.population
          exposure = this@with.exposure
          outcome = this@with.outcome
          sampleSize = this@with.sampleSize
          riskEstimate = this@with.riskEstimate
          certainty = this@with.certainty
        }
      }
  }
}
