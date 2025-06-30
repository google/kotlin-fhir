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

import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Ratio
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Substance
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

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
  public var id: String? = null,
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
  public var id: String? = null,
  public var meta: Meta? = null,
  public var implicitRules: String? = null,
  public var _implicitRules: Element? = null,
  public var language: String? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var instance: KotlinBoolean? = null,
  public var _instance: Element? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var code: CodeableReference? = null,
  public var description: String? = null,
  public var _description: Element? = null,
  public var expiry: String? = null,
  public var _expiry: Element? = null,
  public var quantity: Quantity? = null,
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
      instance = R5Boolean.of(this@SubstanceSurrogate.instance, this@SubstanceSurrogate._instance)
      status =
        Enumeration.of(
          this@SubstanceSurrogate.status?.let {
            com.google.fhir.model.r5.Substance.FHIRSubstanceStatus.fromCode(it)
          },
          this@SubstanceSurrogate._status,
        )
      category = this@SubstanceSurrogate.category
      code = this@SubstanceSurrogate.code
      description =
        Markdown.of(this@SubstanceSurrogate.description, this@SubstanceSurrogate._description)
      expiry =
        DateTime.of(
          FhirDateTime.fromString(this@SubstanceSurrogate.expiry),
          this@SubstanceSurrogate._expiry,
        )
      quantity = this@SubstanceSurrogate.quantity
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
          instance = this@with.instance?.value
          _instance = this@with.instance?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          category = this@with.category
          code = this@with.code
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          expiry = this@with.expiry?.value?.toString()
          _expiry = this@with.expiry?.toElement()
          quantity = this@with.quantity
          ingredient = this@with.ingredient
        }
      }
  }
}
