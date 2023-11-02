// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedEBook;
import com.microsoft.graph.models.UserInstallStateSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.UserInstallStateSummaryCollectionResponse;
import com.microsoft.graph.requests.UserInstallStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.UserInstallStateSummaryCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Install State Summary Collection Request.
 */
public class UserInstallStateSummaryCollectionRequest extends BaseEntityCollectionRequest<UserInstallStateSummary, UserInstallStateSummaryCollectionResponse, UserInstallStateSummaryCollectionPage> {

    /**
     * The request builder for this collection of UserInstallStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserInstallStateSummaryCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserInstallStateSummaryCollectionResponse.class, UserInstallStateSummaryCollectionPage.class, UserInstallStateSummaryCollectionRequestBuilder.class);
    }

    /**
     * Creates a new UserInstallStateSummary
     * @param newUserInstallStateSummary the UserInstallStateSummary to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserInstallStateSummary> postAsync(@Nonnull final UserInstallStateSummary newUserInstallStateSummary) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserInstallStateSummaryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newUserInstallStateSummary);
    }

    /**
     * Creates a new UserInstallStateSummary
     * @param newUserInstallStateSummary the UserInstallStateSummary to create
     * @return the newly created object
     */
    @Nonnull
    public UserInstallStateSummary post(@Nonnull final UserInstallStateSummary newUserInstallStateSummary) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserInstallStateSummaryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserInstallStateSummary);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public UserInstallStateSummaryCollectionRequest expand(@Nonnull final String value) {
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
    public UserInstallStateSummaryCollectionRequest filter(@Nonnull final String value) {
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
    public UserInstallStateSummaryCollectionRequest orderBy(@Nonnull final String value) {
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
    public UserInstallStateSummaryCollectionRequest select(@Nonnull final String value) {
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
    public UserInstallStateSummaryCollectionRequest top(final int value) {
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
    public UserInstallStateSummaryCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public UserInstallStateSummaryCollectionRequest count() {
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
    public UserInstallStateSummaryCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public UserInstallStateSummaryCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
