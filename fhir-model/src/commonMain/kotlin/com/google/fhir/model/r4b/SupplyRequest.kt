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

import com.google.fhir.model.r4b.serializers.SupplyRequestItemSerializer
import com.google.fhir.model.r4b.serializers.SupplyRequestOccurrenceSerializer
import com.google.fhir.model.r4b.serializers.SupplyRequestParameterSerializer
import com.google.fhir.model.r4b.serializers.SupplyRequestParameterValueSerializer
import com.google.fhir.model.r4b.serializers.SupplyRequestSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** A record of a request for a medication, substance or device used in the healthcare setting. */
@Serializable(with = SupplyRequestSerializer::class)
@SerialName("SupplyRequest")
public data class SupplyRequest(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * The only time that a resource does not have an id is when it is being submitted to the server
   * using a create operation.
   */
  override val id: String? = null,
  /**
   * The metadata about the resource. This is content that is maintained by the infrastructure.
   * Changes to the content might not always be associated with version changes to the resource.
   */
  override val meta: Meta? = null,
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
  override val implicitRules: Uri? = null,
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
  override val language: Code? = null,
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
  override val text: Narrative? = null,
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
  override val contained: List<Resource> = listOf(),
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
  override val extension: List<Extension> = listOf(),
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
  override val modifierExtension: List<Extension> = listOf(),
  /**
   * Business identifiers assigned to this SupplyRequest by the author and/or other systems. These
   * identifiers remain constant as the resource is updated and propagates from server to server.
   *
   * The identifier.type element is used to distinguish between the identifiers assigned by the
   * requester/placer and the performer/filler.
   */
  public val identifier: List<Identifier> = listOf(),
  /** Status of the supply request. */
  public val status: Enumeration<SupplyRequestStatus>? = null,
  /**
   * Category of supply, e.g. central, non-stock, etc. This is used to support work flows associated
   * with the supply process.
   */
  public val category: CodeableConcept? = null,
  /**
   * Indicates how quickly this SupplyRequest should be addressed with respect to other requests.
   */
  public val priority: Enumeration<RequestPriority>? = null,
  /**
   * The item that is requested to be supplied. This is either a link to a resource representing the
   * details of the item or a code that identifies the item from a known list.
   *
   * Note that there's a difference between a prescription - an instruction to take a medication,
   * along with a (sometimes) implicit supply, and an explicit request to supply, with no explicit
   * instructions.
   */
  public val item: Item,
  /** The amount that is being ordered of the indicated item. */
  public val quantity: Quantity,
  /** Specific parameters for the ordered item. For example, the size of the indicated item. */
  public val parameter: List<Parameter> = listOf(),
  /** When the request should be fulfilled. */
  public val occurrence: Occurrence? = null,
  /** When the request was made. */
  public val authoredOn: DateTime? = null,
  /** The device, practitioner, etc. who initiated the request. */
  public val requester: Reference? = null,
  /** Who is intended to fulfill the request. */
  public val supplier: List<Reference> = listOf(),
  /** The reason why the supply item was requested. */
  public val reasonCode: List<CodeableConcept> = listOf(),
  /** The reason why the supply item was requested. */
  public val reasonReference: List<Reference> = listOf(),
  /** Where the supply is expected to come from. */
  public val deliverFrom: Reference? = null,
  /** Where the supply is destined to go. */
  public val deliverTo: Reference? = null,
) : DomainResource() {
  /** Specific parameters for the ordered item. For example, the size of the indicated item. */
  @Serializable(with = SupplyRequestParameterSerializer::class)
  public class Parameter(
    /**
     * Unique id for the element within a resource (for internal references). This may be any string
     * value that does not contain spaces.
     */
    override val id: String? = null,
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
    override val extension: List<Extension> = listOf(),
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
    override val modifierExtension: List<Extension> = listOf(),
    /** A code or string that identifies the device detail being asserted. */
    public val code: CodeableConcept? = null,
    /**
     * The value of the device detail.
     *
     * Range means device should have a value that falls somewhere within the specified range.
     */
    public val `value`: Value? = null,
  ) : BackboneElement() {
    @Serializable(with = SupplyRequestParameterValueSerializer::class)
    public sealed interface Value {
      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asRange(): Range? = this as? Range

      public fun asBoolean(): Boolean? = this as? Boolean

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4b.CodeableConcept
      ) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r4b.Quantity) : Value

      public data class Range(public val `value`: com.google.fhir.model.r4b.Range) : Value

      public data class Boolean(public val `value`: com.google.fhir.model.r4b.Boolean) : Value

      public companion object {
        internal fun from(
          codeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
          quantityValue: com.google.fhir.model.r4b.Quantity?,
          rangeValue: com.google.fhir.model.r4b.Range?,
          booleanValue: com.google.fhir.model.r4b.Boolean?,
        ): Value? {
          if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
          if (quantityValue != null) return Quantity(quantityValue)
          if (rangeValue != null) return Range(rangeValue)
          if (booleanValue != null) return Boolean(booleanValue)
          return null
        }
      }
    }
  }

  @Serializable(with = SupplyRequestItemSerializer::class)
  public sealed interface Item {
    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public fun asReference(): Reference? = this as? Reference

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r4b.CodeableConcept
    ) : Item

    public data class Reference(public val `value`: com.google.fhir.model.r4b.Reference) : Item

    public companion object {
      internal fun from(
        codeableConceptValue: com.google.fhir.model.r4b.CodeableConcept?,
        referenceValue: com.google.fhir.model.r4b.Reference?,
      ): Item? {
        if (codeableConceptValue != null) return CodeableConcept(codeableConceptValue)
        if (referenceValue != null) return Reference(referenceValue)
        return null
      }
    }
  }

  @Serializable(with = SupplyRequestOccurrenceSerializer::class)
  public sealed interface Occurrence {
    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asPeriod(): Period? = this as? Period

    public fun asTiming(): Timing? = this as? Timing

    public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) : Occurrence

    public data class Period(public val `value`: com.google.fhir.model.r4b.Period) : Occurrence

    public data class Timing(public val `value`: com.google.fhir.model.r4b.Timing) : Occurrence

    public companion object {
      internal fun from(
        dateTimeValue: com.google.fhir.model.r4b.DateTime?,
        periodValue: com.google.fhir.model.r4b.Period?,
        timingValue: com.google.fhir.model.r4b.Timing?,
      ): Occurrence? {
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (periodValue != null) return Period(periodValue)
        if (timingValue != null) return Timing(timingValue)
        return null
      }
    }
  }

  /** Status of the supply request. */
  public enum class SupplyRequestStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
  ) {
    Draft("draft", "http://hl7.org/fhir/supplyrequest-status", "Draft"),
    Active("active", "http://hl7.org/fhir/supplyrequest-status", "Active"),
    Suspended("suspended", "http://hl7.org/fhir/supplyrequest-status", "Suspended"),
    Cancelled("cancelled", "http://hl7.org/fhir/supplyrequest-status", "Cancelled"),
    Completed("completed", "http://hl7.org/fhir/supplyrequest-status", "Completed"),
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/supplyrequest-status",
      "Entered in Error",
    ),
    Unknown("unknown", "http://hl7.org/fhir/supplyrequest-status", "Unknown");

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public companion object {
      public fun fromCode(code: String): SupplyRequestStatus =
        when (code) {
          "draft" -> Draft
          "active" -> Active
          "suspended" -> Suspended
          "cancelled" -> Cancelled
          "completed" -> Completed
          "entered-in-error" -> Entered_In_Error
          "unknown" -> Unknown
          else -> throw IllegalArgumentException("Unknown code $code for enum SupplyRequestStatus")
        }
    }
  }

  /** Identifies the level of importance to be assigned to actioning the request. */
  public enum class RequestPriority(
    private val code: String,
    private val system: String,
    private val display: String?,
  ) {
    Routine("routine", "http://hl7.org/fhir/request-priority", "Routine"),
    Urgent("urgent", "http://hl7.org/fhir/request-priority", "Urgent"),
    Asap("asap", "http://hl7.org/fhir/request-priority", "ASAP"),
    Stat("stat", "http://hl7.org/fhir/request-priority", "STAT");

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public companion object {
      public fun fromCode(code: String): RequestPriority =
        when (code) {
          "routine" -> Routine
          "urgent" -> Urgent
          "asap" -> Asap
          "stat" -> Stat
          else -> throw IllegalArgumentException("Unknown code $code for enum RequestPriority")
        }
    }
  }
}
