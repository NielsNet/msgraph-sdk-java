// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.HostReputation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Host Reputation Request.
 */
public class HostReputationRequest extends BaseRequest<HostReputation> {
	
    /**
     * The request for the HostReputation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public HostReputationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, HostReputation.class);
    }

    /**
     * Gets the HostReputation from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HostReputation> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the HostReputation from the service
     *
     * @return the HostReputation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public HostReputation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HostReputation> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public HostReputation delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this HostReputation with a source
     *
     * @param sourceHostReputation the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HostReputation> patchAsync(@Nonnull final HostReputation sourceHostReputation) {
        return sendAsync(HttpMethod.PATCH, sourceHostReputation);
    }

    /**
     * Patches this HostReputation with a source
     *
     * @param sourceHostReputation the source object with updates
     * @return the updated HostReputation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public HostReputation patch(@Nonnull final HostReputation sourceHostReputation) throws ClientException {
        return send(HttpMethod.PATCH, sourceHostReputation);
    }

    /**
     * Creates a HostReputation with a new object
     *
     * @param newHostReputation the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HostReputation> postAsync(@Nonnull final HostReputation newHostReputation) {
        return sendAsync(HttpMethod.POST, newHostReputation);
    }

    /**
     * Creates a HostReputation with a new object
     *
     * @param newHostReputation the new object to create
     * @return the created HostReputation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public HostReputation post(@Nonnull final HostReputation newHostReputation) throws ClientException {
        return send(HttpMethod.POST, newHostReputation);
    }

    /**
     * Creates a HostReputation with a new object
     *
     * @param newHostReputation the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<HostReputation> putAsync(@Nonnull final HostReputation newHostReputation) {
        return sendAsync(HttpMethod.PUT, newHostReputation);
    }

    /**
     * Creates a HostReputation with a new object
     *
     * @param newHostReputation the object to create/update
     * @return the created HostReputation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public HostReputation put(@Nonnull final HostReputation newHostReputation) throws ClientException {
        return send(HttpMethod.PUT, newHostReputation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public HostReputationRequest select(@Nonnull final String value) {
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
     public HostReputationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
