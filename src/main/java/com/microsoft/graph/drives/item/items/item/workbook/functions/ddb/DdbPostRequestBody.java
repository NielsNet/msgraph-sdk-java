package com.microsoft.graph.drives.item.items.item.workbook.functions.ddb;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DdbPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The cost property */
    private Json cost;
    /** The factor property */
    private Json factor;
    /** The life property */
    private Json life;
    /** The period property */
    private Json period;
    /** The salvage property */
    private Json salvage;
    /**
     * Instantiates a new ddbPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DdbPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ddbPostRequestBody
     */
    @javax.annotation.Nonnull
    public static DdbPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DdbPostRequestBody();
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
     * Gets the cost property value. The cost property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getCost() {
        return this.cost;
    }
    /**
     * Gets the factor property value. The factor property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getFactor() {
        return this.factor;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("cost", (n) -> { this.setCost(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("factor", (n) -> { this.setFactor(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("life", (n) -> { this.setLife(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("period", (n) -> { this.setPeriod(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("salvage", (n) -> { this.setSalvage(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the life property value. The life property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getLife() {
        return this.life;
    }
    /**
     * Gets the period property value. The period property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getPeriod() {
        return this.period;
    }
    /**
     * Gets the salvage property value. The salvage property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getSalvage() {
        return this.salvage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("cost", this.getCost());
        writer.writeObjectValue("factor", this.getFactor());
        writer.writeObjectValue("life", this.getLife());
        writer.writeObjectValue("period", this.getPeriod());
        writer.writeObjectValue("salvage", this.getSalvage());
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
     * Sets the cost property value. The cost property
     * @param value Value to set for the cost property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCost(@javax.annotation.Nullable final Json value) {
        this.cost = value;
    }
    /**
     * Sets the factor property value. The factor property
     * @param value Value to set for the factor property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFactor(@javax.annotation.Nullable final Json value) {
        this.factor = value;
    }
    /**
     * Sets the life property value. The life property
     * @param value Value to set for the life property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLife(@javax.annotation.Nullable final Json value) {
        this.life = value;
    }
    /**
     * Sets the period property value. The period property
     * @param value Value to set for the period property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPeriod(@javax.annotation.Nullable final Json value) {
        this.period = value;
    }
    /**
     * Sets the salvage property value. The salvage property
     * @param value Value to set for the salvage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSalvage(@javax.annotation.Nullable final Json value) {
        this.salvage = value;
    }
}