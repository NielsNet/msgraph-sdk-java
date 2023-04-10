package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosDeviceFeaturesConfiguration extends AppleDeviceFeaturesConfigurationBase implements Parsable {
    /** Asset tag information for the device, displayed on the login window and lock screen. */
    private String assetTagTemplate;
    /** A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements. */
    private java.util.List<IosHomeScreenItem> homeScreenDockIcons;
    /** A list of pages on the Home Screen. This collection can contain a maximum of 500 elements. */
    private java.util.List<IosHomeScreenPage> homeScreenPages;
    /** A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later. */
    private String lockScreenFootnote;
    /** Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This collection can contain a maximum of 500 elements. */
    private java.util.List<IosNotificationSettings> notificationSettings;
    /**
     * Instantiates a new IosDeviceFeaturesConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosDeviceFeaturesConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosDeviceFeaturesConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosDeviceFeaturesConfiguration
     */
    @javax.annotation.Nonnull
    public static IosDeviceFeaturesConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosDeviceFeaturesConfiguration();
    }
    /**
     * Gets the assetTagTemplate property value. Asset tag information for the device, displayed on the login window and lock screen.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAssetTagTemplate() {
        return this.assetTagTemplate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assetTagTemplate", (n) -> { this.setAssetTagTemplate(n.getStringValue()); });
        deserializerMap.put("homeScreenDockIcons", (n) -> { this.setHomeScreenDockIcons(n.getCollectionOfObjectValues(IosHomeScreenItem::createFromDiscriminatorValue)); });
        deserializerMap.put("homeScreenPages", (n) -> { this.setHomeScreenPages(n.getCollectionOfObjectValues(IosHomeScreenPage::createFromDiscriminatorValue)); });
        deserializerMap.put("lockScreenFootnote", (n) -> { this.setLockScreenFootnote(n.getStringValue()); });
        deserializerMap.put("notificationSettings", (n) -> { this.setNotificationSettings(n.getCollectionOfObjectValues(IosNotificationSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the homeScreenDockIcons property value. A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.
     * @return a iosHomeScreenItem
     */
    @javax.annotation.Nullable
    public java.util.List<IosHomeScreenItem> getHomeScreenDockIcons() {
        return this.homeScreenDockIcons;
    }
    /**
     * Gets the homeScreenPages property value. A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.
     * @return a iosHomeScreenPage
     */
    @javax.annotation.Nullable
    public java.util.List<IosHomeScreenPage> getHomeScreenPages() {
        return this.homeScreenPages;
    }
    /**
     * Gets the lockScreenFootnote property value. A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLockScreenFootnote() {
        return this.lockScreenFootnote;
    }
    /**
     * Gets the notificationSettings property value. Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This collection can contain a maximum of 500 elements.
     * @return a iosNotificationSettings
     */
    @javax.annotation.Nullable
    public java.util.List<IosNotificationSettings> getNotificationSettings() {
        return this.notificationSettings;
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
        writer.writeStringValue("assetTagTemplate", this.getAssetTagTemplate());
        writer.writeCollectionOfObjectValues("homeScreenDockIcons", this.getHomeScreenDockIcons());
        writer.writeCollectionOfObjectValues("homeScreenPages", this.getHomeScreenPages());
        writer.writeStringValue("lockScreenFootnote", this.getLockScreenFootnote());
        writer.writeCollectionOfObjectValues("notificationSettings", this.getNotificationSettings());
    }
    /**
     * Sets the assetTagTemplate property value. Asset tag information for the device, displayed on the login window and lock screen.
     * @param value Value to set for the assetTagTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssetTagTemplate(@javax.annotation.Nullable final String value) {
        this.assetTagTemplate = value;
    }
    /**
     * Sets the homeScreenDockIcons property value. A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the homeScreenDockIcons property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomeScreenDockIcons(@javax.annotation.Nullable final java.util.List<IosHomeScreenItem> value) {
        this.homeScreenDockIcons = value;
    }
    /**
     * Sets the homeScreenPages property value. A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the homeScreenPages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHomeScreenPages(@javax.annotation.Nullable final java.util.List<IosHomeScreenPage> value) {
        this.homeScreenPages = value;
    }
    /**
     * Sets the lockScreenFootnote property value. A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.
     * @param value Value to set for the lockScreenFootnote property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLockScreenFootnote(@javax.annotation.Nullable final String value) {
        this.lockScreenFootnote = value;
    }
    /**
     * Sets the notificationSettings property value. Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This collection can contain a maximum of 500 elements.
     * @param value Value to set for the notificationSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationSettings(@javax.annotation.Nullable final java.util.List<IosNotificationSettings> value) {
        this.notificationSettings = value;
    }
}
