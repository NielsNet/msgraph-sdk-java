// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.RequestSchedule;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Access Schedule.
 */
public class PrivilegedAccessSchedule extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * When the schedule was created. Optional.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Created Using.
     * The identifier of the access assignment or eligibility request that created this schedule. Optional.
     */
    @SerializedName(value = "createdUsing", alternate = {"CreatedUsing"})
    @Expose
	@Nullable
    public String createdUsing;

    /**
     * The Modified Date Time.
     * When the schedule was last modified. Optional.
     */
    @SerializedName(value = "modifiedDateTime", alternate = {"ModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime modifiedDateTime;

    /**
     * The Schedule Info.
     * Represents the period of the access assignment or eligibility. The scheduleInfo can represent a single occurrence or multiple recurring instances. Required.
     */
    @SerializedName(value = "scheduleInfo", alternate = {"ScheduleInfo"})
    @Expose
	@Nullable
    public RequestSchedule scheduleInfo;

    /**
     * The Status.
     * The status of the access assignment or eligibility request. The possible values are: Canceled, Denied, Failed, Granted, PendingAdminDecision, PendingApproval, PendingProvisioning, PendingScheduleCreation, Provisioned, Revoked, and ScheduleCreated. Not nullable. Optional.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public String status;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
