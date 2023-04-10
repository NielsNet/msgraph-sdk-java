package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryCustodian extends DataSourceContainer implements Parsable {
    /** Date and time the custodian acknowledged a hold notification. */
    private OffsetDateTime acknowledgedDateTime;
    /** Email address of the custodian. */
    private String email;
    /** Operation entity that represents the latest indexing for the custodian. */
    private EdiscoveryIndexOperation lastIndexOperation;
    /** Data source entity for SharePoint sites associated with the custodian. */
    private java.util.List<SiteSource> siteSources;
    /** Data source entity for groups associated with the custodian. */
    private java.util.List<UnifiedGroupSource> unifiedGroupSources;
    /** Data source entity for a the custodian. This is the container for a custodian's mailbox and OneDrive for Business site. */
    private java.util.List<UserSource> userSources;
    /**
     * Instantiates a new EdiscoveryCustodian and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryCustodian() {
        super();
        this.setOdataType("#microsoft.graph.security.ediscoveryCustodian");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EdiscoveryCustodian
     */
    @javax.annotation.Nonnull
    public static EdiscoveryCustodian createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryCustodian();
    }
    /**
     * Gets the acknowledgedDateTime property value. Date and time the custodian acknowledged a hold notification.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getAcknowledgedDateTime() {
        return this.acknowledgedDateTime;
    }
    /**
     * Gets the email property value. Email address of the custodian.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return this.email;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("acknowledgedDateTime", (n) -> { this.setAcknowledgedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("lastIndexOperation", (n) -> { this.setLastIndexOperation(n.getObjectValue(EdiscoveryIndexOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("siteSources", (n) -> { this.setSiteSources(n.getCollectionOfObjectValues(SiteSource::createFromDiscriminatorValue)); });
        deserializerMap.put("unifiedGroupSources", (n) -> { this.setUnifiedGroupSources(n.getCollectionOfObjectValues(UnifiedGroupSource::createFromDiscriminatorValue)); });
        deserializerMap.put("userSources", (n) -> { this.setUserSources(n.getCollectionOfObjectValues(UserSource::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastIndexOperation property value. Operation entity that represents the latest indexing for the custodian.
     * @return a ediscoveryIndexOperation
     */
    @javax.annotation.Nullable
    public EdiscoveryIndexOperation getLastIndexOperation() {
        return this.lastIndexOperation;
    }
    /**
     * Gets the siteSources property value. Data source entity for SharePoint sites associated with the custodian.
     * @return a siteSource
     */
    @javax.annotation.Nullable
    public java.util.List<SiteSource> getSiteSources() {
        return this.siteSources;
    }
    /**
     * Gets the unifiedGroupSources property value. Data source entity for groups associated with the custodian.
     * @return a unifiedGroupSource
     */
    @javax.annotation.Nullable
    public java.util.List<UnifiedGroupSource> getUnifiedGroupSources() {
        return this.unifiedGroupSources;
    }
    /**
     * Gets the userSources property value. Data source entity for a the custodian. This is the container for a custodian's mailbox and OneDrive for Business site.
     * @return a userSource
     */
    @javax.annotation.Nullable
    public java.util.List<UserSource> getUserSources() {
        return this.userSources;
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
        writer.writeOffsetDateTimeValue("acknowledgedDateTime", this.getAcknowledgedDateTime());
        writer.writeStringValue("email", this.getEmail());
        writer.writeObjectValue("lastIndexOperation", this.getLastIndexOperation());
        writer.writeCollectionOfObjectValues("siteSources", this.getSiteSources());
        writer.writeCollectionOfObjectValues("unifiedGroupSources", this.getUnifiedGroupSources());
        writer.writeCollectionOfObjectValues("userSources", this.getUserSources());
    }
    /**
     * Sets the acknowledgedDateTime property value. Date and time the custodian acknowledged a hold notification.
     * @param value Value to set for the acknowledgedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAcknowledgedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.acknowledgedDateTime = value;
    }
    /**
     * Sets the email property value. Email address of the custodian.
     * @param value Value to set for the email property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmail(@javax.annotation.Nullable final String value) {
        this.email = value;
    }
    /**
     * Sets the lastIndexOperation property value. Operation entity that represents the latest indexing for the custodian.
     * @param value Value to set for the lastIndexOperation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastIndexOperation(@javax.annotation.Nullable final EdiscoveryIndexOperation value) {
        this.lastIndexOperation = value;
    }
    /**
     * Sets the siteSources property value. Data source entity for SharePoint sites associated with the custodian.
     * @param value Value to set for the siteSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteSources(@javax.annotation.Nullable final java.util.List<SiteSource> value) {
        this.siteSources = value;
    }
    /**
     * Sets the unifiedGroupSources property value. Data source entity for groups associated with the custodian.
     * @param value Value to set for the unifiedGroupSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUnifiedGroupSources(@javax.annotation.Nullable final java.util.List<UnifiedGroupSource> value) {
        this.unifiedGroupSources = value;
    }
    /**
     * Sets the userSources property value. Data source entity for a the custodian. This is the container for a custodian's mailbox and OneDrive for Business site.
     * @param value Value to set for the userSources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserSources(@javax.annotation.Nullable final java.util.List<UserSource> value) {
        this.userSources = value;
    }
}