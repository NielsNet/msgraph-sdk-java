// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.MobileThreatPartnerTenantState;
import com.microsoft.graph.models.extensions.Entity;


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
     * The Android Device Blocked On Missing Partner Data.
     * For Android, set whether Intune must receive data from the data sync partner prior to marking a device compliant
     */
    @SerializedName(value = "androidDeviceBlockedOnMissingPartnerData", alternate = {"AndroidDeviceBlockedOnMissingPartnerData"})
    @Expose
	@Nullable
    public Boolean androidDeviceBlockedOnMissingPartnerData;

    /**
     * The Android Enabled.
     * For Android, set whether data from the data sync partner should be used during compliance evaluations
     */
    @SerializedName(value = "androidEnabled", alternate = {"AndroidEnabled"})
    @Expose
	@Nullable
    public Boolean androidEnabled;

    /**
     * The Ios Device Blocked On Missing Partner Data.
     * For IOS, set whether Intune must receive data from the data sync partner prior to marking a device compliant
     */
    @SerializedName(value = "iosDeviceBlockedOnMissingPartnerData", alternate = {"IosDeviceBlockedOnMissingPartnerData"})
    @Expose
	@Nullable
    public Boolean iosDeviceBlockedOnMissingPartnerData;

    /**
     * The Ios Enabled.
     * For IOS, get or set whether data from the data sync partner should be used during compliance evaluations
     */
    @SerializedName(value = "iosEnabled", alternate = {"IosEnabled"})
    @Expose
	@Nullable
    public Boolean iosEnabled;

    /**
     * The Last Heartbeat Date Time.
     * DateTime of last Heartbeat recieved from the Data Sync Partner
     */
    @SerializedName(value = "lastHeartbeatDateTime", alternate = {"LastHeartbeatDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastHeartbeatDateTime;

    /**
     * The Partner State.
     * Data Sync Partner state for this account. Possible values are: unavailable, available, enabled, unresponsive.
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
     * Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the Data Sync Partner
     */
    @SerializedName(value = "partnerUnsupportedOsVersionBlocked", alternate = {"PartnerUnsupportedOsVersionBlocked"})
    @Expose
	@Nullable
    public Boolean partnerUnsupportedOsVersionBlocked;


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
