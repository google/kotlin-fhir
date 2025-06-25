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

import com.google.fhir.model.r5.serializers.GuidanceResponseSerializer
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A guidance response is the formal response to a guidance request, including any output parameters
 * returned by the evaluation, as well as the description of any proposed actions to be taken.
 */
@Serializable(with = GuidanceResponseSerializer::class)
@SerialName("GuidanceResponse")
public data class GuidanceResponse(
  /**
   * The logical id of the resource, as used in the URL for the resource. Once assigned, this value
   * never changes.
   *
   * Within the context of the FHIR RESTful interactions, the resource has an id except for cases
   * like the create and conditional update. Otherwise, the use of the resouce id depends on the
   * given use case.
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
   * The identifier of the request associated with this response. If an identifier was given as part
   * of the request, it will be reproduced here to enable the requester to more easily identify the
   * response in a multi-request scenario.
   */
  public var requestIdentifier: Identifier? = null,
  /** Allows a service to provide unique, business identifiers for the response. */
  public var identifier: List<Identifier?>? = null,
  /** An identifier, CodeableConcept or canonical reference to the guidance that was requested. */
  public var module: Module? = null,
  /**
   * The status of the response. If the evaluation is completed successfully, the status will
   * indicate success. However, in order to complete the evaluation, the engine may require more
   * information. In this case, the status will be data-required, and the response will contain a
   * description of the additional required information. If the evaluation completed successfully,
   * but the engine determines that a potentially more accurate response could be provided if more
   * data was available, the status will be data-requested, and the response will contain a
   * description of the additional requested information.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<GuidanceResponseStatus>? = null,
  /** The patient for which the request was processed. */
  public var subject: Reference? = null,
  /**
   * The encounter during which this response was created or to which the creation of this record is
   * tightly associated.
   *
   * This will typically be the encounter the event occurred within, but some activities may be
   * initiated prior to or after the official copmletion of an encounter but still be tied to the
   * context of the encounter.
   */
  public var encounter: Reference? = null,
  /** Indicates when the guidance response was processed. */
  public var occurrenceDateTime: DateTime? = null,
  /** Provides a reference to the device that performed the guidance. */
  public var performer: Reference? = null,
  /**
   * Describes the reason for the guidance response in coded or textual form, or Indicates the
   * reason the request was initiated. This is typically provided as a parameter to the evaluation
   * and echoed by the service, although for some use cases, such as subscription- or event-based
   * scenarios, it may provide an indication of the cause for the response.
   *
   * Although this reference can be used to point to any resource, it is typically expected to refer
   * to subject-specific data appropriate to the subject of the guidance. For example, patient-based
   * decision support would be expected to reference patient-level data. In addition,
   * implementations should provide as much detail as possible by using the
   * [http://hl7.org/fhir/StructureDefinition/targetElement](http://hl7.org/fhir/extensions/StructureDefinition-targetElement.html)
   * and
   * [http://hl7.org/fhir/StructureDefinition/targetPath](http://hl7.org/fhir/extensions/StructureDefinition-targetPath.html)
   * extensions to indicate the specific elements relevant to providing the reason for the guidance.
   */
  public var reason: List<CodeableReference?>? = null,
  /** Provides a mechanism to communicate additional information about the response. */
  public var note: List<Annotation?>? = null,
  /**
   * Messages resulting from the evaluation of the artifact or artifacts. As part of evaluating the
   * request, the engine may produce informational or warning messages. These messages will be
   * provided by this element.
   */
  public var evaluationMessage: Reference? = null,
  /**
   * The output parameters of the evaluation, if any. Many modules will result in the return of
   * specific resources such as procedure or communication requests that are returned as part of the
   * operation result. However, modules may define specific outputs that would be returned as the
   * result of the evaluation, and these would be returned in this element.
   */
  public var outputParameters: Reference? = null,
  /** The actions, if any, produced by the evaluation of the artifact. */
  public var result: List<Reference?>? = null,
  /**
   * If the evaluation could not be completed due to lack of information, or additional information
   * would potentially result in a more accurate response, this element will a description of the
   * data required in order to proceed with the evaluation. A subsequent request to the service
   * should include this data.
   */
  public var dataRequirement: List<DataRequirement?>? = null,
) : DomainResource() {
  public sealed interface Module {
    public fun asUri(): Uri? = this as? Uri

    public fun asCanonical(): Canonical? = this as? Canonical

    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : Module

    public data class Canonical(public val `value`: com.google.fhir.model.r5.Canonical) : Module

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r5.CodeableConcept
    ) : Module

    public companion object {
      public fun from(
        uriValue: com.google.fhir.model.r5.Uri?,
        canonicalValue: com.google.fhir.model.r5.Canonical?,
        CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
      ): Module? {
        if (uriValue != null) return Uri(uriValue)
        if (canonicalValue != null) return Canonical(canonicalValue)
        if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
        return null
      }
    }
  }

  /** The status of a guidance response. */
  public enum class GuidanceResponseStatus(
    private val code: String,
    private val system: String,
    private val display: String?,
    private val definition: String?,
  ) {
    /** The request was processed successfully. */
    Success(
      "success",
      "http://hl7.org/fhir/guidance-response-status",
      "Success",
      "The request was processed successfully.",
    ),
    /**
     * The request was processed successfully, but more data may result in a more complete
     * evaluation.
     */
    Data_Requested(
      "data-requested",
      "http://hl7.org/fhir/guidance-response-status",
      "Data Requested",
      "The request was processed successfully, but more data may result in a more complete evaluation.",
    ),
    /** The request was processed, but more data is required to complete the evaluation. */
    Data_Required(
      "data-required",
      "http://hl7.org/fhir/guidance-response-status",
      "Data Required",
      "The request was processed, but more data is required to complete the evaluation.",
    ),
    /** The request is currently being processed. */
    In_Progress(
      "in-progress",
      "http://hl7.org/fhir/guidance-response-status",
      "In Progress",
      "The request is currently being processed.",
    ),
    /** The request was not processed successfully. */
    Failure(
      "failure",
      "http://hl7.org/fhir/guidance-response-status",
      "Failure",
      "The request was not processed successfully.",
    ),
    /** The response was entered in error. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/guidance-response-status",
      "Entered In Error",
      "The response was entered in error.",
    );

    override fun toString(): String = code

    public fun getCode(): String = code

    public fun getSystem(): String = system

    public fun getDisplay(): String? = display

    public fun getDefinition(): String? = definition

    public companion object {
      public fun fromCode(code: String): GuidanceResponseStatus =
        when (code) {
          "success" -> Success
          "data-requested" -> Data_Requested
          "data-required" -> Data_Required
          "in-progress" -> In_Progress
          "failure" -> Failure
          "entered-in-error" -> Entered_In_Error
          else ->
            throw IllegalArgumentException("Unknown code $code for enum GuidanceResponseStatus")
        }
    }
  }
}
