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

import com.google.fhir.model.r4b.ClinicalUseDefinition
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.CodeableReference
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Markdown
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Range
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ClinicalUseDefinitionContraindicationOtherTherapySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var relationshipType: CodeableConcept,
  public var therapy: CodeableReference,
) {
  public fun toModel(): ClinicalUseDefinition.Contraindication.OtherTherapy =
    ClinicalUseDefinition.Contraindication.OtherTherapy(
      id = this@ClinicalUseDefinitionContraindicationOtherTherapySurrogate.id,
      extension =
        this@ClinicalUseDefinitionContraindicationOtherTherapySurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@ClinicalUseDefinitionContraindicationOtherTherapySurrogate.modifierExtension
          ?: mutableListOf(),
      relationshipType =
        this@ClinicalUseDefinitionContraindicationOtherTherapySurrogate.relationshipType,
      therapy = this@ClinicalUseDefinitionContraindicationOtherTherapySurrogate.therapy,
    )

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Contraindication.OtherTherapy
    ): ClinicalUseDefinitionContraindicationOtherTherapySurrogate =
      with(model) {
        ClinicalUseDefinitionContraindicationOtherTherapySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          relationshipType = this@with.relationshipType,
          therapy = this@with.therapy,
        )
      }
  }
}

@Serializable
internal data class ClinicalUseDefinitionContraindicationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var diseaseSymptomProcedure: CodeableReference? = null,
  public var diseaseStatus: CodeableReference? = null,
  public var comorbidity: MutableList<CodeableReference>? = null,
  public var indication: MutableList<Reference>? = null,
  public var otherTherapy: MutableList<ClinicalUseDefinition.Contraindication.OtherTherapy>? = null,
) {
  public fun toModel(): ClinicalUseDefinition.Contraindication =
    ClinicalUseDefinition.Contraindication(
      id = this@ClinicalUseDefinitionContraindicationSurrogate.id,
      extension = this@ClinicalUseDefinitionContraindicationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ClinicalUseDefinitionContraindicationSurrogate.modifierExtension ?: mutableListOf(),
      diseaseSymptomProcedure =
        this@ClinicalUseDefinitionContraindicationSurrogate.diseaseSymptomProcedure,
      diseaseStatus = this@ClinicalUseDefinitionContraindicationSurrogate.diseaseStatus,
      comorbidity =
        this@ClinicalUseDefinitionContraindicationSurrogate.comorbidity ?: mutableListOf(),
      indication =
        this@ClinicalUseDefinitionContraindicationSurrogate.indication ?: mutableListOf(),
      otherTherapy =
        this@ClinicalUseDefinitionContraindicationSurrogate.otherTherapy ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Contraindication
    ): ClinicalUseDefinitionContraindicationSurrogate =
      with(model) {
        ClinicalUseDefinitionContraindicationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          diseaseSymptomProcedure = this@with.diseaseSymptomProcedure,
          diseaseStatus = this@with.diseaseStatus,
          comorbidity = this@with.comorbidity.takeUnless { it.all { it == null } },
          indication = this@with.indication.takeUnless { it.all { it == null } },
          otherTherapy = this@with.otherTherapy.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ClinicalUseDefinitionIndicationDurationSurrogate(
  public var durationRange: Range? = null,
  public var durationString: KotlinString? = null,
  public var _durationString: Element? = null,
) {
  public fun toModel(): ClinicalUseDefinition.Indication.Duration =
    ClinicalUseDefinition.Indication.Duration?.from(
      this@ClinicalUseDefinitionIndicationDurationSurrogate.durationRange,
      R4bString.of(
        this@ClinicalUseDefinitionIndicationDurationSurrogate.durationString,
        this@ClinicalUseDefinitionIndicationDurationSurrogate._durationString,
      ),
    )!!

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Indication.Duration
    ): ClinicalUseDefinitionIndicationDurationSurrogate =
      with(model) {
        ClinicalUseDefinitionIndicationDurationSurrogate(
          durationRange = this@with.asRange()?.value,
          durationString = this@with.asString()?.value?.value,
          _durationString = this@with.asString()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ClinicalUseDefinitionIndicationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var diseaseSymptomProcedure: CodeableReference? = null,
  public var diseaseStatus: CodeableReference? = null,
  public var comorbidity: MutableList<CodeableReference>? = null,
  public var intendedEffect: CodeableReference? = null,
  public var duration: ClinicalUseDefinition.Indication.Duration? = null,
  public var undesirableEffect: MutableList<Reference>? = null,
  public var otherTherapy: MutableList<ClinicalUseDefinition.Contraindication.OtherTherapy>? = null,
) {
  public fun toModel(): ClinicalUseDefinition.Indication =
    ClinicalUseDefinition.Indication(
      id = this@ClinicalUseDefinitionIndicationSurrogate.id,
      extension = this@ClinicalUseDefinitionIndicationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ClinicalUseDefinitionIndicationSurrogate.modifierExtension ?: mutableListOf(),
      diseaseSymptomProcedure =
        this@ClinicalUseDefinitionIndicationSurrogate.diseaseSymptomProcedure,
      diseaseStatus = this@ClinicalUseDefinitionIndicationSurrogate.diseaseStatus,
      comorbidity = this@ClinicalUseDefinitionIndicationSurrogate.comorbidity ?: mutableListOf(),
      intendedEffect = this@ClinicalUseDefinitionIndicationSurrogate.intendedEffect,
      duration = this@ClinicalUseDefinitionIndicationSurrogate.duration,
      undesirableEffect =
        this@ClinicalUseDefinitionIndicationSurrogate.undesirableEffect ?: mutableListOf(),
      otherTherapy = this@ClinicalUseDefinitionIndicationSurrogate.otherTherapy ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Indication
    ): ClinicalUseDefinitionIndicationSurrogate =
      with(model) {
        ClinicalUseDefinitionIndicationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          diseaseSymptomProcedure = this@with.diseaseSymptomProcedure,
          diseaseStatus = this@with.diseaseStatus,
          comorbidity = this@with.comorbidity.takeUnless { it.all { it == null } },
          intendedEffect = this@with.intendedEffect,
          duration = this@with.duration,
          undesirableEffect = this@with.undesirableEffect.takeUnless { it.all { it == null } },
          otherTherapy = this@with.otherTherapy.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ClinicalUseDefinitionInteractionInteractantItemSurrogate(
  public var itemReference: Reference? = null,
  public var itemCodeableConcept: CodeableConcept? = null,
) {
  public fun toModel(): ClinicalUseDefinition.Interaction.Interactant.Item =
    ClinicalUseDefinition.Interaction.Interactant.Item.from(
      this@ClinicalUseDefinitionInteractionInteractantItemSurrogate.itemReference,
      this@ClinicalUseDefinitionInteractionInteractantItemSurrogate.itemCodeableConcept,
    )!! !!

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Interaction.Interactant.Item
    ): ClinicalUseDefinitionInteractionInteractantItemSurrogate =
      with(model) {
        ClinicalUseDefinitionInteractionInteractantItemSurrogate(
          itemReference = this@with.asReference()?.value,
          itemCodeableConcept = this@with.asCodeableConcept()?.value,
        )
      }
  }
}

@Serializable
internal data class ClinicalUseDefinitionInteractionInteractantSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var item: ClinicalUseDefinition.Interaction.Interactant.Item,
) {
  public fun toModel(): ClinicalUseDefinition.Interaction.Interactant =
    ClinicalUseDefinition.Interaction.Interactant(
      id = this@ClinicalUseDefinitionInteractionInteractantSurrogate.id,
      extension =
        this@ClinicalUseDefinitionInteractionInteractantSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ClinicalUseDefinitionInteractionInteractantSurrogate.modifierExtension
          ?: mutableListOf(),
      item = this@ClinicalUseDefinitionInteractionInteractantSurrogate.item,
    )

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Interaction.Interactant
    ): ClinicalUseDefinitionInteractionInteractantSurrogate =
      with(model) {
        ClinicalUseDefinitionInteractionInteractantSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          item = this@with.item,
        )
      }
  }
}

@Serializable
internal data class ClinicalUseDefinitionInteractionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var interactant: MutableList<ClinicalUseDefinition.Interaction.Interactant>? = null,
  public var type: CodeableConcept? = null,
  public var effect: CodeableReference? = null,
  public var incidence: CodeableConcept? = null,
  public var management: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): ClinicalUseDefinition.Interaction =
    ClinicalUseDefinition.Interaction(
      id = this@ClinicalUseDefinitionInteractionSurrogate.id,
      extension = this@ClinicalUseDefinitionInteractionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ClinicalUseDefinitionInteractionSurrogate.modifierExtension ?: mutableListOf(),
      interactant = this@ClinicalUseDefinitionInteractionSurrogate.interactant ?: mutableListOf(),
      type = this@ClinicalUseDefinitionInteractionSurrogate.type,
      effect = this@ClinicalUseDefinitionInteractionSurrogate.effect,
      incidence = this@ClinicalUseDefinitionInteractionSurrogate.incidence,
      management = this@ClinicalUseDefinitionInteractionSurrogate.management ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Interaction
    ): ClinicalUseDefinitionInteractionSurrogate =
      with(model) {
        ClinicalUseDefinitionInteractionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          interactant = this@with.interactant.takeUnless { it.all { it == null } },
          type = this@with.type,
          effect = this@with.effect,
          incidence = this@with.incidence,
          management = this@with.management.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ClinicalUseDefinitionUndesirableEffectSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var symptomConditionEffect: CodeableReference? = null,
  public var classification: CodeableConcept? = null,
  public var frequencyOfOccurrence: CodeableConcept? = null,
) {
  public fun toModel(): ClinicalUseDefinition.UndesirableEffect =
    ClinicalUseDefinition.UndesirableEffect(
      id = this@ClinicalUseDefinitionUndesirableEffectSurrogate.id,
      extension = this@ClinicalUseDefinitionUndesirableEffectSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ClinicalUseDefinitionUndesirableEffectSurrogate.modifierExtension ?: mutableListOf(),
      symptomConditionEffect =
        this@ClinicalUseDefinitionUndesirableEffectSurrogate.symptomConditionEffect,
      classification = this@ClinicalUseDefinitionUndesirableEffectSurrogate.classification,
      frequencyOfOccurrence =
        this@ClinicalUseDefinitionUndesirableEffectSurrogate.frequencyOfOccurrence,
    )

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.UndesirableEffect
    ): ClinicalUseDefinitionUndesirableEffectSurrogate =
      with(model) {
        ClinicalUseDefinitionUndesirableEffectSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          symptomConditionEffect = this@with.symptomConditionEffect,
          classification = this@with.classification,
          frequencyOfOccurrence = this@with.frequencyOfOccurrence,
        )
      }
  }
}

@Serializable
internal data class ClinicalUseDefinitionWarningSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var code: CodeableConcept? = null,
) {
  public fun toModel(): ClinicalUseDefinition.Warning =
    ClinicalUseDefinition.Warning(
      id = this@ClinicalUseDefinitionWarningSurrogate.id,
      extension = this@ClinicalUseDefinitionWarningSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ClinicalUseDefinitionWarningSurrogate.modifierExtension ?: mutableListOf(),
      description =
        Markdown.of(
          this@ClinicalUseDefinitionWarningSurrogate.description,
          this@ClinicalUseDefinitionWarningSurrogate._description,
        ),
      code = this@ClinicalUseDefinitionWarningSurrogate.code,
    )

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Warning
    ): ClinicalUseDefinitionWarningSurrogate =
      with(model) {
        ClinicalUseDefinitionWarningSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          code = this@with.code,
        )
      }
  }
}

@Serializable
internal data class ClinicalUseDefinitionSurrogate(
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
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var category: MutableList<CodeableConcept>? = null,
  public var subject: MutableList<Reference>? = null,
  public var status: CodeableConcept? = null,
  public var contraindication: ClinicalUseDefinition.Contraindication? = null,
  public var indication: ClinicalUseDefinition.Indication? = null,
  public var interaction: ClinicalUseDefinition.Interaction? = null,
  public var population: MutableList<Reference>? = null,
  public var undesirableEffect: ClinicalUseDefinition.UndesirableEffect? = null,
  public var warning: ClinicalUseDefinition.Warning? = null,
) {
  public fun toModel(): ClinicalUseDefinition =
    ClinicalUseDefinition(
      id = this@ClinicalUseDefinitionSurrogate.id,
      meta = this@ClinicalUseDefinitionSurrogate.meta,
      implicitRules =
        Uri.of(
          this@ClinicalUseDefinitionSurrogate.implicitRules,
          this@ClinicalUseDefinitionSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@ClinicalUseDefinitionSurrogate.language,
          this@ClinicalUseDefinitionSurrogate._language,
        ),
      text = this@ClinicalUseDefinitionSurrogate.text,
      contained = this@ClinicalUseDefinitionSurrogate.contained ?: mutableListOf(),
      extension = this@ClinicalUseDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ClinicalUseDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ClinicalUseDefinitionSurrogate.identifier ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r4b.ClinicalUseDefinition.ClinicalUseDefinitionType.fromCode(
            this@ClinicalUseDefinitionSurrogate.type!!
          ),
          this@ClinicalUseDefinitionSurrogate._type,
        ),
      category = this@ClinicalUseDefinitionSurrogate.category ?: mutableListOf(),
      subject = this@ClinicalUseDefinitionSurrogate.subject ?: mutableListOf(),
      status = this@ClinicalUseDefinitionSurrogate.status,
      contraindication = this@ClinicalUseDefinitionSurrogate.contraindication,
      indication = this@ClinicalUseDefinitionSurrogate.indication,
      interaction = this@ClinicalUseDefinitionSurrogate.interaction,
      population = this@ClinicalUseDefinitionSurrogate.population ?: mutableListOf(),
      undesirableEffect = this@ClinicalUseDefinitionSurrogate.undesirableEffect,
      warning = this@ClinicalUseDefinitionSurrogate.warning,
    )

  public companion object {
    public fun fromModel(model: ClinicalUseDefinition): ClinicalUseDefinitionSurrogate =
      with(model) {
        ClinicalUseDefinitionSurrogate(
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
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          category = this@with.category.takeUnless { it.all { it == null } },
          subject = this@with.subject.takeUnless { it.all { it == null } },
          status = this@with.status,
          contraindication = this@with.contraindication,
          indication = this@with.indication,
          interaction = this@with.interaction,
          population = this@with.population.takeUnless { it.all { it == null } },
          undesirableEffect = this@with.undesirableEffect,
          warning = this@with.warning,
        )
      }
  }
}
