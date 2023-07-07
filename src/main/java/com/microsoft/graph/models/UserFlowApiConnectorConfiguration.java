package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserFlowApiConnectorConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The postAttributeCollection property
     */
    private IdentityApiConnector postAttributeCollection;
    /**
     * The postFederationSignup property
     */
    private IdentityApiConnector postFederationSignup;
    /**
     * Instantiates a new userFlowApiConnectorConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserFlowApiConnectorConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userFlowApiConnectorConfiguration
     */
    @javax.annotation.Nonnull
    public static UserFlowApiConnectorConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserFlowApiConnectorConfiguration();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("postAttributeCollection", (n) -> { this.setPostAttributeCollection(n.getObjectValue(IdentityApiConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("postFederationSignup", (n) -> { this.setPostFederationSignup(n.getObjectValue(IdentityApiConnector::createFromDiscriminatorValue)); });
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
     * Gets the postAttributeCollection property value. The postAttributeCollection property
     * @return a identityApiConnector
     */
    @javax.annotation.Nullable
    public IdentityApiConnector getPostAttributeCollection() {
        return this.postAttributeCollection;
    }
    /**
     * Gets the postFederationSignup property value. The postFederationSignup property
     * @return a identityApiConnector
     */
    @javax.annotation.Nullable
    public IdentityApiConnector getPostFederationSignup() {
        return this.postFederationSignup;
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
        writer.writeObjectValue("postAttributeCollection", this.getPostAttributeCollection());
        writer.writeObjectValue("postFederationSignup", this.getPostFederationSignup());
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
     * Sets the postAttributeCollection property value. The postAttributeCollection property
     * @param value Value to set for the postAttributeCollection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostAttributeCollection(@javax.annotation.Nullable final IdentityApiConnector value) {
        this.postAttributeCollection = value;
    }
    /**
     * Sets the postFederationSignup property value. The postFederationSignup property
     * @param value Value to set for the postFederationSignup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostFederationSignup(@javax.annotation.Nullable final IdentityApiConnector value) {
        this.postFederationSignup = value;
    }
}
