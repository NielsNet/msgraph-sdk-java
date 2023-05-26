// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Synchronization;
import com.microsoft.graph.models.SynchronizationJob;
import com.microsoft.graph.models.SynchronizationJobApplicationParameters;
import com.microsoft.graph.models.StringKeyStringValuePair;
import com.microsoft.graph.models.SynchronizationJobRestartCriteria;
import com.microsoft.graph.models.SynchronizationSecretKeyStringValuePair;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.SynchronizationJobCollectionResponse;
import com.microsoft.graph.requests.SynchronizationJobCollectionRequestBuilder;
import com.microsoft.graph.requests.SynchronizationJobCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Job Collection Request.
 */
public class SynchronizationJobCollectionRequest extends BaseEntityCollectionRequest<SynchronizationJob, SynchronizationJobCollectionResponse, SynchronizationJobCollectionPage> {

    /**
     * The request builder for this collection of SynchronizationJob
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SynchronizationJobCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SynchronizationJobCollectionResponse.class, SynchronizationJobCollectionPage.class, SynchronizationJobCollectionRequestBuilder.class);
    }

    /**
     * Creates a new SynchronizationJob
     * @param newSynchronizationJob the SynchronizationJob to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<SynchronizationJob> postAsync(@Nonnull final SynchronizationJob newSynchronizationJob) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SynchronizationJobRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newSynchronizationJob);
    }

    /**
     * Creates a new SynchronizationJob
     * @param newSynchronizationJob the SynchronizationJob to create
     * @return the newly created object
     */
    @Nonnull
    public SynchronizationJob post(@Nonnull final SynchronizationJob newSynchronizationJob) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SynchronizationJobRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSynchronizationJob);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public SynchronizationJobCollectionRequest expand(@Nonnull final String value) {
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
    public SynchronizationJobCollectionRequest filter(@Nonnull final String value) {
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
    public SynchronizationJobCollectionRequest orderBy(@Nonnull final String value) {
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
    public SynchronizationJobCollectionRequest select(@Nonnull final String value) {
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
    public SynchronizationJobCollectionRequest top(final int value) {
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
    public SynchronizationJobCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public SynchronizationJobCollectionRequest count() {
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
    public SynchronizationJobCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public SynchronizationJobCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
