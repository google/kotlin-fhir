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

import com.google.fhir.codegen.primitives.FhirPathType
import com.google.fhir.codegen.schema.Element
import com.google.fhir.codegen.schema.Type
import com.google.fhir.codegen.schema.capitalized
import com.google.fhir.codegen.schema.getElementName
import com.google.fhir.codegen.schema.getPathSimpleNames
import com.google.fhir.codegen.schema.getPolymorphicTypeSurrogateClassSimpleName
import com.google.fhir.codegen.schema.getSurrogatePropertyNameTypeDefaultValueList
import com.google.fhir.codegen.schema.getTypeName
import com.google.fhir.codegen.schema.getValueSetUrl
import com.google.fhir.codegen.schema.isCommonBinding
import com.google.fhir.codegen.schema.normalizeEnumName
import com.google.fhir.codegen.schema.typeIsEnumeratedCode
import com.google.fhir.codegen.schema.valueset.ValueSet
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import kotlinx.serialization.Serializable

/**
 * Generates a [TypeSpec] for a surrogate classes.
 *
 * The surrogate class represents the structure of the JSON object accurately for ease of
 * serialization/deserialization. The custom serializer delegates the serialization/deserialization
 * to the surrogate class and then convert the surrogate class from/to the desired data model.
 *
 * See
 * [surrogate](https://github.com/Kotlin/kotlinx.serialization/blob/master/docs/serializers.md#composite-serializer-via-surrogate).
 */
class SurrogateTypeSpecGenerator(private val valueSetMap: Map<String, ValueSet>) {
  /**
   * Generates a [TypeSpec] for the model's Surrogate (including backbone elements).
   *
   * Example: PatientSurrogate for the Patient resource.
   */
  fun generateModelSurrogate(modelClassName: ClassName, elements: List<Element>): TypeSpec =
    TypeSpec.classBuilder(modelClassName.toSurrogateClassName())
      .apply {
        addAnnotation(Serializable::class)
        addModifiers(KModifier.INTERNAL)
        addModifiers(KModifier.DATA).apply {
          val propertyParamPairs =
            elements.flatMap { element ->
              // Example Patient.deceased[x] can be either a Boolean or a DateTime.
              if (element.path.endsWith("[x]")) {
                val propertyName =
                  element.getPathSimpleNames().last().replaceFirstChar { it.lowercase() }
                val nullable = element.min < 1
                val property =
                  PropertySpec.builder(
                      propertyName,
                      ClassName(modelClassName.packageName, element.getPathSimpleNames())
                        .copy(nullable = nullable),
                    )
                    .initializer(propertyName)
                    .mutable()
                    .build()
                val parameter =
                  ParameterSpec.builder(property.name, property.type)
                    .apply { if (nullable) defaultValue("null") }
                    .build()
                listOf(Pair(property, parameter))
              } else {
                element.getSurrogatePropertyNameTypeDefaultValueList(modelClassName).map {
                  val property =
                    PropertySpec.builder(it.first, it.second)
                      .initializer(it.first)
                      .mutable()
                      .build()
                  val parameter =
                    ParameterSpec.builder(it.first, it.second)
                      .apply { it.third?.let { defaultValue -> defaultValue(defaultValue) } }
                      .build()
                  Pair(property, parameter)
                }
              }
            }
          addProperties(propertyParamPairs.map { it.first })
          primaryConstructor(
            FunSpec.constructorBuilder()
              .apply { propertyParamPairs.forEach { addParameter(it.second) } }
              .build()
          )
        }
        addConverterToModelClass(modelClassName, elements)
        addConverterFromModelClass(modelClassName, elements)
      }
      .build()

  /**
   * Generates a list of [TypeSpec] for sealed interface Surrogate classes.
   *
   * Example: PatientDeceasedSurrogate and PatientMultipleBirthSurrogate for the Patient.Deceased
   * and Patient.MultipleBirth sealed interfaces.
   */
  fun generateSealedInterfaceSurrogates(
    className: ClassName,
    elements: List<Element>,
  ): List<TypeSpec> =
    elements
      .filter { it.path.endsWith("[x]") }
      .map { element: Element ->
        val sealedInterfaceSurrogateClassName =
          ClassName(
            className.toSurrogateClassName().packageName,
            element.getPolymorphicTypeSurrogateClassSimpleName(),
          )
        TypeSpec.classBuilder(sealedInterfaceSurrogateClassName)
          .addAnnotation(Serializable::class)
          .addModifiers(KModifier.INTERNAL)
          .addModifiers(KModifier.DATA)
          .apply {
            val sealedInterfaceSurrogatePropertyParamPair =
              element.getSurrogatePropertyNameTypeDefaultValueList(className).map {
                val property =
                  PropertySpec.builder(it.first, it.second).initializer(it.first).mutable().build()
                val parameter =
                  ParameterSpec.builder(it.first, it.second)
                    .apply { it.third?.let { defaultValue -> defaultValue(defaultValue) } }
                    .build()
                Pair(property, parameter)
              }

            addProperties(sealedInterfaceSurrogatePropertyParamPair.map { it.first })
            primaryConstructor(
              FunSpec.constructorBuilder()
                .apply {
                  sealedInterfaceSurrogatePropertyParamPair.forEach { addParameter(it.second) }
                }
                .build()
            )
            addSealedClassSurrogateConverterToModelClass(
              className,
              sealedInterfaceSurrogateClassName,
              element,
            )
            addSealedClassSurrogateConverterFromModelClass(
              className,
              sealedInterfaceSurrogateClassName,
              element,
            )
          }
          .build()
      }

  /** Adds a [FunSpec] to convert surrogate class to a sealed interface */
  private fun TypeSpec.Builder.addSealedClassSurrogateConverterToModelClass(
    modelClassName: ClassName,
    surrogateClassName: ClassName,
    element: Element,
  ) {
    // Name of sealed class derived from path e.g. Patient.deceased sealed class would be Deceased
    val pathSimpleNames = element.getPathSimpleNames()
    val sealedClassSimpleName = modelClassName.nestedClass(pathSimpleNames.last().capitalized())

    addFunction(
      FunSpec.builder("toModel")
        .returns(sealedClassSimpleName.copy(false))
        .addCode(
          CodeBlock.builder()
            .add("return ")
            .add(
              CodeBlock.builder()
                .apply {
                  addParamToModelClassConstructor(
                    modelClassName,
                    surrogateClassName,
                    element,
                    expandPolymorphicProperties = true,
                  )
                }
                .build()
            )
            .add("!!")
            .build()
        )
        .build()
    )
  }

  /**
   * Adds a companion object with a [FunSpec] to convert sealed interface model to a surrogate class
   */
  private fun TypeSpec.Builder.addSealedClassSurrogateConverterFromModelClass(
    modelClassName: ClassName,
    surrogateClassName: ClassName,
    element: Element,
  ) {
    addType(
      TypeSpec.companionObjectBuilder()
        .addFunction(
          FunSpec.builder("fromModel")
            .addParameter(
              ParameterSpec(
                "model",
                ClassName(modelClassName.packageName, element.getPathSimpleNames()),
              )
            )
            .returns(surrogateClassName)
            .addCode(
              CodeBlock.builder()
                .add("return with(model){\n")
                .indent()
                .add("%T(\n", surrogateClassName)
                .apply {
                  indent()
                  addParamToSurrogateClassConstructor(element, true)
                  unindent()
                }
                .add(")\n")
                .unindent()
                .add("}\n")
                .build()
            )
            .build()
        )
        .build()
    )
  }

  /**
   * Adds a [FunSpec] to convert the surrogate class to the model class (e.g.
   * `PatientSurrogate.toPatient`).
   */
  private fun TypeSpec.Builder.addConverterToModelClass(
    modelClassName: ClassName,
    elements: List<Element>,
  ) {
    addFunction(
      FunSpec.builder("toModel")
        .returns(modelClassName)
        .addCode(
          CodeBlock.builder()
            .add("return %T(\n", modelClassName)
            .apply {
              indent()
              elements.forEach { element ->
                add("%N = ", element.getElementName())
                addParamToModelClassConstructor(
                  modelClassName,
                  modelClassName.toSurrogateClassName(),
                  element,
                  expandPolymorphicProperties = false,
                )
                add(",\n")
              }
              unindent()
            }
            .add(")\n")
            .build()
        )
        .build()
    )
  }

  /**
   * Adds a companion object with a [FunSpec] to convert the model class to the surrogate class
   * (e.g. `PatientSurrogate.fromPatient`).
   */
  private fun TypeSpec.Builder.addConverterFromModelClass(
    modelClassName: ClassName,
    elements: List<Element>,
  ) {
    addType(
      TypeSpec.companionObjectBuilder()
        .addFunction(
          FunSpec.builder("fromModel")
            .addParameter(ParameterSpec("model", modelClassName))
            .returns(modelClassName.toSurrogateClassName())
            .addCode(
              CodeBlock.builder()
                .add("return with(model){\n")
                .indent()
                .add("%T(\n", modelClassName.toSurrogateClassName())
                .apply {
                  indent()
                  elements.forEach { element ->
                    addParamToSurrogateClassConstructor(element, false)
                  }
                  unindent()
                }
                .add(")\n")
                .unindent()
                .add("}\n")
                .build()
            )
            .build()
        )
        .build()
    )
  }

  /**
   * Adds code to build a property in the data class from the corresponding property or properties
   * in the surrogate class. This function handles the following cases:
   * - **Choice of types:** A choice of types is represented in the data class by a sealed interface
   *   with subtypes for each possible data type. The generated sealed interface has a convenience
   *   method `from` for constructing the appropriate subclass. For example, for the
   *   `Patient.deceased[x]` element, the following code will be generated (with a trailing comma in
   *   the parameter list):
   * ```
   * Patient.Deceased?.from(Boolean.of(deceasedBoolean, _deceasedBoolean), DateTime.of(deceasedDateTime, _deceasedDateTime), )
   * ```
   * - **List of primitive type:** Lists of primitive types are represented by two lists in the
   *   surrogate class. One list contains the Kotlin primitive values, and the other contains the
   *   `Element`s. To construct a single list of the FHIR data type, the two lists are zipped
   *   together. For example, for the `HumanName.given` element, the following code will be
   *   generated:
   * ```
   * given?.zip(_given ?: List(given!!.size) { null })?.mapNotNull{ (value, element) -> String.of(value, element) }
   * ```
   * - **List of complex type:** Lists of complex types can be directly assigned since the data
   *   types in the data class and surrogate class are the same. The generated code simply includes
   *   the property name.
   * - **Primitive type:** Primitive types are represented in the surrogate class by two fields
   *   corresponding to the two JSON properties. For example, for the element `Patient.birthDate`
   *   the following code will be generated:
   * ```
   * Date.of(birthDate, _birthDate)
   * ```
   * - **Complex type:** Complex types can be directly assigned since the data types in the data
   *   class and the surrogate class are the same. The generated code simply includes the property
   *   name.
   */
  private fun CodeBlock.Builder.addParamToModelClassConstructor(
    modelClassName: ClassName,
    surrogateClassName: ClassName,
    element: Element,
    expandPolymorphicProperties: Boolean,
  ) {
    val propertyName = element.getElementName()
    if (element.type != null && element.type.size > 1) {
      if (expandPolymorphicProperties) {
        val notNull =
          if (element.min == 1) {
            "!!"
          } else {
            ""
          }
        add("%T.from(", element.getTypeName(modelClassName))
        for (type in element.type) {
          addChoiceTypeParamToModelClassConstructor(
            modelClassName,
            surrogateClassName,
            element,
            type,
          )
          add(", ")
        }
        add(")${notNull}")
      } else {
        add("this@%T.%N", surrogateClassName, propertyName)
      }
    } else if ((element.max == "*" || propertyName == "extension")) {
      if (FhirPathType.containsFhirTypeCode(element.type?.singleOrNull()?.code ?: "")) {
        // A list of primitive type
        val fhirPathType = FhirPathType.getFromFhirTypeCode(element.type?.singleOrNull()?.code!!)!!
        if (element.typeIsEnumeratedCode(valueSetMap)) {
          val enumClass = element.getEnumClass(modelClassName, valueSetMap)
          add(
            "if(this@%T.%N == null && this@%T.%N == null) { mutableListOf() } else { (this@%T.%N ?: List(this@%T.%N!!.size) { null }).zip(this@%T.%N ?: List(this@%T.%N!!.size) { null }).map{ (value, element) -> %T.of(value.let { %L.fromCode(it!!)!! }, element) }.toMutableList() }",
            surrogateClassName,
            propertyName,
            surrogateClassName,
            "_$propertyName",
            surrogateClassName,
            propertyName,
            surrogateClassName,
            "_$propertyName",
            surrogateClassName,
            "_$propertyName",
            surrogateClassName,
            propertyName,
            ClassName(modelClassName.packageName, "Enumeration"),
            enumClass,
          )
        } else {
          add(
            "if(this@%T.%N == null && this@%T.%N == null) { mutableListOf() } else { (this@%T.%N ?: List(this@%T.%N!!.size) { null }).zip(this@%T.%N ?: List(this@%T.%N!!.size) { null }).map{ (value, element) -> %T.of(",
            surrogateClassName,
            propertyName,
            surrogateClassName,
            "_$propertyName",
            surrogateClassName,
            propertyName,
            surrogateClassName,
            "_$propertyName",
            surrogateClassName,
            "_$propertyName",
            surrogateClassName,
            propertyName,
            ClassName(modelClassName.packageName, element.type.single().code.capitalized()),
          )
          fhirPathType.addCodeToConvertTypeInSurrogateToTypeInModel(
            this,
            modelClassName.packageName,
            "value",
          )
          add(", element)!! }.toMutableList() }")
        }
      } else {
        // A list of complex type
        add("this@%T.%N ?: mutableListOf()", surrogateClassName, propertyName)
      }
    } else {
      // A single property - not a list or a choice of types
      addParamToModelClassConstructor(
        modelClassName,
        surrogateClassName,
        propertyName,
        element.type?.singleOrNull(),
        element,
      )
    }
  }

  /**
   * Adds code to build a property in the data class from the corresponding property or properties
   * in the surrogate class.
   *
   * Properties of complex type and BackboneElements (e.g. the `period` property in
   * `HumanNameSurrogate` class with complex type `Narrative`) have the same property name in the
   * data class and the surrogate class. Copying them from the surrogate class to the data class
   * only requires the property name.
   *
   * Properties of primitive type, however, have two corresponding properties in the surrogate
   * class. As a result, the `of` function in the generated class for the FHIR primitive type (e.g.
   * `Date.of` in `Date.kt`) is used to construct the property in the data class.
   *
   * For example, the following code will be generated for the `birthDate` field in the `Patient`
   * class:
   * ```
   * Date.of(
   *   FhirDate.fromString(this@PatientSurrogate.birthDate),
   *   this@PatientSurrogate._birthDate,
   * )
   * ```
   *
   * If the underlying types in the data class and the surrogate class are different, an additional
   * conversion is carried out:
   * ```
   * DateTime.of(FhirDateTime.fromString(start), _start)
   * ```
   */
  private fun CodeBlock.Builder.addParamToModelClassConstructor(
    modelClassName: ClassName,
    surrogateClassName: ClassName,
    propertyName: String,
    type: Type?,
    element: Element,
  ) {
    if (element.typeIsEnumeratedCode(valueSetMap)) {
      val enumClass = element.getEnumClass(modelClassName, valueSetMap)
      if (element.min == 0) {
        add(
          "this@%T.%N?.let { %T.of(%L.fromCode(it!!), this@%T.%N) }",
          surrogateClassName,
          propertyName,
          ClassName(modelClassName.packageName, "Enumeration"),
          enumClass,
          surrogateClassName,
          "_$propertyName",
        )
      } else {
        add(
          "%T.of(%L.fromCode(this@%T.%N!!), this@%T.%N)",
          ClassName(modelClassName.packageName, "Enumeration"),
          enumClass,
          surrogateClassName,
          propertyName,
          surrogateClassName,
          "_$propertyName",
        )
      }
    } else if (type != null && FhirPathType.containsFhirTypeCode(type.code)) {
      val fhirPathType = FhirPathType.getFromFhirTypeCode(type.code)!!
      val notNullAssertion =
        if (element.min == 1) {
          "!!"
        } else {
          ""
        }
      // Xhtml element in the data model can never be null but the field in the surrogate class is
      // nullable. See the NarrativeSurrogate class for example.
      val notNullAssertionXhtml =
        if (type.code == "xhtml") {
          "!!"
        } else {
          ""
        }
      add("%T.of(", ClassName(modelClassName.packageName, type.code.capitalized()))
      fhirPathType.addCodeToConvertPropertyInSurrogateToPropertyInModel(
        this,
        modelClassName.packageName,
        surrogateClassName,
        propertyName,
      )
      add(
        "${notNullAssertionXhtml}, this@%T.%N)${notNullAssertion}",
        surrogateClassName,
        "_$propertyName",
      )
    } else {
      add("this@%T.%N", surrogateClassName, propertyName)
    }
  }

  private fun Element.getEnumClass(
    modelClassName: ClassName,
    valueSetMap: Map<String, ValueSet>,
  ): ClassName {
    val elementBasePath: String? = base?.path
    val valueSetName = valueSetMap.getValue(getValueSetUrl()!!).name.normalizeEnumName()
    val enumClassName =
      if (path != elementBasePath && !elementBasePath.isNullOrBlank())
        "${elementBasePath.substringBefore(".")}.$valueSetName"
      else valueSetName
    val enumClassPackageName =
      if (this.isCommonBinding || enumClassName.contains(".")) {
        modelClassName.packageName
      } else {
        // Use qualified import e.g. com.google.fhir.model.AdministrativeGender
        modelClassName.packageName + "." + modelClassName.simpleNames.first()
      }
    val enumClass = ClassName(enumClassPackageName, enumClassName)
    return enumClass
  }

  /**
   * Adds code to build a property in the data class of [type] from a choice of data types in the
   * surrogate class.
   *
   * Properties with a choice of data types are represented in the data class by sealed interfaces.
   * For example, the `Patient.deceased[x]` element is represented by a sealed interface `Deceased`
   * nested under `Patient` class with two subclasses `Boolean` and `DateTime`. However, for ease of
   * serialization/deserialization properties with a choice of data types in the surrogate class are
   * represented by multiple fields, each representing a possible data type. For example, the same
   * element is represented in the surrogate class by `patientBoolean` and `patientDateTime` fields
   * (as well as `_patientBoolean` and `_patientDateTime` fields).
   *
   * This function generates the code that translates the property or properties in the surrogate
   * class for a single [type] in the [element] with a choice of data types. For example, for the
   * `boolean` type of the `Patient.deceased[x]` element, this function will generate the following
   * code:
   * ```
   * Boolean.of(patientDeceased, _patientDeceased)
   * ```
   */
  private fun CodeBlock.Builder.addChoiceTypeParamToModelClassConstructor(
    modelClassName: ClassName,
    surrogateClassName: ClassName,
    element: Element,
    type: Type,
  ) {
    // The property name in the surrogate class is the element name concatenated with the type code
    // e.g. `Patient.deceasedBoolean`
    val propertyName = "${element.getElementName()}${type.code.capitalized()}"
    if (FhirPathType.containsFhirTypeCode(type.code)) {
      val fhirPathType = FhirPathType.getFromFhirTypeCode(type.code)!!
      add("%T.of(", ClassName(modelClassName.packageName, type.code.capitalized()))
      fhirPathType.addCodeToConvertPropertyInSurrogateToPropertyInModel(
        this,
        modelClassName.packageName,
        surrogateClassName,
        propertyName,
      )
      add(", this@%T.%N)", surrogateClassName, "_$propertyName")
    } else {
      add("this@%T.%N", surrogateClassName, propertyName)
    }
  }

  /**
   * Adds code to build properties in the surrogate class from the corresponding property in the
   * data class. This function handles the following cases:
   * - **Choice of types:** A choice of types is represented in the data class by a sealed interface
   *   with subtypes for each possible data type. This is deconstructed in the surrogate class by
   *   type, making use of the convenience function generated in each sealed interface `asDataType`.
   *   Additionally, primitive types are further deconstructed into two fields, each representing a
   *   JSON property in the JSON representation. For example, for the `Annotation.author[x]`
   *   element, the following code is generated:
   * ```
   * authorReference = author?.asReference()?.value,
   * authorString = author?.asString()?.value?.value,
   * _authorString = author?.asString()?.value?.toElement(),
   * ```
   * - **List of primitive type:** Lists of primitive types are deconstructed into two lists in the
   *   surrogate class. One list contains the Kotlin primitive values, and the other contains the
   *   `Element`s. For example, for the `HumanName.given` element, the following code will be
   *   generated:
   * ```
   * given = given?.map{ it.value },
   * _given = given?.map{ it.toElement() }?.takeUnless { it.all { it == null } },
   * ```
   * - **List of complex type:** Lists of complex types can be directly assigned since the data
   *   types in the data class and surrogate class are the same. The generated code simply includes
   *   the property name.
   * - **Primitive type:** Primitive types are deconstructed into two fields in the surrogate class.
   *   For example, for the element `Patient.birthDate` the following code will be generated:
   * ```
   * birthDate = birthDate?.value,
   * _birthDate = birthDate?.toElement(),
   * ```
   * - **Complex type:** Complex types can be directly assigned since the data types in the data
   *   class and the surrogate class are the same. The generated code simply includes the property
   *   name.
   */
  private fun CodeBlock.Builder.addParamToSurrogateClassConstructor(
    element: Element,
    expandPolymorphicProperties: Boolean,
  ) {
    val propertyName = element.getElementName()
    if (element.type != null && element.type.size > 1) {
      if (expandPolymorphicProperties) {
        for (type in element.type) {
          // Build properties in the surrogate class for each type in a choice of types
          addParamToSurrogateClassConstructor(propertyName, type.code)
        }
      } else {
        add("%N = this@with.%N,", propertyName, propertyName)
      }
    } else if (element.max == "*" || propertyName == "extension") {
      if (FhirPathType.containsFhirTypeCode(element.type?.single()?.code ?: "")) {
        // A list of primitive type is deconstructed into two lists
        val fhirPathType = FhirPathType.getFromFhirTypeCode(element.type?.single()?.code!!)!!
        if (element.typeIsEnumeratedCode(valueSetMap)) {
          add(
            "%N = this@with.%N.map{ it.value?.getCode() }.toMutableList().takeUnless { it.all { it == null } },\n",
            propertyName,
            propertyName,
          )
        } else {
          add("%N = this@with.%N.map{ it", propertyName, propertyName)
          fhirPathType.addCodeToConvertTypeInModelToTypeInSurrogate(this)
          add(" }.toMutableList().takeUnless { it.all { it == null } },\n")
        }
        add(
          "%N = this@with.%N.map{ it.toElement() }.takeUnless { it.all { it == null } }?.map{ it ?: Element() }?.toMutableList(),\n",
          "_$propertyName",
          propertyName,
        )
      } else {
        // A list of complex type is simply assigned
        add("%N = this@with.%N.takeUnless { it.all { it == null } },\n", propertyName, propertyName)
      }
    } else {
      if (FhirPathType.containsFhirTypeCode(element.type?.single()?.code ?: "")) {
        // A single primitive value is deconstructed into two properties
        val fhirPathType = FhirPathType.getFromFhirTypeCode(element.type?.single()?.code!!)!!
        val isRequired = element.min == 1 && element.max == "1"
        if (element.typeIsEnumeratedCode(valueSetMap)) {
          // Call getCode() if the type of the property is an enum type
          add(
            "%N = this@with.%N${
              if (isRequired) {
                ".value"
              } else {
                "?.value"
              }
            }?.getCode(),\n",
            propertyName,
            propertyName,
          )
        } else {
          add(
            "%N = this@with.%N${
              if (isRequired) {
                ""
              } else {
                "?"
              }
            }",
            propertyName,
            propertyName,
          )
          fhirPathType.addCodeToConvertTypeInModelToTypeInSurrogate(this)
          add(",\n")
        }
        add(
          "%N = this@with.%N${
            if (isRequired) {
              ""
            } else {
              "?"
            }
          }.toElement(),\n",
          "_$propertyName",
          propertyName,
        )
      } else {
        // A single complex type is simply assigned
        add("%N = this@with.%N,\n", propertyName, propertyName)
      }
    }
  }

  /**
   * Adds code to build properties in the surrogate class for a given data type in a choice of data
   * types.
   *
   * For primitive types, two properties are extracted from the single property of the sealed
   * interface after type conversion. For example, the following code will be generated for the
   * `Patient.deceased[x]` element and the boolean type:
   * ```
   * deceasedBoolean = deceased?.asBoolean()?.value?.value,
   * _deceasedBoolean = deceased?.asBoolean()?.value?.toElement(),
   * ```
   *
   * For complex types, only one property is extracted since the JSON representation does not
   * include the additional JSON property with the '_' prefix. For example, the following code, will
   * be generated for the `Annotation.author[x]` element and the reference type:
   * ```
   * authorReference = author?.asReference()?.value,
   * ```
   */
  private fun CodeBlock.Builder.addParamToSurrogateClassConstructor(
    propertyName: String,
    typeCode: String,
  ) {
    if (FhirPathType.containsFhirTypeCode(typeCode)) {
      val fhirPathType = FhirPathType.getFromFhirTypeCode(typeCode)!!
      add(
        "%N = this@with.%N()?.value?",
        "$propertyName${typeCode.capitalized()}",
        "as${typeCode.capitalized()}",
      )
      fhirPathType.addCodeToConvertTypeInModelToTypeInSurrogate(this)
      add(",\n")
      add(
        "%N = this@with.%N()?.value?.toElement(),\n",
        "_$propertyName${typeCode.capitalized()}",
        "as${typeCode.capitalized()}",
      )
    } else {
      add(
        "%N = this@with.%N()?.value,\n",
        "$propertyName${typeCode.capitalized()}",
        "as${typeCode.capitalized()}",
      )
    }
  }
}

/**
 * Returns the [ClassName] that represents the surrogate class for this [ClassName]. The generated
 * surrogate class resides in the same package and its name is derived by concatenating the names of
 * any nested classes, ending with "Surrogate".
 *
 * For example:
 * - `com.google.fhir.r4.Patient` will return `com.google.fhir.r4.PatientSurrogate`, and
 * - `com.google.fhir.r4.Patient.Contact` will return `com.google.fhir.r4.PatientContactSurrogate`.
 */
fun ClassName.toSurrogateClassName(): ClassName =
  ClassName("${packageName}.surrogates", simpleNames.joinToString("").plus("Surrogate"))
