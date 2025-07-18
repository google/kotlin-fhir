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

import com.google.fhir.model.r5.ArtifactAssessment
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
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
import com.google.fhir.model.r5.Quantity
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ArtifactAssessmentContentSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var informationType: KotlinString? = null,
  public var _informationType: Element? = null,
  public var summary: KotlinString? = null,
  public var _summary: Element? = null,
  public var type: CodeableConcept? = null,
  public var classifier: MutableList<CodeableConcept>? = null,
  public var quantity: Quantity? = null,
  public var author: Reference? = null,
  public var path: MutableList<KotlinString?>? = null,
  public var _path: MutableList<Element?>? = null,
  public var relatedArtifact: MutableList<RelatedArtifact>? = null,
  public var freeToShare: KotlinBoolean? = null,
  public var _freeToShare: Element? = null,
  public var component: MutableList<ArtifactAssessment.Content>? = null,
) {
  public fun toModel(): ArtifactAssessment.Content =
    ArtifactAssessment.Content(
      id = this@ArtifactAssessmentContentSurrogate.id,
      extension = this@ArtifactAssessmentContentSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ArtifactAssessmentContentSurrogate.modifierExtension ?: mutableListOf(),
      informationType =
        this@ArtifactAssessmentContentSurrogate.informationType?.let {
          Enumeration.of(
            com.google.fhir.model.r5.ArtifactAssessment.InformationType.fromCode(it!!),
            this@ArtifactAssessmentContentSurrogate._informationType,
          )
        },
      summary =
        Markdown.of(
          this@ArtifactAssessmentContentSurrogate.summary,
          this@ArtifactAssessmentContentSurrogate._summary,
        ),
      type = this@ArtifactAssessmentContentSurrogate.type,
      classifier = this@ArtifactAssessmentContentSurrogate.classifier ?: mutableListOf(),
      quantity = this@ArtifactAssessmentContentSurrogate.quantity,
      author = this@ArtifactAssessmentContentSurrogate.author,
      path =
        if (
          this@ArtifactAssessmentContentSurrogate.path == null &&
            this@ArtifactAssessmentContentSurrogate._path == null
        ) {
          mutableListOf()
        } else {
          (this@ArtifactAssessmentContentSurrogate.path
              ?: List(this@ArtifactAssessmentContentSurrogate._path!!.size) { null })
            .zip(
              this@ArtifactAssessmentContentSurrogate._path
                ?: List(this@ArtifactAssessmentContentSurrogate.path!!.size) { null }
            )
            .map { (value, element) -> Uri.of(value, element)!! }
            .toMutableList()
        },
      relatedArtifact = this@ArtifactAssessmentContentSurrogate.relatedArtifact ?: mutableListOf(),
      freeToShare =
        R5Boolean.of(
          this@ArtifactAssessmentContentSurrogate.freeToShare,
          this@ArtifactAssessmentContentSurrogate._freeToShare,
        ),
      component = this@ArtifactAssessmentContentSurrogate.component ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ArtifactAssessment.Content): ArtifactAssessmentContentSurrogate =
      with(model) {
        ArtifactAssessmentContentSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          informationType = this@with.informationType?.value?.getCode(),
          _informationType = this@with.informationType?.toElement(),
          summary = this@with.summary?.value,
          _summary = this@with.summary?.toElement(),
          type = this@with.type,
          classifier = this@with.classifier.takeUnless { it.all { it == null } },
          quantity = this@with.quantity,
          author = this@with.author,
          path =
            this@with.path.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _path =
            this@with.path
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          relatedArtifact = this@with.relatedArtifact.takeUnless { it.all { it == null } },
          freeToShare = this@with.freeToShare?.value,
          _freeToShare = this@with.freeToShare?.toElement(),
          component = this@with.component.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ArtifactAssessmentSurrogate(
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
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var citeAsReference: Reference? = null,
  public var citeAsMarkdown: KotlinString? = null,
  public var _citeAsMarkdown: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var approvalDate: KotlinString? = null,
  public var _approvalDate: Element? = null,
  public var lastReviewDate: KotlinString? = null,
  public var _lastReviewDate: Element? = null,
  public var artifactReference: Reference? = null,
  public var artifactCanonical: KotlinString? = null,
  public var _artifactCanonical: Element? = null,
  public var artifactUri: KotlinString? = null,
  public var _artifactUri: Element? = null,
  public var content: MutableList<ArtifactAssessment.Content>? = null,
  public var workflowStatus: KotlinString? = null,
  public var _workflowStatus: Element? = null,
  public var disposition: KotlinString? = null,
  public var _disposition: Element? = null,
) {
  public fun toModel(): ArtifactAssessment =
    ArtifactAssessment(
      id = this@ArtifactAssessmentSurrogate.id,
      meta = this@ArtifactAssessmentSurrogate.meta,
      implicitRules =
        Uri.of(
          this@ArtifactAssessmentSurrogate.implicitRules,
          this@ArtifactAssessmentSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@ArtifactAssessmentSurrogate.language,
          this@ArtifactAssessmentSurrogate._language,
        ),
      text = this@ArtifactAssessmentSurrogate.text,
      contained = this@ArtifactAssessmentSurrogate.contained ?: mutableListOf(),
      extension = this@ArtifactAssessmentSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ArtifactAssessmentSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@ArtifactAssessmentSurrogate.identifier ?: mutableListOf(),
      title =
        R5String.of(
          this@ArtifactAssessmentSurrogate.title,
          this@ArtifactAssessmentSurrogate._title,
        ),
      citeAs =
        ArtifactAssessment.CiteAs?.from(
          this@ArtifactAssessmentSurrogate.citeAsReference,
          Markdown.of(
            this@ArtifactAssessmentSurrogate.citeAsMarkdown,
            this@ArtifactAssessmentSurrogate._citeAsMarkdown,
          ),
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ArtifactAssessmentSurrogate.date),
          this@ArtifactAssessmentSurrogate._date,
        ),
      copyright =
        Markdown.of(
          this@ArtifactAssessmentSurrogate.copyright,
          this@ArtifactAssessmentSurrogate._copyright,
        ),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@ArtifactAssessmentSurrogate.approvalDate),
          this@ArtifactAssessmentSurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@ArtifactAssessmentSurrogate.lastReviewDate),
          this@ArtifactAssessmentSurrogate._lastReviewDate,
        ),
      artifact =
        ArtifactAssessment.Artifact.from(
          this@ArtifactAssessmentSurrogate.artifactReference,
          Canonical.of(
            this@ArtifactAssessmentSurrogate.artifactCanonical,
            this@ArtifactAssessmentSurrogate._artifactCanonical,
          ),
          Uri.of(
            this@ArtifactAssessmentSurrogate.artifactUri,
            this@ArtifactAssessmentSurrogate._artifactUri,
          ),
        )!!,
      content = this@ArtifactAssessmentSurrogate.content ?: mutableListOf(),
      workflowStatus =
        this@ArtifactAssessmentSurrogate.workflowStatus?.let {
          Enumeration.of(
            com.google.fhir.model.r5.ArtifactAssessment.WorkflowStatus.fromCode(it!!),
            this@ArtifactAssessmentSurrogate._workflowStatus,
          )
        },
      disposition =
        this@ArtifactAssessmentSurrogate.disposition?.let {
          Enumeration.of(
            com.google.fhir.model.r5.ArtifactAssessment.Disposition.fromCode(it!!),
            this@ArtifactAssessmentSurrogate._disposition,
          )
        },
    )

  public companion object {
    public fun fromModel(model: ArtifactAssessment): ArtifactAssessmentSurrogate =
      with(model) {
        ArtifactAssessmentSurrogate(
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
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          citeAsReference = this@with.citeAs?.asReference()?.value,
          citeAsMarkdown = this@with.citeAs?.asMarkdown()?.value?.value,
          _citeAsMarkdown = this@with.citeAs?.asMarkdown()?.value?.toElement(),
          date = this@with.date?.value?.toString(),
          _date = this@with.date?.toElement(),
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
          approvalDate = this@with.approvalDate?.value?.toString(),
          _approvalDate = this@with.approvalDate?.toElement(),
          lastReviewDate = this@with.lastReviewDate?.value?.toString(),
          _lastReviewDate = this@with.lastReviewDate?.toElement(),
          artifactReference = this@with.artifact?.asReference()?.value,
          artifactCanonical = this@with.artifact?.asCanonical()?.value?.value,
          _artifactCanonical = this@with.artifact?.asCanonical()?.value?.toElement(),
          artifactUri = this@with.artifact?.asUri()?.value?.value,
          _artifactUri = this@with.artifact?.asUri()?.value?.toElement(),
          content = this@with.content.takeUnless { it.all { it == null } },
          workflowStatus = this@with.workflowStatus?.value?.getCode(),
          _workflowStatus = this@with.workflowStatus?.toElement(),
          disposition = this@with.disposition?.value?.getCode(),
          _disposition = this@with.disposition?.toElement(),
        )
      }
  }
}
