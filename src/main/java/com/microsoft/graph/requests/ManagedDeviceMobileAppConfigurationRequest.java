// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfiguration;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration Request.
 */
public class ManagedDeviceMobileAppConfigurationRequest extends BaseRequest<ManagedDeviceMobileAppConfiguration> {
	
    /**
     * The request for the ManagedDeviceMobileAppConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ManagedDeviceMobileAppConfigurationRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends ManagedDeviceMobileAppConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ManagedDeviceMobileAppConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceMobileAppConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceMobileAppConfiguration.class);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfiguration from the service
     *
     * @return the ManagedDeviceMobileAppConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ManagedDeviceMobileAppConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedDeviceMobileAppConfiguration with a source
     *
     * @param sourceManagedDeviceMobileAppConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfiguration> patchAsync(@Nonnull final ManagedDeviceMobileAppConfiguration sourceManagedDeviceMobileAppConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceManagedDeviceMobileAppConfiguration);
    }

    /**
     * Patches this ManagedDeviceMobileAppConfiguration with a source
     *
     * @param sourceManagedDeviceMobileAppConfiguration the source object with updates
     * @return the updated ManagedDeviceMobileAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfiguration patch(@Nonnull final ManagedDeviceMobileAppConfiguration sourceManagedDeviceMobileAppConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedDeviceMobileAppConfiguration);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfiguration with a new object
     *
     * @param newManagedDeviceMobileAppConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfiguration> postAsync(@Nonnull final ManagedDeviceMobileAppConfiguration newManagedDeviceMobileAppConfiguration) {
        return sendAsync(HttpMethod.POST, newManagedDeviceMobileAppConfiguration);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfiguration with a new object
     *
     * @param newManagedDeviceMobileAppConfiguration the new object to create
     * @return the created ManagedDeviceMobileAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfiguration post(@Nonnull final ManagedDeviceMobileAppConfiguration newManagedDeviceMobileAppConfiguration) throws ClientException {
        return send(HttpMethod.POST, newManagedDeviceMobileAppConfiguration);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfiguration with a new object
     *
     * @param newManagedDeviceMobileAppConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfiguration> putAsync(@Nonnull final ManagedDeviceMobileAppConfiguration newManagedDeviceMobileAppConfiguration) {
        return sendAsync(HttpMethod.PUT, newManagedDeviceMobileAppConfiguration);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfiguration with a new object
     *
     * @param newManagedDeviceMobileAppConfiguration the object to create/update
     * @return the created ManagedDeviceMobileAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfiguration put(@Nonnull final ManagedDeviceMobileAppConfiguration newManagedDeviceMobileAppConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newManagedDeviceMobileAppConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedDeviceMobileAppConfigurationRequest select(@Nonnull final String value) {
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
     public ManagedDeviceMobileAppConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

