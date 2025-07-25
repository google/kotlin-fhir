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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ManufacturedItemDefinitionPropertySurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var valueCodeableConcept: CodeableConcept? = null,
  public var valueQuantity: Quantity? = null,
  public var valueDate: String? = null,
  public var _valueDate: Element? = null,
  public var valueBoolean: KotlinBoolean? = null,
  public var _valueBoolean: Element? = null,
  public var valueAttachment: Attachment? = null,
) {
  public fun toModel(): ManufacturedItemDefinition.Property =
    ManufacturedItemDefinition.Property(
      id = this@ManufacturedItemDefinitionPropertySurrogate.id,
      extension = this@ManufacturedItemDefinitionPropertySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ManufacturedItemDefinitionPropertySurrogate.modifierExtension ?: mutableListOf(),
      type = this@ManufacturedItemDefinitionPropertySurrogate.type,
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
        ),
    )

  public companion object {
    public fun fromModel(
      model: ManufacturedItemDefinition.Property
    ): ManufacturedItemDefinitionPropertySurrogate =
      with(model) {
        ManufacturedItemDefinitionPropertySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          valueCodeableConcept = this@with.`value`?.asCodeableConcept()?.value,
          valueQuantity = this@with.`value`?.asQuantity()?.value,
          valueDate = this@with.`value`?.asDate()?.value?.value?.toString(),
          _valueDate = this@with.`value`?.asDate()?.value?.toElement(),
          valueBoolean = this@with.`value`?.asBoolean()?.value?.value,
          _valueBoolean = this@with.`value`?.asBoolean()?.value?.toElement(),
          valueAttachment = this@with.`value`?.asAttachment()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var manufacturedDoseForm: CodeableConcept,
  public var unitOfPresentation: CodeableConcept? = null,
  public var manufacturer: MutableList<Reference>? = null,
  public var ingredient: MutableList<CodeableConcept>? = null,
  public var `property`: MutableList<ManufacturedItemDefinition.Property>? = null,
) {
  public fun toModel(): ManufacturedItemDefinition =
    ManufacturedItemDefinition(
      id = this@ManufacturedItemDefinitionSurrogate.id,
      meta = this@ManufacturedItemDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@ManufacturedItemDefinitionSurrogate.implicitRules,
          this@ManufacturedItemDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@ManufacturedItemDefinitionSurrogate.language,
          this@ManufacturedItemDefinitionSurrogate._language,
        ),
      text = this@ManufacturedItemDefinitionSurrogate.text,
      contained = this@ManufacturedItemDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@ManufacturedItemDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ManufacturedItemDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ManufacturedItemDefinitionSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.PublicationStatus.fromCode(
            this@ManufacturedItemDefinitionSurrogate.status!!
          ),
          this@ManufacturedItemDefinitionSurrogate._status,
        ),
      manufacturedDoseForm = this@ManufacturedItemDefinitionSurrogate.manufacturedDoseForm,
      unitOfPresentation = this@ManufacturedItemDefinitionSurrogate.unitOfPresentation,
      manufacturer = this@ManufacturedItemDefinitionSurrogate.manufacturer ?: mutableListOf(),
      ingredient = this@ManufacturedItemDefinitionSurrogate.ingredient ?: mutableListOf(),
      `property` = this@ManufacturedItemDefinitionSurrogate.`property` ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ManufacturedItemDefinition): ManufacturedItemDefinitionSurrogate =
      with(model) {
        ManufacturedItemDefinitionSurrogate(
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
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          manufacturedDoseForm = this@with.manufacturedDoseForm,
          unitOfPresentation = this@with.unitOfPresentation,
          manufacturer = this@with.manufacturer.takeUnless { it.all { it == null } },
          ingredient = this@with.ingredient.takeUnless { it.all { it == null } },
          `property` = this@with.`property`.takeUnless { it.all { it == null } },
        )
      }
  }
}
