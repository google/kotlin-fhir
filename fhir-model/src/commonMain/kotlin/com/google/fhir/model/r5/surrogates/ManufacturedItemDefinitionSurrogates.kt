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

import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.ManufacturedItemDefinition
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.MarketingStatus
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal class ManufacturedItemDefinitionPropertyValueSurrogate {
  public var valueCodeableConcept: CodeableConcept? = null

  public var valueQuantity: Quantity? = null

  public var valueDate: KotlinString? = null

  public var _valueDate: Element? = null

  public var valueBoolean: KotlinBoolean? = null

  public var _valueBoolean: Element? = null

  public var valueMarkdown: KotlinString? = null

  public var _valueMarkdown: Element? = null

  public var valueAttachment: Attachment? = null

  public var valueReference: Reference? = null

  public fun toModel(): ManufacturedItemDefinition.Property.Value =
    ManufacturedItemDefinition.Property.Value?.from(
      this@ManufacturedItemDefinitionPropertyValueSurrogate.valueCodeableConcept,
      this@ManufacturedItemDefinitionPropertyValueSurrogate.valueQuantity,
      Date.of(
        FhirDate.fromString(this@ManufacturedItemDefinitionPropertyValueSurrogate.valueDate),
        this@ManufacturedItemDefinitionPropertyValueSurrogate._valueDate,
      ),
      R5Boolean.of(
        this@ManufacturedItemDefinitionPropertyValueSurrogate.valueBoolean,
        this@ManufacturedItemDefinitionPropertyValueSurrogate._valueBoolean,
      ),
      Markdown.of(
        this@ManufacturedItemDefinitionPropertyValueSurrogate.valueMarkdown,
        this@ManufacturedItemDefinitionPropertyValueSurrogate._valueMarkdown,
      ),
      this@ManufacturedItemDefinitionPropertyValueSurrogate.valueAttachment,
      this@ManufacturedItemDefinitionPropertyValueSurrogate.valueReference,
    ) ?: ManufacturedItemDefinition.Property.Value.Null

  public companion object {
    public fun fromModel(
      model: ManufacturedItemDefinition.Property.Value
    ): ManufacturedItemDefinitionPropertyValueSurrogate =
      with(model) {
        ManufacturedItemDefinitionPropertyValueSurrogate().apply {
          valueCodeableConcept = this@with.asCodeableConcept()?.value
          valueQuantity = this@with.asQuantity()?.value
          valueDate = this@with.asDate()?.value?.value?.toString()
          _valueDate = this@with.asDate()?.value?.toElement()
          valueBoolean = this@with.asBoolean()?.value?.value
          _valueBoolean = this@with.asBoolean()?.value?.toElement()
          valueMarkdown = this@with.asMarkdown()?.value?.value
          _valueMarkdown = this@with.asMarkdown()?.value?.toElement()
          valueAttachment = this@with.asAttachment()?.value
          valueReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class ManufacturedItemDefinitionPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var `value`: ManufacturedItemDefinition.Property.Value? = null,
) {
  public fun toModel(): ManufacturedItemDefinition.Property =
    ManufacturedItemDefinition.Property().apply {
      id = this@ManufacturedItemDefinitionPropertySurrogate.id
      extension = this@ManufacturedItemDefinitionPropertySurrogate.extension
      modifierExtension = this@ManufacturedItemDefinitionPropertySurrogate.modifierExtension
      type = this@ManufacturedItemDefinitionPropertySurrogate.type
      `value` = this@ManufacturedItemDefinitionPropertySurrogate.`value`
    }

  public companion object {
    public fun fromModel(
      model: ManufacturedItemDefinition.Property
    ): ManufacturedItemDefinitionPropertySurrogate =
      with(model) {
        ManufacturedItemDefinitionPropertySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          `value` = this@with.`value`
        }
      }
  }
}

@Serializable
internal data class ManufacturedItemDefinitionComponentConstituentSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var amount: List<Quantity?>? = null,
  public var location: List<CodeableConcept?>? = null,
  public var function: List<CodeableConcept?>? = null,
  public var hasIngredient: List<CodeableReference?>? = null,
) {
  public fun toModel(): ManufacturedItemDefinition.Component.Constituent =
    ManufacturedItemDefinition.Component.Constituent().apply {
      id = this@ManufacturedItemDefinitionComponentConstituentSurrogate.id
      extension = this@ManufacturedItemDefinitionComponentConstituentSurrogate.extension
      modifierExtension =
        this@ManufacturedItemDefinitionComponentConstituentSurrogate.modifierExtension
      amount = this@ManufacturedItemDefinitionComponentConstituentSurrogate.amount
      location = this@ManufacturedItemDefinitionComponentConstituentSurrogate.location
      function = this@ManufacturedItemDefinitionComponentConstituentSurrogate.function
      hasIngredient = this@ManufacturedItemDefinitionComponentConstituentSurrogate.hasIngredient
    }

  public companion object {
    public fun fromModel(
      model: ManufacturedItemDefinition.Component.Constituent
    ): ManufacturedItemDefinitionComponentConstituentSurrogate =
      with(model) {
        ManufacturedItemDefinitionComponentConstituentSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          amount = this@with.amount
          location = this@with.location
          function = this@with.function
          hasIngredient = this@with.hasIngredient
        }
      }
  }
}

@Serializable
internal data class ManufacturedItemDefinitionComponentSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var function: List<CodeableConcept?>? = null,
  public var amount: List<Quantity?>? = null,
  public var constituent: List<ManufacturedItemDefinition.Component.Constituent>? = null,
  public var `property`: List<ManufacturedItemDefinition.Property?>? = null,
  public var component: List<ManufacturedItemDefinition.Component?>? = null,
) {
  public fun toModel(): ManufacturedItemDefinition.Component =
    ManufacturedItemDefinition.Component().apply {
      id = this@ManufacturedItemDefinitionComponentSurrogate.id
      extension = this@ManufacturedItemDefinitionComponentSurrogate.extension
      modifierExtension = this@ManufacturedItemDefinitionComponentSurrogate.modifierExtension
      type = this@ManufacturedItemDefinitionComponentSurrogate.type
      function = this@ManufacturedItemDefinitionComponentSurrogate.function
      amount = this@ManufacturedItemDefinitionComponentSurrogate.amount
      constituent = this@ManufacturedItemDefinitionComponentSurrogate.constituent
      `property` = this@ManufacturedItemDefinitionComponentSurrogate.`property`
      component = this@ManufacturedItemDefinitionComponentSurrogate.component
    }

  public companion object {
    public fun fromModel(
      model: ManufacturedItemDefinition.Component
    ): ManufacturedItemDefinitionComponentSurrogate =
      with(model) {
        ManufacturedItemDefinitionComponentSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          function = this@with.function
          amount = this@with.amount
          constituent = this@with.constituent
          `property` = this@with.`property`
          component = this@with.component
        }
      }
  }
}

@Serializable
internal data class ManufacturedItemDefinitionSurrogate(
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
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var manufacturedDoseForm: CodeableConcept? = null,
  public var unitOfPresentation: CodeableConcept? = null,
  public var manufacturer: List<Reference?>? = null,
  public var marketingStatus: List<MarketingStatus?>? = null,
  public var ingredient: List<CodeableConcept?>? = null,
  public var `property`: List<ManufacturedItemDefinition.Property>? = null,
  public var component: List<ManufacturedItemDefinition.Component>? = null,
) {
  public fun toModel(): ManufacturedItemDefinition =
    ManufacturedItemDefinition().apply {
      id = this@ManufacturedItemDefinitionSurrogate.id
      meta = this@ManufacturedItemDefinitionSurrogate.meta
      implicitRules =
        Uri.of(
          this@ManufacturedItemDefinitionSurrogate.implicitRules,
          this@ManufacturedItemDefinitionSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@ManufacturedItemDefinitionSurrogate.language,
          this@ManufacturedItemDefinitionSurrogate._language,
        )
      text = this@ManufacturedItemDefinitionSurrogate.text
      contained = this@ManufacturedItemDefinitionSurrogate.contained
      extension = this@ManufacturedItemDefinitionSurrogate.extension
      modifierExtension = this@ManufacturedItemDefinitionSurrogate.modifierExtension
      identifier = this@ManufacturedItemDefinitionSurrogate.identifier
      status =
        Enumeration.of(
          this@ManufacturedItemDefinitionSurrogate.status?.let {
            com.google.fhir.model.r5.PublicationStatus.fromCode(it)
          },
          this@ManufacturedItemDefinitionSurrogate._status,
        )
      name =
        R5String.of(
          this@ManufacturedItemDefinitionSurrogate.name,
          this@ManufacturedItemDefinitionSurrogate._name,
        )
      manufacturedDoseForm = this@ManufacturedItemDefinitionSurrogate.manufacturedDoseForm
      unitOfPresentation = this@ManufacturedItemDefinitionSurrogate.unitOfPresentation
      manufacturer = this@ManufacturedItemDefinitionSurrogate.manufacturer
      marketingStatus = this@ManufacturedItemDefinitionSurrogate.marketingStatus
      ingredient = this@ManufacturedItemDefinitionSurrogate.ingredient
      `property` = this@ManufacturedItemDefinitionSurrogate.`property`
      component = this@ManufacturedItemDefinitionSurrogate.component
    }

  public companion object {
    public fun fromModel(model: ManufacturedItemDefinition): ManufacturedItemDefinitionSurrogate =
      with(model) {
        ManufacturedItemDefinitionSurrogate().apply {
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
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          manufacturedDoseForm = this@with.manufacturedDoseForm
          unitOfPresentation = this@with.unitOfPresentation
          manufacturer = this@with.manufacturer
          marketingStatus = this@with.marketingStatus
          ingredient = this@with.ingredient
          `property` = this@with.`property`
          component = this@with.component
        }
      }
  }
}
