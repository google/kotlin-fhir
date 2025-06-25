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

import com.google.fhir.model.r4.Annotation
import com.google.fhir.model.r4.ClinicalImpression
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
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
internal data class ClinicalImpressionInvestigationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: CodeableConcept? = null,
  public var item: List<Reference?>? = null,
) {
  public fun toModel(): ClinicalImpression.Investigation =
    ClinicalImpression.Investigation().apply {
      id = this@ClinicalImpressionInvestigationSurrogate.id
      extension = this@ClinicalImpressionInvestigationSurrogate.extension
      modifierExtension = this@ClinicalImpressionInvestigationSurrogate.modifierExtension
      code = this@ClinicalImpressionInvestigationSurrogate.code
      item = this@ClinicalImpressionInvestigationSurrogate.item
    }

  public companion object {
    public fun fromModel(
      model: ClinicalImpression.Investigation
    ): ClinicalImpressionInvestigationSurrogate =
      with(model) {
        ClinicalImpressionInvestigationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          item = this@with.item
        }
      }
  }
}

@Serializable
internal data class ClinicalImpressionFindingSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var itemCodeableConcept: CodeableConcept? = null,
  public var itemReference: Reference? = null,
  public var basis: KotlinString? = null,
  public var _basis: Element? = null,
) {
  public fun toModel(): ClinicalImpression.Finding =
    ClinicalImpression.Finding().apply {
      id = this@ClinicalImpressionFindingSurrogate.id
      extension = this@ClinicalImpressionFindingSurrogate.extension
      modifierExtension = this@ClinicalImpressionFindingSurrogate.modifierExtension
      itemCodeableConcept = this@ClinicalImpressionFindingSurrogate.itemCodeableConcept
      itemReference = this@ClinicalImpressionFindingSurrogate.itemReference
      basis =
        R4String.of(
          this@ClinicalImpressionFindingSurrogate.basis,
          this@ClinicalImpressionFindingSurrogate._basis,
        )
    }

  public companion object {
    public fun fromModel(model: ClinicalImpression.Finding): ClinicalImpressionFindingSurrogate =
      with(model) {
        ClinicalImpressionFindingSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          itemCodeableConcept = this@with.itemCodeableConcept
          itemReference = this@with.itemReference
          basis = this@with.basis?.value
          _basis = this@with.basis?.toElement()
        }
      }
  }
}

@Serializable
internal data class ClinicalImpressionSurrogate(
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
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var code: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var effectiveDateTime: KotlinString? = null,
  public var _effectiveDateTime: Element? = null,
  public var effectivePeriod: Period? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var assessor: Reference? = null,
  public var previous: Reference? = null,
  public var problem: List<Reference?>? = null,
  public var investigation: List<ClinicalImpression.Investigation>? = null,
  public var protocol: List<KotlinString?>? = null,
  public var _protocol: List<Element?>? = null,
  public var summary: KotlinString? = null,
  public var _summary: Element? = null,
  public var finding: List<ClinicalImpression.Finding>? = null,
  public var prognosisCodeableConcept: List<CodeableConcept?>? = null,
  public var prognosisReference: List<Reference?>? = null,
  public var supportingInfo: List<Reference?>? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): ClinicalImpression =
    ClinicalImpression().apply {
      id = this@ClinicalImpressionSurrogate.id
      meta = this@ClinicalImpressionSurrogate.meta
      implicitRules =
        Uri.of(
          this@ClinicalImpressionSurrogate.implicitRules,
          this@ClinicalImpressionSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@ClinicalImpressionSurrogate.language,
          this@ClinicalImpressionSurrogate._language,
        )
      text = this@ClinicalImpressionSurrogate.text
      contained = this@ClinicalImpressionSurrogate.contained
      extension = this@ClinicalImpressionSurrogate.extension
      modifierExtension = this@ClinicalImpressionSurrogate.modifierExtension
      identifier = this@ClinicalImpressionSurrogate.identifier
      status =
        Enumeration.of(
          this@ClinicalImpressionSurrogate.status?.let {
            com.google.fhir.model.r4.ClinicalImpression.ClinicalImpressionStatus.fromCode(it)
          },
          this@ClinicalImpressionSurrogate._status,
        )
      statusReason = this@ClinicalImpressionSurrogate.statusReason
      code = this@ClinicalImpressionSurrogate.code
      description =
        R4String.of(
          this@ClinicalImpressionSurrogate.description,
          this@ClinicalImpressionSurrogate._description,
        )
      subject = this@ClinicalImpressionSurrogate.subject
      encounter = this@ClinicalImpressionSurrogate.encounter
      effective =
        ClinicalImpression.Effective?.from(
          DateTime.of(
            FhirDateTime.fromString(this@ClinicalImpressionSurrogate.effectiveDateTime),
            this@ClinicalImpressionSurrogate._effectiveDateTime,
          ),
          this@ClinicalImpressionSurrogate.effectivePeriod,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ClinicalImpressionSurrogate.date),
          this@ClinicalImpressionSurrogate._date,
        )
      assessor = this@ClinicalImpressionSurrogate.assessor
      previous = this@ClinicalImpressionSurrogate.previous
      problem = this@ClinicalImpressionSurrogate.problem
      investigation = this@ClinicalImpressionSurrogate.investigation
      protocol =
        if (
          this@ClinicalImpressionSurrogate.protocol == null &&
            this@ClinicalImpressionSurrogate._protocol == null
        ) {
          null
        } else {
          (this@ClinicalImpressionSurrogate.protocol
              ?: List(this@ClinicalImpressionSurrogate._protocol!!.size) { null })
            .zip(
              this@ClinicalImpressionSurrogate._protocol
                ?: List(this@ClinicalImpressionSurrogate.protocol!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      summary =
        R4String.of(
          this@ClinicalImpressionSurrogate.summary,
          this@ClinicalImpressionSurrogate._summary,
        )
      finding = this@ClinicalImpressionSurrogate.finding
      prognosisCodeableConcept = this@ClinicalImpressionSurrogate.prognosisCodeableConcept
      prognosisReference = this@ClinicalImpressionSurrogate.prognosisReference
      supportingInfo = this@ClinicalImpressionSurrogate.supportingInfo
      note = this@ClinicalImpressionSurrogate.note
    }

  public companion object {
    public fun fromModel(model: ClinicalImpression): ClinicalImpressionSurrogate =
      with(model) {
        ClinicalImpressionSurrogate().apply {
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
          statusReason = this@with.statusReason
          code = this@with.code
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          subject = this@with.subject
          encounter = this@with.encounter
          effectiveDateTime = this@with.effective?.asDateTime()?.value?.value?.toString()
          _effectiveDateTime = this@with.effective?.asDateTime()?.value?.toElement()
          effectivePeriod = this@with.effective?.asPeriod()?.value
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          assessor = this@with.assessor
          previous = this@with.previous
          problem = this@with.problem
          investigation = this@with.investigation
          protocol = this@with.protocol?.map { it?.value }?.takeUnless { it.all { it == null } }
          _protocol =
            this@with.protocol?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          summary = this@with.summary?.value
          _summary = this@with.summary?.toElement()
          finding = this@with.finding
          prognosisCodeableConcept = this@with.prognosisCodeableConcept
          prognosisReference = this@with.prognosisReference
          supportingInfo = this@with.supportingInfo
          note = this@with.note
        }
      }
  }
}
