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
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.CarePlan
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
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
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CarePlanActivitySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var performedActivity: List<CodeableReference?>? = null,
  public var progress: List<Annotation?>? = null,
  public var plannedActivityReference: Reference? = null,
) {
  public fun toModel(): CarePlan.Activity =
    CarePlan.Activity().apply {
      id = this@CarePlanActivitySurrogate.id
      extension = this@CarePlanActivitySurrogate.extension
      modifierExtension = this@CarePlanActivitySurrogate.modifierExtension
      performedActivity = this@CarePlanActivitySurrogate.performedActivity
      progress = this@CarePlanActivitySurrogate.progress
      plannedActivityReference = this@CarePlanActivitySurrogate.plannedActivityReference
    }

  public companion object {
    public fun fromModel(model: CarePlan.Activity): CarePlanActivitySurrogate =
      with(model) {
        CarePlanActivitySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          performedActivity = this@with.performedActivity
          progress = this@with.progress
          plannedActivityReference = this@with.plannedActivityReference
        }
      }
  }
}

@Serializable
internal data class CarePlanSurrogate(
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
  public var instantiatesCanonical: List<KotlinString?>? = null,
  public var _instantiatesCanonical: List<Element?>? = null,
  public var instantiatesUri: List<KotlinString?>? = null,
  public var _instantiatesUri: List<Element?>? = null,
  public var basedOn: List<Reference?>? = null,
  public var replaces: List<Reference?>? = null,
  public var partOf: List<Reference?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var intent: KotlinString? = null,
  public var _intent: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var period: Period? = null,
  public var created: KotlinString? = null,
  public var _created: Element? = null,
  public var custodian: Reference? = null,
  public var contributor: List<Reference?>? = null,
  public var careTeam: List<Reference?>? = null,
  public var addresses: List<CodeableReference?>? = null,
  public var supportingInfo: List<Reference?>? = null,
  public var goal: List<Reference?>? = null,
  public var activity: List<CarePlan.Activity>? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): CarePlan =
    CarePlan().apply {
      id = this@CarePlanSurrogate.id
      meta = this@CarePlanSurrogate.meta
      implicitRules =
        Uri.of(this@CarePlanSurrogate.implicitRules, this@CarePlanSurrogate._implicitRules)
      language = Code.of(this@CarePlanSurrogate.language, this@CarePlanSurrogate._language)
      text = this@CarePlanSurrogate.text
      contained = this@CarePlanSurrogate.contained
      extension = this@CarePlanSurrogate.extension
      modifierExtension = this@CarePlanSurrogate.modifierExtension
      identifier = this@CarePlanSurrogate.identifier
      instantiatesCanonical =
        if (
          this@CarePlanSurrogate.instantiatesCanonical == null &&
            this@CarePlanSurrogate._instantiatesCanonical == null
        ) {
          null
        } else {
          (this@CarePlanSurrogate.instantiatesCanonical
              ?: List(this@CarePlanSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@CarePlanSurrogate._instantiatesCanonical
                ?: List(this@CarePlanSurrogate.instantiatesCanonical!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      instantiatesUri =
        if (
          this@CarePlanSurrogate.instantiatesUri == null &&
            this@CarePlanSurrogate._instantiatesUri == null
        ) {
          null
        } else {
          (this@CarePlanSurrogate.instantiatesUri
              ?: List(this@CarePlanSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@CarePlanSurrogate._instantiatesUri
                ?: List(this@CarePlanSurrogate.instantiatesUri!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      basedOn = this@CarePlanSurrogate.basedOn
      replaces = this@CarePlanSurrogate.replaces
      partOf = this@CarePlanSurrogate.partOf
      status =
        Enumeration.of(
          this@CarePlanSurrogate.status?.let {
            com.google.fhir.model.r5.CarePlan.CarePlanStatus.fromCode(it)
          },
          this@CarePlanSurrogate._status,
        )
      intent =
        Enumeration.of(
          this@CarePlanSurrogate.intent?.let {
            com.google.fhir.model.r5.CarePlan.CarePlanIntent.fromCode(it)
          },
          this@CarePlanSurrogate._intent,
        )
      category = this@CarePlanSurrogate.category
      title = R5String.of(this@CarePlanSurrogate.title, this@CarePlanSurrogate._title)
      description =
        R5String.of(this@CarePlanSurrogate.description, this@CarePlanSurrogate._description)
      subject = this@CarePlanSurrogate.subject
      encounter = this@CarePlanSurrogate.encounter
      period = this@CarePlanSurrogate.period
      created =
        DateTime.of(
          FhirDateTime.fromString(this@CarePlanSurrogate.created),
          this@CarePlanSurrogate._created,
        )
      custodian = this@CarePlanSurrogate.custodian
      contributor = this@CarePlanSurrogate.contributor
      careTeam = this@CarePlanSurrogate.careTeam
      addresses = this@CarePlanSurrogate.addresses
      supportingInfo = this@CarePlanSurrogate.supportingInfo
      goal = this@CarePlanSurrogate.goal
      activity = this@CarePlanSurrogate.activity
      note = this@CarePlanSurrogate.note
    }

  public companion object {
    public fun fromModel(model: CarePlan): CarePlanSurrogate =
      with(model) {
        CarePlanSurrogate().apply {
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
          instantiatesCanonical =
            this@with.instantiatesCanonical?.map { it?.value }?.takeUnless { it.all { it == null } }
          _instantiatesCanonical =
            this@with.instantiatesCanonical
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          instantiatesUri =
            this@with.instantiatesUri?.map { it?.value }?.takeUnless { it.all { it == null } }
          _instantiatesUri =
            this@with.instantiatesUri?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          basedOn = this@with.basedOn
          replaces = this@with.replaces
          partOf = this@with.partOf
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          intent = this@with.intent?.value?.getCode()
          _intent = this@with.intent?.toElement()
          category = this@with.category
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          subject = this@with.subject
          encounter = this@with.encounter
          period = this@with.period
          created = this@with.created?.value?.toString()
          _created = this@with.created?.toElement()
          custodian = this@with.custodian
          contributor = this@with.contributor
          careTeam = this@with.careTeam
          addresses = this@with.addresses
          supportingInfo = this@with.supportingInfo
          goal = this@with.goal
          activity = this@with.activity
          note = this@with.note
        }
      }
  }
}
