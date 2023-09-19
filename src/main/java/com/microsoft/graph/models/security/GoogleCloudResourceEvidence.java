package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GoogleCloudResourceEvidence extends AlertEvidence implements Parsable {
    /**
     * The zone or region where the resource is located.
     */
    private String location;
    /**
     * The type of location. Possible values are: unknown, regional, zonal, global, unknownFutureValue.
     */
    private GoogleCloudLocationType locationType;
    /**
     * The Google project ID as defined by the user.
     */
    private String projectId;
    /**
     * The project number assigned by Google.
     */
    private Long projectNumber;
    /**
     * The name of the resource.
     */
    private String resourceName;
    /**
     * The type of the resource.
     */
    private String resourceType;
    /**
     * Instantiates a new googleCloudResourceEvidence and sets the default values.
     */
    public GoogleCloudResourceEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.googleCloudResourceEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a googleCloudResourceEvidence
     */
    @jakarta.annotation.Nonnull
    public static GoogleCloudResourceEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GoogleCloudResourceEvidence();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("location", (n) -> { this.setLocation(n.getStringValue()); });
        deserializerMap.put("locationType", (n) -> { this.setLocationType(n.getEnumValue(GoogleCloudLocationType.class)); });
        deserializerMap.put("projectId", (n) -> { this.setProjectId(n.getStringValue()); });
        deserializerMap.put("projectNumber", (n) -> { this.setProjectNumber(n.getLongValue()); });
        deserializerMap.put("resourceName", (n) -> { this.setResourceName(n.getStringValue()); });
        deserializerMap.put("resourceType", (n) -> { this.setResourceType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the location property value. The zone or region where the resource is located.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLocation() {
        return this.location;
    }
    /**
     * Gets the locationType property value. The type of location. Possible values are: unknown, regional, zonal, global, unknownFutureValue.
     * @return a googleCloudLocationType
     */
    @jakarta.annotation.Nullable
    public GoogleCloudLocationType getLocationType() {
        return this.locationType;
    }
    /**
     * Gets the projectId property value. The Google project ID as defined by the user.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getProjectId() {
        return this.projectId;
    }
    /**
     * Gets the projectNumber property value. The project number assigned by Google.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getProjectNumber() {
        return this.projectNumber;
    }
    /**
     * Gets the resourceName property value. The name of the resource.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getResourceName() {
        return this.resourceName;
    }
    /**
     * Gets the resourceType property value. The type of the resource.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getResourceType() {
        return this.resourceType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("location", this.getLocation());
        writer.writeEnumValue("locationType", this.getLocationType());
        writer.writeStringValue("projectId", this.getProjectId());
        writer.writeLongValue("projectNumber", this.getProjectNumber());
        writer.writeStringValue("resourceName", this.getResourceName());
        writer.writeStringValue("resourceType", this.getResourceType());
    }
    /**
     * Sets the location property value. The zone or region where the resource is located.
     * @param value Value to set for the location property.
     */
    public void setLocation(@jakarta.annotation.Nullable final String value) {
        this.location = value;
    }
    /**
     * Sets the locationType property value. The type of location. Possible values are: unknown, regional, zonal, global, unknownFutureValue.
     * @param value Value to set for the locationType property.
     */
    public void setLocationType(@jakarta.annotation.Nullable final GoogleCloudLocationType value) {
        this.locationType = value;
    }
    /**
     * Sets the projectId property value. The Google project ID as defined by the user.
     * @param value Value to set for the projectId property.
     */
    public void setProjectId(@jakarta.annotation.Nullable final String value) {
        this.projectId = value;
    }
    /**
     * Sets the projectNumber property value. The project number assigned by Google.
     * @param value Value to set for the projectNumber property.
     */
    public void setProjectNumber(@jakarta.annotation.Nullable final Long value) {
        this.projectNumber = value;
    }
    /**
     * Sets the resourceName property value. The name of the resource.
     * @param value Value to set for the resourceName property.
     */
    public void setResourceName(@jakarta.annotation.Nullable final String value) {
        this.resourceName = value;
    }
    /**
     * Sets the resourceType property value. The type of the resource.
     * @param value Value to set for the resourceType property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final String value) {
        this.resourceType = value;
    }
}