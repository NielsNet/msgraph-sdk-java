// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.CalendarRoleType;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.CalendarAllowedCalendarSharingRolesCollectionRequestBuilder;
import com.microsoft.graph.requests.CalendarAllowedCalendarSharingRolesCollectionPage;
import com.microsoft.graph.requests.CalendarAllowedCalendarSharingRolesCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Allowed Calendar Sharing Roles Collection Page.
 */
public class CalendarAllowedCalendarSharingRolesCollectionPage extends BaseCollectionPage<CalendarRoleType, CalendarAllowedCalendarSharingRolesCollectionRequestBuilder> {

    /**
     * A collection page for CalendarRoleType.
     *
     * @param response The serialized CalendarAllowedCalendarSharingRolesCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public CalendarAllowedCalendarSharingRolesCollectionPage(@Nonnull final CalendarAllowedCalendarSharingRolesCollectionResponse response, @Nonnull final CalendarAllowedCalendarSharingRolesCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for CalendarAllowedCalendarSharingRoles
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CalendarAllowedCalendarSharingRolesCollectionPage(@Nonnull final java.util.List<CalendarRoleType> pageContents, @Nullable final CalendarAllowedCalendarSharingRolesCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
