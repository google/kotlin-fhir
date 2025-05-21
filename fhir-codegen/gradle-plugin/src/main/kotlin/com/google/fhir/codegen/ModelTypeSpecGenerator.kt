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

import com.google.fhir.codegen.schema.Element
import com.google.fhir.codegen.schema.StructureDefinition
import com.google.fhir.codegen.schema.backboneElements
import com.google.fhir.codegen.schema.getElementName
import com.google.fhir.codegen.schema.getElements
import com.google.fhir.codegen.schema.getTypeName
import com.google.fhir.codegen.schema.hasPrimaryConstructor
import com.google.fhir.codegen.schema.rootElements
import com.google.fhir.codegen.schema.serializableWithCustomSerializer
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator
import org.gradle.configurationcache.extensions.capitalized

/** Generates a [TypeSpec] for a model class. */
object ModelTypeSpecGenerator {
  @OptIn(ExperimentalSerializationApi::class)
  fun generate(
    modelClassName: ClassName,
    structureDefinition: StructureDefinition,
    isBaseClass: Boolean,
    surrogateFileSpec: FileSpec.Builder,
    serializerFileSpec: FileSpec.Builder,
  ): TypeSpec {
    val typeSpec =
      TypeSpec.classBuilder(modelClassName)
        .apply {
          val structureDefinitionName = structureDefinition.name

          if (structureDefinition.abstract) {
            // All abstract structure definitions should be sealed (and therefore abstract) classes,
            // except for Element which is concrete but open to be used for fields prefixed with
            // '_'.
            if (structureDefinition.name == "Element") {
              addModifiers(KModifier.OPEN)
            } else {
              addModifiers(KModifier.SEALED)
            }
          } else if (
            (structureDefinition.kind == StructureDefinition.Kind.COMPLEX_TYPE ||
              structureDefinition.kind == StructureDefinition.Kind.PRIMITIVE_TYPE) && isBaseClass
          ) {
            // Some primitive types and complex types have to be kept open (therefore not abstract)
            // since they need to be subclassed. E.g. Uri can be extended by Url, and Quantity can
            // be extended by Duration.
            addModifiers(KModifier.OPEN)
          } else {
            addModifiers(KModifier.DATA)
          }

          // Serialization annotations
          if (structureDefinition.serializableWithCustomSerializer) {
            addAnnotation(
              AnnotationSpec.builder(Serializable::class)
                .addMember("with = %T::class", modelClassName.toSerializerClassName())
                .build()
            )
          } else if (structureDefinition.kind == StructureDefinition.Kind.RESOURCE) {
            // All resources (Resource class and its subclasses) are serializable
            addAnnotation(Serializable::class)
          } else if (structureDefinitionName == "Element") {
            // Element is serializable for fields prefixed with '_'
            addAnnotation(Serializable::class)
          }

          // Add JSON class discriminator annotation
          if (structureDefinitionName == "Resource") {
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

          // Serial name annotations for resources
          if (
            structureDefinition.kind == StructureDefinition.Kind.RESOURCE &&
              !structureDefinition.abstract
          ) {
            addAnnotation(
              AnnotationSpec.builder(SerialName::class)
                .addMember("%S", structureDefinitionName)
                .build()
            )
          }

          addKdoc(structureDefinition.description.sanitizeKDoc())

          // Set superclass if defined
          structureDefinition.baseDefinition?.substringAfterLast('/')?.capitalized()?.also {
            superclass(ClassName(modelClassName.packageName, it))
          }

          buildProperties(
            modelClassName,
            structureDefinition.rootElements,
            structureDefinition,
            isBaseClass,
          )

          addBackboneElement(
            structureDefinitionName,
            modelClassName,
            structureDefinition.backboneElements,
            structureDefinition,
            surrogateFileSpec,
            serializerFileSpec,
          )

          addSealedInterfaces(modelClassName, structureDefinition.rootElements)

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
        }
        .build()
    return typeSpec
  }
}

private fun TypeSpec.Builder.buildProperties(
  modelClassName: ClassName,
  elements: List<Element>,
  structureDefinition: StructureDefinition?, // null means backbone element
  isBaseClass: Boolean = false,
): TypeSpec.Builder {
  val properties =
    elements.map { element ->
      val name = element.getElementName()

      PropertySpec.builder(name, element.getTypeName(modelClassName))
        .mutable()
        .apply {
          if (structureDefinition == null || structureDefinition.hasPrimaryConstructor) {
            initializer(name)
          }

          if (element.path != element.base?.path) {
            // Override properties in base classes
            addModifiers(KModifier.OVERRIDE)
          }

          if (structureDefinition?.abstract == true) {
            // Make properties open in base classes
            // Keep element's properties concrete since it is used in serialization
            if (modelClassName.simpleName == "Element") {
              addModifiers(KModifier.OPEN)
            } else {
              addModifiers(KModifier.ABSTRACT)
            }
          } else if (isBaseClass) {
            addModifiers(KModifier.OPEN)
          }

          addKdoc("%L", element.definition.sanitizeKDoc())
          element.comment?.let { addKdoc("\n\n%L", it.sanitizeKDoc()) }
        }
        .build()
    }

  addProperties(properties)

  // Create primary constructor
  if (structureDefinition == null || structureDefinition.hasPrimaryConstructor) {
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
  }

  // Create superclass constructor
  if (
    structureDefinition?.kind == StructureDefinition.Kind.PRIMITIVE_TYPE &&
      structureDefinition.baseDefinition?.substringAfterLast('/')?.capitalized() != "PrimitiveType"
  ) {
    elements
      .filter { it.path != it.base?.path }
      .forEach {
        addSuperclassConstructorParameter(
          "%N",
          PropertySpec.builder(
              it.getElementName(),
              String::class.asTypeName().copy(nullable = true),
            )
            .apply { initializer(it.id) }
            .build(),
        )
      }
  }
  return this
}

/** Adds a nested class for each BackboneElement in the [StructureDefinition]. */
private fun TypeSpec.Builder.addBackboneElement(
  path: String,
  enclosingModelClassName: ClassName,
  backboneElements: Map<Element, List<Element>>,
  structureDefinition: StructureDefinition,
  surrogateTypeSpec: FileSpec.Builder,
  serializerTypeSpec: FileSpec.Builder,
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
          .apply {
            superclass(
              ClassName(enclosingModelClassName.packageName, backboneElement.type!!.single().code)
            )
          }
          .buildProperties(backboneElementClassName, elements, null)
          .addBackboneElement(
            backboneElement.path,
            enclosingModelClassName.nestedClass(name),
            backboneElements,
            structureDefinition,
            surrogateTypeSpec,
            serializerTypeSpec,
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

/**
 * Sanitizes the string for KDoc, replacing character sequences that could break the comment block.
 *
 * See also: https://github.com/square/kotlinpoet/issues/887.
 */
private fun String.sanitizeKDoc(): String {
  return this.replace("/*", "&#47;*")
}
