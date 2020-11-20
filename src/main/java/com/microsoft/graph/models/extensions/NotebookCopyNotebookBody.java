// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notebook Copy Notebook Body.
 */
public class NotebookCopyNotebookBody {

    /**
     * The group Id.
     * 
     */
    @SerializedName(value = "groupId", alternate = {"GroupId"})
    @Expose
	@Nullable
    public String groupId;

    /**
     * The rename As.
     * 
     */
    @SerializedName(value = "renameAs", alternate = {"RenameAs"})
    @Expose
	@Nullable
    public String renameAs;

    /**
     * The notebook Folder.
     * 
     */
    @SerializedName(value = "notebookFolder", alternate = {"NotebookFolder"})
    @Expose
	@Nullable
    public String notebookFolder;

    /**
     * The site Collection Id.
     * 
     */
    @SerializedName(value = "siteCollectionId", alternate = {"SiteCollectionId"})
    @Expose
	@Nullable
    public String siteCollectionId;

    /**
     * The site Id.
     * 
     */
    @SerializedName(value = "siteId", alternate = {"SiteId"})
    @Expose
	@Nullable
    public String siteId;


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

    }
}
