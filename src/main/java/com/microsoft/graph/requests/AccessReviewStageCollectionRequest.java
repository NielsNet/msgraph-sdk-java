// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessReviewInstance;
import com.microsoft.graph.models.AccessReviewStage;
import com.microsoft.graph.models.AccessReviewStageFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.AccessReviewStageCollectionResponse;
import com.microsoft.graph.requests.AccessReviewStageCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewStageCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Stage Collection Request.
 */
public class AccessReviewStageCollectionRequest extends BaseEntityCollectionRequest<AccessReviewStage, AccessReviewStageCollectionResponse, AccessReviewStageCollectionPage> {

    /**
     * The request builder for this collection of AccessReviewStage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewStageCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessReviewStageCollectionResponse.class, AccessReviewStageCollectionPage.class, AccessReviewStageCollectionRequestBuilder.class);
    }

    /**
     * Creates a new AccessReviewStage
     * @param newAccessReviewStage the AccessReviewStage to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessReviewStage> postAsync(@Nonnull final AccessReviewStage newAccessReviewStage) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AccessReviewStageRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newAccessReviewStage);
    }

    /**
     * Creates a new AccessReviewStage
     * @param newAccessReviewStage the AccessReviewStage to create
     * @return the newly created object
     */
    @Nonnull
    public AccessReviewStage post(@Nonnull final AccessReviewStage newAccessReviewStage) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AccessReviewStageRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAccessReviewStage);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public AccessReviewStageCollectionRequest expand(@Nonnull final String value) {
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
    public AccessReviewStageCollectionRequest filter(@Nonnull final String value) {
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
    public AccessReviewStageCollectionRequest orderBy(@Nonnull final String value) {
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
    public AccessReviewStageCollectionRequest select(@Nonnull final String value) {
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
    public AccessReviewStageCollectionRequest top(final int value) {
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
    public AccessReviewStageCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public AccessReviewStageCollectionRequest count() {
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
    public AccessReviewStageCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public AccessReviewStageCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
