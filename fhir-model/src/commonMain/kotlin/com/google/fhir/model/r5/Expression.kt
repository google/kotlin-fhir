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

package com.google.fhir.model.r5

import com.google.fhir.model.r5.serializers.ExpressionSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * Expression Type: A expression that is evaluated in a specified context and returns a value. The
 * context of use of the expression must specify the context in which the expression is evaluated,
 * and how the result of the expression is used.
 */
@Serializable(with = ExpressionSerializer::class)
public data class Expression(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override val id: kotlin.String? = null,
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * element. To make the use of extensions safe and managable, there is a strict set of governance
   * applied to the definition and use of extensions. Though any implementer can define an
   * extension, there is a set of requirements that SHALL be met as part of the definition of the
   * extension.
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override val extension: List<Extension> = listOf(),
  /**
   * A brief, natural language description of the condition that effectively communicates the
   * intended semantics.
   */
  public val description: String? = null,
  /**
   * A short name assigned to the expression to allow for multiple reuse of the expression in the
   * context where it is defined.
   */
  public val name: Code? = null,
  /** The media type of the language for the expression. */
  public val language: Enumeration<ExpressionLanguage>? = null,
  /**
   * An expression in the specified language that returns a value.
   *
   * If Expression.expression and Expression.reference are both present, the Expression.expression
   * might just be a name pointing something within the referenced content.
   */
  public val expression: String? = null,
  /**
   * A URI that defines where the expression is found.
   *
   * If both a reference and an expression is found, the reference SHALL point to the same
   * expression.
   */
  public val reference: Uri? = null,
) : DataType() {
  /** The media type of the expression language. */
  public enum class ExpressionLanguage(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Text_Cql("text/cql", "urn:ietf:bcp:13", "CQL"),
    Text_Fhirpath("text/fhirpath", "urn:ietf:bcp:13", "FHIRPath"),
    Text_X_Fhir_Query("text/x-fhir-query", "urn:ietf:bcp:13", "FHIR Query"),
    Text_Cql_Identifier("text/cql-identifier", "urn:ietf:bcp:13", "CQL Identifier"),
    Text_Cql_Expression("text/cql-expression", "urn:ietf:bcp:13", "CQL Expression");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): ExpressionLanguage =
        when (code) {
          "text/cql" -> Text_Cql
          "text/fhirpath" -> Text_Fhirpath
          "text/x-fhir-query" -> Text_X_Fhir_Query
          "text/cql-identifier" -> Text_Cql_Identifier
          "text/cql-expression" -> Text_Cql_Expression
          else -> throw IllegalArgumentException("Unknown code $code for enum ExpressionLanguage")
        }
    }
  }
}
