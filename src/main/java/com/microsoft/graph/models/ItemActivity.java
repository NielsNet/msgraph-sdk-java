package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemActivity extends Entity implements Parsable {
    /**
     * An item was accessed.
     */
    private AccessAction access;
    /**
     * Details about when the activity took place. Read-only.
     */
    private OffsetDateTime activityDateTime;
    /**
     * Identity of who performed the action. Read-only.
     */
    private IdentitySet actor;
    /**
     * Exposes the driveItem that was the target of this activity.
     */
    private DriveItem driveItem;
    /**
     * Instantiates a new itemActivity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ItemActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemActivity
     */
    @javax.annotation.Nonnull
    public static ItemActivity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemActivity();
    }
    /**
     * Gets the access property value. An item was accessed.
     * @return a accessAction
     */
    @javax.annotation.Nullable
    public AccessAction getAccess() {
        return this.access;
    }
    /**
     * Gets the activityDateTime property value. Details about when the activity took place. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getActivityDateTime() {
        return this.activityDateTime;
    }
    /**
     * Gets the actor property value. Identity of who performed the action. Read-only.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getActor() {
        return this.actor;
    }
    /**
     * Gets the driveItem property value. Exposes the driveItem that was the target of this activity.
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public DriveItem getDriveItem() {
        return this.driveItem;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("access", (n) -> { this.setAccess(n.getObjectValue(AccessAction::createFromDiscriminatorValue)); });
        deserializerMap.put("activityDateTime", (n) -> { this.setActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("actor", (n) -> { this.setActor(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("driveItem", (n) -> { this.setDriveItem(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
        return deserializerMap;
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
        writer.writeObjectValue("access", this.getAccess());
        writer.writeOffsetDateTimeValue("activityDateTime", this.getActivityDateTime());
        writer.writeObjectValue("actor", this.getActor());
        writer.writeObjectValue("driveItem", this.getDriveItem());
    }
    /**
     * Sets the access property value. An item was accessed.
     * @param value Value to set for the access property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccess(@javax.annotation.Nullable final AccessAction value) {
        this.access = value;
    }
    /**
     * Sets the activityDateTime property value. Details about when the activity took place. Read-only.
     * @param value Value to set for the activityDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.activityDateTime = value;
    }
    /**
     * Sets the actor property value. Identity of who performed the action. Read-only.
     * @param value Value to set for the actor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActor(@javax.annotation.Nullable final IdentitySet value) {
        this.actor = value;
    }
    /**
     * Sets the driveItem property value. Exposes the driveItem that was the target of this activity.
     * @param value Value to set for the driveItem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDriveItem(@javax.annotation.Nullable final DriveItem value) {
        this.driveItem = value;
    }
}
