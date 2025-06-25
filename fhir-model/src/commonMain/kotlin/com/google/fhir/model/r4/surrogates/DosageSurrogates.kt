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
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Dosage
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Integer
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Range
import com.google.fhir.model.r4.Ratio
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Timing
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class DosageDoseAndRateSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var doseRange: Range? = null,
  public var doseQuantity: Quantity? = null,
  public var rateRatio: Ratio? = null,
  public var rateRange: Range? = null,
  public var rateQuantity: Quantity? = null,
) {
  public fun toModel(): Dosage.DoseAndRate =
    Dosage.DoseAndRate().apply {
      id = this@DosageDoseAndRateSurrogate.id
      extension = this@DosageDoseAndRateSurrogate.extension
      type = this@DosageDoseAndRateSurrogate.type
      dose =
        Dosage.DoseAndRate.Dose?.from(
          this@DosageDoseAndRateSurrogate.doseRange,
          this@DosageDoseAndRateSurrogate.doseQuantity,
        )
      rate =
        Dosage.DoseAndRate.Rate?.from(
          this@DosageDoseAndRateSurrogate.rateRatio,
          this@DosageDoseAndRateSurrogate.rateRange,
          this@DosageDoseAndRateSurrogate.rateQuantity,
        )
    }

  public companion object {
    public fun fromModel(model: Dosage.DoseAndRate): DosageDoseAndRateSurrogate =
      with(model) {
        DosageDoseAndRateSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          type = this@with.type
          doseRange = this@with.dose?.asRange()?.value
          doseQuantity = this@with.dose?.asQuantity()?.value
          rateRatio = this@with.rate?.asRatio()?.value
          rateRange = this@with.rate?.asRange()?.value
          rateQuantity = this@with.rate?.asQuantity()?.value
        }
      }
  }
}

@Serializable
internal data class DosageSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var additionalInstruction: List<CodeableConcept?>? = null,
  public var patientInstruction: KotlinString? = null,
  public var _patientInstruction: Element? = null,
  public var timing: Timing? = null,
  public var asNeededBoolean: KotlinBoolean? = null,
  public var _asNeededBoolean: Element? = null,
  public var asNeededCodeableConcept: CodeableConcept? = null,
  public var site: CodeableConcept? = null,
  public var route: CodeableConcept? = null,
  public var method: CodeableConcept? = null,
  public var doseAndRate: List<Dosage.DoseAndRate>? = null,
  public var maxDosePerPeriod: Ratio? = null,
  public var maxDosePerAdministration: Quantity? = null,
  public var maxDosePerLifetime: Quantity? = null,
) {
  public fun toModel(): Dosage =
    Dosage().apply {
      id = this@DosageSurrogate.id
      extension = this@DosageSurrogate.extension
      modifierExtension = this@DosageSurrogate.modifierExtension
      sequence = Integer.of(this@DosageSurrogate.sequence, this@DosageSurrogate._sequence)
      text = R4String.of(this@DosageSurrogate.text, this@DosageSurrogate._text)
      additionalInstruction = this@DosageSurrogate.additionalInstruction
      patientInstruction =
        R4String.of(
          this@DosageSurrogate.patientInstruction,
          this@DosageSurrogate._patientInstruction,
        )
      timing = this@DosageSurrogate.timing
      asNeeded =
        Dosage.AsNeeded?.from(
          R4Boolean.of(this@DosageSurrogate.asNeededBoolean, this@DosageSurrogate._asNeededBoolean),
          this@DosageSurrogate.asNeededCodeableConcept,
        )
      site = this@DosageSurrogate.site
      route = this@DosageSurrogate.route
      method = this@DosageSurrogate.method
      doseAndRate = this@DosageSurrogate.doseAndRate
      maxDosePerPeriod = this@DosageSurrogate.maxDosePerPeriod
      maxDosePerAdministration = this@DosageSurrogate.maxDosePerAdministration
      maxDosePerLifetime = this@DosageSurrogate.maxDosePerLifetime
    }

  public companion object {
    public fun fromModel(model: Dosage): DosageSurrogate =
      with(model) {
        DosageSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          text = this@with.text?.value
          _text = this@with.text?.toElement()
          additionalInstruction = this@with.additionalInstruction
          patientInstruction = this@with.patientInstruction?.value
          _patientInstruction = this@with.patientInstruction?.toElement()
          timing = this@with.timing
          asNeededBoolean = this@with.asNeeded?.asBoolean()?.value?.value
          _asNeededBoolean = this@with.asNeeded?.asBoolean()?.value?.toElement()
          asNeededCodeableConcept = this@with.asNeeded?.asCodeableConcept()?.value
          site = this@with.site
          route = this@with.route
          method = this@with.method
          doseAndRate = this@with.doseAndRate
          maxDosePerPeriod = this@with.maxDosePerPeriod
          maxDosePerAdministration = this@with.maxDosePerAdministration
          maxDosePerLifetime = this@with.maxDosePerLifetime
        }
      }
  }
}
