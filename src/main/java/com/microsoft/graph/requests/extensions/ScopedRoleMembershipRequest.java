// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ScopedRoleMembership;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Scoped Role Membership Request.
 */
public class ScopedRoleMembershipRequest extends BaseRequest<ScopedRoleMembership> {
	
    /**
     * The request for the ScopedRoleMembership
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ScopedRoleMembershipRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ScopedRoleMembership.class);
    }

    /**
     * Gets the ScopedRoleMembership from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ScopedRoleMembership> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ScopedRoleMembership from the service
     *
     * @return the ScopedRoleMembership from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ScopedRoleMembership get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ScopedRoleMembership> callback) {
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
     * Patches this ScopedRoleMembership with a source
     *
     * @param sourceScopedRoleMembership the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ScopedRoleMembership sourceScopedRoleMembership, @Nonnull final ICallback<? super ScopedRoleMembership> callback) {
        send(HttpMethod.PATCH, callback, sourceScopedRoleMembership);
    }

    /**
     * Patches this ScopedRoleMembership with a source
     *
     * @param sourceScopedRoleMembership the source object with updates
     * @return the updated ScopedRoleMembership
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ScopedRoleMembership patch(@Nonnull final ScopedRoleMembership sourceScopedRoleMembership) throws ClientException {
        return send(HttpMethod.PATCH, sourceScopedRoleMembership);
    }

    /**
     * Creates a ScopedRoleMembership with a new object
     *
     * @param newScopedRoleMembership the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ScopedRoleMembership newScopedRoleMembership, @Nonnull final ICallback<? super ScopedRoleMembership> callback) {
        send(HttpMethod.POST, callback, newScopedRoleMembership);
    }

    /**
     * Creates a ScopedRoleMembership with a new object
     *
     * @param newScopedRoleMembership the new object to create
     * @return the created ScopedRoleMembership
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ScopedRoleMembership post(@Nonnull final ScopedRoleMembership newScopedRoleMembership) throws ClientException {
        return send(HttpMethod.POST, newScopedRoleMembership);
    }

    /**
     * Creates a ScopedRoleMembership with a new object
     *
     * @param newScopedRoleMembership the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ScopedRoleMembership newScopedRoleMembership, @Nonnull final ICallback<? super ScopedRoleMembership> callback) {
        send(HttpMethod.PUT, callback, newScopedRoleMembership);
    }

    /**
     * Creates a ScopedRoleMembership with a new object
     *
     * @param newScopedRoleMembership the object to create/update
     * @return the created ScopedRoleMembership
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ScopedRoleMembership put(@Nonnull final ScopedRoleMembership newScopedRoleMembership) throws ClientException {
        return send(HttpMethod.PUT, newScopedRoleMembership);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ScopedRoleMembershipRequest select(@Nonnull final String value) {
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
     public ScopedRoleMembershipRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

