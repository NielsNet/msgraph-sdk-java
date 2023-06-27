package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudAppSecuritySessionControl extends ConditionalAccessSessionControl implements Parsable {
    /**
     * Possible values are: mcasConfigured, monitorOnly, blockDownloads, unknownFutureValue. For more information, see Deploy Conditional Access App Control for featured apps.
     */
    private CloudAppSecuritySessionControlType cloudAppSecurityType;
    /**
     * Instantiates a new CloudAppSecuritySessionControl and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudAppSecuritySessionControl() {
        super();
        this.setOdataType("#microsoft.graph.cloudAppSecuritySessionControl");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudAppSecuritySessionControl
     */
    @javax.annotation.Nonnull
    public static CloudAppSecuritySessionControl createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudAppSecuritySessionControl();
    }
    /**
     * Gets the cloudAppSecurityType property value. Possible values are: mcasConfigured, monitorOnly, blockDownloads, unknownFutureValue. For more information, see Deploy Conditional Access App Control for featured apps.
     * @return a cloudAppSecuritySessionControlType
     */
    @javax.annotation.Nullable
    public CloudAppSecuritySessionControlType getCloudAppSecurityType() {
        return this.cloudAppSecurityType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("cloudAppSecurityType", (n) -> { this.setCloudAppSecurityType(n.getEnumValue(CloudAppSecuritySessionControlType.class)); });
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
        writer.writeEnumValue("cloudAppSecurityType", this.getCloudAppSecurityType());
    }
    /**
     * Sets the cloudAppSecurityType property value. Possible values are: mcasConfigured, monitorOnly, blockDownloads, unknownFutureValue. For more information, see Deploy Conditional Access App Control for featured apps.
     * @param value Value to set for the cloudAppSecurityType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudAppSecurityType(@javax.annotation.Nullable final CloudAppSecuritySessionControlType value) {
        this.cloudAppSecurityType = value;
    }
}
