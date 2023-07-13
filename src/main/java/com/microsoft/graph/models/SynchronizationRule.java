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
import com.microsoft.graph.models.ContainerFilter;
import com.microsoft.graph.models.GroupFilter;
import com.microsoft.graph.models.StringKeyStringValuePair;
import com.microsoft.graph.models.ObjectMapping;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Rule.
 */
public class SynchronizationRule implements IJsonBackedObject {

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
     * The Container Filter.
     * 
     */
    @SerializedName(value = "containerFilter", alternate = {"ContainerFilter"})
    @Expose
	@Nullable
    public ContainerFilter containerFilter;

    /**
     * The Editable.
     * true if the synchronization rule can be customized; false if this rule is read-only and should not be changed.
     */
    @SerializedName(value = "editable", alternate = {"Editable"})
    @Expose
	@Nullable
    public Boolean editable;

    /**
     * The Group Filter.
     * 
     */
    @SerializedName(value = "groupFilter", alternate = {"GroupFilter"})
    @Expose
	@Nullable
    public GroupFilter groupFilter;

    /**
     * The Id.
     * Synchronization rule identifier. Must be one of the identifiers recognized by the synchronization engine. Supported rule identifiers can be found in the synchronization template returned by the API.
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
	@Nullable
    public String id;

    /**
     * The Metadata.
     * Additional extension properties. Unless instructed explicitly by the support team, metadata values should not be changed.
     */
    @SerializedName(value = "metadata", alternate = {"Metadata"})
    @Expose
	@Nullable
    public java.util.List<StringKeyStringValuePair> metadata;

    /**
     * The Name.
     * Human-readable name of the synchronization rule. Not nullable.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Object Mappings.
     * Collection of object mappings supported by the rule. Tells the synchronization engine which objects should be synchronized.
     */
    @SerializedName(value = "objectMappings", alternate = {"ObjectMappings"})
    @Expose
	@Nullable
    public java.util.List<ObjectMapping> objectMappings;

    /**
     * The Priority.
     * Priority relative to other rules in the synchronizationSchema. Rules with the lowest priority number will be processed first.
     */
    @SerializedName(value = "priority", alternate = {"Priority"})
    @Expose
	@Nullable
    public Integer priority;

    /**
     * The Source Directory Name.
     * Name of the source directory. Must match one of the directory definitions in synchronizationSchema.
     */
    @SerializedName(value = "sourceDirectoryName", alternate = {"SourceDirectoryName"})
    @Expose
	@Nullable
    public String sourceDirectoryName;

    /**
     * The Target Directory Name.
     * Name of the target directory. Must match one of the directory definitions in synchronizationSchema.
     */
    @SerializedName(value = "targetDirectoryName", alternate = {"TargetDirectoryName"})
    @Expose
	@Nullable
    public String targetDirectoryName;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
