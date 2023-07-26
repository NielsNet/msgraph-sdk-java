// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Cloud Management Devices Summary.
 */
public class UserExperienceAnalyticsCloudManagementDevicesSummary implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Co Managed Device Count.
     * Total number of  co-managed devices. Read-only.
     */
    @SerializedName(value = "coManagedDeviceCount", alternate = {"CoManagedDeviceCount"})
    @Expose
	@Nullable
    public Integer coManagedDeviceCount;

    /**
     * The Intune Device Count.
     * The count of intune devices that are not autopilot registerd. Read-only.
     */
    @SerializedName(value = "intuneDeviceCount", alternate = {"IntuneDeviceCount"})
    @Expose
	@Nullable
    public Integer intuneDeviceCount;

    /**
     * The Tenant Attach Device Count.
     * Total count of tenant attach devices. Read-only.
     */
    @SerializedName(value = "tenantAttachDeviceCount", alternate = {"TenantAttachDeviceCount"})
    @Expose
	@Nullable
    public Integer tenantAttachDeviceCount;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}