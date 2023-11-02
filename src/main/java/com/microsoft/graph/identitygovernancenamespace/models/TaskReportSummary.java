// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.models;
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
 * The class for the Task Report Summary.
 */
public class TaskReportSummary implements IJsonBackedObject {

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
     * The Failed Tasks.
     * The number of failed tasks in a report.
     */
    @SerializedName(value = "failedTasks", alternate = {"FailedTasks"})
    @Expose
	@Nullable
    public Integer failedTasks;

    /**
     * The Successful Tasks.
     * The total number of successful tasks in a report.
     */
    @SerializedName(value = "successfulTasks", alternate = {"SuccessfulTasks"})
    @Expose
	@Nullable
    public Integer successfulTasks;

    /**
     * The Total Tasks.
     * The total number of tasks in a report.
     */
    @SerializedName(value = "totalTasks", alternate = {"TotalTasks"})
    @Expose
	@Nullable
    public Integer totalTasks;

    /**
     * The Unprocessed Tasks.
     * The number of unprocessed tasks in a report.
     */
    @SerializedName(value = "unprocessedTasks", alternate = {"UnprocessedTasks"})
    @Expose
	@Nullable
    public Integer unprocessedTasks;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}