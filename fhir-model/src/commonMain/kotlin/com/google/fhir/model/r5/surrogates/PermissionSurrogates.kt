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

package com.google.fhir.model.r5.surrogates

import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Expression
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Permission
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class PermissionJustificationSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var basis: List<CodeableConcept?>? = null,
  public var evidence: List<Reference?>? = null,
) {
  public fun toModel(): Permission.Justification =
    Permission.Justification().apply {
      id = this@PermissionJustificationSurrogate.id
      extension = this@PermissionJustificationSurrogate.extension
      modifierExtension = this@PermissionJustificationSurrogate.modifierExtension
      basis = this@PermissionJustificationSurrogate.basis
      evidence = this@PermissionJustificationSurrogate.evidence
    }

  public companion object {
    public fun fromModel(model: Permission.Justification): PermissionJustificationSurrogate =
      with(model) {
        PermissionJustificationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          basis = this@with.basis
          evidence = this@with.evidence
        }
      }
  }
}

@Serializable
internal data class PermissionRuleDataResourceSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var meaning: String? = null,
  public var _meaning: Element? = null,
  public var reference: Reference? = null,
) {
  public fun toModel(): Permission.Rule.Data.Resource =
    Permission.Rule.Data.Resource().apply {
      id = this@PermissionRuleDataResourceSurrogate.id
      extension = this@PermissionRuleDataResourceSurrogate.extension
      modifierExtension = this@PermissionRuleDataResourceSurrogate.modifierExtension
      meaning =
        Enumeration.of(
          this@PermissionRuleDataResourceSurrogate.meaning?.let {
            com.google.fhir.model.r5.Permission.ConsentDataMeaning.fromCode(it)
          },
          this@PermissionRuleDataResourceSurrogate._meaning,
        )
      reference = this@PermissionRuleDataResourceSurrogate.reference
    }

  public companion object {
    public fun fromModel(
      model: Permission.Rule.Data.Resource
    ): PermissionRuleDataResourceSurrogate =
      with(model) {
        PermissionRuleDataResourceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          meaning = this@with.meaning?.value?.getCode()
          _meaning = this@with.meaning?.toElement()
          reference = this@with.reference
        }
      }
  }
}

@Serializable
internal data class PermissionRuleDataSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var resource: List<Permission.Rule.Data.Resource>? = null,
  public var security: List<Coding?>? = null,
  public var period: List<Period?>? = null,
  public var expression: Expression? = null,
) {
  public fun toModel(): Permission.Rule.Data =
    Permission.Rule.Data().apply {
      id = this@PermissionRuleDataSurrogate.id
      extension = this@PermissionRuleDataSurrogate.extension
      modifierExtension = this@PermissionRuleDataSurrogate.modifierExtension
      resource = this@PermissionRuleDataSurrogate.resource
      security = this@PermissionRuleDataSurrogate.security
      period = this@PermissionRuleDataSurrogate.period
      expression = this@PermissionRuleDataSurrogate.expression
    }

  public companion object {
    public fun fromModel(model: Permission.Rule.Data): PermissionRuleDataSurrogate =
      with(model) {
        PermissionRuleDataSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          resource = this@with.resource
          security = this@with.security
          period = this@with.period
          expression = this@with.expression
        }
      }
  }
}

@Serializable
internal data class PermissionRuleActivitySurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var actor: List<Reference?>? = null,
  public var action: List<CodeableConcept?>? = null,
  public var purpose: List<CodeableConcept?>? = null,
) {
  public fun toModel(): Permission.Rule.Activity =
    Permission.Rule.Activity().apply {
      id = this@PermissionRuleActivitySurrogate.id
      extension = this@PermissionRuleActivitySurrogate.extension
      modifierExtension = this@PermissionRuleActivitySurrogate.modifierExtension
      actor = this@PermissionRuleActivitySurrogate.actor
      action = this@PermissionRuleActivitySurrogate.action
      purpose = this@PermissionRuleActivitySurrogate.purpose
    }

  public companion object {
    public fun fromModel(model: Permission.Rule.Activity): PermissionRuleActivitySurrogate =
      with(model) {
        PermissionRuleActivitySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          actor = this@with.actor
          action = this@with.action
          purpose = this@with.purpose
        }
      }
  }
}

@Serializable
internal data class PermissionRuleSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: String? = null,
  public var _type: Element? = null,
  public var `data`: List<Permission.Rule.Data>? = null,
  public var activity: List<Permission.Rule.Activity>? = null,
  public var limit: List<CodeableConcept?>? = null,
) {
  public fun toModel(): Permission.Rule =
    Permission.Rule().apply {
      id = this@PermissionRuleSurrogate.id
      extension = this@PermissionRuleSurrogate.extension
      modifierExtension = this@PermissionRuleSurrogate.modifierExtension
      type =
        Enumeration.of(
          this@PermissionRuleSurrogate.type?.let {
            com.google.fhir.model.r5.Permission.PermissionProvisionType.fromCode(it)
          },
          this@PermissionRuleSurrogate._type,
        )
      `data` = this@PermissionRuleSurrogate.`data`
      activity = this@PermissionRuleSurrogate.activity
      limit = this@PermissionRuleSurrogate.limit
    }

  public companion object {
    public fun fromModel(model: Permission.Rule): PermissionRuleSurrogate =
      with(model) {
        PermissionRuleSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          `data` = this@with.`data`
          activity = this@with.activity
          limit = this@with.limit
        }
      }
  }
}

@Serializable
internal data class PermissionSurrogate(
  public var id: String? = null,
  public var meta: Meta? = null,
  public var implicitRules: String? = null,
  public var _implicitRules: Element? = null,
  public var language: String? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var asserter: Reference? = null,
  public var date: List<String?>? = null,
  public var _date: List<Element?>? = null,
  public var validity: Period? = null,
  public var justification: Permission.Justification? = null,
  public var combining: String? = null,
  public var _combining: Element? = null,
  public var rule: List<Permission.Rule>? = null,
) {
  public fun toModel(): Permission =
    Permission().apply {
      id = this@PermissionSurrogate.id
      meta = this@PermissionSurrogate.meta
      implicitRules =
        Uri.of(this@PermissionSurrogate.implicitRules, this@PermissionSurrogate._implicitRules)
      language = Code.of(this@PermissionSurrogate.language, this@PermissionSurrogate._language)
      text = this@PermissionSurrogate.text
      contained = this@PermissionSurrogate.contained
      extension = this@PermissionSurrogate.extension
      modifierExtension = this@PermissionSurrogate.modifierExtension
      status =
        Enumeration.of(
          this@PermissionSurrogate.status?.let {
            com.google.fhir.model.r5.Permission.PermissionStatus.fromCode(it)
          },
          this@PermissionSurrogate._status,
        )
      asserter = this@PermissionSurrogate.asserter
      date =
        if (this@PermissionSurrogate.date == null && this@PermissionSurrogate._date == null) {
          null
        } else {
          (this@PermissionSurrogate.date ?: List(this@PermissionSurrogate._date!!.size) { null })
            .zip(
              this@PermissionSurrogate._date ?: List(this@PermissionSurrogate.date!!.size) { null }
            )
            .mapNotNull { (value, element) -> DateTime.of(FhirDateTime.fromString(value), element) }
        }
      validity = this@PermissionSurrogate.validity
      justification = this@PermissionSurrogate.justification
      combining =
        Enumeration.of(
          this@PermissionSurrogate.combining?.let {
            com.google.fhir.model.r5.Permission.PermissionCombining.fromCode(it)
          },
          this@PermissionSurrogate._combining,
        )
      rule = this@PermissionSurrogate.rule
    }

  public companion object {
    public fun fromModel(model: Permission): PermissionSurrogate =
      with(model) {
        PermissionSurrogate().apply {
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
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          asserter = this@with.asserter
          date = this@with.date?.map { it?.value?.toString() }?.takeUnless { it.all { it == null } }
          _date = this@with.date?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          validity = this@with.validity
          justification = this@with.justification
          combining = this@with.combining?.value?.getCode()
          _combining = this@with.combining?.toElement()
          rule = this@with.rule
        }
      }
  }
}
