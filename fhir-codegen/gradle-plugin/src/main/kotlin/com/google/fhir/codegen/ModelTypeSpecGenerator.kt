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

import com.google.fhir.codegen.ModelTypeSpecGenerator.excludeValueSet
import com.google.fhir.codegen.schema.CodeSystem
import com.google.fhir.codegen.schema.ELEMENT_DEFINITION_BINDING_NAME_EXTENSION_URL
import com.google.fhir.codegen.schema.ELEMENT_IS_COMMON_BINDING_EXTENSION_URL
import com.google.fhir.codegen.schema.Element
import com.google.fhir.codegen.schema.StructureDefinition
import com.google.fhir.codegen.schema.ValueSet
import com.google.fhir.codegen.schema.backboneElements
import com.google.fhir.codegen.schema.getElementName
import com.google.fhir.codegen.schema.getElements
import com.google.fhir.codegen.schema.getExtension
import com.google.fhir.codegen.schema.getMergedCodeSystem
import com.google.fhir.codegen.schema.getTypeName
import com.google.fhir.codegen.schema.getValueSetUrl
import com.google.fhir.codegen.schema.isCommonBinding
import com.google.fhir.codegen.schema.kebabToPascalCase
import com.google.fhir.codegen.schema.rootElements
import com.google.fhir.codegen.schema.sanitizeKDoc
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import kotlinx.serialization.json.JsonClassDiscriminator
import org.gradle.configurationcache.extensions.capitalized

/** Generates a [TypeSpec] for a model class. */
object ModelTypeSpecGenerator {
  // These ValueSets are to be excluded, they reference CodeSystem used to create external enums
  val excludeValueSet =
    setOf(
      "http://hl7.org/fhir/ValueSet/subject-type", // Will re-use  ResourceType enum
      "http://hl7.org/fhir/ValueSet/resource-types", // Will re-use ResourceType enum
      "http://hl7.org/fhir/ValueSet/administrative-gender",
      "http://hl7.org/fhir/ValueSet/legal-status-of-supply",
    )

  fun generate(
    modelClassName: ClassName,
    structureDefinition: StructureDefinition,
    isBaseClass: Boolean,
    surrogateFileSpec: FileSpec.Builder,
    serializerFileSpec: FileSpec.Builder,
    valueSetMap: Map<String, ValueSet>,
    codeSystemMap: Map<String, CodeSystem>,
    nonCommonBindingValueSetUrls: MutableSet<String>,
    excludedCommonBindingValueSets: Set<String>,
  ): TypeSpec {
    // Local enum classes that are non-binding should be stored in the enclosing closing class.
    // This ensures re-use of enum classes by the nested classes
    val enumClassesMap = mutableMapOf<String, TypeSpec>()
    val typeSpec =
      TypeSpec.classBuilder(modelClassName)
        .apply {
          val structureDefinitionName = structureDefinition.name
          if (
            (!isBaseClass && structureDefinition.kind == StructureDefinition.Kind.RESOURCE) ||
              (structureDefinition.kind == StructureDefinition.Kind.COMPLEX_TYPE &&
                structureDefinitionName != "Base" &&
                structureDefinitionName != "Element" &&
                structureDefinitionName != "BackboneElement")
          ) {
            addAnnotation(
              AnnotationSpec.builder(Serializable::class)
                .addMember("with = %T::class", modelClassName.toSerializerClassName())
                .build()
            )
          } else if (structureDefinitionName == "Element") {
            // element is serializable for the _ fields
            addAnnotation(Serializable::class)
          } else if (structureDefinitionName == "Resource") {
            // resource is serializable for the contained fields
            addAnnotation(Serializable::class)
          } else if (structureDefinitionName == "BackboneElement") {
            // mark as serializable for the backbone elements in resources
            addAnnotation(Serializable::class)
          } else if (structureDefinitionName == "DomainResource") {
            addAnnotation(Serializable::class)
          }
          if (
            structureDefinitionName == "DomainResource" || structureDefinitionName == "Resource"
          ) {
            addModifiers(KModifier.SEALED)
            addAnnotation(
              AnnotationSpec.builder(ClassName("kotlin", "OptIn"))
                .addMember(
                  "%T::class",
                  ClassName("kotlinx.serialization", "ExperimentalSerializationApi"),
                )
                .build()
            )
            addAnnotation(
              AnnotationSpec.builder(JsonClassDiscriminator::class)
                .addMember("%S", "resourceType")
                .build()
            )
          }

          if (structureDefinition.kind == StructureDefinition.Kind.RESOURCE) {
            addAnnotation(
              AnnotationSpec.builder(SerialName::class)
                .addMember("%S", structureDefinitionName)
                .build()
            )
          }

          // BackboneElement is not considered base class because no resource directly extends it
          // But it still should be marked as open to allow for subclasses
          if (isBaseClass || structureDefinitionName == "BackboneElement") {
            if (structureDefinition.kind == StructureDefinition.Kind.RESOURCE) {
              addModifiers(KModifier.ABSTRACT)
            } else if (
              structureDefinition.kind == StructureDefinition.Kind.PRIMITIVE_TYPE ||
                structureDefinition.kind == StructureDefinition.Kind.COMPLEX_TYPE
            ) {
              addModifiers(KModifier.OPEN)
            }
          } else {
            addModifiers(KModifier.DATA)
          }

          addKdoc(structureDefinition.description.sanitizeKDoc())

          // Set superclass if defined
          structureDefinition.baseDefinition?.substringAfterLast('/')?.capitalized()?.also {
            superclass(
              ClassName(
                modelClassName.packageName,
                if (structureDefinitionName.capitalized() == "MetadataResource") {
                  // TODO: Inherits interfaces properly
                  "CanonicalResource"
                } else {
                  it
                },
              )
            )
          }

          buildProperties(
            modelClassName,
            structureDefinition.rootElements,
            isBaseClass,
            excludedCommonBindingValueSets,
          )

          addBackboneElement(
            path = structureDefinitionName,
            enclosingModelClassName = modelClassName,
            backboneElements = structureDefinition.backboneElements,
            structureDefinition = structureDefinition,
            surrogateTypeSpec = surrogateFileSpec,
            serializerTypeSpec = serializerFileSpec,
            valueSetMap = valueSetMap,
            codeSystemMap = codeSystemMap,
            nonCommonBindingValueSetUrls = nonCommonBindingValueSetUrls,
            excludedCommonBindingValueSets = excludedCommonBindingValueSets,
            enumClassesMap = enumClassesMap,
          )

          addSealedInterfaces(modelClassName, structureDefinition.rootElements)

          generateEnumClasses(
            elements = structureDefinition.rootElements,
            valueSetMap = valueSetMap,
            codeSystemMap = codeSystemMap,
            nonCommonBindingValueSetUrls = nonCommonBindingValueSetUrls,
            enumClassesMap = enumClassesMap,
          )

          if (structureDefinition.kind == StructureDefinition.Kind.PRIMITIVE_TYPE) {
            addToElementFunction(
              modelClassName.packageName,
              isBaseClass,
              // In R4 primitive types inherit from Element and in R5 they inherit from
              // PrimitiveType. If a type directly inherits Element or PrimitiveType do not
              // generate override modifier for the toElement function.
              structureDefinition.baseDefinition ==
                "http://hl7.org/fhir/StructureDefinition/Element" ||
                structureDefinition.baseDefinition ==
                  "http://hl7.org/fhir/StructureDefinition/PrimitiveType",
            )
            addOfFunction(modelClassName, propertySpecs.single { it.name == "value" }.type)
          }

          enumClassesMap.forEach {
            // In some cases the model may share name with enum class
            val enumClassName =
              if (modelClassName.simpleNames.any { name -> name == it.key }) "${it.key}Enum"
              else it.key
            modelClassName.nestedClass(enumClassName)
            addType(it.value)
          }
        }
        .build()
    return typeSpec
  }
}

private fun TypeSpec.Builder.generateEnumClasses(
  elements: List<Element>,
  valueSetMap: Map<String, ValueSet>,
  codeSystemMap: Map<String, CodeSystem>,
  nonCommonBindingValueSetUrls: MutableSet<String>,
  enumClassesMap: MutableMap<String, TypeSpec>,
): TypeSpec.Builder {
  elements.forEach { element ->
    val commonBindingExt = element.getExtension(ELEMENT_IS_COMMON_BINDING_EXTENSION_URL)
    val bindingNameExt = element.getExtension(ELEMENT_DEFINITION_BINDING_NAME_EXTENSION_URL)

    val enumClassName = bindingNameExt?.valueString?.kebabToPascalCase()
    if (commonBindingExt?.isCommonBinding() != true && !enumClassName.isNullOrBlank()) {
      val valueSet = valueSetMap[element.getValueSetUrl()]
      if (!excludeValueSet.contains(valueSet?.url)) {
        val mergedCodeSystem = valueSet?.getMergedCodeSystem(codeSystemMap)
        if (!mergedCodeSystem?.concept.isNullOrEmpty()) {
          val typeSpec = EnumTypeSpecGenerator.generate(enumClassName, mergedCodeSystem)
          enumClassesMap.putIfAbsent(enumClassName, typeSpec)
          nonCommonBindingValueSetUrls.add(valueSet.url)
        }
      }
    }
  }
  return this
}

private fun TypeSpec.Builder.buildProperties(
  modelClassName: ClassName,
  elements: List<Element>,
  isBaseClass: Boolean,
  excludedCommonBindingValueSets: Set<String>,
): TypeSpec.Builder {
  val properties =
    elements.map { element ->
      val name = element.getElementName()
      val elementValueSetUrl = element.getValueSetUrl()
      val type =
        when {
          !excludedCommonBindingValueSets.contains(elementValueSetUrl) &&
            element.type?.count { it.code.equals("code", ignoreCase = true) } == 1 &&
            !element
              .getExtension(ELEMENT_DEFINITION_BINDING_NAME_EXTENSION_URL)
              ?.valueString
              .isNullOrBlank() -> {
            if (
              element.base?.path == null ||
                (element.path == element.base.path &&
                  modelClassName.simpleName !in
                    setOf("Resource", "DomainResource", "BackboneElement"))
            ) {
              getEnumerationTypeName(element, modelClassName)
            } else element.getTypeName(modelClassName)
          }
          else -> element.getTypeName(modelClassName)
        }

      PropertySpec.builder(name, type)
        .mutable()
        .apply {
          initializer(name)

          if (element.path != element.base?.path) {
            // Override properties in base classes
            addModifiers(KModifier.OVERRIDE)
          } else if (isBaseClass || modelClassName.simpleName == "BackboneElement") {
            // Make properties open in base classes
            addModifiers(KModifier.OPEN)
          }

          if (
            modelClassName.simpleName == "Resource" ||
              modelClassName.simpleName == "DomainResource" ||
              modelClassName.simpleName == "BackboneElement"
          ) {
            // Mark elements in Resource, DomainResource and BackboneElement classes as
            // transient as we never intend to actually deserialize them.
            addAnnotation(Transient::class)
          }

          addKdoc("%L", element.definition.sanitizeKDoc())
          element.comment?.let { addKdoc("\n\n%L", it.sanitizeKDoc()) }
        }
        .build()
    }

  addProperties(properties)

  // Create primary constructor
  primaryConstructor(
    FunSpec.constructorBuilder()
      .apply {
        properties.forEach { prop ->
          addParameter(
            ParameterSpec.builder(name = prop.name, type = prop.type).defaultValue("null").build()
          )
        }
      }
      .build()
  )

  // Create superclass constructor
  elements
    .filter { it.path != it.base?.path }
    .forEach {
      addSuperclassConstructorParameter(
        "%N",
        PropertySpec.builder(it.getElementName(), String::class.asTypeName().copy(nullable = true))
          .apply { initializer(it.id) }
          .build(),
      )
    }
  return this
}

/**
 * Substitute the primitive type of code with an `Enumeration` type if the values for the code are
 * constrained to a set of values. The implementation checks if there exists a [Element] has a
 * binding extension, otherwise returns the type for the primitive type `code`.
 */
private fun getEnumerationTypeName(element: Element, modelClassName: ClassName): TypeName {
  val bindingNameExt = element.getExtension(ELEMENT_DEFINITION_BINDING_NAME_EXTENSION_URL)
  val commonBindingExt = element.getExtension(ELEMENT_IS_COMMON_BINDING_EXTENSION_URL)
  val enumClassPackageName =
    if (commonBindingExt?.isCommonBinding() == true) "${modelClassName.packageName}.enums" else ""

  val enumClassName = bindingNameExt?.valueString?.kebabToPascalCase()
  if (!enumClassName.isNullOrBlank()) {
    // Handle special cases FHIRResourceType and FHIRDefinedType namee, both refer to the same
    // ResourceType enum
    val isResourceType =
      "FHIRResourceType".equals(enumClassName, ignoreCase = true) ||
        "FHIRDefinedType".equals(enumClassName, ignoreCase = true)
    val enumClass =
      ClassName(
        if (isResourceType) "${modelClassName.packageName}.enums" else enumClassPackageName,
        if (isResourceType) "ResourceType" else enumClassName,
      )
    val enumerationClassName = ClassName(modelClassName.packageName, "Enumeration")
    return enumerationClassName.parameterizedBy(enumClass).copy(nullable = true)
  } else {
    return element.getTypeName(modelClassName)
  }
}

/** Adds a nested class for each BackboneElement in the [StructureDefinition]. */
private fun TypeSpec.Builder.addBackboneElement(
  path: String,
  enclosingModelClassName: ClassName,
  backboneElements: Map<Element, List<Element>>,
  structureDefinition: StructureDefinition,
  surrogateTypeSpec: FileSpec.Builder,
  serializerTypeSpec: FileSpec.Builder,
  valueSetMap: Map<String, ValueSet>,
  codeSystemMap: Map<String, CodeSystem>,
  nonCommonBindingValueSetUrls: MutableSet<String>,
  excludedCommonBindingValueSets: Set<String>,
  enumClassesMap: MutableMap<String, TypeSpec>,
): TypeSpec.Builder {
  backboneElements
    .filter { (backboneElement, _) ->
      backboneElement.path.matches("$path\\.[A-Za-z0-9]+".toRegex())
    }
    .forEach { (backboneElement, elements) ->
      val name = backboneElement.path.substringAfterLast('.').capitalized()
      val backboneElementClassName = enclosingModelClassName.nestedClass(name)
      addType(
        TypeSpec.classBuilder(name)
          .addAnnotation(
            AnnotationSpec.builder(Serializable::class)
              .addMember("with = %T::class", backboneElementClassName.toSerializerClassName())
              .build()
          )
          .apply { addKdoc(backboneElement.definition.sanitizeKDoc()) }
          .superclass(ClassName(enclosingModelClassName.packageName, "BackboneElement"))
          .buildProperties(
            backboneElementClassName,
            elements,
            false,
            excludedCommonBindingValueSets,
          )
          .addBackboneElement(
            backboneElement.path,
            enclosingModelClassName.nestedClass(name),
            backboneElements,
            structureDefinition,
            surrogateTypeSpec,
            serializerTypeSpec,
            valueSetMap,
            codeSystemMap,
            nonCommonBindingValueSetUrls,
            excludedCommonBindingValueSets,
            enumClassesMap,
          )
          .generateEnumClasses(
            elements = backboneElements.values.flatten(),
            valueSetMap = valueSetMap,
            codeSystemMap = codeSystemMap,
            nonCommonBindingValueSetUrls = nonCommonBindingValueSetUrls,
            enumClassesMap = enumClassesMap,
          )
          .addSealedInterfaces(
            backboneElementClassName,
            structureDefinition.getElements(backboneElementClassName),
          )
          .build()
      )

      // TODO: Handle cases where the BackboneElement does not need the surrogate class and
      //  the custom serializer since it does not have any primitive fields.
      surrogateTypeSpec.addType(
        SurrogateTypeSpecGenerator.generate(
          enclosingModelClassName.nestedClass(name.capitalized()),
          elements,
        )
      )
      serializerTypeSpec.addType(
        SerializerTypeSpecGenerator.generate(enclosingModelClassName.nestedClass(name))
      )
    }
  return this
}

/** Adds a nested sealed interface for each choice type in the [StructureDefinition]. */
private fun TypeSpec.Builder.addSealedInterfaces(
  enclosingModelClassName: ClassName,
  elements: List<Element>,
): TypeSpec.Builder {
  for (element in elements.filter { it.path.endsWith("[x]") }) {
    val sealedInterfaceClassName =
      enclosingModelClassName.nestedClass(element.getElementName().capitalized())
    addType(
      TypeSpec.interfaceBuilder(sealedInterfaceClassName)
        .addModifiers(KModifier.SEALED)
        .apply {
          for (type in element.type!!) {
            addType(
              TypeSpec.classBuilder(type.code.capitalized())
                .addModifiers(KModifier.DATA)
                .primaryConstructor(
                  FunSpec.constructorBuilder()
                    .addParameter("value", type.getTypeName(enclosingModelClassName))
                    .build()
                )
                .addProperty(
                  PropertySpec.builder("value", type.getTypeName(enclosingModelClassName))
                    .initializer("value")
                    .build()
                )
                .addSuperinterface(sealedInterfaceClassName)
                .build()
            )
          }
          addType(
              // Add a `from` function in the companion object with a parameter list
              // containing each data type in the choice type. This function is used to
              // construct the property in the data class from the properties in the
              // surrogate class.
              TypeSpec.companionObjectBuilder()
                .addFunction(
                  FunSpec.builder("from")
                    .apply {
                      for (type in element.type) {
                        addParameter(
                          ParameterSpec(
                            "${type.code}Value",
                            type.getTypeName(enclosingModelClassName).copy(nullable = true),
                          )
                        )
                        addCode(
                          CodeBlock.builder()
                            .add(
                              "if(%N != null) return %T(%N) \n",
                              "${type.code}Value",
                              sealedInterfaceClassName.nestedClass(type.code.capitalized()),
                              "${type.code}Value",
                            )
                            .build()
                        )
                      }
                      addCode(CodeBlock.builder().add("return null").build())
                    }
                    .returns(sealedInterfaceClassName.copy(nullable = true))
                    .build()
                )
                .build()
            )
            .apply {
              // Add an `asDataType` function for each choice type. This function is used
              // to deconstruct the property of the sealed interface in the data class into
              // separate properties in the surrogate class.
              for (type in element.type) {
                addFunction(
                  FunSpec.builder("as${type.code.capitalized()}")
                    .returns(
                      sealedInterfaceClassName
                        .nestedClass(type.code.capitalized())
                        .copy(nullable = true)
                    )
                    .addCode(
                      CodeBlock.builder()
                        .add(
                          "return this as? %T",
                          sealedInterfaceClassName.nestedClass(type.code.capitalized()),
                        )
                        .build()
                    )
                    .build()
                )
              }
            }
        }
        .build()
    )
  }
  return this
}

/**
 * Adds a [FunSpec] for the `toElement` function that returns
 * - an `Element` for the FHIR primitive data type if either `id` or `extension` is present,
 * - `null`, otherwise.
 */
private fun TypeSpec.Builder.addToElementFunction(
  packageName: String,
  isBaseClass: Boolean,
  inheritsElement: Boolean,
) {
  addFunction(
    FunSpec.builder("toElement")
      .returns(ClassName(packageName, "Element").copy(nullable = true))
      .apply {
        if (isBaseClass) {
          addModifiers(KModifier.OPEN)
        }
        if (!inheritsElement) {
          addModifiers(KModifier.OVERRIDE)
        }
      }
      .addStatement(
        "if (id != null || extension != null) { return %T(id, extension) }",
        ClassName(packageName, "Element"),
      )
      .addStatement("return null")
      .build()
  )
}

/**
 * Adds a companion object with an `of` function to return a FHIR primitive date type object from a
 * Kotlin primitive value and a FHIR `Element`.
 *
 * The generated function is useful for merging the two fields in the surrogate class representing
 * the two JSON properties into a single field in the data class.
 *
 * For example, the `birthDate` and `_birthDate` JSON properties in a patient object are
 * deserialized into two fields in the `PatientSurrogate` class:
 * - `birthDate`: `LocalDate` storing the primitive value
 * - `_birthDate`: `Element` storing the id and extensions of the FHIR data type
 *
 * N.B. The `LocalDate` type here is `kotlinx.datetime.LocalDate`.
 *
 * They are then merged into a single field in the `Patient` class:
 * - `birthDate`: `Date`
 *
 * N.B. The `Date` type here is a FHIR primitive type that contains both the primitive Kotlin value
 * and the `Element` with id and extensions.
 *
 * For this example, this function will add the following code to the FHIR primitive data type
 * `Date`:
 * ```
 * public companion object {
 *   public fun of(`value`: LocalDate?, element: Element?): Date? =
 *     if (value == null && element == null) {
 *       null
 *     } else {
 *       Date(element?.id, element?.extension, value)
 *     }
 * }
 * ```
 */
private fun TypeSpec.Builder.addOfFunction(className: ClassName, primitiveTypeName: TypeName) {
  addType(
    TypeSpec.companionObjectBuilder()
      .addFunction(
        FunSpec.builder("of")
          .addParameter("value", primitiveTypeName.copy(nullable = true))
          .addParameter(
            "element",
            ClassName(className.packageName, "Element").copy(nullable = true),
          )
          .addCode(
            "return if (value == null && element == null) { null } else { %T(element?.id, element?.extension, value) }",
            className,
          )
          .returns(className.copy(nullable = true))
          .build()
      )
      .build()
  )
}
