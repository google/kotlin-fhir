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

import kotlin.String

/** The status of the document reference. */
public enum class DocumentReferenceStatus(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /** This is the current reference for this document. */
  Current(
    "current",
    "http://hl7.org/fhir/document-reference-status",
    "Current",
    "This is the current reference for this document.",
  ),
  /** This reference has been superseded by another reference. */
  Superseded(
    "superseded",
    "http://hl7.org/fhir/document-reference-status",
    "Superseded",
    "This reference has been superseded by another reference.",
  ),
  /** This reference was created in error. */
  Entered_In_Error(
    "entered-in-error",
    "http://hl7.org/fhir/document-reference-status",
    "Entered in Error",
    "This reference was created in error.",
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): DocumentReferenceStatus =
      when (code) {
        "current" -> Current
        "superseded" -> Superseded
        "entered-in-error" -> Entered_In_Error
        else ->
          throw IllegalArgumentException("Unknown code $code for enum DocumentReferenceStatus")
      }
  }
}
