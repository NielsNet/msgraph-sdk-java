// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.RetentionEventType;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Retention Event Type Request.
 */
public class RetentionEventTypeRequest extends BaseRequest<RetentionEventType> {
	
    /**
     * The request for the RetentionEventType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RetentionEventTypeRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RetentionEventType.class);
    }

    /**
     * Gets the RetentionEventType from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RetentionEventType> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the RetentionEventType from the service
     *
     * @return the RetentionEventType from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RetentionEventType get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RetentionEventType> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public RetentionEventType delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this RetentionEventType with a source
     *
     * @param sourceRetentionEventType the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RetentionEventType> patchAsync(@Nonnull final RetentionEventType sourceRetentionEventType) {
        return sendAsync(HttpMethod.PATCH, sourceRetentionEventType);
    }

    /**
     * Patches this RetentionEventType with a source
     *
     * @param sourceRetentionEventType the source object with updates
     * @return the updated RetentionEventType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RetentionEventType patch(@Nonnull final RetentionEventType sourceRetentionEventType) throws ClientException {
        return send(HttpMethod.PATCH, sourceRetentionEventType);
    }

    /**
     * Creates a RetentionEventType with a new object
     *
     * @param newRetentionEventType the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RetentionEventType> postAsync(@Nonnull final RetentionEventType newRetentionEventType) {
        return sendAsync(HttpMethod.POST, newRetentionEventType);
    }

    /**
     * Creates a RetentionEventType with a new object
     *
     * @param newRetentionEventType the new object to create
     * @return the created RetentionEventType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RetentionEventType post(@Nonnull final RetentionEventType newRetentionEventType) throws ClientException {
        return send(HttpMethod.POST, newRetentionEventType);
    }

    /**
     * Creates a RetentionEventType with a new object
     *
     * @param newRetentionEventType the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<RetentionEventType> putAsync(@Nonnull final RetentionEventType newRetentionEventType) {
        return sendAsync(HttpMethod.PUT, newRetentionEventType);
    }

    /**
     * Creates a RetentionEventType with a new object
     *
     * @param newRetentionEventType the object to create/update
     * @return the created RetentionEventType
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public RetentionEventType put(@Nonnull final RetentionEventType newRetentionEventType) throws ClientException {
        return send(HttpMethod.PUT, newRetentionEventType);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public RetentionEventTypeRequest select(@Nonnull final String value) {
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
     public RetentionEventTypeRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
