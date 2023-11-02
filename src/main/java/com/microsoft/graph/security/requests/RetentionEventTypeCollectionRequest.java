// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.TriggerTypesRoot;
import com.microsoft.graph.security.models.RetentionEventType;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.security.requests.RetentionEventTypeCollectionResponse;
import com.microsoft.graph.security.requests.RetentionEventTypeCollectionRequestBuilder;
import com.microsoft.graph.security.requests.RetentionEventTypeCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Retention Event Type Collection Request.
 */
public class RetentionEventTypeCollectionRequest extends BaseEntityCollectionRequest<RetentionEventType, RetentionEventTypeCollectionResponse, RetentionEventTypeCollectionPage> {

    /**
     * The request builder for this collection of RetentionEventType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RetentionEventTypeCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RetentionEventTypeCollectionResponse.class, RetentionEventTypeCollectionPage.class, RetentionEventTypeCollectionRequestBuilder.class);
    }

    /**
     * Creates a new RetentionEventType
     * @param newRetentionEventType the RetentionEventType to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RetentionEventType> postAsync(@Nonnull final RetentionEventType newRetentionEventType) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new RetentionEventTypeRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newRetentionEventType);
    }

    /**
     * Creates a new RetentionEventType
     * @param newRetentionEventType the RetentionEventType to create
     * @return the newly created object
     */
    @Nonnull
    public RetentionEventType post(@Nonnull final RetentionEventType newRetentionEventType) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new RetentionEventTypeRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newRetentionEventType);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public RetentionEventTypeCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public RetentionEventTypeCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public RetentionEventTypeCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public RetentionEventTypeCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public RetentionEventTypeCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public RetentionEventTypeCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public RetentionEventTypeCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public RetentionEventTypeCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public RetentionEventTypeCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
