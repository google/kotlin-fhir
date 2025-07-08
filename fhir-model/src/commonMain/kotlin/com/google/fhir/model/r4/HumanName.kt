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

import com.google.fhir.model.r4.serializers.HumanNameSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * Base StructureDefinition for HumanName Type: A human's name with the ability to identify parts
 * and usage.
 */
@Serializable(with = HumanNameSerializer::class)
public data class HumanName(
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
   * Identifies the purpose for this name.
   *
   * Applications can assume that a name is current unless it explicitly says that it is temporary
   * or old.
   */
  public var use: Enumeration<NameUse>? = null,
  /**
   * Specifies the entire name as it should be displayed e.g. on an application UI. This may be
   * provided instead of or as well as the specific parts.
   *
   * Can provide both a text representation and parts. Applications updating a name SHALL ensure
   * that when both text and parts are present, no content is included in the text that isn't found
   * in a part.
   */
  public var text: String? = null,
  /**
   * The part of a name that links to the genealogy. In some cultures (e.g. Eritrea) the family name
   * of a son is the first name of his father.
   *
   * Family Name may be decomposed into specific parts using extensions (de, nl, es related
   * cultures).
   */
  public var family: String? = null,
  /**
   * Given name.
   *
   * If only initials are recorded, they may be used in place of the full name parts. Initials may
   * be separated into multiple given names but often aren't due to paractical limitations. This
   * element is not called "first name" since given names do not always come first.
   */
  public var given: List<String?>? = null,
  /**
   * Part of the name that is acquired as a title due to academic, legal, employment or nobility
   * status, etc. and that appears at the start of the name.
   */
  public var prefix: List<String?>? = null,
  /**
   * Part of the name that is acquired as a title due to academic, legal, employment or nobility
   * status, etc. and that appears at the end of the name.
   */
  public var suffix: List<String?>? = null,
  /** Indicates the period of time when this name was valid for the named person. */
  public var period: Period? = null,
) : Element() {
  /** The use of a human name. */
  public enum class NameUse(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
  ) {
    Usual("usual", "http://hl7.org/fhir/name-use", "Usual"),
    Official("official", "http://hl7.org/fhir/name-use", "Official"),
    Temp("temp", "http://hl7.org/fhir/name-use", "Temp"),
    Nickname("nickname", "http://hl7.org/fhir/name-use", "Nickname"),
    Anonymous("anonymous", "http://hl7.org/fhir/name-use", "Anonymous"),
    Old("old", "http://hl7.org/fhir/name-use", "Old"),
    Maiden("maiden", "http://hl7.org/fhir/name-use", "Name changed for Marriage");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public companion object {
      public fun fromCode(code: kotlin.String): NameUse =
        when (code) {
          "usual" -> Usual
          "official" -> Official
          "temp" -> Temp
          "nickname" -> Nickname
          "anonymous" -> Anonymous
          "old" -> Old
          "maiden" -> Maiden
          else -> throw IllegalArgumentException("Unknown code $code for enum NameUse")
        }
    }
  }
}
