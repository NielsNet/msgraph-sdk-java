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
import com.microsoft.graph.models.QuarantineReason;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Quarantine.
 */
public class SynchronizationQuarantine implements IJsonBackedObject {

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
     * The Current Began.
     * Date and time when the quarantine was last evaluated and imposed. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "currentBegan", alternate = {"CurrentBegan"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime currentBegan;

    /**
     * The Error.
     * Describes the error(s) that occurred when putting the synchronization job into quarantine.
     */
    @SerializedName(value = "error", alternate = {"Error"})
    @Expose
	@Nullable
    public SynchronizationError error;

    /**
     * The Next Attempt.
     * Date and time when the next attempt to re-evaluate the quarantine will be made. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "nextAttempt", alternate = {"NextAttempt"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime nextAttempt;

    /**
     * The Reason.
     * A code that signifies why the quarantine was imposed. The possible values are: EncounteredBaseEscrowThreshold, EncounteredTotalEscrowThreshold, EncounteredEscrowProportionThreshold, EncounteredQuarantineException, Unknown, QuarantinedOnDemand, TooManyDeletes, IngestionInterrupted.
     */
    @SerializedName(value = "reason", alternate = {"Reason"})
    @Expose
	@Nullable
    public QuarantineReason reason;

    /**
     * The Series Began.
     * Date and time when the quarantine was first imposed in this series (a series starts when a quarantine is first imposed, and is reset as soon as the quarantine is lifted). The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "seriesBegan", alternate = {"SeriesBegan"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime seriesBegan;

    /**
     * The Series Count.
     * Number of times in this series the quarantine was re-evaluated and left in effect (a series starts when quarantine is first imposed, and is reset as soon as quarantine is lifted).
     */
    @SerializedName(value = "seriesCount", alternate = {"SeriesCount"})
    @Expose
	@Nullable
    public Long seriesCount;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
