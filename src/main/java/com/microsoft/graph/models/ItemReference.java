// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.SharepointIds;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Reference.
 */
public class ItemReference implements IJsonBackedObject {

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
     * The Drive Id.
     * Unique identifier of the drive instance that contains the driveItem. Only returned if the item is located in a [drive][]. Read-only.
     */
    @SerializedName(value = "driveId", alternate = {"DriveId"})
    @Expose
	@Nullable
    public String driveId;

    /**
     * The Drive Type.
     * Identifies the type of drive. Only returned if the item is located in a [drive][]. See [drive][] resource for values.
     */
    @SerializedName(value = "driveType", alternate = {"DriveType"})
    @Expose
	@Nullable
    public String driveType;

    /**
     * The Id.
     * Unique identifier of the driveItem in the drive or a listItem in a list. Read-only.
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
	@Nullable
    public String id;

    /**
     * The Name.
     * The name of the item being referenced. Read-only.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Path.
     * Path that can be used to navigate to the item. Read-only.
     */
    @SerializedName(value = "path", alternate = {"Path"})
    @Expose
	@Nullable
    public String path;

    /**
     * The Share Id.
     * A unique identifier for a shared resource that can be accessed via the [Shares][] API.
     */
    @SerializedName(value = "shareId", alternate = {"ShareId"})
    @Expose
	@Nullable
    public String shareId;

    /**
     * The Sharepoint Ids.
     * Returns identifiers useful for SharePoint REST compatibility. Read-only.
     */
    @SerializedName(value = "sharepointIds", alternate = {"SharepointIds"})
    @Expose
	@Nullable
    public SharepointIds sharepointIds;

    /**
     * The Site Id.
     * For OneDrive for Business and SharePoint, this property represents the ID of the site that contains the parent document library of the driveItem resource or the parent list of the listItem resource. The value is the same as the id property of that [site][] resource. It is an opaque string that consists of three identifiers of the site. For OneDrive, this property is not populated.
     */
    @SerializedName(value = "siteId", alternate = {"SiteId"})
    @Expose
	@Nullable
    public String siteId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
