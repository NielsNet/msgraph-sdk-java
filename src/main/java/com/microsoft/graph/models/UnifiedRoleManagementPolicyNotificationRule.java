package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementPolicyNotificationRule extends UnifiedRoleManagementPolicyRule implements Parsable {
    /**
     * Indicates whether a default recipient will receive the notification email.
     */
    private Boolean isDefaultRecipientsEnabled;
    /**
     * The level of notification. The possible values are None, Critical, All.
     */
    private String notificationLevel;
    /**
     * The list of recipients of the email notifications.
     */
    private java.util.List<String> notificationRecipients;
    /**
     * The type of notification. Only Email is supported.
     */
    private String notificationType;
    /**
     * The type of recipient of the notification. The possible values are Requestor, Approver, Admin.
     */
    private String recipientType;
    /**
     * Instantiates a new unifiedRoleManagementPolicyNotificationRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleManagementPolicyNotificationRule() {
        super();
        this.setOdataType("#microsoft.graph.unifiedRoleManagementPolicyNotificationRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleManagementPolicyNotificationRule
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleManagementPolicyNotificationRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementPolicyNotificationRule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isDefaultRecipientsEnabled", (n) -> { this.setIsDefaultRecipientsEnabled(n.getBooleanValue()); });
        deserializerMap.put("notificationLevel", (n) -> { this.setNotificationLevel(n.getStringValue()); });
        deserializerMap.put("notificationRecipients", (n) -> { this.setNotificationRecipients(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("notificationType", (n) -> { this.setNotificationType(n.getStringValue()); });
        deserializerMap.put("recipientType", (n) -> { this.setRecipientType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDefaultRecipientsEnabled property value. Indicates whether a default recipient will receive the notification email.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDefaultRecipientsEnabled() {
        return this.isDefaultRecipientsEnabled;
    }
    /**
     * Gets the notificationLevel property value. The level of notification. The possible values are None, Critical, All.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationLevel() {
        return this.notificationLevel;
    }
    /**
     * Gets the notificationRecipients property value. The list of recipients of the email notifications.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getNotificationRecipients() {
        return this.notificationRecipients;
    }
    /**
     * Gets the notificationType property value. The type of notification. Only Email is supported.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNotificationType() {
        return this.notificationType;
    }
    /**
     * Gets the recipientType property value. The type of recipient of the notification. The possible values are Requestor, Approver, Admin.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecipientType() {
        return this.recipientType;
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
        writer.writeBooleanValue("isDefaultRecipientsEnabled", this.getIsDefaultRecipientsEnabled());
        writer.writeStringValue("notificationLevel", this.getNotificationLevel());
        writer.writeCollectionOfPrimitiveValues("notificationRecipients", this.getNotificationRecipients());
        writer.writeStringValue("notificationType", this.getNotificationType());
        writer.writeStringValue("recipientType", this.getRecipientType());
    }
    /**
     * Sets the isDefaultRecipientsEnabled property value. Indicates whether a default recipient will receive the notification email.
     * @param value Value to set for the isDefaultRecipientsEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDefaultRecipientsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isDefaultRecipientsEnabled = value;
    }
    /**
     * Sets the notificationLevel property value. The level of notification. The possible values are None, Critical, All.
     * @param value Value to set for the notificationLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationLevel(@javax.annotation.Nullable final String value) {
        this.notificationLevel = value;
    }
    /**
     * Sets the notificationRecipients property value. The list of recipients of the email notifications.
     * @param value Value to set for the notificationRecipients property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationRecipients(@javax.annotation.Nullable final java.util.List<String> value) {
        this.notificationRecipients = value;
    }
    /**
     * Sets the notificationType property value. The type of notification. Only Email is supported.
     * @param value Value to set for the notificationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationType(@javax.annotation.Nullable final String value) {
        this.notificationType = value;
    }
    /**
     * Sets the recipientType property value. The type of recipient of the notification. The possible values are Requestor, Approver, Admin.
     * @param value Value to set for the recipientType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecipientType(@javax.annotation.Nullable final String value) {
        this.recipientType = value;
    }
}
