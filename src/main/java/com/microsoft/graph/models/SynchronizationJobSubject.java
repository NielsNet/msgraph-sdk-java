package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SynchronizationJobSubject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The links property
     */
    private SynchronizationLinkedObjects links;
    /**
     * The objectId property
     */
    private String objectId;
    /**
     * The objectTypeName property
     */
    private String objectTypeName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new synchronizationJobSubject and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SynchronizationJobSubject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a synchronizationJobSubject
     */
    @javax.annotation.Nonnull
    public static SynchronizationJobSubject createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SynchronizationJobSubject();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("links", (n) -> { this.setLinks(n.getObjectValue(SynchronizationLinkedObjects::createFromDiscriminatorValue)); });
        deserializerMap.put("objectId", (n) -> { this.setObjectId(n.getStringValue()); });
        deserializerMap.put("objectTypeName", (n) -> { this.setObjectTypeName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the links property value. The links property
     * @return a synchronizationLinkedObjects
     */
    @javax.annotation.Nullable
    public SynchronizationLinkedObjects getLinks() {
        return this.links;
    }
    /**
     * Gets the objectId property value. The objectId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getObjectId() {
        return this.objectId;
    }
    /**
     * Gets the objectTypeName property value. The objectTypeName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getObjectTypeName() {
        return this.objectTypeName;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("links", this.getLinks());
        writer.writeStringValue("objectId", this.getObjectId());
        writer.writeStringValue("objectTypeName", this.getObjectTypeName());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the links property value. The links property
     * @param value Value to set for the links property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLinks(@javax.annotation.Nullable final SynchronizationLinkedObjects value) {
        this.links = value;
    }
    /**
     * Sets the objectId property value. The objectId property
     * @param value Value to set for the objectId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setObjectId(@javax.annotation.Nullable final String value) {
        this.objectId = value;
    }
    /**
     * Sets the objectTypeName property value. The objectTypeName property
     * @param value Value to set for the objectTypeName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setObjectTypeName(@javax.annotation.Nullable final String value) {
        this.objectTypeName = value;
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
}
