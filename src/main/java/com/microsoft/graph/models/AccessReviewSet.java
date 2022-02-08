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
import com.microsoft.graph.models.AccessReviewScheduleDefinition;
import com.microsoft.graph.models.AccessReviewHistoryDefinition;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.AccessReviewScheduleDefinitionCollectionPage;
import com.microsoft.graph.requests.AccessReviewHistoryDefinitionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Set.
 */
public class AccessReviewSet extends Entity implements IJsonBackedObject {


    /**
     * The Definitions.
     * Represents the template and scheduling for an access review.
     */
    @SerializedName(value = "definitions", alternate = {"Definitions"})
    @Expose
	@Nullable
    public AccessReviewScheduleDefinitionCollectionPage definitions;

    /**
     * The History Definitions.
     * Represents a collection of access review history data and the scopes used to collect that data.
     */
    @SerializedName(value = "historyDefinitions", alternate = {"HistoryDefinitions"})
    @Expose
	@Nullable
    public AccessReviewHistoryDefinitionCollectionPage historyDefinitions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("definitions")) {
            definitions = serializer.deserializeObject(json.get("definitions"), AccessReviewScheduleDefinitionCollectionPage.class);
        }

        if (json.has("historyDefinitions")) {
            historyDefinitions = serializer.deserializeObject(json.get("historyDefinitions"), AccessReviewHistoryDefinitionCollectionPage.class);
        }
    }
}
