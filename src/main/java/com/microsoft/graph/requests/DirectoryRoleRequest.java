// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DirectoryRole;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.models.ExtensionProperty;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Role Request.
 */
public class DirectoryRoleRequest extends BaseRequest<DirectoryRole> {
	
    /**
     * The request for the DirectoryRole
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryRoleRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryRole.class);
    }

    /**
     * Gets the DirectoryRole from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryRole> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DirectoryRole from the service
     *
     * @return the DirectoryRole from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DirectoryRole get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryRole> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DirectoryRole delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DirectoryRole with a source
     *
     * @param sourceDirectoryRole the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryRole> patchAsync(@Nonnull final DirectoryRole sourceDirectoryRole) {
        return sendAsync(HttpMethod.PATCH, sourceDirectoryRole);
    }

    /**
     * Patches this DirectoryRole with a source
     *
     * @param sourceDirectoryRole the source object with updates
     * @return the updated DirectoryRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DirectoryRole patch(@Nonnull final DirectoryRole sourceDirectoryRole) throws ClientException {
        return send(HttpMethod.PATCH, sourceDirectoryRole);
    }

    /**
     * Creates a DirectoryRole with a new object
     *
     * @param newDirectoryRole the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryRole> postAsync(@Nonnull final DirectoryRole newDirectoryRole) {
        return sendAsync(HttpMethod.POST, newDirectoryRole);
    }

    /**
     * Creates a DirectoryRole with a new object
     *
     * @param newDirectoryRole the new object to create
     * @return the created DirectoryRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DirectoryRole post(@Nonnull final DirectoryRole newDirectoryRole) throws ClientException {
        return send(HttpMethod.POST, newDirectoryRole);
    }

    /**
     * Creates a DirectoryRole with a new object
     *
     * @param newDirectoryRole the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryRole> putAsync(@Nonnull final DirectoryRole newDirectoryRole) {
        return sendAsync(HttpMethod.PUT, newDirectoryRole);
    }

    /**
     * Creates a DirectoryRole with a new object
     *
     * @param newDirectoryRole the object to create/update
     * @return the created DirectoryRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DirectoryRole put(@Nonnull final DirectoryRole newDirectoryRole) throws ClientException {
        return send(HttpMethod.PUT, newDirectoryRole);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DirectoryRoleRequest select(@Nonnull final String value) {
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
     public DirectoryRoleRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
