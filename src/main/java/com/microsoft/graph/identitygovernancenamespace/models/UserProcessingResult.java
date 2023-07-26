// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.identitygovernance.models.LifecycleWorkflowProcessingStatus;
import com.microsoft.graph.identitygovernance.models.WorkflowExecutionType;
import com.microsoft.graph.models.User;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.identitygovernance.requests.TaskProcessingResultCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Processing Result.
 */
public class UserProcessingResult extends Entity implements IJsonBackedObject {


    /**
     * The Completed Date Time.
     * The date time that the workflow execution for a user completed. Value is null if the workflow hasn't completed.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    @SerializedName(value = "completedDateTime", alternate = {"CompletedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime completedDateTime;

    /**
     * The Failed Tasks Count.
     * The number of tasks that failed in the workflow execution.
     */
    @SerializedName(value = "failedTasksCount", alternate = {"FailedTasksCount"})
    @Expose
	@Nullable
    public Integer failedTasksCount;

    /**
     * The Processing Status.
     * The workflow execution status. The possible values are: queued, inProgress, completed, completedWithErrors, canceled, failed, unknownFutureValue.Supports $filter(eq, ne) and $orderby.
     */
    @SerializedName(value = "processingStatus", alternate = {"ProcessingStatus"})
    @Expose
	@Nullable
    public LifecycleWorkflowProcessingStatus processingStatus;

    /**
     * The Scheduled Date Time.
     * The date time that the workflow is scheduled to be executed for a user.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    @SerializedName(value = "scheduledDateTime", alternate = {"ScheduledDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime scheduledDateTime;

    /**
     * The Started Date Time.
     * The date time that the workflow execution started. Value is null if the workflow execution has not started.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    @SerializedName(value = "startedDateTime", alternate = {"StartedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime startedDateTime;

    /**
     * The Total Tasks Count.
     * The total number of tasks that in the workflow execution.
     */
    @SerializedName(value = "totalTasksCount", alternate = {"TotalTasksCount"})
    @Expose
	@Nullable
    public Integer totalTasksCount;

    /**
     * The Total Unprocessed Tasks Count.
     * The total number of unprocessed tasks for the workflow.
     */
    @SerializedName(value = "totalUnprocessedTasksCount", alternate = {"TotalUnprocessedTasksCount"})
    @Expose
	@Nullable
    public Integer totalUnprocessedTasksCount;

    /**
     * The Workflow Execution Type.
     * Describes the execution type of the workflow. The possible values are: scheduled, onDemand, unknownFutureValue.Supports $filter(lt, le, gt, ge, eq, ne) and $orderby.
     */
    @SerializedName(value = "workflowExecutionType", alternate = {"WorkflowExecutionType"})
    @Expose
	@Nullable
    public WorkflowExecutionType workflowExecutionType;

    /**
     * The Workflow Version.
     * The version of the workflow that was executed.
     */
    @SerializedName(value = "workflowVersion", alternate = {"WorkflowVersion"})
    @Expose
	@Nullable
    public Integer workflowVersion;

    /**
     * The Subject.
     * The unique identifier of the AAD user targeted for the taskProcessingResult.Supports $filter(eq, ne) and $expand.
     */
    @SerializedName(value = "subject", alternate = {"Subject"})
    @Expose
	@Nullable
    public User subject;

    /**
     * The Task Processing Results.
     * The associated individual task execution.
     */
    @SerializedName(value = "taskProcessingResults", alternate = {"TaskProcessingResults"})
    @Expose
	@Nullable
    public com.microsoft.graph.identitygovernance.requests.TaskProcessingResultCollectionPage taskProcessingResults;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("taskProcessingResults")) {
            taskProcessingResults = serializer.deserializeObject(json.get("taskProcessingResults"), com.microsoft.graph.identitygovernance.requests.TaskProcessingResultCollectionPage.class);
        }
    }
}