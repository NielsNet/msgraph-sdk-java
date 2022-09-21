// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceAppManagement;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device App Management Request.
 */
public class DeviceAppManagementRequest extends BaseRequest<DeviceAppManagement> {
	
    /**
     * The request for the DeviceAppManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAppManagementRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAppManagement.class);
    }

    /**
     * Gets the DeviceAppManagement from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceAppManagement from the service
     *
     * @return the DeviceAppManagement from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAppManagement get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceAppManagement delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceAppManagement with a source
     *
     * @param sourceDeviceAppManagement the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> patchAsync(@Nonnull final DeviceAppManagement sourceDeviceAppManagement) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceAppManagement);
    }

    /**
     * Patches this DeviceAppManagement with a source
     *
     * @param sourceDeviceAppManagement the source object with updates
     * @return the updated DeviceAppManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAppManagement patch(@Nonnull final DeviceAppManagement sourceDeviceAppManagement) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceAppManagement);
    }

    /**
     * Creates a DeviceAppManagement with a new object
     *
     * @param newDeviceAppManagement the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> postAsync(@Nonnull final DeviceAppManagement newDeviceAppManagement) {
        return sendAsync(HttpMethod.POST, newDeviceAppManagement);
    }

    /**
     * Creates a DeviceAppManagement with a new object
     *
     * @param newDeviceAppManagement the new object to create
     * @return the created DeviceAppManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAppManagement post(@Nonnull final DeviceAppManagement newDeviceAppManagement) throws ClientException {
        return send(HttpMethod.POST, newDeviceAppManagement);
    }

    /**
     * Creates a DeviceAppManagement with a new object
     *
     * @param newDeviceAppManagement the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceAppManagement> putAsync(@Nonnull final DeviceAppManagement newDeviceAppManagement) {
        return sendAsync(HttpMethod.PUT, newDeviceAppManagement);
    }

    /**
     * Creates a DeviceAppManagement with a new object
     *
     * @param newDeviceAppManagement the object to create/update
     * @return the created DeviceAppManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceAppManagement put(@Nonnull final DeviceAppManagement newDeviceAppManagement) throws ClientException {
        return send(HttpMethod.PUT, newDeviceAppManagement);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceAppManagementRequest select(@Nonnull final String value) {
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
     public DeviceAppManagementRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
