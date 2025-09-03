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

/** Generates [FileSpec]s for Kotlin enum classes based on a provided map of [ValueSet]s. */
class EnumFileSpecGenerator(val codegenContext: CodegenContext) {

  /**
   * Generates a list of [FileSpec]s for enum classes from the elements within a
   * [StructureDefinition]. Processes both root and backbone elements, generating enums for bound
   * ValueSets. Enums are created inside the terminologies' subpackage of the core models package.
   *
   * E.g. `com.google.fhir.model.r4.terminologies`
   */
  fun generate(structureDefinition: StructureDefinition): List<FileSpec> {
    return createEnumFileSpec(
        codegenContext.valueSetMap,
        structureDefinition.rootElements,
        codegenContext.packageName,
      )
      .plus(
        structureDefinition.backboneElements.flatMap { elements ->
          createEnumFileSpec(codegenContext.valueSetMap, elements.value, codegenContext.packageName)
        }
      )
  }

  /**
   * Filters elements with valid ValueSet bindings and generates [FileSpec] for each. Enums for
   * common bindings are placed in the provided package; others go into a `.terminologies`
   * subpackage.
   */
  private fun createEnumFileSpec(
    valueSetMap: Map<String, ValueSet>,
    elements: List<Element>,
    packageName: String,
  ): List<FileSpec> =
    elements
      .asSequence()
      .filter { it.getValueSetUrl() != null && valueSetMap.containsKey(it.getValueSetUrl()) }
      .filterNot { !it.isCommonBinding }
      .mapNotNull { element ->
        val valueSet = valueSetMap.getValue(element.getValueSetUrl()!!)
        val valueSetName = valueSet.name.normalizeEnumName()
        val enumTypeSpec = EnumTypeSpecGenerator.generate(valueSetName, valueSet)
        enumTypeSpec?.let {
          FileSpec.builder(packageName = "$packageName.terminologies", fileName = valueSetName)
            .addType(it)
            .build()
        }
      }
      .toList()
}
