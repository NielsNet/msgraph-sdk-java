// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ParticipantLeftNotification;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant Left Notification Request Builder.
 */
public class ParticipantLeftNotificationRequestBuilder extends BaseRequestBuilder<ParticipantLeftNotification> {

    /**
     * The request builder for the ParticipantLeftNotification
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ParticipantLeftNotificationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ParticipantLeftNotificationRequest instance
     */
    @Nonnull
    public ParticipantLeftNotificationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ParticipantLeftNotificationRequest instance
     */
    @Nonnull
    public ParticipantLeftNotificationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ParticipantLeftNotificationRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Call
     *
     * @return the CallRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.CallRequestBuilder call() {
        return new com.microsoft.graph.requests.CallRequestBuilder(getRequestUrlWithAdditionalSegment("call"), getClient(), null);
    }
}
