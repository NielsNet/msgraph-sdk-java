// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.security.models.BehaviorDuringRetentionPeriod;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Retention Label Settings.
 */
public class RetentionLabelSettings implements IJsonBackedObject {

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
     * The Behavior During Retention Period.
     * Describes the item behavior during retention period. Possible values are: doNotRetain, retain, retainAsRecord, retainAsRegulatoryRecord, unknownFutureValue. Read-only.
     */
    @SerializedName(value = "behaviorDuringRetentionPeriod", alternate = {"BehaviorDuringRetentionPeriod"})
    @Expose
	@Nullable
    public BehaviorDuringRetentionPeriod behaviorDuringRetentionPeriod;

    /**
     * The Is Content Update Allowed.
     * Specifies whether updates to document content are allowed. Read-only.
     */
    @SerializedName(value = "isContentUpdateAllowed", alternate = {"IsContentUpdateAllowed"})
    @Expose
	@Nullable
    public Boolean isContentUpdateAllowed;

    /**
     * The Is Delete Allowed.
     * Specifies whether the document deletion is allowed. Read-only.
     */
    @SerializedName(value = "isDeleteAllowed", alternate = {"IsDeleteAllowed"})
    @Expose
	@Nullable
    public Boolean isDeleteAllowed;

    /**
     * The Is Label Update Allowed.
     * Specifies whether you're allowed to change the retention label on the document. Read-only.
     */
    @SerializedName(value = "isLabelUpdateAllowed", alternate = {"IsLabelUpdateAllowed"})
    @Expose
	@Nullable
    public Boolean isLabelUpdateAllowed;

    /**
     * The Is Metadata Update Allowed.
     * Specifies whether updates to the item metadata (for example, the Title field) are blocked. Read-only.
     */
    @SerializedName(value = "isMetadataUpdateAllowed", alternate = {"IsMetadataUpdateAllowed"})
    @Expose
	@Nullable
    public Boolean isMetadataUpdateAllowed;

    /**
     * The Is Record Locked.
     * Specifies whether the item is locked. Read-write.
     */
    @SerializedName(value = "isRecordLocked", alternate = {"IsRecordLocked"})
    @Expose
	@Nullable
    public Boolean isRecordLocked;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
