package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class GovernanceInsight extends Entity implements Parsable {
    /**
     * Indicates when the insight was created.
     */
    private OffsetDateTime insightCreatedDateTime;
    /**
     * Instantiates a new governanceInsight and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public GovernanceInsight() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a governanceInsight
     */
    @javax.annotation.Nonnull
    public static GovernanceInsight createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.membershipOutlierInsight": return new MembershipOutlierInsight();
                case "#microsoft.graph.userSignInInsight": return new UserSignInInsight();
            }
        }
        return new GovernanceInsight();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("insightCreatedDateTime", (n) -> { this.setInsightCreatedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the insightCreatedDateTime property value. Indicates when the insight was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getInsightCreatedDateTime() {
        return this.insightCreatedDateTime;
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
        writer.writeOffsetDateTimeValue("insightCreatedDateTime", this.getInsightCreatedDateTime());
    }
    /**
     * Sets the insightCreatedDateTime property value. Indicates when the insight was created.
     * @param value Value to set for the insightCreatedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInsightCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.insightCreatedDateTime = value;
    }
}
