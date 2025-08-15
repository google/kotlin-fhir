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
import kotlinx.serialization.json.Json

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
