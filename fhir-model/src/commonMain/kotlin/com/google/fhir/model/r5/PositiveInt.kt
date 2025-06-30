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

import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

/** positiveInt type: An integer with a value that is positive (e.g. >0) */
public data class PositiveInt(
  /** unique id for the element within a resource (for internal references) */
  override var id: String? = null,
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * resource. To make the use of extensions safe and managable, there is a strict set of governance
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
  /** Primitive value for positiveInt */
  override var `value`: Int? = null,
) : Integer(id, extension, `value`) {
  override fun toElement(): Element? {
    if (id != null || extension != null) {
      return Element(id, extension)
    }
    return null
  }

  public companion object {
    public fun of(`value`: Int?, element: Element?): PositiveInt? =
      if (value == null && element == null) {
        null
      } else {
        PositiveInt(element?.id, element?.extension, value)
      }
  }
}
