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
import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.CodeableConcept
import com.google.fhir.model.r4b.Decimal
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Integer
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.MolecularSequence
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Quantity
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Double
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class MolecularSequenceReferenceSeqSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var chromosome: CodeableConcept? = null,
  public var genomeBuild: KotlinString? = null,
  public var _genomeBuild: Element? = null,
  public var orientation: KotlinString? = null,
  public var _orientation: Element? = null,
  public var referenceSeqId: CodeableConcept? = null,
  public var referenceSeqPointer: Reference? = null,
  public var referenceSeqString: KotlinString? = null,
  public var _referenceSeqString: Element? = null,
  public var strand: KotlinString? = null,
  public var _strand: Element? = null,
  public var windowStart: Int? = null,
  public var _windowStart: Element? = null,
  public var windowEnd: Int? = null,
  public var _windowEnd: Element? = null,
) {
  public fun toModel(): MolecularSequence.ReferenceSeq =
    MolecularSequence.ReferenceSeq(
      id = this@MolecularSequenceReferenceSeqSurrogate.id,
      extension = this@MolecularSequenceReferenceSeqSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MolecularSequenceReferenceSeqSurrogate.modifierExtension ?: mutableListOf(),
      chromosome = this@MolecularSequenceReferenceSeqSurrogate.chromosome,
      genomeBuild =
        R4bString.of(
          this@MolecularSequenceReferenceSeqSurrogate.genomeBuild,
          this@MolecularSequenceReferenceSeqSurrogate._genomeBuild,
        ),
      orientation =
        this@MolecularSequenceReferenceSeqSurrogate.orientation?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.MolecularSequence.OrientationType.fromCode(it!!),
            this@MolecularSequenceReferenceSeqSurrogate._orientation,
          )
        },
      referenceSeqId = this@MolecularSequenceReferenceSeqSurrogate.referenceSeqId,
      referenceSeqPointer = this@MolecularSequenceReferenceSeqSurrogate.referenceSeqPointer,
      referenceSeqString =
        R4bString.of(
          this@MolecularSequenceReferenceSeqSurrogate.referenceSeqString,
          this@MolecularSequenceReferenceSeqSurrogate._referenceSeqString,
        ),
      strand =
        this@MolecularSequenceReferenceSeqSurrogate.strand?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.MolecularSequence.StrandType.fromCode(it!!),
            this@MolecularSequenceReferenceSeqSurrogate._strand,
          )
        },
      windowStart =
        Integer.of(
          this@MolecularSequenceReferenceSeqSurrogate.windowStart,
          this@MolecularSequenceReferenceSeqSurrogate._windowStart,
        ),
      windowEnd =
        Integer.of(
          this@MolecularSequenceReferenceSeqSurrogate.windowEnd,
          this@MolecularSequenceReferenceSeqSurrogate._windowEnd,
        ),
    )

  public companion object {
    public fun fromModel(
      model: MolecularSequence.ReferenceSeq
    ): MolecularSequenceReferenceSeqSurrogate =
      with(model) {
        MolecularSequenceReferenceSeqSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          chromosome = this@with.chromosome,
          genomeBuild = this@with.genomeBuild?.value,
          _genomeBuild = this@with.genomeBuild?.toElement(),
          orientation = this@with.orientation?.value?.getCode(),
          _orientation = this@with.orientation?.toElement(),
          referenceSeqId = this@with.referenceSeqId,
          referenceSeqPointer = this@with.referenceSeqPointer,
          referenceSeqString = this@with.referenceSeqString?.value,
          _referenceSeqString = this@with.referenceSeqString?.toElement(),
          strand = this@with.strand?.value?.getCode(),
          _strand = this@with.strand?.toElement(),
          windowStart = this@with.windowStart?.value,
          _windowStart = this@with.windowStart?.toElement(),
          windowEnd = this@with.windowEnd?.value,
          _windowEnd = this@with.windowEnd?.toElement(),
        )
      }
  }
}

@Serializable
internal data class MolecularSequenceVariantSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var start: Int? = null,
  public var _start: Element? = null,
  public var end: Int? = null,
  public var _end: Element? = null,
  public var observedAllele: KotlinString? = null,
  public var _observedAllele: Element? = null,
  public var referenceAllele: KotlinString? = null,
  public var _referenceAllele: Element? = null,
  public var cigar: KotlinString? = null,
  public var _cigar: Element? = null,
  public var variantPointer: Reference? = null,
) {
  public fun toModel(): MolecularSequence.Variant =
    MolecularSequence.Variant(
      id = this@MolecularSequenceVariantSurrogate.id,
      extension = this@MolecularSequenceVariantSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MolecularSequenceVariantSurrogate.modifierExtension ?: mutableListOf(),
      start =
        Integer.of(
          this@MolecularSequenceVariantSurrogate.start,
          this@MolecularSequenceVariantSurrogate._start,
        ),
      end =
        Integer.of(
          this@MolecularSequenceVariantSurrogate.end,
          this@MolecularSequenceVariantSurrogate._end,
        ),
      observedAllele =
        R4bString.of(
          this@MolecularSequenceVariantSurrogate.observedAllele,
          this@MolecularSequenceVariantSurrogate._observedAllele,
        ),
      referenceAllele =
        R4bString.of(
          this@MolecularSequenceVariantSurrogate.referenceAllele,
          this@MolecularSequenceVariantSurrogate._referenceAllele,
        ),
      cigar =
        R4bString.of(
          this@MolecularSequenceVariantSurrogate.cigar,
          this@MolecularSequenceVariantSurrogate._cigar,
        ),
      variantPointer = this@MolecularSequenceVariantSurrogate.variantPointer,
    )

  public companion object {
    public fun fromModel(model: MolecularSequence.Variant): MolecularSequenceVariantSurrogate =
      with(model) {
        MolecularSequenceVariantSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          start = this@with.start?.value,
          _start = this@with.start?.toElement(),
          end = this@with.end?.value,
          _end = this@with.end?.toElement(),
          observedAllele = this@with.observedAllele?.value,
          _observedAllele = this@with.observedAllele?.toElement(),
          referenceAllele = this@with.referenceAllele?.value,
          _referenceAllele = this@with.referenceAllele?.toElement(),
          cigar = this@with.cigar?.value,
          _cigar = this@with.cigar?.toElement(),
          variantPointer = this@with.variantPointer,
        )
      }
  }
}

@Serializable
internal data class MolecularSequenceQualityRocSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var score: MutableList<Int?>? = null,
  public var _score: MutableList<Element?>? = null,
  public var numTP: MutableList<Int?>? = null,
  public var _numTP: MutableList<Element?>? = null,
  public var numFP: MutableList<Int?>? = null,
  public var _numFP: MutableList<Element?>? = null,
  public var numFN: MutableList<Int?>? = null,
  public var _numFN: MutableList<Element?>? = null,
  public var precision: MutableList<Double?>? = null,
  public var _precision: MutableList<Element?>? = null,
  public var sensitivity: MutableList<Double?>? = null,
  public var _sensitivity: MutableList<Element?>? = null,
  public var fMeasure: MutableList<Double?>? = null,
  public var _fMeasure: MutableList<Element?>? = null,
) {
  public fun toModel(): MolecularSequence.Quality.Roc =
    MolecularSequence.Quality.Roc(
      id = this@MolecularSequenceQualityRocSurrogate.id,
      extension = this@MolecularSequenceQualityRocSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MolecularSequenceQualityRocSurrogate.modifierExtension ?: mutableListOf(),
      score =
        if (
          this@MolecularSequenceQualityRocSurrogate.score == null &&
            this@MolecularSequenceQualityRocSurrogate._score == null
        ) {
          mutableListOf()
        } else {
          (this@MolecularSequenceQualityRocSurrogate.score
              ?: List(this@MolecularSequenceQualityRocSurrogate._score!!.size) { null })
            .zip(
              this@MolecularSequenceQualityRocSurrogate._score
                ?: List(this@MolecularSequenceQualityRocSurrogate.score!!.size) { null }
            )
            .map { (value, element) -> Integer.of(value, element)!! }
            .toMutableList()
        },
      numTP =
        if (
          this@MolecularSequenceQualityRocSurrogate.numTP == null &&
            this@MolecularSequenceQualityRocSurrogate._numTP == null
        ) {
          mutableListOf()
        } else {
          (this@MolecularSequenceQualityRocSurrogate.numTP
              ?: List(this@MolecularSequenceQualityRocSurrogate._numTP!!.size) { null })
            .zip(
              this@MolecularSequenceQualityRocSurrogate._numTP
                ?: List(this@MolecularSequenceQualityRocSurrogate.numTP!!.size) { null }
            )
            .map { (value, element) -> Integer.of(value, element)!! }
            .toMutableList()
        },
      numFP =
        if (
          this@MolecularSequenceQualityRocSurrogate.numFP == null &&
            this@MolecularSequenceQualityRocSurrogate._numFP == null
        ) {
          mutableListOf()
        } else {
          (this@MolecularSequenceQualityRocSurrogate.numFP
              ?: List(this@MolecularSequenceQualityRocSurrogate._numFP!!.size) { null })
            .zip(
              this@MolecularSequenceQualityRocSurrogate._numFP
                ?: List(this@MolecularSequenceQualityRocSurrogate.numFP!!.size) { null }
            )
            .map { (value, element) -> Integer.of(value, element)!! }
            .toMutableList()
        },
      numFN =
        if (
          this@MolecularSequenceQualityRocSurrogate.numFN == null &&
            this@MolecularSequenceQualityRocSurrogate._numFN == null
        ) {
          mutableListOf()
        } else {
          (this@MolecularSequenceQualityRocSurrogate.numFN
              ?: List(this@MolecularSequenceQualityRocSurrogate._numFN!!.size) { null })
            .zip(
              this@MolecularSequenceQualityRocSurrogate._numFN
                ?: List(this@MolecularSequenceQualityRocSurrogate.numFN!!.size) { null }
            )
            .map { (value, element) -> Integer.of(value, element)!! }
            .toMutableList()
        },
      precision =
        if (
          this@MolecularSequenceQualityRocSurrogate.precision == null &&
            this@MolecularSequenceQualityRocSurrogate._precision == null
        ) {
          mutableListOf()
        } else {
          (this@MolecularSequenceQualityRocSurrogate.precision
              ?: List(this@MolecularSequenceQualityRocSurrogate._precision!!.size) { null })
            .zip(
              this@MolecularSequenceQualityRocSurrogate._precision
                ?: List(this@MolecularSequenceQualityRocSurrogate.precision!!.size) { null }
            )
            .map { (value, element) -> Decimal.of(value, element)!! }
            .toMutableList()
        },
      sensitivity =
        if (
          this@MolecularSequenceQualityRocSurrogate.sensitivity == null &&
            this@MolecularSequenceQualityRocSurrogate._sensitivity == null
        ) {
          mutableListOf()
        } else {
          (this@MolecularSequenceQualityRocSurrogate.sensitivity
              ?: List(this@MolecularSequenceQualityRocSurrogate._sensitivity!!.size) { null })
            .zip(
              this@MolecularSequenceQualityRocSurrogate._sensitivity
                ?: List(this@MolecularSequenceQualityRocSurrogate.sensitivity!!.size) { null }
            )
            .map { (value, element) -> Decimal.of(value, element)!! }
            .toMutableList()
        },
      fMeasure =
        if (
          this@MolecularSequenceQualityRocSurrogate.fMeasure == null &&
            this@MolecularSequenceQualityRocSurrogate._fMeasure == null
        ) {
          mutableListOf()
        } else {
          (this@MolecularSequenceQualityRocSurrogate.fMeasure
              ?: List(this@MolecularSequenceQualityRocSurrogate._fMeasure!!.size) { null })
            .zip(
              this@MolecularSequenceQualityRocSurrogate._fMeasure
                ?: List(this@MolecularSequenceQualityRocSurrogate.fMeasure!!.size) { null }
            )
            .map { (value, element) -> Decimal.of(value, element)!! }
            .toMutableList()
        },
    )

  public companion object {
    public fun fromModel(
      model: MolecularSequence.Quality.Roc
    ): MolecularSequenceQualityRocSurrogate =
      with(model) {
        MolecularSequenceQualityRocSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          score =
            this@with.score.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _score =
            this@with.score
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          numTP =
            this@with.numTP.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _numTP =
            this@with.numTP
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          numFP =
            this@with.numFP.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _numFP =
            this@with.numFP
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          numFN =
            this@with.numFN.map { it.value }.toMutableList().takeUnless { it.all { it == null } },
          _numFN =
            this@with.numFN
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          precision =
            this@with.precision
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _precision =
            this@with.precision
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          sensitivity =
            this@with.sensitivity
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _sensitivity =
            this@with.sensitivity
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
          fMeasure =
            this@with.fMeasure
              .map { it.value }
              .toMutableList()
              .takeUnless { it.all { it == null } },
          _fMeasure =
            this@with.fMeasure
              .map { it.toElement() }
              .takeUnless { it.all { it == null } }
              ?.map { it ?: Element() }
              ?.toMutableList(),
        )
      }
  }
}

@Serializable
internal data class MolecularSequenceQualitySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var standardSequence: CodeableConcept? = null,
  public var start: Int? = null,
  public var _start: Element? = null,
  public var end: Int? = null,
  public var _end: Element? = null,
  public var score: Quantity? = null,
  public var method: CodeableConcept? = null,
  public var truthTP: Double? = null,
  public var _truthTP: Element? = null,
  public var queryTP: Double? = null,
  public var _queryTP: Element? = null,
  public var truthFN: Double? = null,
  public var _truthFN: Element? = null,
  public var queryFP: Double? = null,
  public var _queryFP: Element? = null,
  public var gtFP: Double? = null,
  public var _gtFP: Element? = null,
  public var precision: Double? = null,
  public var _precision: Element? = null,
  public var recall: Double? = null,
  public var _recall: Element? = null,
  public var fScore: Double? = null,
  public var _fScore: Element? = null,
  public var roc: MolecularSequence.Quality.Roc? = null,
) {
  public fun toModel(): MolecularSequence.Quality =
    MolecularSequence.Quality(
      id = this@MolecularSequenceQualitySurrogate.id,
      extension = this@MolecularSequenceQualitySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MolecularSequenceQualitySurrogate.modifierExtension ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r4b.MolecularSequence.QualityType.fromCode(
            this@MolecularSequenceQualitySurrogate.type!!
          ),
          this@MolecularSequenceQualitySurrogate._type,
        ),
      standardSequence = this@MolecularSequenceQualitySurrogate.standardSequence,
      start =
        Integer.of(
          this@MolecularSequenceQualitySurrogate.start,
          this@MolecularSequenceQualitySurrogate._start,
        ),
      end =
        Integer.of(
          this@MolecularSequenceQualitySurrogate.end,
          this@MolecularSequenceQualitySurrogate._end,
        ),
      score = this@MolecularSequenceQualitySurrogate.score,
      method = this@MolecularSequenceQualitySurrogate.method,
      truthTP =
        Decimal.of(
          this@MolecularSequenceQualitySurrogate.truthTP,
          this@MolecularSequenceQualitySurrogate._truthTP,
        ),
      queryTP =
        Decimal.of(
          this@MolecularSequenceQualitySurrogate.queryTP,
          this@MolecularSequenceQualitySurrogate._queryTP,
        ),
      truthFN =
        Decimal.of(
          this@MolecularSequenceQualitySurrogate.truthFN,
          this@MolecularSequenceQualitySurrogate._truthFN,
        ),
      queryFP =
        Decimal.of(
          this@MolecularSequenceQualitySurrogate.queryFP,
          this@MolecularSequenceQualitySurrogate._queryFP,
        ),
      gtFP =
        Decimal.of(
          this@MolecularSequenceQualitySurrogate.gtFP,
          this@MolecularSequenceQualitySurrogate._gtFP,
        ),
      precision =
        Decimal.of(
          this@MolecularSequenceQualitySurrogate.precision,
          this@MolecularSequenceQualitySurrogate._precision,
        ),
      recall =
        Decimal.of(
          this@MolecularSequenceQualitySurrogate.recall,
          this@MolecularSequenceQualitySurrogate._recall,
        ),
      fScore =
        Decimal.of(
          this@MolecularSequenceQualitySurrogate.fScore,
          this@MolecularSequenceQualitySurrogate._fScore,
        ),
      roc = this@MolecularSequenceQualitySurrogate.roc,
    )

  public companion object {
    public fun fromModel(model: MolecularSequence.Quality): MolecularSequenceQualitySurrogate =
      with(model) {
        MolecularSequenceQualitySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          standardSequence = this@with.standardSequence,
          start = this@with.start?.value,
          _start = this@with.start?.toElement(),
          end = this@with.end?.value,
          _end = this@with.end?.toElement(),
          score = this@with.score,
          method = this@with.method,
          truthTP = this@with.truthTP?.value,
          _truthTP = this@with.truthTP?.toElement(),
          queryTP = this@with.queryTP?.value,
          _queryTP = this@with.queryTP?.toElement(),
          truthFN = this@with.truthFN?.value,
          _truthFN = this@with.truthFN?.toElement(),
          queryFP = this@with.queryFP?.value,
          _queryFP = this@with.queryFP?.toElement(),
          gtFP = this@with.gtFP?.value,
          _gtFP = this@with.gtFP?.toElement(),
          precision = this@with.precision?.value,
          _precision = this@with.precision?.toElement(),
          recall = this@with.recall?.value,
          _recall = this@with.recall?.toElement(),
          fScore = this@with.fScore?.value,
          _fScore = this@with.fScore?.toElement(),
          roc = this@with.roc,
        )
      }
  }
}

@Serializable
internal data class MolecularSequenceRepositorySurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var datasetId: KotlinString? = null,
  public var _datasetId: Element? = null,
  public var variantsetId: KotlinString? = null,
  public var _variantsetId: Element? = null,
  public var readsetId: KotlinString? = null,
  public var _readsetId: Element? = null,
) {
  public fun toModel(): MolecularSequence.Repository =
    MolecularSequence.Repository(
      id = this@MolecularSequenceRepositorySurrogate.id,
      extension = this@MolecularSequenceRepositorySurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MolecularSequenceRepositorySurrogate.modifierExtension ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r4b.MolecularSequence.RepositoryType.fromCode(
            this@MolecularSequenceRepositorySurrogate.type!!
          ),
          this@MolecularSequenceRepositorySurrogate._type,
        ),
      url =
        Uri.of(
          this@MolecularSequenceRepositorySurrogate.url,
          this@MolecularSequenceRepositorySurrogate._url,
        ),
      name =
        R4bString.of(
          this@MolecularSequenceRepositorySurrogate.name,
          this@MolecularSequenceRepositorySurrogate._name,
        ),
      datasetId =
        R4bString.of(
          this@MolecularSequenceRepositorySurrogate.datasetId,
          this@MolecularSequenceRepositorySurrogate._datasetId,
        ),
      variantsetId =
        R4bString.of(
          this@MolecularSequenceRepositorySurrogate.variantsetId,
          this@MolecularSequenceRepositorySurrogate._variantsetId,
        ),
      readsetId =
        R4bString.of(
          this@MolecularSequenceRepositorySurrogate.readsetId,
          this@MolecularSequenceRepositorySurrogate._readsetId,
        ),
    )

  public companion object {
    public fun fromModel(
      model: MolecularSequence.Repository
    ): MolecularSequenceRepositorySurrogate =
      with(model) {
        MolecularSequenceRepositorySurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          url = this@with.url?.value,
          _url = this@with.url?.toElement(),
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          datasetId = this@with.datasetId?.value,
          _datasetId = this@with.datasetId?.toElement(),
          variantsetId = this@with.variantsetId?.value,
          _variantsetId = this@with.variantsetId?.toElement(),
          readsetId = this@with.readsetId?.value,
          _readsetId = this@with.readsetId?.toElement(),
        )
      }
  }
}

@Serializable
internal data class MolecularSequenceStructureVariantOuterSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var start: Int? = null,
  public var _start: Element? = null,
  public var end: Int? = null,
  public var _end: Element? = null,
) {
  public fun toModel(): MolecularSequence.StructureVariant.Outer =
    MolecularSequence.StructureVariant.Outer(
      id = this@MolecularSequenceStructureVariantOuterSurrogate.id,
      extension = this@MolecularSequenceStructureVariantOuterSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MolecularSequenceStructureVariantOuterSurrogate.modifierExtension ?: mutableListOf(),
      start =
        Integer.of(
          this@MolecularSequenceStructureVariantOuterSurrogate.start,
          this@MolecularSequenceStructureVariantOuterSurrogate._start,
        ),
      end =
        Integer.of(
          this@MolecularSequenceStructureVariantOuterSurrogate.end,
          this@MolecularSequenceStructureVariantOuterSurrogate._end,
        ),
    )

  public companion object {
    public fun fromModel(
      model: MolecularSequence.StructureVariant.Outer
    ): MolecularSequenceStructureVariantOuterSurrogate =
      with(model) {
        MolecularSequenceStructureVariantOuterSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          start = this@with.start?.value,
          _start = this@with.start?.toElement(),
          end = this@with.end?.value,
          _end = this@with.end?.toElement(),
        )
      }
  }
}

@Serializable
internal data class MolecularSequenceStructureVariantInnerSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var start: Int? = null,
  public var _start: Element? = null,
  public var end: Int? = null,
  public var _end: Element? = null,
) {
  public fun toModel(): MolecularSequence.StructureVariant.Inner =
    MolecularSequence.StructureVariant.Inner(
      id = this@MolecularSequenceStructureVariantInnerSurrogate.id,
      extension = this@MolecularSequenceStructureVariantInnerSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MolecularSequenceStructureVariantInnerSurrogate.modifierExtension ?: mutableListOf(),
      start =
        Integer.of(
          this@MolecularSequenceStructureVariantInnerSurrogate.start,
          this@MolecularSequenceStructureVariantInnerSurrogate._start,
        ),
      end =
        Integer.of(
          this@MolecularSequenceStructureVariantInnerSurrogate.end,
          this@MolecularSequenceStructureVariantInnerSurrogate._end,
        ),
    )

  public companion object {
    public fun fromModel(
      model: MolecularSequence.StructureVariant.Inner
    ): MolecularSequenceStructureVariantInnerSurrogate =
      with(model) {
        MolecularSequenceStructureVariantInnerSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          start = this@with.start?.value,
          _start = this@with.start?.toElement(),
          end = this@with.end?.value,
          _end = this@with.end?.toElement(),
        )
      }
  }
}

@Serializable
internal data class MolecularSequenceStructureVariantSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var variantType: CodeableConcept? = null,
  public var exact: KotlinBoolean? = null,
  public var _exact: Element? = null,
  public var length: Int? = null,
  public var _length: Element? = null,
  public var outer: MolecularSequence.StructureVariant.Outer? = null,
  public var `inner`: MolecularSequence.StructureVariant.Inner? = null,
) {
  public fun toModel(): MolecularSequence.StructureVariant =
    MolecularSequence.StructureVariant(
      id = this@MolecularSequenceStructureVariantSurrogate.id,
      extension = this@MolecularSequenceStructureVariantSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@MolecularSequenceStructureVariantSurrogate.modifierExtension ?: mutableListOf(),
      variantType = this@MolecularSequenceStructureVariantSurrogate.variantType,
      exact =
        R4bBoolean.of(
          this@MolecularSequenceStructureVariantSurrogate.exact,
          this@MolecularSequenceStructureVariantSurrogate._exact,
        ),
      length =
        Integer.of(
          this@MolecularSequenceStructureVariantSurrogate.length,
          this@MolecularSequenceStructureVariantSurrogate._length,
        ),
      outer = this@MolecularSequenceStructureVariantSurrogate.outer,
      `inner` = this@MolecularSequenceStructureVariantSurrogate.`inner`,
    )

  public companion object {
    public fun fromModel(
      model: MolecularSequence.StructureVariant
    ): MolecularSequenceStructureVariantSurrogate =
      with(model) {
        MolecularSequenceStructureVariantSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          variantType = this@with.variantType,
          exact = this@with.exact?.value,
          _exact = this@with.exact?.toElement(),
          length = this@with.length?.value,
          _length = this@with.length?.toElement(),
          outer = this@with.outer,
          `inner` = this@with.`inner`,
        )
      }
  }
}

@Serializable
internal data class MolecularSequenceSurrogate(
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
  public var identifier: MutableList<Identifier>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var coordinateSystem: Int? = null,
  public var _coordinateSystem: Element? = null,
  public var patient: Reference? = null,
  public var specimen: Reference? = null,
  public var device: Reference? = null,
  public var performer: Reference? = null,
  public var quantity: Quantity? = null,
  public var referenceSeq: MolecularSequence.ReferenceSeq? = null,
  public var variant: MutableList<MolecularSequence.Variant>? = null,
  public var observedSeq: KotlinString? = null,
  public var _observedSeq: Element? = null,
  public var quality: MutableList<MolecularSequence.Quality>? = null,
  public var readCoverage: Int? = null,
  public var _readCoverage: Element? = null,
  public var repository: MutableList<MolecularSequence.Repository>? = null,
  public var pointer: MutableList<Reference>? = null,
  public var structureVariant: MutableList<MolecularSequence.StructureVariant>? = null,
) {
  public fun toModel(): MolecularSequence =
    MolecularSequence(
      id = this@MolecularSequenceSurrogate.id,
      meta = this@MolecularSequenceSurrogate.meta,
      implicitRules =
        Uri.of(
          this@MolecularSequenceSurrogate.implicitRules,
          this@MolecularSequenceSurrogate._implicitRules,
        ),
      language =
        Code.of(
          this@MolecularSequenceSurrogate.language,
          this@MolecularSequenceSurrogate._language,
        ),
      text = this@MolecularSequenceSurrogate.text,
      contained = this@MolecularSequenceSurrogate.contained ?: mutableListOf(),
      extension = this@MolecularSequenceSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@MolecularSequenceSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@MolecularSequenceSurrogate.identifier ?: mutableListOf(),
      type =
        this@MolecularSequenceSurrogate.type?.let {
          Enumeration.of(
            com.google.fhir.model.r4b.MolecularSequence.SequenceType.fromCode(it!!),
            this@MolecularSequenceSurrogate._type,
          )
        },
      coordinateSystem =
        Integer.of(
          this@MolecularSequenceSurrogate.coordinateSystem,
          this@MolecularSequenceSurrogate._coordinateSystem,
        )!!,
      patient = this@MolecularSequenceSurrogate.patient,
      specimen = this@MolecularSequenceSurrogate.specimen,
      device = this@MolecularSequenceSurrogate.device,
      performer = this@MolecularSequenceSurrogate.performer,
      quantity = this@MolecularSequenceSurrogate.quantity,
      referenceSeq = this@MolecularSequenceSurrogate.referenceSeq,
      variant = this@MolecularSequenceSurrogate.variant ?: mutableListOf(),
      observedSeq =
        R4bString.of(
          this@MolecularSequenceSurrogate.observedSeq,
          this@MolecularSequenceSurrogate._observedSeq,
        ),
      quality = this@MolecularSequenceSurrogate.quality ?: mutableListOf(),
      readCoverage =
        Integer.of(
          this@MolecularSequenceSurrogate.readCoverage,
          this@MolecularSequenceSurrogate._readCoverage,
        ),
      repository = this@MolecularSequenceSurrogate.repository ?: mutableListOf(),
      pointer = this@MolecularSequenceSurrogate.pointer ?: mutableListOf(),
      structureVariant = this@MolecularSequenceSurrogate.structureVariant ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: MolecularSequence): MolecularSequenceSurrogate =
      with(model) {
        MolecularSequenceSurrogate(
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
          type = this@with.type?.value?.getCode(),
          _type = this@with.type?.toElement(),
          coordinateSystem = this@with.coordinateSystem.value,
          _coordinateSystem = this@with.coordinateSystem.toElement(),
          patient = this@with.patient,
          specimen = this@with.specimen,
          device = this@with.device,
          performer = this@with.performer,
          quantity = this@with.quantity,
          referenceSeq = this@with.referenceSeq,
          variant = this@with.variant.takeUnless { it.all { it == null } },
          observedSeq = this@with.observedSeq?.value,
          _observedSeq = this@with.observedSeq?.toElement(),
          quality = this@with.quality.takeUnless { it.all { it == null } },
          readCoverage = this@with.readCoverage?.value,
          _readCoverage = this@with.readCoverage?.toElement(),
          repository = this@with.repository.takeUnless { it.all { it == null } },
          pointer = this@with.pointer.takeUnless { it.all { it == null } },
          structureVariant = this@with.structureVariant.takeUnless { it.all { it == null } },
        )
      }
  }
}
