// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Domain;
import com.microsoft.graph.models.InternalDomainFederation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.InternalDomainFederationCollectionRequestBuilder;
import com.microsoft.graph.requests.InternalDomainFederationRequestBuilder;
import com.microsoft.graph.requests.InternalDomainFederationCollectionRequest;
import com.microsoft.graph.requests.IdentityProviderBaseAvailableProviderTypesCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Internal Domain Federation Collection Request Builder.
 */
public class InternalDomainFederationCollectionRequestBuilder extends BaseCollectionRequestBuilder<InternalDomainFederation, InternalDomainFederationRequestBuilder, InternalDomainFederationCollectionResponse, InternalDomainFederationCollectionPage, InternalDomainFederationCollectionRequest> {

    /**
     * The request builder for this collection of Domain
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InternalDomainFederationCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, InternalDomainFederationRequestBuilder.class, InternalDomainFederationCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public IdentityProviderBaseAvailableProviderTypesCollectionRequestBuilder availableProviderTypes() {
        return new IdentityProviderBaseAvailableProviderTypesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.availableProviderTypes"), getClient(), null);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}