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

import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Composition
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CompositionAttesterSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var time: KotlinString? = null,
  public var _time: Element? = null,
  public var party: Reference? = null,
) {
  public fun toModel(): Composition.Attester =
    Composition.Attester().apply {
      id = this@CompositionAttesterSurrogate.id
      extension = this@CompositionAttesterSurrogate.extension
      modifierExtension = this@CompositionAttesterSurrogate.modifierExtension
      mode =
        Enumeration.of(
          this@CompositionAttesterSurrogate.mode?.let {
            com.google.fhir.model.r4.Composition.CompositionAttestationMode.fromCode(it)
          },
          this@CompositionAttesterSurrogate._mode,
        )
      time =
        DateTime.of(
          FhirDateTime.fromString(this@CompositionAttesterSurrogate.time),
          this@CompositionAttesterSurrogate._time,
        )
      party = this@CompositionAttesterSurrogate.party
    }

  public companion object {
    public fun fromModel(model: Composition.Attester): CompositionAttesterSurrogate =
      with(model) {
        CompositionAttesterSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          mode = this@with.mode?.value?.getCode()
          _mode = this@with.mode?.toElement()
          time = this@with.time?.value?.toString()
          _time = this@with.time?.toElement()
          party = this@with.party
        }
      }
  }
}

@Serializable
internal data class CompositionRelatesToSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var targetIdentifier: Identifier? = null,
  public var targetReference: Reference? = null,
) {
  public fun toModel(): Composition.RelatesTo =
    Composition.RelatesTo().apply {
      id = this@CompositionRelatesToSurrogate.id
      extension = this@CompositionRelatesToSurrogate.extension
      modifierExtension = this@CompositionRelatesToSurrogate.modifierExtension
      code =
        Enumeration.of(
          this@CompositionRelatesToSurrogate.code?.let {
            com.google.fhir.model.r4.Composition.DocumentRelationshipType.fromCode(it)
          },
          this@CompositionRelatesToSurrogate._code,
        )
      target =
        Composition.RelatesTo.Target?.from(
          this@CompositionRelatesToSurrogate.targetIdentifier,
          this@CompositionRelatesToSurrogate.targetReference,
        )
    }

  public companion object {
    public fun fromModel(model: Composition.RelatesTo): CompositionRelatesToSurrogate =
      with(model) {
        CompositionRelatesToSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code?.value?.getCode()
          _code = this@with.code?.toElement()
          targetIdentifier = this@with.target?.asIdentifier()?.value
          targetReference = this@with.target?.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class CompositionEventSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: List<CodeableConcept?>? = null,
  public var period: Period? = null,
  public var detail: List<Reference?>? = null,
) {
  public fun toModel(): Composition.Event =
    Composition.Event().apply {
      id = this@CompositionEventSurrogate.id
      extension = this@CompositionEventSurrogate.extension
      modifierExtension = this@CompositionEventSurrogate.modifierExtension
      code = this@CompositionEventSurrogate.code
      period = this@CompositionEventSurrogate.period
      detail = this@CompositionEventSurrogate.detail
    }

  public companion object {
    public fun fromModel(model: Composition.Event): CompositionEventSurrogate =
      with(model) {
        CompositionEventSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          period = this@with.period
          detail = this@with.detail
        }
      }
  }
}

@Serializable
internal data class CompositionSectionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var code: CodeableConcept? = null,
  public var author: List<Reference?>? = null,
  public var focus: Reference? = null,
  public var text: Narrative? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var orderedBy: CodeableConcept? = null,
  public var entry: List<Reference?>? = null,
  public var emptyReason: CodeableConcept? = null,
  public var section: List<Composition.Section?>? = null,
) {
  public fun toModel(): Composition.Section =
    Composition.Section().apply {
      id = this@CompositionSectionSurrogate.id
      extension = this@CompositionSectionSurrogate.extension
      modifierExtension = this@CompositionSectionSurrogate.modifierExtension
      title =
        R4String.of(this@CompositionSectionSurrogate.title, this@CompositionSectionSurrogate._title)
      code = this@CompositionSectionSurrogate.code
      author = this@CompositionSectionSurrogate.author
      focus = this@CompositionSectionSurrogate.focus
      text = this@CompositionSectionSurrogate.text
      mode =
        Enumeration.of(
          this@CompositionSectionSurrogate.mode?.let {
            com.google.fhir.model.r4.Composition.SectionMode.fromCode(it)
          },
          this@CompositionSectionSurrogate._mode,
        )
      orderedBy = this@CompositionSectionSurrogate.orderedBy
      entry = this@CompositionSectionSurrogate.entry
      emptyReason = this@CompositionSectionSurrogate.emptyReason
      section = this@CompositionSectionSurrogate.section
    }

  public companion object {
    public fun fromModel(model: Composition.Section): CompositionSectionSurrogate =
      with(model) {
        CompositionSectionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          code = this@with.code
          author = this@with.author
          focus = this@with.focus
          text = this@with.text
          mode = this@with.mode?.value?.getCode()
          _mode = this@with.mode?.toElement()
          orderedBy = this@with.orderedBy
          entry = this@with.entry
          emptyReason = this@with.emptyReason
          section = this@with.section
        }
      }
  }
}

@Serializable
internal data class CompositionSurrogate(
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
  public var identifier: Identifier? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var type: CodeableConcept? = null,
  public var category: List<CodeableConcept?>? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var author: List<Reference?>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var confidentiality: KotlinString? = null,
  public var _confidentiality: Element? = null,
  public var attester: List<Composition.Attester>? = null,
  public var custodian: Reference? = null,
  public var relatesTo: List<Composition.RelatesTo>? = null,
  public var event: List<Composition.Event>? = null,
  public var section: List<Composition.Section>? = null,
) {
  public fun toModel(): Composition =
    Composition().apply {
      id = this@CompositionSurrogate.id
      meta = this@CompositionSurrogate.meta
      implicitRules =
        Uri.of(this@CompositionSurrogate.implicitRules, this@CompositionSurrogate._implicitRules)
      language = Code.of(this@CompositionSurrogate.language, this@CompositionSurrogate._language)
      text = this@CompositionSurrogate.text
      contained = this@CompositionSurrogate.contained
      extension = this@CompositionSurrogate.extension
      modifierExtension = this@CompositionSurrogate.modifierExtension
      identifier = this@CompositionSurrogate.identifier
      status =
        Enumeration.of(
          this@CompositionSurrogate.status?.let {
            com.google.fhir.model.r4.Composition.CompositionStatus.fromCode(it)
          },
          this@CompositionSurrogate._status,
        )
      type = this@CompositionSurrogate.type
      category = this@CompositionSurrogate.category
      subject = this@CompositionSurrogate.subject
      encounter = this@CompositionSurrogate.encounter
      date =
        DateTime.of(
          FhirDateTime.fromString(this@CompositionSurrogate.date),
          this@CompositionSurrogate._date,
        )
      author = this@CompositionSurrogate.author
      title = R4String.of(this@CompositionSurrogate.title, this@CompositionSurrogate._title)
      confidentiality =
        Enumeration.of(
          this@CompositionSurrogate.confidentiality?.let {
            com.google.fhir.model.r4.Composition.DocumentConfidentiality.fromCode(it)
          },
          this@CompositionSurrogate._confidentiality,
        )
      attester = this@CompositionSurrogate.attester
      custodian = this@CompositionSurrogate.custodian
      relatesTo = this@CompositionSurrogate.relatesTo
      event = this@CompositionSurrogate.event
      section = this@CompositionSurrogate.section
    }

  public companion object {
    public fun fromModel(model: Composition): CompositionSurrogate =
      with(model) {
        CompositionSurrogate().apply {
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
          identifier = this@with.identifier
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          type = this@with.type
          category = this@with.category
          subject = this@with.subject
          encounter = this@with.encounter
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          author = this@with.author
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          confidentiality = this@with.confidentiality?.value?.getCode()
          _confidentiality = this@with.confidentiality?.toElement()
          attester = this@with.attester
          custodian = this@with.custodian
          relatesTo = this@with.relatesTo
          event = this@with.event
          section = this@with.section
        }
      }
  }
}
