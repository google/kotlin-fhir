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
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class StringClassComparisonTest {

  @Test
  fun shouldMatchTheFirstStringWithTheSecond() {
    val firstString =
      com.google.fhir.model.r5.String(
        value = "123",
        extension =
          mutableListOf(
            com.google.fhir.model.r5.Extension(id = "extId1", url = "https://www.example.com")
          ),
      )
    val secondString =
      com.google.fhir.model.r5.String(
        value = "123",
        extension =
          mutableListOf(
            com.google.fhir.model.r5.Extension(id = "extId1", url = "https://www.example.com")
          ),
      )
    assertTrue(firstString == secondString)
  }

  @Test
  fun shouldReturnFalseWhenFirstStringDoNotMatchTheSecond() {
    val firstString = com.google.fhir.model.r5.String(value = "123")
    val secondString = com.google.fhir.model.r5.String(value = "23")
    assertFalse(firstString == secondString)
  }

  @Test
  fun shouldMatchTheFirstIdWithTheSecond() {
    val firstId = com.google.fhir.model.r5.Id(value = "123")
    val secondId = com.google.fhir.model.r5.Id(value = "123")
    assertTrue(firstId == secondId)
  }

  @Test
  fun shouldReturnFalseWhenFirstIdDoNotMatchTheSecond() {
    val firstId = com.google.fhir.model.r5.Id(value = "123")
    val secondId = com.google.fhir.model.r5.Id(value = "23")
    assertFalse(firstId == secondId)
  }

  @Test
  fun shouldNotMatchIdToString() {
    val theId = com.google.fhir.model.r5.Id(value = "123")
    val theString = com.google.fhir.model.r5.String(value = "123")
    assertFalse(theId == theString)
  }
}
