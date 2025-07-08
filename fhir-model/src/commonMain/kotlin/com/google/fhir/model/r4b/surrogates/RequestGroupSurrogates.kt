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

import com.google.fhir.model.r4b.Age
import com.google.fhir.model.r4b.Annotation
import com.google.fhir.model.r4b.Canonical
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Duration
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Expression
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Id
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Period
import com.google.fhir.model.r4b.Range
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.RelatedArtifact
import com.google.fhir.model.r4b.RequestGroup
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Timing
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class RequestGroupActionConditionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var kind: KotlinString? = null,
  public var _kind: Element? = null,
  public var expression: Expression? = null,
) {
  public fun toModel(): RequestGroup.Action.Condition =
    RequestGroup.Action.Condition().apply {
      id = this@RequestGroupActionConditionSurrogate.id
      extension = this@RequestGroupActionConditionSurrogate.extension
      modifierExtension = this@RequestGroupActionConditionSurrogate.modifierExtension
      kind =
        Enumeration.of(
          this@RequestGroupActionConditionSurrogate.kind?.let {
            com.google.fhir.model.r4b.RequestGroup.ActionConditionKind.fromCode(it)
          },
          this@RequestGroupActionConditionSurrogate._kind,
        )
      expression = this@RequestGroupActionConditionSurrogate.expression
    }

  public companion object {
    public fun fromModel(
      model: RequestGroup.Action.Condition
    ): RequestGroupActionConditionSurrogate =
      with(model) {
        RequestGroupActionConditionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          kind = this@with.kind?.value?.getCode()
          _kind = this@with.kind?.toElement()
          expression = this@with.expression
        }
      }
  }
}

@Serializable
internal class RequestGroupActionRelatedActionOffsetSurrogate {
  public var offsetDuration: Duration? = null

  public var offsetRange: Range? = null

  public fun toModel(): RequestGroup.Action.RelatedAction.Offset =
    RequestGroup.Action.RelatedAction.Offset?.from(
      this@RequestGroupActionRelatedActionOffsetSurrogate.offsetDuration,
      this@RequestGroupActionRelatedActionOffsetSurrogate.offsetRange,
    ) ?: RequestGroup.Action.RelatedAction.Offset.Null

  public companion object {
    public fun fromModel(
      model: RequestGroup.Action.RelatedAction.Offset
    ): RequestGroupActionRelatedActionOffsetSurrogate =
      with(model) {
        RequestGroupActionRelatedActionOffsetSurrogate().apply {
          offsetDuration = this@with.asDuration()?.value
          offsetRange = this@with.asRange()?.value
        }
      }
  }
}

@Serializable
internal data class RequestGroupActionRelatedActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var actionId: KotlinString? = null,
  public var _actionId: Element? = null,
  public var relationship: KotlinString? = null,
  public var _relationship: Element? = null,
  public var offset: RequestGroup.Action.RelatedAction.Offset? = null,
) {
  public fun toModel(): RequestGroup.Action.RelatedAction =
    RequestGroup.Action.RelatedAction().apply {
      id = this@RequestGroupActionRelatedActionSurrogate.id
      extension = this@RequestGroupActionRelatedActionSurrogate.extension
      modifierExtension = this@RequestGroupActionRelatedActionSurrogate.modifierExtension
      actionId =
        Id.of(
          this@RequestGroupActionRelatedActionSurrogate.actionId,
          this@RequestGroupActionRelatedActionSurrogate._actionId,
        )
      relationship =
        Enumeration.of(
          this@RequestGroupActionRelatedActionSurrogate.relationship?.let {
            com.google.fhir.model.r4b.RequestGroup.ActionRelationshipType.fromCode(it)
          },
          this@RequestGroupActionRelatedActionSurrogate._relationship,
        )
      offset = this@RequestGroupActionRelatedActionSurrogate.offset
    }

  public companion object {
    public fun fromModel(
      model: RequestGroup.Action.RelatedAction
    ): RequestGroupActionRelatedActionSurrogate =
      with(model) {
        RequestGroupActionRelatedActionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          actionId = this@with.actionId?.value
          _actionId = this@with.actionId?.toElement()
          relationship = this@with.relationship?.value?.getCode()
          _relationship = this@with.relationship?.toElement()
          offset = this@with.offset
        }
      }
  }
}

@Serializable
internal class RequestGroupActionTimingSurrogate {
  public var timingDateTime: KotlinString? = null

  public var _timingDateTime: Element? = null

  public var timingAge: Age? = null

  public var timingPeriod: Period? = null

  public var timingDuration: Duration? = null

  public var timingRange: Range? = null

  public var timingTiming: Timing? = null

  public fun toModel(): RequestGroup.Action.Timing =
    RequestGroup.Action.Timing?.from(
      DateTime.of(
        FhirDateTime.fromString(this@RequestGroupActionTimingSurrogate.timingDateTime),
        this@RequestGroupActionTimingSurrogate._timingDateTime,
      ),
      this@RequestGroupActionTimingSurrogate.timingAge,
      this@RequestGroupActionTimingSurrogate.timingPeriod,
      this@RequestGroupActionTimingSurrogate.timingDuration,
      this@RequestGroupActionTimingSurrogate.timingRange,
      this@RequestGroupActionTimingSurrogate.timingTiming,
    ) ?: RequestGroup.Action.Timing.Null

  public companion object {
    public fun fromModel(model: RequestGroup.Action.Timing): RequestGroupActionTimingSurrogate =
      with(model) {
        RequestGroupActionTimingSurrogate().apply {
          timingDateTime = this@with.asDateTime()?.value?.value?.toString()
          _timingDateTime = this@with.asDateTime()?.value?.toElement()
          timingAge = this@with.asAge()?.value
          timingPeriod = this@with.asPeriod()?.value
          timingDuration = this@with.asDuration()?.value
          timingRange = this@with.asRange()?.value
          timingTiming = this@with.asTiming()?.value
        }
      }
  }
}

@Serializable
internal data class RequestGroupActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var prefix: KotlinString? = null,
  public var _prefix: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var textEquivalent: KotlinString? = null,
  public var _textEquivalent: Element? = null,
  public var priority: KotlinString? = null,
  public var _priority: Element? = null,
  public var code: List<CodeableConcept?>? = null,
  public var documentation: List<RelatedArtifact?>? = null,
  public var condition: List<RequestGroup.Action.Condition>? = null,
  public var relatedAction: List<RequestGroup.Action.RelatedAction>? = null,
  public var participant: List<Reference?>? = null,
  public var type: CodeableConcept? = null,
  public var groupingBehavior: KotlinString? = null,
  public var _groupingBehavior: Element? = null,
  public var selectionBehavior: KotlinString? = null,
  public var _selectionBehavior: Element? = null,
  public var requiredBehavior: KotlinString? = null,
  public var _requiredBehavior: Element? = null,
  public var precheckBehavior: KotlinString? = null,
  public var _precheckBehavior: Element? = null,
  public var cardinalityBehavior: KotlinString? = null,
  public var _cardinalityBehavior: Element? = null,
  public var resource: Reference? = null,
  public var action: List<RequestGroup.Action?>? = null,
  public var timing: RequestGroup.Action.Timing? = null,
) {
  public fun toModel(): RequestGroup.Action =
    RequestGroup.Action().apply {
      id = this@RequestGroupActionSurrogate.id
      extension = this@RequestGroupActionSurrogate.extension
      modifierExtension = this@RequestGroupActionSurrogate.modifierExtension
      prefix =
        R4bString.of(
          this@RequestGroupActionSurrogate.prefix,
          this@RequestGroupActionSurrogate._prefix,
        )
      title =
        R4bString.of(
          this@RequestGroupActionSurrogate.title,
          this@RequestGroupActionSurrogate._title,
        )
      description =
        R4bString.of(
          this@RequestGroupActionSurrogate.description,
          this@RequestGroupActionSurrogate._description,
        )
      textEquivalent =
        R4bString.of(
          this@RequestGroupActionSurrogate.textEquivalent,
          this@RequestGroupActionSurrogate._textEquivalent,
        )
      priority =
        Enumeration.of(
          this@RequestGroupActionSurrogate.priority?.let {
            com.google.fhir.model.r4b.RequestGroup.RequestPriority.fromCode(it)
          },
          this@RequestGroupActionSurrogate._priority,
        )
      code = this@RequestGroupActionSurrogate.code
      documentation = this@RequestGroupActionSurrogate.documentation
      condition = this@RequestGroupActionSurrogate.condition
      relatedAction = this@RequestGroupActionSurrogate.relatedAction
      timing = this@RequestGroupActionSurrogate.timing
      participant = this@RequestGroupActionSurrogate.participant
      type = this@RequestGroupActionSurrogate.type
      groupingBehavior =
        Enumeration.of(
          this@RequestGroupActionSurrogate.groupingBehavior?.let {
            com.google.fhir.model.r4b.RequestGroup.ActionGroupingBehavior.fromCode(it)
          },
          this@RequestGroupActionSurrogate._groupingBehavior,
        )
      selectionBehavior =
        Enumeration.of(
          this@RequestGroupActionSurrogate.selectionBehavior?.let {
            com.google.fhir.model.r4b.RequestGroup.ActionSelectionBehavior.fromCode(it)
          },
          this@RequestGroupActionSurrogate._selectionBehavior,
        )
      requiredBehavior =
        Enumeration.of(
          this@RequestGroupActionSurrogate.requiredBehavior?.let {
            com.google.fhir.model.r4b.RequestGroup.ActionRequiredBehavior.fromCode(it)
          },
          this@RequestGroupActionSurrogate._requiredBehavior,
        )
      precheckBehavior =
        Enumeration.of(
          this@RequestGroupActionSurrogate.precheckBehavior?.let {
            com.google.fhir.model.r4b.RequestGroup.ActionPrecheckBehavior.fromCode(it)
          },
          this@RequestGroupActionSurrogate._precheckBehavior,
        )
      cardinalityBehavior =
        Enumeration.of(
          this@RequestGroupActionSurrogate.cardinalityBehavior?.let {
            com.google.fhir.model.r4b.RequestGroup.ActionCardinalityBehavior.fromCode(it)
          },
          this@RequestGroupActionSurrogate._cardinalityBehavior,
        )
      resource = this@RequestGroupActionSurrogate.resource
      action = this@RequestGroupActionSurrogate.action
    }

  public companion object {
    public fun fromModel(model: RequestGroup.Action): RequestGroupActionSurrogate =
      with(model) {
        RequestGroupActionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          prefix = this@with.prefix?.value
          _prefix = this@with.prefix?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          textEquivalent = this@with.textEquivalent?.value
          _textEquivalent = this@with.textEquivalent?.toElement()
          priority = this@with.priority?.value?.getCode()
          _priority = this@with.priority?.toElement()
          code = this@with.code
          documentation = this@with.documentation
          condition = this@with.condition
          relatedAction = this@with.relatedAction
          timing = this@with.timing
          participant = this@with.participant
          type = this@with.type
          groupingBehavior = this@with.groupingBehavior?.value?.getCode()
          _groupingBehavior = this@with.groupingBehavior?.toElement()
          selectionBehavior = this@with.selectionBehavior?.value?.getCode()
          _selectionBehavior = this@with.selectionBehavior?.toElement()
          requiredBehavior = this@with.requiredBehavior?.value?.getCode()
          _requiredBehavior = this@with.requiredBehavior?.toElement()
          precheckBehavior = this@with.precheckBehavior?.value?.getCode()
          _precheckBehavior = this@with.precheckBehavior?.toElement()
          cardinalityBehavior = this@with.cardinalityBehavior?.value?.getCode()
          _cardinalityBehavior = this@with.cardinalityBehavior?.toElement()
          resource = this@with.resource
          action = this@with.action
        }
      }
  }
}

@Serializable
internal data class RequestGroupSurrogate(
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
  public var identifier: List<Identifier?>? = null,
  public var instantiatesCanonical: List<KotlinString?>? = null,
  public var _instantiatesCanonical: List<Element?>? = null,
  public var instantiatesUri: List<KotlinString?>? = null,
  public var _instantiatesUri: List<Element?>? = null,
  public var basedOn: List<Reference?>? = null,
  public var replaces: List<Reference?>? = null,
  public var groupIdentifier: Identifier? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var intent: KotlinString? = null,
  public var _intent: Element? = null,
  public var priority: KotlinString? = null,
  public var _priority: Element? = null,
  public var code: CodeableConcept? = null,
  public var subject: Reference? = null,
  public var encounter: Reference? = null,
  public var authoredOn: KotlinString? = null,
  public var _authoredOn: Element? = null,
  public var author: Reference? = null,
  public var reasonCode: List<CodeableConcept?>? = null,
  public var reasonReference: List<Reference?>? = null,
  public var note: List<Annotation?>? = null,
  public var action: List<RequestGroup.Action>? = null,
) {
  public fun toModel(): RequestGroup =
    RequestGroup().apply {
      id = this@RequestGroupSurrogate.id
      meta = this@RequestGroupSurrogate.meta
      implicitRules =
        Uri.of(this@RequestGroupSurrogate.implicitRules, this@RequestGroupSurrogate._implicitRules)
      language = Code.of(this@RequestGroupSurrogate.language, this@RequestGroupSurrogate._language)
      text = this@RequestGroupSurrogate.text
      contained = this@RequestGroupSurrogate.contained
      extension = this@RequestGroupSurrogate.extension
      modifierExtension = this@RequestGroupSurrogate.modifierExtension
      identifier = this@RequestGroupSurrogate.identifier
      instantiatesCanonical =
        if (
          this@RequestGroupSurrogate.instantiatesCanonical == null &&
            this@RequestGroupSurrogate._instantiatesCanonical == null
        ) {
          null
        } else {
          (this@RequestGroupSurrogate.instantiatesCanonical
              ?: List(this@RequestGroupSurrogate._instantiatesCanonical!!.size) { null })
            .zip(
              this@RequestGroupSurrogate._instantiatesCanonical
                ?: List(this@RequestGroupSurrogate.instantiatesCanonical!!.size) { null }
            )
            .mapNotNull { (value, element) -> Canonical.of(value, element) }
        }
      instantiatesUri =
        if (
          this@RequestGroupSurrogate.instantiatesUri == null &&
            this@RequestGroupSurrogate._instantiatesUri == null
        ) {
          null
        } else {
          (this@RequestGroupSurrogate.instantiatesUri
              ?: List(this@RequestGroupSurrogate._instantiatesUri!!.size) { null })
            .zip(
              this@RequestGroupSurrogate._instantiatesUri
                ?: List(this@RequestGroupSurrogate.instantiatesUri!!.size) { null }
            )
            .mapNotNull { (value, element) -> Uri.of(value, element) }
        }
      basedOn = this@RequestGroupSurrogate.basedOn
      replaces = this@RequestGroupSurrogate.replaces
      groupIdentifier = this@RequestGroupSurrogate.groupIdentifier
      status =
        Enumeration.of(
          this@RequestGroupSurrogate.status?.let {
            com.google.fhir.model.r4b.RequestGroup.RequestStatus.fromCode(it)
          },
          this@RequestGroupSurrogate._status,
        )
      intent =
        Enumeration.of(
          this@RequestGroupSurrogate.intent?.let {
            com.google.fhir.model.r4b.RequestGroup.RequestIntent.fromCode(it)
          },
          this@RequestGroupSurrogate._intent,
        )
      priority =
        Enumeration.of(
          this@RequestGroupSurrogate.priority?.let {
            com.google.fhir.model.r4b.RequestGroup.RequestPriority.fromCode(it)
          },
          this@RequestGroupSurrogate._priority,
        )
      code = this@RequestGroupSurrogate.code
      subject = this@RequestGroupSurrogate.subject
      encounter = this@RequestGroupSurrogate.encounter
      authoredOn =
        DateTime.of(
          FhirDateTime.fromString(this@RequestGroupSurrogate.authoredOn),
          this@RequestGroupSurrogate._authoredOn,
        )
      author = this@RequestGroupSurrogate.author
      reasonCode = this@RequestGroupSurrogate.reasonCode
      reasonReference = this@RequestGroupSurrogate.reasonReference
      note = this@RequestGroupSurrogate.note
      action = this@RequestGroupSurrogate.action
    }

  public companion object {
    public fun fromModel(model: RequestGroup): RequestGroupSurrogate =
      with(model) {
        RequestGroupSurrogate().apply {
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
          identifier = this@with.identifier
          instantiatesCanonical =
            this@with.instantiatesCanonical?.map { it?.value }?.takeUnless { it.all { it == null } }
          _instantiatesCanonical =
            this@with.instantiatesCanonical
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          instantiatesUri =
            this@with.instantiatesUri?.map { it?.value }?.takeUnless { it.all { it == null } }
          _instantiatesUri =
            this@with.instantiatesUri?.map { it?.toElement() }?.takeUnless { it.all { it == null } }
          basedOn = this@with.basedOn
          replaces = this@with.replaces
          groupIdentifier = this@with.groupIdentifier
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          intent = this@with.intent?.value?.getCode()
          _intent = this@with.intent?.toElement()
          priority = this@with.priority?.value?.getCode()
          _priority = this@with.priority?.toElement()
          code = this@with.code
          subject = this@with.subject
          encounter = this@with.encounter
          authoredOn = this@with.authoredOn?.value?.toString()
          _authoredOn = this@with.authoredOn?.toElement()
          author = this@with.author
          reasonCode = this@with.reasonCode
          reasonReference = this@with.reasonReference
          note = this@with.note
          action = this@with.action
        }
      }
  }
}
