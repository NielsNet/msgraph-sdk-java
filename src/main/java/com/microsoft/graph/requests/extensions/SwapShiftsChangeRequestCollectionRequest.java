// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Schedule;
import com.microsoft.graph.models.extensions.SwapShiftsChangeRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestCollectionResponse;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Swap Shifts Change Request Collection Request.
 */
public class SwapShiftsChangeRequestCollectionRequest extends BaseCollectionRequest<SwapShiftsChangeRequest, SwapShiftsChangeRequestCollectionResponse, SwapShiftsChangeRequestCollectionPage> {

    /**
     * The request builder for this collection of SwapShiftsChangeRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SwapShiftsChangeRequestCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SwapShiftsChangeRequestCollectionResponse.class, SwapShiftsChangeRequestCollectionPage.class, SwapShiftsChangeRequestCollectionRequestBuilder.class);
    }

    /**
     * Creates a new SwapShiftsChangeRequest
     * @param newSwapShiftsChangeRequest the SwapShiftsChangeRequest to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final SwapShiftsChangeRequest newSwapShiftsChangeRequest, @Nonnull final ICallback<? super SwapShiftsChangeRequest> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SwapShiftsChangeRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSwapShiftsChangeRequest, callback);
    }

    /**
     * Creates a new SwapShiftsChangeRequest
     * @param newSwapShiftsChangeRequest the SwapShiftsChangeRequest to create
     * @return the newly created object
     */
    @Nonnull
    public SwapShiftsChangeRequest post(@Nonnull final SwapShiftsChangeRequest newSwapShiftsChangeRequest) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SwapShiftsChangeRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSwapShiftsChangeRequest);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public SwapShiftsChangeRequestCollectionRequest expand(@Nonnull final String value) {
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
    public SwapShiftsChangeRequestCollectionRequest filter(@Nonnull final String value) {
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
    public SwapShiftsChangeRequestCollectionRequest orderBy(@Nonnull final String value) {
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
    public SwapShiftsChangeRequestCollectionRequest select(@Nonnull final String value) {
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
    public SwapShiftsChangeRequestCollectionRequest top(final int value) {
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
    public SwapShiftsChangeRequestCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public SwapShiftsChangeRequestCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
