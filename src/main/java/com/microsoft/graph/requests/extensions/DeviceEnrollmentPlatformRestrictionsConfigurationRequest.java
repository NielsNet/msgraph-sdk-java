// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceEnrollmentPlatformRestrictionsConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Platform Restrictions Configuration Request.
 */
public class DeviceEnrollmentPlatformRestrictionsConfigurationRequest extends BaseRequest<DeviceEnrollmentPlatformRestrictionsConfiguration> {
	
    /**
     * The request for the DeviceEnrollmentPlatformRestrictionsConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceEnrollmentPlatformRestrictionsConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceEnrollmentPlatformRestrictionsConfiguration.class);
    }

    /**
     * Gets the DeviceEnrollmentPlatformRestrictionsConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DeviceEnrollmentPlatformRestrictionsConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceEnrollmentPlatformRestrictionsConfiguration from the service
     *
     * @return the DeviceEnrollmentPlatformRestrictionsConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentPlatformRestrictionsConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DeviceEnrollmentPlatformRestrictionsConfiguration> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceEnrollmentPlatformRestrictionsConfiguration with a source
     *
     * @param sourceDeviceEnrollmentPlatformRestrictionsConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DeviceEnrollmentPlatformRestrictionsConfiguration sourceDeviceEnrollmentPlatformRestrictionsConfiguration, @Nonnull final ICallback<? super DeviceEnrollmentPlatformRestrictionsConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceEnrollmentPlatformRestrictionsConfiguration);
    }

    /**
     * Patches this DeviceEnrollmentPlatformRestrictionsConfiguration with a source
     *
     * @param sourceDeviceEnrollmentPlatformRestrictionsConfiguration the source object with updates
     * @return the updated DeviceEnrollmentPlatformRestrictionsConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentPlatformRestrictionsConfiguration patch(@Nonnull final DeviceEnrollmentPlatformRestrictionsConfiguration sourceDeviceEnrollmentPlatformRestrictionsConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceEnrollmentPlatformRestrictionsConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentPlatformRestrictionsConfiguration with a new object
     *
     * @param newDeviceEnrollmentPlatformRestrictionsConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DeviceEnrollmentPlatformRestrictionsConfiguration newDeviceEnrollmentPlatformRestrictionsConfiguration, @Nonnull final ICallback<? super DeviceEnrollmentPlatformRestrictionsConfiguration> callback) {
        send(HttpMethod.POST, callback, newDeviceEnrollmentPlatformRestrictionsConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentPlatformRestrictionsConfiguration with a new object
     *
     * @param newDeviceEnrollmentPlatformRestrictionsConfiguration the new object to create
     * @return the created DeviceEnrollmentPlatformRestrictionsConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentPlatformRestrictionsConfiguration post(@Nonnull final DeviceEnrollmentPlatformRestrictionsConfiguration newDeviceEnrollmentPlatformRestrictionsConfiguration) throws ClientException {
        return send(HttpMethod.POST, newDeviceEnrollmentPlatformRestrictionsConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentPlatformRestrictionsConfiguration with a new object
     *
     * @param newDeviceEnrollmentPlatformRestrictionsConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DeviceEnrollmentPlatformRestrictionsConfiguration newDeviceEnrollmentPlatformRestrictionsConfiguration, @Nonnull final ICallback<? super DeviceEnrollmentPlatformRestrictionsConfiguration> callback) {
        send(HttpMethod.PUT, callback, newDeviceEnrollmentPlatformRestrictionsConfiguration);
    }

    /**
     * Creates a DeviceEnrollmentPlatformRestrictionsConfiguration with a new object
     *
     * @param newDeviceEnrollmentPlatformRestrictionsConfiguration the object to create/update
     * @return the created DeviceEnrollmentPlatformRestrictionsConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceEnrollmentPlatformRestrictionsConfiguration put(@Nonnull final DeviceEnrollmentPlatformRestrictionsConfiguration newDeviceEnrollmentPlatformRestrictionsConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newDeviceEnrollmentPlatformRestrictionsConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceEnrollmentPlatformRestrictionsConfigurationRequest select(@Nonnull final String value) {
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
     public DeviceEnrollmentPlatformRestrictionsConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

