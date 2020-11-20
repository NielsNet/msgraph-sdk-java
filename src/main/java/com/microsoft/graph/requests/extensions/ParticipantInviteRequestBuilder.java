// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ParticipantInviteRequest;
import com.microsoft.graph.models.extensions.Participant;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.models.extensions.InviteParticipantsOperation;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant Invite Request Builder.
 */
public class ParticipantInviteRequestBuilder extends BaseActionRequestBuilder<InviteParticipantsOperation> {

    /**
     * The request builder for this ParticipantInvite
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param participants the participants
     * @param clientContext the clientContext
     */
    public ParticipantInviteRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final java.util.List<InvitationParticipantInfo> participants, @Nullable final String clientContext) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("participants", participants);
        bodyParams.put("clientContext", clientContext);
    }

    /**
     * Creates the ParticipantInviteRequest
     *
     * @param requestOptions the options for the request
     * @return the ParticipantInviteRequest instance
     */
    @Nonnull
    public ParticipantInviteRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ParticipantInviteRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ParticipantInviteRequest instance
     */
    @Nonnull
    public ParticipantInviteRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ParticipantInviteRequest request = new ParticipantInviteRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("participants")) {
            request.body.participants = getParameter("participants");
        }

        if (hasParameter("clientContext")) {
            request.body.clientContext = getParameter("clientContext");
        }

        return request;
    }
}
