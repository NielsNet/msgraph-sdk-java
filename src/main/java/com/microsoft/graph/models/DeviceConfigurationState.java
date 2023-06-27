package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Configuration State for a given device.
 */
public class DeviceConfigurationState extends Entity implements Parsable {
    /**
     * The name of the policy for this policyBase
     */
    private String displayName;
    /**
     * Supported platform types for policies.
     */
    private PolicyPlatformType platformType;
    /**
     * Count of how many setting a policy holds
     */
    private Integer settingCount;
    /**
     * The settingStates property
     */
    private java.util.List<DeviceConfigurationSettingState> settingStates;
    /**
     * The state property
     */
    private ComplianceStatus state;
    /**
     * The version of the policy
     */
    private Integer version;
    /**
     * Instantiates a new deviceConfigurationState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceConfigurationState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceConfigurationState
     */
    @javax.annotation.Nonnull
    public static DeviceConfigurationState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceConfigurationState();
    }
    /**
     * Gets the displayName property value. The name of the policy for this policyBase
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
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("platformType", (n) -> { this.setPlatformType(n.getEnumValue(PolicyPlatformType.class)); });
        deserializerMap.put("settingCount", (n) -> { this.setSettingCount(n.getIntegerValue()); });
        deserializerMap.put("settingStates", (n) -> { this.setSettingStates(n.getCollectionOfObjectValues(DeviceConfigurationSettingState::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ComplianceStatus.class)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the platformType property value. Supported platform types for policies.
     * @return a PolicyPlatformType
     */
    @javax.annotation.Nullable
    public PolicyPlatformType getPlatformType() {
        return this.platformType;
    }
    /**
     * Gets the settingCount property value. Count of how many setting a policy holds
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSettingCount() {
        return this.settingCount;
    }
    /**
     * Gets the settingStates property value. The settingStates property
     * @return a deviceConfigurationSettingState
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceConfigurationSettingState> getSettingStates() {
        return this.settingStates;
    }
    /**
     * Gets the state property value. The state property
     * @return a ComplianceStatus
     */
    @javax.annotation.Nullable
    public ComplianceStatus getState() {
        return this.state;
    }
    /**
     * Gets the version property value. The version of the policy
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this.version;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("platformType", this.getPlatformType());
        writer.writeIntegerValue("settingCount", this.getSettingCount());
        writer.writeCollectionOfObjectValues("settingStates", this.getSettingStates());
        writer.writeEnumValue("state", this.getState());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the displayName property value. The name of the policy for this policyBase
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the platformType property value. Supported platform types for policies.
     * @param value Value to set for the platformType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatformType(@javax.annotation.Nullable final PolicyPlatformType value) {
        this.platformType = value;
    }
    /**
     * Sets the settingCount property value. Count of how many setting a policy holds
     * @param value Value to set for the settingCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingCount(@javax.annotation.Nullable final Integer value) {
        this.settingCount = value;
    }
    /**
     * Sets the settingStates property value. The settingStates property
     * @param value Value to set for the settingStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingStates(@javax.annotation.Nullable final java.util.List<DeviceConfigurationSettingState> value) {
        this.settingStates = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final ComplianceStatus value) {
        this.state = value;
    }
    /**
     * Sets the version property value. The version of the policy
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this.version = value;
    }
}
