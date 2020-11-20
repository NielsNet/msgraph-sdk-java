// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TargetedManagedAppProtection;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Protection Request.
 */
public class TargetedManagedAppProtectionRequest extends BaseRequest<TargetedManagedAppProtection> {
	
    /**
     * The request for the TargetedManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public TargetedManagedAppProtectionRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends TargetedManagedAppProtection> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the TargetedManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TargetedManagedAppProtectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TargetedManagedAppProtection.class);
    }

    /**
     * Gets the TargetedManagedAppProtection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super TargetedManagedAppProtection> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TargetedManagedAppProtection from the service
     *
     * @return the TargetedManagedAppProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super TargetedManagedAppProtection> callback) {
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
     * Patches this TargetedManagedAppProtection with a source
     *
     * @param sourceTargetedManagedAppProtection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final TargetedManagedAppProtection sourceTargetedManagedAppProtection, @Nonnull final ICallback<? super TargetedManagedAppProtection> callback) {
        send(HttpMethod.PATCH, callback, sourceTargetedManagedAppProtection);
    }

    /**
     * Patches this TargetedManagedAppProtection with a source
     *
     * @param sourceTargetedManagedAppProtection the source object with updates
     * @return the updated TargetedManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppProtection patch(@Nonnull final TargetedManagedAppProtection sourceTargetedManagedAppProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceTargetedManagedAppProtection);
    }

    /**
     * Creates a TargetedManagedAppProtection with a new object
     *
     * @param newTargetedManagedAppProtection the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final TargetedManagedAppProtection newTargetedManagedAppProtection, @Nonnull final ICallback<? super TargetedManagedAppProtection> callback) {
        send(HttpMethod.POST, callback, newTargetedManagedAppProtection);
    }

    /**
     * Creates a TargetedManagedAppProtection with a new object
     *
     * @param newTargetedManagedAppProtection the new object to create
     * @return the created TargetedManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppProtection post(@Nonnull final TargetedManagedAppProtection newTargetedManagedAppProtection) throws ClientException {
        return send(HttpMethod.POST, newTargetedManagedAppProtection);
    }

    /**
     * Creates a TargetedManagedAppProtection with a new object
     *
     * @param newTargetedManagedAppProtection the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final TargetedManagedAppProtection newTargetedManagedAppProtection, @Nonnull final ICallback<? super TargetedManagedAppProtection> callback) {
        send(HttpMethod.PUT, callback, newTargetedManagedAppProtection);
    }

    /**
     * Creates a TargetedManagedAppProtection with a new object
     *
     * @param newTargetedManagedAppProtection the object to create/update
     * @return the created TargetedManagedAppProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TargetedManagedAppProtection put(@Nonnull final TargetedManagedAppProtection newTargetedManagedAppProtection) throws ClientException {
        return send(HttpMethod.PUT, newTargetedManagedAppProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TargetedManagedAppProtectionRequest select(@Nonnull final String value) {
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
     public TargetedManagedAppProtectionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

