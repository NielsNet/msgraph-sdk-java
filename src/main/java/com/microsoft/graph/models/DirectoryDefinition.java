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
import com.microsoft.graph.models.DirectoryDefinitionDiscoverabilities;
import com.microsoft.graph.models.ObjectDefinition;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Definition.
 */
public class DirectoryDefinition extends Entity implements IJsonBackedObject {


    /**
     * The Discoverabilities.
     * 
     */
    @SerializedName(value = "discoverabilities", alternate = {"Discoverabilities"})
    @Expose
	@Nullable
    public EnumSet<DirectoryDefinitionDiscoverabilities> discoverabilities;

    /**
     * The Discovery Date Time.
     * 
     */
    @SerializedName(value = "discoveryDateTime", alternate = {"DiscoveryDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime discoveryDateTime;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Objects.
     * 
     */
    @SerializedName(value = "objects", alternate = {"Objects"})
    @Expose
	@Nullable
    public java.util.List<ObjectDefinition> objects;

    /**
     * The Read Only.
     * 
     */
    @SerializedName(value = "readOnly", alternate = {"ReadOnly"})
    @Expose
	@Nullable
    public Boolean readOnly;

    /**
     * The Version.
     * 
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public String version;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
