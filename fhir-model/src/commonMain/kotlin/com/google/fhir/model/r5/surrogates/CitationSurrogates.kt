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

import com.google.fhir.model.r5.Annotation
import com.google.fhir.model.r5.Attachment
import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Citation
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
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
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.PositiveInt
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.RelatedArtifact
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class CitationSummarySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var style: CodeableConcept? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
) {
  public fun toModel(): Citation.Summary =
    Citation.Summary(
      id = this@CitationSummarySurrogate.id,
      extension = this@CitationSummarySurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CitationSummarySurrogate.modifierExtension ?: mutableListOf(),
      style = this@CitationSummarySurrogate.style,
      text = Markdown.of(this@CitationSummarySurrogate.text, this@CitationSummarySurrogate._text)!!,
    )

  public companion object {
    public fun fromModel(model: Citation.Summary): CitationSummarySurrogate =
      with(model) {
        CitationSummarySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          style = this@with.style,
          text = this@with.text.value,
          _text = this@with.text.toElement(),
        )
      }
  }
}

@Serializable
internal data class CitationClassificationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var classifier: MutableList<CodeableConcept>? = null,
) {
  public fun toModel(): Citation.Classification =
    Citation.Classification(
      id = this@CitationClassificationSurrogate.id,
      extension = this@CitationClassificationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CitationClassificationSurrogate.modifierExtension ?: mutableListOf(),
      type = this@CitationClassificationSurrogate.type,
      classifier = this@CitationClassificationSurrogate.classifier ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Citation.Classification): CitationClassificationSurrogate =
      with(model) {
        CitationClassificationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          classifier = this@with.classifier.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class CitationStatusDateSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var activity: CodeableConcept,
  public var `actual`: KotlinBoolean? = null,
  public var _actual: Element? = null,
  public var period: Period,
) {
  public fun toModel(): Citation.StatusDate =
    Citation.StatusDate(
      id = this@CitationStatusDateSurrogate.id,
      extension = this@CitationStatusDateSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CitationStatusDateSurrogate.modifierExtension ?: mutableListOf(),
      activity = this@CitationStatusDateSurrogate.activity,
      `actual` =
        R5Boolean.of(
          this@CitationStatusDateSurrogate.`actual`,
          this@CitationStatusDateSurrogate._actual,
        ),
      period = this@CitationStatusDateSurrogate.period,
    )

  public companion object {
    public fun fromModel(model: Citation.StatusDate): CitationStatusDateSurrogate =
      with(model) {
        CitationStatusDateSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          activity = this@with.activity,
          `actual` = this@with.`actual`?.value,
          _actual = this@with.`actual`?.toElement(),
          period = this@with.period,
        )
      }
  }
}

@Serializable
internal data class CitationCitedArtifactVersionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
  public var baseCitation: Reference? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Version =
    Citation.CitedArtifact.Version(
      id = this@CitationCitedArtifactVersionSurrogate.id,
      extension = this@CitationCitedArtifactVersionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CitationCitedArtifactVersionSurrogate.modifierExtension ?: mutableListOf(),
      `value` =
        R5String.of(
          this@CitationCitedArtifactVersionSurrogate.`value`,
          this@CitationCitedArtifactVersionSurrogate._value,
        )!!,
      baseCitation = this@CitationCitedArtifactVersionSurrogate.baseCitation,
    )

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.Version
    ): CitationCitedArtifactVersionSurrogate =
      with(model) {
        CitationCitedArtifactVersionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          `value` = this@with.`value`.value,
          _value = this@with.`value`.toElement(),
          baseCitation = this@with.baseCitation,
        )
      }
  }
}

@Serializable
internal data class CitationCitedArtifactStatusDateSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var activity: CodeableConcept,
  public var `actual`: KotlinBoolean? = null,
  public var _actual: Element? = null,
  public var period: Period,
) {
  public fun toModel(): Citation.CitedArtifact.StatusDate =
    Citation.CitedArtifact.StatusDate(
      id = this@CitationCitedArtifactStatusDateSurrogate.id,
      extension = this@CitationCitedArtifactStatusDateSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CitationCitedArtifactStatusDateSurrogate.modifierExtension ?: mutableListOf(),
      activity = this@CitationCitedArtifactStatusDateSurrogate.activity,
      `actual` =
        R5Boolean.of(
          this@CitationCitedArtifactStatusDateSurrogate.`actual`,
          this@CitationCitedArtifactStatusDateSurrogate._actual,
        ),
      period = this@CitationCitedArtifactStatusDateSurrogate.period,
    )

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.StatusDate
    ): CitationCitedArtifactStatusDateSurrogate =
      with(model) {
        CitationCitedArtifactStatusDateSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          activity = this@with.activity,
          `actual` = this@with.`actual`?.value,
          _actual = this@with.`actual`?.toElement(),
          period = this@with.period,
        )
      }
  }
}

@Serializable
internal data class CitationCitedArtifactTitleSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: MutableList<CodeableConcept>? = null,
  public var language: CodeableConcept? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Title =
    Citation.CitedArtifact.Title(
      id = this@CitationCitedArtifactTitleSurrogate.id,
      extension = this@CitationCitedArtifactTitleSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CitationCitedArtifactTitleSurrogate.modifierExtension ?: mutableListOf(),
      type = this@CitationCitedArtifactTitleSurrogate.type ?: mutableListOf(),
      language = this@CitationCitedArtifactTitleSurrogate.language,
      text =
        Markdown.of(
          this@CitationCitedArtifactTitleSurrogate.text,
          this@CitationCitedArtifactTitleSurrogate._text,
        )!!,
    )

  public companion object {
    public fun fromModel(model: Citation.CitedArtifact.Title): CitationCitedArtifactTitleSurrogate =
      with(model) {
        CitationCitedArtifactTitleSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type.takeUnless { it.all { it == null } },
          language = this@with.language,
          text = this@with.text.value,
          _text = this@with.text.toElement(),
        )
      }
  }
}

@Serializable
internal data class CitationCitedArtifactAbstractSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var language: CodeableConcept? = null,
  public var text: KotlinString? = null,
  public var _text: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Abstract =
    Citation.CitedArtifact.Abstract(
      id = this@CitationCitedArtifactAbstractSurrogate.id,
      extension = this@CitationCitedArtifactAbstractSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CitationCitedArtifactAbstractSurrogate.modifierExtension ?: mutableListOf(),
      type = this@CitationCitedArtifactAbstractSurrogate.type,
      language = this@CitationCitedArtifactAbstractSurrogate.language,
      text =
        Markdown.of(
          this@CitationCitedArtifactAbstractSurrogate.text,
          this@CitationCitedArtifactAbstractSurrogate._text,
        )!!,
      copyright =
        Markdown.of(
          this@CitationCitedArtifactAbstractSurrogate.copyright,
          this@CitationCitedArtifactAbstractSurrogate._copyright,
        ),
    )

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.Abstract
    ): CitationCitedArtifactAbstractSurrogate =
      with(model) {
        CitationCitedArtifactAbstractSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          language = this@with.language,
          text = this@with.text.value,
          _text = this@with.text.toElement(),
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CitationCitedArtifactPartSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
  public var baseCitation: Reference? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Part =
    Citation.CitedArtifact.Part(
      id = this@CitationCitedArtifactPartSurrogate.id,
      extension = this@CitationCitedArtifactPartSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CitationCitedArtifactPartSurrogate.modifierExtension ?: mutableListOf(),
      type = this@CitationCitedArtifactPartSurrogate.type,
      `value` =
        R5String.of(
          this@CitationCitedArtifactPartSurrogate.`value`,
          this@CitationCitedArtifactPartSurrogate._value,
        ),
      baseCitation = this@CitationCitedArtifactPartSurrogate.baseCitation,
    )

  public companion object {
    public fun fromModel(model: Citation.CitedArtifact.Part): CitationCitedArtifactPartSurrogate =
      with(model) {
        CitationCitedArtifactPartSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          `value` = this@with.`value`?.value,
          _value = this@with.`value`?.toElement(),
          baseCitation = this@with.baseCitation,
        )
      }
  }
}

@Serializable
internal data class CitationCitedArtifactRelatesToSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var classifier: MutableList<CodeableConcept>? = null,
  public var label: KotlinString? = null,
  public var _label: Element? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
  public var citation: KotlinString? = null,
  public var _citation: Element? = null,
  public var document: Attachment? = null,
  public var resource: KotlinString? = null,
  public var _resource: Element? = null,
  public var resourceReference: Reference? = null,
) {
  public fun toModel(): Citation.CitedArtifact.RelatesTo =
    Citation.CitedArtifact.RelatesTo(
      id = this@CitationCitedArtifactRelatesToSurrogate.id,
      extension = this@CitationCitedArtifactRelatesToSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CitationCitedArtifactRelatesToSurrogate.modifierExtension ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r5.Citation.RelatedArtifactTypeExpanded.fromCode(
            this@CitationCitedArtifactRelatesToSurrogate.type!!
          ),
          this@CitationCitedArtifactRelatesToSurrogate._type,
        ),
      classifier = this@CitationCitedArtifactRelatesToSurrogate.classifier ?: mutableListOf(),
      label =
        R5String.of(
          this@CitationCitedArtifactRelatesToSurrogate.label,
          this@CitationCitedArtifactRelatesToSurrogate._label,
        ),
      display =
        R5String.of(
          this@CitationCitedArtifactRelatesToSurrogate.display,
          this@CitationCitedArtifactRelatesToSurrogate._display,
        ),
      citation =
        Markdown.of(
          this@CitationCitedArtifactRelatesToSurrogate.citation,
          this@CitationCitedArtifactRelatesToSurrogate._citation,
        ),
      document = this@CitationCitedArtifactRelatesToSurrogate.document,
      resource =
        Canonical.of(
          this@CitationCitedArtifactRelatesToSurrogate.resource,
          this@CitationCitedArtifactRelatesToSurrogate._resource,
        ),
      resourceReference = this@CitationCitedArtifactRelatesToSurrogate.resourceReference,
    )

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.RelatesTo
    ): CitationCitedArtifactRelatesToSurrogate =
      with(model) {
        CitationCitedArtifactRelatesToSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          classifier = this@with.classifier.takeUnless { it.all { it == null } },
          label = this@with.label?.value,
          _label = this@with.label?.toElement(),
          display = this@with.display?.value,
          _display = this@with.display?.toElement(),
          citation = this@with.citation?.value,
          _citation = this@with.citation?.toElement(),
          document = this@with.document,
          resource = this@with.resource?.value,
          _resource = this@with.resource?.toElement(),
          resourceReference = this@with.resourceReference,
        )
      }
  }
}

@Serializable
internal data class CitationCitedArtifactPublicationFormPublishedInSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var publisher: Reference? = null,
  public var publisherLocation: KotlinString? = null,
  public var _publisherLocation: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.PublicationForm.PublishedIn =
    Citation.CitedArtifact.PublicationForm.PublishedIn(
      id = this@CitationCitedArtifactPublicationFormPublishedInSurrogate.id,
      extension =
        this@CitationCitedArtifactPublicationFormPublishedInSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CitationCitedArtifactPublicationFormPublishedInSurrogate.modifierExtension
          ?: mutableListOf(),
      type = this@CitationCitedArtifactPublicationFormPublishedInSurrogate.type,
      identifier =
        this@CitationCitedArtifactPublicationFormPublishedInSurrogate.identifier ?: mutableListOf(),
      title =
        R5String.of(
          this@CitationCitedArtifactPublicationFormPublishedInSurrogate.title,
          this@CitationCitedArtifactPublicationFormPublishedInSurrogate._title,
        ),
      publisher = this@CitationCitedArtifactPublicationFormPublishedInSurrogate.publisher,
      publisherLocation =
        R5String.of(
          this@CitationCitedArtifactPublicationFormPublishedInSurrogate.publisherLocation,
          this@CitationCitedArtifactPublicationFormPublishedInSurrogate._publisherLocation,
        ),
    )

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.PublicationForm.PublishedIn
    ): CitationCitedArtifactPublicationFormPublishedInSurrogate =
      with(model) {
        CitationCitedArtifactPublicationFormPublishedInSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          publisher = this@with.publisher,
          publisherLocation = this@with.publisherLocation?.value,
          _publisherLocation = this@with.publisherLocation?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CitationCitedArtifactPublicationFormSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var publishedIn: Citation.CitedArtifact.PublicationForm.PublishedIn? = null,
  public var citedMedium: CodeableConcept? = null,
  public var volume: KotlinString? = null,
  public var _volume: Element? = null,
  public var issue: KotlinString? = null,
  public var _issue: Element? = null,
  public var articleDate: KotlinString? = null,
  public var _articleDate: Element? = null,
  public var publicationDateText: KotlinString? = null,
  public var _publicationDateText: Element? = null,
  public var publicationDateSeason: KotlinString? = null,
  public var _publicationDateSeason: Element? = null,
  public var lastRevisionDate: KotlinString? = null,
  public var _lastRevisionDate: Element? = null,
  public var language: MutableList<CodeableConcept>? = null,
  public var accessionNumber: KotlinString? = null,
  public var _accessionNumber: Element? = null,
  public var pageString: KotlinString? = null,
  public var _pageString: Element? = null,
  public var firstPage: KotlinString? = null,
  public var _firstPage: Element? = null,
  public var lastPage: KotlinString? = null,
  public var _lastPage: Element? = null,
  public var pageCount: KotlinString? = null,
  public var _pageCount: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.PublicationForm =
    Citation.CitedArtifact.PublicationForm(
      id = this@CitationCitedArtifactPublicationFormSurrogate.id,
      extension = this@CitationCitedArtifactPublicationFormSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CitationCitedArtifactPublicationFormSurrogate.modifierExtension ?: mutableListOf(),
      publishedIn = this@CitationCitedArtifactPublicationFormSurrogate.publishedIn,
      citedMedium = this@CitationCitedArtifactPublicationFormSurrogate.citedMedium,
      volume =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.volume,
          this@CitationCitedArtifactPublicationFormSurrogate._volume,
        ),
      issue =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.issue,
          this@CitationCitedArtifactPublicationFormSurrogate._issue,
        ),
      articleDate =
        DateTime.of(
          FhirDateTime.fromString(this@CitationCitedArtifactPublicationFormSurrogate.articleDate),
          this@CitationCitedArtifactPublicationFormSurrogate._articleDate,
        ),
      publicationDateText =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.publicationDateText,
          this@CitationCitedArtifactPublicationFormSurrogate._publicationDateText,
        ),
      publicationDateSeason =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.publicationDateSeason,
          this@CitationCitedArtifactPublicationFormSurrogate._publicationDateSeason,
        ),
      lastRevisionDate =
        DateTime.of(
          FhirDateTime.fromString(
            this@CitationCitedArtifactPublicationFormSurrogate.lastRevisionDate
          ),
          this@CitationCitedArtifactPublicationFormSurrogate._lastRevisionDate,
        ),
      language = this@CitationCitedArtifactPublicationFormSurrogate.language ?: mutableListOf(),
      accessionNumber =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.accessionNumber,
          this@CitationCitedArtifactPublicationFormSurrogate._accessionNumber,
        ),
      pageString =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.pageString,
          this@CitationCitedArtifactPublicationFormSurrogate._pageString,
        ),
      firstPage =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.firstPage,
          this@CitationCitedArtifactPublicationFormSurrogate._firstPage,
        ),
      lastPage =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.lastPage,
          this@CitationCitedArtifactPublicationFormSurrogate._lastPage,
        ),
      pageCount =
        R5String.of(
          this@CitationCitedArtifactPublicationFormSurrogate.pageCount,
          this@CitationCitedArtifactPublicationFormSurrogate._pageCount,
        ),
      copyright =
        Markdown.of(
          this@CitationCitedArtifactPublicationFormSurrogate.copyright,
          this@CitationCitedArtifactPublicationFormSurrogate._copyright,
        ),
    )

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.PublicationForm
    ): CitationCitedArtifactPublicationFormSurrogate =
      with(model) {
        CitationCitedArtifactPublicationFormSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          publishedIn = this@with.publishedIn,
          citedMedium = this@with.citedMedium,
          volume = this@with.volume?.value,
          _volume = this@with.volume?.toElement(),
          issue = this@with.issue?.value,
          _issue = this@with.issue?.toElement(),
          articleDate = this@with.articleDate?.value?.toString(),
          _articleDate = this@with.articleDate?.toElement(),
          publicationDateText = this@with.publicationDateText?.value,
          _publicationDateText = this@with.publicationDateText?.toElement(),
          publicationDateSeason = this@with.publicationDateSeason?.value,
          _publicationDateSeason = this@with.publicationDateSeason?.toElement(),
          lastRevisionDate = this@with.lastRevisionDate?.value?.toString(),
          _lastRevisionDate = this@with.lastRevisionDate?.toElement(),
          language = this@with.language.takeUnless { it.all { it == null } },
          accessionNumber = this@with.accessionNumber?.value,
          _accessionNumber = this@with.accessionNumber?.toElement(),
          pageString = this@with.pageString?.value,
          _pageString = this@with.pageString?.toElement(),
          firstPage = this@with.firstPage?.value,
          _firstPage = this@with.firstPage?.toElement(),
          lastPage = this@with.lastPage?.value,
          _lastPage = this@with.lastPage?.toElement(),
          pageCount = this@with.pageCount?.value,
          _pageCount = this@with.pageCount?.toElement(),
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CitationCitedArtifactWebLocationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var classifier: MutableList<CodeableConcept>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.WebLocation =
    Citation.CitedArtifact.WebLocation(
      id = this@CitationCitedArtifactWebLocationSurrogate.id,
      extension = this@CitationCitedArtifactWebLocationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CitationCitedArtifactWebLocationSurrogate.modifierExtension ?: mutableListOf(),
      classifier = this@CitationCitedArtifactWebLocationSurrogate.classifier ?: mutableListOf(),
      url =
        Uri.of(
          this@CitationCitedArtifactWebLocationSurrogate.url,
          this@CitationCitedArtifactWebLocationSurrogate._url,
        ),
    )

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.WebLocation
    ): CitationCitedArtifactWebLocationSurrogate =
      with(model) {
        CitationCitedArtifactWebLocationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          classifier = this@with.classifier.takeUnless { it.all { it == null } },
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CitationCitedArtifactClassificationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var classifier: MutableList<CodeableConcept>? = null,
  public var artifactAssessment: MutableList<Reference>? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Classification =
    Citation.CitedArtifact.Classification(
      id = this@CitationCitedArtifactClassificationSurrogate.id,
      extension = this@CitationCitedArtifactClassificationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CitationCitedArtifactClassificationSurrogate.modifierExtension ?: mutableListOf(),
      type = this@CitationCitedArtifactClassificationSurrogate.type,
      classifier = this@CitationCitedArtifactClassificationSurrogate.classifier ?: mutableListOf(),
      artifactAssessment =
        this@CitationCitedArtifactClassificationSurrogate.artifactAssessment ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.Classification
    ): CitationCitedArtifactClassificationSurrogate =
      with(model) {
        CitationCitedArtifactClassificationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          classifier = this@with.classifier.takeUnless { it.all { it == null } },
          artifactAssessment = this@with.artifactAssessment.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept,
  public var time: KotlinString? = null,
  public var _time: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Contributorship.Entry.ContributionInstance =
    Citation.CitedArtifact.Contributorship.Entry.ContributionInstance(
      id = this@CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate.id,
      extension =
        this@CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate
          .modifierExtension ?: mutableListOf(),
      type = this@CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate.type,
      time =
        DateTime.of(
          FhirDateTime.fromString(
            this@CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate.time
          ),
          this@CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate._time,
        ),
    )

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.Contributorship.Entry.ContributionInstance
    ): CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate =
      with(model) {
        CitationCitedArtifactContributorshipEntryContributionInstanceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          time = this@with.time?.value?.toString(),
          _time = this@with.time?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CitationCitedArtifactContributorshipEntrySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var contributor: Reference,
  public var forenameInitials: KotlinString? = null,
  public var _forenameInitials: Element? = null,
  public var affiliation: MutableList<Reference>? = null,
  public var contributionType: MutableList<CodeableConcept>? = null,
  public var role: CodeableConcept? = null,
  public var contributionInstance:
    MutableList<Citation.CitedArtifact.Contributorship.Entry.ContributionInstance>? =
    null,
  public var correspondingContact: KotlinBoolean? = null,
  public var _correspondingContact: Element? = null,
  public var rankingOrder: Int? = null,
  public var _rankingOrder: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Contributorship.Entry =
    Citation.CitedArtifact.Contributorship.Entry(
      id = this@CitationCitedArtifactContributorshipEntrySurrogate.id,
      extension =
        this@CitationCitedArtifactContributorshipEntrySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CitationCitedArtifactContributorshipEntrySurrogate.modifierExtension
          ?: mutableListOf(),
      contributor = this@CitationCitedArtifactContributorshipEntrySurrogate.contributor,
      forenameInitials =
        R5String.of(
          this@CitationCitedArtifactContributorshipEntrySurrogate.forenameInitials,
          this@CitationCitedArtifactContributorshipEntrySurrogate._forenameInitials,
        ),
      affiliation =
        this@CitationCitedArtifactContributorshipEntrySurrogate.affiliation ?: mutableListOf(),
      contributionType =
        this@CitationCitedArtifactContributorshipEntrySurrogate.contributionType ?: mutableListOf(),
      role = this@CitationCitedArtifactContributorshipEntrySurrogate.role,
      contributionInstance =
        this@CitationCitedArtifactContributorshipEntrySurrogate.contributionInstance
          ?: mutableListOf(),
      correspondingContact =
        R5Boolean.of(
          this@CitationCitedArtifactContributorshipEntrySurrogate.correspondingContact,
          this@CitationCitedArtifactContributorshipEntrySurrogate._correspondingContact,
        ),
      rankingOrder =
        PositiveInt.of(
          this@CitationCitedArtifactContributorshipEntrySurrogate.rankingOrder,
          this@CitationCitedArtifactContributorshipEntrySurrogate._rankingOrder,
        ),
    )

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.Contributorship.Entry
    ): CitationCitedArtifactContributorshipEntrySurrogate =
      with(model) {
        CitationCitedArtifactContributorshipEntrySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          contributor = this@with.contributor,
          forenameInitials = this@with.forenameInitials?.value,
          _forenameInitials = this@with.forenameInitials?.toElement(),
          affiliation = this@with.affiliation.takeUnless { it.all { it == null } },
          contributionType = this@with.contributionType.takeUnless { it.all { it == null } },
          role = this@with.role,
          contributionInstance =
            this@with.contributionInstance.takeUnless { it.all { it == null } },
          correspondingContact = this@with.correspondingContact?.value,
          _correspondingContact = this@with.correspondingContact?.toElement(),
          rankingOrder = this@with.rankingOrder?.value,
          _rankingOrder = this@with.rankingOrder?.toElement(),
        )
      }
  }
}

@Serializable
internal data class CitationCitedArtifactContributorshipSummarySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: CodeableConcept? = null,
  public var style: CodeableConcept? = null,
  public var source: CodeableConcept? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Contributorship.Summary =
    Citation.CitedArtifact.Contributorship.Summary(
      id = this@CitationCitedArtifactContributorshipSummarySurrogate.id,
      extension =
        this@CitationCitedArtifactContributorshipSummarySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CitationCitedArtifactContributorshipSummarySurrogate.modifierExtension
          ?: mutableListOf(),
      type = this@CitationCitedArtifactContributorshipSummarySurrogate.type,
      style = this@CitationCitedArtifactContributorshipSummarySurrogate.style,
      source = this@CitationCitedArtifactContributorshipSummarySurrogate.source,
      `value` =
        Markdown.of(
          this@CitationCitedArtifactContributorshipSummarySurrogate.`value`,
          this@CitationCitedArtifactContributorshipSummarySurrogate._value,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.Contributorship.Summary
    ): CitationCitedArtifactContributorshipSummarySurrogate =
      with(model) {
        CitationCitedArtifactContributorshipSummarySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type,
          style = this@with.style,
          source = this@with.source,
          `value` = this@with.`value`.value,
          _value = this@with.`value`.toElement(),
        )
      }
  }
}

@Serializable
internal data class CitationCitedArtifactContributorshipSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var complete: KotlinBoolean? = null,
  public var _complete: Element? = null,
  public var entry: MutableList<Citation.CitedArtifact.Contributorship.Entry>? = null,
  public var summary: MutableList<Citation.CitedArtifact.Contributorship.Summary>? = null,
) {
  public fun toModel(): Citation.CitedArtifact.Contributorship =
    Citation.CitedArtifact.Contributorship(
      id = this@CitationCitedArtifactContributorshipSurrogate.id,
      extension = this@CitationCitedArtifactContributorshipSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@CitationCitedArtifactContributorshipSurrogate.modifierExtension ?: mutableListOf(),
      complete =
        R5Boolean.of(
          this@CitationCitedArtifactContributorshipSurrogate.complete,
          this@CitationCitedArtifactContributorshipSurrogate._complete,
        ),
      entry = this@CitationCitedArtifactContributorshipSurrogate.entry ?: mutableListOf(),
      summary = this@CitationCitedArtifactContributorshipSurrogate.summary ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: Citation.CitedArtifact.Contributorship
    ): CitationCitedArtifactContributorshipSurrogate =
      with(model) {
        CitationCitedArtifactContributorshipSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          complete = this@with.complete?.value,
          _complete = this@with.complete?.toElement(),
          entry = this@with.entry.takeUnless { it.all { it == null } },
          summary = this@with.summary.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class CitationCitedArtifactSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var relatedIdentifier: MutableList<Identifier>? = null,
  public var dateAccessed: KotlinString? = null,
  public var _dateAccessed: Element? = null,
  public var version: Citation.CitedArtifact.Version? = null,
  public var currentState: MutableList<CodeableConcept>? = null,
  public var statusDate: MutableList<Citation.CitedArtifact.StatusDate>? = null,
  public var title: MutableList<Citation.CitedArtifact.Title>? = null,
  public var `abstract`: MutableList<Citation.CitedArtifact.Abstract>? = null,
  public var part: Citation.CitedArtifact.Part? = null,
  public var relatesTo: MutableList<Citation.CitedArtifact.RelatesTo>? = null,
  public var publicationForm: MutableList<Citation.CitedArtifact.PublicationForm>? = null,
  public var webLocation: MutableList<Citation.CitedArtifact.WebLocation>? = null,
  public var classification: MutableList<Citation.CitedArtifact.Classification>? = null,
  public var contributorship: Citation.CitedArtifact.Contributorship? = null,
  public var note: MutableList<Annotation>? = null,
) {
  public fun toModel(): Citation.CitedArtifact =
    Citation.CitedArtifact(
      id = this@CitationCitedArtifactSurrogate.id,
      extension = this@CitationCitedArtifactSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CitationCitedArtifactSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@CitationCitedArtifactSurrogate.identifier ?: mutableListOf(),
      relatedIdentifier = this@CitationCitedArtifactSurrogate.relatedIdentifier ?: mutableListOf(),
      dateAccessed =
        DateTime.of(
          FhirDateTime.fromString(this@CitationCitedArtifactSurrogate.dateAccessed),
          this@CitationCitedArtifactSurrogate._dateAccessed,
        ),
      version = this@CitationCitedArtifactSurrogate.version,
      currentState = this@CitationCitedArtifactSurrogate.currentState ?: mutableListOf(),
      statusDate = this@CitationCitedArtifactSurrogate.statusDate ?: mutableListOf(),
      title = this@CitationCitedArtifactSurrogate.title ?: mutableListOf(),
      `abstract` = this@CitationCitedArtifactSurrogate.`abstract` ?: mutableListOf(),
      part = this@CitationCitedArtifactSurrogate.part,
      relatesTo = this@CitationCitedArtifactSurrogate.relatesTo ?: mutableListOf(),
      publicationForm = this@CitationCitedArtifactSurrogate.publicationForm ?: mutableListOf(),
      webLocation = this@CitationCitedArtifactSurrogate.webLocation ?: mutableListOf(),
      classification = this@CitationCitedArtifactSurrogate.classification ?: mutableListOf(),
      contributorship = this@CitationCitedArtifactSurrogate.contributorship,
      note = this@CitationCitedArtifactSurrogate.note ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: Citation.CitedArtifact): CitationCitedArtifactSurrogate =
      with(model) {
        CitationCitedArtifactSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          relatedIdentifier = this@with.relatedIdentifier.takeUnless { it.all { it == null } },
          dateAccessed = this@with.dateAccessed?.value?.toString(),
          _dateAccessed = this@with.dateAccessed?.toElement(),
          version = this@with.version,
          currentState = this@with.currentState.takeUnless { it.all { it == null } },
          statusDate = this@with.statusDate.takeUnless { it.all { it == null } },
          title = this@with.title.takeUnless { it.all { it == null } },
          `abstract` = this@with.`abstract`.takeUnless { it.all { it == null } },
          part = this@with.part,
          relatesTo = this@with.relatesTo.takeUnless { it.all { it == null } },
          publicationForm = this@with.publicationForm.takeUnless { it.all { it == null } },
          webLocation = this@with.webLocation.takeUnless { it.all { it == null } },
          classification = this@with.classification.takeUnless { it.all { it == null } },
          contributorship = this@with.contributorship,
          note = this@with.note.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class CitationSurrogate(
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
  public var identifier: MutableList<Identifier>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
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
  public var author: MutableList<ContactDetail>? = null,
  public var editor: MutableList<ContactDetail>? = null,
  public var reviewer: MutableList<ContactDetail>? = null,
  public var endorser: MutableList<ContactDetail>? = null,
  public var summary: MutableList<Citation.Summary>? = null,
  public var classification: MutableList<Citation.Classification>? = null,
  public var note: MutableList<Annotation>? = null,
  public var currentState: MutableList<CodeableConcept>? = null,
  public var statusDate: MutableList<Citation.StatusDate>? = null,
  public var relatedArtifact: MutableList<RelatedArtifact>? = null,
  public var citedArtifact: Citation.CitedArtifact? = null,
) {
  public fun toModel(): Citation =
    Citation(
      id = this@CitationSurrogate.id,
      meta = this@CitationSurrogate.meta,
      implicitRules =
        Uri.of(this@CitationSurrogate.implicitRules, this@CitationSurrogate._implicitRules),
      language = Code.of(this@CitationSurrogate.language, this@CitationSurrogate._language),
      text = this@CitationSurrogate.text,
      contained = this@CitationSurrogate.contained ?: mutableListOf(),
      extension = this@CitationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@CitationSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@CitationSurrogate.url, this@CitationSurrogate._url),
      identifier = this@CitationSurrogate.identifier ?: mutableListOf(),
      version = R5String.of(this@CitationSurrogate.version, this@CitationSurrogate._version),
      versionAlgorithm =
        Citation.VersionAlgorithm?.from(
          R5String.of(
            this@CitationSurrogate.versionAlgorithmString,
            this@CitationSurrogate._versionAlgorithmString,
          ),
          this@CitationSurrogate.versionAlgorithmCoding,
        ),
      name = R5String.of(this@CitationSurrogate.name, this@CitationSurrogate._name),
      title = R5String.of(this@CitationSurrogate.title, this@CitationSurrogate._title),
      status =
        Enumeration.of(
          com.google.fhir.model.r5.PublicationStatus.fromCode(this@CitationSurrogate.status!!),
          this@CitationSurrogate._status,
        ),
      experimental =
        R5Boolean.of(this@CitationSurrogate.experimental, this@CitationSurrogate._experimental),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@CitationSurrogate.date),
          this@CitationSurrogate._date,
        ),
      publisher = R5String.of(this@CitationSurrogate.publisher, this@CitationSurrogate._publisher),
      contact = this@CitationSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(this@CitationSurrogate.description, this@CitationSurrogate._description),
      useContext = this@CitationSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@CitationSurrogate.jurisdiction ?: mutableListOf(),
      purpose = Markdown.of(this@CitationSurrogate.purpose, this@CitationSurrogate._purpose),
      copyright = Markdown.of(this@CitationSurrogate.copyright, this@CitationSurrogate._copyright),
      copyrightLabel =
        R5String.of(this@CitationSurrogate.copyrightLabel, this@CitationSurrogate._copyrightLabel),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@CitationSurrogate.approvalDate),
          this@CitationSurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@CitationSurrogate.lastReviewDate),
          this@CitationSurrogate._lastReviewDate,
        ),
      effectivePeriod = this@CitationSurrogate.effectivePeriod,
      author = this@CitationSurrogate.author ?: mutableListOf(),
      editor = this@CitationSurrogate.editor ?: mutableListOf(),
      reviewer = this@CitationSurrogate.reviewer ?: mutableListOf(),
      endorser = this@CitationSurrogate.endorser ?: mutableListOf(),
      summary = this@CitationSurrogate.summary ?: mutableListOf(),
      classification = this@CitationSurrogate.classification ?: mutableListOf(),
      note = this@CitationSurrogate.note ?: mutableListOf(),
      currentState = this@CitationSurrogate.currentState ?: mutableListOf(),
      statusDate = this@CitationSurrogate.statusDate ?: mutableListOf(),
      relatedArtifact = this@CitationSurrogate.relatedArtifact ?: mutableListOf(),
      citedArtifact = this@CitationSurrogate.citedArtifact,
    )

  public companion object {
    public fun fromModel(model: Citation): CitationSurrogate =
      with(model) {
        CitationSurrogate(
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
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.value,
          _versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.toElement(),
          versionAlgorithmCoding = this@with.versionAlgorithm?.asCoding()?.value,
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          experimental = this@with.experimental?.value,
          _experimental = this@with.experimental?.toElement(),
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
          author = this@with.author.takeUnless { it.all { it == null } },
          editor = this@with.editor.takeUnless { it.all { it == null } },
          reviewer = this@with.reviewer.takeUnless { it.all { it == null } },
          endorser = this@with.endorser.takeUnless { it.all { it == null } },
          summary = this@with.summary.takeUnless { it.all { it == null } },
          classification = this@with.classification.takeUnless { it.all { it == null } },
          note = this@with.note.takeUnless { it.all { it == null } },
          currentState = this@with.currentState.takeUnless { it.all { it == null } },
          statusDate = this@with.statusDate.takeUnless { it.all { it == null } },
          relatedArtifact = this@with.relatedArtifact.takeUnless { it.all { it == null } },
          citedArtifact = this@with.citedArtifact,
        )
      }
  }
}
