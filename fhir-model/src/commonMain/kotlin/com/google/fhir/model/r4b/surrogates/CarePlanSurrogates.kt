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
import com.google.fhir.model.r4b.CarePlan
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CarePlanActivityDetailSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var kind: KotlinString? = null,
  public var _kind: Element? = null,
  public var instantiatesCanonical: MutableList<KotlinString?>? = null,
  public var _instantiatesCanonical: MutableList<Element?>? = null,
  public var instantiatesUri: MutableList<KotlinString?>? = null,
  public var _instantiatesUri: MutableList<Element?>? = null,
  public var code: CodeableConcept? = null,
  public var reasonCode: MutableList<CodeableConcept>? = null,
  public var reasonReference: MutableList<Reference>? = null,
  public var goal: MutableList<Reference>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var statusReason: CodeableConcept? = null,
  public var doNotPerform: KotlinBoolean? = null,
  public var _doNotPerform: Element? = null,
  public var scheduledTiming: Timing? = null,
  public var scheduledPeriod: Period? = null,
  public var scheduledString: KotlinString? = null,
  public var _scheduledString: Element? = null,
  public var location: Reference? = null,
  public var performer: MutableList<Reference>? = null,
  public var productCodeableConcept: CodeableConcept? = null,
  public var productReference: Reference? = null,
  public var dailyAmount: Quantity? = null,
  public var quantity: Quantity? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
) {
  public fun toModel(): CarePlan.Activity.Detail =
    CarePlan.Activity.Detail(
      id = this@CarePlanActivityDetailSurrogate.id,
      extension = this@CarePlanActivityDetailSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CarePlanActivityDetailSurrogate.modifierExtension ?: mutableListOf(),
      kind =
        this@CarePlanActivityDetailSurrogate.kind?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.CarePlan.CarePlanActivityKind.fromCode(it!!),
            this@CarePlanActivityDetailSurrogate._kind,
          )
        },
      instantiatesCanonical =
        if (
          this@CarePlanActivityDetailSurrogate.instantiatesCanonical == null &&
            this@CarePlanActivityDetailSurrogate._instantiatesCanonical == null
        ) {
          mutableListOf()
        } else {
          (this@CarePlanActivityDetailSurrogate.instantiatesCanonical
              ?: List(this@CarePlanActivityDetailSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@CarePlanActivityDetailSurrogate._instantiatesCanonical
                ?: List(this@CarePlanActivityDetailSurrogate.instantiatesCanonical!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      instantiatesUri =
        if (
          this@CarePlanActivityDetailSurrogate.instantiatesUri == null &&
            this@CarePlanActivityDetailSurrogate._instantiatesUri == null
        ) {
          mutableListOf()
        } else {
          (this@CarePlanActivityDetailSurrogate.instantiatesUri
              ?: List(this@CarePlanActivityDetailSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@CarePlanActivityDetailSurrogate._instantiatesUri
                ?: List(this@CarePlanActivityDetailSurrogate.instantiatesUri!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      code = this@CarePlanActivityDetailSurrogate.code,
      reasonCode = this@CarePlanActivityDetailSurrogate.reasonCode ?: mutableListOf(),
      reasonReference = this@CarePlanActivityDetailSurrogate.reasonReference ?: mutableListOf(),
      goal = this@CarePlanActivityDetailSurrogate.goal ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.CarePlan.CarePlanActivityStatus.fromCode(
            this@CarePlanActivityDetailSurrogate.status!!
          ),
          this@CarePlanActivityDetailSurrogate._status,
        ),
      statusReason = this@CarePlanActivityDetailSurrogate.statusReason,
      doNotPerform =
        R4bBoolean.of(
          this@CarePlanActivityDetailSurrogate.doNotPerform,
          this@CarePlanActivityDetailSurrogate._doNotPerform,
        ),
      scheduled =
        CarePlan.Activity.Detail.Scheduled?.from(
          this@CarePlanActivityDetailSurrogate.scheduledTiming,
          this@CarePlanActivityDetailSurrogate.scheduledPeriod,
          R4bString.of(
            this@CarePlanActivityDetailSurrogate.scheduledString,
            this@CarePlanActivityDetailSurrogate._scheduledString,
          ),
        ),
      location = this@CarePlanActivityDetailSurrogate.location,
      performer = this@CarePlanActivityDetailSurrogate.performer ?: mutableListOf(),
      product =
        CarePlan.Activity.Detail.Product?.from(
          this@CarePlanActivityDetailSurrogate.productCodeableConcept,
          this@CarePlanActivityDetailSurrogate.productReference,
        ),
      dailyAmount = this@CarePlanActivityDetailSurrogate.dailyAmount,
      quantity = this@CarePlanActivityDetailSurrogate.quantity,
      description =
        R4bString.of(
          this@CarePlanActivityDetailSurrogate.description,
          this@CarePlanActivityDetailSurrogate._description,
        ),
    )

  public companion object {
    public fun fromModel(model: CarePlan.Activity.Detail): CarePlanActivityDetailSurrogate =
      with(model) {
        CarePlanActivityDetailSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          kind = this@with.kind?.value?.getCode(),
          _kind = this@with.kind?.toElement(),
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
          code = this@with.code,
          reasonCode = this@with.reasonCode.takeUnless { it.all { it == null } },
          reasonReference = this@with.reasonReference.takeUnless { it.all { it == null } },
          goal = this@with.goal.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          statusReason = this@with.statusReason,
          doNotPerform = this@with.doNotPerform?.value,
          _doNotPerform = this@with.doNotPerform?.toElement(),
          scheduledTiming = this@with.scheduled?.asTiming()?.value,
          scheduledPeriod = this@with.scheduled?.asPeriod()?.value,
          scheduledString = this@with.scheduled?.asString()?.value?.value,
          _scheduledString = this@with.scheduled?.asString()?.value?.toElement(),
          location = this@with.location,
          performer = this@with.performer.takeUnless { it.all { it == null } },
          productCodeableConcept = this@with.product?.asCodeableConcept()?.value,
          productReference = this@with.product?.asReference()?.value,
          dailyAmount = this@with.dailyAmount,
          quantity = this@with.quantity,
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CarePlanActivitySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var outcomeCodeableConcept: MutableList<CodeableConcept>? = null,
  public var outcomeReference: MutableList<Reference>? = null,
  public var progress: MutableList<Annotation>? = null,
  public var reference: Reference? = null,
  public var detail: CarePlan.Activity.Detail? = null,
) {
  public fun toModel(): CarePlan.Activity =
    CarePlan.Activity(
      id = this@CarePlanActivitySurrogate.id,
      extension = this@CarePlanActivitySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CarePlanActivitySurrogate.modifierExtension ?: mutableListOf(),
      outcomeCodeableConcept =
        this@CarePlanActivitySurrogate.outcomeCodeableConcept ?: mutableListOf(),
      outcomeReference = this@CarePlanActivitySurrogate.outcomeReference ?: mutableListOf(),
      progress = this@CarePlanActivitySurrogate.progress ?: mutableListOf(),
      reference = this@CarePlanActivitySurrogate.reference,
      detail = this@CarePlanActivitySurrogate.detail,
    )

  public companion object {
    public fun fromModel(model: CarePlan.Activity): CarePlanActivitySurrogate =
      with(model) {
        CarePlanActivitySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          outcomeCodeableConcept =
            this@with.outcomeCodeableConcept.takeUnless { it.all { it == null } },
          outcomeReference = this@with.outcomeReference.takeUnless { it.all { it == null } },
          progress = this@with.progress.takeUnless { it.all { it == null } },
          reference = this@with.reference,
          detail = this@with.detail,
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
  public var author: Reference? = null,
  public var contributor: MutableList<Reference>? = null,
  public var careTeam: MutableList<Reference>? = null,
  public var addresses: MutableList<Reference>? = null,
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
          com.google.fhir.model.r4b.CarePlan.CarePlanStatus.fromCode(
            this@CarePlanSurrogate.status!!
          ),
          this@CarePlanSurrogate._status,
        ),
      intent =
        Enumeration.of(
          com.google.fhir.model.r4b.CarePlan.CarePlanIntent.fromCode(
            this@CarePlanSurrogate.intent!!
          ),
          this@CarePlanSurrogate._intent,
        ),
      category = this@CarePlanSurrogate.category ?: mutableListOf(),
      title = R4bString.of(this@CarePlanSurrogate.title, this@CarePlanSurrogate._title),
      description =
        R4bString.of(this@CarePlanSurrogate.description, this@CarePlanSurrogate._description),
      subject = this@CarePlanSurrogate.subject,
      encounter = this@CarePlanSurrogate.encounter,
      period = this@CarePlanSurrogate.period,
      created =
        DateTime.of(
          FhirDateTime.fromString(this@CarePlanSurrogate.created),
          this@CarePlanSurrogate._created,
        ),
      author = this@CarePlanSurrogate.author,
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
          author = this@with.author,
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
