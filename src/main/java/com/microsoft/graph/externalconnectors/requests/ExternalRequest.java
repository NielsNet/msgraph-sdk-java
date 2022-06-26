// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.externalconnectors.models.External;
import com.microsoft.graph.externalconnectors.requests.ExternalConnectionCollectionRequestBuilder;
import com.microsoft.graph.externalconnectors.requests.ExternalConnectionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Request.
 */
public class ExternalRequest extends BaseRequest<External> {
	
    /**
     * The request for the External
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExternalRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, External.class);
    }

    /**
     * Gets the External from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<External> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the External from the service
     *
     * @return the External from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public External get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<External> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public External delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this External with a source
     *
     * @param sourceExternal the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<External> patchAsync(@Nonnull final External sourceExternal) {
        return sendAsync(HttpMethod.PATCH, sourceExternal);
    }

    /**
     * Patches this External with a source
     *
     * @param sourceExternal the source object with updates
     * @return the updated External
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public External patch(@Nonnull final External sourceExternal) throws ClientException {
        return send(HttpMethod.PATCH, sourceExternal);
    }

    /**
     * Creates a External with a new object
     *
     * @param newExternal the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<External> postAsync(@Nonnull final External newExternal) {
        return sendAsync(HttpMethod.POST, newExternal);
    }

    /**
     * Creates a External with a new object
     *
     * @param newExternal the new object to create
     * @return the created External
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public External post(@Nonnull final External newExternal) throws ClientException {
        return send(HttpMethod.POST, newExternal);
    }

    /**
     * Creates a External with a new object
     *
     * @param newExternal the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<External> putAsync(@Nonnull final External newExternal) {
        return sendAsync(HttpMethod.PUT, newExternal);
    }

    /**
     * Creates a External with a new object
     *
     * @param newExternal the object to create/update
     * @return the created External
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public External put(@Nonnull final External newExternal) throws ClientException {
        return send(HttpMethod.PUT, newExternal);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ExternalRequest select(@Nonnull final String value) {
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
     public ExternalRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
