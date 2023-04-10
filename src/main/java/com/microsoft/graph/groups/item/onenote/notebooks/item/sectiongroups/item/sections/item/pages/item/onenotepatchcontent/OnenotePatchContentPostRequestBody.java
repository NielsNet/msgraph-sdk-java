package com.microsoft.graph.groups.item.onenote.notebooks.item.sectiongroups.item.sections.item.pages.item.onenotepatchcontent;

import com.microsoft.graph.models.OnenotePatchContentCommand;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnenotePatchContentPostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The commands property */
    private java.util.List<OnenotePatchContentCommand> commands;
    /**
     * Instantiates a new onenotePatchContentPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnenotePatchContentPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onenotePatchContentPostRequestBody
     */
    @javax.annotation.Nonnull
    public static OnenotePatchContentPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnenotePatchContentPostRequestBody();
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
     * Gets the commands property value. The commands property
     * @return a onenotePatchContentCommand
     */
    @javax.annotation.Nullable
    public java.util.List<OnenotePatchContentCommand> getCommands() {
        return this.commands;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("commands", (n) -> { this.setCommands(n.getCollectionOfObjectValues(OnenotePatchContentCommand::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("commands", this.getCommands());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the commands property value. The commands property
     * @param value Value to set for the commands property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCommands(@javax.annotation.Nullable final java.util.List<OnenotePatchContentCommand> value) {
        this.commands = value;
    }
}