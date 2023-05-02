// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceCompliancePolicySettingStateSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Setting State Summary Request.
 */
public class DeviceCompliancePolicySettingStateSummaryRequest extends BaseRequest<DeviceCompliancePolicySettingStateSummary> {
	
    /**
     * The request for the DeviceCompliancePolicySettingStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicySettingStateSummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicySettingStateSummary.class);
    }

    /**
     * Gets the DeviceCompliancePolicySettingStateSummary from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicySettingStateSummary> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceCompliancePolicySettingStateSummary from the service
     *
     * @return the DeviceCompliancePolicySettingStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicySettingStateSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicySettingStateSummary> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceCompliancePolicySettingStateSummary delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceCompliancePolicySettingStateSummary with a source
     *
     * @param sourceDeviceCompliancePolicySettingStateSummary the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicySettingStateSummary> patchAsync(@Nonnull final DeviceCompliancePolicySettingStateSummary sourceDeviceCompliancePolicySettingStateSummary) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Patches this DeviceCompliancePolicySettingStateSummary with a source
     *
     * @param sourceDeviceCompliancePolicySettingStateSummary the source object with updates
     * @return the updated DeviceCompliancePolicySettingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicySettingStateSummary patch(@Nonnull final DeviceCompliancePolicySettingStateSummary sourceDeviceCompliancePolicySettingStateSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Creates a DeviceCompliancePolicySettingStateSummary with a new object
     *
     * @param newDeviceCompliancePolicySettingStateSummary the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicySettingStateSummary> postAsync(@Nonnull final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary) {
        return sendAsync(HttpMethod.POST, newDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Creates a DeviceCompliancePolicySettingStateSummary with a new object
     *
     * @param newDeviceCompliancePolicySettingStateSummary the new object to create
     * @return the created DeviceCompliancePolicySettingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicySettingStateSummary post(@Nonnull final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary) throws ClientException {
        return send(HttpMethod.POST, newDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Creates a DeviceCompliancePolicySettingStateSummary with a new object
     *
     * @param newDeviceCompliancePolicySettingStateSummary the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicySettingStateSummary> putAsync(@Nonnull final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary) {
        return sendAsync(HttpMethod.PUT, newDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Creates a DeviceCompliancePolicySettingStateSummary with a new object
     *
     * @param newDeviceCompliancePolicySettingStateSummary the object to create/update
     * @return the created DeviceCompliancePolicySettingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceCompliancePolicySettingStateSummary put(@Nonnull final DeviceCompliancePolicySettingStateSummary newDeviceCompliancePolicySettingStateSummary) throws ClientException {
        return send(HttpMethod.PUT, newDeviceCompliancePolicySettingStateSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceCompliancePolicySettingStateSummaryRequest select(@Nonnull final String value) {
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
     public DeviceCompliancePolicySettingStateSummaryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
