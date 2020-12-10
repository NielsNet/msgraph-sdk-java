// Template Source: Templates\Java\models_extensions\BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.PermissionGrantConditionSet;
import com.microsoft.graph.models.extensions.PolicyBase;
import com.microsoft.graph.requests.extensions.PermissionGrantConditionSetCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Policy.
 */
public class PermissionGrantPolicy extends PolicyBase implements IJsonBackedObject {


    /**
     * The Excludes.
     * Condition sets which are excluded in this permission grant policy. Automatically expanded on GET.
     */
    @SerializedName(value = "excludes", alternate = {"Excludes"})
    @Expose
	@Nullable
    public PermissionGrantConditionSetCollectionPage excludes;

    /**
     * The Includes.
     * Condition sets which are included in this permission grant policy. Automatically expanded on GET.
     */
    @SerializedName(value = "includes", alternate = {"Includes"})
    @Expose
	@Nullable
    public PermissionGrantConditionSetCollectionPage includes;


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


        if (json.has("excludes")) {
            excludes = serializer.deserializeObject(json.get("excludes").toString(), PermissionGrantConditionSetCollectionPage.class);
        }

        if (json.has("includes")) {
            includes = serializer.deserializeObject(json.get("includes").toString(), PermissionGrantConditionSetCollectionPage.class);
        }
    }
}
