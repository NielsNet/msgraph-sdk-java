// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ChannelRemoveEmailRequest;
import com.microsoft.graph.models.Channel;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel Remove Email Request Builder.
 */
public class ChannelRemoveEmailRequestBuilder extends BaseActionRequestBuilder<Channel> {

    /**
     * The request builder for this ChannelRemoveEmail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChannelRemoveEmailRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ChannelRemoveEmailRequest
     *
     * @param requestOptions the options for the request
     * @return the ChannelRemoveEmailRequest instance
     */
    @Nonnull
    public ChannelRemoveEmailRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ChannelRemoveEmailRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ChannelRemoveEmailRequest instance
     */
    @Nonnull
    public ChannelRemoveEmailRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ChannelRemoveEmailRequest request = new ChannelRemoveEmailRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}