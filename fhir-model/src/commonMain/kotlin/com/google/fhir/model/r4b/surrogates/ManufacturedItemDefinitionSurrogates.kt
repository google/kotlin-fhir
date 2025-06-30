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

import com.google.fhir.model.r4b.Attachment
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Date
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDate
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.ManufacturedItemDefinition
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ManufacturedItemDefinitionPropertySurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueDate: String? = null,
  public var _valueDate: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueAttachment: Attachment? = null,
) {
  public fun toModel(): ManufacturedItemDefinition.Property =
    ManufacturedItemDefinition.Property().apply {
      id = this@ManufacturedItemDefinitionPropertySurrogate.id
      extension = this@ManufacturedItemDefinitionPropertySurrogate.extension
      modifierExtension = this@ManufacturedItemDefinitionPropertySurrogate.modifierExtension
      type = this@ManufacturedItemDefinitionPropertySurrogate.type
      `value` =
        ManufacturedItemDefinition.Property.Value?.from(
          this@ManufacturedItemDefinitionPropertySurrogate.valueCodeableConcept,
          this@ManufacturedItemDefinitionPropertySurrogate.valueQuantity,
          Date.of(
            FhirDate.fromString(this@ManufacturedItemDefinitionPropertySurrogate.valueDate),
            this@ManufacturedItemDefinitionPropertySurrogate._valueDate,
          ),
          R4bBoolean.of(
            this@ManufacturedItemDefinitionPropertySurrogate.valueBoolean,
            this@ManufacturedItemDefinitionPropertySurrogate._valueBoolean,
          ),
          this@ManufacturedItemDefinitionPropertySurrogate.valueAttachment,
        )
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
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value
          valueQuantity = this@with.`value`?.asQuantity()?.value
          valueDate = this@with.`value`?.asDate()?.value?.value?.toString()
          _valueDate = this@with.`value`?.asDate()?.value?.toElement()
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement()
          valueAttachment = this@with.`value`?.asAttachment()?.value
        }
      }
  }
}

@Serializable
internal data class ManufacturedItemDefinitionSurrogate(
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
  public var status: String? = null,
  public var _status: Element? = null,
  public var manufacturedDoseForm: CodeableConcept? = null,
  public var unitOfPresentation: CodeableConcept? = null,
  public var manufacturer: List<Reference?>? = null,
  public var ingredient: List<CodeableConcept?>? = null,
  public var `property`: List<ManufacturedItemDefinition.Property>? = null,
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
            com.google.fhir.model.r4b.PublicationStatus.fromCode(it)
          },
          this@ManufacturedItemDefinitionSurrogate._status,
        )
      manufacturedDoseForm = this@ManufacturedItemDefinitionSurrogate.manufacturedDoseForm
      unitOfPresentation = this@ManufacturedItemDefinitionSurrogate.unitOfPresentation
      manufacturer = this@ManufacturedItemDefinitionSurrogate.manufacturer
      ingredient = this@ManufacturedItemDefinitionSurrogate.ingredient
      `property` = this@ManufacturedItemDefinitionSurrogate.`property`
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
          manufacturedDoseForm = this@with.manufacturedDoseForm
          unitOfPresentation = this@with.unitOfPresentation
          manufacturer = this@with.manufacturer
          ingredient = this@with.ingredient
          `property` = this@with.`property`
        }
      }
  }
}
