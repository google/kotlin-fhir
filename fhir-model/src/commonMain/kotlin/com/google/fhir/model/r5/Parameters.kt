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

import com.google.fhir.model.r5.serializers.ParametersParameterSerializer
import com.google.fhir.model.r5.serializers.ParametersParameterValueSerializer
import com.google.fhir.model.r5.serializers.ParametersSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This resource is used to pass information into and back from an operation (whether invoked
 * directly from REST or within a messaging environment). It is not persisted or allowed to be
 * referenced by other resources except as described in the definition of the Parameters resource.
 */
@Serializable(with = ParametersSerializer::class)
@SerialName("Parameters")
public data class Parameters(
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
  /** A parameter passed to or received from the operation. */
  public var parameter: List<Parameter>? = null,
) : Resource() {
  /** A parameter passed to or received from the operation. */
  @Serializable(with = ParametersParameterSerializer::class)
  public class Parameter(
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
    /** The name of the parameter (reference to the operation definition). */
    public var name: String? = null,
    /** Conveys the content if the parameter is a data type. */
    public var `value`: Value? = null,
    /**
     * Conveys the content if the parameter is a whole resource.
     *
     * When resolving references in resources, the operation definition may specify how references
     * may be resolved between parameters. If a reference cannot be resolved between the parameters,
     * the application should fall back to its general resource resolution methods.
     */
    public var resource: Resource? = null,
    /** A named part of a multi-part parameter. */
    public var part: List<Parameter?>? = null,
  ) : BackboneElement() {
    @Serializable(with = ParametersParameterValueSerializer::class)
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

      public data object Null : Value

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
        ): Value {
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
          return Null
        }
      }
    }
  }
}
