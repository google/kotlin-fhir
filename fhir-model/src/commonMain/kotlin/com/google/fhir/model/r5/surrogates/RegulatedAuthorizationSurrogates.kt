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

import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Period
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.RegulatedAuthorization
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class RegulatedAuthorizationCaseDateSurrogate(
  public var datePeriod: Period? = null,
  public var dateDateTime: String? = null,
  public var _dateDateTime: Element? = null,
) {
  public fun toModel(): RegulatedAuthorization.Case.Date? =
    RegulatedAuthorization.Case.Date?.from(
      this@RegulatedAuthorizationCaseDateSurrogate.datePeriod,
      DateTime.of(
        FhirDateTime.fromString(this@RegulatedAuthorizationCaseDateSurrogate.dateDateTime),
        this@RegulatedAuthorizationCaseDateSurrogate._dateDateTime,
      ),
    )

  public companion object {
    public fun fromModel(
      model: RegulatedAuthorization.Case.Date
    ): RegulatedAuthorizationCaseDateSurrogate =
      with(model) {
        RegulatedAuthorizationCaseDateSurrogate(
          datePeriod = this@with.asPeriod()?.value,
          dateDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _dateDateTime = this@with.asDateTime()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class RegulatedAuthorizationCaseSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: Identifier? = null,
  public var type: CodeableConcept? = null,
  public var status: CodeableConcept? = null,
  public var application: MutableList<RegulatedAuthorization.Case>? = null,
  public var date: RegulatedAuthorization.Case.Date? = null,
) {
  public fun toModel(): RegulatedAuthorization.Case =
    RegulatedAuthorization.Case(
      id = this@RegulatedAuthorizationCaseSurrogate.id,
      extension = this@RegulatedAuthorizationCaseSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@RegulatedAuthorizationCaseSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@RegulatedAuthorizationCaseSurrogate.identifier,
      type = this@RegulatedAuthorizationCaseSurrogate.type,
      status = this@RegulatedAuthorizationCaseSurrogate.status,
      date = this@RegulatedAuthorizationCaseSurrogate.date,
      application = this@RegulatedAuthorizationCaseSurrogate.application ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: RegulatedAuthorization.Case): RegulatedAuthorizationCaseSurrogate =
      with(model) {
        RegulatedAuthorizationCaseSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier,
          type = this@with.type,
          status = this@with.status,
          date = this@with.date,
          application = this@with.application.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class RegulatedAuthorizationSurrogate(
  public var id: String? = null,
  public var meta: Meta? = null,
  public var implicitRules: String? = null,
  public var _implicitRules: Element? = null,
  public var language: String? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var subject: MutableList<Reference>? = null,
  public var type: CodeableConcept? = null,
  public var description: String? = null,
  public var _description: Element? = null,
  public var region: MutableList<CodeableConcept>? = null,
  public var status: CodeableConcept? = null,
  public var statusDate: String? = null,
  public var _statusDate: Element? = null,
  public var validityPeriod: Period? = null,
  public var indication: MutableList<CodeableReference>? = null,
  public var intendedUse: CodeableConcept? = null,
  public var basis: MutableList<CodeableConcept>? = null,
  public var holder: Reference? = null,
  public var regulator: Reference? = null,
  public var attachedDocument: MutableList<Reference>? = null,
  public var case: RegulatedAuthorization.Case? = null,
) {
  public fun toModel(): RegulatedAuthorization =
    RegulatedAuthorization(
      id = this@RegulatedAuthorizationSurrogate.id,
      meta = this@RegulatedAuthorizationSurrogate.meta,
      implicitRules =
        Uri.of(
          this@RegulatedAuthorizationSurrogate.implicitRules,
          this@RegulatedAuthorizationSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@RegulatedAuthorizationSurrogate.language,
          this@RegulatedAuthorizationSurrogate._language,
        ),
      text = this@RegulatedAuthorizationSurrogate.text,
      contained = this@RegulatedAuthorizationSurrogate.contained ?: mutableListOf(),
      extension = this@RegulatedAuthorizationSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@RegulatedAuthorizationSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@RegulatedAuthorizationSurrogate.identifier ?: mutableListOf(),
      subject = this@RegulatedAuthorizationSurrogate.subject ?: mutableListOf(),
      type = this@RegulatedAuthorizationSurrogate.type,
      description =
        Markdown.of(
          this@RegulatedAuthorizationSurrogate.description,
          this@RegulatedAuthorizationSurrogate._description,
        ),
      region = this@RegulatedAuthorizationSurrogate.region ?: mutableListOf(),
      status = this@RegulatedAuthorizationSurrogate.status,
      statusDate =
        DateTime.of(
          FhirDateTime.fromString(this@RegulatedAuthorizationSurrogate.statusDate),
          this@RegulatedAuthorizationSurrogate._statusDate,
        ),
      validityPeriod = this@RegulatedAuthorizationSurrogate.validityPeriod,
      indication = this@RegulatedAuthorizationSurrogate.indication ?: mutableListOf(),
      intendedUse = this@RegulatedAuthorizationSurrogate.intendedUse,
      basis = this@RegulatedAuthorizationSurrogate.basis ?: mutableListOf(),
      holder = this@RegulatedAuthorizationSurrogate.holder,
      regulator = this@RegulatedAuthorizationSurrogate.regulator,
      attachedDocument = this@RegulatedAuthorizationSurrogate.attachedDocument ?: mutableListOf(),
      case = this@RegulatedAuthorizationSurrogate.case,
    )

  public companion object {
    public fun fromModel(model: RegulatedAuthorization): RegulatedAuthorizationSurrogate =
      with(model) {
        RegulatedAuthorizationSurrogate(
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
          subject = this@with.subject.takeUnless { it.all { it == null } },
          type = this@with.type,
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          region = this@with.region.takeUnless { it.all { it == null } },
          status = this@with.status,
          statusDate = this@with.statusDate?.value?.toString(),
          _statusDate = this@with.statusDate?.toElement(),
          validityPeriod = this@with.validityPeriod,
          indication = this@with.indication.takeUnless { it.all { it == null } },
          intendedUse = this@with.intendedUse,
          basis = this@with.basis.takeUnless { it.all { it == null } },
          holder = this@with.holder,
          regulator = this@with.regulator,
          attachedDocument = this@with.attachedDocument.takeUnless { it.all { it == null } },
          case = this@with.case,
        )
      }
  }
}
