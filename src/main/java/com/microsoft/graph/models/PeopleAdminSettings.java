package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PeopleAdminSettings extends Entity implements Parsable {
    /**
     * Contains a collection of the properties an administrator has defined as visible on the Microsoft 365 profile card.
     */
    private java.util.List<ProfileCardProperty> profileCardProperties;
    /**
     * Instantiates a new PeopleAdminSettings and sets the default values.
     */
    public PeopleAdminSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PeopleAdminSettings
     */
    @jakarta.annotation.Nonnull
    public static PeopleAdminSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PeopleAdminSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("profileCardProperties", (n) -> { this.setProfileCardProperties(n.getCollectionOfObjectValues(ProfileCardProperty::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the profileCardProperties property value. Contains a collection of the properties an administrator has defined as visible on the Microsoft 365 profile card.
     * @return a java.util.List<ProfileCardProperty>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ProfileCardProperty> getProfileCardProperties() {
        return this.profileCardProperties;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("profileCardProperties", this.getProfileCardProperties());
    }
    /**
     * Sets the profileCardProperties property value. Contains a collection of the properties an administrator has defined as visible on the Microsoft 365 profile card.
     * @param value Value to set for the profileCardProperties property.
     */
    public void setProfileCardProperties(@jakarta.annotation.Nullable final java.util.List<ProfileCardProperty> value) {
        this.profileCardProperties = value;
    }
}
