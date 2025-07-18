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
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Composition
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CompositionAttesterSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var mode: CodeableConcept,
  public var time: KotlinString? = null,
  public var _time: Element? = null,
  public var party: Reference? = null,
) {
  public fun toModel(): Composition.Attester =
    Composition.Attester(
      id = this@CompositionAttesterSurrogate.id,
      extension = this@CompositionAttesterSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CompositionAttesterSurrogate.modifierExtension ?: mutableListOf(),
      mode = this@CompositionAttesterSurrogate.mode,
      time =
        DateTime.of(
          FhirDateTime.fromString(this@CompositionAttesterSurrogate.time),
          this@CompositionAttesterSurrogate._time,
        ),
      party = this@CompositionAttesterSurrogate.party,
    )

  public companion object {
    public fun fromModel(model: Composition.Attester): CompositionAttesterSurrogate =
      with(model) {
        CompositionAttesterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          mode = this@with.mode,
          time = this@with.time?.value?.toString(),
          _time = this@with.time?.toElement(),
          party = this@with.party,
        )
      }
  }
}

@Serializable
internal data class CompositionEventSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var period: Period? = null,
  public var detail: MutableList<CodeableReference>? = null,
) {
  public fun toModel(): Composition.Event =
    Composition.Event(
      id = this@CompositionEventSurrogate.id,
      extension = this@CompositionEventSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CompositionEventSurrogate.modifierExtension ?: mutableListOf(),
      period = this@CompositionEventSurrogate.period,
      detail = this@CompositionEventSurrogate.detail ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Composition.Event): CompositionEventSurrogate =
      with(model) {
        CompositionEventSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          period = this@with.period,
          detail = this@with.detail.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class CompositionSectionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var code: CodeableConcept? = null,
  public var author: MutableList<Reference>? = null,
  public var focus: Reference? = null,
  public var text: Narrative? = null,
  public var orderedBy: CodeableConcept? = null,
  public var entry: MutableList<Reference>? = null,
  public var emptyReason: CodeableConcept? = null,
  public var section: MutableList<Composition.Section>? = null,
) {
  public fun toModel(): Composition.Section =
    Composition.Section(
      id = this@CompositionSectionSurrogate.id,
      extension = this@CompositionSectionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CompositionSectionSurrogate.modifierExtension ?: mutableListOf(),
      title =
        R5String.of(
          this@CompositionSectionSurrogate.title,
          this@CompositionSectionSurrogate._title,
        ),
      code = this@CompositionSectionSurrogate.code,
      author = this@CompositionSectionSurrogate.author ?: mutableListOf(),
      focus = this@CompositionSectionSurrogate.focus,
      text = this@CompositionSectionSurrogate.text,
      orderedBy = this@CompositionSectionSurrogate.orderedBy,
      entry = this@CompositionSectionSurrogate.entry ?: mutableListOf(),
      emptyReason = this@CompositionSectionSurrogate.emptyReason,
      section = this@CompositionSectionSurrogate.section ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Composition.Section): CompositionSectionSurrogate =
      with(model) {
        CompositionSectionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          code = this@with.code,
          author = this@with.author.takeUnless { it.all { it == null } },
          focus = this@with.focus,
          text = this@with.text,
          orderedBy = this@with.orderedBy,
          entry = this@with.entry.takeUnless { it.all { it == null } },
          emptyReason = this@with.emptyReason,
          section = this@with.section.takeUnless { it.all { it == null } },
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var type: CodeableConcept,
  public var category: MutableList<CodeableConcept>? = null,
  public var subject: MutableList<Reference>? = null,
  public var encounter: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var useContext: MutableList<UsageContext>? = null,
  public var author: MutableList<Reference>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var note: MutableList<Annotation>? = null,
  public var attester: MutableList<Composition.Attester>? = null,
  public var custodian: Reference? = null,
  public var relatesTo: MutableList<RelatedArtifact>? = null,
  public var event: MutableList<Composition.Event>? = null,
  public var section: MutableList<Composition.Section>? = null,
) {
  public fun toModel(): Composition =
    Composition(
      id = this@CompositionSurrogate.id,
      meta = this@CompositionSurrogate.meta,
      implicitRules =
        Uri.of(this@CompositionSurrogate.implicitRules, this@CompositionSurrogate._implicitRules),
      language = Code.of(this@CompositionSurrogate.language, this@CompositionSurrogate._language),
      text = this@CompositionSurrogate.text,
      contained = this@CompositionSurrogate.contained ?: mutableListOf(),
      extension = this@CompositionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CompositionSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@CompositionSurrogate.url, this@CompositionSurrogate._url),
      identifier = this@CompositionSurrogate.identifier ?: mutableListOf(),
      version = R5String.of(this@CompositionSurrogate.version, this@CompositionSurrogate._version),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.Composition.CompositionStatus.fromCode(
            this@CompositionSurrogate.status!!
          ),
          this@CompositionSurrogate._status,
        ),
      type = this@CompositionSurrogate.type,
      category = this@CompositionSurrogate.category ?: mutableListOf(),
      subject = this@CompositionSurrogate.subject ?: mutableListOf(),
      encounter = this@CompositionSurrogate.encounter,
      date =
        DateTime.of(
          FhirDateTime.fromString(this@CompositionSurrogate.date),
          this@CompositionSurrogate._date,
        )!!,
      useContext = this@CompositionSurrogate.useContext ?: mutableListOf(),
      author = this@CompositionSurrogate.author ?: mutableListOf(),
      name = R5String.of(this@CompositionSurrogate.name, this@CompositionSurrogate._name),
      title = R5String.of(this@CompositionSurrogate.title, this@CompositionSurrogate._title)!!,
      note = this@CompositionSurrogate.note ?: mutableListOf(),
      attester = this@CompositionSurrogate.attester ?: mutableListOf(),
      custodian = this@CompositionSurrogate.custodian,
      relatesTo = this@CompositionSurrogate.relatesTo ?: mutableListOf(),
      event = this@CompositionSurrogate.event ?: mutableListOf(),
      section = this@CompositionSurrogate.section ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Composition): CompositionSurrogate =
      with(model) {
        CompositionSurrogate(
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
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          type = this@with.type,
          category = this@with.category.takeUnless { it.all { it == null } },
          subject = this@with.subject.takeUnless { it.all { it == null } },
          encounter = this@with.encounter,
          date = this@with.date.value?.toString(),
          _date = this@with.date.toElement(),
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          author = this@with.author.takeUnless { it.all { it == null } },
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title.value,
          _title = this@with.title.toElement(),
          note = this@with.note.takeUnless { it.all { it == null } },
          attester = this@with.attester.takeUnless { it.all { it == null } },
          custodian = this@with.custodian,
          relatesTo = this@with.relatesTo.takeUnless { it.all { it == null } },
          event = this@with.event.takeUnless { it.all { it == null } },
          section = this@with.section.takeUnless { it.all { it == null } },
        )
      }
  }
}
