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

@file:Suppress("RedundantVisibilityModifier", "PropertyName")

package com.google.fhir.model.r4

import com.google.fhir.model.r4.serializers.ExpressionSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * Base StructureDefinition for Expression Type: A expression that is evaluated in a specified
 * context and returns a value. The context of use of the expression must specify the context in
 * which the expression is evaluated, and how the result of the expression is used.
 */
@Serializable(with = ExpressionSerializer::class)
public data class Expression(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override var id: kotlin.String? = null,
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * element. To make the use of extensions safe and manageable, there is a strict set of governance
   * applied to the definition and use of extensions. Though any implementer can define an
   * extension, there is a set of requirements that SHALL be met as part of the definition of the
   * extension.
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override var extension: List<Extension?>? = null,
  /**
   * A brief, natural language description of the condition that effectively communicates the
   * intended semantics.
   */
  public var description: String? = null,
  /**
   * A short name assigned to the expression to allow for multiple reuse of the expression in the
   * context where it is defined.
   */
  public var name: Id? = null,
  /** The media type of the language for the expression. */
  public var language: Enumeration<ExpressionLanguage>? = null,
  /** An expression in the specified language that returns a value. */
  public var expression: String? = null,
  /**
   * A URI that defines where the expression is found.
   *
   * If both a reference and an expression is found, the reference SHALL point to the same
   * expression.
   */
  public var reference: Uri? = null,
) : Element() {
  /** The media type of the expression language. */
  public enum class ExpressionLanguage(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Text_Cql("text/cql", "http://hl7.org/fhir/expression-language", "CQL", null),
    Text_Fhirpath("text/fhirpath", "http://hl7.org/fhir/expression-language", "FHIRPath", null),
    Application_X_Fhir_Query(
      "application/x-fhir-query",
      "http://hl7.org/fhir/expression-language",
      "FHIR Query",
      null,
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ExpressionLanguage =
        when (code) {
          "text/cql" -> Text_Cql
          "text/fhirpath" -> Text_Fhirpath
          "application/x-fhir-query" -> Application_X_Fhir_Query
          else -> throw IllegalArgumentException("Unknown code $code for enum ExpressionLanguage")
        }
    }
  }
}
