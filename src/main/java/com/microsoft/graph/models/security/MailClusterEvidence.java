package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MailClusterEvidence extends AlertEvidence implements Parsable {
    /**
     * The clustering logic of the emails inside the cluster.
     */
    private String clusterBy;
    /**
     * The value utilized to cluster the similar emails.
     */
    private String clusterByValue;
    /**
     * Count of emails in the email cluster.
     */
    private Long emailCount;
    /**
     * Unique identifiers for the emails in the cluster, generated by Microsoft 365.
     */
    private java.util.List<String> networkMessageIds;
    /**
     * The query used to identify the email cluster.
     */
    private String query;
    /**
     * Uniform resource name (URN) of the automated investigation where the cluster was identified.
     */
    private String urn;
    /**
     * Instantiates a new mailClusterEvidence and sets the default values.
     */
    public MailClusterEvidence() {
        super();
        this.setOdataType("#microsoft.graph.security.mailClusterEvidence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mailClusterEvidence
     */
    @jakarta.annotation.Nonnull
    public static MailClusterEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailClusterEvidence();
    }
    /**
     * Gets the clusterBy property value. The clustering logic of the emails inside the cluster.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getClusterBy() {
        return this.clusterBy;
    }
    /**
     * Gets the clusterByValue property value. The value utilized to cluster the similar emails.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getClusterByValue() {
        return this.clusterByValue;
    }
    /**
     * Gets the emailCount property value. Count of emails in the email cluster.
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getEmailCount() {
        return this.emailCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("clusterBy", (n) -> { this.setClusterBy(n.getStringValue()); });
        deserializerMap.put("clusterByValue", (n) -> { this.setClusterByValue(n.getStringValue()); });
        deserializerMap.put("emailCount", (n) -> { this.setEmailCount(n.getLongValue()); });
        deserializerMap.put("networkMessageIds", (n) -> { this.setNetworkMessageIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("query", (n) -> { this.setQuery(n.getStringValue()); });
        deserializerMap.put("urn", (n) -> { this.setUrn(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the networkMessageIds property value. Unique identifiers for the emails in the cluster, generated by Microsoft 365.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNetworkMessageIds() {
        return this.networkMessageIds;
    }
    /**
     * Gets the query property value. The query used to identify the email cluster.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getQuery() {
        return this.query;
    }
    /**
     * Gets the urn property value. Uniform resource name (URN) of the automated investigation where the cluster was identified.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUrn() {
        return this.urn;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("clusterBy", this.getClusterBy());
        writer.writeStringValue("clusterByValue", this.getClusterByValue());
        writer.writeLongValue("emailCount", this.getEmailCount());
        writer.writeCollectionOfPrimitiveValues("networkMessageIds", this.getNetworkMessageIds());
        writer.writeStringValue("query", this.getQuery());
        writer.writeStringValue("urn", this.getUrn());
    }
    /**
     * Sets the clusterBy property value. The clustering logic of the emails inside the cluster.
     * @param value Value to set for the clusterBy property.
     */
    public void setClusterBy(@jakarta.annotation.Nullable final String value) {
        this.clusterBy = value;
    }
    /**
     * Sets the clusterByValue property value. The value utilized to cluster the similar emails.
     * @param value Value to set for the clusterByValue property.
     */
    public void setClusterByValue(@jakarta.annotation.Nullable final String value) {
        this.clusterByValue = value;
    }
    /**
     * Sets the emailCount property value. Count of emails in the email cluster.
     * @param value Value to set for the emailCount property.
     */
    public void setEmailCount(@jakarta.annotation.Nullable final Long value) {
        this.emailCount = value;
    }
    /**
     * Sets the networkMessageIds property value. Unique identifiers for the emails in the cluster, generated by Microsoft 365.
     * @param value Value to set for the networkMessageIds property.
     */
    public void setNetworkMessageIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.networkMessageIds = value;
    }
    /**
     * Sets the query property value. The query used to identify the email cluster.
     * @param value Value to set for the query property.
     */
    public void setQuery(@jakarta.annotation.Nullable final String value) {
        this.query = value;
    }
    /**
     * Sets the urn property value. Uniform resource name (URN) of the automated investigation where the cluster was identified.
     * @param value Value to set for the urn property.
     */
    public void setUrn(@jakarta.annotation.Nullable final String value) {
        this.urn = value;
    }
}