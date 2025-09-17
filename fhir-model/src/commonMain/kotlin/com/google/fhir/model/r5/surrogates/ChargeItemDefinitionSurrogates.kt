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

import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.ChargeItemDefinition
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Expression
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.MonetaryComponent
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ChargeItemDefinitionApplicabilitySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var condition: Expression? = null,
  public var effectivePeriod: Period? = null,
  public var relatedArtifact: RelatedArtifact? = null,
) {
  public fun toModel(): ChargeItemDefinition.Applicability =
    ChargeItemDefinition.Applicability(
      id = this@ChargeItemDefinitionApplicabilitySurrogate.id,
      extension = this@ChargeItemDefinitionApplicabilitySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ChargeItemDefinitionApplicabilitySurrogate.modifierExtension ?: mutableListOf(),
      condition = this@ChargeItemDefinitionApplicabilitySurrogate.condition,
      effectivePeriod = this@ChargeItemDefinitionApplicabilitySurrogate.effectivePeriod,
      relatedArtifact = this@ChargeItemDefinitionApplicabilitySurrogate.relatedArtifact,
    )

  public companion object {
    public fun fromModel(
      model: ChargeItemDefinition.Applicability
    ): ChargeItemDefinitionApplicabilitySurrogate =
      with(model) {
        ChargeItemDefinitionApplicabilitySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          condition = this@with.condition,
          effectivePeriod = this@with.effectivePeriod,
          relatedArtifact = this@with.relatedArtifact,
        )
      }
  }
}

@Serializable
internal data class ChargeItemDefinitionPropertyGroupSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var applicability: MutableList<ChargeItemDefinition.Applicability>? = null,
  public var priceComponent: MutableList<MonetaryComponent>? = null,
) {
  public fun toModel(): ChargeItemDefinition.PropertyGroup =
    ChargeItemDefinition.PropertyGroup(
      id = this@ChargeItemDefinitionPropertyGroupSurrogate.id,
      extension = this@ChargeItemDefinitionPropertyGroupSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ChargeItemDefinitionPropertyGroupSurrogate.modifierExtension ?: mutableListOf(),
      applicability =
        this@ChargeItemDefinitionPropertyGroupSurrogate.applicability ?: mutableListOf(),
      priceComponent =
        this@ChargeItemDefinitionPropertyGroupSurrogate.priceComponent ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ChargeItemDefinition.PropertyGroup
    ): ChargeItemDefinitionPropertyGroupSurrogate =
      with(model) {
        ChargeItemDefinitionPropertyGroupSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          applicability = this@with.applicability.takeUnless { it.all { it == null } },
          priceComponent = this@with.priceComponent.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ChargeItemDefinitionVersionAlgorithmSurrogate(
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
) {
  public fun toModel(): ChargeItemDefinition.VersionAlgorithm =
    ChargeItemDefinition.VersionAlgorithm.from(
      R5String.of(
        this@ChargeItemDefinitionVersionAlgorithmSurrogate.versionAlgorithmString,
        this@ChargeItemDefinitionVersionAlgorithmSurrogate._versionAlgorithmString,
      ),
      this@ChargeItemDefinitionVersionAlgorithmSurrogate.versionAlgorithmCoding,
    )!!

  public companion object {
    public fun fromModel(
      model: ChargeItemDefinition.VersionAlgorithm
    ): ChargeItemDefinitionVersionAlgorithmSurrogate =
      with(model) {
        ChargeItemDefinitionVersionAlgorithmSurrogate(
          versionAlgorithmString = this@with.asString()?.value?.value,
          _versionAlgorithmString = this@with.asString()?.value?.toElement(),
          versionAlgorithmCoding = this@with.asCoding()?.value,
        )
      }
  }
}

@Serializable
internal data class ChargeItemDefinitionSurrogate(
  public var id: KotlinString? = null,
  public var meta: Meta? = null,
  public var implicitRules: KotlinString? = null,
  public var _implicitRules: Element? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var versionAlgorithm: ChargeItemDefinition.VersionAlgorithm? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var derivedFromUri: MutableList<KotlinString?>? = null,
  public var _derivedFromUri: MutableList<Element?>? = null,
  public var partOf: MutableList<KotlinString?>? = null,
  public var _partOf: MutableList<Element?>? = null,
  public var replaces: MutableList<KotlinString?>? = null,
  public var _replaces: MutableList<Element?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: MutableList<ContactDetail>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: MutableList<UsageContext>? = null,
  public var jurisdiction: MutableList<CodeableConcept>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var copyrightLabel: KotlinString? = null,
  public var _copyrightLabel: Element? = null,
  public var approvalDate: KotlinString? = null,
  public var _approvalDate: Element? = null,
  public var lastReviewDate: KotlinString? = null,
  public var _lastReviewDate: Element? = null,
  public var code: CodeableConcept? = null,
  public var instance: MutableList<Reference>? = null,
  public var applicability: MutableList<ChargeItemDefinition.Applicability>? = null,
  public var propertyGroup: MutableList<ChargeItemDefinition.PropertyGroup>? = null,
) {
  public fun toModel(): ChargeItemDefinition =
    ChargeItemDefinition(
      id = this@ChargeItemDefinitionSurrogate.id,
      meta = this@ChargeItemDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@ChargeItemDefinitionSurrogate.implicitRules,
          this@ChargeItemDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@ChargeItemDefinitionSurrogate.language,
          this@ChargeItemDefinitionSurrogate._language,
        ),
      text = this@ChargeItemDefinitionSurrogate.text,
      contained = this@ChargeItemDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@ChargeItemDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ChargeItemDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@ChargeItemDefinitionSurrogate.url, this@ChargeItemDefinitionSurrogate._url),
      identifier = this@ChargeItemDefinitionSurrogate.identifier ?: mutableListOf(),
      version =
        R5String.of(
          this@ChargeItemDefinitionSurrogate.version,
          this@ChargeItemDefinitionSurrogate._version,
        ),
      versionAlgorithm = this@ChargeItemDefinitionSurrogate.versionAlgorithm,
      name =
        R5String.of(
          this@ChargeItemDefinitionSurrogate.name,
          this@ChargeItemDefinitionSurrogate._name,
        ),
      title =
        R5String.of(
          this@ChargeItemDefinitionSurrogate.title,
          this@ChargeItemDefinitionSurrogate._title,
        ),
      derivedFromUri =
        if (
          this@ChargeItemDefinitionSurrogate.derivedFromUri == null &&
            this@ChargeItemDefinitionSurrogate._derivedFromUri == null
        ) {
          mutableListOf()
        } else {
          (this@ChargeItemDefinitionSurrogate.derivedFromUri
              ?: List(this@ChargeItemDefinitionSurrogate._derivedFromUri!!.size) { null })
            .zip(
              this@ChargeItemDefinitionSurrogate._derivedFromUri
                ?: List(this@ChargeItemDefinitionSurrogate.derivedFromUri!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      partOf =
        if (
          this@ChargeItemDefinitionSurrogate.partOf == null &&
            this@ChargeItemDefinitionSurrogate._partOf == null
        ) {
          mutableListOf()
        } else {
          (this@ChargeItemDefinitionSurrogate.partOf
              ?: List(this@ChargeItemDefinitionSurrogate._partOf!!.size) { null })
            .zip(
              this@ChargeItemDefinitionSurrogate._partOf
                ?: List(this@ChargeItemDefinitionSurrogate.partOf!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      replaces =
        if (
          this@ChargeItemDefinitionSurrogate.replaces == null &&
            this@ChargeItemDefinitionSurrogate._replaces == null
        ) {
          mutableListOf()
        } else {
          (this@ChargeItemDefinitionSurrogate.replaces
              ?: List(this@ChargeItemDefinitionSurrogate._replaces!!.size) { null })
            .zip(
              this@ChargeItemDefinitionSurrogate._replaces
                ?: List(this@ChargeItemDefinitionSurrogate.replaces!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      status =
        Enumeration.of(
          com.google.fhir.model.r5.terminologies.PublicationStatus.fromCode(
            this@ChargeItemDefinitionSurrogate.status!!
          ),
          this@ChargeItemDefinitionSurrogate._status,
        ),
      experimental =
        R5Boolean.of(
          this@ChargeItemDefinitionSurrogate.experimental,
          this@ChargeItemDefinitionSurrogate._experimental,
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ChargeItemDefinitionSurrogate.date),
          this@ChargeItemDefinitionSurrogate._date,
        ),
      publisher =
        R5String.of(
          this@ChargeItemDefinitionSurrogate.publisher,
          this@ChargeItemDefinitionSurrogate._publisher,
        ),
      contact = this@ChargeItemDefinitionSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@ChargeItemDefinitionSurrogate.description,
          this@ChargeItemDefinitionSurrogate._description,
        ),
      useContext = this@ChargeItemDefinitionSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@ChargeItemDefinitionSurrogate.jurisdiction ?: mutableListOf(),
      purpose =
        Markdown.of(
          this@ChargeItemDefinitionSurrogate.purpose,
          this@ChargeItemDefinitionSurrogate._purpose,
        ),
      copyright =
        Markdown.of(
          this@ChargeItemDefinitionSurrogate.copyright,
          this@ChargeItemDefinitionSurrogate._copyright,
        ),
      copyrightLabel =
        R5String.of(
          this@ChargeItemDefinitionSurrogate.copyrightLabel,
          this@ChargeItemDefinitionSurrogate._copyrightLabel,
        ),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@ChargeItemDefinitionSurrogate.approvalDate),
          this@ChargeItemDefinitionSurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@ChargeItemDefinitionSurrogate.lastReviewDate),
          this@ChargeItemDefinitionSurrogate._lastReviewDate,
        ),
      code = this@ChargeItemDefinitionSurrogate.code,
      instance = this@ChargeItemDefinitionSurrogate.instance ?: mutableListOf(),
      applicability = this@ChargeItemDefinitionSurrogate.applicability ?: mutableListOf(),
      propertyGroup = this@ChargeItemDefinitionSurrogate.propertyGroup ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ChargeItemDefinition): ChargeItemDefinitionSurrogate =
      with(model) {
        ChargeItemDefinitionSurrogate(
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
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          versionAlgorithm = this@with.versionAlgorithm,
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          derivedFromUri =
            this@with.derivedFromUri
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _derivedFromUri =
            this@with.derivedFromUri
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          partOf =
            this@with.partOf.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _partOf =
            this@with.partOf
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          replaces =
            this@with.replaces
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _replaces =
            this@with.replaces
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          publisher = this@with.publisher?.value,
          _publisher = this@with.publisher?.toElement(),
          contact = this@with.contact.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          useContext = this@with.useContext.takeUnless { it.all { it == null } },
          jurisdiction = this@with.jurisdiction.takeUnless { it.all { it == null } },
          purpose = this@with.purpose?.value,
          _purpose = this@with.purpose?.toElement(),
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
          copyrightLabel = this@with.copyrightLabel?.value,
          _copyrightLabel = this@with.copyrightLabel?.toElement(),
          approvalDate = this@with.approvalDate?.value?.toString(),
          _approvalDate = this@with.approvalDate?.toElement(),
          lastReviewDate = this@with.lastReviewDate?.value?.toString(),
          _lastReviewDate = this@with.lastReviewDate?.toElement(),
          code = this@with.code,
          instance = this@with.instance.takeUnless { it.all { it == null } },
          applicability = this@with.applicability.takeUnless { it.all { it == null } },
          propertyGroup = this@with.propertyGroup.takeUnless { it.all { it == null } },
        )
      }
  }
}
