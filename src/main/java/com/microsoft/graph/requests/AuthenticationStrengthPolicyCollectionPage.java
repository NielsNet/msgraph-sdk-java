// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AuthenticationStrengthPolicy;
import com.microsoft.graph.requests.AuthenticationStrengthPolicyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AuthenticationStrengthPolicyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Strength Policy Collection Page.
 */
public class AuthenticationStrengthPolicyCollectionPage extends BaseCollectionPage<AuthenticationStrengthPolicy, AuthenticationStrengthPolicyCollectionRequestBuilder> {

    /**
     * A collection page for AuthenticationStrengthPolicy
     *
     * @param response the serialized AuthenticationStrengthPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AuthenticationStrengthPolicyCollectionPage(@Nonnull final AuthenticationStrengthPolicyCollectionResponse response, @Nonnull final AuthenticationStrengthPolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AuthenticationStrengthPolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AuthenticationStrengthPolicyCollectionPage(@Nonnull final java.util.List<AuthenticationStrengthPolicy> pageContents, @Nullable final AuthenticationStrengthPolicyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}