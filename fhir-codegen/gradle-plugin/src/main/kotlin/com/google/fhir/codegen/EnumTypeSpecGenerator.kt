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
import com.google.fhir.codegen.schema.Concept
import com.google.fhir.codegen.schema.ValueSet
import com.google.fhir.codegen.schema.isValueSystemSupported
import com.google.fhir.codegen.schema.sanitizeKDoc
import com.google.fhir.codegen.schema.toPascalCase
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName

/**
 * Generates a [TypeSpec] for [Enum] class representation of FHIR data. The `Enum` class is
 * generated using information derived from the [ValueSet] and [CodeSystem] terminology resources.
 * Each generated enum class will contain the methods for retrieving the code, system, display and
 * definition of each `Enum` class constant.
 */
object EnumTypeSpecGenerator {

  fun generate(
    enumClassName: String,
    valueSet: ValueSet,
    codeSystemMap: Map<String, CodeSystem>,
  ): TypeSpec? {
    val fhirEnum = generateEnum(valueSet, codeSystemMap)
    if (fhirEnum == null || fhirEnum.constants.isEmpty()) return null
    val typeSpec =
      TypeSpec.enumBuilder(enumClassName)
        .apply {
          fhirEnum.description?.sanitizeKDoc()?.let { addKdoc(it) }
          primaryConstructor(
            FunSpec.constructorBuilder()
              .addParameter("code", String::class)
              .addParameter("system", String::class)
              .addParameter("display", String::class.asClassName().copy(nullable = true))
              .addParameter("definition", String::class.asClassName().copy(nullable = true))
              .build()
          )

          fhirEnum.constants.forEach {
            addEnumConstant(
                it.name,
                TypeSpec.anonymousClassBuilder()
                  .apply {
                    if (!it.definition.isNullOrBlank()) addKdoc("%L", it.definition.sanitizeKDoc())
                    addSuperclassConstructorParameter("%S", it.code)
                    addSuperclassConstructorParameter("%S", it.system)
                    addSuperclassConstructorParameter("%S", it.display ?: "null")
                    addSuperclassConstructorParameter("%S", it.definition ?: "null")
                  }
                  .build(),
              )
              .addProperty(
                PropertySpec.builder("code", String::class, KModifier.PRIVATE)
                  .initializer("code")
                  .build()
              )
              .addProperty(
                PropertySpec.builder("system", String::class, KModifier.PRIVATE)
                  .initializer("system")
                  .build()
              )
              .addProperty(
                PropertySpec.builder(
                    "display",
                    String::class.asClassName().copy(nullable = true),
                    KModifier.PRIVATE,
                  )
                  .initializer("display")
                  .build()
              )
              .addProperty(
                PropertySpec.builder(
                    "definition",
                    String::class.asClassName().copy(nullable = true),
                    KModifier.PRIVATE,
                  )
                  .initializer("definition")
                  .build()
              )
          }
          addFunction(
            FunSpec.builder("toString")
              .addModifiers(KModifier.OVERRIDE)
              .addStatement("return code")
              .returns(String::class)
              .build()
          )
          addFunction(
            FunSpec.builder("getCode")
              .addModifiers(KModifier.PUBLIC)
              .returns(String::class)
              .addStatement("return code")
              .build()
          )
          addFunction(
            FunSpec.builder("getSystem")
              .addModifiers(KModifier.PUBLIC)
              .returns(String::class)
              .addStatement("return system")
              .build()
          )
          addFunction(
            FunSpec.builder("getDisplay")
              .addModifiers(KModifier.PUBLIC)
              .returns(String::class.asClassName().copy(nullable = true))
              .addStatement("return display")
              .build()
          )
          addFunction(
            FunSpec.builder("getDefinition")
              .addModifiers(KModifier.PUBLIC)
              .returns(String::class.asClassName().copy(nullable = true))
              .addStatement("return definition")
              .build()
          )
          addType(
            TypeSpec.companionObjectBuilder()
              .addFunction(
                FunSpec.builder("fromCode")
                  .addParameter("code", String::class)
                  .returns(ClassName.bestGuess(enumClassName))
                  .beginControlFlow("return when (code)")
                  .apply {
                    fhirEnum.constants.forEach { addStatement("%S -> %L", it.code, it.name) }
                    addStatement(
                      "else -> throw IllegalArgumentException(\"Unknown code \$code for enum %L\")",
                      enumClassName,
                    )
                  }
                  .endControlFlow()
                  .build()
              )
              .build()
          )
        }
        .build()
    return typeSpec
  }

  /**
   * Instantiate a [FhirEnum] to facilitate the generation of Kotlin enum classes. The enum
   * constants are derived from concepts defined in a `ValueSet`, a `CodeSystem`, or both. When both
   * are provided, the constants are generated by intersecting the concepts from the `ValueSet` and
   * the `CodeSystem`. If only one is provided, the constants are based solely on that source. Any
   * nested concepts are flattened, transformed, and included in the resulting enum constants.
   *
   * NOTE: This excludes all systems that equals "http://unitsofmeasure.org" or start with "urn",
   * e.g. urn:ietf:bcp:13, urn:ietf:bcp:47,urn:iso:std:iso:4217 typically used for MIMETypes,
   * Currency Code etc. The excluded ValueSets do not have a one-to-one mapping with CodeSystem, so
   * we can't use them to generate enums.
   */
  private fun generateEnum(valueSet: ValueSet, codeSystemMap: Map<String, CodeSystem>): FhirEnum? {
    return valueSet.compose
      ?.include
      ?.filter { it.isValueSystemSupported() }
      ?.let { includes ->
        val enumConstants =
          includes.flatMap { include ->
            val system = include.system!!
            generateEnumConstants(
              system = system,
              codeSystemConcepts = codeSystemMap[system]?.concept,
              valueSetConcepts = include.concept,
            )
          }
        return FhirEnum(valueSet.description, enumConstants)
      }
  }

  private fun generateEnumConstants(
    system: String,
    codeSystemConcepts: List<Concept>?,
    valueSetConcepts: List<Concept>?,
  ): List<FhirEnumConstant> {
    return when {
      !codeSystemConcepts.isNullOrEmpty() && !valueSetConcepts.isNullOrEmpty() -> {
        val expectedCodesSet = valueSetConcepts.mapTo(hashSetOf()) { it.code }
        valueSetConcepts.flatMap { processConcept(it, system, expectedCodesSet) }
      }
      !valueSetConcepts.isNullOrEmpty() && codeSystemConcepts.isNullOrEmpty() ->
        valueSetConcepts.flatMap { processConcept(it, system, null) }

      !codeSystemConcepts.isNullOrEmpty() && valueSetConcepts.isNullOrEmpty() ->
        codeSystemConcepts.flatMap { processConcept(it, system, null) }
      else -> emptyList()
    }
  }

  private fun processConcept(
    concept: Concept,
    system: String,
    expectedCodesSet: Set<String>?,
  ): List<FhirEnumConstant> {
    val name = concept.code.formatEnumConstantName()
    val include = expectedCodesSet?.contains(concept.code) != false
    val result = mutableListOf<FhirEnumConstant>()

    if (name.isNotBlank() && include) {
      result.add(
        FhirEnumConstant(
          code = concept.code,
          system = system,
          name = name,
          display = concept.display,
          definition = concept.definition,
        )
      )
    }

    if (!concept.concept.isNullOrEmpty() && include) {
      result.addAll(concept.concept.flatMap { processConcept(it, system, expectedCodesSet) })
    }
    return result
  }

  /**
   * Transforms a FHIR code into a valid Kotlin enum constant name.
   *
   * This function applies a series of transformations to ensure the resulting name follows Kotlin
   * naming conventions and is a valid identifier. The transformations are applied in the following
   * order:
   * 1. For URLs (strings starting with "http"), extract only the last segment after the final dot
   *    Example: "http://hl7.org/fhirpath/System.DateTime" → "DateTime"
   * 2. For special characters (>, <, >=, etc.), map them to descriptive names Example: ">" →
   *    "GreaterThan", "<" → "LessThan"
   *
   * 3.1. Replace all remaining non-alphanumeric characters with underscores Example:
   * "some-value.123" → "some_value_123"
   *
   * 3.2. If the string starts with a digit, prefix it with an underscore to make it a valid
   * identifier Example: "123test" → "_123test"
   *
   * 3.3. Apply PascalCase to each segment between underscores while preserving the underscores
   * Example: "test_value" → "Test_Value"
   *
   * @return A valid Kotlin enum constant name
   */
  private fun String.formatEnumConstantName(): String {

    if (startsWith("http")) return substringAfterLast(".")

    when (this) {
      ">" -> return "GreaterThan"
      "<" -> return "LessThan"
      ">=" -> return "GreaterThanOrEquals"
      "<=" -> return "LessThanOrEquals"
      "<>",
      "!=" -> return "NotEquals"
      "=" -> return "Equals"
      "*" -> return "Multiply"
      "+" -> return "Plus"
      "-" -> return "Minus"
      "/" -> return "Divide"
      "%" -> return "Percent"
    }

    val withUnderscores = this.replace(Regex("[^a-zA-Z0-9]"), "_")

    val prefixed =
      if (withUnderscores.isNotEmpty() && withUnderscores[0].isDigit()) {
        "_$withUnderscores"
      } else {
        withUnderscores
      }
    return prefixed.split("_").joinToString("_") { part ->
      if (part.isEmpty()) "" else part.toPascalCase()
    }
  }
}
