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

import com.google.fhir.codegen.schema.Element
import com.google.fhir.codegen.schema.StructureDefinition
import com.google.fhir.codegen.schema.getElementName
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import kotlinx.serialization.KSerializer
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonEncoder
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

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
  fun generate(
    className: ClassName,
    elements: List<Element>?,
    structureDefinitionKindAndName: Pair<StructureDefinition.Kind, String>? = null,
  ): TypeSpec {
    val elementPaths = elements?.filter { it.path.endsWith("[x]") }?.map { it.getElementName() }
    val hasMultiChoiceProperties = !elementPaths.isNullOrEmpty()
    return TypeSpec.objectBuilder(className.toSerializerClassName())
      .addSuperinterface(KSerializer::class.asClassName().parameterizedBy(className))
      .addSurrogateSerializerProperty(className)
      .apply {
        if (!elementPaths.isNullOrEmpty()) {
          addMultiChoicePropertiesProperty(elementPaths, structureDefinitionKindAndName)
        }
      }
      .addDescriptorProperty(className)
      .addDeserializeFunction(className, hasMultiChoiceProperties)
      .addSerializeFunction(className, hasMultiChoiceProperties)
      .build()
  }
}

/**
 * Adds the `multiChoiceProperties` property to the [TypeSpec.Builder]. This will be used to track
 * FHIR model properties that can be provided in multiple forms, e.g. Patient.deceased that can
 * exist either as as Boolean or DateTime
 */
private fun TypeSpec.Builder.addMultiChoicePropertiesProperty(
  paths: List<String>,
  structureDefinitionKindAndName: Pair<StructureDefinition.Kind, String>?,
): TypeSpec.Builder {
  return apply {
    // If the StructureDefinition.Kind is a resource, the resourceType will be removed
    // from original JSON during Deserialization and added to the final JSON during
    // Serialization, this is because the property is not used in the surrogates.
    addProperty(
      PropertySpec.builder("resourceType", String::class.asClassName().copy(nullable = true))
        .addModifiers(KModifier.PRIVATE)
        .initializer(
          if (StructureDefinition.Kind.RESOURCE == structureDefinitionKindAndName?.first)
            "\"${structureDefinitionKindAndName.second}\""
          else "null"
        )
        .mutable(false)
        .build()
    )
    addProperty(
      PropertySpec.builder("multiChoiceProperties", List::class.parameterizedBy(String::class))
        .addModifiers(KModifier.PRIVATE)
        .mutable(false)
        .initializer("listOf(${paths.joinToString(",") { """"$it"""" }})")
        .build()
    )
  }
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
private fun TypeSpec.Builder.addDeserializeFunction(
  className: ClassName,
  hasMultiChoiceProperties: Boolean,
): TypeSpec.Builder {
  return addFunction(
    FunSpec.builder("deserialize")
      .addModifiers(KModifier.OVERRIDE)
      .addParameter("decoder", decoderClassName)
      .returns(className)
      .apply {
        if (hasMultiChoiceProperties) {
          // Unflatten the multi-choice JsonObjects; recreate nested JsonObject
          addCode(
            """
                val jsonDecoder = 
                  decoder as? %T ?: error("This serializer only supports JSON decoding")
                val oldJsonObject =
                  if (resourceType.isNullOrBlank()) {
                    jsonDecoder.decodeJsonElement().%T
                  } else JsonObject(jsonDecoder.decodeJsonElement().%T.toMutableMap().apply {
                    remove("resourceType")
                  })
                val unflattenedJsonObject = %T.unflatten(oldJsonObject, multiChoiceProperties)
                val surrogate = 
                  jsonDecoder.json.decodeFromJsonElement(surrogateSerializer, unflattenedJsonObject)
                return surrogate.toModel()
              """
              .trimIndent(),
            JsonDecoder::class,
            ClassName("kotlinx.serialization.json", "jsonObject"),
            ClassName("kotlinx.serialization.json", "jsonObject"),
            ClassName(className.packageName, "FhirJsonTransformer"),
          )
        } else {
          addStatement("return surrogateSerializer.deserialize(decoder).toModel()")
        }
      }
      .build()
  )
}

/**
 * Adds the `serialize` function to the [TypeSpec.Builder]. This function delegates serialization to
 * `surrogateSerializer`.
 */
private fun TypeSpec.Builder.addSerializeFunction(
  className: ClassName,
  hasMultiChoiceProperties: Boolean,
): TypeSpec.Builder {
  return addFunction(
    FunSpec.builder("serialize")
      .addModifiers(KModifier.OVERRIDE)
      .addParameter("encoder", encoderClassName)
      .addParameter("value", className)
      .apply {
        if (hasMultiChoiceProperties) {
          // Flatten the multi-choice JsonObjects; unwrap nested Json items
          addCode(
            """
              val jsonEncoder = 
                encoder as? %T ?: error("This serializer only supports JSON encoding")
              val surrogate = %T.fromModel(value)
              val oldJsonObject = if (resourceType.isNullOrBlank()) {
                jsonEncoder.json.encodeToJsonElement(surrogateSerializer, surrogate).%T
              } else {
                %T(
                  mutableMapOf("resourceType" to %T(resourceType)).plus(
                    jsonEncoder.json.encodeToJsonElement(
                      surrogateSerializer,
                      surrogate
                    ).%T
                  )
                )
              }
              val flattenedJsonObject = %T.flatten(oldJsonObject, multiChoiceProperties)
              jsonEncoder.encodeJsonElement(flattenedJsonObject)
            """
              .trimIndent(),
            JsonEncoder::class,
            className.toSurrogateClassName(),
            ClassName("kotlinx.serialization.json", "jsonObject"),
            JsonObject::class,
            JsonPrimitive::class,
            ClassName("kotlinx.serialization.json", "jsonObject"),
            ClassName(className.packageName, "FhirJsonTransformer"),
          )
        } else {
          addStatement(
            "surrogateSerializer.serialize(encoder, %T.fromModel(value))",
            className.toSurrogateClassName(),
          )
        }
      }
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
