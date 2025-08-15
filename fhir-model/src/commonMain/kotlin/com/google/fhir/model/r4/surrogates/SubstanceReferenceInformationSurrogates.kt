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
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SubstanceReferenceInformationGeneSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var geneSequenceOrigin: CodeableConcept? = null,
  public var gene: CodeableConcept? = null,
  public var source: MutableList<Reference>? = null,
) {
  public fun toModel(): SubstanceReferenceInformation.Gene =
    SubstanceReferenceInformation.Gene(
      id = this@SubstanceReferenceInformationGeneSurrogate.id,
      extension = this@SubstanceReferenceInformationGeneSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceReferenceInformationGeneSurrogate.modifierExtension ?: mutableListOf(),
      geneSequenceOrigin = this@SubstanceReferenceInformationGeneSurrogate.geneSequenceOrigin,
      gene = this@SubstanceReferenceInformationGeneSurrogate.gene,
      source = this@SubstanceReferenceInformationGeneSurrogate.source ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: SubstanceReferenceInformation.Gene
    ): SubstanceReferenceInformationGeneSurrogate =
      with(model) {
        SubstanceReferenceInformationGeneSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          geneSequenceOrigin = this@with.geneSequenceOrigin,
          gene = this@with.gene,
          source = this@with.source.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class SubstanceReferenceInformationGeneElementSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var element: Identifier? = null,
  public var source: MutableList<Reference>? = null,
) {
  public fun toModel(): SubstanceReferenceInformation.GeneElement =
    SubstanceReferenceInformation.GeneElement(
      id = this@SubstanceReferenceInformationGeneElementSurrogate.id,
      extension =
        this@SubstanceReferenceInformationGeneElementSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceReferenceInformationGeneElementSurrogate.modifierExtension ?: mutableListOf(),
      type = this@SubstanceReferenceInformationGeneElementSurrogate.type,
      element = this@SubstanceReferenceInformationGeneElementSurrogate.element,
      source = this@SubstanceReferenceInformationGeneElementSurrogate.source ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: SubstanceReferenceInformation.GeneElement
    ): SubstanceReferenceInformationGeneElementSurrogate =
      with(model) {
        SubstanceReferenceInformationGeneElementSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          element = this@with.element,
          source = this@with.source.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class SubstanceReferenceInformationClassificationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var domain: CodeableConcept? = null,
  public var classification: CodeableConcept? = null,
  public var subtype: MutableList<CodeableConcept>? = null,
  public var source: MutableList<Reference>? = null,
) {
  public fun toModel(): SubstanceReferenceInformation.Classification =
    SubstanceReferenceInformation.Classification(
      id = this@SubstanceReferenceInformationClassificationSurrogate.id,
      extension =
        this@SubstanceReferenceInformationClassificationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceReferenceInformationClassificationSurrogate.modifierExtension
          ?: mutableListOf(),
      domain = this@SubstanceReferenceInformationClassificationSurrogate.domain,
      classification = this@SubstanceReferenceInformationClassificationSurrogate.classification,
      subtype =
        this@SubstanceReferenceInformationClassificationSurrogate.subtype ?: mutableListOf(),
      source = this@SubstanceReferenceInformationClassificationSurrogate.source ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: SubstanceReferenceInformation.Classification
    ): SubstanceReferenceInformationClassificationSurrogate =
      with(model) {
        SubstanceReferenceInformationClassificationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          domain = this@with.domain,
          classification = this@with.classification,
          subtype = this@with.subtype.takeUnless { it.all { it == null } },
          source = this@with.source.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class SubstanceReferenceInformationTargetAmountSurrogate(
  public var amountQuantity: Quantity? = null,
  public var amountRange: Range? = null,
  public var amountString: KotlinString? = null,
  public var _amountString: Element? = null,
) {
  public fun toModel(): SubstanceReferenceInformation.Target.Amount =
    SubstanceReferenceInformation.Target.Amount?.from(
      this@SubstanceReferenceInformationTargetAmountSurrogate.amountQuantity,
      this@SubstanceReferenceInformationTargetAmountSurrogate.amountRange,
      R4String.of(
        this@SubstanceReferenceInformationTargetAmountSurrogate.amountString,
        this@SubstanceReferenceInformationTargetAmountSurrogate._amountString,
      ),
    )!!

  public companion object {
    public fun fromModel(
      model: SubstanceReferenceInformation.Target.Amount
    ): SubstanceReferenceInformationTargetAmountSurrogate =
      with(model) {
        SubstanceReferenceInformationTargetAmountSurrogate(
          amountQuantity = this@with.asQuantity()?.value,
          amountRange = this@with.asRange()?.value,
          amountString = this@with.asString()?.value?.value,
          _amountString = this@with.asString()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class SubstanceReferenceInformationTargetSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var target: Identifier? = null,
  public var type: CodeableConcept? = null,
  public var interaction: CodeableConcept? = null,
  public var organism: CodeableConcept? = null,
  public var organismType: CodeableConcept? = null,
  public var amount: SubstanceReferenceInformation.Target.Amount? = null,
  public var amountType: CodeableConcept? = null,
  public var source: MutableList<Reference>? = null,
) {
  public fun toModel(): SubstanceReferenceInformation.Target =
    SubstanceReferenceInformation.Target(
      id = this@SubstanceReferenceInformationTargetSurrogate.id,
      extension = this@SubstanceReferenceInformationTargetSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceReferenceInformationTargetSurrogate.modifierExtension ?: mutableListOf(),
      target = this@SubstanceReferenceInformationTargetSurrogate.target,
      type = this@SubstanceReferenceInformationTargetSurrogate.type,
      interaction = this@SubstanceReferenceInformationTargetSurrogate.interaction,
      organism = this@SubstanceReferenceInformationTargetSurrogate.organism,
      organismType = this@SubstanceReferenceInformationTargetSurrogate.organismType,
      amount = this@SubstanceReferenceInformationTargetSurrogate.amount,
      amountType = this@SubstanceReferenceInformationTargetSurrogate.amountType,
      source = this@SubstanceReferenceInformationTargetSurrogate.source ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: SubstanceReferenceInformation.Target
    ): SubstanceReferenceInformationTargetSurrogate =
      with(model) {
        SubstanceReferenceInformationTargetSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          target = this@with.target,
          type = this@with.type,
          interaction = this@with.interaction,
          organism = this@with.organism,
          organismType = this@with.organismType,
          amount = this@with.amount,
          amountType = this@with.amountType,
          source = this@with.source.takeUnless { it.all { it == null } },
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
  public var gene: MutableList<SubstanceReferenceInformation.Gene>? = null,
  public var geneElement: MutableList<SubstanceReferenceInformation.GeneElement>? = null,
  public var classification: MutableList<SubstanceReferenceInformation.Classification>? = null,
  public var target: MutableList<SubstanceReferenceInformation.Target>? = null,
) {
  public fun toModel(): SubstanceReferenceInformation =
    SubstanceReferenceInformation(
      id = this@SubstanceReferenceInformationSurrogate.id,
      meta = this@SubstanceReferenceInformationSurrogate.meta,
      implicitRules =
        Uri.of(
          this@SubstanceReferenceInformationSurrogate.implicitRules,
          this@SubstanceReferenceInformationSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@SubstanceReferenceInformationSurrogate.language,
          this@SubstanceReferenceInformationSurrogate._language,
        ),
      text = this@SubstanceReferenceInformationSurrogate.text,
      contained = this@SubstanceReferenceInformationSurrogate.contained ?: mutableListOf(),
      extension = this@SubstanceReferenceInformationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubstanceReferenceInformationSurrogate.modifierExtension ?: mutableListOf(),
      comment =
        R4String.of(
          this@SubstanceReferenceInformationSurrogate.comment,
          this@SubstanceReferenceInformationSurrogate._comment,
        ),
      gene = this@SubstanceReferenceInformationSurrogate.gene ?: mutableListOf(),
      geneElement = this@SubstanceReferenceInformationSurrogate.geneElement ?: mutableListOf(),
      classification =
        this@SubstanceReferenceInformationSurrogate.classification ?: mutableListOf(),
      target = this@SubstanceReferenceInformationSurrogate.target ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: SubstanceReferenceInformation
    ): SubstanceReferenceInformationSurrogate =
      with(model) {
        SubstanceReferenceInformationSurrogate(
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
          comment = this@with.comment?.value,
          _comment = this@with.comment?.toElement(),
          gene = this@with.gene.takeUnless { it.all { it == null } },
          geneElement = this@with.geneElement.takeUnless { it.all { it == null } },
          classification = this@with.classification.takeUnless { it.all { it == null } },
          target = this@with.target.takeUnless { it.all { it == null } },
        )
      }
  }
}
