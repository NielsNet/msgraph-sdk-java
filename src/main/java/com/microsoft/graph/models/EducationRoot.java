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
import com.microsoft.graph.models.EducationUser;
import com.microsoft.graph.requests.EducationClassCollectionPage;
import com.microsoft.graph.requests.EducationSchoolCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Root.
 */
public class EducationRoot implements IJsonBackedObject {

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
     * The Classes.
     * 
     */
    @SerializedName(value = "classes", alternate = {"Classes"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.EducationClassCollectionPage classes;

    /**
     * The Me.
     * 
     */
    @SerializedName(value = "me", alternate = {"Me"})
    @Expose
	@Nullable
    public EducationUser me;

    /**
     * The Schools.
     * 
     */
    @SerializedName(value = "schools", alternate = {"Schools"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.EducationSchoolCollectionPage schools;

    /**
     * The Users.
     * 
     */
    @SerializedName(value = "users", alternate = {"Users"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.EducationUserCollectionPage users;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("classes")) {
            classes = serializer.deserializeObject(json.get("classes"), com.microsoft.graph.requests.EducationClassCollectionPage.class);
        }

        if (json.has("schools")) {
            schools = serializer.deserializeObject(json.get("schools"), com.microsoft.graph.requests.EducationSchoolCollectionPage.class);
        }

        if (json.has("users")) {
            users = serializer.deserializeObject(json.get("users"), com.microsoft.graph.requests.EducationUserCollectionPage.class);
        }
    }
}
