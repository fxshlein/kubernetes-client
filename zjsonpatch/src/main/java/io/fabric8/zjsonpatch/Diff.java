/*
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.zjsonpatch;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * This class is ported from <a href=
 * "https://github.com/flipkart-incubator/zjsonpatch/blob/a446bf598231c06006d4e3df69b846cdb16d8889/src/main/java/com/flipkart/zjsonpatch/Diff.java">FlipKart
 * zjsonpatch repository</a>
 */
class Diff {
  private final Operation operation;
  private final JsonPointer path;
  private final JsonNode value;
  private JsonPointer toPath; //only to be used in move operation
  private final JsonNode srcValue; // only used in replace operation

  Diff(Operation operation, JsonPointer path, JsonNode value) {
    this.operation = operation;
    this.path = path;
    this.value = value;
    this.srcValue = null;
  }

  Diff(Operation operation, JsonPointer fromPath, JsonPointer toPath) {
    this.operation = operation;
    this.path = fromPath;
    this.toPath = toPath;
    this.value = null;
    this.srcValue = null;
  }

  Diff(Operation operation, JsonPointer path, JsonNode srcValue, JsonNode value) {
    this.operation = operation;
    this.path = path;
    this.value = value;
    this.srcValue = srcValue;
  }

  public Operation getOperation() {
    return operation;
  }

  public JsonPointer getPath() {
    return path;
  }

  public JsonNode getValue() {
    return value;
  }

  public static Diff generateDiff(Operation replace, JsonPointer path, JsonNode target) {
    return new Diff(replace, path, target);
  }

  public static Diff generateDiff(Operation replace, JsonPointer path, JsonNode source, JsonNode target) {
    return new Diff(replace, path, source, target);
  }

  JsonPointer getToPath() {
    return toPath;
  }

  public JsonNode getSrcValue() {
    return srcValue;
  }
}
