package microsoft.graph.models.externalconnectors;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class External implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The connections property */
    private java.util.List<ExternalConnection> _connections;
    /**
     * Instantiates a new External and sets the default values.
     * @return a void
     */
    public External() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a External
     */
    @javax.annotation.Nonnull
    public static External createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new External();
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
     * Gets the connections property value. The connections property
     * @return a externalConnection
     */
    @javax.annotation.Nullable
    public java.util.List<ExternalConnection> getConnections() {
        return this._connections;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final External currentObject = this;
        return new HashMap<>(1) {{
            this.put("connections", (n) -> { currentObject.setConnections(n.getCollectionOfObjectValues(ExternalConnection::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("connections", this.getConnections());
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
     * Sets the connections property value. The connections property
     * @param value Value to set for the connections property.
     * @return a void
     */
    public void setConnections(@javax.annotation.Nullable final java.util.List<ExternalConnection> value) {
        this._connections = value;
    }
}