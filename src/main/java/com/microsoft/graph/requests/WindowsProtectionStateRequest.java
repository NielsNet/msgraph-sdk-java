// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsProtectionState;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Protection State Request.
 */
public class WindowsProtectionStateRequest extends BaseRequest<WindowsProtectionState> {
	
    /**
     * The request for the WindowsProtectionState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsProtectionStateRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsProtectionState.class);
    }

    /**
     * Gets the WindowsProtectionState from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsProtectionState> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WindowsProtectionState from the service
     *
     * @return the WindowsProtectionState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsProtectionState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsProtectionState> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WindowsProtectionState delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WindowsProtectionState with a source
     *
     * @param sourceWindowsProtectionState the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsProtectionState> patchAsync(@Nonnull final WindowsProtectionState sourceWindowsProtectionState) {
        return sendAsync(HttpMethod.PATCH, sourceWindowsProtectionState);
    }

    /**
     * Patches this WindowsProtectionState with a source
     *
     * @param sourceWindowsProtectionState the source object with updates
     * @return the updated WindowsProtectionState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsProtectionState patch(@Nonnull final WindowsProtectionState sourceWindowsProtectionState) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsProtectionState);
    }

    /**
     * Creates a WindowsProtectionState with a new object
     *
     * @param newWindowsProtectionState the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsProtectionState> postAsync(@Nonnull final WindowsProtectionState newWindowsProtectionState) {
        return sendAsync(HttpMethod.POST, newWindowsProtectionState);
    }

    /**
     * Creates a WindowsProtectionState with a new object
     *
     * @param newWindowsProtectionState the new object to create
     * @return the created WindowsProtectionState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsProtectionState post(@Nonnull final WindowsProtectionState newWindowsProtectionState) throws ClientException {
        return send(HttpMethod.POST, newWindowsProtectionState);
    }

    /**
     * Creates a WindowsProtectionState with a new object
     *
     * @param newWindowsProtectionState the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WindowsProtectionState> putAsync(@Nonnull final WindowsProtectionState newWindowsProtectionState) {
        return sendAsync(HttpMethod.PUT, newWindowsProtectionState);
    }

    /**
     * Creates a WindowsProtectionState with a new object
     *
     * @param newWindowsProtectionState the object to create/update
     * @return the created WindowsProtectionState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsProtectionState put(@Nonnull final WindowsProtectionState newWindowsProtectionState) throws ClientException {
        return send(HttpMethod.PUT, newWindowsProtectionState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WindowsProtectionStateRequest select(@Nonnull final String value) {
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
     public WindowsProtectionStateRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
