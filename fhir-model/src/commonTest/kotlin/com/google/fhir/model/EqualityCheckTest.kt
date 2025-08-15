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

import com.google.fhir.model.r4.Resource
import kotlin.test.Test
import kotlin.test.assertEquals

class EqualityCheckTest {

  @Test
  fun shouldMatchResourcesWithSimilarPropertiesOnComparisonInR4() {
    loadR4Examples(
        fileNameFilter = {
          return@loadR4Examples (filterFileName(it) && !exclusionListR4.contains(it))
        }
      )
      .forEach {
        val exampleJson = prettyPrintJson(it)
        val firstResource: Resource = jsonR4.decodeFromString<Resource>(exampleJson)
        val secondResource: Resource = jsonR4.decodeFromString<Resource>(exampleJson)
        assertEquals(firstResource, secondResource)
      }
  }

  @Test
  fun shouldMatchResourcesWithSimilarPropertiesOnComparisonInR4B() {
    loadR4BExamples(
        fileNameFilter = {
          return@loadR4BExamples (filterFileName(it) && !exclusionListR4B.contains(it))
        }
      )
      .forEach {
        val exampleJson = prettyPrintJson(it)
        val firstResource: com.google.fhir.model.r4b.Resource =
          jsonR4B.decodeFromString<com.google.fhir.model.r4b.Resource>(exampleJson)
        val secondResource: com.google.fhir.model.r4b.Resource =
          jsonR4B.decodeFromString<com.google.fhir.model.r4b.Resource>(exampleJson)
        assertEquals(firstResource, secondResource)
      }
  }

  @Test
  fun shouldMatchResourcesWithSimilarPropertiesOnComparisonInR5() {
    loadR5Examples(
        fileNameFilter = {
          return@loadR5Examples (filterFileName(it) && !exclusionListR5.contains(it))
        }
      )
      .forEach {
        val exampleJson = prettyPrintJson(it)
        val firstResource: com.google.fhir.model.r5.Resource =
          jsonR5.decodeFromString<com.google.fhir.model.r5.Resource>(exampleJson)
        val secondResource: com.google.fhir.model.r5.Resource =
          jsonR5.decodeFromString<com.google.fhir.model.r5.Resource>(exampleJson)
        assertEquals(firstResource, secondResource)
      }
  }
}
