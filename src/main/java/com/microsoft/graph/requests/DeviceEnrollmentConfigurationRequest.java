// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceEnrollmentConfiguration;
import com.microsoft.graph.models.EnrollmentConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Configuration Request.
 */
public class DeviceEnrollmentConfigurationRequest extends BaseRequest<DeviceEnrollmentConfiguration> {
	
    /**
     * The request for the DeviceEnrollmentConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DeviceEnrollmentConfigurationRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends DeviceEnrollmentConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DeviceEnrollmentConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceEnrollmentConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceEnrollmentConfiguration.class);
    }

    /**
     * Gets the DeviceEnrollmentConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceEnrollmentConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceEnrollmentConfiguration from the service
     *
     * @return the DeviceEnrollmentConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceEnrollmentConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceEnrollmentConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceEnrollmentConfiguration with a source
     *
     * @param sourceDeviceEnrollmentConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceEnrollmentConfiguration> patchAsync(@Nonnull final DeviceEnrollmentConfiguration sourceDeviceEnrollmentConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceEnrollmentConfiguration);
    }

    /**
     * Patches this DeviceEnrollmentConfiguration with a source
     *
     * @param sourceDeviceEnrollmentConfiguration the source object with updates
     * @return the updated DeviceEnrollmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentConfiguration patch(@Nonnull final DeviceEnrollmentConfiguration sourceDeviceEnrollmentConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceEnrollmentConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentConfiguration with a new object
     *
     * @param newDeviceEnrollmentConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceEnrollmentConfiguration> postAsync(@Nonnull final DeviceEnrollmentConfiguration newDeviceEnrollmentConfiguration) {
        return sendAsync(HttpMethod.POST, newDeviceEnrollmentConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentConfiguration with a new object
     *
     * @param newDeviceEnrollmentConfiguration the new object to create
     * @return the created DeviceEnrollmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentConfiguration post(@Nonnull final DeviceEnrollmentConfiguration newDeviceEnrollmentConfiguration) throws ClientException {
        return send(HttpMethod.POST, newDeviceEnrollmentConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentConfiguration with a new object
     *
     * @param newDeviceEnrollmentConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceEnrollmentConfiguration> putAsync(@Nonnull final DeviceEnrollmentConfiguration newDeviceEnrollmentConfiguration) {
        return sendAsync(HttpMethod.PUT, newDeviceEnrollmentConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentConfiguration with a new object
     *
     * @param newDeviceEnrollmentConfiguration the object to create/update
     * @return the created DeviceEnrollmentConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentConfiguration put(@Nonnull final DeviceEnrollmentConfiguration newDeviceEnrollmentConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newDeviceEnrollmentConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceEnrollmentConfigurationRequest select(@Nonnull final String value) {
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
     public DeviceEnrollmentConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

