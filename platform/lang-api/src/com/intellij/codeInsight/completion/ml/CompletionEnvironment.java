// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.codeInsight.completion.ml;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.lookup.Lookup;
import com.intellij.openapi.util.UserDataHolder;
import org.jetbrains.annotations.NotNull;

/**
 * Stores information about current code completion session.
 */
public interface CompletionEnvironment extends UserDataHolder {
  @NotNull
  Lookup getLookup();

  @NotNull
  CompletionParameters getParameters();
}
