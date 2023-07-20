package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewReviewerScope implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The query specifying who will be the reviewer.
     */
    private String query;
    /**
     * In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query, for example, ./manager, is specified. Possible value: decisions.
     */
    private String queryRoot;
    /**
     * The type of query. Examples include MicrosoftGraph and ARM.
     */
    private String queryType;
    /**
     * Instantiates a new accessReviewReviewerScope and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessReviewReviewerScope() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewReviewerScope
     */
    @javax.annotation.Nonnull
    public static AccessReviewReviewerScope createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewReviewerScope();
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
        deserializerMap.put("query", (n) -> { this.setQuery(n.getStringValue()); });
        deserializerMap.put("queryRoot", (n) -> { this.setQueryRoot(n.getStringValue()); });
        deserializerMap.put("queryType", (n) -> { this.setQueryType(n.getStringValue()); });
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
     * Gets the query property value. The query specifying who will be the reviewer.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQuery() {
        return this.query;
    }
    /**
     * Gets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query, for example, ./manager, is specified. Possible value: decisions.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQueryRoot() {
        return this.queryRoot;
    }
    /**
     * Gets the queryType property value. The type of query. Examples include MicrosoftGraph and ARM.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getQueryType() {
        return this.queryType;
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
        writer.writeStringValue("query", this.getQuery());
        writer.writeStringValue("queryRoot", this.getQueryRoot());
        writer.writeStringValue("queryType", this.getQueryType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the query property value. The query specifying who will be the reviewer.
     * @param value Value to set for the query property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQuery(@javax.annotation.Nullable final String value) {
        this.query = value;
    }
    /**
     * Sets the queryRoot property value. In the scenario where reviewers need to be specified dynamically, this property is used to indicate the relative source of the query. This property is only required if a relative query, for example, ./manager, is specified. Possible value: decisions.
     * @param value Value to set for the queryRoot property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryRoot(@javax.annotation.Nullable final String value) {
        this.queryRoot = value;
    }
    /**
     * Sets the queryType property value. The type of query. Examples include MicrosoftGraph and ARM.
     * @param value Value to set for the queryType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setQueryType(@javax.annotation.Nullable final String value) {
        this.queryType = value;
    }
}
