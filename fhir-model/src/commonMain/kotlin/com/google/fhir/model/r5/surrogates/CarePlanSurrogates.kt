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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CarePlanActivitySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var performedActivity: MutableList<CodeableReference>? = null,
  public var progress: MutableList<Annotation>? = null,
  public var plannedActivityReference: Reference? = null,
) {
  public fun toModel(): CarePlan.Activity =
    CarePlan.Activity(
      id = this@CarePlanActivitySurrogate.id,
      extension = this@CarePlanActivitySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CarePlanActivitySurrogate.modifierExtension ?: mutableListOf(),
      performedActivity = this@CarePlanActivitySurrogate.performedActivity ?: mutableListOf(),
      progress = this@CarePlanActivitySurrogate.progress ?: mutableListOf(),
      plannedActivityReference = this@CarePlanActivitySurrogate.plannedActivityReference,
    )

  public companion object {
    public fun fromModel(model: CarePlan.Activity): CarePlanActivitySurrogate =
      with(model) {
        CarePlanActivitySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          performedActivity = this@with.performedActivity.takeUnless { it.all { it == null } },
          progress = this@with.progress.takeUnless { it.all { it == null } },
          plannedActivityReference = this@with.plannedActivityReference,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var instantiatesCanonical: MutableList<KotlinString?>? = null,
  public var _instantiatesCanonical: MutableList<Element?>? = null,
  public var instantiatesUri: MutableList<KotlinString?>? = null,
  public var _instantiatesUri: MutableList<Element?>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var replaces: MutableList<Reference>? = null,
  public var partOf: MutableList<Reference>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var intent: KotlinString? = null,
  public var _intent: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var subject: Reference,
  public var encounter: Reference? = null,
  public var period: Period? = null,
  public var created: KotlinString? = null,
  public var _created: Element? = null,
  public var custodian: Reference? = null,
  public var contributor: MutableList<Reference>? = null,
  public var careTeam: MutableList<Reference>? = null,
  public var addresses: MutableList<CodeableReference>? = null,
  public var supportingInfo: MutableList<Reference>? = null,
  public var goal: MutableList<Reference>? = null,
  public var activity: MutableList<CarePlan.Activity>? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): CarePlan =
    CarePlan(
      id = this@CarePlanSurrogate.id,
      meta = this@CarePlanSurrogate.meta,
      implicitRules =
        Uri.of(this@CarePlanSurrogate.implicitRules, this@CarePlanSurrogate._implicitRules),
      language = Code.of(this@CarePlanSurrogate.language, this@CarePlanSurrogate._language),
      text = this@CarePlanSurrogate.text,
      contained = this@CarePlanSurrogate.contained ?: mutableListOf(),
      extension = this@CarePlanSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CarePlanSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@CarePlanSurrogate.identifier ?: mutableListOf(),
      instantiatesCanonical =
        if (
          this@CarePlanSurrogate.instantiatesCanonical == null &&
            this@CarePlanSurrogate._instantiatesCanonical == null
        ) {
          mutableListOf()
        } else {
          (this@CarePlanSurrogate.instantiatesCanonical
              ?: List(this@CarePlanSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@CarePlanSurrogate._instantiatesCanonical
                ?: List(this@CarePlanSurrogate.instantiatesCanonical!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      instantiatesUri =
        if (
          this@CarePlanSurrogate.instantiatesUri == null &&
            this@CarePlanSurrogate._instantiatesUri == null
        ) {
          mutableListOf()
        } else {
          (this@CarePlanSurrogate.instantiatesUri
              ?: List(this@CarePlanSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@CarePlanSurrogate._instantiatesUri
                ?: List(this@CarePlanSurrogate.instantiatesUri!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      basedOn = this@CarePlanSurrogate.basedOn ?: mutableListOf(),
      replaces = this@CarePlanSurrogate.replaces ?: mutableListOf(),
      partOf = this@CarePlanSurrogate.partOf ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.CarePlan.RequestStatus.fromCode(this@CarePlanSurrogate.status!!),
          this@CarePlanSurrogate._status,
        ),
      intent =
        Enumeration.of(
          com.google.fhir.model.r5.CarePlan.CarePlanIntent.fromCode(
            this@CarePlanSurrogate.intent!!
          ),
          this@CarePlanSurrogate._intent,
        ),
      category = this@CarePlanSurrogate.category ?: mutableListOf(),
      title = R5String.of(this@CarePlanSurrogate.title, this@CarePlanSurrogate._title),
      description =
        R5String.of(this@CarePlanSurrogate.description, this@CarePlanSurrogate._description),
      subject = this@CarePlanSurrogate.subject,
      encounter = this@CarePlanSurrogate.encounter,
      period = this@CarePlanSurrogate.period,
      created =
        DateTime.of(
          FhirDateTime.fromString(this@CarePlanSurrogate.created),
          this@CarePlanSurrogate._created,
        ),
      custodian = this@CarePlanSurrogate.custodian,
      contributor = this@CarePlanSurrogate.contributor ?: mutableListOf(),
      careTeam = this@CarePlanSurrogate.careTeam ?: mutableListOf(),
      addresses = this@CarePlanSurrogate.addresses ?: mutableListOf(),
      supportingInfo = this@CarePlanSurrogate.supportingInfo ?: mutableListOf(),
      goal = this@CarePlanSurrogate.goal ?: mutableListOf(),
      activity = this@CarePlanSurrogate.activity ?: mutableListOf(),
      note = this@CarePlanSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: CarePlan): CarePlanSurrogate =
      with(model) {
        CarePlanSurrogate(
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
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          instantiatesCanonical =
            this@with.instantiatesCanonical
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiatesCanonical =
            this@with.instantiatesCanonical
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          instantiatesUri =
            this@with.instantiatesUri
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _instantiatesUri =
            this@with.instantiatesUri
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          replaces = this@with.replaces.takeUnless { it.all { it == null } },
          partOf = this@with.partOf.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          intent = this@with.intent.value?.getCode(),
          _intent = this@with.intent.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          subject = this@with.subject,
          encounter = this@with.encounter,
          period = this@with.period,
          created = this@with.created?.value?.toString(),
          _created = this@with.created?.toElement(),
          custodian = this@with.custodian,
          contributor = this@with.contributor.takeUnless { it.all { it == null } },
          careTeam = this@with.careTeam.takeUnless { it.all { it == null } },
          addresses = this@with.addresses.takeUnless { it.all { it == null } },
          supportingInfo = this@with.supportingInfo.takeUnless { it.all { it == null } },
          goal = this@with.goal.takeUnless { it.all { it == null } },
          activity = this@with.activity.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}
