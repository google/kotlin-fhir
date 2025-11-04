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

import io.kotest.assertions.json.shouldEqualJson
import io.kotest.core.spec.style.FunSpec

/**
 * This test verifies the generated code can be used to deserialize published FHIR examples and
 * serialize them back to the original JSON.
 */
class SerializationRoundTripTest :
  FunSpec({
    listOf(
        SerializationRoundTripTestSuite("R4", ::loadR4Examples, exclusionListR4) {
          jsonR4.encodeToString(jsonR4.decodeFromString(it))
        },
        SerializationRoundTripTestSuite("R4B", ::loadR4BExamples, exclusionListR4B) {
          jsonR4B.encodeToString(jsonR4B.decodeFromString(it))
        },
        SerializationRoundTripTestSuite("R5", ::loadR5Examples, exclusionListR5) {
          jsonR5.encodeToString(jsonR5.decodeFromString(it))
        },
      )
      .forEach { testSuite ->
        context(
          "${testSuite.fhirVersion} JSON should be the same after deserialization and serialization"
        ) {
          testSuite
            .exampleLoader { filterFileName(it) && !testSuite.exclusionList.contains(it) }
            .forEach { (fileName, json) ->
              test(fileName) { assertEqualsIgnoringZeros(json, testSuite.roundTripFunction(json)) }
            }
        }
      }
  })

private data class SerializationRoundTripTestSuite(
  val fhirVersion: String,
  val exampleLoader: (filter: (String) -> Boolean) -> Sequence<FhirResourceJsonExample>,
  val exclusionList: List<String>,
  val roundTripFunction: (String) -> String,
)

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

    // Floating point issue https://github.com/google/kotlin-fhir/issues/60
    "Observation-body-height.json",
  )

private val exclusionListR4B =
  listOf(
    // Java heap space
    "Bundle-resources.json",

    // Scientific notation
    "Observation-decimal.json",

    // Invalid resources
    "Bundle-valuesets.json",
    "CodeSystem-catalogType.json",
    "ValueSet-catalogType.json",
    "ActivityDefinition-administer-zika-virus-exposure-assessment.json",

    // Floating point issue https://github.com/google/kotlin-fhir/issues/60
    "Observation-body-height.json",
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

    // Floating point issue https://github.com/google/kotlin-fhir/issues/60
    "Observation-body-height.json",
  )

private fun assertEqualsIgnoringZeros(exampleJson: String, reserializedString: String) {
  val expected =
    exampleJson
      .removeZeroMilliseconds()
      .replace("+00:00", "Z") // Unify UTC offset representation for Z
  val actual = reserializedString.removeZeroMilliseconds()
  actual.shouldEqualJson(expected)
}

private val zeroMillisecondsPlusRegex = "\\.000\\+".toRegex()
private val zeroMillisecondsMinusRegex = "\\.000-".toRegex()
private val zeroMillisecondsZRegex = "\\.000Z".toRegex()
private val longZeroMillisecondsZRegex = "\\.0000000".toRegex()

private fun String.removeZeroMilliseconds(): String =
  replace(zeroMillisecondsPlusRegex, "+")
    .replace(zeroMillisecondsMinusRegex, "-")
    .replace(zeroMillisecondsZRegex, "Z")
    .replace(longZeroMillisecondsZRegex, "")
