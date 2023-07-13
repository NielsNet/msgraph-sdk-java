// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AccessPackageCustomExtensionStage;
import com.microsoft.graph.models.CustomExtensionData;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Request Callback Data.
 */
public class AccessPackageAssignmentRequestCallbackData extends CustomExtensionData implements IJsonBackedObject {


    /**
     * The Custom Extension Stage Instance Detail.
     * 
     */
    @SerializedName(value = "customExtensionStageInstanceDetail", alternate = {"CustomExtensionStageInstanceDetail"})
    @Expose
	@Nullable
    public String customExtensionStageInstanceDetail;

    /**
     * The Custom Extension Stage Instance Id.
     * 
     */
    @SerializedName(value = "customExtensionStageInstanceId", alternate = {"CustomExtensionStageInstanceId"})
    @Expose
	@Nullable
    public String customExtensionStageInstanceId;

    /**
     * The Stage.
     * 
     */
    @SerializedName(value = "stage", alternate = {"Stage"})
    @Expose
	@Nullable
    public AccessPackageCustomExtensionStage stage;

    /**
     * The State.
     * 
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public String state;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
