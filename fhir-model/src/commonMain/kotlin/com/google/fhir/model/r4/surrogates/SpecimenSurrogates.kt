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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SpecimenCollectionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var collector: Reference? = null,
  public var collectedDateTime: KotlinString? = null,
  public var _collectedDateTime: Element? = null,
  public var collectedPeriod: Period? = null,
  public var duration: Duration? = null,
  public var quantity: Quantity? = null,
  public var method: CodeableConcept? = null,
  public var bodySite: CodeableConcept? = null,
  public var fastingStatusCodeableConcept: CodeableConcept? = null,
  public var fastingStatusDuration: Duration? = null,
) {
  public fun toModel(): Specimen.Collection =
    Specimen.Collection(
      id = this@SpecimenCollectionSurrogate.id,
      extension = this@SpecimenCollectionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@SpecimenCollectionSurrogate.modifierExtension ?: mutableListOf(),
      collector = this@SpecimenCollectionSurrogate.collector,
      collected =
        Specimen.Collection.Collected?.from(
          DateTime.of(
            FhirDateTime.fromString(this@SpecimenCollectionSurrogate.collectedDateTime),
            this@SpecimenCollectionSurrogate._collectedDateTime,
          ),
          this@SpecimenCollectionSurrogate.collectedPeriod,
        ),
      duration = this@SpecimenCollectionSurrogate.duration,
      quantity = this@SpecimenCollectionSurrogate.quantity,
      method = this@SpecimenCollectionSurrogate.method,
      bodySite = this@SpecimenCollectionSurrogate.bodySite,
      fastingStatus =
        Specimen.Collection.FastingStatus?.from(
          this@SpecimenCollectionSurrogate.fastingStatusCodeableConcept,
          this@SpecimenCollectionSurrogate.fastingStatusDuration,
        ),
    )

  public companion object {
    public fun fromModel(model: Specimen.Collection): SpecimenCollectionSurrogate =
      with(model) {
        SpecimenCollectionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          collector = this@with.collector,
          collectedDateTime = this@with.collected?.asDateTime()?.value?.value?.toString(),
          _collectedDateTime = this@with.collected?.asDateTime()?.value?.toElement(),
          collectedPeriod = this@with.collected?.asPeriod()?.value,
          duration = this@with.duration,
          quantity = this@with.quantity,
          method = this@with.method,
          bodySite = this@with.bodySite,
          fastingStatusCodeableConcept = this@with.fastingStatus?.asCodeableConcept()?.value,
          fastingStatusDuration = this@with.fastingStatus?.asDuration()?.value,
        )
      }
  }
}

@Serializable
internal data class SpecimenProcessingSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var procedure: CodeableConcept? = null,
  public var additive: MutableList<Reference>? = null,
  public var timeDateTime: KotlinString? = null,
  public var _timeDateTime: Element? = null,
  public var timePeriod: Period? = null,
) {
  public fun toModel(): Specimen.Processing =
    Specimen.Processing(
      id = this@SpecimenProcessingSurrogate.id,
      extension = this@SpecimenProcessingSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@SpecimenProcessingSurrogate.modifierExtension ?: mutableListOf(),
      description =
        R4String.of(
          this@SpecimenProcessingSurrogate.description,
          this@SpecimenProcessingSurrogate._description,
        ),
      procedure = this@SpecimenProcessingSurrogate.procedure,
      additive = this@SpecimenProcessingSurrogate.additive ?: mutableListOf(),
      time =
        Specimen.Processing.Time?.from(
          DateTime.of(
            FhirDateTime.fromString(this@SpecimenProcessingSurrogate.timeDateTime),
            this@SpecimenProcessingSurrogate._timeDateTime,
          ),
          this@SpecimenProcessingSurrogate.timePeriod,
        ),
    )

  public companion object {
    public fun fromModel(model: Specimen.Processing): SpecimenProcessingSurrogate =
      with(model) {
        SpecimenProcessingSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          procedure = this@with.procedure,
          additive = this@with.additive.takeUnless { it.all { it == null } },
          timeDateTime = this@with.time?.asDateTime()?.value?.value?.toString(),
          _timeDateTime = this@with.time?.asDateTime()?.value?.toElement(),
          timePeriod = this@with.time?.asPeriod()?.value,
        )
      }
  }
}

@Serializable
internal data class SpecimenContainerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var type: CodeableConcept? = null,
  public var capacity: Quantity? = null,
  public var specimenQuantity: Quantity? = null,
  public var additiveCodeableConcept: CodeableConcept? = null,
  public var additiveReference: Reference? = null,
) {
  public fun toModel(): Specimen.Container =
    Specimen.Container(
      id = this@SpecimenContainerSurrogate.id,
      extension = this@SpecimenContainerSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@SpecimenContainerSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@SpecimenContainerSurrogate.identifier ?: mutableListOf(),
      description =
        R4String.of(
          this@SpecimenContainerSurrogate.description,
          this@SpecimenContainerSurrogate._description,
        ),
      type = this@SpecimenContainerSurrogate.type,
      capacity = this@SpecimenContainerSurrogate.capacity,
      specimenQuantity = this@SpecimenContainerSurrogate.specimenQuantity,
      additive =
        Specimen.Container.Additive?.from(
          this@SpecimenContainerSurrogate.additiveCodeableConcept,
          this@SpecimenContainerSurrogate.additiveReference,
        ),
    )

  public companion object {
    public fun fromModel(model: Specimen.Container): SpecimenContainerSurrogate =
      with(model) {
        SpecimenContainerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          type = this@with.type,
          capacity = this@with.capacity,
          specimenQuantity = this@with.specimenQuantity,
          additiveCodeableConcept = this@with.additive?.asCodeableConcept()?.value,
          additiveReference = this@with.additive?.asReference()?.value,
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var accessionIdentifier: Identifier? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var type: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var receivedTime: KotlinString? = null,
  public var _receivedTime: Element? = null,
  public var parent: MutableList<Reference>? = null,
  public var request: MutableList<Reference>? = null,
  public var collection: Specimen.Collection? = null,
  public var processing: MutableList<Specimen.Processing>? = null,
  public var container: MutableList<Specimen.Container>? = null,
  public var condition: MutableList<CodeableConcept>? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): Specimen =
    Specimen(
      id = this@SpecimenSurrogate.id,
      meta = this@SpecimenSurrogate.meta,
      implicitRules =
        Uri.of(this@SpecimenSurrogate.implicitRules, this@SpecimenSurrogate._implicitRules),
      language = Code.of(this@SpecimenSurrogate.language, this@SpecimenSurrogate._language),
      text = this@SpecimenSurrogate.text,
      contained = this@SpecimenSurrogate.contained ?: mutableListOf(),
      extension = this@SpecimenSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@SpecimenSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@SpecimenSurrogate.identifier ?: mutableListOf(),
      accessionIdentifier = this@SpecimenSurrogate.accessionIdentifier,
      status =
        this@SpecimenSurrogate.status?.let {
          Enumeration.of(
            com.google.fhir.model.r4.Specimen.SpecimenStatus.fromCode(it!!),
            this@SpecimenSurrogate._status,
          )
        },
      type = this@SpecimenSurrogate.type,
      subject = this@SpecimenSurrogate.subject,
      receivedTime =
        DateTime.of(
          FhirDateTime.fromString(this@SpecimenSurrogate.receivedTime),
          this@SpecimenSurrogate._receivedTime,
        ),
      parent = this@SpecimenSurrogate.parent ?: mutableListOf(),
      request = this@SpecimenSurrogate.request ?: mutableListOf(),
      collection = this@SpecimenSurrogate.collection,
      processing = this@SpecimenSurrogate.processing ?: mutableListOf(),
      container = this@SpecimenSurrogate.container ?: mutableListOf(),
      condition = this@SpecimenSurrogate.condition ?: mutableListOf(),
      note = this@SpecimenSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Specimen): SpecimenSurrogate =
      with(model) {
        SpecimenSurrogate(
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
          accessionIdentifier = this@with.accessionIdentifier,
          status = this@with.status?.value?.getCode(),
          _status = this@with.status?.toElement(),
          type = this@with.type,
          subject = this@with.subject,
          receivedTime = this@with.receivedTime?.value?.toString(),
          _receivedTime = this@with.receivedTime?.toElement(),
          parent = this@with.parent.takeUnless { it.all { it == null } },
          request = this@with.request.takeUnless { it.all { it == null } },
          collection = this@with.collection,
          processing = this@with.processing.takeUnless { it.all { it == null } },
          container = this@with.container.takeUnless { it.all { it == null } },
          condition = this@with.condition.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}
