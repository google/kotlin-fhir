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

import com.google.fhir.model.r4.Attachment
import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.CodeableConcept
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Integer
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.SubstanceProtein
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class SubstanceProteinSubunitSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var subunit: Int? = null,
  public var _subunit: Element? = null,
  public var sequence: KotlinString? = null,
  public var _sequence: Element? = null,
  public var length: Int? = null,
  public var _length: Element? = null,
  public var sequenceAttachment: Attachment? = null,
  public var nTerminalModificationId: Identifier? = null,
  public var nTerminalModification: KotlinString? = null,
  public var _nTerminalModification: Element? = null,
  public var cTerminalModificationId: Identifier? = null,
  public var cTerminalModification: KotlinString? = null,
  public var _cTerminalModification: Element? = null,
) {
  public fun toModel(): SubstanceProtein.Subunit =
    SubstanceProtein.Subunit().apply {
      id = this@SubstanceProteinSubunitSurrogate.id
      extension = this@SubstanceProteinSubunitSurrogate.extension
      modifierExtension = this@SubstanceProteinSubunitSurrogate.modifierExtension
      subunit =
        Integer.of(
          this@SubstanceProteinSubunitSurrogate.subunit,
          this@SubstanceProteinSubunitSurrogate._subunit,
        )
      sequence =
        R4String.of(
          this@SubstanceProteinSubunitSurrogate.sequence,
          this@SubstanceProteinSubunitSurrogate._sequence,
        )
      length =
        Integer.of(
          this@SubstanceProteinSubunitSurrogate.length,
          this@SubstanceProteinSubunitSurrogate._length,
        )
      sequenceAttachment = this@SubstanceProteinSubunitSurrogate.sequenceAttachment
      nTerminalModificationId = this@SubstanceProteinSubunitSurrogate.nTerminalModificationId
      nTerminalModification =
        R4String.of(
          this@SubstanceProteinSubunitSurrogate.nTerminalModification,
          this@SubstanceProteinSubunitSurrogate._nTerminalModification,
        )
      cTerminalModificationId = this@SubstanceProteinSubunitSurrogate.cTerminalModificationId
      cTerminalModification =
        R4String.of(
          this@SubstanceProteinSubunitSurrogate.cTerminalModification,
          this@SubstanceProteinSubunitSurrogate._cTerminalModification,
        )
    }

  public companion object {
    public fun fromModel(model: SubstanceProtein.Subunit): SubstanceProteinSubunitSurrogate =
      with(model) {
        SubstanceProteinSubunitSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          subunit = this@with.subunit?.value
          _subunit = this@with.subunit?.toElement()
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          length = this@with.length?.value
          _length = this@with.length?.toElement()
          sequenceAttachment = this@with.sequenceAttachment
          nTerminalModificationId = this@with.nTerminalModificationId
          nTerminalModification = this@with.nTerminalModification?.value
          _nTerminalModification = this@with.nTerminalModification?.toElement()
          cTerminalModificationId = this@with.cTerminalModificationId
          cTerminalModification = this@with.cTerminalModification?.value
          _cTerminalModification = this@with.cTerminalModification?.toElement()
        }
      }
  }
}

@Serializable
internal data class SubstanceProteinSurrogate(
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
  public var sequenceType: CodeableConcept? = null,
  public var numberOfSubunits: Int? = null,
  public var _numberOfSubunits: Element? = null,
  public var disulfideLinkage: List<KotlinString?>? = null,
  public var _disulfideLinkage: List<Element?>? = null,
  public var subunit: List<SubstanceProtein.Subunit>? = null,
) {
  public fun toModel(): SubstanceProtein =
    SubstanceProtein().apply {
      id = this@SubstanceProteinSurrogate.id
      meta = this@SubstanceProteinSurrogate.meta
      implicitRules =
        Uri.of(
          this@SubstanceProteinSurrogate.implicitRules,
          this@SubstanceProteinSurrogate._implicitRules,
        )
      language =
        Code.of(this@SubstanceProteinSurrogate.language, this@SubstanceProteinSurrogate._language)
      text = this@SubstanceProteinSurrogate.text
      contained = this@SubstanceProteinSurrogate.contained
      extension = this@SubstanceProteinSurrogate.extension
      modifierExtension = this@SubstanceProteinSurrogate.modifierExtension
      sequenceType = this@SubstanceProteinSurrogate.sequenceType
      numberOfSubunits =
        Integer.of(
          this@SubstanceProteinSurrogate.numberOfSubunits,
          this@SubstanceProteinSurrogate._numberOfSubunits,
        )
      disulfideLinkage =
        if (
          this@SubstanceProteinSurrogate.disulfideLinkage == null &&
            this@SubstanceProteinSurrogate._disulfideLinkage == null
        ) {
          null
        } else {
          (this@SubstanceProteinSurrogate.disulfideLinkage
              ?: List(this@SubstanceProteinSurrogate._disulfideLinkage!!.size) { null })
            .zip(
              this@SubstanceProteinSurrogate._disulfideLinkage
                ?: List(this@SubstanceProteinSurrogate.disulfideLinkage!!.size) { null }
            )
            .mapNotNull { (value, element) -> R4String.of(value, element) }
        }
      subunit = this@SubstanceProteinSurrogate.subunit
    }

  public companion object {
    public fun fromModel(model: SubstanceProtein): SubstanceProteinSurrogate =
      with(model) {
        SubstanceProteinSurrogate().apply {
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
          sequenceType = this@with.sequenceType
          numberOfSubunits = this@with.numberOfSubunits?.value
          _numberOfSubunits = this@with.numberOfSubunits?.toElement()
          disulfideLinkage =
            this@with.disulfideLinkage?.map { it?.value }?.takeUnless { it.all { it == null } }
          _disulfideLinkage =
            this@with.disulfideLinkage
              ?.map { it?.toElement() }
              ?.takeUnless { it.all { it == null } }
          subunit = this@with.subunit
        }
      }
  }
}
