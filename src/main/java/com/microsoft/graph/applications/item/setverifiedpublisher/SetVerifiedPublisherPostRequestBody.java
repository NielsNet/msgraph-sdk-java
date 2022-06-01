package microsoft.graph.applications.item.setverifiedpublisher;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the setVerifiedPublisher method. */
public class SetVerifiedPublisherPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The verifiedPublisherId property */
    private String _verifiedPublisherId;
    /**
     * Instantiates a new setVerifiedPublisherPostRequestBody and sets the default values.
     * @return a void
     */
    public SetVerifiedPublisherPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a setVerifiedPublisherPostRequestBody
     */
    @javax.annotation.Nonnull
    public static SetVerifiedPublisherPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SetVerifiedPublisherPostRequestBody();
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
        final SetVerifiedPublisherPostRequestBody currentObject = this;
        return new HashMap<>(1) {{
            this.put("verifiedPublisherId", (n) -> { currentObject.setVerifiedPublisherId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the verifiedPublisherId property value. The verifiedPublisherId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVerifiedPublisherId() {
        return this._verifiedPublisherId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("verifiedPublisherId", this.getVerifiedPublisherId());
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
     * Sets the verifiedPublisherId property value. The verifiedPublisherId property
     * @param value Value to set for the verifiedPublisherId property.
     * @return a void
     */
    public void setVerifiedPublisherId(@javax.annotation.Nullable final String value) {
        this._verifiedPublisherId = value;
    }
}