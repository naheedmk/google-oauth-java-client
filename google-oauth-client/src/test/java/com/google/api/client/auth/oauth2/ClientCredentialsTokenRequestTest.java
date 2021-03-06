/*
 * Copyright (c) 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.api.client.auth.oauth2;

import com.google.api.client.auth.openidconnect.IdTokenResponse;
import junit.framework.TestCase;

/**
 * Tests {@link ClientCredentialsTokenRequest}.
 *
 * @author Yaniv Inbar
 */
public class ClientCredentialsTokenRequestTest extends TestCase {

  public void testConstructor() {
    check(
        new ClientCredentialsTokenRequest(
            TokenRequestTest.TRANSPORT,
            TokenRequestTest.JSON_FACTORY,
            TokenRequestTest.AUTHORIZATION_SERVER_URL));
  }

  private void check(ClientCredentialsTokenRequest request) {
    TokenRequestTest.check(request, "client_credentials");
  }

  public void testSetResponseClass() {
    ClientCredentialsTokenRequest request =
        new ClientCredentialsTokenRequest(
                TokenRequestTest.TRANSPORT,
                TokenRequestTest.JSON_FACTORY,
                TokenRequestTest.AUTHORIZATION_SERVER_URL)
            .setResponseClass(IdTokenResponse.class);
    assertEquals(IdTokenResponse.class, request.getResponseClass());
  }
}
