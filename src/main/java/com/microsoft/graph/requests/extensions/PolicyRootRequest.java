// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicyRoot;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionGrantPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentitySecurityDefaultsEnforcementPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Root Request.
 */
public class PolicyRootRequest extends BaseRequest<PolicyRoot> {
	
    /**
     * The request for the PolicyRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PolicyRootRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PolicyRoot.class);
    }

    /**
     * Gets the PolicyRoot from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super PolicyRoot> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PolicyRoot from the service
     *
     * @return the PolicyRoot from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PolicyRoot get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super PolicyRoot> callback) {
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
     * Patches this PolicyRoot with a source
     *
     * @param sourcePolicyRoot the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final PolicyRoot sourcePolicyRoot, @Nonnull final ICallback<? super PolicyRoot> callback) {
        send(HttpMethod.PATCH, callback, sourcePolicyRoot);
    }

    /**
     * Patches this PolicyRoot with a source
     *
     * @param sourcePolicyRoot the source object with updates
     * @return the updated PolicyRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PolicyRoot patch(@Nonnull final PolicyRoot sourcePolicyRoot) throws ClientException {
        return send(HttpMethod.PATCH, sourcePolicyRoot);
    }

    /**
     * Creates a PolicyRoot with a new object
     *
     * @param newPolicyRoot the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final PolicyRoot newPolicyRoot, @Nonnull final ICallback<? super PolicyRoot> callback) {
        send(HttpMethod.POST, callback, newPolicyRoot);
    }

    /**
     * Creates a PolicyRoot with a new object
     *
     * @param newPolicyRoot the new object to create
     * @return the created PolicyRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PolicyRoot post(@Nonnull final PolicyRoot newPolicyRoot) throws ClientException {
        return send(HttpMethod.POST, newPolicyRoot);
    }

    /**
     * Creates a PolicyRoot with a new object
     *
     * @param newPolicyRoot the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final PolicyRoot newPolicyRoot, @Nonnull final ICallback<? super PolicyRoot> callback) {
        send(HttpMethod.PUT, callback, newPolicyRoot);
    }

    /**
     * Creates a PolicyRoot with a new object
     *
     * @param newPolicyRoot the object to create/update
     * @return the created PolicyRoot
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PolicyRoot put(@Nonnull final PolicyRoot newPolicyRoot) throws ClientException {
        return send(HttpMethod.PUT, newPolicyRoot);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PolicyRootRequest select(@Nonnull final String value) {
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
     public PolicyRootRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

