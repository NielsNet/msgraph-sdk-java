// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UserScopeTeamsAppInstallation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Scope Teams App Installation Request.
 */
public class UserScopeTeamsAppInstallationRequest extends BaseRequest<UserScopeTeamsAppInstallation> {
	
    /**
     * The request for the UserScopeTeamsAppInstallation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserScopeTeamsAppInstallationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserScopeTeamsAppInstallation.class);
    }

    /**
     * Gets the UserScopeTeamsAppInstallation from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserScopeTeamsAppInstallation> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the UserScopeTeamsAppInstallation from the service
     *
     * @return the UserScopeTeamsAppInstallation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserScopeTeamsAppInstallation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserScopeTeamsAppInstallation> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public UserScopeTeamsAppInstallation delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserScopeTeamsAppInstallation with a source
     *
     * @param sourceUserScopeTeamsAppInstallation the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserScopeTeamsAppInstallation> patchAsync(@Nonnull final UserScopeTeamsAppInstallation sourceUserScopeTeamsAppInstallation) {
        return sendAsync(HttpMethod.PATCH, sourceUserScopeTeamsAppInstallation);
    }

    /**
     * Patches this UserScopeTeamsAppInstallation with a source
     *
     * @param sourceUserScopeTeamsAppInstallation the source object with updates
     * @return the updated UserScopeTeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserScopeTeamsAppInstallation patch(@Nonnull final UserScopeTeamsAppInstallation sourceUserScopeTeamsAppInstallation) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserScopeTeamsAppInstallation);
    }

    /**
     * Creates a UserScopeTeamsAppInstallation with a new object
     *
     * @param newUserScopeTeamsAppInstallation the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserScopeTeamsAppInstallation> postAsync(@Nonnull final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation) {
        return sendAsync(HttpMethod.POST, newUserScopeTeamsAppInstallation);
    }

    /**
     * Creates a UserScopeTeamsAppInstallation with a new object
     *
     * @param newUserScopeTeamsAppInstallation the new object to create
     * @return the created UserScopeTeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserScopeTeamsAppInstallation post(@Nonnull final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation) throws ClientException {
        return send(HttpMethod.POST, newUserScopeTeamsAppInstallation);
    }

    /**
     * Creates a UserScopeTeamsAppInstallation with a new object
     *
     * @param newUserScopeTeamsAppInstallation the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<UserScopeTeamsAppInstallation> putAsync(@Nonnull final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation) {
        return sendAsync(HttpMethod.PUT, newUserScopeTeamsAppInstallation);
    }

    /**
     * Creates a UserScopeTeamsAppInstallation with a new object
     *
     * @param newUserScopeTeamsAppInstallation the object to create/update
     * @return the created UserScopeTeamsAppInstallation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public UserScopeTeamsAppInstallation put(@Nonnull final UserScopeTeamsAppInstallation newUserScopeTeamsAppInstallation) throws ClientException {
        return send(HttpMethod.PUT, newUserScopeTeamsAppInstallation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public UserScopeTeamsAppInstallationRequest select(@Nonnull final String value) {
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
     public UserScopeTeamsAppInstallationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
