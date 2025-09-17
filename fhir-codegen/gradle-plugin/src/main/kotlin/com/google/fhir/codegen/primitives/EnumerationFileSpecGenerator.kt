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

package com.google.fhir.codegen.primitives

import com.google.fhir.codegen.schema.sanitizeKDoc
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STAR
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import kotlin.text.substringAfterLast

/**
 * Generates [FileSpec] for a FHIR `Enumeration` type bound to a specific set of codes. It is an
 * extension to primitive type `code` and represents a constrained code value from an enumerated
 * list
 */
object EnumerationFileSpecGenerator {
  private const val R4 = "r4"
  private const val R4B = "r4b"
  private const val R5 = "r5"

  fun generate(packageName: String): FileSpec {
    val enumerationTypeSpec =
      TypeSpec.classBuilder("Enumeration")
        .addModifiers(KModifier.DATA)
        .apply {
          val version = packageName.substringAfterLast('.')
          val baseClassName =
            when (version) {
              R4,
              R4B -> "Element"
              R5 -> "PrimitiveType"
              else -> error("Enum generation is not supported for version: $version")
            }
          // Define T with upper bound of Enum<*>
          val typeVariable =
            TypeVariableName("T", ClassName("kotlin", "Enum").parameterizedBy(STAR))
          val extensionClassName = ClassName(packageName, "Extension")
          val elementClassName = ClassName(packageName, "Element")
          addTypeVariable(typeVariable)
          primaryConstructor(
            FunSpec.constructorBuilder()
              .addParameter(
                ParameterSpec.builder("id", STRING.copy(nullable = true))
                  .defaultValue("null")
                  .addKdoc("unique id for the element within a resource (for internal references)")
                  .build()
              )
              .addParameter(
                ParameterSpec.builder(
                    name = "extension",
                    type =
                      ClassName("kotlin.collections", "MutableList")
                        .parameterizedBy(extensionClassName),
                  )
                  .addKdoc(
                    """
                    May be used to represent additional information that is not part of the basic definition of the
                    resource. To make the use of extensions safe and manageable, there is a strict set of governance 
                    applied to the definition and use of extensions.
                    """
                      .trimIndent()
                      .sanitizeKDoc()
                  )
                  .defaultValue("mutableListOf()")
                  .build()
              )
              .addParameter(
                ParameterSpec.builder("value", typeVariable.copy(nullable = true))
                  .defaultValue("null")
                  .addKdoc("The actual value")
                  .build()
              )
              .build()
          )
          addProperty(
            PropertySpec.builder("id", STRING.copy(nullable = true))
              .initializer("id")
              .mutable(true)
              .addModifiers(KModifier.OVERRIDE)
              .build()
          )
          addProperty(
            PropertySpec.builder(
                name = "extension",
                type =
                  ClassName("kotlin.collections", "MutableList").parameterizedBy(extensionClassName),
              )
              .initializer("extension")
              .mutable(true)
              .addModifiers(KModifier.OVERRIDE)
              .build()
          )
          addProperty(
            PropertySpec.builder("value", typeVariable.copy(nullable = true))
              .initializer("value")
              .mutable(true)
              .build()
          )
          superclass(ClassName(packageName, baseClassName))
          if (version == R4 || version == R4B) {
            addSuperclassConstructorParameter("id")
            addSuperclassConstructorParameter("extension")
          }
          addFunction(
            FunSpec.builder("toElement")
              .returns(elementClassName.copy(nullable = true))
              .addStatement(
                "if (id != null || extension.isNotEmpty()) { return Element(id, extension) }"
              )
              .addStatement("return null")
              .build()
          )
          addType(
            TypeSpec.companionObjectBuilder()
              .addFunction(
                FunSpec.builder("of")
                  .addTypeVariable(typeVariable)
                  .addParameter(ParameterSpec.builder("value", typeVariable).build())
                  .addParameter(
                    ParameterSpec.builder("element", elementClassName.copy(nullable = true)).build()
                  )
                  .returns(ClassName("", "Enumeration").parameterizedBy(typeVariable))
                  .addStatement(
                    "return Enumeration(element?.id, element?.extension ?: mutableListOf(), value = value)"
                  )
                  .build()
              )
              .build()
          )
        }
        .addKdoc(
          """
          A FHIR Enumeration type bound to a specific set of codes. It represents a constrained code 
          value from an enumerated list.
          """
            .trimIndent()
            .sanitizeKDoc()
        )
        .build()

    return FileSpec.builder(packageName, "Enumeration").addType(enumerationTypeSpec).build()
  }
}
