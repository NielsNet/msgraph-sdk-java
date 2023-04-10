package com.microsoft.graph.drives.item.items.item.workbook.functions.trimmean;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TrimMeanPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The array property */
    private Json array;
    /** The percent property */
    private Json percent;
    /**
     * Instantiates a new trimMeanPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TrimMeanPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a trimMeanPostRequestBody
     */
    @javax.annotation.Nonnull
    public static TrimMeanPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrimMeanPostRequestBody();
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
     * Gets the array property value. The array property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getArray() {
        return this.array;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("array", (n) -> { this.setArray(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("percent", (n) -> { this.setPercent(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the percent property value. The percent property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getPercent() {
        return this.percent;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("array", this.getArray());
        writer.writeObjectValue("percent", this.getPercent());
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
     * Sets the array property value. The array property
     * @param value Value to set for the array property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setArray(@javax.annotation.Nullable final Json value) {
        this.array = value;
    }
    /**
     * Sets the percent property value. The percent property
     * @param value Value to set for the percent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPercent(@javax.annotation.Nullable final Json value) {
        this.percent = value;
    }
}