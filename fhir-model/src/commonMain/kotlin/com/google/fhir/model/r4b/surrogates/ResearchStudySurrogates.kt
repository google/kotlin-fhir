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
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.ContactDetail
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Markdown
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.RelatedArtifact
import com.google.fhir.model.r4b.ResearchStudy
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ResearchStudyArmSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var type: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
) {
  public fun toModel(): ResearchStudy.Arm =
    ResearchStudy.Arm(
      id = this@ResearchStudyArmSurrogate.id,
      extension = this@ResearchStudyArmSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ResearchStudyArmSurrogate.modifierExtension ?: mutableListOf(),
      name =
        R4bString.of(this@ResearchStudyArmSurrogate.name, this@ResearchStudyArmSurrogate._name)!!,
      type = this@ResearchStudyArmSurrogate.type,
      description =
        R4bString.of(
          this@ResearchStudyArmSurrogate.description,
          this@ResearchStudyArmSurrogate._description,
        ),
    )

  public companion object {
    public fun fromModel(model: ResearchStudy.Arm): ResearchStudyArmSurrogate =
      with(model) {
        ResearchStudyArmSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          type = this@with.type,
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ResearchStudyObjectiveSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var type: CodeableConcept? = null,
) {
  public fun toModel(): ResearchStudy.Objective =
    ResearchStudy.Objective(
      id = this@ResearchStudyObjectiveSurrogate.id,
      extension = this@ResearchStudyObjectiveSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ResearchStudyObjectiveSurrogate.modifierExtension ?: mutableListOf(),
      name =
        R4bString.of(
          this@ResearchStudyObjectiveSurrogate.name,
          this@ResearchStudyObjectiveSurrogate._name,
        ),
      type = this@ResearchStudyObjectiveSurrogate.type,
    )

  public companion object {
    public fun fromModel(model: ResearchStudy.Objective): ResearchStudyObjectiveSurrogate =
      with(model) {
        ResearchStudyObjectiveSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          type = this@with.type,
        )
      }
  }
}

@Serializable
internal data class ResearchStudySurrogate(
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
  public var identifier: MutableList<Identifier>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var protocol: MutableList<Reference>? = null,
  public var partOf: MutableList<Reference>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var primaryPurposeType: CodeableConcept? = null,
  public var phase: CodeableConcept? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var focus: MutableList<CodeableConcept>? = null,
  public var condition: MutableList<CodeableConcept>? = null,
  public var contact: MutableList<ContactDetail>? = null,
  public var relatedArtifact: MutableList<RelatedArtifact>? = null,
  public var keyword: MutableList<CodeableConcept>? = null,
  public var location: MutableList<CodeableConcept>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var enrollment: MutableList<Reference>? = null,
  public var period: Period? = null,
  public var sponsor: Reference? = null,
  public var principalInvestigator: Reference? = null,
  public var site: MutableList<Reference>? = null,
  public var reasonStopped: CodeableConcept? = null,
  public var note: MutableList<Annotation>? = null,
  public var arm: MutableList<ResearchStudy.Arm>? = null,
  public var objective: MutableList<ResearchStudy.Objective>? = null,
) {
  public fun toModel(): ResearchStudy =
    ResearchStudy(
      id = this@ResearchStudySurrogate.id,
      meta = this@ResearchStudySurrogate.meta,
      implicitRules =
        Uri.of(
          this@ResearchStudySurrogate.implicitRules,
          this@ResearchStudySurrogate._implicitRules,
        ),
      language =
        Code.of(this@ResearchStudySurrogate.language, this@ResearchStudySurrogate._language),
      text = this@ResearchStudySurrogate.text,
      contained = this@ResearchStudySurrogate.contained ?: mutableListOf(),
      extension = this@ResearchStudySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ResearchStudySurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ResearchStudySurrogate.identifier ?: mutableListOf(),
      title = R4bString.of(this@ResearchStudySurrogate.title, this@ResearchStudySurrogate._title),
      protocol = this@ResearchStudySurrogate.protocol ?: mutableListOf(),
      partOf = this@ResearchStudySurrogate.partOf ?: mutableListOf(),
      status =
        Enumeration.of(
          ResearchStudy.ResearchStudyStatus.fromCode(this@ResearchStudySurrogate.status!!),
          this@ResearchStudySurrogate._status,
        ),
      primaryPurposeType = this@ResearchStudySurrogate.primaryPurposeType,
      phase = this@ResearchStudySurrogate.phase,
      category = this@ResearchStudySurrogate.category ?: mutableListOf(),
      focus = this@ResearchStudySurrogate.focus ?: mutableListOf(),
      condition = this@ResearchStudySurrogate.condition ?: mutableListOf(),
      contact = this@ResearchStudySurrogate.contact ?: mutableListOf(),
      relatedArtifact = this@ResearchStudySurrogate.relatedArtifact ?: mutableListOf(),
      keyword = this@ResearchStudySurrogate.keyword ?: mutableListOf(),
      location = this@ResearchStudySurrogate.location ?: mutableListOf(),
      description =
        Markdown.of(
          this@ResearchStudySurrogate.description,
          this@ResearchStudySurrogate._description,
        ),
      enrollment = this@ResearchStudySurrogate.enrollment ?: mutableListOf(),
      period = this@ResearchStudySurrogate.period,
      sponsor = this@ResearchStudySurrogate.sponsor,
      principalInvestigator = this@ResearchStudySurrogate.principalInvestigator,
      site = this@ResearchStudySurrogate.site ?: mutableListOf(),
      reasonStopped = this@ResearchStudySurrogate.reasonStopped,
      note = this@ResearchStudySurrogate.note ?: mutableListOf(),
      arm = this@ResearchStudySurrogate.arm ?: mutableListOf(),
      objective = this@ResearchStudySurrogate.objective ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ResearchStudy): ResearchStudySurrogate =
      with(model) {
        ResearchStudySurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeIf { it.isNotEmpty() },
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          protocol = this@with.protocol.takeIf { it.isNotEmpty() },
          partOf = this@with.partOf.takeIf { it.isNotEmpty() },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          primaryPurposeType = this@with.primaryPurposeType,
          phase = this@with.phase,
          category = this@with.category.takeIf { it.isNotEmpty() },
          focus = this@with.focus.takeIf { it.isNotEmpty() },
          condition = this@with.condition.takeIf { it.isNotEmpty() },
          contact = this@with.contact.takeIf { it.isNotEmpty() },
          relatedArtifact = this@with.relatedArtifact.takeIf { it.isNotEmpty() },
          keyword = this@with.keyword.takeIf { it.isNotEmpty() },
          location = this@with.location.takeIf { it.isNotEmpty() },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          enrollment = this@with.enrollment.takeIf { it.isNotEmpty() },
          period = this@with.period,
          sponsor = this@with.sponsor,
          principalInvestigator = this@with.principalInvestigator,
          site = this@with.site.takeIf { it.isNotEmpty() },
          reasonStopped = this@with.reasonStopped,
          note = this@with.note.takeIf { it.isNotEmpty() },
          arm = this@with.arm.takeIf { it.isNotEmpty() },
          objective = this@with.objective.takeIf { it.isNotEmpty() },
        )
      }
  }
}
