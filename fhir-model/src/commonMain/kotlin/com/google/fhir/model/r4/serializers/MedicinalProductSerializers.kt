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

@file:Suppress("RedundantVisibilityModifier", "PropertyName")

package com.google.fhir.model.r4.serializers

import com.google.fhir.model.r4.MedicinalProduct
import com.google.fhir.model.r4.surrogates.MedicinalProductManufacturingBusinessOperationSurrogate
import com.google.fhir.model.r4.surrogates.MedicinalProductNameCountryLanguageSurrogate
import com.google.fhir.model.r4.surrogates.MedicinalProductNameNamePartSurrogate
import com.google.fhir.model.r4.surrogates.MedicinalProductNameSurrogate
import com.google.fhir.model.r4.surrogates.MedicinalProductSpecialDesignationSurrogate
import com.google.fhir.model.r4.surrogates.MedicinalProductSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object MedicinalProductNameNamePartSerializer : KSerializer<MedicinalProduct.Name.NamePart> {
  internal val surrogateSerializer: KSerializer<MedicinalProductNameNamePartSurrogate> by lazy {
    MedicinalProductNameNamePartSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("NamePart", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicinalProduct.Name.NamePart =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicinalProduct.Name.NamePart) {
    surrogateSerializer.serialize(encoder, MedicinalProductNameNamePartSurrogate.fromModel(value))
  }
}

public object MedicinalProductNameCountryLanguageSerializer :
  KSerializer<MedicinalProduct.Name.CountryLanguage> {
  internal val surrogateSerializer:
    KSerializer<MedicinalProductNameCountryLanguageSurrogate> by lazy {
    MedicinalProductNameCountryLanguageSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("CountryLanguage", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicinalProduct.Name.CountryLanguage =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicinalProduct.Name.CountryLanguage) {
    surrogateSerializer.serialize(
      encoder,
      MedicinalProductNameCountryLanguageSurrogate.fromModel(value),
    )
  }
}

public object MedicinalProductNameSerializer : KSerializer<MedicinalProduct.Name> {
  internal val surrogateSerializer: KSerializer<MedicinalProductNameSurrogate> by lazy {
    MedicinalProductNameSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Name", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicinalProduct.Name =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicinalProduct.Name) {
    surrogateSerializer.serialize(encoder, MedicinalProductNameSurrogate.fromModel(value))
  }
}

public object MedicinalProductManufacturingBusinessOperationSerializer :
  KSerializer<MedicinalProduct.ManufacturingBusinessOperation> {
  internal val surrogateSerializer:
    KSerializer<MedicinalProductManufacturingBusinessOperationSurrogate> by lazy {
    MedicinalProductManufacturingBusinessOperationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("ManufacturingBusinessOperation", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicinalProduct.ManufacturingBusinessOperation =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(
    encoder: Encoder,
    `value`: MedicinalProduct.ManufacturingBusinessOperation,
  ) {
    surrogateSerializer.serialize(
      encoder,
      MedicinalProductManufacturingBusinessOperationSurrogate.fromModel(value),
    )
  }
}

public object MedicinalProductSpecialDesignationSerializer :
  KSerializer<MedicinalProduct.SpecialDesignation> {
  internal val surrogateSerializer:
    KSerializer<MedicinalProductSpecialDesignationSurrogate> by lazy {
    MedicinalProductSpecialDesignationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("SpecialDesignation", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicinalProduct.SpecialDesignation =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicinalProduct.SpecialDesignation) {
    surrogateSerializer.serialize(
      encoder,
      MedicinalProductSpecialDesignationSurrogate.fromModel(value),
    )
  }
}

public object MedicinalProductSerializer : KSerializer<MedicinalProduct> {
  internal val surrogateSerializer: KSerializer<MedicinalProductSurrogate> by lazy {
    MedicinalProductSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("MedicinalProduct", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): MedicinalProduct =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: MedicinalProduct) {
    surrogateSerializer.serialize(encoder, MedicinalProductSurrogate.fromModel(value))
  }
}
