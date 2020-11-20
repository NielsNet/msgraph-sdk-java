// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Schedule;
import com.microsoft.graph.models.extensions.TimeOffReason;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.TimeOffReasonCollectionResponse;
import com.microsoft.graph.requests.extensions.TimeOffReasonCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffReasonCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Off Reason Collection Request.
 */
public class TimeOffReasonCollectionRequest extends BaseCollectionRequest<TimeOffReason, TimeOffReasonCollectionResponse, TimeOffReasonCollectionPage> {

    /**
     * The request builder for this collection of TimeOffReason
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TimeOffReasonCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TimeOffReasonCollectionResponse.class, TimeOffReasonCollectionPage.class, TimeOffReasonCollectionRequestBuilder.class);
    }

    /**
     * Creates a new TimeOffReason
     * @param newTimeOffReason the TimeOffReason to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final TimeOffReason newTimeOffReason, @Nonnull final ICallback<? super TimeOffReason> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TimeOffReasonRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTimeOffReason, callback);
    }

    /**
     * Creates a new TimeOffReason
     * @param newTimeOffReason the TimeOffReason to create
     * @return the newly created object
     */
    @Nonnull
    public TimeOffReason post(@Nonnull final TimeOffReason newTimeOffReason) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TimeOffReasonRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTimeOffReason);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public TimeOffReasonCollectionRequest expand(@Nonnull final String value) {
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
    public TimeOffReasonCollectionRequest filter(@Nonnull final String value) {
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
    public TimeOffReasonCollectionRequest orderBy(@Nonnull final String value) {
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
    public TimeOffReasonCollectionRequest select(@Nonnull final String value) {
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
    public TimeOffReasonCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public TimeOffReasonCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public TimeOffReasonCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
