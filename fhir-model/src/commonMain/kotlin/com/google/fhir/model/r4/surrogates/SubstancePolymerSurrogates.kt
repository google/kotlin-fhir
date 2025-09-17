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

import com.google.fhir.model.r4.Attachment
import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Integer
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.SubstanceAmount
import com.google.fhir.model.r4.SubstancePolymer
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SubstancePolymerMonomerSetSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var ratioType: CodeableConcept? = null,
  public var startingMaterial: MutableList<SubstancePolymer.MonomerSet.StartingMaterial>? = null,
) {
  public fun toModel(): SubstancePolymer.MonomerSet =
    SubstancePolymer.MonomerSet(
      id = this@SubstancePolymerMonomerSetSurrogate.id,
      extension = this@SubstancePolymerMonomerSetSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstancePolymerMonomerSetSurrogate.modifierExtension ?: mutableListOf(),
      ratioType = this@SubstancePolymerMonomerSetSurrogate.ratioType,
      startingMaterial =
        this@SubstancePolymerMonomerSetSurrogate.startingMaterial ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: SubstancePolymer.MonomerSet): SubstancePolymerMonomerSetSurrogate =
      with(model) {
        SubstancePolymerMonomerSetSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          ratioType = this@with.ratioType,
          startingMaterial = this@with.startingMaterial.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class SubstancePolymerMonomerSetStartingMaterialSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var material: CodeableConcept? = null,
  public var type: CodeableConcept? = null,
  public var isDefining: KotlinBoolean? = null,
  public var _isDefining: Element? = null,
  public var amount: SubstanceAmount? = null,
) {
  public fun toModel(): SubstancePolymer.MonomerSet.StartingMaterial =
    SubstancePolymer.MonomerSet.StartingMaterial(
      id = this@SubstancePolymerMonomerSetStartingMaterialSurrogate.id,
      extension =
        this@SubstancePolymerMonomerSetStartingMaterialSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstancePolymerMonomerSetStartingMaterialSurrogate.modifierExtension
          ?: mutableListOf(),
      material = this@SubstancePolymerMonomerSetStartingMaterialSurrogate.material,
      type = this@SubstancePolymerMonomerSetStartingMaterialSurrogate.type,
      isDefining =
        R4Boolean.of(
          this@SubstancePolymerMonomerSetStartingMaterialSurrogate.isDefining,
          this@SubstancePolymerMonomerSetStartingMaterialSurrogate._isDefining,
        ),
      amount = this@SubstancePolymerMonomerSetStartingMaterialSurrogate.amount,
    )

  public companion object {
    public fun fromModel(
      model: SubstancePolymer.MonomerSet.StartingMaterial
    ): SubstancePolymerMonomerSetStartingMaterialSurrogate =
      with(model) {
        SubstancePolymerMonomerSetStartingMaterialSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          material = this@with.material,
          type = this@with.type,
          isDefining = this@with.isDefining?.value,
          _isDefining = this@with.isDefining?.toElement(),
          amount = this@with.amount,
        )
      }
  }
}

@Serializable
internal data class SubstancePolymerRepeatSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var numberOfUnits: Int? = null,
  public var _numberOfUnits: Element? = null,
  public var averageMolecularFormula: KotlinString? = null,
  public var _averageMolecularFormula: Element? = null,
  public var repeatUnitAmountType: CodeableConcept? = null,
  public var repeatUnit: MutableList<SubstancePolymer.Repeat.RepeatUnit>? = null,
) {
  public fun toModel(): SubstancePolymer.Repeat =
    SubstancePolymer.Repeat(
      id = this@SubstancePolymerRepeatSurrogate.id,
      extension = this@SubstancePolymerRepeatSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@SubstancePolymerRepeatSurrogate.modifierExtension ?: mutableListOf(),
      numberOfUnits =
        Integer.of(
          this@SubstancePolymerRepeatSurrogate.numberOfUnits,
          this@SubstancePolymerRepeatSurrogate._numberOfUnits,
        ),
      averageMolecularFormula =
        R4String.of(
          this@SubstancePolymerRepeatSurrogate.averageMolecularFormula,
          this@SubstancePolymerRepeatSurrogate._averageMolecularFormula,
        ),
      repeatUnitAmountType = this@SubstancePolymerRepeatSurrogate.repeatUnitAmountType,
      repeatUnit = this@SubstancePolymerRepeatSurrogate.repeatUnit ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: SubstancePolymer.Repeat): SubstancePolymerRepeatSurrogate =
      with(model) {
        SubstancePolymerRepeatSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          numberOfUnits = this@with.numberOfUnits?.value,
          _numberOfUnits = this@with.numberOfUnits?.toElement(),
          averageMolecularFormula = this@with.averageMolecularFormula?.value,
          _averageMolecularFormula = this@with.averageMolecularFormula?.toElement(),
          repeatUnitAmountType = this@with.repeatUnitAmountType,
          repeatUnit = this@with.repeatUnit.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class SubstancePolymerRepeatRepeatUnitSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var orientationOfPolymerisation: CodeableConcept? = null,
  public var repeatUnit: KotlinString? = null,
  public var _repeatUnit: Element? = null,
  public var amount: SubstanceAmount? = null,
  public var degreeOfPolymerisation:
    MutableList<SubstancePolymer.Repeat.RepeatUnit.DegreeOfPolymerisation>? =
    null,
  public var structuralRepresentation:
    MutableList<SubstancePolymer.Repeat.RepeatUnit.StructuralRepresentation>? =
    null,
) {
  public fun toModel(): SubstancePolymer.Repeat.RepeatUnit =
    SubstancePolymer.Repeat.RepeatUnit(
      id = this@SubstancePolymerRepeatRepeatUnitSurrogate.id,
      extension = this@SubstancePolymerRepeatRepeatUnitSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstancePolymerRepeatRepeatUnitSurrogate.modifierExtension ?: mutableListOf(),
      orientationOfPolymerisation =
        this@SubstancePolymerRepeatRepeatUnitSurrogate.orientationOfPolymerisation,
      repeatUnit =
        R4String.of(
          this@SubstancePolymerRepeatRepeatUnitSurrogate.repeatUnit,
          this@SubstancePolymerRepeatRepeatUnitSurrogate._repeatUnit,
        ),
      amount = this@SubstancePolymerRepeatRepeatUnitSurrogate.amount,
      degreeOfPolymerisation =
        this@SubstancePolymerRepeatRepeatUnitSurrogate.degreeOfPolymerisation ?: mutableListOf(),
      structuralRepresentation =
        this@SubstancePolymerRepeatRepeatUnitSurrogate.structuralRepresentation ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: SubstancePolymer.Repeat.RepeatUnit
    ): SubstancePolymerRepeatRepeatUnitSurrogate =
      with(model) {
        SubstancePolymerRepeatRepeatUnitSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          orientationOfPolymerisation = this@with.orientationOfPolymerisation,
          repeatUnit = this@with.repeatUnit?.value,
          _repeatUnit = this@with.repeatUnit?.toElement(),
          amount = this@with.amount,
          degreeOfPolymerisation =
            this@with.degreeOfPolymerisation.takeUnless { it.all { it == null } },
          structuralRepresentation =
            this@with.structuralRepresentation.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var degree: CodeableConcept? = null,
  public var amount: SubstanceAmount? = null,
) {
  public fun toModel(): SubstancePolymer.Repeat.RepeatUnit.DegreeOfPolymerisation =
    SubstancePolymer.Repeat.RepeatUnit.DegreeOfPolymerisation(
      id = this@SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationSurrogate.id,
      extension =
        this@SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationSurrogate.modifierExtension
          ?: mutableListOf(),
      degree = this@SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationSurrogate.degree,
      amount = this@SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationSurrogate.amount,
    )

  public companion object {
    public fun fromModel(
      model: SubstancePolymer.Repeat.RepeatUnit.DegreeOfPolymerisation
    ): SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationSurrogate =
      with(model) {
        SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          degree = this@with.degree,
          amount = this@with.amount,
        )
      }
  }
}

@Serializable
internal data class SubstancePolymerRepeatRepeatUnitStructuralRepresentationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var representation: KotlinString? = null,
  public var _representation: Element? = null,
  public var attachment: Attachment? = null,
) {
  public fun toModel(): SubstancePolymer.Repeat.RepeatUnit.StructuralRepresentation =
    SubstancePolymer.Repeat.RepeatUnit.StructuralRepresentation(
      id = this@SubstancePolymerRepeatRepeatUnitStructuralRepresentationSurrogate.id,
      extension =
        this@SubstancePolymerRepeatRepeatUnitStructuralRepresentationSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@SubstancePolymerRepeatRepeatUnitStructuralRepresentationSurrogate.modifierExtension
          ?: mutableListOf(),
      type = this@SubstancePolymerRepeatRepeatUnitStructuralRepresentationSurrogate.type,
      representation =
        R4String.of(
          this@SubstancePolymerRepeatRepeatUnitStructuralRepresentationSurrogate.representation,
          this@SubstancePolymerRepeatRepeatUnitStructuralRepresentationSurrogate._representation,
        ),
      attachment = this@SubstancePolymerRepeatRepeatUnitStructuralRepresentationSurrogate.attachment,
    )

  public companion object {
    public fun fromModel(
      model: SubstancePolymer.Repeat.RepeatUnit.StructuralRepresentation
    ): SubstancePolymerRepeatRepeatUnitStructuralRepresentationSurrogate =
      with(model) {
        SubstancePolymerRepeatRepeatUnitStructuralRepresentationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          representation = this@with.representation?.value,
          _representation = this@with.representation?.toElement(),
          attachment = this@with.attachment,
        )
      }
  }
}

@Serializable
internal data class SubstancePolymerSurrogate(
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
  public var `class`: CodeableConcept? = null,
  public var geometry: CodeableConcept? = null,
  public var copolymerConnectivity: MutableList<CodeableConcept>? = null,
  public var modification: MutableList<KotlinString?>? = null,
  public var _modification: MutableList<Element?>? = null,
  public var monomerSet: MutableList<SubstancePolymer.MonomerSet>? = null,
  public var repeat: MutableList<SubstancePolymer.Repeat>? = null,
) {
  public fun toModel(): SubstancePolymer =
    SubstancePolymer(
      id = this@SubstancePolymerSurrogate.id,
      meta = this@SubstancePolymerSurrogate.meta,
      implicitRules =
        Uri.of(
          this@SubstancePolymerSurrogate.implicitRules,
          this@SubstancePolymerSurrogate._implicitRules,
        ),
      language =
        Code.of(this@SubstancePolymerSurrogate.language, this@SubstancePolymerSurrogate._language),
      text = this@SubstancePolymerSurrogate.text,
      contained = this@SubstancePolymerSurrogate.contained ?: mutableListOf(),
      extension = this@SubstancePolymerSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@SubstancePolymerSurrogate.modifierExtension ?: mutableListOf(),
      `class` = this@SubstancePolymerSurrogate.`class`,
      geometry = this@SubstancePolymerSurrogate.geometry,
      copolymerConnectivity =
        this@SubstancePolymerSurrogate.copolymerConnectivity ?: mutableListOf(),
      modification =
        if (
          this@SubstancePolymerSurrogate.modification == null &&
            this@SubstancePolymerSurrogate._modification == null
        ) {
          mutableListOf()
        } else {
          (this@SubstancePolymerSurrogate.modification
              ?: List(this@SubstancePolymerSurrogate._modification!!.size) { null })
            .zip(
              this@SubstancePolymerSurrogate._modification
                ?: List(this@SubstancePolymerSurrogate.modification!!.size) { null }
            )
            .map { (value, element) -> R4String.of(value, element)!! }
            .toMutableList()
        },
      monomerSet = this@SubstancePolymerSurrogate.monomerSet ?: mutableListOf(),
      repeat = this@SubstancePolymerSurrogate.repeat ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: SubstancePolymer): SubstancePolymerSurrogate =
      with(model) {
        SubstancePolymerSurrogate(
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
          `class` = this@with.`class`,
          geometry = this@with.geometry,
          copolymerConnectivity =
            this@with.copolymerConnectivity.takeUnless { it.all { it == null } },
          modification =
            this@with.modification
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _modification =
            this@with.modification
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          monomerSet = this@with.monomerSet.takeUnless { it.all { it == null } },
          repeat = this@with.repeat.takeUnless { it.all { it == null } },
        )
      }
  }
}
