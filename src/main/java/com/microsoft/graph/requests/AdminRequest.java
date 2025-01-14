// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Admin;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Admin Request.
 */
public class AdminRequest extends BaseRequest<Admin> {
	
    /**
     * The request for the Admin
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AdminRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Admin.class);
    }

    /**
     * Gets the Admin from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Admin> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Admin from the service
     *
     * @return the Admin from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Admin get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Admin> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Admin delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Admin with a source
     *
     * @param sourceAdmin the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Admin> patchAsync(@Nonnull final Admin sourceAdmin) {
        return sendAsync(HttpMethod.PATCH, sourceAdmin);
    }

    /**
     * Patches this Admin with a source
     *
     * @param sourceAdmin the source object with updates
     * @return the updated Admin
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Admin patch(@Nonnull final Admin sourceAdmin) throws ClientException {
        return send(HttpMethod.PATCH, sourceAdmin);
    }

    /**
     * Creates a Admin with a new object
     *
     * @param newAdmin the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Admin> postAsync(@Nonnull final Admin newAdmin) {
        return sendAsync(HttpMethod.POST, newAdmin);
    }

    /**
     * Creates a Admin with a new object
     *
     * @param newAdmin the new object to create
     * @return the created Admin
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Admin post(@Nonnull final Admin newAdmin) throws ClientException {
        return send(HttpMethod.POST, newAdmin);
    }

    /**
     * Creates a Admin with a new object
     *
     * @param newAdmin the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Admin> putAsync(@Nonnull final Admin newAdmin) {
        return sendAsync(HttpMethod.PUT, newAdmin);
    }

    /**
     * Creates a Admin with a new object
     *
     * @param newAdmin the object to create/update
     * @return the created Admin
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Admin put(@Nonnull final Admin newAdmin) throws ClientException {
        return send(HttpMethod.PUT, newAdmin);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AdminRequest select(@Nonnull final String value) {
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
     public AdminRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

