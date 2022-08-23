// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedAppRegistration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration Request Builder.
 */
public class ManagedAppRegistrationRequestBuilder extends BaseRequestBuilder<ManagedAppRegistration> {

    /**
     * The request builder for the ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppRegistrationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ManagedAppRegistrationRequest instance
     */
    @Nonnull
    public ManagedAppRegistrationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ManagedAppRegistrationRequest instance
     */
    @Nonnull
    public ManagedAppRegistrationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ManagedAppRegistrationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ManagedAppPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedAppPolicyCollectionRequestBuilder appliedPolicies() {
        return new com.microsoft.graph.requests.ManagedAppPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appliedPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedAppPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedAppPolicyRequestBuilder appliedPolicies(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ManagedAppPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("appliedPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedAppPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedAppPolicyCollectionRequestBuilder intendedPolicies() {
        return new com.microsoft.graph.requests.ManagedAppPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("intendedPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedAppPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedAppPolicyRequestBuilder intendedPolicies(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ManagedAppPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("intendedPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedAppOperation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedAppOperationCollectionRequestBuilder operations() {
        return new com.microsoft.graph.requests.ManagedAppOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedAppOperation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedAppOperationRequestBuilder operations(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ManagedAppOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }
}
