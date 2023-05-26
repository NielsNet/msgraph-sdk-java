// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.SynchronizationError;
import com.microsoft.graph.models.SynchronizationTaskExecutionResult;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Task Execution.
 */
public class SynchronizationTaskExecution implements IJsonBackedObject {

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
     * The Activity Identifier.
     * 
     */
    @SerializedName(value = "activityIdentifier", alternate = {"ActivityIdentifier"})
    @Expose
	@Nullable
    public String activityIdentifier;

    /**
     * The Count Entitled.
     * 
     */
    @SerializedName(value = "countEntitled", alternate = {"CountEntitled"})
    @Expose
	@Nullable
    public Long countEntitled;

    /**
     * The Count Entitled For Provisioning.
     * 
     */
    @SerializedName(value = "countEntitledForProvisioning", alternate = {"CountEntitledForProvisioning"})
    @Expose
	@Nullable
    public Long countEntitledForProvisioning;

    /**
     * The Count Escrowed.
     * 
     */
    @SerializedName(value = "countEscrowed", alternate = {"CountEscrowed"})
    @Expose
	@Nullable
    public Long countEscrowed;

    /**
     * The Count Escrowed Raw.
     * 
     */
    @SerializedName(value = "countEscrowedRaw", alternate = {"CountEscrowedRaw"})
    @Expose
	@Nullable
    public Long countEscrowedRaw;

    /**
     * The Count Exported.
     * 
     */
    @SerializedName(value = "countExported", alternate = {"CountExported"})
    @Expose
	@Nullable
    public Long countExported;

    /**
     * The Count Exports.
     * 
     */
    @SerializedName(value = "countExports", alternate = {"CountExports"})
    @Expose
	@Nullable
    public Long countExports;

    /**
     * The Count Imported.
     * 
     */
    @SerializedName(value = "countImported", alternate = {"CountImported"})
    @Expose
	@Nullable
    public Long countImported;

    /**
     * The Count Imported Deltas.
     * 
     */
    @SerializedName(value = "countImportedDeltas", alternate = {"CountImportedDeltas"})
    @Expose
	@Nullable
    public Long countImportedDeltas;

    /**
     * The Count Imported Reference Deltas.
     * 
     */
    @SerializedName(value = "countImportedReferenceDeltas", alternate = {"CountImportedReferenceDeltas"})
    @Expose
	@Nullable
    public Long countImportedReferenceDeltas;

    /**
     * The Error.
     * 
     */
    @SerializedName(value = "error", alternate = {"Error"})
    @Expose
	@Nullable
    public SynchronizationError error;

    /**
     * The State.
     * 
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public SynchronizationTaskExecutionResult state;

    /**
     * The Time Began.
     * 
     */
    @SerializedName(value = "timeBegan", alternate = {"TimeBegan"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime timeBegan;

    /**
     * The Time Ended.
     * 
     */
    @SerializedName(value = "timeEnded", alternate = {"TimeEnded"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime timeEnded;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}