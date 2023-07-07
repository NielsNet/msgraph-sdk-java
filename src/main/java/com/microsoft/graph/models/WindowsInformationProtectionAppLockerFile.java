package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Information Protection AppLocker File
 */
public class WindowsInformationProtectionAppLockerFile extends Entity implements Parsable {
    /**
     * The friendly name
     */
    private String displayName;
    /**
     * File as a byte array
     */
    private byte[] file;
    /**
     * SHA256 hash of the file
     */
    private String fileHash;
    /**
     * Version of the entity.
     */
    private String version;
    /**
     * Instantiates a new windowsInformationProtectionAppLockerFile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsInformationProtectionAppLockerFile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsInformationProtectionAppLockerFile
     */
    @javax.annotation.Nonnull
    public static WindowsInformationProtectionAppLockerFile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsInformationProtectionAppLockerFile();
    }
    /**
     * Gets the displayName property value. The friendly name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("file", (n) -> { this.setFile(n.getByteArrayValue()); });
        deserializerMap.put("fileHash", (n) -> { this.setFileHash(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the file property value. File as a byte array
     * @return a base64url
     */
    @javax.annotation.Nullable
    public byte[] getFile() {
        return this.file;
    }
    /**
     * Gets the fileHash property value. SHA256 hash of the file
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileHash() {
        return this.fileHash;
    }
    /**
     * Gets the version property value. Version of the entity.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this.version;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeByteArrayValue("file", this.getFile());
        writer.writeStringValue("fileHash", this.getFileHash());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the displayName property value. The friendly name
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the file property value. File as a byte array
     * @param value Value to set for the file property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFile(@javax.annotation.Nullable final byte[] value) {
        this.file = value;
    }
    /**
     * Sets the fileHash property value. SHA256 hash of the file
     * @param value Value to set for the fileHash property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileHash(@javax.annotation.Nullable final String value) {
        this.fileHash = value;
    }
    /**
     * Sets the version property value. Version of the entity.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final String value) {
        this.version = value;
    }
}
