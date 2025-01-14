// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Training;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Training Request.
 */
public class TrainingRequest extends BaseRequest<Training> {
	
    /**
     * The request for the Training
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TrainingRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Training.class);
    }

    /**
     * Gets the Training from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Training> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Training from the service
     *
     * @return the Training from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Training get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Training> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Training delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Training with a source
     *
     * @param sourceTraining the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Training> patchAsync(@Nonnull final Training sourceTraining) {
        return sendAsync(HttpMethod.PATCH, sourceTraining);
    }

    /**
     * Patches this Training with a source
     *
     * @param sourceTraining the source object with updates
     * @return the updated Training
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Training patch(@Nonnull final Training sourceTraining) throws ClientException {
        return send(HttpMethod.PATCH, sourceTraining);
    }

    /**
     * Creates a Training with a new object
     *
     * @param newTraining the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Training> postAsync(@Nonnull final Training newTraining) {
        return sendAsync(HttpMethod.POST, newTraining);
    }

    /**
     * Creates a Training with a new object
     *
     * @param newTraining the new object to create
     * @return the created Training
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Training post(@Nonnull final Training newTraining) throws ClientException {
        return send(HttpMethod.POST, newTraining);
    }

    /**
     * Creates a Training with a new object
     *
     * @param newTraining the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Training> putAsync(@Nonnull final Training newTraining) {
        return sendAsync(HttpMethod.PUT, newTraining);
    }

    /**
     * Creates a Training with a new object
     *
     * @param newTraining the object to create/update
     * @return the created Training
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Training put(@Nonnull final Training newTraining) throws ClientException {
        return send(HttpMethod.PUT, newTraining);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TrainingRequest select(@Nonnull final String value) {
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
     public TrainingRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

