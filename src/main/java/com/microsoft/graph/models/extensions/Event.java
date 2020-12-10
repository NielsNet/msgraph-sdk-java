// Template Source: Templates\Java\models_extensions\BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.Attendee;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.generated.Importance;
import com.microsoft.graph.models.extensions.Location;
import com.microsoft.graph.models.extensions.OnlineMeetingInfo;
import com.microsoft.graph.models.generated.OnlineMeetingProviderType;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.models.extensions.PatternedRecurrence;
import com.microsoft.graph.models.extensions.ResponseStatus;
import com.microsoft.graph.models.generated.Sensitivity;
import com.microsoft.graph.models.generated.FreeBusyStatus;
import com.microsoft.graph.models.generated.EventType;
import com.microsoft.graph.models.extensions.Attachment;
import com.microsoft.graph.models.extensions.Calendar;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.Event;
import com.microsoft.graph.models.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.OutlookItem;
import com.microsoft.graph.requests.extensions.AttachmentCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.EventCollectionPage;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Event.
 */
public class Event extends OutlookItem implements IJsonBackedObject {


    /**
     * The Allow New Time Proposals.
     * True if the meeting organizer allows invitees to propose a new time when responding, false otherwise. Optional. Default is true.
     */
    @SerializedName(value = "allowNewTimeProposals", alternate = {"AllowNewTimeProposals"})
    @Expose
	@Nullable
    public Boolean allowNewTimeProposals;

    /**
     * The Attendees.
     * The collection of attendees for the event.
     */
    @SerializedName(value = "attendees", alternate = {"Attendees"})
    @Expose
	@Nullable
    public java.util.List<Attendee> attendees;

    /**
     * The Body.
     * The body of the message associated with the event. It can be in HTML or text format.
     */
    @SerializedName(value = "body", alternate = {"Body"})
    @Expose
	@Nullable
    public ItemBody body;

    /**
     * The Body Preview.
     * The preview of the message associated with the event. It is in text format.
     */
    @SerializedName(value = "bodyPreview", alternate = {"BodyPreview"})
    @Expose
	@Nullable
    public String bodyPreview;

    /**
     * The End.
     * The date, time, and time zone that the event ends. By default, the end time is in UTC.
     */
    @SerializedName(value = "end", alternate = {"End"})
    @Expose
	@Nullable
    public DateTimeTimeZone end;

    /**
     * The Has Attachments.
     * Set to true if the event has attachments.
     */
    @SerializedName(value = "hasAttachments", alternate = {"HasAttachments"})
    @Expose
	@Nullable
    public Boolean hasAttachments;

    /**
     * The Hide Attendees.
     * 
     */
    @SerializedName(value = "hideAttendees", alternate = {"HideAttendees"})
    @Expose
	@Nullable
    public Boolean hideAttendees;

    /**
     * The ICal UId.
     * A unique identifier for an event across calendars. This ID is different for each occurrence in a recurring series. Read-only.
     */
    @SerializedName(value = "iCalUId", alternate = {"ICalUId"})
    @Expose
	@Nullable
    public String iCalUId;

    /**
     * The Importance.
     * The importance of the event. The possible values are: low, normal, high.
     */
    @SerializedName(value = "importance", alternate = {"Importance"})
    @Expose
	@Nullable
    public Importance importance;

    /**
     * The Is All Day.
     * Set to true if the event lasts all day.
     */
    @SerializedName(value = "isAllDay", alternate = {"IsAllDay"})
    @Expose
	@Nullable
    public Boolean isAllDay;

    /**
     * The Is Cancelled.
     * Set to true if the event has been canceled.
     */
    @SerializedName(value = "isCancelled", alternate = {"IsCancelled"})
    @Expose
	@Nullable
    public Boolean isCancelled;

    /**
     * The Is Draft.
     * 
     */
    @SerializedName(value = "isDraft", alternate = {"IsDraft"})
    @Expose
	@Nullable
    public Boolean isDraft;

    /**
     * The Is Online Meeting.
     * True if this event has online meeting information, false otherwise. Default is false. Optional.
     */
    @SerializedName(value = "isOnlineMeeting", alternate = {"IsOnlineMeeting"})
    @Expose
	@Nullable
    public Boolean isOnlineMeeting;

    /**
     * The Is Organizer.
     * Set to true if the calendar owner (specified by the owner property of the calendar) is the organizer of the event (specified by the organizer property of the event). This also applies if a delegate organized the event on behalf of the owner.
     */
    @SerializedName(value = "isOrganizer", alternate = {"IsOrganizer"})
    @Expose
	@Nullable
    public Boolean isOrganizer;

    /**
     * The Is Reminder On.
     * Set to true if an alert is set to remind the user of the event.
     */
    @SerializedName(value = "isReminderOn", alternate = {"IsReminderOn"})
    @Expose
	@Nullable
    public Boolean isReminderOn;

    /**
     * The Location.
     * The location of the event.
     */
    @SerializedName(value = "location", alternate = {"Location"})
    @Expose
	@Nullable
    public Location location;

    /**
     * The Locations.
     * The locations where the event is held or attended from. The location and locations properties always correspond with each other. If you update the location property, any prior locations in the locations collection would be removed and replaced by the new location value.
     */
    @SerializedName(value = "locations", alternate = {"Locations"})
    @Expose
	@Nullable
    public java.util.List<Location> locations;

    /**
     * The Online Meeting.
     * Details for an attendee to join the meeting online. Read-only.
     */
    @SerializedName(value = "onlineMeeting", alternate = {"OnlineMeeting"})
    @Expose
	@Nullable
    public OnlineMeetingInfo onlineMeeting;

    /**
     * The Online Meeting Provider.
     * Represents the online meeting service provider. The possible values are teamsForBusiness, skypeForBusiness, and skypeForConsumer. Optional.
     */
    @SerializedName(value = "onlineMeetingProvider", alternate = {"OnlineMeetingProvider"})
    @Expose
	@Nullable
    public OnlineMeetingProviderType onlineMeetingProvider;

    /**
     * The Online Meeting Url.
     * A URL for an online meeting. The property is set only when an organizer specifies an event as an online meeting such as a Skype meeting. Read-only.
     */
    @SerializedName(value = "onlineMeetingUrl", alternate = {"OnlineMeetingUrl"})
    @Expose
	@Nullable
    public String onlineMeetingUrl;

    /**
     * The Organizer.
     * The organizer of the event.
     */
    @SerializedName(value = "organizer", alternate = {"Organizer"})
    @Expose
	@Nullable
    public Recipient organizer;

    /**
     * The Original End Time Zone.
     * The end time zone that was set when the event was created. A value of tzone://Microsoft/Custom indicates that a legacy custom time zone was set in desktop Outlook.
     */
    @SerializedName(value = "originalEndTimeZone", alternate = {"OriginalEndTimeZone"})
    @Expose
	@Nullable
    public String originalEndTimeZone;

    /**
     * The Original Start.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "originalStart", alternate = {"OriginalStart"})
    @Expose
	@Nullable
    public java.util.Calendar originalStart;

    /**
     * The Original Start Time Zone.
     * The start time zone that was set when the event was created. A value of tzone://Microsoft/Custom indicates that a legacy custom time zone was set in desktop Outlook.
     */
    @SerializedName(value = "originalStartTimeZone", alternate = {"OriginalStartTimeZone"})
    @Expose
	@Nullable
    public String originalStartTimeZone;

    /**
     * The Recurrence.
     * The recurrence pattern for the event.
     */
    @SerializedName(value = "recurrence", alternate = {"Recurrence"})
    @Expose
	@Nullable
    public PatternedRecurrence recurrence;

    /**
     * The Reminder Minutes Before Start.
     * The number of minutes before the event start time that the reminder alert occurs.
     */
    @SerializedName(value = "reminderMinutesBeforeStart", alternate = {"ReminderMinutesBeforeStart"})
    @Expose
	@Nullable
    public Integer reminderMinutesBeforeStart;

    /**
     * The Response Requested.
     * Default is true, which represents the organizer would like an invitee to send a response to the event.
     */
    @SerializedName(value = "responseRequested", alternate = {"ResponseRequested"})
    @Expose
	@Nullable
    public Boolean responseRequested;

    /**
     * The Response Status.
     * Indicates the type of response sent in response to an event message.
     */
    @SerializedName(value = "responseStatus", alternate = {"ResponseStatus"})
    @Expose
	@Nullable
    public ResponseStatus responseStatus;

    /**
     * The Sensitivity.
     * The possible values are: normal, personal, private, confidential.
     */
    @SerializedName(value = "sensitivity", alternate = {"Sensitivity"})
    @Expose
	@Nullable
    public Sensitivity sensitivity;

    /**
     * The Series Master Id.
     * The ID for the recurring series master item, if this event is part of a recurring series.
     */
    @SerializedName(value = "seriesMasterId", alternate = {"SeriesMasterId"})
    @Expose
	@Nullable
    public String seriesMasterId;

    /**
     * The Show As.
     * The status to show. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
     */
    @SerializedName(value = "showAs", alternate = {"ShowAs"})
    @Expose
	@Nullable
    public FreeBusyStatus showAs;

    /**
     * The Start.
     * The date, time, and time zone that the event starts. By default, the start time is in UTC.
     */
    @SerializedName(value = "start", alternate = {"Start"})
    @Expose
	@Nullable
    public DateTimeTimeZone start;

    /**
     * The Subject.
     * The text of the event's subject line.
     */
    @SerializedName(value = "subject", alternate = {"Subject"})
    @Expose
	@Nullable
    public String subject;

    /**
     * The Transaction Id.
     * A custom identifier specified by a client app for the server to avoid redundant POST operations in case of client retries to create the same event. This is useful when low network connectivity causes the client to time out before receiving a response from the server for the client's prior create-event request. After you set transactionId when creating an event, you cannot change transactionId in a subsequent update. This property is only returned in a response payload if an app has set it. Optional.
     */
    @SerializedName(value = "transactionId", alternate = {"TransactionId"})
    @Expose
	@Nullable
    public String transactionId;

    /**
     * The Type.
     * The event type. The possible values are: singleInstance, occurrence, exception, seriesMaster. Read-only.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public EventType type;

    /**
     * The Web Link.
     * The URL to open the event in Outlook on the web.Outlook on the web opens the event in the browser if you are signed in to your mailbox. Otherwise, Outlook on the web prompts you to sign in.This URL cannot be accessed from within an iFrame.
     */
    @SerializedName(value = "webLink", alternate = {"WebLink"})
    @Expose
	@Nullable
    public String webLink;

    /**
     * The Attachments.
     * The collection of fileAttachment and itemAttachment attachments for the event. Navigation property. Read-only. Nullable.
     */
    @SerializedName(value = "attachments", alternate = {"Attachments"})
    @Expose
	@Nullable
    public AttachmentCollectionPage attachments;

    /**
     * The Calendar.
     * The calendar that contains the event. Navigation property. Read-only.
     */
    @SerializedName(value = "calendar", alternate = {"Calendar"})
    @Expose
	@Nullable
    public Calendar calendar;

    /**
     * The Extensions.
     * The collection of open extensions defined for the event. Read-only. Nullable.
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
	@Nullable
    public ExtensionCollectionPage extensions;

    /**
     * The Instances.
     * The instances of the event. Navigation property. Read-only. Nullable.
     */
    @SerializedName(value = "instances", alternate = {"Instances"})
    @Expose
	@Nullable
    public EventCollectionPage instances;

    /**
     * The Multi Value Extended Properties.
     * The collection of multi-value extended properties defined for the event. Read-only. Nullable.
     */
    @SerializedName(value = "multiValueExtendedProperties", alternate = {"MultiValueExtendedProperties"})
    @Expose
	@Nullable
    public MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;

    /**
     * The Single Value Extended Properties.
     * The collection of single-value extended properties defined for the event. Read-only. Nullable.
     */
    @SerializedName(value = "singleValueExtendedProperties", alternate = {"SingleValueExtendedProperties"})
    @Expose
	@Nullable
    public SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("attachments")) {
            attachments = serializer.deserializeObject(json.get("attachments").toString(), AttachmentCollectionPage.class);
        }

        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions").toString(), ExtensionCollectionPage.class);
        }

        if (json.has("instances")) {
            instances = serializer.deserializeObject(json.get("instances").toString(), EventCollectionPage.class);
        }

        if (json.has("multiValueExtendedProperties")) {
            multiValueExtendedProperties = serializer.deserializeObject(json.get("multiValueExtendedProperties").toString(), MultiValueLegacyExtendedPropertyCollectionPage.class);
        }

        if (json.has("singleValueExtendedProperties")) {
            singleValueExtendedProperties = serializer.deserializeObject(json.get("singleValueExtendedProperties").toString(), SingleValueLegacyExtendedPropertyCollectionPage.class);
        }
    }
}
