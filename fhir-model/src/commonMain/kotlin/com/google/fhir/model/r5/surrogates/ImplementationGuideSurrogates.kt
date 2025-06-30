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

import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Id
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.ImplementationGuide
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.Url
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ImplementationGuideDependsOnSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var uri: KotlinString? = null,
  public var _uri: Element? = null,
  public var packageId: KotlinString? = null,
  public var _packageId: Element? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var reason: KotlinString? = null,
  public var _reason: Element? = null,
) {
  public fun toModel(): ImplementationGuide.DependsOn =
    ImplementationGuide.DependsOn().apply {
      id = this@ImplementationGuideDependsOnSurrogate.id
      extension = this@ImplementationGuideDependsOnSurrogate.extension
      modifierExtension = this@ImplementationGuideDependsOnSurrogate.modifierExtension
      uri =
        Canonical.of(
          this@ImplementationGuideDependsOnSurrogate.uri,
          this@ImplementationGuideDependsOnSurrogate._uri,
        )
      packageId =
        Id.of(
          this@ImplementationGuideDependsOnSurrogate.packageId,
          this@ImplementationGuideDependsOnSurrogate._packageId,
        )
      version =
        R5String.of(
          this@ImplementationGuideDependsOnSurrogate.version,
          this@ImplementationGuideDependsOnSurrogate._version,
        )
      reason =
        Markdown.of(
          this@ImplementationGuideDependsOnSurrogate.reason,
          this@ImplementationGuideDependsOnSurrogate._reason,
        )
    }

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.DependsOn
    ): ImplementationGuideDependsOnSurrogate =
      with(model) {
        ImplementationGuideDependsOnSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          uri = this@with.uri?.value
          _uri = this@with.uri?.toElement()
          packageId = this@with.packageId?.value
          _packageId = this@with.packageId?.toElement()
          version = this@with.version?.value
          _version = this@with.version?.toElement()
          reason = this@with.reason?.value
          _reason = this@with.reason?.toElement()
        }
      }
  }
}

@Serializable
internal data class ImplementationGuideGlobalSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var profile: KotlinString? = null,
  public var _profile: Element? = null,
) {
  public fun toModel(): ImplementationGuide.Global =
    ImplementationGuide.Global().apply {
      id = this@ImplementationGuideGlobalSurrogate.id
      extension = this@ImplementationGuideGlobalSurrogate.extension
      modifierExtension = this@ImplementationGuideGlobalSurrogate.modifierExtension
      type =
        Enumeration.of(
          this@ImplementationGuideGlobalSurrogate.type?.let {
            com.google.fhir.model.r5.ResourceType.fromCode(it)
          },
          this@ImplementationGuideGlobalSurrogate._type,
        )
      profile =
        Canonical.of(
          this@ImplementationGuideGlobalSurrogate.profile,
          this@ImplementationGuideGlobalSurrogate._profile,
        )
    }

  public companion object {
    public fun fromModel(model: ImplementationGuide.Global): ImplementationGuideGlobalSurrogate =
      with(model) {
        ImplementationGuideGlobalSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          profile = this@with.profile?.value
          _profile = this@with.profile?.toElement()
        }
      }
  }
}

@Serializable
internal data class ImplementationGuideDefinitionGroupingSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
) {
  public fun toModel(): ImplementationGuide.Definition.Grouping =
    ImplementationGuide.Definition.Grouping().apply {
      id = this@ImplementationGuideDefinitionGroupingSurrogate.id
      extension = this@ImplementationGuideDefinitionGroupingSurrogate.extension
      modifierExtension = this@ImplementationGuideDefinitionGroupingSurrogate.modifierExtension
      name =
        R5String.of(
          this@ImplementationGuideDefinitionGroupingSurrogate.name,
          this@ImplementationGuideDefinitionGroupingSurrogate._name,
        )
      description =
        Markdown.of(
          this@ImplementationGuideDefinitionGroupingSurrogate.description,
          this@ImplementationGuideDefinitionGroupingSurrogate._description,
        )
    }

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Definition.Grouping
    ): ImplementationGuideDefinitionGroupingSurrogate =
      with(model) {
        ImplementationGuideDefinitionGroupingSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
        }
      }
  }
}

@Serializable
internal data class ImplementationGuideDefinitionResourceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var reference: Reference? = null,
  public var fhirVersion: List<KotlinString?>? = null,
  public var _fhirVersion: List<Element?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var isExample: KotlinBoolean? = null,
  public var _isExample: Element? = null,
  public var profile: List<KotlinString?>? = null,
  public var _profile: List<Element?>? = null,
  public var groupingId: KotlinString? = null,
  public var _groupingId: Element? = null,
) {
  public fun toModel(): ImplementationGuide.Definition.Resource =
    ImplementationGuide.Definition.Resource().apply {
      id = this@ImplementationGuideDefinitionResourceSurrogate.id
      extension = this@ImplementationGuideDefinitionResourceSurrogate.extension
      modifierExtension = this@ImplementationGuideDefinitionResourceSurrogate.modifierExtension
      reference = this@ImplementationGuideDefinitionResourceSurrogate.reference
      fhirVersion =
        if (
          this@ImplementationGuideDefinitionResourceSurrogate.fhirVersion == null &&
            this@ImplementationGuideDefinitionResourceSurrogate._fhirVersion == null
        ) {
          null
        } else {
          (this@ImplementationGuideDefinitionResourceSurrogate.fhirVersion
              ?: List(this@ImplementationGuideDefinitionResourceSurrogate._fhirVersion!!.size) {
                null
              })
            .zip(
              this@ImplementationGuideDefinitionResourceSurrogate._fhirVersion
                ?: List(this@ImplementationGuideDefinitionResourceSurrogate.fhirVersion!!.size) {
                  null
                }
            )
            .mapNotNull { (value, element) ->
              Enumeration.of(
                value?.let { com.google.fhir.model.r5.FHIRVersion.fromCode(it) },
                element,
              )
            }
        }
      name =
        R5String.of(
          this@ImplementationGuideDefinitionResourceSurrogate.name,
          this@ImplementationGuideDefinitionResourceSurrogate._name,
        )
      description =
        Markdown.of(
          this@ImplementationGuideDefinitionResourceSurrogate.description,
          this@ImplementationGuideDefinitionResourceSurrogate._description,
        )
      isExample =
        R5Boolean.of(
          this@ImplementationGuideDefinitionResourceSurrogate.isExample,
          this@ImplementationGuideDefinitionResourceSurrogate._isExample,
        )
      profile =
        if (
          this@ImplementationGuideDefinitionResourceSurrogate.profile == null &&
            this@ImplementationGuideDefinitionResourceSurrogate._profile == null
        ) {
          null
        } else {
          (this@ImplementationGuideDefinitionResourceSurrogate.profile
              ?: List(this@ImplementationGuideDefinitionResourceSurrogate._profile!!.size) { null })
            .zip(
              this@ImplementationGuideDefinitionResourceSurrogate._profile
                ?: List(this@ImplementationGuideDefinitionResourceSurrogate.profile!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      groupingId =
        Id.of(
          this@ImplementationGuideDefinitionResourceSurrogate.groupingId,
          this@ImplementationGuideDefinitionResourceSurrogate._groupingId,
        )
    }

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Definition.Resource
    ): ImplementationGuideDefinitionResourceSurrogate =
      with(model) {
        ImplementationGuideDefinitionResourceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          reference = this@with.reference
          fhirVersion =
            this@with.fhirVersion
              ?.map { it?.value?.getCode() }
              ?.takeUnless { it.all { it == null } }
          _fhirVersion =
            this@with.fhirVersion?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          isExample = this@with.isExample?.value
          _isExample = this@with.isExample?.toElement()
          profile = this@with.profile?.map { it?.value }?.takeUnless { it.all { it == null } }
          _profile =
            this@with.profile?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          groupingId = this@with.groupingId?.value
          _groupingId = this@with.groupingId?.toElement()
        }
      }
  }
}

@Serializable
internal data class ImplementationGuideDefinitionPageSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sourceUrl: KotlinString? = null,
  public var _sourceUrl: Element? = null,
  public var sourceString: KotlinString? = null,
  public var _sourceString: Element? = null,
  public var sourceMarkdown: KotlinString? = null,
  public var _sourceMarkdown: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var generation: KotlinString? = null,
  public var _generation: Element? = null,
  public var page: List<ImplementationGuide.Definition.Page?>? = null,
) {
  public fun toModel(): ImplementationGuide.Definition.Page =
    ImplementationGuide.Definition.Page().apply {
      id = this@ImplementationGuideDefinitionPageSurrogate.id
      extension = this@ImplementationGuideDefinitionPageSurrogate.extension
      modifierExtension = this@ImplementationGuideDefinitionPageSurrogate.modifierExtension
      source =
        ImplementationGuide.Definition.Page.Source?.from(
          Url.of(
            this@ImplementationGuideDefinitionPageSurrogate.sourceUrl,
            this@ImplementationGuideDefinitionPageSurrogate._sourceUrl,
          ),
          R5String.of(
            this@ImplementationGuideDefinitionPageSurrogate.sourceString,
            this@ImplementationGuideDefinitionPageSurrogate._sourceString,
          ),
          Markdown.of(
            this@ImplementationGuideDefinitionPageSurrogate.sourceMarkdown,
            this@ImplementationGuideDefinitionPageSurrogate._sourceMarkdown,
          ),
        )
      name =
        Url.of(
          this@ImplementationGuideDefinitionPageSurrogate.name,
          this@ImplementationGuideDefinitionPageSurrogate._name,
        )
      title =
        R5String.of(
          this@ImplementationGuideDefinitionPageSurrogate.title,
          this@ImplementationGuideDefinitionPageSurrogate._title,
        )
      generation =
        Enumeration.of(
          this@ImplementationGuideDefinitionPageSurrogate.generation?.let {
            com.google.fhir.model.r5.ImplementationGuide.GuidePageGeneration.fromCode(it)
          },
          this@ImplementationGuideDefinitionPageSurrogate._generation,
        )
      page = this@ImplementationGuideDefinitionPageSurrogate.page
    }

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Definition.Page
    ): ImplementationGuideDefinitionPageSurrogate =
      with(model) {
        ImplementationGuideDefinitionPageSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sourceUrl = this@with.source?.asUrl()?.value?.value
          _sourceUrl = this@with.source?.asUrl()?.value?.toElement()
          sourceString = this@with.source?.asString()?.value?.value
          _sourceString = this@with.source?.asString()?.value?.toElement()
          sourceMarkdown = this@with.source?.asMarkdown()?.value?.value
          _sourceMarkdown = this@with.source?.asMarkdown()?.value?.toElement()
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          generation = this@with.generation?.value?.getCode()
          _generation = this@with.generation?.toElement()
          page = this@with.page
        }
      }
  }
}

@Serializable
internal data class ImplementationGuideDefinitionParameterSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: Coding? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
) {
  public fun toModel(): ImplementationGuide.Definition.Parameter =
    ImplementationGuide.Definition.Parameter().apply {
      id = this@ImplementationGuideDefinitionParameterSurrogate.id
      extension = this@ImplementationGuideDefinitionParameterSurrogate.extension
      modifierExtension = this@ImplementationGuideDefinitionParameterSurrogate.modifierExtension
      code = this@ImplementationGuideDefinitionParameterSurrogate.code
      `value` =
        R5String.of(
          this@ImplementationGuideDefinitionParameterSurrogate.`value`,
          this@ImplementationGuideDefinitionParameterSurrogate._value,
        )
    }

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Definition.Parameter
    ): ImplementationGuideDefinitionParameterSurrogate =
      with(model) {
        ImplementationGuideDefinitionParameterSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code
          `value` = this@with.`value`?.value
          _value = this@with.`value`?.toElement()
        }
      }
  }
}

@Serializable
internal data class ImplementationGuideDefinitionTemplateSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var source: KotlinString? = null,
  public var _source: Element? = null,
  public var scope: KotlinString? = null,
  public var _scope: Element? = null,
) {
  public fun toModel(): ImplementationGuide.Definition.Template =
    ImplementationGuide.Definition.Template().apply {
      id = this@ImplementationGuideDefinitionTemplateSurrogate.id
      extension = this@ImplementationGuideDefinitionTemplateSurrogate.extension
      modifierExtension = this@ImplementationGuideDefinitionTemplateSurrogate.modifierExtension
      code =
        Code.of(
          this@ImplementationGuideDefinitionTemplateSurrogate.code,
          this@ImplementationGuideDefinitionTemplateSurrogate._code,
        )
      source =
        R5String.of(
          this@ImplementationGuideDefinitionTemplateSurrogate.source,
          this@ImplementationGuideDefinitionTemplateSurrogate._source,
        )
      scope =
        R5String.of(
          this@ImplementationGuideDefinitionTemplateSurrogate.scope,
          this@ImplementationGuideDefinitionTemplateSurrogate._scope,
        )
    }

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Definition.Template
    ): ImplementationGuideDefinitionTemplateSurrogate =
      with(model) {
        ImplementationGuideDefinitionTemplateSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code?.value
          _code = this@with.code?.toElement()
          source = this@with.source?.value
          _source = this@with.source?.toElement()
          scope = this@with.scope?.value
          _scope = this@with.scope?.toElement()
        }
      }
  }
}

@Serializable
internal data class ImplementationGuideDefinitionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var grouping: List<ImplementationGuide.Definition.Grouping>? = null,
  public var resource: List<ImplementationGuide.Definition.Resource>? = null,
  public var page: ImplementationGuide.Definition.Page? = null,
  public var parameter: List<ImplementationGuide.Definition.Parameter>? = null,
  public var template: List<ImplementationGuide.Definition.Template>? = null,
) {
  public fun toModel(): ImplementationGuide.Definition =
    ImplementationGuide.Definition().apply {
      id = this@ImplementationGuideDefinitionSurrogate.id
      extension = this@ImplementationGuideDefinitionSurrogate.extension
      modifierExtension = this@ImplementationGuideDefinitionSurrogate.modifierExtension
      grouping = this@ImplementationGuideDefinitionSurrogate.grouping
      resource = this@ImplementationGuideDefinitionSurrogate.resource
      page = this@ImplementationGuideDefinitionSurrogate.page
      parameter = this@ImplementationGuideDefinitionSurrogate.parameter
      template = this@ImplementationGuideDefinitionSurrogate.template
    }

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Definition
    ): ImplementationGuideDefinitionSurrogate =
      with(model) {
        ImplementationGuideDefinitionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          grouping = this@with.grouping
          resource = this@with.resource
          page = this@with.page
          parameter = this@with.parameter
          template = this@with.template
        }
      }
  }
}

@Serializable
internal data class ImplementationGuideManifestResourceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var reference: Reference? = null,
  public var isExample: KotlinBoolean? = null,
  public var _isExample: Element? = null,
  public var profile: List<KotlinString?>? = null,
  public var _profile: List<Element?>? = null,
  public var relativePath: KotlinString? = null,
  public var _relativePath: Element? = null,
) {
  public fun toModel(): ImplementationGuide.Manifest.Resource =
    ImplementationGuide.Manifest.Resource().apply {
      id = this@ImplementationGuideManifestResourceSurrogate.id
      extension = this@ImplementationGuideManifestResourceSurrogate.extension
      modifierExtension = this@ImplementationGuideManifestResourceSurrogate.modifierExtension
      reference = this@ImplementationGuideManifestResourceSurrogate.reference
      isExample =
        R5Boolean.of(
          this@ImplementationGuideManifestResourceSurrogate.isExample,
          this@ImplementationGuideManifestResourceSurrogate._isExample,
        )
      profile =
        if (
          this@ImplementationGuideManifestResourceSurrogate.profile == null &&
            this@ImplementationGuideManifestResourceSurrogate._profile == null
        ) {
          null
        } else {
          (this@ImplementationGuideManifestResourceSurrogate.profile
              ?: List(this@ImplementationGuideManifestResourceSurrogate._profile!!.size) { null })
            .zip(
              this@ImplementationGuideManifestResourceSurrogate._profile
                ?: List(this@ImplementationGuideManifestResourceSurrogate.profile!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      relativePath =
        Url.of(
          this@ImplementationGuideManifestResourceSurrogate.relativePath,
          this@ImplementationGuideManifestResourceSurrogate._relativePath,
        )
    }

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Manifest.Resource
    ): ImplementationGuideManifestResourceSurrogate =
      with(model) {
        ImplementationGuideManifestResourceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          reference = this@with.reference
          isExample = this@with.isExample?.value
          _isExample = this@with.isExample?.toElement()
          profile = this@with.profile?.map { it?.value }?.takeUnless { it.all { it == null } }
          _profile =
            this@with.profile?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          relativePath = this@with.relativePath?.value
          _relativePath = this@with.relativePath?.toElement()
        }
      }
  }
}

@Serializable
internal data class ImplementationGuideManifestPageSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var anchor: List<KotlinString?>? = null,
  public var _anchor: List<Element?>? = null,
) {
  public fun toModel(): ImplementationGuide.Manifest.Page =
    ImplementationGuide.Manifest.Page().apply {
      id = this@ImplementationGuideManifestPageSurrogate.id
      extension = this@ImplementationGuideManifestPageSurrogate.extension
      modifierExtension = this@ImplementationGuideManifestPageSurrogate.modifierExtension
      name =
        R5String.of(
          this@ImplementationGuideManifestPageSurrogate.name,
          this@ImplementationGuideManifestPageSurrogate._name,
        )
      title =
        R5String.of(
          this@ImplementationGuideManifestPageSurrogate.title,
          this@ImplementationGuideManifestPageSurrogate._title,
        )
      anchor =
        if (
          this@ImplementationGuideManifestPageSurrogate.anchor == null &&
            this@ImplementationGuideManifestPageSurrogate._anchor == null
        ) {
          null
        } else {
          (this@ImplementationGuideManifestPageSurrogate.anchor
              ?: List(this@ImplementationGuideManifestPageSurrogate._anchor!!.size) { null })
            .zip(
              this@ImplementationGuideManifestPageSurrogate._anchor
                ?: List(this@ImplementationGuideManifestPageSurrogate.anchor!!.size) { null }
            )
            .mapNotNull { (value, element) -> R5String.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Manifest.Page
    ): ImplementationGuideManifestPageSurrogate =
      with(model) {
        ImplementationGuideManifestPageSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          anchor = this@with.anchor?.map { it?.value }?.takeUnless { it.all { it == null } }
          _anchor = this@with.anchor?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
        }
      }
  }
}

@Serializable
internal data class ImplementationGuideManifestSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var rendering: KotlinString? = null,
  public var _rendering: Element? = null,
  public var resource: List<ImplementationGuide.Manifest.Resource>? = null,
  public var page: List<ImplementationGuide.Manifest.Page>? = null,
  public var image: List<KotlinString?>? = null,
  public var _image: List<Element?>? = null,
  public var other: List<KotlinString?>? = null,
  public var _other: List<Element?>? = null,
) {
  public fun toModel(): ImplementationGuide.Manifest =
    ImplementationGuide.Manifest().apply {
      id = this@ImplementationGuideManifestSurrogate.id
      extension = this@ImplementationGuideManifestSurrogate.extension
      modifierExtension = this@ImplementationGuideManifestSurrogate.modifierExtension
      rendering =
        Url.of(
          this@ImplementationGuideManifestSurrogate.rendering,
          this@ImplementationGuideManifestSurrogate._rendering,
        )
      resource = this@ImplementationGuideManifestSurrogate.resource
      page = this@ImplementationGuideManifestSurrogate.page
      image =
        if (
          this@ImplementationGuideManifestSurrogate.image == null &&
            this@ImplementationGuideManifestSurrogate._image == null
        ) {
          null
        } else {
          (this@ImplementationGuideManifestSurrogate.image
              ?: List(this@ImplementationGuideManifestSurrogate._image!!.size) { null })
            .zip(
              this@ImplementationGuideManifestSurrogate._image
                ?: List(this@ImplementationGuideManifestSurrogate.image!!.size) { null }
            )
            .mapNotNull { (value, element) -> R5String.of(value, element) }
        }
      other =
        if (
          this@ImplementationGuideManifestSurrogate.other == null &&
            this@ImplementationGuideManifestSurrogate._other == null
        ) {
          null
        } else {
          (this@ImplementationGuideManifestSurrogate.other
              ?: List(this@ImplementationGuideManifestSurrogate._other!!.size) { null })
            .zip(
              this@ImplementationGuideManifestSurrogate._other
                ?: List(this@ImplementationGuideManifestSurrogate.other!!.size) { null }
            )
            .mapNotNull { (value, element) -> R5String.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Manifest
    ): ImplementationGuideManifestSurrogate =
      with(model) {
        ImplementationGuideManifestSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          rendering = this@with.rendering?.value
          _rendering = this@with.rendering?.toElement()
          resource = this@with.resource
          page = this@with.page
          image = this@with.image?.map { it?.value }?.takeUnless { it.all { it == null } }
          _image = this@with.image?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          other = this@with.other?.map { it?.value }?.takeUnless { it.all { it == null } }
          _other = this@with.other?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
        }
      }
  }
}

@Serializable
internal data class ImplementationGuideSurrogate(
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
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: List<Identifier?>? = null,
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
  public var contact: List<ContactDetail?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: List<UsageContext?>? = null,
  public var jurisdiction: List<CodeableConcept?>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var copyrightLabel: KotlinString? = null,
  public var _copyrightLabel: Element? = null,
  public var packageId: KotlinString? = null,
  public var _packageId: Element? = null,
  public var license: KotlinString? = null,
  public var _license: Element? = null,
  public var fhirVersion: List<KotlinString?>? = null,
  public var _fhirVersion: List<Element?>? = null,
  public var dependsOn: List<ImplementationGuide.DependsOn>? = null,
  public var global: List<ImplementationGuide.Global>? = null,
  public var definition: ImplementationGuide.Definition? = null,
  public var manifest: ImplementationGuide.Manifest? = null,
) {
  public fun toModel(): ImplementationGuide =
    ImplementationGuide().apply {
      id = this@ImplementationGuideSurrogate.id
      meta = this@ImplementationGuideSurrogate.meta
      implicitRules =
        Uri.of(
          this@ImplementationGuideSurrogate.implicitRules,
          this@ImplementationGuideSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@ImplementationGuideSurrogate.language,
          this@ImplementationGuideSurrogate._language,
        )
      text = this@ImplementationGuideSurrogate.text
      contained = this@ImplementationGuideSurrogate.contained
      extension = this@ImplementationGuideSurrogate.extension
      modifierExtension = this@ImplementationGuideSurrogate.modifierExtension
      url = Uri.of(this@ImplementationGuideSurrogate.url, this@ImplementationGuideSurrogate._url)
      identifier = this@ImplementationGuideSurrogate.identifier
      version =
        R5String.of(
          this@ImplementationGuideSurrogate.version,
          this@ImplementationGuideSurrogate._version,
        )
      versionAlgorithm =
        ImplementationGuide.VersionAlgorithm?.from(
          R5String.of(
            this@ImplementationGuideSurrogate.versionAlgorithmString,
            this@ImplementationGuideSurrogate._versionAlgorithmString,
          ),
          this@ImplementationGuideSurrogate.versionAlgorithmCoding,
        )
      name =
        R5String.of(this@ImplementationGuideSurrogate.name, this@ImplementationGuideSurrogate._name)
      title =
        R5String.of(
          this@ImplementationGuideSurrogate.title,
          this@ImplementationGuideSurrogate._title,
        )
      status =
        Enumeration.of(
          this@ImplementationGuideSurrogate.status?.let {
            com.google.fhir.model.r5.PublicationStatus.fromCode(it)
          },
          this@ImplementationGuideSurrogate._status,
        )
      experimental =
        R5Boolean.of(
          this@ImplementationGuideSurrogate.experimental,
          this@ImplementationGuideSurrogate._experimental,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ImplementationGuideSurrogate.date),
          this@ImplementationGuideSurrogate._date,
        )
      publisher =
        R5String.of(
          this@ImplementationGuideSurrogate.publisher,
          this@ImplementationGuideSurrogate._publisher,
        )
      contact = this@ImplementationGuideSurrogate.contact
      description =
        Markdown.of(
          this@ImplementationGuideSurrogate.description,
          this@ImplementationGuideSurrogate._description,
        )
      useContext = this@ImplementationGuideSurrogate.useContext
      jurisdiction = this@ImplementationGuideSurrogate.jurisdiction
      purpose =
        Markdown.of(
          this@ImplementationGuideSurrogate.purpose,
          this@ImplementationGuideSurrogate._purpose,
        )
      copyright =
        Markdown.of(
          this@ImplementationGuideSurrogate.copyright,
          this@ImplementationGuideSurrogate._copyright,
        )
      copyrightLabel =
        R5String.of(
          this@ImplementationGuideSurrogate.copyrightLabel,
          this@ImplementationGuideSurrogate._copyrightLabel,
        )
      packageId =
        Id.of(
          this@ImplementationGuideSurrogate.packageId,
          this@ImplementationGuideSurrogate._packageId,
        )
      license =
        Enumeration.of(
          this@ImplementationGuideSurrogate.license?.let {
            com.google.fhir.model.r5.ImplementationGuide.SPDXLicense.fromCode(it)
          },
          this@ImplementationGuideSurrogate._license,
        )
      fhirVersion =
        if (
          this@ImplementationGuideSurrogate.fhirVersion == null &&
            this@ImplementationGuideSurrogate._fhirVersion == null
        ) {
          null
        } else {
          (this@ImplementationGuideSurrogate.fhirVersion
              ?: List(this@ImplementationGuideSurrogate._fhirVersion!!.size) { null })
            .zip(
              this@ImplementationGuideSurrogate._fhirVersion
                ?: List(this@ImplementationGuideSurrogate.fhirVersion!!.size) { null }
            )
            .mapNotNull { (value, element) ->
              Enumeration.of(
                value?.let { com.google.fhir.model.r5.FHIRVersion.fromCode(it) },
                element,
              )
            }
        }
      dependsOn = this@ImplementationGuideSurrogate.dependsOn
      global = this@ImplementationGuideSurrogate.global
      definition = this@ImplementationGuideSurrogate.definition
      manifest = this@ImplementationGuideSurrogate.manifest
    }

  public companion object {
    public fun fromModel(model: ImplementationGuide): ImplementationGuideSurrogate =
      with(model) {
        ImplementationGuideSurrogate().apply {
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
          url = this@with.url?.value
          _url = this@with.url?.toElement()
          identifier = this@with.identifier
          version = this@with.version?.value
          _version = this@with.version?.toElement()
          versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.value
          _versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.toElement()
          versionAlgorithmCoding = this@with.versionAlgorithm?.asCoding()?.value
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          experimental = this@with.experimental?.value
          _experimental = this@with.experimental?.toElement()
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          publisher = this@with.publisher?.value
          _publisher = this@with.publisher?.toElement()
          contact = this@with.contact
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          useContext = this@with.useContext
          jurisdiction = this@with.jurisdiction
          purpose = this@with.purpose?.value
          _purpose = this@with.purpose?.toElement()
          copyright = this@with.copyright?.value
          _copyright = this@with.copyright?.toElement()
          copyrightLabel = this@with.copyrightLabel?.value
          _copyrightLabel = this@with.copyrightLabel?.toElement()
          packageId = this@with.packageId?.value
          _packageId = this@with.packageId?.toElement()
          license = this@with.license?.value?.getCode()
          _license = this@with.license?.toElement()
          fhirVersion =
            this@with.fhirVersion
              ?.map { it?.value?.getCode() }
              ?.takeUnless { it.all { it == null } }
          _fhirVersion =
            this@with.fhirVersion?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          dependsOn = this@with.dependsOn
          global = this@with.global
          definition = this@with.definition
          manifest = this@with.manifest
        }
      }
  }
}
