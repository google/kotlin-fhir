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

import com.google.fhir.model.r4b.Attachment
import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Coding
import com.google.fhir.model.r4b.Consent
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ConsentPolicySurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var authority: String? = null,
  public var _authority: Element? = null,
  public var uri: String? = null,
  public var _uri: Element? = null,
) {
  public fun toModel(): Consent.Policy =
    Consent.Policy(
      id = this@ConsentPolicySurrogate.id,
      extension = this@ConsentPolicySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConsentPolicySurrogate.modifierExtension ?: mutableListOf(),
      authority =
        Uri.of(this@ConsentPolicySurrogate.authority, this@ConsentPolicySurrogate._authority),
      uri = Uri.of(this@ConsentPolicySurrogate.uri, this@ConsentPolicySurrogate._uri),
    )

  public companion object {
    public fun fromModel(model: Consent.Policy): ConsentPolicySurrogate =
      with(model) {
        ConsentPolicySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          authority = this@with.authority?.value,
          _authority = this@with.authority?.toElement(),
          uri = this@with.uri?.value,
          _uri = this@with.uri?.toElement(),
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
  public var verifiedWith: Reference? = null,
  public var verificationDate: String? = null,
  public var _verificationDate: Element? = null,
) {
  public fun toModel(): Consent.Verification =
    Consent.Verification(
      id = this@ConsentVerificationSurrogate.id,
      extension = this@ConsentVerificationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConsentVerificationSurrogate.modifierExtension ?: mutableListOf(),
      verified =
        R4bBoolean.of(
          this@ConsentVerificationSurrogate.verified,
          this@ConsentVerificationSurrogate._verified,
        )!!,
      verifiedWith = this@ConsentVerificationSurrogate.verifiedWith,
      verificationDate =
        DateTime.of(
          FhirDateTime.fromString(this@ConsentVerificationSurrogate.verificationDate),
          this@ConsentVerificationSurrogate._verificationDate,
        ),
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
          verifiedWith = this@with.verifiedWith,
          verificationDate = this@with.verificationDate?.value?.toString(),
          _verificationDate = this@with.verificationDate?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ConsentProvisionActorSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var role: CodeableConcept,
  public var reference: Reference,
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
          com.google.fhir.model.r4b.Consent.ConsentDataMeaning.fromCode(
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
  public var type: String? = null,
  public var _type: Element? = null,
  public var period: Period? = null,
  public var actor: MutableList<Consent.Provision.Actor>? = null,
  public var action: MutableList<CodeableConcept>? = null,
  public var securityLabel: MutableList<Coding>? = null,
  public var purpose: MutableList<Coding>? = null,
  public var `class`: MutableList<Coding>? = null,
  public var code: MutableList<CodeableConcept>? = null,
  public var dataPeriod: Period? = null,
  public var `data`: MutableList<Consent.Provision.Data>? = null,
  public var provision: MutableList<Consent.Provision>? = null,
) {
  public fun toModel(): Consent.Provision =
    Consent.Provision(
      id = this@ConsentProvisionSurrogate.id,
      extension = this@ConsentProvisionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConsentProvisionSurrogate.modifierExtension ?: mutableListOf(),
      type =
        this@ConsentProvisionSurrogate.type?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.Consent.ConsentProvisionType.fromCode(it!!),
            this@ConsentProvisionSurrogate._type,
          )
        },
      period = this@ConsentProvisionSurrogate.period,
      actor = this@ConsentProvisionSurrogate.actor ?: mutableListOf(),
      action = this@ConsentProvisionSurrogate.action ?: mutableListOf(),
      securityLabel = this@ConsentProvisionSurrogate.securityLabel ?: mutableListOf(),
      purpose = this@ConsentProvisionSurrogate.purpose ?: mutableListOf(),
      `class` = this@ConsentProvisionSurrogate.`class` ?: mutableListOf(),
      code = this@ConsentProvisionSurrogate.code ?: mutableListOf(),
      dataPeriod = this@ConsentProvisionSurrogate.dataPeriod,
      `data` = this@ConsentProvisionSurrogate.`data` ?: mutableListOf(),
      provision = this@ConsentProvisionSurrogate.provision ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Consent.Provision): ConsentProvisionSurrogate =
      with(model) {
        ConsentProvisionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type?.value?.getCode(),
          _type = this@with.type?.toElement(),
          period = this@with.period,
          actor = this@with.actor.takeUnless { it.all { it == null } },
          action = this@with.action.takeUnless { it.all { it == null } },
          securityLabel = this@with.securityLabel.takeUnless { it.all { it == null } },
          purpose = this@with.purpose.takeUnless { it.all { it == null } },
          `class` = this@with.`class`.takeUnless { it.all { it == null } },
          code = this@with.code.takeUnless { it.all { it == null } },
          dataPeriod = this@with.dataPeriod,
          `data` = this@with.`data`.takeUnless { it.all { it == null } },
          provision = this@with.provision.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ConsentSourceSurrogate(
  public var sourceAttachment: Attachment? = null,
  public var sourceReference: Reference? = null,
) {
  public fun toModel(): Consent.Source? =
    Consent.Source?.from(
      this@ConsentSourceSurrogate.sourceAttachment,
      this@ConsentSourceSurrogate.sourceReference,
    )

  public companion object {
    public fun fromModel(model: Consent.Source): ConsentSourceSurrogate =
      with(model) {
        ConsentSourceSurrogate().apply {
          Consent.Source?.from(
            this@ConsentSourceSurrogate.sourceAttachment,
            this@ConsentSourceSurrogate.sourceReference,
          )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var scope: CodeableConcept,
  public var category: MutableList<CodeableConcept>? = null,
  public var patient: Reference? = null,
  public var dateTime: String? = null,
  public var _dateTime: Element? = null,
  public var performer: MutableList<Reference>? = null,
  public var organization: MutableList<Reference>? = null,
  public var policy: MutableList<Consent.Policy>? = null,
  public var policyRule: CodeableConcept? = null,
  public var verification: MutableList<Consent.Verification>? = null,
  public var provision: Consent.Provision? = null,
  public var source: Consent.Source? = null,
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
          com.google.fhir.model.r4b.Consent.ConsentState.fromCode(this@ConsentSurrogate.status!!),
          this@ConsentSurrogate._status,
        ),
      scope = this@ConsentSurrogate.scope,
      category = this@ConsentSurrogate.category ?: mutableListOf(),
      patient = this@ConsentSurrogate.patient,
      dateTime =
        DateTime.of(
          FhirDateTime.fromString(this@ConsentSurrogate.dateTime),
          this@ConsentSurrogate._dateTime,
        ),
      performer = this@ConsentSurrogate.performer ?: mutableListOf(),
      organization = this@ConsentSurrogate.organization ?: mutableListOf(),
      source = this@ConsentSurrogate.source,
      policy = this@ConsentSurrogate.policy ?: mutableListOf(),
      policyRule = this@ConsentSurrogate.policyRule,
      verification = this@ConsentSurrogate.verification ?: mutableListOf(),
      provision = this@ConsentSurrogate.provision,
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
          scope = this@with.scope,
          category = this@with.category.takeUnless { it.all { it == null } },
          patient = this@with.patient,
          dateTime = this@with.dateTime?.value?.toString(),
          _dateTime = this@with.dateTime?.toElement(),
          performer = this@with.performer.takeUnless { it.all { it == null } },
          organization = this@with.organization.takeUnless { it.all { it == null } },
          source = this@with.source,
          policy = this@with.policy.takeUnless { it.all { it == null } },
          policyRule = this@with.policyRule,
          verification = this@with.verification.takeUnless { it.all { it == null } },
          provision = this@with.provision,
        )
      }
  }
}
