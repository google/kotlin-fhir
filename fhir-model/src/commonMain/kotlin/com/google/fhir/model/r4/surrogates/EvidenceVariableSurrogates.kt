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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class EvidenceVariableCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var definitionReference: Reference? = null,
  public var definitionCanonical: KotlinString? = null,
  public var _definitionCanonical: Element? = null,
  public var definitionCodeableConcept: CodeableConcept? = null,
  public var definitionExpression: Expression? = null,
  public var definitionDataRequirement: DataRequirement? = null,
  public var definitionTriggerDefinition: TriggerDefinition? = null,
  public var usageContext: MutableList<UsageContext>? = null,
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
    EvidenceVariable.Characteristic(
      id = this@EvidenceVariableCharacteristicSurrogate.id,
      extension = this@EvidenceVariableCharacteristicSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@EvidenceVariableCharacteristicSurrogate.modifierExtension ?: mutableListOf(),
      description =
        R4String.of(
          this@EvidenceVariableCharacteristicSurrogate.description,
          this@EvidenceVariableCharacteristicSurrogate._description,
        ),
      definition =
        EvidenceVariable.Characteristic.Definition.from(
          this@EvidenceVariableCharacteristicSurrogate.definitionReference,
          Canonical.of(
            this@EvidenceVariableCharacteristicSurrogate.definitionCanonical,
            this@EvidenceVariableCharacteristicSurrogate._definitionCanonical,
          ),
          this@EvidenceVariableCharacteristicSurrogate.definitionCodeableConcept,
          this@EvidenceVariableCharacteristicSurrogate.definitionExpression,
          this@EvidenceVariableCharacteristicSurrogate.definitionDataRequirement,
          this@EvidenceVariableCharacteristicSurrogate.definitionTriggerDefinition,
        )!!,
      usageContext = this@EvidenceVariableCharacteristicSurrogate.usageContext ?: mutableListOf(),
      exclude =
        R4Boolean.of(
          this@EvidenceVariableCharacteristicSurrogate.exclude,
          this@EvidenceVariableCharacteristicSurrogate._exclude,
        ),
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
        ),
      timeFromStart = this@EvidenceVariableCharacteristicSurrogate.timeFromStart,
      groupMeasure =
        this@EvidenceVariableCharacteristicSurrogate.groupMeasure?.let {
          Enumeration.of(
            com.google.fhir.model.r4.EvidenceVariable.GroupMeasure.fromCode(it!!),
            this@EvidenceVariableCharacteristicSurrogate._groupMeasure,
          )
        },
    )

  public companion object {
    public fun fromModel(
      model: EvidenceVariable.Characteristic
    ): EvidenceVariableCharacteristicSurrogate =
      with(model) {
        EvidenceVariableCharacteristicSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          definitionReference = this@with.definition?.asReference()?.value,
          definitionCanonical = this@with.definition?.asCanonical()?.value?.value,
          _definitionCanonical = this@with.definition?.asCanonical()?.value?.toElement(),
          definitionCodeableConcept = this@with.definition?.asCodeableConcept()?.value,
          definitionExpression = this@with.definition?.asExpression()?.value,
          definitionDataRequirement = this@with.definition?.asDataRequirement()?.value,
          definitionTriggerDefinition = this@with.definition?.asTriggerDefinition()?.value,
          usageContext = this@with.usageContext.takeUnless { it.all { it == null } },
          exclude = this@with.exclude?.value,
          _exclude = this@with.exclude?.toElement(),
          participantEffectiveDateTime =
            this@with.participantEffective?.asDateTime()?.value?.value?.toString(),
          _participantEffectiveDateTime =
            this@with.participantEffective?.asDateTime()?.value?.toElement(),
          participantEffectivePeriod = this@with.participantEffective?.asPeriod()?.value,
          participantEffectiveDuration = this@with.participantEffective?.asDuration()?.value,
          participantEffectiveTiming = this@with.participantEffective?.asTiming()?.value,
          timeFromStart = this@with.timeFromStart,
          groupMeasure = this@with.groupMeasure?.value?.getCode(),
          _groupMeasure = this@with.groupMeasure?.toElement(),
        )
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
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: MutableList<ContactDetail>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var note: MutableList<Annotation>? = null,
  public var useContext: MutableList<UsageContext>? = null,
  public var jurisdiction: MutableList<CodeableConcept>? = null,
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
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var characteristic: MutableList<EvidenceVariable.Characteristic>? = null,
) {
  public fun toModel(): EvidenceVariable =
    EvidenceVariable(
      id = this@EvidenceVariableSurrogate.id,
      meta = this@EvidenceVariableSurrogate.meta,
      implicitRules =
        Uri.of(
          this@EvidenceVariableSurrogate.implicitRules,
          this@EvidenceVariableSurrogate._implicitRules,
        ),
      language =
        Code.of(this@EvidenceVariableSurrogate.language, this@EvidenceVariableSurrogate._language),
      text = this@EvidenceVariableSurrogate.text,
      contained = this@EvidenceVariableSurrogate.contained ?: mutableListOf(),
      extension = this@EvidenceVariableSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@EvidenceVariableSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@EvidenceVariableSurrogate.url, this@EvidenceVariableSurrogate._url),
      identifier = this@EvidenceVariableSurrogate.identifier ?: mutableListOf(),
      version =
        R4String.of(
          this@EvidenceVariableSurrogate.version,
          this@EvidenceVariableSurrogate._version,
        ),
      name = R4String.of(this@EvidenceVariableSurrogate.name, this@EvidenceVariableSurrogate._name),
      title =
        R4String.of(this@EvidenceVariableSurrogate.title, this@EvidenceVariableSurrogate._title),
      shortTitle =
        R4String.of(
          this@EvidenceVariableSurrogate.shortTitle,
          this@EvidenceVariableSurrogate._shortTitle,
        ),
      subtitle =
        R4String.of(
          this@EvidenceVariableSurrogate.subtitle,
          this@EvidenceVariableSurrogate._subtitle,
        ),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.PublicationStatus.fromCode(
            this@EvidenceVariableSurrogate.status!!
          ),
          this@EvidenceVariableSurrogate._status,
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@EvidenceVariableSurrogate.date),
          this@EvidenceVariableSurrogate._date,
        ),
      publisher =
        R4String.of(
          this@EvidenceVariableSurrogate.publisher,
          this@EvidenceVariableSurrogate._publisher,
        ),
      contact = this@EvidenceVariableSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@EvidenceVariableSurrogate.description,
          this@EvidenceVariableSurrogate._description,
        ),
      note = this@EvidenceVariableSurrogate.note ?: mutableListOf(),
      useContext = this@EvidenceVariableSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@EvidenceVariableSurrogate.jurisdiction ?: mutableListOf(),
      copyright =
        Markdown.of(
          this@EvidenceVariableSurrogate.copyright,
          this@EvidenceVariableSurrogate._copyright,
        ),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@EvidenceVariableSurrogate.approvalDate),
          this@EvidenceVariableSurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@EvidenceVariableSurrogate.lastReviewDate),
          this@EvidenceVariableSurrogate._lastReviewDate,
        ),
      effectivePeriod = this@EvidenceVariableSurrogate.effectivePeriod,
      topic = this@EvidenceVariableSurrogate.topic ?: mutableListOf(),
      author = this@EvidenceVariableSurrogate.author ?: mutableListOf(),
      editor = this@EvidenceVariableSurrogate.editor ?: mutableListOf(),
      reviewer = this@EvidenceVariableSurrogate.reviewer ?: mutableListOf(),
      endorser = this@EvidenceVariableSurrogate.endorser ?: mutableListOf(),
      relatedArtifact = this@EvidenceVariableSurrogate.relatedArtifact ?: mutableListOf(),
      type =
        this@EvidenceVariableSurrogate.type?.let {
          Enumeration.of(
            com.google.fhir.model.r4.EvidenceVariable.EvidenceVariableType.fromCode(it!!),
            this@EvidenceVariableSurrogate._type,
          )
        },
      characteristic = this@EvidenceVariableSurrogate.characteristic ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: EvidenceVariable): EvidenceVariableSurrogate =
      with(model) {
        EvidenceVariableSurrogate(
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
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          note = this@with.note.takeUnless { it.all { it == null } },
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          jurisdiction = this@with.jurisdiction.takeUnless { it.all { it == null } },
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
          type = this@with.type?.value?.getCode(),
          _type = this@with.type?.toElement(),
          characteristic = this@with.characteristic.takeUnless { it.all { it == null } },
        )
      }
  }
}
