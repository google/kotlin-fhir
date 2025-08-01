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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MeasureTermSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept? = null,
  public var definition: KotlinString? = null,
  public var _definition: Element? = null,
) {
  public fun toModel(): Measure.Term =
    Measure.Term(
      id = this@MeasureTermSurrogate.id,
      extension = this@MeasureTermSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MeasureTermSurrogate.modifierExtension ?: mutableListOf(),
      code = this@MeasureTermSurrogate.code,
      definition =
        Markdown.of(this@MeasureTermSurrogate.definition, this@MeasureTermSurrogate._definition),
    )

  public companion object {
    public fun fromModel(model: Measure.Term): MeasureTermSurrogate =
      with(model) {
        MeasureTermSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          definition = this@with.definition?.value,
          _definition = this@with.definition?.toElement(),
        )
      }
  }
}

@Serializable
internal data class MeasureGroupPopulationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
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
    Measure.Group.Population(
      id = this@MeasureGroupPopulationSurrogate.id,
      extension = this@MeasureGroupPopulationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MeasureGroupPopulationSurrogate.modifierExtension ?: mutableListOf(),
      linkId =
        R5String.of(
          this@MeasureGroupPopulationSurrogate.linkId,
          this@MeasureGroupPopulationSurrogate._linkId,
        ),
      code = this@MeasureGroupPopulationSurrogate.code,
      description =
        Markdown.of(
          this@MeasureGroupPopulationSurrogate.description,
          this@MeasureGroupPopulationSurrogate._description,
        ),
      criteria = this@MeasureGroupPopulationSurrogate.criteria,
      groupDefinition = this@MeasureGroupPopulationSurrogate.groupDefinition,
      inputPopulationId =
        R5String.of(
          this@MeasureGroupPopulationSurrogate.inputPopulationId,
          this@MeasureGroupPopulationSurrogate._inputPopulationId,
        ),
      aggregateMethod = this@MeasureGroupPopulationSurrogate.aggregateMethod,
    )

  public companion object {
    public fun fromModel(model: Measure.Group.Population): MeasureGroupPopulationSurrogate =
      with(model) {
        MeasureGroupPopulationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          linkId = this@with.linkId?.value,
          _linkId = this@with.linkId?.toElement(),
          code = this@with.code,
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          criteria = this@with.criteria,
          groupDefinition = this@with.groupDefinition,
          inputPopulationId = this@with.inputPopulationId?.value,
          _inputPopulationId = this@with.inputPopulationId?.toElement(),
          aggregateMethod = this@with.aggregateMethod,
        )
      }
  }
}

@Serializable
internal data class MeasureGroupStratifierComponentSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var code: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var criteria: Expression? = null,
  public var groupDefinition: Reference? = null,
) {
  public fun toModel(): Measure.Group.Stratifier.Component =
    Measure.Group.Stratifier.Component(
      id = this@MeasureGroupStratifierComponentSurrogate.id,
      extension = this@MeasureGroupStratifierComponentSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MeasureGroupStratifierComponentSurrogate.modifierExtension ?: mutableListOf(),
      linkId =
        R5String.of(
          this@MeasureGroupStratifierComponentSurrogate.linkId,
          this@MeasureGroupStratifierComponentSurrogate._linkId,
        ),
      code = this@MeasureGroupStratifierComponentSurrogate.code,
      description =
        Markdown.of(
          this@MeasureGroupStratifierComponentSurrogate.description,
          this@MeasureGroupStratifierComponentSurrogate._description,
        ),
      criteria = this@MeasureGroupStratifierComponentSurrogate.criteria,
      groupDefinition = this@MeasureGroupStratifierComponentSurrogate.groupDefinition,
    )

  public companion object {
    public fun fromModel(
      model: Measure.Group.Stratifier.Component
    ): MeasureGroupStratifierComponentSurrogate =
      with(model) {
        MeasureGroupStratifierComponentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          linkId = this@with.linkId?.value,
          _linkId = this@with.linkId?.toElement(),
          code = this@with.code,
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          criteria = this@with.criteria,
          groupDefinition = this@with.groupDefinition,
        )
      }
  }
}

@Serializable
internal data class MeasureGroupStratifierSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var code: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var criteria: Expression? = null,
  public var groupDefinition: Reference? = null,
  public var component: MutableList<Measure.Group.Stratifier.Component>? = null,
) {
  public fun toModel(): Measure.Group.Stratifier =
    Measure.Group.Stratifier(
      id = this@MeasureGroupStratifierSurrogate.id,
      extension = this@MeasureGroupStratifierSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MeasureGroupStratifierSurrogate.modifierExtension ?: mutableListOf(),
      linkId =
        R5String.of(
          this@MeasureGroupStratifierSurrogate.linkId,
          this@MeasureGroupStratifierSurrogate._linkId,
        ),
      code = this@MeasureGroupStratifierSurrogate.code,
      description =
        Markdown.of(
          this@MeasureGroupStratifierSurrogate.description,
          this@MeasureGroupStratifierSurrogate._description,
        ),
      criteria = this@MeasureGroupStratifierSurrogate.criteria,
      groupDefinition = this@MeasureGroupStratifierSurrogate.groupDefinition,
      component = this@MeasureGroupStratifierSurrogate.component ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Measure.Group.Stratifier): MeasureGroupStratifierSurrogate =
      with(model) {
        MeasureGroupStratifierSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          linkId = this@with.linkId?.value,
          _linkId = this@with.linkId?.toElement(),
          code = this@with.code,
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          criteria = this@with.criteria,
          groupDefinition = this@with.groupDefinition,
          component = this@with.component.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class MeasureGroupSubjectSurrogate(
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
) {
  public fun toModel(): Measure.Group.Subject =
    Measure.Group.Subject?.from(
      this@MeasureGroupSubjectSurrogate.subjectCodeableConcept,
      this@MeasureGroupSubjectSurrogate.subjectReference,
    )!!

  public companion object {
    public fun fromModel(model: Measure.Group.Subject): MeasureGroupSubjectSurrogate =
      with(model) {
        MeasureGroupSubjectSurrogate(
          subjectCodeableConcept = this@with.asCodeableConcept()?.value,
          subjectReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class MeasureGroupSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var code: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var subject: Measure.Group.Subject? = null,
  public var basis: KotlinString? = null,
  public var _basis: Element? = null,
  public var scoring: CodeableConcept? = null,
  public var scoringUnit: CodeableConcept? = null,
  public var rateAggregation: KotlinString? = null,
  public var _rateAggregation: Element? = null,
  public var improvementNotation: CodeableConcept? = null,
  public var library: MutableList<KotlinString?>? = null,
  public var _library: MutableList<Element?>? = null,
  public var population: MutableList<Measure.Group.Population>? = null,
  public var stratifier: MutableList<Measure.Group.Stratifier>? = null,
) {
  public fun toModel(): Measure.Group =
    Measure.Group(
      id = this@MeasureGroupSurrogate.id,
      extension = this@MeasureGroupSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MeasureGroupSurrogate.modifierExtension ?: mutableListOf(),
      linkId = R5String.of(this@MeasureGroupSurrogate.linkId, this@MeasureGroupSurrogate._linkId),
      code = this@MeasureGroupSurrogate.code,
      description =
        Markdown.of(
          this@MeasureGroupSurrogate.description,
          this@MeasureGroupSurrogate._description,
        ),
      type = this@MeasureGroupSurrogate.type ?: mutableListOf(),
      subject = this@MeasureGroupSurrogate.subject,
      basis =
        this@MeasureGroupSurrogate.basis?.let {
          Enumeration.of(
            com.google.fhir.model.r5.BasisType.fromCode(it!!),
            this@MeasureGroupSurrogate._basis,
          )
        },
      scoring = this@MeasureGroupSurrogate.scoring,
      scoringUnit = this@MeasureGroupSurrogate.scoringUnit,
      rateAggregation =
        Markdown.of(
          this@MeasureGroupSurrogate.rateAggregation,
          this@MeasureGroupSurrogate._rateAggregation,
        ),
      improvementNotation = this@MeasureGroupSurrogate.improvementNotation,
      library =
        if (
          this@MeasureGroupSurrogate.library == null && this@MeasureGroupSurrogate._library == null
        ) {
          mutableListOf()
        } else {
          (this@MeasureGroupSurrogate.library
              ?: List(this@MeasureGroupSurrogate._library!!.size) { null })
            .zip(
              this@MeasureGroupSurrogate._library
                ?: List(this@MeasureGroupSurrogate.library!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      population = this@MeasureGroupSurrogate.population ?: mutableListOf(),
      stratifier = this@MeasureGroupSurrogate.stratifier ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Measure.Group): MeasureGroupSurrogate =
      with(model) {
        MeasureGroupSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          linkId = this@with.linkId?.value,
          _linkId = this@with.linkId?.toElement(),
          code = this@with.code,
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          type = this@with.type.takeUnless { it.all { it == null } },
          subject = this@with.subject,
          basis = this@with.basis?.value?.getCode(),
          _basis = this@with.basis?.toElement(),
          scoring = this@with.scoring,
          scoringUnit = this@with.scoringUnit,
          rateAggregation = this@with.rateAggregation?.value,
          _rateAggregation = this@with.rateAggregation?.toElement(),
          improvementNotation = this@with.improvementNotation,
          library =
            this@with.library.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _library =
            this@with.library
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          population = this@with.population.takeUnless { it.all { it == null } },
          stratifier = this@with.stratifier.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class MeasureSupplementalDataSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var code: CodeableConcept? = null,
  public var usage: MutableList<CodeableConcept>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var criteria: Expression,
) {
  public fun toModel(): Measure.SupplementalData =
    Measure.SupplementalData(
      id = this@MeasureSupplementalDataSurrogate.id,
      extension = this@MeasureSupplementalDataSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MeasureSupplementalDataSurrogate.modifierExtension ?: mutableListOf(),
      linkId =
        R5String.of(
          this@MeasureSupplementalDataSurrogate.linkId,
          this@MeasureSupplementalDataSurrogate._linkId,
        ),
      code = this@MeasureSupplementalDataSurrogate.code,
      usage = this@MeasureSupplementalDataSurrogate.usage ?: mutableListOf(),
      description =
        Markdown.of(
          this@MeasureSupplementalDataSurrogate.description,
          this@MeasureSupplementalDataSurrogate._description,
        ),
      criteria = this@MeasureSupplementalDataSurrogate.criteria,
    )

  public companion object {
    public fun fromModel(model: Measure.SupplementalData): MeasureSupplementalDataSurrogate =
      with(model) {
        MeasureSupplementalDataSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          linkId = this@with.linkId?.value,
          _linkId = this@with.linkId?.toElement(),
          code = this@with.code,
          usage = this@with.usage.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          criteria = this@with.criteria,
        )
      }
  }
}

@Serializable
internal data class MeasureVersionAlgorithmSurrogate(
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
) {
  public fun toModel(): Measure.VersionAlgorithm =
    Measure.VersionAlgorithm?.from(
      R5String.of(
        this@MeasureVersionAlgorithmSurrogate.versionAlgorithmString,
        this@MeasureVersionAlgorithmSurrogate._versionAlgorithmString,
      ),
      this@MeasureVersionAlgorithmSurrogate.versionAlgorithmCoding,
    )!!

  public companion object {
    public fun fromModel(model: Measure.VersionAlgorithm): MeasureVersionAlgorithmSurrogate =
      with(model) {
        MeasureVersionAlgorithmSurrogate(
          versionAlgorithmString = this@with.asString()?.value?.value,
          _versionAlgorithmString = this@with.asString()?.value?.toElement(),
          versionAlgorithmCoding = this@with.asCoding()?.value,
        )
      }
  }
}

@Serializable
internal data class MeasureSubjectSurrogate(
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
) {
  public fun toModel(): Measure.Subject =
    Measure.Subject?.from(
      this@MeasureSubjectSurrogate.subjectCodeableConcept,
      this@MeasureSubjectSurrogate.subjectReference,
    )!!

  public companion object {
    public fun fromModel(model: Measure.Subject): MeasureSubjectSurrogate =
      with(model) {
        MeasureSubjectSurrogate(
          subjectCodeableConcept = this@with.asCodeableConcept()?.value,
          subjectReference = this@with.asReference()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var versionAlgorithm: Measure.VersionAlgorithm? = null,
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
  public var subject: Measure.Subject? = null,
  public var basis: KotlinString? = null,
  public var _basis: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: MutableList<ContactDetail>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: MutableList<UsageContext>? = null,
  public var jurisdiction: MutableList<CodeableConcept>? = null,
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
  public var topic: MutableList<CodeableConcept>? = null,
  public var author: MutableList<ContactDetail>? = null,
  public var editor: MutableList<ContactDetail>? = null,
  public var reviewer: MutableList<ContactDetail>? = null,
  public var endorser: MutableList<ContactDetail>? = null,
  public var relatedArtifact: MutableList<RelatedArtifact>? = null,
  public var library: MutableList<KotlinString?>? = null,
  public var _library: MutableList<Element?>? = null,
  public var disclaimer: KotlinString? = null,
  public var _disclaimer: Element? = null,
  public var scoring: CodeableConcept? = null,
  public var scoringUnit: CodeableConcept? = null,
  public var compositeScoring: CodeableConcept? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var riskAdjustment: KotlinString? = null,
  public var _riskAdjustment: Element? = null,
  public var rateAggregation: KotlinString? = null,
  public var _rateAggregation: Element? = null,
  public var rationale: KotlinString? = null,
  public var _rationale: Element? = null,
  public var clinicalRecommendationStatement: KotlinString? = null,
  public var _clinicalRecommendationStatement: Element? = null,
  public var improvementNotation: CodeableConcept? = null,
  public var term: MutableList<Measure.Term>? = null,
  public var guidance: KotlinString? = null,
  public var _guidance: Element? = null,
  public var group: MutableList<Measure.Group>? = null,
  public var supplementalData: MutableList<Measure.SupplementalData>? = null,
) {
  public fun toModel(): Measure =
    Measure(
      id = this@MeasureSurrogate.id,
      meta = this@MeasureSurrogate.meta,
      implicitRules =
        Uri.of(this@MeasureSurrogate.implicitRules, this@MeasureSurrogate._implicitRules),
      language = Code.of(this@MeasureSurrogate.language, this@MeasureSurrogate._language),
      text = this@MeasureSurrogate.text,
      contained = this@MeasureSurrogate.contained ?: mutableListOf(),
      extension = this@MeasureSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MeasureSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@MeasureSurrogate.url, this@MeasureSurrogate._url),
      identifier = this@MeasureSurrogate.identifier ?: mutableListOf(),
      version = R5String.of(this@MeasureSurrogate.version, this@MeasureSurrogate._version),
      versionAlgorithm = this@MeasureSurrogate.versionAlgorithm,
      name = R5String.of(this@MeasureSurrogate.name, this@MeasureSurrogate._name),
      title = R5String.of(this@MeasureSurrogate.title, this@MeasureSurrogate._title),
      subtitle = R5String.of(this@MeasureSurrogate.subtitle, this@MeasureSurrogate._subtitle),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.PublicationStatus.fromCode(this@MeasureSurrogate.status!!),
          this@MeasureSurrogate._status,
        ),
      experimental =
        R5Boolean.of(this@MeasureSurrogate.experimental, this@MeasureSurrogate._experimental),
      subject = this@MeasureSurrogate.subject,
      basis =
        this@MeasureSurrogate.basis?.let {
          Enumeration.of(
            com.google.fhir.model.r5.BasisType.fromCode(it!!),
            this@MeasureSurrogate._basis,
          )
        },
      date =
        DateTime.of(
          FhirDateTime.fromString(this@MeasureSurrogate.date),
          this@MeasureSurrogate._date,
        ),
      publisher = R5String.of(this@MeasureSurrogate.publisher, this@MeasureSurrogate._publisher),
      contact = this@MeasureSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(this@MeasureSurrogate.description, this@MeasureSurrogate._description),
      useContext = this@MeasureSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@MeasureSurrogate.jurisdiction ?: mutableListOf(),
      purpose = Markdown.of(this@MeasureSurrogate.purpose, this@MeasureSurrogate._purpose),
      usage = Markdown.of(this@MeasureSurrogate.usage, this@MeasureSurrogate._usage),
      copyright = Markdown.of(this@MeasureSurrogate.copyright, this@MeasureSurrogate._copyright),
      copyrightLabel =
        R5String.of(this@MeasureSurrogate.copyrightLabel, this@MeasureSurrogate._copyrightLabel),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@MeasureSurrogate.approvalDate),
          this@MeasureSurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@MeasureSurrogate.lastReviewDate),
          this@MeasureSurrogate._lastReviewDate,
        ),
      effectivePeriod = this@MeasureSurrogate.effectivePeriod,
      topic = this@MeasureSurrogate.topic ?: mutableListOf(),
      author = this@MeasureSurrogate.author ?: mutableListOf(),
      editor = this@MeasureSurrogate.editor ?: mutableListOf(),
      reviewer = this@MeasureSurrogate.reviewer ?: mutableListOf(),
      endorser = this@MeasureSurrogate.endorser ?: mutableListOf(),
      relatedArtifact = this@MeasureSurrogate.relatedArtifact ?: mutableListOf(),
      library =
        if (this@MeasureSurrogate.library == null && this@MeasureSurrogate._library == null) {
          mutableListOf()
        } else {
          (this@MeasureSurrogate.library ?: List(this@MeasureSurrogate._library!!.size) { null })
            .zip(
              this@MeasureSurrogate._library ?: List(this@MeasureSurrogate.library!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      disclaimer = Markdown.of(this@MeasureSurrogate.disclaimer, this@MeasureSurrogate._disclaimer),
      scoring = this@MeasureSurrogate.scoring,
      scoringUnit = this@MeasureSurrogate.scoringUnit,
      compositeScoring = this@MeasureSurrogate.compositeScoring,
      type = this@MeasureSurrogate.type ?: mutableListOf(),
      riskAdjustment =
        Markdown.of(this@MeasureSurrogate.riskAdjustment, this@MeasureSurrogate._riskAdjustment),
      rateAggregation =
        Markdown.of(this@MeasureSurrogate.rateAggregation, this@MeasureSurrogate._rateAggregation),
      rationale = Markdown.of(this@MeasureSurrogate.rationale, this@MeasureSurrogate._rationale),
      clinicalRecommendationStatement =
        Markdown.of(
          this@MeasureSurrogate.clinicalRecommendationStatement,
          this@MeasureSurrogate._clinicalRecommendationStatement,
        ),
      improvementNotation = this@MeasureSurrogate.improvementNotation,
      term = this@MeasureSurrogate.term ?: mutableListOf(),
      guidance = Markdown.of(this@MeasureSurrogate.guidance, this@MeasureSurrogate._guidance),
      group = this@MeasureSurrogate.group ?: mutableListOf(),
      supplementalData = this@MeasureSurrogate.supplementalData ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Measure): MeasureSurrogate =
      with(model) {
        MeasureSurrogate(
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
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          versionAlgorithm = this@with.versionAlgorithm,
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          subtitle = this@with.subtitle?.value,
          _subtitle = this@with.subtitle?.toElement(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          subject = this@with.subject,
          basis = this@with.basis?.value?.getCode(),
          _basis = this@with.basis?.toElement(),
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          jurisdiction = this@with.jurisdiction.takeUnless { it.all { it == null } },
          purpose = this@with.purpose?.value,
          _purpose = this@with.purpose?.toElement(),
          usage = this@with.usage?.value,
          _usage = this@with.usage?.toElement(),
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
          copyrightLabel = this@with.copyrightLabel?.value,
          _copyrightLabel = this@with.copyrightLabel?.toElement(),
          approvalDate = this@with.approvalDate?.value?.toString(),
          _approvalDate = this@with.approvalDate?.toElement(),
          lastReviewDate = this@with.lastReviewDate?.value?.toString(),
          _lastReviewDate = this@with.lastReviewDate?.toElement(),
          effectivePeriod = this@with.effectivePeriod,
          topic = this@with.topic.takeUnless { it.all { it == null } },
          author = this@with.author.takeUnless { it.all { it == null } },
          editor = this@with.editor.takeUnless { it.all { it == null } },
          reviewer = this@with.reviewer.takeUnless { it.all { it == null } },
          endorser = this@with.endorser.takeUnless { it.all { it == null } },
          relatedArtifact = this@with.relatedArtifact.takeUnless { it.all { it == null } },
          library =
            this@with.library.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _library =
            this@with.library
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          disclaimer = this@with.disclaimer?.value,
          _disclaimer = this@with.disclaimer?.toElement(),
          scoring = this@with.scoring,
          scoringUnit = this@with.scoringUnit,
          compositeScoring = this@with.compositeScoring,
          type = this@with.type.takeUnless { it.all { it == null } },
          riskAdjustment = this@with.riskAdjustment?.value,
          _riskAdjustment = this@with.riskAdjustment?.toElement(),
          rateAggregation = this@with.rateAggregation?.value,
          _rateAggregation = this@with.rateAggregation?.toElement(),
          rationale = this@with.rationale?.value,
          _rationale = this@with.rationale?.toElement(),
          clinicalRecommendationStatement = this@with.clinicalRecommendationStatement?.value,
          _clinicalRecommendationStatement = this@with.clinicalRecommendationStatement?.toElement(),
          improvementNotation = this@with.improvementNotation,
          term = this@with.term.takeUnless { it.all { it == null } },
          guidance = this@with.guidance?.value,
          _guidance = this@with.guidance?.toElement(),
          group = this@with.group.takeUnless { it.all { it == null } },
          supplementalData = this@with.supplementalData.takeUnless { it.all { it == null } },
        )
      }
  }
}
