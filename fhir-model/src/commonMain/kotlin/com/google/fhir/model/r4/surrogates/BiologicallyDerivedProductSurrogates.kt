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

import com.google.fhir.model.r4.BiologicallyDerivedProduct
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Decimal
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Integer
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class BiologicallyDerivedProductCollectionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var collector: Reference? = null,
  public var source: Reference? = null,
  public var collectedDateTime: KotlinString? = null,
  public var _collectedDateTime: Element? = null,
  public var collectedPeriod: Period? = null,
) {
  public fun toModel(): BiologicallyDerivedProduct.Collection =
    BiologicallyDerivedProduct.Collection(
      id = this@BiologicallyDerivedProductCollectionSurrogate.id,
      extension = this@BiologicallyDerivedProductCollectionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@BiologicallyDerivedProductCollectionSurrogate.modifierExtension ?: mutableListOf(),
      collector = this@BiologicallyDerivedProductCollectionSurrogate.collector,
      source = this@BiologicallyDerivedProductCollectionSurrogate.source,
      collected =
        BiologicallyDerivedProduct.Collection.Collected?.from(
          DateTime.of(
            FhirDateTime.fromString(
              this@BiologicallyDerivedProductCollectionSurrogate.collectedDateTime
            ),
            this@BiologicallyDerivedProductCollectionSurrogate._collectedDateTime,
          ),
          this@BiologicallyDerivedProductCollectionSurrogate.collectedPeriod,
        ),
    )

  public companion object {
    public fun fromModel(
      model: BiologicallyDerivedProduct.Collection
    ): BiologicallyDerivedProductCollectionSurrogate =
      with(model) {
        BiologicallyDerivedProductCollectionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          collector = this@with.collector,
          source = this@with.source,
          collectedDateTime = this@with.collected?.asDateTime()?.value?.value?.toString(),
          _collectedDateTime = this@with.collected?.asDateTime()?.value?.toElement(),
          collectedPeriod = this@with.collected?.asPeriod()?.value,
        )
      }
  }
}

@Serializable
internal data class BiologicallyDerivedProductProcessingSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var procedure: CodeableConcept? = null,
  public var additive: Reference? = null,
  public var timeDateTime: KotlinString? = null,
  public var _timeDateTime: Element? = null,
  public var timePeriod: Period? = null,
) {
  public fun toModel(): BiologicallyDerivedProduct.Processing =
    BiologicallyDerivedProduct.Processing(
      id = this@BiologicallyDerivedProductProcessingSurrogate.id,
      extension = this@BiologicallyDerivedProductProcessingSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@BiologicallyDerivedProductProcessingSurrogate.modifierExtension ?: mutableListOf(),
      description =
        R4String.of(
          this@BiologicallyDerivedProductProcessingSurrogate.description,
          this@BiologicallyDerivedProductProcessingSurrogate._description,
        ),
      procedure = this@BiologicallyDerivedProductProcessingSurrogate.procedure,
      additive = this@BiologicallyDerivedProductProcessingSurrogate.additive,
      time =
        BiologicallyDerivedProduct.Processing.Time?.from(
          DateTime.of(
            FhirDateTime.fromString(
              this@BiologicallyDerivedProductProcessingSurrogate.timeDateTime
            ),
            this@BiologicallyDerivedProductProcessingSurrogate._timeDateTime,
          ),
          this@BiologicallyDerivedProductProcessingSurrogate.timePeriod,
        ),
    )

  public companion object {
    public fun fromModel(
      model: BiologicallyDerivedProduct.Processing
    ): BiologicallyDerivedProductProcessingSurrogate =
      with(model) {
        BiologicallyDerivedProductProcessingSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          procedure = this@with.procedure,
          additive = this@with.additive,
          timeDateTime = this@with.time?.asDateTime()?.value?.value?.toString(),
          _timeDateTime = this@with.time?.asDateTime()?.value?.toElement(),
          timePeriod = this@with.time?.asPeriod()?.value,
        )
      }
  }
}

@Serializable
internal data class BiologicallyDerivedProductManipulationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var timeDateTime: KotlinString? = null,
  public var _timeDateTime: Element? = null,
  public var timePeriod: Period? = null,
) {
  public fun toModel(): BiologicallyDerivedProduct.Manipulation =
    BiologicallyDerivedProduct.Manipulation(
      id = this@BiologicallyDerivedProductManipulationSurrogate.id,
      extension = this@BiologicallyDerivedProductManipulationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@BiologicallyDerivedProductManipulationSurrogate.modifierExtension ?: mutableListOf(),
      description =
        R4String.of(
          this@BiologicallyDerivedProductManipulationSurrogate.description,
          this@BiologicallyDerivedProductManipulationSurrogate._description,
        ),
      time =
        BiologicallyDerivedProduct.Manipulation.Time?.from(
          DateTime.of(
            FhirDateTime.fromString(
              this@BiologicallyDerivedProductManipulationSurrogate.timeDateTime
            ),
            this@BiologicallyDerivedProductManipulationSurrogate._timeDateTime,
          ),
          this@BiologicallyDerivedProductManipulationSurrogate.timePeriod,
        ),
    )

  public companion object {
    public fun fromModel(
      model: BiologicallyDerivedProduct.Manipulation
    ): BiologicallyDerivedProductManipulationSurrogate =
      with(model) {
        BiologicallyDerivedProductManipulationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          timeDateTime = this@with.time?.asDateTime()?.value?.value?.toString(),
          _timeDateTime = this@with.time?.asDateTime()?.value?.toElement(),
          timePeriod = this@with.time?.asPeriod()?.value,
        )
      }
  }
}

@Serializable
internal data class BiologicallyDerivedProductStorageSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var temperature: Double? = null,
  public var _temperature: Element? = null,
  public var scale: KotlinString? = null,
  public var _scale: Element? = null,
  public var duration: Period? = null,
) {
  public fun toModel(): BiologicallyDerivedProduct.Storage =
    BiologicallyDerivedProduct.Storage(
      id = this@BiologicallyDerivedProductStorageSurrogate.id,
      extension = this@BiologicallyDerivedProductStorageSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@BiologicallyDerivedProductStorageSurrogate.modifierExtension ?: mutableListOf(),
      description =
        R4String.of(
          this@BiologicallyDerivedProductStorageSurrogate.description,
          this@BiologicallyDerivedProductStorageSurrogate._description,
        ),
      temperature =
        Decimal.of(
          this@BiologicallyDerivedProductStorageSurrogate.temperature,
          this@BiologicallyDerivedProductStorageSurrogate._temperature,
        ),
      scale =
        this@BiologicallyDerivedProductStorageSurrogate.scale?.let {
          Enumeration.of(
            com.google.fhir.model.r4.BiologicallyDerivedProduct
              .BiologicallyDerivedProductStorageScale
              .fromCode(it!!),
            this@BiologicallyDerivedProductStorageSurrogate._scale,
          )
        },
      duration = this@BiologicallyDerivedProductStorageSurrogate.duration,
    )

  public companion object {
    public fun fromModel(
      model: BiologicallyDerivedProduct.Storage
    ): BiologicallyDerivedProductStorageSurrogate =
      with(model) {
        BiologicallyDerivedProductStorageSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          temperature = this@with.temperature?.value,
          _temperature = this@with.temperature?.toElement(),
          scale = this@with.scale?.value?.getCode(),
          _scale = this@with.scale?.toElement(),
          duration = this@with.duration,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var productCategory: KotlinString? = null,
  public var _productCategory: Element? = null,
  public var productCode: CodeableConcept? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var request: MutableList<Reference>? = null,
  public var quantity: Int? = null,
  public var _quantity: Element? = null,
  public var parent: MutableList<Reference>? = null,
  public var collection: BiologicallyDerivedProduct.Collection? = null,
  public var processing: MutableList<BiologicallyDerivedProduct.Processing>? = null,
  public var manipulation: BiologicallyDerivedProduct.Manipulation? = null,
  public var storage: MutableList<BiologicallyDerivedProduct.Storage>? = null,
) {
  public fun toModel(): BiologicallyDerivedProduct =
    BiologicallyDerivedProduct(
      id = this@BiologicallyDerivedProductSurrogate.id,
      meta = this@BiologicallyDerivedProductSurrogate.meta,
      implicitRules =
        Uri.of(
          this@BiologicallyDerivedProductSurrogate.implicitRules,
          this@BiologicallyDerivedProductSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@BiologicallyDerivedProductSurrogate.language,
          this@BiologicallyDerivedProductSurrogate._language,
        ),
      text = this@BiologicallyDerivedProductSurrogate.text,
      contained = this@BiologicallyDerivedProductSurrogate.contained ?: mutableListOf(),
      extension = this@BiologicallyDerivedProductSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@BiologicallyDerivedProductSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@BiologicallyDerivedProductSurrogate.identifier ?: mutableListOf(),
      productCategory =
        this@BiologicallyDerivedProductSurrogate.productCategory?.let {
          Enumeration.of(
            com.google.fhir.model.r4.BiologicallyDerivedProduct.BiologicallyDerivedProductCategory
              .fromCode(it!!),
            this@BiologicallyDerivedProductSurrogate._productCategory,
          )
        },
      productCode = this@BiologicallyDerivedProductSurrogate.productCode,
      status =
        this@BiologicallyDerivedProductSurrogate.status?.let {
          Enumeration.of(
            com.google.fhir.model.r4.BiologicallyDerivedProduct.BiologicallyDerivedProductStatus
              .fromCode(it!!),
            this@BiologicallyDerivedProductSurrogate._status,
          )
        },
      request = this@BiologicallyDerivedProductSurrogate.request ?: mutableListOf(),
      quantity =
        Integer.of(
          this@BiologicallyDerivedProductSurrogate.quantity,
          this@BiologicallyDerivedProductSurrogate._quantity,
        ),
      parent = this@BiologicallyDerivedProductSurrogate.parent ?: mutableListOf(),
      collection = this@BiologicallyDerivedProductSurrogate.collection,
      processing = this@BiologicallyDerivedProductSurrogate.processing ?: mutableListOf(),
      manipulation = this@BiologicallyDerivedProductSurrogate.manipulation,
      storage = this@BiologicallyDerivedProductSurrogate.storage ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: BiologicallyDerivedProduct): BiologicallyDerivedProductSurrogate =
      with(model) {
        BiologicallyDerivedProductSurrogate(
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
          productCategory = this@with.productCategory?.value?.getCode(),
          _productCategory = this@with.productCategory?.toElement(),
          productCode = this@with.productCode,
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          request = this@with.request.takeUnless { it.all { it == null } },
          quantity = this@with.quantity?.value,
          _quantity = this@with.quantity?.toElement(),
          parent = this@with.parent.takeUnless { it.all { it == null } },
          collection = this@with.collection,
          processing = this@with.processing.takeUnless { it.all { it == null } },
          manipulation = this@with.manipulation,
          storage = this@with.storage.takeUnless { it.all { it == null } },
        )
      }
  }
}
