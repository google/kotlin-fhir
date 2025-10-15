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

import com.google.fhir.codegen.schema.capitalized
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder
import kotlinx.serialization.modules.SerializersModule

/**
 * Generates a [FileSpec] with utilities for configuring the [Json] object to serialize and
 * deserialize FHIR resources in this package.
 *
 * The generated file includes an extension function for [JsonBuilder]. It configures the [Json]
 * object by registering polymorphic types for FHIR resource hierarchies and setting appropriate
 * class discriminators (e.g., "resourceType").
 */
object MoreJsonBuilderFileSpecGenerator {
  fun generate(packageName: String, subclasses: List<ClassName>): FileSpec {
    val baseClass = ClassName(packageName, "Resource")
    val fhirVersion = packageName.substringAfterLast('.').capitalized()
    val className = ClassName(packageName, "Fhir${fhirVersion}Json")
    val serializersModuleName = "serializersModule${fhirVersion}"
    return FileSpec.builder(className)
      .addType(
        TypeSpec.classBuilder(className)
          .primaryConstructor(
            FunSpec.constructorBuilder()
              .addParameter(
                ParameterSpec.builder(
                    "init",
                    LambdaTypeName.get(
                      receiver = JsonBuilder::class.asTypeName(),
                      returnType = Unit::class.asTypeName(),
                    ),
                  )
                  .defaultValue("{}")
                  .build()
              )
              .build()
          )
          .addProperty(
            PropertySpec.builder("json", Json::class)
              .addModifiers(KModifier.PRIVATE)
              .initializer(
                CodeBlock.builder()
                  .addStatement("%T {", Json::class)
                  .indent()
                  .addStatement("prettyPrint = true")
                  .addStatement("classDiscriminator = \"resourceType\"")
                  .addStatement("serializersModule = $serializersModuleName")
                  .addStatement("init()")
                  .unindent()
                  .addStatement("}")
                  .build()
              )
              .build()
          )
          .addFunction(
            FunSpec.builder("encodeToString")
              .addParameter("resource", baseClass)
              .returns(String::class)
              .addStatement("return json.encodeToString(resource)")
              .build()
          )
          .addFunction(
            FunSpec.builder("decodeFromString")
              .addParameter("string", String::class)
              .returns(baseClass)
              .addStatement("return json.decodeFromString<${baseClass.simpleName}>(string)")
              .build()
          )
          .build()
      )
      .addProperty(
        PropertySpec.builder(serializersModuleName, SerializersModule::class)
          .addModifiers(KModifier.PRIVATE)
          .initializer(
            CodeBlock.builder()
              .addStatement("%T {", SerializersModule::class)
              .indent()
              .apply {
                subclasses.sorted().forEach {
                  addStatement(
                    "polymorphic(%T::class, %T::class, %T.serializer())",
                    baseClass,
                    it,
                    it,
                  )
                }
              }
              .unindent()
              .addStatement("}")
              .build()
          )
          .build()
      )
      .build()
  }
}
