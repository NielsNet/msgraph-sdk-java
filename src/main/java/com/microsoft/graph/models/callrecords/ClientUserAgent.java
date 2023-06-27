package com.microsoft.graph.models.callrecords;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ClientUserAgent extends UserAgent implements Parsable {
    /**
     * The unique identifier of the Azure AD application used by this endpoint.
     */
    private String azureADAppId;
    /**
     * Immutable resource identifier of the Azure Communication Service associated with this endpoint based on Communication Services APIs.
     */
    private String communicationServiceId;
    /**
     * The platform property
     */
    private ClientPlatform platform;
    /**
     * The productFamily property
     */
    private ProductFamily productFamily;
    /**
     * Instantiates a new ClientUserAgent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ClientUserAgent() {
        super();
        this.setOdataType("#microsoft.graph.callRecords.clientUserAgent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ClientUserAgent
     */
    @javax.annotation.Nonnull
    public static ClientUserAgent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClientUserAgent();
    }
    /**
     * Gets the azureADAppId property value. The unique identifier of the Azure AD application used by this endpoint.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureADAppId() {
        return this.azureADAppId;
    }
    /**
     * Gets the communicationServiceId property value. Immutable resource identifier of the Azure Communication Service associated with this endpoint based on Communication Services APIs.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCommunicationServiceId() {
        return this.communicationServiceId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureADAppId", (n) -> { this.setAzureADAppId(n.getStringValue()); });
        deserializerMap.put("communicationServiceId", (n) -> { this.setCommunicationServiceId(n.getStringValue()); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(ClientPlatform.class)); });
        deserializerMap.put("productFamily", (n) -> { this.setProductFamily(n.getEnumValue(ProductFamily.class)); });
        return deserializerMap;
    }
    /**
     * Gets the platform property value. The platform property
     * @return a ClientPlatform
     */
    @javax.annotation.Nullable
    public ClientPlatform getPlatform() {
        return this.platform;
    }
    /**
     * Gets the productFamily property value. The productFamily property
     * @return a ProductFamily
     */
    @javax.annotation.Nullable
    public ProductFamily getProductFamily() {
        return this.productFamily;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("azureADAppId", this.getAzureADAppId());
        writer.writeStringValue("communicationServiceId", this.getCommunicationServiceId());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeEnumValue("productFamily", this.getProductFamily());
    }
    /**
     * Sets the azureADAppId property value. The unique identifier of the Azure AD application used by this endpoint.
     * @param value Value to set for the azureADAppId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureADAppId(@javax.annotation.Nullable final String value) {
        this.azureADAppId = value;
    }
    /**
     * Sets the communicationServiceId property value. Immutable resource identifier of the Azure Communication Service associated with this endpoint based on Communication Services APIs.
     * @param value Value to set for the communicationServiceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCommunicationServiceId(@javax.annotation.Nullable final String value) {
        this.communicationServiceId = value;
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatform(@javax.annotation.Nullable final ClientPlatform value) {
        this.platform = value;
    }
    /**
     * Sets the productFamily property value. The productFamily property
     * @param value Value to set for the productFamily property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductFamily(@javax.annotation.Nullable final ProductFamily value) {
        this.productFamily = value;
    }
}
