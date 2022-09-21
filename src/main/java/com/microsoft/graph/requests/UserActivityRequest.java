// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UserActivity;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Activity Request.
 */
public class UserActivityRequest extends BaseRequest<UserActivity> {
	
    /**
     * The request for the UserActivity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserActivityRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserActivity.class);
    }

    /**
     * Gets the UserActivity from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserActivity> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UserActivity from the service
     *
     * @return the UserActivity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserActivity get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserActivity> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UserActivity delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserActivity with a source
     *
     * @param sourceUserActivity the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserActivity> patchAsync(@Nonnull final UserActivity sourceUserActivity) {
        return sendAsync(HttpMethod.PATCH, sourceUserActivity);
    }

    /**
     * Patches this UserActivity with a source
     *
     * @param sourceUserActivity the source object with updates
     * @return the updated UserActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserActivity patch(@Nonnull final UserActivity sourceUserActivity) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserActivity);
    }

    /**
     * Creates a UserActivity with a new object
     *
     * @param newUserActivity the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserActivity> postAsync(@Nonnull final UserActivity newUserActivity) {
        return sendAsync(HttpMethod.POST, newUserActivity);
    }

    /**
     * Creates a UserActivity with a new object
     *
     * @param newUserActivity the new object to create
     * @return the created UserActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserActivity post(@Nonnull final UserActivity newUserActivity) throws ClientException {
        return send(HttpMethod.POST, newUserActivity);
    }

    /**
     * Creates a UserActivity with a new object
     *
     * @param newUserActivity the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserActivity> putAsync(@Nonnull final UserActivity newUserActivity) {
        return sendAsync(HttpMethod.PUT, newUserActivity);
    }

    /**
     * Creates a UserActivity with a new object
     *
     * @param newUserActivity the object to create/update
     * @return the created UserActivity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserActivity put(@Nonnull final UserActivity newUserActivity) throws ClientException {
        return send(HttpMethod.PUT, newUserActivity);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserActivityRequest select(@Nonnull final String value) {
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
     public UserActivityRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
