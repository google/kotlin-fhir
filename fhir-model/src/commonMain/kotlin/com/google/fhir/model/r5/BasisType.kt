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

package com.google.fhir.model.r5

/** All FHIR types */
public enum class BasisType(
  private val code: kotlin.String,
  private val system: kotlin.String,
  private val display: kotlin.String?,
  private val definition: kotlin.String?,
) {
  /** Base Type: Base definition for all types defined in FHIR type system. */
  Base(
    "Base",
    "http://hl7.org/fhir/fhir-types",
    "Base",
    "Base Type: Base definition for all types defined in FHIR type system.",
  ),
  /** Element Type: Base definition for all elements in a resource. */
  Element(
    "Element",
    "http://hl7.org/fhir/fhir-types",
    "Element",
    "Element Type: Base definition for all elements in a resource.",
  ),
  /**
   * BackboneElement Type: Base definition for all elements that are defined inside a resource - but
   * not those in a data type.
   */
  BackboneElement(
    "BackboneElement",
    "http://hl7.org/fhir/fhir-types",
    "BackboneElement",
    "BackboneElement Type: Base definition for all elements that are defined inside a resource - but not those in a data type.",
  ),
  /**
   * DataType Type: The base class for all re-useable types defined as part of the FHIR
   * Specification.
   */
  DataType(
    "DataType",
    "http://hl7.org/fhir/fhir-types",
    "DataType",
    "DataType Type: The base class for all re-useable types defined as part of the FHIR Specification.",
  ),
  /**
   * Address Type: An address expressed using postal conventions (as opposed to GPS or other
   * location definition formats). This data type may be used to convey addresses for use in
   * delivering mail as well as for visiting locations which might not be valid for mail delivery.
   * There are a variety of postal address formats defined around the world. The
   * ISO21090-codedString may be used to provide a coded representation of the contents of strings
   * in an Address.
   */
  Address(
    "Address",
    "http://hl7.org/fhir/fhir-types",
    "Address",
    """
  |Address Type: An address expressed using postal conventions (as opposed to GPS or other location definition formats).  This data type may be used to convey addresses for use in delivering mail as well as for visiting locations which might not be valid for mail delivery.  There are a variety of postal address formats defined around the world.
  |The ISO21090-codedString may be used to provide a coded representation of the contents of strings in an Address.
  """
      .trimMargin(),
  ),
  /**
   * Annotation Type: A text note which also contains information about who made the statement and
   * when.
   */
  Annotation(
    "Annotation",
    "http://hl7.org/fhir/fhir-types",
    "Annotation",
    "Annotation Type: A  text note which also  contains information about who made the statement and when.",
  ),
  /** Attachment Type: For referring to data content defined in other formats. */
  Attachment(
    "Attachment",
    "http://hl7.org/fhir/fhir-types",
    "Attachment",
    "Attachment Type: For referring to data content defined in other formats.",
  ),
  /** Availability Type: Availability data for an {item}. */
  Availability(
    "Availability",
    "http://hl7.org/fhir/fhir-types",
    "Availability",
    "Availability Type: Availability data for an {item}.",
  ),
  /**
   * BackboneType Type: Base definition for the few data types that are allowed to carry modifier
   * extensions.
   */
  BackboneType(
    "BackboneType",
    "http://hl7.org/fhir/fhir-types",
    "BackboneType",
    "BackboneType Type: Base definition for the few data types that are allowed to carry modifier extensions.",
  ),
  /** Dosage Type: Indicates how the medication is/was taken or should be taken by the patient. */
  Dosage(
    "Dosage",
    "http://hl7.org/fhir/fhir-types",
    "Dosage",
    "Dosage Type: Indicates how the medication is/was taken or should be taken by the patient.",
  ),
  /**
   * ElementDefinition Type: Captures constraints on each element within the resource, profile, or
   * extension.
   */
  ElementDefinition(
    "ElementDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ElementDefinition",
    "ElementDefinition Type: Captures constraints on each element within the resource, profile, or extension.",
  ),
  /**
   * MarketingStatus Type: The marketing status describes the date when a medicinal product is
   * actually put on the market or the date as of which it is no longer available.
   */
  MarketingStatus(
    "MarketingStatus",
    "http://hl7.org/fhir/fhir-types",
    "MarketingStatus",
    "MarketingStatus Type: The marketing status describes the date when a medicinal product is actually put on the market or the date as of which it is no longer available.",
  ),
  /**
   * ProductShelfLife Type: The shelf-life and storage information for a medicinal product item or
   * container can be described using this class.
   */
  ProductShelfLife(
    "ProductShelfLife",
    "http://hl7.org/fhir/fhir-types",
    "ProductShelfLife",
    "ProductShelfLife Type: The shelf-life and storage information for a medicinal product item or container can be described using this class.",
  ),
  /**
   * Timing Type: Specifies an event that may occur multiple times. Timing schedules are used to
   * record when things are planned, expected or requested to occur. The most common usage is in
   * dosage instructions for medications. They are also used when planning care of various kinds,
   * and may be used for reporting the schedule to which past regular activities were carried out.
   */
  Timing(
    "Timing",
    "http://hl7.org/fhir/fhir-types",
    "Timing",
    "Timing Type: Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out.",
  ),
  /**
   * CodeableConcept Type: A concept that may be defined by a formal reference to a terminology or
   * ontology or may be provided by text.
   */
  CodeableConcept(
    "CodeableConcept",
    "http://hl7.org/fhir/fhir-types",
    "CodeableConcept",
    "CodeableConcept Type: A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text.",
  ),
  /**
   * CodeableReference Type: A reference to a resource (by instance), or instead, a reference to a
   * concept defined in a terminology or ontology (by class).
   */
  CodeableReference(
    "CodeableReference",
    "http://hl7.org/fhir/fhir-types",
    "CodeableReference",
    "CodeableReference Type: A reference to a resource (by instance), or instead, a reference to a concept defined in a terminology or ontology (by class).",
  ),
  /** Coding Type: A reference to a code defined by a terminology system. */
  Coding(
    "Coding",
    "http://hl7.org/fhir/fhir-types",
    "Coding",
    "Coding Type: A reference to a code defined by a terminology system.",
  ),
  /** ContactDetail Type: Specifies contact information for a person or organization. */
  ContactDetail(
    "ContactDetail",
    "http://hl7.org/fhir/fhir-types",
    "ContactDetail",
    "ContactDetail Type: Specifies contact information for a person or organization.",
  ),
  /**
   * ContactPoint Type: Details for all kinds of technology mediated contact points for a person or
   * organization, including telephone, email, etc.
   */
  ContactPoint(
    "ContactPoint",
    "http://hl7.org/fhir/fhir-types",
    "ContactPoint",
    "ContactPoint Type: Details for all kinds of technology mediated contact points for a person or organization, including telephone, email, etc.",
  ),
  /**
   * Contributor Type: A contributor to the content of a knowledge asset, including authors,
   * editors, reviewers, and endorsers.
   */
  Contributor(
    "Contributor",
    "http://hl7.org/fhir/fhir-types",
    "Contributor",
    "Contributor Type: A contributor to the content of a knowledge asset, including authors, editors, reviewers, and endorsers.",
  ),
  /**
   * DataRequirement Type: Describes a required data item for evaluation in terms of the type of
   * data, and optional code or date-based filters of the data.
   */
  DataRequirement(
    "DataRequirement",
    "http://hl7.org/fhir/fhir-types",
    "DataRequirement",
    "DataRequirement Type: Describes a required data item for evaluation in terms of the type of data, and optional code or date-based filters of the data.",
  ),
  /**
   * Expression Type: A expression that is evaluated in a specified context and returns a value. The
   * context of use of the expression must specify the context in which the expression is evaluated,
   * and how the result of the expression is used.
   */
  Expression(
    "Expression",
    "http://hl7.org/fhir/fhir-types",
    "Expression",
    "Expression Type: A expression that is evaluated in a specified context and returns a value. The context of use of the expression must specify the context in which the expression is evaluated, and how the result of the expression is used.",
  ),
  /**
   * ExtendedContactDetail Type: Specifies contact information for a specific purpose over a period
   * of time, might be handled/monitored by a specific named person or organization.
   */
  ExtendedContactDetail(
    "ExtendedContactDetail",
    "http://hl7.org/fhir/fhir-types",
    "ExtendedContactDetail",
    "ExtendedContactDetail Type: Specifies contact information for a specific purpose over a period of time, might be handled/monitored by a specific named person or organization.",
  ),
  /** Extension Type: Optional Extension Element - found in all resources. */
  Extension(
    "Extension",
    "http://hl7.org/fhir/fhir-types",
    "Extension",
    "Extension Type: Optional Extension Element - found in all resources.",
  ),
  /**
   * HumanName Type: A name, normally of a human, that can be used for other living entities (e.g.
   * animals but not organizations) that have been assigned names by a human and may need the use of
   * name parts or the need for usage information.
   */
  HumanName(
    "HumanName",
    "http://hl7.org/fhir/fhir-types",
    "HumanName",
    "HumanName Type: A name, normally of a human, that can be used for other living entities (e.g. animals but not organizations) that have been assigned names by a human and may need the use of name parts or the need for usage information.",
  ),
  /**
   * Identifier Type: An identifier - identifies some entity uniquely and unambiguously. Typically
   * this is used for business identifiers.
   */
  Identifier(
    "Identifier",
    "http://hl7.org/fhir/fhir-types",
    "Identifier",
    "Identifier Type: An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.",
  ),
  /**
   * Meta Type: The metadata about a resource. This is content in the resource that is maintained by
   * the infrastructure. Changes to the content might not always be associated with version changes
   * to the resource.
   */
  Meta(
    "Meta",
    "http://hl7.org/fhir/fhir-types",
    "Meta",
    "Meta Type: The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.",
  ),
  /** MonetaryComponent Type: Availability data for an {item}. */
  MonetaryComponent(
    "MonetaryComponent",
    "http://hl7.org/fhir/fhir-types",
    "MonetaryComponent",
    "MonetaryComponent Type: Availability data for an {item}.",
  ),
  /** Money Type: An amount of economic utility in some recognized currency. */
  Money(
    "Money",
    "http://hl7.org/fhir/fhir-types",
    "Money",
    "Money Type: An amount of economic utility in some recognized currency.",
  ),
  /**
   * Narrative Type: A human-readable summary of the resource conveying the essential clinical and
   * business information for the resource.
   */
  Narrative(
    "Narrative",
    "http://hl7.org/fhir/fhir-types",
    "Narrative",
    "Narrative Type: A human-readable summary of the resource conveying the essential clinical and business information for the resource.",
  ),
  /**
   * ParameterDefinition Type: The parameters to the module. This collection specifies both the
   * input and output parameters. Input parameters are provided by the caller as part of the
   * $evaluate operation. Output parameters are included in the GuidanceResponse.
   */
  ParameterDefinition(
    "ParameterDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ParameterDefinition",
    "ParameterDefinition Type: The parameters to the module. This collection specifies both the input and output parameters. Input parameters are provided by the caller as part of the ${'$'}evaluate operation. Output parameters are included in the GuidanceResponse.",
  ),
  /** Period Type: A time period defined by a start and end date and optionally time. */
  Period(
    "Period",
    "http://hl7.org/fhir/fhir-types",
    "Period",
    "Period Type: A time period defined by a start and end date and optionally time.",
  ),
  /**
   * PrimitiveType Type: The base type for all re-useable types defined that have a simple property.
   */
  PrimitiveType(
    "PrimitiveType",
    "http://hl7.org/fhir/fhir-types",
    "PrimitiveType",
    "PrimitiveType Type: The base type for all re-useable types defined that have a simple property.",
  ),
  /** base64Binary Type: A stream of bytes */
  Base64Binary(
    "base64Binary",
    "http://hl7.org/fhir/fhir-types",
    "base64Binary",
    "base64Binary Type: A stream of bytes",
  ),
  /** boolean Type: Value of "true" or "false" */
  Boolean(
    "boolean",
    "http://hl7.org/fhir/fhir-types",
    "boolean",
    "boolean Type: Value of \"true\" or \"false\"",
  ),
  /**
   * date Type: A date or partial date (e.g. just year or year + month). There is no UTC offset. The
   * format is a union of the schema types gYear, gYearMonth and date. Dates SHALL be valid dates.
   */
  Date(
    "date",
    "http://hl7.org/fhir/fhir-types",
    "date",
    "date Type: A date or partial date (e.g. just year or year + month). There is no UTC offset. The format is a union of the schema types gYear, gYearMonth and date.  Dates SHALL be valid dates.",
  ),
  /**
   * dateTime Type: A date, date-time or partial date (e.g. just year or year + month). If hours and
   * minutes are specified, a UTC offset SHALL be populated. The format is a union of the schema
   * types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type
   * constraints but may be zero-filled and may be ignored. Dates SHALL be valid dates.
   */
  DateTime(
    "dateTime",
    "http://hl7.org/fhir/fhir-types",
    "dateTime",
    "dateTime Type: A date, date-time or partial date (e.g. just year or year + month).  If hours and minutes are specified, a UTC offset SHALL be populated. The format is a union of the schema types gYear, gYearMonth, date and dateTime. Seconds must be provided due to schema type constraints but may be zero-filled and may be ignored.                 Dates SHALL be valid dates.",
  ),
  /** decimal Type: A rational number with implicit precision */
  Decimal(
    "decimal",
    "http://hl7.org/fhir/fhir-types",
    "decimal",
    "decimal Type: A rational number with implicit precision",
  ),
  /** instant Type: An instant in time - known at least to the second */
  Instant(
    "instant",
    "http://hl7.org/fhir/fhir-types",
    "instant",
    "instant Type: An instant in time - known at least to the second",
  ),
  /** integer Type: A whole number */
  Integer("integer", "http://hl7.org/fhir/fhir-types", "integer", "integer Type: A whole number"),
  /** positiveInt type: An integer with a value that is positive (e.g. >0) */
  PositiveInt(
    "positiveInt",
    "http://hl7.org/fhir/fhir-types",
    "positiveInt",
    "positiveInt type: An integer with a value that is positive (e.g. >0)",
  ),
  /** unsignedInt type: An integer with a value that is not negative (e.g. >= 0) */
  UnsignedInt(
    "unsignedInt",
    "http://hl7.org/fhir/fhir-types",
    "unsignedInt",
    "unsignedInt type: An integer with a value that is not negative (e.g. >= 0)",
  ),
  /** integer64 Type: A very large whole number */
  Integer64(
    "integer64",
    "http://hl7.org/fhir/fhir-types",
    "integer64",
    "integer64 Type: A very large whole number",
  ),
  /** string Type: A sequence of Unicode characters */
  String(
    "string",
    "http://hl7.org/fhir/fhir-types",
    "string",
    "string Type: A sequence of Unicode characters",
  ),
  /**
   * code type: A string which has at least one character and no leading or trailing whitespace and
   * where there is no whitespace other than single spaces in the contents
   */
  Code(
    "code",
    "http://hl7.org/fhir/fhir-types",
    "code",
    "code type: A string which has at least one character and no leading or trailing whitespace and where there is no whitespace other than single spaces in the contents",
  ),
  /**
   * id type: Any combination of letters, numerals, "-" and ".", with a length limit of 64
   * characters. (This might be an integer, an unprefixed OID, UUID or any other identifier pattern
   * that meets these constraints.) Ids are case-insensitive.
   */
  Id(
    "id",
    "http://hl7.org/fhir/fhir-types",
    "id",
    "id type: Any combination of letters, numerals, \"-\" and \".\", with a length limit of 64 characters.  (This might be an integer, an unprefixed OID, UUID or any other identifier pattern that meets these constraints.)  Ids are case-insensitive.",
  ),
  /**
   * markdown type: A string that may contain Github Flavored Markdown syntax for optional
   * processing by a mark down presentation engine
   */
  Markdown(
    "markdown",
    "http://hl7.org/fhir/fhir-types",
    "markdown",
    "markdown type: A string that may contain Github Flavored Markdown syntax for optional processing by a mark down presentation engine",
  ),
  /** time Type: A time during the day, with no date specified */
  Time(
    "time",
    "http://hl7.org/fhir/fhir-types",
    "time",
    "time Type: A time during the day, with no date specified",
  ),
  /** uri Type: String of characters used to identify a name or a resource */
  Uri(
    "uri",
    "http://hl7.org/fhir/fhir-types",
    "uri",
    "uri Type: String of characters used to identify a name or a resource",
  ),
  /** canonical type: A URI that is a reference to a canonical URL on a FHIR resource */
  Canonical(
    "canonical",
    "http://hl7.org/fhir/fhir-types",
    "canonical",
    "canonical type: A URI that is a reference to a canonical URL on a FHIR resource",
  ),
  /** oid type: An OID represented as a URI */
  Oid("oid", "http://hl7.org/fhir/fhir-types", "oid", "oid type: An OID represented as a URI"),
  /** url type: A URI that is a literal reference */
  Url(
    "url",
    "http://hl7.org/fhir/fhir-types",
    "url",
    "url type: A URI that is a literal reference",
  ),
  /** uuid type: A UUID, represented as a URI */
  Uuid("uuid", "http://hl7.org/fhir/fhir-types", "uuid", "uuid type: A UUID, represented as a URI"),
  /**
   * Quantity Type: A measured amount (or an amount that can potentially be measured). Note that
   * measured amounts include amounts that are not precisely quantified, including amounts involving
   * arbitrary units and floating currencies.
   */
  Quantity(
    "Quantity",
    "http://hl7.org/fhir/fhir-types",
    "Quantity",
    "Quantity Type: A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.",
  ),
  /** Age Type: A duration of time during which an organism (or a process) has existed. */
  Age(
    "Age",
    "http://hl7.org/fhir/fhir-types",
    "Age",
    "Age Type: A duration of time during which an organism (or a process) has existed.",
  ),
  /**
   * Count Type: A measured amount (or an amount that can potentially be measured). Note that
   * measured amounts include amounts that are not precisely quantified, including amounts involving
   * arbitrary units and floating currencies.
   */
  Count(
    "Count",
    "http://hl7.org/fhir/fhir-types",
    "Count",
    "Count Type: A measured amount (or an amount that can potentially be measured). Note that measured amounts include amounts that are not precisely quantified, including amounts involving arbitrary units and floating currencies.",
  ),
  /** Distance Type: A length - a value with a unit that is a physical distance. */
  Distance(
    "Distance",
    "http://hl7.org/fhir/fhir-types",
    "Distance",
    "Distance Type: A length - a value with a unit that is a physical distance.",
  ),
  /** Duration Type: A length of time. */
  Duration(
    "Duration",
    "http://hl7.org/fhir/fhir-types",
    "Duration",
    "Duration Type: A length of time.",
  ),
  /** Range Type: A set of ordered Quantities defined by a low and high limit. */
  Range(
    "Range",
    "http://hl7.org/fhir/fhir-types",
    "Range",
    "Range Type: A set of ordered Quantities defined by a low and high limit.",
  ),
  /**
   * Ratio Type: A relationship of two Quantity values - expressed as a numerator and a denominator.
   */
  Ratio(
    "Ratio",
    "http://hl7.org/fhir/fhir-types",
    "Ratio",
    "Ratio Type: A relationship of two Quantity values - expressed as a numerator and a denominator.",
  ),
  /** RatioRange Type: A range of ratios expressed as a low and high numerator and a denominator. */
  RatioRange(
    "RatioRange",
    "http://hl7.org/fhir/fhir-types",
    "RatioRange",
    "RatioRange Type: A range of ratios expressed as a low and high numerator and a denominator.",
  ),
  /** Reference Type: A reference from one resource to another. */
  Reference(
    "Reference",
    "http://hl7.org/fhir/fhir-types",
    "Reference",
    "Reference Type: A reference from one resource to another.",
  ),
  /**
   * RelatedArtifact Type: Related artifacts such as additional documentation, justification, or
   * bibliographic references.
   */
  RelatedArtifact(
    "RelatedArtifact",
    "http://hl7.org/fhir/fhir-types",
    "RelatedArtifact",
    "RelatedArtifact Type: Related artifacts such as additional documentation, justification, or bibliographic references.",
  ),
  /**
   * SampledData Type: A series of measurements taken by a device, with upper and lower limits.
   * There may be more than one dimension in the data.
   */
  SampledData(
    "SampledData",
    "http://hl7.org/fhir/fhir-types",
    "SampledData",
    "SampledData Type: A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.",
  ),
  /**
   * Signature Type: A signature along with supporting context. The signature may be a digital
   * signature that is cryptographic in nature, or some other signature acceptable to the domain.
   * This other signature may be as simple as a graphical image representing a hand-written
   * signature, or a signature ceremony Different signature approaches have different utilities.
   */
  Signature(
    "Signature",
    "http://hl7.org/fhir/fhir-types",
    "Signature",
    "Signature Type: A signature along with supporting context. The signature may be a digital signature that is cryptographic in nature, or some other signature acceptable to the domain. This other signature may be as simple as a graphical image representing a hand-written signature, or a signature ceremony Different signature approaches have different utilities.",
  ),
  /**
   * TriggerDefinition Type: A description of a triggering event. Triggering events can be named
   * events, data events, or periodic, as determined by the type element.
   */
  TriggerDefinition(
    "TriggerDefinition",
    "http://hl7.org/fhir/fhir-types",
    "TriggerDefinition",
    "TriggerDefinition Type: A description of a triggering event. Triggering events can be named events, data events, or periodic, as determined by the type element.",
  ),
  /**
   * UsageContext Type: Specifies clinical/business/etc. metadata that can be used to retrieve,
   * index and/or categorize an artifact. This metadata can either be specific to the applicable
   * population (e.g., age category, DRG) or the specific context of care (e.g., venue, care
   * setting, provider of care).
   */
  UsageContext(
    "UsageContext",
    "http://hl7.org/fhir/fhir-types",
    "UsageContext",
    "UsageContext Type: Specifies clinical/business/etc. metadata that can be used to retrieve, index and/or categorize an artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care).",
  ),
  /** VirtualServiceDetail Type: Virtual Service Contact Details. */
  VirtualServiceDetail(
    "VirtualServiceDetail",
    "http://hl7.org/fhir/fhir-types",
    "VirtualServiceDetail",
    "VirtualServiceDetail Type: Virtual Service Contact Details.",
  ),
  /** xhtml Type definition */
  Xhtml("xhtml", "http://hl7.org/fhir/fhir-types", "xhtml", "xhtml Type definition"),
  /** This is the base resource type for everything. */
  Resource(
    "Resource",
    "http://hl7.org/fhir/fhir-types",
    "Resource",
    "This is the base resource type for everything.",
  ),
  /**
   * A resource that represents the data of a single raw artifact as digital content accessible in
   * its native format. A Binary resource can contain any content, whether text, image, pdf, zip
   * archive, etc.
   */
  Binary(
    "Binary",
    "http://hl7.org/fhir/fhir-types",
    "Binary",
    "A resource that represents the data of a single raw artifact as digital content accessible in its native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive, etc.",
  ),
  /** A container for a collection of resources. */
  Bundle(
    "Bundle",
    "http://hl7.org/fhir/fhir-types",
    "Bundle",
    "A container for a collection of resources.",
  ),
  /** A resource that includes narrative, extensions, and contained resources. */
  DomainResource(
    "DomainResource",
    "http://hl7.org/fhir/fhir-types",
    "DomainResource",
    "A resource that includes narrative, extensions, and contained resources.",
  ),
  /**
   * A financial tool for tracking value accrued for a particular purpose. In the healthcare field,
   * used to track charges for a patient, cost centers, etc.
   */
  Account(
    "Account",
    "http://hl7.org/fhir/fhir-types",
    "Account",
    "A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centers, etc.",
  ),
  /**
   * This resource allows for the definition of some activity to be performed, independent of a
   * particular patient, practitioner, or other performance context.
   */
  ActivityDefinition(
    "ActivityDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ActivityDefinition",
    "This resource allows for the definition of some activity to be performed, independent of a particular patient, practitioner, or other performance context.",
  ),
  /**
   * The ActorDefinition resource is used to describe an actor - a human or an application that
   * plays a role in data exchange, and that may have obligations associated with the role the actor
   * plays.
   */
  ActorDefinition(
    "ActorDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ActorDefinition",
    "The ActorDefinition resource is used to describe an actor - a human or an application that plays a role in data exchange, and that may have obligations associated with the role the actor plays.",
  ),
  /**
   * A medicinal product in the final form which is suitable for administering to a patient (after
   * any mixing of multiple components, dissolution etc. has been performed).
   */
  AdministrableProductDefinition(
    "AdministrableProductDefinition",
    "http://hl7.org/fhir/fhir-types",
    "AdministrableProductDefinition",
    "A medicinal product in the final form which is suitable for administering to a patient (after any mixing of multiple components, dissolution etc. has been performed).",
  ),
  /**
   * An event (i.e. any change to current patient status) that may be related to unintended effects
   * on a patient or research participant. The unintended effects may require additional monitoring,
   * treatment, hospitalization, or may result in death. The AdverseEvent resource also extends to
   * potential or avoided events that could have had such effects. There are two major domains where
   * the AdverseEvent resource is expected to be used. One is in clinical care reported adverse
   * events and the other is in reporting adverse events in clinical research trial management.
   * Adverse events can be reported by healthcare providers, patients, caregivers or by medical
   * products manufacturers. Given the differences between these two concepts, we recommend
   * consulting the domain specific implementation guides when implementing the AdverseEvent
   * Resource. The implementation guides include specific extensions, value sets and constraints.
   */
  AdverseEvent(
    "AdverseEvent",
    "http://hl7.org/fhir/fhir-types",
    "AdverseEvent",
    "An event (i.e. any change to current patient status) that may be related to unintended effects on a patient or research participant. The unintended effects may require additional monitoring, treatment, hospitalization, or may result in death. The AdverseEvent resource also extends to potential or avoided events that could have had such effects. There are two major domains where the AdverseEvent resource is expected to be used. One is in clinical care reported adverse events and the other is in reporting adverse events in clinical  research trial management.  Adverse events can be reported by healthcare providers, patients, caregivers or by medical products manufacturers.  Given the differences between these two concepts, we recommend consulting the domain specific implementation guides when implementing the AdverseEvent Resource. The implementation guides include specific extensions, value sets and constraints.",
  ),
  /**
   * Risk of harmful or undesirable, physiological response which is unique to an individual and
   * associated with exposure to a substance.
   */
  AllergyIntolerance(
    "AllergyIntolerance",
    "http://hl7.org/fhir/fhir-types",
    "AllergyIntolerance",
    "Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.",
  ),
  /**
   * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or
   * device(s) for a specific date/time. This may result in one or more Encounter(s).
   */
  Appointment(
    "Appointment",
    "http://hl7.org/fhir/fhir-types",
    "Appointment",
    "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).",
  ),
  /**
   * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation
   * or rejection.
   */
  AppointmentResponse(
    "AppointmentResponse",
    "http://hl7.org/fhir/fhir-types",
    "AppointmentResponse",
    "A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.",
  ),
  /**
   * This Resource provides one or more comments, classifiers or ratings about a Resource and
   * supports attribution and rights management metadata for the added content.
   */
  ArtifactAssessment(
    "ArtifactAssessment",
    "http://hl7.org/fhir/fhir-types",
    "ArtifactAssessment",
    "This Resource provides one or more comments, classifiers or ratings about a Resource and supports attribution and rights management metadata for the added content.",
  ),
  /**
   * A record of an event relevant for purposes such as operations, privacy, security, maintenance,
   * and performance analysis.
   */
  AuditEvent(
    "AuditEvent",
    "http://hl7.org/fhir/fhir-types",
    "AuditEvent",
    "A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis.",
  ),
  /**
   * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that
   * don't map to an existing resource, and custom resources not appropriate for inclusion in the
   * FHIR specification.
   */
  Basic(
    "Basic",
    "http://hl7.org/fhir/fhir-types",
    "Basic",
    "Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.",
  ),
  /**
   * A biological material originating from a biological entity intended to be transplanted or
   * infused into another (possibly the same) biological entity.
   */
  BiologicallyDerivedProduct(
    "BiologicallyDerivedProduct",
    "http://hl7.org/fhir/fhir-types",
    "BiologicallyDerivedProduct",
    "A biological material originating from a biological entity intended to be transplanted or infused into another (possibly the same) biological entity.",
  ),
  /** A record of dispensation of a biologically derived product. */
  BiologicallyDerivedProductDispense(
    "BiologicallyDerivedProductDispense",
    "http://hl7.org/fhir/fhir-types",
    "BiologicallyDerivedProductDispense",
    "A record of dispensation of a biologically derived product.",
  ),
  /**
   * Record details about an anatomical structure. This resource may be used when a coded concept
   * does not provide the necessary detail needed for the use case.
   */
  BodyStructure(
    "BodyStructure",
    "http://hl7.org/fhir/fhir-types",
    "BodyStructure",
    "Record details about an anatomical structure.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.",
  ),
  /** Common Interface declaration for conformance and knowledge artifact resources. */
  CanonicalResource(
    "CanonicalResource",
    "http://hl7.org/fhir/fhir-types",
    "CanonicalResource",
    "Common Interface declaration for conformance and knowledge artifact resources.",
  ),
  /**
   * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server or Client
   * for a particular version of FHIR that may be used as a statement of actual server functionality
   * or a statement of required or desired server implementation.
   */
  CapabilityStatement(
    "CapabilityStatement",
    "http://hl7.org/fhir/fhir-types",
    "CapabilityStatement",
    "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server or Client for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.",
  ),
  /**
   * Describes the intention of how one or more practitioners intend to deliver care for a
   * particular patient, group or community for a period of time, possibly limited to care for a
   * specific condition or set of conditions.
   */
  CarePlan(
    "CarePlan",
    "http://hl7.org/fhir/fhir-types",
    "CarePlan",
    "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.",
  ),
  /**
   * The Care Team includes all the people and organizations who plan to participate in the
   * coordination and delivery of care.
   */
  CareTeam(
    "CareTeam",
    "http://hl7.org/fhir/fhir-types",
    "CareTeam",
    "The Care Team includes all the people and organizations who plan to participate in the coordination and delivery of care.",
  ),
  /**
   * The resource ChargeItem describes the provision of healthcare provider products for a certain
   * patient, therefore referring not only to the product, but containing in addition details of the
   * provision, like date, time, amounts and participating organizations and persons. Main Usage of
   * the ChargeItem is to enable the billing process and internal cost allocation.
   */
  ChargeItem(
    "ChargeItem",
    "http://hl7.org/fhir/fhir-types",
    "ChargeItem",
    "The resource ChargeItem describes the provision of healthcare provider products for a certain patient, therefore referring not only to the product, but containing in addition details of the provision, like date, time, amounts and participating organizations and persons. Main Usage of the ChargeItem is to enable the billing process and internal cost allocation.",
  ),
  /**
   * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes
   * necessary to calculate costs and prices. The properties may differ largely depending on type
   * and realm, therefore this resource gives only a rough structure and requires profiling for each
   * type of billing code system.
   */
  ChargeItemDefinition(
    "ChargeItemDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ChargeItemDefinition",
    "The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.",
  ),
  /**
   * The Citation Resource enables reference to any knowledge artifact for purposes of
   * identification and attribution. The Citation Resource supports existing reference structures
   * and developing publication practices such as versioning, expressing complex contributorship
   * roles, and referencing computable resources.
   */
  Citation(
    "Citation",
    "http://hl7.org/fhir/fhir-types",
    "Citation",
    "The Citation Resource enables reference to any knowledge artifact for purposes of identification and attribution. The Citation Resource supports existing reference structures and developing publication practices such as versioning, expressing complex contributorship roles, and referencing computable resources.",
  ),
  /**
   * A provider issued list of professional services and products which have been provided, or are
   * to be provided, to a patient which is sent to an insurer for reimbursement.
   */
  Claim(
    "Claim",
    "http://hl7.org/fhir/fhir-types",
    "Claim",
    "A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.",
  ),
  /** This resource provides the adjudication details from the processing of a Claim resource. */
  ClaimResponse(
    "ClaimResponse",
    "http://hl7.org/fhir/fhir-types",
    "ClaimResponse",
    "This resource provides the adjudication details from the processing of a Claim resource.",
  ),
  /**
   * A record of a clinical assessment performed to determine what problem(s) may affect the patient
   * and before planning the treatments or management strategies that are best to manage a patient's
   * condition. Assessments are often 1:1 with a clinical consultation / encounter, but this varies
   * greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather
   * than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as
   * Apgar score.
   */
  ClinicalImpression(
    "ClinicalImpression",
    "http://hl7.org/fhir/fhir-types",
    "ClinicalImpression",
    "A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called \"ClinicalImpression\" rather than \"ClinicalAssessment\" to avoid confusion with the recording of assessment tools such as Apgar score.",
  ),
  /**
   * A single issue - either an indication, contraindication, interaction or an undesirable effect
   * for a medicinal product, medication, device or procedure.
   */
  ClinicalUseDefinition(
    "ClinicalUseDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ClinicalUseDefinition",
    "A single issue - either an indication, contraindication, interaction or an undesirable effect for a medicinal product, medication, device or procedure.",
  ),
  /**
   * The CodeSystem resource is used to declare the existence of and describe a code system or code
   * system supplement and its key properties, and optionally define a part or all of its content.
   */
  CodeSystem(
    "CodeSystem",
    "http://hl7.org/fhir/fhir-types",
    "CodeSystem",
    "The CodeSystem resource is used to declare the existence of and describe a code system or code system supplement and its key properties, and optionally define a part or all of its content.",
  ),
  /**
   * A clinical or business level record of information being transmitted or shared; e.g. an alert
   * that was sent to a responsible provider, a public health agency communication to a
   * provider/reporter in response to a case report for a reportable condition.
   */
  Communication(
    "Communication",
    "http://hl7.org/fhir/fhir-types",
    "Communication",
    "A clinical or business level record of information being transmitted or shared; e.g. an alert that was sent to a responsible provider, a public health agency communication to a provider/reporter in response to a case report for a reportable condition.",
  ),
  /**
   * A request to convey information; e.g. the CDS system proposes that an alert be sent to a
   * responsible provider, the CDS system proposes that the public health agency be notified about a
   * reportable condition.
   */
  CommunicationRequest(
    "CommunicationRequest",
    "http://hl7.org/fhir/fhir-types",
    "CommunicationRequest",
    "A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.",
  ),
  /** A compartment definition that defines how resources are accessed on a server. */
  CompartmentDefinition(
    "CompartmentDefinition",
    "http://hl7.org/fhir/fhir-types",
    "CompartmentDefinition",
    "A compartment definition that defines how resources are accessed on a server.",
  ),
  /**
   * A set of healthcare-related information that is assembled together into a single logical
   * package that provides a single coherent statement of meaning, establishes its own context and
   * that has clinical attestation with regard to who is making the statement. A Composition defines
   * the structure and narrative content necessary for a document. However, a Composition alone does
   * not constitute a document. Rather, the Composition must be the first entry in a Bundle where
   * Bundle.type=document, and any other resources referenced from Composition must be included as
   * subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
   */
  Composition(
    "Composition",
    "http://hl7.org/fhir/fhir-types",
    "Composition",
    "A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).",
  ),
  /**
   * A statement of relationships from one set of concepts to one or more other concepts - either
   * concepts in code systems, or data element/data element concepts, or classes in class models.
   */
  ConceptMap(
    "ConceptMap",
    "http://hl7.org/fhir/fhir-types",
    "ConceptMap",
    "A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.",
  ),
  /**
   * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept
   * that has risen to a level of concern.
   */
  Condition(
    "Condition",
    "http://hl7.org/fhir/fhir-types",
    "Condition",
    "A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.",
  ),
  /** A definition of a condition and information relevant to managing it. */
  ConditionDefinition(
    "ConditionDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ConditionDefinition",
    "A definition of a condition and information relevant to managing it.",
  ),
  /**
   * A record of a healthcare consumer’s choices or choices made on their behalf by a third party,
   * which permits or denies identified recipient(s) or recipient role(s) to perform one or more
   * actions within a given policy context, for specific purposes and periods of time.
   */
  Consent(
    "Consent",
    "http://hl7.org/fhir/fhir-types",
    "Consent",
    "A record of a healthcare consumer’s  choices  or choices made on their behalf by a third party, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.",
  ),
  /**
   * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or
   * agreement.
   */
  Contract(
    "Contract",
    "http://hl7.org/fhir/fhir-types",
    "Contract",
    "Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.",
  ),
  /**
   * Financial instrument which may be used to reimburse or pay for health care products and
   * services. Includes both insurance and self-payment.
   */
  Coverage(
    "Coverage",
    "http://hl7.org/fhir/fhir-types",
    "Coverage",
    "Financial instrument which may be used to reimburse or pay for health care products and services. Includes both insurance and self-payment.",
  ),
  /**
   * The CoverageEligibilityRequest provides patient and insurance coverage information to an
   * insurer for them to respond, in the form of an CoverageEligibilityResponse, with information
   * regarding whether the stated coverage is valid and in-force and optionally to provide the
   * insurance details of the policy.
   */
  CoverageEligibilityRequest(
    "CoverageEligibilityRequest",
    "http://hl7.org/fhir/fhir-types",
    "CoverageEligibilityRequest",
    "The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.",
  ),
  /**
   * This resource provides eligibility and plan details from the processing of an
   * CoverageEligibilityRequest resource.
   */
  CoverageEligibilityResponse(
    "CoverageEligibilityResponse",
    "http://hl7.org/fhir/fhir-types",
    "CoverageEligibilityResponse",
    "This resource provides eligibility and plan details from the processing of an CoverageEligibilityRequest resource.",
  ),
  /**
   * Indicates an actual or potential clinical issue with or between one or more active or proposed
   * clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency,
   * Procedure-condition conflict, gaps in care, etc.
   */
  DetectedIssue(
    "DetectedIssue",
    "http://hl7.org/fhir/fhir-types",
    "DetectedIssue",
    "Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, gaps in care, etc.",
  ),
  /**
   * This resource describes the properties (regulated, has real time clock, etc.), adminstrative
   * (manufacturer name, model number, serial number, firmware, etc.), and type (knee replacement,
   * blood pressure cuff, MRI, etc.) of a physical unit (these values do not change much within a
   * given module, for example the serail number, manufacturer name, and model number). An actual
   * unit may consist of several modules in a distinct hierarchy and these are represented by
   * multiple Device resources and bound through the 'parent' element.
   */
  Device(
    "Device",
    "http://hl7.org/fhir/fhir-types",
    "Device",
    "This resource describes the properties (regulated, has real time clock, etc.), adminstrative (manufacturer name, model number, serial number, firmware, etc.), and type (knee replacement, blood pressure cuff, MRI, etc.) of a physical unit (these values do not change much within a given module, for example the serail number, manufacturer name, and model number). An actual unit may consist of several modules in a distinct hierarchy and these are represented by multiple Device resources and bound through the 'parent' element.",
  ),
  /** A record of association of a device. */
  DeviceAssociation(
    "DeviceAssociation",
    "http://hl7.org/fhir/fhir-types",
    "DeviceAssociation",
    "A record of association of a device.",
  ),
  /**
   * This is a specialized resource that defines the characteristics and capabilities of a device.
   */
  DeviceDefinition(
    "DeviceDefinition",
    "http://hl7.org/fhir/fhir-types",
    "DeviceDefinition",
    "This is a specialized resource that defines the characteristics and capabilities of a device.",
  ),
  /**
   * Indicates that a device is to be or has been dispensed for a named person/patient. This
   * includes a description of the product (supply) provided and the instructions for using the
   * device.
   */
  DeviceDispense(
    "DeviceDispense",
    "http://hl7.org/fhir/fhir-types",
    "DeviceDispense",
    "Indicates that a device is to be or has been dispensed for a named person/patient.  This includes a description of the product (supply) provided and the instructions for using the device.",
  ),
  /**
   * Describes a measurement, calculation or setting capability of a device. The DeviceMetric
   * resource is derived from the ISO/IEEE 11073-10201 Domain Information Model standard, but is
   * more widely applicable.
   */
  DeviceMetric(
    "DeviceMetric",
    "http://hl7.org/fhir/fhir-types",
    "DeviceMetric",
    "Describes a measurement, calculation or setting capability of a device.  The DeviceMetric resource is derived from the ISO/IEEE 11073-10201 Domain Information Model standard, but is more widely applicable. ",
  ),
  /**
   * Represents a request a device to be provided to a specific patient. The device may be an
   * implantable device to be subsequently implanted, or an external assistive device, such as a
   * walker, to be delivered and subsequently be used.
   */
  DeviceRequest(
    "DeviceRequest",
    "http://hl7.org/fhir/fhir-types",
    "DeviceRequest",
    "Represents a request a device to be provided to a specific patient. The device may be an implantable device to be subsequently implanted, or an external assistive device, such as a walker, to be delivered and subsequently be used.",
  ),
  /**
   * A record of a device being used by a patient where the record is the result of a report from
   * the patient or a clinician.
   */
  DeviceUsage(
    "DeviceUsage",
    "http://hl7.org/fhir/fhir-types",
    "DeviceUsage",
    "A record of a device being used by a patient where the record is the result of a report from the patient or a clinician.",
  ),
  /**
   * The findings and interpretation of diagnostic tests performed on patients, groups of patients,
   * products, substances, devices, and locations, and/or specimens derived from these. The report
   * includes clinical context such as requesting provider information, and some mix of atomic
   * results, images, textual and coded interpretations, and formatted representation of diagnostic
   * reports. The report also includes non-clinical context such as batch analysis and stability
   * reporting of products and substances.
   */
  DiagnosticReport(
    "DiagnosticReport",
    "http://hl7.org/fhir/fhir-types",
    "DiagnosticReport",
    "The findings and interpretation of diagnostic tests performed on patients, groups of patients, products, substances, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports. The report also includes non-clinical context such as batch analysis and stability reporting of products and substances.",
  ),
  /**
   * A reference to a document of any kind for any purpose. While the term “document” implies a more
   * narrow focus, for this resource this “document” encompasses *any* serialized object with a
   * mime-type, it includes formal patient-centric documents (CDA), clinical notes, scanned paper,
   * non-patient specific documents like policy text, as well as a photo, video, or audio recording
   * acquired or used in healthcare. The DocumentReference resource provides metadata about the
   * document so that the document can be discovered and managed. The actual content may be inline
   * base64 encoded data or provided by direct reference.
   */
  DocumentReference(
    "DocumentReference",
    "http://hl7.org/fhir/fhir-types",
    "DocumentReference",
    "A reference to a document of any kind for any purpose. While the term “document” implies a more narrow focus, for this resource this “document” encompasses *any* serialized object with a mime-type, it includes formal patient-centric documents (CDA), clinical notes, scanned paper, non-patient specific documents like policy text, as well as a photo, video, or audio recording acquired or used in healthcare.  The DocumentReference resource provides metadata about the document so that the document can be discovered and managed.  The actual content may be inline base64 encoded data or provided by direct reference.",
  ),
  /**
   * An interaction between healthcare provider(s), and/or patient(s) for the purpose of providing
   * healthcare service(s) or assessing the health status of patient(s).
   */
  Encounter(
    "Encounter",
    "http://hl7.org/fhir/fhir-types",
    "Encounter",
    "An interaction between healthcare provider(s), and/or patient(s) for the purpose of providing healthcare service(s) or assessing the health status of patient(s).",
  ),
  /** A record of significant events/milestones key data throughout the history of an Encounter */
  EncounterHistory(
    "EncounterHistory",
    "http://hl7.org/fhir/fhir-types",
    "EncounterHistory",
    "A record of significant events/milestones key data throughout the history of an Encounter",
  ),
  /**
   * The technical details of an endpoint that can be used for electronic services, such as for web
   * services providing XDS.b, a REST endpoint for another FHIR server, or a s/Mime email address.
   * This may include any security context information.
   */
  Endpoint(
    "Endpoint",
    "http://hl7.org/fhir/fhir-types",
    "Endpoint",
    "The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b, a REST endpoint for another FHIR server, or a s/Mime email address. This may include any security context information.",
  ),
  /**
   * This resource provides the insurance enrollment details to the insurer regarding a specified
   * coverage.
   */
  EnrollmentRequest(
    "EnrollmentRequest",
    "http://hl7.org/fhir/fhir-types",
    "EnrollmentRequest",
    "This resource provides the insurance enrollment details to the insurer regarding a specified coverage.",
  ),
  /**
   * This resource provides enrollment and plan details from the processing of an EnrollmentRequest
   * resource.
   */
  EnrollmentResponse(
    "EnrollmentResponse",
    "http://hl7.org/fhir/fhir-types",
    "EnrollmentResponse",
    "This resource provides enrollment and plan details from the processing of an EnrollmentRequest resource.",
  ),
  /**
   * An association between a patient and an organization / healthcare provider(s) during which time
   * encounters may occur. The managing organization assumes a level of responsibility for the
   * patient during this time.
   */
  EpisodeOfCare(
    "EpisodeOfCare",
    "http://hl7.org/fhir/fhir-types",
    "EpisodeOfCare",
    "An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.",
  ),
  /**
   * The EventDefinition resource provides a reusable description of when a particular event can
   * occur.
   */
  EventDefinition(
    "EventDefinition",
    "http://hl7.org/fhir/fhir-types",
    "EventDefinition",
    "The EventDefinition resource provides a reusable description of when a particular event can occur.",
  ),
  /**
   * The Evidence Resource provides a machine-interpretable expression of an evidence concept
   * including the evidence variables (e.g., population, exposures/interventions, comparators,
   * outcomes, measured variables, confounding variables), the statistics, and the certainty of this
   * evidence.
   */
  Evidence(
    "Evidence",
    "http://hl7.org/fhir/fhir-types",
    "Evidence",
    "The Evidence Resource provides a machine-interpretable expression of an evidence concept including the evidence variables (e.g., population, exposures/interventions, comparators, outcomes, measured variables, confounding variables), the statistics, and the certainty of this evidence.",
  ),
  /**
   * The EvidenceReport Resource is a specialized container for a collection of resources and
   * codeable concepts, adapted to support compositions of Evidence, EvidenceVariable, and Citation
   * resources and related concepts.
   */
  EvidenceReport(
    "EvidenceReport",
    "http://hl7.org/fhir/fhir-types",
    "EvidenceReport",
    "The EvidenceReport Resource is a specialized container for a collection of resources and codeable concepts, adapted to support compositions of Evidence, EvidenceVariable, and Citation resources and related concepts.",
  ),
  /** The EvidenceVariable resource describes an element that knowledge (Evidence) is about. */
  EvidenceVariable(
    "EvidenceVariable",
    "http://hl7.org/fhir/fhir-types",
    "EvidenceVariable",
    "The EvidenceVariable resource describes an element that knowledge (Evidence) is about.",
  ),
  /**
   * A walkthrough of a workflow showing the interaction between systems and the instances shared,
   * possibly including the evolution of instances over time.
   */
  ExampleScenario(
    "ExampleScenario",
    "http://hl7.org/fhir/fhir-types",
    "ExampleScenario",
    "A walkthrough of a workflow showing the interaction between systems and the instances shared, possibly including the evolution of instances over time.",
  ),
  /**
   * This resource provides: the claim details; adjudication details from the processing of a Claim;
   * and optionally account balance information, for informing the subscriber of the benefits
   * provided.
   */
  ExplanationOfBenefit(
    "ExplanationOfBenefit",
    "http://hl7.org/fhir/fhir-types",
    "ExplanationOfBenefit",
    "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.",
  ),
  /**
   * Significant health conditions for a person related to the patient relevant in the context of
   * care for the patient.
   */
  FamilyMemberHistory(
    "FamilyMemberHistory",
    "http://hl7.org/fhir/fhir-types",
    "FamilyMemberHistory",
    "Significant health conditions for a person related to the patient relevant in the context of care for the patient.",
  ),
  /** Prospective warnings of potential issues when providing care to the patient. */
  Flag(
    "Flag",
    "http://hl7.org/fhir/fhir-types",
    "Flag",
    "Prospective warnings of potential issues when providing care to the patient.",
  ),
  /**
   * This resource describes a product or service that is available through a program and includes
   * the conditions and constraints of availability. All of the information in this resource is
   * specific to the inclusion of the item in the formulary and is not inherent to the item itself.
   */
  FormularyItem(
    "FormularyItem",
    "http://hl7.org/fhir/fhir-types",
    "FormularyItem",
    "This resource describes a product or service that is available through a program and includes the conditions and constraints of availability.  All of the information in this resource is specific to the inclusion of the item in the formulary and is not inherent to the item itself.",
  ),
  /** A set of analyses performed to analyze and generate genomic data. */
  GenomicStudy(
    "GenomicStudy",
    "http://hl7.org/fhir/fhir-types",
    "GenomicStudy",
    "A set of analyses performed to analyze and generate genomic data.",
  ),
  /**
   * Describes the intended objective(s) for a patient, group or organization care, for example,
   * weight loss, restoring an activity of daily living, obtaining herd immunity via immunization,
   * meeting a process improvement objective, etc.
   */
  Goal(
    "Goal",
    "http://hl7.org/fhir/fhir-types",
    "Goal",
    "Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.",
  ),
  /**
   * A formal computable definition of a graph of resources - that is, a coherent set of resources
   * that form a graph by following references. The Graph Definition resource defines a set and
   * makes rules about the set.
   */
  GraphDefinition(
    "GraphDefinition",
    "http://hl7.org/fhir/fhir-types",
    "GraphDefinition",
    "A formal computable definition of a graph of resources - that is, a coherent set of resources that form a graph by following references. The Graph Definition resource defines a set and makes rules about the set.",
  ),
  /**
   * Represents a defined collection of entities that may be discussed or acted upon collectively
   * but which are not expected to act collectively, and are not formally or legally recognized;
   * i.e. a collection of entities that isn't an Organization.
   */
  Group(
    "Group",
    "http://hl7.org/fhir/fhir-types",
    "Group",
    "Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively, and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.",
  ),
  /**
   * A guidance response is the formal response to a guidance request, including any output
   * parameters returned by the evaluation, as well as the description of any proposed actions to be
   * taken.
   */
  GuidanceResponse(
    "GuidanceResponse",
    "http://hl7.org/fhir/fhir-types",
    "GuidanceResponse",
    "A guidance response is the formal response to a guidance request, including any output parameters returned by the evaluation, as well as the description of any proposed actions to be taken.",
  ),
  /**
   * The details of a healthcare service available at a location or in a catalog. In the case where
   * there is a hierarchy of services (for example, Lab -> Pathology -> Wound Cultures), this can be
   * represented using a set of linked HealthcareServices.
   */
  HealthcareService(
    "HealthcareService",
    "http://hl7.org/fhir/fhir-types",
    "HealthcareService",
    "The details of a healthcare service available at a location or in a catalog.  In the case where there is a hierarchy of services (for example, Lab -> Pathology -> Wound Cultures), this can be represented using a set of linked HealthcareServices.",
  ),
  /**
   * A selection of DICOM SOP instances and/or frames within a single Study and Series. This might
   * include additional specifics such as an image region, an Observation UID or a Segmentation
   * Number, allowing linkage to an Observation Resource or transferring this information along with
   * the ImagingStudy Resource.
   */
  ImagingSelection(
    "ImagingSelection",
    "http://hl7.org/fhir/fhir-types",
    "ImagingSelection",
    "A selection of DICOM SOP instances and/or frames within a single Study and Series. This might include additional specifics such as an image region, an Observation UID or a Segmentation Number, allowing linkage to an Observation Resource or transferring this information along with the ImagingStudy Resource.",
  ),
  /**
   * Representation of the content produced in a DICOM imaging study. A study comprises a set of
   * series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images
   * or other data) acquired or produced in a common context. A series is of only one modality (e.g.
   * X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
   */
  ImagingStudy(
    "ImagingStudy",
    "http://hl7.org/fhir/fhir-types",
    "ImagingStudy",
    "Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.",
  ),
  /**
   * Describes the event of a patient being administered a vaccine or a record of an immunization as
   * reported by a patient, a clinician or another party.
   */
  Immunization(
    "Immunization",
    "http://hl7.org/fhir/fhir-types",
    "Immunization",
    "Describes the event of a patient being administered a vaccine or a record of an immunization as reported by a patient, a clinician or another party.",
  ),
  /**
   * Describes a comparison of an immunization event against published recommendations to determine
   * if the administration is "valid" in relation to those recommendations.
   */
  ImmunizationEvaluation(
    "ImmunizationEvaluation",
    "http://hl7.org/fhir/fhir-types",
    "ImmunizationEvaluation",
    "Describes a comparison of an immunization event against published recommendations to determine if the administration is \"valid\" in relation to those  recommendations.",
  ),
  /**
   * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published
   * schedule with optional supporting justification.
   */
  ImmunizationRecommendation(
    "ImmunizationRecommendation",
    "http://hl7.org/fhir/fhir-types",
    "ImmunizationRecommendation",
    "A patient's point-in-time set of recommendations (i.e. forecasting) according to a published schedule with optional supporting justification.",
  ),
  /**
   * A set of rules of how a particular interoperability or standards problem is solved - typically
   * through the use of FHIR resources. This resource is used to gather all the parts of an
   * implementation guide into a logical whole and to publish a computable definition of all the
   * parts.
   */
  ImplementationGuide(
    "ImplementationGuide",
    "http://hl7.org/fhir/fhir-types",
    "ImplementationGuide",
    "A set of rules of how a particular interoperability or standards problem is solved - typically through the use of FHIR resources. This resource is used to gather all the parts of an implementation guide into a logical whole and to publish a computable definition of all the parts.",
  ),
  /** An ingredient of a manufactured item or pharmaceutical product. */
  Ingredient(
    "Ingredient",
    "http://hl7.org/fhir/fhir-types",
    "Ingredient",
    "An ingredient of a manufactured item or pharmaceutical product.",
  ),
  /** Details of a Health Insurance product/plan provided by an organization. */
  InsurancePlan(
    "InsurancePlan",
    "http://hl7.org/fhir/fhir-types",
    "InsurancePlan",
    "Details of a Health Insurance product/plan provided by an organization.",
  ),
  /** functional description of an inventory item used in inventory and supply-related workflows. */
  InventoryItem(
    "InventoryItem",
    "http://hl7.org/fhir/fhir-types",
    "InventoryItem",
    "functional description of an inventory item used in inventory and supply-related workflows.",
  ),
  /** A report of inventory or stock items. */
  InventoryReport(
    "InventoryReport",
    "http://hl7.org/fhir/fhir-types",
    "InventoryReport",
    "A report of inventory or stock items.",
  ),
  /**
   * Invoice containing collected ChargeItems from an Account with calculated individual and total
   * price for Billing purpose.
   */
  Invoice(
    "Invoice",
    "http://hl7.org/fhir/fhir-types",
    "Invoice",
    "Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.",
  ),
  /**
   * The Library resource is a general-purpose container for knowledge asset definitions. It can be
   * used to describe and expose existing knowledge assets such as logic libraries and information
   * model descriptions, as well as to describe a collection of knowledge assets.
   */
  Library(
    "Library",
    "http://hl7.org/fhir/fhir-types",
    "Library",
    "The Library resource is a general-purpose container for knowledge asset definitions. It can be used to describe and expose existing knowledge assets such as logic libraries and information model descriptions, as well as to describe a collection of knowledge assets.",
  ),
  /**
   * Identifies two or more records (resource instances) that refer to the same real-world
   * "occurrence".
   */
  Linkage(
    "Linkage",
    "http://hl7.org/fhir/fhir-types",
    "Linkage",
    "Identifies two or more records (resource instances) that refer to the same real-world \"occurrence\".",
  ),
  /**
   * A List is a curated collection of resources, for things such as problem lists, allergy lists,
   * facility list, organization list, etc.
   */
  List(
    "List",
    "http://hl7.org/fhir/fhir-types",
    "List",
    "A List is a curated collection of resources, for things such as problem lists, allergy lists, facility list, organization list, etc.",
  ),
  /**
   * Details and position information for a place where services are provided and resources and
   * participants may be stored, found, contained, or accommodated.
   */
  Location(
    "Location",
    "http://hl7.org/fhir/fhir-types",
    "Location",
    "Details and position information for a place where services are provided and resources and participants may be stored, found, contained, or accommodated.",
  ),
  /**
   * The definition and characteristics of a medicinal manufactured item, such as a tablet or
   * capsule, as contained in a packaged medicinal product.
   */
  ManufacturedItemDefinition(
    "ManufacturedItemDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ManufacturedItemDefinition",
    "The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule, as contained in a packaged medicinal product.",
  ),
  /** The Measure resource provides the definition of a quality measure. */
  Measure(
    "Measure",
    "http://hl7.org/fhir/fhir-types",
    "Measure",
    "The Measure resource provides the definition of a quality measure.",
  ),
  /**
   * The MeasureReport resource contains the results of the calculation of a measure; and optionally
   * a reference to the resources involved in that calculation.
   */
  MeasureReport(
    "MeasureReport",
    "http://hl7.org/fhir/fhir-types",
    "MeasureReport",
    "The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.",
  ),
  /**
   * This resource is primarily used for the identification and definition of a medication,
   * including ingredients, for the purposes of prescribing, dispensing, and administering a
   * medication as well as for making statements about medication use.
   */
  Medication(
    "Medication",
    "http://hl7.org/fhir/fhir-types",
    "Medication",
    "This resource is primarily used for the identification and definition of a medication, including ingredients, for the purposes of prescribing, dispensing, and administering a medication as well as for making statements about medication use.",
  ),
  /**
   * Describes the event of a patient consuming or otherwise being administered a medication. This
   * may be as simple as swallowing a tablet or it may be a long running infusion. Related resources
   * tie this event to the authorizing prescription, and the specific encounter between patient and
   * health care practitioner. This event can also be used to record waste using a status of
   * not-done and the appropriate statusReason.
   */
  MedicationAdministration(
    "MedicationAdministration",
    "http://hl7.org/fhir/fhir-types",
    "MedicationAdministration",
    "Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion. Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner. This event can also be used to record waste using a status of not-done and the appropriate statusReason.",
  ),
  /**
   * Indicates that a medication product is to be or has been dispensed for a named person/patient.
   * This includes a description of the medication product (supply) provided and the instructions
   * for administering the medication. The medication dispense is the result of a pharmacy system
   * responding to a medication order.
   */
  MedicationDispense(
    "MedicationDispense",
    "http://hl7.org/fhir/fhir-types",
    "MedicationDispense",
    "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.",
  ),
  /** Information about a medication that is used to support knowledge. */
  MedicationKnowledge(
    "MedicationKnowledge",
    "http://hl7.org/fhir/fhir-types",
    "MedicationKnowledge",
    "Information about a medication that is used to support knowledge.",
  ),
  /**
   * An order or request for both supply of the medication and the instructions for administration
   * of the medication to a patient. The resource is called "MedicationRequest" rather than
   * "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and
   * outpatient settings, including care plans, etc., and to harmonize with workflow patterns.
   */
  MedicationRequest(
    "MedicationRequest",
    "http://hl7.org/fhir/fhir-types",
    "MedicationRequest",
    "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns.",
  ),
  /**
   * A record of a medication that is being consumed by a patient. A MedicationStatement may
   * indicate that the patient may be taking the medication now or has taken the medication in the
   * past or will be taking the medication in the future. The source of this information can be the
   * patient, significant other (such as a family member or spouse), or a clinician. A common
   * scenario where this information is captured is during the history taking process during a
   * patient visit or stay. The medication information may come from sources such as the patient's
   * memory, from a prescription bottle, or from a list of medications the patient, clinician or
   * other party maintains.
   *
   * The primary difference between a medicationstatement and a medicationadministration is that the
   * medication administration has complete administration information and is based on actual
   * administration information from the person who administered the medication. A
   * medicationstatement is often, if not always, less specific. There is no required date/time when
   * the medication was administered, in fact we only know that a source has reported the patient is
   * taking this medication, where details such as time, quantity, or rate or even medication
   * product may be incomplete or missing or less precise. As stated earlier, the Medication
   * Statement information may come from the patient's memory, from a prescription bottle or from a
   * list of medications the patient, clinician or other party maintains. Medication administration
   * is more formal and is not missing detailed information.
   */
  MedicationStatement(
    "MedicationStatement",
    "http://hl7.org/fhir/fhir-types",
    "MedicationStatement",
    """
  |A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from sources such as the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains. 
  |
  |The primary difference between a medicationstatement and a medicationadministration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medicationstatement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the Medication Statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
  """
      .trimMargin(),
  ),
  /**
   * Detailed definition of a medicinal product, typically for uses other than direct patient care
   * (e.g. regulatory use, drug catalogs, to support prescribing, adverse events management etc.).
   */
  MedicinalProductDefinition(
    "MedicinalProductDefinition",
    "http://hl7.org/fhir/fhir-types",
    "MedicinalProductDefinition",
    "Detailed definition of a medicinal product, typically for uses other than direct patient care (e.g. regulatory use, drug catalogs, to support prescribing, adverse events management etc.).",
  ),
  /**
   * Defines the characteristics of a message that can be shared between systems, including the type
   * of event that initiates the message, the content to be transmitted and what response(s), if
   * any, are permitted.
   */
  MessageDefinition(
    "MessageDefinition",
    "http://hl7.org/fhir/fhir-types",
    "MessageDefinition",
    "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted.",
  ),
  /**
   * The header for a message exchange that is either requesting or responding to an action. The
   * reference(s) that are the subject of the action as well as other information related to the
   * action are typically transmitted in a bundle in which the MessageHeader resource instance is
   * the first resource in the bundle.
   */
  MessageHeader(
    "MessageHeader",
    "http://hl7.org/fhir/fhir-types",
    "MessageHeader",
    "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.",
  ),
  /** Common Interface declaration for conformance and knowledge artifact resources. */
  MetadataResource(
    "MetadataResource",
    "http://hl7.org/fhir/fhir-types",
    "MetadataResource",
    "Common Interface declaration for conformance and knowledge artifact resources.",
  ),
  /** Representation of a molecular sequence. */
  MolecularSequence(
    "MolecularSequence",
    "http://hl7.org/fhir/fhir-types",
    "MolecularSequence",
    "Representation of a molecular sequence.",
  ),
  /**
   * A curated namespace that issues unique symbols within that namespace for the identification of
   * concepts, people, devices, etc. Represents a "System" used within the Identifier and Coding
   * data types.
   */
  NamingSystem(
    "NamingSystem",
    "http://hl7.org/fhir/fhir-types",
    "NamingSystem",
    "A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a \"System\" used within the Identifier and Coding data types.",
  ),
  /**
   * A record of food or fluid that is being consumed by a patient. A NutritionIntake may indicate
   * that the patient may be consuming the food or fluid now or has consumed the food or fluid in
   * the past. The source of this information can be the patient, significant other (such as a
   * family member or spouse), or a clinician. A common scenario where this information is captured
   * is during the history taking process during a patient visit or stay or through an app that
   * tracks food or fluids consumed. The consumption information may come from sources such as the
   * patient's memory, from a nutrition label, or from a clinician documenting observed intake.
   */
  NutritionIntake(
    "NutritionIntake",
    "http://hl7.org/fhir/fhir-types",
    "NutritionIntake",
    "A record of food or fluid that is being consumed by a patient.  A NutritionIntake may indicate that the patient may be consuming the food or fluid now or has consumed the food or fluid in the past.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay or through an app that tracks food or fluids consumed.   The consumption information may come from sources such as the patient's memory, from a nutrition label,  or from a clinician documenting observed intake.",
  ),
  /**
   * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a
   * patient/resident.
   */
  NutritionOrder(
    "NutritionOrder",
    "http://hl7.org/fhir/fhir-types",
    "NutritionOrder",
    "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.",
  ),
  /** A food or supplement that is consumed by patients. */
  NutritionProduct(
    "NutritionProduct",
    "http://hl7.org/fhir/fhir-types",
    "NutritionProduct",
    "A food or supplement that is consumed by patients.",
  ),
  /** Measurements and simple assertions made about a patient, device or other subject. */
  Observation(
    "Observation",
    "http://hl7.org/fhir/fhir-types",
    "Observation",
    "Measurements and simple assertions made about a patient, device or other subject.",
  ),
  /**
   * Set of definitional characteristics for a kind of observation or measurement produced or
   * consumed by an orderable health care service.
   */
  ObservationDefinition(
    "ObservationDefinition",
    "http://hl7.org/fhir/fhir-types",
    "ObservationDefinition",
    "Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.",
  ),
  /**
   * A formal computable definition of an operation (on the RESTful interface) or a named query
   * (using the search interaction).
   */
  OperationDefinition(
    "OperationDefinition",
    "http://hl7.org/fhir/fhir-types",
    "OperationDefinition",
    "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).",
  ),
  /** A collection of error, warning, or information messages that result from a system action. */
  OperationOutcome(
    "OperationOutcome",
    "http://hl7.org/fhir/fhir-types",
    "OperationOutcome",
    "A collection of error, warning, or information messages that result from a system action.",
  ),
  /**
   * A formally or informally recognized grouping of people or organizations formed for the purpose
   * of achieving some form of collective action. Includes companies, institutions, corporations,
   * departments, community groups, healthcare practice groups, payer/insurer, etc.
   */
  Organization(
    "Organization",
    "http://hl7.org/fhir/fhir-types",
    "Organization",
    "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, payer/insurer, etc.",
  ),
  /**
   * Defines an affiliation/assotiation/relationship between 2 distinct organizations, that is not a
   * part-of relationship/sub-division relationship.
   */
  OrganizationAffiliation(
    "OrganizationAffiliation",
    "http://hl7.org/fhir/fhir-types",
    "OrganizationAffiliation",
    "Defines an affiliation/assotiation/relationship between 2 distinct organizations, that is not a part-of relationship/sub-division relationship.",
  ),
  /** A medically related item or items, in a container or package. */
  PackagedProductDefinition(
    "PackagedProductDefinition",
    "http://hl7.org/fhir/fhir-types",
    "PackagedProductDefinition",
    "A medically related item or items, in a container or package.",
  ),
  /**
   * Demographics and other administrative information about an individual or animal receiving care
   * or other health-related services.
   */
  Patient(
    "Patient",
    "http://hl7.org/fhir/fhir-types",
    "Patient",
    "Demographics and other administrative information about an individual or animal receiving care or other health-related services.",
  ),
  /**
   * This resource provides the status of the payment for goods and services rendered, and the
   * request and response resource references.
   */
  PaymentNotice(
    "PaymentNotice",
    "http://hl7.org/fhir/fhir-types",
    "PaymentNotice",
    "This resource provides the status of the payment for goods and services rendered, and the request and response resource references.",
  ),
  /**
   * This resource provides the details including amount of a payment and allocates the payment
   * items being paid.
   */
  PaymentReconciliation(
    "PaymentReconciliation",
    "http://hl7.org/fhir/fhir-types",
    "PaymentReconciliation",
    "This resource provides the details including amount of a payment and allocates the payment items being paid.",
  ),
  /** Permission resource holds access rules for a given data and context. */
  Permission(
    "Permission",
    "http://hl7.org/fhir/fhir-types",
    "Permission",
    "Permission resource holds access rules for a given data and context.",
  ),
  /**
   * Demographics and administrative information about a person independent of a specific
   * health-related context.
   */
  Person(
    "Person",
    "http://hl7.org/fhir/fhir-types",
    "Person",
    "Demographics and administrative information about a person independent of a specific health-related context.",
  ),
  /**
   * This resource allows for the definition of various types of plans as a sharable, consumable,
   * and executable artifact. The resource is general enough to support the description of a broad
   * range of clinical and non-clinical artifacts such as clinical decision support rules, order
   * sets, protocols, and drug quality specifications.
   */
  PlanDefinition(
    "PlanDefinition",
    "http://hl7.org/fhir/fhir-types",
    "PlanDefinition",
    "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical and non-clinical artifacts such as clinical decision support rules, order sets, protocols, and drug quality specifications.",
  ),
  /**
   * A person who is directly or indirectly involved in the provisioning of healthcare or related
   * services.
   */
  Practitioner(
    "Practitioner",
    "http://hl7.org/fhir/fhir-types",
    "Practitioner",
    "A person who is directly or indirectly involved in the provisioning of healthcare or related services.",
  ),
  /**
   * A specific set of Roles/Locations/specialties/services that a practitioner may perform, or has
   * performed at an organization during a period of time.
   */
  PractitionerRole(
    "PractitionerRole",
    "http://hl7.org/fhir/fhir-types",
    "PractitionerRole",
    "A specific set of Roles/Locations/specialties/services that a practitioner may perform, or has performed at an organization during a period of time.",
  ),
  /**
   * An action that is or was performed on or for a patient, practitioner, device, organization, or
   * location. For example, this can be a physical intervention on a patient like an operation, or
   * less invasive like long term services, counseling, or hypnotherapy. This can be a quality or
   * safety inspection for a location, organization, or device. This can be an accreditation
   * procedure on a practitioner for licensing.
   */
  Procedure(
    "Procedure",
    "http://hl7.org/fhir/fhir-types",
    "Procedure",
    "An action that is or was performed on or for a patient, practitioner, device, organization, or location. For example, this can be a physical intervention on a patient like an operation, or less invasive like long term services, counseling, or hypnotherapy.  This can be a quality or safety inspection for a location, organization, or device.  This can be an accreditation procedure on a practitioner for licensing.",
  ),
  /**
   * Provenance of a resource is a record that describes entities and processes involved in
   * producing and delivering or otherwise influencing that resource. Provenance provides a critical
   * foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance
   * assertions are a form of contextual metadata and can themselves become important records with
   * their own provenance. Provenance statement indicates clinical significance in terms of
   * confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle
   * (e.g. Document Completion - has the artifact been legally authenticated), all of which may
   * impact security, privacy, and trust policies.
   */
  Provenance(
    "Provenance",
    "http://hl7.org/fhir/fhir-types",
    "Provenance",
    "Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.",
  ),
  /**
   * A structured set of questions intended to guide the collection of answers from end-users.
   * Questionnaires provide detailed control over order, presentation, phraseology and grouping to
   * allow coherent, consistent data collection.
   */
  Questionnaire(
    "Questionnaire",
    "http://hl7.org/fhir/fhir-types",
    "Questionnaire",
    "A structured set of questions intended to guide the collection of answers from end-users. Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow coherent, consistent data collection.",
  ),
  /**
   * A structured set of questions and their answers. The questions are ordered and grouped into
   * coherent subsets, corresponding to the structure of the grouping of the questionnaire being
   * responded to.
   */
  QuestionnaireResponse(
    "QuestionnaireResponse",
    "http://hl7.org/fhir/fhir-types",
    "QuestionnaireResponse",
    "A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.",
  ),
  /**
   * Regulatory approval, clearance or licencing related to a regulated product, treatment, facility
   * or activity that is cited in a guidance, regulation, rule or legislative act. An example is
   * Market Authorization relating to a Medicinal Product.
   */
  RegulatedAuthorization(
    "RegulatedAuthorization",
    "http://hl7.org/fhir/fhir-types",
    "RegulatedAuthorization",
    "Regulatory approval, clearance or licencing related to a regulated product, treatment, facility or activity that is cited in a guidance, regulation, rule or legislative act. An example is Market Authorization relating to a Medicinal Product.",
  ),
  /**
   * Information about a person that is involved in a patient's health or the care for a patient,
   * but who is not the target of healthcare, nor has a formal responsibility in the care process.
   */
  RelatedPerson(
    "RelatedPerson",
    "http://hl7.org/fhir/fhir-types",
    "RelatedPerson",
    "Information about a person that is involved in a patient's health or the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.",
  ),
  /**
   * A set of related requests that can be used to capture intended activities that have
   * inter-dependencies such as "give this medication after that one".
   */
  RequestOrchestration(
    "RequestOrchestration",
    "http://hl7.org/fhir/fhir-types",
    "RequestOrchestration",
    "A set of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\".",
  ),
  /**
   * The Requirements resource is used to describe an actor - a human or an application that plays a
   * role in data exchange, and that may have obligations associated with the role the actor plays.
   */
  Requirements(
    "Requirements",
    "http://hl7.org/fhir/fhir-types",
    "Requirements",
    "The Requirements resource is used to describe an actor - a human or an application that plays a role in data exchange, and that may have obligations associated with the role the actor plays.",
  ),
  /**
   * A scientific study of nature that sometimes includes processes involved in health and disease.
   * For example, clinical trials are research studies that involve people. These studies may be
   * related to new ways to screen, prevent, diagnose, and treat disease. They may also study
   * certain outcomes and certain groups of people by looking at data collected in the past or
   * future.
   */
  ResearchStudy(
    "ResearchStudy",
    "http://hl7.org/fhir/fhir-types",
    "ResearchStudy",
    "A scientific study of nature that sometimes includes processes involved in health and disease. For example, clinical trials are research studies that involve people. These studies may be related to new ways to screen, prevent, diagnose, and treat disease. They may also study certain outcomes and certain groups of people by looking at data collected in the past or future.",
  ),
  /**
   * A ResearchSubject is a participant or object which is the recipient of investigative activities
   * in a research study.
   */
  ResearchSubject(
    "ResearchSubject",
    "http://hl7.org/fhir/fhir-types",
    "ResearchSubject",
    "A ResearchSubject is a participant or object which is the recipient of investigative activities in a research study.",
  ),
  /**
   * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood
   * of each outcome.
   */
  RiskAssessment(
    "RiskAssessment",
    "http://hl7.org/fhir/fhir-types",
    "RiskAssessment",
    "An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.",
  ),
  /** A container for slots of time that may be available for booking appointments. */
  Schedule(
    "Schedule",
    "http://hl7.org/fhir/fhir-types",
    "Schedule",
    "A container for slots of time that may be available for booking appointments.",
  ),
  /**
   * A search parameter that defines a named search item that can be used to search/filter on a
   * resource.
   */
  SearchParameter(
    "SearchParameter",
    "http://hl7.org/fhir/fhir-types",
    "SearchParameter",
    "A search parameter that defines a named search item that can be used to search/filter on a resource.",
  ),
  /**
   * A record of a request for service such as diagnostic investigations, treatments, or operations
   * to be performed.
   */
  ServiceRequest(
    "ServiceRequest",
    "http://hl7.org/fhir/fhir-types",
    "ServiceRequest",
    "A record of a request for service such as diagnostic investigations, treatments, or operations to be performed.",
  ),
  /** A slot of time on a schedule that may be available for booking appointments. */
  Slot(
    "Slot",
    "http://hl7.org/fhir/fhir-types",
    "Slot",
    "A slot of time on a schedule that may be available for booking appointments.",
  ),
  /** A sample to be used for analysis. */
  Specimen(
    "Specimen",
    "http://hl7.org/fhir/fhir-types",
    "Specimen",
    "A sample to be used for analysis.",
  ),
  /** A kind of specimen with associated set of requirements. */
  SpecimenDefinition(
    "SpecimenDefinition",
    "http://hl7.org/fhir/fhir-types",
    "SpecimenDefinition",
    "A kind of specimen with associated set of requirements.",
  ),
  /**
   * A definition of a FHIR structure. This resource is used to describe the underlying resources,
   * data types defined in FHIR, and also for describing extensions and constraints on resources and
   * data types.
   */
  StructureDefinition(
    "StructureDefinition",
    "http://hl7.org/fhir/fhir-types",
    "StructureDefinition",
    "A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions and constraints on resources and data types.",
  ),
  /** A Map of relationships between 2 structures that can be used to transform data. */
  StructureMap(
    "StructureMap",
    "http://hl7.org/fhir/fhir-types",
    "StructureMap",
    "A Map of relationships between 2 structures that can be used to transform data.",
  ),
  /**
   * The subscription resource describes a particular client's request to be notified about a
   * SubscriptionTopic.
   */
  Subscription(
    "Subscription",
    "http://hl7.org/fhir/fhir-types",
    "Subscription",
    "The subscription resource describes a particular client's request to be notified about a SubscriptionTopic.",
  ),
  /**
   * The SubscriptionStatus resource describes the state of a Subscription during notifications. It
   * is not persisted.
   */
  SubscriptionStatus(
    "SubscriptionStatus",
    "http://hl7.org/fhir/fhir-types",
    "SubscriptionStatus",
    "The SubscriptionStatus resource describes the state of a Subscription during notifications. It is not persisted.",
  ),
  /**
   * Describes a stream of resource state changes identified by trigger criteria and annotated with
   * labels useful to filter projections from this topic.
   */
  SubscriptionTopic(
    "SubscriptionTopic",
    "http://hl7.org/fhir/fhir-types",
    "SubscriptionTopic",
    "Describes a stream of resource state changes identified by trigger criteria and annotated with labels useful to filter projections from this topic.",
  ),
  /** A homogeneous material with a definite composition. */
  Substance(
    "Substance",
    "http://hl7.org/fhir/fhir-types",
    "Substance",
    "A homogeneous material with a definite composition.",
  ),
  /**
   * The detailed description of a substance, typically at a level beyond what is used for
   * prescribing.
   */
  SubstanceDefinition(
    "SubstanceDefinition",
    "http://hl7.org/fhir/fhir-types",
    "SubstanceDefinition",
    "The detailed description of a substance, typically at a level beyond what is used for prescribing.",
  ),
  /**
   * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual
   * substance/moiety IDs will be created for each of these elements. The nucleotide sequence will
   * be always entered in the 5’-3’ direction.
   */
  SubstanceNucleicAcid(
    "SubstanceNucleicAcid",
    "http://hl7.org/fhir/fhir-types",
    "SubstanceNucleicAcid",
    "Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be always entered in the 5’-3’ direction.",
  ),
  /** Properties of a substance specific to it being a polymer. */
  SubstancePolymer(
    "SubstancePolymer",
    "http://hl7.org/fhir/fhir-types",
    "SubstancePolymer",
    "Properties of a substance specific to it being a polymer.",
  ),
  /**
   * A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a
   * combination of subunits that are either covalently linked or have a defined invariant
   * stoichiometric relationship. This includes all synthetic, recombinant and purified
   * SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set
   * of elements will be used to describe albumins, coagulation factors, cytokines, growth factors,
   * peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and
   * immunomodulators.
   */
  SubstanceProtein(
    "SubstanceProtein",
    "http://hl7.org/fhir/fhir-types",
    "SubstanceProtein",
    "A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination of subunits that are either covalently linked or have a defined invariant stoichiometric relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.",
  ),
  /** Todo. */
  SubstanceReferenceInformation(
    "SubstanceReferenceInformation",
    "http://hl7.org/fhir/fhir-types",
    "SubstanceReferenceInformation",
    "Todo.",
  ),
  /**
   * Source material shall capture information on the taxonomic and anatomical origins as well as
   * the fraction of a material that can result in or can be modified to form a substance. This set
   * of data elements shall be used to define polymer substances isolated from biological matrices.
   * Taxonomic and anatomical origins shall be described using a controlled vocabulary as required.
   * This information is captured for naturally derived polymers ( . starch) and structurally
   * diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines
   * the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal
   * preparation. For Herbal preparations, the fraction information will be captured at the
   * Substance information level and additional information for herbal extracts will be captured at
   * the Specified Substance Group 1 information level. See for further explanation the Substance
   * Class: Structurally Diverse and the herbal annex.
   */
  SubstanceSourceMaterial(
    "SubstanceSourceMaterial",
    "http://hl7.org/fhir/fhir-types",
    "SubstanceSourceMaterial",
    "Source material shall capture information on the taxonomic and anatomical origins as well as the fraction of a material that can result in or can be modified to form a substance. This set of data elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and anatomical origins shall be described using a controlled vocabulary as required. This information is captured for naturally derived polymers ( . starch) and structurally diverse substances. For Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations, the fraction information will be captured at the Substance information level and additional information for herbal extracts will be captured at the Specified Substance Group 1 information level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.",
  ),
  /** Record of delivery of what is supplied. */
  SupplyDelivery(
    "SupplyDelivery",
    "http://hl7.org/fhir/fhir-types",
    "SupplyDelivery",
    "Record of delivery of what is supplied.",
  ),
  /**
   * A record of a non-patient specific request for a medication, substance, device, certain types
   * of biologically derived product, and nutrition product used in the healthcare setting.
   */
  SupplyRequest(
    "SupplyRequest",
    "http://hl7.org/fhir/fhir-types",
    "SupplyRequest",
    "A record of a non-patient specific request for a medication, substance, device, certain types of biologically derived product, and nutrition product used in the healthcare setting.",
  ),
  /** A task to be performed. */
  Task("Task", "http://hl7.org/fhir/fhir-types", "Task", "A task to be performed."),
  /**
   * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR
   * Terminology Server that may be used as a statement of actual server functionality or a
   * statement of required or desired server implementation.
   */
  TerminologyCapabilities(
    "TerminologyCapabilities",
    "http://hl7.org/fhir/fhir-types",
    "TerminologyCapabilities",
    "A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.",
  ),
  /** A plan for executing testing on an artifact or specifications */
  TestPlan(
    "TestPlan",
    "http://hl7.org/fhir/fhir-types",
    "TestPlan",
    "A plan for executing testing on an artifact or specifications",
  ),
  /** A summary of information based on the results of executing a TestScript. */
  TestReport(
    "TestReport",
    "http://hl7.org/fhir/fhir-types",
    "TestReport",
    "A summary of information based on the results of executing a TestScript.",
  ),
  /**
   * A structured set of tests against a FHIR server or client implementation to determine
   * compliance against the FHIR specification.
   */
  TestScript(
    "TestScript",
    "http://hl7.org/fhir/fhir-types",
    "TestScript",
    "A structured set of tests against a FHIR server or client implementation to determine compliance against the FHIR specification.",
  ),
  /** Record of transport. */
  Transport("Transport", "http://hl7.org/fhir/fhir-types", "Transport", "Record of transport."),
  /**
   * A ValueSet resource instance specifies a set of codes drawn from one or more code systems,
   * intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions
   * and their use in [coded elements](terminologies.html).
   */
  ValueSet(
    "ValueSet",
    "http://hl7.org/fhir/fhir-types",
    "ValueSet",
    "A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [[[CodeSystem]]] definitions and their use in [coded elements](terminologies.html).",
  ),
  /** Describes validation requirements, source(s), status and dates for one or more elements. */
  VerificationResult(
    "VerificationResult",
    "http://hl7.org/fhir/fhir-types",
    "VerificationResult",
    "Describes validation requirements, source(s), status and dates for one or more elements.",
  ),
  /** An authorization for the provision of glasses and/or contact lenses to a patient. */
  VisionPrescription(
    "VisionPrescription",
    "http://hl7.org/fhir/fhir-types",
    "VisionPrescription",
    "An authorization for the provision of glasses and/or contact lenses to a patient.",
  ),
  /**
   * This resource is used to pass information into and back from an operation (whether invoked
   * directly from REST or within a messaging environment). It is not persisted or allowed to be
   * referenced by other resources except as described in the definition of the Parameters resource.
   */
  Parameters(
    "Parameters",
    "http://hl7.org/fhir/fhir-types",
    "Parameters",
    "This resource is used to pass information into and back from an operation (whether invoked directly from REST or within a messaging environment).  It is not persisted or allowed to be referenced by other resources except as described in the definition of the Parameters resource.",
  );

  override fun toString(): kotlin.String = code

  public fun getCode(): kotlin.String = code

  public fun getSystem(): kotlin.String = system

  public fun getDisplay(): kotlin.String? = display

  public fun getDefinition(): kotlin.String? = definition

  public companion object {
    public fun fromCode(code: kotlin.String): BasisType =
      when (code) {
        "Base" -> Base
        "Element" -> Element
        "BackboneElement" -> BackboneElement
        "DataType" -> DataType
        "Address" -> Address
        "Annotation" -> Annotation
        "Attachment" -> Attachment
        "Availability" -> Availability
        "BackboneType" -> BackboneType
        "Dosage" -> Dosage
        "ElementDefinition" -> ElementDefinition
        "MarketingStatus" -> MarketingStatus
        "ProductShelfLife" -> ProductShelfLife
        "Timing" -> Timing
        "CodeableConcept" -> CodeableConcept
        "CodeableReference" -> CodeableReference
        "Coding" -> Coding
        "ContactDetail" -> ContactDetail
        "ContactPoint" -> ContactPoint
        "Contributor" -> Contributor
        "DataRequirement" -> DataRequirement
        "Expression" -> Expression
        "ExtendedContactDetail" -> ExtendedContactDetail
        "Extension" -> Extension
        "HumanName" -> HumanName
        "Identifier" -> Identifier
        "Meta" -> Meta
        "MonetaryComponent" -> MonetaryComponent
        "Money" -> Money
        "Narrative" -> Narrative
        "ParameterDefinition" -> ParameterDefinition
        "Period" -> Period
        "PrimitiveType" -> PrimitiveType
        "base64Binary" -> Base64Binary
        "boolean" -> Boolean
        "date" -> Date
        "dateTime" -> DateTime
        "decimal" -> Decimal
        "instant" -> Instant
        "integer" -> Integer
        "positiveInt" -> PositiveInt
        "unsignedInt" -> UnsignedInt
        "integer64" -> Integer64
        "string" -> String
        "code" -> Code
        "id" -> Id
        "markdown" -> Markdown
        "time" -> Time
        "uri" -> Uri
        "canonical" -> Canonical
        "oid" -> Oid
        "url" -> Url
        "uuid" -> Uuid
        "Quantity" -> Quantity
        "Age" -> Age
        "Count" -> Count
        "Distance" -> Distance
        "Duration" -> Duration
        "Range" -> Range
        "Ratio" -> Ratio
        "RatioRange" -> RatioRange
        "Reference" -> Reference
        "RelatedArtifact" -> RelatedArtifact
        "SampledData" -> SampledData
        "Signature" -> Signature
        "TriggerDefinition" -> TriggerDefinition
        "UsageContext" -> UsageContext
        "VirtualServiceDetail" -> VirtualServiceDetail
        "xhtml" -> Xhtml
        "Resource" -> Resource
        "Binary" -> Binary
        "Bundle" -> Bundle
        "DomainResource" -> DomainResource
        "Account" -> Account
        "ActivityDefinition" -> ActivityDefinition
        "ActorDefinition" -> ActorDefinition
        "AdministrableProductDefinition" -> AdministrableProductDefinition
        "AdverseEvent" -> AdverseEvent
        "AllergyIntolerance" -> AllergyIntolerance
        "Appointment" -> Appointment
        "AppointmentResponse" -> AppointmentResponse
        "ArtifactAssessment" -> ArtifactAssessment
        "AuditEvent" -> AuditEvent
        "Basic" -> Basic
        "BiologicallyDerivedProduct" -> BiologicallyDerivedProduct
        "BiologicallyDerivedProductDispense" -> BiologicallyDerivedProductDispense
        "BodyStructure" -> BodyStructure
        "CanonicalResource" -> CanonicalResource
        "CapabilityStatement" -> CapabilityStatement
        "CarePlan" -> CarePlan
        "CareTeam" -> CareTeam
        "ChargeItem" -> ChargeItem
        "ChargeItemDefinition" -> ChargeItemDefinition
        "Citation" -> Citation
        "Claim" -> Claim
        "ClaimResponse" -> ClaimResponse
        "ClinicalImpression" -> ClinicalImpression
        "ClinicalUseDefinition" -> ClinicalUseDefinition
        "CodeSystem" -> CodeSystem
        "Communication" -> Communication
        "CommunicationRequest" -> CommunicationRequest
        "CompartmentDefinition" -> CompartmentDefinition
        "Composition" -> Composition
        "ConceptMap" -> ConceptMap
        "Condition" -> Condition
        "ConditionDefinition" -> ConditionDefinition
        "Consent" -> Consent
        "Contract" -> Contract
        "Coverage" -> Coverage
        "CoverageEligibilityRequest" -> CoverageEligibilityRequest
        "CoverageEligibilityResponse" -> CoverageEligibilityResponse
        "DetectedIssue" -> DetectedIssue
        "Device" -> Device
        "DeviceAssociation" -> DeviceAssociation
        "DeviceDefinition" -> DeviceDefinition
        "DeviceDispense" -> DeviceDispense
        "DeviceMetric" -> DeviceMetric
        "DeviceRequest" -> DeviceRequest
        "DeviceUsage" -> DeviceUsage
        "DiagnosticReport" -> DiagnosticReport
        "DocumentReference" -> DocumentReference
        "Encounter" -> Encounter
        "EncounterHistory" -> EncounterHistory
        "Endpoint" -> Endpoint
        "EnrollmentRequest" -> EnrollmentRequest
        "EnrollmentResponse" -> EnrollmentResponse
        "EpisodeOfCare" -> EpisodeOfCare
        "EventDefinition" -> EventDefinition
        "Evidence" -> Evidence
        "EvidenceReport" -> EvidenceReport
        "EvidenceVariable" -> EvidenceVariable
        "ExampleScenario" -> ExampleScenario
        "ExplanationOfBenefit" -> ExplanationOfBenefit
        "FamilyMemberHistory" -> FamilyMemberHistory
        "Flag" -> Flag
        "FormularyItem" -> FormularyItem
        "GenomicStudy" -> GenomicStudy
        "Goal" -> Goal
        "GraphDefinition" -> GraphDefinition
        "Group" -> Group
        "GuidanceResponse" -> GuidanceResponse
        "HealthcareService" -> HealthcareService
        "ImagingSelection" -> ImagingSelection
        "ImagingStudy" -> ImagingStudy
        "Immunization" -> Immunization
        "ImmunizationEvaluation" -> ImmunizationEvaluation
        "ImmunizationRecommendation" -> ImmunizationRecommendation
        "ImplementationGuide" -> ImplementationGuide
        "Ingredient" -> Ingredient
        "InsurancePlan" -> InsurancePlan
        "InventoryItem" -> InventoryItem
        "InventoryReport" -> InventoryReport
        "Invoice" -> Invoice
        "Library" -> Library
        "Linkage" -> Linkage
        "List" -> List
        "Location" -> Location
        "ManufacturedItemDefinition" -> ManufacturedItemDefinition
        "Measure" -> Measure
        "MeasureReport" -> MeasureReport
        "Medication" -> Medication
        "MedicationAdministration" -> MedicationAdministration
        "MedicationDispense" -> MedicationDispense
        "MedicationKnowledge" -> MedicationKnowledge
        "MedicationRequest" -> MedicationRequest
        "MedicationStatement" -> MedicationStatement
        "MedicinalProductDefinition" -> MedicinalProductDefinition
        "MessageDefinition" -> MessageDefinition
        "MessageHeader" -> MessageHeader
        "MetadataResource" -> MetadataResource
        "MolecularSequence" -> MolecularSequence
        "NamingSystem" -> NamingSystem
        "NutritionIntake" -> NutritionIntake
        "NutritionOrder" -> NutritionOrder
        "NutritionProduct" -> NutritionProduct
        "Observation" -> Observation
        "ObservationDefinition" -> ObservationDefinition
        "OperationDefinition" -> OperationDefinition
        "OperationOutcome" -> OperationOutcome
        "Organization" -> Organization
        "OrganizationAffiliation" -> OrganizationAffiliation
        "PackagedProductDefinition" -> PackagedProductDefinition
        "Patient" -> Patient
        "PaymentNotice" -> PaymentNotice
        "PaymentReconciliation" -> PaymentReconciliation
        "Permission" -> Permission
        "Person" -> Person
        "PlanDefinition" -> PlanDefinition
        "Practitioner" -> Practitioner
        "PractitionerRole" -> PractitionerRole
        "Procedure" -> Procedure
        "Provenance" -> Provenance
        "Questionnaire" -> Questionnaire
        "QuestionnaireResponse" -> QuestionnaireResponse
        "RegulatedAuthorization" -> RegulatedAuthorization
        "RelatedPerson" -> RelatedPerson
        "RequestOrchestration" -> RequestOrchestration
        "Requirements" -> Requirements
        "ResearchStudy" -> ResearchStudy
        "ResearchSubject" -> ResearchSubject
        "RiskAssessment" -> RiskAssessment
        "Schedule" -> Schedule
        "SearchParameter" -> SearchParameter
        "ServiceRequest" -> ServiceRequest
        "Slot" -> Slot
        "Specimen" -> Specimen
        "SpecimenDefinition" -> SpecimenDefinition
        "StructureDefinition" -> StructureDefinition
        "StructureMap" -> StructureMap
        "Subscription" -> Subscription
        "SubscriptionStatus" -> SubscriptionStatus
        "SubscriptionTopic" -> SubscriptionTopic
        "Substance" -> Substance
        "SubstanceDefinition" -> SubstanceDefinition
        "SubstanceNucleicAcid" -> SubstanceNucleicAcid
        "SubstancePolymer" -> SubstancePolymer
        "SubstanceProtein" -> SubstanceProtein
        "SubstanceReferenceInformation" -> SubstanceReferenceInformation
        "SubstanceSourceMaterial" -> SubstanceSourceMaterial
        "SupplyDelivery" -> SupplyDelivery
        "SupplyRequest" -> SupplyRequest
        "Task" -> Task
        "TerminologyCapabilities" -> TerminologyCapabilities
        "TestPlan" -> TestPlan
        "TestReport" -> TestReport
        "TestScript" -> TestScript
        "Transport" -> Transport
        "ValueSet" -> ValueSet
        "VerificationResult" -> VerificationResult
        "VisionPrescription" -> VisionPrescription
        "Parameters" -> Parameters
        else -> throw IllegalArgumentException("Unknown code $code for enum BasisType")
      }
  }
}
