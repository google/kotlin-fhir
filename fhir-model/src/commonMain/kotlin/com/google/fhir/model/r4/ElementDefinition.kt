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

package com.google.fhir.model.r4

import com.google.fhir.model.r4.serializers.ElementDefinitionBaseSerializer
import com.google.fhir.model.r4.serializers.ElementDefinitionBindingSerializer
import com.google.fhir.model.r4.serializers.ElementDefinitionConstraintSerializer
import com.google.fhir.model.r4.serializers.ElementDefinitionExampleSerializer
import com.google.fhir.model.r4.serializers.ElementDefinitionMappingSerializer
import com.google.fhir.model.r4.serializers.ElementDefinitionSerializer
import com.google.fhir.model.r4.serializers.ElementDefinitionSlicingDiscriminatorSerializer
import com.google.fhir.model.r4.serializers.ElementDefinitionSlicingSerializer
import com.google.fhir.model.r4.serializers.ElementDefinitionTypeSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * Base StructureDefinition for ElementDefinition Type: Captures constraints on each element within
 * the resource, profile, or extension.
 */
@Serializable(with = ElementDefinitionSerializer::class)
public data class ElementDefinition(
  /**
   * Unique id for the element within a resource (for internal references). This may be any string
   * value that does not contain spaces.
   */
  override var id: kotlin.String? = null,
  /**
   * May be used to represent additional information that is not part of the basic definition of the
   * element. To make the use of extensions safe and manageable, there is a strict set of governance
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
   * element and that modifies the understanding of the element in which it is contained and/or the
   * understanding of the containing element's descendants. Usually modifier elements provide
   * negation or qualification. To make the use of extensions safe and manageable, there is a strict
   * set of governance applied to the definition and use of extensions. Though any implementer can
   * define an extension, there is a set of requirements that SHALL be met as part of the definition
   * of the extension. Applications processing a resource are required to check for modifier
   * extensions.
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
   * The path identifies the element and is expressed as a "."-separated list of ancestor elements,
   * beginning with the name of the resource or extension.
   */
  public var path: String? = null,
  /**
   * Codes that define how this element is represented in instances, when the deviation varies from
   * the normal case.
   *
   * In resources, this is rarely used except for special cases where the representation deviates
   * from the normal, and can only be done in the base standard (and profiles must reproduce what
   * the base standard does). This element is used quite commonly in Logical models when the logical
   * models represent a specific serialization format (e.g. CDA, v2 etc.).
   */
  public var representation: List<Enumeration<PropertyRepresentation>>? = null,
  /**
   * The name of this element definition slice, when slicing is working. The name must be a token
   * with no dots or spaces. This is a unique name referring to a specific set of constraints
   * applied to this element, used to provide a name to different slices of the same element.
   *
   * The name SHALL be unique within the structure within the context of the constrained resource
   * element. (Though to avoid confusion, uniqueness across all elements is recommended.).
   */
  public var sliceName: String? = null,
  /**
   * If true, indicates that this slice definition is constraining a slice definition with the same
   * name in an inherited profile. If false, the slice is not overriding any slice in an inherited
   * profile. If missing, the slice might or might not be overriding a slice in an inherited
   * profile, depending on the sliceName.
   *
   * If set to true, an ancestor profile SHALL have a slicing definition with this name. If set to
   * false, no ancestor profile is permitted to have a slicing definition with this name.
   */
  public var sliceIsConstraining: Boolean? = null,
  /**
   * A single preferred label which is the text to display beside the element indicating its meaning
   * or to use to prompt for the element in a user display or form.
   *
   * See also the extension
   * (http://hl7.org/fhir/StructureDefinition/elementdefinition-question)[extension-elementdefinition-question.html].
   */
  public var label: String? = null,
  /**
   * A code that has the same meaning as the element in a particular terminology.
   *
   * The concept SHALL be properly aligned with the data element definition and other constraints,
   * as defined in the code system, including relationships, of any code listed here. Where multiple
   * codes exist in a terminology that could correspond to the data element, the most granular
   * code(s) should be selected, so long as they are not more restrictive than the data element
   * itself. The mappings may be used to provide more or less granular or structured equivalences in
   * the code system.
   */
  public var code: List<Coding?>? = null,
  /**
   * Indicates that the element is sliced into a set of alternative definitions (i.e. in a structure
   * definition, there are multiple different constraints on a single element in the base resource).
   * Slicing can be used in any resource that has cardinality ..* on the base resource, or any
   * resource with a choice of types. The set of slices is any elements that come after this in the
   * element sequence that have the same path, until a shorter path occurs (the shorter path
   * terminates the set).
   *
   * The first element in the sequence, the one that carries the slicing, is the definition that
   * applies to all the slices. This is based on the unconstrained element, but can apply any
   * constraints as appropriate. This may include the common constraints on the children of the
   * element.
   */
  public var slicing: Slicing? = null,
  /**
   * A concise description of what this element means (e.g. for use in autogenerated summaries).
   *
   * It is easy for a different short definition to change the meaning of an element and this can
   * have nasty downstream consequences. Please be careful when providing short definitions in a
   * profile.
   */
  public var short: String? = null,
  /**
   * Provides a complete explanation of the meaning of the data element for human readability. For
   * the case of elements derived from existing elements (e.g. constraints), the definition SHALL be
   * consistent with the base definition, but convey the meaning of the element in the particular
   * context of use of the resource. (Note: The text you are reading is specified in
   * ElementDefinition.definition).
   *
   * It is easy for a different definition to change the meaning of an element and this can have
   * nasty downstream consequences. Please be careful when providing definitions in a profile.
   */
  public var definition: Markdown? = null,
  /**
   * Explanatory notes and implementation guidance about the data element, including notes about how
   * to use the data properly, exceptions to proper use, etc. (Note: The text you are reading is
   * specified in ElementDefinition.comment).
   *
   * If it is possible to capture usage rules using constraints, that mechanism should be used in
   * preference to this element.
   */
  public var comment: Markdown? = null,
  /**
   * This element is for traceability of why the element was created and why the constraints exist
   * as they do. This may be used to point to source materials or specifications that drove the
   * structure of this element.
   *
   * This element does not describe the usage of the element (that's done in comments), rather it's
   * for traceability of *why* the element is either needed or why the constraints exist as they do.
   * This may be used to point to source materials or specifications that drove the structure of
   * this data element.
   */
  public var requirements: Markdown? = null,
  /** Identifies additional names by which this element might also be known. */
  public var alias: List<String?>? = null,
  /** The minimum number of times this element SHALL appear in the instance. */
  public var min: UnsignedInt? = null,
  /** The maximum number of times this element is permitted to appear in the instance. */
  public var max: String? = null,
  /**
   * Information about the base definition of the element, provided to make it unnecessary for tools
   * to trace the deviation of the element through the derived and related profiles. When the
   * element definition is not the original definition of an element - i.g. either in a constraint
   * on another type, or for elements from a super type in a snap shot - then the information in
   * provided in the element definition may be different to the base definition. On the original
   * definition of the element, it will be same.
   *
   * The base information does not carry any information that could not be determined from the path
   * and related profiles, but making this determination requires both that the related profiles are
   * available, and that the algorithm to determine them be available. For tooling simplicity, the
   * base information must always be populated in element definitions in snap shots, even if it is
   * the same.
   */
  public var base: Base? = null,
  /**
   * Identifies an element defined elsewhere in the definition whose content rules should be applied
   * to the current element. ContentReferences bring across all the rules that are in the
   * ElementDefinition for the element, including definitions, cardinality constraints, bindings,
   * invariants etc.
   *
   * ContentReferences can only be defined in specializations, not constrained types, and they
   * cannot be changed and always reference the non-constrained definition.
   */
  public var contentReference: Uri? = null,
  /**
   * The data type or resource that the value of this element is permitted to be.
   *
   * The Type of the element can be left blank in a differential constraint, in which case the type
   * is inherited from the resource. Abstract types are not permitted to appear as a type when
   * multiple types are listed. (I.e. Abstract types cannot be part of a choice).
   */
  public var type: List<Type>? = null,
  /**
   * The value that should be used if there is no value stated in the instance (e.g. 'if not
   * otherwise specified, the abstract is false').
   *
   * Specifying a default value means that the property can never been unknown - it must always have
   * a value. Further, the default value can never be changed, or changed in constraints on content
   * models. Defining default values creates many difficulties in implementation (e.g. when is a
   * value missing?). For these reasons, default values are (and should be) used extremely
   * sparingly.
   *
   * No default values are ever defined in the FHIR specification, nor can they be defined in
   * constraints ("profiles") on data types or resources. This element only exists so that default
   * values may be defined in logical models.
   */
  public var defaultValue: DefaultValue? = null,
  /**
   * The Implicit meaning that is to be understood when this element is missing (e.g. 'when this
   * element is missing, the period is ongoing').
   *
   * Implicit meanings for missing values can only be specified on a resource, data type, or
   * extension definition, and never in a profile that applies to one of these. An implicit meaning
   * for a missing value can never be changed, and specifying one has the consequence that
   * constraining its use in profiles eliminates use cases as possibilities, not merely moving them
   * out of scope.
   */
  public var meaningWhenMissing: Markdown? = null,
  /**
   * If present, indicates that the order of the repeating element has meaning and describes what
   * that meaning is. If absent, it means that the order of the element has no meaning.
   *
   * This element can only be asserted on repeating elements and can only be introduced when
   * defining resources or data types. It can be further refined profiled elements but if absent in
   * the base type, a profile cannot assert meaning.
   */
  public var orderMeaning: String? = null,
  /**
   * Specifies a value that SHALL be exactly the value for this element in the instance. For
   * purposes of comparison, non-significant whitespace is ignored, and all values must be an exact
   * match (case and accent sensitive). Missing elements/attributes must also be missing.
   *
   * This is not recommended for Coding and CodeableConcept since these often have highly contextual
   * properties such as version or display.
   */
  public var fixed: Fixed? = null,
  /**
   * Specifies a value that the value in the instance SHALL follow - that is, any value in the
   * pattern must be found in the instance. Other additional values may be found too. This is
   * effectively constraint by example.
   *
   * When pattern[x] is used to constrain a primitive, it means that the value provided in the
   * pattern[x] must match the instance value exactly.
   *
   * When pattern[x] is used to constrain an array, it means that each element provided in the
   * pattern[x] array must (recursively) match at least one element from the instance array.
   *
   * When pattern[x] is used to constrain a complex object, it means that each property in the
   * pattern must be present in the complex object, and its value must recursively match -- i.e.,
   * 1. If primitive: it must match exactly the pattern value
   * 2. If a complex object: it must match (recursively) the pattern value
   * 3. If an array: it must match (recursively) the pattern value.
   *
   * Mostly used for fixing values of CodeableConcept. In general, pattern[x] is not intended for
   * use with primitive types, where is has the same meaning as fixed[x].
   */
  public var pattern: Pattern? = null,
  /**
   * A sample value for this element demonstrating the type of information that would typically be
   * found in the element.
   *
   * Examples will most commonly be present for data where it's not implicitly obvious from either
   * the data type or value set what the values might be. (I.e. Example values for dates or
   * quantities would generally be unnecessary.) If the example value is fully populated, the
   * publication tool can generate an instance automatically.
   */
  public var example: List<Example>? = null,
  /**
   * The minimum allowed value for the element. The value is inclusive. This is allowed for the
   * types date, dateTime, instant, time, decimal, integer, and Quantity.
   *
   * Except for date/date/instant, the type of the minValue[x] SHALL be the same as the specified
   * type of the element. For the date/dateTime/instant values, the type of minValue[x] SHALL be
   * either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit
   * to the current time. The duration value is positive, and is subtracted from the current clock
   * to determine the minimum allowable value. A minimum value for a Quantity is interpreted as an
   * canonical minimum - e.g. you cannot provide 100mg if the minimum value is 10g.
   */
  public var minValue: MinValue? = null,
  /**
   * The maximum allowed value for the element. The value is inclusive. This is allowed for the
   * types date, dateTime, instant, time, decimal, integer, and Quantity.
   *
   * Except for date/date/instant, the type of the maxValue[x] SHALL be the same as the specified
   * type of the element. For the date/dateTime/instant values, the type of maxValue[x] SHALL be
   * either the same, or a [Duration](datatypes.html#Duration) which specifies a relative time limit
   * to the current time. The duration value is positive, and is added to the current clock to
   * determine the maximum allowable value. A maximum value for a Quantity is interpreted as an
   * canonical maximum - e.g. you cannot provide 10g if the maximum value is 50mg.
   */
  public var maxValue: MaxValue? = null,
  /**
   * Indicates the maximum length in characters that is permitted to be present in conformant
   * instances and which is expected to be supported by conformant consumers that support the
   * element.
   *
   * Receivers are not required to reject instances that exceed the maximum length. The full length
   * could be stored. In some cases, data might be truncated, though truncation should be undertaken
   * with care and an understanding of the consequences of doing so. If not specified, there is no
   * conformance expectation for length support.
   */
  public var maxLength: Integer? = null,
  /**
   * A reference to an invariant that may make additional statements about the cardinality or value
   * in the instance.
   */
  public var condition: List<Id?>? = null,
  /**
   * Formal constraints such as co-occurrence and other constraints that can be computationally
   * evaluated within the context of the instance.
   *
   * Constraints should be declared on the "context" element - the lowest element in the hierarchy
   * that is common to all nodes referenced by the constraint.
   */
  public var constraint: List<Constraint>? = null,
  /**
   * If true, implementations that produce or consume resources SHALL provide "support" for the
   * element in some meaningful way. If false, the element may be ignored and not supported. If
   * false, whether to populate or use the data element in any way is at the discretion of the
   * implementation.
   *
   * "Something useful" is context dependent and impossible to describe in the base FHIR
   * specification. For this reason, tue mustSupport flag is never set to true by the FHIR
   * specification itself - it is only set to true in profiles. A profile on a type can always make
   * musSupport = true if it is false in the base type but cannot make mustSupport = false if it is
   * true in the base type. This is done in [Resource Profiles](profiling.html#mustsupport), where
   * the profile labels an element as mustSupport=true. When a profile does this, it SHALL also make
   * clear exactly what kind of "support" is required, as this can mean many things. Note that an
   * element that has the property IsModifier is not necessarily a "key" element (e.g. one of the
   * important elements to make use of the resource), nor is it automatically mustSupport - however
   * both of these things are more likely to be true for IsModifier elements than for other
   * elements.
   */
  public var mustSupport: Boolean? = null,
  /**
   * If true, the value of this element affects the interpretation of the element or resource that
   * contains it, and the value of the element cannot be ignored. Typically, this is used for
   * status, negation and qualification codes. The effect of this is that the element cannot be
   * ignored by systems: they SHALL either recognize the element and process it, and/or a
   * pre-determination has been made that it is not relevant to their particular system.
   *
   * Only the definition of an element can set IsModifier true - either the specification itself or
   * where an extension is originally defined. Once set, it cannot be changed in derived profiles.
   * An element/extension that has isModifier=true SHOULD also have a minimum cardinality of 1, so
   * that there is no lack of clarity about what to do if it is missing. If it can be missing, the
   * definition SHALL make the meaning of a missing element clear.
   */
  public var isModifier: Boolean? = null,
  /**
   * Explains how that element affects the interpretation of the resource or element that contains
   * it.
   */
  public var isModifierReason: String? = null,
  /**
   * Whether the element should be included if a client requests a search with the parameter
   * _summary=true.
   *
   * Some resources include a set of simple metadata, and some very large data. This element is used
   * to reduce the quantity of data returned in searches. Note that servers may pre-cache summarized
   * resources for optimal performance, so servers might not support per-profile use of the
   * isSummary flag. When a request is made with _summary=true, serailisers only include elements
   * marked as 'isSummary = true'. Other than Attachment.data, all data type properties are included
   * in the summary form. In resource and data type definitions, if an element is at the root or has
   * a parent that is 'mustSupport' and the minimum cardinality is 1 or the element is a modifier,
   * it must be marked as isSummary=true.
   */
  public var isSummary: Boolean? = null,
  /**
   * Binds to a value set if this element is coded (code, Coding, CodeableConcept, Quantity), or the
   * data types (string, uri).
   *
   * For a CodeableConcept, when no codes are allowed - only text, use a binding of strength
   * "required" with a description explaining that no coded values are allowed and what sort of
   * information to put in the "text" element.
   */
  public var binding: Binding? = null,
  /**
   * Identifies a concept from an external specification that roughly corresponds to this element.
   *
   * Mappings are not necessarily specific enough for safe translation.
   */
  public var mapping: List<Mapping>? = null,
) : BackboneElement() {
  /**
   * Indicates that the element is sliced into a set of alternative definitions (i.e. in a structure
   * definition, there are multiple different constraints on a single element in the base resource).
   * Slicing can be used in any resource that has cardinality ..* on the base resource, or any
   * resource with a choice of types. The set of slices is any elements that come after this in the
   * element sequence that have the same path, until a shorter path occurs (the shorter path
   * terminates the set).
   */
  @Serializable(with = ElementDefinitionSlicingSerializer::class)
  public class Slicing(
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
     * Designates which child elements are used to discriminate between the slices when processing
     * an instance. If one or more discriminators are provided, the value of the child elements in
     * the instance data SHALL completely distinguish which slice the element in the resource
     * matches based on the allowed values for those elements in each of the slices.
     *
     * If there is no discriminator, the content is hard to process, so this should be avoided.
     */
    public var discriminator: List<Discriminator>? = null,
    /**
     * A human-readable text description of how the slicing works. If there is no discriminator,
     * this is required to be present to provide whatever information is possible about how the
     * slices can be differentiated.
     *
     * If it's really not possible to differentiate them, the design should be re-evaluated to make
     * the content usable.
     */
    public var description: String? = null,
    /**
     * If the matching elements have to occur in the same order as defined in the profile.
     *
     * Order should only be required when it is a pressing concern for presentation. Profile authors
     * should consider making the order a feature of the rules about the narrative, not the rules
     * about the data - requiring ordered data makes the profile much less re-usable.
     */
    public var ordered: Boolean? = null,
    /**
     * Whether additional slices are allowed or not. When the slices are ordered, profile authors
     * can also say that additional slices are only allowed at the end.
     *
     * Allowing additional elements makes for a much for flexible template - it's open for use in
     * wider contexts, but also means that the content of the resource is not closed, and
     * applications have to decide how to handle content not described by the profile.
     */
    public var rules: Enumeration<SlicingRules>? = null,
  ) : Element() {
    /**
     * Designates which child elements are used to discriminate between the slices when processing
     * an instance. If one or more discriminators are provided, the value of the child elements in
     * the instance data SHALL completely distinguish which slice the element in the resource
     * matches based on the allowed values for those elements in each of the slices.
     */
    @Serializable(with = ElementDefinitionSlicingDiscriminatorSerializer::class)
    public class Discriminator(
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
      /** How the element value is interpreted when discrimination is evaluated. */
      public var type: Enumeration<DiscriminatorType>? = null,
      /**
       * A FHIRPath expression, using [the simple subset of FHIRPath](fhirpath.html#simple), that is
       * used to identify the element on which discrimination is based.
       *
       * The only FHIRPath functions that are allowed are as(type), resolve(), and extension(url).
       */
      public var path: String? = null,
    ) : Element()
  }

  /**
   * Information about the base definition of the element, provided to make it unnecessary for tools
   * to trace the deviation of the element through the derived and related profiles. When the
   * element definition is not the original definition of an element - i.g. either in a constraint
   * on another type, or for elements from a super type in a snap shot - then the information in
   * provided in the element definition may be different to the base definition. On the original
   * definition of the element, it will be same.
   */
  @Serializable(with = ElementDefinitionBaseSerializer::class)
  public class Base(
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
     * The Path that identifies the base element - this matches the ElementDefinition.path for that
     * element. Across FHIR, there is only one base definition of any element - that is, an element
     * definition on a [StructureDefinition](structuredefinition.html#) without a
     * StructureDefinition.base.
     */
    public var path: String? = null,
    /**
     * Minimum cardinality of the base element identified by the path.
     *
     * This is provided for consistency with max, and may affect code generation of mandatory
     * elements of the base resource are generated differently (some reference implementations have
     * done this).
     */
    public var min: UnsignedInt? = null,
    /**
     * Maximum cardinality of the base element identified by the path.
     *
     * This is provided to code generation, since the serialization representation in JSON differs
     * depending on whether the base element has max > 1. Also, some forms of code generation may
     * differ.
     */
    public var max: String? = null,
  ) : Element()

  /** The data type or resource that the value of this element is permitted to be. */
  @Serializable(with = ElementDefinitionTypeSerializer::class)
  public class Type(
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
     * URL of Data type or Resource that is a(or the) type used for this element. References are
     * URLs that are relative to http://hl7.org/fhir/StructureDefinition e.g. "string" is a
     * reference to http://hl7.org/fhir/StructureDefinition/string. Absolute URLs are only allowed
     * in logical models.
     *
     * If the element is a reference to another resource, this element contains "Reference", and the
     * targetProfile element defines what resources can be referenced. The targetProfile may be a
     * reference to the general definition of a resource (e.g.
     * http://hl7.org/fhir/StructureDefinition/Patient).
     */
    public var code: Uri? = null,
    /**
     * Identifies a profile structure or implementation Guide that applies to the datatype this
     * element refers to. If any profiles are specified, then the content must conform to at least
     * one of them. The URL can be a local reference - to a contained StructureDefinition, or a
     * reference to another StructureDefinition or Implementation Guide by a canonical URL. When an
     * implementation guide is specified, the type SHALL conform to at least one profile defined in
     * the implementation guide.
     *
     * It is possible to profile backbone element (e.g. part of a resource), using the
     * [profile-element](extension-elementdefinition-profile-element.html) extension.
     */
    public var profile: List<Canonical?>? = null,
    /**
     * Used when the type is "Reference" or "canonical", and identifies a profile structure or
     * implementation Guide that applies to the target of the reference this element refers to. If
     * any profiles are specified, then the content must conform to at least one of them. The URL
     * can be a local reference - to a contained StructureDefinition, or a reference to another
     * StructureDefinition or Implementation Guide by a canonical URL. When an implementation guide
     * is specified, the target resource SHALL conform to at least one profile defined in the
     * implementation guide.
     */
    public var targetProfile: List<Canonical?>? = null,
    /**
     * If the type is a reference to another resource, how the resource is or can be aggregated - is
     * it a contained resource, or a reference, and if the context is a bundle, is it included in
     * the bundle.
     *
     * See [Aggregation Rules](elementdefinition.html#aggregation) for further clarification.
     */
    public var aggregation: List<Enumeration<AggregationMode>>? = null,
    /**
     * Whether this reference needs to be version specific or version independent, or whether either
     * can be used.
     *
     * The base specification never makes a rule as to which form is allowed, but implementation
     * guides may do this. See [Aggregation Rules](elementdefinition.html#aggregation) for further
     * clarification.
     */
    public var versioning: Enumeration<ReferenceVersionRules>? = null,
  ) : Element()

  /**
   * A sample value for this element demonstrating the type of information that would typically be
   * found in the element.
   */
  @Serializable(with = ElementDefinitionExampleSerializer::class)
  public class Example(
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
    /** Describes the purpose of this example amoung the set of examples. */
    public var label: String? = null,
    /**
     * The actual value for the element, which must be one of the types allowed for this element.
     */
    public var `value`: Value? = null,
  ) : Element() {
    public sealed interface Value {
      public fun asBase64Binary(): Base64Binary? = this as? Base64Binary

      public fun asBoolean(): Boolean? = this as? Boolean

      public fun asCanonical(): Canonical? = this as? Canonical

      public fun asCode(): Code? = this as? Code

      public fun asDate(): Date? = this as? Date

      public fun asDateTime(): DateTime? = this as? DateTime

      public fun asDecimal(): Decimal? = this as? Decimal

      public fun asId(): Id? = this as? Id

      public fun asInstant(): Instant? = this as? Instant

      public fun asInteger(): Integer? = this as? Integer

      public fun asMarkdown(): Markdown? = this as? Markdown

      public fun asOid(): Oid? = this as? Oid

      public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

      public fun asString(): String? = this as? String

      public fun asTime(): Time? = this as? Time

      public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

      public fun asUri(): Uri? = this as? Uri

      public fun asUrl(): Url? = this as? Url

      public fun asUuid(): Uuid? = this as? Uuid

      public fun asAddress(): Address? = this as? Address

      public fun asAge(): Age? = this as? Age

      public fun asAnnotation(): Annotation? = this as? Annotation

      public fun asAttachment(): Attachment? = this as? Attachment

      public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

      public fun asCoding(): Coding? = this as? Coding

      public fun asContactPoint(): ContactPoint? = this as? ContactPoint

      public fun asCount(): Count? = this as? Count

      public fun asDistance(): Distance? = this as? Distance

      public fun asDuration(): Duration? = this as? Duration

      public fun asHumanName(): HumanName? = this as? HumanName

      public fun asIdentifier(): Identifier? = this as? Identifier

      public fun asMoney(): Money? = this as? Money

      public fun asPeriod(): Period? = this as? Period

      public fun asQuantity(): Quantity? = this as? Quantity

      public fun asRange(): Range? = this as? Range

      public fun asRatio(): Ratio? = this as? Ratio

      public fun asReference(): Reference? = this as? Reference

      public fun asSampledData(): SampledData? = this as? SampledData

      public fun asSignature(): Signature? = this as? Signature

      public fun asTiming(): Timing? = this as? Timing

      public fun asContactDetail(): ContactDetail? = this as? ContactDetail

      public fun asContributor(): Contributor? = this as? Contributor

      public fun asDataRequirement(): DataRequirement? = this as? DataRequirement

      public fun asExpression(): Expression? = this as? Expression

      public fun asParameterDefinition(): ParameterDefinition? = this as? ParameterDefinition

      public fun asRelatedArtifact(): RelatedArtifact? = this as? RelatedArtifact

      public fun asTriggerDefinition(): TriggerDefinition? = this as? TriggerDefinition

      public fun asUsageContext(): UsageContext? = this as? UsageContext

      public fun asDosage(): Dosage? = this as? Dosage

      public fun asMeta(): Meta? = this as? Meta

      public data class Base64Binary(public val `value`: com.google.fhir.model.r4.Base64Binary) :
        Value

      public data class Boolean(public val `value`: com.google.fhir.model.r4.Boolean) : Value

      public data class Canonical(public val `value`: com.google.fhir.model.r4.Canonical) : Value

      public data class Code(public val `value`: com.google.fhir.model.r4.Code) : Value

      public data class Date(public val `value`: com.google.fhir.model.r4.Date) : Value

      public data class DateTime(public val `value`: com.google.fhir.model.r4.DateTime) : Value

      public data class Decimal(public val `value`: com.google.fhir.model.r4.Decimal) : Value

      public data class Id(public val `value`: com.google.fhir.model.r4.Id) : Value

      public data class Instant(public val `value`: com.google.fhir.model.r4.Instant) : Value

      public data class Integer(public val `value`: com.google.fhir.model.r4.Integer) : Value

      public data class Markdown(public val `value`: com.google.fhir.model.r4.Markdown) : Value

      public data class Oid(public val `value`: com.google.fhir.model.r4.Oid) : Value

      public data class PositiveInt(public val `value`: com.google.fhir.model.r4.PositiveInt) :
        Value

      public data class String(public val `value`: com.google.fhir.model.r4.String) : Value

      public data class Time(public val `value`: com.google.fhir.model.r4.Time) : Value

      public data class UnsignedInt(public val `value`: com.google.fhir.model.r4.UnsignedInt) :
        Value

      public data class Uri(public val `value`: com.google.fhir.model.r4.Uri) : Value

      public data class Url(public val `value`: com.google.fhir.model.r4.Url) : Value

      public data class Uuid(public val `value`: com.google.fhir.model.r4.Uuid) : Value

      public data class Address(public val `value`: com.google.fhir.model.r4.Address) : Value

      public data class Age(public val `value`: com.google.fhir.model.r4.Age) : Value

      public data class Annotation(public val `value`: com.google.fhir.model.r4.Annotation) : Value

      public data class Attachment(public val `value`: com.google.fhir.model.r4.Attachment) : Value

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r4.CodeableConcept
      ) : Value

      public data class Coding(public val `value`: com.google.fhir.model.r4.Coding) : Value

      public data class ContactPoint(public val `value`: com.google.fhir.model.r4.ContactPoint) :
        Value

      public data class Count(public val `value`: com.google.fhir.model.r4.Count) : Value

      public data class Distance(public val `value`: com.google.fhir.model.r4.Distance) : Value

      public data class Duration(public val `value`: com.google.fhir.model.r4.Duration) : Value

      public data class HumanName(public val `value`: com.google.fhir.model.r4.HumanName) : Value

      public data class Identifier(public val `value`: com.google.fhir.model.r4.Identifier) : Value

      public data class Money(public val `value`: com.google.fhir.model.r4.Money) : Value

      public data class Period(public val `value`: com.google.fhir.model.r4.Period) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r4.Quantity) : Value

      public data class Range(public val `value`: com.google.fhir.model.r4.Range) : Value

      public data class Ratio(public val `value`: com.google.fhir.model.r4.Ratio) : Value

      public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) : Value

      public data class SampledData(public val `value`: com.google.fhir.model.r4.SampledData) :
        Value

      public data class Signature(public val `value`: com.google.fhir.model.r4.Signature) : Value

      public data class Timing(public val `value`: com.google.fhir.model.r4.Timing) : Value

      public data class ContactDetail(public val `value`: com.google.fhir.model.r4.ContactDetail) :
        Value

      public data class Contributor(public val `value`: com.google.fhir.model.r4.Contributor) :
        Value

      public data class DataRequirement(
        public val `value`: com.google.fhir.model.r4.DataRequirement
      ) : Value

      public data class Expression(public val `value`: com.google.fhir.model.r4.Expression) : Value

      public data class ParameterDefinition(
        public val `value`: com.google.fhir.model.r4.ParameterDefinition
      ) : Value

      public data class RelatedArtifact(
        public val `value`: com.google.fhir.model.r4.RelatedArtifact
      ) : Value

      public data class TriggerDefinition(
        public val `value`: com.google.fhir.model.r4.TriggerDefinition
      ) : Value

      public data class UsageContext(public val `value`: com.google.fhir.model.r4.UsageContext) :
        Value

      public data class Dosage(public val `value`: com.google.fhir.model.r4.Dosage) : Value

      public data class Meta(public val `value`: com.google.fhir.model.r4.Meta) : Value

      public companion object {
        public fun from(
          base64BinaryValue: com.google.fhir.model.r4.Base64Binary?,
          booleanValue: com.google.fhir.model.r4.Boolean?,
          canonicalValue: com.google.fhir.model.r4.Canonical?,
          codeValue: com.google.fhir.model.r4.Code?,
          dateValue: com.google.fhir.model.r4.Date?,
          dateTimeValue: com.google.fhir.model.r4.DateTime?,
          decimalValue: com.google.fhir.model.r4.Decimal?,
          idValue: com.google.fhir.model.r4.Id?,
          instantValue: com.google.fhir.model.r4.Instant?,
          integerValue: com.google.fhir.model.r4.Integer?,
          markdownValue: com.google.fhir.model.r4.Markdown?,
          oidValue: com.google.fhir.model.r4.Oid?,
          positiveIntValue: com.google.fhir.model.r4.PositiveInt?,
          stringValue: com.google.fhir.model.r4.String?,
          timeValue: com.google.fhir.model.r4.Time?,
          unsignedIntValue: com.google.fhir.model.r4.UnsignedInt?,
          uriValue: com.google.fhir.model.r4.Uri?,
          urlValue: com.google.fhir.model.r4.Url?,
          uuidValue: com.google.fhir.model.r4.Uuid?,
          AddressValue: com.google.fhir.model.r4.Address?,
          AgeValue: com.google.fhir.model.r4.Age?,
          AnnotationValue: com.google.fhir.model.r4.Annotation?,
          AttachmentValue: com.google.fhir.model.r4.Attachment?,
          CodeableConceptValue: com.google.fhir.model.r4.CodeableConcept?,
          CodingValue: com.google.fhir.model.r4.Coding?,
          ContactPointValue: com.google.fhir.model.r4.ContactPoint?,
          CountValue: com.google.fhir.model.r4.Count?,
          DistanceValue: com.google.fhir.model.r4.Distance?,
          DurationValue: com.google.fhir.model.r4.Duration?,
          HumanNameValue: com.google.fhir.model.r4.HumanName?,
          IdentifierValue: com.google.fhir.model.r4.Identifier?,
          MoneyValue: com.google.fhir.model.r4.Money?,
          PeriodValue: com.google.fhir.model.r4.Period?,
          QuantityValue: com.google.fhir.model.r4.Quantity?,
          RangeValue: com.google.fhir.model.r4.Range?,
          RatioValue: com.google.fhir.model.r4.Ratio?,
          ReferenceValue: com.google.fhir.model.r4.Reference?,
          SampledDataValue: com.google.fhir.model.r4.SampledData?,
          SignatureValue: com.google.fhir.model.r4.Signature?,
          TimingValue: com.google.fhir.model.r4.Timing?,
          ContactDetailValue: com.google.fhir.model.r4.ContactDetail?,
          ContributorValue: com.google.fhir.model.r4.Contributor?,
          DataRequirementValue: com.google.fhir.model.r4.DataRequirement?,
          ExpressionValue: com.google.fhir.model.r4.Expression?,
          ParameterDefinitionValue: com.google.fhir.model.r4.ParameterDefinition?,
          RelatedArtifactValue: com.google.fhir.model.r4.RelatedArtifact?,
          TriggerDefinitionValue: com.google.fhir.model.r4.TriggerDefinition?,
          UsageContextValue: com.google.fhir.model.r4.UsageContext?,
          DosageValue: com.google.fhir.model.r4.Dosage?,
          MetaValue: com.google.fhir.model.r4.Meta?,
        ): Value? {
          if (base64BinaryValue != null) return Base64Binary(base64BinaryValue)
          if (booleanValue != null) return Boolean(booleanValue)
          if (canonicalValue != null) return Canonical(canonicalValue)
          if (codeValue != null) return Code(codeValue)
          if (dateValue != null) return Date(dateValue)
          if (dateTimeValue != null) return DateTime(dateTimeValue)
          if (decimalValue != null) return Decimal(decimalValue)
          if (idValue != null) return Id(idValue)
          if (instantValue != null) return Instant(instantValue)
          if (integerValue != null) return Integer(integerValue)
          if (markdownValue != null) return Markdown(markdownValue)
          if (oidValue != null) return Oid(oidValue)
          if (positiveIntValue != null) return PositiveInt(positiveIntValue)
          if (stringValue != null) return String(stringValue)
          if (timeValue != null) return Time(timeValue)
          if (unsignedIntValue != null) return UnsignedInt(unsignedIntValue)
          if (uriValue != null) return Uri(uriValue)
          if (urlValue != null) return Url(urlValue)
          if (uuidValue != null) return Uuid(uuidValue)
          if (AddressValue != null) return Address(AddressValue)
          if (AgeValue != null) return Age(AgeValue)
          if (AnnotationValue != null) return Annotation(AnnotationValue)
          if (AttachmentValue != null) return Attachment(AttachmentValue)
          if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
          if (CodingValue != null) return Coding(CodingValue)
          if (ContactPointValue != null) return ContactPoint(ContactPointValue)
          if (CountValue != null) return Count(CountValue)
          if (DistanceValue != null) return Distance(DistanceValue)
          if (DurationValue != null) return Duration(DurationValue)
          if (HumanNameValue != null) return HumanName(HumanNameValue)
          if (IdentifierValue != null) return Identifier(IdentifierValue)
          if (MoneyValue != null) return Money(MoneyValue)
          if (PeriodValue != null) return Period(PeriodValue)
          if (QuantityValue != null) return Quantity(QuantityValue)
          if (RangeValue != null) return Range(RangeValue)
          if (RatioValue != null) return Ratio(RatioValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          if (SampledDataValue != null) return SampledData(SampledDataValue)
          if (SignatureValue != null) return Signature(SignatureValue)
          if (TimingValue != null) return Timing(TimingValue)
          if (ContactDetailValue != null) return ContactDetail(ContactDetailValue)
          if (ContributorValue != null) return Contributor(ContributorValue)
          if (DataRequirementValue != null) return DataRequirement(DataRequirementValue)
          if (ExpressionValue != null) return Expression(ExpressionValue)
          if (ParameterDefinitionValue != null) return ParameterDefinition(ParameterDefinitionValue)
          if (RelatedArtifactValue != null) return RelatedArtifact(RelatedArtifactValue)
          if (TriggerDefinitionValue != null) return TriggerDefinition(TriggerDefinitionValue)
          if (UsageContextValue != null) return UsageContext(UsageContextValue)
          if (DosageValue != null) return Dosage(DosageValue)
          if (MetaValue != null) return Meta(MetaValue)
          return null
        }
      }
    }
  }

  /**
   * Formal constraints such as co-occurrence and other constraints that can be computationally
   * evaluated within the context of the instance.
   */
  @Serializable(with = ElementDefinitionConstraintSerializer::class)
  public class Constraint(
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
     * Allows identification of which elements have their cardinalities impacted by the constraint.
     * Will not be referenced for constraints that do not affect cardinality.
     */
    public var key: Id? = null,
    /**
     * Description of why this constraint is necessary or appropriate.
     *
     * To be used if the reason for the constraint might not be intuitive to all implementers.
     */
    public var requirements: String? = null,
    /**
     * Identifies the impact constraint violation has on the conformance of the instance.
     *
     * This allows constraints to be asserted as "shall" (error) and "should" (warning).
     */
    public var severity: Enumeration<ConstraintSeverity>? = null,
    /**
     * Text that can be used to describe the constraint in messages identifying that the constraint
     * has been violated.
     *
     * Should be expressed in business terms as much as possible.
     */
    public var human: String? = null,
    /**
     * A [FHIRPath](fhirpath.html) expression of constraint that can be executed to see if this
     * constraint is met.
     *
     * In the absense of an expression, the expression is likely not enforceable by validators, and
     * might be missed by many systems.
     */
    public var expression: String? = null,
    /**
     * An XPath expression of constraint that can be executed to see if this constraint is met.
     *
     * Elements SHALL use "f" as the namespace prefix for the FHIR namespace, and "x" for the xhtml
     * namespace, and SHALL NOT use any other prefixes. Note: XPath is generally considered not
     * useful because it does not apply to JSON and other formats and because of XSLT implementation
     * issues, and may be removed in the future.
     */
    public var xpath: String? = null,
    /**
     * A reference to the original source of the constraint, for traceability purposes.
     *
     * This is used when, e.g. rendering, where it is not useful to present inherited constraints
     * when rendering the snapshot.
     */
    public var source: Canonical? = null,
  ) : Element()

  /**
   * Binds to a value set if this element is coded (code, Coding, CodeableConcept, Quantity), or the
   * data types (string, uri).
   */
  @Serializable(with = ElementDefinitionBindingSerializer::class)
  public class Binding(
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
     * Indicates the degree of conformance expectations associated with this binding - that is, the
     * degree to which the provided value set must be adhered to in the instances.
     *
     * For further discussion, see [Using Terminologies](terminologies.html).
     */
    public var strength: Enumeration<BindingStrength>? = null,
    /** Describes the intended use of this particular set of codes. */
    public var description: String? = null,
    /**
     * Refers to the value set that identifies the set of codes the binding refers to.
     *
     * The reference may be version-specific or not (e.g. have a |[version] at the end of the
     * canonical URL).
     */
    public var valueSet: Canonical? = null,
  ) : Element()

  /**
   * Identifies a concept from an external specification that roughly corresponds to this element.
   */
  @Serializable(with = ElementDefinitionMappingSerializer::class)
  public class Mapping(
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
    /** An internal reference to the definition of a mapping. */
    public var identity: Id? = null,
    /**
     * Identifies the computable language in which mapping.map is expressed.
     *
     * If omitted, then there can be no expectation of computational interpretation of the mapping.
     */
    public var language: Code? = null,
    /**
     * Expresses what part of the target specification corresponds to this element.
     *
     * For most mappings, the syntax is undefined. Syntax will be provided for mappings to the RIM.
     * Multiple mappings may be possible and may include constraints on other resource elements that
     * identify when a particular mapping applies.
     */
    public var map: String? = null,
    /** Comments that provide information about the mapping or its use. */
    public var comment: String? = null,
  ) : Element()

  public sealed interface DefaultValue {
    public fun asBase64Binary(): Base64Binary? = this as? Base64Binary

    public fun asBoolean(): Boolean? = this as? Boolean

    public fun asCanonical(): Canonical? = this as? Canonical

    public fun asCode(): Code? = this as? Code

    public fun asDate(): Date? = this as? Date

    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asDecimal(): Decimal? = this as? Decimal

    public fun asId(): Id? = this as? Id

    public fun asInstant(): Instant? = this as? Instant

    public fun asInteger(): Integer? = this as? Integer

    public fun asMarkdown(): Markdown? = this as? Markdown

    public fun asOid(): Oid? = this as? Oid

    public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

    public fun asString(): String? = this as? String

    public fun asTime(): Time? = this as? Time

    public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

    public fun asUri(): Uri? = this as? Uri

    public fun asUrl(): Url? = this as? Url

    public fun asUuid(): Uuid? = this as? Uuid

    public fun asAddress(): Address? = this as? Address

    public fun asAge(): Age? = this as? Age

    public fun asAnnotation(): Annotation? = this as? Annotation

    public fun asAttachment(): Attachment? = this as? Attachment

    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public fun asCoding(): Coding? = this as? Coding

    public fun asContactPoint(): ContactPoint? = this as? ContactPoint

    public fun asCount(): Count? = this as? Count

    public fun asDistance(): Distance? = this as? Distance

    public fun asDuration(): Duration? = this as? Duration

    public fun asHumanName(): HumanName? = this as? HumanName

    public fun asIdentifier(): Identifier? = this as? Identifier

    public fun asMoney(): Money? = this as? Money

    public fun asPeriod(): Period? = this as? Period

    public fun asQuantity(): Quantity? = this as? Quantity

    public fun asRange(): Range? = this as? Range

    public fun asRatio(): Ratio? = this as? Ratio

    public fun asReference(): Reference? = this as? Reference

    public fun asSampledData(): SampledData? = this as? SampledData

    public fun asSignature(): Signature? = this as? Signature

    public fun asTiming(): Timing? = this as? Timing

    public fun asContactDetail(): ContactDetail? = this as? ContactDetail

    public fun asContributor(): Contributor? = this as? Contributor

    public fun asDataRequirement(): DataRequirement? = this as? DataRequirement

    public fun asExpression(): Expression? = this as? Expression

    public fun asParameterDefinition(): ParameterDefinition? = this as? ParameterDefinition

    public fun asRelatedArtifact(): RelatedArtifact? = this as? RelatedArtifact

    public fun asTriggerDefinition(): TriggerDefinition? = this as? TriggerDefinition

    public fun asUsageContext(): UsageContext? = this as? UsageContext

    public fun asDosage(): Dosage? = this as? Dosage

    public fun asMeta(): Meta? = this as? Meta

    public data class Base64Binary(public val `value`: com.google.fhir.model.r4.Base64Binary) :
      DefaultValue

    public data class Boolean(public val `value`: com.google.fhir.model.r4.Boolean) : DefaultValue

    public data class Canonical(public val `value`: com.google.fhir.model.r4.Canonical) :
      DefaultValue

    public data class Code(public val `value`: com.google.fhir.model.r4.Code) : DefaultValue

    public data class Date(public val `value`: com.google.fhir.model.r4.Date) : DefaultValue

    public data class DateTime(public val `value`: com.google.fhir.model.r4.DateTime) :
      DefaultValue

    public data class Decimal(public val `value`: com.google.fhir.model.r4.Decimal) : DefaultValue

    public data class Id(public val `value`: com.google.fhir.model.r4.Id) : DefaultValue

    public data class Instant(public val `value`: com.google.fhir.model.r4.Instant) : DefaultValue

    public data class Integer(public val `value`: com.google.fhir.model.r4.Integer) : DefaultValue

    public data class Markdown(public val `value`: com.google.fhir.model.r4.Markdown) :
      DefaultValue

    public data class Oid(public val `value`: com.google.fhir.model.r4.Oid) : DefaultValue

    public data class PositiveInt(public val `value`: com.google.fhir.model.r4.PositiveInt) :
      DefaultValue

    public data class String(public val `value`: com.google.fhir.model.r4.String) : DefaultValue

    public data class Time(public val `value`: com.google.fhir.model.r4.Time) : DefaultValue

    public data class UnsignedInt(public val `value`: com.google.fhir.model.r4.UnsignedInt) :
      DefaultValue

    public data class Uri(public val `value`: com.google.fhir.model.r4.Uri) : DefaultValue

    public data class Url(public val `value`: com.google.fhir.model.r4.Url) : DefaultValue

    public data class Uuid(public val `value`: com.google.fhir.model.r4.Uuid) : DefaultValue

    public data class Address(public val `value`: com.google.fhir.model.r4.Address) : DefaultValue

    public data class Age(public val `value`: com.google.fhir.model.r4.Age) : DefaultValue

    public data class Annotation(public val `value`: com.google.fhir.model.r4.Annotation) :
      DefaultValue

    public data class Attachment(public val `value`: com.google.fhir.model.r4.Attachment) :
      DefaultValue

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r4.CodeableConcept
    ) : DefaultValue

    public data class Coding(public val `value`: com.google.fhir.model.r4.Coding) : DefaultValue

    public data class ContactPoint(public val `value`: com.google.fhir.model.r4.ContactPoint) :
      DefaultValue

    public data class Count(public val `value`: com.google.fhir.model.r4.Count) : DefaultValue

    public data class Distance(public val `value`: com.google.fhir.model.r4.Distance) :
      DefaultValue

    public data class Duration(public val `value`: com.google.fhir.model.r4.Duration) :
      DefaultValue

    public data class HumanName(public val `value`: com.google.fhir.model.r4.HumanName) :
      DefaultValue

    public data class Identifier(public val `value`: com.google.fhir.model.r4.Identifier) :
      DefaultValue

    public data class Money(public val `value`: com.google.fhir.model.r4.Money) : DefaultValue

    public data class Period(public val `value`: com.google.fhir.model.r4.Period) : DefaultValue

    public data class Quantity(public val `value`: com.google.fhir.model.r4.Quantity) :
      DefaultValue

    public data class Range(public val `value`: com.google.fhir.model.r4.Range) : DefaultValue

    public data class Ratio(public val `value`: com.google.fhir.model.r4.Ratio) : DefaultValue

    public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) :
      DefaultValue

    public data class SampledData(public val `value`: com.google.fhir.model.r4.SampledData) :
      DefaultValue

    public data class Signature(public val `value`: com.google.fhir.model.r4.Signature) :
      DefaultValue

    public data class Timing(public val `value`: com.google.fhir.model.r4.Timing) : DefaultValue

    public data class ContactDetail(public val `value`: com.google.fhir.model.r4.ContactDetail) :
      DefaultValue

    public data class Contributor(public val `value`: com.google.fhir.model.r4.Contributor) :
      DefaultValue

    public data class DataRequirement(
      public val `value`: com.google.fhir.model.r4.DataRequirement
    ) : DefaultValue

    public data class Expression(public val `value`: com.google.fhir.model.r4.Expression) :
      DefaultValue

    public data class ParameterDefinition(
      public val `value`: com.google.fhir.model.r4.ParameterDefinition
    ) : DefaultValue

    public data class RelatedArtifact(
      public val `value`: com.google.fhir.model.r4.RelatedArtifact
    ) : DefaultValue

    public data class TriggerDefinition(
      public val `value`: com.google.fhir.model.r4.TriggerDefinition
    ) : DefaultValue

    public data class UsageContext(public val `value`: com.google.fhir.model.r4.UsageContext) :
      DefaultValue

    public data class Dosage(public val `value`: com.google.fhir.model.r4.Dosage) : DefaultValue

    public data class Meta(public val `value`: com.google.fhir.model.r4.Meta) : DefaultValue

    public companion object {
      public fun from(
        base64BinaryValue: com.google.fhir.model.r4.Base64Binary?,
        booleanValue: com.google.fhir.model.r4.Boolean?,
        canonicalValue: com.google.fhir.model.r4.Canonical?,
        codeValue: com.google.fhir.model.r4.Code?,
        dateValue: com.google.fhir.model.r4.Date?,
        dateTimeValue: com.google.fhir.model.r4.DateTime?,
        decimalValue: com.google.fhir.model.r4.Decimal?,
        idValue: com.google.fhir.model.r4.Id?,
        instantValue: com.google.fhir.model.r4.Instant?,
        integerValue: com.google.fhir.model.r4.Integer?,
        markdownValue: com.google.fhir.model.r4.Markdown?,
        oidValue: com.google.fhir.model.r4.Oid?,
        positiveIntValue: com.google.fhir.model.r4.PositiveInt?,
        stringValue: com.google.fhir.model.r4.String?,
        timeValue: com.google.fhir.model.r4.Time?,
        unsignedIntValue: com.google.fhir.model.r4.UnsignedInt?,
        uriValue: com.google.fhir.model.r4.Uri?,
        urlValue: com.google.fhir.model.r4.Url?,
        uuidValue: com.google.fhir.model.r4.Uuid?,
        AddressValue: com.google.fhir.model.r4.Address?,
        AgeValue: com.google.fhir.model.r4.Age?,
        AnnotationValue: com.google.fhir.model.r4.Annotation?,
        AttachmentValue: com.google.fhir.model.r4.Attachment?,
        CodeableConceptValue: com.google.fhir.model.r4.CodeableConcept?,
        CodingValue: com.google.fhir.model.r4.Coding?,
        ContactPointValue: com.google.fhir.model.r4.ContactPoint?,
        CountValue: com.google.fhir.model.r4.Count?,
        DistanceValue: com.google.fhir.model.r4.Distance?,
        DurationValue: com.google.fhir.model.r4.Duration?,
        HumanNameValue: com.google.fhir.model.r4.HumanName?,
        IdentifierValue: com.google.fhir.model.r4.Identifier?,
        MoneyValue: com.google.fhir.model.r4.Money?,
        PeriodValue: com.google.fhir.model.r4.Period?,
        QuantityValue: com.google.fhir.model.r4.Quantity?,
        RangeValue: com.google.fhir.model.r4.Range?,
        RatioValue: com.google.fhir.model.r4.Ratio?,
        ReferenceValue: com.google.fhir.model.r4.Reference?,
        SampledDataValue: com.google.fhir.model.r4.SampledData?,
        SignatureValue: com.google.fhir.model.r4.Signature?,
        TimingValue: com.google.fhir.model.r4.Timing?,
        ContactDetailValue: com.google.fhir.model.r4.ContactDetail?,
        ContributorValue: com.google.fhir.model.r4.Contributor?,
        DataRequirementValue: com.google.fhir.model.r4.DataRequirement?,
        ExpressionValue: com.google.fhir.model.r4.Expression?,
        ParameterDefinitionValue: com.google.fhir.model.r4.ParameterDefinition?,
        RelatedArtifactValue: com.google.fhir.model.r4.RelatedArtifact?,
        TriggerDefinitionValue: com.google.fhir.model.r4.TriggerDefinition?,
        UsageContextValue: com.google.fhir.model.r4.UsageContext?,
        DosageValue: com.google.fhir.model.r4.Dosage?,
        MetaValue: com.google.fhir.model.r4.Meta?,
      ): DefaultValue? {
        if (base64BinaryValue != null) return Base64Binary(base64BinaryValue)
        if (booleanValue != null) return Boolean(booleanValue)
        if (canonicalValue != null) return Canonical(canonicalValue)
        if (codeValue != null) return Code(codeValue)
        if (dateValue != null) return Date(dateValue)
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (decimalValue != null) return Decimal(decimalValue)
        if (idValue != null) return Id(idValue)
        if (instantValue != null) return Instant(instantValue)
        if (integerValue != null) return Integer(integerValue)
        if (markdownValue != null) return Markdown(markdownValue)
        if (oidValue != null) return Oid(oidValue)
        if (positiveIntValue != null) return PositiveInt(positiveIntValue)
        if (stringValue != null) return String(stringValue)
        if (timeValue != null) return Time(timeValue)
        if (unsignedIntValue != null) return UnsignedInt(unsignedIntValue)
        if (uriValue != null) return Uri(uriValue)
        if (urlValue != null) return Url(urlValue)
        if (uuidValue != null) return Uuid(uuidValue)
        if (AddressValue != null) return Address(AddressValue)
        if (AgeValue != null) return Age(AgeValue)
        if (AnnotationValue != null) return Annotation(AnnotationValue)
        if (AttachmentValue != null) return Attachment(AttachmentValue)
        if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
        if (CodingValue != null) return Coding(CodingValue)
        if (ContactPointValue != null) return ContactPoint(ContactPointValue)
        if (CountValue != null) return Count(CountValue)
        if (DistanceValue != null) return Distance(DistanceValue)
        if (DurationValue != null) return Duration(DurationValue)
        if (HumanNameValue != null) return HumanName(HumanNameValue)
        if (IdentifierValue != null) return Identifier(IdentifierValue)
        if (MoneyValue != null) return Money(MoneyValue)
        if (PeriodValue != null) return Period(PeriodValue)
        if (QuantityValue != null) return Quantity(QuantityValue)
        if (RangeValue != null) return Range(RangeValue)
        if (RatioValue != null) return Ratio(RatioValue)
        if (ReferenceValue != null) return Reference(ReferenceValue)
        if (SampledDataValue != null) return SampledData(SampledDataValue)
        if (SignatureValue != null) return Signature(SignatureValue)
        if (TimingValue != null) return Timing(TimingValue)
        if (ContactDetailValue != null) return ContactDetail(ContactDetailValue)
        if (ContributorValue != null) return Contributor(ContributorValue)
        if (DataRequirementValue != null) return DataRequirement(DataRequirementValue)
        if (ExpressionValue != null) return Expression(ExpressionValue)
        if (ParameterDefinitionValue != null) return ParameterDefinition(ParameterDefinitionValue)
        if (RelatedArtifactValue != null) return RelatedArtifact(RelatedArtifactValue)
        if (TriggerDefinitionValue != null) return TriggerDefinition(TriggerDefinitionValue)
        if (UsageContextValue != null) return UsageContext(UsageContextValue)
        if (DosageValue != null) return Dosage(DosageValue)
        if (MetaValue != null) return Meta(MetaValue)
        return null
      }
    }
  }

  public sealed interface Fixed {
    public fun asBase64Binary(): Base64Binary? = this as? Base64Binary

    public fun asBoolean(): Boolean? = this as? Boolean

    public fun asCanonical(): Canonical? = this as? Canonical

    public fun asCode(): Code? = this as? Code

    public fun asDate(): Date? = this as? Date

    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asDecimal(): Decimal? = this as? Decimal

    public fun asId(): Id? = this as? Id

    public fun asInstant(): Instant? = this as? Instant

    public fun asInteger(): Integer? = this as? Integer

    public fun asMarkdown(): Markdown? = this as? Markdown

    public fun asOid(): Oid? = this as? Oid

    public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

    public fun asString(): String? = this as? String

    public fun asTime(): Time? = this as? Time

    public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

    public fun asUri(): Uri? = this as? Uri

    public fun asUrl(): Url? = this as? Url

    public fun asUuid(): Uuid? = this as? Uuid

    public fun asAddress(): Address? = this as? Address

    public fun asAge(): Age? = this as? Age

    public fun asAnnotation(): Annotation? = this as? Annotation

    public fun asAttachment(): Attachment? = this as? Attachment

    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public fun asCoding(): Coding? = this as? Coding

    public fun asContactPoint(): ContactPoint? = this as? ContactPoint

    public fun asCount(): Count? = this as? Count

    public fun asDistance(): Distance? = this as? Distance

    public fun asDuration(): Duration? = this as? Duration

    public fun asHumanName(): HumanName? = this as? HumanName

    public fun asIdentifier(): Identifier? = this as? Identifier

    public fun asMoney(): Money? = this as? Money

    public fun asPeriod(): Period? = this as? Period

    public fun asQuantity(): Quantity? = this as? Quantity

    public fun asRange(): Range? = this as? Range

    public fun asRatio(): Ratio? = this as? Ratio

    public fun asReference(): Reference? = this as? Reference

    public fun asSampledData(): SampledData? = this as? SampledData

    public fun asSignature(): Signature? = this as? Signature

    public fun asTiming(): Timing? = this as? Timing

    public fun asContactDetail(): ContactDetail? = this as? ContactDetail

    public fun asContributor(): Contributor? = this as? Contributor

    public fun asDataRequirement(): DataRequirement? = this as? DataRequirement

    public fun asExpression(): Expression? = this as? Expression

    public fun asParameterDefinition(): ParameterDefinition? = this as? ParameterDefinition

    public fun asRelatedArtifact(): RelatedArtifact? = this as? RelatedArtifact

    public fun asTriggerDefinition(): TriggerDefinition? = this as? TriggerDefinition

    public fun asUsageContext(): UsageContext? = this as? UsageContext

    public fun asDosage(): Dosage? = this as? Dosage

    public fun asMeta(): Meta? = this as? Meta

    public data class Base64Binary(public val `value`: com.google.fhir.model.r4.Base64Binary) :
      Fixed

    public data class Boolean(public val `value`: com.google.fhir.model.r4.Boolean) : Fixed

    public data class Canonical(public val `value`: com.google.fhir.model.r4.Canonical) : Fixed

    public data class Code(public val `value`: com.google.fhir.model.r4.Code) : Fixed

    public data class Date(public val `value`: com.google.fhir.model.r4.Date) : Fixed

    public data class DateTime(public val `value`: com.google.fhir.model.r4.DateTime) : Fixed

    public data class Decimal(public val `value`: com.google.fhir.model.r4.Decimal) : Fixed

    public data class Id(public val `value`: com.google.fhir.model.r4.Id) : Fixed

    public data class Instant(public val `value`: com.google.fhir.model.r4.Instant) : Fixed

    public data class Integer(public val `value`: com.google.fhir.model.r4.Integer) : Fixed

    public data class Markdown(public val `value`: com.google.fhir.model.r4.Markdown) : Fixed

    public data class Oid(public val `value`: com.google.fhir.model.r4.Oid) : Fixed

    public data class PositiveInt(public val `value`: com.google.fhir.model.r4.PositiveInt) : Fixed

    public data class String(public val `value`: com.google.fhir.model.r4.String) : Fixed

    public data class Time(public val `value`: com.google.fhir.model.r4.Time) : Fixed

    public data class UnsignedInt(public val `value`: com.google.fhir.model.r4.UnsignedInt) : Fixed

    public data class Uri(public val `value`: com.google.fhir.model.r4.Uri) : Fixed

    public data class Url(public val `value`: com.google.fhir.model.r4.Url) : Fixed

    public data class Uuid(public val `value`: com.google.fhir.model.r4.Uuid) : Fixed

    public data class Address(public val `value`: com.google.fhir.model.r4.Address) : Fixed

    public data class Age(public val `value`: com.google.fhir.model.r4.Age) : Fixed

    public data class Annotation(public val `value`: com.google.fhir.model.r4.Annotation) : Fixed

    public data class Attachment(public val `value`: com.google.fhir.model.r4.Attachment) : Fixed

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r4.CodeableConcept
    ) : Fixed

    public data class Coding(public val `value`: com.google.fhir.model.r4.Coding) : Fixed

    public data class ContactPoint(public val `value`: com.google.fhir.model.r4.ContactPoint) :
      Fixed

    public data class Count(public val `value`: com.google.fhir.model.r4.Count) : Fixed

    public data class Distance(public val `value`: com.google.fhir.model.r4.Distance) : Fixed

    public data class Duration(public val `value`: com.google.fhir.model.r4.Duration) : Fixed

    public data class HumanName(public val `value`: com.google.fhir.model.r4.HumanName) : Fixed

    public data class Identifier(public val `value`: com.google.fhir.model.r4.Identifier) : Fixed

    public data class Money(public val `value`: com.google.fhir.model.r4.Money) : Fixed

    public data class Period(public val `value`: com.google.fhir.model.r4.Period) : Fixed

    public data class Quantity(public val `value`: com.google.fhir.model.r4.Quantity) : Fixed

    public data class Range(public val `value`: com.google.fhir.model.r4.Range) : Fixed

    public data class Ratio(public val `value`: com.google.fhir.model.r4.Ratio) : Fixed

    public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) : Fixed

    public data class SampledData(public val `value`: com.google.fhir.model.r4.SampledData) : Fixed

    public data class Signature(public val `value`: com.google.fhir.model.r4.Signature) : Fixed

    public data class Timing(public val `value`: com.google.fhir.model.r4.Timing) : Fixed

    public data class ContactDetail(public val `value`: com.google.fhir.model.r4.ContactDetail) :
      Fixed

    public data class Contributor(public val `value`: com.google.fhir.model.r4.Contributor) : Fixed

    public data class DataRequirement(
      public val `value`: com.google.fhir.model.r4.DataRequirement
    ) : Fixed

    public data class Expression(public val `value`: com.google.fhir.model.r4.Expression) : Fixed

    public data class ParameterDefinition(
      public val `value`: com.google.fhir.model.r4.ParameterDefinition
    ) : Fixed

    public data class RelatedArtifact(
      public val `value`: com.google.fhir.model.r4.RelatedArtifact
    ) : Fixed

    public data class TriggerDefinition(
      public val `value`: com.google.fhir.model.r4.TriggerDefinition
    ) : Fixed

    public data class UsageContext(public val `value`: com.google.fhir.model.r4.UsageContext) :
      Fixed

    public data class Dosage(public val `value`: com.google.fhir.model.r4.Dosage) : Fixed

    public data class Meta(public val `value`: com.google.fhir.model.r4.Meta) : Fixed

    public companion object {
      public fun from(
        base64BinaryValue: com.google.fhir.model.r4.Base64Binary?,
        booleanValue: com.google.fhir.model.r4.Boolean?,
        canonicalValue: com.google.fhir.model.r4.Canonical?,
        codeValue: com.google.fhir.model.r4.Code?,
        dateValue: com.google.fhir.model.r4.Date?,
        dateTimeValue: com.google.fhir.model.r4.DateTime?,
        decimalValue: com.google.fhir.model.r4.Decimal?,
        idValue: com.google.fhir.model.r4.Id?,
        instantValue: com.google.fhir.model.r4.Instant?,
        integerValue: com.google.fhir.model.r4.Integer?,
        markdownValue: com.google.fhir.model.r4.Markdown?,
        oidValue: com.google.fhir.model.r4.Oid?,
        positiveIntValue: com.google.fhir.model.r4.PositiveInt?,
        stringValue: com.google.fhir.model.r4.String?,
        timeValue: com.google.fhir.model.r4.Time?,
        unsignedIntValue: com.google.fhir.model.r4.UnsignedInt?,
        uriValue: com.google.fhir.model.r4.Uri?,
        urlValue: com.google.fhir.model.r4.Url?,
        uuidValue: com.google.fhir.model.r4.Uuid?,
        AddressValue: com.google.fhir.model.r4.Address?,
        AgeValue: com.google.fhir.model.r4.Age?,
        AnnotationValue: com.google.fhir.model.r4.Annotation?,
        AttachmentValue: com.google.fhir.model.r4.Attachment?,
        CodeableConceptValue: com.google.fhir.model.r4.CodeableConcept?,
        CodingValue: com.google.fhir.model.r4.Coding?,
        ContactPointValue: com.google.fhir.model.r4.ContactPoint?,
        CountValue: com.google.fhir.model.r4.Count?,
        DistanceValue: com.google.fhir.model.r4.Distance?,
        DurationValue: com.google.fhir.model.r4.Duration?,
        HumanNameValue: com.google.fhir.model.r4.HumanName?,
        IdentifierValue: com.google.fhir.model.r4.Identifier?,
        MoneyValue: com.google.fhir.model.r4.Money?,
        PeriodValue: com.google.fhir.model.r4.Period?,
        QuantityValue: com.google.fhir.model.r4.Quantity?,
        RangeValue: com.google.fhir.model.r4.Range?,
        RatioValue: com.google.fhir.model.r4.Ratio?,
        ReferenceValue: com.google.fhir.model.r4.Reference?,
        SampledDataValue: com.google.fhir.model.r4.SampledData?,
        SignatureValue: com.google.fhir.model.r4.Signature?,
        TimingValue: com.google.fhir.model.r4.Timing?,
        ContactDetailValue: com.google.fhir.model.r4.ContactDetail?,
        ContributorValue: com.google.fhir.model.r4.Contributor?,
        DataRequirementValue: com.google.fhir.model.r4.DataRequirement?,
        ExpressionValue: com.google.fhir.model.r4.Expression?,
        ParameterDefinitionValue: com.google.fhir.model.r4.ParameterDefinition?,
        RelatedArtifactValue: com.google.fhir.model.r4.RelatedArtifact?,
        TriggerDefinitionValue: com.google.fhir.model.r4.TriggerDefinition?,
        UsageContextValue: com.google.fhir.model.r4.UsageContext?,
        DosageValue: com.google.fhir.model.r4.Dosage?,
        MetaValue: com.google.fhir.model.r4.Meta?,
      ): Fixed? {
        if (base64BinaryValue != null) return Base64Binary(base64BinaryValue)
        if (booleanValue != null) return Boolean(booleanValue)
        if (canonicalValue != null) return Canonical(canonicalValue)
        if (codeValue != null) return Code(codeValue)
        if (dateValue != null) return Date(dateValue)
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (decimalValue != null) return Decimal(decimalValue)
        if (idValue != null) return Id(idValue)
        if (instantValue != null) return Instant(instantValue)
        if (integerValue != null) return Integer(integerValue)
        if (markdownValue != null) return Markdown(markdownValue)
        if (oidValue != null) return Oid(oidValue)
        if (positiveIntValue != null) return PositiveInt(positiveIntValue)
        if (stringValue != null) return String(stringValue)
        if (timeValue != null) return Time(timeValue)
        if (unsignedIntValue != null) return UnsignedInt(unsignedIntValue)
        if (uriValue != null) return Uri(uriValue)
        if (urlValue != null) return Url(urlValue)
        if (uuidValue != null) return Uuid(uuidValue)
        if (AddressValue != null) return Address(AddressValue)
        if (AgeValue != null) return Age(AgeValue)
        if (AnnotationValue != null) return Annotation(AnnotationValue)
        if (AttachmentValue != null) return Attachment(AttachmentValue)
        if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
        if (CodingValue != null) return Coding(CodingValue)
        if (ContactPointValue != null) return ContactPoint(ContactPointValue)
        if (CountValue != null) return Count(CountValue)
        if (DistanceValue != null) return Distance(DistanceValue)
        if (DurationValue != null) return Duration(DurationValue)
        if (HumanNameValue != null) return HumanName(HumanNameValue)
        if (IdentifierValue != null) return Identifier(IdentifierValue)
        if (MoneyValue != null) return Money(MoneyValue)
        if (PeriodValue != null) return Period(PeriodValue)
        if (QuantityValue != null) return Quantity(QuantityValue)
        if (RangeValue != null) return Range(RangeValue)
        if (RatioValue != null) return Ratio(RatioValue)
        if (ReferenceValue != null) return Reference(ReferenceValue)
        if (SampledDataValue != null) return SampledData(SampledDataValue)
        if (SignatureValue != null) return Signature(SignatureValue)
        if (TimingValue != null) return Timing(TimingValue)
        if (ContactDetailValue != null) return ContactDetail(ContactDetailValue)
        if (ContributorValue != null) return Contributor(ContributorValue)
        if (DataRequirementValue != null) return DataRequirement(DataRequirementValue)
        if (ExpressionValue != null) return Expression(ExpressionValue)
        if (ParameterDefinitionValue != null) return ParameterDefinition(ParameterDefinitionValue)
        if (RelatedArtifactValue != null) return RelatedArtifact(RelatedArtifactValue)
        if (TriggerDefinitionValue != null) return TriggerDefinition(TriggerDefinitionValue)
        if (UsageContextValue != null) return UsageContext(UsageContextValue)
        if (DosageValue != null) return Dosage(DosageValue)
        if (MetaValue != null) return Meta(MetaValue)
        return null
      }
    }
  }

  public sealed interface Pattern {
    public fun asBase64Binary(): Base64Binary? = this as? Base64Binary

    public fun asBoolean(): Boolean? = this as? Boolean

    public fun asCanonical(): Canonical? = this as? Canonical

    public fun asCode(): Code? = this as? Code

    public fun asDate(): Date? = this as? Date

    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asDecimal(): Decimal? = this as? Decimal

    public fun asId(): Id? = this as? Id

    public fun asInstant(): Instant? = this as? Instant

    public fun asInteger(): Integer? = this as? Integer

    public fun asMarkdown(): Markdown? = this as? Markdown

    public fun asOid(): Oid? = this as? Oid

    public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

    public fun asString(): String? = this as? String

    public fun asTime(): Time? = this as? Time

    public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

    public fun asUri(): Uri? = this as? Uri

    public fun asUrl(): Url? = this as? Url

    public fun asUuid(): Uuid? = this as? Uuid

    public fun asAddress(): Address? = this as? Address

    public fun asAge(): Age? = this as? Age

    public fun asAnnotation(): Annotation? = this as? Annotation

    public fun asAttachment(): Attachment? = this as? Attachment

    public fun asCodeableConcept(): CodeableConcept? = this as? CodeableConcept

    public fun asCoding(): Coding? = this as? Coding

    public fun asContactPoint(): ContactPoint? = this as? ContactPoint

    public fun asCount(): Count? = this as? Count

    public fun asDistance(): Distance? = this as? Distance

    public fun asDuration(): Duration? = this as? Duration

    public fun asHumanName(): HumanName? = this as? HumanName

    public fun asIdentifier(): Identifier? = this as? Identifier

    public fun asMoney(): Money? = this as? Money

    public fun asPeriod(): Period? = this as? Period

    public fun asQuantity(): Quantity? = this as? Quantity

    public fun asRange(): Range? = this as? Range

    public fun asRatio(): Ratio? = this as? Ratio

    public fun asReference(): Reference? = this as? Reference

    public fun asSampledData(): SampledData? = this as? SampledData

    public fun asSignature(): Signature? = this as? Signature

    public fun asTiming(): Timing? = this as? Timing

    public fun asContactDetail(): ContactDetail? = this as? ContactDetail

    public fun asContributor(): Contributor? = this as? Contributor

    public fun asDataRequirement(): DataRequirement? = this as? DataRequirement

    public fun asExpression(): Expression? = this as? Expression

    public fun asParameterDefinition(): ParameterDefinition? = this as? ParameterDefinition

    public fun asRelatedArtifact(): RelatedArtifact? = this as? RelatedArtifact

    public fun asTriggerDefinition(): TriggerDefinition? = this as? TriggerDefinition

    public fun asUsageContext(): UsageContext? = this as? UsageContext

    public fun asDosage(): Dosage? = this as? Dosage

    public fun asMeta(): Meta? = this as? Meta

    public data class Base64Binary(public val `value`: com.google.fhir.model.r4.Base64Binary) :
      Pattern

    public data class Boolean(public val `value`: com.google.fhir.model.r4.Boolean) : Pattern

    public data class Canonical(public val `value`: com.google.fhir.model.r4.Canonical) : Pattern

    public data class Code(public val `value`: com.google.fhir.model.r4.Code) : Pattern

    public data class Date(public val `value`: com.google.fhir.model.r4.Date) : Pattern

    public data class DateTime(public val `value`: com.google.fhir.model.r4.DateTime) : Pattern

    public data class Decimal(public val `value`: com.google.fhir.model.r4.Decimal) : Pattern

    public data class Id(public val `value`: com.google.fhir.model.r4.Id) : Pattern

    public data class Instant(public val `value`: com.google.fhir.model.r4.Instant) : Pattern

    public data class Integer(public val `value`: com.google.fhir.model.r4.Integer) : Pattern

    public data class Markdown(public val `value`: com.google.fhir.model.r4.Markdown) : Pattern

    public data class Oid(public val `value`: com.google.fhir.model.r4.Oid) : Pattern

    public data class PositiveInt(public val `value`: com.google.fhir.model.r4.PositiveInt) :
      Pattern

    public data class String(public val `value`: com.google.fhir.model.r4.String) : Pattern

    public data class Time(public val `value`: com.google.fhir.model.r4.Time) : Pattern

    public data class UnsignedInt(public val `value`: com.google.fhir.model.r4.UnsignedInt) :
      Pattern

    public data class Uri(public val `value`: com.google.fhir.model.r4.Uri) : Pattern

    public data class Url(public val `value`: com.google.fhir.model.r4.Url) : Pattern

    public data class Uuid(public val `value`: com.google.fhir.model.r4.Uuid) : Pattern

    public data class Address(public val `value`: com.google.fhir.model.r4.Address) : Pattern

    public data class Age(public val `value`: com.google.fhir.model.r4.Age) : Pattern

    public data class Annotation(public val `value`: com.google.fhir.model.r4.Annotation) : Pattern

    public data class Attachment(public val `value`: com.google.fhir.model.r4.Attachment) : Pattern

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r4.CodeableConcept
    ) : Pattern

    public data class Coding(public val `value`: com.google.fhir.model.r4.Coding) : Pattern

    public data class ContactPoint(public val `value`: com.google.fhir.model.r4.ContactPoint) :
      Pattern

    public data class Count(public val `value`: com.google.fhir.model.r4.Count) : Pattern

    public data class Distance(public val `value`: com.google.fhir.model.r4.Distance) : Pattern

    public data class Duration(public val `value`: com.google.fhir.model.r4.Duration) : Pattern

    public data class HumanName(public val `value`: com.google.fhir.model.r4.HumanName) : Pattern

    public data class Identifier(public val `value`: com.google.fhir.model.r4.Identifier) : Pattern

    public data class Money(public val `value`: com.google.fhir.model.r4.Money) : Pattern

    public data class Period(public val `value`: com.google.fhir.model.r4.Period) : Pattern

    public data class Quantity(public val `value`: com.google.fhir.model.r4.Quantity) : Pattern

    public data class Range(public val `value`: com.google.fhir.model.r4.Range) : Pattern

    public data class Ratio(public val `value`: com.google.fhir.model.r4.Ratio) : Pattern

    public data class Reference(public val `value`: com.google.fhir.model.r4.Reference) : Pattern

    public data class SampledData(public val `value`: com.google.fhir.model.r4.SampledData) :
      Pattern

    public data class Signature(public val `value`: com.google.fhir.model.r4.Signature) : Pattern

    public data class Timing(public val `value`: com.google.fhir.model.r4.Timing) : Pattern

    public data class ContactDetail(public val `value`: com.google.fhir.model.r4.ContactDetail) :
      Pattern

    public data class Contributor(public val `value`: com.google.fhir.model.r4.Contributor) :
      Pattern

    public data class DataRequirement(
      public val `value`: com.google.fhir.model.r4.DataRequirement
    ) : Pattern

    public data class Expression(public val `value`: com.google.fhir.model.r4.Expression) : Pattern

    public data class ParameterDefinition(
      public val `value`: com.google.fhir.model.r4.ParameterDefinition
    ) : Pattern

    public data class RelatedArtifact(
      public val `value`: com.google.fhir.model.r4.RelatedArtifact
    ) : Pattern

    public data class TriggerDefinition(
      public val `value`: com.google.fhir.model.r4.TriggerDefinition
    ) : Pattern

    public data class UsageContext(public val `value`: com.google.fhir.model.r4.UsageContext) :
      Pattern

    public data class Dosage(public val `value`: com.google.fhir.model.r4.Dosage) : Pattern

    public data class Meta(public val `value`: com.google.fhir.model.r4.Meta) : Pattern

    public companion object {
      public fun from(
        base64BinaryValue: com.google.fhir.model.r4.Base64Binary?,
        booleanValue: com.google.fhir.model.r4.Boolean?,
        canonicalValue: com.google.fhir.model.r4.Canonical?,
        codeValue: com.google.fhir.model.r4.Code?,
        dateValue: com.google.fhir.model.r4.Date?,
        dateTimeValue: com.google.fhir.model.r4.DateTime?,
        decimalValue: com.google.fhir.model.r4.Decimal?,
        idValue: com.google.fhir.model.r4.Id?,
        instantValue: com.google.fhir.model.r4.Instant?,
        integerValue: com.google.fhir.model.r4.Integer?,
        markdownValue: com.google.fhir.model.r4.Markdown?,
        oidValue: com.google.fhir.model.r4.Oid?,
        positiveIntValue: com.google.fhir.model.r4.PositiveInt?,
        stringValue: com.google.fhir.model.r4.String?,
        timeValue: com.google.fhir.model.r4.Time?,
        unsignedIntValue: com.google.fhir.model.r4.UnsignedInt?,
        uriValue: com.google.fhir.model.r4.Uri?,
        urlValue: com.google.fhir.model.r4.Url?,
        uuidValue: com.google.fhir.model.r4.Uuid?,
        AddressValue: com.google.fhir.model.r4.Address?,
        AgeValue: com.google.fhir.model.r4.Age?,
        AnnotationValue: com.google.fhir.model.r4.Annotation?,
        AttachmentValue: com.google.fhir.model.r4.Attachment?,
        CodeableConceptValue: com.google.fhir.model.r4.CodeableConcept?,
        CodingValue: com.google.fhir.model.r4.Coding?,
        ContactPointValue: com.google.fhir.model.r4.ContactPoint?,
        CountValue: com.google.fhir.model.r4.Count?,
        DistanceValue: com.google.fhir.model.r4.Distance?,
        DurationValue: com.google.fhir.model.r4.Duration?,
        HumanNameValue: com.google.fhir.model.r4.HumanName?,
        IdentifierValue: com.google.fhir.model.r4.Identifier?,
        MoneyValue: com.google.fhir.model.r4.Money?,
        PeriodValue: com.google.fhir.model.r4.Period?,
        QuantityValue: com.google.fhir.model.r4.Quantity?,
        RangeValue: com.google.fhir.model.r4.Range?,
        RatioValue: com.google.fhir.model.r4.Ratio?,
        ReferenceValue: com.google.fhir.model.r4.Reference?,
        SampledDataValue: com.google.fhir.model.r4.SampledData?,
        SignatureValue: com.google.fhir.model.r4.Signature?,
        TimingValue: com.google.fhir.model.r4.Timing?,
        ContactDetailValue: com.google.fhir.model.r4.ContactDetail?,
        ContributorValue: com.google.fhir.model.r4.Contributor?,
        DataRequirementValue: com.google.fhir.model.r4.DataRequirement?,
        ExpressionValue: com.google.fhir.model.r4.Expression?,
        ParameterDefinitionValue: com.google.fhir.model.r4.ParameterDefinition?,
        RelatedArtifactValue: com.google.fhir.model.r4.RelatedArtifact?,
        TriggerDefinitionValue: com.google.fhir.model.r4.TriggerDefinition?,
        UsageContextValue: com.google.fhir.model.r4.UsageContext?,
        DosageValue: com.google.fhir.model.r4.Dosage?,
        MetaValue: com.google.fhir.model.r4.Meta?,
      ): Pattern? {
        if (base64BinaryValue != null) return Base64Binary(base64BinaryValue)
        if (booleanValue != null) return Boolean(booleanValue)
        if (canonicalValue != null) return Canonical(canonicalValue)
        if (codeValue != null) return Code(codeValue)
        if (dateValue != null) return Date(dateValue)
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (decimalValue != null) return Decimal(decimalValue)
        if (idValue != null) return Id(idValue)
        if (instantValue != null) return Instant(instantValue)
        if (integerValue != null) return Integer(integerValue)
        if (markdownValue != null) return Markdown(markdownValue)
        if (oidValue != null) return Oid(oidValue)
        if (positiveIntValue != null) return PositiveInt(positiveIntValue)
        if (stringValue != null) return String(stringValue)
        if (timeValue != null) return Time(timeValue)
        if (unsignedIntValue != null) return UnsignedInt(unsignedIntValue)
        if (uriValue != null) return Uri(uriValue)
        if (urlValue != null) return Url(urlValue)
        if (uuidValue != null) return Uuid(uuidValue)
        if (AddressValue != null) return Address(AddressValue)
        if (AgeValue != null) return Age(AgeValue)
        if (AnnotationValue != null) return Annotation(AnnotationValue)
        if (AttachmentValue != null) return Attachment(AttachmentValue)
        if (CodeableConceptValue != null) return CodeableConcept(CodeableConceptValue)
        if (CodingValue != null) return Coding(CodingValue)
        if (ContactPointValue != null) return ContactPoint(ContactPointValue)
        if (CountValue != null) return Count(CountValue)
        if (DistanceValue != null) return Distance(DistanceValue)
        if (DurationValue != null) return Duration(DurationValue)
        if (HumanNameValue != null) return HumanName(HumanNameValue)
        if (IdentifierValue != null) return Identifier(IdentifierValue)
        if (MoneyValue != null) return Money(MoneyValue)
        if (PeriodValue != null) return Period(PeriodValue)
        if (QuantityValue != null) return Quantity(QuantityValue)
        if (RangeValue != null) return Range(RangeValue)
        if (RatioValue != null) return Ratio(RatioValue)
        if (ReferenceValue != null) return Reference(ReferenceValue)
        if (SampledDataValue != null) return SampledData(SampledDataValue)
        if (SignatureValue != null) return Signature(SignatureValue)
        if (TimingValue != null) return Timing(TimingValue)
        if (ContactDetailValue != null) return ContactDetail(ContactDetailValue)
        if (ContributorValue != null) return Contributor(ContributorValue)
        if (DataRequirementValue != null) return DataRequirement(DataRequirementValue)
        if (ExpressionValue != null) return Expression(ExpressionValue)
        if (ParameterDefinitionValue != null) return ParameterDefinition(ParameterDefinitionValue)
        if (RelatedArtifactValue != null) return RelatedArtifact(RelatedArtifactValue)
        if (TriggerDefinitionValue != null) return TriggerDefinition(TriggerDefinitionValue)
        if (UsageContextValue != null) return UsageContext(UsageContextValue)
        if (DosageValue != null) return Dosage(DosageValue)
        if (MetaValue != null) return Meta(MetaValue)
        return null
      }
    }
  }

  public sealed interface MinValue {
    public fun asDate(): Date? = this as? Date

    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asInstant(): Instant? = this as? Instant

    public fun asTime(): Time? = this as? Time

    public fun asDecimal(): Decimal? = this as? Decimal

    public fun asInteger(): Integer? = this as? Integer

    public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

    public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

    public fun asQuantity(): Quantity? = this as? Quantity

    public data class Date(public val `value`: com.google.fhir.model.r4.Date) : MinValue

    public data class DateTime(public val `value`: com.google.fhir.model.r4.DateTime) : MinValue

    public data class Instant(public val `value`: com.google.fhir.model.r4.Instant) : MinValue

    public data class Time(public val `value`: com.google.fhir.model.r4.Time) : MinValue

    public data class Decimal(public val `value`: com.google.fhir.model.r4.Decimal) : MinValue

    public data class Integer(public val `value`: com.google.fhir.model.r4.Integer) : MinValue

    public data class PositiveInt(public val `value`: com.google.fhir.model.r4.PositiveInt) :
      MinValue

    public data class UnsignedInt(public val `value`: com.google.fhir.model.r4.UnsignedInt) :
      MinValue

    public data class Quantity(public val `value`: com.google.fhir.model.r4.Quantity) : MinValue

    public companion object {
      public fun from(
        dateValue: com.google.fhir.model.r4.Date?,
        dateTimeValue: com.google.fhir.model.r4.DateTime?,
        instantValue: com.google.fhir.model.r4.Instant?,
        timeValue: com.google.fhir.model.r4.Time?,
        decimalValue: com.google.fhir.model.r4.Decimal?,
        integerValue: com.google.fhir.model.r4.Integer?,
        positiveIntValue: com.google.fhir.model.r4.PositiveInt?,
        unsignedIntValue: com.google.fhir.model.r4.UnsignedInt?,
        QuantityValue: com.google.fhir.model.r4.Quantity?,
      ): MinValue? {
        if (dateValue != null) return Date(dateValue)
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (instantValue != null) return Instant(instantValue)
        if (timeValue != null) return Time(timeValue)
        if (decimalValue != null) return Decimal(decimalValue)
        if (integerValue != null) return Integer(integerValue)
        if (positiveIntValue != null) return PositiveInt(positiveIntValue)
        if (unsignedIntValue != null) return UnsignedInt(unsignedIntValue)
        if (QuantityValue != null) return Quantity(QuantityValue)
        return null
      }
    }
  }

  public sealed interface MaxValue {
    public fun asDate(): Date? = this as? Date

    public fun asDateTime(): DateTime? = this as? DateTime

    public fun asInstant(): Instant? = this as? Instant

    public fun asTime(): Time? = this as? Time

    public fun asDecimal(): Decimal? = this as? Decimal

    public fun asInteger(): Integer? = this as? Integer

    public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

    public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

    public fun asQuantity(): Quantity? = this as? Quantity

    public data class Date(public val `value`: com.google.fhir.model.r4.Date) : MaxValue

    public data class DateTime(public val `value`: com.google.fhir.model.r4.DateTime) : MaxValue

    public data class Instant(public val `value`: com.google.fhir.model.r4.Instant) : MaxValue

    public data class Time(public val `value`: com.google.fhir.model.r4.Time) : MaxValue

    public data class Decimal(public val `value`: com.google.fhir.model.r4.Decimal) : MaxValue

    public data class Integer(public val `value`: com.google.fhir.model.r4.Integer) : MaxValue

    public data class PositiveInt(public val `value`: com.google.fhir.model.r4.PositiveInt) :
      MaxValue

    public data class UnsignedInt(public val `value`: com.google.fhir.model.r4.UnsignedInt) :
      MaxValue

    public data class Quantity(public val `value`: com.google.fhir.model.r4.Quantity) : MaxValue

    public companion object {
      public fun from(
        dateValue: com.google.fhir.model.r4.Date?,
        dateTimeValue: com.google.fhir.model.r4.DateTime?,
        instantValue: com.google.fhir.model.r4.Instant?,
        timeValue: com.google.fhir.model.r4.Time?,
        decimalValue: com.google.fhir.model.r4.Decimal?,
        integerValue: com.google.fhir.model.r4.Integer?,
        positiveIntValue: com.google.fhir.model.r4.PositiveInt?,
        unsignedIntValue: com.google.fhir.model.r4.UnsignedInt?,
        QuantityValue: com.google.fhir.model.r4.Quantity?,
      ): MaxValue? {
        if (dateValue != null) return Date(dateValue)
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (instantValue != null) return Instant(instantValue)
        if (timeValue != null) return Time(timeValue)
        if (decimalValue != null) return Decimal(decimalValue)
        if (integerValue != null) return Integer(integerValue)
        if (positiveIntValue != null) return PositiveInt(positiveIntValue)
        if (unsignedIntValue != null) return UnsignedInt(unsignedIntValue)
        if (QuantityValue != null) return Quantity(QuantityValue)
        return null
      }
    }
  }

  /** How slices are interpreted when evaluating an instance. */
  public enum class SlicingRules(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** No additional content is allowed other than that described by the slices in this profile. */
    Closed(
      "closed",
      "http://hl7.org/fhir/resource-slicing-rules",
      "Closed",
      "No additional content is allowed other than that described by the slices in this profile.",
    ),
    /** Additional content is allowed anywhere in the list. */
    Open(
      "open",
      "http://hl7.org/fhir/resource-slicing-rules",
      "Open",
      "Additional content is allowed anywhere in the list.",
    ),
    /**
     * Additional content is allowed, but only at the end of the list. Note that using this requires
     * that the slices be ordered, which makes it hard to share uses. This should only be done where
     * absolutely required.
     */
    OpenAtEnd(
      "openAtEnd",
      "http://hl7.org/fhir/resource-slicing-rules",
      "Open at End",
      "Additional content is allowed, but only at the end of the list. Note that using this requires that the slices be ordered, which makes it hard to share uses. This should only be done where absolutely required.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): SlicingRules =
        when (code) {
          "closed" -> Closed
          "open" -> Open
          "openAtEnd" -> OpenAtEnd
          else -> throw IllegalArgumentException("Unknown code $code for enum SlicingRules")
        }
    }
  }

  /** How an element value is interpreted when discrimination is evaluated. */
  public enum class DiscriminatorType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The slices have different values in the nominated element. */
    Value(
      "value",
      "http://hl7.org/fhir/discriminator-type",
      "Value",
      "The slices have different values in the nominated element.",
    ),
    /** The slices are differentiated by the presence or absence of the nominated element. */
    Exists(
      "exists",
      "http://hl7.org/fhir/discriminator-type",
      "Exists",
      "The slices are differentiated by the presence or absence of the nominated element.",
    ),
    /**
     * The slices have different values in the nominated element, as determined by testing them
     * against the applicable ElementDefinition.pattern[x].
     */
    Pattern(
      "pattern",
      "http://hl7.org/fhir/discriminator-type",
      "Pattern",
      "The slices have different values in the nominated element, as determined by testing them against the applicable ElementDefinition.pattern[x].",
    ),
    /** The slices are differentiated by type of the nominated element. */
    Type(
      "type",
      "http://hl7.org/fhir/discriminator-type",
      "Type",
      "The slices are differentiated by type of the nominated element.",
    ),
    /**
     * The slices are differentiated by conformance of the nominated element to a specified profile.
     * Note that if the path specifies .resolve() then the profile is the target profile on the
     * reference. In this case, validation by the possible profiles is required to differentiate the
     * slices.
     */
    Profile(
      "profile",
      "http://hl7.org/fhir/discriminator-type",
      "Profile",
      "The slices are differentiated by conformance of the nominated element to a specified profile. Note that if the path specifies .resolve() then the profile is the target profile on the reference. In this case, validation by the possible profiles is required to differentiate the slices.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): DiscriminatorType =
        when (code) {
          "value" -> Value
          "exists" -> Exists
          "pattern" -> Pattern
          "type" -> Type
          "profile" -> Profile
          else -> throw IllegalArgumentException("Unknown code $code for enum DiscriminatorType")
        }
    }
  }

  /** How resource references can be aggregated. */
  public enum class AggregationMode(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The reference is a local reference to a contained resource. */
    Contained(
      "contained",
      "http://hl7.org/fhir/resource-aggregation-mode",
      "Contained",
      "The reference is a local reference to a contained resource.",
    ),
    /**
     * The reference to a resource that has to be resolved externally to the resource that includes
     * the reference.
     */
    Referenced(
      "referenced",
      "http://hl7.org/fhir/resource-aggregation-mode",
      "Referenced",
      "The reference to a resource that has to be resolved externally to the resource that includes the reference.",
    ),
    /**
     * The resource the reference points to will be found in the same bundle as the resource that
     * includes the reference.
     */
    Bundled(
      "bundled",
      "http://hl7.org/fhir/resource-aggregation-mode",
      "Bundled",
      "The resource the reference points to will be found in the same bundle as the resource that includes the reference.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): AggregationMode =
        when (code) {
          "contained" -> Contained
          "referenced" -> Referenced
          "bundled" -> Bundled
          else -> throw IllegalArgumentException("Unknown code $code for enum AggregationMode")
        }
    }
  }

  /**
   * Whether a reference needs to be version specific or version independent, or whether either can
   * be used.
   */
  public enum class ReferenceVersionRules(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The reference may be either version independent or version specific. */
    Either(
      "either",
      "http://hl7.org/fhir/reference-version-rules",
      "Either Specific or independent",
      "The reference may be either version independent or version specific.",
    ),
    /** The reference must be version independent. */
    Independent(
      "independent",
      "http://hl7.org/fhir/reference-version-rules",
      "Version independent",
      "The reference must be version independent.",
    ),
    /** The reference must be version specific. */
    Specific(
      "specific",
      "http://hl7.org/fhir/reference-version-rules",
      "Version Specific",
      "The reference must be version specific.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ReferenceVersionRules =
        when (code) {
          "either" -> Either
          "independent" -> Independent
          "specific" -> Specific
          else ->
            throw IllegalArgumentException("Unknown code $code for enum ReferenceVersionRules")
        }
    }
  }

  /** SHALL applications comply with this constraint? */
  public enum class ConstraintSeverity(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** If the constraint is violated, the resource is not conformant. */
    Error(
      "error",
      "http://hl7.org/fhir/constraint-severity",
      "Error",
      "If the constraint is violated, the resource is not conformant.",
    ),
    /**
     * If the constraint is violated, the resource is conformant, but it is not necessarily
     * following best practice.
     */
    Warning(
      "warning",
      "http://hl7.org/fhir/constraint-severity",
      "Warning",
      "If the constraint is violated, the resource is conformant, but it is not necessarily following best practice.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): ConstraintSeverity =
        when (code) {
          "error" -> Error
          "warning" -> Warning
          else -> throw IllegalArgumentException("Unknown code $code for enum ConstraintSeverity")
        }
    }
  }

  /** How a property is represented when serialized. */
  public enum class PropertyRepresentation(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** In XML, this property is represented as an attribute not an element. */
    XmlAttr(
      "xmlAttr",
      "http://hl7.org/fhir/property-representation",
      "XML Attribute",
      "In XML, this property is represented as an attribute not an element.",
    ),
    /** This element is represented using the XML text attribute (primitives only). */
    XmlText(
      "xmlText",
      "http://hl7.org/fhir/property-representation",
      "XML Text",
      "This element is represented using the XML text attribute (primitives only).",
    ),
    /** The type of this element is indicated using xsi:type. */
    TypeAttr(
      "typeAttr",
      "http://hl7.org/fhir/property-representation",
      "Type Attribute",
      "The type of this element is indicated using xsi:type.",
    ),
    /** Use CDA narrative instead of XHTML. */
    CdaText(
      "cdaText",
      "http://hl7.org/fhir/property-representation",
      "CDA Text Format",
      "Use CDA narrative instead of XHTML.",
    ),
    /** The property is represented using XHTML. */
    Xhtml(
      "xhtml",
      "http://hl7.org/fhir/property-representation",
      "XHTML",
      "The property is represented using XHTML.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): PropertyRepresentation =
        when (code) {
          "xmlAttr" -> XmlAttr
          "xmlText" -> XmlText
          "typeAttr" -> TypeAttr
          "cdaText" -> CdaText
          "xhtml" -> Xhtml
          else ->
            throw IllegalArgumentException("Unknown code $code for enum PropertyRepresentation")
        }
    }
  }
}
