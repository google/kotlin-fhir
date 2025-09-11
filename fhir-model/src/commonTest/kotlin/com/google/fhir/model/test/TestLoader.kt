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

package com.google.fhir.model.test

const val r4ExamplePackage = "hl7.fhir.r4.examples/package/"
const val r4bExamplePackage = "hl7.fhir.r4b.examples/package/"
const val r5ExamplePackage = "hl7.fhir.r5.examples/package/"

fun filterFileName(name: String): Boolean {
  return name.endsWith(".json") &&
    !name.startsWith('.') // filter out `.index.json` file
    &&
    name != "package.json"
}

expect fun loadR4Examples(fileNameFilter: (String) -> Boolean): Sequence<String>

expect fun loadR4BExamples(fileNameFilter: (String) -> Boolean): Sequence<String>

expect fun loadR5Examples(fileNameFilter: (String) -> Boolean): Sequence<String>
