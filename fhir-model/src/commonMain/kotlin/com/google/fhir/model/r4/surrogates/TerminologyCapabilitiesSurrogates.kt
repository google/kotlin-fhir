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
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.TerminologyCapabilities
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.Url
import com.google.fhir.model.r4.UsageContext
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class TerminologyCapabilitiesSoftwareSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
) {
  public fun toModel(): TerminologyCapabilities.Software =
    TerminologyCapabilities.Software().apply {
      id = this@TerminologyCapabilitiesSoftwareSurrogate.id
      extension = this@TerminologyCapabilitiesSoftwareSurrogate.extension
      modifierExtension = this@TerminologyCapabilitiesSoftwareSurrogate.modifierExtension
      name =
        R4String.of(
          this@TerminologyCapabilitiesSoftwareSurrogate.name,
          this@TerminologyCapabilitiesSoftwareSurrogate._name,
        )
      version =
        R4String.of(
          this@TerminologyCapabilitiesSoftwareSurrogate.version,
          this@TerminologyCapabilitiesSoftwareSurrogate._version,
        )
    }

  public companion object {
    public fun fromModel(
      model: TerminologyCapabilities.Software
    ): TerminologyCapabilitiesSoftwareSurrogate =
      with(model) {
        TerminologyCapabilitiesSoftwareSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          version = this@with.version?.value
          _version = this@with.version?.toElement()
        }
      }
  }
}

@Serializable
internal data class TerminologyCapabilitiesImplementationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
) {
  public fun toModel(): TerminologyCapabilities.Implementation =
    TerminologyCapabilities.Implementation().apply {
      id = this@TerminologyCapabilitiesImplementationSurrogate.id
      extension = this@TerminologyCapabilitiesImplementationSurrogate.extension
      modifierExtension = this@TerminologyCapabilitiesImplementationSurrogate.modifierExtension
      description =
        R4String.of(
          this@TerminologyCapabilitiesImplementationSurrogate.description,
          this@TerminologyCapabilitiesImplementationSurrogate._description,
        )
      url =
        Url.of(
          this@TerminologyCapabilitiesImplementationSurrogate.url,
          this@TerminologyCapabilitiesImplementationSurrogate._url,
        )
    }

  public companion object {
    public fun fromModel(
      model: TerminologyCapabilities.Implementation
    ): TerminologyCapabilitiesImplementationSurrogate =
      with(model) {
        TerminologyCapabilitiesImplementationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          url = this@with.url?.value
          _url = this@with.url?.toElement()
        }
      }
  }
}

@Serializable
internal data class TerminologyCapabilitiesCodeSystemVersionFilterSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var op: List<KotlinString?>? = null,
  public var _op: List<Element?>? = null,
) {
  public fun toModel(): TerminologyCapabilities.CodeSystem.Version.Filter =
    TerminologyCapabilities.CodeSystem.Version.Filter().apply {
      id = this@TerminologyCapabilitiesCodeSystemVersionFilterSurrogate.id
      extension = this@TerminologyCapabilitiesCodeSystemVersionFilterSurrogate.extension
      modifierExtension =
        this@TerminologyCapabilitiesCodeSystemVersionFilterSurrogate.modifierExtension
      code =
        Code.of(
          this@TerminologyCapabilitiesCodeSystemVersionFilterSurrogate.code,
          this@TerminologyCapabilitiesCodeSystemVersionFilterSurrogate._code,
        )
      op =
        if (
          this@TerminologyCapabilitiesCodeSystemVersionFilterSurrogate.op == null &&
            this@TerminologyCapabilitiesCodeSystemVersionFilterSurrogate._op == null
        ) {
          null
        } else {
          (this@TerminologyCapabilitiesCodeSystemVersionFilterSurrogate.op
              ?: List(this@TerminologyCapabilitiesCodeSystemVersionFilterSurrogate._op!!.size) {
                null
              })
            .zip(
              this@TerminologyCapabilitiesCodeSystemVersionFilterSurrogate._op
                ?: List(this@TerminologyCapabilitiesCodeSystemVersionFilterSurrogate.op!!.size) {
                  null
                }
            )
            .mapNotNull { (value, element) -> Code.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(
      model: TerminologyCapabilities.CodeSystem.Version.Filter
    ): TerminologyCapabilitiesCodeSystemVersionFilterSurrogate =
      with(model) {
        TerminologyCapabilitiesCodeSystemVersionFilterSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code?.value
          _code = this@with.code?.toElement()
          op = this@with.op?.map { it?.value }?.takeUnless { it.all { it == null } }
          _op = this@with.op?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
        }
      }
  }
}

@Serializable
internal data class TerminologyCapabilitiesCodeSystemVersionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var isDefault: KotlinBoolean? = null,
  public var _isDefault: Element? = null,
  public var compositional: KotlinBoolean? = null,
  public var _compositional: Element? = null,
  public var language: List<KotlinString?>? = null,
  public var _language: List<Element?>? = null,
  public var filter: List<TerminologyCapabilities.CodeSystem.Version.Filter>? = null,
  public var `property`: List<KotlinString?>? = null,
  public var _property: List<Element?>? = null,
) {
  public fun toModel(): TerminologyCapabilities.CodeSystem.Version =
    TerminologyCapabilities.CodeSystem.Version().apply {
      id = this@TerminologyCapabilitiesCodeSystemVersionSurrogate.id
      extension = this@TerminologyCapabilitiesCodeSystemVersionSurrogate.extension
      modifierExtension = this@TerminologyCapabilitiesCodeSystemVersionSurrogate.modifierExtension
      code =
        R4String.of(
          this@TerminologyCapabilitiesCodeSystemVersionSurrogate.code,
          this@TerminologyCapabilitiesCodeSystemVersionSurrogate._code,
        )
      isDefault =
        R4Boolean.of(
          this@TerminologyCapabilitiesCodeSystemVersionSurrogate.isDefault,
          this@TerminologyCapabilitiesCodeSystemVersionSurrogate._isDefault,
        )
      compositional =
        R4Boolean.of(
          this@TerminologyCapabilitiesCodeSystemVersionSurrogate.compositional,
          this@TerminologyCapabilitiesCodeSystemVersionSurrogate._compositional,
        )
      language =
        if (
          this@TerminologyCapabilitiesCodeSystemVersionSurrogate.language == null &&
            this@TerminologyCapabilitiesCodeSystemVersionSurrogate._language == null
        ) {
          null
        } else {
          (this@TerminologyCapabilitiesCodeSystemVersionSurrogate.language
              ?: List(this@TerminologyCapabilitiesCodeSystemVersionSurrogate._language!!.size) {
                null
              })
            .zip(
              this@TerminologyCapabilitiesCodeSystemVersionSurrogate._language
                ?: List(this@TerminologyCapabilitiesCodeSystemVersionSurrogate.language!!.size) {
                  null
                }
            )
            .mapNotNull { (value, element) -> Code.of(value, element) }
        }
      filter = this@TerminologyCapabilitiesCodeSystemVersionSurrogate.filter
      `property` =
        if (
          this@TerminologyCapabilitiesCodeSystemVersionSurrogate.`property` == null &&
            this@TerminologyCapabilitiesCodeSystemVersionSurrogate._property == null
        ) {
          null
        } else {
          (this@TerminologyCapabilitiesCodeSystemVersionSurrogate.`property`
              ?: List(this@TerminologyCapabilitiesCodeSystemVersionSurrogate._property!!.size) {
                null
              })
            .zip(
              this@TerminologyCapabilitiesCodeSystemVersionSurrogate._property
                ?: List(this@TerminologyCapabilitiesCodeSystemVersionSurrogate.`property`!!.size) {
                  null
                }
            )
            .mapNotNull { (value, element) -> Code.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(
      model: TerminologyCapabilities.CodeSystem.Version
    ): TerminologyCapabilitiesCodeSystemVersionSurrogate =
      with(model) {
        TerminologyCapabilitiesCodeSystemVersionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          code = this@with.code?.value
          _code = this@with.code?.toElement()
          isDefault = this@with.isDefault?.value
          _isDefault = this@with.isDefault?.toElement()
          compositional = this@with.compositional?.value
          _compositional = this@with.compositional?.toElement()
          language = this@with.language?.map { it?.value }?.takeUnless { it.all { it == null } }
          _language =
            this@with.language?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          filter = this@with.filter
          `property` = this@with.`property`?.map { it?.value }?.takeUnless { it.all { it == null } }
          _property =
            this@with.`property`?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
        }
      }
  }
}

@Serializable
internal data class TerminologyCapabilitiesCodeSystemSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var uri: KotlinString? = null,
  public var _uri: Element? = null,
  public var version: List<TerminologyCapabilities.CodeSystem.Version>? = null,
  public var subsumption: KotlinBoolean? = null,
  public var _subsumption: Element? = null,
) {
  public fun toModel(): TerminologyCapabilities.CodeSystem =
    TerminologyCapabilities.CodeSystem().apply {
      id = this@TerminologyCapabilitiesCodeSystemSurrogate.id
      extension = this@TerminologyCapabilitiesCodeSystemSurrogate.extension
      modifierExtension = this@TerminologyCapabilitiesCodeSystemSurrogate.modifierExtension
      uri =
        Canonical.of(
          this@TerminologyCapabilitiesCodeSystemSurrogate.uri,
          this@TerminologyCapabilitiesCodeSystemSurrogate._uri,
        )
      version = this@TerminologyCapabilitiesCodeSystemSurrogate.version
      subsumption =
        R4Boolean.of(
          this@TerminologyCapabilitiesCodeSystemSurrogate.subsumption,
          this@TerminologyCapabilitiesCodeSystemSurrogate._subsumption,
        )
    }

  public companion object {
    public fun fromModel(
      model: TerminologyCapabilities.CodeSystem
    ): TerminologyCapabilitiesCodeSystemSurrogate =
      with(model) {
        TerminologyCapabilitiesCodeSystemSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          uri = this@with.uri?.value
          _uri = this@with.uri?.toElement()
          version = this@with.version
          subsumption = this@with.subsumption?.value
          _subsumption = this@with.subsumption?.toElement()
        }
      }
  }
}

@Serializable
internal data class TerminologyCapabilitiesExpansionParameterSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var documentation: KotlinString? = null,
  public var _documentation: Element? = null,
) {
  public fun toModel(): TerminologyCapabilities.Expansion.Parameter =
    TerminologyCapabilities.Expansion.Parameter().apply {
      id = this@TerminologyCapabilitiesExpansionParameterSurrogate.id
      extension = this@TerminologyCapabilitiesExpansionParameterSurrogate.extension
      modifierExtension = this@TerminologyCapabilitiesExpansionParameterSurrogate.modifierExtension
      name =
        Code.of(
          this@TerminologyCapabilitiesExpansionParameterSurrogate.name,
          this@TerminologyCapabilitiesExpansionParameterSurrogate._name,
        )
      documentation =
        R4String.of(
          this@TerminologyCapabilitiesExpansionParameterSurrogate.documentation,
          this@TerminologyCapabilitiesExpansionParameterSurrogate._documentation,
        )
    }

  public companion object {
    public fun fromModel(
      model: TerminologyCapabilities.Expansion.Parameter
    ): TerminologyCapabilitiesExpansionParameterSurrogate =
      with(model) {
        TerminologyCapabilitiesExpansionParameterSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          documentation = this@with.documentation?.value
          _documentation = this@with.documentation?.toElement()
        }
      }
  }
}

@Serializable
internal data class TerminologyCapabilitiesExpansionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var hierarchical: KotlinBoolean? = null,
  public var _hierarchical: Element? = null,
  public var paging: KotlinBoolean? = null,
  public var _paging: Element? = null,
  public var incomplete: KotlinBoolean? = null,
  public var _incomplete: Element? = null,
  public var parameter: List<TerminologyCapabilities.Expansion.Parameter>? = null,
  public var textFilter: KotlinString? = null,
  public var _textFilter: Element? = null,
) {
  public fun toModel(): TerminologyCapabilities.Expansion =
    TerminologyCapabilities.Expansion().apply {
      id = this@TerminologyCapabilitiesExpansionSurrogate.id
      extension = this@TerminologyCapabilitiesExpansionSurrogate.extension
      modifierExtension = this@TerminologyCapabilitiesExpansionSurrogate.modifierExtension
      hierarchical =
        R4Boolean.of(
          this@TerminologyCapabilitiesExpansionSurrogate.hierarchical,
          this@TerminologyCapabilitiesExpansionSurrogate._hierarchical,
        )
      paging =
        R4Boolean.of(
          this@TerminologyCapabilitiesExpansionSurrogate.paging,
          this@TerminologyCapabilitiesExpansionSurrogate._paging,
        )
      incomplete =
        R4Boolean.of(
          this@TerminologyCapabilitiesExpansionSurrogate.incomplete,
          this@TerminologyCapabilitiesExpansionSurrogate._incomplete,
        )
      parameter = this@TerminologyCapabilitiesExpansionSurrogate.parameter
      textFilter =
        Markdown.of(
          this@TerminologyCapabilitiesExpansionSurrogate.textFilter,
          this@TerminologyCapabilitiesExpansionSurrogate._textFilter,
        )
    }

  public companion object {
    public fun fromModel(
      model: TerminologyCapabilities.Expansion
    ): TerminologyCapabilitiesExpansionSurrogate =
      with(model) {
        TerminologyCapabilitiesExpansionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          hierarchical = this@with.hierarchical?.value
          _hierarchical = this@with.hierarchical?.toElement()
          paging = this@with.paging?.value
          _paging = this@with.paging?.toElement()
          incomplete = this@with.incomplete?.value
          _incomplete = this@with.incomplete?.toElement()
          parameter = this@with.parameter
          textFilter = this@with.textFilter?.value
          _textFilter = this@with.textFilter?.toElement()
        }
      }
  }
}

@Serializable
internal data class TerminologyCapabilitiesValidateCodeSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var translations: KotlinBoolean? = null,
  public var _translations: Element? = null,
) {
  public fun toModel(): TerminologyCapabilities.ValidateCode =
    TerminologyCapabilities.ValidateCode().apply {
      id = this@TerminologyCapabilitiesValidateCodeSurrogate.id
      extension = this@TerminologyCapabilitiesValidateCodeSurrogate.extension
      modifierExtension = this@TerminologyCapabilitiesValidateCodeSurrogate.modifierExtension
      translations =
        R4Boolean.of(
          this@TerminologyCapabilitiesValidateCodeSurrogate.translations,
          this@TerminologyCapabilitiesValidateCodeSurrogate._translations,
        )
    }

  public companion object {
    public fun fromModel(
      model: TerminologyCapabilities.ValidateCode
    ): TerminologyCapabilitiesValidateCodeSurrogate =
      with(model) {
        TerminologyCapabilitiesValidateCodeSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          translations = this@with.translations?.value
          _translations = this@with.translations?.toElement()
        }
      }
  }
}

@Serializable
internal data class TerminologyCapabilitiesTranslationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var needsMap: KotlinBoolean? = null,
  public var _needsMap: Element? = null,
) {
  public fun toModel(): TerminologyCapabilities.Translation =
    TerminologyCapabilities.Translation().apply {
      id = this@TerminologyCapabilitiesTranslationSurrogate.id
      extension = this@TerminologyCapabilitiesTranslationSurrogate.extension
      modifierExtension = this@TerminologyCapabilitiesTranslationSurrogate.modifierExtension
      needsMap =
        R4Boolean.of(
          this@TerminologyCapabilitiesTranslationSurrogate.needsMap,
          this@TerminologyCapabilitiesTranslationSurrogate._needsMap,
        )
    }

  public companion object {
    public fun fromModel(
      model: TerminologyCapabilities.Translation
    ): TerminologyCapabilitiesTranslationSurrogate =
      with(model) {
        TerminologyCapabilitiesTranslationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          needsMap = this@with.needsMap?.value
          _needsMap = this@with.needsMap?.toElement()
        }
      }
  }
}

@Serializable
internal data class TerminologyCapabilitiesClosureSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var translation: KotlinBoolean? = null,
  public var _translation: Element? = null,
) {
  public fun toModel(): TerminologyCapabilities.Closure =
    TerminologyCapabilities.Closure().apply {
      id = this@TerminologyCapabilitiesClosureSurrogate.id
      extension = this@TerminologyCapabilitiesClosureSurrogate.extension
      modifierExtension = this@TerminologyCapabilitiesClosureSurrogate.modifierExtension
      translation =
        R4Boolean.of(
          this@TerminologyCapabilitiesClosureSurrogate.translation,
          this@TerminologyCapabilitiesClosureSurrogate._translation,
        )
    }

  public companion object {
    public fun fromModel(
      model: TerminologyCapabilities.Closure
    ): TerminologyCapabilitiesClosureSurrogate =
      with(model) {
        TerminologyCapabilitiesClosureSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          translation = this@with.translation?.value
          _translation = this@with.translation?.toElement()
        }
      }
  }
}

@Serializable
internal data class TerminologyCapabilitiesSurrogate(
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
  public var contact: List<ContactDetail?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: List<UsageContext?>? = null,
  public var jurisdiction: List<CodeableConcept?>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var kind: KotlinString? = null,
  public var _kind: Element? = null,
  public var software: TerminologyCapabilities.Software? = null,
  public var implementation: TerminologyCapabilities.Implementation? = null,
  public var lockedDate: KotlinBoolean? = null,
  public var _lockedDate: Element? = null,
  public var codeSystem: List<TerminologyCapabilities.CodeSystem>? = null,
  public var expansion: TerminologyCapabilities.Expansion? = null,
  public var codeSearch: KotlinString? = null,
  public var _codeSearch: Element? = null,
  public var validateCode: TerminologyCapabilities.ValidateCode? = null,
  public var translation: TerminologyCapabilities.Translation? = null,
  public var closure: TerminologyCapabilities.Closure? = null,
) {
  public fun toModel(): TerminologyCapabilities =
    TerminologyCapabilities().apply {
      id = this@TerminologyCapabilitiesSurrogate.id
      meta = this@TerminologyCapabilitiesSurrogate.meta
      implicitRules =
        Uri.of(
          this@TerminologyCapabilitiesSurrogate.implicitRules,
          this@TerminologyCapabilitiesSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@TerminologyCapabilitiesSurrogate.language,
          this@TerminologyCapabilitiesSurrogate._language,
        )
      text = this@TerminologyCapabilitiesSurrogate.text
      contained = this@TerminologyCapabilitiesSurrogate.contained
      extension = this@TerminologyCapabilitiesSurrogate.extension
      modifierExtension = this@TerminologyCapabilitiesSurrogate.modifierExtension
      url =
        Uri.of(
          this@TerminologyCapabilitiesSurrogate.url,
          this@TerminologyCapabilitiesSurrogate._url,
        )
      version =
        R4String.of(
          this@TerminologyCapabilitiesSurrogate.version,
          this@TerminologyCapabilitiesSurrogate._version,
        )
      name =
        R4String.of(
          this@TerminologyCapabilitiesSurrogate.name,
          this@TerminologyCapabilitiesSurrogate._name,
        )
      title =
        R4String.of(
          this@TerminologyCapabilitiesSurrogate.title,
          this@TerminologyCapabilitiesSurrogate._title,
        )
      status =
        Enumeration.of(
          this@TerminologyCapabilitiesSurrogate.status?.let {
            com.google.fhir.model.r4.PublicationStatus.fromCode(it)
          },
          this@TerminologyCapabilitiesSurrogate._status,
        )
      experimental =
        R4Boolean.of(
          this@TerminologyCapabilitiesSurrogate.experimental,
          this@TerminologyCapabilitiesSurrogate._experimental,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@TerminologyCapabilitiesSurrogate.date),
          this@TerminologyCapabilitiesSurrogate._date,
        )
      publisher =
        R4String.of(
          this@TerminologyCapabilitiesSurrogate.publisher,
          this@TerminologyCapabilitiesSurrogate._publisher,
        )
      contact = this@TerminologyCapabilitiesSurrogate.contact
      description =
        Markdown.of(
          this@TerminologyCapabilitiesSurrogate.description,
          this@TerminologyCapabilitiesSurrogate._description,
        )
      useContext = this@TerminologyCapabilitiesSurrogate.useContext
      jurisdiction = this@TerminologyCapabilitiesSurrogate.jurisdiction
      purpose =
        Markdown.of(
          this@TerminologyCapabilitiesSurrogate.purpose,
          this@TerminologyCapabilitiesSurrogate._purpose,
        )
      copyright =
        Markdown.of(
          this@TerminologyCapabilitiesSurrogate.copyright,
          this@TerminologyCapabilitiesSurrogate._copyright,
        )
      kind =
        Enumeration.of(
          this@TerminologyCapabilitiesSurrogate.kind?.let {
            com.google.fhir.model.r4.TerminologyCapabilities.CapabilityStatementKind.fromCode(it)
          },
          this@TerminologyCapabilitiesSurrogate._kind,
        )
      software = this@TerminologyCapabilitiesSurrogate.software
      implementation = this@TerminologyCapabilitiesSurrogate.implementation
      lockedDate =
        R4Boolean.of(
          this@TerminologyCapabilitiesSurrogate.lockedDate,
          this@TerminologyCapabilitiesSurrogate._lockedDate,
        )
      codeSystem = this@TerminologyCapabilitiesSurrogate.codeSystem
      expansion = this@TerminologyCapabilitiesSurrogate.expansion
      codeSearch =
        Enumeration.of(
          this@TerminologyCapabilitiesSurrogate.codeSearch?.let {
            com.google.fhir.model.r4.TerminologyCapabilities.CodeSearchSupport.fromCode(it)
          },
          this@TerminologyCapabilitiesSurrogate._codeSearch,
        )
      validateCode = this@TerminologyCapabilitiesSurrogate.validateCode
      translation = this@TerminologyCapabilitiesSurrogate.translation
      closure = this@TerminologyCapabilitiesSurrogate.closure
    }

  public companion object {
    public fun fromModel(model: TerminologyCapabilities): TerminologyCapabilitiesSurrogate =
      with(model) {
        TerminologyCapabilitiesSurrogate().apply {
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
          version = this@with.version?.value
          _version = this@with.version?.toElement()
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
          kind = this@with.kind?.value?.getCode()
          _kind = this@with.kind?.toElement()
          software = this@with.software
          implementation = this@with.implementation
          lockedDate = this@with.lockedDate?.value
          _lockedDate = this@with.lockedDate?.toElement()
          codeSystem = this@with.codeSystem
          expansion = this@with.expansion
          codeSearch = this@with.codeSearch?.value?.getCode()
          _codeSearch = this@with.codeSearch?.toElement()
          validateCode = this@with.validateCode
          translation = this@with.translation
          closure = this@with.closure
        }
      }
  }
}
