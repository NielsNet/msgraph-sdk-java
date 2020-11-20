// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.UserFindMeetingTimesRequest;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.AttendeeBase;
import com.microsoft.graph.models.extensions.LocationConstraint;
import com.microsoft.graph.models.extensions.TimeConstraint;
import com.microsoft.graph.models.extensions.MeetingTimeSuggestionsResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Find Meeting Times Request Builder.
 */
public class UserFindMeetingTimesRequestBuilder extends BaseActionRequestBuilder<MeetingTimeSuggestionsResult> {

    /**
     * The request builder for this UserFindMeetingTimes
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param attendees the attendees
     * @param locationConstraint the locationConstraint
     * @param timeConstraint the timeConstraint
     * @param meetingDuration the meetingDuration
     * @param maxCandidates the maxCandidates
     * @param isOrganizerOptional the isOrganizerOptional
     * @param returnSuggestionReasons the returnSuggestionReasons
     * @param minimumAttendeePercentage the minimumAttendeePercentage
     */
    public UserFindMeetingTimesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final java.util.List<AttendeeBase> attendees, @Nullable final LocationConstraint locationConstraint, @Nullable final TimeConstraint timeConstraint, @Nullable final javax.xml.datatype.Duration meetingDuration, @Nullable final Integer maxCandidates, @Nullable final Boolean isOrganizerOptional, @Nullable final Boolean returnSuggestionReasons, @Nullable final Double minimumAttendeePercentage) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("attendees", attendees);
        bodyParams.put("locationConstraint", locationConstraint);
        bodyParams.put("timeConstraint", timeConstraint);
        bodyParams.put("meetingDuration", meetingDuration);
        bodyParams.put("maxCandidates", maxCandidates);
        bodyParams.put("isOrganizerOptional", isOrganizerOptional);
        bodyParams.put("returnSuggestionReasons", returnSuggestionReasons);
        bodyParams.put("minimumAttendeePercentage", minimumAttendeePercentage);
    }

    /**
     * Creates the UserFindMeetingTimesRequest
     *
     * @param requestOptions the options for the request
     * @return the UserFindMeetingTimesRequest instance
     */
    @Nonnull
    public UserFindMeetingTimesRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the UserFindMeetingTimesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the UserFindMeetingTimesRequest instance
     */
    @Nonnull
    public UserFindMeetingTimesRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserFindMeetingTimesRequest request = new UserFindMeetingTimesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("attendees")) {
            request.body.attendees = getParameter("attendees");
        }

        if (hasParameter("locationConstraint")) {
            request.body.locationConstraint = getParameter("locationConstraint");
        }

        if (hasParameter("timeConstraint")) {
            request.body.timeConstraint = getParameter("timeConstraint");
        }

        if (hasParameter("meetingDuration")) {
            request.body.meetingDuration = getParameter("meetingDuration");
        }

        if (hasParameter("maxCandidates")) {
            request.body.maxCandidates = getParameter("maxCandidates");
        }

        if (hasParameter("isOrganizerOptional")) {
            request.body.isOrganizerOptional = getParameter("isOrganizerOptional");
        }

        if (hasParameter("returnSuggestionReasons")) {
            request.body.returnSuggestionReasons = getParameter("returnSuggestionReasons");
        }

        if (hasParameter("minimumAttendeePercentage")) {
            request.body.minimumAttendeePercentage = getParameter("minimumAttendeePercentage");
        }

        return request;
    }
}
