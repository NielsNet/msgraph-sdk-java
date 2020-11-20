// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupLifecyclePolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Lifecycle Policy Request.
 */
public class GroupLifecyclePolicyRequest extends BaseRequest<GroupLifecyclePolicy> {
	
    /**
     * The request for the GroupLifecyclePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupLifecyclePolicyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupLifecyclePolicy.class);
    }

    /**
     * Gets the GroupLifecyclePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super GroupLifecyclePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupLifecyclePolicy from the service
     *
     * @return the GroupLifecyclePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupLifecyclePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super GroupLifecyclePolicy> callback) {
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
     * Patches this GroupLifecyclePolicy with a source
     *
     * @param sourceGroupLifecyclePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final GroupLifecyclePolicy sourceGroupLifecyclePolicy, @Nonnull final ICallback<? super GroupLifecyclePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupLifecyclePolicy);
    }

    /**
     * Patches this GroupLifecyclePolicy with a source
     *
     * @param sourceGroupLifecyclePolicy the source object with updates
     * @return the updated GroupLifecyclePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupLifecyclePolicy patch(@Nonnull final GroupLifecyclePolicy sourceGroupLifecyclePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupLifecyclePolicy);
    }

    /**
     * Creates a GroupLifecyclePolicy with a new object
     *
     * @param newGroupLifecyclePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final GroupLifecyclePolicy newGroupLifecyclePolicy, @Nonnull final ICallback<? super GroupLifecyclePolicy> callback) {
        send(HttpMethod.POST, callback, newGroupLifecyclePolicy);
    }

    /**
     * Creates a GroupLifecyclePolicy with a new object
     *
     * @param newGroupLifecyclePolicy the new object to create
     * @return the created GroupLifecyclePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupLifecyclePolicy post(@Nonnull final GroupLifecyclePolicy newGroupLifecyclePolicy) throws ClientException {
        return send(HttpMethod.POST, newGroupLifecyclePolicy);
    }

    /**
     * Creates a GroupLifecyclePolicy with a new object
     *
     * @param newGroupLifecyclePolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final GroupLifecyclePolicy newGroupLifecyclePolicy, @Nonnull final ICallback<? super GroupLifecyclePolicy> callback) {
        send(HttpMethod.PUT, callback, newGroupLifecyclePolicy);
    }

    /**
     * Creates a GroupLifecyclePolicy with a new object
     *
     * @param newGroupLifecyclePolicy the object to create/update
     * @return the created GroupLifecyclePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupLifecyclePolicy put(@Nonnull final GroupLifecyclePolicy newGroupLifecyclePolicy) throws ClientException {
        return send(HttpMethod.PUT, newGroupLifecyclePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public GroupLifecyclePolicyRequest select(@Nonnull final String value) {
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
     public GroupLifecyclePolicyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

