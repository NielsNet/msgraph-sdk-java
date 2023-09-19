package com.microsoft.graph.groups.item.calendar.events.item.instances.item.tentativelyaccept;

import com.microsoft.graph.models.TimeSlot;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TentativelyAcceptPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Comment property
     */
    private String comment;
    /**
     * The ProposedNewTime property
     */
    private TimeSlot proposedNewTime;
    /**
     * The SendResponse property
     */
    private Boolean sendResponse;
    /**
     * Instantiates a new tentativelyAcceptPostRequestBody and sets the default values.
     */
    public TentativelyAcceptPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a tentativelyAcceptPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static TentativelyAcceptPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TentativelyAcceptPostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the Comment property value. The Comment property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getComment() {
        return this.comment;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("Comment", (n) -> { this.setComment(n.getStringValue()); });
        deserializerMap.put("ProposedNewTime", (n) -> { this.setProposedNewTime(n.getObjectValue(TimeSlot::createFromDiscriminatorValue)); });
        deserializerMap.put("SendResponse", (n) -> { this.setSendResponse(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ProposedNewTime property value. The ProposedNewTime property
     * @return a timeSlot
     */
    @jakarta.annotation.Nullable
    public TimeSlot getProposedNewTime() {
        return this.proposedNewTime;
    }
    /**
     * Gets the SendResponse property value. The SendResponse property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSendResponse() {
        return this.sendResponse;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("Comment", this.getComment());
        writer.writeObjectValue("ProposedNewTime", this.getProposedNewTime());
        writer.writeBooleanValue("SendResponse", this.getSendResponse());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the Comment property value. The Comment property
     * @param value Value to set for the Comment property.
     */
    public void setComment(@jakarta.annotation.Nullable final String value) {
        this.comment = value;
    }
    /**
     * Sets the ProposedNewTime property value. The ProposedNewTime property
     * @param value Value to set for the ProposedNewTime property.
     */
    public void setProposedNewTime(@jakarta.annotation.Nullable final TimeSlot value) {
        this.proposedNewTime = value;
    }
    /**
     * Sets the SendResponse property value. The SendResponse property
     * @param value Value to set for the SendResponse property.
     */
    public void setSendResponse(@jakarta.annotation.Nullable final Boolean value) {
        this.sendResponse = value;
    }
}