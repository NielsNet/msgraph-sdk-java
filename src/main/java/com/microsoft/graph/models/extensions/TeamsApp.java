// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.generated.TeamsAppDistributionMethod;
import com.microsoft.graph.models.extensions.TeamsAppDefinition;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App.
 */
public class TeamsApp extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The name of the catalog app provided by the app developer in the Microsoft Teams zip app package.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Distribution Method.
     * The method of distribution for the app. Read-only.
     */
    @SerializedName(value = "distributionMethod", alternate = {"DistributionMethod"})
    @Expose
	@Nullable
    public TeamsAppDistributionMethod distributionMethod;

    /**
     * The External Id.
     * The ID of the catalog provided by the app developer in the Microsoft Teams zip app package.
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
	@Nullable
    public String externalId;

    /**
     * The App Definitions.
     * The details for each version of the app.
     */
    @SerializedName(value = "appDefinitions", alternate = {"AppDefinitions"})
    @Expose
	@Nullable
    public TeamsAppDefinitionCollectionPage appDefinitions;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("appDefinitions")) {
            appDefinitions = serializer.deserializeObject(json.get("appDefinitions").toString(), TeamsAppDefinitionCollectionPage.class);
        }
    }
}
