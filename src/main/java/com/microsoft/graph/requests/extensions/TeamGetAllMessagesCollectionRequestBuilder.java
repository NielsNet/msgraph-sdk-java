// Template Source: Templates\Java\requests_extensions\BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.TeamGetAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamGetAllMessagesCollectionRequest;
import com.microsoft.graph.requests.extensions.TeamGetAllMessagesCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Get All Messages Collection Request Builder.
 */
public class TeamGetAllMessagesCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<ChatMessage, TeamGetAllMessagesCollectionRequestBuilder, TeamGetAllMessagesCollectionResponse, TeamGetAllMessagesCollectionPage, TeamGetAllMessagesCollectionRequest> {

    /**
     * The request builder for this collection of Team
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamGetAllMessagesCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamGetAllMessagesCollectionRequestBuilder.class, TeamGetAllMessagesCollectionRequest.class);
    }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the TeamGetAllMessagesCollectionRequest instance
     */
    @Override
    @Nonnull
    public TeamGetAllMessagesCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final TeamGetAllMessagesCollectionRequest request = super.buildRequest(requestOptions);

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
