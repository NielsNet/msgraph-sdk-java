package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Group;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedGroupSource extends DataSource implements Parsable {
    /**
     * The group property
     */
    private Group group;
    /**
     * Specifies which sources are included in this group. Possible values are: mailbox, site.
     */
    private EnumSet<SourceType> includedSources;
    /**
     * Instantiates a new unifiedGroupSource and sets the default values.
     */
    public UnifiedGroupSource() {
        super();
        this.setOdataType("#microsoft.graph.security.unifiedGroupSource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedGroupSource
     */
    @jakarta.annotation.Nonnull
    public static UnifiedGroupSource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedGroupSource();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(Group::createFromDiscriminatorValue)); });
        deserializerMap.put("includedSources", (n) -> { this.setIncludedSources(n.getEnumSetValue(SourceType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. The group property
     * @return a group
     */
    @jakarta.annotation.Nullable
    public Group getGroup() {
        return this.group;
    }
    /**
     * Gets the includedSources property value. Specifies which sources are included in this group. Possible values are: mailbox, site.
     * @return a sourceType
     */
    @jakarta.annotation.Nullable
    public EnumSet<SourceType> getIncludedSources() {
        return this.includedSources;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("group", this.getGroup());
        writer.writeEnumSetValue("includedSources", this.getIncludedSources());
    }
    /**
     * Sets the group property value. The group property
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final Group value) {
        this.group = value;
    }
    /**
     * Sets the includedSources property value. Specifies which sources are included in this group. Possible values are: mailbox, site.
     * @param value Value to set for the includedSources property.
     */
    public void setIncludedSources(@jakarta.annotation.Nullable final EnumSet<SourceType> value) {
        this.includedSources = value;
    }
}