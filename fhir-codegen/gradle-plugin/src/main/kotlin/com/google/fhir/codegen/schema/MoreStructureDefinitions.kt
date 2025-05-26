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

import com.google.fhir.codegen.primitives.FhirPathType
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.asTypeName
import org.gradle.configurationcache.extensions.capitalized

const val ELEMENT_IS_COMMON_BINDING_EXTENSION_URL =
  "http://hl7.org/fhir/StructureDefinition/elementdefinition-isCommonBinding"

const val ELEMENT_DEFINITION_BINDING_NAME_EXTENSION_URL =
  "http://hl7.org/fhir/StructureDefinition/elementdefinition-bindingName"

val StructureDefinition.rootElements
  get() =
    snapshot?.element?.filter { it.id.matches("$name\\.[A-Za-z0-9]+(\\[x])?".toRegex()) }
      ?: emptyList()

val ValueSet.urlPart
  get() = url.substringBeforeLast("|")

// TODO Fix conflicting commonBinding name "PublicationStatus" used in
//  Declared in StructureDefinition-specimen
//  and present in http://hl7.org/fhir/ValueSet/publication-status in r5
fun Include.isValueSystemSupported(): Boolean =
  !system.isNullOrBlank() &&
    !system.startsWith("urn", ignoreCase = true) &&
    system !in setOf("http://hl7.org/fhir/specimen-combined", "http://unitsofmeasure.org")

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

/**
 * Determines if an [Element] is a BackboneElement.
 *
 * In the FHIR resource ElementDefinition, there are a number of fields (e.g. `slicing`, `base`,
 * `type`) of type Element. However, for the purpose of code generation, they should be treated as
 * BackboneElements and nested classes should be generated for them.
 *
 * They are the only known instances of elements of type Element in StructureDefinitions. Therefore,
 * for simplicity, this function treats all elements of type Element as BackboneElements.
 */
fun Element.isBackboneElement(): Boolean {
  val typeCode = type?.singleOrNull()?.code
  return typeCode == "BackboneElement" || typeCode == "Element"
}

/** Retrieve an [Extension] with the provided url otherwise return `null` */
fun Element.getExtension(withUrl: String): Extension? {
  if (binding == null || binding.extension.isNullOrEmpty()) return null
  return binding.extension.find { it.url == withUrl }
}

fun Extension.isCommonBinding(): Boolean =
  url == ELEMENT_IS_COMMON_BINDING_EXTENSION_URL && valueBoolean == true

/**
 * Retrieve the [ValueSet.url] from the [Element]. Extract the URI part from the set url excluding
 * the FHIR versions E.g. http://hl7.org/fhir/ValueSet/task-status|4.3.0, will return
 * "http://hl7.org/fhir/ValueSet/task-status"
 */
fun Element.getValueSetUrl() = this.binding?.valueSet?.substringBeforeLast("|")

/**
 * Check if [Element]'s type is `code` and it has an extension with url
 * `http://hl7.org/fhir/StructureDefinition/elementdefinition-bindingName`, and the [Element.base]'
 * path does not start with a "Resource." and name (in PascalCase) is not blank. Some names in FHIR
 * are have symbols e.g. Element id "Requirements.statement.conformance" of
 * StructureDefinition-Requirements, the binding name is "??". It returns true if the enumeration
 * was/is to be generated from a ValueSet with systems that are supported. ValueSets with systems
 * beginning with "urn" are currently excluded.
 */
fun Element.typeIsEnumeratedCode(valueSetMap: Map<String, ValueSet>): Boolean {
  val valueSet = valueSetMap[getValueSetUrl()]
  if (valueSet == null) return false
  val isValidValueSet = valueSet.compose?.include?.all { it.isValueSystemSupported() }
  return isValidValueSet == true &&
    base?.path?.startsWith("Resource.") != true &&
    base?.path?.startsWith("CanonicalResource.") != true &&
    this.type?.count { it.code.equals("code", ignoreCase = true) } == 1 &&
    !this.getExtension(ELEMENT_DEFINITION_BINDING_NAME_EXTENSION_URL)
      ?.valueString
      ?.toPascalCase()
      .isNullOrBlank()
}

/**
 * Format the string by replacing all non-alphanumeric-characters with an empty string and
 * capitalize the first character. Example: v3.ObservationInterpretation ->
 * V3ObservationInterpretation
 */
fun String.toPascalCase(): String {
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

  // For consistency convert all uppercase word to lowercase then capitalize
  val formattedString =
    if (camelCaseString.all { it.isUpperCase() }) camelCaseString.lowercase().capitalized()
    else camelCaseString

  val alphanumericString = formattedString.replace(Regex("[^a-zA-Z0-9]+"), "")
  return alphanumericString
}

fun Element.getElementName() = path.substringAfterLast('.').removeSuffix("[x]")

/**
 * Specifies type names for specific elements. In the FHIR specification the positiveInt and
 * unsignedInt types have the `value` field with the FHIRPath type
 * "http://hl7.org/fhirpath/System.String". Kotlin Int is used in the generated code.
 */
val elementIdToTypeNameMap =
  mapOf("positiveInt.value" to Int::class, "unsignedInt.value" to Int::class)

/**
 * Determines the Kotlin type name for the entire [Element] in the generated Kotlin class,
 * considering:
 * - **FHIR Type:** The base FHIR data type of the element (e.g., string, integer, CodeableConcept).
 * - **Content Reference:** If the element has a `contentReference`, this is used to resolve the
 *   actual type.
 * - **Choice of Types:** For elements with a choice of types (e.g., `value[x]`), a sealed interface
 *   is generated to represent the different types.
 * - **Cardinality:** The element's cardinality (e.g., 0..1, 1..*, 0..*) determines whether the
 *   Kotlin type is nullable (e.g., `String?`) or a collection type (e.g., `List<String>`).
 *
 * Use this method for data members in the data class generated by
 * [com.google.fhir.codegen.ModelTypeSpecGenerator] (e.g. `Patient`). For the surrogate class
 * generated by [com.google.fhir.codegen.SurrogateTypeSpecGenerator] (e.g. `PatientSurrogate`), use
 * [getSurrogatePropertyNamesAndTypes].
 */
fun Element.getTypeName(className: ClassName): TypeName {
  getContentReferenceType(className.packageName)?.let {
    return it.toList(this).copy(nullable = true)
  }

  elementIdToTypeNameMap[id]?.let {
    return it.asTypeName().copy(nullable = true)
  }

  // Sealed interfaces for choice types. E.g., element `Patient.deceased[x]` can have type
  // boolean or dateTime. The generated sealed interface `Deceased` nested under `Patient`
  // class has two subclasses `Boolean` and `DateTime`.
  // See https://www.hl7.org/fhir/r4/formats.html#choice (R4).
  if (type!!.size > 1) {
    // The only case where the choice type inherits from the base definition is the element
    // `MetadataResource.versionAlgorithm[x]`. In the case, for simplicity, the base type
    // `CanonicalResource.versionAlgorithm[x]` is used.
    if (id != base!!.path) {
      return ClassName(
          className.packageName,
          base.path.removeSuffix("[x]").split('.').map { it.capitalized() },
        )
        .copy(nullable = true)
    }
    return className.nestedClass(getElementName().capitalized()).copy(nullable = true)
  }

  // Backbone element types are nested under the enclosing class e.g. `Patient.Contact`.
  if (isBackboneElement()) {
    return className
      .nestedClass(id.substringAfterLast('.').capitalized())
      .toList(this)
      .copy(nullable = true)
  }

  // TODO: Handle nullability depending on the min cardinality of the element
  return type
    .single()
    .getTypeName(className)
    .copy(nullable = true)
    .toList(this)
    .copy(nullable = true)
}

/**
 * Determines the Kotlin type name for the `type` in the [Element].
 *
 * This does not consider the **content reference**, **choice of types**, **cardinality**, or
 * **BackboneElement**, which are characteristics of the entire [Element].
 *
 * @param enclosingClassName The class name of the [Element]'s enclosing class.
 */
fun Type.getTypeName(enclosingClassName: ClassName): ClassName {
  return when (code) {
    // Type for the 'value' field in FHIR primitive data type.
    // For example, the FHIR primitive data type string has a 'value' field with FHIRPath type
    // "http://hl7.org/fhirpath/System.String". The Kotlin type for this field is a Kotlin String.
    in FhirPathType.getUris() -> {
      FhirPathType.getFromUri(code)!!.getTypeInDataClass(enclosingClassName.packageName)
    }

    else -> {
      // An external type. This can be either a FHIR primitive data type, e.g., string, or a
      // complex type, e.g., `HumanName`.
      // N.B. the FHIR primitive data type here is different from the FHIRPath type. E.g., a
      // name can be a FHIR string type, and inside the FHIR string type there will be a
      // `value` field with the FHIRPath type "http://hl7.org/fhirpath/System.String".
      ClassName(enclosingClassName.packageName, code.capitalized())
    }
  }
}

/**
 * Returns a map from property name to type name for data members of the surrogate class.
 *
 * Use this method for data members in the surrogate class generated by
 * [com.google.fhir.codegen.SurrogateTypeSpecGenerator] (e.g. `PatientSurrogate`). For the data
 * class generated by [com.google.fhir.codegen.ModelTypeSpecGenerator] (e.g. `Patient`), use
 * [getTypeName].
 */
fun Element.getSurrogatePropertyNamesAndTypes(
  enclosingClassName: ClassName
): Map<String, TypeName> {
  getContentReferenceType(enclosingClassName.packageName)?.let {
    return mapOf(getElementName() to it.toList(this).copy(nullable = true))
  }

  // Backbone element types are nested under the enclosing data class (e.g. `Patient.Contact`)
  if (isBackboneElement()) {
    return mapOf(
      getElementName() to
        enclosingClassName
          .nestedClass(id.substringAfterLast('.').capitalized())
          .toList(this)
          .copy(nullable = true)
    )
  }

  return type!!
    .flatMap { getSurrogatePropertyNamesAndTypeName(it, enclosingClassName).toList() }
    .associate { (name, type) -> name to type }
}

/**
 * Determines the property name and type for [type] in the surrogate class.
 *
 * Elements of primitive data types in FHIR are mapped to two JSON properties:
 * - a JSON property that has the name of the element and a JSON type that represents the primitive
 *   value of the FHIR data type
 * - a JSON property that has a prefix '_' in the name and type `Element` containing the "id" and/or
 *   "extensions", if present.
 *
 * This is the same for all FHIR versions, e.g. in
 * [R4](https://www.hl7.org/fhir/R4/json.html#primitive).
 *
 * The surrogate class (see [com.google.fhir.codegen.SurrogateTypeSpecGenerator])
 */
private fun Element.getSurrogatePropertyNamesAndTypeName(
  type: Type,
  enclosingClassName: ClassName,
): Map<String, TypeName> {
  val propertyName =
    if (this.type!!.size == 1) {
      getElementName()
    } else {
      "${getElementName()}${type.code.capitalized()}"
    }

  return if (FhirPathType.containsFhirTypeCode(type.code)) {
    mapOf(
      propertyName to
        FhirPathType.getFromFhirTypeCode(type.code)!!
          .typeInSurrogateClass
          .copy(nullable = true)
          .toList(this)
          .copy(nullable = true),
      "_$propertyName" to
        ClassName(enclosingClassName.packageName, "Element")
          .copy(nullable = true)
          .toList(this)
          .copy(nullable = true),
    )
  } else {
    mapOf(
      propertyName to
        type
          .getTypeName(enclosingClassName)
          .copy(nullable = true)
          .toList(this)
          .copy(nullable = true)
    )
  }
}

private fun TypeName.toList(element: Element): TypeName {
  return if (element.max == "*") {
    ClassName("kotlin.collections", "List").parameterizedBy(this)
  } else if (element.id.substringAfterLast('.') == "extension") {
    // this is to fix the definition in XHTML
    ClassName("kotlin.collections", "List").parameterizedBy(this)
  } else {
    this
  }
}

/**
 * Returns the Kotlin type name for the `contentReference` in the [Element], if present. Otherwise,
 * returns `null`.
 *
 * The `contentReference` element specifies an element in the definition whose type should be used
 * for the current [Element]. This should always be a BackboneElement which should be a nested
 * class.
 *
 * See documentation in
 * [R4](https://hl7.org/fhir/R4/elementdefinition-definitions.html#ElementDefinition.contentReference).
 */
private fun Element.getContentReferenceType(packageName: String): TypeName? {
  if (type == null && contentReference != null) {
    // The nested class name for the BackboneElement is recreated from the path of the
    // content reference. For example, the element "CapabilityStatement.rest.searchParam" has
    // the `contentReference` "#CapabilityStatement.rest.resource.searchParam" and the
    // [ClassName] for this type is "CapabilityStatement.Rest.Resource.SearchParam".
    return ClassName(
        packageName,
        contentReference.removePrefix("#").split('.').map { it.capitalized() },
      )
      .copy(nullable = true)
  }
  return null
}

/**
 * Sanitizes the string for KDoc, replacing character sequences that could break the comment block.
 *
 * See also: https://github.com/square/kotlinpoet/issues/887.
 */
fun String.sanitizeKDoc(): String {
  return this.replace("/*", "&#47;*")
}
