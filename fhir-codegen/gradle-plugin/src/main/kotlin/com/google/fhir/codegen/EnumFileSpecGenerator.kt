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

import com.google.fhir.codegen.schema.*
import com.google.fhir.codegen.schema.valueset.ValueSet
import com.squareup.kotlinpoet.FileSpec

class EnumFileSpecGenerator(val valueSetMap: Map<String, ValueSet>) {

  /**
   * Generates shared enums. These enum classes are created from [StructureDefinition.snapshot]
   * Elements that have common binding extensions.
   */
  fun generate(structureDefinition: StructureDefinition, packageName: String): List<FileSpec> {
    return generateSharedEnumTypeSpec(structureDefinition.rootElements, packageName)
      .plus(
        structureDefinition.backboneElements.flatMap { elements ->
          generateSharedEnumTypeSpec(elements.value, packageName)
        }
      )
  }

  private fun generateSharedEnumTypeSpec(
    elements: List<Element>,
    packageName: String,
  ): List<FileSpec> =
    elements
      .filter { it.getValueSetUrl() != null && valueSetMap.containsKey(it.getValueSetUrl()) }
      .filterNot { !it.isCommonBinding }
      .mapNotNull { element ->
        val valueSetUrl = element.getValueSetUrl()
        val valueSet = valueSetMap.getValue(valueSetUrl!!)
        val valueSetName = valueSet.name.normalizeEnumName()
        val enumTypeSpec = EnumTypeSpecGenerator.generate(valueSetName, valueSet)
        enumTypeSpec?.let {
          // Enum classes generated from common binding elements are stored in the
          // "com.google.fhir.<r4|r4b|r5>.model" package, and the rest are stored in the
          // "com.google.fhir.<r4|r4b|r5>.terminology" package
          FileSpec.builder(
              packageName =
                if (element.typeIsEnumeratedCode(valueSetMap)) packageName
                else "$packageName.terminologies",
              fileName = valueSetName,
            )
            .addType(it)
            .build()
        }
      }
}
