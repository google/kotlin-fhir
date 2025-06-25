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

import com.google.fhir.model.r4b.serializers.TestScriptDestinationSerializer
import com.google.fhir.model.r4b.serializers.TestScriptFixtureSerializer
import com.google.fhir.model.r4b.serializers.TestScriptMetadataCapabilitySerializer
import com.google.fhir.model.r4b.serializers.TestScriptMetadataLinkSerializer
import com.google.fhir.model.r4b.serializers.TestScriptMetadataSerializer
import com.google.fhir.model.r4b.serializers.TestScriptOriginSerializer
import com.google.fhir.model.r4b.serializers.TestScriptSerializer
import com.google.fhir.model.r4b.serializers.TestScriptSetupActionAssertSerializer
import com.google.fhir.model.r4b.serializers.TestScriptSetupActionOperationRequestHeaderSerializer
import com.google.fhir.model.r4b.serializers.TestScriptSetupActionOperationSerializer
import com.google.fhir.model.r4b.serializers.TestScriptSetupActionSerializer
import com.google.fhir.model.r4b.serializers.TestScriptSetupSerializer
import com.google.fhir.model.r4b.serializers.TestScriptTeardownActionSerializer
import com.google.fhir.model.r4b.serializers.TestScriptTeardownSerializer
import com.google.fhir.model.r4b.serializers.TestScriptTestActionSerializer
import com.google.fhir.model.r4b.serializers.TestScriptTestSerializer
import com.google.fhir.model.r4b.serializers.TestScriptVariableSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A structured set of tests against a FHIR server or client implementation to determine compliance
 * against the FHIR specification.
 */
@Serializable(with = TestScriptSerializer::class)
@SerialName("TestScript")
public data class TestScript(
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
  /**
   * An absolute URI that is used to identify this test script when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which at which an authoritative instance
   * of this test script is (or will be) published. This URL can be the target of a canonical
   * reference. It SHALL remain the same when the test script is stored on different servers.
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
   * A formal identifier that is used to identify this test script when it is represented in other
   * formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this test script outside of FHIR, where it is not possible to use
   * the logical URI.
   */
  public var identifier: Identifier? = null,
  /**
   * The identifier that is used to identify this version of the test script when it is referenced
   * in a specification, model, design or instance. This is an arbitrary value managed by the test
   * script author and is not expected to be globally unique. For example, it might be a timestamp
   * (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that
   * versions can be placed in a lexicographical sequence.
   *
   * There may be different test script instances that have the same identifier but different
   * versions. The version can be appended to the url in a reference to allow a reference to a
   * particular business version of the test script with the format [url]|[version].
   */
  public var version: String? = null,
  /**
   * A natural language name identifying the test script. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the test script.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * The status of this test script. Enables tracking the life-cycle of the content.
   *
   * Allows filtering of test scripts that are appropriate for use versus not.
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * A Boolean value to indicate that this test script is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended to be used for genuine usage.
   *
   * Allows filtering of test scripts that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The date (and optionally time) when the test script was published. The date must change when
   * the business version changes and it must change if the status code changes. In addition, it
   * should change when the substantive content of the test script changes.
   *
   * Note that this is not the same as the resource last-modified-date, since the resource may be a
   * secondary representation of the test script. Additional specific dates may be added as
   * extensions or be found by consulting Provenances associated with past versions of the resource.
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual that published the test script.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the test script
   * is the organization or individual primarily responsible for the maintenance and upkeep of the
   * test script. This is not necessarily the same individual or organization that developed and
   * initially authored the content. The publisher is the primary point of contact for questions or
   * issues with the test script. This item SHOULD be populated unless the information is available
   * from context.
   */
  public var publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * May be a web site, an email address, a telephone number, etc.
   */
  public var contact: List<ContactDetail?>? = null,
  /**
   * A free text natural language description of the test script from a consumer's perspective.
   *
   * This description can be used to capture details such as why the test script was built, comments
   * about misuse, instructions for clinical use and interpretation, literature references, examples
   * from the paper world, etc. It is not a rendering of the test script as conveyed in the 'text'
   * field of the resource itself. This item SHOULD be populated unless the information is available
   * from context (e.g. the language of the test script is presumed to be the predominant language
   * in the place the test script was created).
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate test script instances.
   *
   * When multiple useContexts are specified, there is no expectation that all or any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * A legal or geographic region in which the test script is intended to be used.
   *
   * It may be possible for the test script to be used in jurisdictions other than those for which
   * it was originally designed or intended.
   */
  public var jurisdiction: List<CodeableConcept?>? = null,
  /**
   * Explanation of why this test script is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the test script. Instead, it provides traceability
   * of ''why'' the resource is either needed or ''why'' it is defined as it is. This may be used to
   * point to source materials or specifications that drove the structure of this test script.
   */
  public var purpose: Markdown? = null,
  /**
   * A copyright statement relating to the test script and/or its contents. Copyright statements are
   * generally legal restrictions on the use and publishing of the test script.
   */
  public var copyright: Markdown? = null,
  /**
   * An abstract server used in operations within this test script in the origin element.
   *
   * The purpose of this element is to define the profile of an origin element used elsewhere in the
   * script. Test engines could then use the origin-profile mapping to offer a filtered list of test
   * systems that can serve as the sender for the interaction.
   */
  public var origin: List<Origin>? = null,
  /**
   * An abstract server used in operations within this test script in the destination element.
   *
   * The purpose of this element is to define the profile of a destination element used elsewhere in
   * the script. Test engines could then use the destination-profile mapping to offer a filtered
   * list of test systems that can serve as the receiver for the interaction.
   */
  public var destination: List<Destination>? = null,
  /**
   * The required capability must exist and are assumed to function correctly on the FHIR server
   * being tested.
   */
  public var metadata: Metadata? = null,
  /**
   * Fixture in the test script - by reference (uri). All fixtures are required for the test script
   * to execute.
   */
  public var fixture: List<Fixture>? = null,
  /**
   * Reference to the profile to be used for validation.
   *
   * See http://build.fhir.org/resourcelist.html for complete list of resource types.
   */
  public var profile: List<Reference?>? = null,
  /**
   * Variable is set based either on element value in response body or on header field value in the
   * response headers.
   *
   * Variables would be set based either on XPath/JSONPath expressions against fixtures (static and
   * response), or headerField evaluations against response headers. If variable evaluates to
   * nodelist or anything other than a primitive value, then test engine would report an error.
   * Variables would be used to perform clean replacements in "operation.params",
   * "operation.requestHeader.value", and "operation.url" element values during operation calls and
   * in "assert.value" during assertion evaluations. This limits the places that test engines would
   * need to look for placeholders "${}". Variables are scoped to the whole script. They are NOT
   * evaluated at declaration. They are evaluated by test engine when used for substitutions in
   * "operation.params", "operation.requestHeader.value", and "operation.url" element values during
   * operation calls and in "assert.value" during assertion evaluations. See example
   * testscript-search.xml.
   */
  public var variable: List<Variable>? = null,
  /** A series of required setup operations before tests are executed. */
  public var setup: Setup? = null,
  /** A test in this script. */
  public var test: List<Test>? = null,
  /**
   * A series of operations required to clean up after all the tests are executed (successfully or
   * otherwise).
   */
  public var teardown: Teardown? = null,
) : DomainResource() {
  /** An abstract server used in operations within this test script in the origin element. */
  @Serializable(with = TestScriptOriginSerializer::class)
  public class Origin(
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
     * Abstract name given to an origin server in this test script. The name is provided as a number
     * starting at 1.
     *
     * A given origin index (e.g. 1) can appear only once in the list (e.g. Origin 1 cannot be
     * specified twice ... once as FormFiller and again as FormProcessor within the same script as
     * that could get confusing during test configuration).
     *
     * Different origin indices could play the same actor in the same test script (e.g. You could
     * have two different test systems acting as Form-Filler).
     *
     * The origin indices provided elsewhere in the test script must be one of these origin indices.
     */
    public var index: Integer? = null,
    /**
     * The type of origin profile the test system supports.
     *
     * Must be a "sender"/"client" profile.
     */
    public var profile: Coding? = null,
  ) : BackboneElement()

  /** An abstract server used in operations within this test script in the destination element. */
  @Serializable(with = TestScriptDestinationSerializer::class)
  public class Destination(
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
     * Abstract name given to a destination server in this test script. The name is provided as a
     * number starting at 1.
     *
     * A given destination index (e.g. 1) can appear only once in the list (e.g. Destination 1
     * cannot be specified twice ... once as Form-Manager and again as Form-Processor within the
     * same script as that could get confusing during test configuration).
     *
     * Different destination indices could play the same actor in the same test script (e.g. You
     * could have two different test systems acting as Form-Manager).
     *
     * The destination indices provided elsewhere in the test script must be one of these
     * destination indices.
     */
    public var index: Integer? = null,
    /**
     * The type of destination profile the test system supports.
     *
     * Must be a "receiver"/"server" profile.
     */
    public var profile: Coding? = null,
  ) : BackboneElement()

  /**
   * The required capability must exist and are assumed to function correctly on the FHIR server
   * being tested.
   */
  @Serializable(with = TestScriptMetadataSerializer::class)
  public class Metadata(
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
    /** A link to the FHIR specification that this test is covering. */
    public var link: List<Link>? = null,
    /**
     * Capabilities that must exist and are assumed to function correctly on the FHIR server being
     * tested.
     *
     * When the metadata capabilities section is defined at TestScript.metadata or at
     * TestScript.setup.metadata, and the server's conformance statement does not contain the
     * elements defined in the minimal conformance statement, then all the tests in the TestScript
     * are skipped. When the metadata capabilities section is defined at TestScript.test.metadata
     * and the server's conformance statement does not contain the elements defined in the minimal
     * conformance statement, then only that test is skipped. The "metadata.capabilities.required"
     * and "metadata.capabilities.validated" elements only indicate whether the capabilities are the
     * primary focus of the test script or not. They do not impact the skipping logic. Capabilities
     * whose "metadata.capabilities.validated" flag is true are the primary focus of the test
     * script.
     */
    public var capability: List<Capability>? = null,
  ) : BackboneElement() {
    /** A link to the FHIR specification that this test is covering. */
    @Serializable(with = TestScriptMetadataLinkSerializer::class)
    public class Link(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: List<Extension?>? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: List<Extension?>? = null,
      /** URL to a particular requirement or feature within the FHIR specification. */
      public var url: Uri? = null,
      /** Short description of the link. */
      public var description: String? = null,
    ) : BackboneElement()

    /**
     * Capabilities that must exist and are assumed to function correctly on the FHIR server being
     * tested.
     */
    @Serializable(with = TestScriptMetadataCapabilitySerializer::class)
    public class Capability(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: List<Extension?>? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: List<Extension?>? = null,
      /**
       * Whether or not the test execution will require the given capabilities of the server in
       * order for this test script to execute.
       */
      public var required: Boolean? = null,
      /**
       * Whether or not the test execution will validate the given capabilities of the server in
       * order for this test script to execute.
       */
      public var validated: Boolean? = null,
      /**
       * Description of the capabilities that this test script is requiring the server to support.
       */
      public var description: String? = null,
      /** Which origin server these requirements apply to. */
      public var origin: List<Integer?>? = null,
      /** Which server these requirements apply to. */
      public var destination: Integer? = null,
      /**
       * Links to the FHIR specification that describes this interaction and the resources involved
       * in more detail.
       */
      public var link: List<Uri?>? = null,
      /**
       * Minimum capabilities required of server for test script to execute successfully. If server
       * does not meet at a minimum the referenced capability statement, then all tests in this
       * script are skipped.
       *
       * The conformance statement of the server has to contain at a minimum the contents of the
       * reference pointed to by this element.
       */
      public var capabilities: Canonical? = null,
    ) : BackboneElement()
  }

  /**
   * Fixture in the test script - by reference (uri). All fixtures are required for the test script
   * to execute.
   */
  @Serializable(with = TestScriptFixtureSerializer::class)
  public class Fixture(
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
     * Whether or not to implicitly create the fixture during setup. If true, the fixture is
     * automatically created on each server being tested during setup, therefore no create operation
     * is required for this fixture in the TestScript.setup section.
     */
    public var autocreate: Boolean? = null,
    /**
     * Whether or not to implicitly delete the fixture during teardown. If true, the fixture is
     * automatically deleted on each server being tested during teardown, therefore no delete
     * operation is required for this fixture in the TestScript.teardown section.
     */
    public var autodelete: Boolean? = null,
    /**
     * Reference to the resource (containing the contents of the resource needed for operations).
     *
     * See http://build.fhir.org/resourcelist.html for complete list of resource types.
     */
    public var resource: Reference? = null,
  ) : BackboneElement()

  /**
   * Variable is set based either on element value in response body or on header field value in the
   * response headers.
   */
  @Serializable(with = TestScriptVariableSerializer::class)
  public class Variable(
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
     * Descriptive name for this variable.
     *
     * Placeholders would contain the variable name wrapped in ${} in "operation.params",
     * "operation.requestHeader.value", and "operation.url" elements. These placeholders would need
     * to be replaced by the variable value before the operation is executed.
     */
    public var name: String? = null,
    /**
     * A default, hard-coded, or user-defined value for this variable.
     *
     * The purpose of this element is to allow for a pre-defined value that can be used as a default
     * or as an override value. Test engines can optionally use this as a placeholder for
     * user-defined execution time values.
     */
    public var defaultValue: String? = null,
    /** A free text natural language description of the variable and its purpose. */
    public var description: String? = null,
    /**
     * The FHIRPath expression to evaluate against the fixture body. When variables are defined,
     * only one of either expression, headerField or path must be specified.
     *
     * If headerField is defined, then the variable will be evaluated against the headers that
     * sourceId is pointing to. If expression or path is defined, then the variable will be
     * evaluated against the fixture body that sourceId is pointing to. It is an error to define any
     * combination of expression, headerField and path.
     */
    public var expression: String? = null,
    /**
     * Will be used to grab the HTTP header field value from the headers that sourceId is pointing
     * to.
     *
     * If headerField is defined, then the variable will be evaluated against the headers that
     * sourceId is pointing to. If path is defined, then the variable will be evaluated against the
     * fixture body that sourceId is pointing to. It is an error to define both headerField and
     * path.
     */
    public var headerField: String? = null,
    /**
     * Displayable text string with hint help information to the user when entering a default value.
     */
    public var hint: String? = null,
    /**
     * XPath or JSONPath to evaluate against the fixture body. When variables are defined, only one
     * of either expression, headerField or path must be specified.
     *
     * If headerField is defined, then the variable will be evaluated against the headers that
     * sourceId is pointing to. If expression or path is defined, then the variable will be
     * evaluated against the fixture body that sourceId is pointing to. It is an error to define any
     * combination of expression, headerField and path.
     */
    public var path: String? = null,
    /**
     * Fixture to evaluate the XPath/JSONPath expression or the headerField against within this
     * variable.
     *
     * This can be a statically defined fixture (at the top of the TestScript) or a dynamically set
     * fixture created by responseId of the `action.operation` element.
     */
    public var sourceId: Id? = null,
  ) : BackboneElement()

  /** A series of required setup operations before tests are executed. */
  @Serializable(with = TestScriptSetupSerializer::class)
  public class Setup(
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
     * Action would contain either an operation or an assertion.
     *
     * An action should contain either an operation or an assertion but not both. It can contain any
     * number of variables.
     */
    public var action: List<Action>? = null,
  ) : BackboneElement() {
    /** Action would contain either an operation or an assertion. */
    @Serializable(with = TestScriptSetupActionSerializer::class)
    public class Action(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: List<Extension?>? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: List<Extension?>? = null,
      /** The operation to perform. */
      public var operation: Operation? = null,
      /**
       * Evaluates the results of previous operations to determine if the server under test behaves
       * appropriately.
       *
       * In order to evaluate an assertion, the request, response, and results of the most recently
       * executed operation must always be maintained by the test engine.
       */
      public var assert: Assert? = null,
    ) : BackboneElement() {
      /** The operation to perform. */
      @Serializable(with = TestScriptSetupActionOperationSerializer::class)
      public class Operation(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met as part of the
         * definition of the extension.
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var extension: List<Extension?>? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
         * DomainResource (including cannot change the meaning of modifierExtension itself).
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var modifierExtension: List<Extension?>? = null,
        /**
         * Server interaction or operation type.
         *
         * See http://build.fhir.org/http.html for list of server interactions.
         */
        public var type: Coding? = null,
        /**
         * The type of the resource. See http://build.fhir.org/resourcelist.html.
         *
         * If "url" element is specified, then "targetId", "params", and "resource" elements will be
         * ignored as "url" element will have everything needed for constructing the request url. If
         * "params" element is specified, then "targetId" element is ignored. For FHIR operations
         * that require a resource (e.g. "read" and "vread" operations), the "resource" element must
         * be specified when "params" element is specified. If "url" and "params" elements are
         * absent, then the request url will be constructed from "targetId" fixture if present. For
         * "read" operation, the resource and id values will be extracted from "targetId" fixture
         * and used to construct the url. For "vread" and "history" operations, the versionId value
         * will also be used.
         */
        public var resource: Enumeration<FHIRDefinedType>? = null,
        /**
         * The label would be used for tracking/logging purposes by test engines.
         *
         * This has no impact on the verification itself.
         */
        public var label: String? = null,
        /**
         * The description would be used by test engines for tracking and reporting purposes.
         *
         * This has no impact on the verification itself.
         */
        public var description: String? = null,
        /**
         * The mime-type to use for RESTful operation in the 'Accept' header.
         *
         * If this is specified, then test engine shall set the 'Accept' header to the corresponding
         * value. If you'd like to explicitly set the 'Accept' to some other value then use the
         * 'requestHeader' element.
         */
        public var accept: Code? = null,
        /**
         * The mime-type to use for RESTful operation in the 'Content-Type' header.
         *
         * If this is specified, then test engine shall set the 'Content-Type' header to the
         * corresponding value. If you'd like to explicitly set the 'Content-Type' to some other
         * value then use the 'requestHeader' element.
         */
        public var contentType: Code? = null,
        /**
         * The server where the request message is destined for. Must be one of the server numbers
         * listed in TestScript.destination section.
         *
         * If multiple TestScript.destination elements are defined and operation.destination is
         * undefined, test engine will report an error as it cannot determine what destination to
         * use for the exchange.
         */
        public var destination: Integer? = null,
        /**
         * Whether or not to implicitly send the request url in encoded format. The default is true
         * to match the standard RESTful client behavior. Set to false when communicating with a
         * server that does not support encoded url paths.
         */
        public var encodeRequestUrl: Boolean? = null,
        /**
         * The HTTP method the test engine MUST use for this operation regardless of any other
         * operation details.
         *
         * The primary purpose of the explicit HTTP method is support of HTTP POST method invocation
         * of the FHIR search. Other uses will include support of negative testing.
         */
        public var method: Enumeration<TestScriptRequestMethodCode>? = null,
        /**
         * The server where the request message originates from. Must be one of the server numbers
         * listed in TestScript.origin section.
         *
         * If absent, test engine will send the message. When present, test engine will not send the
         * request message but will wait for the request message to be sent from this origin server.
         */
        public var origin: Integer? = null,
        /**
         * Path plus parameters after [type]. Used to set parts of the request URL explicitly.
         *
         * If "url" element is specified, then "targetId", "params", and "resource" elements will be
         * ignored as "url" element will have everything needed for constructing the request url. If
         * "params" element is specified, then "targetId" element is ignored. For FHIR operations
         * that require a resource (e.g. "read" and "vread" operations), the "resource" element must
         * be specified when "params" element is specified. If "url" and "params" elements are
         * absent, then the request url will be constructed from "targetId" fixture if present. For
         * "read" operation, the resource and id values will be extracted from "targetId" fixture
         * and used to construct the url. For "vread" and "history" operations, the versionId value
         * will also be used. Test engines would append whatever is specified for "params" to the
         * URL after the resource type without tampering with the string (beyond encoding the URL
         * for HTTP). The "params" element does not correspond exactly to "search parameters". Nor
         * is it the "path". It corresponds to the part of the URL that comes after the [type] (when
         * "resource" element is specified); e.g. It corresponds to "/[id]/_history/[vid]
         * {?_format=[mime-type]}" in the following operation: GET [base]/[type]/[id]/_history/[vid]
         * {?_format=[mime-type]} Test engines do have to look for placeholders (${}) and replace
         * the variable placeholders with the variable values at runtime before sending the request.
         */
        public var params: String? = null,
        /**
         * Header elements would be used to set HTTP headers.
         *
         * This gives control to test-script writers to set headers explicitly based on test
         * requirements. It will allow for testing using: - "If-Modified-Since" and "If-None-Match"
         * headers. See http://build.fhir.org/http.html#2.1.0.5.1 - "If-Match" header. See
         * http://build.fhir.org/http.html#2.1.0.11 - Conditional Create using "If-None-Exist". See
         * http://build.fhir.org/http.html#2.1.0.13.1 - Invalid "Content-Type" header for negative
         * testing. - etc.
         */
        public var requestHeader: List<RequestHeader>? = null,
        /**
         * The fixture id (maybe new) to map to the request.
         *
         * If a requestId is supplied, then the resulting request (both headers and body) is mapped
         * to the fixture ID (which may be entirely new and previously undeclared) designated by
         * "requestId". If requestId is not specified, it is the test engine's responsibility to
         * store the request and use it as the requestId in subsequent assertions when assertion
         * path and/or headerField is specified, direction is equal to request, and the requestId in
         * not specified.
         */
        public var requestId: Id? = null,
        /**
         * The fixture id (maybe new) to map to the response.
         *
         * If a responseId is supplied, and the server responds, then the resulting response (both
         * headers and body) is mapped to the fixture ID (which may be entirely new and previously
         * undeclared) designated by "responseId". If responseId is not specified, it is the test
         * engine's responsibility to store the response and use it as the responseId in subsequent
         * assertions when assertion path and/or headerField is specified and the responseId is not
         * specified.
         */
        public var responseId: Id? = null,
        /** The id of the fixture used as the body of a PUT or POST request. */
        public var sourceId: Id? = null,
        /**
         * Id of fixture used for extracting the [id], [type], and [vid] for GET requests.
         *
         * If "url" element is specified, then "targetId", "params", and "resource" elements will be
         * ignored as "url" element will have everything needed for constructing the request url. If
         * "params" element is specified, then "targetId" element is ignored. For FHIR operations
         * that require a resource (e.g. "read" and "vread" operations), the "resource" element must
         * be specified when "params" element is specified. If "url" and "params" elements are
         * absent, then the request url will be constructed from "targetId" fixture if present. For
         * "read" operation, the resource and id values will be extracted from "targetId" fixture
         * and used to construct the url. For "vread" and "history" operations, the versionId value
         * will also be used.
         */
        public var targetId: Id? = null,
        /**
         * Complete request URL.
         *
         * Used to set the request URL explicitly. If "url" element is defined, then "targetId",
         * "resource", and "params" elements will be ignored. Test engines would use whatever is
         * specified in "url" without tampering with the string (beyond encoding the URL for HTTP).
         * Test engines do have to look for placeholders (${}) and replace the variable placeholders
         * with the variable values at runtime before sending the request.
         */
        public var url: String? = null,
      ) : BackboneElement() {
        /** Header elements would be used to set HTTP headers. */
        @Serializable(with = TestScriptSetupActionOperationRequestHeaderSerializer::class)
        public class RequestHeader(
          /**
           * Unique id for the element within a resource (for internal references). This may be any
           * string value that does not contain spaces.
           */
          override var id: kotlin.String? = null,
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element. To make the use of extensions safe and manageable, there is
           * a strict set of governance applied to the definition and use of extensions. Though any
           * implementer can define an extension, there is a set of requirements that SHALL be met
           * as part of the definition of the extension.
           *
           * There can be no stigma associated with the use of extensions by any application,
           * project, or standard - regardless of the institution or jurisdiction that uses or
           * defines the extensions. The use of extensions is what allows the FHIR specification to
           * retain a core level of simplicity for everyone.
           */
          override var extension: List<Extension?>? = null,
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element and that modifies the understanding of the element in which
           * it is contained and/or the understanding of the containing element's descendants.
           * Usually modifier elements provide negation or qualification. To make the use of
           * extensions safe and manageable, there is a strict set of governance applied to the
           * definition and use of extensions. Though any implementer can define an extension, there
           * is a set of requirements that SHALL be met as part of the definition of the extension.
           * Applications processing a resource are required to check for modifier extensions.
           *
           * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
           * DomainResource (including cannot change the meaning of modifierExtension itself).
           *
           * There can be no stigma associated with the use of extensions by any application,
           * project, or standard - regardless of the institution or jurisdiction that uses or
           * defines the extensions. The use of extensions is what allows the FHIR specification to
           * retain a core level of simplicity for everyone.
           */
          override var modifierExtension: List<Extension?>? = null,
          /**
           * The HTTP header field e.g. "Accept".
           *
           * If header element is specified, then field is required.
           */
          public var `field`: String? = null,
          /**
           * The value of the header e.g. "application/fhir+xml".
           *
           * If header element is specified, then value is required. No conversions will be done by
           * the test engine e.g. "xml" to "application/fhir+xml". The values will be set in HTTP
           * headers "as-is". Test engines do have to look for placeholders (${}) and replace the
           * variable placeholders with the variable values at runtime before sending the request.
           */
          public var `value`: String? = null,
        ) : BackboneElement()
      }

      /**
       * Evaluates the results of previous operations to determine if the server under test behaves
       * appropriately.
       */
      @Serializable(with = TestScriptSetupActionAssertSerializer::class)
      public class Assert(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and manageable, there is a strict set
         * of governance applied to the definition and use of extensions. Though any implementer can
         * define an extension, there is a set of requirements that SHALL be met as part of the
         * definition of the extension.
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var extension: List<Extension?>? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element and that modifies the understanding of the element in which it is
         * contained and/or the understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use of extensions safe
         * and manageable, there is a strict set of governance applied to the definition and use of
         * extensions. Though any implementer can define an extension, there is a set of
         * requirements that SHALL be met as part of the definition of the extension. Applications
         * processing a resource are required to check for modifier extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
         * DomainResource (including cannot change the meaning of modifierExtension itself).
         *
         * There can be no stigma associated with the use of extensions by any application, project,
         * or standard - regardless of the institution or jurisdiction that uses or defines the
         * extensions. The use of extensions is what allows the FHIR specification to retain a core
         * level of simplicity for everyone.
         */
        override var modifierExtension: List<Extension?>? = null,
        /**
         * The label would be used for tracking/logging purposes by test engines.
         *
         * This has no impact on the verification itself.
         */
        public var label: String? = null,
        /**
         * The description would be used by test engines for tracking and reporting purposes.
         *
         * This has no impact on the verification itself.
         */
        public var description: String? = null,
        /**
         * The direction to use for the assertion.
         *
         * If the direction is specified as "response" (the default), then the processing of this
         * assert is against the received response message. If the direction is specified as
         * "request", then the processing of this assert is against the sent request message.
         */
        public var direction: Enumeration<AssertionDirectionType>? = null,
        /**
         * Id of the source fixture used as the contents to be evaluated by either the
         * "source/expression" or "sourceId/path" definition.
         */
        public var compareToSourceId: String? = null,
        /**
         * The FHIRPath expression to evaluate against the source fixture. When compareToSourceId is
         * defined, either compareToSourceExpression or compareToSourcePath must be defined, but not
         * both.
         *
         * Thefhirpath expression to be evaluated against the expected fixture to compare to.
         * Ignored if "assert.value" is used. The evaluation will be done before the assertion is
         * evaluated.
         */
        public var compareToSourceExpression: String? = null,
        /**
         * XPath or JSONPath expression to evaluate against the source fixture. When
         * compareToSourceId is defined, either compareToSourceExpression or compareToSourcePath
         * must be defined, but not both.
         *
         * The XPath or JSONPath expression to be evaluated against the expected fixture to compare
         * to. Ignored if "assert.value" is used. The evaluation will be done before the assertion
         * is evaluated.
         */
        public var compareToSourcePath: String? = null,
        /**
         * The mime-type contents to compare against the request or response message 'Content-Type'
         * header.
         *
         * If this is specified, then test engine shall confirm that the content-type of the last
         * operation's headers is set to this value. If "assert.sourceId" element is specified, then
         * the evaluation will be done against the headers mapped to that sourceId (and not the last
         * operation's headers). If you'd like to have more control over the string, then use
         * 'assert.headerField' instead.
         */
        public var contentType: Code? = null,
        /**
         * The FHIRPath expression to be evaluated against the request or response message
         * contents - HTTP headers and payload.
         *
         * If both "expression" and a "fixtureId" are specified, then the expression will be
         * evaluated against the request or response body mapped to the fixtureId. If "expression"
         * is specified and a "fixtureId" is not, then the expression will be evaluated against the
         * response body of the last operation. Test engines are to store the request and response
         * body and headers of the last operation at all times for subsequent assertions.
         */
        public var expression: String? = null,
        /**
         * The HTTP header field name e.g. 'Location'.
         *
         * If "headerField" is specified then "value" must be specified. If "sourceId" is not
         * specified, then "headerField" will be evaluated against the last operation's response
         * headers. Test engines are to keep track of the last operation's response body and
         * response headers.
         */
        public var headerField: String? = null,
        /**
         * The ID of a fixture. Asserts that the response contains at a minimum the fixture
         * specified by minimumId.
         *
         * Asserts that the response contains all the element/content in another fixture pointed to
         * by minimumId. This can be a statically defined fixture or one that is dynamically set via
         * responseId.
         */
        public var minimumId: String? = null,
        /**
         * Whether or not the test execution performs validation on the bundle navigation links.
         *
         * Asserts that the Bundle contains first, last, and next links.
         */
        public var navigationLinks: Boolean? = null,
        /**
         * The operator type defines the conditional behavior of the assert. If not defined, the
         * default is equals.
         *
         * Operators are useful especially for negative testing. If operator is not specified, then
         * the "equals" operator is assumed; e.g. ```<code> <assert> <operator value="in" />
         * <responseCode value="200,201,204" /> </assert> <assert> <operator value="notEquals" />
         * <response value="okay"/> </assert> <assert> <operator value="greaterThan" />
         * <responseHeader> <field value="Content-Length" /> <value value="0" /> </responseHeader/>
         * </assert> </code> ```.
         */
        public var `operator`: Enumeration<AssertionOperatorType>? = null,
        /**
         * The XPath or JSONPath expression to be evaluated against the fixture representing the
         * response received from server.
         *
         * If both "path" and a "fixtureId" are specified, then the path will be evaluated against
         * the request or response body mapped to the fixtureId. If "path" is specified and a
         * "fixtureId" is not, then the path will be evaluated against the response body of the last
         * operation. Test engines are to store the request and response body and headers of the
         * last operation at all times for subsequent assertions.
         */
        public var path: String? = null,
        /**
         * The request method or HTTP operation code to compare against that used by the client
         * system under test.
         *
         * If "requestMethod" is specified then it will be used in place of "value". The
         * "requestMethod" will evaluate against the last operation's request HTTP operation.
         */
        public var requestMethod: Enumeration<TestScriptRequestMethodCode>? = null,
        /**
         * The value to use in a comparison against the request URL path string.
         *
         * If "requestURL" is specified then it will be used in place of "value". The "requestURL"
         * will evaluate against the last operation's full request URL path string.
         */
        public var requestURL: String? = null,
        /**
         * The type of the resource. See http://build.fhir.org/resourcelist.html.
         *
         * This will be expected resource type in response body e.g. in read, vread, search, etc.
         * See http://build.fhir.org/resourcelist.html for complete list of resource types; e.g.
         * <assert > <resourceType value="Patient" </assert>.
         */
        public var resource: Enumeration<FHIRDefinedType>? = null,
        /**
         * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed
         * | conflict | gone | preconditionFailed | unprocessable.
         *
         * This is a shorter way of achieving similar verifications via "assert.responseCode". If
         * you need more control, then use "assert.responseCode" e.g. <assert> <contentType
         * value="json" /> <response value="okay"/> </assert>.
         */
        public var response: Enumeration<AssertionResponseTypes>? = null,
        /**
         * The value of the HTTP response code to be tested.
         *
         * To be used with "operator" attribute value. Asserts that the response code equals this
         * value if "operator" is not specified. If the operator is "in" or "notIn" then the
         * responseCode would be a comma-separated list of values e.g. "200,201". Otherwise, it's
         * expected to be a numeric value. If "fixture" is not specified, then the "responseBodyId"
         * value of the last operation is assumed.
         */
        public var responseCode: String? = null,
        /**
         * Fixture to evaluate the XPath/JSONPath expression or the headerField against.
         *
         * This can be a statically defined fixture (at the top of the testscript) or a dynamically
         * set fixture created by responseId of the action.operation element.
         */
        public var sourceId: Id? = null,
        /**
         * The ID of the Profile to validate against.
         *
         * The ID of a Profile fixture. Asserts that the response is valid according to the Profile
         * specified by validateProfileId.
         */
        public var validateProfileId: Id? = null,
        /**
         * The value to compare to.
         *
         * The string-representation of a number, string, or boolean that is expected. Test engines
         * do have to look for placeholders (${}) and replace the variable placeholders with the
         * variable values at runtime before comparing this value to the actual value.
         */
        public var `value`: String? = null,
        /**
         * Whether or not the test execution will produce a warning only on error for this assert.
         *
         * If this element is specified and it is true, then assertion failures can be logged by
         * test engine but should not stop the test script execution from proceeding. There are
         * likely cases where the spec is not clear on what should happen. If the spec says
         * something is optional (maybe a response header for example), but a server doesn’t do it,
         * we could choose to issue a warning.
         */
        public var warningOnly: Boolean? = null,
      ) : BackboneElement()
    }
  }

  /** A test in this script. */
  @Serializable(with = TestScriptTestSerializer::class)
  public class Test(
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
    /** The name of this test used for tracking/logging purposes by test engines. */
    public var name: String? = null,
    /** A short description of the test used by test engines for tracking and reporting purposes. */
    public var description: String? = null,
    /**
     * Action would contain either an operation or an assertion.
     *
     * An action should contain either an operation or an assertion but not both. It can contain any
     * number of variables.
     */
    public var action: List<Action>? = null,
  ) : BackboneElement() {
    /** Action would contain either an operation or an assertion. */
    @Serializable(with = TestScriptTestActionSerializer::class)
    public class Action(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: List<Extension?>? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: List<Extension?>? = null,
      /** An operation would involve a REST request to a server. */
      public var operation: Setup.Action.Operation? = null,
      /**
       * Evaluates the results of previous operations to determine if the server under test behaves
       * appropriately.
       *
       * In order to evaluate an assertion, the request, response, and results of the most recently
       * executed operation must always be maintained by the test engine.
       */
      public var assert: Setup.Action.Assert? = null,
    ) : BackboneElement()
  }

  /**
   * A series of operations required to clean up after all the tests are executed (successfully or
   * otherwise).
   */
  @Serializable(with = TestScriptTeardownSerializer::class)
  public class Teardown(
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
     * The teardown action will only contain an operation.
     *
     * An action should contain either an operation or an assertion but not both. It can contain any
     * number of variables.
     */
    public var action: List<Action>? = null,
  ) : BackboneElement() {
    /** The teardown action will only contain an operation. */
    @Serializable(with = TestScriptTeardownActionSerializer::class)
    public class Action(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and manageable, there is a strict set of
       * governance applied to the definition and use of extensions. Though any implementer can
       * define an extension, there is a set of requirements that SHALL be met as part of the
       * definition of the extension.
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var extension: List<Extension?>? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element and that modifies the understanding of the element in which it is contained
       * and/or the understanding of the containing element's descendants. Usually modifier elements
       * provide negation or qualification. To make the use of extensions safe and manageable, there
       * is a strict set of governance applied to the definition and use of extensions. Though any
       * implementer can define an extension, there is a set of requirements that SHALL be met as
       * part of the definition of the extension. Applications processing a resource are required to
       * check for modifier extensions.
       *
       * Modifier extensions SHALL NOT change the meaning of any elements on Resource or
       * DomainResource (including cannot change the meaning of modifierExtension itself).
       *
       * There can be no stigma associated with the use of extensions by any application, project,
       * or standard - regardless of the institution or jurisdiction that uses or defines the
       * extensions. The use of extensions is what allows the FHIR specification to retain a core
       * level of simplicity for everyone.
       */
      override var modifierExtension: List<Extension?>? = null,
      /** An operation would involve a REST request to a server. */
      public var operation: Setup.Action.Operation? = null,
    ) : BackboneElement()
  }

  /** The allowable request method or HTTP operation codes. */
  public enum class TestScriptRequestMethodCode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** HTTP DELETE operation. */
    Delete("delete", "http://hl7.org/fhir/http-operations", "DELETE", "HTTP DELETE operation."),
    /** HTTP GET operation. */
    Get("get", "http://hl7.org/fhir/http-operations", "GET", "HTTP GET operation."),
    /** HTTP OPTIONS operation. */
    Options("options", "http://hl7.org/fhir/http-operations", "OPTIONS", "HTTP OPTIONS operation."),
    /** HTTP PATCH operation. */
    Patch("patch", "http://hl7.org/fhir/http-operations", "PATCH", "HTTP PATCH operation."),
    /** HTTP POST operation. */
    Post("post", "http://hl7.org/fhir/http-operations", "POST", "HTTP POST operation."),
    /** HTTP PUT operation. */
    Put("put", "http://hl7.org/fhir/http-operations", "PUT", "HTTP PUT operation."),
    /** HTTP HEAD operation. */
    Head("head", "http://hl7.org/fhir/http-operations", "HEAD", "HTTP HEAD operation.");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): TestScriptRequestMethodCode =
        when (code) {
          "delete" -> Delete
          "get" -> Get
          "options" -> Options
          "patch" -> Patch
          "post" -> Post
          "put" -> Put
          "head" -> Head
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum TestScriptRequestMethodCode"
            )
        }
    }
  }

  /** The type of direction to use for assertion. */
  public enum class AssertionDirectionType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The assertion is evaluated on the response. This is the default value. */
    Response(
      "response",
      "http://hl7.org/fhir/assert-direction-codes",
      "response",
      "The assertion is evaluated on the response. This is the default value.",
    ),
    /** The assertion is evaluated on the request. */
    Request(
      "request",
      "http://hl7.org/fhir/assert-direction-codes",
      "request",
      "The assertion is evaluated on the request.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): AssertionDirectionType =
        when (code) {
          "response" -> Response
          "request" -> Request
          else ->
            throw IllegalArgumentException("Unknown code $code for enum AssertionDirectionType")
        }
    }
  }

  /** The type of operator to use for assertion. */
  public enum class AssertionOperatorType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Default value. Equals comparison. */
    Equals(
      "equals",
      "http://hl7.org/fhir/assert-operator-codes",
      "equals",
      "Default value. Equals comparison.",
    ),
    /** Not equals comparison. */
    NotEquals(
      "notEquals",
      "http://hl7.org/fhir/assert-operator-codes",
      "notEquals",
      "Not equals comparison.",
    ),
    /** Compare value within a known set of values. */
    In(
      "in",
      "http://hl7.org/fhir/assert-operator-codes",
      "in",
      "Compare value within a known set of values.",
    ),
    /** Compare value not within a known set of values. */
    NotIn(
      "notIn",
      "http://hl7.org/fhir/assert-operator-codes",
      "notIn",
      "Compare value not within a known set of values.",
    ),
    /** Compare value to be greater than a known value. */
    GreaterThan(
      "greaterThan",
      "http://hl7.org/fhir/assert-operator-codes",
      "greaterThan",
      "Compare value to be greater than a known value.",
    ),
    /** Compare value to be less than a known value. */
    LessThan(
      "lessThan",
      "http://hl7.org/fhir/assert-operator-codes",
      "lessThan",
      "Compare value to be less than a known value.",
    ),
    /** Compare value is empty. */
    Empty("empty", "http://hl7.org/fhir/assert-operator-codes", "empty", "Compare value is empty."),
    /** Compare value is not empty. */
    NotEmpty(
      "notEmpty",
      "http://hl7.org/fhir/assert-operator-codes",
      "notEmpty",
      "Compare value is not empty.",
    ),
    /** Compare value string contains a known value. */
    Contains(
      "contains",
      "http://hl7.org/fhir/assert-operator-codes",
      "contains",
      "Compare value string contains a known value.",
    ),
    /** Compare value string does not contain a known value. */
    NotContains(
      "notContains",
      "http://hl7.org/fhir/assert-operator-codes",
      "notContains",
      "Compare value string does not contain a known value.",
    ),
    /** Evaluate the FHIRPath expression as a boolean condition. */
    Eval(
      "eval",
      "http://hl7.org/fhir/assert-operator-codes",
      "evaluate",
      "Evaluate the FHIRPath expression as a boolean condition.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): AssertionOperatorType =
        when (code) {
          "equals" -> Equals
          "notEquals" -> NotEquals
          "in" -> In
          "notIn" -> NotIn
          "greaterThan" -> GreaterThan
          "lessThan" -> LessThan
          "empty" -> Empty
          "notEmpty" -> NotEmpty
          "contains" -> Contains
          "notContains" -> NotContains
          "eval" -> Eval
          else ->
            throw IllegalArgumentException("Unknown code $code for enum AssertionOperatorType")
        }
    }
  }

  /** The type of response code to use for assertion. */
  public enum class AssertionResponseTypes(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Response code is 200. */
    Okay("okay", "http://hl7.org/fhir/assert-response-code-types", "okay", "Response code is 200."),
    /** Response code is 201. */
    Created(
      "created",
      "http://hl7.org/fhir/assert-response-code-types",
      "created",
      "Response code is 201.",
    ),
    /** Response code is 204. */
    NoContent(
      "noContent",
      "http://hl7.org/fhir/assert-response-code-types",
      "noContent",
      "Response code is 204.",
    ),
    /** Response code is 304. */
    NotModified(
      "notModified",
      "http://hl7.org/fhir/assert-response-code-types",
      "notModified",
      "Response code is 304.",
    ),
    /** Response code is 400. */
    Bad("bad", "http://hl7.org/fhir/assert-response-code-types", "bad", "Response code is 400."),
    /** Response code is 403. */
    Forbidden(
      "forbidden",
      "http://hl7.org/fhir/assert-response-code-types",
      "forbidden",
      "Response code is 403.",
    ),
    /** Response code is 404. */
    NotFound(
      "notFound",
      "http://hl7.org/fhir/assert-response-code-types",
      "notFound",
      "Response code is 404.",
    ),
    /** Response code is 405. */
    MethodNotAllowed(
      "methodNotAllowed",
      "http://hl7.org/fhir/assert-response-code-types",
      "methodNotAllowed",
      "Response code is 405.",
    ),
    /** Response code is 409. */
    Conflict(
      "conflict",
      "http://hl7.org/fhir/assert-response-code-types",
      "conflict",
      "Response code is 409.",
    ),
    /** Response code is 410. */
    Gone("gone", "http://hl7.org/fhir/assert-response-code-types", "gone", "Response code is 410."),
    /** Response code is 412. */
    PreconditionFailed(
      "preconditionFailed",
      "http://hl7.org/fhir/assert-response-code-types",
      "preconditionFailed",
      "Response code is 412.",
    ),
    /** Response code is 422. */
    Unprocessable(
      "unprocessable",
      "http://hl7.org/fhir/assert-response-code-types",
      "unprocessable",
      "Response code is 422.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): AssertionResponseTypes =
        when (code) {
          "okay" -> Okay
          "created" -> Created
          "noContent" -> NoContent
          "notModified" -> NotModified
          "bad" -> Bad
          "forbidden" -> Forbidden
          "notFound" -> NotFound
          "methodNotAllowed" -> MethodNotAllowed
          "conflict" -> Conflict
          "gone" -> Gone
          "preconditionFailed" -> PreconditionFailed
          "unprocessable" -> Unprocessable
          else ->
            throw IllegalArgumentException("Unknown code $code for enum AssertionResponseTypes")
        }
    }
  }
}
