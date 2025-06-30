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

package com.google.fhir.model.r5

import kotlin.String

/**
 * Some potential code systems are:
 * - [v3-DocumentCompletion](http://terminology.hl7.org/3.0.0/CodeSystem-v3-DocumentCompletion.html)
 * - [v3-DataOperation](http://terminology.hl7.org/3.0.0/CodeSystem-v3-DataOperation.html)
 * - [v3-ActCode](http://hl7.org/fhir/v3/ActCode/cs.html)
 * - [ISO Lifecycle](http://terminology.hl7.org/CodeSystem/iso-21089-lifecycle)
 */
public enum class ProvenanceActivity(
  private val code: String,
  private val system: String,
  private val display: String?,
  private val definition: String?,
) {
  Amend("amend", "http://terminology.hl7.org/CodeSystem/iso-21089-lifecycle", null, null),
  Originate("originate", "http://terminology.hl7.org/CodeSystem/iso-21089-lifecycle", null, null),
  Merge("merge", "http://terminology.hl7.org/CodeSystem/iso-21089-lifecycle", null, null),
  Deidentify("deidentify", "http://terminology.hl7.org/CodeSystem/iso-21089-lifecycle", null, null),
  Receive("receive", "http://terminology.hl7.org/CodeSystem/iso-21089-lifecycle", null, null),
  Transform("transform", "http://terminology.hl7.org/CodeSystem/iso-21089-lifecycle", null, null),
  Verify("verify", "http://terminology.hl7.org/CodeSystem/iso-21089-lifecycle", null, null);

  override fun toString(): String = code

  public fun getCode(): String = code

  public fun getSystem(): String = system

  public fun getDisplay(): String? = display

  public fun getDefinition(): String? = definition

  public companion object {
    public fun fromCode(code: String): ProvenanceActivity =
      when (code) {
        "amend" -> Amend
        "originate" -> Originate
        "merge" -> Merge
        "deidentify" -> Deidentify
        "receive" -> Receive
        "transform" -> Transform
        "verify" -> Verify
        else -> throw IllegalArgumentException("Unknown code $code for enum ProvenanceActivity")
      }
  }
}
