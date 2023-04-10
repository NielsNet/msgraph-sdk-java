package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PersistentBrowserSessionControl extends ConditionalAccessSessionControl implements Parsable {
    /** Possible values are: always, never. */
    private PersistentBrowserSessionMode mode;
    /**
     * Instantiates a new PersistentBrowserSessionControl and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PersistentBrowserSessionControl() {
        super();
        this.setOdataType("#microsoft.graph.persistentBrowserSessionControl");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PersistentBrowserSessionControl
     */
    @javax.annotation.Nonnull
    public static PersistentBrowserSessionControl createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PersistentBrowserSessionControl();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("mode", (n) -> { this.setMode(n.getEnumValue(PersistentBrowserSessionMode.class)); });
        return deserializerMap;
    }
    /**
     * Gets the mode property value. Possible values are: always, never.
     * @return a persistentBrowserSessionMode
     */
    @javax.annotation.Nullable
    public PersistentBrowserSessionMode getMode() {
        return this.mode;
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
        writer.writeEnumValue("mode", this.getMode());
    }
    /**
     * Sets the mode property value. Possible values are: always, never.
     * @param value Value to set for the mode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMode(@javax.annotation.Nullable final PersistentBrowserSessionMode value) {
        this.mode = value;
    }
}
