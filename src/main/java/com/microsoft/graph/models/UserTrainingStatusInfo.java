// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.TrainingStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Training Status Info.
 */
public class UserTrainingStatusInfo implements IJsonBackedObject {

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
     * The Assigned Date Time.
     * Date and time of assignment of the training to the user.
     */
    @SerializedName(value = "assignedDateTime", alternate = {"AssignedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime assignedDateTime;

    /**
     * The Completion Date Time.
     * Date and time of completion of the training by the user.
     */
    @SerializedName(value = "completionDateTime", alternate = {"CompletionDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime completionDateTime;

    /**
     * The Display Name.
     * Display name of the assigned training.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Training Status.
     * The status of the training assigned to the user. Possible values are: unknown, assigned, inProgress, completed, overdue, unknownFutureValue.
     */
    @SerializedName(value = "trainingStatus", alternate = {"TrainingStatus"})
    @Expose
	@Nullable
    public TrainingStatus trainingStatus;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}