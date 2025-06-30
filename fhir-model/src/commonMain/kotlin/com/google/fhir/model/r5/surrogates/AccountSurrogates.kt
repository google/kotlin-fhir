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

import com.google.fhir.model.r5.Account
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Instant
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Money
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.PositiveInt
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
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
        R5Boolean.of(this@AccountGuarantorSurrogate.onHold, this@AccountGuarantorSurrogate._onHold)
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
internal data class AccountDiagnosisSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var condition: CodeableReference? = null,
  public var dateOfDiagnosis: KotlinString? = null,
  public var _dateOfDiagnosis: Element? = null,
  public var type: List<CodeableConcept?>? = null,
  public var onAdmission: KotlinBoolean? = null,
  public var _onAdmission: Element? = null,
  public var packageCode: List<CodeableConcept?>? = null,
) {
  public fun toModel(): Account.Diagnosis =
    Account.Diagnosis().apply {
      id = this@AccountDiagnosisSurrogate.id
      extension = this@AccountDiagnosisSurrogate.extension
      modifierExtension = this@AccountDiagnosisSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@AccountDiagnosisSurrogate.sequence,
          this@AccountDiagnosisSurrogate._sequence,
        )
      condition = this@AccountDiagnosisSurrogate.condition
      dateOfDiagnosis =
        DateTime.of(
          FhirDateTime.fromString(this@AccountDiagnosisSurrogate.dateOfDiagnosis),
          this@AccountDiagnosisSurrogate._dateOfDiagnosis,
        )
      type = this@AccountDiagnosisSurrogate.type
      onAdmission =
        R5Boolean.of(
          this@AccountDiagnosisSurrogate.onAdmission,
          this@AccountDiagnosisSurrogate._onAdmission,
        )
      packageCode = this@AccountDiagnosisSurrogate.packageCode
    }

  public companion object {
    public fun fromModel(model: Account.Diagnosis): AccountDiagnosisSurrogate =
      with(model) {
        AccountDiagnosisSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          condition = this@with.condition
          dateOfDiagnosis = this@with.dateOfDiagnosis?.value?.toString()
          _dateOfDiagnosis = this@with.dateOfDiagnosis?.toElement()
          type = this@with.type
          onAdmission = this@with.onAdmission?.value
          _onAdmission = this@with.onAdmission?.toElement()
          packageCode = this@with.packageCode
        }
      }
  }
}

@Serializable
internal data class AccountProcedureSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var code: CodeableReference? = null,
  public var dateOfService: KotlinString? = null,
  public var _dateOfService: Element? = null,
  public var type: List<CodeableConcept?>? = null,
  public var packageCode: List<CodeableConcept?>? = null,
  public var device: List<Reference?>? = null,
) {
  public fun toModel(): Account.Procedure =
    Account.Procedure().apply {
      id = this@AccountProcedureSurrogate.id
      extension = this@AccountProcedureSurrogate.extension
      modifierExtension = this@AccountProcedureSurrogate.modifierExtension
      sequence =
        PositiveInt.of(
          this@AccountProcedureSurrogate.sequence,
          this@AccountProcedureSurrogate._sequence,
        )
      code = this@AccountProcedureSurrogate.code
      dateOfService =
        DateTime.of(
          FhirDateTime.fromString(this@AccountProcedureSurrogate.dateOfService),
          this@AccountProcedureSurrogate._dateOfService,
        )
      type = this@AccountProcedureSurrogate.type
      packageCode = this@AccountProcedureSurrogate.packageCode
      device = this@AccountProcedureSurrogate.device
    }

  public companion object {
    public fun fromModel(model: Account.Procedure): AccountProcedureSurrogate =
      with(model) {
        AccountProcedureSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          code = this@with.code
          dateOfService = this@with.dateOfService?.value?.toString()
          _dateOfService = this@with.dateOfService?.toElement()
          type = this@with.type
          packageCode = this@with.packageCode
          device = this@with.device
        }
      }
  }
}

@Serializable
internal data class AccountRelatedAccountSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var relationship: CodeableConcept? = null,
  public var account: Reference? = null,
) {
  public fun toModel(): Account.RelatedAccount =
    Account.RelatedAccount().apply {
      id = this@AccountRelatedAccountSurrogate.id
      extension = this@AccountRelatedAccountSurrogate.extension
      modifierExtension = this@AccountRelatedAccountSurrogate.modifierExtension
      relationship = this@AccountRelatedAccountSurrogate.relationship
      account = this@AccountRelatedAccountSurrogate.account
    }

  public companion object {
    public fun fromModel(model: Account.RelatedAccount): AccountRelatedAccountSurrogate =
      with(model) {
        AccountRelatedAccountSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          relationship = this@with.relationship
          account = this@with.account
        }
      }
  }
}

@Serializable
internal data class AccountBalanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var aggregate: CodeableConcept? = null,
  public var term: CodeableConcept? = null,
  public var estimate: KotlinBoolean? = null,
  public var _estimate: Element? = null,
  public var amount: Money? = null,
) {
  public fun toModel(): Account.Balance =
    Account.Balance().apply {
      id = this@AccountBalanceSurrogate.id
      extension = this@AccountBalanceSurrogate.extension
      modifierExtension = this@AccountBalanceSurrogate.modifierExtension
      aggregate = this@AccountBalanceSurrogate.aggregate
      term = this@AccountBalanceSurrogate.term
      estimate =
        R5Boolean.of(this@AccountBalanceSurrogate.estimate, this@AccountBalanceSurrogate._estimate)
      amount = this@AccountBalanceSurrogate.amount
    }

  public companion object {
    public fun fromModel(model: Account.Balance): AccountBalanceSurrogate =
      with(model) {
        AccountBalanceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          aggregate = this@with.aggregate
          term = this@with.term
          estimate = this@with.estimate?.value
          _estimate = this@with.estimate?.toElement()
          amount = this@with.amount
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
  public var billingStatus: CodeableConcept? = null,
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
  public var diagnosis: List<Account.Diagnosis>? = null,
  public var procedure: List<Account.Procedure>? = null,
  public var relatedAccount: List<Account.RelatedAccount>? = null,
  public var currency: CodeableConcept? = null,
  public var balance: List<Account.Balance>? = null,
  public var calculatedAt: KotlinString? = null,
  public var _calculatedAt: Element? = null,
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
            com.google.fhir.model.r5.Account.AccountStatus.fromCode(it)
          },
          this@AccountSurrogate._status,
        )
      billingStatus = this@AccountSurrogate.billingStatus
      type = this@AccountSurrogate.type
      name = R5String.of(this@AccountSurrogate.name, this@AccountSurrogate._name)
      subject = this@AccountSurrogate.subject
      servicePeriod = this@AccountSurrogate.servicePeriod
      coverage = this@AccountSurrogate.coverage
      owner = this@AccountSurrogate.owner
      description =
        Markdown.of(this@AccountSurrogate.description, this@AccountSurrogate._description)
      guarantor = this@AccountSurrogate.guarantor
      diagnosis = this@AccountSurrogate.diagnosis
      procedure = this@AccountSurrogate.procedure
      relatedAccount = this@AccountSurrogate.relatedAccount
      currency = this@AccountSurrogate.currency
      balance = this@AccountSurrogate.balance
      calculatedAt =
        Instant.of(
          FhirDateTime.fromString(this@AccountSurrogate.calculatedAt),
          this@AccountSurrogate._calculatedAt,
        )
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
          billingStatus = this@with.billingStatus
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
          diagnosis = this@with.diagnosis
          procedure = this@with.procedure
          relatedAccount = this@with.relatedAccount
          currency = this@with.currency
          balance = this@with.balance
          calculatedAt = this@with.calculatedAt?.value?.toString()
          _calculatedAt = this@with.calculatedAt?.toElement()
        }
      }
  }
}
