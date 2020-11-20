// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConversationThread;
import com.microsoft.graph.models.extensions.Post;
import com.microsoft.graph.requests.extensions.PostCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PostRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Thread Request Builder.
 */
public class ConversationThreadRequestBuilder extends BaseRequestBuilder<ConversationThread> {

    /**
     * The request builder for the ConversationThread
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConversationThreadRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ConversationThreadRequest instance
     */
    @Nonnull
    public ConversationThreadRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ConversationThreadRequest instance
     */
    @Nonnull
    public ConversationThreadRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ConversationThreadRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the Post collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public PostCollectionRequestBuilder posts() {
        return new PostCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("posts"), getClient(), null);
    }

    /**
     * Gets a request builder for the Post item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public PostRequestBuilder posts(@Nonnull final String id) {
        return new PostRequestBuilder(getRequestUrlWithAdditionalSegment("posts") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param post the post
     */
    @Nonnull
    public ConversationThreadReplyRequestBuilder reply(@Nullable final Post post) {
        return new ConversationThreadReplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reply"), getClient(), null, post);
    }
}
