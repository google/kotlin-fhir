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

package com.google.fhir.model.r5

import com.google.fhir.model.r5.serializers.BiologicallyDerivedProductDispensePerformerSerializer
import com.google.fhir.model.r5.serializers.BiologicallyDerivedProductDispenseSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** A record of dispensation of a biologically derived product. */
@Serializable(with = BiologicallyDerivedProductDispenseSerializer::class)
@SerialName("BiologicallyDerivedProductDispense")
public data class BiologicallyDerivedProductDispense(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * Within the context of the FHIR RESTful interactions, the resource has an id except for cases
   * like the create and conditional update. Otherwise, the use of the resouce id depends on the
   * given use case.
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
   * to an implementation guide that defines these special rules as part of its narrative along with
   * other profiles, value sets, etc.
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
   * Contained resources do not have a narrative. Resources that are not contained SHOULD have a
   * narrative. In some cases, a resource may only have text with little or no additional discrete
   * data (as long as all minOccurs=1 elements are satisfied). This may be necessary for data from
   * legacy systems where information is captured as a "text blob" or where text is additionally
   * entered raw or narrated and encoded information is added later.
   */
  override var text: Narrative? = null,
  /**
   * These resources do not have an independent existence apart from the resource that contains
   * them - they cannot be identified independently, nor can they have their own independent
   * transaction scope. This is allowed to be a Parameters resource if and only if it is referenced
   * by a resource that provides context/meaning.
   *
   * This should never be done when the content can be identified properly, as once identification
   * is lost, it is extremely difficult (and context dependent) to restore it again. Contained
   * resources may have profiles and tags in their meta elements, but SHALL NOT have security
   * labels.
   */
  override var contained: List<Resource?>? = null,
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * resource. To make the use of extensions safe and managable, there is a strict set of governance
   * applied to the definition and use of extensions. Though any implementer can define an
   * extension, there is a set of requirements that SHALL be met as part of the definition of the
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
   * negation or qualification. To make the use of extensions safe and managable, there is a strict
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
  /**
   * Unique instance identifiers assigned to a biologically derived product dispense. Note: This is
   * a business identifier, not a resource identifier.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The order or request that the dispense is fulfilling. This is a reference to a ServiceRequest
   * resource.
   */
  public var basedOn: List<Reference?>? = null,
  /** A larger event of which this particular event is a component. */
  public var partOf: List<Reference?>? = null,
  /** A code specifying the state of the dispense event. */
  public var status: Enumeration<BiologicallyDerivedProductDispenseStatus>? = null,
  /**
   * Indicates the relationship between the donor of the biologically derived product and the
   * intended recipient.
   */
  public var originRelationshipType: CodeableConcept? = null,
  /** A link to a resource identifying the biologically derived product that is being dispensed. */
  public var product: Reference? = null,
  /** A link to a resource representing the patient that the product is dispensed for. */
  public var patient: Reference? = null,
  /** Indicates the type of matching associated with the dispense. */
  public var matchStatus: CodeableConcept? = null,
  /** Indicates who or what performed an action. */
  public var performer: List<Performer>? = null,
  /** The physical location where the dispense was performed. */
  public var location: Reference? = null,
  /**
   * The amount of product in the dispense. Quantity will depend on the product being dispensed.
   * Examples are: volume; cell count; concentration.
   */
  public var quantity: Quantity? = null,
  /** When the product was selected/ matched. */
  public var preparedDate: DateTime? = null,
  /** When the product was dispatched for clinical use. */
  public var whenHandedOver: DateTime? = null,
  /** Link to a resource identifying the physical location that the product was dispatched to. */
  public var destination: Reference? = null,
  /** Additional notes. */
  public var note: List<Annotation?>? = null,
  /** Specific instructions for use. */
  public var usageInstruction: String? = null,
) : DomainResource() {
  /** Indicates who or what performed an action. */
  @Serializable(with = BiologicallyDerivedProductDispensePerformerSerializer::class)
  public class Performer(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: kotlin.String? = null,
    /**
     * May be used to represent additional information that is not part of the basic definition of
     * the element. To make the use of extensions safe and managable, there is a strict set of
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
     * provide negation or qualification. To make the use of extensions safe and managable, there is
     * a strict set of governance applied to the definition and use of extensions. Though any
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
    /** Identifies the function of the performer during the dispense. */
    public var function: CodeableConcept? = null,
    /** Identifies the person responsible for the action. */
    public var actor: Reference? = null,
  ) : BackboneElement()

  /** BiologicallyDerivedProductDispense Status Codes */
  public enum class BiologicallyDerivedProductDispenseStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The dispense process has started but not yet completed. */
    Preparation(
      "preparation",
      "http://hl7.org/fhir/biologicallyderivedproductdispense-status",
      "Preparation",
      "The dispense process has started but not yet completed.",
    ),
    /** The dispense process is in progress. */
    In_Progress(
      "in-progress",
      "http://hl7.org/fhir/biologicallyderivedproductdispense-status",
      "In Progress",
      "The dispense process is in progress.",
    ),
    /** The requested product has been allocated and is ready for transport. */
    Allocated(
      "allocated",
      "http://hl7.org/fhir/biologicallyderivedproductdispense-status",
      "Allocated",
      "The requested product has been allocated and is ready for transport.",
    ),
    /** The dispensed product has been picked up. */
    Issued(
      "issued",
      "http://hl7.org/fhir/biologicallyderivedproductdispense-status",
      "Issued",
      "The dispensed product has been picked up.",
    ),
    /** The dispense could not be completed. */
    Unfulfilled(
      "unfulfilled",
      "http://hl7.org/fhir/biologicallyderivedproductdispense-status",
      "Unfulfilled",
      "The dispense could not be completed.",
    ),
    /** The dispensed product was returned. */
    Returned(
      "returned",
      "http://hl7.org/fhir/biologicallyderivedproductdispense-status",
      "Returned",
      "The dispensed product was returned.",
    ),
    /** The dispense was entered in error and therefore nullified. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/biologicallyderivedproductdispense-status",
      "Entered in Error",
      "The dispense was entered in error and therefore nullified.",
    ),
    /**
     * The authoring system does not know which of the status values applies for this dispense.
     * Note: this concept is not to be used for other - one of the listed statuses is presumed to
     * apply, it's just not known which one.
     */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/biologicallyderivedproductdispense-status",
      "Unknown",
      "The authoring system does not know which of the status values applies for this dispense. Note: this concept is not to be used for other - one of the listed statuses is presumed to apply, it's just not known which one.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): BiologicallyDerivedProductDispenseStatus =
        when (code) {
          "preparation" -> Preparation
          "in-progress" -> In_Progress
          "allocated" -> Allocated
          "issued" -> Issued
          "unfulfilled" -> Unfulfilled
          "returned" -> Returned
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum BiologicallyDerivedProductDispenseStatus"
            )
        }
    }
  }
}
