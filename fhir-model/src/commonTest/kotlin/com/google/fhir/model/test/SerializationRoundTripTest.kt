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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject

/**
 * This test verifies the generated code can be used to deserialize published FHIR examples and
 * serialize them back to the original JSON.
 */
class SerializationRoundTripTest {
  @Test
  fun deserializingAndSerializingR4Json_shouldProduceEquivalentJson() {
    loadR4Examples(
        fileNameFilter = {
          return@loadR4Examples (filterFileName(it) && !exclusionListR4.contains(it))
        }
      )
      .forEach {
        val exampleJson = prettyPrintJson(it)
        val domainResource = jsonR4.decodeFromString<com.google.fhir.model.r4.Resource>(exampleJson)
        val reserializedString = jsonR4.encodeToString(domainResource)
        assertEqualsIgnoringZeros(exampleJson, reserializedString)
      }
  }

  @Test
  fun deserializingAndSerializingR4BJson_shouldProduceEquivalentJson() {
    loadR4BExamples(
        fileNameFilter = {
          return@loadR4BExamples (filterFileName(it) && !exclusionListR4B.contains(it))
        }
      )
      .forEach {
        val exampleJson = prettyPrintJson(it)
        val domainResource =
          jsonR4B.decodeFromString<com.google.fhir.model.r4b.Resource>(exampleJson)
        val reserializedString = jsonR4B.encodeToString(domainResource)
        assertEqualsIgnoringZeros(exampleJson, reserializedString)
      }
  }

  @Test
  fun deserializingAndSerializingR5Json_shouldProduceEquivalentJson() {
    loadR5Examples(
        fileNameFilter = {
          return@loadR5Examples (filterFileName(it) && !exclusionListR5.contains(it))
        }
      )
      .forEach {
        val exampleJson = prettyPrintJson(it)
        val domainResource = jsonR5.decodeFromString<com.google.fhir.model.r5.Resource>(exampleJson)
        val reserializedString = jsonR5.encodeToString(domainResource)
        assertEqualsIgnoringZeros(exampleJson, reserializedString)
      }
  }

  companion object {
    private val prettyPrintJson = Json { prettyPrint = true }

    private val trailingZeroRegex = "\\.0+".toRegex()

    private val exclusionListR4 =
      listOf(
        // Hanging for no reason
        "Bundle-terminologies.json",
        "CodeSystem-v2-0003.json",
        "Bundle-valueset-expansions.json",

        // Java heap space
        "Bundle-resources.json",
        "Bundle-dataelements.json",
        "CodeSystem-v3-ManagedParticipationStatus.json",

        // Instant with trailing 0s
        "ValueSet-v3-hl7PublishingSubSection.json",

        // Scientific notation
        "Observation-decimal.json",

        // Invalid resources
        "ActivityDefinition-administer-zika-virus-exposure-assessment.json",
        "ImplementationGuide-fhir.json",
        "Questionnaire-qs1.json",
        "ig-r4.json",
      )

    private val exclusionListR4B =
      listOf(
        // Java heap space
        "Bundle-resources.json",

        // Scientific notation
        "Observation-decimal.json",

        // Invalid resource
        "Bundle-valuesets.json",
        "CodeSystem-catalogType.json",
        "ValueSet-catalogType.json",

        // Invalid resources
        "ActivityDefinition-administer-zika-virus-exposure-assessment.json",
      )

    private val exclusionListR5 =
      listOf(
        // Hanging
        "Bundle-searchParams.json",

        // Java heap space
        "Bundle-resources.json",

        // Trailing 0 in milliseconds
        "ArtifactAssessment-example-certainty-rating.json",
        "Citation-citation-example-research-doi.json",

        // Scientific notation
        "Observation-decimal.json",

        // Unknown code 'text/CQL' for enum ExpressionLanguage; codes are case-sensitive
        "ChargeItemDefinition-ebm.json",
      )

    private fun assertEqualsIgnoringZeros(exampleJson: String, reserializedString: String) {
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

    private fun prettyPrintJson(jsonString: String): String {
      val jsonElement =
        prettyPrintJson.parseToJsonElement(jsonString) // Parse the string to a JsonElement
      return prettyPrintJson.encodeToString(jsonElement) // Re-encode with pretty printing
    }
  }
}
