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

import com.google.fhir.model.r4b.serializers.DeviceUseStatementSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A record of a device being used by a patient where the record is the result of a report from the
 * patient or another clinician.
 */
@Serializable(with = DeviceUseStatementSerializer::class)
@SerialName("DeviceUseStatement")
public data class DeviceUseStatement(
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
  /** An external identifier for this statement such as an IRI. */
  public var identifier: List<Identifier?>? = null,
  /** A plan, proposal or order that is fulfilled in whole or in part by this DeviceUseStatement. */
  public var basedOn: List<Reference?>? = null,
  /**
   * A code representing the patient or other source's judgment about the state of the device used
   * that this statement is about. Generally this will be active or completed.
   *
   * DeviceUseStatment is a statement at a point in time. The status is only representative at the
   * point when it was asserted. The value set for contains codes that assert the status of the use
   * by the patient (for example, stopped or on hold) as well as codes that assert the status of the
   * resource itself (for example, entered in error).
   *
   * This element is labeled as a modifier because the status contains the codes that mark the
   * statement as not currently valid.
   */
  public var status: Enumeration<DeviceUseStatementStatus>? = null,
  /** The patient who used the device. */
  public var subject: Reference? = null,
  /**
   * Allows linking the DeviceUseStatement to the underlying Request, or to other information that
   * supports or is used to derive the DeviceUseStatement.
   *
   * The most common use cases for deriving a DeviceUseStatement comes from creating it from a
   * request or from an observation or a claim. it should be noted that the amount of information
   * that is available varies from the type resource that you derive the DeviceUseStatement from.
   */
  public var derivedFrom: List<Reference?>? = null,
  /** How often the device was used. */
  public var timing: Timing? = null,
  /** The time at which the statement was made/recorded. */
  public var recordedOn: DateTime? = null,
  /** Who reported the device was being used by the patient. */
  public var source: Reference? = null,
  /** The details of the device used. */
  public var device: Reference? = null,
  /** Reason or justification for the use of the device. */
  public var reasonCode: List<CodeableConcept?>? = null,
  /** Indicates another resource whose existence justifies this DeviceUseStatement. */
  public var reasonReference: List<Reference?>? = null,
  /**
   * Indicates the anotomic location on the subject's body where the device was used ( i.e. the
   * target).
   */
  public var bodySite: CodeableConcept? = null,
  /**
   * Details about the device statement that were not represented at all or sufficiently in one of
   * the attributes provided in a class. These may include for example a comment, an instruction, or
   * a note associated with the statement.
   */
  public var note: List<Annotation?>? = null,
) : DomainResource() {
  public sealed interface Timing {
    public fun asTiming(): Timing? = this as? Timing

    public fun asPeriod(): Period? = this as? Period

    public fun asDateTime(): DateTime? = this as? DateTime

    public data class Timing(public val `value`: com.google.fhir.model.r4b.Timing) :
      DeviceUseStatement.Timing

    public data class Period(public val `value`: com.google.fhir.model.r4b.Period) :
      DeviceUseStatement.Timing

    public data class DateTime(public val `value`: com.google.fhir.model.r4b.DateTime) :
      DeviceUseStatement.Timing

    public companion object {
      public fun from(
        TimingValue: com.google.fhir.model.r4b.Timing?,
        PeriodValue: com.google.fhir.model.r4b.Period?,
        dateTimeValue: com.google.fhir.model.r4b.DateTime?,
      ): DeviceUseStatement.Timing? {
        if (TimingValue != null) return Timing(TimingValue)
        if (PeriodValue != null) return Period(PeriodValue)
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        return null
      }
    }
  }

  /** A coded concept indicating the current status of the Device Usage. */
  public enum class DeviceUseStatementStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /** The device is still being used. */
    Active(
      "active",
      "http://hl7.org/fhir/device-statement-status",
      "Active",
      "The device is still being used.",
    ),
    /** The device is no longer being used. */
    Completed(
      "completed",
      "http://hl7.org/fhir/device-statement-status",
      "Completed",
      "The device is no longer being used.",
    ),
    /** The statement was recorded incorrectly. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/device-statement-status",
      "Entered in Error",
      "The statement was recorded incorrectly.",
    ),
    /** The device may be used at some time in the future. */
    Intended(
      "intended",
      "http://hl7.org/fhir/device-statement-status",
      "Intended",
      "The device may be used at some time in the future.",
    ),
    /**
     * Actions implied by the statement have been permanently halted, before all of them occurred.
     */
    Stopped(
      "stopped",
      "http://hl7.org/fhir/device-statement-status",
      "Stopped",
      "Actions implied by the statement have been permanently halted, before all of them occurred.",
    ),
    /**
     * Actions implied by the statement have been temporarily halted, but are expected to continue
     * later. May also be called "suspended".
     */
    On_Hold(
      "on-hold",
      "http://hl7.org/fhir/device-statement-status",
      "On Hold",
      "Actions implied by the statement have been temporarily halted, but are expected to continue later. May also be called \"suspended\".",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): DeviceUseStatementStatus =
        when (code) {
          "active" -> Active
          "completed" -> Completed
          "entered-in-error" -> Entered_In_Error
          "intended" -> Intended
          "stopped" -> Stopped
          "on-hold" -> On_Hold
          else ->
            throw IllegalArgumentException("Unknown code $code for enum DeviceUseStatementStatus")
        }
    }
  }
}
