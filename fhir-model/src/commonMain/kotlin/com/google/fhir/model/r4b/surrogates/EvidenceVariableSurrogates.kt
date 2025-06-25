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

import com.google.fhir.model.r4b.Annotation
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.ContactDetail
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.EvidenceVariable
import com.google.fhir.model.r4b.Expression
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Markdown
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Range
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.RelatedArtifact
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
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
internal data class EvidenceVariableCharacteristicTimeFromStartSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var quantity: Quantity? = null,
  public var range: Range? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): EvidenceVariable.Characteristic.TimeFromStart =
    EvidenceVariable.Characteristic.TimeFromStart().apply {
      id = this@EvidenceVariableCharacteristicTimeFromStartSurrogate.id
      extension = this@EvidenceVariableCharacteristicTimeFromStartSurrogate.extension
      modifierExtension =
        this@EvidenceVariableCharacteristicTimeFromStartSurrogate.modifierExtension
      description =
        R4bString.of(
          this@EvidenceVariableCharacteristicTimeFromStartSurrogate.description,
          this@EvidenceVariableCharacteristicTimeFromStartSurrogate._description,
        )
      quantity = this@EvidenceVariableCharacteristicTimeFromStartSurrogate.quantity
      range = this@EvidenceVariableCharacteristicTimeFromStartSurrogate.range
      note = this@EvidenceVariableCharacteristicTimeFromStartSurrogate.note
    }

  public companion object {
    public fun fromModel(
      model: EvidenceVariable.Characteristic.TimeFromStart
    ): EvidenceVariableCharacteristicTimeFromStartSurrogate =
      with(model) {
        EvidenceVariableCharacteristicTimeFromStartSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          quantity = this@with.quantity
          range = this@with.range
          note = this@with.note
        }
      }
  }
}

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
  public var method: CodeableConcept? = null,
  public var device: Reference? = null,
  public var exclude: KotlinBoolean? = null,
  public var _exclude: Element? = null,
  public var timeFromStart: EvidenceVariable.Characteristic.TimeFromStart? = null,
  public var groupMeasure: KotlinString? = null,
  public var _groupMeasure: Element? = null,
) {
  public fun toModel(): EvidenceVariable.Characteristic =
    EvidenceVariable.Characteristic().apply {
      id = this@EvidenceVariableCharacteristicSurrogate.id
      extension = this@EvidenceVariableCharacteristicSurrogate.extension
      modifierExtension = this@EvidenceVariableCharacteristicSurrogate.modifierExtension
      description =
        R4bString.of(
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
        )
      method = this@EvidenceVariableCharacteristicSurrogate.method
      device = this@EvidenceVariableCharacteristicSurrogate.device
      exclude =
        R4bBoolean.of(
          this@EvidenceVariableCharacteristicSurrogate.exclude,
          this@EvidenceVariableCharacteristicSurrogate._exclude,
        )
      timeFromStart = this@EvidenceVariableCharacteristicSurrogate.timeFromStart
      groupMeasure =
        Enumeration.of(
          this@EvidenceVariableCharacteristicSurrogate.groupMeasure?.let {
            com.google.fhir.model.r4b.EvidenceVariable.GroupMeasure.fromCode(it)
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
          method = this@with.method
          device = this@with.device
          exclude = this@with.exclude?.value
          _exclude = this@with.exclude?.toElement()
          timeFromStart = this@with.timeFromStart
          groupMeasure = this@with.groupMeasure?.value?.getCode()
          _groupMeasure = this@with.groupMeasure?.toElement()
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
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueRange: Range? = null,
) {
  public fun toModel(): EvidenceVariable.Category =
    EvidenceVariable.Category().apply {
      id = this@EvidenceVariableCategorySurrogate.id
      extension = this@EvidenceVariableCategorySurrogate.extension
      modifierExtension = this@EvidenceVariableCategorySurrogate.modifierExtension
      name =
        R4bString.of(
          this@EvidenceVariableCategorySurrogate.name,
          this@EvidenceVariableCategorySurrogate._name,
        )
      `value` =
        EvidenceVariable.Category.Value?.from(
          this@EvidenceVariableCategorySurrogate.valueCodeableConcept,
          this@EvidenceVariableCategorySurrogate.valueQuantity,
          this@EvidenceVariableCategorySurrogate.valueRange,
        )
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
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueRange = this@with.`value`?.asRange()?.value
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
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var note: List<Annotation?>? = null,
  public var useContext: List<UsageContext?>? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: List<ContactDetail?>? = null,
  public var author: List<ContactDetail?>? = null,
  public var editor: List<ContactDetail?>? = null,
  public var reviewer: List<ContactDetail?>? = null,
  public var endorser: List<ContactDetail?>? = null,
  public var relatedArtifact: List<RelatedArtifact?>? = null,
  public var `actual`: KotlinBoolean? = null,
  public var _actual: Element? = null,
  public var characteristicCombination: KotlinString? = null,
  public var _characteristicCombination: Element? = null,
  public var characteristic: List<EvidenceVariable.Characteristic>? = null,
  public var handling: KotlinString? = null,
  public var _handling: Element? = null,
  public var category: List<EvidenceVariable.Category>? = null,
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
        R4bString.of(
          this@EvidenceVariableSurrogate.version,
          this@EvidenceVariableSurrogate._version,
        )
      name = R4bString.of(this@EvidenceVariableSurrogate.name, this@EvidenceVariableSurrogate._name)
      title =
        R4bString.of(this@EvidenceVariableSurrogate.title, this@EvidenceVariableSurrogate._title)
      shortTitle =
        R4bString.of(
          this@EvidenceVariableSurrogate.shortTitle,
          this@EvidenceVariableSurrogate._shortTitle,
        )
      subtitle =
        R4bString.of(
          this@EvidenceVariableSurrogate.subtitle,
          this@EvidenceVariableSurrogate._subtitle,
        )
      status =
        Enumeration.of(
          this@EvidenceVariableSurrogate.status?.let {
            com.google.fhir.model.r4b.PublicationStatus.fromCode(it)
          },
          this@EvidenceVariableSurrogate._status,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@EvidenceVariableSurrogate.date),
          this@EvidenceVariableSurrogate._date,
        )
      description =
        Markdown.of(
          this@EvidenceVariableSurrogate.description,
          this@EvidenceVariableSurrogate._description,
        )
      note = this@EvidenceVariableSurrogate.note
      useContext = this@EvidenceVariableSurrogate.useContext
      publisher =
        R4bString.of(
          this@EvidenceVariableSurrogate.publisher,
          this@EvidenceVariableSurrogate._publisher,
        )
      contact = this@EvidenceVariableSurrogate.contact
      author = this@EvidenceVariableSurrogate.author
      editor = this@EvidenceVariableSurrogate.editor
      reviewer = this@EvidenceVariableSurrogate.reviewer
      endorser = this@EvidenceVariableSurrogate.endorser
      relatedArtifact = this@EvidenceVariableSurrogate.relatedArtifact
      `actual` =
        R4bBoolean.of(
          this@EvidenceVariableSurrogate.`actual`,
          this@EvidenceVariableSurrogate._actual,
        )
      characteristicCombination =
        Enumeration.of(
          this@EvidenceVariableSurrogate.characteristicCombination?.let {
            com.google.fhir.model.r4b.EvidenceVariable.CharacteristicCombination.fromCode(it)
          },
          this@EvidenceVariableSurrogate._characteristicCombination,
        )
      characteristic = this@EvidenceVariableSurrogate.characteristic
      handling =
        Enumeration.of(
          this@EvidenceVariableSurrogate.handling?.let {
            com.google.fhir.model.r4b.EvidenceVariable.EvidenceVariableHandling.fromCode(it)
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
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          note = this@with.note
          useContext = this@with.useContext
          publisher = this@with.publisher?.value
          _publisher = this@with.publisher?.toElement()
          contact = this@with.contact
          author = this@with.author
          editor = this@with.editor
          reviewer = this@with.reviewer
          endorser = this@with.endorser
          relatedArtifact = this@with.relatedArtifact
          `actual` = this@with.`actual`?.value
          _actual = this@with.`actual`?.toElement()
          characteristicCombination = this@with.characteristicCombination?.value?.getCode()
          _characteristicCombination = this@with.characteristicCombination?.toElement()
          characteristic = this@with.characteristic
          handling = this@with.handling?.value?.getCode()
          _handling = this@with.handling?.toElement()
          category = this@with.category
        }
      }
  }
}
