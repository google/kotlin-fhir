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

package com.google.fhir.model.r4.surrogates

import com.google.fhir.model.r4.Code
import com.google.fhir.model.r4.DateTime
import com.google.fhir.model.r4.Decimal
import com.google.fhir.model.r4.Element
import com.google.fhir.model.r4.Enumeration
import com.google.fhir.model.r4.Extension
import com.google.fhir.model.r4.FhirDateTime
import com.google.fhir.model.r4.Identifier
import com.google.fhir.model.r4.Markdown
import com.google.fhir.model.r4.Meta
import com.google.fhir.model.r4.Narrative
import com.google.fhir.model.r4.Reference
import com.google.fhir.model.r4.Resource
import com.google.fhir.model.r4.String as R4String
import com.google.fhir.model.r4.TestReport
import com.google.fhir.model.r4.Uri
import com.google.fhir.model.r4.serializers.DoubleSerializer
import com.google.fhir.model.r4.serializers.LocalTimeSerializer
import kotlin.Double
import kotlin.String as KotlinString
import kotlin.Suppress
import kotlin.collections.MutableList
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
internal data class TestReportParticipantSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var type: KotlinString? = null,
  public var _type: Element? = null,
  public var uri: KotlinString? = null,
  public var _uri: Element? = null,
  public var display: KotlinString? = null,
  public var _display: Element? = null,
) {
  public fun toModel(): TestReport.Participant =
    TestReport.Participant(
      id = this@TestReportParticipantSurrogate.id,
      extension = this@TestReportParticipantSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@TestReportParticipantSurrogate.modifierExtension ?: mutableListOf(),
      type =
        Enumeration.of(
          com.google.fhir.model.r4.TestReport.TestReportParticipantType.fromCode(
            this@TestReportParticipantSurrogate.type!!
          ),
          this@TestReportParticipantSurrogate._type,
        ),
      uri =
        Uri.of(this@TestReportParticipantSurrogate.uri, this@TestReportParticipantSurrogate._uri)!!,
      display =
        R4String.of(
          this@TestReportParticipantSurrogate.display,
          this@TestReportParticipantSurrogate._display,
        ),
    )

  public companion object {
    public fun fromModel(model: TestReport.Participant): TestReportParticipantSurrogate =
      with(model) {
        TestReportParticipantSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          type = this@with.type.value?.getCode(),
          _type = this@with.type.toElement(),
          uri = this@with.uri.value,
          _uri = this@with.uri.toElement(),
          display = this@with.display?.value,
          _display = this@with.display?.toElement(),
        )
      }
  }
}

@Serializable
internal data class TestReportSetupActionOperationSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var result: KotlinString? = null,
  public var _result: Element? = null,
  public var message: KotlinString? = null,
  public var _message: Element? = null,
  public var detail: KotlinString? = null,
  public var _detail: Element? = null,
) {
  public fun toModel(): TestReport.Setup.Action.Operation =
    TestReport.Setup.Action.Operation(
      id = this@TestReportSetupActionOperationSurrogate.id,
      extension = this@TestReportSetupActionOperationSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@TestReportSetupActionOperationSurrogate.modifierExtension ?: mutableListOf(),
      result =
        Enumeration.of(
          com.google.fhir.model.r4.TestReport.TestReportActionResult.fromCode(
            this@TestReportSetupActionOperationSurrogate.result!!
          ),
          this@TestReportSetupActionOperationSurrogate._result,
        ),
      message =
        Markdown.of(
          this@TestReportSetupActionOperationSurrogate.message,
          this@TestReportSetupActionOperationSurrogate._message,
        ),
      detail =
        Uri.of(
          this@TestReportSetupActionOperationSurrogate.detail,
          this@TestReportSetupActionOperationSurrogate._detail,
        ),
    )

  public companion object {
    public fun fromModel(
      model: TestReport.Setup.Action.Operation
    ): TestReportSetupActionOperationSurrogate =
      with(model) {
        TestReportSetupActionOperationSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          result = this@with.result.value?.getCode(),
          _result = this@with.result.toElement(),
          message = this@with.message?.value,
          _message = this@with.message?.toElement(),
          detail = this@with.detail?.value,
          _detail = this@with.detail?.toElement(),
        )
      }
  }
}

@Serializable
internal data class TestReportSetupActionAssertSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var result: KotlinString? = null,
  public var _result: Element? = null,
  public var message: KotlinString? = null,
  public var _message: Element? = null,
  public var detail: KotlinString? = null,
  public var _detail: Element? = null,
) {
  public fun toModel(): TestReport.Setup.Action.Assert =
    TestReport.Setup.Action.Assert(
      id = this@TestReportSetupActionAssertSurrogate.id,
      extension = this@TestReportSetupActionAssertSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@TestReportSetupActionAssertSurrogate.modifierExtension ?: mutableListOf(),
      result =
        Enumeration.of(
          com.google.fhir.model.r4.TestReport.TestReportActionResult.fromCode(
            this@TestReportSetupActionAssertSurrogate.result!!
          ),
          this@TestReportSetupActionAssertSurrogate._result,
        ),
      message =
        Markdown.of(
          this@TestReportSetupActionAssertSurrogate.message,
          this@TestReportSetupActionAssertSurrogate._message,
        ),
      detail =
        R4String.of(
          this@TestReportSetupActionAssertSurrogate.detail,
          this@TestReportSetupActionAssertSurrogate._detail,
        ),
    )

  public companion object {
    public fun fromModel(
      model: TestReport.Setup.Action.Assert
    ): TestReportSetupActionAssertSurrogate =
      with(model) {
        TestReportSetupActionAssertSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          result = this@with.result.value?.getCode(),
          _result = this@with.result.toElement(),
          message = this@with.message?.value,
          _message = this@with.message?.toElement(),
          detail = this@with.detail?.value,
          _detail = this@with.detail?.toElement(),
        )
      }
  }
}

@Serializable
internal data class TestReportSetupActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var operation: TestReport.Setup.Action.Operation? = null,
  public var assert: TestReport.Setup.Action.Assert? = null,
) {
  public fun toModel(): TestReport.Setup.Action =
    TestReport.Setup.Action(
      id = this@TestReportSetupActionSurrogate.id,
      extension = this@TestReportSetupActionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@TestReportSetupActionSurrogate.modifierExtension ?: mutableListOf(),
      operation = this@TestReportSetupActionSurrogate.operation,
      assert = this@TestReportSetupActionSurrogate.assert,
    )

  public companion object {
    public fun fromModel(model: TestReport.Setup.Action): TestReportSetupActionSurrogate =
      with(model) {
        TestReportSetupActionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          operation = this@with.operation,
          assert = this@with.assert,
        )
      }
  }
}

@Serializable
internal data class TestReportSetupSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var action: MutableList<TestReport.Setup.Action>? = null,
) {
  public fun toModel(): TestReport.Setup =
    TestReport.Setup(
      id = this@TestReportSetupSurrogate.id,
      extension = this@TestReportSetupSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@TestReportSetupSurrogate.modifierExtension ?: mutableListOf(),
      action = this@TestReportSetupSurrogate.action ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: TestReport.Setup): TestReportSetupSurrogate =
      with(model) {
        TestReportSetupSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          action = this@with.action.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class TestReportTestActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var operation: TestReport.Setup.Action.Operation? = null,
  public var assert: TestReport.Setup.Action.Assert? = null,
) {
  public fun toModel(): TestReport.Test.Action =
    TestReport.Test.Action(
      id = this@TestReportTestActionSurrogate.id,
      extension = this@TestReportTestActionSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@TestReportTestActionSurrogate.modifierExtension ?: mutableListOf(),
      operation = this@TestReportTestActionSurrogate.operation,
      assert = this@TestReportTestActionSurrogate.assert,
    )

  public companion object {
    public fun fromModel(model: TestReport.Test.Action): TestReportTestActionSurrogate =
      with(model) {
        TestReportTestActionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          operation = this@with.operation,
          assert = this@with.assert,
        )
      }
  }
}

@Serializable
internal data class TestReportTestSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var description: KotlinString? = null,
  public var _description: Element? = null,
  public var action: MutableList<TestReport.Test.Action>? = null,
) {
  public fun toModel(): TestReport.Test =
    TestReport.Test(
      id = this@TestReportTestSurrogate.id,
      extension = this@TestReportTestSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@TestReportTestSurrogate.modifierExtension ?: mutableListOf(),
      name = R4String.of(this@TestReportTestSurrogate.name, this@TestReportTestSurrogate._name),
      description =
        R4String.of(
          this@TestReportTestSurrogate.description,
          this@TestReportTestSurrogate._description,
        ),
      action = this@TestReportTestSurrogate.action ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: TestReport.Test): TestReportTestSurrogate =
      with(model) {
        TestReportTestSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          description = this@with.description?.value,
          _description = this@with.description?.toElement(),
          action = this@with.action.takeUnless { it.all { it == null } },
        )
      }
  }
}

@Serializable
internal data class TestReportTeardownActionSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var operation: TestReport.Setup.Action.Operation,
) {
  public fun toModel(): TestReport.Teardown.Action =
    TestReport.Teardown.Action(
      id = this@TestReportTeardownActionSurrogate.id,
      extension = this@TestReportTeardownActionSurrogate.extension ?: mutableListOf(),
      modifierExtension =
        this@TestReportTeardownActionSurrogate.modifierExtension ?: mutableListOf(),
      operation = this@TestReportTeardownActionSurrogate.operation,
    )

  public companion object {
    public fun fromModel(model: TestReport.Teardown.Action): TestReportTeardownActionSurrogate =
      with(model) {
        TestReportTeardownActionSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          operation = this@with.operation,
        )
      }
  }
}

@Serializable
internal data class TestReportTeardownSurrogate(
  public var id: KotlinString? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var action: MutableList<TestReport.Teardown.Action>? = null,
) {
  public fun toModel(): TestReport.Teardown =
    TestReport.Teardown(
      id = this@TestReportTeardownSurrogate.id,
      extension = this@TestReportTeardownSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@TestReportTeardownSurrogate.modifierExtension ?: mutableListOf(),
      action = this@TestReportTeardownSurrogate.action ?: mutableListOf(),
    )

  public companion object {
    public fun fromModel(model: TestReport.Teardown): TestReportTeardownSurrogate =
      with(model) {
        TestReportTeardownSurrogate(
          id = this@with.id,
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          action = this@with.action.takeUnless { it.all { it == null } },
        )
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
  public var contained: MutableList<Resource>? = null,
  public var extension: MutableList<Extension>? = null,
  public var modifierExtension: MutableList<Extension>? = null,
  public var identifier: Identifier? = null,
  public var name: KotlinString? = null,
  public var _name: Element? = null,
  public var status: KotlinString? = null,
  public var _status: Element? = null,
  public var testScript: Reference,
  public var result: KotlinString? = null,
  public var _result: Element? = null,
  public var score: Double? = null,
  public var _score: Element? = null,
  public var tester: KotlinString? = null,
  public var _tester: Element? = null,
  public var issued: KotlinString? = null,
  public var _issued: Element? = null,
  public var participant: MutableList<TestReport.Participant>? = null,
  public var setup: TestReport.Setup? = null,
  public var test: MutableList<TestReport.Test>? = null,
  public var teardown: TestReport.Teardown? = null,
) {
  public fun toModel(): TestReport =
    TestReport(
      id = this@TestReportSurrogate.id,
      meta = this@TestReportSurrogate.meta,
      implicitRules =
        Uri.of(this@TestReportSurrogate.implicitRules, this@TestReportSurrogate._implicitRules),
      language = Code.of(this@TestReportSurrogate.language, this@TestReportSurrogate._language),
      text = this@TestReportSurrogate.text,
      contained = this@TestReportSurrogate.contained ?: mutableListOf(),
      extension = this@TestReportSurrogate.extension ?: mutableListOf(),
      modifierExtension = this@TestReportSurrogate.modifierExtension ?: mutableListOf(),
      identifier = this@TestReportSurrogate.identifier,
      name = R4String.of(this@TestReportSurrogate.name, this@TestReportSurrogate._name),
      status =
        Enumeration.of(
          com.google.fhir.model.r4.TestReport.TestReportStatus.fromCode(
            this@TestReportSurrogate.status!!
          ),
          this@TestReportSurrogate._status,
        ),
      testScript = this@TestReportSurrogate.testScript,
      result =
        Enumeration.of(
          com.google.fhir.model.r4.TestReport.TestReportResult.fromCode(
            this@TestReportSurrogate.result!!
          ),
          this@TestReportSurrogate._result,
        ),
      score = Decimal.of(this@TestReportSurrogate.score, this@TestReportSurrogate._score),
      tester = R4String.of(this@TestReportSurrogate.tester, this@TestReportSurrogate._tester),
      issued =
        DateTime.of(
          FhirDateTime.fromString(this@TestReportSurrogate.issued),
          this@TestReportSurrogate._issued,
        ),
      participant = this@TestReportSurrogate.participant ?: mutableListOf(),
      setup = this@TestReportSurrogate.setup,
      test = this@TestReportSurrogate.test ?: mutableListOf(),
      teardown = this@TestReportSurrogate.teardown,
    )

  public companion object {
    public fun fromModel(model: TestReport): TestReportSurrogate =
      with(model) {
        TestReportSurrogate(
          id = this@with.id,
          meta = this@with.meta,
          implicitRules = this@with.implicitRules?.value,
          _implicitRules = this@with.implicitRules?.toElement(),
          language = this@with.language?.value,
          _language = this@with.language?.toElement(),
          text = this@with.text,
          contained = this@with.contained.takeUnless { it.all { it == null } },
          extension = this@with.extension.takeUnless { it.all { it == null } },
          modifierExtension = this@with.modifierExtension.takeUnless { it.all { it == null } },
          identifier = this@with.identifier,
          name = this@with.name?.value,
          _name = this@with.name?.toElement(),
          status = this@with.status.value?.getCode(),
          _status = this@with.status.toElement(),
          testScript = this@with.testScript,
          result = this@with.result.value?.getCode(),
          _result = this@with.result.toElement(),
          score = this@with.score?.value,
          _score = this@with.score?.toElement(),
          tester = this@with.tester?.value,
          _tester = this@with.tester?.toElement(),
          issued = this@with.issued?.value?.toString(),
          _issued = this@with.issued?.toElement(),
          participant = this@with.participant.takeUnless { it.all { it == null } },
          setup = this@with.setup,
          test = this@with.test.takeUnless { it.all { it == null } },
          teardown = this@with.teardown,
        )
      }
  }
}
