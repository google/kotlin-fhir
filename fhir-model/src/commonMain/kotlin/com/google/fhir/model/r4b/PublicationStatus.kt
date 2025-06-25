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

/** The lifecycle status of an artifact. */
public enum class PublicationStatus(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  /**
   * This resource is still under development and is not yet considered to be ready for normal use.
   */
  Draft(
    "draft",
    "http://hl7.org/fhir/publication-status",
    "Draft",
    "This resource is still under development and is not yet considered to be ready for normal use.",
  ),
  /** This resource is ready for normal use. */
  Active(
    "active",
    "http://hl7.org/fhir/publication-status",
    "Active",
    "This resource is ready for normal use.",
  ),
  /** This resource has been withdrawn or superseded and should no longer be used. */
  Retired(
    "retired",
    "http://hl7.org/fhir/publication-status",
    "Retired",
    "This resource has been withdrawn or superseded and should no longer be used.",
  ),
  /**
   * The authoring system does not know which of the status values currently applies for this
   * resource. Note: This concept is not to be used for "other" - one of the listed statuses is
   * presumed to apply, it's just not known which one.
   */
  Unknown(
    "unknown",
    "http://hl7.org/fhir/publication-status",
    "Unknown",
    "The authoring system does not know which of the status values currently applies for this resource.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, it's just not known which one.",
  );

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): PublicationStatus =
      when (code) {
        "draft" -> Draft
        "active" -> Active
        "retired" -> Retired
        "unknown" -> Unknown
        else -> throw IllegalArgumentException("Unknown code $code for enum PublicationStatus")
      }
  }
}
