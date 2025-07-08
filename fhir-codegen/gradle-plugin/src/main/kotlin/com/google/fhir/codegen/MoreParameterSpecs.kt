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

package com.google.fhir.codegen

import com.google.fhir.codegen.schema.Element
import com.squareup.kotlinpoet.ParameterSpec

fun ParameterSpec.Builder.setDefaultValue(element: Element) = apply {
  if (element.id == "xhtml.extension") {
    // This element overrides the cardinality of the extension element in the base class and has the
    // cardinality of 0..0.
    // TODO: Deprecate this element in the generated Xhtml class, possibly with @Deprecated
    // annotation.
    defaultValue("mutableListOf()")
  } else if (element.max == "*") {
    defaultValue("mutableListOf()")
  } else if (element.min == 0) {
    defaultValue("null")
  }
}
