// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.UserExperienceAnalyticsHealthState;
import com.microsoft.graph.models.OperatingSystemUpgradeEligibility;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Work From Anywhere Device.
 */
public class UserExperienceAnalyticsWorkFromAnywhereDevice extends Entity implements IJsonBackedObject {


    /**
     * The Auto Pilot Profile Assigned.
     * When TRUE, indicates the intune device's autopilot profile is assigned. When FALSE, indicates it's not Assigned. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "autoPilotProfileAssigned", alternate = {"AutoPilotProfileAssigned"})
    @Expose
	@Nullable
    public Boolean autoPilotProfileAssigned;

    /**
     * The Auto Pilot Registered.
     * When TRUE, indicates the intune device's autopilot is registered. When FALSE, indicates it's not registered. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "autoPilotRegistered", alternate = {"AutoPilotRegistered"})
    @Expose
	@Nullable
    public Boolean autoPilotRegistered;

    /**
     * The Azure Ad Device Id.
     * The Azure Active Directory (Azure AD) device Id. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "azureAdDeviceId", alternate = {"AzureAdDeviceId"})
    @Expose
	@Nullable
    public String azureAdDeviceId;

    /**
     * The Azure Ad Join Type.
     * The work from anywhere device's Azure Active Directory (Azure AD) join type. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "azureAdJoinType", alternate = {"AzureAdJoinType"})
    @Expose
	@Nullable
    public String azureAdJoinType;

    /**
     * The Azure Ad Registered.
     * When TRUE, indicates the device's Azure Active Directory (Azure AD) is registered. When False, indicates it's not registered. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "azureAdRegistered", alternate = {"AzureAdRegistered"})
    @Expose
	@Nullable
    public Boolean azureAdRegistered;

    /**
     * The Cloud Identity Score.
     * Indicates per device cloud identity score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "cloudIdentityScore", alternate = {"CloudIdentityScore"})
    @Expose
	@Nullable
    public Double cloudIdentityScore;

    /**
     * The Cloud Management Score.
     * Indicates per device cloud management score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "cloudManagementScore", alternate = {"CloudManagementScore"})
    @Expose
	@Nullable
    public Double cloudManagementScore;

    /**
     * The Cloud Provisioning Score.
     * Indicates per device cloud provisioning score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "cloudProvisioningScore", alternate = {"CloudProvisioningScore"})
    @Expose
	@Nullable
    public Double cloudProvisioningScore;

    /**
     * The Compliance Policy Set To Intune.
     * When TRUE, indicates the device's compliance policy is set to intune. When FALSE, indicates it's not set to intune. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "compliancePolicySetToIntune", alternate = {"CompliancePolicySetToIntune"})
    @Expose
	@Nullable
    public Boolean compliancePolicySetToIntune;

    /**
     * The Device Id.
     * The Intune device id of the device. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "deviceId", alternate = {"DeviceId"})
    @Expose
	@Nullable
    public String deviceId;

    /**
     * The Device Name.
     * The name of the device. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;

    /**
     * The Health Status.
     * The health state of the user experience analytics work from anywhere device. Possible values are: unknown, insufficientData, needsAttention, meetingGoals. Unknown by default. Supports: $select, $OrderBy. Read-only. Possible values are: unknown, insufficientData, needsAttention, meetingGoals, unknownFutureValue.
     */
    @SerializedName(value = "healthStatus", alternate = {"HealthStatus"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsHealthState healthStatus;

    /**
     * The Is Cloud Managed Gateway Enabled.
     * When TRUE, indicates the device's Cloud Management Gateway for Configuration Manager is enabled. When FALSE, indicates it's not enabled. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "isCloudManagedGatewayEnabled", alternate = {"IsCloudManagedGatewayEnabled"})
    @Expose
	@Nullable
    public Boolean isCloudManagedGatewayEnabled;

    /**
     * The Managed By.
     * The management agent of the device. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "managedBy", alternate = {"ManagedBy"})
    @Expose
	@Nullable
    public String managedBy;

    /**
     * The Manufacturer.
     * The manufacturer name of the device. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
	@Nullable
    public String manufacturer;

    /**
     * The Model.
     * The model name of the device. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
	@Nullable
    public String model;

    /**
     * The Os Check Failed.
     * When TRUE, indicates OS check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "osCheckFailed", alternate = {"OsCheckFailed"})
    @Expose
	@Nullable
    public Boolean osCheckFailed;

    /**
     * The Os Description.
     * The OS description of the device. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "osDescription", alternate = {"OsDescription"})
    @Expose
	@Nullable
    public String osDescription;

    /**
     * The Os Version.
     * The OS version of the device. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "osVersion", alternate = {"OsVersion"})
    @Expose
	@Nullable
    public String osVersion;

    /**
     * The Other Workloads Set To Intune.
     * When TRUE, indicates the device's other workloads is set to intune. When FALSE, indicates it's not set to intune. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "otherWorkloadsSetToIntune", alternate = {"OtherWorkloadsSetToIntune"})
    @Expose
	@Nullable
    public Boolean otherWorkloadsSetToIntune;

    /**
     * The Ownership.
     * Ownership of the device. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "ownership", alternate = {"Ownership"})
    @Expose
	@Nullable
    public String ownership;

    /**
     * The Processor64Bit Check Failed.
     * When TRUE, indicates processor hardware 64-bit architecture check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "processor64BitCheckFailed", alternate = {"Processor64BitCheckFailed"})
    @Expose
	@Nullable
    public Boolean processor64BitCheckFailed;

    /**
     * The Processor Core Count Check Failed.
     * When TRUE, indicates processor hardware core count check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "processorCoreCountCheckFailed", alternate = {"ProcessorCoreCountCheckFailed"})
    @Expose
	@Nullable
    public Boolean processorCoreCountCheckFailed;

    /**
     * The Processor Family Check Failed.
     * When TRUE, indicates processor hardware family check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "processorFamilyCheckFailed", alternate = {"ProcessorFamilyCheckFailed"})
    @Expose
	@Nullable
    public Boolean processorFamilyCheckFailed;

    /**
     * The Processor Speed Check Failed.
     * When TRUE, indicates processor hardware speed check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "processorSpeedCheckFailed", alternate = {"ProcessorSpeedCheckFailed"})
    @Expose
	@Nullable
    public Boolean processorSpeedCheckFailed;

    /**
     * The Ram Check Failed.
     * When TRUE, indicates RAM hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "ramCheckFailed", alternate = {"RamCheckFailed"})
    @Expose
	@Nullable
    public Boolean ramCheckFailed;

    /**
     * The Secure Boot Check Failed.
     * When TRUE, indicates secure boot hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "secureBootCheckFailed", alternate = {"SecureBootCheckFailed"})
    @Expose
	@Nullable
    public Boolean secureBootCheckFailed;

    /**
     * The Serial Number.
     * The serial number of the device. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "serialNumber", alternate = {"SerialNumber"})
    @Expose
	@Nullable
    public String serialNumber;

    /**
     * The Storage Check Failed.
     * When TRUE, indicates storage hardware check failed for device to upgrade to the latest version of windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "storageCheckFailed", alternate = {"StorageCheckFailed"})
    @Expose
	@Nullable
    public Boolean storageCheckFailed;

    /**
     * The Tenant Attached.
     * When TRUE, indicates the device is Tenant Attached. When FALSE, indicates it's not Tenant Attached. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "tenantAttached", alternate = {"TenantAttached"})
    @Expose
	@Nullable
    public Boolean tenantAttached;

    /**
     * The Tpm Check Failed.
     * When TRUE, indicates Trusted Platform Module (TPM) hardware check failed for device to the latest version of upgrade to windows. When FALSE, indicates the check succeeded. Supports: $select, $OrderBy. Read-only.
     */
    @SerializedName(value = "tpmCheckFailed", alternate = {"TpmCheckFailed"})
    @Expose
	@Nullable
    public Boolean tpmCheckFailed;

    /**
     * The Upgrade Eligibility.
     * The windows upgrade eligibility status of device. Possible values are: upgraded, unknown, notCapable, capable. Unknown by default. Supports: $select, $OrderBy. Read-only. Possible values are: upgraded, unknown, notCapable, capable, unknownFutureValue.
     */
    @SerializedName(value = "upgradeEligibility", alternate = {"UpgradeEligibility"})
    @Expose
	@Nullable
    public OperatingSystemUpgradeEligibility upgradeEligibility;

    /**
     * The Windows Score.
     * Indicates per device windows score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "windowsScore", alternate = {"WindowsScore"})
    @Expose
	@Nullable
    public Double windowsScore;

    /**
     * The Work From Anywhere Score.
     * Indicates work from anywhere per device overall score. Valid values 0 to 100. Value -1 means associated score is unavailable. Supports: $select, $OrderBy. Read-only. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "workFromAnywhereScore", alternate = {"WorkFromAnywhereScore"})
    @Expose
	@Nullable
    public Double workFromAnywhereScore;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
