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

import com.google.fhir.model.r5.ActivityDefinition
import com.google.fhir.model.r5.Age
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Dosage
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Expression
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Timing
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
internal data class ActivityDefinitionParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var typeCanonical: KotlinString? = null,
  public var _typeCanonical: Element? = null,
  public var typeReference: Reference? = null,
  public var role: CodeableConcept? = null,
  public var function: CodeableConcept? = null,
) {
  public fun toModel(): ActivityDefinition.Participant =
    ActivityDefinition.Participant(
      id = this@ActivityDefinitionParticipantSurrogate.id,
      extension = this@ActivityDefinitionParticipantSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ActivityDefinitionParticipantSurrogate.modifierExtension ?: mutableListOf(),
      type =
        this@ActivityDefinitionParticipantSurrogate.type?.let {
          Enumeration.of(
            com.google.fhir.model.r5.ActivityDefinition.ActivityParticipantType.fromCode(it!!),
            this@ActivityDefinitionParticipantSurrogate._type,
          )
        },
      typeCanonical =
        Canonical.of(
          this@ActivityDefinitionParticipantSurrogate.typeCanonical,
          this@ActivityDefinitionParticipantSurrogate._typeCanonical,
        ),
      typeReference = this@ActivityDefinitionParticipantSurrogate.typeReference,
      role = this@ActivityDefinitionParticipantSurrogate.role,
      function = this@ActivityDefinitionParticipantSurrogate.function,
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
          type = this@with.type?.value?.getCode(),
          _type = this@with.type?.toElement(),
          typeCanonical = this@with.typeCanonical?.value,
          _typeCanonical = this@with.typeCanonical?.toElement(),
          typeReference = this@with.typeReference,
          role = this@with.role,
          function = this@with.function,
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
        R5String.of(
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
  public var subjectCanonical: KotlinString? = null,
  public var _subjectCanonical: Element? = null,
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
  public var timingAge: Age? = null,
  public var timingRange: Range? = null,
  public var timingDuration: Duration? = null,
  public var asNeededBoolean: KotlinBoolean? = null,
  public var _asNeededBoolean: Element? = null,
  public var asNeededCodeableConcept: CodeableConcept? = null,
  public var location: CodeableReference? = null,
  public var participant: MutableList<ActivityDefinition.Participant>? = null,
  public var productReference: Reference? = null,
  public var productCodeableConcept: CodeableConcept? = null,
  public var quantity: Quantity? = null,
  public var dosage: MutableList<Dosage>? = null,
  public var bodySite: MutableList<CodeableConcept>? = null,
  public var specimenRequirement: MutableList<KotlinString?>? = null,
  public var _specimenRequirement: MutableList<Element?>? = null,
  public var observationRequirement: MutableList<KotlinString?>? = null,
  public var _observationRequirement: MutableList<Element?>? = null,
  public var observationResultRequirement: MutableList<KotlinString?>? = null,
  public var _observationResultRequirement: MutableList<Element?>? = null,
  public var transform: KotlinString? = null,
  public var _transform: Element? = null,
  public var dynamicValue: MutableList<ActivityDefinition.DynamicValue>? = null,
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
        R5String.of(
          this@ActivityDefinitionSurrogate.version,
          this@ActivityDefinitionSurrogate._version,
        ),
      versionAlgorithm =
        ActivityDefinition.VersionAlgorithm?.from(
          R5String.of(
            this@ActivityDefinitionSurrogate.versionAlgorithmString,
            this@ActivityDefinitionSurrogate._versionAlgorithmString,
          ),
          this@ActivityDefinitionSurrogate.versionAlgorithmCoding,
        ),
      name =
        R5String.of(this@ActivityDefinitionSurrogate.name, this@ActivityDefinitionSurrogate._name),
      title =
        R5String.of(
          this@ActivityDefinitionSurrogate.title,
          this@ActivityDefinitionSurrogate._title,
        ),
      subtitle =
        R5String.of(
          this@ActivityDefinitionSurrogate.subtitle,
          this@ActivityDefinitionSurrogate._subtitle,
        ),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.PublicationStatus.fromCode(
            this@ActivityDefinitionSurrogate.status!!
          ),
          this@ActivityDefinitionSurrogate._status,
        ),
      experimental =
        R5Boolean.of(
          this@ActivityDefinitionSurrogate.experimental,
          this@ActivityDefinitionSurrogate._experimental,
        ),
      subject =
        ActivityDefinition.Subject?.from(
          this@ActivityDefinitionSurrogate.subjectCodeableConcept,
          this@ActivityDefinitionSurrogate.subjectReference,
          Canonical.of(
            this@ActivityDefinitionSurrogate.subjectCanonical,
            this@ActivityDefinitionSurrogate._subjectCanonical,
          ),
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ActivityDefinitionSurrogate.date),
          this@ActivityDefinitionSurrogate._date,
        ),
      publisher =
        R5String.of(
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
        Markdown.of(
          this@ActivityDefinitionSurrogate.usage,
          this@ActivityDefinitionSurrogate._usage,
        ),
      copyright =
        Markdown.of(
          this@ActivityDefinitionSurrogate.copyright,
          this@ActivityDefinitionSurrogate._copyright,
        ),
      copyrightLabel =
        R5String.of(
          this@ActivityDefinitionSurrogate.copyrightLabel,
          this@ActivityDefinitionSurrogate._copyrightLabel,
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
            com.google.fhir.model.r5.ActivityDefinitionKind.fromCode(it!!),
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
            com.google.fhir.model.r5.ActivityDefinition.RequestIntent.fromCode(it!!),
            this@ActivityDefinitionSurrogate._intent,
          )
        },
      priority =
        this@ActivityDefinitionSurrogate.priority?.let {
          Enumeration.of(
            com.google.fhir.model.r5.ActivityDefinition.RequestPriority.fromCode(it!!),
            this@ActivityDefinitionSurrogate._priority,
          )
        },
      doNotPerform =
        R5Boolean.of(
          this@ActivityDefinitionSurrogate.doNotPerform,
          this@ActivityDefinitionSurrogate._doNotPerform,
        ),
      timing =
        ActivityDefinition.Timing?.from(
          this@ActivityDefinitionSurrogate.timingTiming,
          this@ActivityDefinitionSurrogate.timingAge,
          this@ActivityDefinitionSurrogate.timingRange,
          this@ActivityDefinitionSurrogate.timingDuration,
        ),
      asNeeded =
        ActivityDefinition.AsNeeded?.from(
          R5Boolean.of(
            this@ActivityDefinitionSurrogate.asNeededBoolean,
            this@ActivityDefinitionSurrogate._asNeededBoolean,
          ),
          this@ActivityDefinitionSurrogate.asNeededCodeableConcept,
        ),
      location = this@ActivityDefinitionSurrogate.location,
      participant = this@ActivityDefinitionSurrogate.participant ?: mutableListOf(),
      product =
        ActivityDefinition.Product?.from(
          this@ActivityDefinitionSurrogate.productReference,
          this@ActivityDefinitionSurrogate.productCodeableConcept,
        ),
      quantity = this@ActivityDefinitionSurrogate.quantity,
      dosage = this@ActivityDefinitionSurrogate.dosage ?: mutableListOf(),
      bodySite = this@ActivityDefinitionSurrogate.bodySite ?: mutableListOf(),
      specimenRequirement =
        if (
          this@ActivityDefinitionSurrogate.specimenRequirement == null &&
            this@ActivityDefinitionSurrogate._specimenRequirement == null
        ) {
          mutableListOf()
        } else {
          (this@ActivityDefinitionSurrogate.specimenRequirement
              ?: List(this@ActivityDefinitionSurrogate._specimenRequirement!!.size) { null })
            .zip(
              this@ActivityDefinitionSurrogate._specimenRequirement
                ?: List(this@ActivityDefinitionSurrogate.specimenRequirement!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      observationRequirement =
        if (
          this@ActivityDefinitionSurrogate.observationRequirement == null &&
            this@ActivityDefinitionSurrogate._observationRequirement == null
        ) {
          mutableListOf()
        } else {
          (this@ActivityDefinitionSurrogate.observationRequirement
              ?: List(this@ActivityDefinitionSurrogate._observationRequirement!!.size) { null })
            .zip(
              this@ActivityDefinitionSurrogate._observationRequirement
                ?: List(this@ActivityDefinitionSurrogate.observationRequirement!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      observationResultRequirement =
        if (
          this@ActivityDefinitionSurrogate.observationResultRequirement == null &&
            this@ActivityDefinitionSurrogate._observationResultRequirement == null
        ) {
          mutableListOf()
        } else {
          (this@ActivityDefinitionSurrogate.observationResultRequirement
              ?: List(this@ActivityDefinitionSurrogate._observationResultRequirement!!.size) {
                null
              })
            .zip(
              this@ActivityDefinitionSurrogate._observationResultRequirement
                ?: List(this@ActivityDefinitionSurrogate.observationResultRequirement!!.size) {
                  null
                }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
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
          versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.value,
          _versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.toElement(),
          versionAlgorithmCoding = this@with.versionAlgorithm?.asCoding()?.value,
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
          subjectCodeableConcept = this@with.subject?.asCodeableConcept()?.value,
          subjectReference = this@with.subject?.asReference()?.value,
          subjectCanonical = this@with.subject?.asCanonical()?.value?.value,
          _subjectCanonical = this@with.subject?.asCanonical()?.value?.toElement(),
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
          timingTiming = this@with.timing?.asTiming()?.value,
          timingAge = this@with.timing?.asAge()?.value,
          timingRange = this@with.timing?.asRange()?.value,
          timingDuration = this@with.timing?.asDuration()?.value,
          asNeededBoolean = this@with.asNeeded?.asBoolean()?.value?.value,
          _asNeededBoolean = this@with.asNeeded?.asBoolean()?.value?.toElement(),
          asNeededCodeableConcept = this@with.asNeeded?.asCodeableConcept()?.value,
          location = this@with.location,
          participant = this@with.participant.takeUnless { it.all { it == null } },
          productReference = this@with.product?.asReference()?.value,
          productCodeableConcept = this@with.product?.asCodeableConcept()?.value,
          quantity = this@with.quantity,
          dosage = this@with.dosage.takeUnless { it.all { it == null } },
          bodySite = this@with.bodySite.takeUnless { it.all { it == null } },
          specimenRequirement =
            this@with.specimenRequirement
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _specimenRequirement =
            this@with.specimenRequirement
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          observationRequirement =
            this@with.observationRequirement
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _observationRequirement =
            this@with.observationRequirement
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          observationResultRequirement =
            this@with.observationResultRequirement
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _observationResultRequirement =
            this@with.observationResultRequirement
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          transform = this@with.transform?.value,
          _transform = this@with.transform?.toElement(),
          dynamicValue = this@with.dynamicValue.takeUnless { it.all { it == null } },
        )
      }
  }
}
