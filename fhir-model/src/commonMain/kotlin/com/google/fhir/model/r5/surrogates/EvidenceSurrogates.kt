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
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Decimal
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Evidence
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.UnsignedInt
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class EvidenceVariableDefinitionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var note: List<Annotation?>? = null,
  public var variableRole: CodeableConcept? = null,
  public var observed: Reference? = null,
  public var intended: Reference? = null,
  public var directnessMatch: CodeableConcept? = null,
) {
  public fun toModel(): Evidence.VariableDefinition =
    Evidence.VariableDefinition().apply {
      id = this@EvidenceVariableDefinitionSurrogate.id
      extension = this@EvidenceVariableDefinitionSurrogate.extension
      modifierExtension = this@EvidenceVariableDefinitionSurrogate.modifierExtension
      description =
        Markdown.of(
          this@EvidenceVariableDefinitionSurrogate.description,
          this@EvidenceVariableDefinitionSurrogate._description,
        )
      note = this@EvidenceVariableDefinitionSurrogate.note
      variableRole = this@EvidenceVariableDefinitionSurrogate.variableRole
      observed = this@EvidenceVariableDefinitionSurrogate.observed
      intended = this@EvidenceVariableDefinitionSurrogate.intended
      directnessMatch = this@EvidenceVariableDefinitionSurrogate.directnessMatch
    }

  public companion object {
    public fun fromModel(model: Evidence.VariableDefinition): EvidenceVariableDefinitionSurrogate =
      with(model) {
        EvidenceVariableDefinitionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          note = this@with.note
          variableRole = this@with.variableRole
          observed = this@with.observed
          intended = this@with.intended
          directnessMatch = this@with.directnessMatch
        }
      }
  }
}

@Serializable
internal data class EvidenceStatisticSampleSizeSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var note: List<Annotation?>? = null,
  public var numberOfStudies: Int? = null,
  public var _numberOfStudies: Element? = null,
  public var numberOfParticipants: Int? = null,
  public var _numberOfParticipants: Element? = null,
  public var knownDataCount: Int? = null,
  public var _knownDataCount: Element? = null,
) {
  public fun toModel(): Evidence.Statistic.SampleSize =
    Evidence.Statistic.SampleSize().apply {
      id = this@EvidenceStatisticSampleSizeSurrogate.id
      extension = this@EvidenceStatisticSampleSizeSurrogate.extension
      modifierExtension = this@EvidenceStatisticSampleSizeSurrogate.modifierExtension
      description =
        Markdown.of(
          this@EvidenceStatisticSampleSizeSurrogate.description,
          this@EvidenceStatisticSampleSizeSurrogate._description,
        )
      note = this@EvidenceStatisticSampleSizeSurrogate.note
      numberOfStudies =
        UnsignedInt.of(
          this@EvidenceStatisticSampleSizeSurrogate.numberOfStudies,
          this@EvidenceStatisticSampleSizeSurrogate._numberOfStudies,
        )
      numberOfParticipants =
        UnsignedInt.of(
          this@EvidenceStatisticSampleSizeSurrogate.numberOfParticipants,
          this@EvidenceStatisticSampleSizeSurrogate._numberOfParticipants,
        )
      knownDataCount =
        UnsignedInt.of(
          this@EvidenceStatisticSampleSizeSurrogate.knownDataCount,
          this@EvidenceStatisticSampleSizeSurrogate._knownDataCount,
        )
    }

  public companion object {
    public fun fromModel(
      model: Evidence.Statistic.SampleSize
    ): EvidenceStatisticSampleSizeSurrogate =
      with(model) {
        EvidenceStatisticSampleSizeSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          note = this@with.note
          numberOfStudies = this@with.numberOfStudies?.value
          _numberOfStudies = this@with.numberOfStudies?.toElement()
          numberOfParticipants = this@with.numberOfParticipants?.value
          _numberOfParticipants = this@with.numberOfParticipants?.toElement()
          knownDataCount = this@with.knownDataCount?.value
          _knownDataCount = this@with.knownDataCount?.toElement()
        }
      }
  }
}

@Serializable
internal data class EvidenceStatisticAttributeEstimateSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var note: List<Annotation?>? = null,
  public var type: CodeableConcept? = null,
  public var quantity: Quantity? = null,
  public var level: Double? = null,
  public var _level: Element? = null,
  public var range: Range? = null,
  public var attributeEstimate: List<Evidence.Statistic.AttributeEstimate?>? = null,
) {
  public fun toModel(): Evidence.Statistic.AttributeEstimate =
    Evidence.Statistic.AttributeEstimate().apply {
      id = this@EvidenceStatisticAttributeEstimateSurrogate.id
      extension = this@EvidenceStatisticAttributeEstimateSurrogate.extension
      modifierExtension = this@EvidenceStatisticAttributeEstimateSurrogate.modifierExtension
      description =
        Markdown.of(
          this@EvidenceStatisticAttributeEstimateSurrogate.description,
          this@EvidenceStatisticAttributeEstimateSurrogate._description,
        )
      note = this@EvidenceStatisticAttributeEstimateSurrogate.note
      type = this@EvidenceStatisticAttributeEstimateSurrogate.type
      quantity = this@EvidenceStatisticAttributeEstimateSurrogate.quantity
      level =
        Decimal.of(
          this@EvidenceStatisticAttributeEstimateSurrogate.level,
          this@EvidenceStatisticAttributeEstimateSurrogate._level,
        )
      range = this@EvidenceStatisticAttributeEstimateSurrogate.range
      attributeEstimate = this@EvidenceStatisticAttributeEstimateSurrogate.attributeEstimate
    }

  public companion object {
    public fun fromModel(
      model: Evidence.Statistic.AttributeEstimate
    ): EvidenceStatisticAttributeEstimateSurrogate =
      with(model) {
        EvidenceStatisticAttributeEstimateSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          note = this@with.note
          type = this@with.type
          quantity = this@with.quantity
          level = this@with.level?.value
          _level = this@with.level?.toElement()
          range = this@with.range
          attributeEstimate = this@with.attributeEstimate
        }
      }
  }
}

@Serializable
internal data class EvidenceStatisticModelCharacteristicVariableSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var variableDefinition: Reference? = null,
  public var handling: KotlinString? = null,
  public var _handling: Element? = null,
  public var valueCategory: List<CodeableConcept?>? = null,
  public var valueQuantity: List<Quantity?>? = null,
  public var valueRange: List<Range?>? = null,
) {
  public fun toModel(): Evidence.Statistic.ModelCharacteristic.Variable =
    Evidence.Statistic.ModelCharacteristic.Variable().apply {
      id = this@EvidenceStatisticModelCharacteristicVariableSurrogate.id
      extension = this@EvidenceStatisticModelCharacteristicVariableSurrogate.extension
      modifierExtension =
        this@EvidenceStatisticModelCharacteristicVariableSurrogate.modifierExtension
      variableDefinition =
        this@EvidenceStatisticModelCharacteristicVariableSurrogate.variableDefinition
      handling =
        Enumeration.of(
          this@EvidenceStatisticModelCharacteristicVariableSurrogate.handling?.let {
            com.google.fhir.model.r5.Evidence.EvidenceVariableHandling.fromCode(it)
          },
          this@EvidenceStatisticModelCharacteristicVariableSurrogate._handling,
        )
      valueCategory = this@EvidenceStatisticModelCharacteristicVariableSurrogate.valueCategory
      valueQuantity = this@EvidenceStatisticModelCharacteristicVariableSurrogate.valueQuantity
      valueRange = this@EvidenceStatisticModelCharacteristicVariableSurrogate.valueRange
    }

  public companion object {
    public fun fromModel(
      model: Evidence.Statistic.ModelCharacteristic.Variable
    ): EvidenceStatisticModelCharacteristicVariableSurrogate =
      with(model) {
        EvidenceStatisticModelCharacteristicVariableSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          variableDefinition = this@with.variableDefinition
          handling = this@with.handling?.value?.getCode()
          _handling = this@with.handling?.toElement()
          valueCategory = this@with.valueCategory
          valueQuantity = this@with.valueQuantity
          valueRange = this@with.valueRange
        }
      }
  }
}

@Serializable
internal data class EvidenceStatisticModelCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var `value`: Quantity? = null,
  public var variable: List<Evidence.Statistic.ModelCharacteristic.Variable>? = null,
  public var attributeEstimate: List<Evidence.Statistic.AttributeEstimate?>? = null,
) {
  public fun toModel(): Evidence.Statistic.ModelCharacteristic =
    Evidence.Statistic.ModelCharacteristic().apply {
      id = this@EvidenceStatisticModelCharacteristicSurrogate.id
      extension = this@EvidenceStatisticModelCharacteristicSurrogate.extension
      modifierExtension = this@EvidenceStatisticModelCharacteristicSurrogate.modifierExtension
      code = this@EvidenceStatisticModelCharacteristicSurrogate.code
      `value` = this@EvidenceStatisticModelCharacteristicSurrogate.`value`
      variable = this@EvidenceStatisticModelCharacteristicSurrogate.variable
      attributeEstimate = this@EvidenceStatisticModelCharacteristicSurrogate.attributeEstimate
    }

  public companion object {
    public fun fromModel(
      model: Evidence.Statistic.ModelCharacteristic
    ): EvidenceStatisticModelCharacteristicSurrogate =
      with(model) {
        EvidenceStatisticModelCharacteristicSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          `value` = this@with.`value`
          variable = this@with.variable
          attributeEstimate = this@with.attributeEstimate
        }
      }
  }
}

@Serializable
internal data class EvidenceStatisticSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var note: List<Annotation?>? = null,
  public var statisticType: CodeableConcept? = null,
  public var category: CodeableConcept? = null,
  public var quantity: Quantity? = null,
  public var numberOfEvents: Int? = null,
  public var _numberOfEvents: Element? = null,
  public var numberAffected: Int? = null,
  public var _numberAffected: Element? = null,
  public var sampleSize: Evidence.Statistic.SampleSize? = null,
  public var attributeEstimate: List<Evidence.Statistic.AttributeEstimate>? = null,
  public var modelCharacteristic: List<Evidence.Statistic.ModelCharacteristic>? = null,
) {
  public fun toModel(): Evidence.Statistic =
    Evidence.Statistic().apply {
      id = this@EvidenceStatisticSurrogate.id
      extension = this@EvidenceStatisticSurrogate.extension
      modifierExtension = this@EvidenceStatisticSurrogate.modifierExtension
      description =
        Markdown.of(
          this@EvidenceStatisticSurrogate.description,
          this@EvidenceStatisticSurrogate._description,
        )
      note = this@EvidenceStatisticSurrogate.note
      statisticType = this@EvidenceStatisticSurrogate.statisticType
      category = this@EvidenceStatisticSurrogate.category
      quantity = this@EvidenceStatisticSurrogate.quantity
      numberOfEvents =
        UnsignedInt.of(
          this@EvidenceStatisticSurrogate.numberOfEvents,
          this@EvidenceStatisticSurrogate._numberOfEvents,
        )
      numberAffected =
        UnsignedInt.of(
          this@EvidenceStatisticSurrogate.numberAffected,
          this@EvidenceStatisticSurrogate._numberAffected,
        )
      sampleSize = this@EvidenceStatisticSurrogate.sampleSize
      attributeEstimate = this@EvidenceStatisticSurrogate.attributeEstimate
      modelCharacteristic = this@EvidenceStatisticSurrogate.modelCharacteristic
    }

  public companion object {
    public fun fromModel(model: Evidence.Statistic): EvidenceStatisticSurrogate =
      with(model) {
        EvidenceStatisticSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          note = this@with.note
          statisticType = this@with.statisticType
          category = this@with.category
          quantity = this@with.quantity
          numberOfEvents = this@with.numberOfEvents?.value
          _numberOfEvents = this@with.numberOfEvents?.toElement()
          numberAffected = this@with.numberAffected?.value
          _numberAffected = this@with.numberAffected?.toElement()
          sampleSize = this@with.sampleSize
          attributeEstimate = this@with.attributeEstimate
          modelCharacteristic = this@with.modelCharacteristic
        }
      }
  }
}

@Serializable
internal data class EvidenceCertaintySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var note: List<Annotation?>? = null,
  public var type: CodeableConcept? = null,
  public var rating: CodeableConcept? = null,
  public var rater: KotlinString? = null,
  public var _rater: Element? = null,
  public var subcomponent: List<Evidence.Certainty?>? = null,
) {
  public fun toModel(): Evidence.Certainty =
    Evidence.Certainty().apply {
      id = this@EvidenceCertaintySurrogate.id
      extension = this@EvidenceCertaintySurrogate.extension
      modifierExtension = this@EvidenceCertaintySurrogate.modifierExtension
      description =
        Markdown.of(
          this@EvidenceCertaintySurrogate.description,
          this@EvidenceCertaintySurrogate._description,
        )
      note = this@EvidenceCertaintySurrogate.note
      type = this@EvidenceCertaintySurrogate.type
      rating = this@EvidenceCertaintySurrogate.rating
      rater =
        R5String.of(this@EvidenceCertaintySurrogate.rater, this@EvidenceCertaintySurrogate._rater)
      subcomponent = this@EvidenceCertaintySurrogate.subcomponent
    }

  public companion object {
    public fun fromModel(model: Evidence.Certainty): EvidenceCertaintySurrogate =
      with(model) {
        EvidenceCertaintySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          note = this@with.note
          type = this@with.type
          rating = this@with.rating
          rater = this@with.rater?.value
          _rater = this@with.rater?.toElement()
          subcomponent = this@with.subcomponent
        }
      }
  }
}

@Serializable
internal data class EvidenceSurrogate(
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
  public var citeAsReference: Reference? = null,
  public var citeAsMarkdown: KotlinString? = null,
  public var _citeAsMarkdown: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var approvalDate: KotlinString? = null,
  public var _approvalDate: Element? = null,
  public var lastReviewDate: KotlinString? = null,
  public var _lastReviewDate: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: List<ContactDetail?>? = null,
  public var author: List<ContactDetail?>? = null,
  public var editor: List<ContactDetail?>? = null,
  public var reviewer: List<ContactDetail?>? = null,
  public var endorser: List<ContactDetail?>? = null,
  public var useContext: List<UsageContext?>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var copyrightLabel: KotlinString? = null,
  public var _copyrightLabel: Element? = null,
  public var relatedArtifact: List<RelatedArtifact?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var assertion: KotlinString? = null,
  public var _assertion: Element? = null,
  public var note: List<Annotation?>? = null,
  public var variableDefinition: List<Evidence.VariableDefinition>? = null,
  public var synthesisType: CodeableConcept? = null,
  public var studyDesign: List<CodeableConcept?>? = null,
  public var statistic: List<Evidence.Statistic>? = null,
  public var certainty: List<Evidence.Certainty>? = null,
) {
  public fun toModel(): Evidence =
    Evidence().apply {
      id = this@EvidenceSurrogate.id
      meta = this@EvidenceSurrogate.meta
      implicitRules =
        Uri.of(this@EvidenceSurrogate.implicitRules, this@EvidenceSurrogate._implicitRules)
      language = Code.of(this@EvidenceSurrogate.language, this@EvidenceSurrogate._language)
      text = this@EvidenceSurrogate.text
      contained = this@EvidenceSurrogate.contained
      extension = this@EvidenceSurrogate.extension
      modifierExtension = this@EvidenceSurrogate.modifierExtension
      url = Uri.of(this@EvidenceSurrogate.url, this@EvidenceSurrogate._url)
      identifier = this@EvidenceSurrogate.identifier
      version = R5String.of(this@EvidenceSurrogate.version, this@EvidenceSurrogate._version)
      versionAlgorithm =
        Evidence.VersionAlgorithm?.from(
          R5String.of(
            this@EvidenceSurrogate.versionAlgorithmString,
            this@EvidenceSurrogate._versionAlgorithmString,
          ),
          this@EvidenceSurrogate.versionAlgorithmCoding,
        )
      name = R5String.of(this@EvidenceSurrogate.name, this@EvidenceSurrogate._name)
      title = R5String.of(this@EvidenceSurrogate.title, this@EvidenceSurrogate._title)
      citeAs =
        Evidence.CiteAs?.from(
          this@EvidenceSurrogate.citeAsReference,
          Markdown.of(this@EvidenceSurrogate.citeAsMarkdown, this@EvidenceSurrogate._citeAsMarkdown),
        )
      status =
        Enumeration.of(
          this@EvidenceSurrogate.status?.let {
            com.google.fhir.model.r5.PublicationStatus.fromCode(it)
          },
          this@EvidenceSurrogate._status,
        )
      experimental =
        R5Boolean.of(this@EvidenceSurrogate.experimental, this@EvidenceSurrogate._experimental)
      date =
        DateTime.of(
          FhirDateTime.fromString(this@EvidenceSurrogate.date),
          this@EvidenceSurrogate._date,
        )
      approvalDate =
        Date.of(
          FhirDate.fromString(this@EvidenceSurrogate.approvalDate),
          this@EvidenceSurrogate._approvalDate,
        )
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@EvidenceSurrogate.lastReviewDate),
          this@EvidenceSurrogate._lastReviewDate,
        )
      publisher = R5String.of(this@EvidenceSurrogate.publisher, this@EvidenceSurrogate._publisher)
      contact = this@EvidenceSurrogate.contact
      author = this@EvidenceSurrogate.author
      editor = this@EvidenceSurrogate.editor
      reviewer = this@EvidenceSurrogate.reviewer
      endorser = this@EvidenceSurrogate.endorser
      useContext = this@EvidenceSurrogate.useContext
      purpose = Markdown.of(this@EvidenceSurrogate.purpose, this@EvidenceSurrogate._purpose)
      copyright = Markdown.of(this@EvidenceSurrogate.copyright, this@EvidenceSurrogate._copyright)
      copyrightLabel =
        R5String.of(this@EvidenceSurrogate.copyrightLabel, this@EvidenceSurrogate._copyrightLabel)
      relatedArtifact = this@EvidenceSurrogate.relatedArtifact
      description =
        Markdown.of(this@EvidenceSurrogate.description, this@EvidenceSurrogate._description)
      assertion = Markdown.of(this@EvidenceSurrogate.assertion, this@EvidenceSurrogate._assertion)
      note = this@EvidenceSurrogate.note
      variableDefinition = this@EvidenceSurrogate.variableDefinition
      synthesisType = this@EvidenceSurrogate.synthesisType
      studyDesign = this@EvidenceSurrogate.studyDesign
      statistic = this@EvidenceSurrogate.statistic
      certainty = this@EvidenceSurrogate.certainty
    }

  public companion object {
    public fun fromModel(model: Evidence): EvidenceSurrogate =
      with(model) {
        EvidenceSurrogate().apply {
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
          citeAsReference = this@with.citeAs?.asReference()?.value
          citeAsMarkdown = this@with.citeAs?.asMarkdown()?.value?.value
          _citeAsMarkdown = this@with.citeAs?.asMarkdown()?.value?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          experimental = this@with.experimental?.value
          _experimental = this@with.experimental?.toElement()
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          approvalDate = this@with.approvalDate?.value?.toString()
          _approvalDate = this@with.approvalDate?.toElement()
          lastReviewDate = this@with.lastReviewDate?.value?.toString()
          _lastReviewDate = this@with.lastReviewDate?.toElement()
          publisher = this@with.publisher?.value
          _publisher = this@with.publisher?.toElement()
          contact = this@with.contact
          author = this@with.author
          editor = this@with.editor
          reviewer = this@with.reviewer
          endorser = this@with.endorser
          useContext = this@with.useContext
          purpose = this@with.purpose?.value
          _purpose = this@with.purpose?.toElement()
          copyright = this@with.copyright?.value
          _copyright = this@with.copyright?.toElement()
          copyrightLabel = this@with.copyrightLabel?.value
          _copyrightLabel = this@with.copyrightLabel?.toElement()
          relatedArtifact = this@with.relatedArtifact
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          assertion = this@with.assertion?.value
          _assertion = this@with.assertion?.toElement()
          note = this@with.note
          variableDefinition = this@with.variableDefinition
          synthesisType = this@with.synthesisType
          studyDesign = this@with.studyDesign
          statistic = this@with.statistic
          certainty = this@with.certainty
        }
      }
  }
}
