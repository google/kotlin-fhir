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

package com.google.fhir.model.r4b

import com.google.fhir.model.r4b.serializers.ParameterDefinitionSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * Base StructureDefinition for ParameterDefinition Type: The parameters to the module. This
 * collection specifies both the input and output parameters. Input parameters are provided by the
 * caller as part of the $evaluate operation. Output parameters are included in the
 * GuidanceResponse.
 */
@Serializable(with = ParameterDefinitionSerializer::class)
public data class ParameterDefinition(
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
   * The name of the parameter used to allow access to the value of the parameter in evaluation
   * contexts.
   */
  public var name: Code? = null,
  /** Whether the parameter is input or output for the module. */
  public var use: Enumeration<ParameterUse>? = null,
  /** The minimum number of times this parameter SHALL appear in the request or response. */
  public var min: Integer? = null,
  /** The maximum number of times this element is permitted to appear in the request or response. */
  public var max: String? = null,
  /** A brief discussion of what the parameter is for and how it is used by the module. */
  public var documentation: String? = null,
  /** The type of the parameter. */
  public var type: Enumeration<FHIRAllTypes>? = null,
  /**
   * If specified, this indicates a profile that the input data must conform to, or that the output
   * data will conform to.
   */
  public var profile: Canonical? = null,
) : Element() {
  /** Whether an operation parameter is an input or an output parameter. */
  public enum class ParameterUse(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** This is an input parameter. */
    In("in", "http://hl7.org/fhir/operation-parameter-use", "In", "This is an input parameter."),
    /** This is an output parameter. */
    Out(
      "out",
      "http://hl7.org/fhir/operation-parameter-use",
      "Out",
      "This is an output parameter.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ParameterUse =
        when (code) {
          "in" -> In
          "out" -> Out
          else -> throw IllegalArgumentException("Unknown code $code for enum ParameterUse")
        }
    }
  }
}
