// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ServiceAnnouncement;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Announcement Request Builder.
 */
public class ServiceAnnouncementRequestBuilder extends BaseRequestBuilder<ServiceAnnouncement> {

    /**
     * The request builder for the ServiceAnnouncement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServiceAnnouncementRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ServiceAnnouncementRequest instance
     */
    @Nonnull
    public ServiceAnnouncementRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ServiceAnnouncementRequest instance
     */
    @Nonnull
    public ServiceAnnouncementRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ServiceAnnouncementRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ServiceHealth collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ServiceHealthCollectionRequestBuilder healthOverviews() {
        return new com.microsoft.graph.requests.ServiceHealthCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("healthOverviews"), getClient(), null);
    }

    /**
     * Gets a request builder for the ServiceHealth item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ServiceHealthRequestBuilder healthOverviews(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ServiceHealthRequestBuilder(getRequestUrlWithAdditionalSegment("healthOverviews") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ServiceHealthIssue collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ServiceHealthIssueCollectionRequestBuilder issues() {
        return new com.microsoft.graph.requests.ServiceHealthIssueCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("issues"), getClient(), null);
    }

    /**
     * Gets a request builder for the ServiceHealthIssue item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ServiceHealthIssueRequestBuilder issues(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ServiceHealthIssueRequestBuilder(getRequestUrlWithAdditionalSegment("issues") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ServiceUpdateMessage collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ServiceUpdateMessageCollectionRequestBuilder messages() {
        return new com.microsoft.graph.requests.ServiceUpdateMessageCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("messages"), getClient(), null);
    }

    /**
     * Gets a request builder for the ServiceUpdateMessage item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ServiceUpdateMessageRequestBuilder messages(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ServiceUpdateMessageRequestBuilder(getRequestUrlWithAdditionalSegment("messages") + "/" + id, getClient(), null);
    }
}
