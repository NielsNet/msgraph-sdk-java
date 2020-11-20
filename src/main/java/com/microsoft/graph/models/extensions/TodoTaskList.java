// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.generated.WellknownListName;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.models.extensions.TodoTask;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;
import com.microsoft.graph.requests.extensions.TodoTaskCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Task List.
 */
public class TodoTaskList extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Is Owner.
     * 
     */
    @SerializedName(value = "isOwner", alternate = {"IsOwner"})
    @Expose
	@Nullable
    public Boolean isOwner;

    /**
     * The Is Shared.
     * 
     */
    @SerializedName(value = "isShared", alternate = {"IsShared"})
    @Expose
	@Nullable
    public Boolean isShared;

    /**
     * The Wellknown List Name.
     * 
     */
    @SerializedName(value = "wellknownListName", alternate = {"WellknownListName"})
    @Expose
	@Nullable
    public WellknownListName wellknownListName;

    /**
     * The Extensions.
     * 
     */
    @SerializedName(value = "extensions", alternate = {"Extensions"})
    @Expose
	@Nullable
    public ExtensionCollectionPage extensions;

    /**
     * The Tasks.
     * 
     */
    @SerializedName(value = "tasks", alternate = {"Tasks"})
    @Expose
	@Nullable
    public TodoTaskCollectionPage tasks;


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


        if (json.has("extensions")) {
            extensions = serializer.deserializeObject(json.get("extensions").toString(), ExtensionCollectionPage.class);
        }

        if (json.has("tasks")) {
            tasks = serializer.deserializeObject(json.get("tasks").toString(), TodoTaskCollectionPage.class);
        }
    }
}
