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

import com.google.fhir.model.r4b.serializers.ListEntrySerializer
import com.google.fhir.model.r4b.serializers.ListSerializer
import kotlin.Suppress
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** A list is a curated collection of resources. */
@Serializable(with = ListSerializer::class)
@SerialName("List")
public data class List(
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
  override var contained: kotlin.collections.List<Resource?>? = null,
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
  override var extension: kotlin.collections.List<Extension?>? = null,
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
  override var modifierExtension: kotlin.collections.List<Extension?>? = null,
  /** Identifier for the List assigned for business purposes outside the context of FHIR. */
  public var identifier: kotlin.collections.List<Identifier?>? = null,
  /**
   * Indicates the current state of this list.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<ListStatus>? = null,
  /**
   * How this list was prepared - whether it is a working list that is suitable for being maintained
   * on an ongoing basis, or if it represents a snapshot of a list of items from another source, or
   * whether it is a prepared list where items may be marked as added, modified or deleted.
   *
   * This element is labeled as a modifier because a change list must not be misunderstood as a
   * complete list.
   */
  public var mode: Enumeration<ListMode>? = null,
  /** A label for the list assigned by the author. */
  public var title: String? = null,
  /**
   * This code defines the purpose of the list - why it was created.
   *
   * If there is no code, the purpose of the list is implied where it is used, such as in a document
   * section using Document.section.code.
   */
  public var code: CodeableConcept? = null,
  /**
   * The common subject (or patient) of the resources that are in the list if there is one.
   *
   * Some purely arbitrary lists do not have a common subject, so this is optional.
   */
  public var subject: Reference? = null,
  /** The encounter that is the context in which this list was created. */
  public var encounter: Reference? = null,
  /**
   * The date that the list was prepared.
   *
   * The actual important date is the date of currency of the resources that were summarized, but it
   * is usually assumed that these are current when the preparation occurs.
   */
  public var date: DateTime? = null,
  /**
   * The entity responsible for deciding what the contents of the list were. Where the list was
   * created by a human, this is the same as the author of the list.
   *
   * The primary source is the entity that made the decisions what items are in the list. This may
   * be software or user.
   */
  public var source: Reference? = null,
  /**
   * What order applies to the items in the list.
   *
   * Applications SHOULD render ordered lists in the order provided, but MAY allow users to re-order
   * based on their own preferences as well. If there is no order specified, the order is unknown,
   * though there may still be some order.
   */
  public var orderedBy: CodeableConcept? = null,
  /** Comments that apply to the overall list. */
  public var note: kotlin.collections.List<Annotation?>? = null,
  /**
   * Entries in this list.
   *
   * If there are no entries in the list, an emptyReason SHOULD be provided.
   */
  public var entry: kotlin.collections.List<Entry>? = null,
  /**
   * If the list is empty, why the list is empty.
   *
   * The various reasons for an empty list make a significant interpretation to its interpretation.
   * Note that this code is for use when the entire list has been suppressed, and not for when
   * individual items are omitted - implementers may consider using a text note or a flag on an
   * entry in these cases.
   */
  public var emptyReason: CodeableConcept? = null,
) : DomainResource() {
  /** Entries in this list. */
  @Serializable(with = ListEntrySerializer::class)
  public class Entry(
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
    override var extension: kotlin.collections.List<Extension?>? = null,
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
    override var modifierExtension: kotlin.collections.List<Extension?>? = null,
    /**
     * The flag allows the system constructing the list to indicate the role and significance of the
     * item in the list.
     *
     * The flag can only be understood in the context of the List.code. If the flag means that the
     * entry has actually been deleted from the list, the deleted element SHALL be true. Deleted can
     * only be used if the List.mode is "changes".
     */
    public var flag: CodeableConcept? = null,
    /**
     * True if this item is marked as deleted in the list.
     *
     * If the flag means that the entry has actually been deleted from the list, the deleted element
     * SHALL be true. Both flag and deleted can only be used if the List.mode is "changes". A
     * deleted entry should be displayed in narrative as deleted. This element is labeled as a
     * modifier because it indicates that an item is (to be) no longer in the list.
     */
    public var deleted: Boolean? = null,
    /** When this item was added to the list. */
    public var date: DateTime? = null,
    /** A reference to the actual resource from which data was derived. */
    public var item: Reference? = null,
  ) : BackboneElement()

  /** The current state of the list. */
  public enum class ListStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The list is considered to be an active part of the patient's record. */
    Current(
      "current",
      "http://hl7.org/fhir/list-status",
      "Current",
      "The list is considered to be an active part of the patient's record.",
    ),
    /** The list is "old" and should no longer be considered accurate or relevant. */
    Retired(
      "retired",
      "http://hl7.org/fhir/list-status",
      "Retired",
      "The list is \"old\" and should no longer be considered accurate or relevant.",
    ),
    /** The list was never accurate. It is retained for medico-legal purposes only. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/list-status",
      "Entered In Error",
      "The list was never accurate.  It is retained for medico-legal purposes only.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ListStatus =
        when (code) {
          "current" -> Current
          "retired" -> Retired
          "entered-in-error" -> Entered_In_Error
          else -> throw IllegalArgumentException("Unknown code $code for enum ListStatus")
        }
    }
  }

  /** The processing mode that applies to this list. */
  public enum class ListMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /**
     * This list is the master list, maintained in an ongoing fashion with regular updates as the
     * real world list it is tracking changes.
     */
    Working(
      "working",
      "http://hl7.org/fhir/list-mode",
      "Working List",
      "This list is the master list, maintained in an ongoing fashion with regular updates as the real world list it is tracking changes.",
    ),
    /** This list was prepared as a snapshot. It should not be assumed to be current. */
    Snapshot(
      "snapshot",
      "http://hl7.org/fhir/list-mode",
      "Snapshot List",
      "This list was prepared as a snapshot. It should not be assumed to be current.",
    ),
    /**
     * A point-in-time list that shows what changes have been made or recommended. E.g. a discharge
     * medication list showing what was added and removed during an encounter.
     */
    Changes(
      "changes",
      "http://hl7.org/fhir/list-mode",
      "Change List",
      "A point-in-time list that shows what changes have been made or recommended.  E.g. a discharge medication list showing what was added and removed during an encounter.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ListMode =
        when (code) {
          "working" -> Working
          "snapshot" -> Snapshot
          "changes" -> Changes
          else -> throw IllegalArgumentException("Unknown code $code for enum ListMode")
        }
    }
  }
}
