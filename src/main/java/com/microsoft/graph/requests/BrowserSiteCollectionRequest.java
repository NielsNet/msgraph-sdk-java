// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.BrowserSiteList;
import com.microsoft.graph.models.BrowserSite;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.BrowserSiteCollectionResponse;
import com.microsoft.graph.requests.BrowserSiteCollectionRequestBuilder;
import com.microsoft.graph.requests.BrowserSiteCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Browser Site Collection Request.
 */
public class BrowserSiteCollectionRequest extends BaseEntityCollectionRequest<BrowserSite, BrowserSiteCollectionResponse, BrowserSiteCollectionPage> {

    /**
     * The request builder for this collection of BrowserSite
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BrowserSiteCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BrowserSiteCollectionResponse.class, BrowserSiteCollectionPage.class, BrowserSiteCollectionRequestBuilder.class);
    }

    /**
     * Creates a new BrowserSite
     * @param newBrowserSite the BrowserSite to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<BrowserSite> postAsync(@Nonnull final BrowserSite newBrowserSite) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new BrowserSiteRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newBrowserSite);
    }

    /**
     * Creates a new BrowserSite
     * @param newBrowserSite the BrowserSite to create
     * @return the newly created object
     */
    @Nonnull
    public BrowserSite post(@Nonnull final BrowserSite newBrowserSite) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new BrowserSiteRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newBrowserSite);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public BrowserSiteCollectionRequest expand(@Nonnull final String value) {
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
    public BrowserSiteCollectionRequest filter(@Nonnull final String value) {
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
    public BrowserSiteCollectionRequest orderBy(@Nonnull final String value) {
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
    public BrowserSiteCollectionRequest select(@Nonnull final String value) {
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
    public BrowserSiteCollectionRequest top(final int value) {
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
    public BrowserSiteCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public BrowserSiteCollectionRequest count() {
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
    public BrowserSiteCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public BrowserSiteCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
