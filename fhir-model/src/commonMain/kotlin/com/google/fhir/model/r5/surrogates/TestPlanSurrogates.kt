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

@file:UseSerializers(DoubleSerializer::class, LocalTimeSerializer::class)
@file:Suppress("RedundantVisibilityModifier", "PropertyName")

package com.google.fhir.model.r5.surrogates

import com.google.fhir.model.r5.Boolean as R5Boolean
import com.google.fhir.model.r5.Code
import com.google.fhir.model.r5.CodeableConcept
import com.google.fhir.model.r5.CodeableReference
import com.google.fhir.model.r5.Coding
import com.google.fhir.model.r5.ContactDetail
import com.google.fhir.model.r5.DateTime
import com.google.fhir.model.r5.Element
import com.google.fhir.model.r5.Enumeration
import com.google.fhir.model.r5.Extension
import com.google.fhir.model.r5.FhirDateTime
import com.google.fhir.model.r5.Identifier
import com.google.fhir.model.r5.Integer
import com.google.fhir.model.r5.Markdown
import com.google.fhir.model.r5.Meta
import com.google.fhir.model.r5.Narrative
import com.google.fhir.model.r5.Reference
import com.google.fhir.model.r5.Resource
import com.google.fhir.model.r5.String as R5String
import com.google.fhir.model.r5.TestPlan
import com.google.fhir.model.r5.Uri
import com.google.fhir.model.r5.UsageContext
import com.google.fhir.model.r5.serializers.DoubleSerializer
import com.google.fhir.model.r5.serializers.LocalTimeSerializer
import kotlin.Boolean as KotlinBoolean
import kotlin.Int
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class TestPlanDependencySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var predecessor: Reference? = null,
) {
  public fun toModel(): TestPlan.Dependency =
    TestPlan.Dependency().apply {
      id = this@TestPlanDependencySurrogate.id
      extension = this@TestPlanDependencySurrogate.extension
      modifierExtension = this@TestPlanDependencySurrogate.modifierExtension
      description =
        Markdown.of(
          this@TestPlanDependencySurrogate.description,
          this@TestPlanDependencySurrogate._description,
        )
      predecessor = this@TestPlanDependencySurrogate.predecessor
    }

  public companion object {
    public fun fromModel(model: TestPlan.Dependency): TestPlanDependencySurrogate =
      with(model) {
        TestPlanDependencySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          predecessor = this@with.predecessor
        }
      }
  }
}

@Serializable
internal data class TestPlanTestCaseDependencySurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var predecessor: Reference? = null,
) {
  public fun toModel(): TestPlan.TestCase.Dependency =
    TestPlan.TestCase.Dependency().apply {
      id = this@TestPlanTestCaseDependencySurrogate.id
      extension = this@TestPlanTestCaseDependencySurrogate.extension
      modifierExtension = this@TestPlanTestCaseDependencySurrogate.modifierExtension
      description =
        Markdown.of(
          this@TestPlanTestCaseDependencySurrogate.description,
          this@TestPlanTestCaseDependencySurrogate._description,
        )
      predecessor = this@TestPlanTestCaseDependencySurrogate.predecessor
    }

  public companion object {
    public fun fromModel(model: TestPlan.TestCase.Dependency): TestPlanTestCaseDependencySurrogate =
      with(model) {
        TestPlanTestCaseDependencySurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          predecessor = this@with.predecessor
        }
      }
  }
}

@Serializable
internal data class TestPlanTestCaseTestRunScriptSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var language: CodeableConcept? = null,
  public var sourceString: KotlinString? = null,
  public var _sourceString: Element? = null,
  public var sourceReference: Reference? = null,
) {
  public fun toModel(): TestPlan.TestCase.TestRun.Script =
    TestPlan.TestCase.TestRun.Script().apply {
      id = this@TestPlanTestCaseTestRunScriptSurrogate.id
      extension = this@TestPlanTestCaseTestRunScriptSurrogate.extension
      modifierExtension = this@TestPlanTestCaseTestRunScriptSurrogate.modifierExtension
      language = this@TestPlanTestCaseTestRunScriptSurrogate.language
      source =
        TestPlan.TestCase.TestRun.Script.Source?.from(
          R5String.of(
            this@TestPlanTestCaseTestRunScriptSurrogate.sourceString,
            this@TestPlanTestCaseTestRunScriptSurrogate._sourceString,
          ),
          this@TestPlanTestCaseTestRunScriptSurrogate.sourceReference,
        )
    }

  public companion object {
    public fun fromModel(
      model: TestPlan.TestCase.TestRun.Script
    ): TestPlanTestCaseTestRunScriptSurrogate =
      with(model) {
        TestPlanTestCaseTestRunScriptSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          language = this@with.language
          sourceString = this@with.source?.asString()?.value?.value
          _sourceString = this@with.source?.asString()?.value?.toElement()
          sourceReference = this@with.source?.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class TestPlanTestCaseTestRunSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var narrative: KotlinString? = null,
  public var _narrative: Element? = null,
  public var script: TestPlan.TestCase.TestRun.Script? = null,
) {
  public fun toModel(): TestPlan.TestCase.TestRun =
    TestPlan.TestCase.TestRun().apply {
      id = this@TestPlanTestCaseTestRunSurrogate.id
      extension = this@TestPlanTestCaseTestRunSurrogate.extension
      modifierExtension = this@TestPlanTestCaseTestRunSurrogate.modifierExtension
      narrative =
        Markdown.of(
          this@TestPlanTestCaseTestRunSurrogate.narrative,
          this@TestPlanTestCaseTestRunSurrogate._narrative,
        )
      script = this@TestPlanTestCaseTestRunSurrogate.script
    }

  public companion object {
    public fun fromModel(model: TestPlan.TestCase.TestRun): TestPlanTestCaseTestRunSurrogate =
      with(model) {
        TestPlanTestCaseTestRunSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          narrative = this@with.narrative?.value
          _narrative = this@with.narrative?.toElement()
          script = this@with.script
        }
      }
  }
}

@Serializable
internal data class TestPlanTestCaseTestDataSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: Coding? = null,
  public var content: Reference? = null,
  public var sourceString: KotlinString? = null,
  public var _sourceString: Element? = null,
  public var sourceReference: Reference? = null,
) {
  public fun toModel(): TestPlan.TestCase.TestData =
    TestPlan.TestCase.TestData().apply {
      id = this@TestPlanTestCaseTestDataSurrogate.id
      extension = this@TestPlanTestCaseTestDataSurrogate.extension
      modifierExtension = this@TestPlanTestCaseTestDataSurrogate.modifierExtension
      type = this@TestPlanTestCaseTestDataSurrogate.type
      content = this@TestPlanTestCaseTestDataSurrogate.content
      source =
        TestPlan.TestCase.TestData.Source?.from(
          R5String.of(
            this@TestPlanTestCaseTestDataSurrogate.sourceString,
            this@TestPlanTestCaseTestDataSurrogate._sourceString,
          ),
          this@TestPlanTestCaseTestDataSurrogate.sourceReference,
        )
    }

  public companion object {
    public fun fromModel(model: TestPlan.TestCase.TestData): TestPlanTestCaseTestDataSurrogate =
      with(model) {
        TestPlanTestCaseTestDataSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          content = this@with.content
          sourceString = this@with.source?.asString()?.value?.value
          _sourceString = this@with.source?.asString()?.value?.toElement()
          sourceReference = this@with.source?.asReference()?.value
        }
      }
  }
}

@Serializable
internal data class TestPlanTestCaseAssertionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: List<CodeableConcept?>? = null,
  public var `object`: List<CodeableReference?>? = null,
  public var result: List<CodeableReference?>? = null,
) {
  public fun toModel(): TestPlan.TestCase.Assertion =
    TestPlan.TestCase.Assertion().apply {
      id = this@TestPlanTestCaseAssertionSurrogate.id
      extension = this@TestPlanTestCaseAssertionSurrogate.extension
      modifierExtension = this@TestPlanTestCaseAssertionSurrogate.modifierExtension
      type = this@TestPlanTestCaseAssertionSurrogate.type
      `object` = this@TestPlanTestCaseAssertionSurrogate.`object`
      result = this@TestPlanTestCaseAssertionSurrogate.result
    }

  public companion object {
    public fun fromModel(model: TestPlan.TestCase.Assertion): TestPlanTestCaseAssertionSurrogate =
      with(model) {
        TestPlanTestCaseAssertionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type
          `object` = this@with.`object`
          result = this@with.result
        }
      }
  }
}

@Serializable
internal data class TestPlanTestCaseSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var sequence: Int? = null,
  public var _sequence: Element? = null,
  public var scope: List<Reference?>? = null,
  public var dependency: List<TestPlan.TestCase.Dependency>? = null,
  public var testRun: List<TestPlan.TestCase.TestRun>? = null,
  public var testData: List<TestPlan.TestCase.TestData>? = null,
  public var assertion: List<TestPlan.TestCase.Assertion>? = null,
) {
  public fun toModel(): TestPlan.TestCase =
    TestPlan.TestCase().apply {
      id = this@TestPlanTestCaseSurrogate.id
      extension = this@TestPlanTestCaseSurrogate.extension
      modifierExtension = this@TestPlanTestCaseSurrogate.modifierExtension
      sequence =
        Integer.of(
          this@TestPlanTestCaseSurrogate.sequence,
          this@TestPlanTestCaseSurrogate._sequence,
        )
      scope = this@TestPlanTestCaseSurrogate.scope
      dependency = this@TestPlanTestCaseSurrogate.dependency
      testRun = this@TestPlanTestCaseSurrogate.testRun
      testData = this@TestPlanTestCaseSurrogate.testData
      assertion = this@TestPlanTestCaseSurrogate.assertion
    }

  public companion object {
    public fun fromModel(model: TestPlan.TestCase): TestPlanTestCaseSurrogate =
      with(model) {
        TestPlanTestCaseSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          sequence = this@with.sequence?.value
          _sequence = this@with.sequence?.toElement()
          scope = this@with.scope
          dependency = this@with.dependency
          testRun = this@with.testRun
          testData = this@with.testData
          assertion = this@with.assertion
        }
      }
  }
}

@Serializable
internal data class TestPlanSurrogate(
  public var id: KotlinString? = null,
  public var meta: Meta? = null,
  public var implicitRules: KotlinString? = null,
  public var _implicitRules: Element? = null,
  public var language: KotlinString? = null,
  public var _language: Element? = null,
  public var text: Narrative? = null,
  public var contained: List<Resource?>? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var url: KotlinString? = null,
  public var _url: Element? = null,
  public var identifier: List<Identifier?>? = null,
  public var version: KotlinString? = null,
  public var _version: Element? = null,
  public var versionAlgorithmString: KotlinString? = null,
  public var _versionAlgorithmString: Element? = null,
  public var versionAlgorithmCoding: Coding? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var title: KotlinString? = null,
  public var _title: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var experimental: KotlinBoolean? = null,
  public var _experimental: Element? = null,
  public var date: KotlinString? = null,
  public var _date: Element? = null,
  public var publisher: KotlinString? = null,
  public var _publisher: Element? = null,
  public var contact: List<ContactDetail?>? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var useContext: List<UsageContext?>? = null,
  public var jurisdiction: List<CodeableConcept?>? = null,
  public var purpose: KotlinString? = null,
  public var _purpose: Element? = null,
  public var copyright: KotlinString? = null,
  public var _copyright: Element? = null,
  public var copyrightLabel: KotlinString? = null,
  public var _copyrightLabel: Element? = null,
  public var category: List<CodeableConcept?>? = null,
  public var scope: List<Reference?>? = null,
  public var testTools: KotlinString? = null,
  public var _testTools: Element? = null,
  public var dependency: List<TestPlan.Dependency>? = null,
  public var exitCriteria: KotlinString? = null,
  public var _exitCriteria: Element? = null,
  public var testCase: List<TestPlan.TestCase>? = null,
) {
  public fun toModel(): TestPlan =
    TestPlan().apply {
      id = this@TestPlanSurrogate.id
      meta = this@TestPlanSurrogate.meta
      implicitRules =
        Uri.of(this@TestPlanSurrogate.implicitRules, this@TestPlanSurrogate._implicitRules)
      language = Code.of(this@TestPlanSurrogate.language, this@TestPlanSurrogate._language)
      text = this@TestPlanSurrogate.text
      contained = this@TestPlanSurrogate.contained
      extension = this@TestPlanSurrogate.extension
      modifierExtension = this@TestPlanSurrogate.modifierExtension
      url = Uri.of(this@TestPlanSurrogate.url, this@TestPlanSurrogate._url)
      identifier = this@TestPlanSurrogate.identifier
      version = R5String.of(this@TestPlanSurrogate.version, this@TestPlanSurrogate._version)
      versionAlgorithm =
        TestPlan.VersionAlgorithm?.from(
          R5String.of(
            this@TestPlanSurrogate.versionAlgorithmString,
            this@TestPlanSurrogate._versionAlgorithmString,
          ),
          this@TestPlanSurrogate.versionAlgorithmCoding,
        )
      name = R5String.of(this@TestPlanSurrogate.name, this@TestPlanSurrogate._name)
      title = R5String.of(this@TestPlanSurrogate.title, this@TestPlanSurrogate._title)
      status =
        Enumeration.of(
          this@TestPlanSurrogate.status?.let {
            com.google.fhir.model.r5.PublicationStatus.fromCode(it)
          },
          this@TestPlanSurrogate._status,
        )
      experimental =
        R5Boolean.of(this@TestPlanSurrogate.experimental, this@TestPlanSurrogate._experimental)
      date =
        DateTime.of(
          FhirDateTime.fromString(this@TestPlanSurrogate.date),
          this@TestPlanSurrogate._date,
        )
      publisher = R5String.of(this@TestPlanSurrogate.publisher, this@TestPlanSurrogate._publisher)
      contact = this@TestPlanSurrogate.contact
      description =
        Markdown.of(this@TestPlanSurrogate.description, this@TestPlanSurrogate._description)
      useContext = this@TestPlanSurrogate.useContext
      jurisdiction = this@TestPlanSurrogate.jurisdiction
      purpose = Markdown.of(this@TestPlanSurrogate.purpose, this@TestPlanSurrogate._purpose)
      copyright = Markdown.of(this@TestPlanSurrogate.copyright, this@TestPlanSurrogate._copyright)
      copyrightLabel =
        R5String.of(this@TestPlanSurrogate.copyrightLabel, this@TestPlanSurrogate._copyrightLabel)
      category = this@TestPlanSurrogate.category
      scope = this@TestPlanSurrogate.scope
      testTools = Markdown.of(this@TestPlanSurrogate.testTools, this@TestPlanSurrogate._testTools)
      dependency = this@TestPlanSurrogate.dependency
      exitCriteria =
        Markdown.of(this@TestPlanSurrogate.exitCriteria, this@TestPlanSurrogate._exitCriteria)
      testCase = this@TestPlanSurrogate.testCase
    }

  public companion object {
    public fun fromModel(model: TestPlan): TestPlanSurrogate =
      with(model) {
        TestPlanSurrogate().apply {
          id = this@with.id
          meta = this@with.meta
          implicitRules = this@with.implicitRules?.value
          _implicitRules = this@with.implicitRules?.toElement()
          language = this@with.language?.value
          _language = this@with.language?.toElement()
          text = this@with.text
          contained = this@with.contained
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          url = this@with.url?.value
          _url = this@with.url?.toElement()
          identifier = this@with.identifier
          version = this@with.version?.value
          _version = this@with.version?.toElement()
          versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.value
          _versionAlgorithmString = this@with.versionAlgorithm?.asString()?.value?.toElement()
          versionAlgorithmCoding = this@with.versionAlgorithm?.asCoding()?.value
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          title = this@with.title?.value
          _title = this@with.title?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          experimental = this@with.experimental?.value
          _experimental = this@with.experimental?.toElement()
          date = this@with.date?.value?.toString()
          _date = this@with.date?.toElement()
          publisher = this@with.publisher?.value
          _publisher = this@with.publisher?.toElement()
          contact = this@with.contact
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          useContext = this@with.useContext
          jurisdiction = this@with.jurisdiction
          purpose = this@with.purpose?.value
          _purpose = this@with.purpose?.toElement()
          copyright = this@with.copyright?.value
          _copyright = this@with.copyright?.toElement()
          copyrightLabel = this@with.copyrightLabel?.value
          _copyrightLabel = this@with.copyrightLabel?.toElement()
          category = this@with.category
          scope = this@with.scope
          testTools = this@with.testTools?.value
          _testTools = this@with.testTools?.toElement()
          dependency = this@with.dependency
          exitCriteria = this@with.exitCriteria?.value
          _exitCriteria = this@with.exitCriteria?.toElement()
          testCase = this@with.testCase
        }
      }
  }
}
