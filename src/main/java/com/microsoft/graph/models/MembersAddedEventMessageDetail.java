package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MembersAddedEventMessageDetail extends EventMessageDetail implements Parsable {
    /**
     * Initiator of the event.
     */
    private IdentitySet initiator;
    /**
     * List of members added.
     */
    private java.util.List<TeamworkUserIdentity> members;
    /**
     * The timestamp that denotes how far back a conversation's history is shared with the conversation members.
     */
    private OffsetDateTime visibleHistoryStartDateTime;
    /**
     * Instantiates a new membersAddedEventMessageDetail and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MembersAddedEventMessageDetail() {
        super();
        this.setOdataType("#microsoft.graph.membersAddedEventMessageDetail");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a membersAddedEventMessageDetail
     */
    @javax.annotation.Nonnull
    public static MembersAddedEventMessageDetail createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MembersAddedEventMessageDetail();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("initiator", (n) -> { this.setInitiator(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(TeamworkUserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("visibleHistoryStartDateTime", (n) -> { this.setVisibleHistoryStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the initiator property value. Initiator of the event.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getInitiator() {
        return this.initiator;
    }
    /**
     * Gets the members property value. List of members added.
     * @return a teamworkUserIdentity
     */
    @javax.annotation.Nullable
    public java.util.List<TeamworkUserIdentity> getMembers() {
        return this.members;
    }
    /**
     * Gets the visibleHistoryStartDateTime property value. The timestamp that denotes how far back a conversation's history is shared with the conversation members.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getVisibleHistoryStartDateTime() {
        return this.visibleHistoryStartDateTime;
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
        writer.writeObjectValue("initiator", this.getInitiator());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeOffsetDateTimeValue("visibleHistoryStartDateTime", this.getVisibleHistoryStartDateTime());
    }
    /**
     * Sets the initiator property value. Initiator of the event.
     * @param value Value to set for the initiator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInitiator(@javax.annotation.Nullable final IdentitySet value) {
        this.initiator = value;
    }
    /**
     * Sets the members property value. List of members added.
     * @param value Value to set for the members property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMembers(@javax.annotation.Nullable final java.util.List<TeamworkUserIdentity> value) {
        this.members = value;
    }
    /**
     * Sets the visibleHistoryStartDateTime property value. The timestamp that denotes how far back a conversation's history is shared with the conversation members.
     * @param value Value to set for the visibleHistoryStartDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVisibleHistoryStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.visibleHistoryStartDateTime = value;
    }
}
