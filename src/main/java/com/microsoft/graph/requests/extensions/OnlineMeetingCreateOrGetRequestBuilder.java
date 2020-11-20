// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.OnlineMeetingCreateOrGetRequest;
import com.microsoft.graph.models.extensions.ChatInfo;
import com.microsoft.graph.models.extensions.MeetingParticipants;
import com.microsoft.graph.models.extensions.OnlineMeeting;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Online Meeting Create Or Get Request Builder.
 */
public class OnlineMeetingCreateOrGetRequestBuilder extends BaseActionRequestBuilder<OnlineMeeting> {

    /**
     * The request builder for this OnlineMeetingCreateOrGet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param chatInfo the chatInfo
     * @param endDateTime the endDateTime
     * @param externalId the externalId
     * @param participants the participants
     * @param startDateTime the startDateTime
     * @param subject the subject
     */
    public OnlineMeetingCreateOrGetRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final ChatInfo chatInfo, @Nullable final java.util.Calendar endDateTime, @Nullable final String externalId, @Nullable final MeetingParticipants participants, @Nullable final java.util.Calendar startDateTime, @Nullable final String subject) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("chatInfo", chatInfo);
        bodyParams.put("endDateTime", endDateTime);
        bodyParams.put("externalId", externalId);
        bodyParams.put("participants", participants);
        bodyParams.put("startDateTime", startDateTime);
        bodyParams.put("subject", subject);
    }

    /**
     * Creates the OnlineMeetingCreateOrGetRequest
     *
     * @param requestOptions the options for the request
     * @return the OnlineMeetingCreateOrGetRequest instance
     */
    @Nonnull
    public OnlineMeetingCreateOrGetRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the OnlineMeetingCreateOrGetRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the OnlineMeetingCreateOrGetRequest instance
     */
    @Nonnull
    public OnlineMeetingCreateOrGetRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        OnlineMeetingCreateOrGetRequest request = new OnlineMeetingCreateOrGetRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("chatInfo")) {
            request.body.chatInfo = getParameter("chatInfo");
        }

        if (hasParameter("endDateTime")) {
            request.body.endDateTime = getParameter("endDateTime");
        }

        if (hasParameter("externalId")) {
            request.body.externalId = getParameter("externalId");
        }

        if (hasParameter("participants")) {
            request.body.participants = getParameter("participants");
        }

        if (hasParameter("startDateTime")) {
            request.body.startDateTime = getParameter("startDateTime");
        }

        if (hasParameter("subject")) {
            request.body.subject = getParameter("subject");
        }

        return request;
    }
}
