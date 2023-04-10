package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ResourceVisualization implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** A string describing where the item is stored. For example, the name of a SharePoint site or the user name identifying the owner of the OneDrive storing the item. */
    private String containerDisplayName;
    /** Can be used for filtering by the type of container in which the file is stored. Such as Site or OneDriveBusiness. */
    private String containerType;
    /** A path leading to the folder in which the item is stored. */
    private String containerWebUrl;
    /** The item's media type. Can be used for filtering for a specific type of file based on supported IANA Media Mime Types. Note that not all Media Mime Types are supported. */
    private String mediaType;
    /** The OdataType property */
    private String odataType;
    /** A URL leading to the preview image for the item. */
    private String previewImageUrl;
    /** A preview text for the item. */
    private String previewText;
    /** The item's title text. */
    private String title;
    /** The item's media type. Can be used for filtering for a specific file based on a specific type. See below for supported types. */
    private String type;
    /**
     * Instantiates a new resourceVisualization and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ResourceVisualization() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a resourceVisualization
     */
    @javax.annotation.Nonnull
    public static ResourceVisualization createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResourceVisualization();
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
     * Gets the containerDisplayName property value. A string describing where the item is stored. For example, the name of a SharePoint site or the user name identifying the owner of the OneDrive storing the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContainerDisplayName() {
        return this.containerDisplayName;
    }
    /**
     * Gets the containerType property value. Can be used for filtering by the type of container in which the file is stored. Such as Site or OneDriveBusiness.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContainerType() {
        return this.containerType;
    }
    /**
     * Gets the containerWebUrl property value. A path leading to the folder in which the item is stored.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContainerWebUrl() {
        return this.containerWebUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("containerDisplayName", (n) -> { this.setContainerDisplayName(n.getStringValue()); });
        deserializerMap.put("containerType", (n) -> { this.setContainerType(n.getStringValue()); });
        deserializerMap.put("containerWebUrl", (n) -> { this.setContainerWebUrl(n.getStringValue()); });
        deserializerMap.put("mediaType", (n) -> { this.setMediaType(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("previewImageUrl", (n) -> { this.setPreviewImageUrl(n.getStringValue()); });
        deserializerMap.put("previewText", (n) -> { this.setPreviewText(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mediaType property value. The item's media type. Can be used for filtering for a specific type of file based on supported IANA Media Mime Types. Note that not all Media Mime Types are supported.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMediaType() {
        return this.mediaType;
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
     * Gets the previewImageUrl property value. A URL leading to the preview image for the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreviewImageUrl() {
        return this.previewImageUrl;
    }
    /**
     * Gets the previewText property value. A preview text for the item.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreviewText() {
        return this.previewText;
    }
    /**
     * Gets the title property value. The item's title text.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Gets the type property value. The item's media type. Can be used for filtering for a specific file based on a specific type. See below for supported types.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("containerDisplayName", this.getContainerDisplayName());
        writer.writeStringValue("containerType", this.getContainerType());
        writer.writeStringValue("containerWebUrl", this.getContainerWebUrl());
        writer.writeStringValue("mediaType", this.getMediaType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("previewImageUrl", this.getPreviewImageUrl());
        writer.writeStringValue("previewText", this.getPreviewText());
        writer.writeStringValue("title", this.getTitle());
        writer.writeStringValue("type", this.getType());
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
     * Sets the containerDisplayName property value. A string describing where the item is stored. For example, the name of a SharePoint site or the user name identifying the owner of the OneDrive storing the item.
     * @param value Value to set for the containerDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContainerDisplayName(@javax.annotation.Nullable final String value) {
        this.containerDisplayName = value;
    }
    /**
     * Sets the containerType property value. Can be used for filtering by the type of container in which the file is stored. Such as Site or OneDriveBusiness.
     * @param value Value to set for the containerType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContainerType(@javax.annotation.Nullable final String value) {
        this.containerType = value;
    }
    /**
     * Sets the containerWebUrl property value. A path leading to the folder in which the item is stored.
     * @param value Value to set for the containerWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContainerWebUrl(@javax.annotation.Nullable final String value) {
        this.containerWebUrl = value;
    }
    /**
     * Sets the mediaType property value. The item's media type. Can be used for filtering for a specific type of file based on supported IANA Media Mime Types. Note that not all Media Mime Types are supported.
     * @param value Value to set for the mediaType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMediaType(@javax.annotation.Nullable final String value) {
        this.mediaType = value;
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
     * Sets the previewImageUrl property value. A URL leading to the preview image for the item.
     * @param value Value to set for the previewImageUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreviewImageUrl(@javax.annotation.Nullable final String value) {
        this.previewImageUrl = value;
    }
    /**
     * Sets the previewText property value. A preview text for the item.
     * @param value Value to set for the previewText property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreviewText(@javax.annotation.Nullable final String value) {
        this.previewText = value;
    }
    /**
     * Sets the title property value. The item's title text.
     * @param value Value to set for the title property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTitle(@javax.annotation.Nullable final String value) {
        this.title = value;
    }
    /**
     * Sets the type property value. The item's media type. Can be used for filtering for a specific file based on a specific type. See below for supported types.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
    }
}
