package com.microsoft.graph.drives.item.items.item.workbook.functions.randbetween;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RandBetweenPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The bottom property
     */
    private Json bottom;
    /**
     * The top property
     */
    private Json top;
    /**
     * Instantiates a new randBetweenPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RandBetweenPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a randBetweenPostRequestBody
     */
    @javax.annotation.Nonnull
    public static RandBetweenPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RandBetweenPostRequestBody();
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
     * Gets the bottom property value. The bottom property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getBottom() {
        return this.bottom;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("bottom", (n) -> { this.setBottom(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("top", (n) -> { this.setTop(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the top property value. The top property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getTop() {
        return this.top;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("bottom", this.getBottom());
        writer.writeObjectValue("top", this.getTop());
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
     * Sets the bottom property value. The bottom property
     * @param value Value to set for the bottom property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBottom(@javax.annotation.Nullable final Json value) {
        this.bottom = value;
    }
    /**
     * Sets the top property value. The top property
     * @param value Value to set for the top property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTop(@javax.annotation.Nullable final Json value) {
        this.top = value;
    }
}
