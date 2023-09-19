package com.microsoft.graph.drives.item.items.item.workbook.functions.mirr;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MirrPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The financeRate property
     */
    private Json financeRate;
    /**
     * The reinvestRate property
     */
    private Json reinvestRate;
    /**
     * The values property
     */
    private Json values;
    /**
     * Instantiates a new mirrPostRequestBody and sets the default values.
     */
    public MirrPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mirrPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static MirrPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MirrPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("financeRate", (n) -> { this.setFinanceRate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("reinvestRate", (n) -> { this.setReinvestRate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("values", (n) -> { this.setValues(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the financeRate property value. The financeRate property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getFinanceRate() {
        return this.financeRate;
    }
    /**
     * Gets the reinvestRate property value. The reinvestRate property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getReinvestRate() {
        return this.reinvestRate;
    }
    /**
     * Gets the values property value. The values property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getValues() {
        return this.values;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("financeRate", this.getFinanceRate());
        writer.writeObjectValue("reinvestRate", this.getReinvestRate());
        writer.writeObjectValue("values", this.getValues());
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
     * Sets the financeRate property value. The financeRate property
     * @param value Value to set for the financeRate property.
     */
    public void setFinanceRate(@jakarta.annotation.Nullable final Json value) {
        this.financeRate = value;
    }
    /**
     * Sets the reinvestRate property value. The reinvestRate property
     * @param value Value to set for the reinvestRate property.
     */
    public void setReinvestRate(@jakarta.annotation.Nullable final Json value) {
        this.reinvestRate = value;
    }
    /**
     * Sets the values property value. The values property
     * @param value Value to set for the values property.
     */
    public void setValues(@jakarta.annotation.Nullable final Json value) {
        this.values = value;
    }
}