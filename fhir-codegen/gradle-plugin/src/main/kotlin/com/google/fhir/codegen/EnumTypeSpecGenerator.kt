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

import com.google.fhir.codegen.schema.CodeSystem
import com.google.fhir.codegen.schema.sanitizeKDoc
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gradle.configurationcache.extensions.capitalized

object EnumTypeSpecGenerator {

  fun generate(enumClassName: String, codeSystem: CodeSystem): TypeSpec {
    return TypeSpec.enumBuilder(enumClassName)
      .apply {
        codeSystem.description?.let { addKdoc(it.sanitizeKDoc()) }
        primaryConstructor(FunSpec.constructorBuilder().addParameter("code", String::class).build())

        val arrayDeque = ArrayDeque(codeSystem.concept ?: emptyList())
        while (arrayDeque.isNotEmpty()) {
          val concept = arrayDeque.removeFirst()
          if (concept.code.isNotBlank()) {
            addEnumConstant(
                concept.code.formatEnumConstantName(),
                TypeSpec.anonymousClassBuilder()
                  .apply {
                    if (!concept.definition.isNullOrBlank())
                      addKdoc("%L", concept.definition.sanitizeKDoc())
                    addSuperclassConstructorParameter("%S", concept.code)
                  }
                  .build(),
              )
              .addProperty(
                PropertySpec.builder("code", String::class, KModifier.PRIVATE)
                  .initializer("code")
                  .build()
              )
          }
          if (!concept.concept.isNullOrEmpty()) arrayDeque.addAll(concept.concept)
        }
        addFunction(
            FunSpec.builder("toString")
              .addModifiers(KModifier.OVERRIDE)
              .addStatement("return code")
              .returns(String::class)
              .build()
          )
          .addFunction(
            FunSpec.builder("getCode")
              .addModifiers(KModifier.PUBLIC)
              .returns(String::class)
              .addStatement("return code")
              .build()
          )
        // TODO Implement functions:fromCode -> code to enum constant; getDefinition -> return
        // definition; getDisplay -> return display for constant
        addFunction(
          FunSpec.builder("getSystem")
            .addStatement("return %S", codeSystem.url)
            .returns(String::class)
            .build()
        )
      }
      .build()
  }

  /**
   * Format the code to a valid enum constant. Some codes have special characters that should be
   * cleaned up before they are used as enum constants.
   */
  fun String.formatEnumConstantName(): String {

    // Use the last URL slug for codes that are URIs e.g. DateTime from
    // http://hl7.org/fhirpath/System.DateTime
    if (startsWith("http")) return substringAfterLast(".")

    // Handle only numeric strings; prepend N for digits; Enum constants should start with letters
    if (isNumeric()) return "N$this"

    return when (this) {
      ">" -> "GreaterThan"
      "<" -> "LessThan"
      ">=" -> "GreaterOrEquals"
      "<=" -> "LessOrEquals"
      "<>",
      "!=" -> "NotEquals"

      "=" -> "Equals"
      "*" -> "Multiply"
      "+" -> "Plus"
      "-" -> "Minus"
      "/" -> "Divide"
      else -> convertToUpperCamelCase()
    }
  }

  private fun String.convertToUpperCamelCase(): String {
    val camelCaseString =
      split("-").joinToString("") { it ->
        it.replaceFirstChar { char ->
          if (it.indexOf(char) == 0) {
            char.uppercaseChar()
          } else {
            char
          }
        }
      }

    // For consistency if all the letters are in uppercase convert them to lowercase then
    // capitalize the first.
    val formattedString =
      if (camelCaseString.all { it.isUpperCase() }) camelCaseString.lowercase().capitalized()
      else camelCaseString

    return formattedString.replace(Regex("[^a-zA-Z0-9]+"), "")
  }

  fun String.isNumeric(): Boolean = matches("-?[0-9]+(\\.[0-9]+)?".toRegex())
}
