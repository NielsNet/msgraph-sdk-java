// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.CallTranscript;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Transcript Request.
 */
public class CallTranscriptRequest extends BaseRequest<CallTranscript> {
	
    /**
     * The request for the CallTranscript
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallTranscriptRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CallTranscript.class);
    }

    /**
     * Gets the CallTranscript from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CallTranscript> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the CallTranscript from the service
     *
     * @return the CallTranscript from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CallTranscript get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CallTranscript> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public CallTranscript delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this CallTranscript with a source
     *
     * @param sourceCallTranscript the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CallTranscript> patchAsync(@Nonnull final CallTranscript sourceCallTranscript) {
        return sendAsync(HttpMethod.PATCH, sourceCallTranscript);
    }

    /**
     * Patches this CallTranscript with a source
     *
     * @param sourceCallTranscript the source object with updates
     * @return the updated CallTranscript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CallTranscript patch(@Nonnull final CallTranscript sourceCallTranscript) throws ClientException {
        return send(HttpMethod.PATCH, sourceCallTranscript);
    }

    /**
     * Creates a CallTranscript with a new object
     *
     * @param newCallTranscript the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CallTranscript> postAsync(@Nonnull final CallTranscript newCallTranscript) {
        return sendAsync(HttpMethod.POST, newCallTranscript);
    }

    /**
     * Creates a CallTranscript with a new object
     *
     * @param newCallTranscript the new object to create
     * @return the created CallTranscript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CallTranscript post(@Nonnull final CallTranscript newCallTranscript) throws ClientException {
        return send(HttpMethod.POST, newCallTranscript);
    }

    /**
     * Creates a CallTranscript with a new object
     *
     * @param newCallTranscript the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CallTranscript> putAsync(@Nonnull final CallTranscript newCallTranscript) {
        return sendAsync(HttpMethod.PUT, newCallTranscript);
    }

    /**
     * Creates a CallTranscript with a new object
     *
     * @param newCallTranscript the object to create/update
     * @return the created CallTranscript
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CallTranscript put(@Nonnull final CallTranscript newCallTranscript) throws ClientException {
        return send(HttpMethod.PUT, newCallTranscript);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public CallTranscriptRequest select(@Nonnull final String value) {
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
     public CallTranscriptRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
