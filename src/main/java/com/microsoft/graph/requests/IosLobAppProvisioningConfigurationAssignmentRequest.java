// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IosLobAppProvisioningConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Lob App Provisioning Configuration Assignment Request.
 */
public class IosLobAppProvisioningConfigurationAssignmentRequest extends BaseRequest<IosLobAppProvisioningConfigurationAssignment> {
	
    /**
     * The request for the IosLobAppProvisioningConfigurationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosLobAppProvisioningConfigurationAssignmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosLobAppProvisioningConfigurationAssignment.class);
    }

    /**
     * Gets the IosLobAppProvisioningConfigurationAssignment from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosLobAppProvisioningConfigurationAssignment> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the IosLobAppProvisioningConfigurationAssignment from the service
     *
     * @return the IosLobAppProvisioningConfigurationAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosLobAppProvisioningConfigurationAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosLobAppProvisioningConfigurationAssignment> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IosLobAppProvisioningConfigurationAssignment delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IosLobAppProvisioningConfigurationAssignment with a source
     *
     * @param sourceIosLobAppProvisioningConfigurationAssignment the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosLobAppProvisioningConfigurationAssignment> patchAsync(@Nonnull final IosLobAppProvisioningConfigurationAssignment sourceIosLobAppProvisioningConfigurationAssignment) {
        return sendAsync(HttpMethod.PATCH, sourceIosLobAppProvisioningConfigurationAssignment);
    }

    /**
     * Patches this IosLobAppProvisioningConfigurationAssignment with a source
     *
     * @param sourceIosLobAppProvisioningConfigurationAssignment the source object with updates
     * @return the updated IosLobAppProvisioningConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosLobAppProvisioningConfigurationAssignment patch(@Nonnull final IosLobAppProvisioningConfigurationAssignment sourceIosLobAppProvisioningConfigurationAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosLobAppProvisioningConfigurationAssignment);
    }

    /**
     * Creates a IosLobAppProvisioningConfigurationAssignment with a new object
     *
     * @param newIosLobAppProvisioningConfigurationAssignment the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosLobAppProvisioningConfigurationAssignment> postAsync(@Nonnull final IosLobAppProvisioningConfigurationAssignment newIosLobAppProvisioningConfigurationAssignment) {
        return sendAsync(HttpMethod.POST, newIosLobAppProvisioningConfigurationAssignment);
    }

    /**
     * Creates a IosLobAppProvisioningConfigurationAssignment with a new object
     *
     * @param newIosLobAppProvisioningConfigurationAssignment the new object to create
     * @return the created IosLobAppProvisioningConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosLobAppProvisioningConfigurationAssignment post(@Nonnull final IosLobAppProvisioningConfigurationAssignment newIosLobAppProvisioningConfigurationAssignment) throws ClientException {
        return send(HttpMethod.POST, newIosLobAppProvisioningConfigurationAssignment);
    }

    /**
     * Creates a IosLobAppProvisioningConfigurationAssignment with a new object
     *
     * @param newIosLobAppProvisioningConfigurationAssignment the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosLobAppProvisioningConfigurationAssignment> putAsync(@Nonnull final IosLobAppProvisioningConfigurationAssignment newIosLobAppProvisioningConfigurationAssignment) {
        return sendAsync(HttpMethod.PUT, newIosLobAppProvisioningConfigurationAssignment);
    }

    /**
     * Creates a IosLobAppProvisioningConfigurationAssignment with a new object
     *
     * @param newIosLobAppProvisioningConfigurationAssignment the object to create/update
     * @return the created IosLobAppProvisioningConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosLobAppProvisioningConfigurationAssignment put(@Nonnull final IosLobAppProvisioningConfigurationAssignment newIosLobAppProvisioningConfigurationAssignment) throws ClientException {
        return send(HttpMethod.PUT, newIosLobAppProvisioningConfigurationAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IosLobAppProvisioningConfigurationAssignmentRequest select(@Nonnull final String value) {
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
     public IosLobAppProvisioningConfigurationAssignmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
