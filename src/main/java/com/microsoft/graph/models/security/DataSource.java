package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DataSource extends Entity implements Parsable {
    /** The user who created the dataSource. */
    private IdentitySet createdBy;
    /** The date and time the dataSource was created. */
    private OffsetDateTime createdDateTime;
    /** The display name of the dataSource. This will be the name of the SharePoint site. */
    private String displayName;
    /** The hold status of the dataSource.The possible values are: notApplied, applied, applying, removing, partial */
    private DataSourceHoldStatus holdStatus;
    /**
     * Instantiates a new dataSource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DataSource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a dataSource
     */
    @javax.annotation.Nonnull
    public static DataSource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.siteSource": return new SiteSource();
                case "#microsoft.graph.security.unifiedGroupSource": return new UnifiedGroupSource();
                case "#microsoft.graph.security.userSource": return new UserSource();
            }
        }
        return new DataSource();
    }
    /**
     * Gets the createdBy property value. The user who created the dataSource.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Gets the createdDateTime property value. The date and time the dataSource was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the displayName property value. The display name of the dataSource. This will be the name of the SharePoint site.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("holdStatus", (n) -> { this.setHoldStatus(n.getEnumValue(DataSourceHoldStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the holdStatus property value. The hold status of the dataSource.The possible values are: notApplied, applied, applying, removing, partial
     * @return a dataSourceHoldStatus
     */
    @javax.annotation.Nullable
    public DataSourceHoldStatus getHoldStatus() {
        return this.holdStatus;
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
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("holdStatus", this.getHoldStatus());
    }
    /**
     * Sets the createdBy property value. The user who created the dataSource.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this.createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time the dataSource was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the displayName property value. The display name of the dataSource. This will be the name of the SharePoint site.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the holdStatus property value. The hold status of the dataSource.The possible values are: notApplied, applied, applying, removing, partial
     * @param value Value to set for the holdStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHoldStatus(@javax.annotation.Nullable final DataSourceHoldStatus value) {
        this.holdStatus = value;
    }
}