// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.RemoteDesktopSecurityConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Remote Desktop Security Configuration Request.
 */
public class RemoteDesktopSecurityConfigurationRequest extends BaseRequest<RemoteDesktopSecurityConfiguration> {
	
    /**
     * The request for the RemoteDesktopSecurityConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RemoteDesktopSecurityConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RemoteDesktopSecurityConfiguration.class);
    }

    /**
     * Gets the RemoteDesktopSecurityConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RemoteDesktopSecurityConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the RemoteDesktopSecurityConfiguration from the service
     *
     * @return the RemoteDesktopSecurityConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RemoteDesktopSecurityConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RemoteDesktopSecurityConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public RemoteDesktopSecurityConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this RemoteDesktopSecurityConfiguration with a source
     *
     * @param sourceRemoteDesktopSecurityConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RemoteDesktopSecurityConfiguration> patchAsync(@Nonnull final RemoteDesktopSecurityConfiguration sourceRemoteDesktopSecurityConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceRemoteDesktopSecurityConfiguration);
    }

    /**
     * Patches this RemoteDesktopSecurityConfiguration with a source
     *
     * @param sourceRemoteDesktopSecurityConfiguration the source object with updates
     * @return the updated RemoteDesktopSecurityConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RemoteDesktopSecurityConfiguration patch(@Nonnull final RemoteDesktopSecurityConfiguration sourceRemoteDesktopSecurityConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceRemoteDesktopSecurityConfiguration);
    }

    /**
     * Creates a RemoteDesktopSecurityConfiguration with a new object
     *
     * @param newRemoteDesktopSecurityConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RemoteDesktopSecurityConfiguration> postAsync(@Nonnull final RemoteDesktopSecurityConfiguration newRemoteDesktopSecurityConfiguration) {
        return sendAsync(HttpMethod.POST, newRemoteDesktopSecurityConfiguration);
    }

    /**
     * Creates a RemoteDesktopSecurityConfiguration with a new object
     *
     * @param newRemoteDesktopSecurityConfiguration the new object to create
     * @return the created RemoteDesktopSecurityConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RemoteDesktopSecurityConfiguration post(@Nonnull final RemoteDesktopSecurityConfiguration newRemoteDesktopSecurityConfiguration) throws ClientException {
        return send(HttpMethod.POST, newRemoteDesktopSecurityConfiguration);
    }

    /**
     * Creates a RemoteDesktopSecurityConfiguration with a new object
     *
     * @param newRemoteDesktopSecurityConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RemoteDesktopSecurityConfiguration> putAsync(@Nonnull final RemoteDesktopSecurityConfiguration newRemoteDesktopSecurityConfiguration) {
        return sendAsync(HttpMethod.PUT, newRemoteDesktopSecurityConfiguration);
    }

    /**
     * Creates a RemoteDesktopSecurityConfiguration with a new object
     *
     * @param newRemoteDesktopSecurityConfiguration the object to create/update
     * @return the created RemoteDesktopSecurityConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RemoteDesktopSecurityConfiguration put(@Nonnull final RemoteDesktopSecurityConfiguration newRemoteDesktopSecurityConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newRemoteDesktopSecurityConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public RemoteDesktopSecurityConfigurationRequest select(@Nonnull final String value) {
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
     public RemoteDesktopSecurityConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

