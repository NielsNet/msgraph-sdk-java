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
import com.microsoft.graph.models.NotebookLinks;
import com.microsoft.graph.models.OnenoteUserRole;
import com.microsoft.graph.models.OnenoteEntityHierarchyModel;
import com.microsoft.graph.requests.SectionGroupCollectionPage;
import com.microsoft.graph.requests.OnenoteSectionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notebook.
 */
public class Notebook extends OnenoteEntityHierarchyModel implements IJsonBackedObject {


    /**
     * The Is Default.
     * Indicates whether this is the user's default notebook. Read-only.
     */
    @SerializedName(value = "isDefault", alternate = {"IsDefault"})
    @Expose
	@Nullable
    public Boolean isDefault;

    /**
     * The Is Shared.
     * Indicates whether the notebook is shared. If true, the contents of the notebook can be seen by people other than the owner. Read-only.
     */
    @SerializedName(value = "isShared", alternate = {"IsShared"})
    @Expose
	@Nullable
    public Boolean isShared;

    /**
     * The Links.
     * Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote native client if it's installed. The oneNoteWebURL link opens the notebook in OneNote on the web.
     */
    @SerializedName(value = "links", alternate = {"Links"})
    @Expose
	@Nullable
    public NotebookLinks links;

    /**
     * The Section Groups Url.
     * The URL for the sectionGroups navigation property, which returns all the section groups in the notebook. Read-only.
     */
    @SerializedName(value = "sectionGroupsUrl", alternate = {"SectionGroupsUrl"})
    @Expose
	@Nullable
    public String sectionGroupsUrl;

    /**
     * The Sections Url.
     * The URL for the sections navigation property, which returns all the sections in the notebook. Read-only.
     */
    @SerializedName(value = "sectionsUrl", alternate = {"SectionsUrl"})
    @Expose
	@Nullable
    public String sectionsUrl;

    /**
     * The User Role.
     * Possible values are: Owner, Contributor, Reader, None. Owner represents owner-level access to the notebook. Contributor represents read/write access to the notebook. Reader represents read-only access to the notebook. Read-only.
     */
    @SerializedName(value = "userRole", alternate = {"UserRole"})
    @Expose
	@Nullable
    public OnenoteUserRole userRole;

    /**
     * The Section Groups.
     * The section groups in the notebook. Read-only. Nullable.
     */
    @SerializedName(value = "sectionGroups", alternate = {"SectionGroups"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.SectionGroupCollectionPage sectionGroups;

    /**
     * The Sections.
     * The sections in the notebook. Read-only. Nullable.
     */
    @SerializedName(value = "sections", alternate = {"Sections"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.OnenoteSectionCollectionPage sections;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("sectionGroups")) {
            sectionGroups = serializer.deserializeObject(json.get("sectionGroups"), com.microsoft.graph.requests.SectionGroupCollectionPage.class);
        }

        if (json.has("sections")) {
            sections = serializer.deserializeObject(json.get("sections"), com.microsoft.graph.requests.OnenoteSectionCollectionPage.class);
        }
    }
}
