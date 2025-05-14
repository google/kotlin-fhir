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

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject

const val r4ExamplePackage = "hl7.fhir.r4.examples/package/"
const val r4bExamplePackage = "hl7.fhir.r4b.examples/package/"
const val r5ExamplePackage = "hl7.fhir.r5.examples/package/"

val trailingZeroRegex = "\\.0+".toRegex()

val exclusionListR4 =
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

    // Pattern in ElementDefinition
    "StructureDefinition-example-section-library.json",
    "StructureDefinition-triglyceride.json",
    "Bundle-profiles-others.json",
    "StructureDefinition-provenance-relevant-history.json",

    // Scientific notation
    "Observation-decimal.json",
  )

val exclusionListR4B =
  listOf(
    // Java heap space
    "Bundle-resources.json",

    // Pattern
    "StructureDefinition-example-section-library.json",
    "StructureDefinition-triglyceride.json",
    "Bundle-profiles-others.json",
    "StructureDefinition-provenance-relevant-history.json",
    "StructureDefinition-lipidprofile.json",

    // Scientific notation
    "Observation-decimal.json",
  )

val exclusionListR5 =
  listOf(
    // Java heap space
    "Bundle-resources.json",

    // Trailing 0 in milliseconds
    "ArtifactAssessment-example-certainty-rating.json",
    "Citation-citation-example-research-doi.json",

    // Number instead of string for size
    "Communication-fm-solicited.json",
    "Communication-fm-attachment.json",
    "DocumentReference-example-comprehensive.json",
    "Location-wash-dc-metro.json",
    "DocumentReference-example.json",

    // Number instead of string eventsSinceSubscriptionStart
    "Bundle-54f808cf-d159-4c9b-accb-c33eb20f0ecc.json",
    "Bundle-3945182f-d315-4dbf-9259-09d863c7e7da.json",
    "SubscriptionStatus-example.json",

    // Number instead of string eventNumber
    "Bundle-00b99077-2bda-436e-98cc-a4f65d6c2fe0.json",
    "Bundle-920a46b7-045a-4773-82bd-8e90c3e15653.json",
    "Bundle-e2c9dc20-615e-4603-9005-74deb209cbb0.json",

    // eventsSinceSubscriptionStart
    "Bundle-fdd78223-f79f-43b4-8979-ad49d4ac248c.json",
    "Bundle-40464b74-fad0-4f45-ab60-e67f949c5e92.json",
    "Bundle-0f322dbe-4f8d-4cbd-9ecb-bc8dc6f65f6a.json",
    "Bundle-787e69f6-81a8-44e4-b404-257013dec332.json",
    "Bundle-3d20ea4b-90dc-4d0d-b15a-c7a893389401.json",
    "Bundle-9601c07a-e34f-4945-93ca-6efb5394c995.json",

    // minValueInteger64
    "Bundle-dataelements.json",
    "Bundle-types.json",
    "StructureDefinition-integer64.json",

    // Pattern
    "StructureDefinition-search-set-bundle.json",
    "StructureDefinition-fhirpathlibrary.json",
    "StructureDefinition-subscription-notification-bundle.json",
    "StructureDefinition-transaction-bundle.json",
    "StructureDefinition-transaction-response-bundle.json",
    "StructureDefinition-elmlibrary.json",
    "StructureDefinition-batch-response-bundle.json",
    "StructureDefinition-history-bundle.json",
    "StructureDefinition-example-section-library.json",
    "StructureDefinition-triglyceride.json",
    "StructureDefinition-logiclibrary.json",
    "StructureDefinition-batch-bundle.json",
    "Bundle-profiles-others.json",
    "StructureDefinition-moduledefinitionlibrary.json",
    "StructureDefinition-provenance-relevant-history.json",
    "StructureDefinition-cqllibrary.json",
    "StructureDefinition-modelinfolibrary.json",
    "StructureDefinition-lipidprofile.json",

    // Scientific notation
    "Observation-decimal.json",
  )

/**
 * This test verifies the generated code can be used to deserialize published FHIR examples and
 * serialize them back to the original JSON.
 */
class SerializationRoundTripTest {
  @Test
  fun shouldMatchOriginalJsonAfterDeserializationAndSerializationInR4() {
    loadR4Examples(
        fileNameFilter = {
          return@loadR4Examples (filterFileName(it) && !exclusionListR4.contains(it))
        }
      )
      .forEach {
        val exampleJson = prettyPrintJson(it)
        val domainResource: com.google.fhir.model.r4.Resource =
          json.decodeFromString<com.google.fhir.model.r4.Resource>(exampleJson)
        val reserializedString = json.encodeToString(domainResource)
        assertEqualsIgnoringZeros(exampleJson, reserializedString)
      }
  }

  @Test
  fun shouldMatchOriginalJsonAfterDeserializationAndSerializationInR4B() {
    loadR4BExamples(
        fileNameFilter = {
          return@loadR4BExamples (filterFileName(it) && !exclusionListR4B.contains(it))
        }
      )
      .forEach {
        val exampleJson = prettyPrintJson(it)
        val domainResource: com.google.fhir.model.r4b.Resource =
          json.decodeFromString<com.google.fhir.model.r4b.Resource>(exampleJson)
        val reserializedString = json.encodeToString(domainResource)
        assertEqualsIgnoringZeros(exampleJson, reserializedString)
      }
  }

  @Test
  fun shouldMatchOriginalJsonAfterDeserializationAndSerializationInR5() {
    loadR5Examples(
        fileNameFilter = {
          return@loadR5Examples (filterFileName(it) && !exclusionListR5.contains(it))
        }
      )
      .forEach {
        val exampleJson = prettyPrintJson(it)
        val domainResource: com.google.fhir.model.r5.Resource =
          json.decodeFromString<com.google.fhir.model.r5.Resource>(exampleJson)
        val reserializedString = json.encodeToString(domainResource)
        assertEqualsIgnoringZeros(exampleJson, reserializedString)
      }
  }

  companion object {
    private val json = Json {
      ignoreUnknownKeys = true
      explicitNulls = false
      prettyPrint = true
    }

    private val prettyPrintJson = Json { prettyPrint = true }

    fun filterFileName(name: String): Boolean {
      return name.endsWith(".json") &&
        !name.startsWith('.') // filter out `.index.json` file
        &&
        name != "package.json"
    }

    private fun prettyPrintJson(jsonString: String): String {
      val jsonElement =
        prettyPrintJson.parseToJsonElement(jsonString) // Parse the string to a JsonElement
      return prettyPrintJson.encodeToString(jsonElement) // Re-encode with pretty printing
    }

    private fun assertEqualsIgnoringZeros(exampleJson: String, reserializedString: String) {
      val expected =
        exampleJson
          .removeZerosAfterDecimalPoint()
          .replace("+00:00", "Z") // Unify UTC offset representation for Z
      val actual = reserializedString.removeZerosAfterDecimalPoint()

      // Some resources have non-standard JSON property ordering, so we sort the JSON
      // properties by the key before comparing them.
      assertEquals(
        json.parseToJsonElement(expected).jsonObject.entries.sortedBy { it.key },
        json.parseToJsonElement(actual).jsonObject.entries.sortedBy { it.key },
      )
    }

    private fun String.removeZerosAfterDecimalPoint(): String = replace(trailingZeroRegex, "")
  }
}

expect fun loadR4Examples(fileNameFilter: (String) -> Boolean): Sequence<String>

expect fun loadR4BExamples(fileNameFilter: (String) -> Boolean): Sequence<String>

expect fun loadR5Examples(fileNameFilter: (String) -> Boolean): Sequence<String>
