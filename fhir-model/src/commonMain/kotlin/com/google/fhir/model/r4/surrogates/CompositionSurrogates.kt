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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CompositionAttesterSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var time: KotlinString? = null,
  public var _time: Element? = null,
  public var party: Reference? = null,
) {
  public fun toModel(): Composition.Attester =
    Composition.Attester(
      id = this@CompositionAttesterSurrogate.id,
      extension = this@CompositionAttesterSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CompositionAttesterSurrogate.modifierExtension ?: mutableListOf(),
      mode =
        Enumeration.of(
          com.google.fhir.model.r4.Composition.CompositionAttestationMode.fromCode(
            this@CompositionAttesterSurrogate.mode!!
          ),
          this@CompositionAttesterSurrogate._mode,
        ),
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
          mode = this@with.mode.value?.getCode(),
          _mode = this@with.mode.toElement(),
          time = this@with.time?.value?.toString(),
          _time = this@with.time?.toElement(),
          party = this@with.party,
        )
      }
  }
}

@Serializable
internal data class CompositionRelatesToTargetSurrogate(
  public var targetIdentifier: Identifier? = null,
  public var targetReference: Reference? = null,
) {
  public fun toModel(): Composition.RelatesTo.Target =
    Composition.RelatesTo.Target.from(
      this@CompositionRelatesToTargetSurrogate.targetIdentifier,
      this@CompositionRelatesToTargetSurrogate.targetReference,
    )!!

  public companion object {
    public fun fromModel(model: Composition.RelatesTo.Target): CompositionRelatesToTargetSurrogate =
      with(model) {
        CompositionRelatesToTargetSurrogate(
          targetIdentifier = this@with.asIdentifier()?.value,
          targetReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class CompositionRelatesToSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var target: Composition.RelatesTo.Target,
) {
  public fun toModel(): Composition.RelatesTo =
    Composition.RelatesTo(
      id = this@CompositionRelatesToSurrogate.id,
      extension = this@CompositionRelatesToSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CompositionRelatesToSurrogate.modifierExtension ?: mutableListOf(),
      code =
        Enumeration.of(
          com.google.fhir.model.r4.Composition.DocumentRelationshipType.fromCode(
            this@CompositionRelatesToSurrogate.code!!
          ),
          this@CompositionRelatesToSurrogate._code,
        ),
      target = this@CompositionRelatesToSurrogate.target,
    )

  public companion object {
    public fun fromModel(model: Composition.RelatesTo): CompositionRelatesToSurrogate =
      with(model) {
        CompositionRelatesToSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value?.getCode(),
          _code = this@with.code.toElement(),
          target = this@with.target,
        )
      }
  }
}

@Serializable
internal data class CompositionEventSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: MutableList<CodeableConcept>? = null,
  public var period: Period? = null,
  public var detail: MutableList<Reference>? = null,
) {
  public fun toModel(): Composition.Event =
    Composition.Event(
      id = this@CompositionEventSurrogate.id,
      extension = this@CompositionEventSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CompositionEventSurrogate.modifierExtension ?: mutableListOf(),
      code = this@CompositionEventSurrogate.code ?: mutableListOf(),
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
          code = this@with.code.takeUnless { it.all { it == null } },
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
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
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
        R4String.of(
          this@CompositionSectionSurrogate.title,
          this@CompositionSectionSurrogate._title,
        ),
      code = this@CompositionSectionSurrogate.code,
      author = this@CompositionSectionSurrogate.author ?: mutableListOf(),
      focus = this@CompositionSectionSurrogate.focus,
      text = this@CompositionSectionSurrogate.text,
      mode =
        this@CompositionSectionSurrogate.mode?.let {
          Enumeration.of(
            com.google.fhir.model.r4.Composition.SectionMode.fromCode(it!!),
            this@CompositionSectionSurrogate._mode,
          )
        },
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
          mode = this@with.mode?.value?.getCode(),
          _mode = this@with.mode?.toElement(),
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
  public var identifier: Identifier? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var type: CodeableConcept,
  public var category: MutableList<CodeableConcept>? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var author: MutableList<Reference>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var confidentiality: KotlinString? = null,
  public var _confidentiality: Element? = null,
  public var attester: MutableList<Composition.Attester>? = null,
  public var custodian: Reference? = null,
  public var relatesTo: MutableList<Composition.RelatesTo>? = null,
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
      identifier = this@CompositionSurrogate.identifier,
      status =
        Enumeration.of(
          com.google.fhir.model.r4.Composition.CompositionStatus.fromCode(
            this@CompositionSurrogate.status!!
          ),
          this@CompositionSurrogate._status,
        ),
      type = this@CompositionSurrogate.type,
      category = this@CompositionSurrogate.category ?: mutableListOf(),
      subject = this@CompositionSurrogate.subject,
      encounter = this@CompositionSurrogate.encounter,
      date =
        DateTime.of(
          FhirDateTime.fromString(this@CompositionSurrogate.date),
          this@CompositionSurrogate._date,
        )!!,
      author = this@CompositionSurrogate.author ?: mutableListOf(),
      title = R4String.of(this@CompositionSurrogate.title, this@CompositionSurrogate._title)!!,
      confidentiality =
        this@CompositionSurrogate.confidentiality?.let {
          Enumeration.of(
            com.google.fhir.model.r4.Composition.DocumentConfidentiality.fromCode(it!!),
            this@CompositionSurrogate._confidentiality,
          )
        },
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
          identifier = this@with.identifier,
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          type = this@with.type,
          category = this@with.category.takeUnless { it.all { it == null } },
          subject = this@with.subject,
          encounter = this@with.encounter,
          date = this@with.date.value?.toString(),
          _date = this@with.date.toElement(),
          author = this@with.author.takeUnless { it.all { it == null } },
          title = this@with.title.value,
          _title = this@with.title.toElement(),
          confidentiality = this@with.confidentiality?.value?.getCode(),
          _confidentiality = this@with.confidentiality?.toElement(),
          attester = this@with.attester.takeUnless { it.all { it == null } },
          custodian = this@with.custodian,
          relatesTo = this@with.relatesTo.takeUnless { it.all { it == null } },
          event = this@with.event.takeUnless { it.all { it == null } },
          section = this@with.section.takeUnless { it.all { it == null } },
        )
      }
  }
}
