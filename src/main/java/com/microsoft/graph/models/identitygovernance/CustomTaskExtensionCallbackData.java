package com.microsoft.graph.models.identitygovernance;

import com.microsoft.graph.models.CustomExtensionData;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomTaskExtensionCallbackData extends CustomExtensionData implements Parsable {
    /**
     * Operation status that's provided by the Azure Logic App indicating whenever the Azure Logic App has run successfully or not. Supported values: completed, failed, unknownFutureValue.
     */
    private CustomTaskExtensionOperationStatus operationStatus;
    /**
     * Instantiates a new customTaskExtensionCallbackData and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CustomTaskExtensionCallbackData() {
        super();
        this.setOdataType("#microsoft.graph.identityGovernance.customTaskExtensionCallbackData");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customTaskExtensionCallbackData
     */
    @javax.annotation.Nonnull
    public static CustomTaskExtensionCallbackData createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomTaskExtensionCallbackData();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("operationStatus", (n) -> { this.setOperationStatus(n.getEnumValue(CustomTaskExtensionOperationStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the operationStatus property value. Operation status that's provided by the Azure Logic App indicating whenever the Azure Logic App has run successfully or not. Supported values: completed, failed, unknownFutureValue.
     * @return a customTaskExtensionOperationStatus
     */
    @javax.annotation.Nullable
    public CustomTaskExtensionOperationStatus getOperationStatus() {
        return this.operationStatus;
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
        writer.writeEnumValue("operationStatus", this.getOperationStatus());
    }
    /**
     * Sets the operationStatus property value. Operation status that's provided by the Azure Logic App indicating whenever the Azure Logic App has run successfully or not. Supported values: completed, failed, unknownFutureValue.
     * @param value Value to set for the operationStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperationStatus(@javax.annotation.Nullable final CustomTaskExtensionOperationStatus value) {
        this.operationStatus = value;
    }
}
