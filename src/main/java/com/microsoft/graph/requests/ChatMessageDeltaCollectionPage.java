// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.DeltaCollectionPage;
import com.microsoft.graph.requests.ChatMessageDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.ChatMessageDeltaCollectionPage;
import com.microsoft.graph.requests.ChatMessageDeltaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message Delta Collection Page.
 */
public class ChatMessageDeltaCollectionPage extends DeltaCollectionPage<ChatMessage, ChatMessageDeltaCollectionRequestBuilder> {

    /**
     * A collection page for ChatMessage.
     *
     * @param response The serialized ChatMessageDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ChatMessageDeltaCollectionPage(@Nonnull final ChatMessageDeltaCollectionResponse response, @Nonnull final ChatMessageDeltaCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ChatMessageDelta
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ChatMessageDeltaCollectionPage(@Nonnull final java.util.List<ChatMessage> pageContents, @Nullable final ChatMessageDeltaCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}