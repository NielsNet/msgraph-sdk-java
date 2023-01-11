// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.security.models.AlertEvidence;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Application Evidence.
 */
public class CloudApplicationEvidence extends AlertEvidence implements IJsonBackedObject {


    /**
     * The App Id.
     * 
     */
    @SerializedName(value = "appId", alternate = {"AppId"})
    @Expose
	@Nullable
    public Long appId;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Instance Id.
     * 
     */
    @SerializedName(value = "instanceId", alternate = {"InstanceId"})
    @Expose
	@Nullable
    public Long instanceId;

    /**
     * The Instance Name.
     * 
     */
    @SerializedName(value = "instanceName", alternate = {"InstanceName"})
    @Expose
	@Nullable
    public String instanceName;

    /**
     * The Saas App Id.
     * 
     */
    @SerializedName(value = "saasAppId", alternate = {"SaasAppId"})
    @Expose
	@Nullable
    public Long saasAppId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}