// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.requests.extensions.MessageCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.MessageCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Collection Page.
 */
public class MessageCollectionPage extends BaseCollectionPage<Message, MessageCollectionRequestBuilder> {

    /**
     * A collection page for Message
     *
     * @param response the serialized MessageCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MessageCollectionPage(@Nonnull final MessageCollectionResponse response, @Nonnull final MessageCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Message
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MessageCollectionPage(@Nonnull final java.util.List<Message> pageContents, @Nullable final MessageCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
