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

import com.google.fhir.model.r4b.serializers.OperationOutcomeIssueSerializer
import com.google.fhir.model.r4b.serializers.OperationOutcomeSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** A collection of error, warning, or information messages that result from a system action. */
@Serializable(with = OperationOutcomeSerializer::class)
@SerialName("OperationOutcome")
public data class OperationOutcome(
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
  /** An error, warning, or information message that results from a system action. */
  public var issue: List<Issue>? = null,
) : DomainResource() {
  /** An error, warning, or information message that results from a system action. */
  @Serializable(with = OperationOutcomeIssueSerializer::class)
  public class Issue(
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
     * Indicates whether the issue indicates a variation from successful processing.
     *
     * This is labeled as "Is Modifier" because applications should not confuse hints and warnings
     * with errors.
     */
    public var severity: Enumeration<IssueSeverity>? = null,
    /**
     * Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the
     * most applicable code from the IssueType value set, and may additional provide its own code
     * for the error in the details element.
     */
    public var code: Enumeration<IssueType>? = null,
    /**
     * Additional details about the error. This may be a text description of the error or a system
     * code that identifies the error.
     *
     * A human readable description of the error issue SHOULD be placed in details.text.
     */
    public var details: CodeableConcept? = null,
    /**
     * Additional diagnostic information about the issue.
     *
     * This may be a description of how a value is erroneous, a stack dump to help trace the issue
     * or other troubleshooting information.
     */
    public var diagnostics: String? = null,
    /**
     * This element is deprecated because it is XML specific. It is replaced by issue.expression,
     * which is format independent, and simpler to parse.
     *
     * For resource issues, this will be a simple XPath limited to element names, repetition
     * indicators and the default child accessor that identifies one of the elements in the resource
     * that caused this issue to be raised. For HTTP errors, will be "http." + the parameter name.
     *
     * The root of the XPath is the resource or bundle that generated OperationOutcome. Each XPath
     * SHALL resolve to a single node. This element is deprecated, and is being replaced by
     * expression.
     */
    public var location: List<String?>? = null,
    /**
     * A [simple subset of FHIRPath](fhirpath.html#simple) limited to element names, repetition
     * indicators and the default child accessor that identifies one of the elements in the resource
     * that caused this issue to be raised.
     *
     * The root of the FHIRPath is the resource or bundle that generated OperationOutcome. Each
     * FHIRPath SHALL resolve to a single node.
     */
    public var expression: List<String?>? = null,
  ) : BackboneElement()

  /** How the issue affects the success of the action. */
  public enum class IssueSeverity(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The issue caused the action to fail and no further checking could be performed. */
    Fatal(
      "fatal",
      "http://hl7.org/fhir/issue-severity",
      "Fatal",
      "The issue caused the action to fail and no further checking could be performed.",
    ),
    /** The issue is sufficiently important to cause the action to fail. */
    Error(
      "error",
      "http://hl7.org/fhir/issue-severity",
      "Error",
      "The issue is sufficiently important to cause the action to fail.",
    ),
    /**
     * The issue is not important enough to cause the action to fail but may cause it to be
     * performed suboptimally or in a way that is not as desired.
     */
    Warning(
      "warning",
      "http://hl7.org/fhir/issue-severity",
      "Warning",
      "The issue is not important enough to cause the action to fail but may cause it to be performed suboptimally or in a way that is not as desired.",
    ),
    /** The issue has no relation to the degree of success of the action. */
    Information(
      "information",
      "http://hl7.org/fhir/issue-severity",
      "Information",
      "The issue has no relation to the degree of success of the action.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): IssueSeverity =
        when (code) {
          "fatal" -> Fatal
          "error" -> Error
          "warning" -> Warning
          "information" -> Information
          else -> throw IllegalArgumentException("Unknown code $code for enum IssueSeverity")
        }
    }
  }

  /** A code that describes the type of issue. */
  public enum class IssueType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Content invalid against the specification or a profile. */
    Invalid(
      "invalid",
      "http://hl7.org/fhir/issue-type",
      "Invalid Content",
      "Content invalid against the specification or a profile.",
    ),
    /**
     * A structural issue in the content such as wrong namespace, unable to parse the content
     * completely, invalid syntax, etc.
     */
    Structure(
      "structure",
      "http://hl7.org/fhir/issue-type",
      "Structural Issue",
      "A structural issue in the content such as wrong namespace, unable to parse the content completely, invalid syntax, etc.",
    ),
    /** A required element is missing. */
    Required(
      "required",
      "http://hl7.org/fhir/issue-type",
      "Required element missing",
      "A required element is missing.",
    ),
    /** An element or header value is invalid. */
    Value(
      "value",
      "http://hl7.org/fhir/issue-type",
      "Element value invalid",
      "An element or header value is invalid.",
    ),
    /** A content validation rule failed - e.g. a schematron rule. */
    Invariant(
      "invariant",
      "http://hl7.org/fhir/issue-type",
      "Validation rule failed",
      "A content validation rule failed - e.g. a schematron rule.",
    ),
    /** An authentication/authorization/permissions issue of some kind. */
    Security(
      "security",
      "http://hl7.org/fhir/issue-type",
      "Security Problem",
      "An authentication/authorization/permissions issue of some kind.",
    ),
    /** The client needs to initiate an authentication process. */
    Login(
      "login",
      "http://hl7.org/fhir/issue-type",
      "Login Required",
      "The client needs to initiate an authentication process.",
    ),
    /**
     * The user or system was not able to be authenticated (either there is no process, or the
     * proferred token is unacceptable).
     */
    Unknown(
      "unknown",
      "http://hl7.org/fhir/issue-type",
      "Unknown User",
      "The user or system was not able to be authenticated (either there is no process, or the proferred token is unacceptable).",
    ),
    /** User session expired; a login may be required. */
    Expired(
      "expired",
      "http://hl7.org/fhir/issue-type",
      "Session Expired",
      "User session expired; a login may be required.",
    ),
    /** The user does not have the rights to perform this action. */
    Forbidden(
      "forbidden",
      "http://hl7.org/fhir/issue-type",
      "Forbidden",
      "The user does not have the rights to perform this action.",
    ),
    /**
     * Some information was not or might not have been returned due to business rules, consent or
     * privacy rules, or access permission constraints. This information may be accessible through
     * alternate processes.
     */
    Suppressed(
      "suppressed",
      "http://hl7.org/fhir/issue-type",
      "Information  Suppressed",
      "Some information was not or might not have been returned due to business rules, consent or privacy rules, or access permission constraints.  This information may be accessible through alternate processes.",
    ),
    /**
     * Processing issues. These are expected to be final e.g. there is no point resubmitting the
     * same content unchanged.
     */
    Processing(
      "processing",
      "http://hl7.org/fhir/issue-type",
      "Processing Failure",
      "Processing issues. These are expected to be final e.g. there is no point resubmitting the same content unchanged.",
    ),
    /** The interaction, operation, resource or profile is not supported. */
    Not_Supported(
      "not-supported",
      "http://hl7.org/fhir/issue-type",
      "Content not supported",
      "The interaction, operation, resource or profile is not supported.",
    ),
    /** An attempt was made to create a duplicate record. */
    Duplicate(
      "duplicate",
      "http://hl7.org/fhir/issue-type",
      "Duplicate",
      "An attempt was made to create a duplicate record.",
    ),
    /** Multiple matching records were found when the operation required only one match. */
    Multiple_Matches(
      "multiple-matches",
      "http://hl7.org/fhir/issue-type",
      "Multiple Matches",
      "Multiple matching records were found when the operation required only one match.",
    ),
    /**
     * The reference provided was not found. In a pure RESTful environment, this would be an HTTP
     * 404 error, but this code may be used where the content is not found further into the
     * application architecture.
     */
    Not_Found(
      "not-found",
      "http://hl7.org/fhir/issue-type",
      "Not Found",
      "The reference provided was not found. In a pure RESTful environment, this would be an HTTP 404 error, but this code may be used where the content is not found further into the application architecture.",
    ),
    /** The reference pointed to content (usually a resource) that has been deleted. */
    Deleted(
      "deleted",
      "http://hl7.org/fhir/issue-type",
      "Deleted",
      "The reference pointed to content (usually a resource) that has been deleted.",
    ),
    /**
     * Provided content is too long (typically, this is a denial of service protection type of
     * error).
     */
    Too_Long(
      "too-long",
      "http://hl7.org/fhir/issue-type",
      "Content Too Long",
      "Provided content is too long (typically, this is a denial of service protection type of error).",
    ),
    /**
     * The code or system could not be understood, or it was not valid in the context of a
     * particular ValueSet.code.
     */
    Code_Invalid(
      "code-invalid",
      "http://hl7.org/fhir/issue-type",
      "Invalid Code",
      "The code or system could not be understood, or it was not valid in the context of a particular ValueSet.code.",
    ),
    /**
     * An extension was found that was not acceptable, could not be resolved, or a modifierExtension
     * was not recognized.
     */
    Extension(
      "extension",
      "http://hl7.org/fhir/issue-type",
      "Unacceptable Extension",
      "An extension was found that was not acceptable, could not be resolved, or a modifierExtension was not recognized.",
    ),
    /**
     * The operation was stopped to protect server resources; e.g. a request for a value set
     * expansion on all of SNOMED CT.
     */
    Too_Costly(
      "too-costly",
      "http://hl7.org/fhir/issue-type",
      "Operation Too Costly",
      "The operation was stopped to protect server resources; e.g. a request for a value set expansion on all of SNOMED CT.",
    ),
    /** The content/operation failed to pass some business rule and so could not proceed. */
    Business_Rule(
      "business-rule",
      "http://hl7.org/fhir/issue-type",
      "Business Rule Violation",
      "The content/operation failed to pass some business rule and so could not proceed.",
    ),
    /**
     * Content could not be accepted because of an edit conflict (i.e. version aware updates). (In a
     * pure RESTful environment, this would be an HTTP 409 error, but this code may be used where
     * the conflict is discovered further into the application architecture.).
     */
    Conflict(
      "conflict",
      "http://hl7.org/fhir/issue-type",
      "Edit Version Conflict",
      "Content could not be accepted because of an edit conflict (i.e. version aware updates). (In a pure RESTful environment, this would be an HTTP 409 error, but this code may be used where the conflict is discovered further into the application architecture.).",
    ),
    /**
     * Transient processing issues. The system receiving the message may be able to resubmit the
     * same content once an underlying issue is resolved.
     */
    Transient(
      "transient",
      "http://hl7.org/fhir/issue-type",
      "Transient Issue",
      "Transient processing issues. The system receiving the message may be able to resubmit the same content once an underlying issue is resolved.",
    ),
    /** A resource/record locking failure (usually in an underlying database). */
    Lock_Error(
      "lock-error",
      "http://hl7.org/fhir/issue-type",
      "Lock Error",
      "A resource/record locking failure (usually in an underlying database).",
    ),
    /**
     * The persistent store is unavailable; e.g. the database is down for maintenance or similar
     * action, and the interaction or operation cannot be processed.
     */
    No_Store(
      "no-store",
      "http://hl7.org/fhir/issue-type",
      "No Store Available",
      "The persistent store is unavailable; e.g. the database is down for maintenance or similar action, and the interaction or operation cannot be processed.",
    ),
    /** An unexpected internal error has occurred. */
    Exception(
      "exception",
      "http://hl7.org/fhir/issue-type",
      "Exception",
      "An unexpected internal error has occurred.",
    ),
    /** An internal timeout has occurred. */
    Timeout(
      "timeout",
      "http://hl7.org/fhir/issue-type",
      "Timeout",
      "An internal timeout has occurred.",
    ),
    /**
     * Not all data sources typically accessed could be reached or responded in time, so the
     * returned information might not be complete (applies to search interactions and some
     * operations).
     */
    Incomplete(
      "incomplete",
      "http://hl7.org/fhir/issue-type",
      "Incomplete Results",
      "Not all data sources typically accessed could be reached or responded in time, so the returned information might not be complete (applies to search interactions and some operations).",
    ),
    /** The system is not prepared to handle this request due to load management. */
    Throttled(
      "throttled",
      "http://hl7.org/fhir/issue-type",
      "Throttled",
      "The system is not prepared to handle this request due to load management.",
    ),
    /**
     * A message unrelated to the processing success of the completed operation (examples of the
     * latter include things like reminders of password expiry, system maintenance times, etc.).
     */
    Informational(
      "informational",
      "http://hl7.org/fhir/issue-type",
      "Informational Note",
      "A message unrelated to the processing success of the completed operation (examples of the latter include things like reminders of password expiry, system maintenance times, etc.).",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): IssueType =
        when (code) {
          "invalid" -> Invalid
          "structure" -> Structure
          "required" -> Required
          "value" -> Value
          "invariant" -> Invariant
          "security" -> Security
          "login" -> Login
          "unknown" -> Unknown
          "expired" -> Expired
          "forbidden" -> Forbidden
          "suppressed" -> Suppressed
          "processing" -> Processing
          "not-supported" -> Not_Supported
          "duplicate" -> Duplicate
          "multiple-matches" -> Multiple_Matches
          "not-found" -> Not_Found
          "deleted" -> Deleted
          "too-long" -> Too_Long
          "code-invalid" -> Code_Invalid
          "extension" -> Extension
          "too-costly" -> Too_Costly
          "business-rule" -> Business_Rule
          "conflict" -> Conflict
          "transient" -> Transient
          "lock-error" -> Lock_Error
          "no-store" -> No_Store
          "exception" -> Exception
          "timeout" -> Timeout
          "incomplete" -> Incomplete
          "throttled" -> Throttled
          "informational" -> Informational
          else -> throw IllegalArgumentException("Unknown code $code for enum IssueType")
        }
    }
  }
}
