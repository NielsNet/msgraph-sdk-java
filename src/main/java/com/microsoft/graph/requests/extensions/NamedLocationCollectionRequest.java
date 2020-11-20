// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConditionalAccessRoot;
import com.microsoft.graph.models.extensions.NamedLocation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.NamedLocationCollectionResponse;
import com.microsoft.graph.requests.extensions.NamedLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NamedLocationCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Named Location Collection Request.
 */
public class NamedLocationCollectionRequest extends BaseCollectionRequest<NamedLocation, NamedLocationCollectionResponse, NamedLocationCollectionPage> {

    /**
     * The request builder for this collection of NamedLocation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NamedLocationCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, NamedLocationCollectionResponse.class, NamedLocationCollectionPage.class, NamedLocationCollectionRequestBuilder.class);
    }

    /**
     * Creates a new NamedLocation
     * @param newNamedLocation the NamedLocation to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final NamedLocation newNamedLocation, @Nonnull final ICallback<? super NamedLocation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new NamedLocationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newNamedLocation, callback);
    }

    /**
     * Creates a new NamedLocation
     * @param newNamedLocation the NamedLocation to create
     * @return the newly created object
     */
    @Nonnull
    public NamedLocation post(@Nonnull final NamedLocation newNamedLocation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new NamedLocationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newNamedLocation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public NamedLocationCollectionRequest expand(@Nonnull final String value) {
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
    public NamedLocationCollectionRequest filter(@Nonnull final String value) {
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
    public NamedLocationCollectionRequest orderBy(@Nonnull final String value) {
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
    public NamedLocationCollectionRequest select(@Nonnull final String value) {
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
    public NamedLocationCollectionRequest top(final int value) {
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
    public NamedLocationCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public NamedLocationCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}
