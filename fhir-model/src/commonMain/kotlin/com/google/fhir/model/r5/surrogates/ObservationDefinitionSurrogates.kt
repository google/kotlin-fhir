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
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.Date
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.ObservationDefinition
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Reference
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
internal data class ObservationDefinitionQualifiedValueSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var context: CodeableConcept? = null,
  public var appliesTo: MutableList<CodeableConcept>? = null,
  public var gender: KotlinString? = null,
  public var _gender: Element? = null,
  public var age: Range? = null,
  public var gestationalAge: Range? = null,
  public var condition: KotlinString? = null,
  public var _condition: Element? = null,
  public var rangeCategory: KotlinString? = null,
  public var _rangeCategory: Element? = null,
  public var range: Range? = null,
  public var validCodedValueSet: KotlinString? = null,
  public var _validCodedValueSet: Element? = null,
  public var normalCodedValueSet: KotlinString? = null,
  public var _normalCodedValueSet: Element? = null,
  public var abnormalCodedValueSet: KotlinString? = null,
  public var _abnormalCodedValueSet: Element? = null,
  public var criticalCodedValueSet: KotlinString? = null,
  public var _criticalCodedValueSet: Element? = null,
) {
  public fun toModel(): ObservationDefinition.QualifiedValue =
    ObservationDefinition.QualifiedValue(
      id = this@ObservationDefinitionQualifiedValueSurrogate.id,
      extension = this@ObservationDefinitionQualifiedValueSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ObservationDefinitionQualifiedValueSurrogate.modifierExtension ?: mutableListOf(),
      context = this@ObservationDefinitionQualifiedValueSurrogate.context,
      appliesTo = this@ObservationDefinitionQualifiedValueSurrogate.appliesTo ?: mutableListOf(),
      gender =
        this@ObservationDefinitionQualifiedValueSurrogate.gender?.let {
          Enumeration.of(
            com.google.fhir.model.r5.AdministrativeGender.fromCode(it!!),
            this@ObservationDefinitionQualifiedValueSurrogate._gender,
          )
        },
      age = this@ObservationDefinitionQualifiedValueSurrogate.age,
      gestationalAge = this@ObservationDefinitionQualifiedValueSurrogate.gestationalAge,
      condition =
        R5String.of(
          this@ObservationDefinitionQualifiedValueSurrogate.condition,
          this@ObservationDefinitionQualifiedValueSurrogate._condition,
        ),
      rangeCategory =
        this@ObservationDefinitionQualifiedValueSurrogate.rangeCategory?.let {
          Enumeration.of(
            com.google.fhir.model.r5.ObservationDefinition.ObservationRangeCategory.fromCode(it!!),
            this@ObservationDefinitionQualifiedValueSurrogate._rangeCategory,
          )
        },
      range = this@ObservationDefinitionQualifiedValueSurrogate.range,
      validCodedValueSet =
        Canonical.of(
          this@ObservationDefinitionQualifiedValueSurrogate.validCodedValueSet,
          this@ObservationDefinitionQualifiedValueSurrogate._validCodedValueSet,
        ),
      normalCodedValueSet =
        Canonical.of(
          this@ObservationDefinitionQualifiedValueSurrogate.normalCodedValueSet,
          this@ObservationDefinitionQualifiedValueSurrogate._normalCodedValueSet,
        ),
      abnormalCodedValueSet =
        Canonical.of(
          this@ObservationDefinitionQualifiedValueSurrogate.abnormalCodedValueSet,
          this@ObservationDefinitionQualifiedValueSurrogate._abnormalCodedValueSet,
        ),
      criticalCodedValueSet =
        Canonical.of(
          this@ObservationDefinitionQualifiedValueSurrogate.criticalCodedValueSet,
          this@ObservationDefinitionQualifiedValueSurrogate._criticalCodedValueSet,
        ),
    )

  public companion object {
    public fun fromModel(
      model: ObservationDefinition.QualifiedValue
    ): ObservationDefinitionQualifiedValueSurrogate =
      with(model) {
        ObservationDefinitionQualifiedValueSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          context = this@with.context,
          appliesTo = this@with.appliesTo.takeUnless { it.all { it == null } },
          gender = this@with.gender?.value?.getCode(),
          _gender = this@with.gender?.toElement(),
          age = this@with.age,
          gestationalAge = this@with.gestationalAge,
          condition = this@with.condition?.value,
          _condition = this@with.condition?.toElement(),
          rangeCategory = this@with.rangeCategory?.value?.getCode(),
          _rangeCategory = this@with.rangeCategory?.toElement(),
          range = this@with.range,
          validCodedValueSet = this@with.validCodedValueSet?.value,
          _validCodedValueSet = this@with.validCodedValueSet?.toElement(),
          normalCodedValueSet = this@with.normalCodedValueSet?.value,
          _normalCodedValueSet = this@with.normalCodedValueSet?.toElement(),
          abnormalCodedValueSet = this@with.abnormalCodedValueSet?.value,
          _abnormalCodedValueSet = this@with.abnormalCodedValueSet?.toElement(),
          criticalCodedValueSet = this@with.criticalCodedValueSet?.value,
          _criticalCodedValueSet = this@with.criticalCodedValueSet?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ObservationDefinitionComponentSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: CodeableConcept,
  public var permittedDataType: MutableList<KotlinString?>? = null,
  public var _permittedDataType: MutableList<Element?>? = null,
  public var permittedUnit: MutableList<Coding>? = null,
  public var qualifiedValue: MutableList<ObservationDefinition.QualifiedValue>? = null,
) {
  public fun toModel(): ObservationDefinition.Component =
    ObservationDefinition.Component(
      id = this@ObservationDefinitionComponentSurrogate.id,
      extension = this@ObservationDefinitionComponentSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ObservationDefinitionComponentSurrogate.modifierExtension ?: mutableListOf(),
      code = this@ObservationDefinitionComponentSurrogate.code,
      permittedDataType =
        if (
          this@ObservationDefinitionComponentSurrogate.permittedDataType == null &&
            this@ObservationDefinitionComponentSurrogate._permittedDataType == null
        ) {
          mutableListOf()
        } else {
          (this@ObservationDefinitionComponentSurrogate.permittedDataType
              ?: List(this@ObservationDefinitionComponentSurrogate._permittedDataType!!.size) {
                null
              })
            .zip(
              this@ObservationDefinitionComponentSurrogate._permittedDataType
                ?: List(this@ObservationDefinitionComponentSurrogate.permittedDataType!!.size) {
                  null
                }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let {
                  com.google.fhir.model.r5.ObservationDefinition.ObservationDataType.fromCode(
                    it!!
                  )!!
                },
                element,
              )
            }
            .toMutableList()
        },
      permittedUnit = this@ObservationDefinitionComponentSurrogate.permittedUnit ?: mutableListOf(),
      qualifiedValue =
        this@ObservationDefinitionComponentSurrogate.qualifiedValue ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ObservationDefinition.Component
    ): ObservationDefinitionComponentSurrogate =
      with(model) {
        ObservationDefinitionComponentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code,
          permittedDataType =
            this@with.permittedDataType
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _permittedDataType =
            this@with.permittedDataType
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          permittedUnit = this@with.permittedUnit.takeUnless { it.all { it == null } },
          qualifiedValue = this@with.qualifiedValue.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ObservationDefinitionSurrogate(
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
  public var identifier: Identifier? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
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
  public var effectivePeriod: Period? = null,
  public var derivedFromCanonical: MutableList<KotlinString?>? = null,
  public var _derivedFromCanonical: MutableList<Element?>? = null,
  public var derivedFromUri: MutableList<KotlinString?>? = null,
  public var _derivedFromUri: MutableList<Element?>? = null,
  public var subject: MutableList<CodeableConcept>? = null,
  public var performerType: CodeableConcept? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var code: CodeableConcept,
  public var permittedDataType: MutableList<KotlinString?>? = null,
  public var _permittedDataType: MutableList<Element?>? = null,
  public var multipleResultsAllowed: KotlinBoolean? = null,
  public var _multipleResultsAllowed: Element? = null,
  public var bodySite: CodeableConcept? = null,
  public var method: CodeableConcept? = null,
  public var specimen: MutableList<Reference>? = null,
  public var device: MutableList<Reference>? = null,
  public var preferredReportName: KotlinString? = null,
  public var _preferredReportName: Element? = null,
  public var permittedUnit: MutableList<Coding>? = null,
  public var qualifiedValue: MutableList<ObservationDefinition.QualifiedValue>? = null,
  public var hasMember: MutableList<Reference>? = null,
  public var component: MutableList<ObservationDefinition.Component>? = null,
) {
  public fun toModel(): ObservationDefinition =
    ObservationDefinition(
      id = this@ObservationDefinitionSurrogate.id,
      meta = this@ObservationDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@ObservationDefinitionSurrogate.implicitRules,
          this@ObservationDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@ObservationDefinitionSurrogate.language,
          this@ObservationDefinitionSurrogate._language,
        ),
      text = this@ObservationDefinitionSurrogate.text,
      contained = this@ObservationDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@ObservationDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ObservationDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      url =
        Uri.of(this@ObservationDefinitionSurrogate.url, this@ObservationDefinitionSurrogate._url),
      identifier = this@ObservationDefinitionSurrogate.identifier,
      version =
        R5String.of(
          this@ObservationDefinitionSurrogate.version,
          this@ObservationDefinitionSurrogate._version,
        ),
      versionAlgorithm =
        ObservationDefinition.VersionAlgorithm?.from(
          R5String.of(
            this@ObservationDefinitionSurrogate.versionAlgorithmString,
            this@ObservationDefinitionSurrogate._versionAlgorithmString,
          ),
          this@ObservationDefinitionSurrogate.versionAlgorithmCoding,
        ),
      name =
        R5String.of(
          this@ObservationDefinitionSurrogate.name,
          this@ObservationDefinitionSurrogate._name,
        ),
      title =
        R5String.of(
          this@ObservationDefinitionSurrogate.title,
          this@ObservationDefinitionSurrogate._title,
        ),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.PublicationStatus.fromCode(
            this@ObservationDefinitionSurrogate.status!!
          ),
          this@ObservationDefinitionSurrogate._status,
        ),
      experimental =
        R5Boolean.of(
          this@ObservationDefinitionSurrogate.experimental,
          this@ObservationDefinitionSurrogate._experimental,
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ObservationDefinitionSurrogate.date),
          this@ObservationDefinitionSurrogate._date,
        ),
      publisher =
        R5String.of(
          this@ObservationDefinitionSurrogate.publisher,
          this@ObservationDefinitionSurrogate._publisher,
        ),
      contact = this@ObservationDefinitionSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@ObservationDefinitionSurrogate.description,
          this@ObservationDefinitionSurrogate._description,
        ),
      useContext = this@ObservationDefinitionSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@ObservationDefinitionSurrogate.jurisdiction ?: mutableListOf(),
      purpose =
        Markdown.of(
          this@ObservationDefinitionSurrogate.purpose,
          this@ObservationDefinitionSurrogate._purpose,
        ),
      copyright =
        Markdown.of(
          this@ObservationDefinitionSurrogate.copyright,
          this@ObservationDefinitionSurrogate._copyright,
        ),
      copyrightLabel =
        R5String.of(
          this@ObservationDefinitionSurrogate.copyrightLabel,
          this@ObservationDefinitionSurrogate._copyrightLabel,
        ),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@ObservationDefinitionSurrogate.approvalDate),
          this@ObservationDefinitionSurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@ObservationDefinitionSurrogate.lastReviewDate),
          this@ObservationDefinitionSurrogate._lastReviewDate,
        ),
      effectivePeriod = this@ObservationDefinitionSurrogate.effectivePeriod,
      derivedFromCanonical =
        if (
          this@ObservationDefinitionSurrogate.derivedFromCanonical == null &&
            this@ObservationDefinitionSurrogate._derivedFromCanonical == null
        ) {
          mutableListOf()
        } else {
          (this@ObservationDefinitionSurrogate.derivedFromCanonical
              ?: List(this@ObservationDefinitionSurrogate._derivedFromCanonical!!.size) { null })
            .zip(
              this@ObservationDefinitionSurrogate._derivedFromCanonical
                ?: List(this@ObservationDefinitionSurrogate.derivedFromCanonical!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      derivedFromUri =
        if (
          this@ObservationDefinitionSurrogate.derivedFromUri == null &&
            this@ObservationDefinitionSurrogate._derivedFromUri == null
        ) {
          mutableListOf()
        } else {
          (this@ObservationDefinitionSurrogate.derivedFromUri
              ?: List(this@ObservationDefinitionSurrogate._derivedFromUri!!.size) { null })
            .zip(
              this@ObservationDefinitionSurrogate._derivedFromUri
                ?: List(this@ObservationDefinitionSurrogate.derivedFromUri!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      subject = this@ObservationDefinitionSurrogate.subject ?: mutableListOf(),
      performerType = this@ObservationDefinitionSurrogate.performerType,
      category = this@ObservationDefinitionSurrogate.category ?: mutableListOf(),
      code = this@ObservationDefinitionSurrogate.code,
      permittedDataType =
        if (
          this@ObservationDefinitionSurrogate.permittedDataType == null &&
            this@ObservationDefinitionSurrogate._permittedDataType == null
        ) {
          mutableListOf()
        } else {
          (this@ObservationDefinitionSurrogate.permittedDataType
              ?: List(this@ObservationDefinitionSurrogate._permittedDataType!!.size) { null })
            .zip(
              this@ObservationDefinitionSurrogate._permittedDataType
                ?: List(this@ObservationDefinitionSurrogate.permittedDataType!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let {
                  com.google.fhir.model.r5.ObservationDefinition.ObservationDataType.fromCode(
                    it!!
                  )!!
                },
                element,
              )
            }
            .toMutableList()
        },
      multipleResultsAllowed =
        R5Boolean.of(
          this@ObservationDefinitionSurrogate.multipleResultsAllowed,
          this@ObservationDefinitionSurrogate._multipleResultsAllowed,
        ),
      bodySite = this@ObservationDefinitionSurrogate.bodySite,
      method = this@ObservationDefinitionSurrogate.method,
      specimen = this@ObservationDefinitionSurrogate.specimen ?: mutableListOf(),
      device = this@ObservationDefinitionSurrogate.device ?: mutableListOf(),
      preferredReportName =
        R5String.of(
          this@ObservationDefinitionSurrogate.preferredReportName,
          this@ObservationDefinitionSurrogate._preferredReportName,
        ),
      permittedUnit = this@ObservationDefinitionSurrogate.permittedUnit ?: mutableListOf(),
      qualifiedValue = this@ObservationDefinitionSurrogate.qualifiedValue ?: mutableListOf(),
      hasMember = this@ObservationDefinitionSurrogate.hasMember ?: mutableListOf(),
      component = this@ObservationDefinitionSurrogate.component ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ObservationDefinition): ObservationDefinitionSurrogate =
      with(model) {
        ObservationDefinitionSurrogate(
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
          identifier = this@with.identifier,
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.value,
          _versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.toElement(),
          versionAlgorithmCoding = this@with.versionAlgorithm?.asCoding()?.value,
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
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
          effectivePeriod = this@with.effectivePeriod,
          derivedFromCanonical =
            this@with.derivedFromCanonical
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _derivedFromCanonical =
            this@with.derivedFromCanonical
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
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
          subject = this@with.subject.takeUnless { it.all { it == null } },
          performerType = this@with.performerType,
          category = this@with.category.takeUnless { it.all { it == null } },
          code = this@with.code,
          permittedDataType =
            this@with.permittedDataType
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _permittedDataType =
            this@with.permittedDataType
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          multipleResultsAllowed = this@with.multipleResultsAllowed?.value,
          _multipleResultsAllowed = this@with.multipleResultsAllowed?.toElement(),
          bodySite = this@with.bodySite,
          method = this@with.method,
          specimen = this@with.specimen.takeUnless { it.all { it == null } },
          device = this@with.device.takeUnless { it.all { it == null } },
          preferredReportName = this@with.preferredReportName?.value,
          _preferredReportName = this@with.preferredReportName?.toElement(),
          permittedUnit = this@with.permittedUnit.takeUnless { it.all { it == null } },
          qualifiedValue = this@with.qualifiedValue.takeUnless { it.all { it == null } },
          hasMember = this@with.hasMember.takeUnless { it.all { it == null } },
          component = this@with.component.takeUnless { it.all { it == null } },
        )
      }
  }
}
