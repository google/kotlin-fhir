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

package com.google.fhir.model.r4b

/** Data types allowed to be used for search parameters. */
public enum class SearchParamType(
  private val code: kotlin.String,
  private val system: kotlin.String,
  private val display: kotlin.String?,
  private val definition: kotlin.String?,
) {
  /** Search parameter SHALL be a number (a whole number, or a decimal). */
  Number(
    "number",
    "http://hl7.org/fhir/search-param-type",
    "Number",
    "Search parameter SHALL be a number (a whole number, or a decimal).",
  ),
  /**
   * Search parameter is on a date/time. The date format is the standard XML format, though other
   * formats may be supported.
   */
  Date(
    "date",
    "http://hl7.org/fhir/search-param-type",
    "Date/DateTime",
    "Search parameter is on a date/time. The date format is the standard XML format, though other formats may be supported.",
  ),
  /**
   * Search parameter is a simple string, like a name part. Search is case-insensitive and
   * accent-insensitive. May match just the start of a string. String parameters may contain spaces.
   */
  String(
    "string",
    "http://hl7.org/fhir/search-param-type",
    "String",
    "Search parameter is a simple string, like a name part. Search is case-insensitive and accent-insensitive. May match just the start of a string. String parameters may contain spaces.",
  ),
  /**
   * Search parameter on a coded element or identifier. May be used to search through the text,
   * display, code and code/codesystem (for codes) and label, system and key (for identifier). Its
   * value is either a string or a pair of namespace and value, separated by a "|", depending on the
   * modifier used.
   */
  Token(
    "token",
    "http://hl7.org/fhir/search-param-type",
    "Token",
    "Search parameter on a coded element or identifier. May be used to search through the text, display, code and code/codesystem (for codes) and label, system and key (for identifier). Its value is either a string or a pair of namespace and value, separated by a \"|\", depending on the modifier used.",
  ),
  /** A reference to another resource (Reference or canonical). */
  Reference(
    "reference",
    "http://hl7.org/fhir/search-param-type",
    "Reference",
    "A reference to another resource (Reference or canonical).",
  ),
  /** A composite search parameter that combines a search on two values together. */
  Composite(
    "composite",
    "http://hl7.org/fhir/search-param-type",
    "Composite",
    "A composite search parameter that combines a search on two values together.",
  ),
  /** A search parameter that searches on a quantity. */
  Quantity(
    "quantity",
    "http://hl7.org/fhir/search-param-type",
    "Quantity",
    "A search parameter that searches on a quantity.",
  ),
  /** A search parameter that searches on a URI (RFC 3986). */
  Uri(
    "uri",
    "http://hl7.org/fhir/search-param-type",
    "URI",
    "A search parameter that searches on a URI (RFC 3986).",
  ),
  /** Special logic applies to this parameter per the description of the search parameter. */
  Special(
    "special",
    "http://hl7.org/fhir/search-param-type",
    "Special",
    "Special logic applies to this parameter per the description of the search parameter.",
  );

  override fun toString(): kotlin.String = code

  public fun getCode(): kotlin.String = code

  public fun getSystem(): kotlin.String = system

  public fun getDisplay(): kotlin.String? = display

  public fun getDefinition(): kotlin.String? = definition

  public companion object {
    public fun fromCode(code: kotlin.String): SearchParamType =
      when (code) {
        "number" -> Number
        "date" -> Date
        "string" -> String
        "token" -> Token
        "reference" -> Reference
        "composite" -> Composite
        "quantity" -> Quantity
        "uri" -> Uri
        "special" -> Special
        else -> throw IllegalArgumentException("Unknown code $code for enum SearchParamType")
      }
  }
}
