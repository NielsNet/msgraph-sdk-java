package microsoft.graph.devices.getavailableextensionproperties;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the getAvailableExtensionProperties method. */
public class GetAvailableExtensionPropertiesPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The isSyncedFromOnPremises property */
    private Boolean _isSyncedFromOnPremises;
    /**
     * Instantiates a new getAvailableExtensionPropertiesPostRequestBody and sets the default values.
     * @return a void
     */
    public GetAvailableExtensionPropertiesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getAvailableExtensionPropertiesPostRequestBody
     */
    @javax.annotation.Nonnull
    public static GetAvailableExtensionPropertiesPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetAvailableExtensionPropertiesPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final GetAvailableExtensionPropertiesPostRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("isSyncedFromOnPremises", (n) -> { currentObject.setIsSyncedFromOnPremises(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the isSyncedFromOnPremises property value. The isSyncedFromOnPremises property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSyncedFromOnPremises() {
        return this._isSyncedFromOnPremises;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isSyncedFromOnPremises", this.getIsSyncedFromOnPremises());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the isSyncedFromOnPremises property value. The isSyncedFromOnPremises property
     * @param value Value to set for the isSyncedFromOnPremises property.
     * @return a void
     */
    public void setIsSyncedFromOnPremises(@javax.annotation.Nullable final Boolean value) {
        this._isSyncedFromOnPremises = value;
    }
}