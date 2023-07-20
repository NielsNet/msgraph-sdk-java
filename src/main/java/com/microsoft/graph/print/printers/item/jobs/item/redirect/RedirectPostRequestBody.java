package com.microsoft.graph.print.printers.item.jobs.item.redirect;

import com.microsoft.graph.models.PrintJobConfiguration;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RedirectPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The configuration property
     */
    private PrintJobConfiguration configuration;
    /**
     * The destinationPrinterId property
     */
    private String destinationPrinterId;
    /**
     * Instantiates a new redirectPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RedirectPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a redirectPostRequestBody
     */
    @javax.annotation.Nonnull
    public static RedirectPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RedirectPostRequestBody();
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
     * Gets the configuration property value. The configuration property
     * @return a printJobConfiguration
     */
    @javax.annotation.Nullable
    public PrintJobConfiguration getConfiguration() {
        return this.configuration;
    }
    /**
     * Gets the destinationPrinterId property value. The destinationPrinterId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationPrinterId() {
        return this.destinationPrinterId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(PrintJobConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("destinationPrinterId", (n) -> { this.setDestinationPrinterId(n.getStringValue()); });
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
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeStringValue("destinationPrinterId", this.getDestinationPrinterId());
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
     * Sets the configuration property value. The configuration property
     * @param value Value to set for the configuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfiguration(@javax.annotation.Nullable final PrintJobConfiguration value) {
        this.configuration = value;
    }
    /**
     * Sets the destinationPrinterId property value. The destinationPrinterId property
     * @param value Value to set for the destinationPrinterId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationPrinterId(@javax.annotation.Nullable final String value) {
        this.destinationPrinterId = value;
    }
}
