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
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ResearchStudyArmSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var type: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
) {
  public fun toModel(): ResearchStudy.Arm =
    ResearchStudy.Arm().apply {
      id = this@ResearchStudyArmSurrogate.id
      extension = this@ResearchStudyArmSurrogate.extension
      modifierExtension = this@ResearchStudyArmSurrogate.modifierExtension
      name = R4bString.of(this@ResearchStudyArmSurrogate.name, this@ResearchStudyArmSurrogate._name)
      type = this@ResearchStudyArmSurrogate.type
      description =
        R4bString.of(
          this@ResearchStudyArmSurrogate.description,
          this@ResearchStudyArmSurrogate._description,
        )
    }

  public companion object {
    public fun fromModel(model: ResearchStudy.Arm): ResearchStudyArmSurrogate =
      with(model) {
        ResearchStudyArmSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          type = this@with.type
          description = this@with.description?.value
          _description = this@with.description?.toElement()
        }
      }
  }
}

@Serializable
internal data class ResearchStudyObjectiveSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var type: CodeableConcept? = null,
) {
  public fun toModel(): ResearchStudy.Objective =
    ResearchStudy.Objective().apply {
      id = this@ResearchStudyObjectiveSurrogate.id
      extension = this@ResearchStudyObjectiveSurrogate.extension
      modifierExtension = this@ResearchStudyObjectiveSurrogate.modifierExtension
      name =
        R4bString.of(
          this@ResearchStudyObjectiveSurrogate.name,
          this@ResearchStudyObjectiveSurrogate._name,
        )
      type = this@ResearchStudyObjectiveSurrogate.type
    }

  public companion object {
    public fun fromModel(model: ResearchStudy.Objective): ResearchStudyObjectiveSurrogate =
      with(model) {
        ResearchStudyObjectiveSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          type = this@with.type
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var protocol: List<Reference?>? = null,
  public var partOf: List<Reference?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var primaryPurposeType: CodeableConcept? = null,
  public var phase: CodeableConcept? = null,
  public var category: List<CodeableConcept?>? = null,
  public var focus: List<CodeableConcept?>? = null,
  public var condition: List<CodeableConcept?>? = null,
  public var contact: List<ContactDetail?>? = null,
  public var relatedArtifact: List<RelatedArtifact?>? = null,
  public var keyword: List<CodeableConcept?>? = null,
  public var location: List<CodeableConcept?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var enrollment: List<Reference?>? = null,
  public var period: Period? = null,
  public var sponsor: Reference? = null,
  public var principalInvestigator: Reference? = null,
  public var site: List<Reference?>? = null,
  public var reasonStopped: CodeableConcept? = null,
  public var note: List<Annotation?>? = null,
  public var arm: List<ResearchStudy.Arm>? = null,
  public var objective: List<ResearchStudy.Objective>? = null,
) {
  public fun toModel(): ResearchStudy =
    ResearchStudy().apply {
      id = this@ResearchStudySurrogate.id
      meta = this@ResearchStudySurrogate.meta
      implicitRules =
        Uri.of(
          this@ResearchStudySurrogate.implicitRules,
          this@ResearchStudySurrogate._implicitRules,
        )
      language =
        Code.of(this@ResearchStudySurrogate.language, this@ResearchStudySurrogate._language)
      text = this@ResearchStudySurrogate.text
      contained = this@ResearchStudySurrogate.contained
      extension = this@ResearchStudySurrogate.extension
      modifierExtension = this@ResearchStudySurrogate.modifierExtension
      identifier = this@ResearchStudySurrogate.identifier
      title = R4bString.of(this@ResearchStudySurrogate.title, this@ResearchStudySurrogate._title)
      protocol = this@ResearchStudySurrogate.protocol
      partOf = this@ResearchStudySurrogate.partOf
      status =
        Enumeration.of(
          this@ResearchStudySurrogate.status?.let {
            com.google.fhir.model.r4b.ResearchStudy.ResearchStudyStatus.fromCode(it)
          },
          this@ResearchStudySurrogate._status,
        )
      primaryPurposeType = this@ResearchStudySurrogate.primaryPurposeType
      phase = this@ResearchStudySurrogate.phase
      category = this@ResearchStudySurrogate.category
      focus = this@ResearchStudySurrogate.focus
      condition = this@ResearchStudySurrogate.condition
      contact = this@ResearchStudySurrogate.contact
      relatedArtifact = this@ResearchStudySurrogate.relatedArtifact
      keyword = this@ResearchStudySurrogate.keyword
      location = this@ResearchStudySurrogate.location
      description =
        Markdown.of(
          this@ResearchStudySurrogate.description,
          this@ResearchStudySurrogate._description,
        )
      enrollment = this@ResearchStudySurrogate.enrollment
      period = this@ResearchStudySurrogate.period
      sponsor = this@ResearchStudySurrogate.sponsor
      principalInvestigator = this@ResearchStudySurrogate.principalInvestigator
      site = this@ResearchStudySurrogate.site
      reasonStopped = this@ResearchStudySurrogate.reasonStopped
      note = this@ResearchStudySurrogate.note
      arm = this@ResearchStudySurrogate.arm
      objective = this@ResearchStudySurrogate.objective
    }

  public companion object {
    public fun fromModel(model: ResearchStudy): ResearchStudySurrogate =
      with(model) {
        ResearchStudySurrogate().apply {
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
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          protocol = this@with.protocol
          partOf = this@with.partOf
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          primaryPurposeType = this@with.primaryPurposeType
          phase = this@with.phase
          category = this@with.category
          focus = this@with.focus
          condition = this@with.condition
          contact = this@with.contact
          relatedArtifact = this@with.relatedArtifact
          keyword = this@with.keyword
          location = this@with.location
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          enrollment = this@with.enrollment
          period = this@with.period
          sponsor = this@with.sponsor
          principalInvestigator = this@with.principalInvestigator
          site = this@with.site
          reasonStopped = this@with.reasonStopped
          note = this@with.note
          arm = this@with.arm
          objective = this@with.objective
        }
      }
  }
}
