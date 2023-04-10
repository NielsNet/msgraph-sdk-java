package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationFlowsPolicy extends Entity implements Parsable {
    /** Inherited property. A description of the policy. Optional. Read-only. */
    private String description;
    /** Inherited property. The human-readable name of the policy. Optional. Read-only. */
    private String displayName;
    /** Contains selfServiceSignUpAuthenticationFlowConfiguration settings that convey whether self-service sign-up is enabled or disabled. Optional. Read-only. */
    private SelfServiceSignUpAuthenticationFlowConfiguration selfServiceSignUp;
    /**
     * Instantiates a new authenticationFlowsPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationFlowsPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationFlowsPolicy
     */
    @javax.annotation.Nonnull
    public static AuthenticationFlowsPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationFlowsPolicy();
    }
    /**
     * Gets the description property value. Inherited property. A description of the policy. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. Inherited property. The human-readable name of the policy. Optional. Read-only.
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
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("selfServiceSignUp", (n) -> { this.setSelfServiceSignUp(n.getObjectValue(SelfServiceSignUpAuthenticationFlowConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the selfServiceSignUp property value. Contains selfServiceSignUpAuthenticationFlowConfiguration settings that convey whether self-service sign-up is enabled or disabled. Optional. Read-only.
     * @return a selfServiceSignUpAuthenticationFlowConfiguration
     */
    @javax.annotation.Nullable
    public SelfServiceSignUpAuthenticationFlowConfiguration getSelfServiceSignUp() {
        return this.selfServiceSignUp;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("selfServiceSignUp", this.getSelfServiceSignUp());
    }
    /**
     * Sets the description property value. Inherited property. A description of the policy. Optional. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. Inherited property. The human-readable name of the policy. Optional. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the selfServiceSignUp property value. Contains selfServiceSignUpAuthenticationFlowConfiguration settings that convey whether self-service sign-up is enabled or disabled. Optional. Read-only.
     * @param value Value to set for the selfServiceSignUp property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSelfServiceSignUp(@javax.annotation.Nullable final SelfServiceSignUpAuthenticationFlowConfiguration value) {
        this.selfServiceSignUp = value;
    }
}
