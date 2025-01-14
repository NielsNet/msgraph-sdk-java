// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Identity;
import com.microsoft.graph.models.SharePointIdentity;
import com.microsoft.graph.models.IdentitySet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Share Point Identity Set.
 */
public class SharePointIdentitySet extends IdentitySet implements IJsonBackedObject {


    /**
     * The Group.
     * The group associated with this action. Optional.
     */
    @SerializedName(value = "group", alternate = {"Group"})
    @Expose
	@Nullable
    public Identity group;

    /**
     * The Site Group.
     * The SharePoint group associated with this action. Optional.
     */
    @SerializedName(value = "siteGroup", alternate = {"SiteGroup"})
    @Expose
	@Nullable
    public SharePointIdentity siteGroup;

    /**
     * The Site User.
     * The SharePoint user associated with this action. Optional.
     */
    @SerializedName(value = "siteUser", alternate = {"SiteUser"})
    @Expose
	@Nullable
    public SharePointIdentity siteUser;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
