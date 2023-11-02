// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EventMessage;
import com.microsoft.graph.models.Recipient;
import com.microsoft.graph.models.Message;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event Message Request.
 */
public class EventMessageRequest extends BaseRequest<EventMessage> {
	
    /**
     * The request for the EventMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public EventMessageRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends EventMessage> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the EventMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EventMessageRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EventMessage.class);
    }

    /**
     * Gets the EventMessage from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EventMessage> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the EventMessage from the service
     *
     * @return the EventMessage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EventMessage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EventMessage> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public EventMessage delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this EventMessage with a source
     *
     * @param sourceEventMessage the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EventMessage> patchAsync(@Nonnull final EventMessage sourceEventMessage) {
        return sendAsync(HttpMethod.PATCH, sourceEventMessage);
    }

    /**
     * Patches this EventMessage with a source
     *
     * @param sourceEventMessage the source object with updates
     * @return the updated EventMessage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EventMessage patch(@Nonnull final EventMessage sourceEventMessage) throws ClientException {
        return send(HttpMethod.PATCH, sourceEventMessage);
    }

    /**
     * Creates a EventMessage with a new object
     *
     * @param newEventMessage the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EventMessage> postAsync(@Nonnull final EventMessage newEventMessage) {
        return sendAsync(HttpMethod.POST, newEventMessage);
    }

    /**
     * Creates a EventMessage with a new object
     *
     * @param newEventMessage the new object to create
     * @return the created EventMessage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EventMessage post(@Nonnull final EventMessage newEventMessage) throws ClientException {
        return send(HttpMethod.POST, newEventMessage);
    }

    /**
     * Creates a EventMessage with a new object
     *
     * @param newEventMessage the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<EventMessage> putAsync(@Nonnull final EventMessage newEventMessage) {
        return sendAsync(HttpMethod.PUT, newEventMessage);
    }

    /**
     * Creates a EventMessage with a new object
     *
     * @param newEventMessage the object to create/update
     * @return the created EventMessage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public EventMessage put(@Nonnull final EventMessage newEventMessage) throws ClientException {
        return send(HttpMethod.PUT, newEventMessage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public EventMessageRequest select(@Nonnull final String value) {
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
     public EventMessageRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
