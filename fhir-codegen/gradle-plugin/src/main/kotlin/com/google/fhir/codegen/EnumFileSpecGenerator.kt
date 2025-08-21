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

/**
 * Generates [FileSpec]s for Kotlin enum classes based on a provided map of [ValueSet]s.
 *
 * @property valueSetMap A map where the key is the canonical URL of a ValueSet and the value is the
 *   [ValueSet] resource itself.
 */
class EnumFileSpecGenerator(val valueSetMap: Map<String, ValueSet>) {

  /**
   * Generates a list of [FileSpec]s for enum classes from the elements within a
   * [StructureDefinition]. Processes both root and backbone elements, generating enums for bound
   * ValueSets. Enums from common bindings are placed in the core package, while others are stored
   * in a terminologies' subpackage.
   */
  fun generate(structureDefinition: StructureDefinition, packageName: String): List<FileSpec> {
    return createEnumFileSpec(structureDefinition.rootElements, packageName)
      .plus(
        structureDefinition.backboneElements.flatMap { elements ->
          createEnumFileSpec(elements.value, packageName)
        }
      )
  }

  /**
   * Filters elements with valid ValueSet bindings and generates [FileSpec] for each. Enums for
   * common bindings are placed in the provided package; others go into a `.terminologies`
   * subpackage.
   */
  private fun createEnumFileSpec(elements: List<Element>, packageName: String): List<FileSpec> =
    elements
      .asSequence()
      .filter { it.getValueSetUrl() != null && valueSetMap.containsKey(it.getValueSetUrl()) }
      .filterNot { !it.isCommonBinding }
      .mapNotNull { element ->
        val valueSetUrl = element.getValueSetUrl()
        val valueSet = valueSetMap.getValue(valueSetUrl!!)
        val valueSetName = valueSet.name.normalizeEnumName()
        val enumTypeSpec = EnumTypeSpecGenerator.generate(valueSetName, valueSet)
        enumTypeSpec?.let {
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
      .toList()
}
