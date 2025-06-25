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

import com.google.fhir.model.r4.DeviceDefinition
import com.google.fhir.model.r4.surrogates.DeviceDefinitionCapabilitySurrogate
import com.google.fhir.model.r4.surrogates.DeviceDefinitionDeviceNameSurrogate
import com.google.fhir.model.r4.surrogates.DeviceDefinitionMaterialSurrogate
import com.google.fhir.model.r4.surrogates.DeviceDefinitionPropertySurrogate
import com.google.fhir.model.r4.surrogates.DeviceDefinitionSpecializationSurrogate
import com.google.fhir.model.r4.surrogates.DeviceDefinitionSurrogate
import com.google.fhir.model.r4.surrogates.DeviceDefinitionUdiDeviceIdentifierSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object DeviceDefinitionUdiDeviceIdentifierSerializer :
  KSerializer<DeviceDefinition.UdiDeviceIdentifier> {
  internal val surrogateSerializer:
    KSerializer<DeviceDefinitionUdiDeviceIdentifierSurrogate> by lazy {
    DeviceDefinitionUdiDeviceIdentifierSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("UdiDeviceIdentifier", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DeviceDefinition.UdiDeviceIdentifier =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DeviceDefinition.UdiDeviceIdentifier) {
    surrogateSerializer.serialize(
      encoder,
      DeviceDefinitionUdiDeviceIdentifierSurrogate.fromModel(value),
    )
  }
}

public object DeviceDefinitionDeviceNameSerializer : KSerializer<DeviceDefinition.DeviceName> {
  internal val surrogateSerializer: KSerializer<DeviceDefinitionDeviceNameSurrogate> by lazy {
    DeviceDefinitionDeviceNameSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DeviceName", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DeviceDefinition.DeviceName =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DeviceDefinition.DeviceName) {
    surrogateSerializer.serialize(encoder, DeviceDefinitionDeviceNameSurrogate.fromModel(value))
  }
}

public object DeviceDefinitionSpecializationSerializer :
  KSerializer<DeviceDefinition.Specialization> {
  internal val surrogateSerializer: KSerializer<DeviceDefinitionSpecializationSurrogate> by lazy {
    DeviceDefinitionSpecializationSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Specialization", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DeviceDefinition.Specialization =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DeviceDefinition.Specialization) {
    surrogateSerializer.serialize(encoder, DeviceDefinitionSpecializationSurrogate.fromModel(value))
  }
}

public object DeviceDefinitionCapabilitySerializer : KSerializer<DeviceDefinition.Capability> {
  internal val surrogateSerializer: KSerializer<DeviceDefinitionCapabilitySurrogate> by lazy {
    DeviceDefinitionCapabilitySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Capability", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DeviceDefinition.Capability =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DeviceDefinition.Capability) {
    surrogateSerializer.serialize(encoder, DeviceDefinitionCapabilitySurrogate.fromModel(value))
  }
}

public object DeviceDefinitionPropertySerializer : KSerializer<DeviceDefinition.Property> {
  internal val surrogateSerializer: KSerializer<DeviceDefinitionPropertySurrogate> by lazy {
    DeviceDefinitionPropertySurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Property", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DeviceDefinition.Property =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DeviceDefinition.Property) {
    surrogateSerializer.serialize(encoder, DeviceDefinitionPropertySurrogate.fromModel(value))
  }
}

public object DeviceDefinitionMaterialSerializer : KSerializer<DeviceDefinition.Material> {
  internal val surrogateSerializer: KSerializer<DeviceDefinitionMaterialSurrogate> by lazy {
    DeviceDefinitionMaterialSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Material", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DeviceDefinition.Material =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DeviceDefinition.Material) {
    surrogateSerializer.serialize(encoder, DeviceDefinitionMaterialSurrogate.fromModel(value))
  }
}

public object DeviceDefinitionSerializer : KSerializer<DeviceDefinition> {
  internal val surrogateSerializer: KSerializer<DeviceDefinitionSurrogate> by lazy {
    DeviceDefinitionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("DeviceDefinition", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): DeviceDefinition =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: DeviceDefinition) {
    surrogateSerializer.serialize(encoder, DeviceDefinitionSurrogate.fromModel(value))
  }
}
