package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IdentitySecurityDefaultsEnforcementPolicy extends PolicyBase implements Parsable {
    /**
     * If set to true, Azure Active Directory security defaults is enabled for the tenant.
     */
    private Boolean isEnabled;
    /**
     * Instantiates a new IdentitySecurityDefaultsEnforcementPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IdentitySecurityDefaultsEnforcementPolicy() {
        super();
        this.setOdataType("#microsoft.graph.identitySecurityDefaultsEnforcementPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IdentitySecurityDefaultsEnforcementPolicy
     */
    @javax.annotation.Nonnull
    public static IdentitySecurityDefaultsEnforcementPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentitySecurityDefaultsEnforcementPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. If set to true, Azure Active Directory security defaults is enabled for the tenant.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
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
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
    }
    /**
     * Sets the isEnabled property value. If set to true, Azure Active Directory security defaults is enabled for the tenant.
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
}
