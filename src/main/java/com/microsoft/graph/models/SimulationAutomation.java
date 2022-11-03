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
import com.microsoft.graph.models.EmailIdentity;
import com.microsoft.graph.models.SimulationAutomationStatus;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.SimulationAutomationRunCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Simulation Automation.
 */
public class SimulationAutomation extends Entity implements IJsonBackedObject {


    /**
     * The Created By.
     * Identity of the user who created the attack simulation automation.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public EmailIdentity createdBy;

    /**
     * The Created Date Time.
     * Date and time when the attack simulation automation was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * Description of the attack simulation automation.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Display name of the attack simulation automation. Supports $filter and $orderby.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Modified By.
     * Identity of the user who most recently modified the attack simulation automation.
     */
    @SerializedName(value = "lastModifiedBy", alternate = {"LastModifiedBy"})
    @Expose
	@Nullable
    public EmailIdentity lastModifiedBy;

    /**
     * The Last Modified Date Time.
     * Date and time when the attack simulation automation was most recently modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Last Run Date Time.
     * Date and time of the latest run of the attack simulation automation.
     */
    @SerializedName(value = "lastRunDateTime", alternate = {"LastRunDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastRunDateTime;

    /**
     * The Next Run Date Time.
     * Date and time of the upcoming run of the attack simulation automation.
     */
    @SerializedName(value = "nextRunDateTime", alternate = {"NextRunDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime nextRunDateTime;

    /**
     * The Status.
     * Status of the attack simulation automation. Supports $filter and $orderby. The possible values are: unknown, draft, notRunning, running, completed, unknownFutureValue.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public SimulationAutomationStatus status;

    /**
     * The Runs.
     * A collection of simulation automation runs.
     */
    @SerializedName(value = "runs", alternate = {"Runs"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.SimulationAutomationRunCollectionPage runs;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("runs")) {
            runs = serializer.deserializeObject(json.get("runs"), com.microsoft.graph.requests.SimulationAutomationRunCollectionPage.class);
        }
    }
}