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

package com.google.fhir.model.r5.serializers

import com.google.fhir.model.r5.DocumentReference
import com.google.fhir.model.r5.surrogates.DocumentReferenceAttesterSurrogate
import com.google.fhir.model.r5.surrogates.DocumentReferenceContentProfileSurrogate
import com.google.fhir.model.r5.surrogates.DocumentReferenceContentSurrogate
import com.google.fhir.model.r5.surrogates.DocumentReferenceRelatesToSurrogate
import com.google.fhir.model.r5.surrogates.DocumentReferenceSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object DocumentReferenceAttesterSerializer : KSerializer<DocumentReference.Attester> {
  internal val surrogateSerializer: KSerializer<DocumentReferenceAttesterSurrogate> by lazy {
    DocumentReferenceAttesterSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Attester", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DocumentReference.Attester =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DocumentReference.Attester) {
    surrogateSerializer.serialize(encoder, DocumentReferenceAttesterSurrogate.fromModel(value))
  }
}

public object DocumentReferenceRelatesToSerializer : KSerializer<DocumentReference.RelatesTo> {
  internal val surrogateSerializer: KSerializer<DocumentReferenceRelatesToSurrogate> by lazy {
    DocumentReferenceRelatesToSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("RelatesTo", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DocumentReference.RelatesTo =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DocumentReference.RelatesTo) {
    surrogateSerializer.serialize(encoder, DocumentReferenceRelatesToSurrogate.fromModel(value))
  }
}

public object DocumentReferenceContentProfileSerializer :
  KSerializer<DocumentReference.Content.Profile> {
  internal val surrogateSerializer: KSerializer<DocumentReferenceContentProfileSurrogate> by lazy {
    DocumentReferenceContentProfileSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Profile", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DocumentReference.Content.Profile =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DocumentReference.Content.Profile) {
    surrogateSerializer.serialize(
      encoder,
      DocumentReferenceContentProfileSurrogate.fromModel(value),
    )
  }
}

public object DocumentReferenceContentSerializer : KSerializer<DocumentReference.Content> {
  internal val surrogateSerializer: KSerializer<DocumentReferenceContentSurrogate> by lazy {
    DocumentReferenceContentSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Content", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DocumentReference.Content =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DocumentReference.Content) {
    surrogateSerializer.serialize(encoder, DocumentReferenceContentSurrogate.fromModel(value))
  }
}

public object DocumentReferenceSerializer : KSerializer<DocumentReference> {
  internal val surrogateSerializer: KSerializer<DocumentReferenceSurrogate> by lazy {
    DocumentReferenceSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DocumentReference", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DocumentReference =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DocumentReference) {
    surrogateSerializer.serialize(encoder, DocumentReferenceSurrogate.fromModel(value))
  }
}
