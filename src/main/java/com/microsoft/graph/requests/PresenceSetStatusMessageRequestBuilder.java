// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.PresenceSetStatusMessageRequest;
import com.microsoft.graph.models.Presence;
import com.microsoft.graph.models.PresenceStatusMessage;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.PresenceSetStatusMessageParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Presence Set Status Message Request Builder.
 */
public class PresenceSetStatusMessageRequestBuilder extends BaseActionRequestBuilder<Presence> {

    /**
     * The request builder for this PresenceSetStatusMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PresenceSetStatusMessageRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private PresenceSetStatusMessageParameterSet body;
    /**
     * The request builder for this PresenceSetStatusMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public PresenceSetStatusMessageRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final PresenceSetStatusMessageParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the PresenceSetStatusMessageRequest
     *
     * @param requestOptions the options for the request
     * @return the PresenceSetStatusMessageRequest instance
     */
    @Nonnull
    public PresenceSetStatusMessageRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the PresenceSetStatusMessageRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the PresenceSetStatusMessageRequest instance
     */
    @Nonnull
    public PresenceSetStatusMessageRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final PresenceSetStatusMessageRequest request = new PresenceSetStatusMessageRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
