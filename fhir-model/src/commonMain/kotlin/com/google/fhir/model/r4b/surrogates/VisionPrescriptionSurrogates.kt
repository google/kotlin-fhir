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
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Decimal
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Integer
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.VisionPrescription
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class VisionPrescriptionLensSpecificationPrismSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var amount: Double? = null,
  public var _amount: Element? = null,
  public var base: KotlinString? = null,
  public var _base: Element? = null,
) {
  public fun toModel(): VisionPrescription.LensSpecification.Prism =
    VisionPrescription.LensSpecification.Prism().apply {
      id = this@VisionPrescriptionLensSpecificationPrismSurrogate.id
      extension = this@VisionPrescriptionLensSpecificationPrismSurrogate.extension
      modifierExtension = this@VisionPrescriptionLensSpecificationPrismSurrogate.modifierExtension
      amount =
        Decimal.of(
          this@VisionPrescriptionLensSpecificationPrismSurrogate.amount,
          this@VisionPrescriptionLensSpecificationPrismSurrogate._amount,
        )
      base =
        Enumeration.of(
          this@VisionPrescriptionLensSpecificationPrismSurrogate.base?.let {
            com.google.fhir.model.r4b.VisionPrescription.VisionBase.fromCode(it)
          },
          this@VisionPrescriptionLensSpecificationPrismSurrogate._base,
        )
    }

  public companion object {
    public fun fromModel(
      model: VisionPrescription.LensSpecification.Prism
    ): VisionPrescriptionLensSpecificationPrismSurrogate =
      with(model) {
        VisionPrescriptionLensSpecificationPrismSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          amount = this@with.amount?.value
          _amount = this@with.amount?.toElement()
          base = this@with.base?.value?.getCode()
          _base = this@with.base?.toElement()
        }
      }
  }
}

@Serializable
internal data class VisionPrescriptionLensSpecificationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var product: CodeableConcept? = null,
  public var eye: KotlinString? = null,
  public var _eye: Element? = null,
  public var sphere: Double? = null,
  public var _sphere: Element? = null,
  public var cylinder: Double? = null,
  public var _cylinder: Element? = null,
  public var axis: Int? = null,
  public var _axis: Element? = null,
  public var prism: List<VisionPrescription.LensSpecification.Prism>? = null,
  public var add: Double? = null,
  public var _add: Element? = null,
  public var power: Double? = null,
  public var _power: Element? = null,
  public var backCurve: Double? = null,
  public var _backCurve: Element? = null,
  public var diameter: Double? = null,
  public var _diameter: Element? = null,
  public var duration: Quantity? = null,
  public var color: KotlinString? = null,
  public var _color: Element? = null,
  public var brand: KotlinString? = null,
  public var _brand: Element? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): VisionPrescription.LensSpecification =
    VisionPrescription.LensSpecification().apply {
      id = this@VisionPrescriptionLensSpecificationSurrogate.id
      extension = this@VisionPrescriptionLensSpecificationSurrogate.extension
      modifierExtension = this@VisionPrescriptionLensSpecificationSurrogate.modifierExtension
      product = this@VisionPrescriptionLensSpecificationSurrogate.product
      eye =
        Enumeration.of(
          this@VisionPrescriptionLensSpecificationSurrogate.eye?.let {
            com.google.fhir.model.r4b.VisionPrescription.VisionEyes.fromCode(it)
          },
          this@VisionPrescriptionLensSpecificationSurrogate._eye,
        )
      sphere =
        Decimal.of(
          this@VisionPrescriptionLensSpecificationSurrogate.sphere,
          this@VisionPrescriptionLensSpecificationSurrogate._sphere,
        )
      cylinder =
        Decimal.of(
          this@VisionPrescriptionLensSpecificationSurrogate.cylinder,
          this@VisionPrescriptionLensSpecificationSurrogate._cylinder,
        )
      axis =
        Integer.of(
          this@VisionPrescriptionLensSpecificationSurrogate.axis,
          this@VisionPrescriptionLensSpecificationSurrogate._axis,
        )
      prism = this@VisionPrescriptionLensSpecificationSurrogate.prism
      add =
        Decimal.of(
          this@VisionPrescriptionLensSpecificationSurrogate.add,
          this@VisionPrescriptionLensSpecificationSurrogate._add,
        )
      power =
        Decimal.of(
          this@VisionPrescriptionLensSpecificationSurrogate.power,
          this@VisionPrescriptionLensSpecificationSurrogate._power,
        )
      backCurve =
        Decimal.of(
          this@VisionPrescriptionLensSpecificationSurrogate.backCurve,
          this@VisionPrescriptionLensSpecificationSurrogate._backCurve,
        )
      diameter =
        Decimal.of(
          this@VisionPrescriptionLensSpecificationSurrogate.diameter,
          this@VisionPrescriptionLensSpecificationSurrogate._diameter,
        )
      duration = this@VisionPrescriptionLensSpecificationSurrogate.duration
      color =
        R4bString.of(
          this@VisionPrescriptionLensSpecificationSurrogate.color,
          this@VisionPrescriptionLensSpecificationSurrogate._color,
        )
      brand =
        R4bString.of(
          this@VisionPrescriptionLensSpecificationSurrogate.brand,
          this@VisionPrescriptionLensSpecificationSurrogate._brand,
        )
      note = this@VisionPrescriptionLensSpecificationSurrogate.note
    }

  public companion object {
    public fun fromModel(
      model: VisionPrescription.LensSpecification
    ): VisionPrescriptionLensSpecificationSurrogate =
      with(model) {
        VisionPrescriptionLensSpecificationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          product = this@with.product
          eye = this@with.eye?.value?.getCode()
          _eye = this@with.eye?.toElement()
          sphere = this@with.sphere?.value
          _sphere = this@with.sphere?.toElement()
          cylinder = this@with.cylinder?.value
          _cylinder = this@with.cylinder?.toElement()
          axis = this@with.axis?.value
          _axis = this@with.axis?.toElement()
          prism = this@with.prism
          add = this@with.add?.value
          _add = this@with.add?.toElement()
          power = this@with.power?.value
          _power = this@with.power?.toElement()
          backCurve = this@with.backCurve?.value
          _backCurve = this@with.backCurve?.toElement()
          diameter = this@with.diameter?.value
          _diameter = this@with.diameter?.toElement()
          duration = this@with.duration
          color = this@with.color?.value
          _color = this@with.color?.toElement()
          brand = this@with.brand?.value
          _brand = this@with.brand?.toElement()
          note = this@with.note
        }
      }
  }
}

@Serializable
internal data class VisionPrescriptionSurrogate(
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
  public var created: KotlinString? = null,
  public var _created: Element? = null,
  public var patient: Reference? = null,
  public var encounter: Reference? = null,
  public var dateWritten: KotlinString? = null,
  public var _dateWritten: Element? = null,
  public var prescriber: Reference? = null,
  public var lensSpecification: List<VisionPrescription.LensSpecification>? = null,
) {
  public fun toModel(): VisionPrescription =
    VisionPrescription().apply {
      id = this@VisionPrescriptionSurrogate.id
      meta = this@VisionPrescriptionSurrogate.meta
      implicitRules =
        Uri.of(
          this@VisionPrescriptionSurrogate.implicitRules,
          this@VisionPrescriptionSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@VisionPrescriptionSurrogate.language,
          this@VisionPrescriptionSurrogate._language,
        )
      text = this@VisionPrescriptionSurrogate.text
      contained = this@VisionPrescriptionSurrogate.contained
      extension = this@VisionPrescriptionSurrogate.extension
      modifierExtension = this@VisionPrescriptionSurrogate.modifierExtension
      identifier = this@VisionPrescriptionSurrogate.identifier
      status =
        Enumeration.of(
          this@VisionPrescriptionSurrogate.status?.let {
            com.google.fhir.model.r4b.VisionPrescription.VisionStatus.fromCode(it)
          },
          this@VisionPrescriptionSurrogate._status,
        )
      created =
        DateTime.of(
          FhirDateTime.fromString(this@VisionPrescriptionSurrogate.created),
          this@VisionPrescriptionSurrogate._created,
        )
      patient = this@VisionPrescriptionSurrogate.patient
      encounter = this@VisionPrescriptionSurrogate.encounter
      dateWritten =
        DateTime.of(
          FhirDateTime.fromString(this@VisionPrescriptionSurrogate.dateWritten),
          this@VisionPrescriptionSurrogate._dateWritten,
        )
      prescriber = this@VisionPrescriptionSurrogate.prescriber
      lensSpecification = this@VisionPrescriptionSurrogate.lensSpecification
    }

  public companion object {
    public fun fromModel(model: VisionPrescription): VisionPrescriptionSurrogate =
      with(model) {
        VisionPrescriptionSurrogate().apply {
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
          created = this@with.created?.value?.toString()
          _created = this@with.created?.toElement()
          patient = this@with.patient
          encounter = this@with.encounter
          dateWritten = this@with.dateWritten?.value?.toString()
          _dateWritten = this@with.dateWritten?.toElement()
          prescriber = this@with.prescriber
          lensSpecification = this@with.lensSpecification
        }
      }
  }
}
