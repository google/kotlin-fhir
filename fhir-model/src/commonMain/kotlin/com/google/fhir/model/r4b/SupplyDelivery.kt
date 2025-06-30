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

import com.google.fhir.model.r4b.serializers.SupplyDeliverySerializer
import com.google.fhir.model.r4b.serializers.SupplyDeliverySuppliedItemSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** Record of delivery of what is supplied. */
@Serializable(with = SupplyDeliverySerializer::class)
@SerialName("SupplyDelivery")
public data class SupplyDelivery(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * The only time that a resource does not have an id is when it is being submitted to the server
   * using a create operation.
   */
  override var id: String? = null,
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
  /**
   * Identifier for the supply delivery event that is used to identify it across multiple disparate
   * systems.
   *
   * This identifier is typically assigned by the dispenser, and may be used to reference the
   * delivery when exchanging information about it with other systems.
   */
  public var identifier: List<Identifier?>? = null,
  /** A plan, proposal or order that is fulfilled in whole or in part by this event. */
  public var basedOn: List<Reference?>? = null,
  /**
   * A larger event of which this particular event is a component or step.
   *
   * Not to be used to link an event to an Encounter - use Event.context for that.
   *
   * [The allowed reference resources may be adjusted as appropriate for the event resource].
   */
  public var partOf: List<Reference?>? = null,
  /**
   * A code specifying the state of the dispense event.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<SupplyDeliveryStatus>? = null,
  /** A link to a resource representing the person whom the delivered item is for. */
  public var patient: Reference? = null,
  /**
   * Indicates the type of dispensing event that is performed. Examples include: Trial Fill,
   * Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
   */
  public var type: CodeableConcept? = null,
  /** The item that is being delivered or has been supplied. */
  public var suppliedItem: SuppliedItem? = null,
  /**
   * The date or time(s) the activity occurred.
   *
   * [The list of types may be constrained as appropriate for the type of event].
   */
  public var occurrence: Occurrence? = null,
  /** The individual responsible for dispensing the medication, supplier or device. */
  public var supplier: Reference? = null,
  /**
   * Identification of the facility/location where the Supply was shipped to, as part of the
   * dispense event.
   */
  public var destination: Reference? = null,
  /** Identifies the person who picked up the Supply. */
  public var `receiver`: List<Reference?>? = null,
) : DomainResource() {
  /** The item that is being delivered or has been supplied. */
  @Serializable(with = SupplyDeliverySuppliedItemSerializer::class)
  public class SuppliedItem(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override var id: String? = null,
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
    /** The amount of supply that has been dispensed. Includes unit of measure. */
    public var quantity: Quantity? = null,
    /**
     * Identifies the medication, substance or device being dispensed. This is either a link to a
     * resource representing the details of the item or a code that identifies the item from a known
     * list.
     */
    public var item: Item? = null,
  ) : BackboneElement() {
    public sealed interface Item {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asReference(): Reference? = this as? Reference

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4b.CodeableConcept
      ) : Item

      public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) : Item

      public companion object {
        public fun from(
          CodeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
          ReferenceValue: com.google.fhir.model.r4b.Reference?,
        ): Item? {
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          return null
        }
      }
    }
  }

  public sealed interface Occurrence {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public fun asTiming(): Timing? = this as? Timing

    public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) : Occurrence

    public data class Period(public val `value`: com.google.fhir.model.r4b.Period) : Occurrence

    public data class Timing(public val `value`: com.google.fhir.model.r4b.Timing) : Occurrence

    public companion object {
      public fun from(
        dateTimeValue: com.google.fhir.model.r4b.DateTime?,
        PeriodValue: com.google.fhir.model.r4b.Period?,
        TimingValue: com.google.fhir.model.r4b.Timing?,
      ): Occurrence? {
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (PeriodValue != null) return Period(PeriodValue)
        if (TimingValue != null) return Timing(TimingValue)
        return null
      }
    }
  }

  /** Status of the supply delivery. */
  public enum class SupplyDeliveryStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
  ) {
    In_Progress("in-progress", "http://hl7.org/fhir/supplydelivery-status", "In Progress"),
    Completed("completed", "http://hl7.org/fhir/supplydelivery-status", "Delivered"),
    Abandoned("abandoned", "http://hl7.org/fhir/supplydelivery-status", "Abandoned"),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/supplydelivery-status",
      "Entered In Error",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public companion object {
      public fun fromCode(code: String): SupplyDeliveryStatus =
        when (code) {
          "in-progress" -> In_Progress
          "completed" -> Completed
          "abandoned" -> Abandoned
          "entered-in-error" -> Entered_In_Error
          else -> throw IllegalArgumentException("Unknown code $code for enum SupplyDeliveryStatus")
        }
    }
  }
}
