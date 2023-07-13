package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * IPv6 Range definition.
 */
public class IPv6Range extends IpRange implements Parsable {
    /**
     * Lower address.
     */
    private String lowerAddress;
    /**
     * Upper address.
     */
    private String upperAddress;
    /**
     * Instantiates a new iPv6Range and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IPv6Range() {
        super();
        this.setOdataType("#microsoft.graph.iPv6Range");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a iPv6Range
     */
    @javax.annotation.Nonnull
    public static IPv6Range createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IPv6Range();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lowerAddress", (n) -> { this.setLowerAddress(n.getStringValue()); });
        deserializerMap.put("upperAddress", (n) -> { this.setUpperAddress(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lowerAddress property value. Lower address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLowerAddress() {
        return this.lowerAddress;
    }
    /**
     * Gets the upperAddress property value. Upper address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUpperAddress() {
        return this.upperAddress;
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
        writer.writeStringValue("lowerAddress", this.getLowerAddress());
        writer.writeStringValue("upperAddress", this.getUpperAddress());
    }
    /**
     * Sets the lowerAddress property value. Lower address.
     * @param value Value to set for the lowerAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLowerAddress(@javax.annotation.Nullable final String value) {
        this.lowerAddress = value;
    }
    /**
     * Sets the upperAddress property value. Upper address.
     * @param value Value to set for the upperAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUpperAddress(@javax.annotation.Nullable final String value) {
        this.upperAddress = value;
    }
}
