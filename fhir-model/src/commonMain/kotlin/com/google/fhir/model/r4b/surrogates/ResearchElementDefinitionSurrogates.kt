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

import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.ContactDetail
import com.google.fhir.model.r4b.DataRequirement
import com.google.fhir.model.r4b.Date
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Duration
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Expression
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDate
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Markdown
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.RelatedArtifact
import com.google.fhir.model.r4b.ResearchElementDefinition
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.UsageContext
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ResearchElementDefinitionCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var definitionCodeableConcept: CodeableConcept? = null,
  public var definitionCanonical: KotlinString? = null,
  public var _definitionCanonical: Element? = null,
  public var definitionExpression: Expression? = null,
  public var definitionDataRequirement: DataRequirement? = null,
  public var usageContext: List<UsageContext?>? = null,
  public var exclude: KotlinBoolean? = null,
  public var _exclude: Element? = null,
  public var unitOfMeasure: CodeableConcept? = null,
  public var studyEffectiveDescription: KotlinString? = null,
  public var _studyEffectiveDescription: Element? = null,
  public var studyEffectiveDateTime: KotlinString? = null,
  public var _studyEffectiveDateTime: Element? = null,
  public var studyEffectivePeriod: Period? = null,
  public var studyEffectiveDuration: Duration? = null,
  public var studyEffectiveTiming: Timing? = null,
  public var studyEffectiveTimeFromStart: Duration? = null,
  public var studyEffectiveGroupMeasure: KotlinString? = null,
  public var _studyEffectiveGroupMeasure: Element? = null,
  public var participantEffectiveDescription: KotlinString? = null,
  public var _participantEffectiveDescription: Element? = null,
  public var participantEffectiveDateTime: KotlinString? = null,
  public var _participantEffectiveDateTime: Element? = null,
  public var participantEffectivePeriod: Period? = null,
  public var participantEffectiveDuration: Duration? = null,
  public var participantEffectiveTiming: Timing? = null,
  public var participantEffectiveTimeFromStart: Duration? = null,
  public var participantEffectiveGroupMeasure: KotlinString? = null,
  public var _participantEffectiveGroupMeasure: Element? = null,
) {
  public fun toModel(): ResearchElementDefinition.Characteristic =
    ResearchElementDefinition.Characteristic().apply {
      id = this@ResearchElementDefinitionCharacteristicSurrogate.id
      extension = this@ResearchElementDefinitionCharacteristicSurrogate.extension
      modifierExtension = this@ResearchElementDefinitionCharacteristicSurrogate.modifierExtension
      definition =
        ResearchElementDefinition.Characteristic.Definition?.from(
          this@ResearchElementDefinitionCharacteristicSurrogate.definitionCodeableConcept,
          Canonical.of(
            this@ResearchElementDefinitionCharacteristicSurrogate.definitionCanonical,
            this@ResearchElementDefinitionCharacteristicSurrogate._definitionCanonical,
          ),
          this@ResearchElementDefinitionCharacteristicSurrogate.definitionExpression,
          this@ResearchElementDefinitionCharacteristicSurrogate.definitionDataRequirement,
        )
      usageContext = this@ResearchElementDefinitionCharacteristicSurrogate.usageContext
      exclude =
        R4bBoolean.of(
          this@ResearchElementDefinitionCharacteristicSurrogate.exclude,
          this@ResearchElementDefinitionCharacteristicSurrogate._exclude,
        )
      unitOfMeasure = this@ResearchElementDefinitionCharacteristicSurrogate.unitOfMeasure
      studyEffectiveDescription =
        R4bString.of(
          this@ResearchElementDefinitionCharacteristicSurrogate.studyEffectiveDescription,
          this@ResearchElementDefinitionCharacteristicSurrogate._studyEffectiveDescription,
        )
      studyEffective =
        ResearchElementDefinition.Characteristic.StudyEffective?.from(
          DateTime.of(
            FhirDateTime.fromString(
              this@ResearchElementDefinitionCharacteristicSurrogate.studyEffectiveDateTime
            ),
            this@ResearchElementDefinitionCharacteristicSurrogate._studyEffectiveDateTime,
          ),
          this@ResearchElementDefinitionCharacteristicSurrogate.studyEffectivePeriod,
          this@ResearchElementDefinitionCharacteristicSurrogate.studyEffectiveDuration,
          this@ResearchElementDefinitionCharacteristicSurrogate.studyEffectiveTiming,
        )
      studyEffectiveTimeFromStart =
        this@ResearchElementDefinitionCharacteristicSurrogate.studyEffectiveTimeFromStart
      studyEffectiveGroupMeasure =
        Enumeration.of(
          this@ResearchElementDefinitionCharacteristicSurrogate.studyEffectiveGroupMeasure?.let {
            com.google.fhir.model.r4b.ResearchElementDefinition.GroupMeasure.fromCode(it)
          },
          this@ResearchElementDefinitionCharacteristicSurrogate._studyEffectiveGroupMeasure,
        )
      participantEffectiveDescription =
        R4bString.of(
          this@ResearchElementDefinitionCharacteristicSurrogate.participantEffectiveDescription,
          this@ResearchElementDefinitionCharacteristicSurrogate._participantEffectiveDescription,
        )
      participantEffective =
        ResearchElementDefinition.Characteristic.ParticipantEffective?.from(
          DateTime.of(
            FhirDateTime.fromString(
              this@ResearchElementDefinitionCharacteristicSurrogate.participantEffectiveDateTime
            ),
            this@ResearchElementDefinitionCharacteristicSurrogate._participantEffectiveDateTime,
          ),
          this@ResearchElementDefinitionCharacteristicSurrogate.participantEffectivePeriod,
          this@ResearchElementDefinitionCharacteristicSurrogate.participantEffectiveDuration,
          this@ResearchElementDefinitionCharacteristicSurrogate.participantEffectiveTiming,
        )
      participantEffectiveTimeFromStart =
        this@ResearchElementDefinitionCharacteristicSurrogate.participantEffectiveTimeFromStart
      participantEffectiveGroupMeasure =
        Enumeration.of(
          this@ResearchElementDefinitionCharacteristicSurrogate.participantEffectiveGroupMeasure
            ?.let { com.google.fhir.model.r4b.ResearchElementDefinition.GroupMeasure.fromCode(it) },
          this@ResearchElementDefinitionCharacteristicSurrogate._participantEffectiveGroupMeasure,
        )
    }

  public companion object {
    public fun fromModel(
      model: ResearchElementDefinition.Characteristic
    ): ResearchElementDefinitionCharacteristicSurrogate =
      with(model) {
        ResearchElementDefinitionCharacteristicSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          definitionCodeableConcept = this@with.definition?.asCodeableConcept()?.value
          definitionCanonical = this@with.definition?.asCanonical()?.value?.value
          _definitionCanonical = this@with.definition?.asCanonical()?.value?.toElement()
          definitionExpression = this@with.definition?.asExpression()?.value
          definitionDataRequirement = this@with.definition?.asDataRequirement()?.value
          usageContext = this@with.usageContext
          exclude = this@with.exclude?.value
          _exclude = this@with.exclude?.toElement()
          unitOfMeasure = this@with.unitOfMeasure
          studyEffectiveDescription = this@with.studyEffectiveDescription?.value
          _studyEffectiveDescription = this@with.studyEffectiveDescription?.toElement()
          studyEffectiveDateTime = this@with.studyEffective?.asDateTime()?.value?.value?.toString()
          _studyEffectiveDateTime = this@with.studyEffective?.asDateTime()?.value?.toElement()
          studyEffectivePeriod = this@with.studyEffective?.asPeriod()?.value
          studyEffectiveDuration = this@with.studyEffective?.asDuration()?.value
          studyEffectiveTiming = this@with.studyEffective?.asTiming()?.value
          studyEffectiveTimeFromStart = this@with.studyEffectiveTimeFromStart
          studyEffectiveGroupMeasure = this@with.studyEffectiveGroupMeasure?.value?.getCode()
          _studyEffectiveGroupMeasure = this@with.studyEffectiveGroupMeasure?.toElement()
          participantEffectiveDescription = this@with.participantEffectiveDescription?.value
          _participantEffectiveDescription = this@with.participantEffectiveDescription?.toElement()
          participantEffectiveDateTime =
            this@with.participantEffective?.asDateTime()?.value?.value?.toString()
          _participantEffectiveDateTime =
            this@with.participantEffective?.asDateTime()?.value?.toElement()
          participantEffectivePeriod = this@with.participantEffective?.asPeriod()?.value
          participantEffectiveDuration = this@with.participantEffective?.asDuration()?.value
          participantEffectiveTiming = this@with.participantEffective?.asTiming()?.value
          participantEffectiveTimeFromStart = this@with.participantEffectiveTimeFromStart
          participantEffectiveGroupMeasure =
            this@with.participantEffectiveGroupMeasure?.value?.getCode()
          _participantEffectiveGroupMeasure =
            this@with.participantEffectiveGroupMeasure?.toElement()
        }
      }
  }
}

@Serializable
internal data class ResearchElementDefinitionSurrogate(
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
  public var shortTitle: KotlinString? = null,
  public var _shortTitle: Element? = null,
  public var subtitle: KotlinString? = null,
  public var _subtitle: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: List<ContactDetail?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var comment: List<KotlinString?>? = null,
  public var _comment: List<Element?>? = null,
  public var useContext: List<UsageContext?>? = null,
  public var jurisdiction: List<CodeableConcept?>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var usage: KotlinString? = null,
  public var _usage: Element? = null,
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
  public var library: List<KotlinString?>? = null,
  public var _library: List<Element?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var variableType: KotlinString? = null,
  public var _variableType: Element? = null,
  public var characteristic: List<ResearchElementDefinition.Characteristic>? = null,
) {
  public fun toModel(): ResearchElementDefinition =
    ResearchElementDefinition().apply {
      id = this@ResearchElementDefinitionSurrogate.id
      meta = this@ResearchElementDefinitionSurrogate.meta
      implicitRules =
        Uri.of(
          this@ResearchElementDefinitionSurrogate.implicitRules,
          this@ResearchElementDefinitionSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@ResearchElementDefinitionSurrogate.language,
          this@ResearchElementDefinitionSurrogate._language,
        )
      text = this@ResearchElementDefinitionSurrogate.text
      contained = this@ResearchElementDefinitionSurrogate.contained
      extension = this@ResearchElementDefinitionSurrogate.extension
      modifierExtension = this@ResearchElementDefinitionSurrogate.modifierExtension
      url =
        Uri.of(
          this@ResearchElementDefinitionSurrogate.url,
          this@ResearchElementDefinitionSurrogate._url,
        )
      identifier = this@ResearchElementDefinitionSurrogate.identifier
      version =
        R4bString.of(
          this@ResearchElementDefinitionSurrogate.version,
          this@ResearchElementDefinitionSurrogate._version,
        )
      name =
        R4bString.of(
          this@ResearchElementDefinitionSurrogate.name,
          this@ResearchElementDefinitionSurrogate._name,
        )
      title =
        R4bString.of(
          this@ResearchElementDefinitionSurrogate.title,
          this@ResearchElementDefinitionSurrogate._title,
        )
      shortTitle =
        R4bString.of(
          this@ResearchElementDefinitionSurrogate.shortTitle,
          this@ResearchElementDefinitionSurrogate._shortTitle,
        )
      subtitle =
        R4bString.of(
          this@ResearchElementDefinitionSurrogate.subtitle,
          this@ResearchElementDefinitionSurrogate._subtitle,
        )
      status =
        Enumeration.of(
          this@ResearchElementDefinitionSurrogate.status?.let {
            com.google.fhir.model.r4b.PublicationStatus.fromCode(it)
          },
          this@ResearchElementDefinitionSurrogate._status,
        )
      experimental =
        R4bBoolean.of(
          this@ResearchElementDefinitionSurrogate.experimental,
          this@ResearchElementDefinitionSurrogate._experimental,
        )
      subject =
        ResearchElementDefinition.Subject?.from(
          this@ResearchElementDefinitionSurrogate.subjectCodeableConcept,
          this@ResearchElementDefinitionSurrogate.subjectReference,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ResearchElementDefinitionSurrogate.date),
          this@ResearchElementDefinitionSurrogate._date,
        )
      publisher =
        R4bString.of(
          this@ResearchElementDefinitionSurrogate.publisher,
          this@ResearchElementDefinitionSurrogate._publisher,
        )
      contact = this@ResearchElementDefinitionSurrogate.contact
      description =
        Markdown.of(
          this@ResearchElementDefinitionSurrogate.description,
          this@ResearchElementDefinitionSurrogate._description,
        )
      comment =
        if (
          this@ResearchElementDefinitionSurrogate.comment == null &&
            this@ResearchElementDefinitionSurrogate._comment == null
        ) {
          null
        } else {
          (this@ResearchElementDefinitionSurrogate.comment
              ?: List(this@ResearchElementDefinitionSurrogate._comment!!.size) { null })
            .zip(
              this@ResearchElementDefinitionSurrogate._comment
                ?: List(this@ResearchElementDefinitionSurrogate.comment!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4bString.of(value, element) }
        }
      useContext = this@ResearchElementDefinitionSurrogate.useContext
      jurisdiction = this@ResearchElementDefinitionSurrogate.jurisdiction
      purpose =
        Markdown.of(
          this@ResearchElementDefinitionSurrogate.purpose,
          this@ResearchElementDefinitionSurrogate._purpose,
        )
      usage =
        R4bString.of(
          this@ResearchElementDefinitionSurrogate.usage,
          this@ResearchElementDefinitionSurrogate._usage,
        )
      copyright =
        Markdown.of(
          this@ResearchElementDefinitionSurrogate.copyright,
          this@ResearchElementDefinitionSurrogate._copyright,
        )
      approvalDate =
        Date.of(
          FhirDate.fromString(this@ResearchElementDefinitionSurrogate.approvalDate),
          this@ResearchElementDefinitionSurrogate._approvalDate,
        )
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@ResearchElementDefinitionSurrogate.lastReviewDate),
          this@ResearchElementDefinitionSurrogate._lastReviewDate,
        )
      effectivePeriod = this@ResearchElementDefinitionSurrogate.effectivePeriod
      topic = this@ResearchElementDefinitionSurrogate.topic
      author = this@ResearchElementDefinitionSurrogate.author
      editor = this@ResearchElementDefinitionSurrogate.editor
      reviewer = this@ResearchElementDefinitionSurrogate.reviewer
      endorser = this@ResearchElementDefinitionSurrogate.endorser
      relatedArtifact = this@ResearchElementDefinitionSurrogate.relatedArtifact
      library =
        if (
          this@ResearchElementDefinitionSurrogate.library == null &&
            this@ResearchElementDefinitionSurrogate._library == null
        ) {
          null
        } else {
          (this@ResearchElementDefinitionSurrogate.library
              ?: List(this@ResearchElementDefinitionSurrogate._library!!.size) { null })
            .zip(
              this@ResearchElementDefinitionSurrogate._library
                ?: List(this@ResearchElementDefinitionSurrogate.library!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      type =
        Enumeration.of(
          this@ResearchElementDefinitionSurrogate.type?.let {
            com.google.fhir.model.r4b.ResearchElementDefinition.ResearchElementType.fromCode(it)
          },
          this@ResearchElementDefinitionSurrogate._type,
        )
      variableType =
        Enumeration.of(
          this@ResearchElementDefinitionSurrogate.variableType?.let {
            com.google.fhir.model.r4b.ResearchElementDefinition.VariableType.fromCode(it)
          },
          this@ResearchElementDefinitionSurrogate._variableType,
        )
      characteristic = this@ResearchElementDefinitionSurrogate.characteristic
    }

  public companion object {
    public fun fromModel(model: ResearchElementDefinition): ResearchElementDefinitionSurrogate =
      with(model) {
        ResearchElementDefinitionSurrogate().apply {
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
          shortTitle = this@with.shortTitle?.value
          _shortTitle = this@with.shortTitle?.toElement()
          subtitle = this@with.subtitle?.value
          _subtitle = this@with.subtitle?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          experimental = this@with.experimental?.value
          _experimental = this@with.experimental?.toElement()
          subjectCodeableConcept = this@with.subject?.asCodeableConcept()?.value
          subjectReference = this@with.subject?.asReference()?.value
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          publisher = this@with.publisher?.value
          _publisher = this@with.publisher?.toElement()
          contact = this@with.contact
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          comment = this@with.comment?.map { it?.value }?.takeUnless { it.all { it == null } }
          _comment =
            this@with.comment?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          useContext = this@with.useContext
          jurisdiction = this@with.jurisdiction
          purpose = this@with.purpose?.value
          _purpose = this@with.purpose?.toElement()
          usage = this@with.usage?.value
          _usage = this@with.usage?.toElement()
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
          library = this@with.library?.map { it?.value }?.takeUnless { it.all { it == null } }
          _library =
            this@with.library?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          variableType = this@with.variableType?.value?.getCode()
          _variableType = this@with.variableType?.toElement()
          characteristic = this@with.characteristic
        }
      }
  }
}
