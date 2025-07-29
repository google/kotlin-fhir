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
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
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
import com.google.fhir.model.r5.NutritionIntake
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Timing
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class NutritionIntakeConsumedItemSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var nutritionProduct: CodeableReference,
  public var schedule: Timing? = null,
  public var amount: Quantity? = null,
  public var rate: Quantity? = null,
  public var notConsumed: KotlinBoolean? = null,
  public var _notConsumed: Element? = null,
  public var notConsumedReason: CodeableConcept? = null,
) {
  public fun toModel(): NutritionIntake.ConsumedItem =
    NutritionIntake.ConsumedItem(
      id = this@NutritionIntakeConsumedItemSurrogate.id,
      extension = this@NutritionIntakeConsumedItemSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@NutritionIntakeConsumedItemSurrogate.modifierExtension ?: mutableListOf(),
      type = this@NutritionIntakeConsumedItemSurrogate.type,
      nutritionProduct = this@NutritionIntakeConsumedItemSurrogate.nutritionProduct,
      schedule = this@NutritionIntakeConsumedItemSurrogate.schedule,
      amount = this@NutritionIntakeConsumedItemSurrogate.amount,
      rate = this@NutritionIntakeConsumedItemSurrogate.rate,
      notConsumed =
        R5Boolean.of(
          this@NutritionIntakeConsumedItemSurrogate.notConsumed,
          this@NutritionIntakeConsumedItemSurrogate._notConsumed,
        ),
      notConsumedReason = this@NutritionIntakeConsumedItemSurrogate.notConsumedReason,
    )

  public companion object {
    public fun fromModel(
      model: NutritionIntake.ConsumedItem
    ): NutritionIntakeConsumedItemSurrogate =
      with(model) {
        NutritionIntakeConsumedItemSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          nutritionProduct = this@with.nutritionProduct,
          schedule = this@with.schedule,
          amount = this@with.amount,
          rate = this@with.rate,
          notConsumed = this@with.notConsumed?.value,
          _notConsumed = this@with.notConsumed?.toElement(),
          notConsumedReason = this@with.notConsumedReason,
        )
      }
  }
}

@Serializable
internal data class NutritionIntakeIngredientLabelSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var nutrient: CodeableReference,
  public var amount: Quantity,
) {
  public fun toModel(): NutritionIntake.IngredientLabel =
    NutritionIntake.IngredientLabel(
      id = this@NutritionIntakeIngredientLabelSurrogate.id,
      extension = this@NutritionIntakeIngredientLabelSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@NutritionIntakeIngredientLabelSurrogate.modifierExtension ?: mutableListOf(),
      nutrient = this@NutritionIntakeIngredientLabelSurrogate.nutrient,
      amount = this@NutritionIntakeIngredientLabelSurrogate.amount,
    )

  public companion object {
    public fun fromModel(
      model: NutritionIntake.IngredientLabel
    ): NutritionIntakeIngredientLabelSurrogate =
      with(model) {
        NutritionIntakeIngredientLabelSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          nutrient = this@with.nutrient,
          amount = this@with.amount,
        )
      }
  }
}

@Serializable
internal data class NutritionIntakePerformerSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference,
) {
  public fun toModel(): NutritionIntake.Performer =
    NutritionIntake.Performer(
      id = this@NutritionIntakePerformerSurrogate.id,
      extension = this@NutritionIntakePerformerSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@NutritionIntakePerformerSurrogate.modifierExtension ?: mutableListOf(),
      function = this@NutritionIntakePerformerSurrogate.function,
      actor = this@NutritionIntakePerformerSurrogate.actor,
    )

  public companion object {
    public fun fromModel(model: NutritionIntake.Performer): NutritionIntakePerformerSurrogate =
      with(model) {
        NutritionIntakePerformerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          function = this@with.function,
          actor = this@with.actor,
        )
      }
  }
}

@Serializable
internal data class NutritionIntakeOccurrenceSurrogate(
  public var occurrenceDateTime: String? = null,
  public var _occurrenceDateTime: Element? = null,
  public var occurrencePeriod: Period? = null,
) {
  public fun toModel(): NutritionIntake.Occurrence? =
    NutritionIntake.Occurrence?.from(
      DateTime.of(
        FhirDateTime.fromString(this@NutritionIntakeOccurrenceSurrogate.occurrenceDateTime),
        this@NutritionIntakeOccurrenceSurrogate._occurrenceDateTime,
      ),
      this@NutritionIntakeOccurrenceSurrogate.occurrencePeriod,
    )

  public companion object {
    public fun fromModel(model: NutritionIntake.Occurrence): NutritionIntakeOccurrenceSurrogate =
      with(model) {
        NutritionIntakeOccurrenceSurrogate(
          occurrenceDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _occurrenceDateTime = this@with.asDateTime()?.value?.toElement(),
          occurrencePeriod = this@with.asPeriod()?.value,
        )
      }
  }
}

@Serializable
internal data class NutritionIntakeReportedSurrogate(
  public var reportedBoolean: KotlinBoolean? = null,
  public var _reportedBoolean: Element? = null,
  public var reportedReference: Reference? = null,
) {
  public fun toModel(): NutritionIntake.Reported? =
    NutritionIntake.Reported?.from(
      R5Boolean.of(
        this@NutritionIntakeReportedSurrogate.reportedBoolean,
        this@NutritionIntakeReportedSurrogate._reportedBoolean,
      ),
      this@NutritionIntakeReportedSurrogate.reportedReference,
    )

  public companion object {
    public fun fromModel(model: NutritionIntake.Reported): NutritionIntakeReportedSurrogate =
      with(model) {
        NutritionIntakeReportedSurrogate(
          reportedBoolean = this@with.asBoolean()?.value?.value,
          _reportedBoolean = this@with.asBoolean()?.value?.toElement(),
          reportedReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class NutritionIntakeSurrogate(
  public var id: String? = null,
  public var meta: Meta? = null,
  public var implicitRules: String? = null,
  public var _implicitRules: Element? = null,
  public var language: String? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var instantiatesCanonical: MutableList<String?>? = null,
  public var _instantiatesCanonical: MutableList<Element?>? = null,
  public var instantiatesUri: MutableList<String?>? = null,
  public var _instantiatesUri: MutableList<Element?>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var partOf: MutableList<Reference>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var statusReason: MutableList<CodeableConcept>? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference,
  public var encounter: Reference? = null,
  public var recorded: String? = null,
  public var _recorded: Element? = null,
  public var consumedItem: MutableList<NutritionIntake.ConsumedItem>? = null,
  public var ingredientLabel: MutableList<NutritionIntake.IngredientLabel>? = null,
  public var performer: MutableList<NutritionIntake.Performer>? = null,
  public var location: Reference? = null,
  public var derivedFrom: MutableList<Reference>? = null,
  public var reason: MutableList<CodeableReference>? = null,
  public var note: MutableList<Annotation>? = null,
  public var occurrence: NutritionIntake.Occurrence? = null,
  public var reported: NutritionIntake.Reported? = null,
) {
  public fun toModel(): NutritionIntake =
    NutritionIntake(
      id = this@NutritionIntakeSurrogate.id,
      meta = this@NutritionIntakeSurrogate.meta,
      implicitRules =
        Uri.of(
          this@NutritionIntakeSurrogate.implicitRules,
          this@NutritionIntakeSurrogate._implicitRules,
        ),
      language =
        Code.of(this@NutritionIntakeSurrogate.language, this@NutritionIntakeSurrogate._language),
      text = this@NutritionIntakeSurrogate.text,
      contained = this@NutritionIntakeSurrogate.contained ?: mutableListOf(),
      extension = this@NutritionIntakeSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@NutritionIntakeSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@NutritionIntakeSurrogate.identifier ?: mutableListOf(),
      instantiatesCanonical =
        if (
          this@NutritionIntakeSurrogate.instantiatesCanonical == null &&
            this@NutritionIntakeSurrogate._instantiatesCanonical == null
        ) {
          mutableListOf()
        } else {
          (this@NutritionIntakeSurrogate.instantiatesCanonical
              ?: List(this@NutritionIntakeSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@NutritionIntakeSurrogate._instantiatesCanonical
                ?: List(this@NutritionIntakeSurrogate.instantiatesCanonical!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      instantiatesUri =
        if (
          this@NutritionIntakeSurrogate.instantiatesUri == null &&
            this@NutritionIntakeSurrogate._instantiatesUri == null
        ) {
          mutableListOf()
        } else {
          (this@NutritionIntakeSurrogate.instantiatesUri
              ?: List(this@NutritionIntakeSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@NutritionIntakeSurrogate._instantiatesUri
                ?: List(this@NutritionIntakeSurrogate.instantiatesUri!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      basedOn = this@NutritionIntakeSurrogate.basedOn ?: mutableListOf(),
      partOf = this@NutritionIntakeSurrogate.partOf ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.NutritionIntake.NutritionIntakeStatus.fromCode(
            this@NutritionIntakeSurrogate.status!!
          ),
          this@NutritionIntakeSurrogate._status,
        ),
      statusReason = this@NutritionIntakeSurrogate.statusReason ?: mutableListOf(),
      code = this@NutritionIntakeSurrogate.code,
      subject = this@NutritionIntakeSurrogate.subject,
      encounter = this@NutritionIntakeSurrogate.encounter,
      occurrence = this@NutritionIntakeSurrogate.occurrence,
      recorded =
        DateTime.of(
          FhirDateTime.fromString(this@NutritionIntakeSurrogate.recorded),
          this@NutritionIntakeSurrogate._recorded,
        ),
      reported = this@NutritionIntakeSurrogate.reported,
      consumedItem = this@NutritionIntakeSurrogate.consumedItem ?: mutableListOf(),
      ingredientLabel = this@NutritionIntakeSurrogate.ingredientLabel ?: mutableListOf(),
      performer = this@NutritionIntakeSurrogate.performer ?: mutableListOf(),
      location = this@NutritionIntakeSurrogate.location,
      derivedFrom = this@NutritionIntakeSurrogate.derivedFrom ?: mutableListOf(),
      reason = this@NutritionIntakeSurrogate.reason ?: mutableListOf(),
      note = this@NutritionIntakeSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: NutritionIntake): NutritionIntakeSurrogate =
      with(model) {
        NutritionIntakeSurrogate(
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
          partOf = this@with.partOf.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          statusReason = this@with.statusReason.takeUnless { it.all { it == null } },
          code = this@with.code,
          subject = this@with.subject,
          encounter = this@with.encounter,
          occurrence = this@with.occurrence,
          recorded = this@with.recorded?.value?.toString(),
          _recorded = this@with.recorded?.toElement(),
          reported = this@with.reported,
          consumedItem = this@with.consumedItem.takeUnless { it.all { it == null } },
          ingredientLabel = this@with.ingredientLabel.takeUnless { it.all { it == null } },
          performer = this@with.performer.takeUnless { it.all { it == null } },
          location = this@with.location,
          derivedFrom = this@with.derivedFrom.takeUnless { it.all { it == null } },
          reason = this@with.reason.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}
