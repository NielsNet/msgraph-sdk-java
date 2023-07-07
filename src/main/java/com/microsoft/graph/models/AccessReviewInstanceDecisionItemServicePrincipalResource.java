package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewInstanceDecisionItemServicePrincipalResource extends AccessReviewInstanceDecisionItemResource implements Parsable {
    /**
     * The globally unique identifier of the application to which access has been granted.
     */
    private String appId;
    /**
     * Instantiates a new AccessReviewInstanceDecisionItemServicePrincipalResource and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessReviewInstanceDecisionItemServicePrincipalResource() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewInstanceDecisionItemServicePrincipalResource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AccessReviewInstanceDecisionItemServicePrincipalResource
     */
    @javax.annotation.Nonnull
    public static AccessReviewInstanceDecisionItemServicePrincipalResource createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewInstanceDecisionItemServicePrincipalResource();
    }
    /**
     * Gets the appId property value. The globally unique identifier of the application to which access has been granted.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
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
        writer.writeStringValue("appId", this.getAppId());
    }
    /**
     * Sets the appId property value. The globally unique identifier of the application to which access has been granted.
     * @param value Value to set for the appId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppId(@javax.annotation.Nullable final String value) {
        this.appId = value;
    }
}
