// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.generated.CalendarRoleType;


import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.http.BaseCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Calendar Allowed Calendar Sharing Roles Collection Response.
 */
public class CalendarAllowedCalendarSharingRolesCollectionResponse extends BaseCollectionResponse<CalendarRoleType> {

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    @Override
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;
    }
}
