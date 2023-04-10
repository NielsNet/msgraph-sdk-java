package com.microsoft.graph.users.item.assignlicense;

import com.microsoft.graph.models.AssignedLicense;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
public class AssignLicensePostRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The addLicenses property */
    private java.util.List<AssignedLicense> addLicenses;
    /** The removeLicenses property */
    private java.util.List<UUID> removeLicenses;
    /**
     * Instantiates a new assignLicensePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AssignLicensePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignLicensePostRequestBody
     */
    @javax.annotation.Nonnull
    public static AssignLicensePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignLicensePostRequestBody();
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
     * Gets the addLicenses property value. The addLicenses property
     * @return a assignedLicense
     */
    @javax.annotation.Nullable
    public java.util.List<AssignedLicense> getAddLicenses() {
        return this.addLicenses;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("addLicenses", (n) -> { this.setAddLicenses(n.getCollectionOfObjectValues(AssignedLicense::createFromDiscriminatorValue)); });
        deserializerMap.put("removeLicenses", (n) -> { this.setRemoveLicenses(n.getCollectionOfPrimitiveValues(UUID.class)); });
        return deserializerMap;
    }
    /**
     * Gets the removeLicenses property value. The removeLicenses property
     * @return a UUID
     */
    @javax.annotation.Nullable
    public java.util.List<UUID> getRemoveLicenses() {
        return this.removeLicenses;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("addLicenses", this.getAddLicenses());
        writer.writeCollectionOfPrimitiveValues("removeLicenses", this.getRemoveLicenses());
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
     * Sets the addLicenses property value. The addLicenses property
     * @param value Value to set for the addLicenses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddLicenses(@javax.annotation.Nullable final java.util.List<AssignedLicense> value) {
        this.addLicenses = value;
    }
    /**
     * Sets the removeLicenses property value. The removeLicenses property
     * @param value Value to set for the removeLicenses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoveLicenses(@javax.annotation.Nullable final java.util.List<UUID> value) {
        this.removeLicenses = value;
    }
}