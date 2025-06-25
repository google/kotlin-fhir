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

import com.google.fhir.model.r4b.serializers.CompartmentDefinitionResourceSerializer
import com.google.fhir.model.r4b.serializers.CompartmentDefinitionSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** A compartment definition that defines how resources are accessed on a server. */
@Serializable(with = CompartmentDefinitionSerializer::class)
@SerialName("CompartmentDefinition")
public data class CompartmentDefinition(
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
  override var contained: List<com.google.fhir.model.r4b.Resource?>? = null,
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
   * An absolute URI that is used to identify this compartment definition when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which at which an authoritative instance
   * of this compartment definition is (or will be) published. This URL can be the target of a
   * canonical reference. It SHALL remain the same when the compartment definition is stored on
   * different servers.
   *
   * Can be a urn:uuid: or a urn:oid: but real http: addresses are preferred. Multiple instances may
   * share the same URL if they have a distinct version.
   *
   * The determination of when to create a new version of a resource (same url, new version) vs.
   * defining a new artifact is up to the author. Considerations for making this decision are found
   * in [Technical and Business Versions](resource.html#versions).
   *
   * In some cases, the resource can no longer be found at the stated url, but the url itself cannot
   * change. Implementations can use the [meta.source](resource.html#meta) element to indicate where
   * the current master source of the resource can be found.
   */
  public var url: Uri? = null,
  /**
   * The identifier that is used to identify this version of the compartment definition when it is
   * referenced in a specification, model, design or instance. This is an arbitrary value managed by
   * the compartment definition author and is not expected to be globally unique. For example, it
   * might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no
   * expectation that versions can be placed in a lexicographical sequence.
   *
   * There may be different compartment definition instances that have the same identifier but
   * different versions. The version can be appended to the url in a reference to allow a reference
   * to a particular business version of the compartment definition with the format [url]|[version].
   */
  public var version: String? = null,
  /**
   * A natural language name identifying the compartment definition. This name should be usable as
   * an identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.This is often the same as the code for
   * the parameter, but does not need to be.
   */
  public var name: String? = null,
  /**
   * The status of this compartment definition. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of compartment definitions that are appropriate for use versus not.
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * A Boolean value to indicate that this compartment definition is authored for testing purposes
   * (or education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of compartment definitions that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the compartment definition was published. The date must
   * change when the business version changes and it must change if the status code changes. In
   * addition, it should change when the substantive content of the compartment definition changes.
   *
   * Note that this is not the same as the resource last-modified-date, since the resource may be a
   * secondary representation of the compartment definition. Additional specific dates may be added
   * as extensions or be found by consulting Provenances associated with past versions of the
   * resource.
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual that published the compartment definition.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the compartment
   * definition is the organization or individual primarily responsible for the maintenance and
   * upkeep of the compartment definition. This is not necessarily the same individual or
   * organization that developed and initially authored the content. The publisher is the primary
   * point of contact for questions or issues with the compartment definition. This item SHOULD be
   * populated unless the information is available from context.
   */
  public var publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * May be a web site, an email address, a telephone number, etc.
   */
  public var contact: List<ContactDetail?>? = null,
  /**
   * A free text natural language description of the compartment definition from a consumer's
   * perspective.
   *
   * This description can be used to capture details such as why the compartment definition was
   * built, comments about misuse, instructions for clinical use and interpretation, literature
   * references, examples from the paper world, etc. It is not a rendering of the compartment
   * definition as conveyed in the 'text' field of the resource itself. This item SHOULD be
   * populated unless the information is available from context (e.g. the language of the
   * compartment definition is presumed to be the predominant language in the place the compartment
   * definition was created).
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate compartment definition instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * Explanation of why this compartment definition is needed and why it has been designed as it
   * has.
   *
   * This element does not describe the usage of the compartment definition. Instead, it provides
   * traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This
   * may be used to point to source materials or specifications that drove the structure of this
   * compartment definition.
   */
  public var purpose: Markdown? = null,
  /**
   * Which compartment this definition describes.
   *
   * Only the specification can define the compartments that can exist. Servers can choose to
   * support them.
   */
  public var code: Enumeration<CompartmentType>? = null,
  /**
   * Whether the search syntax is supported,.
   *
   * Servers may define and use compartments to manage logical access without implementing the
   * compartment related syntax.
   */
  public var search: Boolean? = null,
  /** Information about how a resource is related to the compartment. */
  public var resource: List<Resource>? = null,
) : DomainResource() {
  /** Information about how a resource is related to the compartment. */
  @Serializable(with = CompartmentDefinitionResourceSerializer::class)
  public class Resource(
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
    /** The name of a resource supported by the server. */
    public var code: Enumeration<ResourceType>? = null,
    /**
     * The name of a search parameter that represents the link to the compartment. More than one may
     * be listed because a resource may be linked to a compartment in more than one way,.
     *
     * If no search parameters are listed, then the resource is not linked to the compartment.
     */
    public var `param`: List<String?>? = null,
    /** Additional documentation about the resource and compartment. */
    public var documentation: String? = null,
  ) : BackboneElement()

  /** Which type a compartment definition describes. */
  public enum class CompartmentType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The compartment definition is for the patient compartment. */
    Patient(
      "Patient",
      "http://hl7.org/fhir/compartment-type",
      "Patient",
      "The compartment definition is for the patient compartment.",
    ),
    /** The compartment definition is for the encounter compartment. */
    Encounter(
      "Encounter",
      "http://hl7.org/fhir/compartment-type",
      "Encounter",
      "The compartment definition is for the encounter compartment.",
    ),
    /** The compartment definition is for the related-person compartment. */
    RelatedPerson(
      "RelatedPerson",
      "http://hl7.org/fhir/compartment-type",
      "RelatedPerson",
      "The compartment definition is for the related-person compartment.",
    ),
    /** The compartment definition is for the practitioner compartment. */
    Practitioner(
      "Practitioner",
      "http://hl7.org/fhir/compartment-type",
      "Practitioner",
      "The compartment definition is for the practitioner compartment.",
    ),
    /** The compartment definition is for the device compartment. */
    Device(
      "Device",
      "http://hl7.org/fhir/compartment-type",
      "Device",
      "The compartment definition is for the device compartment.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): CompartmentType =
        when (code) {
          "Patient" -> Patient
          "Encounter" -> Encounter
          "RelatedPerson" -> RelatedPerson
          "Practitioner" -> Practitioner
          "Device" -> Device
          else -> throw IllegalArgumentException("Unknown code $code for enum CompartmentType")
        }
    }
  }
}
