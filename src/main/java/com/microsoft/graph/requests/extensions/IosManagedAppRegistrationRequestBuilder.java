// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosManagedAppRegistration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Managed App Registration Request Builder.
 */
public class IosManagedAppRegistrationRequestBuilder extends BaseRequestBuilder<IosManagedAppRegistration> {

    /**
     * The request builder for the IosManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosManagedAppRegistrationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IosManagedAppRegistrationRequest instance
     */
    @Nonnull
    public IosManagedAppRegistrationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IosManagedAppRegistrationRequest instance
     */
    @Nonnull
    public IosManagedAppRegistrationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.IosManagedAppRegistrationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ManagedAppPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedAppPolicyCollectionRequestBuilder appliedPolicies() {
        return new ManagedAppPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("appliedPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedAppPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedAppPolicyRequestBuilder appliedPolicies(@Nonnull final String id) {
        return new ManagedAppPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("appliedPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedAppPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedAppPolicyCollectionRequestBuilder intendedPolicies() {
        return new ManagedAppPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("intendedPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedAppPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedAppPolicyRequestBuilder intendedPolicies(@Nonnull final String id) {
        return new ManagedAppPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("intendedPolicies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedAppOperation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ManagedAppOperationCollectionRequestBuilder operations() {
        return new ManagedAppOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedAppOperation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ManagedAppOperationRequestBuilder operations(@Nonnull final String id) {
        return new ManagedAppOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }
}
