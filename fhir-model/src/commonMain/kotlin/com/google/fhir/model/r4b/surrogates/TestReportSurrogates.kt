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

package com.google.fhir.model.r4b.surrogates

import com.google.fhir.model.r4b.Code
import com.google.fhir.model.r4b.DateTime
import com.google.fhir.model.r4b.Decimal
import com.google.fhir.model.r4b.Element
import com.google.fhir.model.r4b.Enumeration
import com.google.fhir.model.r4b.Extension
import com.google.fhir.model.r4b.FhirDateTime
import com.google.fhir.model.r4b.Identifier
import com.google.fhir.model.r4b.Markdown
import com.google.fhir.model.r4b.Meta
import com.google.fhir.model.r4b.Narrative
import com.google.fhir.model.r4b.Reference
import com.google.fhir.model.r4b.Resource
import com.google.fhir.model.r4b.String as R4bString
import com.google.fhir.model.r4b.TestReport
import com.google.fhir.model.r4b.Uri
import com.google.fhir.model.r4b.serializers.DoubleSerializer
import com.google.fhir.model.r4b.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.List
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class TestReportParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var uri: KotlinString? = null,
  public var _uri: Element? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
) {
  public fun toModel(): TestReport.Participant =
    TestReport.Participant().apply {
      id = this@TestReportParticipantSurrogate.id
      extension = this@TestReportParticipantSurrogate.extension
      modifierExtension = this@TestReportParticipantSurrogate.modifierExtension
      type =
        Enumeration.of(
          this@TestReportParticipantSurrogate.type?.let {
            com.google.fhir.model.r4b.TestReport.TestReportParticipantType.fromCode(it)
          },
          this@TestReportParticipantSurrogate._type,
        )
      uri =
        Uri.of(this@TestReportParticipantSurrogate.uri, this@TestReportParticipantSurrogate._uri)
      display =
        R4bString.of(
          this@TestReportParticipantSurrogate.display,
          this@TestReportParticipantSurrogate._display,
        )
    }

  public companion object {
    public fun fromModel(model: TestReport.Participant): TestReportParticipantSurrogate =
      with(model) {
        TestReportParticipantSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          type = this@with.type?.value?.getCode()
          _type = this@with.type?.toElement()
          uri = this@with.uri?.value
          _uri = this@with.uri?.toElement()
          display = this@with.display?.value
          _display = this@with.display?.toElement()
        }
      }
  }
}

@Serializable
internal data class TestReportSetupActionOperationSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var result: KotlinString? = null,
  public var _result: Element? = null,
  public var message: KotlinString? = null,
  public var _message: Element? = null,
  public var detail: KotlinString? = null,
  public var _detail: Element? = null,
) {
  public fun toModel(): TestReport.Setup.Action.Operation =
    TestReport.Setup.Action.Operation().apply {
      id = this@TestReportSetupActionOperationSurrogate.id
      extension = this@TestReportSetupActionOperationSurrogate.extension
      modifierExtension = this@TestReportSetupActionOperationSurrogate.modifierExtension
      result =
        Enumeration.of(
          this@TestReportSetupActionOperationSurrogate.result?.let {
            com.google.fhir.model.r4b.TestReport.TestReportActionResult.fromCode(it)
          },
          this@TestReportSetupActionOperationSurrogate._result,
        )
      message =
        Markdown.of(
          this@TestReportSetupActionOperationSurrogate.message,
          this@TestReportSetupActionOperationSurrogate._message,
        )
      detail =
        Uri.of(
          this@TestReportSetupActionOperationSurrogate.detail,
          this@TestReportSetupActionOperationSurrogate._detail,
        )
    }

  public companion object {
    public fun fromModel(
      model: TestReport.Setup.Action.Operation
    ): TestReportSetupActionOperationSurrogate =
      with(model) {
        TestReportSetupActionOperationSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          result = this@with.result?.value?.getCode()
          _result = this@with.result?.toElement()
          message = this@with.message?.value
          _message = this@with.message?.toElement()
          detail = this@with.detail?.value
          _detail = this@with.detail?.toElement()
        }
      }
  }
}

@Serializable
internal data class TestReportSetupActionAssertSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var result: KotlinString? = null,
  public var _result: Element? = null,
  public var message: KotlinString? = null,
  public var _message: Element? = null,
  public var detail: KotlinString? = null,
  public var _detail: Element? = null,
) {
  public fun toModel(): TestReport.Setup.Action.Assert =
    TestReport.Setup.Action.Assert().apply {
      id = this@TestReportSetupActionAssertSurrogate.id
      extension = this@TestReportSetupActionAssertSurrogate.extension
      modifierExtension = this@TestReportSetupActionAssertSurrogate.modifierExtension
      result =
        Enumeration.of(
          this@TestReportSetupActionAssertSurrogate.result?.let {
            com.google.fhir.model.r4b.TestReport.TestReportActionResult.fromCode(it)
          },
          this@TestReportSetupActionAssertSurrogate._result,
        )
      message =
        Markdown.of(
          this@TestReportSetupActionAssertSurrogate.message,
          this@TestReportSetupActionAssertSurrogate._message,
        )
      detail =
        R4bString.of(
          this@TestReportSetupActionAssertSurrogate.detail,
          this@TestReportSetupActionAssertSurrogate._detail,
        )
    }

  public companion object {
    public fun fromModel(
      model: TestReport.Setup.Action.Assert
    ): TestReportSetupActionAssertSurrogate =
      with(model) {
        TestReportSetupActionAssertSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          result = this@with.result?.value?.getCode()
          _result = this@with.result?.toElement()
          message = this@with.message?.value
          _message = this@with.message?.toElement()
          detail = this@with.detail?.value
          _detail = this@with.detail?.toElement()
        }
      }
  }
}

@Serializable
internal data class TestReportSetupActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var operation: TestReport.Setup.Action.Operation? = null,
  public var assert: TestReport.Setup.Action.Assert? = null,
) {
  public fun toModel(): TestReport.Setup.Action =
    TestReport.Setup.Action().apply {
      id = this@TestReportSetupActionSurrogate.id
      extension = this@TestReportSetupActionSurrogate.extension
      modifierExtension = this@TestReportSetupActionSurrogate.modifierExtension
      operation = this@TestReportSetupActionSurrogate.operation
      assert = this@TestReportSetupActionSurrogate.assert
    }

  public companion object {
    public fun fromModel(model: TestReport.Setup.Action): TestReportSetupActionSurrogate =
      with(model) {
        TestReportSetupActionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          operation = this@with.operation
          assert = this@with.assert
        }
      }
  }
}

@Serializable
internal data class TestReportSetupSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var action: List<TestReport.Setup.Action>? = null,
) {
  public fun toModel(): TestReport.Setup =
    TestReport.Setup().apply {
      id = this@TestReportSetupSurrogate.id
      extension = this@TestReportSetupSurrogate.extension
      modifierExtension = this@TestReportSetupSurrogate.modifierExtension
      action = this@TestReportSetupSurrogate.action
    }

  public companion object {
    public fun fromModel(model: TestReport.Setup): TestReportSetupSurrogate =
      with(model) {
        TestReportSetupSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          action = this@with.action
        }
      }
  }
}

@Serializable
internal data class TestReportTestActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var operation: TestReport.Setup.Action.Operation? = null,
  public var assert: TestReport.Setup.Action.Assert? = null,
) {
  public fun toModel(): TestReport.Test.Action =
    TestReport.Test.Action().apply {
      id = this@TestReportTestActionSurrogate.id
      extension = this@TestReportTestActionSurrogate.extension
      modifierExtension = this@TestReportTestActionSurrogate.modifierExtension
      operation = this@TestReportTestActionSurrogate.operation
      assert = this@TestReportTestActionSurrogate.assert
    }

  public companion object {
    public fun fromModel(model: TestReport.Test.Action): TestReportTestActionSurrogate =
      with(model) {
        TestReportTestActionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          operation = this@with.operation
          assert = this@with.assert
        }
      }
  }
}

@Serializable
internal data class TestReportTestSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var action: List<TestReport.Test.Action>? = null,
) {
  public fun toModel(): TestReport.Test =
    TestReport.Test().apply {
      id = this@TestReportTestSurrogate.id
      extension = this@TestReportTestSurrogate.extension
      modifierExtension = this@TestReportTestSurrogate.modifierExtension
      name = R4bString.of(this@TestReportTestSurrogate.name, this@TestReportTestSurrogate._name)
      description =
        R4bString.of(
          this@TestReportTestSurrogate.description,
          this@TestReportTestSurrogate._description,
        )
      action = this@TestReportTestSurrogate.action
    }

  public companion object {
    public fun fromModel(model: TestReport.Test): TestReportTestSurrogate =
      with(model) {
        TestReportTestSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          description = this@with.description?.value
          _description = this@with.description?.toElement()
          action = this@with.action
        }
      }
  }
}

@Serializable
internal data class TestReportTeardownActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var operation: TestReport.Setup.Action.Operation? = null,
) {
  public fun toModel(): TestReport.Teardown.Action =
    TestReport.Teardown.Action().apply {
      id = this@TestReportTeardownActionSurrogate.id
      extension = this@TestReportTeardownActionSurrogate.extension
      modifierExtension = this@TestReportTeardownActionSurrogate.modifierExtension
      operation = this@TestReportTeardownActionSurrogate.operation
    }

  public companion object {
    public fun fromModel(model: TestReport.Teardown.Action): TestReportTeardownActionSurrogate =
      with(model) {
        TestReportTeardownActionSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          operation = this@with.operation
        }
      }
  }
}

@Serializable
internal data class TestReportTeardownSurrogate(
  public var id: KotlinString? = null,
  public var extension: List<Extension?>? = null,
  public var modifierExtension: List<Extension?>? = null,
  public var action: List<TestReport.Teardown.Action>? = null,
) {
  public fun toModel(): TestReport.Teardown =
    TestReport.Teardown().apply {
      id = this@TestReportTeardownSurrogate.id
      extension = this@TestReportTeardownSurrogate.extension
      modifierExtension = this@TestReportTeardownSurrogate.modifierExtension
      action = this@TestReportTeardownSurrogate.action
    }

  public companion object {
    public fun fromModel(model: TestReport.Teardown): TestReportTeardownSurrogate =
      with(model) {
        TestReportTeardownSurrogate().apply {
          id = this@with.id
          extension = this@with.extension
          modifierExtension = this@with.modifierExtension
          action = this@with.action
        }
      }
  }
}

@Serializable
internal data class TestReportSurrogate(
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
  public var identifier: Identifier? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var testScript: Reference? = null,
  public var result: KotlinString? = null,
  public var _result: Element? = null,
  public var score: Double? = null,
  public var _score: Element? = null,
  public var tester: KotlinString? = null,
  public var _tester: Element? = null,
  public var issued: KotlinString? = null,
  public var _issued: Element? = null,
  public var participant: List<TestReport.Participant>? = null,
  public var setup: TestReport.Setup? = null,
  public var test: List<TestReport.Test>? = null,
  public var teardown: TestReport.Teardown? = null,
) {
  public fun toModel(): TestReport =
    TestReport().apply {
      id = this@TestReportSurrogate.id
      meta = this@TestReportSurrogate.meta
      implicitRules =
        Uri.of(this@TestReportSurrogate.implicitRules, this@TestReportSurrogate._implicitRules)
      language = Code.of(this@TestReportSurrogate.language, this@TestReportSurrogate._language)
      text = this@TestReportSurrogate.text
      contained = this@TestReportSurrogate.contained
      extension = this@TestReportSurrogate.extension
      modifierExtension = this@TestReportSurrogate.modifierExtension
      identifier = this@TestReportSurrogate.identifier
      name = R4bString.of(this@TestReportSurrogate.name, this@TestReportSurrogate._name)
      status =
        Enumeration.of(
          this@TestReportSurrogate.status?.let {
            com.google.fhir.model.r4b.TestReport.TestReportStatus.fromCode(it)
          },
          this@TestReportSurrogate._status,
        )
      testScript = this@TestReportSurrogate.testScript
      result =
        Enumeration.of(
          this@TestReportSurrogate.result?.let {
            com.google.fhir.model.r4b.TestReport.TestReportResult.fromCode(it)
          },
          this@TestReportSurrogate._result,
        )
      score = Decimal.of(this@TestReportSurrogate.score, this@TestReportSurrogate._score)
      tester = R4bString.of(this@TestReportSurrogate.tester, this@TestReportSurrogate._tester)
      issued =
        DateTime.of(
          FhirDateTime.fromString(this@TestReportSurrogate.issued),
          this@TestReportSurrogate._issued,
        )
      participant = this@TestReportSurrogate.participant
      setup = this@TestReportSurrogate.setup
      test = this@TestReportSurrogate.test
      teardown = this@TestReportSurrogate.teardown
    }

  public companion object {
    public fun fromModel(model: TestReport): TestReportSurrogate =
      with(model) {
        TestReportSurrogate().apply {
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
          identifier = this@with.identifier
          name = this@with.name?.value
          _name = this@with.name?.toElement()
          status = this@with.status?.value?.getCode()
          _status = this@with.status?.toElement()
          testScript = this@with.testScript
          result = this@with.result?.value?.getCode()
          _result = this@with.result?.toElement()
          score = this@with.score?.value
          _score = this@with.score?.toElement()
          tester = this@with.tester?.value
          _tester = this@with.tester?.toElement()
          issued = this@with.issued?.value?.toString()
          _issued = this@with.issued?.toElement()
          participant = this@with.participant
          setup = this@with.setup
          test = this@with.test
          teardown = this@with.teardown
        }
      }
  }
}
