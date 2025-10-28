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

import io.kotest.core.spec.style.FunSpec
import kotlin.test.assertEquals

open class EqualityTest :
  FunSpec({
    listOf(
        EqualityTestSuite("R4", ::loadR4Examples, exclusionListR4, jsonR4::decodeFromString),
        EqualityTestSuite("R4B", ::loadR4BExamples, exclusionListR4B, jsonR4B::decodeFromString),
        EqualityTestSuite("R5", ::loadR5Examples, exclusionListR5, jsonR5::decodeFromString),
      )
      .forEach { testSuite ->
        context("${testSuite.fhirVersion} resources should be equal") {
          testSuite
            .exampleLoader { filterFileName(it) && !testSuite.exclusionList.contains(it) }
            .forEach { (fileName, json) ->
              test(fileName) {
                val firstResource = testSuite.decodeFunction(json)
                val secondResource = testSuite.decodeFunction(json)
                assertEquals(firstResource, secondResource)
              }
            }
        }
      }
  })

private data class EqualityTestSuite(
  val fhirVersion: String,
  val exampleLoader: (filter: (String) -> Boolean) -> Sequence<FhirResourceJsonExample>,
  val exclusionList: List<String>,
  val decodeFunction: (String) -> Any,
)

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
