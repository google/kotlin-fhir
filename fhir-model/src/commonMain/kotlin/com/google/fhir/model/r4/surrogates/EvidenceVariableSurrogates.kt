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
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.ContactDetail
import com.google.fhir.model.r4.DataRequirement
import com.google.fhir.model.r4.Date
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Duration
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.EvidenceVariable
import com.google.fhir.model.r4.Expression
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDate
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.RelatedArtifact
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Timing
import com.google.fhir.model.r4.TriggerDefinition
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.UsageContext
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class EvidenceVariableCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var definitionReference: Reference? = null,
  public var definitionCanonical: KotlinString? = null,
  public var _definitionCanonical: Element? = null,
  public var definitionCodeableConcept: CodeableConcept? = null,
  public var definitionExpression: Expression? = null,
  public var definitionDataRequirement: DataRequirement? = null,
  public var definitionTriggerDefinition: TriggerDefinition? = null,
  public var usageContext: List<UsageContext?>? = null,
  public var exclude: KotlinBoolean? = null,
  public var _exclude: Element? = null,
  public var participantEffectiveDateTime: KotlinString? = null,
  public var _participantEffectiveDateTime: Element? = null,
  public var participantEffectivePeriod: Period? = null,
  public var participantEffectiveDuration: Duration? = null,
  public var participantEffectiveTiming: Timing? = null,
  public var timeFromStart: Duration? = null,
  public var groupMeasure: KotlinString? = null,
  public var _groupMeasure: Element? = null,
) {
  public fun toModel(): EvidenceVariable.Characteristic =
    EvidenceVariable.Characteristic().apply {
      id = this@EvidenceVariableCharacteristicSurrogate.id
      extension = this@EvidenceVariableCharacteristicSurrogate.extension
      modifierExtension = this@EvidenceVariableCharacteristicSurrogate.modifierExtension
      description =
        R4String.of(
          this@EvidenceVariableCharacteristicSurrogate.description,
          this@EvidenceVariableCharacteristicSurrogate._description,
        )
      definition =
        EvidenceVariable.Characteristic.Definition?.from(
          this@EvidenceVariableCharacteristicSurrogate.definitionReference,
          Canonical.of(
            this@EvidenceVariableCharacteristicSurrogate.definitionCanonical,
            this@EvidenceVariableCharacteristicSurrogate._definitionCanonical,
          ),
          this@EvidenceVariableCharacteristicSurrogate.definitionCodeableConcept,
          this@EvidenceVariableCharacteristicSurrogate.definitionExpression,
          this@EvidenceVariableCharacteristicSurrogate.definitionDataRequirement,
          this@EvidenceVariableCharacteristicSurrogate.definitionTriggerDefinition,
        )
      usageContext = this@EvidenceVariableCharacteristicSurrogate.usageContext
      exclude =
        R4Boolean.of(
          this@EvidenceVariableCharacteristicSurrogate.exclude,
          this@EvidenceVariableCharacteristicSurrogate._exclude,
        )
      participantEffective =
        EvidenceVariable.Characteristic.ParticipantEffective?.from(
          DateTime.of(
            FhirDateTime.fromString(
              this@EvidenceVariableCharacteristicSurrogate.participantEffectiveDateTime
            ),
            this@EvidenceVariableCharacteristicSurrogate._participantEffectiveDateTime,
          ),
          this@EvidenceVariableCharacteristicSurrogate.participantEffectivePeriod,
          this@EvidenceVariableCharacteristicSurrogate.participantEffectiveDuration,
          this@EvidenceVariableCharacteristicSurrogate.participantEffectiveTiming,
        )
      timeFromStart = this@EvidenceVariableCharacteristicSurrogate.timeFromStart
      groupMeasure =
        Enumeration.of(
          this@EvidenceVariableCharacteristicSurrogate.groupMeasure?.let {
            com.google.fhir.model.r4.EvidenceVariable.GroupMeasure.fromCode(it)
          },
          this@EvidenceVariableCharacteristicSurrogate._groupMeasure,
        )
    }

  public companion object {
    public fun fromModel(
      model: EvidenceVariable.Characteristic
    ): EvidenceVariableCharacteristicSurrogate =
      with(model) {
        EvidenceVariableCharacteristicSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          definitionReference = this@with.definition?.asReference()?.value
          definitionCanonical = this@with.definition?.asCanonical()?.value?.value
          _definitionCanonical = this@with.definition?.asCanonical()?.value?.toElement()
          definitionCodeableConcept = this@with.definition?.asCodeableConcept()?.value
          definitionExpression = this@with.definition?.asExpression()?.value
          definitionDataRequirement = this@with.definition?.asDataRequirement()?.value
          definitionTriggerDefinition = this@with.definition?.asTriggerDefinition()?.value
          usageContext = this@with.usageContext
          exclude = this@with.exclude?.value
          _exclude = this@with.exclude?.toElement()
          participantEffectiveDateTime =
            this@with.participantEffective?.asDateTime()?.value?.value?.toString()
          _participantEffectiveDateTime =
            this@with.participantEffective?.asDateTime()?.value?.toElement()
          participantEffectivePeriod = this@with.participantEffective?.asPeriod()?.value
          participantEffectiveDuration = this@with.participantEffective?.asDuration()?.value
          participantEffectiveTiming = this@with.participantEffective?.asTiming()?.value
          timeFromStart = this@with.timeFromStart
          groupMeasure = this@with.groupMeasure?.value?.getCode()
          _groupMeasure = this@with.groupMeasure?.toElement()
        }
      }
  }
}

@Serializable
internal data class EvidenceVariableSurrogate(
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
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var characteristic: List<EvidenceVariable.Characteristic>? = null,
) {
  public fun toModel(): EvidenceVariable =
    EvidenceVariable().apply {
      id = this@EvidenceVariableSurrogate.id
      meta = this@EvidenceVariableSurrogate.meta
      implicitRules =
        Uri.of(
          this@EvidenceVariableSurrogate.implicitRules,
          this@EvidenceVariableSurrogate._implicitRules,
        )
      language =
        Code.of(this@EvidenceVariableSurrogate.language, this@EvidenceVariableSurrogate._language)
      text = this@EvidenceVariableSurrogate.text
      contained = this@EvidenceVariableSurrogate.contained
      extension = this@EvidenceVariableSurrogate.extension
      modifierExtension = this@EvidenceVariableSurrogate.modifierExtension
      url = Uri.of(this@EvidenceVariableSurrogate.url, this@EvidenceVariableSurrogate._url)
      identifier = this@EvidenceVariableSurrogate.identifier
      version =
        R4String.of(this@EvidenceVariableSurrogate.version, this@EvidenceVariableSurrogate._version)
      name = R4String.of(this@EvidenceVariableSurrogate.name, this@EvidenceVariableSurrogate._name)
      title =
        R4String.of(this@EvidenceVariableSurrogate.title, this@EvidenceVariableSurrogate._title)
      shortTitle =
        R4String.of(
          this@EvidenceVariableSurrogate.shortTitle,
          this@EvidenceVariableSurrogate._shortTitle,
        )
      subtitle =
        R4String.of(
          this@EvidenceVariableSurrogate.subtitle,
          this@EvidenceVariableSurrogate._subtitle,
        )
      status =
        Enumeration.of(
          this@EvidenceVariableSurrogate.status?.let {
            com.google.fhir.model.r4.PublicationStatus.fromCode(it)
          },
          this@EvidenceVariableSurrogate._status,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@EvidenceVariableSurrogate.date),
          this@EvidenceVariableSurrogate._date,
        )
      publisher =
        R4String.of(
          this@EvidenceVariableSurrogate.publisher,
          this@EvidenceVariableSurrogate._publisher,
        )
      contact = this@EvidenceVariableSurrogate.contact
      description =
        Markdown.of(
          this@EvidenceVariableSurrogate.description,
          this@EvidenceVariableSurrogate._description,
        )
      note = this@EvidenceVariableSurrogate.note
      useContext = this@EvidenceVariableSurrogate.useContext
      jurisdiction = this@EvidenceVariableSurrogate.jurisdiction
      copyright =
        Markdown.of(
          this@EvidenceVariableSurrogate.copyright,
          this@EvidenceVariableSurrogate._copyright,
        )
      approvalDate =
        Date.of(
          FhirDate.fromString(this@EvidenceVariableSurrogate.approvalDate),
          this@EvidenceVariableSurrogate._approvalDate,
        )
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@EvidenceVariableSurrogate.lastReviewDate),
          this@EvidenceVariableSurrogate._lastReviewDate,
        )
      effectivePeriod = this@EvidenceVariableSurrogate.effectivePeriod
      topic = this@EvidenceVariableSurrogate.topic
      author = this@EvidenceVariableSurrogate.author
      editor = this@EvidenceVariableSurrogate.editor
      reviewer = this@EvidenceVariableSurrogate.reviewer
      endorser = this@EvidenceVariableSurrogate.endorser
      relatedArtifact = this@EvidenceVariableSurrogate.relatedArtifact
      type =
        Enumeration.of(
          this@EvidenceVariableSurrogate.type?.let {
            com.google.fhir.model.r4.EvidenceVariable.EvidenceVariableType.fromCode(it)
          },
          this@EvidenceVariableSurrogate._type,
        )
      characteristic = this@EvidenceVariableSurrogate.characteristic
    }

  public companion object {
    public fun fromModel(model: EvidenceVariable): EvidenceVariableSurrogate =
      with(model) {
        EvidenceVariableSurrogate().apply {
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
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          characteristic = this@with.characteristic
        }
      }
  }
}
