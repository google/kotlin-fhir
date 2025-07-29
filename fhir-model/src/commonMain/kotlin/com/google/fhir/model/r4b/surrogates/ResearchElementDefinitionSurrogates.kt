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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ResearchElementDefinitionCharacteristicDefinitionSurrogate(
  public var definitionCodeableConcept: CodeableConcept? = null,
  public var definitionCanonical: KotlinString? = null,
  public var _definitionCanonical: Element? = null,
  public var definitionExpression: Expression? = null,
  public var definitionDataRequirement: DataRequirement? = null,
) {
  public fun toModel(): ResearchElementDefinition.Characteristic.Definition =
    ResearchElementDefinition.Characteristic.Definition.from(
      this@ResearchElementDefinitionCharacteristicDefinitionSurrogate.definitionCodeableConcept,
      Canonical.of(
        this@ResearchElementDefinitionCharacteristicDefinitionSurrogate.definitionCanonical,
        this@ResearchElementDefinitionCharacteristicDefinitionSurrogate._definitionCanonical,
      ),
      this@ResearchElementDefinitionCharacteristicDefinitionSurrogate.definitionExpression,
      this@ResearchElementDefinitionCharacteristicDefinitionSurrogate.definitionDataRequirement,
    )!!

  public companion object {
    public fun fromModel(
      model: ResearchElementDefinition.Characteristic.Definition
    ): ResearchElementDefinitionCharacteristicDefinitionSurrogate =
      with(model) {
        ResearchElementDefinitionCharacteristicDefinitionSurrogate(
          definitionCodeableConcept = this@with.asCodeableConcept()?.value,
          definitionCanonical = this@with.asCanonical()?.value?.value,
          _definitionCanonical = this@with.asCanonical()?.value?.toElement(),
          definitionExpression = this@with.asExpression()?.value,
          definitionDataRequirement = this@with.asDataRequirement()?.value,
        )
      }
  }
}

@Serializable
internal data class ResearchElementDefinitionCharacteristicStudyEffectiveSurrogate(
  public var studyEffectiveDateTime: KotlinString? = null,
  public var _studyEffectiveDateTime: Element? = null,
  public var studyEffectivePeriod: Period? = null,
  public var studyEffectiveDuration: Duration? = null,
  public var studyEffectiveTiming: Timing? = null,
) {
  public fun toModel(): ResearchElementDefinition.Characteristic.StudyEffective? =
    ResearchElementDefinition.Characteristic.StudyEffective?.from(
      DateTime.of(
        FhirDateTime.fromString(
          this@ResearchElementDefinitionCharacteristicStudyEffectiveSurrogate.studyEffectiveDateTime
        ),
        this@ResearchElementDefinitionCharacteristicStudyEffectiveSurrogate._studyEffectiveDateTime,
      ),
      this@ResearchElementDefinitionCharacteristicStudyEffectiveSurrogate.studyEffectivePeriod,
      this@ResearchElementDefinitionCharacteristicStudyEffectiveSurrogate.studyEffectiveDuration,
      this@ResearchElementDefinitionCharacteristicStudyEffectiveSurrogate.studyEffectiveTiming,
    )

  public companion object {
    public fun fromModel(
      model: ResearchElementDefinition.Characteristic.StudyEffective
    ): ResearchElementDefinitionCharacteristicStudyEffectiveSurrogate =
      with(model) {
        ResearchElementDefinitionCharacteristicStudyEffectiveSurrogate(
          studyEffectiveDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _studyEffectiveDateTime = this@with.asDateTime()?.value?.toElement(),
          studyEffectivePeriod = this@with.asPeriod()?.value,
          studyEffectiveDuration = this@with.asDuration()?.value,
          studyEffectiveTiming = this@with.asTiming()?.value,
        )
      }
  }
}

@Serializable
internal data class ResearchElementDefinitionCharacteristicParticipantEffectiveSurrogate(
  public var participantEffectiveDateTime: KotlinString? = null,
  public var _participantEffectiveDateTime: Element? = null,
  public var participantEffectivePeriod: Period? = null,
  public var participantEffectiveDuration: Duration? = null,
  public var participantEffectiveTiming: Timing? = null,
) {
  public fun toModel(): ResearchElementDefinition.Characteristic.ParticipantEffective? =
    ResearchElementDefinition.Characteristic.ParticipantEffective?.from(
      DateTime.of(
        FhirDateTime.fromString(
          this@ResearchElementDefinitionCharacteristicParticipantEffectiveSurrogate
            .participantEffectiveDateTime
        ),
        this@ResearchElementDefinitionCharacteristicParticipantEffectiveSurrogate
          ._participantEffectiveDateTime,
      ),
      this@ResearchElementDefinitionCharacteristicParticipantEffectiveSurrogate
        .participantEffectivePeriod,
      this@ResearchElementDefinitionCharacteristicParticipantEffectiveSurrogate
        .participantEffectiveDuration,
      this@ResearchElementDefinitionCharacteristicParticipantEffectiveSurrogate
        .participantEffectiveTiming,
    )

  public companion object {
    public fun fromModel(
      model: ResearchElementDefinition.Characteristic.ParticipantEffective
    ): ResearchElementDefinitionCharacteristicParticipantEffectiveSurrogate =
      with(model) {
        ResearchElementDefinitionCharacteristicParticipantEffectiveSurrogate(
          participantEffectiveDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _participantEffectiveDateTime = this@with.asDateTime()?.value?.toElement(),
          participantEffectivePeriod = this@with.asPeriod()?.value,
          participantEffectiveDuration = this@with.asDuration()?.value,
          participantEffectiveTiming = this@with.asTiming()?.value,
        )
      }
  }
}

@Serializable
internal data class ResearchElementDefinitionCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var usageContext: MutableList<UsageContext>? = null,
  public var exclude: KotlinBoolean? = null,
  public var _exclude: Element? = null,
  public var unitOfMeasure: CodeableConcept? = null,
  public var studyEffectiveDescription: KotlinString? = null,
  public var _studyEffectiveDescription: Element? = null,
  public var studyEffectiveTimeFromStart: Duration? = null,
  public var studyEffectiveGroupMeasure: KotlinString? = null,
  public var _studyEffectiveGroupMeasure: Element? = null,
  public var participantEffectiveDescription: KotlinString? = null,
  public var _participantEffectiveDescription: Element? = null,
  public var participantEffectiveTimeFromStart: Duration? = null,
  public var participantEffectiveGroupMeasure: KotlinString? = null,
  public var _participantEffectiveGroupMeasure: Element? = null,
  public var definition: ResearchElementDefinition.Characteristic.Definition,
  public var studyEffective: ResearchElementDefinition.Characteristic.StudyEffective? = null,
  public var participantEffective: ResearchElementDefinition.Characteristic.ParticipantEffective? =
    null,
) {
  public fun toModel(): ResearchElementDefinition.Characteristic =
    ResearchElementDefinition.Characteristic(
      id = this@ResearchElementDefinitionCharacteristicSurrogate.id,
      extension =
        this@ResearchElementDefinitionCharacteristicSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ResearchElementDefinitionCharacteristicSurrogate.modifierExtension ?: mutableListOf(),
      definition = this@ResearchElementDefinitionCharacteristicSurrogate.definition,
      usageContext =
        this@ResearchElementDefinitionCharacteristicSurrogate.usageContext ?: mutableListOf(),
      exclude =
        R4bBoolean.of(
          this@ResearchElementDefinitionCharacteristicSurrogate.exclude,
          this@ResearchElementDefinitionCharacteristicSurrogate._exclude,
        ),
      unitOfMeasure = this@ResearchElementDefinitionCharacteristicSurrogate.unitOfMeasure,
      studyEffectiveDescription =
        R4bString.of(
          this@ResearchElementDefinitionCharacteristicSurrogate.studyEffectiveDescription,
          this@ResearchElementDefinitionCharacteristicSurrogate._studyEffectiveDescription,
        ),
      studyEffective = this@ResearchElementDefinitionCharacteristicSurrogate.studyEffective,
      studyEffectiveTimeFromStart =
        this@ResearchElementDefinitionCharacteristicSurrogate.studyEffectiveTimeFromStart,
      studyEffectiveGroupMeasure =
        this@ResearchElementDefinitionCharacteristicSurrogate.studyEffectiveGroupMeasure?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.ResearchElementDefinition.GroupMeasure.fromCode(it!!),
            this@ResearchElementDefinitionCharacteristicSurrogate._studyEffectiveGroupMeasure,
          )
        },
      participantEffectiveDescription =
        R4bString.of(
          this@ResearchElementDefinitionCharacteristicSurrogate.participantEffectiveDescription,
          this@ResearchElementDefinitionCharacteristicSurrogate._participantEffectiveDescription,
        ),
      participantEffective =
        this@ResearchElementDefinitionCharacteristicSurrogate.participantEffective,
      participantEffectiveTimeFromStart =
        this@ResearchElementDefinitionCharacteristicSurrogate.participantEffectiveTimeFromStart,
      participantEffectiveGroupMeasure =
        this@ResearchElementDefinitionCharacteristicSurrogate.participantEffectiveGroupMeasure
          ?.let {
            Enumeration.of(
              com.google.fhir.model.r4b.ResearchElementDefinition.GroupMeasure.fromCode(it!!),
              this@ResearchElementDefinitionCharacteristicSurrogate
                ._participantEffectiveGroupMeasure,
            )
          },
    )

  public companion object {
    public fun fromModel(
      model: ResearchElementDefinition.Characteristic
    ): ResearchElementDefinitionCharacteristicSurrogate =
      with(model) {
        ResearchElementDefinitionCharacteristicSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          definition = this@with.definition,
          usageContext = this@with.usageContext.takeUnless { it.all { it == null } },
          exclude = this@with.exclude?.value,
          _exclude = this@with.exclude?.toElement(),
          unitOfMeasure = this@with.unitOfMeasure,
          studyEffectiveDescription = this@with.studyEffectiveDescription?.value,
          _studyEffectiveDescription = this@with.studyEffectiveDescription?.toElement(),
          studyEffective = this@with.studyEffective,
          studyEffectiveTimeFromStart = this@with.studyEffectiveTimeFromStart,
          studyEffectiveGroupMeasure = this@with.studyEffectiveGroupMeasure?.value?.getCode(),
          _studyEffectiveGroupMeasure = this@with.studyEffectiveGroupMeasure?.toElement(),
          participantEffectiveDescription = this@with.participantEffectiveDescription?.value,
          _participantEffectiveDescription = this@with.participantEffectiveDescription?.toElement(),
          participantEffective = this@with.participantEffective,
          participantEffectiveTimeFromStart = this@with.participantEffectiveTimeFromStart,
          participantEffectiveGroupMeasure =
            this@with.participantEffectiveGroupMeasure?.value?.getCode(),
          _participantEffectiveGroupMeasure =
            this@with.participantEffectiveGroupMeasure?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ResearchElementDefinitionSubjectSurrogate(
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
) {
  public fun toModel(): ResearchElementDefinition.Subject? =
    ResearchElementDefinition.Subject?.from(
      this@ResearchElementDefinitionSubjectSurrogate.subjectCodeableConcept,
      this@ResearchElementDefinitionSubjectSurrogate.subjectReference,
    )

  public companion object {
    public fun fromModel(
      model: ResearchElementDefinition.Subject
    ): ResearchElementDefinitionSubjectSurrogate =
      with(model) {
        ResearchElementDefinitionSubjectSurrogate(
          subjectCodeableConcept = this@with.asCodeableConcept()?.value,
          subjectReference = this@with.asReference()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: MutableList<Identifier>? = null,
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
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: MutableList<ContactDetail>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var comment: MutableList<KotlinString?>? = null,
  public var _comment: MutableList<Element?>? = null,
  public var useContext: MutableList<UsageContext>? = null,
  public var jurisdiction: MutableList<CodeableConcept>? = null,
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
  public var topic: MutableList<CodeableConcept>? = null,
  public var author: MutableList<ContactDetail>? = null,
  public var editor: MutableList<ContactDetail>? = null,
  public var reviewer: MutableList<ContactDetail>? = null,
  public var endorser: MutableList<ContactDetail>? = null,
  public var relatedArtifact: MutableList<RelatedArtifact>? = null,
  public var library: MutableList<KotlinString?>? = null,
  public var _library: MutableList<Element?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var variableType: KotlinString? = null,
  public var _variableType: Element? = null,
  public var characteristic: MutableList<ResearchElementDefinition.Characteristic>? = null,
  public var subject: ResearchElementDefinition.Subject? = null,
) {
  public fun toModel(): ResearchElementDefinition =
    ResearchElementDefinition(
      id = this@ResearchElementDefinitionSurrogate.id,
      meta = this@ResearchElementDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@ResearchElementDefinitionSurrogate.implicitRules,
          this@ResearchElementDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@ResearchElementDefinitionSurrogate.language,
          this@ResearchElementDefinitionSurrogate._language,
        ),
      text = this@ResearchElementDefinitionSurrogate.text,
      contained = this@ResearchElementDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@ResearchElementDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ResearchElementDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      url =
        Uri.of(
          this@ResearchElementDefinitionSurrogate.url,
          this@ResearchElementDefinitionSurrogate._url,
        ),
      identifier = this@ResearchElementDefinitionSurrogate.identifier ?: mutableListOf(),
      version =
        R4bString.of(
          this@ResearchElementDefinitionSurrogate.version,
          this@ResearchElementDefinitionSurrogate._version,
        ),
      name =
        R4bString.of(
          this@ResearchElementDefinitionSurrogate.name,
          this@ResearchElementDefinitionSurrogate._name,
        ),
      title =
        R4bString.of(
          this@ResearchElementDefinitionSurrogate.title,
          this@ResearchElementDefinitionSurrogate._title,
        ),
      shortTitle =
        R4bString.of(
          this@ResearchElementDefinitionSurrogate.shortTitle,
          this@ResearchElementDefinitionSurrogate._shortTitle,
        ),
      subtitle =
        R4bString.of(
          this@ResearchElementDefinitionSurrogate.subtitle,
          this@ResearchElementDefinitionSurrogate._subtitle,
        ),
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.PublicationStatus.fromCode(
            this@ResearchElementDefinitionSurrogate.status!!
          ),
          this@ResearchElementDefinitionSurrogate._status,
        ),
      experimental =
        R4bBoolean.of(
          this@ResearchElementDefinitionSurrogate.experimental,
          this@ResearchElementDefinitionSurrogate._experimental,
        ),
      subject = this@ResearchElementDefinitionSurrogate.subject,
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ResearchElementDefinitionSurrogate.date),
          this@ResearchElementDefinitionSurrogate._date,
        ),
      publisher =
        R4bString.of(
          this@ResearchElementDefinitionSurrogate.publisher,
          this@ResearchElementDefinitionSurrogate._publisher,
        ),
      contact = this@ResearchElementDefinitionSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@ResearchElementDefinitionSurrogate.description,
          this@ResearchElementDefinitionSurrogate._description,
        ),
      comment =
        if (
          this@ResearchElementDefinitionSurrogate.comment == null &&
            this@ResearchElementDefinitionSurrogate._comment == null
        ) {
          mutableListOf()
        } else {
          (this@ResearchElementDefinitionSurrogate.comment
              ?: List(this@ResearchElementDefinitionSurrogate._comment!!.size) { null })
            .zip(
              this@ResearchElementDefinitionSurrogate._comment
                ?: List(this@ResearchElementDefinitionSurrogate.comment!!.size) { null }
            )
            .map { (value, element) -> R4bString.of(value, element)!! }
            .toMutableList()
        },
      useContext = this@ResearchElementDefinitionSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@ResearchElementDefinitionSurrogate.jurisdiction ?: mutableListOf(),
      purpose =
        Markdown.of(
          this@ResearchElementDefinitionSurrogate.purpose,
          this@ResearchElementDefinitionSurrogate._purpose,
        ),
      usage =
        R4bString.of(
          this@ResearchElementDefinitionSurrogate.usage,
          this@ResearchElementDefinitionSurrogate._usage,
        ),
      copyright =
        Markdown.of(
          this@ResearchElementDefinitionSurrogate.copyright,
          this@ResearchElementDefinitionSurrogate._copyright,
        ),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@ResearchElementDefinitionSurrogate.approvalDate),
          this@ResearchElementDefinitionSurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@ResearchElementDefinitionSurrogate.lastReviewDate),
          this@ResearchElementDefinitionSurrogate._lastReviewDate,
        ),
      effectivePeriod = this@ResearchElementDefinitionSurrogate.effectivePeriod,
      topic = this@ResearchElementDefinitionSurrogate.topic ?: mutableListOf(),
      author = this@ResearchElementDefinitionSurrogate.author ?: mutableListOf(),
      editor = this@ResearchElementDefinitionSurrogate.editor ?: mutableListOf(),
      reviewer = this@ResearchElementDefinitionSurrogate.reviewer ?: mutableListOf(),
      endorser = this@ResearchElementDefinitionSurrogate.endorser ?: mutableListOf(),
      relatedArtifact = this@ResearchElementDefinitionSurrogate.relatedArtifact ?: mutableListOf(),
      library =
        if (
          this@ResearchElementDefinitionSurrogate.library == null &&
            this@ResearchElementDefinitionSurrogate._library == null
        ) {
          mutableListOf()
        } else {
          (this@ResearchElementDefinitionSurrogate.library
              ?: List(this@ResearchElementDefinitionSurrogate._library!!.size) { null })
            .zip(
              this@ResearchElementDefinitionSurrogate._library
                ?: List(this@ResearchElementDefinitionSurrogate.library!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      type =
        Enumeration.of(
          com.google.fhir.model.r4b.ResearchElementDefinition.ResearchElementType.fromCode(
            this@ResearchElementDefinitionSurrogate.type!!
          ),
          this@ResearchElementDefinitionSurrogate._type,
        ),
      variableType =
        this@ResearchElementDefinitionSurrogate.variableType?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.ResearchElementDefinition.VariableType.fromCode(it!!),
            this@ResearchElementDefinitionSurrogate._variableType,
          )
        },
      characteristic = this@ResearchElementDefinitionSurrogate.characteristic ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ResearchElementDefinition): ResearchElementDefinitionSurrogate =
      with(model) {
        ResearchElementDefinitionSurrogate(
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
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          shortTitle = this@with.shortTitle?.value,
          _shortTitle = this@with.shortTitle?.toElement(),
          subtitle = this@with.subtitle?.value,
          _subtitle = this@with.subtitle?.toElement(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          subject = this@with.subject,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          comment =
            this@with.comment.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _comment =
            this@with.comment
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          jurisdiction = this@with.jurisdiction.takeUnless { it.all { it == null } },
          purpose = this@with.purpose?.value,
          _purpose = this@with.purpose?.toElement(),
          usage = this@with.usage?.value,
          _usage = this@with.usage?.toElement(),
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
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
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          variableType = this@with.variableType?.value?.getCode(),
          _variableType = this@with.variableType?.toElement(),
          characteristic = this@with.characteristic.takeUnless { it.all { it == null } },
        )
      }
  }
}
