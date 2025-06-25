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

import com.google.fhir.model.r5.serializers.IdentifierSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * Identifier Type: An identifier - identifies some entity uniquely and unambiguously. Typically
 * this is used for business identifiers.
 */
@Serializable(with = IdentifierSerializer::class)
public data class Identifier(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override var id: kotlin.String? = null,
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
  override var extension: List<Extension?>? = null,
  /**
   * The purpose of this identifier.
   *
   * Applications can assume that an identifier is permanent unless it explicitly says that it is
   * temporary.
   */
  public var use: Enumeration<IdentifierUse>? = null,
  /**
   * A coded type for the identifier that can be used to determine which identifier to use for a
   * specific purpose.
   *
   * This element deals only with general categories of identifiers. It SHOULD not be used for codes
   * that correspond 1..1 with the Identifier.system. Some identifiers may fall into multiple
   * categories due to common usage. Where the system is known, a type is unnecessary because the
   * type is always part of the system definition. However systems often need to handle identifiers
   * where the system is not known. There is not a 1:1 relationship between type and system, since
   * many different systems have the same type.
   */
  public var type: CodeableConcept? = null,
  /**
   * Establishes the namespace for the value - that is, an absolute URL that describes a set values
   * that are unique.
   *
   * Identifier.system is always case sensitive.
   */
  public var system: Uri? = null,
  /**
   * The portion of the identifier typically relevant to the user and which is unique within the
   * context of the system.
   *
   * If the value is a full URI, then the system SHALL be urn:ietf:rfc:3986. The value's primary
   * purpose is computational mapping. As a result, it may be normalized for comparison purposes
   * (e.g. removing non-significant whitespace, dashes, etc.) A value formatted for human display
   * can be conveyed using the
   * [http://hl7.org/fhir/StructureDefinition/rendered-value](http://hl7.org/fhir/extensions/StructureDefinition-rendered-value.html)).
   * Identifier.value is to be treated as case sensitive unless knowledge of the Identifier.system
   * allows the processer to be confident that non-case-sensitive processing is safe.
   */
  public var `value`: String? = null,
  /** Time period during which identifier is/was valid for use. */
  public var period: Period? = null,
  /**
   * Organization that issued/manages the identifier.
   *
   * The Identifier.assigner may omit the .reference element and only contain a .display element
   * reflecting the name or other textual information about the assigning organization.
   */
  public var assigner: Reference? = null,
) : DataType() {
  /** Identifies the purpose for this identifier, if known . */
  public enum class IdentifierUse(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * The identifier recommended for display and use in real-world interactions which should be
     * used when such identifier is different from the "official" identifier.
     */
    Usual(
      "usual",
      "http://hl7.org/fhir/identifier-use",
      "Usual",
      "The identifier recommended for display and use in real-world interactions which should be used when such identifier is different from the \"official\" identifier.",
    ),
    /**
     * The identifier considered to be most trusted for the identification of this item. Sometimes
     * also known as "primary" and "main". The determination of "official" is subjective and
     * implementation guides often provide additional guidelines for use.
     */
    Official(
      "official",
      "http://hl7.org/fhir/identifier-use",
      "Official",
      "The identifier considered to be most trusted for the identification of this item. Sometimes also known as \"primary\" and \"main\". The determination of \"official\" is subjective and implementation guides often provide additional guidelines for use.",
    ),
    /** A temporary identifier. */
    Temp("temp", "http://hl7.org/fhir/identifier-use", "Temp", "A temporary identifier."),
    /**
     * An identifier that was assigned in secondary use - it serves to identify the object in a
     * relative context, but cannot be consistently assigned to the same object again in a different
     * context.
     */
    Secondary(
      "secondary",
      "http://hl7.org/fhir/identifier-use",
      "Secondary",
      "An identifier that was assigned in secondary use - it serves to identify the object in a relative context, but cannot be consistently assigned to the same object again in a different context.",
    ),
    /**
     * The identifier id no longer considered valid, but may be relevant for search purposes. E.g.
     * Changes to identifier schemes, account merges, etc.
     */
    Old(
      "old",
      "http://hl7.org/fhir/identifier-use",
      "Old",
      "The identifier id no longer considered valid, but may be relevant for search purposes.  E.g. Changes to identifier schemes, account merges, etc.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): IdentifierUse =
        when (code) {
          "usual" -> Usual
          "official" -> Official
          "temp" -> Temp
          "secondary" -> Secondary
          "old" -> Old
          else -> throw IllegalArgumentException("Unknown code $code for enum IdentifierUse")
        }
    }
  }
}
