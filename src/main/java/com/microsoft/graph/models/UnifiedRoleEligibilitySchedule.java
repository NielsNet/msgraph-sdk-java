package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleEligibilitySchedule extends UnifiedRoleScheduleBase implements Parsable {
    /**
     * How the role eligibility is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleEligibilitySchedule can be managed by the caller. Supports $filter (eq, ne).
     */
    private String memberType;
    /**
     * The period of the role eligibility.
     */
    private RequestSchedule scheduleInfo;
    /**
     * Instantiates a new unifiedRoleEligibilitySchedule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleEligibilitySchedule() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleEligibilitySchedule
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleEligibilitySchedule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleEligibilitySchedule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("memberType", (n) -> { this.setMemberType(n.getStringValue()); });
        deserializerMap.put("scheduleInfo", (n) -> { this.setScheduleInfo(n.getObjectValue(RequestSchedule::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the memberType property value. How the role eligibility is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleEligibilitySchedule can be managed by the caller. Supports $filter (eq, ne).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMemberType() {
        return this.memberType;
    }
    /**
     * Gets the scheduleInfo property value. The period of the role eligibility.
     * @return a requestSchedule
     */
    @javax.annotation.Nullable
    public RequestSchedule getScheduleInfo() {
        return this.scheduleInfo;
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
        writer.writeStringValue("memberType", this.getMemberType());
        writer.writeObjectValue("scheduleInfo", this.getScheduleInfo());
    }
    /**
     * Sets the memberType property value. How the role eligibility is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleEligibilitySchedule can be managed by the caller. Supports $filter (eq, ne).
     * @param value Value to set for the memberType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberType(@javax.annotation.Nullable final String value) {
        this.memberType = value;
    }
    /**
     * Sets the scheduleInfo property value. The period of the role eligibility.
     * @param value Value to set for the scheduleInfo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScheduleInfo(@javax.annotation.Nullable final RequestSchedule value) {
        this.scheduleInfo = value;
    }
}
