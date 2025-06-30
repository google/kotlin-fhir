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

import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.ClinicalUseDefinition
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Expression
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Range
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ClinicalUseDefinitionContraindicationOtherTherapySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var relationshipType: CodeableConcept? = null,
  public var treatment: CodeableReference? = null,
) {
  public fun toModel(): ClinicalUseDefinition.Contraindication.OtherTherapy =
    ClinicalUseDefinition.Contraindication.OtherTherapy().apply {
      id = this@ClinicalUseDefinitionContraindicationOtherTherapySurrogate.id
      extension = this@ClinicalUseDefinitionContraindicationOtherTherapySurrogate.extension
      modifierExtension =
        this@ClinicalUseDefinitionContraindicationOtherTherapySurrogate.modifierExtension
      relationshipType =
        this@ClinicalUseDefinitionContraindicationOtherTherapySurrogate.relationshipType
      treatment = this@ClinicalUseDefinitionContraindicationOtherTherapySurrogate.treatment
    }

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Contraindication.OtherTherapy
    ): ClinicalUseDefinitionContraindicationOtherTherapySurrogate =
      with(model) {
        ClinicalUseDefinitionContraindicationOtherTherapySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          relationshipType = this@with.relationshipType
          treatment = this@with.treatment
        }
      }
  }
}

@Serializable
internal data class ClinicalUseDefinitionContraindicationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var diseaseSymptomProcedure: CodeableReference? = null,
  public var diseaseStatus: CodeableReference? = null,
  public var comorbidity: List<CodeableReference?>? = null,
  public var indication: List<Reference?>? = null,
  public var applicability: Expression? = null,
  public var otherTherapy: List<ClinicalUseDefinition.Contraindication.OtherTherapy>? = null,
) {
  public fun toModel(): ClinicalUseDefinition.Contraindication =
    ClinicalUseDefinition.Contraindication().apply {
      id = this@ClinicalUseDefinitionContraindicationSurrogate.id
      extension = this@ClinicalUseDefinitionContraindicationSurrogate.extension
      modifierExtension = this@ClinicalUseDefinitionContraindicationSurrogate.modifierExtension
      diseaseSymptomProcedure =
        this@ClinicalUseDefinitionContraindicationSurrogate.diseaseSymptomProcedure
      diseaseStatus = this@ClinicalUseDefinitionContraindicationSurrogate.diseaseStatus
      comorbidity = this@ClinicalUseDefinitionContraindicationSurrogate.comorbidity
      indication = this@ClinicalUseDefinitionContraindicationSurrogate.indication
      applicability = this@ClinicalUseDefinitionContraindicationSurrogate.applicability
      otherTherapy = this@ClinicalUseDefinitionContraindicationSurrogate.otherTherapy
    }

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Contraindication
    ): ClinicalUseDefinitionContraindicationSurrogate =
      with(model) {
        ClinicalUseDefinitionContraindicationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          diseaseSymptomProcedure = this@with.diseaseSymptomProcedure
          diseaseStatus = this@with.diseaseStatus
          comorbidity = this@with.comorbidity
          indication = this@with.indication
          applicability = this@with.applicability
          otherTherapy = this@with.otherTherapy
        }
      }
  }
}

@Serializable
internal class ClinicalUseDefinitionIndicationDurationSurrogate {
  public var durationRange: Range? = null

  public var durationString: KotlinString? = null

  public var _durationString: Element? = null

  public fun toModel(): ClinicalUseDefinition.Indication.Duration =
    ClinicalUseDefinition.Indication.Duration?.from(
      this@ClinicalUseDefinitionIndicationDurationSurrogate.durationRange,
      R5String.of(
        this@ClinicalUseDefinitionIndicationDurationSurrogate.durationString,
        this@ClinicalUseDefinitionIndicationDurationSurrogate._durationString,
      ),
    ) ?: ClinicalUseDefinition.Indication.Duration.Null

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Indication.Duration
    ): ClinicalUseDefinitionIndicationDurationSurrogate =
      with(model) {
        ClinicalUseDefinitionIndicationDurationSurrogate().apply {
          durationRange = this@with.asRange()?.value
          durationString = this@with.asString()?.value?.value
          _durationString = this@with.asString()?.value?.toElement()
        }
      }
  }
}

@Serializable
internal data class ClinicalUseDefinitionIndicationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var diseaseSymptomProcedure: CodeableReference? = null,
  public var diseaseStatus: CodeableReference? = null,
  public var comorbidity: List<CodeableReference?>? = null,
  public var intendedEffect: CodeableReference? = null,
  public var undesirableEffect: List<Reference?>? = null,
  public var applicability: Expression? = null,
  public var otherTherapy: List<ClinicalUseDefinition.Contraindication.OtherTherapy?>? = null,
  public var duration: ClinicalUseDefinition.Indication.Duration? = null,
) {
  public fun toModel(): ClinicalUseDefinition.Indication =
    ClinicalUseDefinition.Indication().apply {
      id = this@ClinicalUseDefinitionIndicationSurrogate.id
      extension = this@ClinicalUseDefinitionIndicationSurrogate.extension
      modifierExtension = this@ClinicalUseDefinitionIndicationSurrogate.modifierExtension
      diseaseSymptomProcedure =
        this@ClinicalUseDefinitionIndicationSurrogate.diseaseSymptomProcedure
      diseaseStatus = this@ClinicalUseDefinitionIndicationSurrogate.diseaseStatus
      comorbidity = this@ClinicalUseDefinitionIndicationSurrogate.comorbidity
      intendedEffect = this@ClinicalUseDefinitionIndicationSurrogate.intendedEffect
      duration = this@ClinicalUseDefinitionIndicationSurrogate.duration
      undesirableEffect = this@ClinicalUseDefinitionIndicationSurrogate.undesirableEffect
      applicability = this@ClinicalUseDefinitionIndicationSurrogate.applicability
      otherTherapy = this@ClinicalUseDefinitionIndicationSurrogate.otherTherapy
    }

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Indication
    ): ClinicalUseDefinitionIndicationSurrogate =
      with(model) {
        ClinicalUseDefinitionIndicationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          diseaseSymptomProcedure = this@with.diseaseSymptomProcedure
          diseaseStatus = this@with.diseaseStatus
          comorbidity = this@with.comorbidity
          intendedEffect = this@with.intendedEffect
          duration = this@with.duration
          undesirableEffect = this@with.undesirableEffect
          applicability = this@with.applicability
          otherTherapy = this@with.otherTherapy
        }
      }
  }
}

@Serializable
internal class ClinicalUseDefinitionInteractionInteractantItemSurrogate {
  public var itemReference: Reference? = null

  public var itemCodeableConcept: CodeableConcept? = null

  public fun toModel(): ClinicalUseDefinition.Interaction.Interactant.Item =
    ClinicalUseDefinition.Interaction.Interactant.Item?.from(
      this@ClinicalUseDefinitionInteractionInteractantItemSurrogate.itemReference,
      this@ClinicalUseDefinitionInteractionInteractantItemSurrogate.itemCodeableConcept,
    ) ?: ClinicalUseDefinition.Interaction.Interactant.Item.Null

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Interaction.Interactant.Item
    ): ClinicalUseDefinitionInteractionInteractantItemSurrogate =
      with(model) {
        ClinicalUseDefinitionInteractionInteractantItemSurrogate().apply {
          itemReference = this@with.asReference()?.value
          itemCodeableConcept = this@with.asCodeableConcept()?.value
        }
      }
  }
}

@Serializable
internal data class ClinicalUseDefinitionInteractionInteractantSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var item: ClinicalUseDefinition.Interaction.Interactant.Item? = null,
) {
  public fun toModel(): ClinicalUseDefinition.Interaction.Interactant =
    ClinicalUseDefinition.Interaction.Interactant().apply {
      id = this@ClinicalUseDefinitionInteractionInteractantSurrogate.id
      extension = this@ClinicalUseDefinitionInteractionInteractantSurrogate.extension
      modifierExtension =
        this@ClinicalUseDefinitionInteractionInteractantSurrogate.modifierExtension
      item = this@ClinicalUseDefinitionInteractionInteractantSurrogate.item
    }

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Interaction.Interactant
    ): ClinicalUseDefinitionInteractionInteractantSurrogate =
      with(model) {
        ClinicalUseDefinitionInteractionInteractantSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          item = this@with.item
        }
      }
  }
}

@Serializable
internal data class ClinicalUseDefinitionInteractionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var interactant: List<ClinicalUseDefinition.Interaction.Interactant>? = null,
  public var type: CodeableConcept? = null,
  public var effect: CodeableReference? = null,
  public var incidence: CodeableConcept? = null,
  public var management: List<CodeableConcept?>? = null,
) {
  public fun toModel(): ClinicalUseDefinition.Interaction =
    ClinicalUseDefinition.Interaction().apply {
      id = this@ClinicalUseDefinitionInteractionSurrogate.id
      extension = this@ClinicalUseDefinitionInteractionSurrogate.extension
      modifierExtension = this@ClinicalUseDefinitionInteractionSurrogate.modifierExtension
      interactant = this@ClinicalUseDefinitionInteractionSurrogate.interactant
      type = this@ClinicalUseDefinitionInteractionSurrogate.type
      effect = this@ClinicalUseDefinitionInteractionSurrogate.effect
      incidence = this@ClinicalUseDefinitionInteractionSurrogate.incidence
      management = this@ClinicalUseDefinitionInteractionSurrogate.management
    }

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Interaction
    ): ClinicalUseDefinitionInteractionSurrogate =
      with(model) {
        ClinicalUseDefinitionInteractionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          interactant = this@with.interactant
          type = this@with.type
          effect = this@with.effect
          incidence = this@with.incidence
          management = this@with.management
        }
      }
  }
}

@Serializable
internal data class ClinicalUseDefinitionUndesirableEffectSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var symptomConditionEffect: CodeableReference? = null,
  public var classification: CodeableConcept? = null,
  public var frequencyOfOccurrence: CodeableConcept? = null,
) {
  public fun toModel(): ClinicalUseDefinition.UndesirableEffect =
    ClinicalUseDefinition.UndesirableEffect().apply {
      id = this@ClinicalUseDefinitionUndesirableEffectSurrogate.id
      extension = this@ClinicalUseDefinitionUndesirableEffectSurrogate.extension
      modifierExtension = this@ClinicalUseDefinitionUndesirableEffectSurrogate.modifierExtension
      symptomConditionEffect =
        this@ClinicalUseDefinitionUndesirableEffectSurrogate.symptomConditionEffect
      classification = this@ClinicalUseDefinitionUndesirableEffectSurrogate.classification
      frequencyOfOccurrence =
        this@ClinicalUseDefinitionUndesirableEffectSurrogate.frequencyOfOccurrence
    }

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.UndesirableEffect
    ): ClinicalUseDefinitionUndesirableEffectSurrogate =
      with(model) {
        ClinicalUseDefinitionUndesirableEffectSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          symptomConditionEffect = this@with.symptomConditionEffect
          classification = this@with.classification
          frequencyOfOccurrence = this@with.frequencyOfOccurrence
        }
      }
  }
}

@Serializable
internal data class ClinicalUseDefinitionWarningSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var code: CodeableConcept? = null,
) {
  public fun toModel(): ClinicalUseDefinition.Warning =
    ClinicalUseDefinition.Warning().apply {
      id = this@ClinicalUseDefinitionWarningSurrogate.id
      extension = this@ClinicalUseDefinitionWarningSurrogate.extension
      modifierExtension = this@ClinicalUseDefinitionWarningSurrogate.modifierExtension
      description =
        Markdown.of(
          this@ClinicalUseDefinitionWarningSurrogate.description,
          this@ClinicalUseDefinitionWarningSurrogate._description,
        )
      code = this@ClinicalUseDefinitionWarningSurrogate.code
    }

  public companion object {
    public fun fromModel(
      model: ClinicalUseDefinition.Warning
    ): ClinicalUseDefinitionWarningSurrogate =
      with(model) {
        ClinicalUseDefinitionWarningSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          code = this@with.code
        }
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
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var identifier: List<Identifier?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var subject: List<Reference?>? = null,
  public var status: CodeableConcept? = null,
  public var contraindication: ClinicalUseDefinition.Contraindication? = null,
  public var indication: ClinicalUseDefinition.Indication? = null,
  public var interaction: ClinicalUseDefinition.Interaction? = null,
  public var population: List<Reference?>? = null,
  public var library: List<KotlinString?>? = null,
  public var _library: List<Element?>? = null,
  public var undesirableEffect: ClinicalUseDefinition.UndesirableEffect? = null,
  public var warning: ClinicalUseDefinition.Warning? = null,
) {
  public fun toModel(): ClinicalUseDefinition =
    ClinicalUseDefinition().apply {
      id = this@ClinicalUseDefinitionSurrogate.id
      meta = this@ClinicalUseDefinitionSurrogate.meta
      implicitRules =
        Uri.of(
          this@ClinicalUseDefinitionSurrogate.implicitRules,
          this@ClinicalUseDefinitionSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@ClinicalUseDefinitionSurrogate.language,
          this@ClinicalUseDefinitionSurrogate._language,
        )
      text = this@ClinicalUseDefinitionSurrogate.text
      contained = this@ClinicalUseDefinitionSurrogate.contained
      extension = this@ClinicalUseDefinitionSurrogate.extension
      modifierExtension = this@ClinicalUseDefinitionSurrogate.modifierExtension
      identifier = this@ClinicalUseDefinitionSurrogate.identifier
      type =
        Enumeration.of(
          this@ClinicalUseDefinitionSurrogate.type?.let {
            com.google.fhir.model.r5.ClinicalUseDefinition.ClinicalUseDefinitionType.fromCode(it)
          },
          this@ClinicalUseDefinitionSurrogate._type,
        )
      category = this@ClinicalUseDefinitionSurrogate.category
      subject = this@ClinicalUseDefinitionSurrogate.subject
      status = this@ClinicalUseDefinitionSurrogate.status
      contraindication = this@ClinicalUseDefinitionSurrogate.contraindication
      indication = this@ClinicalUseDefinitionSurrogate.indication
      interaction = this@ClinicalUseDefinitionSurrogate.interaction
      population = this@ClinicalUseDefinitionSurrogate.population
      library =
        if (
          this@ClinicalUseDefinitionSurrogate.library == null &&
            this@ClinicalUseDefinitionSurrogate._library == null
        ) {
          null
        } else {
          (this@ClinicalUseDefinitionSurrogate.library
              ?: List(this@ClinicalUseDefinitionSurrogate._library!!.size) { null })
            .zip(
              this@ClinicalUseDefinitionSurrogate._library
                ?: List(this@ClinicalUseDefinitionSurrogate.library!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      undesirableEffect = this@ClinicalUseDefinitionSurrogate.undesirableEffect
      warning = this@ClinicalUseDefinitionSurrogate.warning
    }

  public companion object {
    public fun fromModel(model: ClinicalUseDefinition): ClinicalUseDefinitionSurrogate =
      with(model) {
        ClinicalUseDefinitionSurrogate().apply {
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
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          category = this@with.category
          subject = this@with.subject
          status = this@with.status
          contraindication = this@with.contraindication
          indication = this@with.indication
          interaction = this@with.interaction
          population = this@with.population
          library = this@with.library?.map { it?.value }?.takeUnless { it.all { it == null } }
          _library =
            this@with.library?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          undesirableEffect = this@with.undesirableEffect
          warning = this@with.warning
        }
      }
  }
}
