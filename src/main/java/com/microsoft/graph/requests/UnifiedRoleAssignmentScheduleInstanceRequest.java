// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UnifiedRoleAssignmentScheduleInstance;
import com.microsoft.graph.models.RoleAssignmentScheduleInstanceFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Schedule Instance Request.
 */
public class UnifiedRoleAssignmentScheduleInstanceRequest extends BaseRequest<UnifiedRoleAssignmentScheduleInstance> {
	
    /**
     * The request for the UnifiedRoleAssignmentScheduleInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentScheduleInstanceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleAssignmentScheduleInstance.class);
    }

    /**
     * Gets the UnifiedRoleAssignmentScheduleInstance from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignmentScheduleInstance> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UnifiedRoleAssignmentScheduleInstance from the service
     *
     * @return the UnifiedRoleAssignmentScheduleInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleAssignmentScheduleInstance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignmentScheduleInstance> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UnifiedRoleAssignmentScheduleInstance delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UnifiedRoleAssignmentScheduleInstance with a source
     *
     * @param sourceUnifiedRoleAssignmentScheduleInstance the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignmentScheduleInstance> patchAsync(@Nonnull final UnifiedRoleAssignmentScheduleInstance sourceUnifiedRoleAssignmentScheduleInstance) {
        return sendAsync(HttpMethod.PATCH, sourceUnifiedRoleAssignmentScheduleInstance);
    }

    /**
     * Patches this UnifiedRoleAssignmentScheduleInstance with a source
     *
     * @param sourceUnifiedRoleAssignmentScheduleInstance the source object with updates
     * @return the updated UnifiedRoleAssignmentScheduleInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleAssignmentScheduleInstance patch(@Nonnull final UnifiedRoleAssignmentScheduleInstance sourceUnifiedRoleAssignmentScheduleInstance) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRoleAssignmentScheduleInstance);
    }

    /**
     * Creates a UnifiedRoleAssignmentScheduleInstance with a new object
     *
     * @param newUnifiedRoleAssignmentScheduleInstance the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignmentScheduleInstance> postAsync(@Nonnull final UnifiedRoleAssignmentScheduleInstance newUnifiedRoleAssignmentScheduleInstance) {
        return sendAsync(HttpMethod.POST, newUnifiedRoleAssignmentScheduleInstance);
    }

    /**
     * Creates a UnifiedRoleAssignmentScheduleInstance with a new object
     *
     * @param newUnifiedRoleAssignmentScheduleInstance the new object to create
     * @return the created UnifiedRoleAssignmentScheduleInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleAssignmentScheduleInstance post(@Nonnull final UnifiedRoleAssignmentScheduleInstance newUnifiedRoleAssignmentScheduleInstance) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRoleAssignmentScheduleInstance);
    }

    /**
     * Creates a UnifiedRoleAssignmentScheduleInstance with a new object
     *
     * @param newUnifiedRoleAssignmentScheduleInstance the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleAssignmentScheduleInstance> putAsync(@Nonnull final UnifiedRoleAssignmentScheduleInstance newUnifiedRoleAssignmentScheduleInstance) {
        return sendAsync(HttpMethod.PUT, newUnifiedRoleAssignmentScheduleInstance);
    }

    /**
     * Creates a UnifiedRoleAssignmentScheduleInstance with a new object
     *
     * @param newUnifiedRoleAssignmentScheduleInstance the object to create/update
     * @return the created UnifiedRoleAssignmentScheduleInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleAssignmentScheduleInstance put(@Nonnull final UnifiedRoleAssignmentScheduleInstance newUnifiedRoleAssignmentScheduleInstance) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRoleAssignmentScheduleInstance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UnifiedRoleAssignmentScheduleInstanceRequest select(@Nonnull final String value) {
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
     public UnifiedRoleAssignmentScheduleInstanceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
