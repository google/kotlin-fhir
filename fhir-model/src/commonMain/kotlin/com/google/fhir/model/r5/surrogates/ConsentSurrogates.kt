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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ConsentPolicyBasisSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var reference: Reference? = null,
  public var url: String? = null,
  public var _url: Element? = null,
) {
  public fun toModel(): Consent.PolicyBasis =
    Consent.PolicyBasis(
      id = this@ConsentPolicyBasisSurrogate.id,
      extension = this@ConsentPolicyBasisSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConsentPolicyBasisSurrogate.modifierExtension ?: mutableListOf(),
      reference = this@ConsentPolicyBasisSurrogate.reference,
      url = Url.of(this@ConsentPolicyBasisSurrogate.url, this@ConsentPolicyBasisSurrogate._url),
    )

  public companion object {
    public fun fromModel(model: Consent.PolicyBasis): ConsentPolicyBasisSurrogate =
      with(model) {
        ConsentPolicyBasisSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          reference = this@with.reference,
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ConsentVerificationSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var verified: KotlinBoolean? = null,
  public var _verified: Element? = null,
  public var verificationType: CodeableConcept? = null,
  public var verifiedBy: Reference? = null,
  public var verifiedWith: Reference? = null,
  public var verificationDate: MutableList<String?>? = null,
  public var _verificationDate: MutableList<Element?>? = null,
) {
  public fun toModel(): Consent.Verification =
    Consent.Verification(
      id = this@ConsentVerificationSurrogate.id,
      extension = this@ConsentVerificationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConsentVerificationSurrogate.modifierExtension ?: mutableListOf(),
      verified =
        R5Boolean.of(
          this@ConsentVerificationSurrogate.verified,
          this@ConsentVerificationSurrogate._verified,
        )!!,
      verificationType = this@ConsentVerificationSurrogate.verificationType,
      verifiedBy = this@ConsentVerificationSurrogate.verifiedBy,
      verifiedWith = this@ConsentVerificationSurrogate.verifiedWith,
      verificationDate =
        if (
          this@ConsentVerificationSurrogate.verificationDate == null &&
            this@ConsentVerificationSurrogate._verificationDate == null
        ) {
          mutableListOf()
        } else {
          (this@ConsentVerificationSurrogate.verificationDate
              ?: List(this@ConsentVerificationSurrogate._verificationDate!!.size) { null })
            .zip(
              this@ConsentVerificationSurrogate._verificationDate
                ?: List(this@ConsentVerificationSurrogate.verificationDate!!.size) { null }
            )
            .map { (value, element) -> DateTime.of(FhirDateTime.fromString(value), element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(model: Consent.Verification): ConsentVerificationSurrogate =
      with(model) {
        ConsentVerificationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          verified = this@with.verified.value,
          _verified = this@with.verified.toElement(),
          verificationType = this@with.verificationType,
          verifiedBy = this@with.verifiedBy,
          verifiedWith = this@with.verifiedWith,
          verificationDate =
            this@with.verificationDate
              .map { it.value?.toString() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _verificationDate =
            this@with.verificationDate
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class ConsentProvisionActorSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var role: CodeableConcept? = null,
  public var reference: Reference? = null,
) {
  public fun toModel(): Consent.Provision.Actor =
    Consent.Provision.Actor(
      id = this@ConsentProvisionActorSurrogate.id,
      extension = this@ConsentProvisionActorSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConsentProvisionActorSurrogate.modifierExtension ?: mutableListOf(),
      role = this@ConsentProvisionActorSurrogate.role,
      reference = this@ConsentProvisionActorSurrogate.reference,
    )

  public companion object {
    public fun fromModel(model: Consent.Provision.Actor): ConsentProvisionActorSurrogate =
      with(model) {
        ConsentProvisionActorSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          role = this@with.role,
          reference = this@with.reference,
        )
      }
  }
}

@Serializable
internal data class ConsentProvisionDataSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var meaning: String? = null,
  public var _meaning: Element? = null,
  public var reference: Reference,
) {
  public fun toModel(): Consent.Provision.Data =
    Consent.Provision.Data(
      id = this@ConsentProvisionDataSurrogate.id,
      extension = this@ConsentProvisionDataSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConsentProvisionDataSurrogate.modifierExtension ?: mutableListOf(),
      meaning =
        Enumeration.of(
          com.google.fhir.model.r5.Consent.ConsentDataMeaning.fromCode(
            this@ConsentProvisionDataSurrogate.meaning!!
          ),
          this@ConsentProvisionDataSurrogate._meaning,
        ),
      reference = this@ConsentProvisionDataSurrogate.reference,
    )

  public companion object {
    public fun fromModel(model: Consent.Provision.Data): ConsentProvisionDataSurrogate =
      with(model) {
        ConsentProvisionDataSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          meaning = this@with.meaning.value?.getCode(),
          _meaning = this@with.meaning.toElement(),
          reference = this@with.reference,
        )
      }
  }
}

@Serializable
internal data class ConsentProvisionSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var period: Period? = null,
  public var actor: MutableList<Consent.Provision.Actor>? = null,
  public var action: MutableList<CodeableConcept>? = null,
  public var securityLabel: MutableList<Coding>? = null,
  public var purpose: MutableList<Coding>? = null,
  public var documentType: MutableList<Coding>? = null,
  public var resourceType: MutableList<Coding>? = null,
  public var code: MutableList<CodeableConcept>? = null,
  public var dataPeriod: Period? = null,
  public var `data`: MutableList<Consent.Provision.Data>? = null,
  public var expression: Expression? = null,
  public var provision: MutableList<Consent.Provision>? = null,
) {
  public fun toModel(): Consent.Provision =
    Consent.Provision(
      id = this@ConsentProvisionSurrogate.id,
      extension = this@ConsentProvisionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConsentProvisionSurrogate.modifierExtension ?: mutableListOf(),
      period = this@ConsentProvisionSurrogate.period,
      actor = this@ConsentProvisionSurrogate.actor ?: mutableListOf(),
      action = this@ConsentProvisionSurrogate.action ?: mutableListOf(),
      securityLabel = this@ConsentProvisionSurrogate.securityLabel ?: mutableListOf(),
      purpose = this@ConsentProvisionSurrogate.purpose ?: mutableListOf(),
      documentType = this@ConsentProvisionSurrogate.documentType ?: mutableListOf(),
      resourceType = this@ConsentProvisionSurrogate.resourceType ?: mutableListOf(),
      code = this@ConsentProvisionSurrogate.code ?: mutableListOf(),
      dataPeriod = this@ConsentProvisionSurrogate.dataPeriod,
      `data` = this@ConsentProvisionSurrogate.`data` ?: mutableListOf(),
      expression = this@ConsentProvisionSurrogate.expression,
      provision = this@ConsentProvisionSurrogate.provision ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Consent.Provision): ConsentProvisionSurrogate =
      with(model) {
        ConsentProvisionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          period = this@with.period,
          actor = this@with.actor.takeUnless { it.all { it == null } },
          action = this@with.action.takeUnless { it.all { it == null } },
          securityLabel = this@with.securityLabel.takeUnless { it.all { it == null } },
          purpose = this@with.purpose.takeUnless { it.all { it == null } },
          documentType = this@with.documentType.takeUnless { it.all { it == null } },
          resourceType = this@with.resourceType.takeUnless { it.all { it == null } },
          code = this@with.code.takeUnless { it.all { it == null } },
          dataPeriod = this@with.dataPeriod,
          `data` = this@with.`data`.takeUnless { it.all { it == null } },
          expression = this@with.expression,
          provision = this@with.provision.takeUnless { it.all { it == null } },
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var subject: Reference? = null,
  public var date: String? = null,
  public var _date: Element? = null,
  public var period: Period? = null,
  public var grantor: MutableList<Reference>? = null,
  public var grantee: MutableList<Reference>? = null,
  public var manager: MutableList<Reference>? = null,
  public var controller: MutableList<Reference>? = null,
  public var sourceAttachment: MutableList<Attachment>? = null,
  public var sourceReference: MutableList<Reference>? = null,
  public var regulatoryBasis: MutableList<CodeableConcept>? = null,
  public var policyBasis: Consent.PolicyBasis? = null,
  public var policyText: MutableList<Reference>? = null,
  public var verification: MutableList<Consent.Verification>? = null,
  public var decision: String? = null,
  public var _decision: Element? = null,
  public var provision: MutableList<Consent.Provision>? = null,
) {
  public fun toModel(): Consent =
    Consent(
      id = this@ConsentSurrogate.id,
      meta = this@ConsentSurrogate.meta,
      implicitRules =
        Uri.of(this@ConsentSurrogate.implicitRules, this@ConsentSurrogate._implicitRules),
      language = Code.of(this@ConsentSurrogate.language, this@ConsentSurrogate._language),
      text = this@ConsentSurrogate.text,
      contained = this@ConsentSurrogate.contained ?: mutableListOf(),
      extension = this@ConsentSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConsentSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ConsentSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.Consent.ConsentState.fromCode(this@ConsentSurrogate.status!!),
          this@ConsentSurrogate._status,
        ),
      category = this@ConsentSurrogate.category ?: mutableListOf(),
      subject = this@ConsentSurrogate.subject,
      date = Date.of(FhirDate.fromString(this@ConsentSurrogate.date), this@ConsentSurrogate._date),
      period = this@ConsentSurrogate.period,
      grantor = this@ConsentSurrogate.grantor ?: mutableListOf(),
      grantee = this@ConsentSurrogate.grantee ?: mutableListOf(),
      manager = this@ConsentSurrogate.manager ?: mutableListOf(),
      controller = this@ConsentSurrogate.controller ?: mutableListOf(),
      sourceAttachment = this@ConsentSurrogate.sourceAttachment ?: mutableListOf(),
      sourceReference = this@ConsentSurrogate.sourceReference ?: mutableListOf(),
      regulatoryBasis = this@ConsentSurrogate.regulatoryBasis ?: mutableListOf(),
      policyBasis = this@ConsentSurrogate.policyBasis,
      policyText = this@ConsentSurrogate.policyText ?: mutableListOf(),
      verification = this@ConsentSurrogate.verification ?: mutableListOf(),
      decision =
        this@ConsentSurrogate.decision?.let {
          Enumeration.of(
            com.google.fhir.model.r5.Consent.ConsentProvisionType.fromCode(it!!),
            this@ConsentSurrogate._decision,
          )
        },
      provision = this@ConsentSurrogate.provision ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Consent): ConsentSurrogate =
      with(model) {
        ConsentSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeUnless { it.all { it == null } },
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          subject = this@with.subject,
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          period = this@with.period,
          grantor = this@with.grantor.takeUnless { it.all { it == null } },
          grantee = this@with.grantee.takeUnless { it.all { it == null } },
          manager = this@with.manager.takeUnless { it.all { it == null } },
          controller = this@with.controller.takeUnless { it.all { it == null } },
          sourceAttachment = this@with.sourceAttachment.takeUnless { it.all { it == null } },
          sourceReference = this@with.sourceReference.takeUnless { it.all { it == null } },
          regulatoryBasis = this@with.regulatoryBasis.takeUnless { it.all { it == null } },
          policyBasis = this@with.policyBasis,
          policyText = this@with.policyText.takeUnless { it.all { it == null } },
          verification = this@with.verification.takeUnless { it.all { it == null } },
          decision = this@with.decision?.value?.getCode(),
          _decision = this@with.decision?.toElement(),
          provision = this@with.provision.takeUnless { it.all { it == null } },
        )
      }
  }
}
