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
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.EvidenceVariable
import com.google.fhir.model.r5.Expression
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Id
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.PositiveInt
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var method: MutableList<CodeableConcept>? = null,
  public var device: Reference? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
  public var valueReference: Reference? = null,
  public var valueId: KotlinString? = null,
  public var _valueId: Element? = null,
  public var offset: CodeableConcept? = null,
) {
  public fun toModel(): EvidenceVariable.Characteristic.DefinitionByTypeAndValue =
    EvidenceVariable.Characteristic.DefinitionByTypeAndValue(
      id = this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.id,
      extension =
        this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.modifierExtension
          ?: mutableListOf(),
      type = this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.type,
      method =
        this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.method
          ?: mutableListOf(),
      device = this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.device,
      `value` =
        EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.from(
          this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.valueCodeableConcept,
          R5Boolean.of(
            this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.valueBoolean,
            this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate._valueBoolean,
          ),
          this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.valueQuantity,
          this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.valueRange,
          this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.valueReference,
          Id.of(
            this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.valueId,
            this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate._valueId,
          ),
        )!!,
      offset = this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.offset,
    )

  public companion object {
    public fun fromModel(
      model: EvidenceVariable.Characteristic.DefinitionByTypeAndValue
    ): EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate =
      with(model) {
        EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          method = this@with.method.takeUnless { it.all { it == null } },
          device = this@with.device,
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value,
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value,
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement(),
          valueQuantity = this@with.`value`?.asQuantity()?.value,
          valueRange = this@with.`value`?.asRange()?.value,
          valueReference = this@with.`value`?.asReference()?.value,
          valueId = this@with.`value`?.asId()?.value?.value,
          _valueId = this@with.`value`?.asId()?.value?.toElement(),
          offset = this@with.offset,
        )
      }
  }
}

@Serializable
internal data class EvidenceVariableCharacteristicDefinitionByCombinationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var threshold: Int? = null,
  public var _threshold: Element? = null,
  public var characteristic: MutableList<EvidenceVariable.Characteristic>? = null,
) {
  public fun toModel(): EvidenceVariable.Characteristic.DefinitionByCombination =
    EvidenceVariable.Characteristic.DefinitionByCombination(
      id = this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate.id,
      extension =
        this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate.modifierExtension
          ?: mutableListOf(),
      code =
        Enumeration.of(
          com.google.fhir.model.r5.EvidenceVariable.CharacteristicCombination.fromCode(
            this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate.code!!
          ),
          this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate._code,
        ),
      threshold =
        PositiveInt.of(
          this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate.threshold,
          this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate._threshold,
        ),
      characteristic =
        this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate.characteristic
          ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: EvidenceVariable.Characteristic.DefinitionByCombination
    ): EvidenceVariableCharacteristicDefinitionByCombinationSurrogate =
      with(model) {
        EvidenceVariableCharacteristicDefinitionByCombinationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value?.getCode(),
          _code = this@with.code.toElement(),
          threshold = this@with.threshold?.value,
          _threshold = this@with.threshold?.toElement(),
          characteristic = this@with.characteristic.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class EvidenceVariableCharacteristicTimeFromEventSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var note: MutableList<Annotation>? = null,
  public var eventCodeableConcept: CodeableConcept? = null,
  public var eventReference: Reference? = null,
  public var eventDateTime: KotlinString? = null,
  public var _eventDateTime: Element? = null,
  public var eventId: KotlinString? = null,
  public var _eventId: Element? = null,
  public var quantity: Quantity? = null,
  public var range: Range? = null,
) {
  public fun toModel(): EvidenceVariable.Characteristic.TimeFromEvent =
    EvidenceVariable.Characteristic.TimeFromEvent(
      id = this@EvidenceVariableCharacteristicTimeFromEventSurrogate.id,
      extension =
        this@EvidenceVariableCharacteristicTimeFromEventSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@EvidenceVariableCharacteristicTimeFromEventSurrogate.modifierExtension
          ?: mutableListOf(),
      description =
        Markdown.of(
          this@EvidenceVariableCharacteristicTimeFromEventSurrogate.description,
          this@EvidenceVariableCharacteristicTimeFromEventSurrogate._description,
        ),
      note = this@EvidenceVariableCharacteristicTimeFromEventSurrogate.note ?: mutableListOf(),
      event =
        EvidenceVariable.Characteristic.TimeFromEvent.Event?.from(
          this@EvidenceVariableCharacteristicTimeFromEventSurrogate.eventCodeableConcept,
          this@EvidenceVariableCharacteristicTimeFromEventSurrogate.eventReference,
          DateTime.of(
            FhirDateTime.fromString(
              this@EvidenceVariableCharacteristicTimeFromEventSurrogate.eventDateTime
            ),
            this@EvidenceVariableCharacteristicTimeFromEventSurrogate._eventDateTime,
          ),
          Id.of(
            this@EvidenceVariableCharacteristicTimeFromEventSurrogate.eventId,
            this@EvidenceVariableCharacteristicTimeFromEventSurrogate._eventId,
          ),
        ),
      quantity = this@EvidenceVariableCharacteristicTimeFromEventSurrogate.quantity,
      range = this@EvidenceVariableCharacteristicTimeFromEventSurrogate.range,
    )

  public companion object {
    public fun fromModel(
      model: EvidenceVariable.Characteristic.TimeFromEvent
    ): EvidenceVariableCharacteristicTimeFromEventSurrogate =
      with(model) {
        EvidenceVariableCharacteristicTimeFromEventSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          note = this@with.note.takeUnless { it.all { it == null } },
          eventCodeableConcept = this@with.event?.asCodeableConcept()?.value,
          eventReference = this@with.event?.asReference()?.value,
          eventDateTime = this@with.event?.asDateTime()?.value?.value?.toString(),
          _eventDateTime = this@with.event?.asDateTime()?.value?.toElement(),
          eventId = this@with.event?.asId()?.value?.value,
          _eventId = this@with.event?.asId()?.value?.toElement(),
          quantity = this@with.quantity,
          range = this@with.range,
        )
      }
  }
}

@Serializable
internal data class EvidenceVariableCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var note: MutableList<Annotation>? = null,
  public var exclude: KotlinBoolean? = null,
  public var _exclude: Element? = null,
  public var definitionReference: Reference? = null,
  public var definitionCanonical: KotlinString? = null,
  public var _definitionCanonical: Element? = null,
  public var definitionCodeableConcept: CodeableConcept? = null,
  public var definitionExpression: Expression? = null,
  public var definitionId: KotlinString? = null,
  public var _definitionId: Element? = null,
  public var definitionByTypeAndValue: EvidenceVariable.Characteristic.DefinitionByTypeAndValue? =
    null,
  public var definitionByCombination: EvidenceVariable.Characteristic.DefinitionByCombination? =
    null,
  public var instancesQuantity: Quantity? = null,
  public var instancesRange: Range? = null,
  public var durationQuantity: Quantity? = null,
  public var durationRange: Range? = null,
  public var timeFromEvent: MutableList<EvidenceVariable.Characteristic.TimeFromEvent>? = null,
) {
  public fun toModel(): EvidenceVariable.Characteristic =
    EvidenceVariable.Characteristic(
      id = this@EvidenceVariableCharacteristicSurrogate.id,
      extension = this@EvidenceVariableCharacteristicSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@EvidenceVariableCharacteristicSurrogate.modifierExtension ?: mutableListOf(),
      linkId =
        Id.of(
          this@EvidenceVariableCharacteristicSurrogate.linkId,
          this@EvidenceVariableCharacteristicSurrogate._linkId,
        ),
      description =
        Markdown.of(
          this@EvidenceVariableCharacteristicSurrogate.description,
          this@EvidenceVariableCharacteristicSurrogate._description,
        ),
      note = this@EvidenceVariableCharacteristicSurrogate.note ?: mutableListOf(),
      exclude =
        R5Boolean.of(
          this@EvidenceVariableCharacteristicSurrogate.exclude,
          this@EvidenceVariableCharacteristicSurrogate._exclude,
        ),
      definitionReference = this@EvidenceVariableCharacteristicSurrogate.definitionReference,
      definitionCanonical =
        Canonical.of(
          this@EvidenceVariableCharacteristicSurrogate.definitionCanonical,
          this@EvidenceVariableCharacteristicSurrogate._definitionCanonical,
        ),
      definitionCodeableConcept =
        this@EvidenceVariableCharacteristicSurrogate.definitionCodeableConcept,
      definitionExpression = this@EvidenceVariableCharacteristicSurrogate.definitionExpression,
      definitionId =
        Id.of(
          this@EvidenceVariableCharacteristicSurrogate.definitionId,
          this@EvidenceVariableCharacteristicSurrogate._definitionId,
        ),
      definitionByTypeAndValue =
        this@EvidenceVariableCharacteristicSurrogate.definitionByTypeAndValue,
      definitionByCombination =
        this@EvidenceVariableCharacteristicSurrogate.definitionByCombination,
      instances =
        EvidenceVariable.Characteristic.Instances?.from(
          this@EvidenceVariableCharacteristicSurrogate.instancesQuantity,
          this@EvidenceVariableCharacteristicSurrogate.instancesRange,
        ),
      duration =
        EvidenceVariable.Characteristic.Duration?.from(
          this@EvidenceVariableCharacteristicSurrogate.durationQuantity,
          this@EvidenceVariableCharacteristicSurrogate.durationRange,
        ),
      timeFromEvent = this@EvidenceVariableCharacteristicSurrogate.timeFromEvent ?: mutableListOf(),
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
          linkId = this@with.linkId?.value,
          _linkId = this@with.linkId?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          note = this@with.note.takeUnless { it.all { it == null } },
          exclude = this@with.exclude?.value,
          _exclude = this@with.exclude?.toElement(),
          definitionReference = this@with.definitionReference,
          definitionCanonical = this@with.definitionCanonical?.value,
          _definitionCanonical = this@with.definitionCanonical?.toElement(),
          definitionCodeableConcept = this@with.definitionCodeableConcept,
          definitionExpression = this@with.definitionExpression,
          definitionId = this@with.definitionId?.value,
          _definitionId = this@with.definitionId?.toElement(),
          definitionByTypeAndValue = this@with.definitionByTypeAndValue,
          definitionByCombination = this@with.definitionByCombination,
          instancesQuantity = this@with.instances?.asQuantity()?.value,
          instancesRange = this@with.instances?.asRange()?.value,
          durationQuantity = this@with.duration?.asQuantity()?.value,
          durationRange = this@with.duration?.asRange()?.value,
          timeFromEvent = this@with.timeFromEvent.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class EvidenceVariableCategorySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
) {
  public fun toModel(): EvidenceVariable.Category =
    EvidenceVariable.Category(
      id = this@EvidenceVariableCategorySurrogate.id,
      extension = this@EvidenceVariableCategorySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@EvidenceVariableCategorySurrogate.modifierExtension ?: mutableListOf(),
      name =
        R5String.of(
          this@EvidenceVariableCategorySurrogate.name,
          this@EvidenceVariableCategorySurrogate._name,
        ),
      `value` =
        EvidenceVariable.Category.Value?.from(
          this@EvidenceVariableCategorySurrogate.valueCodeableConcept,
          this@EvidenceVariableCategorySurrogate.valueQuantity,
          this@EvidenceVariableCategorySurrogate.valueRange,
        ),
    )

  public companion object {
    public fun fromModel(model: EvidenceVariable.Category): EvidenceVariableCategorySurrogate =
      with(model) {
        EvidenceVariableCategorySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value,
          valueQuantity = this@with.`value`?.asQuantity()?.value,
          valueRange = this@with.`value`?.asRange()?.value,
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
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var shortTitle: KotlinString? = null,
  public var _shortTitle: Element? = null,
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
  public var note: MutableList<Annotation>? = null,
  public var useContext: MutableList<UsageContext>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var copyrightLabel: KotlinString? = null,
  public var _copyrightLabel: Element? = null,
  public var approvalDate: KotlinString? = null,
  public var _approvalDate: Element? = null,
  public var lastReviewDate: KotlinString? = null,
  public var _lastReviewDate: Element? = null,
  public var effectivePeriod: Period? = null,
  public var author: MutableList<ContactDetail>? = null,
  public var editor: MutableList<ContactDetail>? = null,
  public var reviewer: MutableList<ContactDetail>? = null,
  public var endorser: MutableList<ContactDetail>? = null,
  public var relatedArtifact: MutableList<RelatedArtifact>? = null,
  public var `actual`: KotlinBoolean? = null,
  public var _actual: Element? = null,
  public var characteristic: MutableList<EvidenceVariable.Characteristic>? = null,
  public var handling: KotlinString? = null,
  public var _handling: Element? = null,
  public var category: MutableList<EvidenceVariable.Category>? = null,
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
        R5String.of(
          this@EvidenceVariableSurrogate.version,
          this@EvidenceVariableSurrogate._version,
        ),
      versionAlgorithm =
        EvidenceVariable.VersionAlgorithm?.from(
          R5String.of(
            this@EvidenceVariableSurrogate.versionAlgorithmString,
            this@EvidenceVariableSurrogate._versionAlgorithmString,
          ),
          this@EvidenceVariableSurrogate.versionAlgorithmCoding,
        ),
      name = R5String.of(this@EvidenceVariableSurrogate.name, this@EvidenceVariableSurrogate._name),
      title =
        R5String.of(this@EvidenceVariableSurrogate.title, this@EvidenceVariableSurrogate._title),
      shortTitle =
        R5String.of(
          this@EvidenceVariableSurrogate.shortTitle,
          this@EvidenceVariableSurrogate._shortTitle,
        ),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.PublicationStatus.fromCode(
            this@EvidenceVariableSurrogate.status!!
          ),
          this@EvidenceVariableSurrogate._status,
        ),
      experimental =
        R5Boolean.of(
          this@EvidenceVariableSurrogate.experimental,
          this@EvidenceVariableSurrogate._experimental,
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@EvidenceVariableSurrogate.date),
          this@EvidenceVariableSurrogate._date,
        ),
      publisher =
        R5String.of(
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
      purpose =
        Markdown.of(
          this@EvidenceVariableSurrogate.purpose,
          this@EvidenceVariableSurrogate._purpose,
        ),
      copyright =
        Markdown.of(
          this@EvidenceVariableSurrogate.copyright,
          this@EvidenceVariableSurrogate._copyright,
        ),
      copyrightLabel =
        R5String.of(
          this@EvidenceVariableSurrogate.copyrightLabel,
          this@EvidenceVariableSurrogate._copyrightLabel,
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
      author = this@EvidenceVariableSurrogate.author ?: mutableListOf(),
      editor = this@EvidenceVariableSurrogate.editor ?: mutableListOf(),
      reviewer = this@EvidenceVariableSurrogate.reviewer ?: mutableListOf(),
      endorser = this@EvidenceVariableSurrogate.endorser ?: mutableListOf(),
      relatedArtifact = this@EvidenceVariableSurrogate.relatedArtifact ?: mutableListOf(),
      `actual` =
        R5Boolean.of(
          this@EvidenceVariableSurrogate.`actual`,
          this@EvidenceVariableSurrogate._actual,
        ),
      characteristic = this@EvidenceVariableSurrogate.characteristic ?: mutableListOf(),
      handling =
        this@EvidenceVariableSurrogate.handling?.let {
          Enumeration.of(
            com.google.fhir.model.r5.EvidenceVariable.EvidenceVariableHandling.fromCode(it!!),
            this@EvidenceVariableSurrogate._handling,
          )
        },
      category = this@EvidenceVariableSurrogate.category ?: mutableListOf(),
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
          versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.value,
          _versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.toElement(),
          versionAlgorithmCoding = this@with.versionAlgorithm?.asCoding()?.value,
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          shortTitle = this@with.shortTitle?.value,
          _shortTitle = this@with.shortTitle?.toElement(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          note = this@with.note.takeUnless { it.all { it == null } },
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          purpose = this@with.purpose?.value,
          _purpose = this@with.purpose?.toElement(),
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
          copyrightLabel = this@with.copyrightLabel?.value,
          _copyrightLabel = this@with.copyrightLabel?.toElement(),
          approvalDate = this@with.approvalDate?.value?.toString(),
          _approvalDate = this@with.approvalDate?.toElement(),
          lastReviewDate = this@with.lastReviewDate?.value?.toString(),
          _lastReviewDate = this@with.lastReviewDate?.toElement(),
          effectivePeriod = this@with.effectivePeriod,
          author = this@with.author.takeUnless { it.all { it == null } },
          editor = this@with.editor.takeUnless { it.all { it == null } },
          reviewer = this@with.reviewer.takeUnless { it.all { it == null } },
          endorser = this@with.endorser.takeUnless { it.all { it == null } },
          relatedArtifact = this@with.relatedArtifact.takeUnless { it.all { it == null } },
          `actual` = this@with.`actual`?.value,
          _actual = this@with.`actual`?.toElement(),
          characteristic = this@with.characteristic.takeUnless { it.all { it == null } },
          handling = this@with.handling?.value?.getCode(),
          _handling = this@with.handling?.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
        )
      }
  }
}
