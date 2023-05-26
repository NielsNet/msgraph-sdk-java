// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.SynchronizationStatusCode;
import com.microsoft.graph.models.SynchronizationTaskExecution;
import com.microsoft.graph.models.SynchronizationProgress;
import com.microsoft.graph.models.SynchronizationQuarantine;
import com.microsoft.graph.models.StringKeyLongValuePair;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Status.
 */
public class SynchronizationStatus implements IJsonBackedObject {

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
     * The Code.
     * 
     */
    @SerializedName(value = "code", alternate = {"Code"})
    @Expose
	@Nullable
    public SynchronizationStatusCode code;

    /**
     * The Count Successive Complete Failures.
     * 
     */
    @SerializedName(value = "countSuccessiveCompleteFailures", alternate = {"CountSuccessiveCompleteFailures"})
    @Expose
	@Nullable
    public Long countSuccessiveCompleteFailures;

    /**
     * The Escrows Pruned.
     * 
     */
    @SerializedName(value = "escrowsPruned", alternate = {"EscrowsPruned"})
    @Expose
	@Nullable
    public Boolean escrowsPruned;

    /**
     * The Last Execution.
     * 
     */
    @SerializedName(value = "lastExecution", alternate = {"LastExecution"})
    @Expose
	@Nullable
    public SynchronizationTaskExecution lastExecution;

    /**
     * The Last Successful Execution.
     * 
     */
    @SerializedName(value = "lastSuccessfulExecution", alternate = {"LastSuccessfulExecution"})
    @Expose
	@Nullable
    public SynchronizationTaskExecution lastSuccessfulExecution;

    /**
     * The Last Successful Execution With Exports.
     * 
     */
    @SerializedName(value = "lastSuccessfulExecutionWithExports", alternate = {"LastSuccessfulExecutionWithExports"})
    @Expose
	@Nullable
    public SynchronizationTaskExecution lastSuccessfulExecutionWithExports;

    /**
     * The Progress.
     * 
     */
    @SerializedName(value = "progress", alternate = {"Progress"})
    @Expose
	@Nullable
    public java.util.List<SynchronizationProgress> progress;

    /**
     * The Quarantine.
     * 
     */
    @SerializedName(value = "quarantine", alternate = {"Quarantine"})
    @Expose
	@Nullable
    public SynchronizationQuarantine quarantine;

    /**
     * The Steady State First Achieved Time.
     * 
     */
    @SerializedName(value = "steadyStateFirstAchievedTime", alternate = {"SteadyStateFirstAchievedTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime steadyStateFirstAchievedTime;

    /**
     * The Steady State Last Achieved Time.
     * 
     */
    @SerializedName(value = "steadyStateLastAchievedTime", alternate = {"SteadyStateLastAchievedTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime steadyStateLastAchievedTime;

    /**
     * The Synchronized Entry Count By Type.
     * 
     */
    @SerializedName(value = "synchronizedEntryCountByType", alternate = {"SynchronizedEntryCountByType"})
    @Expose
	@Nullable
    public java.util.List<StringKeyLongValuePair> synchronizedEntryCountByType;

    /**
     * The Troubleshooting Url.
     * 
     */
    @SerializedName(value = "troubleshootingUrl", alternate = {"TroubleshootingUrl"})
    @Expose
	@Nullable
    public String troubleshootingUrl;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}