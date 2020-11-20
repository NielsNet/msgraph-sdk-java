// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.MessageReplyRequest;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Reply Request Builder.
 */
public class MessageReplyRequestBuilder extends BaseActionRequestBuilder<Message> {

    /**
     * The request builder for this MessageReply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param message the message
     * @param comment the comment
     */
    public MessageReplyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final Message message, @Nullable final String comment) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("message", message);
        bodyParams.put("comment", comment);
    }

    /**
     * Creates the MessageReplyRequest
     *
     * @param requestOptions the options for the request
     * @return the MessageReplyRequest instance
     */
    @Nonnull
    public MessageReplyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the MessageReplyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the MessageReplyRequest instance
     */
    @Nonnull
    public MessageReplyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        MessageReplyRequest request = new MessageReplyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("message")) {
            request.body.message = getParameter("message");
        }

        if (hasParameter("comment")) {
            request.body.comment = getParameter("comment");
        }

        return request;
    }
}
