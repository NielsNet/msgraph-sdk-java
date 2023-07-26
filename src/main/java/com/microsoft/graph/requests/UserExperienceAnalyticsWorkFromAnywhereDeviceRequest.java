// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UserExperienceAnalyticsWorkFromAnywhereDevice;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Work From Anywhere Device Request.
 */
public class UserExperienceAnalyticsWorkFromAnywhereDeviceRequest extends BaseRequest<UserExperienceAnalyticsWorkFromAnywhereDevice> {
	
    /**
     * The request for the UserExperienceAnalyticsWorkFromAnywhereDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsWorkFromAnywhereDeviceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsWorkFromAnywhereDevice.class);
    }

    /**
     * Gets the UserExperienceAnalyticsWorkFromAnywhereDevice from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsWorkFromAnywhereDevice> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UserExperienceAnalyticsWorkFromAnywhereDevice from the service
     *
     * @return the UserExperienceAnalyticsWorkFromAnywhereDevice from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsWorkFromAnywhereDevice get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsWorkFromAnywhereDevice> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UserExperienceAnalyticsWorkFromAnywhereDevice delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserExperienceAnalyticsWorkFromAnywhereDevice with a source
     *
     * @param sourceUserExperienceAnalyticsWorkFromAnywhereDevice the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsWorkFromAnywhereDevice> patchAsync(@Nonnull final UserExperienceAnalyticsWorkFromAnywhereDevice sourceUserExperienceAnalyticsWorkFromAnywhereDevice) {
        return sendAsync(HttpMethod.PATCH, sourceUserExperienceAnalyticsWorkFromAnywhereDevice);
    }

    /**
     * Patches this UserExperienceAnalyticsWorkFromAnywhereDevice with a source
     *
     * @param sourceUserExperienceAnalyticsWorkFromAnywhereDevice the source object with updates
     * @return the updated UserExperienceAnalyticsWorkFromAnywhereDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsWorkFromAnywhereDevice patch(@Nonnull final UserExperienceAnalyticsWorkFromAnywhereDevice sourceUserExperienceAnalyticsWorkFromAnywhereDevice) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsWorkFromAnywhereDevice);
    }

    /**
     * Creates a UserExperienceAnalyticsWorkFromAnywhereDevice with a new object
     *
     * @param newUserExperienceAnalyticsWorkFromAnywhereDevice the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsWorkFromAnywhereDevice> postAsync(@Nonnull final UserExperienceAnalyticsWorkFromAnywhereDevice newUserExperienceAnalyticsWorkFromAnywhereDevice) {
        return sendAsync(HttpMethod.POST, newUserExperienceAnalyticsWorkFromAnywhereDevice);
    }

    /**
     * Creates a UserExperienceAnalyticsWorkFromAnywhereDevice with a new object
     *
     * @param newUserExperienceAnalyticsWorkFromAnywhereDevice the new object to create
     * @return the created UserExperienceAnalyticsWorkFromAnywhereDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsWorkFromAnywhereDevice post(@Nonnull final UserExperienceAnalyticsWorkFromAnywhereDevice newUserExperienceAnalyticsWorkFromAnywhereDevice) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsWorkFromAnywhereDevice);
    }

    /**
     * Creates a UserExperienceAnalyticsWorkFromAnywhereDevice with a new object
     *
     * @param newUserExperienceAnalyticsWorkFromAnywhereDevice the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserExperienceAnalyticsWorkFromAnywhereDevice> putAsync(@Nonnull final UserExperienceAnalyticsWorkFromAnywhereDevice newUserExperienceAnalyticsWorkFromAnywhereDevice) {
        return sendAsync(HttpMethod.PUT, newUserExperienceAnalyticsWorkFromAnywhereDevice);
    }

    /**
     * Creates a UserExperienceAnalyticsWorkFromAnywhereDevice with a new object
     *
     * @param newUserExperienceAnalyticsWorkFromAnywhereDevice the object to create/update
     * @return the created UserExperienceAnalyticsWorkFromAnywhereDevice
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserExperienceAnalyticsWorkFromAnywhereDevice put(@Nonnull final UserExperienceAnalyticsWorkFromAnywhereDevice newUserExperienceAnalyticsWorkFromAnywhereDevice) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsWorkFromAnywhereDevice);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserExperienceAnalyticsWorkFromAnywhereDeviceRequest select(@Nonnull final String value) {
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
     public UserExperienceAnalyticsWorkFromAnywhereDeviceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
