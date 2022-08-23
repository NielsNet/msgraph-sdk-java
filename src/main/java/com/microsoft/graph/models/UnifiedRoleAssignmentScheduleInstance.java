// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.UnifiedRoleEligibilityScheduleInstance;
import com.microsoft.graph.models.UnifiedRoleScheduleInstanceBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Schedule Instance.
 */
public class UnifiedRoleAssignmentScheduleInstance extends UnifiedRoleScheduleInstanceBase implements IJsonBackedObject {


    /**
     * The Assignment Type.
     * Type of the assignment which can either be Assigned or Activated. Supports $filter (eq, ne).
     */
    @SerializedName(value = "assignmentType", alternate = {"AssignmentType"})
    @Expose
	@Nullable
    public String assignmentType;

    /**
     * The End Date Time.
     * The end date of the schedule instance.
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endDateTime;

    /**
     * The Member Type.
     * How the assignments is inherited. It can either be Inherited, Direct, or Group. It can further imply whether the unifiedRoleAssignmentSchedule can be managed by the caller. Supports $filter (eq, ne).
     */
    @SerializedName(value = "memberType", alternate = {"MemberType"})
    @Expose
	@Nullable
    public String memberType;

    /**
     * The Role Assignment Origin Id.
     * The identifier of the role assignment in Azure AD. Supports $filter (eq, ne).
     */
    @SerializedName(value = "roleAssignmentOriginId", alternate = {"RoleAssignmentOriginId"})
    @Expose
	@Nullable
    public String roleAssignmentOriginId;

    /**
     * The Role Assignment Schedule Id.
     * The identifier of the unifiedRoleAssignmentSchedule object from which this instance was created. Supports $filter (eq, ne).
     */
    @SerializedName(value = "roleAssignmentScheduleId", alternate = {"RoleAssignmentScheduleId"})
    @Expose
	@Nullable
    public String roleAssignmentScheduleId;

    /**
     * The Start Date Time.
     * When this instance starts.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startDateTime;

    /**
     * The Activated Using.
     * If the request is from an eligible administrator to activate a role, this parameter will show the related eligible assignment for that activation. Otherwise, it is null. Supports $expand.
     */
    @SerializedName(value = "activatedUsing", alternate = {"ActivatedUsing"})
    @Expose
	@Nullable
    public UnifiedRoleEligibilityScheduleInstance activatedUsing;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
