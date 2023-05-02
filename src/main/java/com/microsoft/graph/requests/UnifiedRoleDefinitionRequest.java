// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UnifiedRoleDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Definition Request.
 */
public class UnifiedRoleDefinitionRequest extends BaseRequest<UnifiedRoleDefinition> {
	
    /**
     * The request for the UnifiedRoleDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleDefinitionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleDefinition.class);
    }

    /**
     * Gets the UnifiedRoleDefinition from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleDefinition> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UnifiedRoleDefinition from the service
     *
     * @return the UnifiedRoleDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleDefinition> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UnifiedRoleDefinition delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UnifiedRoleDefinition with a source
     *
     * @param sourceUnifiedRoleDefinition the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleDefinition> patchAsync(@Nonnull final UnifiedRoleDefinition sourceUnifiedRoleDefinition) {
        return sendAsync(HttpMethod.PATCH, sourceUnifiedRoleDefinition);
    }

    /**
     * Patches this UnifiedRoleDefinition with a source
     *
     * @param sourceUnifiedRoleDefinition the source object with updates
     * @return the updated UnifiedRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleDefinition patch(@Nonnull final UnifiedRoleDefinition sourceUnifiedRoleDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRoleDefinition);
    }

    /**
     * Creates a UnifiedRoleDefinition with a new object
     *
     * @param newUnifiedRoleDefinition the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleDefinition> postAsync(@Nonnull final UnifiedRoleDefinition newUnifiedRoleDefinition) {
        return sendAsync(HttpMethod.POST, newUnifiedRoleDefinition);
    }

    /**
     * Creates a UnifiedRoleDefinition with a new object
     *
     * @param newUnifiedRoleDefinition the new object to create
     * @return the created UnifiedRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleDefinition post(@Nonnull final UnifiedRoleDefinition newUnifiedRoleDefinition) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRoleDefinition);
    }

    /**
     * Creates a UnifiedRoleDefinition with a new object
     *
     * @param newUnifiedRoleDefinition the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRoleDefinition> putAsync(@Nonnull final UnifiedRoleDefinition newUnifiedRoleDefinition) {
        return sendAsync(HttpMethod.PUT, newUnifiedRoleDefinition);
    }

    /**
     * Creates a UnifiedRoleDefinition with a new object
     *
     * @param newUnifiedRoleDefinition the object to create/update
     * @return the created UnifiedRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRoleDefinition put(@Nonnull final UnifiedRoleDefinition newUnifiedRoleDefinition) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRoleDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UnifiedRoleDefinitionRequest select(@Nonnull final String value) {
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
     public UnifiedRoleDefinitionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
