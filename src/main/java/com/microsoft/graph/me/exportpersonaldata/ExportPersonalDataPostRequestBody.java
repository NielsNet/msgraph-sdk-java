package com.microsoft.graph.me.exportpersonaldata;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExportPersonalDataPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The storageLocation property */
    private String storageLocation;
    /**
     * Instantiates a new exportPersonalDataPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExportPersonalDataPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a exportPersonalDataPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ExportPersonalDataPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExportPersonalDataPostRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("storageLocation", (n) -> { this.setStorageLocation(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the storageLocation property value. The storageLocation property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStorageLocation() {
        return this.storageLocation;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("storageLocation", this.getStorageLocation());
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
     * Sets the storageLocation property value. The storageLocation property
     * @param value Value to set for the storageLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStorageLocation(@javax.annotation.Nullable final String value) {
        this.storageLocation = value;
    }
}