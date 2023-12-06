package com.microsoft.graph.drives.item.items.item.workbook.functions.complex;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComplexPostRequestBody implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ComplexPostRequestBody and sets the default values.
     */
    public ComplexPostRequestBody() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ComplexPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ComplexPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComplexPostRequestBody();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("iNum", (n) -> { this.setINum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("realNum", (n) -> { this.setRealNum(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("suffix", (n) -> { this.setSuffix(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the iNum property value. The iNum property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getINum() {
        return this.backingStore.get("iNum");
    }
    /**
     * Gets the realNum property value. The realNum property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getRealNum() {
        return this.backingStore.get("realNum");
    }
    /**
     * Gets the suffix property value. The suffix property
     * @return a Json
     */
    @jakarta.annotation.Nullable
    public Json getSuffix() {
        return this.backingStore.get("suffix");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("iNum", this.getINum());
        writer.writeObjectValue("realNum", this.getRealNum());
        writer.writeObjectValue("suffix", this.getSuffix());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the iNum property value. The iNum property
     * @param value Value to set for the iNum property.
     */
    public void setINum(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("iNum", value);
    }
    /**
     * Sets the realNum property value. The realNum property
     * @param value Value to set for the realNum property.
     */
    public void setRealNum(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("realNum", value);
    }
    /**
     * Sets the suffix property value. The suffix property
     * @param value Value to set for the suffix property.
     */
    public void setSuffix(@jakarta.annotation.Nullable final Json value) {
        this.backingStore.set("suffix", value);
    }
}