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

import com.google.fhir.model.r4b.Boolean as R4bBoolean
import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.ConceptMap
import com.google.fhir.model.r4b.ContactDetail
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Markdown
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.UsageContext
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ConceptMapGroupElementTargetDependsOnSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var `property`: KotlinString? = null,
  public var _property: Element? = null,
  public var system: KotlinString? = null,
  public var _system: Element? = null,
  public var `value`: KotlinString? = null,
  public var _value: Element? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
) {
  public fun toModel(): ConceptMap.Group.Element.Target.DependsOn =
    ConceptMap.Group.Element.Target.DependsOn(
      id = this@ConceptMapGroupElementTargetDependsOnSurrogate.id,
      extension = this@ConceptMapGroupElementTargetDependsOnSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ConceptMapGroupElementTargetDependsOnSurrogate.modifierExtension ?: mutableListOf(),
      `property` =
        Uri.of(
          this@ConceptMapGroupElementTargetDependsOnSurrogate.`property`,
          this@ConceptMapGroupElementTargetDependsOnSurrogate._property,
        )!!,
      system =
        Canonical.of(
          this@ConceptMapGroupElementTargetDependsOnSurrogate.system,
          this@ConceptMapGroupElementTargetDependsOnSurrogate._system,
        ),
      `value` =
        R4bString.of(
          this@ConceptMapGroupElementTargetDependsOnSurrogate.`value`,
          this@ConceptMapGroupElementTargetDependsOnSurrogate._value,
        )!!,
      display =
        R4bString.of(
          this@ConceptMapGroupElementTargetDependsOnSurrogate.display,
          this@ConceptMapGroupElementTargetDependsOnSurrogate._display,
        ),
    )

  public companion object {
    public fun fromModel(
      model: ConceptMap.Group.Element.Target.DependsOn
    ): ConceptMapGroupElementTargetDependsOnSurrogate =
      with(model) {
        ConceptMapGroupElementTargetDependsOnSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          `property` = this@with.`property`.value,
          _property = this@with.`property`.toElement(),
          system = this@with.system?.value,
          _system = this@with.system?.toElement(),
          `value` = this@with.`value`.value,
          _value = this@with.`value`.toElement(),
          display = this@with.display?.value,
          _display = this@with.display?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ConceptMapGroupElementTargetSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
  public var equivalence: KotlinString? = null,
  public var _equivalence: Element? = null,
  public var comment: KotlinString? = null,
  public var _comment: Element? = null,
  public var dependsOn: MutableList<ConceptMap.Group.Element.Target.DependsOn>? = null,
  public var product: MutableList<ConceptMap.Group.Element.Target.DependsOn>? = null,
) {
  public fun toModel(): ConceptMap.Group.Element.Target =
    ConceptMap.Group.Element.Target(
      id = this@ConceptMapGroupElementTargetSurrogate.id,
      extension = this@ConceptMapGroupElementTargetSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ConceptMapGroupElementTargetSurrogate.modifierExtension ?: mutableListOf(),
      code =
        Code.of(
          this@ConceptMapGroupElementTargetSurrogate.code,
          this@ConceptMapGroupElementTargetSurrogate._code,
        ),
      display =
        R4bString.of(
          this@ConceptMapGroupElementTargetSurrogate.display,
          this@ConceptMapGroupElementTargetSurrogate._display,
        ),
      equivalence =
        Enumeration.of(
          com.google.fhir.model.r4b.ConceptMapEquivalence.fromCode(
            this@ConceptMapGroupElementTargetSurrogate.equivalence!!
          ),
          this@ConceptMapGroupElementTargetSurrogate._equivalence,
        ),
      comment =
        R4bString.of(
          this@ConceptMapGroupElementTargetSurrogate.comment,
          this@ConceptMapGroupElementTargetSurrogate._comment,
        ),
      dependsOn = this@ConceptMapGroupElementTargetSurrogate.dependsOn ?: mutableListOf(),
      product = this@ConceptMapGroupElementTargetSurrogate.product ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: ConceptMap.Group.Element.Target
    ): ConceptMapGroupElementTargetSurrogate =
      with(model) {
        ConceptMapGroupElementTargetSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code?.value,
          _code = this@with.code?.toElement(),
          display = this@with.display?.value,
          _display = this@with.display?.toElement(),
          equivalence = this@with.equivalence.value?.getCode(),
          _equivalence = this@with.equivalence.toElement(),
          comment = this@with.comment?.value,
          _comment = this@with.comment?.toElement(),
          dependsOn = this@with.dependsOn.takeUnless { it.all { it == null } },
          product = this@with.product.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ConceptMapGroupElementSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
  public var target: MutableList<ConceptMap.Group.Element.Target>? = null,
) {
  public fun toModel(): ConceptMap.Group.Element =
    ConceptMap.Group.Element(
      id = this@ConceptMapGroupElementSurrogate.id,
      extension = this@ConceptMapGroupElementSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConceptMapGroupElementSurrogate.modifierExtension ?: mutableListOf(),
      code =
        Code.of(
          this@ConceptMapGroupElementSurrogate.code,
          this@ConceptMapGroupElementSurrogate._code,
        ),
      display =
        R4bString.of(
          this@ConceptMapGroupElementSurrogate.display,
          this@ConceptMapGroupElementSurrogate._display,
        ),
      target = this@ConceptMapGroupElementSurrogate.target ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ConceptMap.Group.Element): ConceptMapGroupElementSurrogate =
      with(model) {
        ConceptMapGroupElementSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          code = this@with.code?.value,
          _code = this@with.code?.toElement(),
          display = this@with.display?.value,
          _display = this@with.display?.toElement(),
          target = this@with.target.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class ConceptMapGroupUnmappedSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var mode: KotlinString? = null,
  public var _mode: Element? = null,
  public var code: KotlinString? = null,
  public var _code: Element? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
) {
  public fun toModel(): ConceptMap.Group.Unmapped =
    ConceptMap.Group.Unmapped(
      id = this@ConceptMapGroupUnmappedSurrogate.id,
      extension = this@ConceptMapGroupUnmappedSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@ConceptMapGroupUnmappedSurrogate.modifierExtension ?: mutableListOf(),
      mode =
        Enumeration.of(
          com.google.fhir.model.r4b.ConceptMap.ConceptMapGroupUnmappedMode.fromCode(
            this@ConceptMapGroupUnmappedSurrogate.mode!!
          ),
          this@ConceptMapGroupUnmappedSurrogate._mode,
        ),
      code =
        Code.of(
          this@ConceptMapGroupUnmappedSurrogate.code,
          this@ConceptMapGroupUnmappedSurrogate._code,
        ),
      display =
        R4bString.of(
          this@ConceptMapGroupUnmappedSurrogate.display,
          this@ConceptMapGroupUnmappedSurrogate._display,
        ),
      url =
        Canonical.of(
          this@ConceptMapGroupUnmappedSurrogate.url,
          this@ConceptMapGroupUnmappedSurrogate._url,
        ),
    )

  public companion object {
    public fun fromModel(model: ConceptMap.Group.Unmapped): ConceptMapGroupUnmappedSurrogate =
      with(model) {
        ConceptMapGroupUnmappedSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          mode = this@with.mode.value?.getCode(),
          _mode = this@with.mode.toElement(),
          code = this@with.code?.value,
          _code = this@with.code?.toElement(),
          display = this@with.display?.value,
          _display = this@with.display?.toElement(),
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
        )
      }
  }
}

@Serializable
internal data class ConceptMapGroupSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var source: KotlinString? = null,
  public var _source: Element? = null,
  public var sourceVersion: KotlinString? = null,
  public var _sourceVersion: Element? = null,
  public var target: KotlinString? = null,
  public var _target: Element? = null,
  public var targetVersion: KotlinString? = null,
  public var _targetVersion: Element? = null,
  public var element: MutableList<ConceptMap.Group.Element>? = null,
  public var unmapped: ConceptMap.Group.Unmapped? = null,
) {
  public fun toModel(): ConceptMap.Group =
    ConceptMap.Group(
      id = this@ConceptMapGroupSurrogate.id,
      extension = this@ConceptMapGroupSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConceptMapGroupSurrogate.modifierExtension ?: mutableListOf(),
      source = Uri.of(this@ConceptMapGroupSurrogate.source, this@ConceptMapGroupSurrogate._source),
      sourceVersion =
        R4bString.of(
          this@ConceptMapGroupSurrogate.sourceVersion,
          this@ConceptMapGroupSurrogate._sourceVersion,
        ),
      target = Uri.of(this@ConceptMapGroupSurrogate.target, this@ConceptMapGroupSurrogate._target),
      targetVersion =
        R4bString.of(
          this@ConceptMapGroupSurrogate.targetVersion,
          this@ConceptMapGroupSurrogate._targetVersion,
        ),
      element = this@ConceptMapGroupSurrogate.element ?: mutableListOf(),
      unmapped = this@ConceptMapGroupSurrogate.unmapped,
    )

  public companion object {
    public fun fromModel(model: ConceptMap.Group): ConceptMapGroupSurrogate =
      with(model) {
        ConceptMapGroupSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          source = this@with.source?.value,
          _source = this@with.source?.toElement(),
          sourceVersion = this@with.sourceVersion?.value,
          _sourceVersion = this@with.sourceVersion?.toElement(),
          target = this@with.target?.value,
          _target = this@with.target?.toElement(),
          targetVersion = this@with.targetVersion?.value,
          _targetVersion = this@with.targetVersion?.toElement(),
          element = this@with.element.takeUnless { it.all { it == null } },
          unmapped = this@with.unmapped,
        )
      }
  }
}

@Serializable
internal data class ConceptMapSurrogate(
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
  public var identifier: Identifier? = null,
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
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var sourceUri: KotlinString? = null,
  public var _sourceUri: Element? = null,
  public var sourceCanonical: KotlinString? = null,
  public var _sourceCanonical: Element? = null,
  public var targetUri: KotlinString? = null,
  public var _targetUri: Element? = null,
  public var targetCanonical: KotlinString? = null,
  public var _targetCanonical: Element? = null,
  public var group: MutableList<ConceptMap.Group>? = null,
) {
  public fun toModel(): ConceptMap =
    ConceptMap(
      id = this@ConceptMapSurrogate.id,
      meta = this@ConceptMapSurrogate.meta,
      implicitRules =
        Uri.of(this@ConceptMapSurrogate.implicitRules, this@ConceptMapSurrogate._implicitRules),
      language = Code.of(this@ConceptMapSurrogate.language, this@ConceptMapSurrogate._language),
      text = this@ConceptMapSurrogate.text,
      contained = this@ConceptMapSurrogate.contained ?: mutableListOf(),
      extension = this@ConceptMapSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@ConceptMapSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@ConceptMapSurrogate.url, this@ConceptMapSurrogate._url),
      identifier = this@ConceptMapSurrogate.identifier,
      version = R4bString.of(this@ConceptMapSurrogate.version, this@ConceptMapSurrogate._version),
      name = R4bString.of(this@ConceptMapSurrogate.name, this@ConceptMapSurrogate._name),
      title = R4bString.of(this@ConceptMapSurrogate.title, this@ConceptMapSurrogate._title),
      status =
        Enumeration.of(
          com.google.fhir.model.r4b.PublicationStatus.fromCode(this@ConceptMapSurrogate.status!!),
          this@ConceptMapSurrogate._status,
        ),
      experimental =
        R4bBoolean.of(
          this@ConceptMapSurrogate.experimental,
          this@ConceptMapSurrogate._experimental,
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ConceptMapSurrogate.date),
          this@ConceptMapSurrogate._date,
        ),
      publisher =
        R4bString.of(this@ConceptMapSurrogate.publisher, this@ConceptMapSurrogate._publisher),
      contact = this@ConceptMapSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(this@ConceptMapSurrogate.description, this@ConceptMapSurrogate._description),
      useContext = this@ConceptMapSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@ConceptMapSurrogate.jurisdiction ?: mutableListOf(),
      purpose = Markdown.of(this@ConceptMapSurrogate.purpose, this@ConceptMapSurrogate._purpose),
      copyright =
        Markdown.of(this@ConceptMapSurrogate.copyright, this@ConceptMapSurrogate._copyright),
      source =
        ConceptMap.Source?.from(
          Uri.of(this@ConceptMapSurrogate.sourceUri, this@ConceptMapSurrogate._sourceUri),
          Canonical.of(
            this@ConceptMapSurrogate.sourceCanonical,
            this@ConceptMapSurrogate._sourceCanonical,
          ),
        ),
      target =
        ConceptMap.Target?.from(
          Uri.of(this@ConceptMapSurrogate.targetUri, this@ConceptMapSurrogate._targetUri),
          Canonical.of(
            this@ConceptMapSurrogate.targetCanonical,
            this@ConceptMapSurrogate._targetCanonical,
          ),
        ),
      group = this@ConceptMapSurrogate.group ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: ConceptMap): ConceptMapSurrogate =
      with(model) {
        ConceptMapSurrogate(
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
          identifier = this@with.identifier,
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
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
          sourceUri = this@with.source?.asUri()?.value?.value,
          _sourceUri = this@with.source?.asUri()?.value?.toElement(),
          sourceCanonical = this@with.source?.asCanonical()?.value?.value,
          _sourceCanonical = this@with.source?.asCanonical()?.value?.toElement(),
          targetUri = this@with.target?.asUri()?.value?.value,
          _targetUri = this@with.target?.asUri()?.value?.toElement(),
          targetCanonical = this@with.target?.asCanonical()?.value?.value,
          _targetCanonical = this@with.target?.asCanonical()?.value?.toElement(),
          group = this@with.group.takeUnless { it.all { it == null } },
        )
      }
  }
}
