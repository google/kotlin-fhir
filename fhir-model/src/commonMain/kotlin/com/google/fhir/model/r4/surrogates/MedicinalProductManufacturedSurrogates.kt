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
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.MedicinalProductManufactured
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.ProdCharacteristic
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicinalProductManufacturedSurrogate(
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
  public var manufacturedDoseForm: CodeableConcept? = null,
  public var unitOfPresentation: CodeableConcept? = null,
  public var quantity: Quantity? = null,
  public var manufacturer: List<Reference?>? = null,
  public var ingredient: List<Reference?>? = null,
  public var physicalCharacteristics: ProdCharacteristic? = null,
  public var otherCharacteristics: List<CodeableConcept?>? = null,
) {
  public fun toModel(): MedicinalProductManufactured =
    MedicinalProductManufactured().apply {
      id = this@MedicinalProductManufacturedSurrogate.id
      meta = this@MedicinalProductManufacturedSurrogate.meta
      implicitRules =
        Uri.of(
          this@MedicinalProductManufacturedSurrogate.implicitRules,
          this@MedicinalProductManufacturedSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@MedicinalProductManufacturedSurrogate.language,
          this@MedicinalProductManufacturedSurrogate._language,
        )
      text = this@MedicinalProductManufacturedSurrogate.text
      contained = this@MedicinalProductManufacturedSurrogate.contained
      extension = this@MedicinalProductManufacturedSurrogate.extension
      modifierExtension = this@MedicinalProductManufacturedSurrogate.modifierExtension
      manufacturedDoseForm = this@MedicinalProductManufacturedSurrogate.manufacturedDoseForm
      unitOfPresentation = this@MedicinalProductManufacturedSurrogate.unitOfPresentation
      quantity = this@MedicinalProductManufacturedSurrogate.quantity
      manufacturer = this@MedicinalProductManufacturedSurrogate.manufacturer
      ingredient = this@MedicinalProductManufacturedSurrogate.ingredient
      physicalCharacteristics = this@MedicinalProductManufacturedSurrogate.physicalCharacteristics
      otherCharacteristics = this@MedicinalProductManufacturedSurrogate.otherCharacteristics
    }

  public companion object {
    public fun fromModel(
      model: MedicinalProductManufactured
    ): MedicinalProductManufacturedSurrogate =
      with(model) {
        MedicinalProductManufacturedSurrogate().apply {
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
          manufacturedDoseForm = this@with.manufacturedDoseForm
          unitOfPresentation = this@with.unitOfPresentation
          quantity = this@with.quantity
          manufacturer = this@with.manufacturer
          ingredient = this@with.ingredient
          physicalCharacteristics = this@with.physicalCharacteristics
          otherCharacteristics = this@with.otherCharacteristics
        }
      }
  }
}
