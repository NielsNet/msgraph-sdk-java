// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.DirectoryDefinitionDiscoverRequest;
import com.microsoft.graph.models.DirectoryDefinition;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Definition Discover Request Builder.
 */
public class DirectoryDefinitionDiscoverRequestBuilder extends BaseActionRequestBuilder<DirectoryDefinition> {

    /**
     * The request builder for this DirectoryDefinitionDiscover
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryDefinitionDiscoverRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the DirectoryDefinitionDiscoverRequest
     *
     * @param requestOptions the options for the request
     * @return the DirectoryDefinitionDiscoverRequest instance
     */
    @Nonnull
    public DirectoryDefinitionDiscoverRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DirectoryDefinitionDiscoverRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DirectoryDefinitionDiscoverRequest instance
     */
    @Nonnull
    public DirectoryDefinitionDiscoverRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DirectoryDefinitionDiscoverRequest request = new DirectoryDefinitionDiscoverRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}