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
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal class EvidenceVariableCharacteristicDefinitionByTypeAndValueValueSurrogate {
  public var valueCodeableConcept: CodeableConcept? = null

  public var valueBoolean: KotlinBoolean? = null

  public var _valueBoolean: Element? = null

  public var valueQuantity: Quantity? = null

  public var valueRange: Range? = null

  public var valueReference: Reference? = null

  public var valueId: KotlinString? = null

  public var _valueId: Element? = null

  public fun toModel(): EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value =
    EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value?.from(
      this@EvidenceVariableCharacteristicDefinitionByTypeAndValueValueSurrogate
        .valueCodeableConcept,
      R5Boolean.of(
        this@EvidenceVariableCharacteristicDefinitionByTypeAndValueValueSurrogate.valueBoolean,
        this@EvidenceVariableCharacteristicDefinitionByTypeAndValueValueSurrogate._valueBoolean,
      ),
      this@EvidenceVariableCharacteristicDefinitionByTypeAndValueValueSurrogate.valueQuantity,
      this@EvidenceVariableCharacteristicDefinitionByTypeAndValueValueSurrogate.valueRange,
      this@EvidenceVariableCharacteristicDefinitionByTypeAndValueValueSurrogate.valueReference,
      Id.of(
        this@EvidenceVariableCharacteristicDefinitionByTypeAndValueValueSurrogate.valueId,
        this@EvidenceVariableCharacteristicDefinitionByTypeAndValueValueSurrogate._valueId,
      ),
    ) ?: EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value.Null

  public companion object {
    public fun fromModel(
      model: EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value
    ): EvidenceVariableCharacteristicDefinitionByTypeAndValueValueSurrogate =
      with(model) {
        EvidenceVariableCharacteristicDefinitionByTypeAndValueValueSurrogate().apply {
          valueCodeableConcept = this@with.asCodeableConcept()?.value
          valueBoolean = this@with.asBoolean()?.value?.value
          _valueBoolean = this@with.asBoolean()?.value?.toElement()
          valueQuantity = this@with.asQuantity()?.value
          valueRange = this@with.asRange()?.value
          valueReference = this@with.asReference()?.value
          valueId = this@with.asId()?.value?.value
          _valueId = this@with.asId()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var method: List<CodeableConcept?>? = null,
  public var device: Reference? = null,
  public var offset: CodeableConcept? = null,
  public var `value`: EvidenceVariable.Characteristic.DefinitionByTypeAndValue.Value? = null,
) {
  public fun toModel(): EvidenceVariable.Characteristic.DefinitionByTypeAndValue =
    EvidenceVariable.Characteristic.DefinitionByTypeAndValue().apply {
      id = this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.id
      extension = this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.extension
      modifierExtension =
        this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.modifierExtension
      type = this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.type
      method = this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.method
      device = this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.device
      `value` = this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.`value`
      offset = this@EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate.offset
    }

  public companion object {
    public fun fromModel(
      model: EvidenceVariable.Characteristic.DefinitionByTypeAndValue
    ): EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate =
      with(model) {
        EvidenceVariableCharacteristicDefinitionByTypeAndValueSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          method = this@with.method
          device = this@with.device
          `value` = this@with.`value`
          offset = this@with.offset
        }
      }
  }
}

@Serializable
internal data class EvidenceVariableCharacteristicDefinitionByCombinationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var threshold: Int? = null,
  public var _threshold: Element? = null,
  public var characteristic: List<EvidenceVariable.Characteristic?>? = null,
) {
  public fun toModel(): EvidenceVariable.Characteristic.DefinitionByCombination =
    EvidenceVariable.Characteristic.DefinitionByCombination().apply {
      id = this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate.id
      extension = this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate.extension
      modifierExtension =
        this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate.modifierExtension
      code =
        Enumeration.of(
          this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate.code?.let {
            com.google.fhir.model.r5.EvidenceVariable.CharacteristicCombination.fromCode(it)
          },
          this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate._code,
        )
      threshold =
        PositiveInt.of(
          this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate.threshold,
          this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate._threshold,
        )
      characteristic =
        this@EvidenceVariableCharacteristicDefinitionByCombinationSurrogate.characteristic
    }

  public companion object {
    public fun fromModel(
      model: EvidenceVariable.Characteristic.DefinitionByCombination
    ): EvidenceVariableCharacteristicDefinitionByCombinationSurrogate =
      with(model) {
        EvidenceVariableCharacteristicDefinitionByCombinationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code?.value?.getCode()
          _code = this@with.code?.toElement()
          threshold = this@with.threshold?.value
          _threshold = this@with.threshold?.toElement()
          characteristic = this@with.characteristic
        }
      }
  }
}

@Serializable
internal class EvidenceVariableCharacteristicTimeFromEventEventSurrogate {
  public var eventCodeableConcept: CodeableConcept? = null

  public var eventReference: Reference? = null

  public var eventDateTime: KotlinString? = null

  public var _eventDateTime: Element? = null

  public var eventId: KotlinString? = null

  public var _eventId: Element? = null

  public fun toModel(): EvidenceVariable.Characteristic.TimeFromEvent.Event =
    EvidenceVariable.Characteristic.TimeFromEvent.Event?.from(
      this@EvidenceVariableCharacteristicTimeFromEventEventSurrogate.eventCodeableConcept,
      this@EvidenceVariableCharacteristicTimeFromEventEventSurrogate.eventReference,
      DateTime.of(
        FhirDateTime.fromString(
          this@EvidenceVariableCharacteristicTimeFromEventEventSurrogate.eventDateTime
        ),
        this@EvidenceVariableCharacteristicTimeFromEventEventSurrogate._eventDateTime,
      ),
      Id.of(
        this@EvidenceVariableCharacteristicTimeFromEventEventSurrogate.eventId,
        this@EvidenceVariableCharacteristicTimeFromEventEventSurrogate._eventId,
      ),
    ) ?: EvidenceVariable.Characteristic.TimeFromEvent.Event.Null

  public companion object {
    public fun fromModel(
      model: EvidenceVariable.Characteristic.TimeFromEvent.Event
    ): EvidenceVariableCharacteristicTimeFromEventEventSurrogate =
      with(model) {
        EvidenceVariableCharacteristicTimeFromEventEventSurrogate().apply {
          eventCodeableConcept = this@with.asCodeableConcept()?.value
          eventReference = this@with.asReference()?.value
          eventDateTime = this@with.asDateTime()?.value?.value?.toString()
          _eventDateTime = this@with.asDateTime()?.value?.toElement()
          eventId = this@with.asId()?.value?.value
          _eventId = this@with.asId()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class EvidenceVariableCharacteristicTimeFromEventSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var note: List<Annotation?>? = null,
  public var quantity: Quantity? = null,
  public var range: Range? = null,
  public var event: EvidenceVariable.Characteristic.TimeFromEvent.Event? = null,
) {
  public fun toModel(): EvidenceVariable.Characteristic.TimeFromEvent =
    EvidenceVariable.Characteristic.TimeFromEvent().apply {
      id = this@EvidenceVariableCharacteristicTimeFromEventSurrogate.id
      extension = this@EvidenceVariableCharacteristicTimeFromEventSurrogate.extension
      modifierExtension =
        this@EvidenceVariableCharacteristicTimeFromEventSurrogate.modifierExtension
      description =
        Markdown.of(
          this@EvidenceVariableCharacteristicTimeFromEventSurrogate.description,
          this@EvidenceVariableCharacteristicTimeFromEventSurrogate._description,
        )
      note = this@EvidenceVariableCharacteristicTimeFromEventSurrogate.note
      event = this@EvidenceVariableCharacteristicTimeFromEventSurrogate.event
      quantity = this@EvidenceVariableCharacteristicTimeFromEventSurrogate.quantity
      range = this@EvidenceVariableCharacteristicTimeFromEventSurrogate.range
    }

  public companion object {
    public fun fromModel(
      model: EvidenceVariable.Characteristic.TimeFromEvent
    ): EvidenceVariableCharacteristicTimeFromEventSurrogate =
      with(model) {
        EvidenceVariableCharacteristicTimeFromEventSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          note = this@with.note
          event = this@with.event
          quantity = this@with.quantity
          range = this@with.range
        }
      }
  }
}

@Serializable
internal class EvidenceVariableCharacteristicInstancesSurrogate {
  public var instancesQuantity: Quantity? = null

  public var instancesRange: Range? = null

  public fun toModel(): EvidenceVariable.Characteristic.Instances =
    EvidenceVariable.Characteristic.Instances?.from(
      this@EvidenceVariableCharacteristicInstancesSurrogate.instancesQuantity,
      this@EvidenceVariableCharacteristicInstancesSurrogate.instancesRange,
    ) ?: EvidenceVariable.Characteristic.Instances.Null

  public companion object {
    public fun fromModel(
      model: EvidenceVariable.Characteristic.Instances
    ): EvidenceVariableCharacteristicInstancesSurrogate =
      with(model) {
        EvidenceVariableCharacteristicInstancesSurrogate().apply {
          instancesQuantity = this@with.asQuantity()?.value
          instancesRange = this@with.asRange()?.value
        }
      }
  }
}

@Serializable
internal class EvidenceVariableCharacteristicDurationSurrogate {
  public var durationQuantity: Quantity? = null

  public var durationRange: Range? = null

  public fun toModel(): EvidenceVariable.Characteristic.Duration =
    EvidenceVariable.Characteristic.Duration?.from(
      this@EvidenceVariableCharacteristicDurationSurrogate.durationQuantity,
      this@EvidenceVariableCharacteristicDurationSurrogate.durationRange,
    ) ?: EvidenceVariable.Characteristic.Duration.Null

  public companion object {
    public fun fromModel(
      model: EvidenceVariable.Characteristic.Duration
    ): EvidenceVariableCharacteristicDurationSurrogate =
      with(model) {
        EvidenceVariableCharacteristicDurationSurrogate().apply {
          durationQuantity = this@with.asQuantity()?.value
          durationRange = this@with.asRange()?.value
        }
      }
  }
}

@Serializable
internal data class EvidenceVariableCharacteristicSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var linkId: KotlinString? = null,
  public var _linkId: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var note: List<Annotation?>? = null,
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
  public var timeFromEvent: List<EvidenceVariable.Characteristic.TimeFromEvent>? = null,
  public var instances: EvidenceVariable.Characteristic.Instances? = null,
  public var duration: EvidenceVariable.Characteristic.Duration? = null,
) {
  public fun toModel(): EvidenceVariable.Characteristic =
    EvidenceVariable.Characteristic().apply {
      id = this@EvidenceVariableCharacteristicSurrogate.id
      extension = this@EvidenceVariableCharacteristicSurrogate.extension
      modifierExtension = this@EvidenceVariableCharacteristicSurrogate.modifierExtension
      linkId =
        Id.of(
          this@EvidenceVariableCharacteristicSurrogate.linkId,
          this@EvidenceVariableCharacteristicSurrogate._linkId,
        )
      description =
        Markdown.of(
          this@EvidenceVariableCharacteristicSurrogate.description,
          this@EvidenceVariableCharacteristicSurrogate._description,
        )
      note = this@EvidenceVariableCharacteristicSurrogate.note
      exclude =
        R5Boolean.of(
          this@EvidenceVariableCharacteristicSurrogate.exclude,
          this@EvidenceVariableCharacteristicSurrogate._exclude,
        )
      definitionReference = this@EvidenceVariableCharacteristicSurrogate.definitionReference
      definitionCanonical =
        Canonical.of(
          this@EvidenceVariableCharacteristicSurrogate.definitionCanonical,
          this@EvidenceVariableCharacteristicSurrogate._definitionCanonical,
        )
      definitionCodeableConcept =
        this@EvidenceVariableCharacteristicSurrogate.definitionCodeableConcept
      definitionExpression = this@EvidenceVariableCharacteristicSurrogate.definitionExpression
      definitionId =
        Id.of(
          this@EvidenceVariableCharacteristicSurrogate.definitionId,
          this@EvidenceVariableCharacteristicSurrogate._definitionId,
        )
      definitionByTypeAndValue =
        this@EvidenceVariableCharacteristicSurrogate.definitionByTypeAndValue
      definitionByCombination = this@EvidenceVariableCharacteristicSurrogate.definitionByCombination
      instances = this@EvidenceVariableCharacteristicSurrogate.instances
      duration = this@EvidenceVariableCharacteristicSurrogate.duration
      timeFromEvent = this@EvidenceVariableCharacteristicSurrogate.timeFromEvent
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
          linkId = this@with.linkId?.value
          _linkId = this@with.linkId?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          note = this@with.note
          exclude = this@with.exclude?.value
          _exclude = this@with.exclude?.toElement()
          definitionReference = this@with.definitionReference
          definitionCanonical = this@with.definitionCanonical?.value
          _definitionCanonical = this@with.definitionCanonical?.toElement()
          definitionCodeableConcept = this@with.definitionCodeableConcept
          definitionExpression = this@with.definitionExpression
          definitionId = this@with.definitionId?.value
          _definitionId = this@with.definitionId?.toElement()
          definitionByTypeAndValue = this@with.definitionByTypeAndValue
          definitionByCombination = this@with.definitionByCombination
          instances = this@with.instances
          duration = this@with.duration
          timeFromEvent = this@with.timeFromEvent
        }
      }
  }
}

@Serializable
internal class EvidenceVariableCategoryValueSurrogate {
  public var valueCodeableConcept: CodeableConcept? = null

  public var valueQuantity: Quantity? = null

  public var valueRange: Range? = null

  public fun toModel(): EvidenceVariable.Category.Value =
    EvidenceVariable.Category.Value?.from(
      this@EvidenceVariableCategoryValueSurrogate.valueCodeableConcept,
      this@EvidenceVariableCategoryValueSurrogate.valueQuantity,
      this@EvidenceVariableCategoryValueSurrogate.valueRange,
    ) ?: EvidenceVariable.Category.Value.Null

  public companion object {
    public fun fromModel(
      model: EvidenceVariable.Category.Value
    ): EvidenceVariableCategoryValueSurrogate =
      with(model) {
        EvidenceVariableCategoryValueSurrogate().apply {
          valueCodeableConcept = this@with.asCodeableConcept()?.value
          valueQuantity = this@with.asQuantity()?.value
          valueRange = this@with.asRange()?.value
        }
      }
  }
}

@Serializable
internal data class EvidenceVariableCategorySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var `value`: EvidenceVariable.Category.Value? = null,
) {
  public fun toModel(): EvidenceVariable.Category =
    EvidenceVariable.Category().apply {
      id = this@EvidenceVariableCategorySurrogate.id
      extension = this@EvidenceVariableCategorySurrogate.extension
      modifierExtension = this@EvidenceVariableCategorySurrogate.modifierExtension
      name =
        R5String.of(
          this@EvidenceVariableCategorySurrogate.name,
          this@EvidenceVariableCategorySurrogate._name,
        )
      `value` = this@EvidenceVariableCategorySurrogate.`value`
    }

  public companion object {
    public fun fromModel(model: EvidenceVariable.Category): EvidenceVariableCategorySurrogate =
      with(model) {
        EvidenceVariableCategorySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          `value` = this@with.`value`
        }
      }
  }
}

@Serializable
internal class EvidenceVariableVersionAlgorithmSurrogate {
  public var versionAlgorithmString: KotlinString? = null

  public var _versionAlgorithmString: Element? = null

  public var versionAlgorithmCoding: Coding? = null

  public fun toModel(): EvidenceVariable.VersionAlgorithm =
    EvidenceVariable.VersionAlgorithm?.from(
      R5String.of(
        this@EvidenceVariableVersionAlgorithmSurrogate.versionAlgorithmString,
        this@EvidenceVariableVersionAlgorithmSurrogate._versionAlgorithmString,
      ),
      this@EvidenceVariableVersionAlgorithmSurrogate.versionAlgorithmCoding,
    ) ?: EvidenceVariable.VersionAlgorithm.Null

  public companion object {
    public fun fromModel(
      model: EvidenceVariable.VersionAlgorithm
    ): EvidenceVariableVersionAlgorithmSurrogate =
      with(model) {
        EvidenceVariableVersionAlgorithmSurrogate().apply {
          versionAlgorithmString = this@with.asString()?.value?.value
          _versionAlgorithmString = this@with.asString()?.value?.toElement()
          versionAlgorithmCoding = this@with.asCoding()?.value
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
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: List<ContactDetail?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var note: List<Annotation?>? = null,
  public var useContext: List<UsageContext?>? = null,
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
  public var author: List<ContactDetail?>? = null,
  public var editor: List<ContactDetail?>? = null,
  public var reviewer: List<ContactDetail?>? = null,
  public var endorser: List<ContactDetail?>? = null,
  public var relatedArtifact: List<RelatedArtifact?>? = null,
  public var `actual`: KotlinBoolean? = null,
  public var _actual: Element? = null,
  public var characteristic: List<EvidenceVariable.Characteristic>? = null,
  public var handling: KotlinString? = null,
  public var _handling: Element? = null,
  public var category: List<EvidenceVariable.Category>? = null,
  public var versionAlgorithm: EvidenceVariable.VersionAlgorithm? = null,
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
        R5String.of(this@EvidenceVariableSurrogate.version, this@EvidenceVariableSurrogate._version)
      versionAlgorithm = this@EvidenceVariableSurrogate.versionAlgorithm
      name = R5String.of(this@EvidenceVariableSurrogate.name, this@EvidenceVariableSurrogate._name)
      title =
        R5String.of(this@EvidenceVariableSurrogate.title, this@EvidenceVariableSurrogate._title)
      shortTitle =
        R5String.of(
          this@EvidenceVariableSurrogate.shortTitle,
          this@EvidenceVariableSurrogate._shortTitle,
        )
      status =
        Enumeration.of(
          this@EvidenceVariableSurrogate.status?.let {
            com.google.fhir.model.r5.PublicationStatus.fromCode(it)
          },
          this@EvidenceVariableSurrogate._status,
        )
      experimental =
        R5Boolean.of(
          this@EvidenceVariableSurrogate.experimental,
          this@EvidenceVariableSurrogate._experimental,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@EvidenceVariableSurrogate.date),
          this@EvidenceVariableSurrogate._date,
        )
      publisher =
        R5String.of(
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
      purpose =
        Markdown.of(this@EvidenceVariableSurrogate.purpose, this@EvidenceVariableSurrogate._purpose)
      copyright =
        Markdown.of(
          this@EvidenceVariableSurrogate.copyright,
          this@EvidenceVariableSurrogate._copyright,
        )
      copyrightLabel =
        R5String.of(
          this@EvidenceVariableSurrogate.copyrightLabel,
          this@EvidenceVariableSurrogate._copyrightLabel,
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
      author = this@EvidenceVariableSurrogate.author
      editor = this@EvidenceVariableSurrogate.editor
      reviewer = this@EvidenceVariableSurrogate.reviewer
      endorser = this@EvidenceVariableSurrogate.endorser
      relatedArtifact = this@EvidenceVariableSurrogate.relatedArtifact
      `actual` =
        R5Boolean.of(
          this@EvidenceVariableSurrogate.`actual`,
          this@EvidenceVariableSurrogate._actual,
        )
      characteristic = this@EvidenceVariableSurrogate.characteristic
      handling =
        Enumeration.of(
          this@EvidenceVariableSurrogate.handling?.let {
            com.google.fhir.model.r5.EvidenceVariable.EvidenceVariableHandling.fromCode(it)
          },
          this@EvidenceVariableSurrogate._handling,
        )
      category = this@EvidenceVariableSurrogate.category
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
          versionAlgorithm = this@with.versionAlgorithm
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          shortTitle = this@with.shortTitle?.value
          _shortTitle = this@with.shortTitle?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          experimental = this@with.experimental?.value
          _experimental = this@with.experimental?.toElement()
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          publisher = this@with.publisher?.value
          _publisher = this@with.publisher?.toElement()
          contact = this@with.contact
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          note = this@with.note
          useContext = this@with.useContext
          purpose = this@with.purpose?.value
          _purpose = this@with.purpose?.toElement()
          copyright = this@with.copyright?.value
          _copyright = this@with.copyright?.toElement()
          copyrightLabel = this@with.copyrightLabel?.value
          _copyrightLabel = this@with.copyrightLabel?.toElement()
          approvalDate = this@with.approvalDate?.value?.toString()
          _approvalDate = this@with.approvalDate?.toElement()
          lastReviewDate = this@with.lastReviewDate?.value?.toString()
          _lastReviewDate = this@with.lastReviewDate?.toElement()
          effectivePeriod = this@with.effectivePeriod
          author = this@with.author
          editor = this@with.editor
          reviewer = this@with.reviewer
          endorser = this@with.endorser
          relatedArtifact = this@with.relatedArtifact
          `actual` = this@with.`actual`?.value
          _actual = this@with.`actual`?.toElement()
          characteristic = this@with.characteristic
          handling = this@with.handling?.value?.getCode()
          _handling = this@with.handling?.toElement()
          category = this@with.category
        }
      }
  }
}
