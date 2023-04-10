package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Location implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The street address of the location. */
    private PhysicalAddress address;
    /** The geographic coordinates and elevation of the location. */
    private OutlookGeoCoordinates coordinates;
    /** The name associated with the location. */
    private String displayName;
    /** Optional email address of the location. */
    private String locationEmailAddress;
    /** The type of location. The possible values are: default, conferenceRoom, homeAddress, businessAddress,geoCoordinates, streetAddress, hotel, restaurant, localBusiness, postalAddress. Read-only. */
    private LocationType locationType;
    /** Optional URI representing the location. */
    private String locationUri;
    /** The OdataType property */
    private String odataType;
    /** For internal use only. */
    private String uniqueId;
    /** For internal use only. */
    private LocationUniqueIdType uniqueIdType;
    /**
     * Instantiates a new location and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Location() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a location
     */
    @javax.annotation.Nonnull
    public static Location createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.locationConstraintItem": return new LocationConstraintItem();
            }
        }
        return new Location();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the address property value. The street address of the location.
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public PhysicalAddress getAddress() {
        return this.address;
    }
    /**
     * Gets the coordinates property value. The geographic coordinates and elevation of the location.
     * @return a outlookGeoCoordinates
     */
    @javax.annotation.Nullable
    public OutlookGeoCoordinates getCoordinates() {
        return this.coordinates;
    }
    /**
     * Gets the displayName property value. The name associated with the location.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("address", (n) -> { this.setAddress(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("coordinates", (n) -> { this.setCoordinates(n.getObjectValue(OutlookGeoCoordinates::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("locationEmailAddress", (n) -> { this.setLocationEmailAddress(n.getStringValue()); });
        deserializerMap.put("locationType", (n) -> { this.setLocationType(n.getEnumValue(LocationType.class)); });
        deserializerMap.put("locationUri", (n) -> { this.setLocationUri(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("uniqueId", (n) -> { this.setUniqueId(n.getStringValue()); });
        deserializerMap.put("uniqueIdType", (n) -> { this.setUniqueIdType(n.getEnumValue(LocationUniqueIdType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the locationEmailAddress property value. Optional email address of the location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocationEmailAddress() {
        return this.locationEmailAddress;
    }
    /**
     * Gets the locationType property value. The type of location. The possible values are: default, conferenceRoom, homeAddress, businessAddress,geoCoordinates, streetAddress, hotel, restaurant, localBusiness, postalAddress. Read-only.
     * @return a locationType
     */
    @javax.annotation.Nullable
    public LocationType getLocationType() {
        return this.locationType;
    }
    /**
     * Gets the locationUri property value. Optional URI representing the location.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLocationUri() {
        return this.locationUri;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the uniqueId property value. For internal use only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUniqueId() {
        return this.uniqueId;
    }
    /**
     * Gets the uniqueIdType property value. For internal use only.
     * @return a locationUniqueIdType
     */
    @javax.annotation.Nullable
    public LocationUniqueIdType getUniqueIdType() {
        return this.uniqueIdType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("address", this.getAddress());
        writer.writeObjectValue("coordinates", this.getCoordinates());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("locationEmailAddress", this.getLocationEmailAddress());
        writer.writeEnumValue("locationType", this.getLocationType());
        writer.writeStringValue("locationUri", this.getLocationUri());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("uniqueId", this.getUniqueId());
        writer.writeEnumValue("uniqueIdType", this.getUniqueIdType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the address property value. The street address of the location.
     * @param value Value to set for the address property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddress(@javax.annotation.Nullable final PhysicalAddress value) {
        this.address = value;
    }
    /**
     * Sets the coordinates property value. The geographic coordinates and elevation of the location.
     * @param value Value to set for the coordinates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCoordinates(@javax.annotation.Nullable final OutlookGeoCoordinates value) {
        this.coordinates = value;
    }
    /**
     * Sets the displayName property value. The name associated with the location.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the locationEmailAddress property value. Optional email address of the location.
     * @param value Value to set for the locationEmailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocationEmailAddress(@javax.annotation.Nullable final String value) {
        this.locationEmailAddress = value;
    }
    /**
     * Sets the locationType property value. The type of location. The possible values are: default, conferenceRoom, homeAddress, businessAddress,geoCoordinates, streetAddress, hotel, restaurant, localBusiness, postalAddress. Read-only.
     * @param value Value to set for the locationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocationType(@javax.annotation.Nullable final LocationType value) {
        this.locationType = value;
    }
    /**
     * Sets the locationUri property value. Optional URI representing the location.
     * @param value Value to set for the locationUri property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocationUri(@javax.annotation.Nullable final String value) {
        this.locationUri = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the uniqueId property value. For internal use only.
     * @param value Value to set for the uniqueId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUniqueId(@javax.annotation.Nullable final String value) {
        this.uniqueId = value;
    }
    /**
     * Sets the uniqueIdType property value. For internal use only.
     * @param value Value to set for the uniqueIdType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUniqueIdType(@javax.annotation.Nullable final LocationUniqueIdType value) {
        this.uniqueIdType = value;
    }
}
