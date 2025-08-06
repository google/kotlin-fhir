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
import com.google.fhir.model.r5.Duration
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDate
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.SpecimenDefinition
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
internal data class SpecimenDefinitionTypeTestedContainerAdditiveAdditiveSurrogate(
  public var additiveCodeableConcept: CodeableConcept? = null,
  public var additiveReference: Reference? = null,
) {
  public fun toModel(): SpecimenDefinition.TypeTested.Container.Additive.Additive =
    SpecimenDefinition.TypeTested.Container.Additive.Additive.from(
      this@SpecimenDefinitionTypeTestedContainerAdditiveAdditiveSurrogate.additiveCodeableConcept,
      this@SpecimenDefinitionTypeTestedContainerAdditiveAdditiveSurrogate.additiveReference,
    )!! !!

  public companion object {
    public fun fromModel(
      model: SpecimenDefinition.TypeTested.Container.Additive.Additive
    ): SpecimenDefinitionTypeTestedContainerAdditiveAdditiveSurrogate =
      with(model) {
        SpecimenDefinitionTypeTestedContainerAdditiveAdditiveSurrogate(
          additiveCodeableConcept = this@with.asCodeableConcept()?.value,
          additiveReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class SpecimenDefinitionTypeTestedContainerAdditiveSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var additive: SpecimenDefinition.TypeTested.Container.Additive.Additive,
) {
  public fun toModel(): SpecimenDefinition.TypeTested.Container.Additive =
    SpecimenDefinition.TypeTested.Container.Additive(
      id = this@SpecimenDefinitionTypeTestedContainerAdditiveSurrogate.id,
      extension =
        this@SpecimenDefinitionTypeTestedContainerAdditiveSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SpecimenDefinitionTypeTestedContainerAdditiveSurrogate.modifierExtension
          ?: mutableListOf(),
      additive = this@SpecimenDefinitionTypeTestedContainerAdditiveSurrogate.additive,
    )

  public companion object {
    public fun fromModel(
      model: SpecimenDefinition.TypeTested.Container.Additive
    ): SpecimenDefinitionTypeTestedContainerAdditiveSurrogate =
      with(model) {
        SpecimenDefinitionTypeTestedContainerAdditiveSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          additive = this@with.additive,
        )
      }
  }
}

@Serializable
internal data class SpecimenDefinitionTypeTestedContainerMinimumVolumeSurrogate(
  public var minimumVolumeQuantity: Quantity? = null,
  public var minimumVolumeString: KotlinString? = null,
  public var _minimumVolumeString: Element? = null,
) {
  public fun toModel(): SpecimenDefinition.TypeTested.Container.MinimumVolume =
    SpecimenDefinition.TypeTested.Container.MinimumVolume?.from(
      this@SpecimenDefinitionTypeTestedContainerMinimumVolumeSurrogate.minimumVolumeQuantity,
      R5String.of(
        this@SpecimenDefinitionTypeTestedContainerMinimumVolumeSurrogate.minimumVolumeString,
        this@SpecimenDefinitionTypeTestedContainerMinimumVolumeSurrogate._minimumVolumeString,
      ),
    )!!

  public companion object {
    public fun fromModel(
      model: SpecimenDefinition.TypeTested.Container.MinimumVolume
    ): SpecimenDefinitionTypeTestedContainerMinimumVolumeSurrogate =
      with(model) {
        SpecimenDefinitionTypeTestedContainerMinimumVolumeSurrogate(
          minimumVolumeQuantity = this@with.asQuantity()?.value,
          minimumVolumeString = this@with.asString()?.value?.value,
          _minimumVolumeString = this@with.asString()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class SpecimenDefinitionTypeTestedContainerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var material: CodeableConcept? = null,
  public var type: CodeableConcept? = null,
  public var cap: CodeableConcept? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var capacity: Quantity? = null,
  public var minimumVolume: SpecimenDefinition.TypeTested.Container.MinimumVolume? = null,
  public var additive: MutableList<SpecimenDefinition.TypeTested.Container.Additive>? = null,
  public var preparation: KotlinString? = null,
  public var _preparation: Element? = null,
) {
  public fun toModel(): SpecimenDefinition.TypeTested.Container =
    SpecimenDefinition.TypeTested.Container(
      id = this@SpecimenDefinitionTypeTestedContainerSurrogate.id,
      extension = this@SpecimenDefinitionTypeTestedContainerSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SpecimenDefinitionTypeTestedContainerSurrogate.modifierExtension ?: mutableListOf(),
      material = this@SpecimenDefinitionTypeTestedContainerSurrogate.material,
      type = this@SpecimenDefinitionTypeTestedContainerSurrogate.type,
      cap = this@SpecimenDefinitionTypeTestedContainerSurrogate.cap,
      description =
        Markdown.of(
          this@SpecimenDefinitionTypeTestedContainerSurrogate.description,
          this@SpecimenDefinitionTypeTestedContainerSurrogate._description,
        ),
      capacity = this@SpecimenDefinitionTypeTestedContainerSurrogate.capacity,
      minimumVolume = this@SpecimenDefinitionTypeTestedContainerSurrogate.minimumVolume,
      additive = this@SpecimenDefinitionTypeTestedContainerSurrogate.additive ?: mutableListOf(),
      preparation =
        Markdown.of(
          this@SpecimenDefinitionTypeTestedContainerSurrogate.preparation,
          this@SpecimenDefinitionTypeTestedContainerSurrogate._preparation,
        ),
    )

  public companion object {
    public fun fromModel(
      model: SpecimenDefinition.TypeTested.Container
    ): SpecimenDefinitionTypeTestedContainerSurrogate =
      with(model) {
        SpecimenDefinitionTypeTestedContainerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          material = this@with.material,
          type = this@with.type,
          cap = this@with.cap,
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          capacity = this@with.capacity,
          minimumVolume = this@with.minimumVolume,
          additive = this@with.additive.takeUnless { it.all { it == null } },
          preparation = this@with.preparation?.value,
          _preparation = this@with.preparation?.toElement(),
        )
      }
  }
}

@Serializable
internal data class SpecimenDefinitionTypeTestedHandlingSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var temperatureQualifier: CodeableConcept? = null,
  public var temperatureRange: Range? = null,
  public var maxDuration: Duration? = null,
  public var instruction: KotlinString? = null,
  public var _instruction: Element? = null,
) {
  public fun toModel(): SpecimenDefinition.TypeTested.Handling =
    SpecimenDefinition.TypeTested.Handling(
      id = this@SpecimenDefinitionTypeTestedHandlingSurrogate.id,
      extension = this@SpecimenDefinitionTypeTestedHandlingSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SpecimenDefinitionTypeTestedHandlingSurrogate.modifierExtension ?: mutableListOf(),
      temperatureQualifier =
        this@SpecimenDefinitionTypeTestedHandlingSurrogate.temperatureQualifier,
      temperatureRange = this@SpecimenDefinitionTypeTestedHandlingSurrogate.temperatureRange,
      maxDuration = this@SpecimenDefinitionTypeTestedHandlingSurrogate.maxDuration,
      instruction =
        Markdown.of(
          this@SpecimenDefinitionTypeTestedHandlingSurrogate.instruction,
          this@SpecimenDefinitionTypeTestedHandlingSurrogate._instruction,
        ),
    )

  public companion object {
    public fun fromModel(
      model: SpecimenDefinition.TypeTested.Handling
    ): SpecimenDefinitionTypeTestedHandlingSurrogate =
      with(model) {
        SpecimenDefinitionTypeTestedHandlingSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          temperatureQualifier = this@with.temperatureQualifier,
          temperatureRange = this@with.temperatureRange,
          maxDuration = this@with.maxDuration,
          instruction = this@with.instruction?.value,
          _instruction = this@with.instruction?.toElement(),
        )
      }
  }
}

@Serializable
internal data class SpecimenDefinitionTypeTestedSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var isDerived: KotlinBoolean? = null,
  public var _isDerived: Element? = null,
  public var type: CodeableConcept? = null,
  public var preference: KotlinString? = null,
  public var _preference: Element? = null,
  public var container: SpecimenDefinition.TypeTested.Container? = null,
  public var requirement: KotlinString? = null,
  public var _requirement: Element? = null,
  public var retentionTime: Duration? = null,
  public var singleUse: KotlinBoolean? = null,
  public var _singleUse: Element? = null,
  public var rejectionCriterion: MutableList<CodeableConcept>? = null,
  public var handling: MutableList<SpecimenDefinition.TypeTested.Handling>? = null,
  public var testingDestination: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): SpecimenDefinition.TypeTested =
    SpecimenDefinition.TypeTested(
      id = this@SpecimenDefinitionTypeTestedSurrogate.id,
      extension = this@SpecimenDefinitionTypeTestedSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SpecimenDefinitionTypeTestedSurrogate.modifierExtension ?: mutableListOf(),
      isDerived =
        R5Boolean.of(
          this@SpecimenDefinitionTypeTestedSurrogate.isDerived,
          this@SpecimenDefinitionTypeTestedSurrogate._isDerived,
        ),
      type = this@SpecimenDefinitionTypeTestedSurrogate.type,
      preference =
        Enumeration.of(
          com.google.fhir.model.r5.SpecimenDefinition.SpecimenContainedPreference.fromCode(
            this@SpecimenDefinitionTypeTestedSurrogate.preference!!
          ),
          this@SpecimenDefinitionTypeTestedSurrogate._preference,
        ),
      container = this@SpecimenDefinitionTypeTestedSurrogate.container,
      requirement =
        Markdown.of(
          this@SpecimenDefinitionTypeTestedSurrogate.requirement,
          this@SpecimenDefinitionTypeTestedSurrogate._requirement,
        ),
      retentionTime = this@SpecimenDefinitionTypeTestedSurrogate.retentionTime,
      singleUse =
        R5Boolean.of(
          this@SpecimenDefinitionTypeTestedSurrogate.singleUse,
          this@SpecimenDefinitionTypeTestedSurrogate._singleUse,
        ),
      rejectionCriterion =
        this@SpecimenDefinitionTypeTestedSurrogate.rejectionCriterion ?: mutableListOf(),
      handling = this@SpecimenDefinitionTypeTestedSurrogate.handling ?: mutableListOf(),
      testingDestination =
        this@SpecimenDefinitionTypeTestedSurrogate.testingDestination ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: SpecimenDefinition.TypeTested
    ): SpecimenDefinitionTypeTestedSurrogate =
      with(model) {
        SpecimenDefinitionTypeTestedSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          isDerived = this@with.isDerived?.value,
          _isDerived = this@with.isDerived?.toElement(),
          type = this@with.type,
          preference = this@with.preference.value?.getCode(),
          _preference = this@with.preference.toElement(),
          container = this@with.container,
          requirement = this@with.requirement?.value,
          _requirement = this@with.requirement?.toElement(),
          retentionTime = this@with.retentionTime,
          singleUse = this@with.singleUse?.value,
          _singleUse = this@with.singleUse?.toElement(),
          rejectionCriterion = this@with.rejectionCriterion.takeUnless { it.all { it == null } },
          handling = this@with.handling.takeUnless { it.all { it == null } },
          testingDestination = this@with.testingDestination.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class SpecimenDefinitionVersionAlgorithmSurrogate(
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
) {
  public fun toModel(): SpecimenDefinition.VersionAlgorithm =
    SpecimenDefinition.VersionAlgorithm?.from(
      R5String.of(
        this@SpecimenDefinitionVersionAlgorithmSurrogate.versionAlgorithmString,
        this@SpecimenDefinitionVersionAlgorithmSurrogate._versionAlgorithmString,
      ),
      this@SpecimenDefinitionVersionAlgorithmSurrogate.versionAlgorithmCoding,
    )!!

  public companion object {
    public fun fromModel(
      model: SpecimenDefinition.VersionAlgorithm
    ): SpecimenDefinitionVersionAlgorithmSurrogate =
      with(model) {
        SpecimenDefinitionVersionAlgorithmSurrogate(
          versionAlgorithmString = this@with.asString()?.value?.value,
          _versionAlgorithmString = this@with.asString()?.value?.toElement(),
          versionAlgorithmCoding = this@with.asCoding()?.value,
        )
      }
  }
}

@Serializable
internal data class SpecimenDefinitionSubjectSurrogate(
  public var subjectCodeableConcept: CodeableConcept? = null,
  public var subjectReference: Reference? = null,
) {
  public fun toModel(): SpecimenDefinition.Subject =
    SpecimenDefinition.Subject?.from(
      this@SpecimenDefinitionSubjectSurrogate.subjectCodeableConcept,
      this@SpecimenDefinitionSubjectSurrogate.subjectReference,
    )!!

  public companion object {
    public fun fromModel(model: SpecimenDefinition.Subject): SpecimenDefinitionSubjectSurrogate =
      with(model) {
        SpecimenDefinitionSubjectSurrogate(
          subjectCodeableConcept = this@with.asCodeableConcept()?.value,
          subjectReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class SpecimenDefinitionSurrogate(
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
  public var versionAlgorithm: SpecimenDefinition.VersionAlgorithm? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var derivedFromCanonical: MutableList<KotlinString?>? = null,
  public var _derivedFromCanonical: MutableList<Element?>? = null,
  public var derivedFromUri: MutableList<KotlinString?>? = null,
  public var _derivedFromUri: MutableList<Element?>? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var subject: SpecimenDefinition.Subject? = null,
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
  public var typeCollected: CodeableConcept? = null,
  public var patientPreparation: MutableList<CodeableConcept>? = null,
  public var timeAspect: KotlinString? = null,
  public var _timeAspect: Element? = null,
  public var collection: MutableList<CodeableConcept>? = null,
  public var typeTested: MutableList<SpecimenDefinition.TypeTested>? = null,
) {
  public fun toModel(): SpecimenDefinition =
    SpecimenDefinition(
      id = this@SpecimenDefinitionSurrogate.id,
      meta = this@SpecimenDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@SpecimenDefinitionSurrogate.implicitRules,
          this@SpecimenDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@SpecimenDefinitionSurrogate.language,
          this@SpecimenDefinitionSurrogate._language,
        ),
      text = this@SpecimenDefinitionSurrogate.text,
      contained = this@SpecimenDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@SpecimenDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@SpecimenDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@SpecimenDefinitionSurrogate.url, this@SpecimenDefinitionSurrogate._url),
      identifier = this@SpecimenDefinitionSurrogate.identifier,
      version =
        R5String.of(
          this@SpecimenDefinitionSurrogate.version,
          this@SpecimenDefinitionSurrogate._version,
        ),
      versionAlgorithm = this@SpecimenDefinitionSurrogate.versionAlgorithm,
      name =
        R5String.of(this@SpecimenDefinitionSurrogate.name, this@SpecimenDefinitionSurrogate._name),
      title =
        R5String.of(
          this@SpecimenDefinitionSurrogate.title,
          this@SpecimenDefinitionSurrogate._title,
        ),
      derivedFromCanonical =
        if (
          this@SpecimenDefinitionSurrogate.derivedFromCanonical == null &&
            this@SpecimenDefinitionSurrogate._derivedFromCanonical == null
        ) {
          mutableListOf()
        } else {
          (this@SpecimenDefinitionSurrogate.derivedFromCanonical
              ?: List(this@SpecimenDefinitionSurrogate._derivedFromCanonical!!.size) { null })
            .zip(
              this@SpecimenDefinitionSurrogate._derivedFromCanonical
                ?: List(this@SpecimenDefinitionSurrogate.derivedFromCanonical!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      derivedFromUri =
        if (
          this@SpecimenDefinitionSurrogate.derivedFromUri == null &&
            this@SpecimenDefinitionSurrogate._derivedFromUri == null
        ) {
          mutableListOf()
        } else {
          (this@SpecimenDefinitionSurrogate.derivedFromUri
              ?: List(this@SpecimenDefinitionSurrogate._derivedFromUri!!.size) { null })
            .zip(
              this@SpecimenDefinitionSurrogate._derivedFromUri
                ?: List(this@SpecimenDefinitionSurrogate.derivedFromUri!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      status =
        Enumeration.of(
          com.google.fhir.model.r5.PublicationStatus.fromCode(
            this@SpecimenDefinitionSurrogate.status!!
          ),
          this@SpecimenDefinitionSurrogate._status,
        ),
      experimental =
        R5Boolean.of(
          this@SpecimenDefinitionSurrogate.experimental,
          this@SpecimenDefinitionSurrogate._experimental,
        ),
      subject = this@SpecimenDefinitionSurrogate.subject,
      date =
        DateTime.of(
          FhirDateTime.fromString(this@SpecimenDefinitionSurrogate.date),
          this@SpecimenDefinitionSurrogate._date,
        ),
      publisher =
        R5String.of(
          this@SpecimenDefinitionSurrogate.publisher,
          this@SpecimenDefinitionSurrogate._publisher,
        ),
      contact = this@SpecimenDefinitionSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@SpecimenDefinitionSurrogate.description,
          this@SpecimenDefinitionSurrogate._description,
        ),
      useContext = this@SpecimenDefinitionSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@SpecimenDefinitionSurrogate.jurisdiction ?: mutableListOf(),
      purpose =
        Markdown.of(
          this@SpecimenDefinitionSurrogate.purpose,
          this@SpecimenDefinitionSurrogate._purpose,
        ),
      copyright =
        Markdown.of(
          this@SpecimenDefinitionSurrogate.copyright,
          this@SpecimenDefinitionSurrogate._copyright,
        ),
      copyrightLabel =
        R5String.of(
          this@SpecimenDefinitionSurrogate.copyrightLabel,
          this@SpecimenDefinitionSurrogate._copyrightLabel,
        ),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@SpecimenDefinitionSurrogate.approvalDate),
          this@SpecimenDefinitionSurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@SpecimenDefinitionSurrogate.lastReviewDate),
          this@SpecimenDefinitionSurrogate._lastReviewDate,
        ),
      effectivePeriod = this@SpecimenDefinitionSurrogate.effectivePeriod,
      typeCollected = this@SpecimenDefinitionSurrogate.typeCollected,
      patientPreparation = this@SpecimenDefinitionSurrogate.patientPreparation ?: mutableListOf(),
      timeAspect =
        R5String.of(
          this@SpecimenDefinitionSurrogate.timeAspect,
          this@SpecimenDefinitionSurrogate._timeAspect,
        ),
      collection = this@SpecimenDefinitionSurrogate.collection ?: mutableListOf(),
      typeTested = this@SpecimenDefinitionSurrogate.typeTested ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: SpecimenDefinition): SpecimenDefinitionSurrogate =
      with(model) {
        SpecimenDefinitionSurrogate(
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
          versionAlgorithm = this@with.versionAlgorithm,
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
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
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
          subject = this@with.subject,
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
          typeCollected = this@with.typeCollected,
          patientPreparation = this@with.patientPreparation.takeUnless { it.all { it == null } },
          timeAspect = this@with.timeAspect?.value,
          _timeAspect = this@with.timeAspect?.toElement(),
          collection = this@with.collection.takeUnless { it.all { it == null } },
          typeTested = this@with.typeTested.takeUnless { it.all { it == null } },
        )
      }
  }
}
