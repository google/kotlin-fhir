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
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Ratio
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Substance
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SubstanceInstanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: Identifier? = null,
  public var expiry: KotlinString? = null,
  public var _expiry: Element? = null,
  public var quantity: Quantity? = null,
) {
  public fun toModel(): Substance.Instance =
    Substance.Instance().apply {
      id = this@SubstanceInstanceSurrogate.id
      extension = this@SubstanceInstanceSurrogate.extension
      modifierExtension = this@SubstanceInstanceSurrogate.modifierExtension
      identifier = this@SubstanceInstanceSurrogate.identifier
      expiry =
        DateTime.of(
          FhirDateTime.fromString(this@SubstanceInstanceSurrogate.expiry),
          this@SubstanceInstanceSurrogate._expiry,
        )
      quantity = this@SubstanceInstanceSurrogate.quantity
    }

  public companion object {
    public fun fromModel(model: Substance.Instance): SubstanceInstanceSurrogate =
      with(model) {
        SubstanceInstanceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          expiry = this@with.expiry?.value?.toString()
          _expiry = this@with.expiry?.toElement()
          quantity = this@with.quantity
        }
      }
  }
}

@Serializable
internal class SubstanceIngredientSubstanceSurrogate {
  public var substanceCodeableConcept: CodeableConcept? = null

  public var substanceReference: Reference? = null

  public fun toModel(): Substance.Ingredient.Substance =
    Substance.Ingredient.Substance?.from(
      this@SubstanceIngredientSubstanceSurrogate.substanceCodeableConcept,
      this@SubstanceIngredientSubstanceSurrogate.substanceReference,
    ) ?: Substance.Ingredient.Substance.Null

  public companion object {
    public fun fromModel(
      model: Substance.Ingredient.Substance
    ): SubstanceIngredientSubstanceSurrogate =
      with(model) {
        SubstanceIngredientSubstanceSurrogate().apply {
          substanceCodeableConcept = this@with.asCodeableConcept()?.value
          substanceReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class SubstanceIngredientSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var quantity: Ratio? = null,
  public var substance: Substance.Ingredient.Substance? = null,
) {
  public fun toModel(): Substance.Ingredient =
    Substance.Ingredient().apply {
      id = this@SubstanceIngredientSurrogate.id
      extension = this@SubstanceIngredientSurrogate.extension
      modifierExtension = this@SubstanceIngredientSurrogate.modifierExtension
      quantity = this@SubstanceIngredientSurrogate.quantity
      substance = this@SubstanceIngredientSurrogate.substance
    }

  public companion object {
    public fun fromModel(model: Substance.Ingredient): SubstanceIngredientSurrogate =
      with(model) {
        SubstanceIngredientSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          quantity = this@with.quantity
          substance = this@with.substance
        }
      }
  }
}

@Serializable
internal data class SubstanceSurrogate(
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
  public var category: List<CodeableConcept?>? = null,
  public var code: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var instance: List<Substance.Instance>? = null,
  public var ingredient: List<Substance.Ingredient>? = null,
) {
  public fun toModel(): Substance =
    Substance().apply {
      id = this@SubstanceSurrogate.id
      meta = this@SubstanceSurrogate.meta
      implicitRules =
        Uri.of(this@SubstanceSurrogate.implicitRules, this@SubstanceSurrogate._implicitRules)
      language = Code.of(this@SubstanceSurrogate.language, this@SubstanceSurrogate._language)
      text = this@SubstanceSurrogate.text
      contained = this@SubstanceSurrogate.contained
      extension = this@SubstanceSurrogate.extension
      modifierExtension = this@SubstanceSurrogate.modifierExtension
      identifier = this@SubstanceSurrogate.identifier
      status =
        Enumeration.of(
          this@SubstanceSurrogate.status?.let {
            com.google.fhir.model.r4.Substance.FHIRSubstanceStatus.fromCode(it)
          },
          this@SubstanceSurrogate._status,
        )
      category = this@SubstanceSurrogate.category
      code = this@SubstanceSurrogate.code
      description =
        R4String.of(this@SubstanceSurrogate.description, this@SubstanceSurrogate._description)
      instance = this@SubstanceSurrogate.instance
      ingredient = this@SubstanceSurrogate.ingredient
    }

  public companion object {
    public fun fromModel(model: Substance): SubstanceSurrogate =
      with(model) {
        SubstanceSurrogate().apply {
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
          category = this@with.category
          code = this@with.code
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          instance = this@with.instance
          ingredient = this@with.ingredient
        }
      }
  }
}
