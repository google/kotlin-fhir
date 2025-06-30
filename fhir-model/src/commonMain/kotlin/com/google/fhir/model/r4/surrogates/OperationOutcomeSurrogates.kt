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

@file:UseSerializers(DoubleSerializer::class, LocalTimeSerializer::class)
@file:Suppress("RedundantVisibilityModifier", "PropertyName")

package com.google.fhir.model.r4.surrogates

import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.OperationOutcome
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class OperationOutcomeIssueSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var severity: KotlinString? = null,
  public var _severity: Element? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var details: CodeableConcept? = null,
  public var diagnostics: KotlinString? = null,
  public var _diagnostics: Element? = null,
  public var location: List<KotlinString?>? = null,
  public var _location: List<Element?>? = null,
  public var expression: List<KotlinString?>? = null,
  public var _expression: List<Element?>? = null,
) {
  public fun toModel(): OperationOutcome.Issue =
    OperationOutcome.Issue().apply {
      id = this@OperationOutcomeIssueSurrogate.id
      extension = this@OperationOutcomeIssueSurrogate.extension
      modifierExtension = this@OperationOutcomeIssueSurrogate.modifierExtension
      severity =
        Enumeration.of(
          this@OperationOutcomeIssueSurrogate.severity?.let {
            com.google.fhir.model.r4.OperationOutcome.IssueSeverity.fromCode(it)
          },
          this@OperationOutcomeIssueSurrogate._severity,
        )
      code =
        Enumeration.of(
          this@OperationOutcomeIssueSurrogate.code?.let {
            com.google.fhir.model.r4.OperationOutcome.IssueType.fromCode(it)
          },
          this@OperationOutcomeIssueSurrogate._code,
        )
      details = this@OperationOutcomeIssueSurrogate.details
      diagnostics =
        R4String.of(
          this@OperationOutcomeIssueSurrogate.diagnostics,
          this@OperationOutcomeIssueSurrogate._diagnostics,
        )
      location =
        if (
          this@OperationOutcomeIssueSurrogate.location == null &&
            this@OperationOutcomeIssueSurrogate._location == null
        ) {
          null
        } else {
          (this@OperationOutcomeIssueSurrogate.location
              ?: List(this@OperationOutcomeIssueSurrogate._location!!.size) { null })
            .zip(
              this@OperationOutcomeIssueSurrogate._location
                ?: List(this@OperationOutcomeIssueSurrogate.location!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4String.of(value, element) }
        }
      expression =
        if (
          this@OperationOutcomeIssueSurrogate.expression == null &&
            this@OperationOutcomeIssueSurrogate._expression == null
        ) {
          null
        } else {
          (this@OperationOutcomeIssueSurrogate.expression
              ?: List(this@OperationOutcomeIssueSurrogate._expression!!.size) { null })
            .zip(
              this@OperationOutcomeIssueSurrogate._expression
                ?: List(this@OperationOutcomeIssueSurrogate.expression!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4String.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(model: OperationOutcome.Issue): OperationOutcomeIssueSurrogate =
      with(model) {
        OperationOutcomeIssueSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          severity = this@with.severity?.value?.getCode()
          _severity = this@with.severity?.toElement()
          code = this@with.code?.value?.getCode()
          _code = this@with.code?.toElement()
          details = this@with.details
          diagnostics = this@with.diagnostics?.value
          _diagnostics = this@with.diagnostics?.toElement()
          location = this@with.location?.map { it?.value }?.takeUnless { it.all { it == null } }
          _location =
            this@with.location?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          expression = this@with.expression?.map { it?.value }?.takeUnless { it.all { it == null } }
          _expression =
            this@with.expression?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
        }
      }
  }
}

@Serializable
internal data class OperationOutcomeSurrogate(
  public var id: KotlinString? = null,
  public var meta: Meta? = null,
  public var implicitRules: KotlinString? = null,
  public var _implicitRules: Element? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var issue: List<OperationOutcome.Issue>? = null,
) {
  public fun toModel(): OperationOutcome =
    OperationOutcome().apply {
      id = this@OperationOutcomeSurrogate.id
      meta = this@OperationOutcomeSurrogate.meta
      implicitRules =
        Uri.of(
          this@OperationOutcomeSurrogate.implicitRules,
          this@OperationOutcomeSurrogate._implicitRules,
        )
      language =
        Code.of(this@OperationOutcomeSurrogate.language, this@OperationOutcomeSurrogate._language)
      text = this@OperationOutcomeSurrogate.text
      contained = this@OperationOutcomeSurrogate.contained
      extension = this@OperationOutcomeSurrogate.extension
      modifierExtension = this@OperationOutcomeSurrogate.modifierExtension
      issue = this@OperationOutcomeSurrogate.issue
    }

  public companion object {
    public fun fromModel(model: OperationOutcome): OperationOutcomeSurrogate =
      with(model) {
        OperationOutcomeSurrogate().apply {
          id = this@with.id
          meta = this@with.meta
          implicitRules = this@with.implicitRules?.value
          _implicitRules = this@with.implicitRules?.toElement()
          language = this@with.language?.value
          _language = this@with.language?.toElement()
          text = this@with.text
          contained = this@with.contained
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          issue = this@with.issue
        }
      }
  }
}
