// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.EventTentativelyAcceptRequest;
import com.microsoft.graph.models.extensions.Event;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Tentatively Accept Request Builder.
 */
public class EventTentativelyAcceptRequestBuilder extends BaseActionRequestBuilder<Event> {

    /**
     * The request builder for this EventTentativelyAccept
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param comment the comment
     * @param sendResponse the sendResponse
     */
    public EventTentativelyAcceptRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final String comment, @Nullable final Boolean sendResponse) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("comment", comment);
        bodyParams.put("sendResponse", sendResponse);
    }

    /**
     * Creates the EventTentativelyAcceptRequest
     *
     * @param requestOptions the options for the request
     * @return the EventTentativelyAcceptRequest instance
     */
    @Nonnull
    public EventTentativelyAcceptRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the EventTentativelyAcceptRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the EventTentativelyAcceptRequest instance
     */
    @Nonnull
    public EventTentativelyAcceptRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        EventTentativelyAcceptRequest request = new EventTentativelyAcceptRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("comment")) {
            request.body.comment = getParameter("comment");
        }

        if (hasParameter("sendResponse")) {
            request.body.sendResponse = getParameter("sendResponse");
        }

        return request;
    }
}
