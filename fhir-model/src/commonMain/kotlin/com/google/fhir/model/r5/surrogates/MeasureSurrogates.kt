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
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Expression
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Measure
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MeasureTermSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var definition: KotlinString? = null,
  public var _definition: Element? = null,
) {
  public fun toModel(): Measure.Term =
    Measure.Term().apply {
      id = this@MeasureTermSurrogate.id
      extension = this@MeasureTermSurrogate.extension
      modifierExtension = this@MeasureTermSurrogate.modifierExtension
      code = this@MeasureTermSurrogate.code
      definition =
        Markdown.of(this@MeasureTermSurrogate.definition, this@MeasureTermSurrogate._definition)
    }

  public companion object {
    public fun fromModel(model: Measure.Term): MeasureTermSurrogate =
      with(model) {
        MeasureTermSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          definition = this@with.definition?.value
          _definition = this@with.definition?.toElement()
        }
      }
  }
}

@Serializable
internal data class MeasureGroupPopulationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var code: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var criteria: Expression? = null,
  public var groupDefinition: Reference? = null,
  public var inputPopulationId: KotlinString? = null,
  public var _inputPopulationId: Element? = null,
  public var aggregateMethod: CodeableConcept? = null,
) {
  public fun toModel(): Measure.Group.Population =
    Measure.Group.Population().apply {
      id = this@MeasureGroupPopulationSurrogate.id
      extension = this@MeasureGroupPopulationSurrogate.extension
      modifierExtension = this@MeasureGroupPopulationSurrogate.modifierExtension
      linkId =
        R5String.of(
          this@MeasureGroupPopulationSurrogate.linkId,
          this@MeasureGroupPopulationSurrogate._linkId,
        )
      code = this@MeasureGroupPopulationSurrogate.code
      description =
        Markdown.of(
          this@MeasureGroupPopulationSurrogate.description,
          this@MeasureGroupPopulationSurrogate._description,
        )
      criteria = this@MeasureGroupPopulationSurrogate.criteria
      groupDefinition = this@MeasureGroupPopulationSurrogate.groupDefinition
      inputPopulationId =
        R5String.of(
          this@MeasureGroupPopulationSurrogate.inputPopulationId,
          this@MeasureGroupPopulationSurrogate._inputPopulationId,
        )
      aggregateMethod = this@MeasureGroupPopulationSurrogate.aggregateMethod
    }

  public companion object {
    public fun fromModel(model: Measure.Group.Population): MeasureGroupPopulationSurrogate =
      with(model) {
        MeasureGroupPopulationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          linkId = this@with.linkId?.value
          _linkId = this@with.linkId?.toElement()
          code = this@with.code
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          criteria = this@with.criteria
          groupDefinition = this@with.groupDefinition
          inputPopulationId = this@with.inputPopulationId?.value
          _inputPopulationId = this@with.inputPopulationId?.toElement()
          aggregateMethod = this@with.aggregateMethod
        }
      }
  }
}

@Serializable
internal data class MeasureGroupStratifierComponentSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var code: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var criteria: Expression? = null,
  public var groupDefinition: Reference? = null,
) {
  public fun toModel(): Measure.Group.Stratifier.Component =
    Measure.Group.Stratifier.Component().apply {
      id = this@MeasureGroupStratifierComponentSurrogate.id
      extension = this@MeasureGroupStratifierComponentSurrogate.extension
      modifierExtension = this@MeasureGroupStratifierComponentSurrogate.modifierExtension
      linkId =
        R5String.of(
          this@MeasureGroupStratifierComponentSurrogate.linkId,
          this@MeasureGroupStratifierComponentSurrogate._linkId,
        )
      code = this@MeasureGroupStratifierComponentSurrogate.code
      description =
        Markdown.of(
          this@MeasureGroupStratifierComponentSurrogate.description,
          this@MeasureGroupStratifierComponentSurrogate._description,
        )
      criteria = this@MeasureGroupStratifierComponentSurrogate.criteria
      groupDefinition = this@MeasureGroupStratifierComponentSurrogate.groupDefinition
    }

  public companion object {
    public fun fromModel(
      model: Measure.Group.Stratifier.Component
    ): MeasureGroupStratifierComponentSurrogate =
      with(model) {
        MeasureGroupStratifierComponentSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          linkId = this@with.linkId?.value
          _linkId = this@with.linkId?.toElement()
          code = this@with.code
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          criteria = this@with.criteria
          groupDefinition = this@with.groupDefinition
        }
      }
  }
}

@Serializable
internal data class MeasureGroupStratifierSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var code: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var criteria: Expression? = null,
  public var groupDefinition: Reference? = null,
  public var component: List<Measure.Group.Stratifier.Component>? = null,
) {
  public fun toModel(): Measure.Group.Stratifier =
    Measure.Group.Stratifier().apply {
      id = this@MeasureGroupStratifierSurrogate.id
      extension = this@MeasureGroupStratifierSurrogate.extension
      modifierExtension = this@MeasureGroupStratifierSurrogate.modifierExtension
      linkId =
        R5String.of(
          this@MeasureGroupStratifierSurrogate.linkId,
          this@MeasureGroupStratifierSurrogate._linkId,
        )
      code = this@MeasureGroupStratifierSurrogate.code
      description =
        Markdown.of(
          this@MeasureGroupStratifierSurrogate.description,
          this@MeasureGroupStratifierSurrogate._description,
        )
      criteria = this@MeasureGroupStratifierSurrogate.criteria
      groupDefinition = this@MeasureGroupStratifierSurrogate.groupDefinition
      component = this@MeasureGroupStratifierSurrogate.component
    }

  public companion object {
    public fun fromModel(model: Measure.Group.Stratifier): MeasureGroupStratifierSurrogate =
      with(model) {
        MeasureGroupStratifierSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          linkId = this@with.linkId?.value
          _linkId = this@with.linkId?.toElement()
          code = this@with.code
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          criteria = this@with.criteria
          groupDefinition = this@with.groupDefinition
          component = this@with.component
        }
      }
  }
}

@Serializable
internal data class MeasureGroupSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var code: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var type: List<CodeableConcept?>? = null,
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
  public var basis: KotlinString? = null,
  public var _basis: Element? = null,
  public var scoring: CodeableConcept? = null,
  public var scoringUnit: CodeableConcept? = null,
  public var rateAggregation: KotlinString? = null,
  public var _rateAggregation: Element? = null,
  public var improvementNotation: CodeableConcept? = null,
  public var library: List<KotlinString?>? = null,
  public var _library: List<Element?>? = null,
  public var population: List<Measure.Group.Population>? = null,
  public var stratifier: List<Measure.Group.Stratifier>? = null,
) {
  public fun toModel(): Measure.Group =
    Measure.Group().apply {
      id = this@MeasureGroupSurrogate.id
      extension = this@MeasureGroupSurrogate.extension
      modifierExtension = this@MeasureGroupSurrogate.modifierExtension
      linkId = R5String.of(this@MeasureGroupSurrogate.linkId, this@MeasureGroupSurrogate._linkId)
      code = this@MeasureGroupSurrogate.code
      description =
        Markdown.of(this@MeasureGroupSurrogate.description, this@MeasureGroupSurrogate._description)
      type = this@MeasureGroupSurrogate.type
      subject =
        Measure.Group.Subject?.from(
          this@MeasureGroupSurrogate.subjectCodeableConcept,
          this@MeasureGroupSurrogate.subjectReference,
        )
      basis =
        Enumeration.of(
          this@MeasureGroupSurrogate.basis?.let { com.google.fhir.model.r5.BasisType.fromCode(it) },
          this@MeasureGroupSurrogate._basis,
        )
      scoring = this@MeasureGroupSurrogate.scoring
      scoringUnit = this@MeasureGroupSurrogate.scoringUnit
      rateAggregation =
        Markdown.of(
          this@MeasureGroupSurrogate.rateAggregation,
          this@MeasureGroupSurrogate._rateAggregation,
        )
      improvementNotation = this@MeasureGroupSurrogate.improvementNotation
      library =
        if (
          this@MeasureGroupSurrogate.library == null && this@MeasureGroupSurrogate._library == null
        ) {
          null
        } else {
          (this@MeasureGroupSurrogate.library
              ?: List(this@MeasureGroupSurrogate._library!!.size) { null })
            .zip(
              this@MeasureGroupSurrogate._library
                ?: List(this@MeasureGroupSurrogate.library!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      population = this@MeasureGroupSurrogate.population
      stratifier = this@MeasureGroupSurrogate.stratifier
    }

  public companion object {
    public fun fromModel(model: Measure.Group): MeasureGroupSurrogate =
      with(model) {
        MeasureGroupSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          linkId = this@with.linkId?.value
          _linkId = this@with.linkId?.toElement()
          code = this@with.code
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          type = this@with.type
          subjectCodeableConcept = this@with.subject?.asCodeableConcept()?.value
          subjectReference = this@with.subject?.asReference()?.value
          basis = this@with.basis?.value?.getCode()
          _basis = this@with.basis?.toElement()
          scoring = this@with.scoring
          scoringUnit = this@with.scoringUnit
          rateAggregation = this@with.rateAggregation?.value
          _rateAggregation = this@with.rateAggregation?.toElement()
          improvementNotation = this@with.improvementNotation
          library = this@with.library?.map { it?.value }?.takeUnless { it.all { it == null } }
          _library =
            this@with.library?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          population = this@with.population
          stratifier = this@with.stratifier
        }
      }
  }
}

@Serializable
internal data class MeasureSupplementalDataSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var code: CodeableConcept? = null,
  public var usage: List<CodeableConcept?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var criteria: Expression? = null,
) {
  public fun toModel(): Measure.SupplementalData =
    Measure.SupplementalData().apply {
      id = this@MeasureSupplementalDataSurrogate.id
      extension = this@MeasureSupplementalDataSurrogate.extension
      modifierExtension = this@MeasureSupplementalDataSurrogate.modifierExtension
      linkId =
        R5String.of(
          this@MeasureSupplementalDataSurrogate.linkId,
          this@MeasureSupplementalDataSurrogate._linkId,
        )
      code = this@MeasureSupplementalDataSurrogate.code
      usage = this@MeasureSupplementalDataSurrogate.usage
      description =
        Markdown.of(
          this@MeasureSupplementalDataSurrogate.description,
          this@MeasureSupplementalDataSurrogate._description,
        )
      criteria = this@MeasureSupplementalDataSurrogate.criteria
    }

  public companion object {
    public fun fromModel(model: Measure.SupplementalData): MeasureSupplementalDataSurrogate =
      with(model) {
        MeasureSupplementalDataSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          linkId = this@with.linkId?.value
          _linkId = this@with.linkId?.toElement()
          code = this@with.code
          usage = this@with.usage
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          criteria = this@with.criteria
        }
      }
  }
}

@Serializable
internal data class MeasureSurrogate(
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
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var subtitle: KotlinString? = null,
  public var _subtitle: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
  public var basis: KotlinString? = null,
  public var _basis: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: List<ContactDetail?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: List<UsageContext?>? = null,
  public var jurisdiction: List<CodeableConcept?>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var usage: KotlinString? = null,
  public var _usage: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var copyrightLabel: KotlinString? = null,
  public var _copyrightLabel: Element? = null,
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
  public var library: List<KotlinString?>? = null,
  public var _library: List<Element?>? = null,
  public var disclaimer: KotlinString? = null,
  public var _disclaimer: Element? = null,
  public var scoring: CodeableConcept? = null,
  public var scoringUnit: CodeableConcept? = null,
  public var compositeScoring: CodeableConcept? = null,
  public var type: List<CodeableConcept?>? = null,
  public var riskAdjustment: KotlinString? = null,
  public var _riskAdjustment: Element? = null,
  public var rateAggregation: KotlinString? = null,
  public var _rateAggregation: Element? = null,
  public var rationale: KotlinString? = null,
  public var _rationale: Element? = null,
  public var clinicalRecommendationStatement: KotlinString? = null,
  public var _clinicalRecommendationStatement: Element? = null,
  public var improvementNotation: CodeableConcept? = null,
  public var term: List<Measure.Term>? = null,
  public var guidance: KotlinString? = null,
  public var _guidance: Element? = null,
  public var group: List<Measure.Group>? = null,
  public var supplementalData: List<Measure.SupplementalData>? = null,
) {
  public fun toModel(): Measure =
    Measure().apply {
      id = this@MeasureSurrogate.id
      meta = this@MeasureSurrogate.meta
      implicitRules =
        Uri.of(this@MeasureSurrogate.implicitRules, this@MeasureSurrogate._implicitRules)
      language = Code.of(this@MeasureSurrogate.language, this@MeasureSurrogate._language)
      text = this@MeasureSurrogate.text
      contained = this@MeasureSurrogate.contained
      extension = this@MeasureSurrogate.extension
      modifierExtension = this@MeasureSurrogate.modifierExtension
      url = Uri.of(this@MeasureSurrogate.url, this@MeasureSurrogate._url)
      identifier = this@MeasureSurrogate.identifier
      version = R5String.of(this@MeasureSurrogate.version, this@MeasureSurrogate._version)
      versionAlgorithm =
        Measure.VersionAlgorithm?.from(
          R5String.of(
            this@MeasureSurrogate.versionAlgorithmString,
            this@MeasureSurrogate._versionAlgorithmString,
          ),
          this@MeasureSurrogate.versionAlgorithmCoding,
        )
      name = R5String.of(this@MeasureSurrogate.name, this@MeasureSurrogate._name)
      title = R5String.of(this@MeasureSurrogate.title, this@MeasureSurrogate._title)
      subtitle = R5String.of(this@MeasureSurrogate.subtitle, this@MeasureSurrogate._subtitle)
      status =
        Enumeration.of(
          this@MeasureSurrogate.status?.let {
            com.google.fhir.model.r5.PublicationStatus.fromCode(it)
          },
          this@MeasureSurrogate._status,
        )
      experimental =
        R5Boolean.of(this@MeasureSurrogate.experimental, this@MeasureSurrogate._experimental)
      subject =
        Measure.Subject?.from(
          this@MeasureSurrogate.subjectCodeableConcept,
          this@MeasureSurrogate.subjectReference,
        )
      basis =
        Enumeration.of(
          this@MeasureSurrogate.basis?.let { com.google.fhir.model.r5.BasisType.fromCode(it) },
          this@MeasureSurrogate._basis,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@MeasureSurrogate.date),
          this@MeasureSurrogate._date,
        )
      publisher = R5String.of(this@MeasureSurrogate.publisher, this@MeasureSurrogate._publisher)
      contact = this@MeasureSurrogate.contact
      description =
        Markdown.of(this@MeasureSurrogate.description, this@MeasureSurrogate._description)
      useContext = this@MeasureSurrogate.useContext
      jurisdiction = this@MeasureSurrogate.jurisdiction
      purpose = Markdown.of(this@MeasureSurrogate.purpose, this@MeasureSurrogate._purpose)
      usage = Markdown.of(this@MeasureSurrogate.usage, this@MeasureSurrogate._usage)
      copyright = Markdown.of(this@MeasureSurrogate.copyright, this@MeasureSurrogate._copyright)
      copyrightLabel =
        R5String.of(this@MeasureSurrogate.copyrightLabel, this@MeasureSurrogate._copyrightLabel)
      approvalDate =
        Date.of(
          FhirDate.fromString(this@MeasureSurrogate.approvalDate),
          this@MeasureSurrogate._approvalDate,
        )
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@MeasureSurrogate.lastReviewDate),
          this@MeasureSurrogate._lastReviewDate,
        )
      effectivePeriod = this@MeasureSurrogate.effectivePeriod
      topic = this@MeasureSurrogate.topic
      author = this@MeasureSurrogate.author
      editor = this@MeasureSurrogate.editor
      reviewer = this@MeasureSurrogate.reviewer
      endorser = this@MeasureSurrogate.endorser
      relatedArtifact = this@MeasureSurrogate.relatedArtifact
      library =
        if (this@MeasureSurrogate.library == null && this@MeasureSurrogate._library == null) {
          null
        } else {
          (this@MeasureSurrogate.library ?: List(this@MeasureSurrogate._library!!.size) { null })
            .zip(
              this@MeasureSurrogate._library ?: List(this@MeasureSurrogate.library!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      disclaimer = Markdown.of(this@MeasureSurrogate.disclaimer, this@MeasureSurrogate._disclaimer)
      scoring = this@MeasureSurrogate.scoring
      scoringUnit = this@MeasureSurrogate.scoringUnit
      compositeScoring = this@MeasureSurrogate.compositeScoring
      type = this@MeasureSurrogate.type
      riskAdjustment =
        Markdown.of(this@MeasureSurrogate.riskAdjustment, this@MeasureSurrogate._riskAdjustment)
      rateAggregation =
        Markdown.of(this@MeasureSurrogate.rateAggregation, this@MeasureSurrogate._rateAggregation)
      rationale = Markdown.of(this@MeasureSurrogate.rationale, this@MeasureSurrogate._rationale)
      clinicalRecommendationStatement =
        Markdown.of(
          this@MeasureSurrogate.clinicalRecommendationStatement,
          this@MeasureSurrogate._clinicalRecommendationStatement,
        )
      improvementNotation = this@MeasureSurrogate.improvementNotation
      term = this@MeasureSurrogate.term
      guidance = Markdown.of(this@MeasureSurrogate.guidance, this@MeasureSurrogate._guidance)
      group = this@MeasureSurrogate.group
      supplementalData = this@MeasureSurrogate.supplementalData
    }

  public companion object {
    public fun fromModel(model: Measure): MeasureSurrogate =
      with(model) {
        MeasureSurrogate().apply {
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
          versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.value
          _versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.toElement()
          versionAlgorithmCoding = this@with.versionAlgorithm?.asCoding()?.value
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          subtitle = this@with.subtitle?.value
          _subtitle = this@with.subtitle?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          experimental = this@with.experimental?.value
          _experimental = this@with.experimental?.toElement()
          subjectCodeableConcept = this@with.subject?.asCodeableConcept()?.value
          subjectReference = this@with.subject?.asReference()?.value
          basis = this@with.basis?.value?.getCode()
          _basis = this@with.basis?.toElement()
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          publisher = this@with.publisher?.value
          _publisher = this@with.publisher?.toElement()
          contact = this@with.contact
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          useContext = this@with.useContext
          jurisdiction = this@with.jurisdiction
          purpose = this@with.purpose?.value
          _purpose = this@with.purpose?.toElement()
          usage = this@with.usage?.value
          _usage = this@with.usage?.toElement()
          copyright = this@with.copyright?.value
          _copyright = this@with.copyright?.toElement()
          copyrightLabel = this@with.copyrightLabel?.value
          _copyrightLabel = this@with.copyrightLabel?.toElement()
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
          library = this@with.library?.map { it?.value }?.takeUnless { it.all { it == null } }
          _library =
            this@with.library?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          disclaimer = this@with.disclaimer?.value
          _disclaimer = this@with.disclaimer?.toElement()
          scoring = this@with.scoring
          scoringUnit = this@with.scoringUnit
          compositeScoring = this@with.compositeScoring
          type = this@with.type
          riskAdjustment = this@with.riskAdjustment?.value
          _riskAdjustment = this@with.riskAdjustment?.toElement()
          rateAggregation = this@with.rateAggregation?.value
          _rateAggregation = this@with.rateAggregation?.toElement()
          rationale = this@with.rationale?.value
          _rationale = this@with.rationale?.toElement()
          clinicalRecommendationStatement = this@with.clinicalRecommendationStatement?.value
          _clinicalRecommendationStatement = this@with.clinicalRecommendationStatement?.toElement()
          improvementNotation = this@with.improvementNotation
          term = this@with.term
          guidance = this@with.guidance?.value
          _guidance = this@with.guidance?.toElement()
          group = this@with.group
          supplementalData = this@with.supplementalData
        }
      }
  }
}
