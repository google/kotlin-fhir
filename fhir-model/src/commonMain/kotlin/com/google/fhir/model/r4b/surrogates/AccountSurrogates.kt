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

package com.google.fhir.model.r4b.surrogates

import com.google.fhir.model.r4b.Account
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.PositiveInt
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class AccountCoverageSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var coverage: Reference? = null,
  public var priority: Int? = null,
  public var _priority: Element? = null,
) {
  public fun toModel(): Account.Coverage =
    Account.Coverage().apply {
      id = this@AccountCoverageSurrogate.id
      extension = this@AccountCoverageSurrogate.extension
      modifierExtension = this@AccountCoverageSurrogate.modifierExtension
      coverage = this@AccountCoverageSurrogate.coverage
      priority =
        PositiveInt.of(
          this@AccountCoverageSurrogate.priority,
          this@AccountCoverageSurrogate._priority,
        )
    }

  public companion object {
    public fun fromModel(model: Account.Coverage): AccountCoverageSurrogate =
      with(model) {
        AccountCoverageSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          coverage = this@with.coverage
          priority = this@with.priority?.value
          _priority = this@with.priority?.toElement()
        }
      }
  }
}

@Serializable
internal data class AccountGuarantorSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var party: Reference? = null,
  public var onHold: KotlinBoolean? = null,
  public var _onHold: Element? = null,
  public var period: Period? = null,
) {
  public fun toModel(): Account.Guarantor =
    Account.Guarantor().apply {
      id = this@AccountGuarantorSurrogate.id
      extension = this@AccountGuarantorSurrogate.extension
      modifierExtension = this@AccountGuarantorSurrogate.modifierExtension
      party = this@AccountGuarantorSurrogate.party
      onHold =
        R4bBoolean.of(this@AccountGuarantorSurrogate.onHold, this@AccountGuarantorSurrogate._onHold)
      period = this@AccountGuarantorSurrogate.period
    }

  public companion object {
    public fun fromModel(model: Account.Guarantor): AccountGuarantorSurrogate =
      with(model) {
        AccountGuarantorSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          party = this@with.party
          onHold = this@with.onHold?.value
          _onHold = this@with.onHold?.toElement()
          period = this@with.period
        }
      }
  }
}

@Serializable
internal data class AccountSurrogate(
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
  public var identifier: List<Identifier?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var type: CodeableConcept? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var subject: List<Reference?>? = null,
  public var servicePeriod: Period? = null,
  public var coverage: List<Account.Coverage>? = null,
  public var owner: Reference? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var guarantor: List<Account.Guarantor>? = null,
  public var partOf: Reference? = null,
) {
  public fun toModel(): Account =
    Account().apply {
      id = this@AccountSurrogate.id
      meta = this@AccountSurrogate.meta
      implicitRules =
        Uri.of(this@AccountSurrogate.implicitRules, this@AccountSurrogate._implicitRules)
      language = Code.of(this@AccountSurrogate.language, this@AccountSurrogate._language)
      text = this@AccountSurrogate.text
      contained = this@AccountSurrogate.contained
      extension = this@AccountSurrogate.extension
      modifierExtension = this@AccountSurrogate.modifierExtension
      identifier = this@AccountSurrogate.identifier
      status =
        Enumeration.of(
          this@AccountSurrogate.status?.let {
            com.google.fhir.model.r4b.Account.AccountStatus.fromCode(it)
          },
          this@AccountSurrogate._status,
        )
      type = this@AccountSurrogate.type
      name = R4bString.of(this@AccountSurrogate.name, this@AccountSurrogate._name)
      subject = this@AccountSurrogate.subject
      servicePeriod = this@AccountSurrogate.servicePeriod
      coverage = this@AccountSurrogate.coverage
      owner = this@AccountSurrogate.owner
      description =
        R4bString.of(this@AccountSurrogate.description, this@AccountSurrogate._description)
      guarantor = this@AccountSurrogate.guarantor
      partOf = this@AccountSurrogate.partOf
    }

  public companion object {
    public fun fromModel(model: Account): AccountSurrogate =
      with(model) {
        AccountSurrogate().apply {
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
          identifier = this@with.identifier
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          type = this@with.type
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          subject = this@with.subject
          servicePeriod = this@with.servicePeriod
          coverage = this@with.coverage
          owner = this@with.owner
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          guarantor = this@with.guarantor
          partOf = this@with.partOf
        }
      }
  }
}
