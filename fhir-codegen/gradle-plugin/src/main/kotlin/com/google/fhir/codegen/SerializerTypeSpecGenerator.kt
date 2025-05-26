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

package com.google.fhir.codegen

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import kotlinx.serialization.KSerializer

// Package names
private const val KOTLINX_SERIALIZATION_DESCRIPTORS = "kotlinx.serialization.descriptors"
private const val KOTLINX_SERIALIZATION_ENCODING = "kotlinx.serialization.encoding"

// Class names used in the code generation
private val serialDescriptorClassName =
  ClassName(KOTLINX_SERIALIZATION_DESCRIPTORS, "SerialDescriptor")
private val primitiveSerialDescriptorClassName =
  ClassName(KOTLINX_SERIALIZATION_DESCRIPTORS, "PrimitiveSerialDescriptor")
private val encoderClassName = ClassName(KOTLINX_SERIALIZATION_ENCODING, "Encoder")
private val decoderClassName = ClassName(KOTLINX_SERIALIZATION_ENCODING, "Decoder")

/**
 * Generates a [TypeSpec] for a custom serializer object that delegates
 * serialization/deserialization to a surrogate class.
 *
 * See
 * [surrogate](https://github.com/Kotlin/kotlinx.serialization/blob/master/docs/serializers.md#composite-serializer-via-surrogate).
 */
object SerializerTypeSpecGenerator {
  /** @param className the class the serializer is for */
  fun generate(className: ClassName): TypeSpec =
    TypeSpec.objectBuilder(className.toSerializerClassName())
      .addSuperinterface(KSerializer::class.asClassName().parameterizedBy(className))
      .addSurrogateSerializerProperty(className)
      .addDescriptorProperty(className)
      .addDeserializeFunction(className)
      .addSerializeFunction(className)
      .build()
}

/** Adds the `surrogateSerializer` property to the [TypeSpec.Builder]. */
private fun TypeSpec.Builder.addSurrogateSerializerProperty(
  className: ClassName
): TypeSpec.Builder =
  addProperty(
    PropertySpec.builder(
        "surrogateSerializer",
        KSerializer::class.asClassName().parameterizedBy(className.toSurrogateClassName()),
      )
      .addModifiers(KModifier.INTERNAL)
      .initializeWithLazy("%T.serializer()", className.toSurrogateClassName())
      .build()
  )

/** Adds the `descriptor` property to the [TypeSpec.Builder]. */
private fun TypeSpec.Builder.addDescriptorProperty(className: ClassName): TypeSpec.Builder =
  addProperty(
    PropertySpec.builder("descriptor", serialDescriptorClassName)
      .addModifiers(KModifier.OVERRIDE)
      .apply {
        if (className.simpleName == "Extension") {
          // A cyclic dependency caused by the `Extension` class prevents the kotlinx
          // serialization compiler plugin from generating serializers correctly. The
          // `descriptor` of `ExtensionSerializer` would use the descriptor of
          // `ExtensionSurrogate`'s serializer. But the `ExtensionSurrogate`'s serializer
          // is automatically generated, using the serializers of its data members, some of
          // which in turn can only be generated using `ExtensionSerializer`.
          // To resolve this, a placeholder [PrimitiveSerialDescriptor] of type [String]
          // is used for the `ExtensionSerializer`. This workaround is safe because
          // serialization and deserialization are delegated entirely to the surrogate
          // serializer, rendering the `ExtensionSerializer`'s descriptor effectively unused.
          initializeWithLazy(
            "%T(%S, %T(%S, %T.STRING))",
            serialDescriptorClassName,
            className.packageName,
            primitiveSerialDescriptorClassName,
            "Extension",
            ClassName(KOTLINX_SERIALIZATION_DESCRIPTORS, "PrimitiveKind"),
          )
        } else {
          initializeWithLazy(
            "%T(%S, surrogateSerializer.descriptor)",
            serialDescriptorClassName,
            className.simpleName,
          )
        }
      }
      .build()
  )

/**
 * Adds the `deserialize` function to the [TypeSpec.Builder]. This function delegates
 * deserialization to `surrogateSerializer`.
 */
private fun TypeSpec.Builder.addDeserializeFunction(className: ClassName): TypeSpec.Builder {
  return addFunction(
    FunSpec.builder("deserialize")
      .addModifiers(KModifier.OVERRIDE)
      .addParameter("decoder", decoderClassName)
      .returns(className)
      .addStatement("return surrogateSerializer.deserialize(decoder).%N()", "toModel")
      .build()
  )
}

/**
 * Adds the `serialize` function to the [TypeSpec.Builder]. This function delegates serialization to
 * `surrogateSerializer`.
 */
private fun TypeSpec.Builder.addSerializeFunction(className: ClassName): TypeSpec.Builder {
  return addFunction(
    FunSpec.builder("serialize")
      .addModifiers(KModifier.OVERRIDE)
      .addParameter("encoder", encoderClassName)
      .addParameter("value", className)
      .addStatement(
        "surrogateSerializer.serialize(encoder, %T.%N(value))",
        className.toSurrogateClassName(),
        "fromModel",
      )
      .build()
  )
}

/** Initializes the property with a lazy delegate. */
private fun PropertySpec.Builder.initializeWithLazy(statement: String, vararg args: Any) =
  this.delegate(
    CodeBlock.builder()
      .beginControlFlow("lazy")
      .addStatement(statement, *args)
      .endControlFlow()
      .build()
  )

/**
 * Returns the [ClassName] that represents the serializer for this [ClassName]. The generated
 * serializer resides in the same package and its name is derived by concatenating the names of any
 * nested classes, ending with "Serializer".
 *
 * For example:
 * - `com.google.fhir.r4.Patient` will return `com.google.fhir.r4.PatientSerializer`, and
 * - `com.google.fhir.r4.Patient.Contact` will return `com.google.fhir.r4.PatientContactSerializer`.
 */
fun ClassName.toSerializerClassName(): ClassName =
  ClassName("${packageName}.serializers", simpleNames.joinToString("").plus("Serializer"))
