// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.HostPair;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Host Pair Request Builder.
 */
public class HostPairRequestBuilder extends BaseRequestBuilder<HostPair> {

    /**
     * The request builder for the HostPair
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public HostPairRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the HostPairRequest instance
     */
    @Nonnull
    public HostPairRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the HostPairRequest instance
     */
    @Nonnull
    public HostPairRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.security.requests.HostPairRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Host
     *
     * @return the HostWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.security.requests.HostWithReferenceRequestBuilder childHost() {
        return new com.microsoft.graph.security.requests.HostWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("childHost"), getClient(), null);
    }

    /**
     * Gets the request builder for Host
     *
     * @return the HostWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.security.requests.HostWithReferenceRequestBuilder parentHost() {
        return new com.microsoft.graph.security.requests.HostWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("parentHost"), getClient(), null);
    }
}