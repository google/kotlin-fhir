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

    // Invalid resources
    "ActivityDefinition-administer-zika-virus-exposure-assessment.json",
    "ImplementationGuide-fhir.json",
    "Questionnaire-qs1.json",
    "ig-r4.json",
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

    // Invalid resource
    "Bundle-valuesets.json",
    "CodeSystem-catalogType.json",
    "ValueSet-catalogType.json",

    // Invalid resources
    "ActivityDefinition-administer-zika-virus-exposure-assessment.json",
  )

val exclusionListR5 =
  listOf(
    // Hanging
    "Bundle-searchParams.json",

    // Java heap space
    "Bundle-resources.json",

    // Trailing 0 in milliseconds
    "ArtifactAssessment-example-certainty-rating.json",
    "Citation-citation-example-research-doi.json",

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

    // Unknown code 'text/CQL' for enum ExpressionLanguage; codes are case-sensitive
    "ChargeItemDefinition-ebm.json",
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
        val domainResource: Resource = jsonR4.decodeFromString<Resource>(exampleJson)
        val reserializedString = jsonR4.encodeToString(domainResource)
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
          jsonR4B.decodeFromString<com.google.fhir.model.r4b.Resource>(exampleJson)
        val reserializedString = jsonR4B.encodeToString(domainResource)
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
          jsonR5.decodeFromString<com.google.fhir.model.r5.Resource>(exampleJson)
        val reserializedString = jsonR5.encodeToString(domainResource)
        assertEqualsIgnoringZeros(exampleJson, reserializedString)
      }
  }
}
