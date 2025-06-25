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

import com.google.fhir.model.r4b.Task
import com.google.fhir.model.r4b.surrogates.TaskInputSurrogate
import com.google.fhir.model.r4b.surrogates.TaskOutputSurrogate
import com.google.fhir.model.r4b.surrogates.TaskRestrictionSurrogate
import com.google.fhir.model.r4b.surrogates.TaskSurrogate
import kotlin.Suppress
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object TaskRestrictionSerializer : KSerializer<Task.Restriction> {
  internal val surrogateSerializer: KSerializer<TaskRestrictionSurrogate> by lazy {
    TaskRestrictionSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Restriction", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Task.Restriction =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Task.Restriction) {
    surrogateSerializer.serialize(encoder, TaskRestrictionSurrogate.fromModel(value))
  }
}

public object TaskInputSerializer : KSerializer<Task.Input> {
  internal val surrogateSerializer: KSerializer<TaskInputSurrogate> by lazy {
    TaskInputSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Input", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Task.Input =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Task.Input) {
    surrogateSerializer.serialize(encoder, TaskInputSurrogate.fromModel(value))
  }
}

public object TaskOutputSerializer : KSerializer<Task.Output> {
  internal val surrogateSerializer: KSerializer<TaskOutputSurrogate> by lazy {
    TaskOutputSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Output", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Task.Output =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Task.Output) {
    surrogateSerializer.serialize(encoder, TaskOutputSurrogate.fromModel(value))
  }
}

public object TaskSerializer : KSerializer<Task> {
  internal val surrogateSerializer: KSerializer<TaskSurrogate> by lazy {
    TaskSurrogate.serializer()
  }

  override val descriptor: SerialDescriptor by lazy {
    SerialDescriptor("Task", surrogateSerializer.descriptor)
  }

  override fun deserialize(decoder: Decoder): Task =
    surrogateSerializer.deserialize(decoder).toModel()

  override fun serialize(encoder: Encoder, `value`: Task) {
    surrogateSerializer.serialize(encoder, TaskSurrogate.fromModel(value))
  }
}
