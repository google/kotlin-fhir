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

package com.google.fhir.model.r4

import kotlin.String

/** This value set includes a smattering of adjudication codes. */
public enum class AdjudicationError(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /** Missing Identifier */
  A001(
    "a001",
    "http://terminology.hl7.org/CodeSystem/adjudication-error",
    "Missing Identifier",
    "Missing Identifier",
  ),
  /** Missing Creation Date */
  A002(
    "a002",
    "http://terminology.hl7.org/CodeSystem/adjudication-error",
    "Missing Creation Date",
    "Missing Creation Date",
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): AdjudicationError =
      when (code) {
        "a001" -> A001
        "a002" -> A002
        else -> throw IllegalArgumentException("Unknown code $code for enum AdjudicationError")
      }
  }
}
