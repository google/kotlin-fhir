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

import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.MedicinalProductAuthorization
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Period
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MedicinalProductAuthorizationJurisdictionalAuthorizationSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: MutableList<Identifier>? = null,
  public var country: CodeableConcept? = null,
  public var jurisdiction: MutableList<CodeableConcept>? = null,
  public var legalStatusOfSupply: CodeableConcept? = null,
  public var validityPeriod: Period? = null,
) {
  public fun toModel(): MedicinalProductAuthorization.JurisdictionalAuthorization =
    MedicinalProductAuthorization.JurisdictionalAuthorization(
      id = this@MedicinalProductAuthorizationJurisdictionalAuthorizationSurrogate.id,
      extension =
        this@MedicinalProductAuthorizationJurisdictionalAuthorizationSurrogate.extension
          ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductAuthorizationJurisdictionalAuthorizationSurrogate.modifierExtension
          ?: mutableListOf(),
      identifier =
        this@MedicinalProductAuthorizationJurisdictionalAuthorizationSurrogate.identifier
          ?: mutableListOf(),
      country = this@MedicinalProductAuthorizationJurisdictionalAuthorizationSurrogate.country,
      jurisdiction =
        this@MedicinalProductAuthorizationJurisdictionalAuthorizationSurrogate.jurisdiction
          ?: mutableListOf(),
      legalStatusOfSupply =
        this@MedicinalProductAuthorizationJurisdictionalAuthorizationSurrogate.legalStatusOfSupply,
      validityPeriod =
        this@MedicinalProductAuthorizationJurisdictionalAuthorizationSurrogate.validityPeriod,
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductAuthorization.JurisdictionalAuthorization
    ): MedicinalProductAuthorizationJurisdictionalAuthorizationSurrogate =
      with(model) {
        MedicinalProductAuthorizationJurisdictionalAuthorizationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
          country = this@with.country,
          jurisdiction = this@with.jurisdiction.takeIf { it.isNotEmpty() },
          legalStatusOfSupply = this@with.legalStatusOfSupply,
          validityPeriod = this@with.validityPeriod,
        )
      }
  }
}

@Serializable
internal data class MedicinalProductAuthorizationProcedureSurrogate(
  public var id: String? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: Identifier? = null,
  public var type: CodeableConcept,
  public var date: MedicinalProductAuthorization.Procedure.Date? = null,
  public var application: MutableList<MedicinalProductAuthorization.Procedure>? = null,
) {
  public fun toModel(): MedicinalProductAuthorization.Procedure =
    MedicinalProductAuthorization.Procedure(
      id = this@MedicinalProductAuthorizationProcedureSurrogate.id,
      extension = this@MedicinalProductAuthorizationProcedureSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductAuthorizationProcedureSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@MedicinalProductAuthorizationProcedureSurrogate.identifier,
      type = this@MedicinalProductAuthorizationProcedureSurrogate.type,
      date = this@MedicinalProductAuthorizationProcedureSurrogate.date,
      application =
        this@MedicinalProductAuthorizationProcedureSurrogate.application ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductAuthorization.Procedure
    ): MedicinalProductAuthorizationProcedureSurrogate =
      with(model) {
        MedicinalProductAuthorizationProcedureSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          identifier = this@with.identifier,
          type = this@with.type,
          date = this@with.date,
          application = this@with.application.takeIf { it.isNotEmpty() },
        )
      }
  }
}

@Serializable
internal data class MedicinalProductAuthorizationProcedureDateSurrogate(
  public var datePeriod: Period? = null,
  public var dateDateTime: String? = null,
  public var _dateDateTime: Element? = null,
) {
  public fun toModel(): MedicinalProductAuthorization.Procedure.Date =
    MedicinalProductAuthorization.Procedure.Date.from(
      this@MedicinalProductAuthorizationProcedureDateSurrogate.datePeriod,
      DateTime.of(
        FhirDateTime.fromString(
          this@MedicinalProductAuthorizationProcedureDateSurrogate.dateDateTime
        ),
        this@MedicinalProductAuthorizationProcedureDateSurrogate._dateDateTime,
      ),
    )!!

  public companion object {
    public fun fromModel(
      model: MedicinalProductAuthorization.Procedure.Date
    ): MedicinalProductAuthorizationProcedureDateSurrogate =
      with(model) {
        MedicinalProductAuthorizationProcedureDateSurrogate(
          datePeriod = this@with.asPeriod()?.value,
          dateDateTime = this@with.asDateTime()?.value?.value?.toString(),
          _dateDateTime = this@with.asDateTime()?.value?.toElement(),
        )
      }
  }
}

@Serializable
internal data class MedicinalProductAuthorizationSurrogate(
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
  public var subject: Reference? = null,
  public var country: MutableList<CodeableConcept>? = null,
  public var jurisdiction: MutableList<CodeableConcept>? = null,
  public var status: CodeableConcept? = null,
  public var statusDate: String? = null,
  public var _statusDate: Element? = null,
  public var restoreDate: String? = null,
  public var _restoreDate: Element? = null,
  public var validityPeriod: Period? = null,
  public var dataExclusivityPeriod: Period? = null,
  public var dateOfFirstAuthorization: String? = null,
  public var _dateOfFirstAuthorization: Element? = null,
  public var internationalBirthDate: String? = null,
  public var _internationalBirthDate: Element? = null,
  public var legalBasis: CodeableConcept? = null,
  public var jurisdictionalAuthorization:
    MutableList<MedicinalProductAuthorization.JurisdictionalAuthorization>? =
    null,
  public var holder: Reference? = null,
  public var regulator: Reference? = null,
  public var procedure: MedicinalProductAuthorization.Procedure? = null,
) {
  public fun toModel(): MedicinalProductAuthorization =
    MedicinalProductAuthorization(
      id = this@MedicinalProductAuthorizationSurrogate.id,
      meta = this@MedicinalProductAuthorizationSurrogate.meta,
      implicitRules =
        Uri.of(
          this@MedicinalProductAuthorizationSurrogate.implicitRules,
          this@MedicinalProductAuthorizationSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@MedicinalProductAuthorizationSurrogate.language,
          this@MedicinalProductAuthorizationSurrogate._language,
        ),
      text = this@MedicinalProductAuthorizationSurrogate.text,
      contained = this@MedicinalProductAuthorizationSurrogate.contained ?: mutableListOf(),
      extension = this@MedicinalProductAuthorizationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MedicinalProductAuthorizationSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@MedicinalProductAuthorizationSurrogate.identifier ?: mutableListOf(),
      subject = this@MedicinalProductAuthorizationSurrogate.subject,
      country = this@MedicinalProductAuthorizationSurrogate.country ?: mutableListOf(),
      jurisdiction = this@MedicinalProductAuthorizationSurrogate.jurisdiction ?: mutableListOf(),
      status = this@MedicinalProductAuthorizationSurrogate.status,
      statusDate =
        DateTime.of(
          FhirDateTime.fromString(this@MedicinalProductAuthorizationSurrogate.statusDate),
          this@MedicinalProductAuthorizationSurrogate._statusDate,
        ),
      restoreDate =
        DateTime.of(
          FhirDateTime.fromString(this@MedicinalProductAuthorizationSurrogate.restoreDate),
          this@MedicinalProductAuthorizationSurrogate._restoreDate,
        ),
      validityPeriod = this@MedicinalProductAuthorizationSurrogate.validityPeriod,
      dataExclusivityPeriod = this@MedicinalProductAuthorizationSurrogate.dataExclusivityPeriod,
      dateOfFirstAuthorization =
        DateTime.of(
          FhirDateTime.fromString(
            this@MedicinalProductAuthorizationSurrogate.dateOfFirstAuthorization
          ),
          this@MedicinalProductAuthorizationSurrogate._dateOfFirstAuthorization,
        ),
      internationalBirthDate =
        DateTime.of(
          FhirDateTime.fromString(
            this@MedicinalProductAuthorizationSurrogate.internationalBirthDate
          ),
          this@MedicinalProductAuthorizationSurrogate._internationalBirthDate,
        ),
      legalBasis = this@MedicinalProductAuthorizationSurrogate.legalBasis,
      jurisdictionalAuthorization =
        this@MedicinalProductAuthorizationSurrogate.jurisdictionalAuthorization ?: mutableListOf(),
      holder = this@MedicinalProductAuthorizationSurrogate.holder,
      regulator = this@MedicinalProductAuthorizationSurrogate.regulator,
      procedure = this@MedicinalProductAuthorizationSurrogate.procedure,
    )

  public companion object {
    public fun fromModel(
      model: MedicinalProductAuthorization
    ): MedicinalProductAuthorizationSurrogate =
      with(model) {
        MedicinalProductAuthorizationSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeIf { it.isNotEmpty() },
          extension = this@with.extension.takeIf { it.isNotEmpty() },
          modifierExtension = this@with.modifierExtension.takeIf { it.isNotEmpty() },
          identifier = this@with.identifier.takeIf { it.isNotEmpty() },
          subject = this@with.subject,
          country = this@with.country.takeIf { it.isNotEmpty() },
          jurisdiction = this@with.jurisdiction.takeIf { it.isNotEmpty() },
          status = this@with.status,
          statusDate = this@with.statusDate?.value?.toString(),
          _statusDate = this@with.statusDate?.toElement(),
          restoreDate = this@with.restoreDate?.value?.toString(),
          _restoreDate = this@with.restoreDate?.toElement(),
          validityPeriod = this@with.validityPeriod,
          dataExclusivityPeriod = this@with.dataExclusivityPeriod,
          dateOfFirstAuthorization = this@with.dateOfFirstAuthorization?.value?.toString(),
          _dateOfFirstAuthorization = this@with.dateOfFirstAuthorization?.toElement(),
          internationalBirthDate = this@with.internationalBirthDate?.value?.toString(),
          _internationalBirthDate = this@with.internationalBirthDate?.toElement(),
          legalBasis = this@with.legalBasis,
          jurisdictionalAuthorization =
            this@with.jurisdictionalAuthorization.takeIf { it.isNotEmpty() },
          holder = this@with.holder,
          regulator = this@with.regulator,
          procedure = this@with.procedure,
        )
      }
  }
}
