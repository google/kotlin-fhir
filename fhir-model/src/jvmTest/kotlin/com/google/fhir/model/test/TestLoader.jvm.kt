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

package com.google.fhir.model.test

import java.io.File

actual fun loadR4Examples(fileNameFilter: (String) -> Boolean): Sequence<String> {
  return loadExamplesFromFileSystem(r4ExamplePackage, fileNameFilter)
}

actual fun loadR4BExamples(fileNameFilter: (String) -> Boolean): Sequence<String> {
  return loadExamplesFromFileSystem(r4bExamplePackage, fileNameFilter)
}

actual fun loadR5Examples(fileNameFilter: (String) -> Boolean): Sequence<String> {
  return loadExamplesFromFileSystem(r5ExamplePackage, fileNameFilter)
}

private fun loadExamplesFromFileSystem(
  directoryName: String,
  fileNameFilter: (String) -> Boolean,
): Sequence<String> {
  return File("${System.getProperty("projectRootDir")}/third_party/${directoryName}")
    .listFiles()!!
    .asSequence()
    .filter { fileNameFilter(it.name) }
    .map { it.readText() }
}
