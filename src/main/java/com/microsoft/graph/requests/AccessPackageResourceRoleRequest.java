// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackageResourceRole;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Role Request.
 */
public class AccessPackageResourceRoleRequest extends BaseRequest<AccessPackageResourceRole> {
	
    /**
     * The request for the AccessPackageResourceRole
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageResourceRoleRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageResourceRole.class);
    }

    /**
     * Gets the AccessPackageResourceRole from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageResourceRole> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AccessPackageResourceRole from the service
     *
     * @return the AccessPackageResourceRole from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageResourceRole get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageResourceRole> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AccessPackageResourceRole delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AccessPackageResourceRole with a source
     *
     * @param sourceAccessPackageResourceRole the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageResourceRole> patchAsync(@Nonnull final AccessPackageResourceRole sourceAccessPackageResourceRole) {
        return sendAsync(HttpMethod.PATCH, sourceAccessPackageResourceRole);
    }

    /**
     * Patches this AccessPackageResourceRole with a source
     *
     * @param sourceAccessPackageResourceRole the source object with updates
     * @return the updated AccessPackageResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageResourceRole patch(@Nonnull final AccessPackageResourceRole sourceAccessPackageResourceRole) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessPackageResourceRole);
    }

    /**
     * Creates a AccessPackageResourceRole with a new object
     *
     * @param newAccessPackageResourceRole the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageResourceRole> postAsync(@Nonnull final AccessPackageResourceRole newAccessPackageResourceRole) {
        return sendAsync(HttpMethod.POST, newAccessPackageResourceRole);
    }

    /**
     * Creates a AccessPackageResourceRole with a new object
     *
     * @param newAccessPackageResourceRole the new object to create
     * @return the created AccessPackageResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageResourceRole post(@Nonnull final AccessPackageResourceRole newAccessPackageResourceRole) throws ClientException {
        return send(HttpMethod.POST, newAccessPackageResourceRole);
    }

    /**
     * Creates a AccessPackageResourceRole with a new object
     *
     * @param newAccessPackageResourceRole the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AccessPackageResourceRole> putAsync(@Nonnull final AccessPackageResourceRole newAccessPackageResourceRole) {
        return sendAsync(HttpMethod.PUT, newAccessPackageResourceRole);
    }

    /**
     * Creates a AccessPackageResourceRole with a new object
     *
     * @param newAccessPackageResourceRole the object to create/update
     * @return the created AccessPackageResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AccessPackageResourceRole put(@Nonnull final AccessPackageResourceRole newAccessPackageResourceRole) throws ClientException {
        return send(HttpMethod.PUT, newAccessPackageResourceRole);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AccessPackageResourceRoleRequest select(@Nonnull final String value) {
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
     public AccessPackageResourceRoleRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
