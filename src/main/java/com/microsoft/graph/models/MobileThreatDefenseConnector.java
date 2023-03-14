// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MobileThreatPartnerTenantState;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile Threat Defense Connector.
 */
public class MobileThreatDefenseConnector extends Entity implements IJsonBackedObject {


    /**
     * The Allow Partner To Collect IOSApplication Metadata.
     * When TRUE, indicates the Mobile Threat Defense partner may collect metadata about installed applications from Intune for IOS devices. When FALSE, indicates the Mobile Threat Defense partner may not collect metadata about installed applications from Intune for IOS devices. Default value is FALSE.
     */
    @SerializedName(value = "allowPartnerToCollectIOSApplicationMetadata", alternate = {"AllowPartnerToCollectIOSApplicationMetadata"})
    @Expose
	@Nullable
    public Boolean allowPartnerToCollectIOSApplicationMetadata;

    /**
     * The Allow Partner To Collect IOSPersonal Application Metadata.
     * When TRUE, indicates the Mobile Threat Defense partner may collect metadata about personally installed applications from Intune for IOS devices. When FALSE, indicates the Mobile Threat Defense partner may not collect metadata about personally installed applications from Intune for IOS devices. Default value is FALSE.
     */
    @SerializedName(value = "allowPartnerToCollectIOSPersonalApplicationMetadata", alternate = {"AllowPartnerToCollectIOSPersonalApplicationMetadata"})
    @Expose
	@Nullable
    public Boolean allowPartnerToCollectIOSPersonalApplicationMetadata;

    /**
     * The Android Device Blocked On Missing Partner Data.
     * For Android, set whether Intune must receive data from the Mobile Threat Defense partner prior to marking a device compliant
     */
    @SerializedName(value = "androidDeviceBlockedOnMissingPartnerData", alternate = {"AndroidDeviceBlockedOnMissingPartnerData"})
    @Expose
	@Nullable
    public Boolean androidDeviceBlockedOnMissingPartnerData;

    /**
     * The Android Enabled.
     * For Android, set whether data from the Mobile Threat Defense partner should be used during compliance evaluations
     */
    @SerializedName(value = "androidEnabled", alternate = {"AndroidEnabled"})
    @Expose
	@Nullable
    public Boolean androidEnabled;

    /**
     * The Android Mobile Application Management Enabled.
     * When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management (MAM) evaluations for Android devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during Mobile Application Management (MAM) evaluations for Android devices. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE.
     */
    @SerializedName(value = "androidMobileApplicationManagementEnabled", alternate = {"AndroidMobileApplicationManagementEnabled"})
    @Expose
	@Nullable
    public Boolean androidMobileApplicationManagementEnabled;

    /**
     * The Ios Device Blocked On Missing Partner Data.
     * For IOS, set whether Intune must receive data from the Mobile Threat Defense partner prior to marking a device compliant
     */
    @SerializedName(value = "iosDeviceBlockedOnMissingPartnerData", alternate = {"IosDeviceBlockedOnMissingPartnerData"})
    @Expose
	@Nullable
    public Boolean iosDeviceBlockedOnMissingPartnerData;

    /**
     * The Ios Enabled.
     * For IOS, get or set whether data from the Mobile Threat Defense partner should be used during compliance evaluations
     */
    @SerializedName(value = "iosEnabled", alternate = {"IosEnabled"})
    @Expose
	@Nullable
    public Boolean iosEnabled;

    /**
     * The Ios Mobile Application Management Enabled.
     * When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management (MAM) evaluations for IOS devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during Mobile Application Management (MAM) evaluations for IOS devices. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE.
     */
    @SerializedName(value = "iosMobileApplicationManagementEnabled", alternate = {"IosMobileApplicationManagementEnabled"})
    @Expose
	@Nullable
    public Boolean iosMobileApplicationManagementEnabled;

    /**
     * The Last Heartbeat Date Time.
     * DateTime of last Heartbeat recieved from the Mobile Threat Defense partner
     */
    @SerializedName(value = "lastHeartbeatDateTime", alternate = {"LastHeartbeatDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastHeartbeatDateTime;

    /**
     * The Microsoft Defender For Endpoint Attach Enabled.
     * When TRUE, inidicates that configuration profile management via Microsoft Defender for Endpoint is enabled. When FALSE, inidicates that configuration profile management via Microsoft Defender for Endpoint is disabled. Default value is FALSE.
     */
    @SerializedName(value = "microsoftDefenderForEndpointAttachEnabled", alternate = {"MicrosoftDefenderForEndpointAttachEnabled"})
    @Expose
	@Nullable
    public Boolean microsoftDefenderForEndpointAttachEnabled;

    /**
     * The Partner State.
     * Mobile Threat Defense partner state for this account. Possible values are: unavailable, available, enabled, unresponsive.
     */
    @SerializedName(value = "partnerState", alternate = {"PartnerState"})
    @Expose
	@Nullable
    public MobileThreatPartnerTenantState partnerState;

    /**
     * The Partner Unresponsiveness Threshold In Days.
     * Get or Set days the per tenant tolerance to unresponsiveness for this partner integration
     */
    @SerializedName(value = "partnerUnresponsivenessThresholdInDays", alternate = {"PartnerUnresponsivenessThresholdInDays"})
    @Expose
	@Nullable
    public Integer partnerUnresponsivenessThresholdInDays;

    /**
     * The Partner Unsupported Os Version Blocked.
     * Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the Mobile Threat Defense partner
     */
    @SerializedName(value = "partnerUnsupportedOsVersionBlocked", alternate = {"PartnerUnsupportedOsVersionBlocked"})
    @Expose
	@Nullable
    public Boolean partnerUnsupportedOsVersionBlocked;

    /**
     * The Windows Device Blocked On Missing Partner Data.
     * When TRUE, inidicates that Intune must receive data from the Mobile Threat Defense partner prior to marking a device compliant for Windows. When FALSE, inidicates that Intune may make a device compliant without receiving data from the Mobile Threat Defense partner for Windows. Default value is FALSE.
     */
    @SerializedName(value = "windowsDeviceBlockedOnMissingPartnerData", alternate = {"WindowsDeviceBlockedOnMissingPartnerData"})
    @Expose
	@Nullable
    public Boolean windowsDeviceBlockedOnMissingPartnerData;

    /**
     * The Windows Enabled.
     * When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during compliance evaluations for Windows. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during compliance evaluations for Windows. Default value is FALSE.
     */
    @SerializedName(value = "windowsEnabled", alternate = {"WindowsEnabled"})
    @Expose
	@Nullable
    public Boolean windowsEnabled;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
