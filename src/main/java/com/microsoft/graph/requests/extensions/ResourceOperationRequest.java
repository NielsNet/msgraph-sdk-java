// Template Source: Templates\Java\requests_extensions\BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ResourceOperation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Resource Operation Request.
 */
public class ResourceOperationRequest extends BaseRequest<ResourceOperation> {
	
    /**
     * The request for the ResourceOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ResourceOperationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ResourceOperation.class);
    }

    /**
     * Gets the ResourceOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ResourceOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ResourceOperation from the service
     *
     * @return the ResourceOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ResourceOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ResourceOperation> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ResourceOperation with a source
     *
     * @param sourceResourceOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ResourceOperation sourceResourceOperation, @Nonnull final ICallback<? super ResourceOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceResourceOperation);
    }

    /**
     * Patches this ResourceOperation with a source
     *
     * @param sourceResourceOperation the source object with updates
     * @return the updated ResourceOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ResourceOperation patch(@Nonnull final ResourceOperation sourceResourceOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceResourceOperation);
    }

    /**
     * Creates a ResourceOperation with a new object
     *
     * @param newResourceOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ResourceOperation newResourceOperation, @Nonnull final ICallback<? super ResourceOperation> callback) {
        send(HttpMethod.POST, callback, newResourceOperation);
    }

    /**
     * Creates a ResourceOperation with a new object
     *
     * @param newResourceOperation the new object to create
     * @return the created ResourceOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ResourceOperation post(@Nonnull final ResourceOperation newResourceOperation) throws ClientException {
        return send(HttpMethod.POST, newResourceOperation);
    }

    /**
     * Creates a ResourceOperation with a new object
     *
     * @param newResourceOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ResourceOperation newResourceOperation, @Nonnull final ICallback<? super ResourceOperation> callback) {
        send(HttpMethod.PUT, callback, newResourceOperation);
    }

    /**
     * Creates a ResourceOperation with a new object
     *
     * @param newResourceOperation the object to create/update
     * @return the created ResourceOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ResourceOperation put(@Nonnull final ResourceOperation newResourceOperation) throws ClientException {
        return send(HttpMethod.PUT, newResourceOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ResourceOperationRequest select(@Nonnull final String value) {
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
     public ResourceOperationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

