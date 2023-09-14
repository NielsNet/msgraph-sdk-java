// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TeamsAppSettings;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Settings Request.
 */
public class TeamsAppSettingsRequest extends BaseRequest<TeamsAppSettings> {
	
    /**
     * The request for the TeamsAppSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppSettingsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsAppSettings.class);
    }

    /**
     * Gets the TeamsAppSettings from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppSettings> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TeamsAppSettings from the service
     *
     * @return the TeamsAppSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppSettings> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TeamsAppSettings delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TeamsAppSettings with a source
     *
     * @param sourceTeamsAppSettings the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppSettings> patchAsync(@Nonnull final TeamsAppSettings sourceTeamsAppSettings) {
        return sendAsync(HttpMethod.PATCH, sourceTeamsAppSettings);
    }

    /**
     * Patches this TeamsAppSettings with a source
     *
     * @param sourceTeamsAppSettings the source object with updates
     * @return the updated TeamsAppSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppSettings patch(@Nonnull final TeamsAppSettings sourceTeamsAppSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsAppSettings);
    }

    /**
     * Creates a TeamsAppSettings with a new object
     *
     * @param newTeamsAppSettings the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppSettings> postAsync(@Nonnull final TeamsAppSettings newTeamsAppSettings) {
        return sendAsync(HttpMethod.POST, newTeamsAppSettings);
    }

    /**
     * Creates a TeamsAppSettings with a new object
     *
     * @param newTeamsAppSettings the new object to create
     * @return the created TeamsAppSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppSettings post(@Nonnull final TeamsAppSettings newTeamsAppSettings) throws ClientException {
        return send(HttpMethod.POST, newTeamsAppSettings);
    }

    /**
     * Creates a TeamsAppSettings with a new object
     *
     * @param newTeamsAppSettings the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppSettings> putAsync(@Nonnull final TeamsAppSettings newTeamsAppSettings) {
        return sendAsync(HttpMethod.PUT, newTeamsAppSettings);
    }

    /**
     * Creates a TeamsAppSettings with a new object
     *
     * @param newTeamsAppSettings the object to create/update
     * @return the created TeamsAppSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppSettings put(@Nonnull final TeamsAppSettings newTeamsAppSettings) throws ClientException {
        return send(HttpMethod.PUT, newTeamsAppSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TeamsAppSettingsRequest select(@Nonnull final String value) {
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
     public TeamsAppSettingsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
