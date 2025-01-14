// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.VirtualEventsRoot;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Virtual Events Root Request Builder.
 */
public class VirtualEventsRootRequestBuilder extends BaseRequestBuilder<VirtualEventsRoot> {

    /**
     * The request builder for the VirtualEventsRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public VirtualEventsRootRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the VirtualEventsRootRequest instance
     */
    @Nonnull
    public VirtualEventsRootRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the VirtualEventsRootRequest instance
     */
    @Nonnull
    public VirtualEventsRootRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.VirtualEventsRootRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the VirtualEvent collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.VirtualEventCollectionRequestBuilder events() {
        return new com.microsoft.graph.requests.VirtualEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("events"), getClient(), null);
    }

    /**
     * Gets a request builder for the VirtualEvent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.VirtualEventRequestBuilder events(@Nonnull final String id) {
        return new com.microsoft.graph.requests.VirtualEventRequestBuilder(getRequestUrlWithAdditionalSegment("events") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the VirtualEventWebinar collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.VirtualEventWebinarCollectionRequestBuilder webinars() {
        return new com.microsoft.graph.requests.VirtualEventWebinarCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("webinars"), getClient(), null);
    }

    /**
     * Gets a request builder for the VirtualEventWebinar item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.VirtualEventWebinarRequestBuilder webinars(@Nonnull final String id) {
        return new com.microsoft.graph.requests.VirtualEventWebinarRequestBuilder(getRequestUrlWithAdditionalSegment("webinars") + "/" + id, getClient(), null);
    }
}
