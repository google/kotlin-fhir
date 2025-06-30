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

@file:Suppress("RedundantVisibilityModifier", "PropertyName")

package com.google.fhir.model.r4b

import com.google.fhir.model.r4b.serializers.SpecimenCollectionCollectedSerializer
import com.google.fhir.model.r4b.serializers.SpecimenCollectionFastingStatusSerializer
import com.google.fhir.model.r4b.serializers.SpecimenCollectionSerializer
import com.google.fhir.model.r4b.serializers.SpecimenContainerAdditiveSerializer
import com.google.fhir.model.r4b.serializers.SpecimenContainerSerializer
import com.google.fhir.model.r4b.serializers.SpecimenProcessingSerializer
import com.google.fhir.model.r4b.serializers.SpecimenProcessingTimeSerializer
import com.google.fhir.model.r4b.serializers.SpecimenSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** A sample to be used for analysis. */
@Serializable(with = SpecimenSerializer::class)
@SerialName("Specimen")
public data class Specimen(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * The only time that a resource does not have an id is when it is being submitted to the server
   * using a create operation.
   */
  override var id: kotlin.String? = null,
  /**
   * The metadata about the resource. This is content that is maintained by the infrastructure.
   * Changes to the content might not always be associated with version changes to the resource.
   */
  override var meta: Meta? = null,
  /**
   * A reference to a set of rules that were followed when the resource was constructed, and which
   * must be understood when processing the content. Often, this is a reference to an implementation
   * guide that defines the special rules along with other profiles etc.
   *
   * Asserting this rule set restricts the content to be only understood by a limited set of trading
   * partners. This inherently limits the usefulness of the data in the long term. However, the
   * existing health eco-system is highly fractured, and not yet ready to define, collect, and
   * exchange data in a generally computable sense. Wherever possible, implementers and/or
   * specification writers should avoid using this element. Often, when used, the URL is a reference
   * to an implementation guide that defines these special rules as part of it's narrative along
   * with other profiles, value sets, etc.
   */
  override var implicitRules: Uri? = null,
  /**
   * The base language in which the resource is written.
   *
   * Language is provided to support indexing and accessibility (typically, services such as text to
   * speech use the language tag). The html language tag in the narrative applies to the narrative.
   * The language tag on the resource may be used to specify the language of other presentations
   * generated from the data in the resource. Not all the content has to be in the base language.
   * The Resource.language should not be assumed to apply to the narrative automatically. If a
   * language is specified, it should it also be specified on the div element in the html (see rules
   * in HTML5 for information about the relationship between xml:lang and the html lang attribute).
   */
  override var language: Code? = null,
  /**
   * A human-readable narrative that contains a summary of the resource and can be used to represent
   * the content of the resource to a human. The narrative need not encode all the structured data,
   * but is required to contain sufficient detail to make it "clinically safe" for a human to just
   * read the narrative. Resource definitions may define what content should be represented in the
   * narrative to ensure clinical safety.
   *
   * Contained resources do not have narrative. Resources that are not contained SHOULD have a
   * narrative. In some cases, a resource may only have text with little or no additional discrete
   * data (as long as all minOccurs=1 elements are satisfied). This may be necessary for data from
   * legacy systems where information is captured as a "text blob" or where text is additionally
   * entered raw or narrated and encoded information is added later.
   */
  override var text: Narrative? = null,
  /**
   * These resources do not have an independent existence apart from the resource that contains
   * them - they cannot be identified independently, and nor can they have their own independent
   * transaction scope.
   *
   * This should never be done when the content can be identified properly, as once identification
   * is lost, it is extremely difficult (and context dependent) to restore it again. Contained
   * resources may have profiles and tags In their meta elements, but SHALL NOT have security
   * labels.
   */
  override var contained: List<Resource?>? = null,
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * resource. To make the use of extensions safe and manageable, there is a strict set of
   * governance applied to the definition and use of extensions. Though any implementer can define
   * an extension, there is a set of requirements that SHALL be met as part of the definition of the
   * extension.
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override var extension: List<Extension?>? = null,
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * resource and that modifies the understanding of the element that contains it and/or the
   * understanding of the containing element's descendants. Usually modifier elements provide
   * negation or qualification. To make the use of extensions safe and manageable, there is a strict
   * set of governance applied to the definition and use of extensions. Though any implementer is
   * allowed to define an extension, there is a set of requirements that SHALL be met as part of the
   * definition of the extension. Applications processing a resource are required to check for
   * modifier extensions.
   *
   * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource
   * (including cannot change the meaning of modifierExtension itself).
   *
   * There can be no stigma associated with the use of extensions by any application, project, or
   * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
   * The use of extensions is what allows the FHIR specification to retain a core level of
   * simplicity for everyone.
   */
  override var modifierExtension: List<Extension?>? = null,
  /** Id for specimen. */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the
   * same as the specimen identifier, depending on local lab procedures.
   */
  public var accessionIdentifier: Identifier? = null,
  /**
   * The availability of the specimen.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<SpecimenStatus>? = null,
  /**
   * The kind of material that forms the specimen.
   *
   * The type can change the way that a specimen is handled and drives what kind of analyses can
   * properly be performed on the specimen. It is frequently used in diagnostic work flow decision
   * making systems.
   */
  public var type: CodeableConcept? = null,
  /**
   * Where the specimen came from. This may be from patient(s), from a location (e.g., the source of
   * an environmental sample), or a sampling of a substance or a device.
   */
  public var subject: Reference? = null,
  /** Time when specimen was received for processing or testing. */
  public var receivedTime: DateTime? = null,
  /**
   * Reference to the parent (source) specimen which is used when the specimen was either derived
   * from or a component of another specimen.
   *
   * The parent specimen could be the source from which the current specimen is derived by some
   * processing step (e.g. an aliquot or isolate or extracted nucleic acids from clinical samples)
   * or one of many specimens that were combined to create a pooled sample.
   */
  public var parent: List<Reference?>? = null,
  /**
   * Details concerning a service request that required a specimen to be collected.
   *
   * The request may be explicit or implied such with a ServiceRequest that requires a blood draw.
   */
  public var request: List<Reference?>? = null,
  /** Details concerning the specimen collection. */
  public var collection: Collection? = null,
  /** Details concerning processing and processing steps for the specimen. */
  public var processing: List<Processing>? = null,
  /**
   * The container holding the specimen. The recursive nature of containers; i.e. blood in tube in
   * tray in rack is not addressed here.
   */
  public var container: List<Container>? = null,
  /**
   * A mode or state of being that describes the nature of the specimen.
   *
   * Specimen condition is an observation made about the specimen. It's a point-in-time assessment.
   * It can be used to assess its quality or appropriateness for a specific test.
   */
  public var condition: List<CodeableConcept?>? = null,
  /**
   * To communicate any details or issues about the specimen or during the specimen collection. (for
   * example: broken vial, sent with patient, frozen).
   */
  public var note: List<Annotation?>? = null,
) : DomainResource() {
  /** Details concerning the specimen collection. */
  @Serializable(with = SpecimenCollectionSerializer::class)
  public class Collection(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and manageable, there is a strict set of
     * governance applied to the definition and use of extensions. Though any implementer can define
     * an extension, there is a set of requirements that SHALL be met as part of the definition of
     * the extension.
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var extension: List<Extension?>? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element and that modifies the understanding of the element in which it is contained
     * and/or the understanding of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe and manageable, there
     * is a strict set of governance applied to the definition and use of extensions. Though any
     * implementer can define an extension, there is a set of requirements that SHALL be met as part
     * of the definition of the extension. Applications processing a resource are required to check
     * for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     * DomainResource (including cannot change the meaning of modifierExtension itself).
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var modifierExtension: List<Extension?>? = null,
    /** Person who collected the specimen. */
    public var collector: Reference? = null,
    /** Time when specimen was collected from subject - the physiologically relevant time. */
    public var collected: Collected? = null,
    /** The span of time over which the collection of a specimen occurred. */
    public var duration: Duration? = null,
    /**
     * The quantity of specimen collected; for instance the volume of a blood sample, or the
     * physical measurement of an anatomic pathology sample.
     */
    public var quantity: Quantity? = null,
    /** A coded value specifying the technique that is used to perform the procedure. */
    public var method: CodeableConcept? = null,
    /**
     * Anatomical location from which the specimen was collected (if subject is a patient). This is
     * the target site. This element is not used for environmental specimens.
     *
     * If the use case requires BodySite to be handled as a separate resource instead of an inline
     * coded element (e.g. to identify and track separately) then use the standard extension
     * [bodySite](extension-bodysite.html).
     */
    public var bodySite: CodeableConcept? = null,
    /**
     * Abstinence or reduction from some or all food, drink, or both, for a period of time prior to
     * sample collection.
     *
     * Representing fasting status using this element is preferred to representing it with an
     * observation using a 'pre-coordinated code' such as LOINC 2005-7 (Calcium [Moles/​time] in 2
     * hour Urine --12 hours fasting), or using a component observation ` such as
     * `Observation.component code` = LOINC 49541-6 (Fasting status - Reported).
     */
    public var fastingStatus: FastingStatus? = null,
  ) : BackboneElement() {
    @Serializable(with = SpecimenCollectionCollectedSerializer::class)
    public sealed interface Collected {
      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asPeriod(): Period? = this as? Period

      public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) :
        Collected

      public data class Period(public val `value`: com.google.fhir.model.r4b.Period) : Collected

      public data object Null : Collected

      public companion object {
        public fun from(
          dateTimeValue: com.google.fhir.model.r4b.DateTime?,
          PeriodValue: com.google.fhir.model.r4b.Period?,
        ): Collected {
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (PeriodValue != null) return Period(PeriodValue)
          return Null
        }
      }
    }

    @Serializable(with = SpecimenCollectionFastingStatusSerializer::class)
    public sealed interface FastingStatus {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asDuration(): Duration? = this as? Duration

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4b.CodeableConcept
      ) : FastingStatus

      public data class Duration(public val `value`: com.google.fhir.model.r4b.Duration) :
        FastingStatus

      public data object Null : FastingStatus

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
          DurationValue: com.google.fhir.model.r4b.Duration?,
        ): FastingStatus {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (DurationValue != null) return Duration(DurationValue)
          return Null
        }
      }
    }
  }

  /** Details concerning processing and processing steps for the specimen. */
  @Serializable(with = SpecimenProcessingSerializer::class)
  public class Processing(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and manageable, there is a strict set of
     * governance applied to the definition and use of extensions. Though any implementer can define
     * an extension, there is a set of requirements that SHALL be met as part of the definition of
     * the extension.
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var extension: List<Extension?>? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element and that modifies the understanding of the element in which it is contained
     * and/or the understanding of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe and manageable, there
     * is a strict set of governance applied to the definition and use of extensions. Though any
     * implementer can define an extension, there is a set of requirements that SHALL be met as part
     * of the definition of the extension. Applications processing a resource are required to check
     * for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     * DomainResource (including cannot change the meaning of modifierExtension itself).
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var modifierExtension: List<Extension?>? = null,
    /** Textual description of procedure. */
    public var description: String? = null,
    /** A coded value specifying the procedure used to process the specimen. */
    public var procedure: CodeableConcept? = null,
    /** Material used in the processing step. */
    public var additive: List<Reference?>? = null,
    /**
     * A record of the time or period when the specimen processing occurred. For example the time of
     * sample fixation or the period of time the sample was in formalin.
     */
    public var time: Time? = null,
  ) : BackboneElement() {
    @Serializable(with = SpecimenProcessingTimeSerializer::class)
    public sealed interface Time {
      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asPeriod(): Period? = this as? Period

      public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) : Time

      public data class Period(public val `value`: com.google.fhir.model.r4b.Period) : Time

      public data object Null : Time

      public companion object {
        public fun from(
          dateTimeValue: com.google.fhir.model.r4b.DateTime?,
          PeriodValue: com.google.fhir.model.r4b.Period?,
        ): Time {
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (PeriodValue != null) return Period(PeriodValue)
          return Null
        }
      }
    }
  }

  /**
   * The container holding the specimen. The recursive nature of containers; i.e. blood in tube in
   * tray in rack is not addressed here.
   */
  @Serializable(with = SpecimenContainerSerializer::class)
  public class Container(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and manageable, there is a strict set of
     * governance applied to the definition and use of extensions. Though any implementer can define
     * an extension, there is a set of requirements that SHALL be met as part of the definition of
     * the extension.
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var extension: List<Extension?>? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element and that modifies the understanding of the element in which it is contained
     * and/or the understanding of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe and manageable, there
     * is a strict set of governance applied to the definition and use of extensions. Though any
     * implementer can define an extension, there is a set of requirements that SHALL be met as part
     * of the definition of the extension. Applications processing a resource are required to check
     * for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
     * DomainResource (including cannot change the meaning of modifierExtension itself).
     *
     * There can be no stigma associated with the use of extensions by any application, project, or
     * standard - regardless of the institution or jurisdiction that uses or defines the extensions.
     * The use of extensions is what allows the FHIR specification to retain a core level of
     * simplicity for everyone.
     */
    override var modifierExtension: List<Extension?>? = null,
    /**
     * Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier,
     * etc. The container ID may differ from the specimen id in some circumstances.
     */
    public var identifier: List<Identifier?>? = null,
    /** Textual description of the container. */
    public var description: String? = null,
    /** The type of container associated with the specimen (e.g. slide, aliquot, etc.). */
    public var type: CodeableConcept? = null,
    /** The capacity (volume or other measure) the container may contain. */
    public var capacity: Quantity? = null,
    /**
     * The quantity of specimen in the container; may be volume, dimensions, or other appropriate
     * measurements, depending on the specimen type.
     */
    public var specimenQuantity: Quantity? = null,
    /**
     * Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin,
     * Citrate, EDTA.
     */
    public var additive: Additive? = null,
  ) : BackboneElement() {
    @Serializable(with = SpecimenContainerAdditiveSerializer::class)
    public sealed interface Additive {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4b.CodeableConcept
      ) : Additive

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) :
        Additive

      public data object Null : Additive

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
          ReferenceValue: com.google.fhir.model.r4b.Reference?,
        ): Additive {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return Null
        }
      }
    }
  }

  /** Codes providing the status/availability of a specimen. */
  public enum class SpecimenStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The physical specimen is present and in good condition. */
    Available(
      "available",
      "http://hl7.org/fhir/specimen-status",
      "Available",
      "The physical specimen is present and in good condition.",
    ),
    /** There is no physical specimen because it is either lost, destroyed or consumed. */
    Unavailable(
      "unavailable",
      "http://hl7.org/fhir/specimen-status",
      "Unavailable",
      "There is no physical specimen because it is either lost, destroyed or consumed.",
    ),
    /**
     * The specimen cannot be used because of a quality issue such as a broken container,
     * contamination, or too old.
     */
    Unsatisfactory(
      "unsatisfactory",
      "http://hl7.org/fhir/specimen-status",
      "Unsatisfactory",
      "The specimen cannot be used because of a quality issue such as a broken container, contamination, or too old.",
    ),
    /** The specimen was entered in error and therefore nullified. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/specimen-status",
      "Entered in Error",
      "The specimen was entered in error and therefore nullified.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): SpecimenStatus =
        when (code) {
          "available" -> Available
          "unavailable" -> Unavailable
          "unsatisfactory" -> Unsatisfactory
          "entered-in-error" -> Entered_In_Error
          else -> throw IllegalArgumentException("Unknown code $code for enum SpecimenStatus")
        }
    }
  }
}
