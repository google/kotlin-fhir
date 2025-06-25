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

import com.google.fhir.model.r5.serializers.QuestionnaireItemAnswerOptionSerializer
import com.google.fhir.model.r5.serializers.QuestionnaireItemEnableWhenSerializer
import com.google.fhir.model.r5.serializers.QuestionnaireItemInitialSerializer
import com.google.fhir.model.r5.serializers.QuestionnaireItemSerializer
import com.google.fhir.model.r5.serializers.QuestionnaireSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A structured set of questions intended to guide the collection of answers from end-users.
 * Questionnaires provide detailed control over order, presentation, phraseology and grouping to
 * allow coherent, consistent data collection.
 */
@Serializable(with = QuestionnaireSerializer::class)
@SerialName("Questionnaire")
public data class Questionnaire(
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
   * An absolute URI that is used to identify this questionnaire when it is referenced in a
   * specification, model, design or an instance; also called its canonical identifier. This SHOULD
   * be globally unique and SHOULD be a literal address at which an authoritative instance of this
   * questionnaire is (or will be) published. This URL can be the target of a canonical reference.
   * It SHALL remain the same when the questionnaire is stored on different servers.
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
   *
   * The name of the referenced questionnaire can be conveyed using the
   * http://hl7.org/fhir/StructureDefinition/display extension.
   */
  public var url: Uri? = null,
  /**
   * A formal identifier that is used to identify this questionnaire when it is represented in other
   * formats, or referenced in a specification, model, design or an instance.
   *
   * Typically, this is used for identifiers that can go in an HL7 V3 II (instance identifier) data
   * type, and can then identify this questionnaire outside of FHIR, where it is not possible to use
   * the logical URI.
   */
  public var identifier: List<Identifier?>? = null,
  /**
   * The identifier that is used to identify this version of the questionnaire when it is referenced
   * in a specification, model, design or instance. This is an arbitrary value managed by the
   * questionnaire author and is not expected to be globally unique. For example, it might be a
   * timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation
   * that versions can be placed in a lexicographical sequence.
   *
   * There may be different questionnaires that have the same url but different versions. The
   * version can be appended to the url in a reference to allow a reference to a particular business
   * version of the questionnaire with the format. The version SHOULD NOT contain a '#' - see
   * [Business Version](resource.html#bv-format).
   */
  public var version: String? = null,
  /**
   * Indicates the mechanism used to compare versions to determine which is more current.
   *
   * If set as a string, this is a FHIRPath expression that has two additional context variables
   * passed in - %version1 and %version2 and will return a negative number if version1 is newer, a
   * positive number if version2 and a 0 if the version ordering can't be successfully be
   * determined.
   */
  public var versionAlgorithm: VersionAlgorithm? = null,
  /**
   * A natural language name identifying the questionnaire. This name should be usable as an
   * identifier for the module by machine processing applications such as code generation.
   *
   * The name is not expected to be globally unique. The name should be a simple alphanumeric type
   * no-whitespace name to ensure that it is machine-processing friendly.
   */
  public var name: String? = null,
  /**
   * A short, descriptive, user-friendly title for the questionnaire.
   *
   * This name does not need to be machine-processing friendly and may contain punctuation,
   * white-space, etc.
   */
  public var title: String? = null,
  /**
   * The URL of a Questionnaire that this Questionnaire is based on.
   *
   * This element covers a broad range of relationships, from 'somewhat inspired by' to 'fully
   * compliant with'. There is a standard extensionthat allows clearer differentiation between the
   * specifics of the derivation relationship where this is needed - e.g. to determine
   * substitutability and validation
   * expectations - [http://hl7.org/fhir/StructureDefinition/questionnaire-derivationType](http://hl7.org/fhir/extensions/StructureDefinition-questionnaire-derivationType.html).
   */
  public var derivedFrom: List<Canonical?>? = null,
  /**
   * The current state of this questionnaire.
   *
   * A nominal state-transition diagram can be found in the] documentation
   *
   * Unknown does not represent 'other' - one of the defined statuses must apply. Unknown is used
   * when the authoring system is not sure what the current status is.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var status: Enumeration<PublicationStatus>? = null,
  /**
   * A Boolean value to indicate that this questionnaire is authored for testing purposes (or
   * education/evaluation/marketing) and is not intended for genuine usage.
   *
   * Allows filtering of questionnaires that are appropriate for use versus not.
   */
  public var experimental: Boolean? = null,
  /**
   * The types of subjects that can be the subject of responses created for the questionnaire.
   *
   * If none are specified, then the subject is unlimited.
   */
  public var subjectType: List<Enumeration<ResourceType>>? = null,
  /**
   * The date (and optionally time) when the questionnaire was last significantly changed. The date
   * must change when the business version changes and it must change if the status code changes. In
   * addition, it should change when the substantive content of the questionnaire changes.
   *
   * The date is often not tracked until the resource is published, but may be present on draft
   * content. Note that this is not the same as the resource last-modified-date, since the resource
   * may be a secondary representation of the questionnaire. Additional specific dates may be added
   * as extensions or be found by consulting Provenances associated with past versions of the
   * resource.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var date: DateTime? = null,
  /**
   * The name of the organization or individual responsible for the release and ongoing maintenance
   * of the questionnaire.
   *
   * Usually an organization but may be an individual. The publisher (or steward) of the
   * questionnaire is the organization or individual primarily responsible for the maintenance and
   * upkeep of the questionnaire. This is not necessarily the same individual or organization that
   * developed and initially authored the content. The publisher is the primary point of contact for
   * questions or issues with the questionnaire. This item SHOULD be populated unless the
   * information is available from context.
   */
  public var publisher: String? = null,
  /**
   * Contact details to assist a user in finding and communicating with the publisher.
   *
   * May be a web site, an email address, a telephone number, etc.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var contact: List<ContactDetail?>? = null,
  /**
   * A free text natural language description of the questionnaire from a consumer's perspective.
   *
   * This description can be used to capture details such as comments about misuse, instructions for
   * clinical use and interpretation, literature references, examples from the paper world, etc. It
   * is not a rendering of the questionnaire as conveyed in the 'text' field of the resource itself.
   * This item SHOULD be populated unless the information is available from context. (E.g. the
   * language of the questionnaire is presumed to be the predominant language in the place the
   * questionnaire was created).
   */
  public var description: Markdown? = null,
  /**
   * The content was developed with a focus and intent of supporting the contexts that are listed.
   * These contexts may be general categories (gender, age, ...) or may be references to specific
   * programs (insurance plans, studies, ...) and may be used to assist with indexing and searching
   * for appropriate questionnaires.
   *
   * When multiple useContexts are specified, there is no expectation that all or even any of the
   * contexts apply.
   */
  public var useContext: List<UsageContext?>? = null,
  /**
   * A legal or geographic region in which the questionnaire is intended to be used.
   *
   * It may be possible for the questionnaire to be used in jurisdictions other than those for which
   * it was originally designed or intended.
   *
   * DEPRECATION NOTE: For consistency, implementations are encouraged to migrate to using the new
   * 'jurisdiction' code in the useContext element. (I.e. useContext.code indicating
   * http://terminology.hl7.org/CodeSystem/usage-context-type#jurisdiction and
   * useContext.valueCodeableConcept indicating the jurisdiction.)
   */
  public var jurisdiction: List<CodeableConcept?>? = null,
  /**
   * Explanation of why this questionnaire is needed and why it has been designed as it has.
   *
   * This element does not describe the usage of the questionnaire. Instead, it provides
   * traceability of ''why'' the resource is either needed or ''why'' it is defined as it is. This
   * may be used to point to source materials or specifications that drove the structure of this
   * questionnaire.
   */
  public var purpose: Markdown? = null,
  /**
   * A copyright statement relating to the questionnaire and/or its contents. Copyright statements
   * are generally legal restrictions on the use and publishing of the questionnaire.
   */
  public var copyright: Markdown? = null,
  /**
   * A short string (<50 characters), suitable for inclusion in a page footer that identifies the
   * copyright holder, effective period, and optionally whether rights are resctricted. (e.g. 'All
   * rights reserved', 'Some rights reserved').
   *
   * The (c) symbol should NOT be included in this string. It will be added by software when
   * rendering the notation. Full details about licensing, restrictions, warrantees, etc. goes in
   * the more general 'copyright' element.
   */
  public var copyrightLabel: String? = null,
  /**
   * The date on which the resource content was approved by the publisher. Approval happens once
   * when the content is officially approved for usage.
   *
   * The 'date' element may be more recent than the approval date because of minor changes or
   * editorial corrections.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var approvalDate: Date? = null,
  /**
   * The date on which the resource content was last reviewed. Review happens periodically after
   * approval but does not change the original approval date.
   *
   * If specified, this date follows the original approval date.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var lastReviewDate: Date? = null,
  /**
   * The period during which the questionnaire content was or is planned to be in active use.
   *
   * The effective period for a questionnaire determines when the content is applicable for usage
   * and is independent of publication and review dates. For example, a questionnaire intended to be
   * used for the year 2016 might be published in 2015.
   *
   * See guidance around (not) making local changes to elements
   * [here](canonicalresource.html#localization).
   */
  public var effectivePeriod: Period? = null,
  /** An identifier for this collection of questions in a particular terminology such as LOINC. */
  public var code: List<Coding?>? = null,
  /**
   * A particular question, question grouping or display text that is part of the questionnaire.
   *
   * The content of the questionnaire is constructed from an ordered, hierarchical collection of
   * items.
   */
  public var item: List<Item>? = null,
) : DomainResource() {
  /** A particular question, question grouping or display text that is part of the questionnaire. */
  @Serializable(with = QuestionnaireItemSerializer::class)
  public class Item(
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
    /**
     * An identifier that is unique within the Questionnaire allowing linkage to the equivalent item
     * in a QuestionnaireResponse resource.
     *
     * This ''can'' be a meaningful identifier (e.g. a LOINC code) but is not intended to have any
     * meaning. GUIDs or sequential numbers are appropriate here.
     *
     * LinkIds can have whitespaces and slashes by design. Tooling should not rely on linkIds being
     * valid XHTML element IDs, and should not directly embed them as such
     */
    public var linkId: String? = null,
    /**
     * This element is a URI that refers to an [ElementDefinition](elementdefinition.html) or to an
     * [ObservationDefinition](observationdefinition.html) that provides information about this
     * item, including information that might otherwise be included in the instance of the
     * Questionnaire resource. A detailed description of the construction of the URI is shown in
     * [Comments](questionnaire.html#definition), below.
     *
     * The uri refers to an ElementDefinition in a [StructureDefinition](structuredefinition.html#)
     * or to an [ObservationDefinition](observationdefinition.html) and always starts with the
     * [canonical URL](references.html#canonical) for the target resource. When referring to a
     * StructureDefinition, a fragment identifier is used to specify the element definition by its
     * id [Element.id](types-definitions.html#Element.id). E.g.
     * http://hl7.org/fhir/StructureDefinition/Observation#Observation.value[x]. In the absence of a
     * fragment identifier, the first/root element definition in the target is the matching element
     * definition.
     */
    public var definition: Uri? = null,
    /**
     * A terminology code that corresponds to this group or question (e.g. a code from LOINC, which
     * defines many questions and answers).
     *
     * The value may come from the ElementDefinition referred to by .definition.
     */
    public var code: List<Coding?>? = null,
    /**
     * A short label for a particular group, question or set of display text within the
     * questionnaire used for reference by the individual completing the questionnaire.
     *
     * These are generally unique within a questionnaire, though this is not guaranteed. Some
     * questionnaires may have multiple questions with the same label with logic to control which
     * gets exposed. Typically, these won't be used for "display" items, though such use is not
     * prohibited. Systems SHOULD NOT generate their own prefixes if prefixes are defined for any
     * items within a Questionnaire.
     */
    public var prefix: String? = null,
    /**
     * The name of a section, the text of a question or text content for a display item.
     *
     * When using this element to represent the name of a section, use group type item and also make
     * sure to limit the text element to a short string suitable for display as a section heading.
     * Group item instructions should be included as a display type item within the group.
     */
    public var text: String? = null,
    /**
     * The type of questionnaire item this is - whether text for display, a grouping of other items
     * or a particular type of data to be captured (string, integer, Coding, etc.).
     *
     * Additional constraints on the type of answer can be conveyed by extensions. The value may
     * come from the ElementDefinition referred to by .definition.
     */
    public var type: Enumeration<QuestionnaireItemType>? = null,
    /**
     * A constraint indicating that this item should only be enabled (displayed/allow answers to be
     * captured) when the specified condition is true.
     *
     * If multiple repetitions of this extension are present, the interpretation is driven by
     * enableBehavior (either all repetitions must evaluate to true for this item to be enabled, or
     * only one must evaluate to true for the item to be enabled). If the enableWhen.question has
     * multiple answers, the condition evaluates to true if *any* of the answers for the referenced
     * item match the enableWhen condition. This element is a modifier because if enableWhen is
     * present for an item, "required" is ignored unless one of the enableWhen conditions is met.
     * When an item is disabled, all of its descendants are disabled, regardless of what their own
     * enableWhen logic might evaluate to. If enableWhen logic depends on an item that is disabled,
     * the logic should proceed as though the item is not valued - even if a default value or other
     * value might be retained in memory in the event of the item being re-enabled. In some cases,
     * the comparison between the indicated answer and the specified value may differ only by
     * precision. For example, the enableWhen might be Q1 > 1970, but the answer to Q1 is
     * 1970-10-15. There is not a clear answer as to whether 1970-10-15 should be considered
     * 'greater' than 1970, given that it is an imprecise value. In these indeterminate situations,
     * the form filler has the option of refusing to render the form. If the form **is** displayed,
     * items where enableWhen is indeterminate SHOULD be treated as enabled with a warning
     * indicating that the questionnaire logic was faulty and it is possible that the item should
     * not be enabled. Questionnaires SHOULD be designed to take into account challenges around
     * varying precision to minimize non-deterministic situations by setting constraints around
     * expected precision, etc.
     */
    public var enableWhen: List<EnableWhen>? = null,
    /**
     * Controls how multiple enableWhen values are interpreted - whether all or any must be true.
     *
     * This element must be specified if more than one enableWhen value is provided.
     */
    public var enableBehavior: Enumeration<EnableWhenBehavior>? = null,
    /**
     * Indicates if and how items that are disabled (because enableWhen evaluates to 'false') should
     * be displayed.
     *
     * If not specified, rendering behavior is up to the client. This element is only meaningful if
     * enableWhen or an equivalent extension is present
     */
    public var disabledDisplay: Enumeration<DisabledDisplay>? = null,
    /**
     * An indication, if true, that the item must be present in a "completed" QuestionnaireResponse.
     * If false, the item may be skipped when answering the questionnaire.
     *
     * If the required item is a question, it must have a direct answer (i.e. an answer to the
     * question itself, not merely answers to child questions) in order for the
     * QuestionnaireResponse to be complete. If the required item is a group, it must have at least
     * one descendant question which has an answer Questionnaire.item.required only has meaning for
     * elements that are conditionally enabled with enableWhen if the condition evaluates to true.
     * It also only has meaning if the parent element is present. If a non-required 'group' item
     * contains a 'required' question item, it's completely fine to omit the group (because it's not
     * required) despite it having a required child. Similarly, if an item that contains other items
     * is marked as required, that does not automatically make the contained elements required
     * (though required groups must contain at least one descendant item with a populated answer).
     * The value for 'required' may come from the ElementDefinition referred to by .definition.
     */
    public var required: Boolean? = null,
    /**
     * An indication, if true, that a QuestionnaireResponse for this item may include multiple
     * answers associated with a single instance of this item (for question-type items) or multiple
     * repetitions of the item (for group-type items).
     *
     * If a question is marked as repeats=true, then multiple answers can be provided for the
     * question in the corresponding QuestionnaireResponse. When rendering the questionnaire, it is
     * up to the rendering software whether to render the question text for each answer repetition
     * (i.e. "repeat the question") or to simply allow entry/selection of multiple answers for the
     * question (repeat the answers). Which is most appropriate visually may depend on the type of
     * answer as well as whether there are nested items.
     *
     * The resulting QuestionnaireResponse will be populated the same way regardless of rendering -
     * one 'question' item with multiple answer values.
     *
     * The value may come from the ElementDefinition referred to by .definition. When repeats=true
     * for a group, it'll be represented with multiple items with the same linkId in the
     * QuestionnaireResponse. For a question, it'll be represented by a single item with that linkId
     * with multiple answers.
     */
    public var repeats: Boolean? = null,
    /**
     * An indication, when true, that the value cannot be changed by a human respondent to the
     * Questionnaire.
     *
     * If specified on a 'group', then all items beneath the specified group are read only. For
     * questions, this only marks the answer associated with the specific item read only. Descendant
     * questions are not impacted. The value of readOnly elements can be established by asserting
     * extensions for defaultValues, linkages that support pre-population and/or extensions that
     * support calculation based on other answers.
     */
    public var readOnly: Boolean? = null,
    /**
     * The maximum number of characters that are permitted in the answer to be considered a "valid"
     * QuestionnaireResponse.
     *
     * For base64binary, reflects the number of characters representing the encoded data, not the
     * number of bytes of the binary data. The value may come from the ElementDefinition referred to
     * by .definition.
     */
    public var maxLength: Integer? = null,
    /**
     * For items that have a defined set of allowed answers (via answerOption or answerValueSet),
     * indicates whether values *other* than those specified can be selected.
     */
    public var answerConstraint: Enumeration<QuestionnaireAnswerConstraint>? = null,
    /**
     * A reference to a value set containing a list of values representing permitted answers for a
     * question.
     *
     * LOINC defines many useful value sets for questionnaire responses. See
     * [LOINC Answer Lists](https://terminology.hl7.org/LOINC.html). The value may come from the
     * ElementDefinition referred to by .definition.
     */
    public var answerValueSet: Canonical? = null,
    /**
     * One of the permitted answers for the question.
     *
     * This element can be used when the value set machinery of answerValueSet is deemed too
     * cumbersome or when there's a need to capture possible answers that are not codes.
     */
    public var answerOption: List<AnswerOption>? = null,
    /**
     * One or more values that should be pre-populated in the answer when initially rendering the
     * questionnaire for user input.
     *
     * The user is allowed to change the value and override the default (unless marked as
     * read-only). If the user doesn't change the value, then this initial value will be persisted
     * when the QuestionnaireResponse is initially created. Note that initial values can influence
     * results. The data type of initial.answer[x] must agree with the item.type, and only repeating
     * items can have more then one initial value.
     */
    public var initial: List<Initial>? = null,
    /**
     * Text, questions and other groups to be nested beneath a question or group.
     *
     * There is no specified limit to the depth of nesting. However, Questionnaire authors are
     * encouraged to consider the impact on the user and user interface of overly deep nesting.
     */
    public var item: List<Item?>? = null,
  ) : BackboneElement() {
    /**
     * A constraint indicating that this item should only be enabled (displayed/allow answers to be
     * captured) when the specified condition is true.
     */
    @Serializable(with = QuestionnaireItemEnableWhenSerializer::class)
    public class EnableWhen(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and managable, there is a strict set of
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
       * provide negation or qualification. To make the use of extensions safe and managable, there
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
       * The linkId for the question whose answer (or lack of answer) governs whether this item is
       * enabled.
       *
       * If multiple question occurrences are present for the same question (same linkId), then this
       * refers to the nearest question occurrence reachable by tracing first the "ancestor" axis
       * and then the "preceding" axis and then the "following" axis. If there are multiple items
       * with the same linkId and all are equadistant (e.g. a question references a question that
       * appears in a separate repeating group), that is an error. (Consider using the
       * enableWhenExpression extension to define logic to handle such a situation.)
       */
      public var question: String? = null,
      /** Specifies the criteria by which the question is enabled. */
      public var `operator`: Enumeration<QuestionnaireItemOperator>? = null,
      /**
       * A value that the referenced question is tested using the specified operator in order for
       * the item to be enabled. If there are multiple answers, a match on any of the answers
       * suffices. If different behavior is desired (all must match, at least 2 must match, etc.),
       * consider using the enableWhenExpression extension.
       */
      public var answer: Answer? = null,
    ) : BackboneElement() {
      public sealed interface Answer {
        public fun asBoolean(): Boolean? = this as? Boolean

        public fun asDecimal(): Decimal? = this as? Decimal

        public fun asInteger(): Integer? = this as? Integer

        public fun asDate(): Date? = this as? Date

        public fun asDateTime(): DateTime? = this as? DateTime

        public fun asTime(): Time? = this as? Time

        public fun asString(): String? = this as? String

        public fun asCoding(): Coding? = this as? Coding

        public fun asQuantity(): Quantity? = this as? Quantity

        public fun asReference(): Reference? = this as? Reference

        public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Answer

        public data class Decimal(public val `value`: com.google.fhir.model.r5.Decimal) : Answer

        public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Answer

        public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Answer

        public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Answer

        public data class Time(public val `value`: com.google.fhir.model.r5.Time) : Answer

        public data class String(public val `value`: com.google.fhir.model.r5.String) : Answer

        public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) : Answer

        public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Answer

        public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) :
          Answer

        public companion object {
          public fun from(
            booleanValue: com.google.fhir.model.r5.Boolean?,
            decimalValue: com.google.fhir.model.r5.Decimal?,
            integerValue: com.google.fhir.model.r5.Integer?,
            dateValue: com.google.fhir.model.r5.Date?,
            dateTimeValue: com.google.fhir.model.r5.DateTime?,
            timeValue: com.google.fhir.model.r5.Time?,
            stringValue: com.google.fhir.model.r5.String?,
            CodingValue: com.google.fhir.model.r5.Coding?,
            QuantityValue: com.google.fhir.model.r5.Quantity?,
            ReferenceValue: com.google.fhir.model.r5.Reference?,
          ): Answer? {
            if (booleanValue != null) return Boolean(booleanValue)
            if (decimalValue != null) return Decimal(decimalValue)
            if (integerValue != null) return Integer(integerValue)
            if (dateValue != null) return Date(dateValue)
            if (dateTimeValue != null) return DateTime(dateTimeValue)
            if (timeValue != null) return Time(timeValue)
            if (stringValue != null) return String(stringValue)
            if (CodingValue != null) return Coding(CodingValue)
            if (QuantityValue != null) return Quantity(QuantityValue)
            if (ReferenceValue != null) return Reference(ReferenceValue)
            return null
          }
        }
      }
    }

    /** One of the permitted answers for the question. */
    @Serializable(with = QuestionnaireItemAnswerOptionSerializer::class)
    public class AnswerOption(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and managable, there is a strict set of
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
       * provide negation or qualification. To make the use of extensions safe and managable, there
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
       * A potential answer that's allowed as the answer to this question.
       *
       * The data type of the value must agree with the item.type.
       */
      public var `value`: Value? = null,
      /**
       * Indicates whether the answer value is selected when the list of possible answers is
       * initially shown.
       */
      public var initialSelected: Boolean? = null,
    ) : BackboneElement() {
      public sealed interface Value {
        public fun asInteger(): Integer? = this as? Integer

        public fun asDate(): Date? = this as? Date

        public fun asTime(): Time? = this as? Time

        public fun asString(): String? = this as? String

        public fun asCoding(): Coding? = this as? Coding

        public fun asReference(): Reference? = this as? Reference

        public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Value

        public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Value

        public data class Time(public val `value`: com.google.fhir.model.r5.Time) : Value

        public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

        public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) : Value

        public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Value

        public companion object {
          public fun from(
            integerValue: com.google.fhir.model.r5.Integer?,
            dateValue: com.google.fhir.model.r5.Date?,
            timeValue: com.google.fhir.model.r5.Time?,
            stringValue: com.google.fhir.model.r5.String?,
            CodingValue: com.google.fhir.model.r5.Coding?,
            ReferenceValue: com.google.fhir.model.r5.Reference?,
          ): Value? {
            if (integerValue != null) return Integer(integerValue)
            if (dateValue != null) return Date(dateValue)
            if (timeValue != null) return Time(timeValue)
            if (stringValue != null) return String(stringValue)
            if (CodingValue != null) return Coding(CodingValue)
            if (ReferenceValue != null) return Reference(ReferenceValue)
            return null
          }
        }
      }
    }

    /**
     * One or more values that should be pre-populated in the answer when initially rendering the
     * questionnaire for user input.
     */
    @Serializable(with = QuestionnaireItemInitialSerializer::class)
    public class Initial(
      /**
       * Unique id for the element within a resource (for internal references). This may be any
       * string value that does not contain spaces.
       */
      override var id: kotlin.String? = null,
      /**
       * May be used to represent additional information that is not part of the basic definition of
       * the element. To make the use of extensions safe and managable, there is a strict set of
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
       * provide negation or qualification. To make the use of extensions safe and managable, there
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
       * The actual value to for an initial answer.
       *
       * The type of the initial value must be consistent with the type of the item.
       */
      public var `value`: Value? = null,
    ) : BackboneElement() {
      public sealed interface Value {
        public fun asBoolean(): Boolean? = this as? Boolean

        public fun asDecimal(): Decimal? = this as? Decimal

        public fun asInteger(): Integer? = this as? Integer

        public fun asDate(): Date? = this as? Date

        public fun asDateTime(): DateTime? = this as? DateTime

        public fun asTime(): Time? = this as? Time

        public fun asString(): String? = this as? String

        public fun asUri(): Uri? = this as? Uri

        public fun asAttachment(): Attachment? = this as? Attachment

        public fun asCoding(): Coding? = this as? Coding

        public fun asQuantity(): Quantity? = this as? Quantity

        public fun asReference(): Reference? = this as? Reference

        public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

        public data class Decimal(public val `value`: com.google.fhir.model.r5.Decimal) : Value

        public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Value

        public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Value

        public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Value

        public data class Time(public val `value`: com.google.fhir.model.r5.Time) : Value

        public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

        public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : Value

        public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) :
          Value

        public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) : Value

        public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

        public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Value

        public companion object {
          public fun from(
            booleanValue: com.google.fhir.model.r5.Boolean?,
            decimalValue: com.google.fhir.model.r5.Decimal?,
            integerValue: com.google.fhir.model.r5.Integer?,
            dateValue: com.google.fhir.model.r5.Date?,
            dateTimeValue: com.google.fhir.model.r5.DateTime?,
            timeValue: com.google.fhir.model.r5.Time?,
            stringValue: com.google.fhir.model.r5.String?,
            uriValue: com.google.fhir.model.r5.Uri?,
            AttachmentValue: com.google.fhir.model.r5.Attachment?,
            CodingValue: com.google.fhir.model.r5.Coding?,
            QuantityValue: com.google.fhir.model.r5.Quantity?,
            ReferenceValue: com.google.fhir.model.r5.Reference?,
          ): Value? {
            if (booleanValue != null) return Boolean(booleanValue)
            if (decimalValue != null) return Decimal(decimalValue)
            if (integerValue != null) return Integer(integerValue)
            if (dateValue != null) return Date(dateValue)
            if (dateTimeValue != null) return DateTime(dateTimeValue)
            if (timeValue != null) return Time(timeValue)
            if (stringValue != null) return String(stringValue)
            if (uriValue != null) return Uri(uriValue)
            if (AttachmentValue != null) return Attachment(AttachmentValue)
            if (CodingValue != null) return Coding(CodingValue)
            if (QuantityValue != null) return Quantity(QuantityValue)
            if (ReferenceValue != null) return Reference(ReferenceValue)
            return null
          }
        }
      }
    }
  }

  public sealed interface VersionAlgorithm {
    public fun asString(): String? = this as? String

    public fun asCoding(): Coding? = this as? Coding

    public data class String(public val `value`: com.google.fhir.model.r5.String) :
      VersionAlgorithm

    public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) :
      VersionAlgorithm

    public companion object {
      public fun from(
        stringValue: com.google.fhir.model.r5.String?,
        CodingValue: com.google.fhir.model.r5.Coding?,
      ): VersionAlgorithm? {
        if (stringValue != null) return String(stringValue)
        if (CodingValue != null) return Coding(CodingValue)
        return null
      }
    }
  }

  /** Distinguishes groups from questions and display text and indicates data type for questions. */
  public enum class QuestionnaireItemType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** An item with no direct answer but should have at least one child item. */
    Group(
      "group",
      "http://hl7.org/fhir/item-type",
      "Group",
      "An item with no direct answer but should have at least one child item.",
    ),
    /** Text for display that will not capture an answer or have child items. */
    Display(
      "display",
      "http://hl7.org/fhir/item-type",
      "Display",
      "Text for display that will not capture an answer or have child items.",
    ),
    /**
     * An item that defines a specific answer to be captured, and which may have child items. (the
     * answer provided in the QuestionnaireResponse should be of the defined datatype).
     */
    Question(
      "question",
      "http://hl7.org/fhir/item-type",
      "Question",
      "An item that defines a specific answer to be captured, and which may have child items. (the answer provided in the QuestionnaireResponse should be of the defined datatype).",
    ),
    /** Question with a yes/no answer (valueBoolean). */
    Boolean(
      "boolean",
      "http://hl7.org/fhir/item-type",
      "Boolean",
      "Question with a yes/no answer (valueBoolean).",
    ),
    /**
     * Question with is a real number answer (valueDecimal). There is an extension
     * 'http://hl7.org/fhir/StructureDefinition/questionnaire-unit' that can be used to computably
     * convey the unit of measure associated with the answer for use when performing data extraction
     * to an element of type Quantity.
     */
    Decimal(
      "decimal",
      "http://hl7.org/fhir/item-type",
      "Decimal",
      "Question with is a real number answer (valueDecimal).  There is an extension 'http://hl7.org/fhir/StructureDefinition/questionnaire-unit' that can be used to computably convey the unit of measure associated with the answer for use when performing data extraction to an element of type Quantity.",
    ),
    /**
     * Question with an integer answer (valueInteger). There is an extension
     * 'http://hl7.org/fhir/StructureDefinition/questionnaire-unit' that can be used to computably
     * convey the unit of measure associated with the answer for use when performing data extraction
     * to an element of type Quantity.
     */
    Integer(
      "integer",
      "http://hl7.org/fhir/item-type",
      "Integer",
      "Question with an integer answer (valueInteger).  There is an extension 'http://hl7.org/fhir/StructureDefinition/questionnaire-unit' that can be used to computably convey the unit of measure associated with the answer for use when performing data extraction to an element of type Quantity.",
    ),
    /** Question with a date answer (valueDate). */
    Date(
      "date",
      "http://hl7.org/fhir/item-type",
      "Date",
      "Question with a date answer (valueDate).",
    ),
    /** Question with a date and time answer (valueDateTime). */
    DateTime(
      "dateTime",
      "http://hl7.org/fhir/item-type",
      "Date Time",
      "Question with a date and time answer (valueDateTime).",
    ),
    /** Question with a time (hour:minute:second) answer independent of date. (valueTime). */
    Time(
      "time",
      "http://hl7.org/fhir/item-type",
      "Time",
      "Question with a time (hour:minute:second) answer independent of date. (valueTime).",
    ),
    /**
     * Question with a short (few words to short sentence) free-text entry answer (valueString).
     * Strings SHOULD NOT contain carriage return or newline characters. If multi-line answers are
     * needed, use the 'text' type.
     */
    String(
      "string",
      "http://hl7.org/fhir/item-type",
      "String",
      "Question with a short (few words to short sentence) free-text entry answer (valueString).  Strings SHOULD NOT contain carriage return or newline characters.  If multi-line answers are needed, use the 'text' type.",
    ),
    /** Question with a long (potentially multi-paragraph) free-text entry answer (valueString). */
    Text(
      "text",
      "http://hl7.org/fhir/item-type",
      "Text",
      "Question with a long (potentially multi-paragraph) free-text entry answer (valueString).",
    ),
    /** Question with a URL (website, FTP site, etc.) answer (valueUri). */
    Url(
      "url",
      "http://hl7.org/fhir/item-type",
      "Url",
      "Question with a URL (website, FTP site, etc.) answer (valueUri).",
    ),
    /** Question with a Coding - generally drawn from a list of possible answers (valueCoding) */
    Coding(
      "coding",
      "http://hl7.org/fhir/item-type",
      "Coding",
      "Question with a Coding - generally drawn from a list of possible answers (valueCoding)",
    ),
    /** Question with binary content such as an image, PDF, etc. as an answer (valueAttachment). */
    Attachment(
      "attachment",
      "http://hl7.org/fhir/item-type",
      "Attachment",
      "Question with binary content such as an image, PDF, etc. as an answer (valueAttachment).",
    ),
    /**
     * Question with a reference to another resource (practitioner, organization, etc.) as an answer
     * (valueReference).
     */
    Reference(
      "reference",
      "http://hl7.org/fhir/item-type",
      "Reference",
      "Question with a reference to another resource (practitioner, organization, etc.) as an answer (valueReference).",
    ),
    /**
     * Question with a combination of a numeric value and unit as an answer. (valueSimpleQuantity)
     * There are two extensions ('http://hl7.org/fhir/StructureDefinition/questionnaire-unitOption'
     * and 'http://hl7.org/fhir/StructureDefinition/questionnaire-unitValueSet') that can be used to
     * define what unit should be selected for the Quantity.code and Quantity.system.
     */
    Quantity(
      "quantity",
      "http://hl7.org/fhir/item-type",
      "Quantity",
      "Question with a combination of a numeric value and unit as an answer. (valueSimpleQuantity)  There are two extensions ('http://hl7.org/fhir/StructureDefinition/questionnaire-unitOption' and 'http://hl7.org/fhir/StructureDefinition/questionnaire-unitValueSet')  that can be used to define what unit should be selected for the Quantity.code and Quantity.system.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): QuestionnaireItemType =
        when (code) {
          "group" -> Group
          "display" -> Display
          "question" -> Question
          "boolean" -> Boolean
          "decimal" -> Decimal
          "integer" -> Integer
          "date" -> Date
          "dateTime" -> DateTime
          "time" -> Time
          "string" -> String
          "text" -> Text
          "url" -> Url
          "coding" -> Coding
          "attachment" -> Attachment
          "reference" -> Reference
          "quantity" -> Quantity
          else ->
            throw IllegalArgumentException("Unknown code $code for enum QuestionnaireItemType")
        }
    }
  }

  /** Controls how multiple enableWhen values are interpreted - whether all or any must be true. */
  public enum class EnableWhenBehavior(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** Enable the question when all the enableWhen criteria are satisfied. */
    All(
      "all",
      "http://hl7.org/fhir/questionnaire-enable-behavior",
      "All",
      "Enable the question when all the enableWhen criteria are satisfied.",
    ),
    /** Enable the question when any of the enableWhen criteria are satisfied. */
    Any(
      "any",
      "http://hl7.org/fhir/questionnaire-enable-behavior",
      "Any",
      "Enable the question when any of the enableWhen criteria are satisfied.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): EnableWhenBehavior =
        when (code) {
          "all" -> All
          "any" -> Any
          else -> throw IllegalArgumentException("Unknown code $code for enum EnableWhenBehavior")
        }
    }
  }

  /** Codes that guide the display of disabled questionnaire items */
  public enum class DisabledDisplay(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The item (and its children) should not be visible to the user at all. */
    Hidden(
      "hidden",
      "http://hl7.org/fhir/questionnaire-disabled-display",
      "Hidden",
      "The item (and its children) should not be visible to the user at all.",
    ),
    /**
     * The item (and possibly its children) should not be selectable or editable but should still be
     * visible - to allow the user to see what questions *could* have been completed had other
     * answers caused the item to be enabled.
     */
    Protected(
      "protected",
      "http://hl7.org/fhir/questionnaire-disabled-display",
      "Protected",
      "The item (and possibly its children) should not be selectable or editable but should still be visible - to allow the user to see what questions *could* have been completed had other answers caused the item to be enabled.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): DisabledDisplay =
        when (code) {
          "hidden" -> Hidden
          "protected" -> Protected
          else -> throw IllegalArgumentException("Unknown code $code for enum DisabledDisplay")
        }
    }
  }

  /**
   * Codes that describe the types of constraints possible on a question item that has a list of
   * permitted answers
   */
  public enum class QuestionnaireAnswerConstraint(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * Only values listed as answerOption or in the expansion of the answerValueSet are permitted
     */
    OptionsOnly(
      "optionsOnly",
      "http://hl7.org/fhir/questionnaire-answer-constraint",
      "Options only",
      "Only values listed as answerOption or in the expansion of the answerValueSet are permitted",
    ),
    /**
     * In addition to the values listed as answerOption or in the expansion of the answerValueSet,
     * any other values that correspond to the specified item.type are permitted
     */
    OptionsOrType(
      "optionsOrType",
      "http://hl7.org/fhir/questionnaire-answer-constraint",
      "Options or 'type'",
      "In addition to the values listed as answerOption or in the expansion of the answerValueSet, any other values that correspond to the specified item.type are permitted",
    ),
    /**
     * In addition to the values listed as answerOption or in the expansion of the answerValueSet,
     * free-text strings are permitted. Answers will have a type of 'string'.
     */
    OptionsOrString(
      "optionsOrString",
      "http://hl7.org/fhir/questionnaire-answer-constraint",
      "Options or string",
      "In addition to the values listed as answerOption or in the expansion of the answerValueSet, free-text strings are permitted.  Answers will have a type of 'string'.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): QuestionnaireAnswerConstraint =
        when (code) {
          "optionsOnly" -> OptionsOnly
          "optionsOrType" -> OptionsOrType
          "optionsOrString" -> OptionsOrString
          else ->
            throw IllegalArgumentException(
              "Unknown code $code for enum QuestionnaireAnswerConstraint"
            )
        }
    }
  }

  /** The criteria by which a question is enabled. */
  public enum class QuestionnaireItemOperator(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * True if the determination of 'whether an answer exists for the question' is equal to the
     * enableWhen answer (which must be a boolean).
     */
    Exists(
      "exists",
      "http://hl7.org/fhir/questionnaire-enable-operator",
      "Exists",
      "True if the determination of 'whether an answer exists for the question' is equal to the enableWhen answer (which must be a boolean).",
    ),
    /** True if at least one answer has a value that is equal to the enableWhen answer. */
    EqualTo(
      "=",
      "http://hl7.org/fhir/questionnaire-enable-operator",
      "Equals",
      "True if at least one answer has a value that is equal to the enableWhen answer.",
    ),
    /** True if no answer has a value that is equal to the enableWhen answer. */
    NotEqualTo(
      "!=",
      "http://hl7.org/fhir/questionnaire-enable-operator",
      "Not Equals",
      "True if no answer has a value that is equal to the enableWhen answer.",
    ),
    /** True if at least one answer has a value that is greater than the enableWhen answer. */
    GreaterThan(
      ">",
      "http://hl7.org/fhir/questionnaire-enable-operator",
      "Greater Than",
      "True if at least one answer has a value that is greater than the enableWhen answer.",
    ),
    /** True if at least one answer has a value that is less than the enableWhen answer. */
    LessThan(
      "<",
      "http://hl7.org/fhir/questionnaire-enable-operator",
      "Less Than",
      "True if at least one answer has a value that is less than the enableWhen answer.",
    ),
    /**
     * True if at least one answer has a value that is greater or equal to the enableWhen answer.
     */
    GreaterThanOrEqualTo(
      ">=",
      "http://hl7.org/fhir/questionnaire-enable-operator",
      "Greater or Equals",
      "True if at least one answer has a value that is greater or equal to the enableWhen answer.",
    ),
    /** True if at least one answer has a value that is less or equal to the enableWhen answer. */
    LessThanOrEqualTo(
      "<=",
      "http://hl7.org/fhir/questionnaire-enable-operator",
      "Less or Equals",
      "True if at least one answer has a value that is less or equal to the enableWhen answer.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): QuestionnaireItemOperator =
        when (code) {
          "exists" -> Exists
          "=" -> EqualTo
          "!=" -> NotEqualTo
          ">" -> GreaterThan
          "<" -> LessThan
          ">=" -> GreaterThanOrEqualTo
          "<=" -> LessThanOrEqualTo
          else ->
            throw IllegalArgumentException("Unknown code $code for enum QuestionnaireItemOperator")
        }
    }
  }
}
