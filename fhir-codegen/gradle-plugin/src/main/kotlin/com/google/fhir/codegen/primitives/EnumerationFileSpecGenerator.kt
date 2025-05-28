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
import com.squareup.kotlinpoet.asTypeName
import kotlin.text.substringAfterLast

/**
 * Generates [FileSpec] for a FHIR `Enumeration` type bound to a specific set of codes. It is an
 * extension to primitive type `code` and represents a constrained code value from an enumerated
 * list
 */
object EnumerationFileSpecGenerator {

  fun generate(packageName: String): FileSpec {

    val version = packageName.substringAfterLast('.')
    val isR5 = version.equals("r5", ignoreCase = true)

    val superclassName = ClassName(packageName, if (isR5) "PrimitiveType" else "Element")
    val extensionClassName = ClassName(packageName, "Extension")

    // Define T with upper bound of Enum<*>
    val enumType = ClassName("kotlin", "Enum").parameterizedBy(STAR)
    val typeVariable = TypeVariableName("T", enumType)

    val elementClassName = ClassName(packageName, "Element")

    val toElementFunction = createToElementFunction(elementClassName)
    val ofFunction = createOfFunction(elementClassName, typeVariable)
    val companionObject = createCompanionObject(ofFunction)

    val enumClass =
      TypeSpec.classBuilder("Enumeration")
        .addModifiers(KModifier.PUBLIC, KModifier.DATA)
        .addTypeVariable(typeVariable)
        .superclass(superclassName)
        .apply {
          if (!isR5) {
            addSuperclassConstructorParameter("id")
            addSuperclassConstructorParameter("extension")
          }
        }
        .primaryConstructor(
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
                    List::class.asTypeName()
                      .parameterizedBy(extensionClassName.copy(nullable = true))
                      .copy(nullable = true),
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
                .defaultValue("null")
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
        .addProperty(
          PropertySpec.builder("id", STRING.copy(nullable = true))
            .initializer("id")
            .mutable(true)
            .addModifiers(KModifier.OVERRIDE)
            .build()
        )
        .addProperty(
          PropertySpec.builder(
              name = "extension",
              type =
                List::class.asTypeName()
                  .parameterizedBy(extensionClassName.copy(nullable = true))
                  .copy(nullable = true),
            )
            .initializer("extension")
            .mutable(true)
            .addModifiers(KModifier.OVERRIDE)
            .build()
        )
        .addProperty(
          PropertySpec.builder("value", typeVariable.copy(nullable = true))
            .initializer("value")
            .mutable(true)
            .build()
        )
        .addFunction(toElementFunction)
        .addType(companionObject)
        .addKdoc(
          """
            A FHIR Enumeration type bound to a specific set of codes. It represents a constrained code 
            value from an enumerated list.
            """
            .trimIndent()
            .sanitizeKDoc()
        )
        .build()

    return FileSpec.builder(packageName, "Enumeration").addType(enumClass).build()
  }

  private fun createToElementFunction(elementClassName: ClassName): FunSpec {
    return FunSpec.builder("toElement")
      .addModifiers(KModifier.PUBLIC)
      .returns(elementClassName.copy(nullable = true))
      .addStatement("if (id != null || extension != null) { return Element(id, extension) }")
      .addStatement("return null")
      .build()
  }

  private fun createOfFunction(
    elementClassName: ClassName,
    typeVariable: TypeVariableName,
  ): FunSpec {
    return FunSpec.builder("of")
      .addModifiers(KModifier.PUBLIC)
      .addTypeVariable(typeVariable)
      .addParameter(ParameterSpec.builder("value", typeVariable.copy(nullable = true)).build())
      .addParameter(
        ParameterSpec.builder("element", elementClassName.copy(nullable = true)).build()
      )
      .returns(ClassName("", "Enumeration").parameterizedBy(typeVariable).copy(nullable = true))
      .addStatement(
        "return if (value == null && element == null) { null } else { Enumeration(element?.id, element?.extension, value = value) }"
      )
      .build()
  }

  private fun createCompanionObject(ofFunction: FunSpec): TypeSpec {
    return TypeSpec.companionObjectBuilder()
      .addModifiers(KModifier.PUBLIC)
      .addFunction(ofFunction)
      .build()
  }
}
