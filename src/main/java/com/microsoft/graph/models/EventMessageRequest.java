package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EventMessageRequest extends EventMessage implements Parsable {
    /**
     * True if the meeting organizer allows invitees to propose a new time when responding, false otherwise. Optional. Default is true.
     */
    private Boolean allowNewTimeProposals;
    /**
     * The meetingRequestType property
     */
    private MeetingRequestType meetingRequestType;
    /**
     * If the meeting update changes the meeting end time, this property specifies the previous meeting end time.
     */
    private DateTimeTimeZone previousEndDateTime;
    /**
     * If the meeting update changes the meeting location, this property specifies the previous meeting location.
     */
    private Location previousLocation;
    /**
     * If the meeting update changes the meeting start time, this property specifies the previous meeting start time.
     */
    private DateTimeTimeZone previousStartDateTime;
    /**
     * Set to true if the sender would like the invitee to send a response to the requested meeting.
     */
    private Boolean responseRequested;
    /**
     * Instantiates a new eventMessageRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EventMessageRequest() {
        super();
        this.setOdataType("#microsoft.graph.eventMessageRequest");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a eventMessageRequest
     */
    @javax.annotation.Nonnull
    public static EventMessageRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EventMessageRequest();
    }
    /**
     * Gets the allowNewTimeProposals property value. True if the meeting organizer allows invitees to propose a new time when responding, false otherwise. Optional. Default is true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowNewTimeProposals() {
        return this.allowNewTimeProposals;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowNewTimeProposals", (n) -> { this.setAllowNewTimeProposals(n.getBooleanValue()); });
        deserializerMap.put("meetingRequestType", (n) -> { this.setMeetingRequestType(n.getEnumValue(MeetingRequestType.class)); });
        deserializerMap.put("previousEndDateTime", (n) -> { this.setPreviousEndDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("previousLocation", (n) -> { this.setPreviousLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("previousStartDateTime", (n) -> { this.setPreviousStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("responseRequested", (n) -> { this.setResponseRequested(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the meetingRequestType property value. The meetingRequestType property
     * @return a meetingRequestType
     */
    @javax.annotation.Nullable
    public MeetingRequestType getMeetingRequestType() {
        return this.meetingRequestType;
    }
    /**
     * Gets the previousEndDateTime property value. If the meeting update changes the meeting end time, this property specifies the previous meeting end time.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getPreviousEndDateTime() {
        return this.previousEndDateTime;
    }
    /**
     * Gets the previousLocation property value. If the meeting update changes the meeting location, this property specifies the previous meeting location.
     * @return a location
     */
    @javax.annotation.Nullable
    public Location getPreviousLocation() {
        return this.previousLocation;
    }
    /**
     * Gets the previousStartDateTime property value. If the meeting update changes the meeting start time, this property specifies the previous meeting start time.
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getPreviousStartDateTime() {
        return this.previousStartDateTime;
    }
    /**
     * Gets the responseRequested property value. Set to true if the sender would like the invitee to send a response to the requested meeting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getResponseRequested() {
        return this.responseRequested;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowNewTimeProposals", this.getAllowNewTimeProposals());
        writer.writeEnumValue("meetingRequestType", this.getMeetingRequestType());
        writer.writeObjectValue("previousEndDateTime", this.getPreviousEndDateTime());
        writer.writeObjectValue("previousLocation", this.getPreviousLocation());
        writer.writeObjectValue("previousStartDateTime", this.getPreviousStartDateTime());
        writer.writeBooleanValue("responseRequested", this.getResponseRequested());
    }
    /**
     * Sets the allowNewTimeProposals property value. True if the meeting organizer allows invitees to propose a new time when responding, false otherwise. Optional. Default is true.
     * @param value Value to set for the allowNewTimeProposals property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowNewTimeProposals(@javax.annotation.Nullable final Boolean value) {
        this.allowNewTimeProposals = value;
    }
    /**
     * Sets the meetingRequestType property value. The meetingRequestType property
     * @param value Value to set for the meetingRequestType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeetingRequestType(@javax.annotation.Nullable final MeetingRequestType value) {
        this.meetingRequestType = value;
    }
    /**
     * Sets the previousEndDateTime property value. If the meeting update changes the meeting end time, this property specifies the previous meeting end time.
     * @param value Value to set for the previousEndDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreviousEndDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.previousEndDateTime = value;
    }
    /**
     * Sets the previousLocation property value. If the meeting update changes the meeting location, this property specifies the previous meeting location.
     * @param value Value to set for the previousLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreviousLocation(@javax.annotation.Nullable final Location value) {
        this.previousLocation = value;
    }
    /**
     * Sets the previousStartDateTime property value. If the meeting update changes the meeting start time, this property specifies the previous meeting start time.
     * @param value Value to set for the previousStartDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreviousStartDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.previousStartDateTime = value;
    }
    /**
     * Sets the responseRequested property value. Set to true if the sender would like the invitee to send a response to the requested meeting.
     * @param value Value to set for the responseRequested property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResponseRequested(@javax.annotation.Nullable final Boolean value) {
        this.responseRequested = value;
    }
}
