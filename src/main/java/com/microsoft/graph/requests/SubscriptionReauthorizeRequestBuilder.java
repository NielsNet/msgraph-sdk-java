// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.SubscriptionReauthorizeRequest;
import com.microsoft.graph.models.Subscription;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subscription Reauthorize Request Builder.
 */
public class SubscriptionReauthorizeRequestBuilder extends BaseActionRequestBuilder<Subscription> {

    /**
     * The request builder for this SubscriptionReauthorize
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SubscriptionReauthorizeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the SubscriptionReauthorizeRequest
     *
     * @param requestOptions the options for the request
     * @return the SubscriptionReauthorizeRequest instance
     */
    @Nonnull
    public SubscriptionReauthorizeRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the SubscriptionReauthorizeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the SubscriptionReauthorizeRequest instance
     */
    @Nonnull
    public SubscriptionReauthorizeRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final SubscriptionReauthorizeRequest request = new SubscriptionReauthorizeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}