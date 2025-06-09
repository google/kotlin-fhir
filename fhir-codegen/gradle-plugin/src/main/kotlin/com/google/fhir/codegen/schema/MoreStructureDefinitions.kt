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

package com.google.fhir.codegen.schema

import com.squareup.kotlinpoet.ClassName
import org.gradle.configurationcache.extensions.capitalized

const val ELEMENT_IS_COMMON_BINDING_EXTENSION_URL =
  "http://hl7.org/fhir/StructureDefinition/elementdefinition-isCommonBinding"

val StructureDefinition.rootElements
  get() =
    snapshot?.element?.filter { it.id.matches("$name\\.[A-Za-z0-9]+(\\[x])?".toRegex()) }
      ?: emptyList()

/**
 * Returns [Element]s from the [StructureDefinition] representing data members of the specified
 * class.
 *
 * For example, in the Patient StructureDefinition in `StructureDefinition-Patient.json` file in the
 * FHIR package:
 * - element `Patient.contact` (amongst others) will be returned for the class `Patient`
 * - element `Patient.contact.name` (amongst others) will be returned from the class
 *   `Patient.Contact`
 *
 * Use this function to determine data members of a class during code generation and to filter out
 * data members of enclosing and nested classes in the same [StructureDefinition] which should be
 * ignored. This is especially useful when BackboneElements are nested under a top-level FHIR
 * resource.
 *
 * @param className A [ClassName] object representing the class to filter elements by. The package
 *   name is ignored.
 */
fun StructureDefinition.getElements(className: ClassName) =
  snapshot?.element?.filter { element ->
    element.id.matches(
      (className.simpleNames
          .joinToString(".") { simpleName -> simpleName.replaceFirstChar { it.lowercase() } }
          .capitalized() + "\\.[A-Za-z0-9]+(\\[x])?")
        .toRegex()
    )
  } ?: emptyList()

val StructureDefinition.backboneElements
  get() =
    snapshot?.element?.let { elements ->
      elements
        .filter { it.isBackboneElement() }
        .associateWith { backboneElement ->
          elements.filter {
            it.path.matches("${backboneElement.path}\\.[A-Za-z0-9]+(\\[x])?".toRegex())
          }
        }
    } ?: emptyMap()

/** Concrete complex types and resources should be serializable with a custom serializer. */
val StructureDefinition.serializableWithCustomSerializer
  get() =
    !abstract &&
      (kind == StructureDefinition.Kind.RESOURCE || kind == StructureDefinition.Kind.COMPLEX_TYPE)

/**
 * Element, primitive types, and classes serializable with a custom serializer should have a primary
 * constructor.
 */
val StructureDefinition.hasPrimaryConstructor
  get() =
    name == "Element" ||
      kind == StructureDefinition.Kind.PRIMITIVE_TYPE ||
      serializableWithCustomSerializer

/**
 * Specifies type names for specific elements. In the FHIR specification the positiveInt and
 * unsignedInt types have the `value` field with the FHIRPath type
 * "http://hl7.org/fhirpath/System.String". Kotlin Int is used in the generated code.
 */
val elementIdToTypeNameMap =
  mapOf("positiveInt.value" to Int::class, "unsignedInt.value" to Int::class)
