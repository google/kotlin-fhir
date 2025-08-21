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

import com.google.fhir.model.r4.Boolean as R4Boolean
import com.google.fhir.model.r4.Canonical
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.ContactDetail
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Id
import com.google.fhir.model.r4.ImplementationGuide
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.Url
import com.google.fhir.model.r4.UsageContext
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ImplementationGuideDependsOnSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var uri: KotlinString? = null,
  public var _uri: Element? = null,
  public var packageId: KotlinString? = null,
  public var _packageId: Element? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
) {
  public fun toModel(): ImplementationGuide.DependsOn =
    ImplementationGuide.DependsOn(
      id = this@ImplementationGuideDependsOnSurrogate.id,
      extension = this@ImplementationGuideDependsOnSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImplementationGuideDependsOnSurrogate.modifierExtension ?: mutableListOf(),
      uri =
        Canonical.of(
          this@ImplementationGuideDependsOnSurrogate.uri,
          this@ImplementationGuideDependsOnSurrogate._uri,
        )!!,
      packageId =
        Id.of(
          this@ImplementationGuideDependsOnSurrogate.packageId,
          this@ImplementationGuideDependsOnSurrogate._packageId,
        ),
      version =
        R4String.of(
          this@ImplementationGuideDependsOnSurrogate.version,
          this@ImplementationGuideDependsOnSurrogate._version,
        ),
    )

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.DependsOn
    ): ImplementationGuideDependsOnSurrogate =
      with(model) {
        ImplementationGuideDependsOnSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          uri = this@with.uri.value,
          _uri = this@with.uri.toElement(),
          packageId = this@with.packageId?.value,
          _packageId = this@with.packageId?.toElement(),
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ImplementationGuideGlobalSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var profile: KotlinString? = null,
  public var _profile: Element? = null,
) {
  public fun toModel(): ImplementationGuide.Global =
    ImplementationGuide.Global(
      id = this@ImplementationGuideGlobalSurrogate.id,
      extension = this@ImplementationGuideGlobalSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImplementationGuideGlobalSurrogate.modifierExtension ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r4.terminologies.ResourceType.fromCode(
            this@ImplementationGuideGlobalSurrogate.type!!
          ),
          this@ImplementationGuideGlobalSurrogate._type,
        ),
      profile =
        Canonical.of(
          this@ImplementationGuideGlobalSurrogate.profile,
          this@ImplementationGuideGlobalSurrogate._profile,
        )!!,
    )

  public companion object {
    public fun fromModel(model: ImplementationGuide.Global): ImplementationGuideGlobalSurrogate =
      with(model) {
        ImplementationGuideGlobalSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          profile = this@with.profile.value,
          _profile = this@with.profile.toElement(),
        )
      }
  }
}

@Serializable
internal data class ImplementationGuideDefinitionGroupingSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
) {
  public fun toModel(): ImplementationGuide.Definition.Grouping =
    ImplementationGuide.Definition.Grouping(
      id = this@ImplementationGuideDefinitionGroupingSurrogate.id,
      extension = this@ImplementationGuideDefinitionGroupingSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImplementationGuideDefinitionGroupingSurrogate.modifierExtension ?: mutableListOf(),
      name =
        R4String.of(
          this@ImplementationGuideDefinitionGroupingSurrogate.name,
          this@ImplementationGuideDefinitionGroupingSurrogate._name,
        )!!,
      description =
        R4String.of(
          this@ImplementationGuideDefinitionGroupingSurrogate.description,
          this@ImplementationGuideDefinitionGroupingSurrogate._description,
        ),
    )

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Definition.Grouping
    ): ImplementationGuideDefinitionGroupingSurrogate =
      with(model) {
        ImplementationGuideDefinitionGroupingSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ImplementationGuideDefinitionResourceExampleSurrogate(
  public var exampleBoolean: KotlinBoolean? = null,
  public var _exampleBoolean: Element? = null,
  public var exampleCanonical: KotlinString? = null,
  public var _exampleCanonical: Element? = null,
) {
  public fun toModel(): ImplementationGuide.Definition.Resource.Example =
    ImplementationGuide.Definition.Resource.Example?.from(
      R4Boolean.of(
        this@ImplementationGuideDefinitionResourceExampleSurrogate.exampleBoolean,
        this@ImplementationGuideDefinitionResourceExampleSurrogate._exampleBoolean,
      ),
      Canonical.of(
        this@ImplementationGuideDefinitionResourceExampleSurrogate.exampleCanonical,
        this@ImplementationGuideDefinitionResourceExampleSurrogate._exampleCanonical,
      ),
    )!!

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Definition.Resource.Example
    ): ImplementationGuideDefinitionResourceExampleSurrogate =
      with(model) {
        ImplementationGuideDefinitionResourceExampleSurrogate(
          exampleBoolean = this@with.asBoolean()?.value?.value,
          _exampleBoolean = this@with.asBoolean()?.value?.toElement(),
          exampleCanonical = this@with.asCanonical()?.value?.value,
          _exampleCanonical = this@with.asCanonical()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ImplementationGuideDefinitionResourceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var reference: Reference,
  public var fhirVersion: MutableList<KotlinString?>? = null,
  public var _fhirVersion: MutableList<Element?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var example: ImplementationGuide.Definition.Resource.Example? = null,
  public var groupingId: KotlinString? = null,
  public var _groupingId: Element? = null,
) {
  public fun toModel(): ImplementationGuide.Definition.Resource =
    ImplementationGuide.Definition.Resource(
      id = this@ImplementationGuideDefinitionResourceSurrogate.id,
      extension = this@ImplementationGuideDefinitionResourceSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImplementationGuideDefinitionResourceSurrogate.modifierExtension ?: mutableListOf(),
      reference = this@ImplementationGuideDefinitionResourceSurrogate.reference,
      fhirVersion =
        if (
          this@ImplementationGuideDefinitionResourceSurrogate.fhirVersion == null &&
            this@ImplementationGuideDefinitionResourceSurrogate._fhirVersion == null
        ) {
          mutableListOf()
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
            .map { (value, element) ->
              Enumeration.of(
                value.let { com.google.fhir.model.r4.terminologies.FHIRVersion.fromCode(it!!)!! },
                element,
              )
            }
            .toMutableList()
        },
      name =
        R4String.of(
          this@ImplementationGuideDefinitionResourceSurrogate.name,
          this@ImplementationGuideDefinitionResourceSurrogate._name,
        ),
      description =
        R4String.of(
          this@ImplementationGuideDefinitionResourceSurrogate.description,
          this@ImplementationGuideDefinitionResourceSurrogate._description,
        ),
      example = this@ImplementationGuideDefinitionResourceSurrogate.example,
      groupingId =
        Id.of(
          this@ImplementationGuideDefinitionResourceSurrogate.groupingId,
          this@ImplementationGuideDefinitionResourceSurrogate._groupingId,
        ),
    )

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Definition.Resource
    ): ImplementationGuideDefinitionResourceSurrogate =
      with(model) {
        ImplementationGuideDefinitionResourceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          reference = this@with.reference,
          fhirVersion =
            this@with.fhirVersion
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _fhirVersion =
            this@with.fhirVersion
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          example = this@with.example,
          groupingId = this@with.groupingId?.value,
          _groupingId = this@with.groupingId?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ImplementationGuideDefinitionPageNameSurrogate(
  public var nameUrl: KotlinString? = null,
  public var _nameUrl: Element? = null,
  public var nameReference: Reference? = null,
) {
  public fun toModel(): ImplementationGuide.Definition.Page.Name =
    ImplementationGuide.Definition.Page.Name.from(
      Url.of(
        this@ImplementationGuideDefinitionPageNameSurrogate.nameUrl,
        this@ImplementationGuideDefinitionPageNameSurrogate._nameUrl,
      ),
      this@ImplementationGuideDefinitionPageNameSurrogate.nameReference,
    )!! !!

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Definition.Page.Name
    ): ImplementationGuideDefinitionPageNameSurrogate =
      with(model) {
        ImplementationGuideDefinitionPageNameSurrogate(
          nameUrl = this@with.asUrl()?.value?.value,
          _nameUrl = this@with.asUrl()?.value?.toElement(),
          nameReference = this@with.asReference()?.value,
        )
      }
  }
}

@Serializable
internal data class ImplementationGuideDefinitionPageSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: ImplementationGuide.Definition.Page.Name,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var generation: KotlinString? = null,
  public var _generation: Element? = null,
  public var page: MutableList<ImplementationGuide.Definition.Page>? = null,
) {
  public fun toModel(): ImplementationGuide.Definition.Page =
    ImplementationGuide.Definition.Page(
      id = this@ImplementationGuideDefinitionPageSurrogate.id,
      extension = this@ImplementationGuideDefinitionPageSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImplementationGuideDefinitionPageSurrogate.modifierExtension ?: mutableListOf(),
      name = this@ImplementationGuideDefinitionPageSurrogate.name,
      title =
        R4String.of(
          this@ImplementationGuideDefinitionPageSurrogate.title,
          this@ImplementationGuideDefinitionPageSurrogate._title,
        )!!,
      generation =
        Enumeration.of(
          com.google.fhir.model.r4.ImplementationGuide.GuidePageGeneration.fromCode(
            this@ImplementationGuideDefinitionPageSurrogate.generation!!
          ),
          this@ImplementationGuideDefinitionPageSurrogate._generation,
        ),
      page = this@ImplementationGuideDefinitionPageSurrogate.page ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Definition.Page
    ): ImplementationGuideDefinitionPageSurrogate =
      with(model) {
        ImplementationGuideDefinitionPageSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name,
          title = this@with.title.value,
          _title = this@with.title.toElement(),
          generation = this@with.generation.value?.getCode(),
          _generation = this@with.generation.toElement(),
          page = this@with.page.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ImplementationGuideDefinitionParameterSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
) {
  public fun toModel(): ImplementationGuide.Definition.Parameter =
    ImplementationGuide.Definition.Parameter(
      id = this@ImplementationGuideDefinitionParameterSurrogate.id,
      extension = this@ImplementationGuideDefinitionParameterSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImplementationGuideDefinitionParameterSurrogate.modifierExtension ?: mutableListOf(),
      code =
        Enumeration.of(
          com.google.fhir.model.r4.ImplementationGuide.GuideParameterCode.fromCode(
            this@ImplementationGuideDefinitionParameterSurrogate.code!!
          ),
          this@ImplementationGuideDefinitionParameterSurrogate._code,
        ),
      `value` =
        R4String.of(
          this@ImplementationGuideDefinitionParameterSurrogate.`value`,
          this@ImplementationGuideDefinitionParameterSurrogate._value,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Definition.Parameter
    ): ImplementationGuideDefinitionParameterSurrogate =
      with(model) {
        ImplementationGuideDefinitionParameterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value?.getCode(),
          _code = this@with.code.toElement(),
          `value` = this@with.`value`.value,
          _value = this@with.`value`.toElement(),
        )
      }
  }
}

@Serializable
internal data class ImplementationGuideDefinitionTemplateSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var source: KotlinString? = null,
  public var _source: Element? = null,
  public var scope: KotlinString? = null,
  public var _scope: Element? = null,
) {
  public fun toModel(): ImplementationGuide.Definition.Template =
    ImplementationGuide.Definition.Template(
      id = this@ImplementationGuideDefinitionTemplateSurrogate.id,
      extension = this@ImplementationGuideDefinitionTemplateSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImplementationGuideDefinitionTemplateSurrogate.modifierExtension ?: mutableListOf(),
      code =
        Code.of(
          this@ImplementationGuideDefinitionTemplateSurrogate.code,
          this@ImplementationGuideDefinitionTemplateSurrogate._code,
        )!!,
      source =
        R4String.of(
          this@ImplementationGuideDefinitionTemplateSurrogate.source,
          this@ImplementationGuideDefinitionTemplateSurrogate._source,
        )!!,
      scope =
        R4String.of(
          this@ImplementationGuideDefinitionTemplateSurrogate.scope,
          this@ImplementationGuideDefinitionTemplateSurrogate._scope,
        ),
    )

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Definition.Template
    ): ImplementationGuideDefinitionTemplateSurrogate =
      with(model) {
        ImplementationGuideDefinitionTemplateSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code.value,
          _code = this@with.code.toElement(),
          source = this@with.source.value,
          _source = this@with.source.toElement(),
          scope = this@with.scope?.value,
          _scope = this@with.scope?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ImplementationGuideDefinitionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var grouping: MutableList<ImplementationGuide.Definition.Grouping>? = null,
  public var resource: MutableList<ImplementationGuide.Definition.Resource>? = null,
  public var page: ImplementationGuide.Definition.Page? = null,
  public var parameter: MutableList<ImplementationGuide.Definition.Parameter>? = null,
  public var template: MutableList<ImplementationGuide.Definition.Template>? = null,
) {
  public fun toModel(): ImplementationGuide.Definition =
    ImplementationGuide.Definition(
      id = this@ImplementationGuideDefinitionSurrogate.id,
      extension = this@ImplementationGuideDefinitionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImplementationGuideDefinitionSurrogate.modifierExtension ?: mutableListOf(),
      grouping = this@ImplementationGuideDefinitionSurrogate.grouping ?: mutableListOf(),
      resource = this@ImplementationGuideDefinitionSurrogate.resource ?: mutableListOf(),
      page = this@ImplementationGuideDefinitionSurrogate.page,
      parameter = this@ImplementationGuideDefinitionSurrogate.parameter ?: mutableListOf(),
      template = this@ImplementationGuideDefinitionSurrogate.template ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Definition
    ): ImplementationGuideDefinitionSurrogate =
      with(model) {
        ImplementationGuideDefinitionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          grouping = this@with.grouping.takeUnless { it.all { it == null } },
          resource = this@with.resource.takeUnless { it.all { it == null } },
          page = this@with.page,
          parameter = this@with.parameter.takeUnless { it.all { it == null } },
          template = this@with.template.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ImplementationGuideManifestResourceExampleSurrogate(
  public var exampleBoolean: KotlinBoolean? = null,
  public var _exampleBoolean: Element? = null,
  public var exampleCanonical: KotlinString? = null,
  public var _exampleCanonical: Element? = null,
) {
  public fun toModel(): ImplementationGuide.Manifest.Resource.Example =
    ImplementationGuide.Manifest.Resource.Example?.from(
      R4Boolean.of(
        this@ImplementationGuideManifestResourceExampleSurrogate.exampleBoolean,
        this@ImplementationGuideManifestResourceExampleSurrogate._exampleBoolean,
      ),
      Canonical.of(
        this@ImplementationGuideManifestResourceExampleSurrogate.exampleCanonical,
        this@ImplementationGuideManifestResourceExampleSurrogate._exampleCanonical,
      ),
    )!!

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Manifest.Resource.Example
    ): ImplementationGuideManifestResourceExampleSurrogate =
      with(model) {
        ImplementationGuideManifestResourceExampleSurrogate(
          exampleBoolean = this@with.asBoolean()?.value?.value,
          _exampleBoolean = this@with.asBoolean()?.value?.toElement(),
          exampleCanonical = this@with.asCanonical()?.value?.value,
          _exampleCanonical = this@with.asCanonical()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ImplementationGuideManifestResourceSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var reference: Reference,
  public var example: ImplementationGuide.Manifest.Resource.Example? = null,
  public var relativePath: KotlinString? = null,
  public var _relativePath: Element? = null,
) {
  public fun toModel(): ImplementationGuide.Manifest.Resource =
    ImplementationGuide.Manifest.Resource(
      id = this@ImplementationGuideManifestResourceSurrogate.id,
      extension = this@ImplementationGuideManifestResourceSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImplementationGuideManifestResourceSurrogate.modifierExtension ?: mutableListOf(),
      reference = this@ImplementationGuideManifestResourceSurrogate.reference,
      example = this@ImplementationGuideManifestResourceSurrogate.example,
      relativePath =
        Url.of(
          this@ImplementationGuideManifestResourceSurrogate.relativePath,
          this@ImplementationGuideManifestResourceSurrogate._relativePath,
        ),
    )

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Manifest.Resource
    ): ImplementationGuideManifestResourceSurrogate =
      with(model) {
        ImplementationGuideManifestResourceSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          reference = this@with.reference,
          example = this@with.example,
          relativePath = this@with.relativePath?.value,
          _relativePath = this@with.relativePath?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ImplementationGuideManifestPageSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var anchor: MutableList<KotlinString?>? = null,
  public var _anchor: MutableList<Element?>? = null,
) {
  public fun toModel(): ImplementationGuide.Manifest.Page =
    ImplementationGuide.Manifest.Page(
      id = this@ImplementationGuideManifestPageSurrogate.id,
      extension = this@ImplementationGuideManifestPageSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImplementationGuideManifestPageSurrogate.modifierExtension ?: mutableListOf(),
      name =
        R4String.of(
          this@ImplementationGuideManifestPageSurrogate.name,
          this@ImplementationGuideManifestPageSurrogate._name,
        )!!,
      title =
        R4String.of(
          this@ImplementationGuideManifestPageSurrogate.title,
          this@ImplementationGuideManifestPageSurrogate._title,
        ),
      anchor =
        if (
          this@ImplementationGuideManifestPageSurrogate.anchor == null &&
            this@ImplementationGuideManifestPageSurrogate._anchor == null
        ) {
          mutableListOf()
        } else {
          (this@ImplementationGuideManifestPageSurrogate.anchor
              ?: List(this@ImplementationGuideManifestPageSurrogate._anchor!!.size) { null })
            .zip(
              this@ImplementationGuideManifestPageSurrogate._anchor
                ?: List(this@ImplementationGuideManifestPageSurrogate.anchor!!.size) { null }
            )
            .map { (value, element) -> R4String.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Manifest.Page
    ): ImplementationGuideManifestPageSurrogate =
      with(model) {
        ImplementationGuideManifestPageSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name.value,
          _name = this@with.name.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          anchor =
            this@with.anchor.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _anchor =
            this@with.anchor
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class ImplementationGuideManifestSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var rendering: KotlinString? = null,
  public var _rendering: Element? = null,
  public var resource: MutableList<ImplementationGuide.Manifest.Resource>? = null,
  public var page: MutableList<ImplementationGuide.Manifest.Page>? = null,
  public var image: MutableList<KotlinString?>? = null,
  public var _image: MutableList<Element?>? = null,
  public var other: MutableList<KotlinString?>? = null,
  public var _other: MutableList<Element?>? = null,
) {
  public fun toModel(): ImplementationGuide.Manifest =
    ImplementationGuide.Manifest(
      id = this@ImplementationGuideManifestSurrogate.id,
      extension = this@ImplementationGuideManifestSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ImplementationGuideManifestSurrogate.modifierExtension ?: mutableListOf(),
      rendering =
        Url.of(
          this@ImplementationGuideManifestSurrogate.rendering,
          this@ImplementationGuideManifestSurrogate._rendering,
        ),
      resource = this@ImplementationGuideManifestSurrogate.resource ?: mutableListOf(),
      page = this@ImplementationGuideManifestSurrogate.page ?: mutableListOf(),
      image =
        if (
          this@ImplementationGuideManifestSurrogate.image == null &&
            this@ImplementationGuideManifestSurrogate._image == null
        ) {
          mutableListOf()
        } else {
          (this@ImplementationGuideManifestSurrogate.image
              ?: List(this@ImplementationGuideManifestSurrogate._image!!.size) { null })
            .zip(
              this@ImplementationGuideManifestSurrogate._image
                ?: List(this@ImplementationGuideManifestSurrogate.image!!.size) { null }
            )
            .map { (value, element) -> R4String.of(value, element)!! }
            .toMutableList()
        },
      other =
        if (
          this@ImplementationGuideManifestSurrogate.other == null &&
            this@ImplementationGuideManifestSurrogate._other == null
        ) {
          mutableListOf()
        } else {
          (this@ImplementationGuideManifestSurrogate.other
              ?: List(this@ImplementationGuideManifestSurrogate._other!!.size) { null })
            .zip(
              this@ImplementationGuideManifestSurrogate._other
                ?: List(this@ImplementationGuideManifestSurrogate.other!!.size) { null }
            )
            .map { (value, element) -> R4String.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(
      model: ImplementationGuide.Manifest
    ): ImplementationGuideManifestSurrogate =
      with(model) {
        ImplementationGuideManifestSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          rendering = this@with.rendering?.value,
          _rendering = this@with.rendering?.toElement(),
          resource = this@with.resource.takeUnless { it.all { it == null } },
          page = this@with.page.takeUnless { it.all { it == null } },
          image =
            this@with.image.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _image =
            this@with.image
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          other =
            this@with.other.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _other =
            this@with.other
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
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
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var packageId: KotlinString? = null,
  public var _packageId: Element? = null,
  public var license: KotlinString? = null,
  public var _license: Element? = null,
  public var fhirVersion: MutableList<KotlinString?>? = null,
  public var _fhirVersion: MutableList<Element?>? = null,
  public var dependsOn: MutableList<ImplementationGuide.DependsOn>? = null,
  public var global: MutableList<ImplementationGuide.Global>? = null,
  public var definition: ImplementationGuide.Definition? = null,
  public var manifest: ImplementationGuide.Manifest? = null,
) {
  public fun toModel(): ImplementationGuide =
    ImplementationGuide(
      id = this@ImplementationGuideSurrogate.id,
      meta = this@ImplementationGuideSurrogate.meta,
      implicitRules =
        Uri.of(
          this@ImplementationGuideSurrogate.implicitRules,
          this@ImplementationGuideSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@ImplementationGuideSurrogate.language,
          this@ImplementationGuideSurrogate._language,
        ),
      text = this@ImplementationGuideSurrogate.text,
      contained = this@ImplementationGuideSurrogate.contained ?: mutableListOf(),
      extension = this@ImplementationGuideSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ImplementationGuideSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@ImplementationGuideSurrogate.url, this@ImplementationGuideSurrogate._url)!!,
      version =
        R4String.of(
          this@ImplementationGuideSurrogate.version,
          this@ImplementationGuideSurrogate._version,
        ),
      name =
        R4String.of(
          this@ImplementationGuideSurrogate.name,
          this@ImplementationGuideSurrogate._name,
        )!!,
      title =
        R4String.of(
          this@ImplementationGuideSurrogate.title,
          this@ImplementationGuideSurrogate._title,
        ),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.terminologies.PublicationStatus.fromCode(
            this@ImplementationGuideSurrogate.status!!
          ),
          this@ImplementationGuideSurrogate._status,
        ),
      experimental =
        R4Boolean.of(
          this@ImplementationGuideSurrogate.experimental,
          this@ImplementationGuideSurrogate._experimental,
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ImplementationGuideSurrogate.date),
          this@ImplementationGuideSurrogate._date,
        ),
      publisher =
        R4String.of(
          this@ImplementationGuideSurrogate.publisher,
          this@ImplementationGuideSurrogate._publisher,
        ),
      contact = this@ImplementationGuideSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@ImplementationGuideSurrogate.description,
          this@ImplementationGuideSurrogate._description,
        ),
      useContext = this@ImplementationGuideSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@ImplementationGuideSurrogate.jurisdiction ?: mutableListOf(),
      copyright =
        Markdown.of(
          this@ImplementationGuideSurrogate.copyright,
          this@ImplementationGuideSurrogate._copyright,
        ),
      packageId =
        Id.of(
          this@ImplementationGuideSurrogate.packageId,
          this@ImplementationGuideSurrogate._packageId,
        )!!,
      license =
        this@ImplementationGuideSurrogate.license?.let {
          Enumeration.of(
            com.google.fhir.model.r4.ImplementationGuide.SPDXLicense.fromCode(it!!),
            this@ImplementationGuideSurrogate._license,
          )
        },
      fhirVersion =
        if (
          this@ImplementationGuideSurrogate.fhirVersion == null &&
            this@ImplementationGuideSurrogate._fhirVersion == null
        ) {
          mutableListOf()
        } else {
          (this@ImplementationGuideSurrogate.fhirVersion
              ?: List(this@ImplementationGuideSurrogate._fhirVersion!!.size) { null })
            .zip(
              this@ImplementationGuideSurrogate._fhirVersion
                ?: List(this@ImplementationGuideSurrogate.fhirVersion!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let { com.google.fhir.model.r4.terminologies.FHIRVersion.fromCode(it!!)!! },
                element,
              )
            }
            .toMutableList()
        },
      dependsOn = this@ImplementationGuideSurrogate.dependsOn ?: mutableListOf(),
      global = this@ImplementationGuideSurrogate.global ?: mutableListOf(),
      definition = this@ImplementationGuideSurrogate.definition,
      manifest = this@ImplementationGuideSurrogate.manifest,
    )

  public companion object {
    public fun fromModel(model: ImplementationGuide): ImplementationGuideSurrogate =
      with(model) {
        ImplementationGuideSurrogate(
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
          url = this@with.url.value,
          _url = this@with.url.toElement(),
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          name = this@with.name.value,
          _name = this@with.name.toElement(),
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
          copyright = this@with.copyright?.value,
          _copyright = this@with.copyright?.toElement(),
          packageId = this@with.packageId.value,
          _packageId = this@with.packageId.toElement(),
          license = this@with.license?.value?.getCode(),
          _license = this@with.license?.toElement(),
          fhirVersion =
            this@with.fhirVersion
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _fhirVersion =
            this@with.fhirVersion
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          dependsOn = this@with.dependsOn.takeUnless { it.all { it == null } },
          global = this@with.global.takeUnless { it.all { it == null } },
          definition = this@with.definition,
          manifest = this@with.manifest,
        )
      }
  }
}
