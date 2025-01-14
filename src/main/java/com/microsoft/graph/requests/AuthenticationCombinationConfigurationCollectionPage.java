// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AuthenticationCombinationConfiguration;
import com.microsoft.graph.requests.AuthenticationCombinationConfigurationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AuthenticationCombinationConfigurationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Combination Configuration Collection Page.
 */
public class AuthenticationCombinationConfigurationCollectionPage extends BaseCollectionPage<AuthenticationCombinationConfiguration, AuthenticationCombinationConfigurationCollectionRequestBuilder> {

    /**
     * A collection page for AuthenticationCombinationConfiguration
     *
     * @param response the serialized AuthenticationCombinationConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AuthenticationCombinationConfigurationCollectionPage(@Nonnull final AuthenticationCombinationConfigurationCollectionResponse response, @Nonnull final AuthenticationCombinationConfigurationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AuthenticationCombinationConfiguration
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AuthenticationCombinationConfigurationCollectionPage(@Nonnull final java.util.List<AuthenticationCombinationConfiguration> pageContents, @Nullable final AuthenticationCombinationConfigurationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
