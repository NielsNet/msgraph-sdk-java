// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UnifiedRbacResourceAction;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Rbac Resource Action Request.
 */
public class UnifiedRbacResourceActionRequest extends BaseRequest<UnifiedRbacResourceAction> {
	
    /**
     * The request for the UnifiedRbacResourceAction
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRbacResourceActionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRbacResourceAction.class);
    }

    /**
     * Gets the UnifiedRbacResourceAction from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRbacResourceAction> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UnifiedRbacResourceAction from the service
     *
     * @return the UnifiedRbacResourceAction from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRbacResourceAction get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRbacResourceAction> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UnifiedRbacResourceAction delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UnifiedRbacResourceAction with a source
     *
     * @param sourceUnifiedRbacResourceAction the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRbacResourceAction> patchAsync(@Nonnull final UnifiedRbacResourceAction sourceUnifiedRbacResourceAction) {
        return sendAsync(HttpMethod.PATCH, sourceUnifiedRbacResourceAction);
    }

    /**
     * Patches this UnifiedRbacResourceAction with a source
     *
     * @param sourceUnifiedRbacResourceAction the source object with updates
     * @return the updated UnifiedRbacResourceAction
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRbacResourceAction patch(@Nonnull final UnifiedRbacResourceAction sourceUnifiedRbacResourceAction) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnifiedRbacResourceAction);
    }

    /**
     * Creates a UnifiedRbacResourceAction with a new object
     *
     * @param newUnifiedRbacResourceAction the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRbacResourceAction> postAsync(@Nonnull final UnifiedRbacResourceAction newUnifiedRbacResourceAction) {
        return sendAsync(HttpMethod.POST, newUnifiedRbacResourceAction);
    }

    /**
     * Creates a UnifiedRbacResourceAction with a new object
     *
     * @param newUnifiedRbacResourceAction the new object to create
     * @return the created UnifiedRbacResourceAction
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRbacResourceAction post(@Nonnull final UnifiedRbacResourceAction newUnifiedRbacResourceAction) throws ClientException {
        return send(HttpMethod.POST, newUnifiedRbacResourceAction);
    }

    /**
     * Creates a UnifiedRbacResourceAction with a new object
     *
     * @param newUnifiedRbacResourceAction the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UnifiedRbacResourceAction> putAsync(@Nonnull final UnifiedRbacResourceAction newUnifiedRbacResourceAction) {
        return sendAsync(HttpMethod.PUT, newUnifiedRbacResourceAction);
    }

    /**
     * Creates a UnifiedRbacResourceAction with a new object
     *
     * @param newUnifiedRbacResourceAction the object to create/update
     * @return the created UnifiedRbacResourceAction
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UnifiedRbacResourceAction put(@Nonnull final UnifiedRbacResourceAction newUnifiedRbacResourceAction) throws ClientException {
        return send(HttpMethod.PUT, newUnifiedRbacResourceAction);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UnifiedRbacResourceActionRequest select(@Nonnull final String value) {
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
     public UnifiedRbacResourceActionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
