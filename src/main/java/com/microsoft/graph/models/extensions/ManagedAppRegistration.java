// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.MobileAppIdentifier;
import com.microsoft.graph.models.generated.ManagedAppFlaggedReason;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;
import com.microsoft.graph.models.extensions.ManagedAppOperation;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppOperationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration.
 */
public class ManagedAppRegistration extends Entity implements IJsonBackedObject {


    /**
     * The App Identifier.
     * The app package Identifier
     */
    @SerializedName(value = "appIdentifier", alternate = {"AppIdentifier"})
    @Expose
	@Nullable
    public MobileAppIdentifier appIdentifier;

    /**
     * The Application Version.
     * App version
     */
    @SerializedName(value = "applicationVersion", alternate = {"ApplicationVersion"})
    @Expose
	@Nullable
    public String applicationVersion;

    /**
     * The Created Date Time.
     * Date and time of creation
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar createdDateTime;

    /**
     * The Device Name.
     * Host device name
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;

    /**
     * The Device Tag.
     * App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in all conditions.
     */
    @SerializedName(value = "deviceTag", alternate = {"DeviceTag"})
    @Expose
	@Nullable
    public String deviceTag;

    /**
     * The Device Type.
     * Host device type
     */
    @SerializedName(value = "deviceType", alternate = {"DeviceType"})
    @Expose
	@Nullable
    public String deviceType;

    /**
     * The Flagged Reasons.
     * Zero or more reasons an app registration is flagged. E.g. app running on rooted device
     */
    @SerializedName(value = "flaggedReasons", alternate = {"FlaggedReasons"})
    @Expose
	@Nullable
    public java.util.List<ManagedAppFlaggedReason> flaggedReasons;

    /**
     * The Last Sync Date Time.
     * Date and time of last the app synced with management service.
     */
    @SerializedName(value = "lastSyncDateTime", alternate = {"LastSyncDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Management Sdk Version.
     * App management SDK version
     */
    @SerializedName(value = "managementSdkVersion", alternate = {"ManagementSdkVersion"})
    @Expose
	@Nullable
    public String managementSdkVersion;

    /**
     * The Platform Version.
     * Operating System version
     */
    @SerializedName(value = "platformVersion", alternate = {"PlatformVersion"})
    @Expose
	@Nullable
    public String platformVersion;

    /**
     * The User Id.
     * The user Id to who this app registration belongs.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

    /**
     * The Version.
     * Version of the entity.
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public String version;

    /**
     * The Applied Policies.
     * Zero or more policys already applied on the registered app when it last synchronized with managment service.
     */
    @SerializedName(value = "appliedPolicies", alternate = {"AppliedPolicies"})
    @Expose
	@Nullable
    public ManagedAppPolicyCollectionPage appliedPolicies;

    /**
     * The Intended Policies.
     * Zero or more policies admin intended for the app as of now.
     */
    @SerializedName(value = "intendedPolicies", alternate = {"IntendedPolicies"})
    @Expose
	@Nullable
    public ManagedAppPolicyCollectionPage intendedPolicies;

    /**
     * The Operations.
     * Zero or more long running operations triggered on the app registration.
     */
    @SerializedName(value = "operations", alternate = {"Operations"})
    @Expose
	@Nullable
    public ManagedAppOperationCollectionPage operations;


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


        if (json.has("appliedPolicies")) {
            appliedPolicies = serializer.deserializeObject(json.get("appliedPolicies").toString(), ManagedAppPolicyCollectionPage.class);
        }

        if (json.has("intendedPolicies")) {
            intendedPolicies = serializer.deserializeObject(json.get("intendedPolicies").toString(), ManagedAppPolicyCollectionPage.class);
        }

        if (json.has("operations")) {
            operations = serializer.deserializeObject(json.get("operations").toString(), ManagedAppOperationCollectionPage.class);
        }
    }
}
