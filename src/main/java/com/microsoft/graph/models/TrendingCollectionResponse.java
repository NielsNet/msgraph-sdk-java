package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TrendingCollectionResponse implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataNextLink property */
    private String _odataNextLink;
    /** The value property */
    private java.util.List<Trending> _value;
    /**
     * Instantiates a new TrendingCollectionResponse and sets the default values.
     * @return a void
     */
    public TrendingCollectionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TrendingCollectionResponse
     */
    @javax.annotation.Nonnull
    public static TrendingCollectionResponse createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrendingCollectionResponse();
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
        final TrendingCollectionResponse currentObject = this;
        return new HashMap<>(2) {{
            this.put("@odata.nextLink", (n) -> { currentObject.setOdataNextLink(n.getStringValue()); });
            this.put("value", (n) -> { currentObject.setValue(n.getCollectionOfObjectValues(Trending::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the @odata.nextLink property value. The OdataNextLink property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataNextLink() {
        return this._odataNextLink;
    }
    /**
     * Gets the value property value. The value property
     * @return a trending
     */
    @javax.annotation.Nullable
    public java.util.List<Trending> getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.nextLink", this.getOdataNextLink());
        writer.writeCollectionOfObjectValues("value", this.getValue());
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
     * Sets the @odata.nextLink property value. The OdataNextLink property
     * @param value Value to set for the OdataNextLink property.
     * @return a void
     */
    public void setOdataNextLink(@javax.annotation.Nullable final String value) {
        this._odataNextLink = value;
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final java.util.List<Trending> value) {
        this._value = value;
    }
}