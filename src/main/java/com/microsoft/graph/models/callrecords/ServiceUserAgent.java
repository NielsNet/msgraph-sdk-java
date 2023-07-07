package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServiceUserAgent extends UserAgent implements Parsable {
    /**
     * The role property
     */
    private ServiceRole role;
    /**
     * Instantiates a new ServiceUserAgent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServiceUserAgent() {
        super();
        this.setOdataType("#microsoft.graph.callRecords.serviceUserAgent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ServiceUserAgent
     */
    @javax.annotation.Nonnull
    public static ServiceUserAgent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServiceUserAgent();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(ServiceRole.class)); });
        return deserializerMap;
    }
    /**
     * Gets the role property value. The role property
     * @return a ServiceRole
     */
    @javax.annotation.Nullable
    public ServiceRole getRole() {
        return this.role;
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
        writer.writeEnumValue("role", this.getRole());
    }
    /**
     * Sets the role property value. The role property
     * @param value Value to set for the role property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRole(@javax.annotation.Nullable final ServiceRole value) {
        this.role = value;
    }
}
