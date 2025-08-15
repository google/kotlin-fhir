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

package com.google.fhir.model

import com.google.fhir.model.r4.configureR4
import com.google.fhir.model.r4b.configureR4b
import com.google.fhir.model.r5.configureR5
import kotlin.test.assertEquals
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject

private val prettyPrintJson = Json { prettyPrint = true }

val jsonR4 = Json {
  prettyPrint = true
  configureR4()
}

val jsonR4B = Json {
  prettyPrint = true
  configureR4b()
}

val jsonR5 = Json {
  prettyPrint = true
  configureR5()
}

fun filterFileName(name: String): Boolean {
  return name.endsWith(".json") &&
    !name.startsWith('.') // filter out `.index.json` file
    &&
    name != "package.json"
}

fun prettyPrintJson(jsonString: String): String {
  val jsonElement =
    prettyPrintJson.parseToJsonElement(jsonString) // Parse the string to a JsonElement
  return prettyPrintJson.encodeToString(jsonElement) // Re-encode with pretty printing
}

fun assertEqualsIgnoringZeros(exampleJson: String, reserializedString: String) {
  val expected =
    exampleJson
      .removeZerosAfterDecimalPoint()
      .replace("+00:00", "Z") // Unify UTC offset representation for Z
  val actual = reserializedString.removeZerosAfterDecimalPoint()

  // Some resources have non-standard JSON property ordering, so we sort the JSON
  // properties by the key before comparing them.
  assertEquals(
    prettyPrintJson.parseToJsonElement(expected).jsonObject.entries.sortedBy { it.key },
    prettyPrintJson.parseToJsonElement(actual).jsonObject.entries.sortedBy { it.key },
  )
}

private fun String.removeZerosAfterDecimalPoint(): String = replace(trailingZeroRegex, "")

expect fun loadR4Examples(fileNameFilter: (String) -> Boolean): Sequence<String>

expect fun loadR4BExamples(fileNameFilter: (String) -> Boolean): Sequence<String>

expect fun loadR5Examples(fileNameFilter: (String) -> Boolean): Sequence<String>
