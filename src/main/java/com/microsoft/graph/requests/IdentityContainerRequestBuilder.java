// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IdentityContainer;
import com.microsoft.graph.requests.ConditionalAccessRootRequestBuilder;
import com.microsoft.graph.requests.IdentityApiConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.IdentityApiConnectorRequestBuilder;
import com.microsoft.graph.requests.B2xIdentityUserFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.B2xIdentityUserFlowRequestBuilder;
import com.microsoft.graph.requests.IdentityProviderBaseCollectionRequestBuilder;
import com.microsoft.graph.requests.IdentityProviderBaseRequestBuilder;
import com.microsoft.graph.requests.IdentityUserFlowAttributeCollectionRequestBuilder;
import com.microsoft.graph.requests.IdentityUserFlowAttributeRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Container Request Builder.
 */
public class IdentityContainerRequestBuilder extends BaseRequestBuilder<IdentityContainer> {

    /**
     * The request builder for the IdentityContainer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityContainerRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IdentityContainerRequest instance
     */
    @Nonnull
    public IdentityContainerRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IdentityContainerRequest instance
     */
    @Nonnull
    public IdentityContainerRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.IdentityContainerRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for ConditionalAccessRoot
     *
     * @return the ConditionalAccessRootRequestBuilder instance
     */
    @Nonnull
    public ConditionalAccessRootRequestBuilder conditionalAccess() {
        return new ConditionalAccessRootRequestBuilder(getRequestUrlWithAdditionalSegment("conditionalAccess"), getClient(), null);
    }
    /**
     *  Gets a request builder for the IdentityApiConnector collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public IdentityApiConnectorCollectionRequestBuilder apiConnectors() {
        return new IdentityApiConnectorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("apiConnectors"), getClient(), null);
    }

    /**
     * Gets a request builder for the IdentityApiConnector item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public IdentityApiConnectorRequestBuilder apiConnectors(@Nonnull final String id) {
        return new IdentityApiConnectorRequestBuilder(getRequestUrlWithAdditionalSegment("apiConnectors") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the B2xIdentityUserFlow collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public B2xIdentityUserFlowCollectionRequestBuilder b2xUserFlows() {
        return new B2xIdentityUserFlowCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("b2xUserFlows"), getClient(), null);
    }

    /**
     * Gets a request builder for the B2xIdentityUserFlow item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public B2xIdentityUserFlowRequestBuilder b2xUserFlows(@Nonnull final String id) {
        return new B2xIdentityUserFlowRequestBuilder(getRequestUrlWithAdditionalSegment("b2xUserFlows") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the IdentityProviderBase collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public IdentityProviderBaseCollectionRequestBuilder identityProviders() {
        return new IdentityProviderBaseCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("identityProviders"), getClient(), null);
    }

    /**
     * Gets a request builder for the IdentityProviderBase item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public IdentityProviderBaseRequestBuilder identityProviders(@Nonnull final String id) {
        return new IdentityProviderBaseRequestBuilder(getRequestUrlWithAdditionalSegment("identityProviders") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the IdentityUserFlowAttribute collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public IdentityUserFlowAttributeCollectionRequestBuilder userFlowAttributes() {
        return new IdentityUserFlowAttributeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userFlowAttributes"), getClient(), null);
    }

    /**
     * Gets a request builder for the IdentityUserFlowAttribute item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public IdentityUserFlowAttributeRequestBuilder userFlowAttributes(@Nonnull final String id) {
        return new IdentityUserFlowAttributeRequestBuilder(getRequestUrlWithAdditionalSegment("userFlowAttributes") + "/" + id, getClient(), null);
    }
}