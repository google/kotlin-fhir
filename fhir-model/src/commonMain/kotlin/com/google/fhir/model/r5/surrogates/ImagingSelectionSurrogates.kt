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

import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.Decimal
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Id
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.ImagingSelection
import com.google.fhir.model.r5.Instant
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.UnsignedInt
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ImagingSelectionPerformerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var function: CodeableConcept? = null,
  public var actor: Reference? = null,
) {
  public fun toModel(): ImagingSelection.Performer =
    ImagingSelection.Performer(
      id = this@ImagingSelectionPerformerSurrogate.id,
      extension = this@ImagingSelectionPerformerSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImagingSelectionPerformerSurrogate.modifierExtension ?: mutableListOf(),
      function = this@ImagingSelectionPerformerSurrogate.function,
      actor = this@ImagingSelectionPerformerSurrogate.actor,
    )

  public companion object {
    public fun fromModel(model: ImagingSelection.Performer): ImagingSelectionPerformerSurrogate =
      with(model) {
        ImagingSelectionPerformerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          function = this@with.function,
          actor = this@with.actor,
        )
      }
  }
}

@Serializable
internal data class ImagingSelectionInstanceImageRegion2DSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var regionType: KotlinString? = null,
  public var _regionType: Element? = null,
  public var coordinate: MutableList<Double?>? = null,
  public var _coordinate: MutableList<Element?>? = null,
) {
  public fun toModel(): ImagingSelection.Instance.ImageRegion2D =
    ImagingSelection.Instance.ImageRegion2D(
      id = this@ImagingSelectionInstanceImageRegion2DSurrogate.id,
      extension = this@ImagingSelectionInstanceImageRegion2DSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImagingSelectionInstanceImageRegion2DSurrogate.modifierExtension ?: mutableListOf(),
      regionType =
        Enumeration.of(
          com.google.fhir.model.r5.ImagingSelection.ImagingSelection2DGraphicType.fromCode(
            this@ImagingSelectionInstanceImageRegion2DSurrogate.regionType!!
          ),
          this@ImagingSelectionInstanceImageRegion2DSurrogate._regionType,
        ),
      coordinate =
        if (
          this@ImagingSelectionInstanceImageRegion2DSurrogate.coordinate == null &&
            this@ImagingSelectionInstanceImageRegion2DSurrogate._coordinate == null
        ) {
          mutableListOf()
        } else {
          (this@ImagingSelectionInstanceImageRegion2DSurrogate.coordinate
              ?: List(this@ImagingSelectionInstanceImageRegion2DSurrogate._coordinate!!.size) {
                null
              })
            .zip(
              this@ImagingSelectionInstanceImageRegion2DSurrogate._coordinate
                ?: List(this@ImagingSelectionInstanceImageRegion2DSurrogate.coordinate!!.size) {
                  null
                }
            )
            .map { (value, element) -> Decimal.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(
      model: ImagingSelection.Instance.ImageRegion2D
    ): ImagingSelectionInstanceImageRegion2DSurrogate =
      with(model) {
        ImagingSelectionInstanceImageRegion2DSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          regionType = this@with.regionType.value?.getCode(),
          _regionType = this@with.regionType.toElement(),
          coordinate =
            this@with.coordinate
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _coordinate =
            this@with.coordinate
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class ImagingSelectionInstanceImageRegion3DSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var regionType: KotlinString? = null,
  public var _regionType: Element? = null,
  public var coordinate: MutableList<Double?>? = null,
  public var _coordinate: MutableList<Element?>? = null,
) {
  public fun toModel(): ImagingSelection.Instance.ImageRegion3D =
    ImagingSelection.Instance.ImageRegion3D(
      id = this@ImagingSelectionInstanceImageRegion3DSurrogate.id,
      extension = this@ImagingSelectionInstanceImageRegion3DSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImagingSelectionInstanceImageRegion3DSurrogate.modifierExtension ?: mutableListOf(),
      regionType =
        Enumeration.of(
          com.google.fhir.model.r5.ImagingSelection.ImagingSelection3DGraphicType.fromCode(
            this@ImagingSelectionInstanceImageRegion3DSurrogate.regionType!!
          ),
          this@ImagingSelectionInstanceImageRegion3DSurrogate._regionType,
        ),
      coordinate =
        if (
          this@ImagingSelectionInstanceImageRegion3DSurrogate.coordinate == null &&
            this@ImagingSelectionInstanceImageRegion3DSurrogate._coordinate == null
        ) {
          mutableListOf()
        } else {
          (this@ImagingSelectionInstanceImageRegion3DSurrogate.coordinate
              ?: List(this@ImagingSelectionInstanceImageRegion3DSurrogate._coordinate!!.size) {
                null
              })
            .zip(
              this@ImagingSelectionInstanceImageRegion3DSurrogate._coordinate
                ?: List(this@ImagingSelectionInstanceImageRegion3DSurrogate.coordinate!!.size) {
                  null
                }
            )
            .map { (value, element) -> Decimal.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(
      model: ImagingSelection.Instance.ImageRegion3D
    ): ImagingSelectionInstanceImageRegion3DSurrogate =
      with(model) {
        ImagingSelectionInstanceImageRegion3DSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          regionType = this@with.regionType.value?.getCode(),
          _regionType = this@with.regionType.toElement(),
          coordinate =
            this@with.coordinate
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _coordinate =
            this@with.coordinate
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class ImagingSelectionInstanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var uid: KotlinString? = null,
  public var _uid: Element? = null,
  public var number: Int? = null,
  public var _number: Element? = null,
  public var sopClass: Coding? = null,
  public var subset: MutableList<KotlinString?>? = null,
  public var _subset: MutableList<Element?>? = null,
  public var imageRegion2D: MutableList<ImagingSelection.Instance.ImageRegion2D>? = null,
  public var imageRegion3D: MutableList<ImagingSelection.Instance.ImageRegion3D>? = null,
) {
  public fun toModel(): ImagingSelection.Instance =
    ImagingSelection.Instance(
      id = this@ImagingSelectionInstanceSurrogate.id,
      extension = this@ImagingSelectionInstanceSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImagingSelectionInstanceSurrogate.modifierExtension ?: mutableListOf(),
      uid =
        Id.of(
          this@ImagingSelectionInstanceSurrogate.uid,
          this@ImagingSelectionInstanceSurrogate._uid,
        )!!,
      number =
        UnsignedInt.of(
          this@ImagingSelectionInstanceSurrogate.number,
          this@ImagingSelectionInstanceSurrogate._number,
        ),
      sopClass = this@ImagingSelectionInstanceSurrogate.sopClass,
      subset =
        if (
          this@ImagingSelectionInstanceSurrogate.subset == null &&
            this@ImagingSelectionInstanceSurrogate._subset == null
        ) {
          mutableListOf()
        } else {
          (this@ImagingSelectionInstanceSurrogate.subset
              ?: List(this@ImagingSelectionInstanceSurrogate._subset!!.size) { null })
            .zip(
              this@ImagingSelectionInstanceSurrogate._subset
                ?: List(this@ImagingSelectionInstanceSurrogate.subset!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      imageRegion2D = this@ImagingSelectionInstanceSurrogate.imageRegion2D ?: mutableListOf(),
      imageRegion3D = this@ImagingSelectionInstanceSurrogate.imageRegion3D ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ImagingSelection.Instance): ImagingSelectionInstanceSurrogate =
      with(model) {
        ImagingSelectionInstanceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          uid = this@with.uid.value,
          _uid = this@with.uid.toElement(),
          number = this@with.number?.value,
          _number = this@with.number?.toElement(),
          sopClass = this@with.sopClass,
          subset =
            this@with.subset.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _subset =
            this@with.subset
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          imageRegion2D = this@with.imageRegion2D.takeUnless { it.all { it == null } },
          imageRegion3D = this@with.imageRegion3D.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ImagingSelectionSurrogate(
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
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var subject: Reference? = null,
  public var issued: KotlinString? = null,
  public var _issued: Element? = null,
  public var performer: MutableList<ImagingSelection.Performer>? = null,
  public var basedOn: MutableList<Reference>? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var code: CodeableConcept,
  public var studyUid: KotlinString? = null,
  public var _studyUid: Element? = null,
  public var derivedFrom: MutableList<Reference>? = null,
  public var endpoint: MutableList<Reference>? = null,
  public var seriesUid: KotlinString? = null,
  public var _seriesUid: Element? = null,
  public var seriesNumber: Int? = null,
  public var _seriesNumber: Element? = null,
  public var frameOfReferenceUid: KotlinString? = null,
  public var _frameOfReferenceUid: Element? = null,
  public var bodySite: CodeableReference? = null,
  public var focus: MutableList<Reference>? = null,
  public var instance: MutableList<ImagingSelection.Instance>? = null,
) {
  public fun toModel(): ImagingSelection =
    ImagingSelection(
      id = this@ImagingSelectionSurrogate.id,
      meta = this@ImagingSelectionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@ImagingSelectionSurrogate.implicitRules,
          this@ImagingSelectionSurrogate._implicitRules,
        ),
      language =
        Code.of(this@ImagingSelectionSurrogate.language, this@ImagingSelectionSurrogate._language),
      text = this@ImagingSelectionSurrogate.text,
      contained = this@ImagingSelectionSurrogate.contained ?: mutableListOf(),
      extension = this@ImagingSelectionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ImagingSelectionSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ImagingSelectionSurrogate.identifier ?: mutableListOf(),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.ImagingSelection.ImagingSelectionStatus.fromCode(
            this@ImagingSelectionSurrogate.status!!
          ),
          this@ImagingSelectionSurrogate._status,
        ),
      subject = this@ImagingSelectionSurrogate.subject,
      issued =
        Instant.of(
          FhirDateTime.fromString(this@ImagingSelectionSurrogate.issued),
          this@ImagingSelectionSurrogate._issued,
        ),
      performer = this@ImagingSelectionSurrogate.performer ?: mutableListOf(),
      basedOn = this@ImagingSelectionSurrogate.basedOn ?: mutableListOf(),
      category = this@ImagingSelectionSurrogate.category ?: mutableListOf(),
      code = this@ImagingSelectionSurrogate.code,
      studyUid =
        Id.of(this@ImagingSelectionSurrogate.studyUid, this@ImagingSelectionSurrogate._studyUid),
      derivedFrom = this@ImagingSelectionSurrogate.derivedFrom ?: mutableListOf(),
      endpoint = this@ImagingSelectionSurrogate.endpoint ?: mutableListOf(),
      seriesUid =
        Id.of(this@ImagingSelectionSurrogate.seriesUid, this@ImagingSelectionSurrogate._seriesUid),
      seriesNumber =
        UnsignedInt.of(
          this@ImagingSelectionSurrogate.seriesNumber,
          this@ImagingSelectionSurrogate._seriesNumber,
        ),
      frameOfReferenceUid =
        Id.of(
          this@ImagingSelectionSurrogate.frameOfReferenceUid,
          this@ImagingSelectionSurrogate._frameOfReferenceUid,
        ),
      bodySite = this@ImagingSelectionSurrogate.bodySite,
      focus = this@ImagingSelectionSurrogate.focus ?: mutableListOf(),
      instance = this@ImagingSelectionSurrogate.instance ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ImagingSelection): ImagingSelectionSurrogate =
      with(model) {
        ImagingSelectionSurrogate(
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
          subject = this@with.subject,
          issued = this@with.issued?.value?.toString(),
          _issued = this@with.issued?.toElement(),
          performer = this@with.performer.takeUnless { it.all { it == null } },
          basedOn = this@with.basedOn.takeUnless { it.all { it == null } },
          category = this@with.category.takeUnless { it.all { it == null } },
          code = this@with.code,
          studyUid = this@with.studyUid?.value,
          _studyUid = this@with.studyUid?.toElement(),
          derivedFrom = this@with.derivedFrom.takeUnless { it.all { it == null } },
          endpoint = this@with.endpoint.takeUnless { it.all { it == null } },
          seriesUid = this@with.seriesUid?.value,
          _seriesUid = this@with.seriesUid?.toElement(),
          seriesNumber = this@with.seriesNumber?.value,
          _seriesNumber = this@with.seriesNumber?.toElement(),
          frameOfReferenceUid = this@with.frameOfReferenceUid?.value,
          _frameOfReferenceUid = this@with.frameOfReferenceUid?.toElement(),
          bodySite = this@with.bodySite,
          focus = this@with.focus.takeUnless { it.all { it == null } },
          instance = this@with.instance.takeUnless { it.all { it == null } },
        )
      }
  }
}
