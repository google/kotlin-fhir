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
import com.google.fhir.codegen.schema.valueset.ValueSet
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.asTypeName

const val ELEMENT_IS_COMMON_BINDING_EXTENSION_URL =
  "http://hl7.org/fhir/StructureDefinition/elementdefinition-isCommonBinding"

const val ELEMENT_DEFINITION_BINDING_NAME_EXTENSION_URL =
  "http://hl7.org/fhir/StructureDefinition/elementdefinition-bindingName"

val Element.isCommonBinding
  get() = getExtension(ELEMENT_IS_COMMON_BINDING_EXTENSION_URL)?.valueBoolean == true

val Element.bidingName
  get() = getExtension(ELEMENT_DEFINITION_BINDING_NAME_EXTENSION_URL)?.valueString

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

/** Retrieves an [Extension] with the provided url otherwise return `null` */
private fun Element.getExtension(withUrl: String): Extension? {
  if (binding == null || binding.extension.isNullOrEmpty()) return null
  return binding.extension.find { it.url == withUrl }
}

/**
 * Retrieves the [com.google.fhir.codegen.schema.valueset.ValueSet.url] from the [Element]. Extracts
 * the URI part from the set url excluding the FHIR versions E.g.
 * http://hl7.org/fhir/ValueSet/task-status|4.3.0, will return
 * "http://hl7.org/fhir/ValueSet/task-status"
 */
fun Element.getValueSetUrl() = this.binding?.valueSet?.substringBeforeLast("|")

/**
 * Determines if an enum should be generated for the element.
 *
 * An enum should be generated for the element if and only if the following requirements are met:
 * - The element's type is `code`.
 * - The element has an extension with the URL:
 *   `http://hl7.org/fhir/StructureDefinition/elementdefinition-bindingName`.
 * - The element's base path does **not** start with `"Resource."` or `"CanonicalResource."`.
 * - The element's name is not blank
 */
fun Element.typeIsEnumeratedCode(valueSetMap: Map<String, ValueSet>): Boolean {
  return valueSetMap.containsKey(getValueSetUrl()) &&
    base?.path?.startsWith("Resource.") != true &&
    base?.path?.startsWith("CanonicalResource.") != true &&
    this.type?.count { it.code.equals("code", ignoreCase = true) } == 1 &&
    !this.getExtension(ELEMENT_DEFINITION_BINDING_NAME_EXTENSION_URL)
      ?.valueString
      ?.normalizeEnumName()
      .isNullOrBlank()
}

fun Element.getElementName() = path.substringAfterLast('.').removeSuffix("[x]")

/**
 * Substitutes the primitive type of code with an `Enumeration` type if the values for the code are
 * constrained to a set of values.
 */
fun Element.getEnumerationTypeName(modelClassName: ClassName): TypeName {
  val elementBasePath = base?.path
  // Use bindingName for the enum class, subclasses re-use enums from the parent
  val bindingNameString = this.bidingName!!.normalizeEnumName()

  val enumClassName =
    if (path == elementBasePath) {
      bindingNameString
    } else {
      // In rare cases, refer to the base enum, e.g., Distance.comparator and Quantity.comparator
      "${elementBasePath?.substringBefore(".") ?: ""}.$bindingNameString"
    }

  val enumClassPackageName =
    if (this.isCommonBinding || enumClassName.contains(".")) modelClassName.packageName else ""

  val enumClass = ClassName(enumClassPackageName, enumClassName)
  return ClassName(modelClassName.packageName, "Enumeration")
    .parameterizedBy(enumClass)
    .withCardinalityInModel(this)
}

/**
 * Determines the Kotlin type name for the entire [Element] in the generated Kotlin class,
 * considering:
 * - **FHIR Type:** The base FHIR data type of the element (e.g., string, integer, CodeableConcept).
 * - **Content Reference:** If the element has a `contentReference`, this is used to resolve the
 *   actual type.
 * - **Choice of Types:** For elements with a choice of types (e.g., `value[ x ]`), a sealed
 *   interface is generated to represent the different types.
 * - **Cardinality:** The element's cardinality (e.g., 0..1, 1..*, 0..*) determines whether the
 *   Kotlin type is nullable (e.g., `String?`) or a collection type (e.g., `List<String>`).
 *
 * Use this method for data members in the data class generated by
 * [com.google.fhir.codegen.ModelTypeSpecGenerator] (e.g. `Patient`). For the surrogate class
 * generated by [com.google.fhir.codegen.SurrogateTypeSpecGenerator] (e.g. `PatientSurrogate`), use
 * [getSurrogatePropertyNameTypeDefaultValueList].
 */
fun Element.getTypeName(className: ClassName): TypeName {
  getContentReferenceType(className.packageName)?.let {
    return it.withCardinalityInModel(this)
  }

  elementIdToTypeNameMap[id]?.let {
    return it.asTypeName().withCardinalityInModel(this)
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
        .withCardinalityInModel(this)
    }
    return className.nestedClass(getElementName().capitalized()).withCardinalityInModel(this)
  }

  // Backbone element types are nested under the enclosing class e.g. `Patient.Contact`.
  if (isBackboneElement()) {
    return className
      .nestedClass(id.substringAfterLast('.').capitalized())
      .withCardinalityInModel(this)
  }

  // TODO: Handle nullability depending on the min cardinality of the element
  return type.single().getTypeName(className).withCardinalityInModel(this)
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
fun Element.getContentReferenceType(packageName: String): TypeName? {
  if (type == null && contentReference != null) {
    // The nested class name for the BackboneElement is recreated from the path of the
    // content reference. For example, the element "CapabilityStatement.rest.searchParam" has
    // the `contentReference` "#CapabilityStatement.rest.resource.searchParam" and the
    // [ClassName] for this type is "CapabilityStatement.Rest.Resource.SearchParam".
    return ClassName(
      packageName,
      contentReference.removePrefix("#").split('.').map { it.capitalized() },
    )
  }
  return null
}

/**
 * Returns a map from property name to type name for data members of the surrogate class.
 *
 * Use this method for data members in the surrogate class generated by
 * [com.google.fhir.codegen.SurrogateTypeSpecGenerator] (e.g. `PatientSurrogate`). For the data
 * class generated by [com.google.fhir.codegen.ModelTypeSpecGenerator] (e.g. `Patient`), use
 * [getTypeName].
 */
fun Element.getSurrogatePropertyNameTypeDefaultValueList(
  enclosingClassName: ClassName
): List<Triple<String, TypeName, String?>> {
  // Handle backbone elements and reference types first
  if (isBackboneElement()) {
      enclosingClassName
        .nestedClass(id.substringAfterLast('.').capitalized())
        .withCardinalityInSurrogate(this)
    } else {
      getContentReferenceType(enclosingClassName.packageName)?.withCardinalityInSurrogate(this)
    }
    ?.let {
      return listOf(Triple(getElementName(), it, getDefaultValueInSurrogate()))
    }

  // Otherwise, handle each type and combine the results
  return type!!.flatMap {
    this@getSurrogatePropertyNameTypeDefaultValueList.getSurrogatePropertyNameTypeDefaultValueList(
      it,
      enclosingClassName,
    )
  }
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
private fun Element.getSurrogatePropertyNameTypeDefaultValueList(
  type: Type,
  enclosingClassName: ClassName,
): List<Triple<String, TypeName, String?>> {
  val propertyName =
    if (this.type!!.size == 1) {
      getElementName()
    } else {
      "${getElementName()}${type.code.capitalized()}"
    }

  return if (FhirPathType.containsFhirTypeCode(type.code)) {
    listOf(
      Triple(
        propertyName,
        FhirPathType.getFromFhirTypeCode(type.code)!!
          .typeInSurrogateClass
          // Make sure the primitive type is nullable in a list as it's always possible for the list
          // to contain null values for padding. See
          // https://www.hl7.org/fhir/R5/json.html#primitive.
          .copy(nullable = true)
          .withCardinalityInSurrogate(this)
          // The primitive element in the surrogate class should always be nullable, since it is
          // possible to omit this field entirely if the primitive has only id and/or extensions in
          // the companion element but no value. See
          // https://www.hl7.org/fhir/R5/json.html#primitive.
          .copy(nullable = true),
        // The default value for primitive types should always be `null` for the same reason.
        "null",
      ),
      Triple(
        "_$propertyName",
        ClassName(enclosingClassName.packageName, "Element")
          // Make sure the primitive type is nullable in a list as it's always possible for the list
          // to contain null values for padding. See
          // https://www.hl7.org/fhir/R5/json.html#primitive.
          .copy(nullable = true)
          .withCardinalityInSurrogate(this)
          // The companion element (prefixed with an underscore) in the surrogate class should
          // always be nullable, since it is possible to omit this field entirely in JSON if the
          // primitive has no id and/or extensions.
          .copy(nullable = true),
        // The default value for the companion element of primitive types should always be `null`
        // for the same reason.
        "null",
      ),
    )
  } else {
    listOf(
      Triple(
        propertyName,
        type.getTypeName(enclosingClassName).withCardinalityInSurrogate(this),
        getDefaultValueInSurrogate(),
      )
    )
  }
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
 * Transforms the [TypeName] for model class depending on the [Element]'s cardinality.
 * - If the [Element]'s max cardinality is "*" or it is the extension element, make the type a list.
 * - Otherwise, if the [Element]'s min cardinality is 0, make the type nullable.
 * - Otherwise, do nothing.
 */
private fun TypeName.withCardinalityInModel(element: Element): TypeName {
  return if (element.max == "*") {
    ClassName("kotlin.collections", "MutableList").parameterizedBy(this)
  } else if (
    element.id.substringAfterLast('.') == "extension" ||
      element.id.substringAfterLast('.') == "modifierExtension"
  ) {
    // TODO: Check if this is still needed
    // This is to fix the definition in XHTML
    ClassName("kotlin.collections", "MutableList").parameterizedBy(this)
  } else if (element.min == 0) {
    this.copy(nullable = true)
  } else {
    this
  }
}

/**
 * Transforms the [TypeName] for model class depending on the [Element]'s cardinality.
 * - If the [Element]'s max cardinality is "*" or it is the extension element, make the type a list.
 * - Otherwise, if the [Element]'s min cardinality is 0, make the type nullable.
 * - Otherwise, do nothing.
 */
private fun TypeName.withCardinalityInSurrogate(element: Element): TypeName {
  return if (element.max == "*") {
    ClassName("kotlin.collections", "MutableList").parameterizedBy(this).copy(nullable = true)
  } else if (
    element.id.substringAfterLast('.') == "extension" ||
      element.id.substringAfterLast('.') == "modifierExtension"
  ) {
    // TODO: Check if this is still needed
    // This is to fix the definition in XHTML
    ClassName("kotlin.collections", "MutableList").parameterizedBy(this).copy(nullable = true)
  } else if (element.min == 0) {
    this.copy(nullable = true)
  } else if (element.type != null && element.type.size > 1) {
    // Choice types should always be nullable since there is no guarantee that any of the
    // choices will be the provided type.
    this.copy(nullable = true)
  } else {
    this
  }
}

/** Returns the default value for the generated field in the surrogate class. */
fun Element.getDefaultValueInSurrogate(): String? {
  if (id == "xhtml.extension") {
    // This element overrides the cardinality of the extension element in the base class and has the
    // cardinality of 0..0.
    // TODO: Deprecate this element in the generated Xhtml class, possibly with @Deprecated
    // annotation.
    return "mutableListOf()"
  }
  if (max == "*") {
    // Whilst the default value for repeated elements is empty list in the model class, it is null
    // in the surrogate class. This is because the JSON object might omit the list altogether.
    return "null"
  }
  if (min == 0) {
    return "null"
  }
  if ((type?.size ?: 0) > 1) {
    // Choice of types should always be nullable since there is no guarantee that any of the choices
    // is the provided type in the surrogate class, and therefore should always have the default
    // value `null`.
    return "null"
  }
  return null
}

/**
 * Return the name of the surrogate class for properties that can be provided with multiple types.
 *
 * Example: The 'Patient.deceased' [Element.path] will produce "PatientDeceasedSurrogate"
 */
fun Element.getPolymorphicTypeSurrogateClassSimpleName(): String = buildString {
  append(getPathSimpleNames().joinToString(""))
  append("Surrogate")
}

fun Element.getPathSimpleNames(): List<String> =
  path.replace("[x]", "").split(".").map { it.capitalized() }
