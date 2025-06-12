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

/** Checks if the [Include] contains supported system definitions */
fun Include.isValueSystemSupported(): Boolean {
  return !system.isNullOrBlank() &&
    // URN systems are excluded because they are not URLs pointing to actual CodeSystems.
    // The current implementation uses the system URL to identify the corresponding CodeSystem.
    // For example, in ValueSet-administrative-gender, the system is:
    // http://hl7.org/fhir/administrative-gender
    // This URL corresponds to the CodeSystem-administrative-gender, which contains
    // the concepts needed to generate enum constants.
    !system.startsWith("urn", ignoreCase = true) &&
    // This URL is excluded because it does not point to a CodeSystem
    system != "http://unitsofmeasure.org"
}
