package com.microsoft.graph.drives.item.items.item.workbook.functions.negbinom_dist;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class NegBinomDistPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The cumulative property */
    private Json cumulative;
    /** The numberF property */
    private Json numberF;
    /** The numberS property */
    private Json numberS;
    /** The probabilityS property */
    private Json probabilityS;
    /**
     * Instantiates a new NegBinomDistPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public NegBinomDistPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a NegBinomDistPostRequestBody
     */
    @javax.annotation.Nonnull
    public static NegBinomDistPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NegBinomDistPostRequestBody();
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
     * Gets the cumulative property value. The cumulative property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getCumulative() {
        return this.cumulative;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("cumulative", (n) -> { this.setCumulative(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("numberF", (n) -> { this.setNumberF(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("numberS", (n) -> { this.setNumberS(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("probabilityS", (n) -> { this.setProbabilityS(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the numberF property value. The numberF property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getNumberF() {
        return this.numberF;
    }
    /**
     * Gets the numberS property value. The numberS property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getNumberS() {
        return this.numberS;
    }
    /**
     * Gets the probabilityS property value. The probabilityS property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getProbabilityS() {
        return this.probabilityS;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("cumulative", this.getCumulative());
        writer.writeObjectValue("numberF", this.getNumberF());
        writer.writeObjectValue("numberS", this.getNumberS());
        writer.writeObjectValue("probabilityS", this.getProbabilityS());
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
     * Sets the cumulative property value. The cumulative property
     * @param value Value to set for the cumulative property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCumulative(@javax.annotation.Nullable final Json value) {
        this.cumulative = value;
    }
    /**
     * Sets the numberF property value. The numberF property
     * @param value Value to set for the numberF property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberF(@javax.annotation.Nullable final Json value) {
        this.numberF = value;
    }
    /**
     * Sets the numberS property value. The numberS property
     * @param value Value to set for the numberS property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberS(@javax.annotation.Nullable final Json value) {
        this.numberS = value;
    }
    /**
     * Sets the probabilityS property value. The probabilityS property
     * @param value Value to set for the probabilityS property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProbabilityS(@javax.annotation.Nullable final Json value) {
        this.probabilityS = value;
    }
}
