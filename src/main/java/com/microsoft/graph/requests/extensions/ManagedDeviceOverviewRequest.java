// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDeviceOverview;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Overview Request.
 */
public class ManagedDeviceOverviewRequest extends BaseRequest<ManagedDeviceOverview> {
	
    /**
     * The request for the ManagedDeviceOverview
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceOverviewRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceOverview.class);
    }

    /**
     * Gets the ManagedDeviceOverview from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ManagedDeviceOverview> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedDeviceOverview from the service
     *
     * @return the ManagedDeviceOverview from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceOverview get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ManagedDeviceOverview> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedDeviceOverview with a source
     *
     * @param sourceManagedDeviceOverview the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ManagedDeviceOverview sourceManagedDeviceOverview, @Nonnull final ICallback<? super ManagedDeviceOverview> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedDeviceOverview);
    }

    /**
     * Patches this ManagedDeviceOverview with a source
     *
     * @param sourceManagedDeviceOverview the source object with updates
     * @return the updated ManagedDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceOverview patch(@Nonnull final ManagedDeviceOverview sourceManagedDeviceOverview) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedDeviceOverview);
    }

    /**
     * Creates a ManagedDeviceOverview with a new object
     *
     * @param newManagedDeviceOverview the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ManagedDeviceOverview newManagedDeviceOverview, @Nonnull final ICallback<? super ManagedDeviceOverview> callback) {
        send(HttpMethod.POST, callback, newManagedDeviceOverview);
    }

    /**
     * Creates a ManagedDeviceOverview with a new object
     *
     * @param newManagedDeviceOverview the new object to create
     * @return the created ManagedDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceOverview post(@Nonnull final ManagedDeviceOverview newManagedDeviceOverview) throws ClientException {
        return send(HttpMethod.POST, newManagedDeviceOverview);
    }

    /**
     * Creates a ManagedDeviceOverview with a new object
     *
     * @param newManagedDeviceOverview the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ManagedDeviceOverview newManagedDeviceOverview, @Nonnull final ICallback<? super ManagedDeviceOverview> callback) {
        send(HttpMethod.PUT, callback, newManagedDeviceOverview);
    }

    /**
     * Creates a ManagedDeviceOverview with a new object
     *
     * @param newManagedDeviceOverview the object to create/update
     * @return the created ManagedDeviceOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceOverview put(@Nonnull final ManagedDeviceOverview newManagedDeviceOverview) throws ClientException {
        return send(HttpMethod.PUT, newManagedDeviceOverview);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedDeviceOverviewRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public ManagedDeviceOverviewRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

