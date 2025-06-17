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

import com.google.fhir.codegen.schema.codesystem.CodeSystem
import com.google.fhir.codegen.schema.codesystem.Concept as CodeSystemConcept
import com.google.fhir.codegen.schema.isValueSystemSupported
import com.google.fhir.codegen.schema.sanitizeKDoc
import com.google.fhir.codegen.schema.toPascalCase
import com.google.fhir.codegen.schema.valueset.Concept as ValueSystemConcept
import com.google.fhir.codegen.schema.valueset.ValueSet
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
class EnumTypeSpecGenerator(val codeSystemMap: Map<String, CodeSystem>) {

  fun generate(enumClassName: String, valueSet: ValueSet): TypeSpec? {
    val fhirEnum = generateEnum(valueSet, codeSystemMap) ?: return null
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
                    if (it.display != null) {
                      addSuperclassConstructorParameter("%S", it.display)
                    } else {
                      addSuperclassConstructorParameter("null")
                    }
                    if (it.definition != null) {
                      addSuperclassConstructorParameter("%S", it.definition)
                    } else {
                      addSuperclassConstructorParameter("null")
                    }
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
   * Instantiates a [FhirEnum] to facilitate the generation of Kotlin enum classes. The enum
   * constants are derived from concepts defined in a `ValueSet`, a `CodeSystem`, or both. When both
   * are provided, the constants are generated by intersecting the concepts from the `ValueSet` and
   * the `CodeSystem`. If only one is provided, the constants are based solely on that source. Any
   * nested concepts are flattened, transformed, and included in the resulting enum constants.
   */
  private fun generateEnum(valueSet: ValueSet, codeSystemMap: Map<String, CodeSystem>): FhirEnum? {
    val enumConstants =
      valueSet.compose
        ?.include
        ?.filter { it.isValueSystemSupported() }
        ?.flatMap { include ->
          val system = include.system!!
          generateEnumConstants(
            system = system,
            codeSystemConcepts = codeSystemMap[system]?.concept,
            valueSetConcepts = include.concept,
          )
        } ?: emptyList()
    return if (enumConstants.isNotEmpty()) {
      FhirEnum(valueSet.description, enumConstants)
    } else {
      null
    }
  }

  private fun generateEnumConstants(
    system: String,
    codeSystemConcepts: List<CodeSystemConcept>?,
    valueSetConcepts: List<ValueSystemConcept>?,
  ): List<FhirEnumConstant> {
    val valueSetConceptCodeSet = valueSetConcepts?.mapTo(hashSetOf()) { it.code } ?: emptySet()
    val flattenedCodeSystemConcepts = flattenCodeSystemConcepts(codeSystemConcepts)
    // Select concepts for enum generation. Prefer flattened CodeSystem concepts filtered
    // by codes present in the ValueSet. If no CodeSystem concepts exist, fall back to
    // ValueSet concepts, which include only code and system—the key properties for enums.
    // To address missing concepts in R4B and R5, we may need to add v3 CodeSystems like
    // CodeSystem-v3-AdministrativeGender, which are present in R4 but absent in later versions.
    return if (valueSetConceptCodeSet.isNotEmpty()) {
      if (flattenedCodeSystemConcepts.isNotEmpty()) {
        flattenedCodeSystemConcepts
          .filter { valueSetConceptCodeSet.contains(it.code) }
          .map { concept ->
            FhirEnumConstant(
              code = concept.code,
              system = system,
              name = concept.code.formatEnumConstantName(),
              display = concept.display,
              definition = concept.definition,
            )
          }
      } else {
        valueSetConcepts!!.map { concept ->
          FhirEnumConstant(
            code = concept.code,
            system = system,
            name = concept.code.formatEnumConstantName(),
            display = concept.display,
            definition = concept.definition,
          )
        }
      }
    } else
      flattenedCodeSystemConcepts.map { concept ->
        FhirEnumConstant(
          code = concept.code,
          system = system,
          name = concept.code.formatEnumConstantName(),
          display = concept.display,
          definition = concept.definition,
        )
      }
  }

  /**
   * Flattens a list of Concept objects, including all nested concepts, into a single, flat list.
   */
  private fun flattenCodeSystemConcepts(
    concepts: List<CodeSystemConcept>?
  ): List<CodeSystemConcept> =
    concepts?.flatMap { currentConcept ->
      buildList {
        add(currentConcept)
        currentConcept.concept?.let { nestedConcepts ->
          addAll(flattenCodeSystemConcepts(nestedConcepts))
        }
      }
    } ?: emptyList()

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
      if (withUnderscores.isNotEmpty() && withUnderscores.first().isDigit()) {
        "_$withUnderscores"
      } else {
        withUnderscores
      }
    return prefixed.split("_").joinToString("_") { part ->
      if (part.isEmpty()) "" else part.toPascalCase()
    }
  }
}
