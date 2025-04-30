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

import kotlinx.serialization.Serializable

@Serializable
data class CodeSystem(
  val resourceType: String,
  val id: String,
  val extension: List<Extension>? = null,
  val url: String,
  val version: String? = null,
  val name: String,
  val title: String? = null,
  val status: String? = null,
  val experimental: Boolean? = null,
  val date: String? = null,
  val description: String? = null,
  val content: String,
  val concept: List<Concept>? = null,
)

@Serializable
data class Concept(
  val code: String,
  val display: String? = null,
  val definition: String? = null,
  val concept: List<Concept>? = null,
)
