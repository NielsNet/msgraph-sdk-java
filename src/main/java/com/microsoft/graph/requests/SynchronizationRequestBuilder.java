// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Synchronization;
import com.microsoft.graph.models.SynchronizationSecretKeyStringValuePair;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.SynchronizationAcquireAccessTokenParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Request Builder.
 */
public class SynchronizationRequestBuilder extends BaseRequestBuilder<Synchronization> {

    /**
     * The request builder for the Synchronization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SynchronizationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SynchronizationRequest instance
     */
    @Nonnull
    public SynchronizationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the SynchronizationRequest instance
     */
    @Nonnull
    public SynchronizationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.SynchronizationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the SynchronizationJob collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.SynchronizationJobCollectionRequestBuilder jobs() {
        return new com.microsoft.graph.requests.SynchronizationJobCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("jobs"), getClient(), null);
    }

    /**
     * Gets a request builder for the SynchronizationJob item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.SynchronizationJobRequestBuilder jobs(@Nonnull final String id) {
        return new com.microsoft.graph.requests.SynchronizationJobRequestBuilder(getRequestUrlWithAdditionalSegment("jobs") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SynchronizationTemplate collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.SynchronizationTemplateCollectionRequestBuilder templates() {
        return new com.microsoft.graph.requests.SynchronizationTemplateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("templates"), getClient(), null);
    }

    /**
     * Gets a request builder for the SynchronizationTemplate item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.SynchronizationTemplateRequestBuilder templates(@Nonnull final String id) {
        return new com.microsoft.graph.requests.SynchronizationTemplateRequestBuilder(getRequestUrlWithAdditionalSegment("templates") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public SynchronizationAcquireAccessTokenRequestBuilder acquireAccessToken(@Nonnull final SynchronizationAcquireAccessTokenParameterSet parameters) {
        return new SynchronizationAcquireAccessTokenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.acquireAccessToken"), getClient(), null, parameters);
    }
}