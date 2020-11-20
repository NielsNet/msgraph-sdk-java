// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.AppListItem;
import com.microsoft.graph.models.generated.AppListType;
import com.microsoft.graph.models.generated.AndroidRequiredPasswordType;
import com.microsoft.graph.models.generated.WebBrowserCookieSettings;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android General Device Configuration.
 */
public class AndroidGeneralDeviceConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Apps Block Clipboard Sharing.
     * Indicates whether or not to block clipboard sharing to copy and paste between applications.
     */
    @SerializedName(value = "appsBlockClipboardSharing", alternate = {"AppsBlockClipboardSharing"})
    @Expose
	@Nullable
    public Boolean appsBlockClipboardSharing;

    /**
     * The Apps Block Copy Paste.
     * Indicates whether or not to block copy and paste within applications.
     */
    @SerializedName(value = "appsBlockCopyPaste", alternate = {"AppsBlockCopyPaste"})
    @Expose
	@Nullable
    public Boolean appsBlockCopyPaste;

    /**
     * The Apps Block You Tube.
     * Indicates whether or not to block the YouTube app.
     */
    @SerializedName(value = "appsBlockYouTube", alternate = {"AppsBlockYouTube"})
    @Expose
	@Nullable
    public Boolean appsBlockYouTube;

    /**
     * The Apps Hide List.
     * List of apps to be hidden on the KNOX device. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "appsHideList", alternate = {"AppsHideList"})
    @Expose
	@Nullable
    public java.util.List<AppListItem> appsHideList;

    /**
     * The Apps Install Allow List.
     * List of apps which can be installed on the KNOX device. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "appsInstallAllowList", alternate = {"AppsInstallAllowList"})
    @Expose
	@Nullable
    public java.util.List<AppListItem> appsInstallAllowList;

    /**
     * The Apps Launch Block List.
     * List of apps which are blocked from being launched on the KNOX device. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "appsLaunchBlockList", alternate = {"AppsLaunchBlockList"})
    @Expose
	@Nullable
    public java.util.List<AppListItem> appsLaunchBlockList;

    /**
     * The Bluetooth Blocked.
     * Indicates whether or not to block Bluetooth.
     */
    @SerializedName(value = "bluetoothBlocked", alternate = {"BluetoothBlocked"})
    @Expose
	@Nullable
    public Boolean bluetoothBlocked;

    /**
     * The Camera Blocked.
     * Indicates whether or not to block the use of the camera.
     */
    @SerializedName(value = "cameraBlocked", alternate = {"CameraBlocked"})
    @Expose
	@Nullable
    public Boolean cameraBlocked;

    /**
     * The Cellular Block Data Roaming.
     * Indicates whether or not to block data roaming.
     */
    @SerializedName(value = "cellularBlockDataRoaming", alternate = {"CellularBlockDataRoaming"})
    @Expose
	@Nullable
    public Boolean cellularBlockDataRoaming;

    /**
     * The Cellular Block Messaging.
     * Indicates whether or not to block SMS/MMS messaging.
     */
    @SerializedName(value = "cellularBlockMessaging", alternate = {"CellularBlockMessaging"})
    @Expose
	@Nullable
    public Boolean cellularBlockMessaging;

    /**
     * The Cellular Block Voice Roaming.
     * Indicates whether or not to block voice roaming.
     */
    @SerializedName(value = "cellularBlockVoiceRoaming", alternate = {"CellularBlockVoiceRoaming"})
    @Expose
	@Nullable
    public Boolean cellularBlockVoiceRoaming;

    /**
     * The Cellular Block Wi Fi Tethering.
     * Indicates whether or not to block syncing Wi-Fi tethering.
     */
    @SerializedName(value = "cellularBlockWiFiTethering", alternate = {"CellularBlockWiFiTethering"})
    @Expose
	@Nullable
    public Boolean cellularBlockWiFiTethering;

    /**
     * The Compliant App List Type.
     * Type of list that is in the CompliantAppsList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
     */
    @SerializedName(value = "compliantAppListType", alternate = {"CompliantAppListType"})
    @Expose
	@Nullable
    public AppListType compliantAppListType;

    /**
     * The Compliant Apps List.
     * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.
     */
    @SerializedName(value = "compliantAppsList", alternate = {"CompliantAppsList"})
    @Expose
	@Nullable
    public java.util.List<AppListItem> compliantAppsList;

    /**
     * The Device Sharing Allowed.
     * Indicates whether or not to allow device sharing mode.
     */
    @SerializedName(value = "deviceSharingAllowed", alternate = {"DeviceSharingAllowed"})
    @Expose
	@Nullable
    public Boolean deviceSharingAllowed;

    /**
     * The Diagnostic Data Block Submission.
     * Indicates whether or not to block diagnostic data submission.
     */
    @SerializedName(value = "diagnosticDataBlockSubmission", alternate = {"DiagnosticDataBlockSubmission"})
    @Expose
	@Nullable
    public Boolean diagnosticDataBlockSubmission;

    /**
     * The Factory Reset Blocked.
     * Indicates whether or not to block user performing a factory reset.
     */
    @SerializedName(value = "factoryResetBlocked", alternate = {"FactoryResetBlocked"})
    @Expose
	@Nullable
    public Boolean factoryResetBlocked;

    /**
     * The Google Account Block Auto Sync.
     * Indicates whether or not to block Google account auto sync.
     */
    @SerializedName(value = "googleAccountBlockAutoSync", alternate = {"GoogleAccountBlockAutoSync"})
    @Expose
	@Nullable
    public Boolean googleAccountBlockAutoSync;

    /**
     * The Google Play Store Blocked.
     * Indicates whether or not to block the Google Play store.
     */
    @SerializedName(value = "googlePlayStoreBlocked", alternate = {"GooglePlayStoreBlocked"})
    @Expose
	@Nullable
    public Boolean googlePlayStoreBlocked;

    /**
     * The Kiosk Mode Apps.
     * A list of apps that will be allowed to run when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "kioskModeApps", alternate = {"KioskModeApps"})
    @Expose
	@Nullable
    public java.util.List<AppListItem> kioskModeApps;

    /**
     * The Kiosk Mode Block Sleep Button.
     * Indicates whether or not to block the screen sleep button while in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeBlockSleepButton", alternate = {"KioskModeBlockSleepButton"})
    @Expose
	@Nullable
    public Boolean kioskModeBlockSleepButton;

    /**
     * The Kiosk Mode Block Volume Buttons.
     * Indicates whether or not to block the volume buttons while in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeBlockVolumeButtons", alternate = {"KioskModeBlockVolumeButtons"})
    @Expose
	@Nullable
    public Boolean kioskModeBlockVolumeButtons;

    /**
     * The Location Services Blocked.
     * Indicates whether or not to block location services.
     */
    @SerializedName(value = "locationServicesBlocked", alternate = {"LocationServicesBlocked"})
    @Expose
	@Nullable
    public Boolean locationServicesBlocked;

    /**
     * The Nfc Blocked.
     * Indicates whether or not to block Near-Field Communication.
     */
    @SerializedName(value = "nfcBlocked", alternate = {"NfcBlocked"})
    @Expose
	@Nullable
    public Boolean nfcBlocked;

    /**
     * The Password Block Fingerprint Unlock.
     * Indicates whether or not to block fingerprint unlock.
     */
    @SerializedName(value = "passwordBlockFingerprintUnlock", alternate = {"PasswordBlockFingerprintUnlock"})
    @Expose
	@Nullable
    public Boolean passwordBlockFingerprintUnlock;

    /**
     * The Password Block Trust Agents.
     * Indicates whether or not to block Smart Lock and other trust agents.
     */
    @SerializedName(value = "passwordBlockTrustAgents", alternate = {"PasswordBlockTrustAgents"})
    @Expose
	@Nullable
    public Boolean passwordBlockTrustAgents;

    /**
     * The Password Expiration Days.
     * Number of days before the password expires. Valid values 1 to 365
     */
    @SerializedName(value = "passwordExpirationDays", alternate = {"PasswordExpirationDays"})
    @Expose
	@Nullable
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Length.
     * Minimum length of passwords. Valid values 4 to 16
     */
    @SerializedName(value = "passwordMinimumLength", alternate = {"PasswordMinimumLength"})
    @Expose
	@Nullable
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Screen Timeout.
     * Minutes of inactivity before the screen times out.
     */
    @SerializedName(value = "passwordMinutesOfInactivityBeforeScreenTimeout", alternate = {"PasswordMinutesOfInactivityBeforeScreenTimeout"})
    @Expose
	@Nullable
    public Integer passwordMinutesOfInactivityBeforeScreenTimeout;

    /**
     * The Password Previous Password Block Count.
     * Number of previous passwords to block. Valid values 0 to 24
     */
    @SerializedName(value = "passwordPreviousPasswordBlockCount", alternate = {"PasswordPreviousPasswordBlockCount"})
    @Expose
	@Nullable
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Required.
     * Indicates whether or not to require a password.
     */
    @SerializedName(value = "passwordRequired", alternate = {"PasswordRequired"})
    @Expose
	@Nullable
    public Boolean passwordRequired;

    /**
     * The Password Required Type.
     * Type of password that is required. Possible values are: deviceDefault, alphabetic, alphanumeric, alphanumericWithSymbols, lowSecurityBiometric, numeric, numericComplex, any.
     */
    @SerializedName(value = "passwordRequiredType", alternate = {"PasswordRequiredType"})
    @Expose
	@Nullable
    public AndroidRequiredPasswordType passwordRequiredType;

    /**
     * The Password Sign In Failure Count Before Factory Reset.
     * Number of sign in failures allowed before factory reset. Valid values 1 to 16
     */
    @SerializedName(value = "passwordSignInFailureCountBeforeFactoryReset", alternate = {"PasswordSignInFailureCountBeforeFactoryReset"})
    @Expose
	@Nullable
    public Integer passwordSignInFailureCountBeforeFactoryReset;

    /**
     * The Power Off Blocked.
     * Indicates whether or not to block powering off the device.
     */
    @SerializedName(value = "powerOffBlocked", alternate = {"PowerOffBlocked"})
    @Expose
	@Nullable
    public Boolean powerOffBlocked;

    /**
     * The Screen Capture Blocked.
     * Indicates whether or not to block screenshots.
     */
    @SerializedName(value = "screenCaptureBlocked", alternate = {"ScreenCaptureBlocked"})
    @Expose
	@Nullable
    public Boolean screenCaptureBlocked;

    /**
     * The Security Require Verify Apps.
     * Require the Android Verify apps feature is turned on.
     */
    @SerializedName(value = "securityRequireVerifyApps", alternate = {"SecurityRequireVerifyApps"})
    @Expose
	@Nullable
    public Boolean securityRequireVerifyApps;

    /**
     * The Storage Block Google Backup.
     * Indicates whether or not to block Google Backup.
     */
    @SerializedName(value = "storageBlockGoogleBackup", alternate = {"StorageBlockGoogleBackup"})
    @Expose
	@Nullable
    public Boolean storageBlockGoogleBackup;

    /**
     * The Storage Block Removable Storage.
     * Indicates whether or not to block removable storage usage.
     */
    @SerializedName(value = "storageBlockRemovableStorage", alternate = {"StorageBlockRemovableStorage"})
    @Expose
	@Nullable
    public Boolean storageBlockRemovableStorage;

    /**
     * The Storage Require Device Encryption.
     * Indicates whether or not to require device encryption.
     */
    @SerializedName(value = "storageRequireDeviceEncryption", alternate = {"StorageRequireDeviceEncryption"})
    @Expose
	@Nullable
    public Boolean storageRequireDeviceEncryption;

    /**
     * The Storage Require Removable Storage Encryption.
     * Indicates whether or not to require removable storage encryption.
     */
    @SerializedName(value = "storageRequireRemovableStorageEncryption", alternate = {"StorageRequireRemovableStorageEncryption"})
    @Expose
	@Nullable
    public Boolean storageRequireRemovableStorageEncryption;

    /**
     * The Voice Assistant Blocked.
     * Indicates whether or not to block the use of the Voice Assistant.
     */
    @SerializedName(value = "voiceAssistantBlocked", alternate = {"VoiceAssistantBlocked"})
    @Expose
	@Nullable
    public Boolean voiceAssistantBlocked;

    /**
     * The Voice Dialing Blocked.
     * Indicates whether or not to block voice dialing.
     */
    @SerializedName(value = "voiceDialingBlocked", alternate = {"VoiceDialingBlocked"})
    @Expose
	@Nullable
    public Boolean voiceDialingBlocked;

    /**
     * The Web Browser Block Autofill.
     * Indicates whether or not to block the web browser's auto fill feature.
     */
    @SerializedName(value = "webBrowserBlockAutofill", alternate = {"WebBrowserBlockAutofill"})
    @Expose
	@Nullable
    public Boolean webBrowserBlockAutofill;

    /**
     * The Web Browser Blocked.
     * Indicates whether or not to block the web browser.
     */
    @SerializedName(value = "webBrowserBlocked", alternate = {"WebBrowserBlocked"})
    @Expose
	@Nullable
    public Boolean webBrowserBlocked;

    /**
     * The Web Browser Block Java Script.
     * Indicates whether or not to block JavaScript within the web browser.
     */
    @SerializedName(value = "webBrowserBlockJavaScript", alternate = {"WebBrowserBlockJavaScript"})
    @Expose
	@Nullable
    public Boolean webBrowserBlockJavaScript;

    /**
     * The Web Browser Block Popups.
     * Indicates whether or not to block popups within the web browser.
     */
    @SerializedName(value = "webBrowserBlockPopups", alternate = {"WebBrowserBlockPopups"})
    @Expose
	@Nullable
    public Boolean webBrowserBlockPopups;

    /**
     * The Web Browser Cookie Settings.
     * Cookie settings within the web browser. Possible values are: browserDefault, blockAlways, allowCurrentWebSite, allowFromWebsitesVisited, allowAlways.
     */
    @SerializedName(value = "webBrowserCookieSettings", alternate = {"WebBrowserCookieSettings"})
    @Expose
	@Nullable
    public WebBrowserCookieSettings webBrowserCookieSettings;

    /**
     * The Wi Fi Blocked.
     * Indicates whether or not to block syncing Wi-Fi.
     */
    @SerializedName(value = "wiFiBlocked", alternate = {"WiFiBlocked"})
    @Expose
	@Nullable
    public Boolean wiFiBlocked;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
