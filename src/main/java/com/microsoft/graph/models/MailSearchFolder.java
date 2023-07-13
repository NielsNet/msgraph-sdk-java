package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MailSearchFolder extends MailFolder implements Parsable {
    /**
     * The OData query to filter the messages.
     */
    private String filterQuery;
    /**
     * Indicates how the mailbox folder hierarchy should be traversed in the search. true means that a deep search should be done to include child folders in the hierarchy of each folder explicitly specified in sourceFolderIds. false means a shallow search of only each of the folders explicitly specified in sourceFolderIds.
     */
    private Boolean includeNestedFolders;
    /**
     * Indicates whether a search folder is editable using REST APIs.
     */
    private Boolean isSupported;
    /**
     * The mailbox folders that should be mined.
     */
    private java.util.List<String> sourceFolderIds;
    /**
     * Instantiates a new mailSearchFolder and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MailSearchFolder() {
        super();
        this.setOdataType("#microsoft.graph.mailSearchFolder");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mailSearchFolder
     */
    @javax.annotation.Nonnull
    public static MailSearchFolder createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MailSearchFolder();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("filterQuery", (n) -> { this.setFilterQuery(n.getStringValue()); });
        deserializerMap.put("includeNestedFolders", (n) -> { this.setIncludeNestedFolders(n.getBooleanValue()); });
        deserializerMap.put("isSupported", (n) -> { this.setIsSupported(n.getBooleanValue()); });
        deserializerMap.put("sourceFolderIds", (n) -> { this.setSourceFolderIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the filterQuery property value. The OData query to filter the messages.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFilterQuery() {
        return this.filterQuery;
    }
    /**
     * Gets the includeNestedFolders property value. Indicates how the mailbox folder hierarchy should be traversed in the search. true means that a deep search should be done to include child folders in the hierarchy of each folder explicitly specified in sourceFolderIds. false means a shallow search of only each of the folders explicitly specified in sourceFolderIds.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIncludeNestedFolders() {
        return this.includeNestedFolders;
    }
    /**
     * Gets the isSupported property value. Indicates whether a search folder is editable using REST APIs.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSupported() {
        return this.isSupported;
    }
    /**
     * Gets the sourceFolderIds property value. The mailbox folders that should be mined.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSourceFolderIds() {
        return this.sourceFolderIds;
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
        writer.writeStringValue("filterQuery", this.getFilterQuery());
        writer.writeBooleanValue("includeNestedFolders", this.getIncludeNestedFolders());
        writer.writeBooleanValue("isSupported", this.getIsSupported());
        writer.writeCollectionOfPrimitiveValues("sourceFolderIds", this.getSourceFolderIds());
    }
    /**
     * Sets the filterQuery property value. The OData query to filter the messages.
     * @param value Value to set for the filterQuery property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFilterQuery(@javax.annotation.Nullable final String value) {
        this.filterQuery = value;
    }
    /**
     * Sets the includeNestedFolders property value. Indicates how the mailbox folder hierarchy should be traversed in the search. true means that a deep search should be done to include child folders in the hierarchy of each folder explicitly specified in sourceFolderIds. false means a shallow search of only each of the folders explicitly specified in sourceFolderIds.
     * @param value Value to set for the includeNestedFolders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeNestedFolders(@javax.annotation.Nullable final Boolean value) {
        this.includeNestedFolders = value;
    }
    /**
     * Sets the isSupported property value. Indicates whether a search folder is editable using REST APIs.
     * @param value Value to set for the isSupported property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSupported(@javax.annotation.Nullable final Boolean value) {
        this.isSupported = value;
    }
    /**
     * Sets the sourceFolderIds property value. The mailbox folders that should be mined.
     * @param value Value to set for the sourceFolderIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourceFolderIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.sourceFolderIds = value;
    }
}
