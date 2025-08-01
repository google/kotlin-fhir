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

import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Medication
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Ratio
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
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
internal data class MedicationIngredientItemSurrogate(
  public var itemCodeableConcept: CodeableConcept? = null,
  public var itemReference: Reference? = null,
) {
  public fun toModel(): Medication.Ingredient.Item =
    Medication.Ingredient.Item.from(
      this@MedicationIngredientItemSurrogate.itemCodeableConcept,
      this@MedicationIngredientItemSurrogate.itemReference,
    )!! !!

  public companion object {
    public fun fromModel(model: Medication.Ingredient.Item): MedicationIngredientItemSurrogate =
      with(model) {
        MedicationIngredientItemSurrogate(
          itemCodeableConcept = this@with.asCodeableConcept()?.value,
          itemReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class MedicationIngredientSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var item: Medication.Ingredient.Item,
  public var isActive: KotlinBoolean? = null,
  public var _isActive: Element? = null,
  public var strength: Ratio? = null,
) {
  public fun toModel(): Medication.Ingredient =
    Medication.Ingredient(
      id = this@MedicationIngredientSurrogate.id,
      extension = this@MedicationIngredientSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MedicationIngredientSurrogate.modifierExtension ?: mutableListOf(),
      item = this@MedicationIngredientSurrogate.item,
      isActive =
        R4bBoolean.of(
          this@MedicationIngredientSurrogate.isActive,
          this@MedicationIngredientSurrogate._isActive,
        ),
      strength = this@MedicationIngredientSurrogate.strength,
    )

  public companion object {
    public fun fromModel(model: Medication.Ingredient): MedicationIngredientSurrogate =
      with(model) {
        MedicationIngredientSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          item = this@with.item,
          isActive = this@with.isActive?.value,
          _isActive = this@with.isActive?.toElement(),
          strength = this@with.strength,
        )
      }
  }
}

@Serializable
internal data class MedicationBatchSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var lotNumber: KotlinString? = null,
  public var _lotNumber: Element? = null,
  public var expirationDate: KotlinString? = null,
  public var _expirationDate: Element? = null,
) {
  public fun toModel(): Medication.Batch =
    Medication.Batch(
      id = this@MedicationBatchSurrogate.id,
      extension = this@MedicationBatchSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MedicationBatchSurrogate.modifierExtension ?: mutableListOf(),
      lotNumber =
        R4bString.of(
          this@MedicationBatchSurrogate.lotNumber,
          this@MedicationBatchSurrogate._lotNumber,
        ),
      expirationDate =
        DateTime.of(
          FhirDateTime.fromString(this@MedicationBatchSurrogate.expirationDate),
          this@MedicationBatchSurrogate._expirationDate,
        ),
    )

  public companion object {
    public fun fromModel(model: Medication.Batch): MedicationBatchSurrogate =
      with(model) {
        MedicationBatchSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          lotNumber = this@with.lotNumber?.value,
          _lotNumber = this@with.lotNumber?.toElement(),
          expirationDate = this@with.expirationDate?.value?.toString(),
          _expirationDate = this@with.expirationDate?.toElement(),
        )
      }
  }
}

@Serializable
internal data class MedicationSurrogate(
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
  public var code: CodeableConcept? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var manufacturer: Reference? = null,
  public var form: CodeableConcept? = null,
  public var amount: Ratio? = null,
  public var ingredient: MutableList<Medication.Ingredient>? = null,
  public var batch: Medication.Batch? = null,
) {
  public fun toModel(): Medication =
    Medication(
      id = this@MedicationSurrogate.id,
      meta = this@MedicationSurrogate.meta,
      implicitRules =
        Uri.of(this@MedicationSurrogate.implicitRules, this@MedicationSurrogate._implicitRules),
      language = Code.of(this@MedicationSurrogate.language, this@MedicationSurrogate._language),
      text = this@MedicationSurrogate.text,
      contained = this@MedicationSurrogate.contained ?: mutableListOf(),
      extension = this@MedicationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MedicationSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@MedicationSurrogate.identifier ?: mutableListOf(),
      code = this@MedicationSurrogate.code,
      status =
        this@MedicationSurrogate.status?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.Medication.MedicationStatus.fromCode(it!!),
            this@MedicationSurrogate._status,
          )
        },
      manufacturer = this@MedicationSurrogate.manufacturer,
      form = this@MedicationSurrogate.form,
      amount = this@MedicationSurrogate.amount,
      ingredient = this@MedicationSurrogate.ingredient ?: mutableListOf(),
      batch = this@MedicationSurrogate.batch,
    )

  public companion object {
    public fun fromModel(model: Medication): MedicationSurrogate =
      with(model) {
        MedicationSurrogate(
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
          code = this@with.code,
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          manufacturer = this@with.manufacturer,
          form = this@with.form,
          amount = this@with.amount,
          ingredient = this@with.ingredient.takeUnless { it.all { it == null } },
          batch = this@with.batch,
        )
      }
  }
}
