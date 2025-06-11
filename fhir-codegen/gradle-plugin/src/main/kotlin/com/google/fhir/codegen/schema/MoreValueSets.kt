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

val ValueSet.urlPart
  get() = url.substringBeforeLast("|")

/** Checks if the [Include] contains supported system definitions */
fun Include.isValueSystemSupported(): Boolean {
  return !system.isNullOrBlank() &&
    // The urn systems are excluded because they are not urls for CodeSystems
    // The current implementation relies on the system to identify the CodeSystem
    // For example in ValueSet-administrative gender the system included is
    // http://hl7.org/fhir/administrative-gender which is the url for the
    // CodeSystem-administrative-gender which contains concepts required to
    // generate enum constants
    !system.startsWith("urn", ignoreCase = true) &&
    // This is excluded because there is no CodeSystem with this url
    system != "http://unitsofmeasure.org" &&
    // TODO To be investigated: There is a conflict in the concepts used for generating
    //  for the enum identified by binding name PublicationStatus generated from
    //  this ValueSet.
    system != "http://hl7.org/fhir/specimen-combined"
}
