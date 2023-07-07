package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkbookComment extends Entity implements Parsable {
    /**
     * The content of comment.
     */
    private String content;
    /**
     * Indicates the type for the comment.
     */
    private String contentType;
    /**
     * The replies property
     */
    private java.util.List<WorkbookCommentReply> replies;
    /**
     * Instantiates a new workbookComment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WorkbookComment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workbookComment
     */
    @javax.annotation.Nonnull
    public static WorkbookComment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkbookComment();
    }
    /**
     * Gets the content property value. The content of comment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContent() {
        return this.content;
    }
    /**
     * Gets the contentType property value. Indicates the type for the comment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentType() {
        return this.contentType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("contentType", (n) -> { this.setContentType(n.getStringValue()); });
        deserializerMap.put("replies", (n) -> { this.setReplies(n.getCollectionOfObjectValues(WorkbookCommentReply::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the replies property value. The replies property
     * @return a workbookCommentReply
     */
    @javax.annotation.Nullable
    public java.util.List<WorkbookCommentReply> getReplies() {
        return this.replies;
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
        writer.writeStringValue("content", this.getContent());
        writer.writeStringValue("contentType", this.getContentType());
        writer.writeCollectionOfObjectValues("replies", this.getReplies());
    }
    /**
     * Sets the content property value. The content of comment.
     * @param value Value to set for the content property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContent(@javax.annotation.Nullable final String value) {
        this.content = value;
    }
    /**
     * Sets the contentType property value. Indicates the type for the comment.
     * @param value Value to set for the contentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContentType(@javax.annotation.Nullable final String value) {
        this.contentType = value;
    }
    /**
     * Sets the replies property value. The replies property
     * @param value Value to set for the replies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReplies(@javax.annotation.Nullable final java.util.List<WorkbookCommentReply> value) {
        this.replies = value;
    }
}
