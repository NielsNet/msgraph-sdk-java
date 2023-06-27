package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AlterationResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Defines the original user query string.
     */
    private String originalQueryString;
    /**
     * Defines the details of the alteration information for the spelling correction.
     */
    private SearchAlteration queryAlteration;
    /**
     * Defines the type of the spelling correction. Possible values are: suggestion, modification.
     */
    private SearchAlterationType queryAlterationType;
    /**
     * Instantiates a new alterationResponse and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AlterationResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alterationResponse
     */
    @javax.annotation.Nonnull
    public static AlterationResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlterationResponse();
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
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("originalQueryString", (n) -> { this.setOriginalQueryString(n.getStringValue()); });
        deserializerMap.put("queryAlteration", (n) -> { this.setQueryAlteration(n.getObjectValue(SearchAlteration::createFromDiscriminatorValue)); });
        deserializerMap.put("queryAlterationType", (n) -> { this.setQueryAlterationType(n.getEnumValue(SearchAlterationType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the originalQueryString property value. Defines the original user query string.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginalQueryString() {
        return this.originalQueryString;
    }
    /**
     * Gets the queryAlteration property value. Defines the details of the alteration information for the spelling correction.
     * @return a searchAlteration
     */
    @javax.annotation.Nullable
    public SearchAlteration getQueryAlteration() {
        return this.queryAlteration;
    }
    /**
     * Gets the queryAlterationType property value. Defines the type of the spelling correction. Possible values are: suggestion, modification.
     * @return a searchAlterationType
     */
    @javax.annotation.Nullable
    public SearchAlterationType getQueryAlterationType() {
        return this.queryAlterationType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("originalQueryString", this.getOriginalQueryString());
        writer.writeObjectValue("queryAlteration", this.getQueryAlteration());
        writer.writeEnumValue("queryAlterationType", this.getQueryAlterationType());
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the originalQueryString property value. Defines the original user query string.
     * @param value Value to set for the originalQueryString property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginalQueryString(@javax.annotation.Nullable final String value) {
        this.originalQueryString = value;
    }
    /**
     * Sets the queryAlteration property value. Defines the details of the alteration information for the spelling correction.
     * @param value Value to set for the queryAlteration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryAlteration(@javax.annotation.Nullable final SearchAlteration value) {
        this.queryAlteration = value;
    }
    /**
     * Sets the queryAlterationType property value. Defines the type of the spelling correction. Possible values are: suggestion, modification.
     * @param value Value to set for the queryAlterationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryAlterationType(@javax.annotation.Nullable final SearchAlterationType value) {
        this.queryAlterationType = value;
    }
}
