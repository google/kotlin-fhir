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

package com.google.fhir.model

import android.content.res.AssetManager
import androidx.test.platform.app.InstrumentationRegistry
import java.io.BufferedReader
import java.io.InputStreamReader

val assetManager: AssetManager = InstrumentationRegistry.getInstrumentation().context.assets

private fun loadExamplesFromAssets(
  examplePackage: String,
  fileNameFilter: (String) -> Boolean,
): Sequence<String> {
  return InstrumentationRegistry.getInstrumentation()
    .context
    .assets
    .list(examplePackage)!!
    .asSequence()
    .filter { fileNameFilter(it) }
    .map { fileName ->
      assetManager.open("$examplePackage${fileName}").use { it ->
        BufferedReader(InputStreamReader(it)).use { it.readText() }
      }
    }
}

actual fun loadR4Examples(fileNameFilter: (String) -> Boolean): Sequence<String> {
  return loadExamplesFromAssets(r4ExamplePackage, fileNameFilter)
}

actual fun loadR4BExamples(fileNameFilter: (String) -> Boolean): Sequence<String> {
  return loadExamplesFromAssets(r4bExamplePackage, fileNameFilter)
}

actual fun loadR5Examples(fileNameFilter: (String) -> Boolean): Sequence<String> {
  return loadExamplesFromAssets(r5ExamplePackage, fileNameFilter)
}
