package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsAppX extends MobileLobApp implements Parsable {
    /**
     * Contains properties for Windows architecture.
     */
    private WindowsArchitecture applicableArchitectures;
    /**
     * The identity name of the uploaded app package. For example: 'Contoso.DemoApp'.
     */
    private String identityName;
    /**
     * The identity publisher hash of the uploaded app package. This is the hash of the publisher from the manifest. For example: 'AB82CD0XYZ'.
     */
    private String identityPublisherHash;
    /**
     * The identity resource identifier of the uploaded app package. For example: 'TestResourceId'.
     */
    private String identityResourceIdentifier;
    /**
     * The identity version of the uploaded app package. For example: '1.0.0.0'.
     */
    private String identityVersion;
    /**
     * When TRUE, indicates that the app is a bundle. When FALSE, indicates that the app is not a bundle. By default, property is set to FALSE.
     */
    private Boolean isBundle;
    /**
     * The minimum operating system required for a Windows mobile app.
     */
    private WindowsMinimumOperatingSystem minimumSupportedOperatingSystem;
    /**
     * Instantiates a new WindowsAppX and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsAppX() {
        super();
        this.setOdataType("#microsoft.graph.windowsAppX");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsAppX
     */
    @javax.annotation.Nonnull
    public static WindowsAppX createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsAppX();
    }
    /**
     * Gets the applicableArchitectures property value. Contains properties for Windows architecture.
     * @return a WindowsArchitecture
     */
    @javax.annotation.Nullable
    public WindowsArchitecture getApplicableArchitectures() {
        return this.applicableArchitectures;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableArchitectures", (n) -> { this.setApplicableArchitectures(n.getEnumValue(WindowsArchitecture.class)); });
        deserializerMap.put("identityName", (n) -> { this.setIdentityName(n.getStringValue()); });
        deserializerMap.put("identityPublisherHash", (n) -> { this.setIdentityPublisherHash(n.getStringValue()); });
        deserializerMap.put("identityResourceIdentifier", (n) -> { this.setIdentityResourceIdentifier(n.getStringValue()); });
        deserializerMap.put("identityVersion", (n) -> { this.setIdentityVersion(n.getStringValue()); });
        deserializerMap.put("isBundle", (n) -> { this.setIsBundle(n.getBooleanValue()); });
        deserializerMap.put("minimumSupportedOperatingSystem", (n) -> { this.setMinimumSupportedOperatingSystem(n.getObjectValue(WindowsMinimumOperatingSystem::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identityName property value. The identity name of the uploaded app package. For example: 'Contoso.DemoApp'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityName() {
        return this.identityName;
    }
    /**
     * Gets the identityPublisherHash property value. The identity publisher hash of the uploaded app package. This is the hash of the publisher from the manifest. For example: 'AB82CD0XYZ'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityPublisherHash() {
        return this.identityPublisherHash;
    }
    /**
     * Gets the identityResourceIdentifier property value. The identity resource identifier of the uploaded app package. For example: 'TestResourceId'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityResourceIdentifier() {
        return this.identityResourceIdentifier;
    }
    /**
     * Gets the identityVersion property value. The identity version of the uploaded app package. For example: '1.0.0.0'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentityVersion() {
        return this.identityVersion;
    }
    /**
     * Gets the isBundle property value. When TRUE, indicates that the app is a bundle. When FALSE, indicates that the app is not a bundle. By default, property is set to FALSE.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBundle() {
        return this.isBundle;
    }
    /**
     * Gets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @return a WindowsMinimumOperatingSystem
     */
    @javax.annotation.Nullable
    public WindowsMinimumOperatingSystem getMinimumSupportedOperatingSystem() {
        return this.minimumSupportedOperatingSystem;
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
        writer.writeEnumValue("applicableArchitectures", this.getApplicableArchitectures());
        writer.writeStringValue("identityName", this.getIdentityName());
        writer.writeStringValue("identityPublisherHash", this.getIdentityPublisherHash());
        writer.writeStringValue("identityResourceIdentifier", this.getIdentityResourceIdentifier());
        writer.writeStringValue("identityVersion", this.getIdentityVersion());
        writer.writeBooleanValue("isBundle", this.getIsBundle());
        writer.writeObjectValue("minimumSupportedOperatingSystem", this.getMinimumSupportedOperatingSystem());
    }
    /**
     * Sets the applicableArchitectures property value. Contains properties for Windows architecture.
     * @param value Value to set for the applicableArchitectures property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicableArchitectures(@javax.annotation.Nullable final WindowsArchitecture value) {
        this.applicableArchitectures = value;
    }
    /**
     * Sets the identityName property value. The identity name of the uploaded app package. For example: 'Contoso.DemoApp'.
     * @param value Value to set for the identityName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityName(@javax.annotation.Nullable final String value) {
        this.identityName = value;
    }
    /**
     * Sets the identityPublisherHash property value. The identity publisher hash of the uploaded app package. This is the hash of the publisher from the manifest. For example: 'AB82CD0XYZ'.
     * @param value Value to set for the identityPublisherHash property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityPublisherHash(@javax.annotation.Nullable final String value) {
        this.identityPublisherHash = value;
    }
    /**
     * Sets the identityResourceIdentifier property value. The identity resource identifier of the uploaded app package. For example: 'TestResourceId'.
     * @param value Value to set for the identityResourceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityResourceIdentifier(@javax.annotation.Nullable final String value) {
        this.identityResourceIdentifier = value;
    }
    /**
     * Sets the identityVersion property value. The identity version of the uploaded app package. For example: '1.0.0.0'.
     * @param value Value to set for the identityVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIdentityVersion(@javax.annotation.Nullable final String value) {
        this.identityVersion = value;
    }
    /**
     * Sets the isBundle property value. When TRUE, indicates that the app is a bundle. When FALSE, indicates that the app is not a bundle. By default, property is set to FALSE.
     * @param value Value to set for the isBundle property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsBundle(@javax.annotation.Nullable final Boolean value) {
        this.isBundle = value;
    }
    /**
     * Sets the minimumSupportedOperatingSystem property value. The minimum operating system required for a Windows mobile app.
     * @param value Value to set for the minimumSupportedOperatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumSupportedOperatingSystem(@javax.annotation.Nullable final WindowsMinimumOperatingSystem value) {
        this.minimumSupportedOperatingSystem = value;
    }
}
