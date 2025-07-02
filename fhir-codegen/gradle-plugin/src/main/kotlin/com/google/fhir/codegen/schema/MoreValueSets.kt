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

package com.google.fhir.codegen.schema

import com.google.fhir.codegen.schema.valueset.Include
import com.google.fhir.codegen.schema.valueset.ValueSet

val ValueSet.urlPart
  get() = url.substringBeforeLast("|")

val ValueSet.isEligibleForEnumCreation: Boolean
  get() = compose?.include?.none { it.isSystemAnExclusionCandidate() } ?: true

/**
 * Determines if a single value set include system is one that *should be excluded* from enum code
 * generation.
 *
 * @return True if the system is an exclusion candidate, false otherwise.
 */
private fun Include.isSystemAnExclusionCandidate(): Boolean {
  return system.isNullOrBlank() ||
    // The URN systems are excluded because their code sets are too large for enum generation.
    system.startsWith("urn", ignoreCase = true) ||
    // In R5, this system is excluded to prevent enum conflicts, as "PublicationStatus"
    // is used by multiple value sets. We default to the value set with system
    // "http://hl7.org/fhir/publication-status", matching the R4 and R4B enum definitions.
    system == "http://hl7.org/fhir/specimen-combined"
}
