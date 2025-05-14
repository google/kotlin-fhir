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

actual fun forEachR4Example(fileNameFilter: (String) -> Boolean, block: (String) -> Unit) {
  InstrumentationRegistry.getInstrumentation()
    .context
    .assets
    .list(r4ExamplePackage)!!
    .filter { fileNameFilter(it) }
    .forEach { fileName ->
      assetManager.open("${r4ExamplePackage}${fileName}").use { it ->
        val content = BufferedReader(InputStreamReader(it)).use { it.readText() }
        block(content)
      }
    }
}

actual fun forEachR4BExample(fileNameFilter: (String) -> Boolean, block: (String) -> Unit) {
  InstrumentationRegistry.getInstrumentation()
    .context
    .assets
    .list(r4bExamplePackage)!!
    .filter { fileNameFilter(it) }
    .forEach { fileName ->
      assetManager.open("$r4bExamplePackage${fileName}").use { it ->
        val content = BufferedReader(InputStreamReader(it)).use { it.readText() }
        block(content)
      }
    }
}

actual fun forEachR5Example(fileNameFilter: (String) -> Boolean, block: (String) -> Unit) {
  InstrumentationRegistry.getInstrumentation()
    .context
    .assets
    .list(r5ExamplePackage)!!
    .filter { fileNameFilter(it) }
    .forEach { fileName ->
      assetManager.open("$r5ExamplePackage${fileName}").use { it ->
        val content = BufferedReader(InputStreamReader(it)).use { it.readText() }
        block(content)
      }
    }
}
