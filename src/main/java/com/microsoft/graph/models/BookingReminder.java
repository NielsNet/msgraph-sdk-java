// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.BookingReminderRecipients;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Reminder.
 */
public class BookingReminder implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Message.
     * The message in the reminder.
     */
    @SerializedName(value = "message", alternate = {"Message"})
    @Expose
	@Nullable
    public String message;

    /**
     * The Offset.
     * The amount of time before the start of an appointment that the reminder should be sent. It's denoted in ISO 8601 format.
     */
    @SerializedName(value = "offset", alternate = {"Offset"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration offset;

    /**
     * The Recipients.
     * The persons who should receive the reminder. Possible values are: allAttendees, staff, customer, unknownFutureValue.
     */
    @SerializedName(value = "recipients", alternate = {"Recipients"})
    @Expose
	@Nullable
    public BookingReminderRecipients recipients;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
