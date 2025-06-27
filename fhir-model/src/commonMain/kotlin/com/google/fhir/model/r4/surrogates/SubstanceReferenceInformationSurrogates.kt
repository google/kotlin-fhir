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

import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Quantity
import com.google.fhir.model.r4.Range
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.SubstanceReferenceInformation
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SubstanceReferenceInformationGeneSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var geneSequenceOrigin: CodeableConcept? = null,
  public var gene: CodeableConcept? = null,
  public var source: List<Reference?>? = null,
) {
  public fun toModel(): SubstanceReferenceInformation.Gene =
    SubstanceReferenceInformation.Gene().apply {
      id = this@SubstanceReferenceInformationGeneSurrogate.id
      extension = this@SubstanceReferenceInformationGeneSurrogate.extension
      modifierExtension = this@SubstanceReferenceInformationGeneSurrogate.modifierExtension
      geneSequenceOrigin = this@SubstanceReferenceInformationGeneSurrogate.geneSequenceOrigin
      gene = this@SubstanceReferenceInformationGeneSurrogate.gene
      source = this@SubstanceReferenceInformationGeneSurrogate.source
    }

  public companion object {
    public fun fromModel(
      model: SubstanceReferenceInformation.Gene
    ): SubstanceReferenceInformationGeneSurrogate =
      with(model) {
        SubstanceReferenceInformationGeneSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          geneSequenceOrigin = this@with.geneSequenceOrigin
          gene = this@with.gene
          source = this@with.source
        }
      }
  }
}

@Serializable
internal data class SubstanceReferenceInformationGeneElementSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: CodeableConcept? = null,
  public var element: Identifier? = null,
  public var source: List<Reference?>? = null,
) {
  public fun toModel(): SubstanceReferenceInformation.GeneElement =
    SubstanceReferenceInformation.GeneElement().apply {
      id = this@SubstanceReferenceInformationGeneElementSurrogate.id
      extension = this@SubstanceReferenceInformationGeneElementSurrogate.extension
      modifierExtension = this@SubstanceReferenceInformationGeneElementSurrogate.modifierExtension
      type = this@SubstanceReferenceInformationGeneElementSurrogate.type
      element = this@SubstanceReferenceInformationGeneElementSurrogate.element
      source = this@SubstanceReferenceInformationGeneElementSurrogate.source
    }

  public companion object {
    public fun fromModel(
      model: SubstanceReferenceInformation.GeneElement
    ): SubstanceReferenceInformationGeneElementSurrogate =
      with(model) {
        SubstanceReferenceInformationGeneElementSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          element = this@with.element
          source = this@with.source
        }
      }
  }
}

@Serializable
internal data class SubstanceReferenceInformationClassificationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var domain: CodeableConcept? = null,
  public var classification: CodeableConcept? = null,
  public var subtype: List<CodeableConcept?>? = null,
  public var source: List<Reference?>? = null,
) {
  public fun toModel(): SubstanceReferenceInformation.Classification =
    SubstanceReferenceInformation.Classification().apply {
      id = this@SubstanceReferenceInformationClassificationSurrogate.id
      extension = this@SubstanceReferenceInformationClassificationSurrogate.extension
      modifierExtension =
        this@SubstanceReferenceInformationClassificationSurrogate.modifierExtension
      domain = this@SubstanceReferenceInformationClassificationSurrogate.domain
      classification = this@SubstanceReferenceInformationClassificationSurrogate.classification
      subtype = this@SubstanceReferenceInformationClassificationSurrogate.subtype
      source = this@SubstanceReferenceInformationClassificationSurrogate.source
    }

  public companion object {
    public fun fromModel(
      model: SubstanceReferenceInformation.Classification
    ): SubstanceReferenceInformationClassificationSurrogate =
      with(model) {
        SubstanceReferenceInformationClassificationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          domain = this@with.domain
          classification = this@with.classification
          subtype = this@with.subtype
          source = this@with.source
        }
      }
  }
}

@Serializable
internal data class SubstanceReferenceInformationTargetSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var target: Identifier? = null,
  public var type: CodeableConcept? = null,
  public var interaction: CodeableConcept? = null,
  public var organism: CodeableConcept? = null,
  public var organismType: CodeableConcept? = null,
  public var amountQuantity: Quantity? = null,
  public var amountRange: Range? = null,
  public var amountString: KotlinString? = null,
  public var _amountString: Element? = null,
  public var amountType: CodeableConcept? = null,
  public var source: List<Reference?>? = null,
) {
  public fun toModel(): SubstanceReferenceInformation.Target =
    SubstanceReferenceInformation.Target().apply {
      id = this@SubstanceReferenceInformationTargetSurrogate.id
      extension = this@SubstanceReferenceInformationTargetSurrogate.extension
      modifierExtension = this@SubstanceReferenceInformationTargetSurrogate.modifierExtension
      target = this@SubstanceReferenceInformationTargetSurrogate.target
      type = this@SubstanceReferenceInformationTargetSurrogate.type
      interaction = this@SubstanceReferenceInformationTargetSurrogate.interaction
      organism = this@SubstanceReferenceInformationTargetSurrogate.organism
      organismType = this@SubstanceReferenceInformationTargetSurrogate.organismType
      amount =
        SubstanceReferenceInformation.Target.Amount?.from(
          this@SubstanceReferenceInformationTargetSurrogate.amountQuantity,
          this@SubstanceReferenceInformationTargetSurrogate.amountRange,
          R4String.of(
            this@SubstanceReferenceInformationTargetSurrogate.amountString,
            this@SubstanceReferenceInformationTargetSurrogate._amountString,
          ),
        )
      amountType = this@SubstanceReferenceInformationTargetSurrogate.amountType
      source = this@SubstanceReferenceInformationTargetSurrogate.source
    }

  public companion object {
    public fun fromModel(
      model: SubstanceReferenceInformation.Target
    ): SubstanceReferenceInformationTargetSurrogate =
      with(model) {
        SubstanceReferenceInformationTargetSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          target = this@with.target
          type = this@with.type
          interaction = this@with.interaction
          organism = this@with.organism
          organismType = this@with.organismType
          amountQuantity = this@with.amount?.asQuantity()?.value
          amountRange = this@with.amount?.asRange()?.value
          amountString = this@with.amount?.asString()?.value?.value
          _amountString = this@with.amount?.asString()?.value?.toElement()
          amountType = this@with.amountType
          source = this@with.source
        }
      }
  }
}

@Serializable
internal data class SubstanceReferenceInformationSurrogate(
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
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
  public var gene: List<SubstanceReferenceInformation.Gene>? = null,
  public var geneElement: List<SubstanceReferenceInformation.GeneElement>? = null,
  public var classification: List<SubstanceReferenceInformation.Classification>? = null,
  public var target: List<SubstanceReferenceInformation.Target>? = null,
) {
  public fun toModel(): SubstanceReferenceInformation =
    SubstanceReferenceInformation().apply {
      id = this@SubstanceReferenceInformationSurrogate.id
      meta = this@SubstanceReferenceInformationSurrogate.meta
      implicitRules =
        Uri.of(
          this@SubstanceReferenceInformationSurrogate.implicitRules,
          this@SubstanceReferenceInformationSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@SubstanceReferenceInformationSurrogate.language,
          this@SubstanceReferenceInformationSurrogate._language,
        )
      text = this@SubstanceReferenceInformationSurrogate.text
      contained = this@SubstanceReferenceInformationSurrogate.contained
      extension = this@SubstanceReferenceInformationSurrogate.extension
      modifierExtension = this@SubstanceReferenceInformationSurrogate.modifierExtension
      comment =
        R4String.of(
          this@SubstanceReferenceInformationSurrogate.comment,
          this@SubstanceReferenceInformationSurrogate._comment,
        )
      gene = this@SubstanceReferenceInformationSurrogate.gene
      geneElement = this@SubstanceReferenceInformationSurrogate.geneElement
      classification = this@SubstanceReferenceInformationSurrogate.classification
      target = this@SubstanceReferenceInformationSurrogate.target
    }

  public companion object {
    public fun fromModel(
      model: SubstanceReferenceInformation
    ): SubstanceReferenceInformationSurrogate =
      with(model) {
        SubstanceReferenceInformationSurrogate().apply {
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
          comment = this@with.comment?.value
          _comment = this@with.comment?.toElement()
          gene = this@with.gene
          geneElement = this@with.geneElement
          classification = this@with.classification
          target = this@with.target
        }
      }
  }
}
