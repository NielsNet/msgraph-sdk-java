package com.microsoft.graph.drives.item.items.item.workbook.functions.lognorm_dist;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LogNormDistPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The cumulative property
     */
    private Json cumulative;
    /**
     * The mean property
     */
    private Json mean;
    /**
     * The standardDev property
     */
    private Json standardDev;
    /**
     * The x property
     */
    private Json x;
    /**
     * Instantiates a new LogNormDistPostRequestBody and sets the default values.
     */
    public LogNormDistPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a LogNormDistPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static LogNormDistPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LogNormDistPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the cumulative property value. The cumulative property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getCumulative() {
        return this.cumulative;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("cumulative", (n) -> { this.setCumulative(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("mean", (n) -> { this.setMean(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("standardDev", (n) -> { this.setStandardDev(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("x", (n) -> { this.setX(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mean property value. The mean property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getMean() {
        return this.mean;
    }
    /**
     * Gets the standardDev property value. The standardDev property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getStandardDev() {
        return this.standardDev;
    }
    /**
     * Gets the x property value. The x property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getX() {
        return this.x;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("cumulative", this.getCumulative());
        writer.writeObjectValue("mean", this.getMean());
        writer.writeObjectValue("standardDev", this.getStandardDev());
        writer.writeObjectValue("x", this.getX());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the cumulative property value. The cumulative property
     * @param value Value to set for the cumulative property.
     */
    public void setCumulative(@jakarta.annotation.Nullable final Json value) {
        this.cumulative = value;
    }
    /**
     * Sets the mean property value. The mean property
     * @param value Value to set for the mean property.
     */
    public void setMean(@jakarta.annotation.Nullable final Json value) {
        this.mean = value;
    }
    /**
     * Sets the standardDev property value. The standardDev property
     * @param value Value to set for the standardDev property.
     */
    public void setStandardDev(@jakarta.annotation.Nullable final Json value) {
        this.standardDev = value;
    }
    /**
     * Sets the x property value. The x property
     * @param value Value to set for the x property.
     */
    public void setX(@jakarta.annotation.Nullable final Json value) {
        this.x = value;
    }
}