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
import com.google.fhir.model.r4b.Decimal
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Integer
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.ObservationDefinition
import com.google.fhir.model.r4b.Range
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ObservationDefinitionQuantitativeDetailsSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var customaryUnit: CodeableConcept? = null,
  public var unit: CodeableConcept? = null,
  public var conversionFactor: Double? = null,
  public var _conversionFactor: Element? = null,
  public var decimalPrecision: Int? = null,
  public var _decimalPrecision: Element? = null,
) {
  public fun toModel(): ObservationDefinition.QuantitativeDetails =
    ObservationDefinition.QuantitativeDetails().apply {
      id = this@ObservationDefinitionQuantitativeDetailsSurrogate.id
      extension = this@ObservationDefinitionQuantitativeDetailsSurrogate.extension
      modifierExtension = this@ObservationDefinitionQuantitativeDetailsSurrogate.modifierExtension
      customaryUnit = this@ObservationDefinitionQuantitativeDetailsSurrogate.customaryUnit
      unit = this@ObservationDefinitionQuantitativeDetailsSurrogate.unit
      conversionFactor =
        Decimal.of(
          this@ObservationDefinitionQuantitativeDetailsSurrogate.conversionFactor,
          this@ObservationDefinitionQuantitativeDetailsSurrogate._conversionFactor,
        )
      decimalPrecision =
        Integer.of(
          this@ObservationDefinitionQuantitativeDetailsSurrogate.decimalPrecision,
          this@ObservationDefinitionQuantitativeDetailsSurrogate._decimalPrecision,
        )
    }

  public companion object {
    public fun fromModel(
      model: ObservationDefinition.QuantitativeDetails
    ): ObservationDefinitionQuantitativeDetailsSurrogate =
      with(model) {
        ObservationDefinitionQuantitativeDetailsSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          customaryUnit = this@with.customaryUnit
          unit = this@with.unit
          conversionFactor = this@with.conversionFactor?.value
          _conversionFactor = this@with.conversionFactor?.toElement()
          decimalPrecision = this@with.decimalPrecision?.value
          _decimalPrecision = this@with.decimalPrecision?.toElement()
        }
      }
  }
}

@Serializable
internal data class ObservationDefinitionQualifiedIntervalSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var category: KotlinString? = null,
  public var _category: Element? = null,
  public var range: Range? = null,
  public var context: CodeableConcept? = null,
  public var appliesTo: List<CodeableConcept?>? = null,
  public var gender: KotlinString? = null,
  public var _gender: Element? = null,
  public var age: Range? = null,
  public var gestationalAge: Range? = null,
  public var condition: KotlinString? = null,
  public var _condition: Element? = null,
) {
  public fun toModel(): ObservationDefinition.QualifiedInterval =
    ObservationDefinition.QualifiedInterval().apply {
      id = this@ObservationDefinitionQualifiedIntervalSurrogate.id
      extension = this@ObservationDefinitionQualifiedIntervalSurrogate.extension
      modifierExtension = this@ObservationDefinitionQualifiedIntervalSurrogate.modifierExtension
      category =
        Enumeration.of(
          this@ObservationDefinitionQualifiedIntervalSurrogate.category?.let {
            com.google.fhir.model.r4b.ObservationDefinition.ObservationRangeCategory.fromCode(it)
          },
          this@ObservationDefinitionQualifiedIntervalSurrogate._category,
        )
      range = this@ObservationDefinitionQualifiedIntervalSurrogate.range
      context = this@ObservationDefinitionQualifiedIntervalSurrogate.context
      appliesTo = this@ObservationDefinitionQualifiedIntervalSurrogate.appliesTo
      gender =
        Enumeration.of(
          this@ObservationDefinitionQualifiedIntervalSurrogate.gender?.let {
            com.google.fhir.model.r4b.AdministrativeGender.fromCode(it)
          },
          this@ObservationDefinitionQualifiedIntervalSurrogate._gender,
        )
      age = this@ObservationDefinitionQualifiedIntervalSurrogate.age
      gestationalAge = this@ObservationDefinitionQualifiedIntervalSurrogate.gestationalAge
      condition =
        R4bString.of(
          this@ObservationDefinitionQualifiedIntervalSurrogate.condition,
          this@ObservationDefinitionQualifiedIntervalSurrogate._condition,
        )
    }

  public companion object {
    public fun fromModel(
      model: ObservationDefinition.QualifiedInterval
    ): ObservationDefinitionQualifiedIntervalSurrogate =
      with(model) {
        ObservationDefinitionQualifiedIntervalSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          category = this@with.category?.value?.getCode()
          _category = this@with.category?.toElement()
          range = this@with.range
          context = this@with.context
          appliesTo = this@with.appliesTo
          gender = this@with.gender?.value?.getCode()
          _gender = this@with.gender?.toElement()
          age = this@with.age
          gestationalAge = this@with.gestationalAge
          condition = this@with.condition?.value
          _condition = this@with.condition?.toElement()
        }
      }
  }
}

@Serializable
internal data class ObservationDefinitionSurrogate(
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
  public var category: List<CodeableConcept?>? = null,
  public var code: CodeableConcept? = null,
  public var identifier: List<Identifier?>? = null,
  public var permittedDataType: List<KotlinString?>? = null,
  public var _permittedDataType: List<Element?>? = null,
  public var multipleResultsAllowed: KotlinBoolean? = null,
  public var _multipleResultsAllowed: Element? = null,
  public var method: CodeableConcept? = null,
  public var preferredReportName: KotlinString? = null,
  public var _preferredReportName: Element? = null,
  public var quantitativeDetails: ObservationDefinition.QuantitativeDetails? = null,
  public var qualifiedInterval: List<ObservationDefinition.QualifiedInterval>? = null,
  public var validCodedValueSet: Reference? = null,
  public var normalCodedValueSet: Reference? = null,
  public var abnormalCodedValueSet: Reference? = null,
  public var criticalCodedValueSet: Reference? = null,
) {
  public fun toModel(): ObservationDefinition =
    ObservationDefinition().apply {
      id = this@ObservationDefinitionSurrogate.id
      meta = this@ObservationDefinitionSurrogate.meta
      implicitRules =
        Uri.of(
          this@ObservationDefinitionSurrogate.implicitRules,
          this@ObservationDefinitionSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@ObservationDefinitionSurrogate.language,
          this@ObservationDefinitionSurrogate._language,
        )
      text = this@ObservationDefinitionSurrogate.text
      contained = this@ObservationDefinitionSurrogate.contained
      extension = this@ObservationDefinitionSurrogate.extension
      modifierExtension = this@ObservationDefinitionSurrogate.modifierExtension
      category = this@ObservationDefinitionSurrogate.category
      code = this@ObservationDefinitionSurrogate.code
      identifier = this@ObservationDefinitionSurrogate.identifier
      permittedDataType =
        if (
          this@ObservationDefinitionSurrogate.permittedDataType == null &&
            this@ObservationDefinitionSurrogate._permittedDataType == null
        ) {
          null
        } else {
          (this@ObservationDefinitionSurrogate.permittedDataType
              ?: List(this@ObservationDefinitionSurrogate._permittedDataType!!.size) { null })
            .zip(
              this@ObservationDefinitionSurrogate._permittedDataType
                ?: List(this@ObservationDefinitionSurrogate.permittedDataType!!.size) { null }
            )
            .mapNotNull { (value, element) ->
              Enumeration.of(
                value?.let {
                  com.google.fhir.model.r4b.ObservationDefinition.ObservationDataType.fromCode(it)
                },
                element,
              )
            }
        }
      multipleResultsAllowed =
        R4bBoolean.of(
          this@ObservationDefinitionSurrogate.multipleResultsAllowed,
          this@ObservationDefinitionSurrogate._multipleResultsAllowed,
        )
      method = this@ObservationDefinitionSurrogate.method
      preferredReportName =
        R4bString.of(
          this@ObservationDefinitionSurrogate.preferredReportName,
          this@ObservationDefinitionSurrogate._preferredReportName,
        )
      quantitativeDetails = this@ObservationDefinitionSurrogate.quantitativeDetails
      qualifiedInterval = this@ObservationDefinitionSurrogate.qualifiedInterval
      validCodedValueSet = this@ObservationDefinitionSurrogate.validCodedValueSet
      normalCodedValueSet = this@ObservationDefinitionSurrogate.normalCodedValueSet
      abnormalCodedValueSet = this@ObservationDefinitionSurrogate.abnormalCodedValueSet
      criticalCodedValueSet = this@ObservationDefinitionSurrogate.criticalCodedValueSet
    }

  public companion object {
    public fun fromModel(model: ObservationDefinition): ObservationDefinitionSurrogate =
      with(model) {
        ObservationDefinitionSurrogate().apply {
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
          category = this@with.category
          code = this@with.code
          identifier = this@with.identifier
          permittedDataType =
            this@with.permittedDataType
              ?.map { it?.value?.getCode() }
              ?.takeUnless { it.all { it == null } }
          _permittedDataType =
            this@with.permittedDataType
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          multipleResultsAllowed = this@with.multipleResultsAllowed?.value
          _multipleResultsAllowed = this@with.multipleResultsAllowed?.toElement()
          method = this@with.method
          preferredReportName = this@with.preferredReportName?.value
          _preferredReportName = this@with.preferredReportName?.toElement()
          quantitativeDetails = this@with.quantitativeDetails
          qualifiedInterval = this@with.qualifiedInterval
          validCodedValueSet = this@with.validCodedValueSet
          normalCodedValueSet = this@with.normalCodedValueSet
          abnormalCodedValueSet = this@with.abnormalCodedValueSet
          criticalCodedValueSet = this@with.criticalCodedValueSet
        }
      }
  }
}
