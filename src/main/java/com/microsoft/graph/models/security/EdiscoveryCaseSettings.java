package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EdiscoveryCaseSettings extends Entity implements Parsable {
    /** The OCR (Optical Character Recognition) settings for the case. */
    private OcrSettings ocr;
    /** The redundancy (near duplicate and email threading) detection settings for the case. */
    private RedundancyDetectionSettings redundancyDetection;
    /** The Topic Modeling (Themes) settings for the case. */
    private TopicModelingSettings topicModeling;
    /**
     * Instantiates a new ediscoveryCaseSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EdiscoveryCaseSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ediscoveryCaseSettings
     */
    @javax.annotation.Nonnull
    public static EdiscoveryCaseSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EdiscoveryCaseSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("ocr", (n) -> { this.setOcr(n.getObjectValue(OcrSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("redundancyDetection", (n) -> { this.setRedundancyDetection(n.getObjectValue(RedundancyDetectionSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("topicModeling", (n) -> { this.setTopicModeling(n.getObjectValue(TopicModelingSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the ocr property value. The OCR (Optical Character Recognition) settings for the case.
     * @return a ocrSettings
     */
    @javax.annotation.Nullable
    public OcrSettings getOcr() {
        return this.ocr;
    }
    /**
     * Gets the redundancyDetection property value. The redundancy (near duplicate and email threading) detection settings for the case.
     * @return a redundancyDetectionSettings
     */
    @javax.annotation.Nullable
    public RedundancyDetectionSettings getRedundancyDetection() {
        return this.redundancyDetection;
    }
    /**
     * Gets the topicModeling property value. The Topic Modeling (Themes) settings for the case.
     * @return a topicModelingSettings
     */
    @javax.annotation.Nullable
    public TopicModelingSettings getTopicModeling() {
        return this.topicModeling;
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
        writer.writeObjectValue("ocr", this.getOcr());
        writer.writeObjectValue("redundancyDetection", this.getRedundancyDetection());
        writer.writeObjectValue("topicModeling", this.getTopicModeling());
    }
    /**
     * Sets the ocr property value. The OCR (Optical Character Recognition) settings for the case.
     * @param value Value to set for the ocr property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOcr(@javax.annotation.Nullable final OcrSettings value) {
        this.ocr = value;
    }
    /**
     * Sets the redundancyDetection property value. The redundancy (near duplicate and email threading) detection settings for the case.
     * @param value Value to set for the redundancyDetection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRedundancyDetection(@javax.annotation.Nullable final RedundancyDetectionSettings value) {
        this.redundancyDetection = value;
    }
    /**
     * Sets the topicModeling property value. The Topic Modeling (Themes) settings for the case.
     * @param value Value to set for the topicModeling property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTopicModeling(@javax.annotation.Nullable final TopicModelingSettings value) {
        this.topicModeling = value;
    }
}