package com.microsoft.graph.security.cases.ediscoverycases.item.reviewsets.item.queries.item.microsoftgraphsecurityexport;

import com.microsoft.graph.models.security.ExportFileStructure;
import com.microsoft.graph.models.security.ExportOptions;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExportPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The description property
     */
    private String description;
    /**
     * The exportOptions property
     */
    private ExportOptions exportOptions;
    /**
     * The exportStructure property
     */
    private ExportFileStructure exportStructure;
    /**
     * The outputName property
     */
    private String outputName;
    /**
     * Instantiates a new exportPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ExportPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a exportPostRequestBody
     */
    @javax.annotation.Nonnull
    public static ExportPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExportPostRequestBody();
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
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the exportOptions property value. The exportOptions property
     * @return a exportOptions
     */
    @javax.annotation.Nullable
    public ExportOptions getExportOptions() {
        return this.exportOptions;
    }
    /**
     * Gets the exportStructure property value. The exportStructure property
     * @return a exportFileStructure
     */
    @javax.annotation.Nullable
    public ExportFileStructure getExportStructure() {
        return this.exportStructure;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("exportOptions", (n) -> { this.setExportOptions(n.getEnumValue(ExportOptions.class)); });
        deserializerMap.put("exportStructure", (n) -> { this.setExportStructure(n.getEnumValue(ExportFileStructure.class)); });
        deserializerMap.put("outputName", (n) -> { this.setOutputName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the outputName property value. The outputName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOutputName() {
        return this.outputName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("exportOptions", this.getExportOptions());
        writer.writeEnumValue("exportStructure", this.getExportStructure());
        writer.writeStringValue("outputName", this.getOutputName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the exportOptions property value. The exportOptions property
     * @param value Value to set for the exportOptions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExportOptions(@javax.annotation.Nullable final ExportOptions value) {
        this.exportOptions = value;
    }
    /**
     * Sets the exportStructure property value. The exportStructure property
     * @param value Value to set for the exportStructure property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExportStructure(@javax.annotation.Nullable final ExportFileStructure value) {
        this.exportStructure = value;
    }
    /**
     * Sets the outputName property value. The outputName property
     * @param value Value to set for the outputName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOutputName(@javax.annotation.Nullable final String value) {
        this.outputName = value;
    }
}
