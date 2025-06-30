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

import com.google.fhir.model.r5.serializers.ElementDefinitionBaseSerializer
import com.google.fhir.model.r5.serializers.ElementDefinitionBindingAdditionalSerializer
import com.google.fhir.model.r5.serializers.ElementDefinitionBindingSerializer
import com.google.fhir.model.r5.serializers.ElementDefinitionConstraintSerializer
import com.google.fhir.model.r5.serializers.ElementDefinitionExampleSerializer
import com.google.fhir.model.r5.serializers.ElementDefinitionMappingSerializer
import com.google.fhir.model.r5.serializers.ElementDefinitionSerializer
import com.google.fhir.model.r5.serializers.ElementDefinitionSlicingDiscriminatorSerializer
import com.google.fhir.model.r5.serializers.ElementDefinitionSlicingSerializer
import com.google.fhir.model.r5.serializers.ElementDefinitionTypeSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable

/**
 * ElementDefinition Type: Captures constraints on each element within the resource, profile, or
 * extension.
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
   * element. To make the use of extensions safe and managable, there is a strict set of governance
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
   * negation or qualification. To make the use of extensions safe and managable, there is a strict
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
   * the normal case. No extensions are allowed on elements with a representation of 'xmlAttr', no
   * matter what FHIR serialization format is used.
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
   * [http://hl7.org/fhir/StructureDefinition/elementdefinition-question](http://hl7.org/fhir/extensions/StructureDefinition-elementdefinition-question.html).
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
   * element definition is not the original definition of an element - e.g. either in a constraint
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
   * Specifies a value that SHALL be exactly the value for this element in the instance, if present.
   * For purposes of comparison, non-significant whitespace is ignored, and all values must be an
   * exact match (case and accent sensitive). Missing elements/attributes must also be missing.
   *
   * This is not recommended for Coding and CodeableConcept since these often have highly contextual
   * properties such as version or display.
   */
  public var fixed: Fixed? = null,
  /**
   * Specifies a value that each occurrence of the element in the instance SHALL follow - that is,
   * any value in the pattern must be found in the instance, if the element has a value. Other
   * additional values may be found too. This is effectively constraint by example.
   *
   * When pattern[x] is used to constrain a primitive, it means that the value provided in the
   * pattern[x] must match the instance value exactly.
   *
   * When an element within a pattern[x] is used to constrain an array, it means that each element
   * provided in the pattern[x] must (recursively) match at least one element from the instance
   * array.
   *
   * When pattern[x] is used to constrain a complex object, it means that each property in the
   * pattern must be present in the complex object, and its value must recursively match -- i.e.,
   * 1. If primitive: it must match exactly the pattern value
   * 2. If a complex object: it must match (recursively) the pattern value
   * 3. If an array: it must match (recursively) the pattern value
   *
   * If a pattern[x] is declared on a repeating element, the pattern applies to all repetitions. If
   * the desire is for a pattern to apply to only one element or a subset of elements, slicing must
   * be used. See [Examples of Patterns](elementdefinition-examples.html#pattern-examples) for
   * examples of pattern usage and the effect it will have.
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
   * to determine the minimum allowable value. A minimum value for a Quantity is interpreted as a
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
   * determine the maximum allowable value. A maximum value for a Quantity is interpreted as a
   * canonical maximum - e.g. you cannot provide 10g if the maximum value is 50mg.
   */
  public var maxValue: MaxValue? = null,
  /**
   * Indicates the maximum length in characters that is permitted to be present in conformant
   * instances and which is expected to be supported by conformant consumers that support the
   * element. ```maxLength``` SHOULD only be used on primitive data types that have a string
   * representation (see
   * [http://hl7.org/fhir/StructureDefinition/structuredefinition-type-characteristics](http://hl7.org/fhir/extensions/StructureDefinition-structuredefinition-type-characteristics.html)).
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
   * Specifies for a primitive data type that the value of the data type cannot be replaced by an
   * extension.
   *
   * Typical extensions that can be provided in place of a the value are
   * [http://hl7.org/fhir/StructureDefinition/data-absent-reason](http://hl7.org/fhir/extensions/StructureDefinition-data-absent-reason.html),
   * [http://hl7.org/fhir/StructureDefinition/iso21090-nullFlavor](http://hl7.org/fhir/extensions/StructureDefinition-iso21090-nullFlavor.html),
   * [http://hl7.org/fhir/StructureDefinition/originalText](http://hl7.org/fhir/extensions/StructureDefinition-originalText.html),
   * and
   * [http://hl7.org/fhir/StructureDefinition/cqf-expression](http://hl7.org/fhir/extensions/StructureDefinition-cqf-expression.html).
   * Note that this element has no meaning when a value is provided, and extensions can be provided
   * in addition to a value.
   */
  public var mustHaveValue: Boolean? = null,
  /**
   * Specifies a list of extensions that can appear in place of a primitive value.
   *
   * if mustHaveValue is true, then this element should not be present, since no extensions are
   * allowed in place of the value. Note that this element has no impact if the value is present.
   */
  public var valueAlternatives: List<Canonical?>? = null,
  /**
   * If true, implementations that produce or consume resources SHALL provide "support" for the
   * element in some meaningful way. Note that this is being phased out and replaced by obligations
   * (see below). If false, the element may be ignored and not supported. If false, whether to
   * populate or use the data element in any way is at the discretion of the implementation.
   *
   * "Something meaningful" is context dependent and impossible to describe in the base FHIR
   * specification. For this reason, the mustSupport flag is never set to true by the FHIR
   * specification itself - it is only set to true in profiles. A profile on a type can always make
   * mustSupport = true if it is false in the base type but cannot make mustSupport = false if it is
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
   * pre-determination has been made that it is not relevant to their particular system. When used
   * on the root element in an extension definition, this indicates whether or not the extension is
   * a modifier extension.
   *
   * Only the definition of an element can set IsModifier true - either the specification itself or
   * where an extension is originally defined. Once set, it cannot be changed in derived profiles
   * (except in the special case of the defining a new extension). An element/extension that has
   * isModifier=true SHOULD also have a minimum cardinality of 1, so that there is no lack of
   * clarity about what to do if it is missing. If it can be missing, the definition SHALL make the
   * meaning of a missing element clear.
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
   * resources for optimal performance. When a request is made with _summary=true, serializers only
   * include elements marked as 'isSummary = true'. With a few exceptions (listed below), all
   * datatype properties are included in the summary form. In resource and datatype definitions, if
   * an element has a descendant marked as isSummary=true or if it satisfies both of the following
   * conditions, it must be marked as isSummary=true:
   * * is at the root or has a parent that is 'mustSupport'
   * * has a minimum cardinality of 1 or is a modifier element
   *
   * The following datatype properties are exceptions, and are not marked as isSummary:
   * * Attachment.data
   * * Signature.data, Signature.targetFormat, Signature.sigFormat
   * * Narrative.status, Narrative.div
   * * SampledData.data.
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
) : BackboneType() {
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
       * How the element value is interpreted when discrimination is evaluated.
       *
       * 'pattern' is deprecated - it works exactly the same as 'value'.
       */
      public var type: Enumeration<DiscriminatorType>? = null,
      /**
       * A FHIRPath expression, using [the simple subset of FHIRPath](fhirpath.html#simple), that is
       * used to identify the element on which discrimination is based.
       */
      public var path: String? = null,
    ) : Element()
  }

  /**
   * Information about the base definition of the element, provided to make it unnecessary for tools
   * to trace the deviation of the element through the derived and related profiles. When the
   * element definition is not the original definition of an element - e.g. either in a constraint
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
     * [http://hl7.org/fhir/StructureDefinition/elementdefinition-profile-element](http://hl7.org/fhir/extensions/StructureDefinition-elementdefinition-profile-element.html)
     * extension.
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
    /** Describes the purpose of this example among the set of examples. */
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

      public fun asInteger64(): Integer64? = this as? Integer64

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

      public fun asCodeableReference(): CodeableReference? = this as? CodeableReference

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

      public fun asRatioRange(): RatioRange? = this as? RatioRange

      public fun asReference(): Reference? = this as? Reference

      public fun asSampledData(): SampledData? = this as? SampledData

      public fun asSignature(): Signature? = this as? Signature

      public fun asTiming(): Timing? = this as? Timing

      public fun asContactDetail(): ContactDetail? = this as? ContactDetail

      public fun asDataRequirement(): DataRequirement? = this as? DataRequirement

      public fun asExpression(): Expression? = this as? Expression

      public fun asParameterDefinition(): ParameterDefinition? = this as? ParameterDefinition

      public fun asRelatedArtifact(): RelatedArtifact? = this as? RelatedArtifact

      public fun asTriggerDefinition(): TriggerDefinition? = this as? TriggerDefinition

      public fun asUsageContext(): UsageContext? = this as? UsageContext

      public fun asAvailability(): Availability? = this as? Availability

      public fun asExtendedContactDetail(): ExtendedContactDetail? = this as? ExtendedContactDetail

      public fun asDosage(): Dosage? = this as? Dosage

      public fun asMeta(): Meta? = this as? Meta

      public data class Base64Binary(public val `value`: com.google.fhir.model.r5.Base64Binary) :
        Value

      public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Value

      public data class Canonical(public val `value`: com.google.fhir.model.r5.Canonical) : Value

      public data class Code(public val `value`: com.google.fhir.model.r5.Code) : Value

      public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Value

      public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Value

      public data class Decimal(public val `value`: com.google.fhir.model.r5.Decimal) : Value

      public data class Id(public val `value`: com.google.fhir.model.r5.Id) : Value

      public data class Instant(public val `value`: com.google.fhir.model.r5.Instant) : Value

      public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Value

      public data class Integer64(public val `value`: com.google.fhir.model.r5.Integer64) : Value

      public data class Markdown(public val `value`: com.google.fhir.model.r5.Markdown) : Value

      public data class Oid(public val `value`: com.google.fhir.model.r5.Oid) : Value

      public data class PositiveInt(public val `value`: com.google.fhir.model.r5.PositiveInt) :
        Value

      public data class String(public val `value`: com.google.fhir.model.r5.String) : Value

      public data class Time(public val `value`: com.google.fhir.model.r5.Time) : Value

      public data class UnsignedInt(public val `value`: com.google.fhir.model.r5.UnsignedInt) :
        Value

      public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : Value

      public data class Url(public val `value`: com.google.fhir.model.r5.Url) : Value

      public data class Uuid(public val `value`: com.google.fhir.model.r5.Uuid) : Value

      public data class Address(public val `value`: com.google.fhir.model.r5.Address) : Value

      public data class Age(public val `value`: com.google.fhir.model.r5.Age) : Value

      public data class Annotation(public val `value`: com.google.fhir.model.r5.Annotation) : Value

      public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) : Value

      public data class CodeableConcept(
        public val `value`: com.google.fhir.model.r5.CodeableConcept
      ) : Value

      public data class CodeableReference(
        public val `value`: com.google.fhir.model.r5.CodeableReference
      ) : Value

      public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) : Value

      public data class ContactPoint(public val `value`: com.google.fhir.model.r5.ContactPoint) :
        Value

      public data class Count(public val `value`: com.google.fhir.model.r5.Count) : Value

      public data class Distance(public val `value`: com.google.fhir.model.r5.Distance) : Value

      public data class Duration(public val `value`: com.google.fhir.model.r5.Duration) : Value

      public data class HumanName(public val `value`: com.google.fhir.model.r5.HumanName) : Value

      public data class Identifier(public val `value`: com.google.fhir.model.r5.Identifier) : Value

      public data class Money(public val `value`: com.google.fhir.model.r5.Money) : Value

      public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Value

      public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Value

      public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Value

      public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Value

      public data class RatioRange(public val `value`: com.google.fhir.model.r5.RatioRange) : Value

      public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Value

      public data class SampledData(public val `value`: com.google.fhir.model.r5.SampledData) :
        Value

      public data class Signature(public val `value`: com.google.fhir.model.r5.Signature) : Value

      public data class Timing(public val `value`: com.google.fhir.model.r5.Timing) : Value

      public data class ContactDetail(public val `value`: com.google.fhir.model.r5.ContactDetail) :
        Value

      public data class DataRequirement(
        public val `value`: com.google.fhir.model.r5.DataRequirement
      ) : Value

      public data class Expression(public val `value`: com.google.fhir.model.r5.Expression) : Value

      public data class ParameterDefinition(
        public val `value`: com.google.fhir.model.r5.ParameterDefinition
      ) : Value

      public data class RelatedArtifact(
        public val `value`: com.google.fhir.model.r5.RelatedArtifact
      ) : Value

      public data class TriggerDefinition(
        public val `value`: com.google.fhir.model.r5.TriggerDefinition
      ) : Value

      public data class UsageContext(public val `value`: com.google.fhir.model.r5.UsageContext) :
        Value

      public data class Availability(public val `value`: com.google.fhir.model.r5.Availability) :
        Value

      public data class ExtendedContactDetail(
        public val `value`: com.google.fhir.model.r5.ExtendedContactDetail
      ) : Value

      public data class Dosage(public val `value`: com.google.fhir.model.r5.Dosage) : Value

      public data class Meta(public val `value`: com.google.fhir.model.r5.Meta) : Value

      public companion object {
        public fun from(
          base64BinaryValue: com.google.fhir.model.r5.Base64Binary?,
          booleanValue: com.google.fhir.model.r5.Boolean?,
          canonicalValue: com.google.fhir.model.r5.Canonical?,
          codeValue: com.google.fhir.model.r5.Code?,
          dateValue: com.google.fhir.model.r5.Date?,
          dateTimeValue: com.google.fhir.model.r5.DateTime?,
          decimalValue: com.google.fhir.model.r5.Decimal?,
          idValue: com.google.fhir.model.r5.Id?,
          instantValue: com.google.fhir.model.r5.Instant?,
          integerValue: com.google.fhir.model.r5.Integer?,
          integer64Value: com.google.fhir.model.r5.Integer64?,
          markdownValue: com.google.fhir.model.r5.Markdown?,
          oidValue: com.google.fhir.model.r5.Oid?,
          positiveIntValue: com.google.fhir.model.r5.PositiveInt?,
          stringValue: com.google.fhir.model.r5.String?,
          timeValue: com.google.fhir.model.r5.Time?,
          unsignedIntValue: com.google.fhir.model.r5.UnsignedInt?,
          uriValue: com.google.fhir.model.r5.Uri?,
          urlValue: com.google.fhir.model.r5.Url?,
          uuidValue: com.google.fhir.model.r5.Uuid?,
          AddressValue: com.google.fhir.model.r5.Address?,
          AgeValue: com.google.fhir.model.r5.Age?,
          AnnotationValue: com.google.fhir.model.r5.Annotation?,
          AttachmentValue: com.google.fhir.model.r5.Attachment?,
          CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
          CodeableReferenceValue: com.google.fhir.model.r5.CodeableReference?,
          CodingValue: com.google.fhir.model.r5.Coding?,
          ContactPointValue: com.google.fhir.model.r5.ContactPoint?,
          CountValue: com.google.fhir.model.r5.Count?,
          DistanceValue: com.google.fhir.model.r5.Distance?,
          DurationValue: com.google.fhir.model.r5.Duration?,
          HumanNameValue: com.google.fhir.model.r5.HumanName?,
          IdentifierValue: com.google.fhir.model.r5.Identifier?,
          MoneyValue: com.google.fhir.model.r5.Money?,
          PeriodValue: com.google.fhir.model.r5.Period?,
          QuantityValue: com.google.fhir.model.r5.Quantity?,
          RangeValue: com.google.fhir.model.r5.Range?,
          RatioValue: com.google.fhir.model.r5.Ratio?,
          RatioRangeValue: com.google.fhir.model.r5.RatioRange?,
          ReferenceValue: com.google.fhir.model.r5.Reference?,
          SampledDataValue: com.google.fhir.model.r5.SampledData?,
          SignatureValue: com.google.fhir.model.r5.Signature?,
          TimingValue: com.google.fhir.model.r5.Timing?,
          ContactDetailValue: com.google.fhir.model.r5.ContactDetail?,
          DataRequirementValue: com.google.fhir.model.r5.DataRequirement?,
          ExpressionValue: com.google.fhir.model.r5.Expression?,
          ParameterDefinitionValue: com.google.fhir.model.r5.ParameterDefinition?,
          RelatedArtifactValue: com.google.fhir.model.r5.RelatedArtifact?,
          TriggerDefinitionValue: com.google.fhir.model.r5.TriggerDefinition?,
          UsageContextValue: com.google.fhir.model.r5.UsageContext?,
          AvailabilityValue: com.google.fhir.model.r5.Availability?,
          ExtendedContactDetailValue: com.google.fhir.model.r5.ExtendedContactDetail?,
          DosageValue: com.google.fhir.model.r5.Dosage?,
          MetaValue: com.google.fhir.model.r5.Meta?,
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
          if (integer64Value != null) return Integer64(integer64Value)
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
          if (CodeableReferenceValue != null) return CodeableReference(CodeableReferenceValue)
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
          if (RatioRangeValue != null) return RatioRange(RatioRangeValue)
          if (ReferenceValue != null) return Reference(ReferenceValue)
          if (SampledDataValue != null) return SampledData(SampledDataValue)
          if (SignatureValue != null) return Signature(SignatureValue)
          if (TimingValue != null) return Timing(TimingValue)
          if (ContactDetailValue != null) return ContactDetail(ContactDetailValue)
          if (DataRequirementValue != null) return DataRequirement(DataRequirementValue)
          if (ExpressionValue != null) return Expression(ExpressionValue)
          if (ParameterDefinitionValue != null) return ParameterDefinition(ParameterDefinitionValue)
          if (RelatedArtifactValue != null) return RelatedArtifact(RelatedArtifactValue)
          if (TriggerDefinitionValue != null) return TriggerDefinition(TriggerDefinitionValue)
          if (UsageContextValue != null) return UsageContext(UsageContextValue)
          if (AvailabilityValue != null) return Availability(AvailabilityValue)
          if (ExtendedContactDetailValue != null)
            return ExtendedContactDetail(ExtendedContactDetailValue)
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
     * Allows identification of which elements have their cardinalities impacted by the constraint.
     * Will not be referenced for constraints that do not affect cardinality.
     */
    public var key: Id? = null,
    /**
     * Description of why this constraint is necessary or appropriate.
     *
     * To be used if the reason for the constraint might not be intuitive to all implementers.
     */
    public var requirements: Markdown? = null,
    /**
     * Identifies the impact constraint violation has on the conformance of the instance.
     *
     * This allows constraints to be asserted as "shall" (error) and "should" (warning).
     */
    public var severity: Enumeration<ConstraintSeverity>? = null,
    /**
     * If true, indicates that the warning or best practice guideline should be suppressed.
     *
     * This element should only be present in a derived profile where a warning or hint has been
     * determined to be spurious/incorrect. E.g. a warning encouraging the inclusion of an element
     * that the profile explicitly prohibits.
     */
    public var suppress: Boolean? = null,
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
     * Indicates the degree of conformance expectations associated with this binding - that is, the
     * degree to which the provided value set must be adhered to in the instances.
     *
     * For further discussion, see [Using Terminologies](terminologies.html).
     */
    public var strength: Enumeration<BindingStrength>? = null,
    /** Describes the intended use of this particular set of codes. */
    public var description: Markdown? = null,
    /**
     * Refers to the value set that identifies the set of codes the binding refers to.
     *
     * The reference may be version-specific or not (e.g. have a |[version] at the end of the
     * canonical URL).
     */
    public var valueSet: Canonical? = null,
    /**
     * Additional bindings that help applications implementing this element. Additional bindings do
     * not replace the main binding but provide more information and/or context.
     */
    public var additional: List<Additional>? = null,
  ) : Element() {
    /**
     * Additional bindings that help applications implementing this element. Additional bindings do
     * not replace the main binding but provide more information and/or context.
     */
    @Serializable(with = ElementDefinitionBindingAdditionalSerializer::class)
    public class Additional(
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
       * The use of this additional binding.
       *
       * Conformance bindings are in addition to the base binding, not instead of it.
       */
      public var purpose: Enumeration<AdditionalBindingPurpose>? = null,
      /** The valueSet that is being bound for the purpose. */
      public var valueSet: Canonical? = null,
      /**
       * Documentation of the purpose of use of the bindingproviding additional information about
       * how it is intended to be used.
       */
      public var documentation: Markdown? = null,
      /** Concise documentation - for summary tables. */
      public var shortDoco: String? = null,
      /**
       * Qualifies the usage of the binding. Typically bindings are qualified by jurisdiction, but
       * they may also be qualified by gender, workflow status, clinical domain etc. The information
       * to decide whether a usege context applies is usually outside the resource, determined by
       * context, and this might present challenges for validation tooling.
       *
       * This specification does not define exactly how the context is determined for the usage;
       * typically, this will be described in implementation guides.
       */
      public var usage: List<UsageContext?>? = null,
      /**
       * Whether the binding applies to all repeats, or just to any one of them. This is only
       * relevant for elements that can repeat.
       *
       * A common pattern is to make a conformance binding to all repeats, and then make a binding
       * that one of the repeats must conform to.
       */
      public var any: Boolean? = null,
    ) : Element()
  }

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
    public var comment: Markdown? = null,
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

    public fun asInteger64(): Integer64? = this as? Integer64

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

    public fun asCodeableReference(): CodeableReference? = this as? CodeableReference

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

    public fun asRatioRange(): RatioRange? = this as? RatioRange

    public fun asReference(): Reference? = this as? Reference

    public fun asSampledData(): SampledData? = this as? SampledData

    public fun asSignature(): Signature? = this as? Signature

    public fun asTiming(): Timing? = this as? Timing

    public fun asContactDetail(): ContactDetail? = this as? ContactDetail

    public fun asDataRequirement(): DataRequirement? = this as? DataRequirement

    public fun asExpression(): Expression? = this as? Expression

    public fun asParameterDefinition(): ParameterDefinition? = this as? ParameterDefinition

    public fun asRelatedArtifact(): RelatedArtifact? = this as? RelatedArtifact

    public fun asTriggerDefinition(): TriggerDefinition? = this as? TriggerDefinition

    public fun asUsageContext(): UsageContext? = this as? UsageContext

    public fun asAvailability(): Availability? = this as? Availability

    public fun asExtendedContactDetail(): ExtendedContactDetail? = this as? ExtendedContactDetail

    public fun asDosage(): Dosage? = this as? Dosage

    public fun asMeta(): Meta? = this as? Meta

    public data class Base64Binary(public val `value`: com.google.fhir.model.r5.Base64Binary) :
      DefaultValue

    public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : DefaultValue

    public data class Canonical(public val `value`: com.google.fhir.model.r5.Canonical) :
      DefaultValue

    public data class Code(public val `value`: com.google.fhir.model.r5.Code) : DefaultValue

    public data class Date(public val `value`: com.google.fhir.model.r5.Date) : DefaultValue

    public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) :
      DefaultValue

    public data class Decimal(public val `value`: com.google.fhir.model.r5.Decimal) : DefaultValue

    public data class Id(public val `value`: com.google.fhir.model.r5.Id) : DefaultValue

    public data class Instant(public val `value`: com.google.fhir.model.r5.Instant) : DefaultValue

    public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : DefaultValue

    public data class Integer64(public val `value`: com.google.fhir.model.r5.Integer64) :
      DefaultValue

    public data class Markdown(public val `value`: com.google.fhir.model.r5.Markdown) :
      DefaultValue

    public data class Oid(public val `value`: com.google.fhir.model.r5.Oid) : DefaultValue

    public data class PositiveInt(public val `value`: com.google.fhir.model.r5.PositiveInt) :
      DefaultValue

    public data class String(public val `value`: com.google.fhir.model.r5.String) : DefaultValue

    public data class Time(public val `value`: com.google.fhir.model.r5.Time) : DefaultValue

    public data class UnsignedInt(public val `value`: com.google.fhir.model.r5.UnsignedInt) :
      DefaultValue

    public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : DefaultValue

    public data class Url(public val `value`: com.google.fhir.model.r5.Url) : DefaultValue

    public data class Uuid(public val `value`: com.google.fhir.model.r5.Uuid) : DefaultValue

    public data class Address(public val `value`: com.google.fhir.model.r5.Address) : DefaultValue

    public data class Age(public val `value`: com.google.fhir.model.r5.Age) : DefaultValue

    public data class Annotation(public val `value`: com.google.fhir.model.r5.Annotation) :
      DefaultValue

    public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) :
      DefaultValue

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r5.CodeableConcept
    ) : DefaultValue

    public data class CodeableReference(
      public val `value`: com.google.fhir.model.r5.CodeableReference
    ) : DefaultValue

    public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) : DefaultValue

    public data class ContactPoint(public val `value`: com.google.fhir.model.r5.ContactPoint) :
      DefaultValue

    public data class Count(public val `value`: com.google.fhir.model.r5.Count) : DefaultValue

    public data class Distance(public val `value`: com.google.fhir.model.r5.Distance) :
      DefaultValue

    public data class Duration(public val `value`: com.google.fhir.model.r5.Duration) :
      DefaultValue

    public data class HumanName(public val `value`: com.google.fhir.model.r5.HumanName) :
      DefaultValue

    public data class Identifier(public val `value`: com.google.fhir.model.r5.Identifier) :
      DefaultValue

    public data class Money(public val `value`: com.google.fhir.model.r5.Money) : DefaultValue

    public data class Period(public val `value`: com.google.fhir.model.r5.Period) : DefaultValue

    public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) :
      DefaultValue

    public data class Range(public val `value`: com.google.fhir.model.r5.Range) : DefaultValue

    public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : DefaultValue

    public data class RatioRange(public val `value`: com.google.fhir.model.r5.RatioRange) :
      DefaultValue

    public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) :
      DefaultValue

    public data class SampledData(public val `value`: com.google.fhir.model.r5.SampledData) :
      DefaultValue

    public data class Signature(public val `value`: com.google.fhir.model.r5.Signature) :
      DefaultValue

    public data class Timing(public val `value`: com.google.fhir.model.r5.Timing) : DefaultValue

    public data class ContactDetail(public val `value`: com.google.fhir.model.r5.ContactDetail) :
      DefaultValue

    public data class DataRequirement(
      public val `value`: com.google.fhir.model.r5.DataRequirement
    ) : DefaultValue

    public data class Expression(public val `value`: com.google.fhir.model.r5.Expression) :
      DefaultValue

    public data class ParameterDefinition(
      public val `value`: com.google.fhir.model.r5.ParameterDefinition
    ) : DefaultValue

    public data class RelatedArtifact(
      public val `value`: com.google.fhir.model.r5.RelatedArtifact
    ) : DefaultValue

    public data class TriggerDefinition(
      public val `value`: com.google.fhir.model.r5.TriggerDefinition
    ) : DefaultValue

    public data class UsageContext(public val `value`: com.google.fhir.model.r5.UsageContext) :
      DefaultValue

    public data class Availability(public val `value`: com.google.fhir.model.r5.Availability) :
      DefaultValue

    public data class ExtendedContactDetail(
      public val `value`: com.google.fhir.model.r5.ExtendedContactDetail
    ) : DefaultValue

    public data class Dosage(public val `value`: com.google.fhir.model.r5.Dosage) : DefaultValue

    public data class Meta(public val `value`: com.google.fhir.model.r5.Meta) : DefaultValue

    public companion object {
      public fun from(
        base64BinaryValue: com.google.fhir.model.r5.Base64Binary?,
        booleanValue: com.google.fhir.model.r5.Boolean?,
        canonicalValue: com.google.fhir.model.r5.Canonical?,
        codeValue: com.google.fhir.model.r5.Code?,
        dateValue: com.google.fhir.model.r5.Date?,
        dateTimeValue: com.google.fhir.model.r5.DateTime?,
        decimalValue: com.google.fhir.model.r5.Decimal?,
        idValue: com.google.fhir.model.r5.Id?,
        instantValue: com.google.fhir.model.r5.Instant?,
        integerValue: com.google.fhir.model.r5.Integer?,
        integer64Value: com.google.fhir.model.r5.Integer64?,
        markdownValue: com.google.fhir.model.r5.Markdown?,
        oidValue: com.google.fhir.model.r5.Oid?,
        positiveIntValue: com.google.fhir.model.r5.PositiveInt?,
        stringValue: com.google.fhir.model.r5.String?,
        timeValue: com.google.fhir.model.r5.Time?,
        unsignedIntValue: com.google.fhir.model.r5.UnsignedInt?,
        uriValue: com.google.fhir.model.r5.Uri?,
        urlValue: com.google.fhir.model.r5.Url?,
        uuidValue: com.google.fhir.model.r5.Uuid?,
        AddressValue: com.google.fhir.model.r5.Address?,
        AgeValue: com.google.fhir.model.r5.Age?,
        AnnotationValue: com.google.fhir.model.r5.Annotation?,
        AttachmentValue: com.google.fhir.model.r5.Attachment?,
        CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
        CodeableReferenceValue: com.google.fhir.model.r5.CodeableReference?,
        CodingValue: com.google.fhir.model.r5.Coding?,
        ContactPointValue: com.google.fhir.model.r5.ContactPoint?,
        CountValue: com.google.fhir.model.r5.Count?,
        DistanceValue: com.google.fhir.model.r5.Distance?,
        DurationValue: com.google.fhir.model.r5.Duration?,
        HumanNameValue: com.google.fhir.model.r5.HumanName?,
        IdentifierValue: com.google.fhir.model.r5.Identifier?,
        MoneyValue: com.google.fhir.model.r5.Money?,
        PeriodValue: com.google.fhir.model.r5.Period?,
        QuantityValue: com.google.fhir.model.r5.Quantity?,
        RangeValue: com.google.fhir.model.r5.Range?,
        RatioValue: com.google.fhir.model.r5.Ratio?,
        RatioRangeValue: com.google.fhir.model.r5.RatioRange?,
        ReferenceValue: com.google.fhir.model.r5.Reference?,
        SampledDataValue: com.google.fhir.model.r5.SampledData?,
        SignatureValue: com.google.fhir.model.r5.Signature?,
        TimingValue: com.google.fhir.model.r5.Timing?,
        ContactDetailValue: com.google.fhir.model.r5.ContactDetail?,
        DataRequirementValue: com.google.fhir.model.r5.DataRequirement?,
        ExpressionValue: com.google.fhir.model.r5.Expression?,
        ParameterDefinitionValue: com.google.fhir.model.r5.ParameterDefinition?,
        RelatedArtifactValue: com.google.fhir.model.r5.RelatedArtifact?,
        TriggerDefinitionValue: com.google.fhir.model.r5.TriggerDefinition?,
        UsageContextValue: com.google.fhir.model.r5.UsageContext?,
        AvailabilityValue: com.google.fhir.model.r5.Availability?,
        ExtendedContactDetailValue: com.google.fhir.model.r5.ExtendedContactDetail?,
        DosageValue: com.google.fhir.model.r5.Dosage?,
        MetaValue: com.google.fhir.model.r5.Meta?,
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
        if (integer64Value != null) return Integer64(integer64Value)
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
        if (CodeableReferenceValue != null) return CodeableReference(CodeableReferenceValue)
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
        if (RatioRangeValue != null) return RatioRange(RatioRangeValue)
        if (ReferenceValue != null) return Reference(ReferenceValue)
        if (SampledDataValue != null) return SampledData(SampledDataValue)
        if (SignatureValue != null) return Signature(SignatureValue)
        if (TimingValue != null) return Timing(TimingValue)
        if (ContactDetailValue != null) return ContactDetail(ContactDetailValue)
        if (DataRequirementValue != null) return DataRequirement(DataRequirementValue)
        if (ExpressionValue != null) return Expression(ExpressionValue)
        if (ParameterDefinitionValue != null) return ParameterDefinition(ParameterDefinitionValue)
        if (RelatedArtifactValue != null) return RelatedArtifact(RelatedArtifactValue)
        if (TriggerDefinitionValue != null) return TriggerDefinition(TriggerDefinitionValue)
        if (UsageContextValue != null) return UsageContext(UsageContextValue)
        if (AvailabilityValue != null) return Availability(AvailabilityValue)
        if (ExtendedContactDetailValue != null)
          return ExtendedContactDetail(ExtendedContactDetailValue)
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

    public fun asInteger64(): Integer64? = this as? Integer64

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

    public fun asCodeableReference(): CodeableReference? = this as? CodeableReference

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

    public fun asRatioRange(): RatioRange? = this as? RatioRange

    public fun asReference(): Reference? = this as? Reference

    public fun asSampledData(): SampledData? = this as? SampledData

    public fun asSignature(): Signature? = this as? Signature

    public fun asTiming(): Timing? = this as? Timing

    public fun asContactDetail(): ContactDetail? = this as? ContactDetail

    public fun asDataRequirement(): DataRequirement? = this as? DataRequirement

    public fun asExpression(): Expression? = this as? Expression

    public fun asParameterDefinition(): ParameterDefinition? = this as? ParameterDefinition

    public fun asRelatedArtifact(): RelatedArtifact? = this as? RelatedArtifact

    public fun asTriggerDefinition(): TriggerDefinition? = this as? TriggerDefinition

    public fun asUsageContext(): UsageContext? = this as? UsageContext

    public fun asAvailability(): Availability? = this as? Availability

    public fun asExtendedContactDetail(): ExtendedContactDetail? = this as? ExtendedContactDetail

    public fun asDosage(): Dosage? = this as? Dosage

    public fun asMeta(): Meta? = this as? Meta

    public data class Base64Binary(public val `value`: com.google.fhir.model.r5.Base64Binary) :
      Fixed

    public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Fixed

    public data class Canonical(public val `value`: com.google.fhir.model.r5.Canonical) : Fixed

    public data class Code(public val `value`: com.google.fhir.model.r5.Code) : Fixed

    public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Fixed

    public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Fixed

    public data class Decimal(public val `value`: com.google.fhir.model.r5.Decimal) : Fixed

    public data class Id(public val `value`: com.google.fhir.model.r5.Id) : Fixed

    public data class Instant(public val `value`: com.google.fhir.model.r5.Instant) : Fixed

    public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Fixed

    public data class Integer64(public val `value`: com.google.fhir.model.r5.Integer64) : Fixed

    public data class Markdown(public val `value`: com.google.fhir.model.r5.Markdown) : Fixed

    public data class Oid(public val `value`: com.google.fhir.model.r5.Oid) : Fixed

    public data class PositiveInt(public val `value`: com.google.fhir.model.r5.PositiveInt) : Fixed

    public data class String(public val `value`: com.google.fhir.model.r5.String) : Fixed

    public data class Time(public val `value`: com.google.fhir.model.r5.Time) : Fixed

    public data class UnsignedInt(public val `value`: com.google.fhir.model.r5.UnsignedInt) : Fixed

    public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : Fixed

    public data class Url(public val `value`: com.google.fhir.model.r5.Url) : Fixed

    public data class Uuid(public val `value`: com.google.fhir.model.r5.Uuid) : Fixed

    public data class Address(public val `value`: com.google.fhir.model.r5.Address) : Fixed

    public data class Age(public val `value`: com.google.fhir.model.r5.Age) : Fixed

    public data class Annotation(public val `value`: com.google.fhir.model.r5.Annotation) : Fixed

    public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) : Fixed

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r5.CodeableConcept
    ) : Fixed

    public data class CodeableReference(
      public val `value`: com.google.fhir.model.r5.CodeableReference
    ) : Fixed

    public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) : Fixed

    public data class ContactPoint(public val `value`: com.google.fhir.model.r5.ContactPoint) :
      Fixed

    public data class Count(public val `value`: com.google.fhir.model.r5.Count) : Fixed

    public data class Distance(public val `value`: com.google.fhir.model.r5.Distance) : Fixed

    public data class Duration(public val `value`: com.google.fhir.model.r5.Duration) : Fixed

    public data class HumanName(public val `value`: com.google.fhir.model.r5.HumanName) : Fixed

    public data class Identifier(public val `value`: com.google.fhir.model.r5.Identifier) : Fixed

    public data class Money(public val `value`: com.google.fhir.model.r5.Money) : Fixed

    public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Fixed

    public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Fixed

    public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Fixed

    public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Fixed

    public data class RatioRange(public val `value`: com.google.fhir.model.r5.RatioRange) : Fixed

    public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Fixed

    public data class SampledData(public val `value`: com.google.fhir.model.r5.SampledData) : Fixed

    public data class Signature(public val `value`: com.google.fhir.model.r5.Signature) : Fixed

    public data class Timing(public val `value`: com.google.fhir.model.r5.Timing) : Fixed

    public data class ContactDetail(public val `value`: com.google.fhir.model.r5.ContactDetail) :
      Fixed

    public data class DataRequirement(
      public val `value`: com.google.fhir.model.r5.DataRequirement
    ) : Fixed

    public data class Expression(public val `value`: com.google.fhir.model.r5.Expression) : Fixed

    public data class ParameterDefinition(
      public val `value`: com.google.fhir.model.r5.ParameterDefinition
    ) : Fixed

    public data class RelatedArtifact(
      public val `value`: com.google.fhir.model.r5.RelatedArtifact
    ) : Fixed

    public data class TriggerDefinition(
      public val `value`: com.google.fhir.model.r5.TriggerDefinition
    ) : Fixed

    public data class UsageContext(public val `value`: com.google.fhir.model.r5.UsageContext) :
      Fixed

    public data class Availability(public val `value`: com.google.fhir.model.r5.Availability) :
      Fixed

    public data class ExtendedContactDetail(
      public val `value`: com.google.fhir.model.r5.ExtendedContactDetail
    ) : Fixed

    public data class Dosage(public val `value`: com.google.fhir.model.r5.Dosage) : Fixed

    public data class Meta(public val `value`: com.google.fhir.model.r5.Meta) : Fixed

    public companion object {
      public fun from(
        base64BinaryValue: com.google.fhir.model.r5.Base64Binary?,
        booleanValue: com.google.fhir.model.r5.Boolean?,
        canonicalValue: com.google.fhir.model.r5.Canonical?,
        codeValue: com.google.fhir.model.r5.Code?,
        dateValue: com.google.fhir.model.r5.Date?,
        dateTimeValue: com.google.fhir.model.r5.DateTime?,
        decimalValue: com.google.fhir.model.r5.Decimal?,
        idValue: com.google.fhir.model.r5.Id?,
        instantValue: com.google.fhir.model.r5.Instant?,
        integerValue: com.google.fhir.model.r5.Integer?,
        integer64Value: com.google.fhir.model.r5.Integer64?,
        markdownValue: com.google.fhir.model.r5.Markdown?,
        oidValue: com.google.fhir.model.r5.Oid?,
        positiveIntValue: com.google.fhir.model.r5.PositiveInt?,
        stringValue: com.google.fhir.model.r5.String?,
        timeValue: com.google.fhir.model.r5.Time?,
        unsignedIntValue: com.google.fhir.model.r5.UnsignedInt?,
        uriValue: com.google.fhir.model.r5.Uri?,
        urlValue: com.google.fhir.model.r5.Url?,
        uuidValue: com.google.fhir.model.r5.Uuid?,
        AddressValue: com.google.fhir.model.r5.Address?,
        AgeValue: com.google.fhir.model.r5.Age?,
        AnnotationValue: com.google.fhir.model.r5.Annotation?,
        AttachmentValue: com.google.fhir.model.r5.Attachment?,
        CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
        CodeableReferenceValue: com.google.fhir.model.r5.CodeableReference?,
        CodingValue: com.google.fhir.model.r5.Coding?,
        ContactPointValue: com.google.fhir.model.r5.ContactPoint?,
        CountValue: com.google.fhir.model.r5.Count?,
        DistanceValue: com.google.fhir.model.r5.Distance?,
        DurationValue: com.google.fhir.model.r5.Duration?,
        HumanNameValue: com.google.fhir.model.r5.HumanName?,
        IdentifierValue: com.google.fhir.model.r5.Identifier?,
        MoneyValue: com.google.fhir.model.r5.Money?,
        PeriodValue: com.google.fhir.model.r5.Period?,
        QuantityValue: com.google.fhir.model.r5.Quantity?,
        RangeValue: com.google.fhir.model.r5.Range?,
        RatioValue: com.google.fhir.model.r5.Ratio?,
        RatioRangeValue: com.google.fhir.model.r5.RatioRange?,
        ReferenceValue: com.google.fhir.model.r5.Reference?,
        SampledDataValue: com.google.fhir.model.r5.SampledData?,
        SignatureValue: com.google.fhir.model.r5.Signature?,
        TimingValue: com.google.fhir.model.r5.Timing?,
        ContactDetailValue: com.google.fhir.model.r5.ContactDetail?,
        DataRequirementValue: com.google.fhir.model.r5.DataRequirement?,
        ExpressionValue: com.google.fhir.model.r5.Expression?,
        ParameterDefinitionValue: com.google.fhir.model.r5.ParameterDefinition?,
        RelatedArtifactValue: com.google.fhir.model.r5.RelatedArtifact?,
        TriggerDefinitionValue: com.google.fhir.model.r5.TriggerDefinition?,
        UsageContextValue: com.google.fhir.model.r5.UsageContext?,
        AvailabilityValue: com.google.fhir.model.r5.Availability?,
        ExtendedContactDetailValue: com.google.fhir.model.r5.ExtendedContactDetail?,
        DosageValue: com.google.fhir.model.r5.Dosage?,
        MetaValue: com.google.fhir.model.r5.Meta?,
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
        if (integer64Value != null) return Integer64(integer64Value)
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
        if (CodeableReferenceValue != null) return CodeableReference(CodeableReferenceValue)
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
        if (RatioRangeValue != null) return RatioRange(RatioRangeValue)
        if (ReferenceValue != null) return Reference(ReferenceValue)
        if (SampledDataValue != null) return SampledData(SampledDataValue)
        if (SignatureValue != null) return Signature(SignatureValue)
        if (TimingValue != null) return Timing(TimingValue)
        if (ContactDetailValue != null) return ContactDetail(ContactDetailValue)
        if (DataRequirementValue != null) return DataRequirement(DataRequirementValue)
        if (ExpressionValue != null) return Expression(ExpressionValue)
        if (ParameterDefinitionValue != null) return ParameterDefinition(ParameterDefinitionValue)
        if (RelatedArtifactValue != null) return RelatedArtifact(RelatedArtifactValue)
        if (TriggerDefinitionValue != null) return TriggerDefinition(TriggerDefinitionValue)
        if (UsageContextValue != null) return UsageContext(UsageContextValue)
        if (AvailabilityValue != null) return Availability(AvailabilityValue)
        if (ExtendedContactDetailValue != null)
          return ExtendedContactDetail(ExtendedContactDetailValue)
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

    public fun asInteger64(): Integer64? = this as? Integer64

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

    public fun asCodeableReference(): CodeableReference? = this as? CodeableReference

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

    public fun asRatioRange(): RatioRange? = this as? RatioRange

    public fun asReference(): Reference? = this as? Reference

    public fun asSampledData(): SampledData? = this as? SampledData

    public fun asSignature(): Signature? = this as? Signature

    public fun asTiming(): Timing? = this as? Timing

    public fun asContactDetail(): ContactDetail? = this as? ContactDetail

    public fun asDataRequirement(): DataRequirement? = this as? DataRequirement

    public fun asExpression(): Expression? = this as? Expression

    public fun asParameterDefinition(): ParameterDefinition? = this as? ParameterDefinition

    public fun asRelatedArtifact(): RelatedArtifact? = this as? RelatedArtifact

    public fun asTriggerDefinition(): TriggerDefinition? = this as? TriggerDefinition

    public fun asUsageContext(): UsageContext? = this as? UsageContext

    public fun asAvailability(): Availability? = this as? Availability

    public fun asExtendedContactDetail(): ExtendedContactDetail? = this as? ExtendedContactDetail

    public fun asDosage(): Dosage? = this as? Dosage

    public fun asMeta(): Meta? = this as? Meta

    public data class Base64Binary(public val `value`: com.google.fhir.model.r5.Base64Binary) :
      Pattern

    public data class Boolean(public val `value`: com.google.fhir.model.r5.Boolean) : Pattern

    public data class Canonical(public val `value`: com.google.fhir.model.r5.Canonical) : Pattern

    public data class Code(public val `value`: com.google.fhir.model.r5.Code) : Pattern

    public data class Date(public val `value`: com.google.fhir.model.r5.Date) : Pattern

    public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : Pattern

    public data class Decimal(public val `value`: com.google.fhir.model.r5.Decimal) : Pattern

    public data class Id(public val `value`: com.google.fhir.model.r5.Id) : Pattern

    public data class Instant(public val `value`: com.google.fhir.model.r5.Instant) : Pattern

    public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : Pattern

    public data class Integer64(public val `value`: com.google.fhir.model.r5.Integer64) : Pattern

    public data class Markdown(public val `value`: com.google.fhir.model.r5.Markdown) : Pattern

    public data class Oid(public val `value`: com.google.fhir.model.r5.Oid) : Pattern

    public data class PositiveInt(public val `value`: com.google.fhir.model.r5.PositiveInt) :
      Pattern

    public data class String(public val `value`: com.google.fhir.model.r5.String) : Pattern

    public data class Time(public val `value`: com.google.fhir.model.r5.Time) : Pattern

    public data class UnsignedInt(public val `value`: com.google.fhir.model.r5.UnsignedInt) :
      Pattern

    public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : Pattern

    public data class Url(public val `value`: com.google.fhir.model.r5.Url) : Pattern

    public data class Uuid(public val `value`: com.google.fhir.model.r5.Uuid) : Pattern

    public data class Address(public val `value`: com.google.fhir.model.r5.Address) : Pattern

    public data class Age(public val `value`: com.google.fhir.model.r5.Age) : Pattern

    public data class Annotation(public val `value`: com.google.fhir.model.r5.Annotation) : Pattern

    public data class Attachment(public val `value`: com.google.fhir.model.r5.Attachment) : Pattern

    public data class CodeableConcept(
      public val `value`: com.google.fhir.model.r5.CodeableConcept
    ) : Pattern

    public data class CodeableReference(
      public val `value`: com.google.fhir.model.r5.CodeableReference
    ) : Pattern

    public data class Coding(public val `value`: com.google.fhir.model.r5.Coding) : Pattern

    public data class ContactPoint(public val `value`: com.google.fhir.model.r5.ContactPoint) :
      Pattern

    public data class Count(public val `value`: com.google.fhir.model.r5.Count) : Pattern

    public data class Distance(public val `value`: com.google.fhir.model.r5.Distance) : Pattern

    public data class Duration(public val `value`: com.google.fhir.model.r5.Duration) : Pattern

    public data class HumanName(public val `value`: com.google.fhir.model.r5.HumanName) : Pattern

    public data class Identifier(public val `value`: com.google.fhir.model.r5.Identifier) : Pattern

    public data class Money(public val `value`: com.google.fhir.model.r5.Money) : Pattern

    public data class Period(public val `value`: com.google.fhir.model.r5.Period) : Pattern

    public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : Pattern

    public data class Range(public val `value`: com.google.fhir.model.r5.Range) : Pattern

    public data class Ratio(public val `value`: com.google.fhir.model.r5.Ratio) : Pattern

    public data class RatioRange(public val `value`: com.google.fhir.model.r5.RatioRange) : Pattern

    public data class Reference(public val `value`: com.google.fhir.model.r5.Reference) : Pattern

    public data class SampledData(public val `value`: com.google.fhir.model.r5.SampledData) :
      Pattern

    public data class Signature(public val `value`: com.google.fhir.model.r5.Signature) : Pattern

    public data class Timing(public val `value`: com.google.fhir.model.r5.Timing) : Pattern

    public data class ContactDetail(public val `value`: com.google.fhir.model.r5.ContactDetail) :
      Pattern

    public data class DataRequirement(
      public val `value`: com.google.fhir.model.r5.DataRequirement
    ) : Pattern

    public data class Expression(public val `value`: com.google.fhir.model.r5.Expression) : Pattern

    public data class ParameterDefinition(
      public val `value`: com.google.fhir.model.r5.ParameterDefinition
    ) : Pattern

    public data class RelatedArtifact(
      public val `value`: com.google.fhir.model.r5.RelatedArtifact
    ) : Pattern

    public data class TriggerDefinition(
      public val `value`: com.google.fhir.model.r5.TriggerDefinition
    ) : Pattern

    public data class UsageContext(public val `value`: com.google.fhir.model.r5.UsageContext) :
      Pattern

    public data class Availability(public val `value`: com.google.fhir.model.r5.Availability) :
      Pattern

    public data class ExtendedContactDetail(
      public val `value`: com.google.fhir.model.r5.ExtendedContactDetail
    ) : Pattern

    public data class Dosage(public val `value`: com.google.fhir.model.r5.Dosage) : Pattern

    public data class Meta(public val `value`: com.google.fhir.model.r5.Meta) : Pattern

    public companion object {
      public fun from(
        base64BinaryValue: com.google.fhir.model.r5.Base64Binary?,
        booleanValue: com.google.fhir.model.r5.Boolean?,
        canonicalValue: com.google.fhir.model.r5.Canonical?,
        codeValue: com.google.fhir.model.r5.Code?,
        dateValue: com.google.fhir.model.r5.Date?,
        dateTimeValue: com.google.fhir.model.r5.DateTime?,
        decimalValue: com.google.fhir.model.r5.Decimal?,
        idValue: com.google.fhir.model.r5.Id?,
        instantValue: com.google.fhir.model.r5.Instant?,
        integerValue: com.google.fhir.model.r5.Integer?,
        integer64Value: com.google.fhir.model.r5.Integer64?,
        markdownValue: com.google.fhir.model.r5.Markdown?,
        oidValue: com.google.fhir.model.r5.Oid?,
        positiveIntValue: com.google.fhir.model.r5.PositiveInt?,
        stringValue: com.google.fhir.model.r5.String?,
        timeValue: com.google.fhir.model.r5.Time?,
        unsignedIntValue: com.google.fhir.model.r5.UnsignedInt?,
        uriValue: com.google.fhir.model.r5.Uri?,
        urlValue: com.google.fhir.model.r5.Url?,
        uuidValue: com.google.fhir.model.r5.Uuid?,
        AddressValue: com.google.fhir.model.r5.Address?,
        AgeValue: com.google.fhir.model.r5.Age?,
        AnnotationValue: com.google.fhir.model.r5.Annotation?,
        AttachmentValue: com.google.fhir.model.r5.Attachment?,
        CodeableConceptValue: com.google.fhir.model.r5.CodeableConcept?,
        CodeableReferenceValue: com.google.fhir.model.r5.CodeableReference?,
        CodingValue: com.google.fhir.model.r5.Coding?,
        ContactPointValue: com.google.fhir.model.r5.ContactPoint?,
        CountValue: com.google.fhir.model.r5.Count?,
        DistanceValue: com.google.fhir.model.r5.Distance?,
        DurationValue: com.google.fhir.model.r5.Duration?,
        HumanNameValue: com.google.fhir.model.r5.HumanName?,
        IdentifierValue: com.google.fhir.model.r5.Identifier?,
        MoneyValue: com.google.fhir.model.r5.Money?,
        PeriodValue: com.google.fhir.model.r5.Period?,
        QuantityValue: com.google.fhir.model.r5.Quantity?,
        RangeValue: com.google.fhir.model.r5.Range?,
        RatioValue: com.google.fhir.model.r5.Ratio?,
        RatioRangeValue: com.google.fhir.model.r5.RatioRange?,
        ReferenceValue: com.google.fhir.model.r5.Reference?,
        SampledDataValue: com.google.fhir.model.r5.SampledData?,
        SignatureValue: com.google.fhir.model.r5.Signature?,
        TimingValue: com.google.fhir.model.r5.Timing?,
        ContactDetailValue: com.google.fhir.model.r5.ContactDetail?,
        DataRequirementValue: com.google.fhir.model.r5.DataRequirement?,
        ExpressionValue: com.google.fhir.model.r5.Expression?,
        ParameterDefinitionValue: com.google.fhir.model.r5.ParameterDefinition?,
        RelatedArtifactValue: com.google.fhir.model.r5.RelatedArtifact?,
        TriggerDefinitionValue: com.google.fhir.model.r5.TriggerDefinition?,
        UsageContextValue: com.google.fhir.model.r5.UsageContext?,
        AvailabilityValue: com.google.fhir.model.r5.Availability?,
        ExtendedContactDetailValue: com.google.fhir.model.r5.ExtendedContactDetail?,
        DosageValue: com.google.fhir.model.r5.Dosage?,
        MetaValue: com.google.fhir.model.r5.Meta?,
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
        if (integer64Value != null) return Integer64(integer64Value)
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
        if (CodeableReferenceValue != null) return CodeableReference(CodeableReferenceValue)
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
        if (RatioRangeValue != null) return RatioRange(RatioRangeValue)
        if (ReferenceValue != null) return Reference(ReferenceValue)
        if (SampledDataValue != null) return SampledData(SampledDataValue)
        if (SignatureValue != null) return Signature(SignatureValue)
        if (TimingValue != null) return Timing(TimingValue)
        if (ContactDetailValue != null) return ContactDetail(ContactDetailValue)
        if (DataRequirementValue != null) return DataRequirement(DataRequirementValue)
        if (ExpressionValue != null) return Expression(ExpressionValue)
        if (ParameterDefinitionValue != null) return ParameterDefinition(ParameterDefinitionValue)
        if (RelatedArtifactValue != null) return RelatedArtifact(RelatedArtifactValue)
        if (TriggerDefinitionValue != null) return TriggerDefinition(TriggerDefinitionValue)
        if (UsageContextValue != null) return UsageContext(UsageContextValue)
        if (AvailabilityValue != null) return Availability(AvailabilityValue)
        if (ExtendedContactDetailValue != null)
          return ExtendedContactDetail(ExtendedContactDetailValue)
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

    public fun asInteger64(): Integer64? = this as? Integer64

    public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

    public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

    public fun asQuantity(): Quantity? = this as? Quantity

    public data class Date(public val `value`: com.google.fhir.model.r5.Date) : MinValue

    public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : MinValue

    public data class Instant(public val `value`: com.google.fhir.model.r5.Instant) : MinValue

    public data class Time(public val `value`: com.google.fhir.model.r5.Time) : MinValue

    public data class Decimal(public val `value`: com.google.fhir.model.r5.Decimal) : MinValue

    public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : MinValue

    public data class Integer64(public val `value`: com.google.fhir.model.r5.Integer64) : MinValue

    public data class PositiveInt(public val `value`: com.google.fhir.model.r5.PositiveInt) :
      MinValue

    public data class UnsignedInt(public val `value`: com.google.fhir.model.r5.UnsignedInt) :
      MinValue

    public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : MinValue

    public companion object {
      public fun from(
        dateValue: com.google.fhir.model.r5.Date?,
        dateTimeValue: com.google.fhir.model.r5.DateTime?,
        instantValue: com.google.fhir.model.r5.Instant?,
        timeValue: com.google.fhir.model.r5.Time?,
        decimalValue: com.google.fhir.model.r5.Decimal?,
        integerValue: com.google.fhir.model.r5.Integer?,
        integer64Value: com.google.fhir.model.r5.Integer64?,
        positiveIntValue: com.google.fhir.model.r5.PositiveInt?,
        unsignedIntValue: com.google.fhir.model.r5.UnsignedInt?,
        QuantityValue: com.google.fhir.model.r5.Quantity?,
      ): MinValue? {
        if (dateValue != null) return Date(dateValue)
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (instantValue != null) return Instant(instantValue)
        if (timeValue != null) return Time(timeValue)
        if (decimalValue != null) return Decimal(decimalValue)
        if (integerValue != null) return Integer(integerValue)
        if (integer64Value != null) return Integer64(integer64Value)
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

    public fun asInteger64(): Integer64? = this as? Integer64

    public fun asPositiveInt(): PositiveInt? = this as? PositiveInt

    public fun asUnsignedInt(): UnsignedInt? = this as? UnsignedInt

    public fun asQuantity(): Quantity? = this as? Quantity

    public data class Date(public val `value`: com.google.fhir.model.r5.Date) : MaxValue

    public data class DateTime(public val `value`: com.google.fhir.model.r5.DateTime) : MaxValue

    public data class Instant(public val `value`: com.google.fhir.model.r5.Instant) : MaxValue

    public data class Time(public val `value`: com.google.fhir.model.r5.Time) : MaxValue

    public data class Decimal(public val `value`: com.google.fhir.model.r5.Decimal) : MaxValue

    public data class Integer(public val `value`: com.google.fhir.model.r5.Integer) : MaxValue

    public data class Integer64(public val `value`: com.google.fhir.model.r5.Integer64) : MaxValue

    public data class PositiveInt(public val `value`: com.google.fhir.model.r5.PositiveInt) :
      MaxValue

    public data class UnsignedInt(public val `value`: com.google.fhir.model.r5.UnsignedInt) :
      MaxValue

    public data class Quantity(public val `value`: com.google.fhir.model.r5.Quantity) : MaxValue

    public companion object {
      public fun from(
        dateValue: com.google.fhir.model.r5.Date?,
        dateTimeValue: com.google.fhir.model.r5.DateTime?,
        instantValue: com.google.fhir.model.r5.Instant?,
        timeValue: com.google.fhir.model.r5.Time?,
        decimalValue: com.google.fhir.model.r5.Decimal?,
        integerValue: com.google.fhir.model.r5.Integer?,
        integer64Value: com.google.fhir.model.r5.Integer64?,
        positiveIntValue: com.google.fhir.model.r5.PositiveInt?,
        unsignedIntValue: com.google.fhir.model.r5.UnsignedInt?,
        QuantityValue: com.google.fhir.model.r5.Quantity?,
      ): MaxValue? {
        if (dateValue != null) return Date(dateValue)
        if (dateTimeValue != null) return DateTime(dateTimeValue)
        if (instantValue != null) return Instant(instantValue)
        if (timeValue != null) return Time(timeValue)
        if (decimalValue != null) return Decimal(decimalValue)
        if (integerValue != null) return Integer(integerValue)
        if (integer64Value != null) return Integer64(integer64Value)
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
    Closed("closed", "http://hl7.org/fhir/resource-slicing-rules", "Closed", null),
    Open("open", "http://hl7.org/fhir/resource-slicing-rules", "Open", null),
    OpenAtEnd("openAtEnd", "http://hl7.org/fhir/resource-slicing-rules", "Open at End", null);

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
    Value("value", "http://hl7.org/fhir/discriminator-type", "Value", null),
    Exists("exists", "http://hl7.org/fhir/discriminator-type", "Exists", null),
    Pattern("pattern", "http://hl7.org/fhir/discriminator-type", "Pattern", null),
    Type("type", "http://hl7.org/fhir/discriminator-type", "Type", null),
    Profile("profile", "http://hl7.org/fhir/discriminator-type", "Profile", null),
    Position("position", "http://hl7.org/fhir/discriminator-type", "Position", null);

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
          "position" -> Position
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
    Contained("contained", "http://hl7.org/fhir/resource-aggregation-mode", "Contained", null),
    Referenced("referenced", "http://hl7.org/fhir/resource-aggregation-mode", "Referenced", null),
    Bundled("bundled", "http://hl7.org/fhir/resource-aggregation-mode", "Bundled", null);

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
    Either(
      "either",
      "http://hl7.org/fhir/reference-version-rules",
      "Either Specific or independent",
      null,
    ),
    Independent(
      "independent",
      "http://hl7.org/fhir/reference-version-rules",
      "Version independent",
      null,
    ),
    Specific("specific", "http://hl7.org/fhir/reference-version-rules", "Version Specific", null);

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
    Error("error", "http://hl7.org/fhir/constraint-severity", "Error", null),
    Warning("warning", "http://hl7.org/fhir/constraint-severity", "Warning", null);

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

  /** Additional Binding Purpose */
  public enum class AdditionalBindingPurpose(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    Maximum(
      "maximum",
      "http://hl7.org/fhir/CodeSystem/additional-binding-purpose",
      "Maximum Binding",
      null,
    ),
    Minimum(
      "minimum",
      "http://hl7.org/fhir/CodeSystem/additional-binding-purpose",
      "Minimum Binding",
      null,
    ),
    Required(
      "required",
      "http://hl7.org/fhir/CodeSystem/additional-binding-purpose",
      "Required Binding",
      null,
    ),
    Extensible(
      "extensible",
      "http://hl7.org/fhir/CodeSystem/additional-binding-purpose",
      "Conformance Binding",
      null,
    ),
    Candidate(
      "candidate",
      "http://hl7.org/fhir/CodeSystem/additional-binding-purpose",
      "Candidate Binding",
      null,
    ),
    Current(
      "current",
      "http://hl7.org/fhir/CodeSystem/additional-binding-purpose",
      "Current Binding",
      null,
    ),
    Preferred(
      "preferred",
      "http://hl7.org/fhir/CodeSystem/additional-binding-purpose",
      "Preferred Binding",
      null,
    ),
    Ui(
      "ui",
      "http://hl7.org/fhir/CodeSystem/additional-binding-purpose",
      "UI Suggested Binding",
      null,
    ),
    Starter(
      "starter",
      "http://hl7.org/fhir/CodeSystem/additional-binding-purpose",
      "Starter Binding",
      null,
    ),
    Component(
      "component",
      "http://hl7.org/fhir/CodeSystem/additional-binding-purpose",
      "Component Binding",
      null,
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): AdditionalBindingPurpose =
        when (code) {
          "maximum" -> Maximum
          "minimum" -> Minimum
          "required" -> Required
          "extensible" -> Extensible
          "candidate" -> Candidate
          "current" -> Current
          "preferred" -> Preferred
          "ui" -> Ui
          "starter" -> Starter
          "component" -> Component
          else ->
            throw IllegalArgumentException("Unknown code $code for enum AdditionalBindingPurpose")
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
    XmlAttr("xmlAttr", "http://hl7.org/fhir/property-representation", "XML Attribute", null),
    XmlText("xmlText", "http://hl7.org/fhir/property-representation", "XML Text", null),
    TypeAttr("typeAttr", "http://hl7.org/fhir/property-representation", "Type Attribute", null),
    CdaText("cdaText", "http://hl7.org/fhir/property-representation", "CDA Text Format", null),
    Xhtml("xhtml", "http://hl7.org/fhir/property-representation", "XHTML", null);

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
