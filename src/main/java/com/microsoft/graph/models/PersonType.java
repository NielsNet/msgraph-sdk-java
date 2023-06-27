package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PersonType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The type of data source, such as Person.
     */
    private String classEscaped;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The secondary type of data source, such as OrganizationUser.
     */
    private String subclass;
    /**
     * Instantiates a new personType and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PersonType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a personType
     */
    @javax.annotation.Nonnull
    public static PersonType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersonType();
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
     * Gets the class property value. The type of data source, such as Person.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClassEscaped() {
        return this.classEscaped;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("class", (n) -> { this.setClass(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("subclass", (n) -> { this.setSubclass(n.getStringValue()); });
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
     * Gets the subclass property value. The secondary type of data source, such as OrganizationUser.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubclass() {
        return this.subclass;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("class", this.getClassEscaped());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("subclass", this.getSubclass());
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
     * Sets the class property value. The type of data source, such as Person.
     * @param value Value to set for the class property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClass(@javax.annotation.Nullable final String value) {
        this.classEscaped = value;
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
     * Sets the subclass property value. The secondary type of data source, such as OrganizationUser.
     * @param value Value to set for the subclass property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubclass(@javax.annotation.Nullable final String value) {
        this.subclass = value;
    }
}
