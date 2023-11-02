// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DirectoryAudit;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Audit Request.
 */
public class DirectoryAuditRequest extends BaseRequest<DirectoryAudit> {
	
    /**
     * The request for the DirectoryAudit
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryAuditRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryAudit.class);
    }

    /**
     * Gets the DirectoryAudit from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryAudit> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DirectoryAudit from the service
     *
     * @return the DirectoryAudit from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DirectoryAudit get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryAudit> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DirectoryAudit delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DirectoryAudit with a source
     *
     * @param sourceDirectoryAudit the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryAudit> patchAsync(@Nonnull final DirectoryAudit sourceDirectoryAudit) {
        return sendAsync(HttpMethod.PATCH, sourceDirectoryAudit);
    }

    /**
     * Patches this DirectoryAudit with a source
     *
     * @param sourceDirectoryAudit the source object with updates
     * @return the updated DirectoryAudit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DirectoryAudit patch(@Nonnull final DirectoryAudit sourceDirectoryAudit) throws ClientException {
        return send(HttpMethod.PATCH, sourceDirectoryAudit);
    }

    /**
     * Creates a DirectoryAudit with a new object
     *
     * @param newDirectoryAudit the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryAudit> postAsync(@Nonnull final DirectoryAudit newDirectoryAudit) {
        return sendAsync(HttpMethod.POST, newDirectoryAudit);
    }

    /**
     * Creates a DirectoryAudit with a new object
     *
     * @param newDirectoryAudit the new object to create
     * @return the created DirectoryAudit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DirectoryAudit post(@Nonnull final DirectoryAudit newDirectoryAudit) throws ClientException {
        return send(HttpMethod.POST, newDirectoryAudit);
    }

    /**
     * Creates a DirectoryAudit with a new object
     *
     * @param newDirectoryAudit the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DirectoryAudit> putAsync(@Nonnull final DirectoryAudit newDirectoryAudit) {
        return sendAsync(HttpMethod.PUT, newDirectoryAudit);
    }

    /**
     * Creates a DirectoryAudit with a new object
     *
     * @param newDirectoryAudit the object to create/update
     * @return the created DirectoryAudit
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DirectoryAudit put(@Nonnull final DirectoryAudit newDirectoryAudit) throws ClientException {
        return send(HttpMethod.PUT, newDirectoryAudit);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DirectoryAuditRequest select(@Nonnull final String value) {
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
     public DirectoryAuditRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
