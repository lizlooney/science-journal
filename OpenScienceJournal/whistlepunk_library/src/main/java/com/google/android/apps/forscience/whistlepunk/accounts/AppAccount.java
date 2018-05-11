/*
 *  Copyright 2018 Google Inc. All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.google.android.apps.forscience.whistlepunk.accounts;

import java.io.File;

/** An interface which represents an account. */
public interface AppAccount {
  /**
   * Returns the name of this account, or empty string if the account is the non-signed in account.
   */
  String getAccountName();

  /** Returns the key of this account. The key should include a leading namespace. */
  String getAccountKey();

  /** Returns true if this account is a signed-in account. */
  boolean isSignedIn();

  /** Returns the root directory for this account. */
  File getFilesDir();

  /** Returns the file name of the database with the given name for this account. */
  String getDatabaseFileName(String name);

  /** Returns the preference key, combining the given prefKey with this account. */
  String getPreferenceKey(String prefKey);
}
