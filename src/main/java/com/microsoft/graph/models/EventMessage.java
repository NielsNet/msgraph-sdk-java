package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EventMessage extends Message implements Parsable {
    /**
     * The endDateTime property
     */
    private DateTimeTimeZone endDateTime;
    /**
     * The event associated with the event message. The assumption for attendees or room resources is that the Calendar Attendant is set to automatically update the calendar with an event when meeting request event messages arrive. Navigation property.  Read-only.
     */
    private Event event;
    /**
     * The isAllDay property
     */
    private Boolean isAllDay;
    /**
     * The isDelegated property
     */
    private Boolean isDelegated;
    /**
     * The isOutOfDate property
     */
    private Boolean isOutOfDate;
    /**
     * The location property
     */
    private Location location;
    /**
     * The meetingMessageType property
     */
    private MeetingMessageType meetingMessageType;
    /**
     * The recurrence property
     */
    private PatternedRecurrence recurrence;
    /**
     * The startDateTime property
     */
    private DateTimeTimeZone startDateTime;
    /**
     * The type property
     */
    private EventType type;
    /**
     * Instantiates a new eventMessage and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EventMessage() {
        super();
        this.setOdataType("#microsoft.graph.eventMessage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a eventMessage
     */
    @javax.annotation.Nonnull
    public static EventMessage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.eventMessageRequest": return new EventMessageRequest();
                case "#microsoft.graph.eventMessageResponse": return new EventMessageResponse();
            }
        }
        return new EventMessage();
    }
    /**
     * Gets the endDateTime property value. The endDateTime property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * Gets the event property value. The event associated with the event message. The assumption for attendees or room resources is that the Calendar Attendant is set to automatically update the calendar with an event when meeting request event messages arrive. Navigation property.  Read-only.
     * @return a event
     */
    @javax.annotation.Nullable
    public Event getEvent() {
        return this.event;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("event", (n) -> { this.setEvent(n.getObjectValue(Event::createFromDiscriminatorValue)); });
        deserializerMap.put("isAllDay", (n) -> { this.setIsAllDay(n.getBooleanValue()); });
        deserializerMap.put("isDelegated", (n) -> { this.setIsDelegated(n.getBooleanValue()); });
        deserializerMap.put("isOutOfDate", (n) -> { this.setIsOutOfDate(n.getBooleanValue()); });
        deserializerMap.put("location", (n) -> { this.setLocation(n.getObjectValue(Location::createFromDiscriminatorValue)); });
        deserializerMap.put("meetingMessageType", (n) -> { this.setMeetingMessageType(n.getEnumValue(MeetingMessageType.class)); });
        deserializerMap.put("recurrence", (n) -> { this.setRecurrence(n.getObjectValue(PatternedRecurrence::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getObjectValue(DateTimeTimeZone::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(EventType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isAllDay property value. The isAllDay property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAllDay() {
        return this.isAllDay;
    }
    /**
     * Gets the isDelegated property value. The isDelegated property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDelegated() {
        return this.isDelegated;
    }
    /**
     * Gets the isOutOfDate property value. The isOutOfDate property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOutOfDate() {
        return this.isOutOfDate;
    }
    /**
     * Gets the location property value. The location property
     * @return a location
     */
    @javax.annotation.Nullable
    public Location getLocation() {
        return this.location;
    }
    /**
     * Gets the meetingMessageType property value. The meetingMessageType property
     * @return a meetingMessageType
     */
    @javax.annotation.Nullable
    public MeetingMessageType getMeetingMessageType() {
        return this.meetingMessageType;
    }
    /**
     * Gets the recurrence property value. The recurrence property
     * @return a patternedRecurrence
     */
    @javax.annotation.Nullable
    public PatternedRecurrence getRecurrence() {
        return this.recurrence;
    }
    /**
     * Gets the startDateTime property value. The startDateTime property
     * @return a dateTimeTimeZone
     */
    @javax.annotation.Nullable
    public DateTimeTimeZone getStartDateTime() {
        return this.startDateTime;
    }
    /**
     * Gets the type property value. The type property
     * @return a eventType
     */
    @javax.annotation.Nullable
    public EventType getType() {
        return this.type;
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
        writer.writeObjectValue("endDateTime", this.getEndDateTime());
        writer.writeObjectValue("event", this.getEvent());
        writer.writeBooleanValue("isAllDay", this.getIsAllDay());
        writer.writeBooleanValue("isDelegated", this.getIsDelegated());
        writer.writeBooleanValue("isOutOfDate", this.getIsOutOfDate());
        writer.writeObjectValue("location", this.getLocation());
        writer.writeEnumValue("meetingMessageType", this.getMeetingMessageType());
        writer.writeObjectValue("recurrence", this.getRecurrence());
        writer.writeObjectValue("startDateTime", this.getStartDateTime());
        writer.writeEnumValue("type", this.getType());
    }
    /**
     * Sets the endDateTime property value. The endDateTime property
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.endDateTime = value;
    }
    /**
     * Sets the event property value. The event associated with the event message. The assumption for attendees or room resources is that the Calendar Attendant is set to automatically update the calendar with an event when meeting request event messages arrive. Navigation property.  Read-only.
     * @param value Value to set for the event property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEvent(@javax.annotation.Nullable final Event value) {
        this.event = value;
    }
    /**
     * Sets the isAllDay property value. The isAllDay property
     * @param value Value to set for the isAllDay property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAllDay(@javax.annotation.Nullable final Boolean value) {
        this.isAllDay = value;
    }
    /**
     * Sets the isDelegated property value. The isDelegated property
     * @param value Value to set for the isDelegated property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDelegated(@javax.annotation.Nullable final Boolean value) {
        this.isDelegated = value;
    }
    /**
     * Sets the isOutOfDate property value. The isOutOfDate property
     * @param value Value to set for the isOutOfDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsOutOfDate(@javax.annotation.Nullable final Boolean value) {
        this.isOutOfDate = value;
    }
    /**
     * Sets the location property value. The location property
     * @param value Value to set for the location property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocation(@javax.annotation.Nullable final Location value) {
        this.location = value;
    }
    /**
     * Sets the meetingMessageType property value. The meetingMessageType property
     * @param value Value to set for the meetingMessageType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMeetingMessageType(@javax.annotation.Nullable final MeetingMessageType value) {
        this.meetingMessageType = value;
    }
    /**
     * Sets the recurrence property value. The recurrence property
     * @param value Value to set for the recurrence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecurrence(@javax.annotation.Nullable final PatternedRecurrence value) {
        this.recurrence = value;
    }
    /**
     * Sets the startDateTime property value. The startDateTime property
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final DateTimeTimeZone value) {
        this.startDateTime = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final EventType value) {
        this.type = value;
    }
}
