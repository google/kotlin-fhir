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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ActivityDefinitionParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var role: CodeableConcept? = null,
) {
  public fun toModel(): ActivityDefinition.Participant =
    ActivityDefinition.Participant(
      id = this@ActivityDefinitionParticipantSurrogate.id,
      extension = this@ActivityDefinitionParticipantSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ActivityDefinitionParticipantSurrogate.modifierExtension ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r4b.ActivityDefinition.ActivityParticipantType.fromCode(
            this@ActivityDefinitionParticipantSurrogate.type!!
          ),
          this@ActivityDefinitionParticipantSurrogate._type,
        ),
      role = this@ActivityDefinitionParticipantSurrogate.role,
    )

  public companion object {
    public fun fromModel(
      model: ActivityDefinition.Participant
    ): ActivityDefinitionParticipantSurrogate =
      with(model) {
        ActivityDefinitionParticipantSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          role = this@with.role,
        )
      }
  }
}

@Serializable
internal data class ActivityDefinitionDynamicValueSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var path: KotlinString? = null,
  public var _path: Element? = null,
  public var expression: Expression,
) {
  public fun toModel(): ActivityDefinition.DynamicValue =
    ActivityDefinition.DynamicValue(
      id = this@ActivityDefinitionDynamicValueSurrogate.id,
      extension = this@ActivityDefinitionDynamicValueSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ActivityDefinitionDynamicValueSurrogate.modifierExtension ?: mutableListOf(),
      path =
        R4bString.of(
          this@ActivityDefinitionDynamicValueSurrogate.path,
          this@ActivityDefinitionDynamicValueSurrogate._path,
        )!!,
      expression = this@ActivityDefinitionDynamicValueSurrogate.expression,
    )

  public companion object {
    public fun fromModel(
      model: ActivityDefinition.DynamicValue
    ): ActivityDefinitionDynamicValueSurrogate =
      with(model) {
        ActivityDefinitionDynamicValueSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          path = this@with.path.value,
          _path = this@with.path.toElement(),
          expression = this@with.expression,
        )
      }
  }
}

@Serializable
internal data class ActivityDefinitionSubjectSurrogate(
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
  public var subjectCanonical: KotlinString? = null,
  public var _subjectCanonical: Element? = null,
) {
  public fun toModel(): ActivityDefinition.Subject? =
    ActivityDefinition.Subject?.from(
      this@ActivityDefinitionSubjectSurrogate.subjectCodeableConcept,
      this@ActivityDefinitionSubjectSurrogate.subjectReference,
      Canonical.of(
        this@ActivityDefinitionSubjectSurrogate.subjectCanonical,
        this@ActivityDefinitionSubjectSurrogate._subjectCanonical,
      ),
    )

  public companion object {
    public fun fromModel(model: ActivityDefinition.Subject): ActivityDefinitionSubjectSurrogate =
      with(model) {
        ActivityDefinitionSubjectSurrogate(
          subjectCodeableConcept = this@with.asCodeableConcept()?.value,
          subjectReference = this@with.asReference()?.value,
          subjectCanonical = this@with.asCanonical()?.value?.value,
          _subjectCanonical = this@with.asCanonical()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ActivityDefinitionTimingSurrogate(
  public var timingTiming: Timing? = null,
  public var timingDateTime: KotlinString? = null,
  public var _timingDateTime: Element? = null,
  public var timingAge: Age? = null,
  public var timingPeriod: Period? = null,
  public var timingRange: Range? = null,
  public var timingDuration: Duration? = null,
) {
  public fun toModel(): ActivityDefinition.Timing? =
    ActivityDefinition.Timing?.from(
      this@ActivityDefinitionTimingSurrogate.timingTiming,
      DateTime.of(
        FhirDateTime.fromString(this@ActivityDefinitionTimingSurrogate.timingDateTime),
        this@ActivityDefinitionTimingSurrogate._timingDateTime,
      ),
      this@ActivityDefinitionTimingSurrogate.timingAge,
      this@ActivityDefinitionTimingSurrogate.timingPeriod,
      this@ActivityDefinitionTimingSurrogate.timingRange,
      this@ActivityDefinitionTimingSurrogate.timingDuration,
    )

  public companion object {
    public fun fromModel(model: ActivityDefinition.Timing): ActivityDefinitionTimingSurrogate =
      with(model) {
        ActivityDefinitionTimingSurrogate(
          timingTiming = this@with.asTiming()?.value,
          timingDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _timingDateTime = this@with.asDateTime()?.value?.toElement(),
          timingAge = this@with.asAge()?.value,
          timingPeriod = this@with.asPeriod()?.value,
          timingRange = this@with.asRange()?.value,
          timingDuration = this@with.asDuration()?.value,
        )
      }
  }
}

@Serializable
internal data class ActivityDefinitionProductSurrogate(
  public var productReference: Reference? = null,
  public var productCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): ActivityDefinition.Product? =
    ActivityDefinition.Product?.from(
      this@ActivityDefinitionProductSurrogate.productReference,
      this@ActivityDefinitionProductSurrogate.productCodeableConcept,
    )

  public companion object {
    public fun fromModel(model: ActivityDefinition.Product): ActivityDefinitionProductSurrogate =
      with(model) {
        ActivityDefinitionProductSurrogate(
          productReference = this@with.asReference()?.value,
          productCodeableConcept = this@with.asCodeableConcept()?.value,
        )
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
  public var location: Reference? = null,
  public var participant: MutableList<ActivityDefinition.Participant>? = null,
  public var quantity: Quantity? = null,
  public var dosage: MutableList<Dosage>? = null,
  public var bodySite: MutableList<CodeableConcept>? = null,
  public var specimenRequirement: MutableList<Reference>? = null,
  public var observationRequirement: MutableList<Reference>? = null,
  public var observationResultRequirement: MutableList<Reference>? = null,
  public var transform: KotlinString? = null,
  public var _transform: Element? = null,
  public var dynamicValue: MutableList<ActivityDefinition.DynamicValue>? = null,
  public var subject: ActivityDefinition.Subject? = null,
  public var timing: ActivityDefinition.Timing? = null,
  public var product: ActivityDefinition.Product? = null,
) {
  public fun toModel(): ActivityDefinition =
    ActivityDefinition(
      id = this@ActivityDefinitionSurrogate.id,
      meta = this@ActivityDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@ActivityDefinitionSurrogate.implicitRules,
          this@ActivityDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@ActivityDefinitionSurrogate.language,
          this@ActivityDefinitionSurrogate._language,
        ),
      text = this@ActivityDefinitionSurrogate.text,
      contained = this@ActivityDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@ActivityDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ActivityDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@ActivityDefinitionSurrogate.url, this@ActivityDefinitionSurrogate._url),
      identifier = this@ActivityDefinitionSurrogate.identifier ?: mutableListOf(),
      version =
        R4bString.of(
          this@ActivityDefinitionSurrogate.version,
          this@ActivityDefinitionSurrogate._version,
        ),
      name =
        R4bString.of(this@ActivityDefinitionSurrogate.name, this@ActivityDefinitionSurrogate._name),
      title =
        R4bString.of(
          this@ActivityDefinitionSurrogate.title,
          this@ActivityDefinitionSurrogate._title,
        ),
      subtitle =
        R4bString.of(
          this@ActivityDefinitionSurrogate.subtitle,
          this@ActivityDefinitionSurrogate._subtitle,
        ),
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.PublicationStatus.fromCode(
            this@ActivityDefinitionSurrogate.status!!
          ),
          this@ActivityDefinitionSurrogate._status,
        ),
      experimental =
        R4bBoolean.of(
          this@ActivityDefinitionSurrogate.experimental,
          this@ActivityDefinitionSurrogate._experimental,
        ),
      subject = this@ActivityDefinitionSurrogate.subject,
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ActivityDefinitionSurrogate.date),
          this@ActivityDefinitionSurrogate._date,
        ),
      publisher =
        R4bString.of(
          this@ActivityDefinitionSurrogate.publisher,
          this@ActivityDefinitionSurrogate._publisher,
        ),
      contact = this@ActivityDefinitionSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@ActivityDefinitionSurrogate.description,
          this@ActivityDefinitionSurrogate._description,
        ),
      useContext = this@ActivityDefinitionSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@ActivityDefinitionSurrogate.jurisdiction ?: mutableListOf(),
      purpose =
        Markdown.of(
          this@ActivityDefinitionSurrogate.purpose,
          this@ActivityDefinitionSurrogate._purpose,
        ),
      usage =
        R4bString.of(
          this@ActivityDefinitionSurrogate.usage,
          this@ActivityDefinitionSurrogate._usage,
        ),
      copyright =
        Markdown.of(
          this@ActivityDefinitionSurrogate.copyright,
          this@ActivityDefinitionSurrogate._copyright,
        ),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@ActivityDefinitionSurrogate.approvalDate),
          this@ActivityDefinitionSurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@ActivityDefinitionSurrogate.lastReviewDate),
          this@ActivityDefinitionSurrogate._lastReviewDate,
        ),
      effectivePeriod = this@ActivityDefinitionSurrogate.effectivePeriod,
      topic = this@ActivityDefinitionSurrogate.topic ?: mutableListOf(),
      author = this@ActivityDefinitionSurrogate.author ?: mutableListOf(),
      editor = this@ActivityDefinitionSurrogate.editor ?: mutableListOf(),
      reviewer = this@ActivityDefinitionSurrogate.reviewer ?: mutableListOf(),
      endorser = this@ActivityDefinitionSurrogate.endorser ?: mutableListOf(),
      relatedArtifact = this@ActivityDefinitionSurrogate.relatedArtifact ?: mutableListOf(),
      library =
        if (
          this@ActivityDefinitionSurrogate.library == null &&
            this@ActivityDefinitionSurrogate._library == null
        ) {
          mutableListOf()
        } else {
          (this@ActivityDefinitionSurrogate.library
              ?: List(this@ActivityDefinitionSurrogate._library!!.size) { null })
            .zip(
              this@ActivityDefinitionSurrogate._library
                ?: List(this@ActivityDefinitionSurrogate.library!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      kind =
        this@ActivityDefinitionSurrogate.kind?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.ActivityDefinitionKind.fromCode(it!!),
            this@ActivityDefinitionSurrogate._kind,
          )
        },
      profile =
        Canonical.of(
          this@ActivityDefinitionSurrogate.profile,
          this@ActivityDefinitionSurrogate._profile,
        ),
      code = this@ActivityDefinitionSurrogate.code,
      intent =
        this@ActivityDefinitionSurrogate.intent?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.ActivityDefinition.RequestIntent.fromCode(it!!),
            this@ActivityDefinitionSurrogate._intent,
          )
        },
      priority =
        this@ActivityDefinitionSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.ActivityDefinition.RequestPriority.fromCode(it!!),
            this@ActivityDefinitionSurrogate._priority,
          )
        },
      doNotPerform =
        R4bBoolean.of(
          this@ActivityDefinitionSurrogate.doNotPerform,
          this@ActivityDefinitionSurrogate._doNotPerform,
        ),
      timing = this@ActivityDefinitionSurrogate.timing,
      location = this@ActivityDefinitionSurrogate.location,
      participant = this@ActivityDefinitionSurrogate.participant ?: mutableListOf(),
      product = this@ActivityDefinitionSurrogate.product,
      quantity = this@ActivityDefinitionSurrogate.quantity,
      dosage = this@ActivityDefinitionSurrogate.dosage ?: mutableListOf(),
      bodySite = this@ActivityDefinitionSurrogate.bodySite ?: mutableListOf(),
      specimenRequirement = this@ActivityDefinitionSurrogate.specimenRequirement ?: mutableListOf(),
      observationRequirement =
        this@ActivityDefinitionSurrogate.observationRequirement ?: mutableListOf(),
      observationResultRequirement =
        this@ActivityDefinitionSurrogate.observationResultRequirement ?: mutableListOf(),
      transform =
        Canonical.of(
          this@ActivityDefinitionSurrogate.transform,
          this@ActivityDefinitionSurrogate._transform,
        ),
      dynamicValue = this@ActivityDefinitionSurrogate.dynamicValue ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ActivityDefinition): ActivityDefinitionSurrogate =
      with(model) {
        ActivityDefinitionSurrogate(
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
          kind = this@with.kind?.value?.getCode(),
          _kind = this@with.kind?.toElement(),
          profile = this@with.profile?.value,
          _profile = this@with.profile?.toElement(),
          code = this@with.code,
          intent = this@with.intent?.value?.getCode(),
          _intent = this@with.intent?.toElement(),
          priority = this@with.priority?.value?.getCode(),
          _priority = this@with.priority?.toElement(),
          doNotPerform = this@with.doNotPerform?.value,
          _doNotPerform = this@with.doNotPerform?.toElement(),
          timing = this@with.timing,
          location = this@with.location,
          participant = this@with.participant.takeUnless { it.all { it == null } },
          product = this@with.product,
          quantity = this@with.quantity,
          dosage = this@with.dosage.takeUnless { it.all { it == null } },
          bodySite = this@with.bodySite.takeUnless { it.all { it == null } },
          specimenRequirement = this@with.specimenRequirement.takeUnless { it.all { it == null } },
          observationRequirement =
            this@with.observationRequirement.takeUnless { it.all { it == null } },
          observationResultRequirement =
            this@with.observationResultRequirement.takeUnless { it.all { it == null } },
          transform = this@with.transform?.value,
          _transform = this@with.transform?.toElement(),
          dynamicValue = this@with.dynamicValue.takeUnless { it.all { it == null } },
        )
      }
  }
}
