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

import com.google.fhir.model.r4.Annotation
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Duration
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Specimen
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
internal class SpecimenCollectionCollectedSurrogate {
  public var collectedDateTime: KotlinString? = null

  public var _collectedDateTime: Element? = null

  public var collectedPeriod: Period? = null

  public fun toModel(): Specimen.Collection.Collected =
    Specimen.Collection.Collected?.from(
      DateTime.of(
        FhirDateTime.fromString(this@SpecimenCollectionCollectedSurrogate.collectedDateTime),
        this@SpecimenCollectionCollectedSurrogate._collectedDateTime,
      ),
      this@SpecimenCollectionCollectedSurrogate.collectedPeriod,
    ) ?: Specimen.Collection.Collected.Null

  public companion object {
    public fun fromModel(
      model: Specimen.Collection.Collected
    ): SpecimenCollectionCollectedSurrogate =
      with(model) {
        SpecimenCollectionCollectedSurrogate().apply {
          collectedDateTime = this@with.asDateTime()?.value?.value?.toString()
          _collectedDateTime = this@with.asDateTime()?.value?.toElement()
          collectedPeriod = this@with.asPeriod()?.value
        }
      }
  }
}

@Serializable
internal class SpecimenCollectionFastingStatusSurrogate {
  public var fastingStatusCodeableConcept: CodeableConcept? = null

  public var fastingStatusDuration: Duration? = null

  public fun toModel(): Specimen.Collection.FastingStatus =
    Specimen.Collection.FastingStatus?.from(
      this@SpecimenCollectionFastingStatusSurrogate.fastingStatusCodeableConcept,
      this@SpecimenCollectionFastingStatusSurrogate.fastingStatusDuration,
    ) ?: Specimen.Collection.FastingStatus.Null

  public companion object {
    public fun fromModel(
      model: Specimen.Collection.FastingStatus
    ): SpecimenCollectionFastingStatusSurrogate =
      with(model) {
        SpecimenCollectionFastingStatusSurrogate().apply {
          fastingStatusCodeableConcept = this@with.asCodeableConcept()?.value
          fastingStatusDuration = this@with.asDuration()?.value
        }
      }
  }
}

@Serializable
internal data class SpecimenCollectionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var collector: Reference? = null,
  public var duration: Duration? = null,
  public var quantity: Quantity? = null,
  public var method: CodeableConcept? = null,
  public var bodySite: CodeableConcept? = null,
  public var collected: Specimen.Collection.Collected? = null,
  public var fastingStatus: Specimen.Collection.FastingStatus? = null,
) {
  public fun toModel(): Specimen.Collection =
    Specimen.Collection().apply {
      id = this@SpecimenCollectionSurrogate.id
      extension = this@SpecimenCollectionSurrogate.extension
      modifierExtension = this@SpecimenCollectionSurrogate.modifierExtension
      collector = this@SpecimenCollectionSurrogate.collector
      collected = this@SpecimenCollectionSurrogate.collected
      duration = this@SpecimenCollectionSurrogate.duration
      quantity = this@SpecimenCollectionSurrogate.quantity
      method = this@SpecimenCollectionSurrogate.method
      bodySite = this@SpecimenCollectionSurrogate.bodySite
      fastingStatus = this@SpecimenCollectionSurrogate.fastingStatus
    }

  public companion object {
    public fun fromModel(model: Specimen.Collection): SpecimenCollectionSurrogate =
      with(model) {
        SpecimenCollectionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          collector = this@with.collector
          collected = this@with.collected
          duration = this@with.duration
          quantity = this@with.quantity
          method = this@with.method
          bodySite = this@with.bodySite
          fastingStatus = this@with.fastingStatus
        }
      }
  }
}

@Serializable
internal class SpecimenProcessingTimeSurrogate {
  public var timeDateTime: KotlinString? = null

  public var _timeDateTime: Element? = null

  public var timePeriod: Period? = null

  public fun toModel(): Specimen.Processing.Time =
    Specimen.Processing.Time?.from(
      DateTime.of(
        FhirDateTime.fromString(this@SpecimenProcessingTimeSurrogate.timeDateTime),
        this@SpecimenProcessingTimeSurrogate._timeDateTime,
      ),
      this@SpecimenProcessingTimeSurrogate.timePeriod,
    ) ?: Specimen.Processing.Time.Null

  public companion object {
    public fun fromModel(model: Specimen.Processing.Time): SpecimenProcessingTimeSurrogate =
      with(model) {
        SpecimenProcessingTimeSurrogate().apply {
          timeDateTime = this@with.asDateTime()?.value?.value?.toString()
          _timeDateTime = this@with.asDateTime()?.value?.toElement()
          timePeriod = this@with.asPeriod()?.value
        }
      }
  }
}

@Serializable
internal data class SpecimenProcessingSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var procedure: CodeableConcept? = null,
  public var additive: List<Reference?>? = null,
  public var time: Specimen.Processing.Time? = null,
) {
  public fun toModel(): Specimen.Processing =
    Specimen.Processing().apply {
      id = this@SpecimenProcessingSurrogate.id
      extension = this@SpecimenProcessingSurrogate.extension
      modifierExtension = this@SpecimenProcessingSurrogate.modifierExtension
      description =
        R4String.of(
          this@SpecimenProcessingSurrogate.description,
          this@SpecimenProcessingSurrogate._description,
        )
      procedure = this@SpecimenProcessingSurrogate.procedure
      additive = this@SpecimenProcessingSurrogate.additive
      time = this@SpecimenProcessingSurrogate.time
    }

  public companion object {
    public fun fromModel(model: Specimen.Processing): SpecimenProcessingSurrogate =
      with(model) {
        SpecimenProcessingSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          procedure = this@with.procedure
          additive = this@with.additive
          time = this@with.time
        }
      }
  }
}

@Serializable
internal class SpecimenContainerAdditiveSurrogate {
  public var additiveCodeableConcept: CodeableConcept? = null

  public var additiveReference: Reference? = null

  public fun toModel(): Specimen.Container.Additive =
    Specimen.Container.Additive?.from(
      this@SpecimenContainerAdditiveSurrogate.additiveCodeableConcept,
      this@SpecimenContainerAdditiveSurrogate.additiveReference,
    ) ?: Specimen.Container.Additive.Null

  public companion object {
    public fun fromModel(model: Specimen.Container.Additive): SpecimenContainerAdditiveSurrogate =
      with(model) {
        SpecimenContainerAdditiveSurrogate().apply {
          additiveCodeableConcept = this@with.asCodeableConcept()?.value
          additiveReference = this@with.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class SpecimenContainerSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var type: CodeableConcept? = null,
  public var capacity: Quantity? = null,
  public var specimenQuantity: Quantity? = null,
  public var additive: Specimen.Container.Additive? = null,
) {
  public fun toModel(): Specimen.Container =
    Specimen.Container().apply {
      id = this@SpecimenContainerSurrogate.id
      extension = this@SpecimenContainerSurrogate.extension
      modifierExtension = this@SpecimenContainerSurrogate.modifierExtension
      identifier = this@SpecimenContainerSurrogate.identifier
      description =
        R4String.of(
          this@SpecimenContainerSurrogate.description,
          this@SpecimenContainerSurrogate._description,
        )
      type = this@SpecimenContainerSurrogate.type
      capacity = this@SpecimenContainerSurrogate.capacity
      specimenQuantity = this@SpecimenContainerSurrogate.specimenQuantity
      additive = this@SpecimenContainerSurrogate.additive
    }

  public companion object {
    public fun fromModel(model: Specimen.Container): SpecimenContainerSurrogate =
      with(model) {
        SpecimenContainerSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          identifier = this@with.identifier
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          type = this@with.type
          capacity = this@with.capacity
          specimenQuantity = this@with.specimenQuantity
          additive = this@with.additive
        }
      }
  }
}

@Serializable
internal data class SpecimenSurrogate(
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
  public var accessionIdentifier: Identifier? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var type: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var receivedTime: KotlinString? = null,
  public var _receivedTime: Element? = null,
  public var parent: List<Reference?>? = null,
  public var request: List<Reference?>? = null,
  public var collection: Specimen.Collection? = null,
  public var processing: List<Specimen.Processing>? = null,
  public var container: List<Specimen.Container>? = null,
  public var condition: List<CodeableConcept?>? = null,
  public var note: List<Annotation?>? = null,
) {
  public fun toModel(): Specimen =
    Specimen().apply {
      id = this@SpecimenSurrogate.id
      meta = this@SpecimenSurrogate.meta
      implicitRules =
        Uri.of(this@SpecimenSurrogate.implicitRules, this@SpecimenSurrogate._implicitRules)
      language = Code.of(this@SpecimenSurrogate.language, this@SpecimenSurrogate._language)
      text = this@SpecimenSurrogate.text
      contained = this@SpecimenSurrogate.contained
      extension = this@SpecimenSurrogate.extension
      modifierExtension = this@SpecimenSurrogate.modifierExtension
      identifier = this@SpecimenSurrogate.identifier
      accessionIdentifier = this@SpecimenSurrogate.accessionIdentifier
      status =
        Enumeration.of(
          this@SpecimenSurrogate.status?.let {
            com.google.fhir.model.r4.Specimen.SpecimenStatus.fromCode(it)
          },
          this@SpecimenSurrogate._status,
        )
      type = this@SpecimenSurrogate.type
      subject = this@SpecimenSurrogate.subject
      receivedTime =
        DateTime.of(
          FhirDateTime.fromString(this@SpecimenSurrogate.receivedTime),
          this@SpecimenSurrogate._receivedTime,
        )
      parent = this@SpecimenSurrogate.parent
      request = this@SpecimenSurrogate.request
      collection = this@SpecimenSurrogate.collection
      processing = this@SpecimenSurrogate.processing
      container = this@SpecimenSurrogate.container
      condition = this@SpecimenSurrogate.condition
      note = this@SpecimenSurrogate.note
    }

  public companion object {
    public fun fromModel(model: Specimen): SpecimenSurrogate =
      with(model) {
        SpecimenSurrogate().apply {
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
          accessionIdentifier = this@with.accessionIdentifier
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          type = this@with.type
          subject = this@with.subject
          receivedTime = this@with.receivedTime?.value?.toString()
          _receivedTime = this@with.receivedTime?.toElement()
          parent = this@with.parent
          request = this@with.request
          collection = this@with.collection
          processing = this@with.processing
          container = this@with.container
          condition = this@with.condition
          note = this@with.note
        }
      }
  }
}
