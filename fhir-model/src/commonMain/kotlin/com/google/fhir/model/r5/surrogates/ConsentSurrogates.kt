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

import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.Consent
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Expression
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.Url
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ConsentPolicyBasisSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var reference: Reference? = null,
  public var url: String? = null,
  public var _url: Element? = null,
) {
  public fun toModel(): Consent.PolicyBasis =
    Consent.PolicyBasis().apply {
      id = this@ConsentPolicyBasisSurrogate.id
      extension = this@ConsentPolicyBasisSurrogate.extension
      modifierExtension = this@ConsentPolicyBasisSurrogate.modifierExtension
      reference = this@ConsentPolicyBasisSurrogate.reference
      url = Url.of(this@ConsentPolicyBasisSurrogate.url, this@ConsentPolicyBasisSurrogate._url)
    }

  public companion object {
    public fun fromModel(model: Consent.PolicyBasis): ConsentPolicyBasisSurrogate =
      with(model) {
        ConsentPolicyBasisSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          reference = this@with.reference
          url = this@with.url?.value
          _url = this@with.url?.toElement()
        }
      }
  }
}

@Serializable
internal data class ConsentVerificationSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var verified: KotlinBoolean? = null,
  public var _verified: Element? = null,
  public var verificationType: CodeableConcept? = null,
  public var verifiedBy: Reference? = null,
  public var verifiedWith: Reference? = null,
  public var verificationDate: List<String?>? = null,
  public var _verificationDate: List<Element?>? = null,
) {
  public fun toModel(): Consent.Verification =
    Consent.Verification().apply {
      id = this@ConsentVerificationSurrogate.id
      extension = this@ConsentVerificationSurrogate.extension
      modifierExtension = this@ConsentVerificationSurrogate.modifierExtension
      verified =
        R5Boolean.of(
          this@ConsentVerificationSurrogate.verified,
          this@ConsentVerificationSurrogate._verified,
        )
      verificationType = this@ConsentVerificationSurrogate.verificationType
      verifiedBy = this@ConsentVerificationSurrogate.verifiedBy
      verifiedWith = this@ConsentVerificationSurrogate.verifiedWith
      verificationDate =
        if (
          this@ConsentVerificationSurrogate.verificationDate == null &&
            this@ConsentVerificationSurrogate._verificationDate == null
        ) {
          null
        } else {
          (this@ConsentVerificationSurrogate.verificationDate
              ?: List(this@ConsentVerificationSurrogate._verificationDate!!.size) { null })
            .zip(
              this@ConsentVerificationSurrogate._verificationDate
                ?: List(this@ConsentVerificationSurrogate.verificationDate!!.size) { null }
            )
            .mapNotNull { (value, element) -> DateTime.of(FhirDateTime.fromString(value), element) }
        }
    }

  public companion object {
    public fun fromModel(model: Consent.Verification): ConsentVerificationSurrogate =
      with(model) {
        ConsentVerificationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          verified = this@with.verified?.value
          _verified = this@with.verified?.toElement()
          verificationType = this@with.verificationType
          verifiedBy = this@with.verifiedBy
          verifiedWith = this@with.verifiedWith
          verificationDate =
            this@with.verificationDate
              ?.map { it?.value?.toString() }
              ?.takeUnless { it.all { it == null } }
          _verificationDate =
            this@with.verificationDate
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
        }
      }
  }
}

@Serializable
internal data class ConsentProvisionActorSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var role: CodeableConcept? = null,
  public var reference: Reference? = null,
) {
  public fun toModel(): Consent.Provision.Actor =
    Consent.Provision.Actor().apply {
      id = this@ConsentProvisionActorSurrogate.id
      extension = this@ConsentProvisionActorSurrogate.extension
      modifierExtension = this@ConsentProvisionActorSurrogate.modifierExtension
      role = this@ConsentProvisionActorSurrogate.role
      reference = this@ConsentProvisionActorSurrogate.reference
    }

  public companion object {
    public fun fromModel(model: Consent.Provision.Actor): ConsentProvisionActorSurrogate =
      with(model) {
        ConsentProvisionActorSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          role = this@with.role
          reference = this@with.reference
        }
      }
  }
}

@Serializable
internal data class ConsentProvisionDataSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var meaning: String? = null,
  public var _meaning: Element? = null,
  public var reference: Reference? = null,
) {
  public fun toModel(): Consent.Provision.Data =
    Consent.Provision.Data().apply {
      id = this@ConsentProvisionDataSurrogate.id
      extension = this@ConsentProvisionDataSurrogate.extension
      modifierExtension = this@ConsentProvisionDataSurrogate.modifierExtension
      meaning =
        Enumeration.of(
          this@ConsentProvisionDataSurrogate.meaning?.let {
            com.google.fhir.model.r5.Consent.ConsentDataMeaning.fromCode(it)
          },
          this@ConsentProvisionDataSurrogate._meaning,
        )
      reference = this@ConsentProvisionDataSurrogate.reference
    }

  public companion object {
    public fun fromModel(model: Consent.Provision.Data): ConsentProvisionDataSurrogate =
      with(model) {
        ConsentProvisionDataSurrogate().apply {
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
internal data class ConsentProvisionSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var period: Period? = null,
  public var actor: List<Consent.Provision.Actor>? = null,
  public var action: List<CodeableConcept?>? = null,
  public var securityLabel: List<Coding?>? = null,
  public var purpose: List<Coding?>? = null,
  public var documentType: List<Coding?>? = null,
  public var resourceType: List<Coding?>? = null,
  public var code: List<CodeableConcept?>? = null,
  public var dataPeriod: Period? = null,
  public var `data`: List<Consent.Provision.Data>? = null,
  public var expression: Expression? = null,
  public var provision: List<Consent.Provision?>? = null,
) {
  public fun toModel(): Consent.Provision =
    Consent.Provision().apply {
      id = this@ConsentProvisionSurrogate.id
      extension = this@ConsentProvisionSurrogate.extension
      modifierExtension = this@ConsentProvisionSurrogate.modifierExtension
      period = this@ConsentProvisionSurrogate.period
      actor = this@ConsentProvisionSurrogate.actor
      action = this@ConsentProvisionSurrogate.action
      securityLabel = this@ConsentProvisionSurrogate.securityLabel
      purpose = this@ConsentProvisionSurrogate.purpose
      documentType = this@ConsentProvisionSurrogate.documentType
      resourceType = this@ConsentProvisionSurrogate.resourceType
      code = this@ConsentProvisionSurrogate.code
      dataPeriod = this@ConsentProvisionSurrogate.dataPeriod
      `data` = this@ConsentProvisionSurrogate.`data`
      expression = this@ConsentProvisionSurrogate.expression
      provision = this@ConsentProvisionSurrogate.provision
    }

  public companion object {
    public fun fromModel(model: Consent.Provision): ConsentProvisionSurrogate =
      with(model) {
        ConsentProvisionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          period = this@with.period
          actor = this@with.actor
          action = this@with.action
          securityLabel = this@with.securityLabel
          purpose = this@with.purpose
          documentType = this@with.documentType
          resourceType = this@with.resourceType
          code = this@with.code
          dataPeriod = this@with.dataPeriod
          `data` = this@with.`data`
          expression = this@with.expression
          provision = this@with.provision
        }
      }
  }
}

@Serializable
internal data class ConsentSurrogate(
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
  public var identifier: List<Identifier?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var subject: Reference? = null,
  public var date: String? = null,
  public var _date: Element? = null,
  public var period: Period? = null,
  public var grantor: List<Reference?>? = null,
  public var grantee: List<Reference?>? = null,
  public var manager: List<Reference?>? = null,
  public var controller: List<Reference?>? = null,
  public var sourceAttachment: List<Attachment?>? = null,
  public var sourceReference: List<Reference?>? = null,
  public var regulatoryBasis: List<CodeableConcept?>? = null,
  public var policyBasis: Consent.PolicyBasis? = null,
  public var policyText: List<Reference?>? = null,
  public var verification: List<Consent.Verification>? = null,
  public var decision: String? = null,
  public var _decision: Element? = null,
  public var provision: List<Consent.Provision>? = null,
) {
  public fun toModel(): Consent =
    Consent().apply {
      id = this@ConsentSurrogate.id
      meta = this@ConsentSurrogate.meta
      implicitRules =
        Uri.of(this@ConsentSurrogate.implicitRules, this@ConsentSurrogate._implicitRules)
      language = Code.of(this@ConsentSurrogate.language, this@ConsentSurrogate._language)
      text = this@ConsentSurrogate.text
      contained = this@ConsentSurrogate.contained
      extension = this@ConsentSurrogate.extension
      modifierExtension = this@ConsentSurrogate.modifierExtension
      identifier = this@ConsentSurrogate.identifier
      status =
        Enumeration.of(
          this@ConsentSurrogate.status?.let {
            com.google.fhir.model.r5.Consent.ConsentState.fromCode(it)
          },
          this@ConsentSurrogate._status,
        )
      category = this@ConsentSurrogate.category
      subject = this@ConsentSurrogate.subject
      date = Date.of(FhirDate.fromString(this@ConsentSurrogate.date), this@ConsentSurrogate._date)
      period = this@ConsentSurrogate.period
      grantor = this@ConsentSurrogate.grantor
      grantee = this@ConsentSurrogate.grantee
      manager = this@ConsentSurrogate.manager
      controller = this@ConsentSurrogate.controller
      sourceAttachment = this@ConsentSurrogate.sourceAttachment
      sourceReference = this@ConsentSurrogate.sourceReference
      regulatoryBasis = this@ConsentSurrogate.regulatoryBasis
      policyBasis = this@ConsentSurrogate.policyBasis
      policyText = this@ConsentSurrogate.policyText
      verification = this@ConsentSurrogate.verification
      decision =
        Enumeration.of(
          this@ConsentSurrogate.decision?.let {
            com.google.fhir.model.r5.Consent.ConsentProvisionType.fromCode(it)
          },
          this@ConsentSurrogate._decision,
        )
      provision = this@ConsentSurrogate.provision
    }

  public companion object {
    public fun fromModel(model: Consent): ConsentSurrogate =
      with(model) {
        ConsentSurrogate().apply {
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
          category = this@with.category
          subject = this@with.subject
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          period = this@with.period
          grantor = this@with.grantor
          grantee = this@with.grantee
          manager = this@with.manager
          controller = this@with.controller
          sourceAttachment = this@with.sourceAttachment
          sourceReference = this@with.sourceReference
          regulatoryBasis = this@with.regulatoryBasis
          policyBasis = this@with.policyBasis
          policyText = this@with.policyText
          verification = this@with.verification
          decision = this@with.decision?.value?.getCode()
          _decision = this@with.decision?.toElement()
          provision = this@with.provision
        }
      }
  }
}
