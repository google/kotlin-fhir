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

@file:Suppress("RedundantVisibilityModifier", "PropertyName")

package com.google.fhir.model.r4b

import com.google.fhir.model.r4b.serializers.ContributorSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * Base StructureDefinition for Contributor Type: A contributor to the content of a knowledge asset,
 * including authors, editors, reviewers, and endorsers.
 */
@Serializable(with = ContributorSerializer::class)
public data class Contributor(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override var id: kotlin.String? = null,
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * element. To make the use of extensions safe and manageable, there is a strict set of governance
   * applied to the definition and use of extensions. Though any implementer can define an
   * extension, there is a set of requirements that SHALL be met as part of the definition of the
   * extension.
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override var extension: List<Extension?>? = null,
  /** The type of contributor. */
  public var type: Enumeration<ContributorType>? = null,
  /** The name of the individual or organization responsible for the contribution. */
  public var name: String? = null,
  /** Contact details to assist a user in finding and communicating with the contributor. */
  public var contact: List<ContactDetail?>? = null,
) : Element() {
  /** The type of contributor. */
  public enum class ContributorType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** An author of the content of the module. */
    Author(
      "author",
      "http://hl7.org/fhir/contributor-type",
      "Author",
      "An author of the content of the module.",
    ),
    /** An editor of the content of the module. */
    Editor(
      "editor",
      "http://hl7.org/fhir/contributor-type",
      "Editor",
      "An editor of the content of the module.",
    ),
    /** A reviewer of the content of the module. */
    Reviewer(
      "reviewer",
      "http://hl7.org/fhir/contributor-type",
      "Reviewer",
      "A reviewer of the content of the module.",
    ),
    /** An endorser of the content of the module. */
    Endorser(
      "endorser",
      "http://hl7.org/fhir/contributor-type",
      "Endorser",
      "An endorser of the content of the module.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ContributorType =
        when (code) {
          "author" -> Author
          "editor" -> Editor
          "reviewer" -> Reviewer
          "endorser" -> Endorser
          else -> throw IllegalArgumentException("Unknown code $code for enum ContributorType")
        }
    }
  }
}
