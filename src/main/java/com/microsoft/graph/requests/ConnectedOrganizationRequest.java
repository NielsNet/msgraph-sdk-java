// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ConnectedOrganization;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Connected Organization Request.
 */
public class ConnectedOrganizationRequest extends BaseRequest<ConnectedOrganization> {
	
    /**
     * The request for the ConnectedOrganization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConnectedOrganizationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConnectedOrganization.class);
    }

    /**
     * Gets the ConnectedOrganization from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConnectedOrganization> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ConnectedOrganization from the service
     *
     * @return the ConnectedOrganization from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConnectedOrganization get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConnectedOrganization> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ConnectedOrganization delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ConnectedOrganization with a source
     *
     * @param sourceConnectedOrganization the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConnectedOrganization> patchAsync(@Nonnull final ConnectedOrganization sourceConnectedOrganization) {
        return sendAsync(HttpMethod.PATCH, sourceConnectedOrganization);
    }

    /**
     * Patches this ConnectedOrganization with a source
     *
     * @param sourceConnectedOrganization the source object with updates
     * @return the updated ConnectedOrganization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConnectedOrganization patch(@Nonnull final ConnectedOrganization sourceConnectedOrganization) throws ClientException {
        return send(HttpMethod.PATCH, sourceConnectedOrganization);
    }

    /**
     * Creates a ConnectedOrganization with a new object
     *
     * @param newConnectedOrganization the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConnectedOrganization> postAsync(@Nonnull final ConnectedOrganization newConnectedOrganization) {
        return sendAsync(HttpMethod.POST, newConnectedOrganization);
    }

    /**
     * Creates a ConnectedOrganization with a new object
     *
     * @param newConnectedOrganization the new object to create
     * @return the created ConnectedOrganization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConnectedOrganization post(@Nonnull final ConnectedOrganization newConnectedOrganization) throws ClientException {
        return send(HttpMethod.POST, newConnectedOrganization);
    }

    /**
     * Creates a ConnectedOrganization with a new object
     *
     * @param newConnectedOrganization the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ConnectedOrganization> putAsync(@Nonnull final ConnectedOrganization newConnectedOrganization) {
        return sendAsync(HttpMethod.PUT, newConnectedOrganization);
    }

    /**
     * Creates a ConnectedOrganization with a new object
     *
     * @param newConnectedOrganization the object to create/update
     * @return the created ConnectedOrganization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ConnectedOrganization put(@Nonnull final ConnectedOrganization newConnectedOrganization) throws ClientException {
        return send(HttpMethod.PUT, newConnectedOrganization);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ConnectedOrganizationRequest select(@Nonnull final String value) {
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
     public ConnectedOrganizationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

