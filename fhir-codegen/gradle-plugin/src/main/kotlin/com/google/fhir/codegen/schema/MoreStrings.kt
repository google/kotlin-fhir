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

import org.gradle.configurationcache.extensions.capitalized

/**
 * Sanitizes the string for KDoc, replacing character sequences that could break the comment block.
 *
 * See also: https://github.com/square/kotlinpoet/issues/887.
 */
fun String.sanitizeKDoc(): String {
  return this.replace("/*", "&#47;*")
}

/**
 * Formats the string by replacing all non-alphanumeric-characters with an empty string and
 * capitalize the first character. Example: v3.ObservationInterpretation ->
 * V3ObservationInterpretation
 */
fun String.toPascalCase(): String {
  val camelCaseString =
    split("-").joinToString("") { it ->
      it.replaceFirstChar { char ->
        if (it.indexOf(char) == 0) {
          char.uppercaseChar()
        } else {
          char
        }
      }
    }

  // For consistency convert all uppercase word to lowercase then capitalize
  val formattedString =
    if (camelCaseString.all { it.isUpperCase() }) camelCaseString.lowercase().capitalized()
    else camelCaseString

  val alphanumericString = formattedString.replace(Regex("[^a-zA-Z0-9]+"), "")
  return alphanumericString
}
