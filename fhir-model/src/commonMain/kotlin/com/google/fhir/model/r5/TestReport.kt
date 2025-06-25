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

import com.google.fhir.model.r5.serializers.TestReportParticipantSerializer
import com.google.fhir.model.r5.serializers.TestReportSerializer
import com.google.fhir.model.r5.serializers.TestReportSetupActionAssertRequirementSerializer
import com.google.fhir.model.r5.serializers.TestReportSetupActionAssertSerializer
import com.google.fhir.model.r5.serializers.TestReportSetupActionOperationSerializer
import com.google.fhir.model.r5.serializers.TestReportSetupActionSerializer
import com.google.fhir.model.r5.serializers.TestReportSetupSerializer
import com.google.fhir.model.r5.serializers.TestReportTeardownActionSerializer
import com.google.fhir.model.r5.serializers.TestReportTeardownSerializer
import com.google.fhir.model.r5.serializers.TestReportTestActionSerializer
import com.google.fhir.model.r5.serializers.TestReportTestSerializer
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/** A summary of information based on the results of executing a TestScript. */
@Serializable(with = TestReportSerializer::class)
@SerialName("TestReport")
public data class TestReport(
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
  /** Identifier for the TestReport assigned for external purposes outside the context of FHIR. */
  public var identifier: Identifier? = null,
  /**
   * A free text natural language name identifying the executed TestReport.
   *
   * Not expected to be globally unique.
   */
  public var name: String? = null,
  /**
   * The current state of this test report.
   *
   * The status represents where the execution is currently within the test script execution life
   * cycle.
   *
   * This element is labeled as a modifier because the status contains codes that mark the resource
   * as not currently valid.
   */
  public var status: Enumeration<TestReportStatus>? = null,
  /**
   * Ideally this is an absolute URL that is used to identify the version-specific TestScript that
   * was executed, matching the `TestScript.url`.
   */
  public var testScript: Canonical? = null,
  /**
   * The overall result from the execution of the TestScript.
   *
   * The pass and fail result represents a completed test script execution. The pending result
   * represents a test script execution that has not yet started or is currently in progress.
   */
  public var result: Enumeration<TestReportResult>? = null,
  /**
   * The final score (percentage of tests passed) resulting from the execution of the TestScript.
   */
  public var score: Decimal? = null,
  /**
   * Name of the tester producing this report (Organization or individual).
   *
   * Usually an organization, but may be an individual. This item SHOULD be populated unless the
   * information is available from context.
   */
  public var tester: String? = null,
  /**
   * When the TestScript was executed and this TestReport was generated.
   *
   * Additional specific dates may be added as extensions.
   */
  public var issued: DateTime? = null,
  /** A participant in the test execution, either the execution engine, a client, or a server. */
  public var participant: List<Participant>? = null,
  /** The results of the series of required setup operations before the tests were executed. */
  public var setup: Setup? = null,
  /** A test executed from the test script. */
  public var test: List<Test>? = null,
  /**
   * The results of the series of operations required to clean up after all the tests were executed
   * (successfully or otherwise).
   */
  public var teardown: Teardown? = null,
) : DomainResource() {
  /** A participant in the test execution, either the execution engine, a client, or a server. */
  @Serializable(with = TestReportParticipantSerializer::class)
  public class Participant(
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
    /** The type of participant. */
    public var type: Enumeration<TestReportParticipantType>? = null,
    /** The uri of the participant. An absolute URL is preferred. */
    public var uri: Uri? = null,
    /** The display name of the participant. */
    public var display: String? = null,
  ) : BackboneElement()

  /** The results of the series of required setup operations before the tests were executed. */
  @Serializable(with = TestReportSetupSerializer::class)
  public class Setup(
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
     * Action would contain either an operation or an assertion.
     *
     * An action should contain either an operation or an assertion but not both. It can contain any
     * number of variables.
     */
    public var action: List<Action>? = null,
  ) : BackboneElement() {
    /** Action would contain either an operation or an assertion. */
    @Serializable(with = TestReportSetupActionSerializer::class)
    public class Action(
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
      /** The operation performed. */
      public var operation: Operation? = null,
      /** The results of the assertion performed on the previous operations. */
      public var assert: Assert? = null,
    ) : BackboneElement() {
      /** The operation performed. */
      @Serializable(with = TestReportSetupActionOperationSerializer::class)
      public class Operation(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and managable, there is a strict set
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
         * and managable, there is a strict set of governance applied to the definition and use of
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
        /** The result of this operation. */
        public var result: Enumeration<TestReportActionResult>? = null,
        /** An explanatory message associated with the result. */
        public var message: Markdown? = null,
        /** A link to further details on the result. */
        public var detail: Uri? = null,
      ) : BackboneElement()

      /** The results of the assertion performed on the previous operations. */
      @Serializable(with = TestReportSetupActionAssertSerializer::class)
      public class Assert(
        /**
         * Unique id for the element within a resource (for internal references). This may be any
         * string value that does not contain spaces.
         */
        override var id: kotlin.String? = null,
        /**
         * May be used to represent additional information that is not part of the basic definition
         * of the element. To make the use of extensions safe and managable, there is a strict set
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
         * and managable, there is a strict set of governance applied to the definition and use of
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
        /** The result of this assertion. */
        public var result: Enumeration<TestReportActionResult>? = null,
        /** An explanatory message associated with the result. */
        public var message: Markdown? = null,
        /** A link to further details on the result. */
        public var detail: String? = null,
        /**
         * Links or references providing traceability to the testing requirements for this assert.
         *
         * TestScript and TestReport instances are typically (and expected to be) based on known,
         * defined test requirements and documentation. These links provide traceability from the
         * executable/executed TestScript and TestReport tests to these requirements.
         */
        public var requirement: List<Requirement>? = null,
      ) : BackboneElement() {
        /**
         * Links or references providing traceability to the testing requirements for this assert.
         */
        @Serializable(with = TestReportSetupActionAssertRequirementSerializer::class)
        public class Requirement(
          /**
           * Unique id for the element within a resource (for internal references). This may be any
           * string value that does not contain spaces.
           */
          override var id: kotlin.String? = null,
          /**
           * May be used to represent additional information that is not part of the basic
           * definition of the element. To make the use of extensions safe and managable, there is a
           * strict set of governance applied to the definition and use of extensions. Though any
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
           * extensions safe and managable, there is a strict set of governance applied to the
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
          /** Link or reference providing traceability to the testing requirement for this test. */
          public var link: Link? = null,
        ) : BackboneElement() {
          public sealed interface Link {
            public fun asUri(): Uri? = this as? Uri

            public fun asCanonical(): Canonical? = this as? Canonical

            public data class Uri(public val `value`: com.google.fhir.model.r5.Uri) : Link

            public data class Canonical(public val `value`: com.google.fhir.model.r5.Canonical) :
              Link

            public companion object {
              public fun from(
                uriValue: com.google.fhir.model.r5.Uri?,
                canonicalValue: com.google.fhir.model.r5.Canonical?,
              ): Link? {
                if (uriValue != null) return Uri(uriValue)
                if (canonicalValue != null) return Canonical(canonicalValue)
                return null
              }
            }
          }
        }
      }
    }
  }

  /** A test executed from the test script. */
  @Serializable(with = TestReportTestSerializer::class)
  public class Test(
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
    @Serializable(with = TestReportTestActionSerializer::class)
    public class Action(
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
      /** An operation would involve a REST request to a server. */
      public var operation: Setup.Action.Operation? = null,
      /** The results of the assertion performed on the previous operations. */
      public var assert: Setup.Action.Assert? = null,
    ) : BackboneElement()
  }

  /**
   * The results of the series of operations required to clean up after all the tests were executed
   * (successfully or otherwise).
   */
  @Serializable(with = TestReportTeardownSerializer::class)
  public class Teardown(
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
     * The teardown action will only contain an operation.
     *
     * An action should contain either an operation or an assertion but not both. It can contain any
     * number of variables.
     */
    public var action: List<Action>? = null,
  ) : BackboneElement() {
    /** The teardown action will only contain an operation. */
    @Serializable(with = TestReportTeardownActionSerializer::class)
    public class Action(
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
      /** An operation would involve a REST request to a server. */
      public var operation: Setup.Action.Operation? = null,
    ) : BackboneElement()
  }

  /** The type of participant. */
  public enum class TestReportParticipantType(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The test execution engine. */
    Test_Engine(
      "test-engine",
      "http://hl7.org/fhir/report-participant-type",
      "Test Engine",
      "The test execution engine.",
    ),
    /** A FHIR Client. */
    Client("client", "http://hl7.org/fhir/report-participant-type", "Client", "A FHIR Client."),
    /** A FHIR Server. */
    Server("server", "http://hl7.org/fhir/report-participant-type", "Server", "A FHIR Server.");

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): TestReportParticipantType =
        when (code) {
          "test-engine" -> Test_Engine
          "client" -> Client
          "server" -> Server
          else ->
            throw IllegalArgumentException("Unknown code $code for enum TestReportParticipantType")
        }
    }
  }

  /** The results of executing an action. */
  public enum class TestReportActionResult(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** The action was successful. */
    Pass(
      "pass",
      "http://hl7.org/fhir/report-action-result-codes",
      "Pass",
      "The action was successful.",
    ),
    /** The action was skipped. */
    Skip(
      "skip",
      "http://hl7.org/fhir/report-action-result-codes",
      "Skip",
      "The action was skipped.",
    ),
    /** The action failed. */
    Fail("fail", "http://hl7.org/fhir/report-action-result-codes", "Fail", "The action failed."),
    /** The action passed but with warnings. */
    Warning(
      "warning",
      "http://hl7.org/fhir/report-action-result-codes",
      "Warning",
      "The action passed but with warnings.",
    ),
    /** The action encountered a fatal error and the engine was unable to process. */
    Error(
      "error",
      "http://hl7.org/fhir/report-action-result-codes",
      "Error",
      "The action encountered a fatal error and the engine was unable to process.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): TestReportActionResult =
        when (code) {
          "pass" -> Pass
          "skip" -> Skip
          "fail" -> Fail
          "warning" -> Warning
          "error" -> Error
          else ->
            throw IllegalArgumentException("Unknown code $code for enum TestReportActionResult")
        }
    }
  }

  /** The current status of the test report. */
  public enum class TestReportStatus(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** All test operations have completed. */
    Completed(
      "completed",
      "http://hl7.org/fhir/report-status-codes",
      "Completed",
      "All test operations have completed.",
    ),
    /** A test operations is currently executing. */
    In_Progress(
      "in-progress",
      "http://hl7.org/fhir/report-status-codes",
      "In Progress",
      "A test operations is currently executing.",
    ),
    /** A test operation is waiting for an external client request. */
    Waiting(
      "waiting",
      "http://hl7.org/fhir/report-status-codes",
      "Waiting",
      "A test operation is waiting for an external client request.",
    ),
    /** The test script execution was manually stopped. */
    Stopped(
      "stopped",
      "http://hl7.org/fhir/report-status-codes",
      "Stopped",
      "The test script execution was manually stopped.",
    ),
    /** This test report was entered or created in error. */
    Entered_In_Error(
      "entered-in-error",
      "http://hl7.org/fhir/report-status-codes",
      "Entered In Error",
      "This test report was entered or created in error.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): TestReportStatus =
        when (code) {
          "completed" -> Completed
          "in-progress" -> In_Progress
          "waiting" -> Waiting
          "stopped" -> Stopped
          "entered-in-error" -> Entered_In_Error
          else -> throw IllegalArgumentException("Unknown code $code for enum TestReportStatus")
        }
    }
  }

  /** The reported execution result. */
  public enum class TestReportResult(
    private val code: kotlin.String,
    private val system: kotlin.String,
    private val display: kotlin.String?,
    private val definition: kotlin.String?,
  ) {
    /** All test operations successfully passed all asserts. */
    Pass(
      "pass",
      "http://hl7.org/fhir/report-result-codes",
      "Pass",
      "All test operations successfully passed all asserts.",
    ),
    /** One or more test operations failed one or more asserts. */
    Fail(
      "fail",
      "http://hl7.org/fhir/report-result-codes",
      "Fail",
      "One or more test operations failed one or more asserts.",
    ),
    /** One or more test operations is pending execution completion. */
    Pending(
      "pending",
      "http://hl7.org/fhir/report-result-codes",
      "Pending",
      "One or more test operations is pending execution completion.",
    );

    override fun toString(): kotlin.String = code

    public fun getCode(): kotlin.String = code

    public fun getSystem(): kotlin.String = system

    public fun getDisplay(): kotlin.String? = display

    public fun getDefinition(): kotlin.String? = definition

    public companion object {
      public fun fromCode(code: kotlin.String): TestReportResult =
        when (code) {
          "pass" -> Pass
          "fail" -> Fail
          "pending" -> Pending
          else -> throw IllegalArgumentException("Unknown code $code for enum TestReportResult")
        }
    }
  }
}
