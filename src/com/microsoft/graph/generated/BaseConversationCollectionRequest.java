// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Conversation Collection Request.
 */
public class BaseConversationCollectionRequest extends BaseCollectionRequest<BaseConversationCollectionResponse, IConversationCollectionPage> implements IBaseConversationCollectionRequest {

    /**
     * The request builder for this collection of Conversation
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseConversationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseConversationCollectionResponse.class, IConversationCollectionPage.class);
    }

    public void get(final ICallback<IConversationCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IConversationCollectionPage get() throws ClientException {
        final BaseConversationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Conversation newConversation, final ICallback<Conversation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ConversationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newConversation, callback);
    }

    public Conversation post(final Conversation newConversation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ConversationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newConversation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IConversationCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ConversationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IConversationCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ConversationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IConversationCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ConversationCollectionRequest)this;
    }

    public IConversationCollectionPage buildFromResponse(final BaseConversationCollectionResponse response) {
        final IConversationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ConversationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ConversationCollectionPage page = new ConversationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
