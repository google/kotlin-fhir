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

import com.google.fhir.model.r4b.ActivityDefinition
import com.google.fhir.model.r4b.Age
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.ContactDetail
import com.google.fhir.model.r4b.Date
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Dosage
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
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Range
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.RelatedArtifact
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
internal data class ActivityDefinitionParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var role: CodeableConcept? = null,
) {
  public fun toModel(): ActivityDefinition.Participant =
    ActivityDefinition.Participant().apply {
      id = this@ActivityDefinitionParticipantSurrogate.id
      extension = this@ActivityDefinitionParticipantSurrogate.extension
      modifierExtension = this@ActivityDefinitionParticipantSurrogate.modifierExtension
      type =
        Enumeration.of(
          this@ActivityDefinitionParticipantSurrogate.type?.let {
            com.google.fhir.model.r4b.ActivityDefinition.ActivityParticipantType.fromCode(it)
          },
          this@ActivityDefinitionParticipantSurrogate._type,
        )
      role = this@ActivityDefinitionParticipantSurrogate.role
    }

  public companion object {
    public fun fromModel(
      model: ActivityDefinition.Participant
    ): ActivityDefinitionParticipantSurrogate =
      with(model) {
        ActivityDefinitionParticipantSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          role = this@with.role
        }
      }
  }
}

@Serializable
internal data class ActivityDefinitionDynamicValueSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var expression: Expression? = null,
) {
  public fun toModel(): ActivityDefinition.DynamicValue =
    ActivityDefinition.DynamicValue().apply {
      id = this@ActivityDefinitionDynamicValueSurrogate.id
      extension = this@ActivityDefinitionDynamicValueSurrogate.extension
      modifierExtension = this@ActivityDefinitionDynamicValueSurrogate.modifierExtension
      path =
        R4bString.of(
          this@ActivityDefinitionDynamicValueSurrogate.path,
          this@ActivityDefinitionDynamicValueSurrogate._path,
        )
      expression = this@ActivityDefinitionDynamicValueSurrogate.expression
    }

  public companion object {
    public fun fromModel(
      model: ActivityDefinition.DynamicValue
    ): ActivityDefinitionDynamicValueSurrogate =
      with(model) {
        ActivityDefinitionDynamicValueSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          path = this@with.path?.value
          _path = this@with.path?.toElement()
          expression = this@with.expression
        }
      }
  }
}

@Serializable
internal data class ActivityDefinitionSurrogate(
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
  public var subtitle: KotlinString? = null,
  public var _subtitle: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
  public var subjectCanonical: KotlinString? = null,
  public var _subjectCanonical: Element? = null,
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
  public var kind: KotlinString? = null,
  public var _kind: Element? = null,
  public var profile: KotlinString? = null,
  public var _profile: Element? = null,
  public var code: CodeableConcept? = null,
  public var intent: KotlinString? = null,
  public var _intent: Element? = null,
  public var priority: KotlinString? = null,
  public var _priority: Element? = null,
  public var doNotPerform: KotlinBoolean? = null,
  public var _doNotPerform: Element? = null,
  public var timingTiming: Timing? = null,
  public var timingDateTime: KotlinString? = null,
  public var _timingDateTime: Element? = null,
  public var timingAge: Age? = null,
  public var timingPeriod: Period? = null,
  public var timingRange: Range? = null,
  public var timingDuration: Duration? = null,
  public var location: Reference? = null,
  public var participant: List<ActivityDefinition.Participant>? = null,
  public var productReference: Reference? = null,
  public var productCodeableConcept: CodeableConcept? = null,
  public var quantity: Quantity? = null,
  public var dosage: List<Dosage?>? = null,
  public var bodySite: List<CodeableConcept?>? = null,
  public var specimenRequirement: List<Reference?>? = null,
  public var observationRequirement: List<Reference?>? = null,
  public var observationResultRequirement: List<Reference?>? = null,
  public var transform: KotlinString? = null,
  public var _transform: Element? = null,
  public var dynamicValue: List<ActivityDefinition.DynamicValue>? = null,
) {
  public fun toModel(): ActivityDefinition =
    ActivityDefinition().apply {
      id = this@ActivityDefinitionSurrogate.id
      meta = this@ActivityDefinitionSurrogate.meta
      implicitRules =
        Uri.of(
          this@ActivityDefinitionSurrogate.implicitRules,
          this@ActivityDefinitionSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@ActivityDefinitionSurrogate.language,
          this@ActivityDefinitionSurrogate._language,
        )
      text = this@ActivityDefinitionSurrogate.text
      contained = this@ActivityDefinitionSurrogate.contained
      extension = this@ActivityDefinitionSurrogate.extension
      modifierExtension = this@ActivityDefinitionSurrogate.modifierExtension
      url = Uri.of(this@ActivityDefinitionSurrogate.url, this@ActivityDefinitionSurrogate._url)
      identifier = this@ActivityDefinitionSurrogate.identifier
      version =
        R4bString.of(
          this@ActivityDefinitionSurrogate.version,
          this@ActivityDefinitionSurrogate._version,
        )
      name =
        R4bString.of(this@ActivityDefinitionSurrogate.name, this@ActivityDefinitionSurrogate._name)
      title =
        R4bString.of(
          this@ActivityDefinitionSurrogate.title,
          this@ActivityDefinitionSurrogate._title,
        )
      subtitle =
        R4bString.of(
          this@ActivityDefinitionSurrogate.subtitle,
          this@ActivityDefinitionSurrogate._subtitle,
        )
      status =
        Enumeration.of(
          this@ActivityDefinitionSurrogate.status?.let {
            com.google.fhir.model.r4b.PublicationStatus.fromCode(it)
          },
          this@ActivityDefinitionSurrogate._status,
        )
      experimental =
        R4bBoolean.of(
          this@ActivityDefinitionSurrogate.experimental,
          this@ActivityDefinitionSurrogate._experimental,
        )
      subject =
        ActivityDefinition.Subject?.from(
          this@ActivityDefinitionSurrogate.subjectCodeableConcept,
          this@ActivityDefinitionSurrogate.subjectReference,
          Canonical.of(
            this@ActivityDefinitionSurrogate.subjectCanonical,
            this@ActivityDefinitionSurrogate._subjectCanonical,
          ),
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ActivityDefinitionSurrogate.date),
          this@ActivityDefinitionSurrogate._date,
        )
      publisher =
        R4bString.of(
          this@ActivityDefinitionSurrogate.publisher,
          this@ActivityDefinitionSurrogate._publisher,
        )
      contact = this@ActivityDefinitionSurrogate.contact
      description =
        Markdown.of(
          this@ActivityDefinitionSurrogate.description,
          this@ActivityDefinitionSurrogate._description,
        )
      useContext = this@ActivityDefinitionSurrogate.useContext
      jurisdiction = this@ActivityDefinitionSurrogate.jurisdiction
      purpose =
        Markdown.of(
          this@ActivityDefinitionSurrogate.purpose,
          this@ActivityDefinitionSurrogate._purpose,
        )
      usage =
        R4bString.of(
          this@ActivityDefinitionSurrogate.usage,
          this@ActivityDefinitionSurrogate._usage,
        )
      copyright =
        Markdown.of(
          this@ActivityDefinitionSurrogate.copyright,
          this@ActivityDefinitionSurrogate._copyright,
        )
      approvalDate =
        Date.of(
          FhirDate.fromString(this@ActivityDefinitionSurrogate.approvalDate),
          this@ActivityDefinitionSurrogate._approvalDate,
        )
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@ActivityDefinitionSurrogate.lastReviewDate),
          this@ActivityDefinitionSurrogate._lastReviewDate,
        )
      effectivePeriod = this@ActivityDefinitionSurrogate.effectivePeriod
      topic = this@ActivityDefinitionSurrogate.topic
      author = this@ActivityDefinitionSurrogate.author
      editor = this@ActivityDefinitionSurrogate.editor
      reviewer = this@ActivityDefinitionSurrogate.reviewer
      endorser = this@ActivityDefinitionSurrogate.endorser
      relatedArtifact = this@ActivityDefinitionSurrogate.relatedArtifact
      library =
        if (
          this@ActivityDefinitionSurrogate.library == null &&
            this@ActivityDefinitionSurrogate._library == null
        ) {
          null
        } else {
          (this@ActivityDefinitionSurrogate.library
              ?: List(this@ActivityDefinitionSurrogate._library!!.size) { null })
            .zip(
              this@ActivityDefinitionSurrogate._library
                ?: List(this@ActivityDefinitionSurrogate.library!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      kind =
        Enumeration.of(
          this@ActivityDefinitionSurrogate.kind?.let {
            com.google.fhir.model.r4b.ActivityDefinitionKind.fromCode(it)
          },
          this@ActivityDefinitionSurrogate._kind,
        )
      profile =
        Canonical.of(
          this@ActivityDefinitionSurrogate.profile,
          this@ActivityDefinitionSurrogate._profile,
        )
      code = this@ActivityDefinitionSurrogate.code
      intent =
        Enumeration.of(
          this@ActivityDefinitionSurrogate.intent?.let {
            com.google.fhir.model.r4b.ActivityDefinition.RequestIntent.fromCode(it)
          },
          this@ActivityDefinitionSurrogate._intent,
        )
      priority =
        Enumeration.of(
          this@ActivityDefinitionSurrogate.priority?.let {
            com.google.fhir.model.r4b.ActivityDefinition.RequestPriority.fromCode(it)
          },
          this@ActivityDefinitionSurrogate._priority,
        )
      doNotPerform =
        R4bBoolean.of(
          this@ActivityDefinitionSurrogate.doNotPerform,
          this@ActivityDefinitionSurrogate._doNotPerform,
        )
      timing =
        ActivityDefinition.Timing?.from(
          this@ActivityDefinitionSurrogate.timingTiming,
          DateTime.of(
            FhirDateTime.fromString(this@ActivityDefinitionSurrogate.timingDateTime),
            this@ActivityDefinitionSurrogate._timingDateTime,
          ),
          this@ActivityDefinitionSurrogate.timingAge,
          this@ActivityDefinitionSurrogate.timingPeriod,
          this@ActivityDefinitionSurrogate.timingRange,
          this@ActivityDefinitionSurrogate.timingDuration,
        )
      location = this@ActivityDefinitionSurrogate.location
      participant = this@ActivityDefinitionSurrogate.participant
      product =
        ActivityDefinition.Product?.from(
          this@ActivityDefinitionSurrogate.productReference,
          this@ActivityDefinitionSurrogate.productCodeableConcept,
        )
      quantity = this@ActivityDefinitionSurrogate.quantity
      dosage = this@ActivityDefinitionSurrogate.dosage
      bodySite = this@ActivityDefinitionSurrogate.bodySite
      specimenRequirement = this@ActivityDefinitionSurrogate.specimenRequirement
      observationRequirement = this@ActivityDefinitionSurrogate.observationRequirement
      observationResultRequirement = this@ActivityDefinitionSurrogate.observationResultRequirement
      transform =
        Canonical.of(
          this@ActivityDefinitionSurrogate.transform,
          this@ActivityDefinitionSurrogate._transform,
        )
      dynamicValue = this@ActivityDefinitionSurrogate.dynamicValue
    }

  public companion object {
    public fun fromModel(model: ActivityDefinition): ActivityDefinitionSurrogate =
      with(model) {
        ActivityDefinitionSurrogate().apply {
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
          subtitle = this@with.subtitle?.value
          _subtitle = this@with.subtitle?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          experimental = this@with.experimental?.value
          _experimental = this@with.experimental?.toElement()
          subjectCodeableConcept = this@with.subject?.asCodeableConcept()?.value
          subjectReference = this@with.subject?.asReference()?.value
          subjectCanonical = this@with.subject?.asCanonical()?.value?.value
          _subjectCanonical = this@with.subject?.asCanonical()?.value?.toElement()
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
          kind = this@with.kind?.value?.getCode()
          _kind = this@with.kind?.toElement()
          profile = this@with.profile?.value
          _profile = this@with.profile?.toElement()
          code = this@with.code
          intent = this@with.intent?.value?.getCode()
          _intent = this@with.intent?.toElement()
          priority = this@with.priority?.value?.getCode()
          _priority = this@with.priority?.toElement()
          doNotPerform = this@with.doNotPerform?.value
          _doNotPerform = this@with.doNotPerform?.toElement()
          timingTiming = this@with.timing?.asTiming()?.value
          timingDateTime = this@with.timing?.asDateTime()?.value?.value?.toString()
          _timingDateTime = this@with.timing?.asDateTime()?.value?.toElement()
          timingAge = this@with.timing?.asAge()?.value
          timingPeriod = this@with.timing?.asPeriod()?.value
          timingRange = this@with.timing?.asRange()?.value
          timingDuration = this@with.timing?.asDuration()?.value
          location = this@with.location
          participant = this@with.participant
          productReference = this@with.product?.asReference()?.value
          productCodeableConcept = this@with.product?.asCodeableConcept()?.value
          quantity = this@with.quantity
          dosage = this@with.dosage
          bodySite = this@with.bodySite
          specimenRequirement = this@with.specimenRequirement
          observationRequirement = this@with.observationRequirement
          observationResultRequirement = this@with.observationResultRequirement
          transform = this@with.transform?.value
          _transform = this@with.transform?.toElement()
          dynamicValue = this@with.dynamicValue
        }
      }
  }
}
