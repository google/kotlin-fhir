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

import kotlin.test.Test
import kotlin.test.assertEquals

class EqualityTest {

  @Test
  fun deserializingSameR4Json_shouldProduceEqualObjects() {
    loadR4Examples(
        fileNameFilter = {
          return@loadR4Examples (filterFileName(it) && !exclusionListR4.contains(it))
        }
      )
      .forEach { exampleJson ->
        val firstResource = jsonR4.decodeFromString<com.google.fhir.model.r4.Resource>(exampleJson)
        val secondResource = jsonR4.decodeFromString<com.google.fhir.model.r4.Resource>(exampleJson)
        assertEquals(firstResource, secondResource)
      }
  }

  @Test
  fun deserializingSameR4BJson_shouldProduceEqualObjects() {
    loadR4BExamples(
        fileNameFilter = {
          return@loadR4BExamples (filterFileName(it) && !exclusionListR4B.contains(it))
        }
      )
      .forEach { exampleJson ->
        val firstResource =
          jsonR4B.decodeFromString<com.google.fhir.model.r4b.Resource>(exampleJson)
        val secondResource =
          jsonR4B.decodeFromString<com.google.fhir.model.r4b.Resource>(exampleJson)
        assertEquals(firstResource, secondResource)
      }
  }

  @Test
  fun deserializingSameR5Json_shouldProduceEqualObjects() {
    loadR5Examples(
        fileNameFilter = {
          return@loadR5Examples (filterFileName(it) && !exclusionListR5.contains(it))
        }
      )
      .forEach { exampleJson ->
        val firstResource = jsonR5.decodeFromString<com.google.fhir.model.r5.Resource>(exampleJson)
        val secondResource = jsonR5.decodeFromString<com.google.fhir.model.r5.Resource>(exampleJson)
        assertEquals(firstResource, secondResource)
      }
  }

  companion object {

    private val exclusionListR4 =
      listOf(
        // Invalid resources
        "ActivityDefinition-administer-zika-virus-exposure-assessment.json",
        "ImplementationGuide-fhir.json",
        "Questionnaire-qs1.json",
        "ig-r4.json",
      )

    private val exclusionListR4B =
      listOf(
        // Invalid resource
        "Bundle-valuesets.json",
        "CodeSystem-catalogType.json",
        "ValueSet-catalogType.json",
        "ActivityDefinition-administer-zika-virus-exposure-assessment.json",
      )

    private val exclusionListR5 =
      listOf(
        // Unknown code 'text/CQL' for enum ExpressionLanguage; codes are case-sensitive
        "ChargeItemDefinition-ebm.json"
      )
  }
}
