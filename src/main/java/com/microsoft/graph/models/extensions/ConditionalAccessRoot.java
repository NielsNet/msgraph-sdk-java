// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.NamedLocation;
import com.microsoft.graph.models.extensions.ConditionalAccessPolicy;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.NamedLocationCollectionPage;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Root.
 */
public class ConditionalAccessRoot extends Entity implements IJsonBackedObject {


    /**
     * The Named Locations.
     * 
     */
    @SerializedName(value = "namedLocations", alternate = {"NamedLocations"})
    @Expose
	@Nullable
    public NamedLocationCollectionPage namedLocations;

    /**
     * The Policies.
     * 
     */
    @SerializedName(value = "policies", alternate = {"Policies"})
    @Expose
	@Nullable
    public ConditionalAccessPolicyCollectionPage policies;


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


        if (json.has("namedLocations")) {
            namedLocations = serializer.deserializeObject(json.get("namedLocations").toString(), NamedLocationCollectionPage.class);
        }

        if (json.has("policies")) {
            policies = serializer.deserializeObject(json.get("policies").toString(), ConditionalAccessPolicyCollectionPage.class);
        }
    }
}
