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
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.SubscriptionTopic
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SubscriptionTopicResourceTriggerQueryCriteriaSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var previous: KotlinString? = null,
  public var _previous: Element? = null,
  public var resultForCreate: KotlinString? = null,
  public var _resultForCreate: Element? = null,
  public var current: KotlinString? = null,
  public var _current: Element? = null,
  public var resultForDelete: KotlinString? = null,
  public var _resultForDelete: Element? = null,
  public var requireBoth: KotlinBoolean? = null,
  public var _requireBoth: Element? = null,
) {
  public fun toModel(): SubscriptionTopic.ResourceTrigger.QueryCriteria =
    SubscriptionTopic.ResourceTrigger.QueryCriteria(
      id = this@SubscriptionTopicResourceTriggerQueryCriteriaSurrogate.id,
      extension =
        this@SubscriptionTopicResourceTriggerQueryCriteriaSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubscriptionTopicResourceTriggerQueryCriteriaSurrogate.modifierExtension
          ?: mutableListOf(),
      previous =
        R5String.of(
          this@SubscriptionTopicResourceTriggerQueryCriteriaSurrogate.previous,
          this@SubscriptionTopicResourceTriggerQueryCriteriaSurrogate._previous,
        ),
      resultForCreate =
        this@SubscriptionTopicResourceTriggerQueryCriteriaSurrogate.resultForCreate?.let {
          Enumeration.of(
            com.google.fhir.model.r5.SubscriptionTopic.CriteriaNotExistsBehavior.fromCode(it!!),
            this@SubscriptionTopicResourceTriggerQueryCriteriaSurrogate._resultForCreate,
          )
        },
      current =
        R5String.of(
          this@SubscriptionTopicResourceTriggerQueryCriteriaSurrogate.current,
          this@SubscriptionTopicResourceTriggerQueryCriteriaSurrogate._current,
        ),
      resultForDelete =
        this@SubscriptionTopicResourceTriggerQueryCriteriaSurrogate.resultForDelete?.let {
          Enumeration.of(
            com.google.fhir.model.r5.SubscriptionTopic.CriteriaNotExistsBehavior.fromCode(it!!),
            this@SubscriptionTopicResourceTriggerQueryCriteriaSurrogate._resultForDelete,
          )
        },
      requireBoth =
        R5Boolean.of(
          this@SubscriptionTopicResourceTriggerQueryCriteriaSurrogate.requireBoth,
          this@SubscriptionTopicResourceTriggerQueryCriteriaSurrogate._requireBoth,
        ),
    )

  public companion object {
    public fun fromModel(
      model: SubscriptionTopic.ResourceTrigger.QueryCriteria
    ): SubscriptionTopicResourceTriggerQueryCriteriaSurrogate =
      with(model) {
        SubscriptionTopicResourceTriggerQueryCriteriaSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          previous = this@with.previous?.value,
          _previous = this@with.previous?.toElement(),
          resultForCreate = this@with.resultForCreate?.value?.getCode(),
          _resultForCreate = this@with.resultForCreate?.toElement(),
          current = this@with.current?.value,
          _current = this@with.current?.toElement(),
          resultForDelete = this@with.resultForDelete?.value?.getCode(),
          _resultForDelete = this@with.resultForDelete?.toElement(),
          requireBoth = this@with.requireBoth?.value,
          _requireBoth = this@with.requireBoth?.toElement(),
        )
      }
  }
}

@Serializable
internal data class SubscriptionTopicResourceTriggerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var resource: KotlinString? = null,
  public var _resource: Element? = null,
  public var supportedInteraction: MutableList<KotlinString?>? = null,
  public var _supportedInteraction: MutableList<Element?>? = null,
  public var queryCriteria: SubscriptionTopic.ResourceTrigger.QueryCriteria? = null,
  public var fhirPathCriteria: KotlinString? = null,
  public var _fhirPathCriteria: Element? = null,
) {
  public fun toModel(): SubscriptionTopic.ResourceTrigger =
    SubscriptionTopic.ResourceTrigger(
      id = this@SubscriptionTopicResourceTriggerSurrogate.id,
      extension = this@SubscriptionTopicResourceTriggerSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubscriptionTopicResourceTriggerSurrogate.modifierExtension ?: mutableListOf(),
      description =
        Markdown.of(
          this@SubscriptionTopicResourceTriggerSurrogate.description,
          this@SubscriptionTopicResourceTriggerSurrogate._description,
        ),
      resource =
        Uri.of(
          this@SubscriptionTopicResourceTriggerSurrogate.resource,
          this@SubscriptionTopicResourceTriggerSurrogate._resource,
        )!!,
      supportedInteraction =
        if (
          this@SubscriptionTopicResourceTriggerSurrogate.supportedInteraction == null &&
            this@SubscriptionTopicResourceTriggerSurrogate._supportedInteraction == null
        ) {
          mutableListOf()
        } else {
          (this@SubscriptionTopicResourceTriggerSurrogate.supportedInteraction
              ?: List(this@SubscriptionTopicResourceTriggerSurrogate._supportedInteraction!!.size) {
                null
              })
            .zip(
              this@SubscriptionTopicResourceTriggerSurrogate._supportedInteraction
                ?: List(
                  this@SubscriptionTopicResourceTriggerSurrogate.supportedInteraction!!.size
                ) {
                  null
                }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let {
                  com.google.fhir.model.r5.SubscriptionTopic.InteractionTrigger.fromCode(it!!)!!
                },
                element,
              )
            }
            .toMutableList()
        },
      queryCriteria = this@SubscriptionTopicResourceTriggerSurrogate.queryCriteria,
      fhirPathCriteria =
        R5String.of(
          this@SubscriptionTopicResourceTriggerSurrogate.fhirPathCriteria,
          this@SubscriptionTopicResourceTriggerSurrogate._fhirPathCriteria,
        ),
    )

  public companion object {
    public fun fromModel(
      model: SubscriptionTopic.ResourceTrigger
    ): SubscriptionTopicResourceTriggerSurrogate =
      with(model) {
        SubscriptionTopicResourceTriggerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          resource = this@with.resource.value,
          _resource = this@with.resource.toElement(),
          supportedInteraction =
            this@with.supportedInteraction
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _supportedInteraction =
            this@with.supportedInteraction
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          queryCriteria = this@with.queryCriteria,
          fhirPathCriteria = this@with.fhirPathCriteria?.value,
          _fhirPathCriteria = this@with.fhirPathCriteria?.toElement(),
        )
      }
  }
}

@Serializable
internal data class SubscriptionTopicEventTriggerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var event: CodeableConcept,
  public var resource: KotlinString? = null,
  public var _resource: Element? = null,
) {
  public fun toModel(): SubscriptionTopic.EventTrigger =
    SubscriptionTopic.EventTrigger(
      id = this@SubscriptionTopicEventTriggerSurrogate.id,
      extension = this@SubscriptionTopicEventTriggerSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubscriptionTopicEventTriggerSurrogate.modifierExtension ?: mutableListOf(),
      description =
        Markdown.of(
          this@SubscriptionTopicEventTriggerSurrogate.description,
          this@SubscriptionTopicEventTriggerSurrogate._description,
        ),
      event = this@SubscriptionTopicEventTriggerSurrogate.event,
      resource =
        Uri.of(
          this@SubscriptionTopicEventTriggerSurrogate.resource,
          this@SubscriptionTopicEventTriggerSurrogate._resource,
        )!!,
    )

  public companion object {
    public fun fromModel(
      model: SubscriptionTopic.EventTrigger
    ): SubscriptionTopicEventTriggerSurrogate =
      with(model) {
        SubscriptionTopicEventTriggerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          event = this@with.event,
          resource = this@with.resource.value,
          _resource = this@with.resource.toElement(),
        )
      }
  }
}

@Serializable
internal data class SubscriptionTopicCanFilterBySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var resource: KotlinString? = null,
  public var _resource: Element? = null,
  public var filterParameter: KotlinString? = null,
  public var _filterParameter: Element? = null,
  public var filterDefinition: KotlinString? = null,
  public var _filterDefinition: Element? = null,
  public var comparator: MutableList<KotlinString?>? = null,
  public var _comparator: MutableList<Element?>? = null,
  public var modifier: MutableList<KotlinString?>? = null,
  public var _modifier: MutableList<Element?>? = null,
) {
  public fun toModel(): SubscriptionTopic.CanFilterBy =
    SubscriptionTopic.CanFilterBy(
      id = this@SubscriptionTopicCanFilterBySurrogate.id,
      extension = this@SubscriptionTopicCanFilterBySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubscriptionTopicCanFilterBySurrogate.modifierExtension ?: mutableListOf(),
      description =
        Markdown.of(
          this@SubscriptionTopicCanFilterBySurrogate.description,
          this@SubscriptionTopicCanFilterBySurrogate._description,
        ),
      resource =
        Uri.of(
          this@SubscriptionTopicCanFilterBySurrogate.resource,
          this@SubscriptionTopicCanFilterBySurrogate._resource,
        ),
      filterParameter =
        R5String.of(
          this@SubscriptionTopicCanFilterBySurrogate.filterParameter,
          this@SubscriptionTopicCanFilterBySurrogate._filterParameter,
        )!!,
      filterDefinition =
        Uri.of(
          this@SubscriptionTopicCanFilterBySurrogate.filterDefinition,
          this@SubscriptionTopicCanFilterBySurrogate._filterDefinition,
        ),
      comparator =
        if (
          this@SubscriptionTopicCanFilterBySurrogate.comparator == null &&
            this@SubscriptionTopicCanFilterBySurrogate._comparator == null
        ) {
          mutableListOf()
        } else {
          (this@SubscriptionTopicCanFilterBySurrogate.comparator
              ?: List(this@SubscriptionTopicCanFilterBySurrogate._comparator!!.size) { null })
            .zip(
              this@SubscriptionTopicCanFilterBySurrogate._comparator
                ?: List(this@SubscriptionTopicCanFilterBySurrogate.comparator!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let {
                  com.google.fhir.model.r5.SubscriptionTopic.SearchComparator.fromCode(it!!)!!
                },
                element,
              )
            }
            .toMutableList()
        },
      modifier =
        if (
          this@SubscriptionTopicCanFilterBySurrogate.modifier == null &&
            this@SubscriptionTopicCanFilterBySurrogate._modifier == null
        ) {
          mutableListOf()
        } else {
          (this@SubscriptionTopicCanFilterBySurrogate.modifier
              ?: List(this@SubscriptionTopicCanFilterBySurrogate._modifier!!.size) { null })
            .zip(
              this@SubscriptionTopicCanFilterBySurrogate._modifier
                ?: List(this@SubscriptionTopicCanFilterBySurrogate.modifier!!.size) { null }
            )
            .map { (value, element) ->
              Enumeration.of(
                value.let {
                  com.google.fhir.model.r5.SubscriptionTopic.SearchModifierCode.fromCode(it!!)!!
                },
                element,
              )
            }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(
      model: SubscriptionTopic.CanFilterBy
    ): SubscriptionTopicCanFilterBySurrogate =
      with(model) {
        SubscriptionTopicCanFilterBySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          resource = this@with.resource?.value,
          _resource = this@with.resource?.toElement(),
          filterParameter = this@with.filterParameter.value,
          _filterParameter = this@with.filterParameter.toElement(),
          filterDefinition = this@with.filterDefinition?.value,
          _filterDefinition = this@with.filterDefinition?.toElement(),
          comparator =
            this@with.comparator
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _comparator =
            this@with.comparator
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          modifier =
            this@with.modifier
              .map { it.value?.getCode() }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _modifier =
            this@with.modifier
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class SubscriptionTopicNotificationShapeSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var resource: KotlinString? = null,
  public var _resource: Element? = null,
  public var include: MutableList<KotlinString?>? = null,
  public var _include: MutableList<Element?>? = null,
  public var revInclude: MutableList<KotlinString?>? = null,
  public var _revInclude: MutableList<Element?>? = null,
) {
  public fun toModel(): SubscriptionTopic.NotificationShape =
    SubscriptionTopic.NotificationShape(
      id = this@SubscriptionTopicNotificationShapeSurrogate.id,
      extension = this@SubscriptionTopicNotificationShapeSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@SubscriptionTopicNotificationShapeSurrogate.modifierExtension ?: mutableListOf(),
      resource =
        Uri.of(
          this@SubscriptionTopicNotificationShapeSurrogate.resource,
          this@SubscriptionTopicNotificationShapeSurrogate._resource,
        )!!,
      include =
        if (
          this@SubscriptionTopicNotificationShapeSurrogate.include == null &&
            this@SubscriptionTopicNotificationShapeSurrogate._include == null
        ) {
          mutableListOf()
        } else {
          (this@SubscriptionTopicNotificationShapeSurrogate.include
              ?: List(this@SubscriptionTopicNotificationShapeSurrogate._include!!.size) { null })
            .zip(
              this@SubscriptionTopicNotificationShapeSurrogate._include
                ?: List(this@SubscriptionTopicNotificationShapeSurrogate.include!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
      revInclude =
        if (
          this@SubscriptionTopicNotificationShapeSurrogate.revInclude == null &&
            this@SubscriptionTopicNotificationShapeSurrogate._revInclude == null
        ) {
          mutableListOf()
        } else {
          (this@SubscriptionTopicNotificationShapeSurrogate.revInclude
              ?: List(this@SubscriptionTopicNotificationShapeSurrogate._revInclude!!.size) { null })
            .zip(
              this@SubscriptionTopicNotificationShapeSurrogate._revInclude
                ?: List(this@SubscriptionTopicNotificationShapeSurrogate.revInclude!!.size) { null }
            )
            .map { (value, element) -> R5String.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(
      model: SubscriptionTopic.NotificationShape
    ): SubscriptionTopicNotificationShapeSurrogate =
      with(model) {
        SubscriptionTopicNotificationShapeSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          resource = this@with.resource.value,
          _resource = this@with.resource.toElement(),
          include =
            this@with.include.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _include =
            this@with.include
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          revInclude =
            this@with.revInclude
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _revInclude =
            this@with.revInclude
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class SubscriptionTopicVersionAlgorithmSurrogate(
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
) {
  public fun toModel(): SubscriptionTopic.VersionAlgorithm =
    SubscriptionTopic.VersionAlgorithm?.from(
      R5String.of(
        this@SubscriptionTopicVersionAlgorithmSurrogate.versionAlgorithmString,
        this@SubscriptionTopicVersionAlgorithmSurrogate._versionAlgorithmString,
      ),
      this@SubscriptionTopicVersionAlgorithmSurrogate.versionAlgorithmCoding,
    )!!

  public companion object {
    public fun fromModel(
      model: SubscriptionTopic.VersionAlgorithm
    ): SubscriptionTopicVersionAlgorithmSurrogate =
      with(model) {
        SubscriptionTopicVersionAlgorithmSurrogate(
          versionAlgorithmString = this@with.asString()?.value?.value,
          _versionAlgorithmString = this@with.asString()?.value?.toElement(),
          versionAlgorithmCoding = this@with.asCoding()?.value,
        )
      }
  }
}

@Serializable
internal data class SubscriptionTopicSurrogate(
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
  public var versionAlgorithm: SubscriptionTopic.VersionAlgorithm? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var derivedFrom: MutableList<KotlinString?>? = null,
  public var _derivedFrom: MutableList<Element?>? = null,
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
  public var resourceTrigger: MutableList<SubscriptionTopic.ResourceTrigger>? = null,
  public var eventTrigger: MutableList<SubscriptionTopic.EventTrigger>? = null,
  public var canFilterBy: MutableList<SubscriptionTopic.CanFilterBy>? = null,
  public var notificationShape: MutableList<SubscriptionTopic.NotificationShape>? = null,
) {
  public fun toModel(): SubscriptionTopic =
    SubscriptionTopic(
      id = this@SubscriptionTopicSurrogate.id,
      meta = this@SubscriptionTopicSurrogate.meta,
      implicitRules =
        Uri.of(
          this@SubscriptionTopicSurrogate.implicitRules,
          this@SubscriptionTopicSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@SubscriptionTopicSurrogate.language,
          this@SubscriptionTopicSurrogate._language,
        ),
      text = this@SubscriptionTopicSurrogate.text,
      contained = this@SubscriptionTopicSurrogate.contained ?: mutableListOf(),
      extension = this@SubscriptionTopicSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@SubscriptionTopicSurrogate.modifierExtension ?: mutableListOf(),
      url = Uri.of(this@SubscriptionTopicSurrogate.url, this@SubscriptionTopicSurrogate._url)!!,
      identifier = this@SubscriptionTopicSurrogate.identifier ?: mutableListOf(),
      version =
        R5String.of(
          this@SubscriptionTopicSurrogate.version,
          this@SubscriptionTopicSurrogate._version,
        ),
      versionAlgorithm = this@SubscriptionTopicSurrogate.versionAlgorithm,
      name =
        R5String.of(this@SubscriptionTopicSurrogate.name, this@SubscriptionTopicSurrogate._name),
      title =
        R5String.of(this@SubscriptionTopicSurrogate.title, this@SubscriptionTopicSurrogate._title),
      derivedFrom =
        if (
          this@SubscriptionTopicSurrogate.derivedFrom == null &&
            this@SubscriptionTopicSurrogate._derivedFrom == null
        ) {
          mutableListOf()
        } else {
          (this@SubscriptionTopicSurrogate.derivedFrom
              ?: List(this@SubscriptionTopicSurrogate._derivedFrom!!.size) { null })
            .zip(
              this@SubscriptionTopicSurrogate._derivedFrom
                ?: List(this@SubscriptionTopicSurrogate.derivedFrom!!.size) { null }
            )
            .map { (value, element) -> Canonical.of(value, element)!! }
            .toMutableList()
        },
      status =
        Enumeration.of(
          com.google.fhir.model.r5.PublicationStatus.fromCode(
            this@SubscriptionTopicSurrogate.status!!
          ),
          this@SubscriptionTopicSurrogate._status,
        ),
      experimental =
        R5Boolean.of(
          this@SubscriptionTopicSurrogate.experimental,
          this@SubscriptionTopicSurrogate._experimental,
        ),
      date =
        DateTime.of(
          FhirDateTime.fromString(this@SubscriptionTopicSurrogate.date),
          this@SubscriptionTopicSurrogate._date,
        ),
      publisher =
        R5String.of(
          this@SubscriptionTopicSurrogate.publisher,
          this@SubscriptionTopicSurrogate._publisher,
        ),
      contact = this@SubscriptionTopicSurrogate.contact ?: mutableListOf(),
      description =
        Markdown.of(
          this@SubscriptionTopicSurrogate.description,
          this@SubscriptionTopicSurrogate._description,
        ),
      useContext = this@SubscriptionTopicSurrogate.useContext ?: mutableListOf(),
      jurisdiction = this@SubscriptionTopicSurrogate.jurisdiction ?: mutableListOf(),
      purpose =
        Markdown.of(
          this@SubscriptionTopicSurrogate.purpose,
          this@SubscriptionTopicSurrogate._purpose,
        ),
      copyright =
        Markdown.of(
          this@SubscriptionTopicSurrogate.copyright,
          this@SubscriptionTopicSurrogate._copyright,
        ),
      copyrightLabel =
        R5String.of(
          this@SubscriptionTopicSurrogate.copyrightLabel,
          this@SubscriptionTopicSurrogate._copyrightLabel,
        ),
      approvalDate =
        Date.of(
          FhirDate.fromString(this@SubscriptionTopicSurrogate.approvalDate),
          this@SubscriptionTopicSurrogate._approvalDate,
        ),
      lastReviewDate =
        Date.of(
          FhirDate.fromString(this@SubscriptionTopicSurrogate.lastReviewDate),
          this@SubscriptionTopicSurrogate._lastReviewDate,
        ),
      effectivePeriod = this@SubscriptionTopicSurrogate.effectivePeriod,
      resourceTrigger = this@SubscriptionTopicSurrogate.resourceTrigger ?: mutableListOf(),
      eventTrigger = this@SubscriptionTopicSurrogate.eventTrigger ?: mutableListOf(),
      canFilterBy = this@SubscriptionTopicSurrogate.canFilterBy ?: mutableListOf(),
      notificationShape = this@SubscriptionTopicSurrogate.notificationShape ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: SubscriptionTopic): SubscriptionTopicSurrogate =
      with(model) {
        SubscriptionTopicSurrogate(
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
          identifier = this@with.identifier.takeUnless { it.all { it == null } },
          version = this@with.version?.value,
          _version = this@with.version?.toElement(),
          versionAlgorithm = this@with.versionAlgorithm,
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          title = this@with.title?.value,
          _title = this@with.title?.toElement(),
          derivedFrom =
            this@with.derivedFrom
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _derivedFrom =
            this@with.derivedFrom
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
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
          resourceTrigger = this@with.resourceTrigger.takeUnless { it.all { it == null } },
          eventTrigger = this@with.eventTrigger.takeUnless { it.all { it == null } },
          canFilterBy = this@with.canFilterBy.takeUnless { it.all { it == null } },
          notificationShape = this@with.notificationShape.takeUnless { it.all { it == null } },
        )
      }
  }
}
