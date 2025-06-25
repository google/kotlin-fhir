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

import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Medication
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Ratio
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicationIngredientSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var itemCodeableConcept: CodeableConcept? = null,
  public var itemReference: Reference? = null,
  public var isActive: KotlinBoolean? = null,
  public var _isActive: Element? = null,
  public var strength: Ratio? = null,
) {
  public fun toModel(): Medication.Ingredient =
    Medication.Ingredient().apply {
      id = this@MedicationIngredientSurrogate.id
      extension = this@MedicationIngredientSurrogate.extension
      modifierExtension = this@MedicationIngredientSurrogate.modifierExtension
      item =
        Medication.Ingredient.Item?.from(
          this@MedicationIngredientSurrogate.itemCodeableConcept,
          this@MedicationIngredientSurrogate.itemReference,
        )
      isActive =
        R4Boolean.of(
          this@MedicationIngredientSurrogate.isActive,
          this@MedicationIngredientSurrogate._isActive,
        )
      strength = this@MedicationIngredientSurrogate.strength
    }

  public companion object {
    public fun fromModel(model: Medication.Ingredient): MedicationIngredientSurrogate =
      with(model) {
        MedicationIngredientSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          itemCodeableConcept = this@with.item?.asCodeableConcept()?.value
          itemReference = this@with.item?.asReference()?.value
          isActive = this@with.isActive?.value
          _isActive = this@with.isActive?.toElement()
          strength = this@with.strength
        }
      }
  }
}

@Serializable
internal data class MedicationBatchSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var lotNumber: KotlinString? = null,
  public var _lotNumber: Element? = null,
  public var expirationDate: KotlinString? = null,
  public var _expirationDate: Element? = null,
) {
  public fun toModel(): Medication.Batch =
    Medication.Batch().apply {
      id = this@MedicationBatchSurrogate.id
      extension = this@MedicationBatchSurrogate.extension
      modifierExtension = this@MedicationBatchSurrogate.modifierExtension
      lotNumber =
        R4String.of(
          this@MedicationBatchSurrogate.lotNumber,
          this@MedicationBatchSurrogate._lotNumber,
        )
      expirationDate =
        DateTime.of(
          FhirDateTime.fromString(this@MedicationBatchSurrogate.expirationDate),
          this@MedicationBatchSurrogate._expirationDate,
        )
    }

  public companion object {
    public fun fromModel(model: Medication.Batch): MedicationBatchSurrogate =
      with(model) {
        MedicationBatchSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          lotNumber = this@with.lotNumber?.value
          _lotNumber = this@with.lotNumber?.toElement()
          expirationDate = this@with.expirationDate?.value?.toString()
          _expirationDate = this@with.expirationDate?.toElement()
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var code: CodeableConcept? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var manufacturer: Reference? = null,
  public var form: CodeableConcept? = null,
  public var amount: Ratio? = null,
  public var ingredient: List<Medication.Ingredient>? = null,
  public var batch: Medication.Batch? = null,
) {
  public fun toModel(): Medication =
    Medication().apply {
      id = this@MedicationSurrogate.id
      meta = this@MedicationSurrogate.meta
      implicitRules =
        Uri.of(this@MedicationSurrogate.implicitRules, this@MedicationSurrogate._implicitRules)
      language = Code.of(this@MedicationSurrogate.language, this@MedicationSurrogate._language)
      text = this@MedicationSurrogate.text
      contained = this@MedicationSurrogate.contained
      extension = this@MedicationSurrogate.extension
      modifierExtension = this@MedicationSurrogate.modifierExtension
      identifier = this@MedicationSurrogate.identifier
      code = this@MedicationSurrogate.code
      status =
        Enumeration.of(
          this@MedicationSurrogate.status?.let {
            com.google.fhir.model.r4.Medication.MedicationStatus.fromCode(it)
          },
          this@MedicationSurrogate._status,
        )
      manufacturer = this@MedicationSurrogate.manufacturer
      form = this@MedicationSurrogate.form
      amount = this@MedicationSurrogate.amount
      ingredient = this@MedicationSurrogate.ingredient
      batch = this@MedicationSurrogate.batch
    }

  public companion object {
    public fun fromModel(model: Medication): MedicationSurrogate =
      with(model) {
        MedicationSurrogate().apply {
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
          code = this@with.code
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          manufacturer = this@with.manufacturer
          form = this@with.form
          amount = this@with.amount
          ingredient = this@with.ingredient
          batch = this@with.batch
        }
      }
  }
}
