// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.models.extensions.Permission;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.PermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantCollectionResponse;
import com.microsoft.graph.models.extensions.Permission;
import com.microsoft.graph.models.extensions.PermissionGrantBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Collection Request.
 */
public class PermissionGrantCollectionRequest extends BaseCollectionRequest<Permission, PermissionGrantCollectionResponse, PermissionGrantCollectionPage> {


    /** The body for the method */
    protected final PermissionGrantBody body;


    /**
     * The request for this PermissionGrant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PermissionGrantCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PermissionGrantCollectionResponse.class, PermissionGrantCollectionPage.class, PermissionGrantCollectionRequestBuilder.class);
        body = new PermissionGrantBody();
    }


    /**
     * Invokes the method and calls the callback with the resulting collection of objects
     * @param callback a callback to be invoked with the resulting collection of objects
     */
    public void post(@Nonnull final ICallback<? super PermissionGrantCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    /**
     * Invokes the method and returns the resulting collection of objects
     * @return a collection of objects returned by the method
     */
    @Nullable
    public PermissionGrantCollectionPage post() throws ClientException {
        final PermissionGrantCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public PermissionGrantCollectionRequest select(@Nonnull final String value) {
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
    public PermissionGrantCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public PermissionGrantCollectionRequest expand(@Nonnull final String value) {
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
    public PermissionGrantCollectionRequest filter(@Nonnull final String value) {
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
    public PermissionGrantCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

}
