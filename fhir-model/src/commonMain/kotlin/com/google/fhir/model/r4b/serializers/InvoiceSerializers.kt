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

package com.google.fhir.model.r4b.serializers

import com.google.fhir.model.r4b.Invoice
import com.google.fhir.model.r4b.surrogates.InvoiceLineItemPriceComponentSurrogate
import com.google.fhir.model.r4b.surrogates.InvoiceLineItemSurrogate
import com.google.fhir.model.r4b.surrogates.InvoiceParticipantSurrogate
import com.google.fhir.model.r4b.surrogates.InvoiceSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object InvoiceParticipantSerializer : KSerializer<Invoice.Participant> {
  internal val surrogateSerializer: KSerializer<InvoiceParticipantSurrogate> by lazy {
    InvoiceParticipantSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Participant", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Invoice.Participant =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Invoice.Participant) {
    surrogateSerializer.serialize(encoder, InvoiceParticipantSurrogate.fromModel(value))
  }
}

public object InvoiceLineItemPriceComponentSerializer :
  KSerializer<Invoice.LineItem.PriceComponent> {
  internal val surrogateSerializer: KSerializer<InvoiceLineItemPriceComponentSurrogate> by lazy {
    InvoiceLineItemPriceComponentSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("PriceComponent", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Invoice.LineItem.PriceComponent =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Invoice.LineItem.PriceComponent) {
    surrogateSerializer.serialize(encoder, InvoiceLineItemPriceComponentSurrogate.fromModel(value))
  }
}

public object InvoiceLineItemSerializer : KSerializer<Invoice.LineItem> {
  internal val surrogateSerializer: KSerializer<InvoiceLineItemSurrogate> by lazy {
    InvoiceLineItemSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("LineItem", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Invoice.LineItem =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Invoice.LineItem) {
    surrogateSerializer.serialize(encoder, InvoiceLineItemSurrogate.fromModel(value))
  }
}

public object InvoiceSerializer : KSerializer<Invoice> {
  internal val surrogateSerializer: KSerializer<InvoiceSurrogate> by lazy {
    InvoiceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Invoice", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Invoice =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Invoice) {
    surrogateSerializer.serialize(encoder, InvoiceSurrogate.fromModel(value))
  }
}
