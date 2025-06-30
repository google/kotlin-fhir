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

import com.google.fhir.model.r5.Canonical
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Instant
import com.google.fhir.model.r5.Integer64
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.SubscriptionStatus
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SubscriptionStatusNotificationEventSurrogate(
  public var id: String? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var eventNumber: Int? = null,
  public var _eventNumber: Element? = null,
  public var timestamp: String? = null,
  public var _timestamp: Element? = null,
  public var focus: Reference? = null,
  public var additionalContext: List<Reference?>? = null,
) {
  public fun toModel(): SubscriptionStatus.NotificationEvent =
    SubscriptionStatus.NotificationEvent().apply {
      id = this@SubscriptionStatusNotificationEventSurrogate.id
      extension = this@SubscriptionStatusNotificationEventSurrogate.extension
      modifierExtension = this@SubscriptionStatusNotificationEventSurrogate.modifierExtension
      eventNumber =
        Integer64.of(
          this@SubscriptionStatusNotificationEventSurrogate.eventNumber,
          this@SubscriptionStatusNotificationEventSurrogate._eventNumber,
        )
      timestamp =
        Instant.of(
          FhirDateTime.fromString(this@SubscriptionStatusNotificationEventSurrogate.timestamp),
          this@SubscriptionStatusNotificationEventSurrogate._timestamp,
        )
      focus = this@SubscriptionStatusNotificationEventSurrogate.focus
      additionalContext = this@SubscriptionStatusNotificationEventSurrogate.additionalContext
    }

  public companion object {
    public fun fromModel(
      model: SubscriptionStatus.NotificationEvent
    ): SubscriptionStatusNotificationEventSurrogate =
      with(model) {
        SubscriptionStatusNotificationEventSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          eventNumber = this@with.eventNumber?.value
          _eventNumber = this@with.eventNumber?.toElement()
          timestamp = this@with.timestamp?.value?.toString()
          _timestamp = this@with.timestamp?.toElement()
          focus = this@with.focus
          additionalContext = this@with.additionalContext
        }
      }
  }
}

@Serializable
internal data class SubscriptionStatusSurrogate(
  public var id: String? = null,
  public var meta: Meta? = null,
  public var implicitRules: String? = null,
  public var _implicitRules: Element? = null,
  public var language: String? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var status: String? = null,
  public var _status: Element? = null,
  public var type: String? = null,
  public var _type: Element? = null,
  public var eventsSinceSubscriptionStart: Int? = null,
  public var _eventsSinceSubscriptionStart: Element? = null,
  public var notificationEvent: List<SubscriptionStatus.NotificationEvent>? = null,
  public var subscription: Reference? = null,
  public var topic: String? = null,
  public var _topic: Element? = null,
  public var error: List<CodeableConcept?>? = null,
) {
  public fun toModel(): SubscriptionStatus =
    SubscriptionStatus().apply {
      id = this@SubscriptionStatusSurrogate.id
      meta = this@SubscriptionStatusSurrogate.meta
      implicitRules =
        Uri.of(
          this@SubscriptionStatusSurrogate.implicitRules,
          this@SubscriptionStatusSurrogate._implicitRules,
        )
      language =
        Code.of(
          this@SubscriptionStatusSurrogate.language,
          this@SubscriptionStatusSurrogate._language,
        )
      text = this@SubscriptionStatusSurrogate.text
      contained = this@SubscriptionStatusSurrogate.contained
      extension = this@SubscriptionStatusSurrogate.extension
      modifierExtension = this@SubscriptionStatusSurrogate.modifierExtension
      status =
        Enumeration.of(
          this@SubscriptionStatusSurrogate.status?.let {
            com.google.fhir.model.r5.SubscriptionStatus.SubscriptionStatus.fromCode(it)
          },
          this@SubscriptionStatusSurrogate._status,
        )
      type =
        Enumeration.of(
          this@SubscriptionStatusSurrogate.type?.let {
            com.google.fhir.model.r5.SubscriptionStatus.SubscriptionNotificationType.fromCode(it)
          },
          this@SubscriptionStatusSurrogate._type,
        )
      eventsSinceSubscriptionStart =
        Integer64.of(
          this@SubscriptionStatusSurrogate.eventsSinceSubscriptionStart,
          this@SubscriptionStatusSurrogate._eventsSinceSubscriptionStart,
        )
      notificationEvent = this@SubscriptionStatusSurrogate.notificationEvent
      subscription = this@SubscriptionStatusSurrogate.subscription
      topic =
        Canonical.of(
          this@SubscriptionStatusSurrogate.topic,
          this@SubscriptionStatusSurrogate._topic,
        )
      error = this@SubscriptionStatusSurrogate.error
    }

  public companion object {
    public fun fromModel(model: SubscriptionStatus): SubscriptionStatusSurrogate =
      with(model) {
        SubscriptionStatusSurrogate().apply {
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
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          eventsSinceSubscriptionStart = this@with.eventsSinceSubscriptionStart?.value
          _eventsSinceSubscriptionStart = this@with.eventsSinceSubscriptionStart?.toElement()
          notificationEvent = this@with.notificationEvent
          subscription = this@with.subscription
          topic = this@with.topic?.value
          _topic = this@with.topic?.toElement()
          error = this@with.error
        }
      }
  }
}
