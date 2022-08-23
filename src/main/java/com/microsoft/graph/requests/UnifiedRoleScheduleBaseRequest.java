// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UnifiedRoleScheduleBase;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Schedule Base Request.
 */
public class UnifiedRoleScheduleBaseRequest extends BaseRequest<UnifiedRoleScheduleBase> {
	
    /**
     * The request for the UnifiedRoleScheduleBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public UnifiedRoleScheduleBaseRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends UnifiedRoleScheduleBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the UnifiedRoleScheduleBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleScheduleBaseRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleScheduleBase.class);
    }

    /**
     * Gets the UnifiedRoleScheduleBase from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleScheduleBase> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UnifiedRoleScheduleBase from the service
     *
     * @return the UnifiedRoleScheduleBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleScheduleBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleScheduleBase> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UnifiedRoleScheduleBase delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UnifiedRoleScheduleBase with a source
     *
     * @param sourceUnifiedRoleScheduleBase the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleScheduleBase> patchAsync(@Nonnull final UnifiedRoleScheduleBase sourceUnifiedRoleScheduleBase) {
        return sendAsync(HttpMethod.PATCH, sourceUnifiedRoleScheduleBase);
    }

    /**
     * Patches this UnifiedRoleScheduleBase with a source
     *
     * @param sourceUnifiedRoleScheduleBase the source object with updates
     * @return the updated UnifiedRoleScheduleBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleScheduleBase patch(@Nonnull final UnifiedRoleScheduleBase sourceUnifiedRoleScheduleBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRoleScheduleBase);
    }

    /**
     * Creates a UnifiedRoleScheduleBase with a new object
     *
     * @param newUnifiedRoleScheduleBase the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleScheduleBase> postAsync(@Nonnull final UnifiedRoleScheduleBase newUnifiedRoleScheduleBase) {
        return sendAsync(HttpMethod.POST, newUnifiedRoleScheduleBase);
    }

    /**
     * Creates a UnifiedRoleScheduleBase with a new object
     *
     * @param newUnifiedRoleScheduleBase the new object to create
     * @return the created UnifiedRoleScheduleBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleScheduleBase post(@Nonnull final UnifiedRoleScheduleBase newUnifiedRoleScheduleBase) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRoleScheduleBase);
    }

    /**
     * Creates a UnifiedRoleScheduleBase with a new object
     *
     * @param newUnifiedRoleScheduleBase the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleScheduleBase> putAsync(@Nonnull final UnifiedRoleScheduleBase newUnifiedRoleScheduleBase) {
        return sendAsync(HttpMethod.PUT, newUnifiedRoleScheduleBase);
    }

    /**
     * Creates a UnifiedRoleScheduleBase with a new object
     *
     * @param newUnifiedRoleScheduleBase the object to create/update
     * @return the created UnifiedRoleScheduleBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleScheduleBase put(@Nonnull final UnifiedRoleScheduleBase newUnifiedRoleScheduleBase) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRoleScheduleBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UnifiedRoleScheduleBaseRequest select(@Nonnull final String value) {
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
     public UnifiedRoleScheduleBaseRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

