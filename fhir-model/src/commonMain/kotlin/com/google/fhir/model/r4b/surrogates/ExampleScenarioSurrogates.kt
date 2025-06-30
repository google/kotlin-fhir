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
import com.google.fhir.model.r4b.ContactDetail
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.ExampleScenario
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
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class ExampleScenarioActorSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var actorId: KotlinString? = null,
  public var _actorId: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
) {
  public fun toModel(): ExampleScenario.Actor =
    ExampleScenario.Actor().apply {
      id = this@ExampleScenarioActorSurrogate.id
      extension = this@ExampleScenarioActorSurrogate.extension
      modifierExtension = this@ExampleScenarioActorSurrogate.modifierExtension
      actorId =
        R4bString.of(
          this@ExampleScenarioActorSurrogate.actorId,
          this@ExampleScenarioActorSurrogate._actorId,
        )
      type =
        Enumeration.of(
          this@ExampleScenarioActorSurrogate.type?.let {
            com.google.fhir.model.r4b.ExampleScenario.ExampleScenarioActorType.fromCode(it)
          },
          this@ExampleScenarioActorSurrogate._type,
        )
      name =
        R4bString.of(
          this@ExampleScenarioActorSurrogate.name,
          this@ExampleScenarioActorSurrogate._name,
        )
      description =
        Markdown.of(
          this@ExampleScenarioActorSurrogate.description,
          this@ExampleScenarioActorSurrogate._description,
        )
    }

  public companion object {
    public fun fromModel(model: ExampleScenario.Actor): ExampleScenarioActorSurrogate =
      with(model) {
        ExampleScenarioActorSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          actorId = this@with.actorId?.value
          _actorId = this@with.actorId?.toElement()
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
        }
      }
  }
}

@Serializable
internal data class ExampleScenarioInstanceVersionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var versionId: KotlinString? = null,
  public var _versionId: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
) {
  public fun toModel(): ExampleScenario.Instance.Version =
    ExampleScenario.Instance.Version().apply {
      id = this@ExampleScenarioInstanceVersionSurrogate.id
      extension = this@ExampleScenarioInstanceVersionSurrogate.extension
      modifierExtension = this@ExampleScenarioInstanceVersionSurrogate.modifierExtension
      versionId =
        R4bString.of(
          this@ExampleScenarioInstanceVersionSurrogate.versionId,
          this@ExampleScenarioInstanceVersionSurrogate._versionId,
        )
      description =
        Markdown.of(
          this@ExampleScenarioInstanceVersionSurrogate.description,
          this@ExampleScenarioInstanceVersionSurrogate._description,
        )
    }

  public companion object {
    public fun fromModel(
      model: ExampleScenario.Instance.Version
    ): ExampleScenarioInstanceVersionSurrogate =
      with(model) {
        ExampleScenarioInstanceVersionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          versionId = this@with.versionId?.value
          _versionId = this@with.versionId?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
        }
      }
  }
}

@Serializable
internal data class ExampleScenarioInstanceContainedInstanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var resourceId: KotlinString? = null,
  public var _resourceId: Element? = null,
  public var versionId: KotlinString? = null,
  public var _versionId: Element? = null,
) {
  public fun toModel(): ExampleScenario.Instance.ContainedInstance =
    ExampleScenario.Instance.ContainedInstance().apply {
      id = this@ExampleScenarioInstanceContainedInstanceSurrogate.id
      extension = this@ExampleScenarioInstanceContainedInstanceSurrogate.extension
      modifierExtension = this@ExampleScenarioInstanceContainedInstanceSurrogate.modifierExtension
      resourceId =
        R4bString.of(
          this@ExampleScenarioInstanceContainedInstanceSurrogate.resourceId,
          this@ExampleScenarioInstanceContainedInstanceSurrogate._resourceId,
        )
      versionId =
        R4bString.of(
          this@ExampleScenarioInstanceContainedInstanceSurrogate.versionId,
          this@ExampleScenarioInstanceContainedInstanceSurrogate._versionId,
        )
    }

  public companion object {
    public fun fromModel(
      model: ExampleScenario.Instance.ContainedInstance
    ): ExampleScenarioInstanceContainedInstanceSurrogate =
      with(model) {
        ExampleScenarioInstanceContainedInstanceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          resourceId = this@with.resourceId?.value
          _resourceId = this@with.resourceId?.toElement()
          versionId = this@with.versionId?.value
          _versionId = this@with.versionId?.toElement()
        }
      }
  }
}

@Serializable
internal data class ExampleScenarioInstanceSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var resourceId: KotlinString? = null,
  public var _resourceId: Element? = null,
  public var resourceType: KotlinString? = null,
  public var _resourceType: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var version: List<ExampleScenario.Instance.Version>? = null,
  public var containedInstance: List<ExampleScenario.Instance.ContainedInstance>? = null,
) {
  public fun toModel(): ExampleScenario.Instance =
    ExampleScenario.Instance().apply {
      id = this@ExampleScenarioInstanceSurrogate.id
      extension = this@ExampleScenarioInstanceSurrogate.extension
      modifierExtension = this@ExampleScenarioInstanceSurrogate.modifierExtension
      resourceId =
        R4bString.of(
          this@ExampleScenarioInstanceSurrogate.resourceId,
          this@ExampleScenarioInstanceSurrogate._resourceId,
        )
      resourceType =
        Enumeration.of(
          this@ExampleScenarioInstanceSurrogate.resourceType?.let {
            com.google.fhir.model.r4b.FHIRResourceType.fromCode(it)
          },
          this@ExampleScenarioInstanceSurrogate._resourceType,
        )
      name =
        R4bString.of(
          this@ExampleScenarioInstanceSurrogate.name,
          this@ExampleScenarioInstanceSurrogate._name,
        )
      description =
        Markdown.of(
          this@ExampleScenarioInstanceSurrogate.description,
          this@ExampleScenarioInstanceSurrogate._description,
        )
      version = this@ExampleScenarioInstanceSurrogate.version
      containedInstance = this@ExampleScenarioInstanceSurrogate.containedInstance
    }

  public companion object {
    public fun fromModel(model: ExampleScenario.Instance): ExampleScenarioInstanceSurrogate =
      with(model) {
        ExampleScenarioInstanceSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          resourceId = this@with.resourceId?.value
          _resourceId = this@with.resourceId?.toElement()
          resourceType = this@with.resourceType?.value?.getCode()
          _resourceType = this@with.resourceType?.toElement()
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          version = this@with.version
          containedInstance = this@with.containedInstance
        }
      }
  }
}

@Serializable
internal data class ExampleScenarioProcessStepOperationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var number: KotlinString? = null,
  public var _number: Element? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var initiator: KotlinString? = null,
  public var _initiator: Element? = null,
  public var `receiver`: KotlinString? = null,
  public var _receiver: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var initiatorActive: KotlinBoolean? = null,
  public var _initiatorActive: Element? = null,
  public var receiverActive: KotlinBoolean? = null,
  public var _receiverActive: Element? = null,
  public var request: ExampleScenario.Instance.ContainedInstance? = null,
  public var response: ExampleScenario.Instance.ContainedInstance? = null,
) {
  public fun toModel(): ExampleScenario.Process.Step.Operation =
    ExampleScenario.Process.Step.Operation().apply {
      id = this@ExampleScenarioProcessStepOperationSurrogate.id
      extension = this@ExampleScenarioProcessStepOperationSurrogate.extension
      modifierExtension = this@ExampleScenarioProcessStepOperationSurrogate.modifierExtension
      number =
        R4bString.of(
          this@ExampleScenarioProcessStepOperationSurrogate.number,
          this@ExampleScenarioProcessStepOperationSurrogate._number,
        )
      type =
        R4bString.of(
          this@ExampleScenarioProcessStepOperationSurrogate.type,
          this@ExampleScenarioProcessStepOperationSurrogate._type,
        )
      name =
        R4bString.of(
          this@ExampleScenarioProcessStepOperationSurrogate.name,
          this@ExampleScenarioProcessStepOperationSurrogate._name,
        )
      initiator =
        R4bString.of(
          this@ExampleScenarioProcessStepOperationSurrogate.initiator,
          this@ExampleScenarioProcessStepOperationSurrogate._initiator,
        )
      `receiver` =
        R4bString.of(
          this@ExampleScenarioProcessStepOperationSurrogate.`receiver`,
          this@ExampleScenarioProcessStepOperationSurrogate._receiver,
        )
      description =
        Markdown.of(
          this@ExampleScenarioProcessStepOperationSurrogate.description,
          this@ExampleScenarioProcessStepOperationSurrogate._description,
        )
      initiatorActive =
        R4bBoolean.of(
          this@ExampleScenarioProcessStepOperationSurrogate.initiatorActive,
          this@ExampleScenarioProcessStepOperationSurrogate._initiatorActive,
        )
      receiverActive =
        R4bBoolean.of(
          this@ExampleScenarioProcessStepOperationSurrogate.receiverActive,
          this@ExampleScenarioProcessStepOperationSurrogate._receiverActive,
        )
      request = this@ExampleScenarioProcessStepOperationSurrogate.request
      response = this@ExampleScenarioProcessStepOperationSurrogate.response
    }

  public companion object {
    public fun fromModel(
      model: ExampleScenario.Process.Step.Operation
    ): ExampleScenarioProcessStepOperationSurrogate =
      with(model) {
        ExampleScenarioProcessStepOperationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          number = this@with.number?.value
          _number = this@with.number?.toElement()
          type = this@with.type?.value
          _type = this@with.type?.toElement()
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          initiator = this@with.initiator?.value
          _initiator = this@with.initiator?.toElement()
          `receiver` = this@with.`receiver`?.value
          _receiver = this@with.`receiver`?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          initiatorActive = this@with.initiatorActive?.value
          _initiatorActive = this@with.initiatorActive?.toElement()
          receiverActive = this@with.receiverActive?.value
          _receiverActive = this@with.receiverActive?.toElement()
          request = this@with.request
          response = this@with.response
        }
      }
  }
}

@Serializable
internal data class ExampleScenarioProcessStepAlternativeSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var step: List<ExampleScenario.Process.Step?>? = null,
) {
  public fun toModel(): ExampleScenario.Process.Step.Alternative =
    ExampleScenario.Process.Step.Alternative().apply {
      id = this@ExampleScenarioProcessStepAlternativeSurrogate.id
      extension = this@ExampleScenarioProcessStepAlternativeSurrogate.extension
      modifierExtension = this@ExampleScenarioProcessStepAlternativeSurrogate.modifierExtension
      title =
        R4bString.of(
          this@ExampleScenarioProcessStepAlternativeSurrogate.title,
          this@ExampleScenarioProcessStepAlternativeSurrogate._title,
        )
      description =
        Markdown.of(
          this@ExampleScenarioProcessStepAlternativeSurrogate.description,
          this@ExampleScenarioProcessStepAlternativeSurrogate._description,
        )
      step = this@ExampleScenarioProcessStepAlternativeSurrogate.step
    }

  public companion object {
    public fun fromModel(
      model: ExampleScenario.Process.Step.Alternative
    ): ExampleScenarioProcessStepAlternativeSurrogate =
      with(model) {
        ExampleScenarioProcessStepAlternativeSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          step = this@with.step
        }
      }
  }
}

@Serializable
internal data class ExampleScenarioProcessStepSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var process: List<ExampleScenario.Process?>? = null,
  public var pause: KotlinBoolean? = null,
  public var _pause: Element? = null,
  public var operation: ExampleScenario.Process.Step.Operation? = null,
  public var alternative: List<ExampleScenario.Process.Step.Alternative>? = null,
) {
  public fun toModel(): ExampleScenario.Process.Step =
    ExampleScenario.Process.Step().apply {
      id = this@ExampleScenarioProcessStepSurrogate.id
      extension = this@ExampleScenarioProcessStepSurrogate.extension
      modifierExtension = this@ExampleScenarioProcessStepSurrogate.modifierExtension
      process = this@ExampleScenarioProcessStepSurrogate.process
      pause =
        R4bBoolean.of(
          this@ExampleScenarioProcessStepSurrogate.pause,
          this@ExampleScenarioProcessStepSurrogate._pause,
        )
      operation = this@ExampleScenarioProcessStepSurrogate.operation
      alternative = this@ExampleScenarioProcessStepSurrogate.alternative
    }

  public companion object {
    public fun fromModel(model: ExampleScenario.Process.Step): ExampleScenarioProcessStepSurrogate =
      with(model) {
        ExampleScenarioProcessStepSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          process = this@with.process
          pause = this@with.pause?.value
          _pause = this@with.pause?.toElement()
          operation = this@with.operation
          alternative = this@with.alternative
        }
      }
  }
}

@Serializable
internal data class ExampleScenarioProcessSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var preConditions: KotlinString? = null,
  public var _preConditions: Element? = null,
  public var postConditions: KotlinString? = null,
  public var _postConditions: Element? = null,
  public var step: List<ExampleScenario.Process.Step>? = null,
) {
  public fun toModel(): ExampleScenario.Process =
    ExampleScenario.Process().apply {
      id = this@ExampleScenarioProcessSurrogate.id
      extension = this@ExampleScenarioProcessSurrogate.extension
      modifierExtension = this@ExampleScenarioProcessSurrogate.modifierExtension
      title =
        R4bString.of(
          this@ExampleScenarioProcessSurrogate.title,
          this@ExampleScenarioProcessSurrogate._title,
        )
      description =
        Markdown.of(
          this@ExampleScenarioProcessSurrogate.description,
          this@ExampleScenarioProcessSurrogate._description,
        )
      preConditions =
        Markdown.of(
          this@ExampleScenarioProcessSurrogate.preConditions,
          this@ExampleScenarioProcessSurrogate._preConditions,
        )
      postConditions =
        Markdown.of(
          this@ExampleScenarioProcessSurrogate.postConditions,
          this@ExampleScenarioProcessSurrogate._postConditions,
        )
      step = this@ExampleScenarioProcessSurrogate.step
    }

  public companion object {
    public fun fromModel(model: ExampleScenario.Process): ExampleScenarioProcessSurrogate =
      with(model) {
        ExampleScenarioProcessSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          preConditions = this@with.preConditions?.value
          _preConditions = this@with.preConditions?.toElement()
          postConditions = this@with.postConditions?.value
          _postConditions = this@with.postConditions?.toElement()
          step = this@with.step
        }
      }
  }
}

@Serializable
internal data class ExampleScenarioSurrogate(
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
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: List<ContactDetail?>? = null,
  public var useContext: List<UsageContext?>? = null,
  public var jurisdiction: List<CodeableConcept?>? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var actor: List<ExampleScenario.Actor>? = null,
  public var instance: List<ExampleScenario.Instance>? = null,
  public var process: List<ExampleScenario.Process>? = null,
  public var workflow: List<KotlinString?>? = null,
  public var _workflow: List<Element?>? = null,
) {
  public fun toModel(): ExampleScenario =
    ExampleScenario().apply {
      id = this@ExampleScenarioSurrogate.id
      meta = this@ExampleScenarioSurrogate.meta
      implicitRules =
        Uri.of(
          this@ExampleScenarioSurrogate.implicitRules,
          this@ExampleScenarioSurrogate._implicitRules,
        )
      language =
        Code.of(this@ExampleScenarioSurrogate.language, this@ExampleScenarioSurrogate._language)
      text = this@ExampleScenarioSurrogate.text
      contained = this@ExampleScenarioSurrogate.contained
      extension = this@ExampleScenarioSurrogate.extension
      modifierExtension = this@ExampleScenarioSurrogate.modifierExtension
      url = Uri.of(this@ExampleScenarioSurrogate.url, this@ExampleScenarioSurrogate._url)
      identifier = this@ExampleScenarioSurrogate.identifier
      version =
        R4bString.of(this@ExampleScenarioSurrogate.version, this@ExampleScenarioSurrogate._version)
      name = R4bString.of(this@ExampleScenarioSurrogate.name, this@ExampleScenarioSurrogate._name)
      status =
        Enumeration.of(
          this@ExampleScenarioSurrogate.status?.let {
            com.google.fhir.model.r4b.PublicationStatus.fromCode(it)
          },
          this@ExampleScenarioSurrogate._status,
        )
      experimental =
        R4bBoolean.of(
          this@ExampleScenarioSurrogate.experimental,
          this@ExampleScenarioSurrogate._experimental,
        )
      date =
        DateTime.of(
          FhirDateTime.fromString(this@ExampleScenarioSurrogate.date),
          this@ExampleScenarioSurrogate._date,
        )
      publisher =
        R4bString.of(
          this@ExampleScenarioSurrogate.publisher,
          this@ExampleScenarioSurrogate._publisher,
        )
      contact = this@ExampleScenarioSurrogate.contact
      useContext = this@ExampleScenarioSurrogate.useContext
      jurisdiction = this@ExampleScenarioSurrogate.jurisdiction
      copyright =
        Markdown.of(
          this@ExampleScenarioSurrogate.copyright,
          this@ExampleScenarioSurrogate._copyright,
        )
      purpose =
        Markdown.of(this@ExampleScenarioSurrogate.purpose, this@ExampleScenarioSurrogate._purpose)
      actor = this@ExampleScenarioSurrogate.actor
      instance = this@ExampleScenarioSurrogate.instance
      process = this@ExampleScenarioSurrogate.process
      workflow =
        if (
          this@ExampleScenarioSurrogate.workflow == null &&
            this@ExampleScenarioSurrogate._workflow == null
        ) {
          null
        } else {
          (this@ExampleScenarioSurrogate.workflow
              ?: List(this@ExampleScenarioSurrogate._workflow!!.size) { null })
            .zip(
              this@ExampleScenarioSurrogate._workflow
                ?: List(this@ExampleScenarioSurrogate.workflow!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
    }

  public companion object {
    public fun fromModel(model: ExampleScenario): ExampleScenarioSurrogate =
      with(model) {
        ExampleScenarioSurrogate().apply {
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
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          experimental = this@with.experimental?.value
          _experimental = this@with.experimental?.toElement()
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          publisher = this@with.publisher?.value
          _publisher = this@with.publisher?.toElement()
          contact = this@with.contact
          useContext = this@with.useContext
          jurisdiction = this@with.jurisdiction
          copyright = this@with.copyright?.value
          _copyright = this@with.copyright?.toElement()
          purpose = this@with.purpose?.value
          _purpose = this@with.purpose?.toElement()
          actor = this@with.actor
          instance = this@with.instance
          process = this@with.process
          workflow = this@with.workflow?.map { it?.value }?.takeUnless { it.all { it == null } }
          _workflow =
            this@with.workflow?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
        }
      }
  }
}
