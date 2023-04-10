package com.microsoft.graph.drives.item.items.item.workbook.functions.days360;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Days360PostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The endDate property */
    private Json endDate;
    /** The method property */
    private Json method;
    /** The startDate property */
    private Json startDate;
    /**
     * Instantiates a new days360PostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Days360PostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a days360PostRequestBody
     */
    @javax.annotation.Nonnull
    public static Days360PostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Days360PostRequestBody();
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
     * Gets the endDate property value. The endDate property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getEndDate() {
        return this.endDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("method", (n) -> { this.setMethod(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the method property value. The method property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getMethod() {
        return this.method;
    }
    /**
     * Gets the startDate property value. The startDate property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getStartDate() {
        return this.startDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("endDate", this.getEndDate());
        writer.writeObjectValue("method", this.getMethod());
        writer.writeObjectValue("startDate", this.getStartDate());
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
     * Sets the endDate property value. The endDate property
     * @param value Value to set for the endDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDate(@javax.annotation.Nullable final Json value) {
        this.endDate = value;
    }
    /**
     * Sets the method property value. The method property
     * @param value Value to set for the method property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMethod(@javax.annotation.Nullable final Json value) {
        this.method = value;
    }
    /**
     * Sets the startDate property value. The startDate property
     * @param value Value to set for the startDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDate(@javax.annotation.Nullable final Json value) {
        this.startDate = value;
    }
}