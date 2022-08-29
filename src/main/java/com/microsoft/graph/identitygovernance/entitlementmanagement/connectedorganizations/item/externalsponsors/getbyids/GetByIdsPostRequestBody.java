package microsoft.graph.identitygovernance.entitlementmanagement.connectedorganizations.item.externalsponsors.getbyids;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to call the getByIds method. */
public class GetByIdsPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The ids property */
    private java.util.List<String> _ids;
    /** The types property */
    private java.util.List<String> _types;
    /**
     * Instantiates a new getByIdsPostRequestBody and sets the default values.
     * @return a void
     */
    public GetByIdsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a getByIdsPostRequestBody
     */
    @javax.annotation.Nonnull
    public static GetByIdsPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetByIdsPostRequestBody();
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
        final GetByIdsPostRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("ids", (n) -> { currentObject.setIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("types", (n) -> { currentObject.setTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the ids property value. The ids property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIds() {
        return this._ids;
    }
    /**
     * Gets the types property value. The types property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTypes() {
        return this._types;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("ids", this.getIds());
        writer.writeCollectionOfPrimitiveValues("types", this.getTypes());
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
     * Sets the ids property value. The ids property
     * @param value Value to set for the ids property.
     * @return a void
     */
    public void setIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._ids = value;
    }
    /**
     * Sets the types property value. The types property
     * @param value Value to set for the types property.
     * @return a void
     */
    public void setTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._types = value;
    }
}