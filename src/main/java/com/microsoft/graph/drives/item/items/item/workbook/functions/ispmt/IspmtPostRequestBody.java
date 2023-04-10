package com.microsoft.graph.drives.item.items.item.workbook.functions.ispmt;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IspmtPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The nper property */
    private Json nper;
    /** The per property */
    private Json per;
    /** The pv property */
    private Json pv;
    /** The rate property */
    private Json rate;
    /**
     * Instantiates a new ispmtPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IspmtPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ispmtPostRequestBody
     */
    @javax.annotation.Nonnull
    public static IspmtPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IspmtPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("nper", (n) -> { this.setNper(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("per", (n) -> { this.setPer(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("pv", (n) -> { this.setPv(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("rate", (n) -> { this.setRate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the nper property value. The nper property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getNper() {
        return this.nper;
    }
    /**
     * Gets the per property value. The per property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getPer() {
        return this.per;
    }
    /**
     * Gets the pv property value. The pv property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getPv() {
        return this.pv;
    }
    /**
     * Gets the rate property value. The rate property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getRate() {
        return this.rate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("nper", this.getNper());
        writer.writeObjectValue("per", this.getPer());
        writer.writeObjectValue("pv", this.getPv());
        writer.writeObjectValue("rate", this.getRate());
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
     * Sets the nper property value. The nper property
     * @param value Value to set for the nper property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNper(@javax.annotation.Nullable final Json value) {
        this.nper = value;
    }
    /**
     * Sets the per property value. The per property
     * @param value Value to set for the per property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPer(@javax.annotation.Nullable final Json value) {
        this.per = value;
    }
    /**
     * Sets the pv property value. The pv property
     * @param value Value to set for the pv property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPv(@javax.annotation.Nullable final Json value) {
        this.pv = value;
    }
    /**
     * Sets the rate property value. The rate property
     * @param value Value to set for the rate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRate(@javax.annotation.Nullable final Json value) {
        this.rate = value;
    }
}
