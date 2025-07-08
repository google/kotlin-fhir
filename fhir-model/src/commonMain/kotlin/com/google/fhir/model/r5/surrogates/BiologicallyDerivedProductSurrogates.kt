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
import com.google.fhir.model.r5.BiologicallyDerivedProduct
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Integer
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Ratio
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal class BiologicallyDerivedProductCollectionCollectedSurrogate {
  public var collectedDateTime: KotlinString? = null

  public var _collectedDateTime: Element? = null

  public var collectedPeriod: Period? = null

  public fun toModel(): BiologicallyDerivedProduct.Collection.Collected =
    BiologicallyDerivedProduct.Collection.Collected?.from(
      DateTime.of(
        FhirDateTime.fromString(
          this@BiologicallyDerivedProductCollectionCollectedSurrogate.collectedDateTime
        ),
        this@BiologicallyDerivedProductCollectionCollectedSurrogate._collectedDateTime,
      ),
      this@BiologicallyDerivedProductCollectionCollectedSurrogate.collectedPeriod,
    ) ?: BiologicallyDerivedProduct.Collection.Collected.Null

  public companion object {
    public fun fromModel(
      model: BiologicallyDerivedProduct.Collection.Collected
    ): BiologicallyDerivedProductCollectionCollectedSurrogate =
      with(model) {
        BiologicallyDerivedProductCollectionCollectedSurrogate().apply {
          collectedDateTime = this@with.asDateTime()?.value?.value?.toString()
          _collectedDateTime = this@with.asDateTime()?.value?.toElement()
          collectedPeriod = this@with.asPeriod()?.value
        }
      }
  }
}

@Serializable
internal data class BiologicallyDerivedProductCollectionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var collector: Reference? = null,
  public var source: Reference? = null,
  public var collected: BiologicallyDerivedProduct.Collection.Collected? = null,
) {
  public fun toModel(): BiologicallyDerivedProduct.Collection =
    BiologicallyDerivedProduct.Collection().apply {
      id = this@BiologicallyDerivedProductCollectionSurrogate.id
      extension = this@BiologicallyDerivedProductCollectionSurrogate.extension
      modifierExtension = this@BiologicallyDerivedProductCollectionSurrogate.modifierExtension
      collector = this@BiologicallyDerivedProductCollectionSurrogate.collector
      source = this@BiologicallyDerivedProductCollectionSurrogate.source
      collected = this@BiologicallyDerivedProductCollectionSurrogate.collected
    }

  public companion object {
    public fun fromModel(
      model: BiologicallyDerivedProduct.Collection
    ): BiologicallyDerivedProductCollectionSurrogate =
      with(model) {
        BiologicallyDerivedProductCollectionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          collector = this@with.collector
          source = this@with.source
          collected = this@with.collected
        }
      }
  }
}

@Serializable
internal class BiologicallyDerivedProductPropertyValueSurrogate {
  public var valueBoolean: KotlinBoolean? = null

  public var _valueBoolean: Element? = null

  public var valueInteger: Int? = null

  public var _valueInteger: Element? = null

  public var valueCodeableConcept: CodeableConcept? = null

  public var valuePeriod: Period? = null

  public var valueQuantity: Quantity? = null

  public var valueRange: Range? = null

  public var valueRatio: Ratio? = null

  public var valueString: KotlinString? = null

  public var _valueString: Element? = null

  public var valueAttachment: Attachment? = null

  public fun toModel(): BiologicallyDerivedProduct.Property.Value =
    BiologicallyDerivedProduct.Property.Value?.from(
      R5Boolean.of(
        this@BiologicallyDerivedProductPropertyValueSurrogate.valueBoolean,
        this@BiologicallyDerivedProductPropertyValueSurrogate._valueBoolean,
      ),
      Integer.of(
        this@BiologicallyDerivedProductPropertyValueSurrogate.valueInteger,
        this@BiologicallyDerivedProductPropertyValueSurrogate._valueInteger,
      ),
      this@BiologicallyDerivedProductPropertyValueSurrogate.valueCodeableConcept,
      this@BiologicallyDerivedProductPropertyValueSurrogate.valuePeriod,
      this@BiologicallyDerivedProductPropertyValueSurrogate.valueQuantity,
      this@BiologicallyDerivedProductPropertyValueSurrogate.valueRange,
      this@BiologicallyDerivedProductPropertyValueSurrogate.valueRatio,
      R5String.of(
        this@BiologicallyDerivedProductPropertyValueSurrogate.valueString,
        this@BiologicallyDerivedProductPropertyValueSurrogate._valueString,
      ),
      this@BiologicallyDerivedProductPropertyValueSurrogate.valueAttachment,
    ) ?: BiologicallyDerivedProduct.Property.Value.Null

  public companion object {
    public fun fromModel(
      model: BiologicallyDerivedProduct.Property.Value
    ): BiologicallyDerivedProductPropertyValueSurrogate =
      with(model) {
        BiologicallyDerivedProductPropertyValueSurrogate().apply {
          valueBoolean = this@with.asBoolean()?.value?.value
          _valueBoolean = this@with.asBoolean()?.value?.toElement()
          valueInteger = this@with.asInteger()?.value?.value
          _valueInteger = this@with.asInteger()?.value?.toElement()
          valueCodeableConcept = this@with.asCodeableConcept()?.value
          valuePeriod = this@with.asPeriod()?.value
          valueQuantity = this@with.asQuantity()?.value
          valueRange = this@with.asRange()?.value
          valueRatio = this@with.asRatio()?.value
          valueString = this@with.asString()?.value?.value
          _valueString = this@with.asString()?.value?.toElement()
          valueAttachment = this@with.asAttachment()?.value
        }
      }
  }
}

@Serializable
internal data class BiologicallyDerivedProductPropertySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var `value`: BiologicallyDerivedProduct.Property.Value? = null,
) {
  public fun toModel(): BiologicallyDerivedProduct.Property =
    BiologicallyDerivedProduct.Property().apply {
      id = this@BiologicallyDerivedProductPropertySurrogate.id
      extension = this@BiologicallyDerivedProductPropertySurrogate.extension
      modifierExtension = this@BiologicallyDerivedProductPropertySurrogate.modifierExtension
      type = this@BiologicallyDerivedProductPropertySurrogate.type
      `value` = this@BiologicallyDerivedProductPropertySurrogate.`value`
    }

  public companion object {
    public fun fromModel(
      model: BiologicallyDerivedProduct.Property
    ): BiologicallyDerivedProductPropertySurrogate =
      with(model) {
        BiologicallyDerivedProductPropertySurrogate().apply {
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
internal data class BiologicallyDerivedProductSurrogate(
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
  public var productCategory: Coding? = null,
  public var productCode: CodeableConcept? = null,
  public var parent: List<Reference?>? = null,
  public var request: List<Reference?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var biologicalSourceEvent: Identifier? = null,
  public var processingFacility: List<Reference?>? = null,
  public var division: KotlinString? = null,
  public var _division: Element? = null,
  public var productStatus: Coding? = null,
  public var expirationDate: KotlinString? = null,
  public var _expirationDate: Element? = null,
  public var collection: BiologicallyDerivedProduct.Collection? = null,
  public var storageTempRequirements: Range? = null,
  public var `property`: List<BiologicallyDerivedProduct.Property>? = null,
) {
  public fun toModel(): BiologicallyDerivedProduct =
    BiologicallyDerivedProduct().apply {
      id = this@BiologicallyDerivedProductSurrogate.id
      meta = this@BiologicallyDerivedProductSurrogate.meta
      implicitRules =
        Uri.of(
          this@BiologicallyDerivedProductSurrogate.implicitRules,
          this@BiologicallyDerivedProductSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@BiologicallyDerivedProductSurrogate.language,
          this@BiologicallyDerivedProductSurrogate._language,
        )
      text = this@BiologicallyDerivedProductSurrogate.text
      contained = this@BiologicallyDerivedProductSurrogate.contained
      extension = this@BiologicallyDerivedProductSurrogate.extension
      modifierExtension = this@BiologicallyDerivedProductSurrogate.modifierExtension
      productCategory = this@BiologicallyDerivedProductSurrogate.productCategory
      productCode = this@BiologicallyDerivedProductSurrogate.productCode
      parent = this@BiologicallyDerivedProductSurrogate.parent
      request = this@BiologicallyDerivedProductSurrogate.request
      identifier = this@BiologicallyDerivedProductSurrogate.identifier
      biologicalSourceEvent = this@BiologicallyDerivedProductSurrogate.biologicalSourceEvent
      processingFacility = this@BiologicallyDerivedProductSurrogate.processingFacility
      division =
        R5String.of(
          this@BiologicallyDerivedProductSurrogate.division,
          this@BiologicallyDerivedProductSurrogate._division,
        )
      productStatus = this@BiologicallyDerivedProductSurrogate.productStatus
      expirationDate =
        DateTime.of(
          FhirDateTime.fromString(this@BiologicallyDerivedProductSurrogate.expirationDate),
          this@BiologicallyDerivedProductSurrogate._expirationDate,
        )
      collection = this@BiologicallyDerivedProductSurrogate.collection
      storageTempRequirements = this@BiologicallyDerivedProductSurrogate.storageTempRequirements
      `property` = this@BiologicallyDerivedProductSurrogate.`property`
    }

  public companion object {
    public fun fromModel(model: BiologicallyDerivedProduct): BiologicallyDerivedProductSurrogate =
      with(model) {
        BiologicallyDerivedProductSurrogate().apply {
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
          productCategory = this@with.productCategory
          productCode = this@with.productCode
          parent = this@with.parent
          request = this@with.request
          identifier = this@with.identifier
          biologicalSourceEvent = this@with.biologicalSourceEvent
          processingFacility = this@with.processingFacility
          division = this@with.division?.value
          _division = this@with.division?.toElement()
          productStatus = this@with.productStatus
          expirationDate = this@with.expirationDate?.value?.toString()
          _expirationDate = this@with.expirationDate?.toElement()
          collection = this@with.collection
          storageTempRequirements = this@with.storageTempRequirements
          `property` = this@with.`property`
        }
      }
  }
}
