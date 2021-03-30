// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MimeContent;
import com.microsoft.graph.models.RgbColor;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Intune Brand.
 */
public class IntuneBrand implements IJsonBackedObject {

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
     * The Contact ITEmail Address.
     * Email address of the person/organization responsible for IT support.
     */
    @SerializedName(value = "contactITEmailAddress", alternate = {"ContactITEmailAddress"})
    @Expose
	@Nullable
    public String contactITEmailAddress;

    /**
     * The Contact ITName.
     * Name of the person/organization responsible for IT support.
     */
    @SerializedName(value = "contactITName", alternate = {"ContactITName"})
    @Expose
	@Nullable
    public String contactITName;

    /**
     * The Contact ITNotes.
     * Text comments regarding the person/organization responsible for IT support.
     */
    @SerializedName(value = "contactITNotes", alternate = {"ContactITNotes"})
    @Expose
	@Nullable
    public String contactITNotes;

    /**
     * The Contact ITPhone Number.
     * Phone number of the person/organization responsible for IT support.
     */
    @SerializedName(value = "contactITPhoneNumber", alternate = {"ContactITPhoneNumber"})
    @Expose
	@Nullable
    public String contactITPhoneNumber;

    /**
     * The Dark Background Logo.
     * Logo image displayed in Company Portal apps which have a dark background behind the logo.
     */
    @SerializedName(value = "darkBackgroundLogo", alternate = {"DarkBackgroundLogo"})
    @Expose
	@Nullable
    public MimeContent darkBackgroundLogo;

    /**
     * The Display Name.
     * Company/organization name that is displayed to end users.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Light Background Logo.
     * Logo image displayed in Company Portal apps which have a light background behind the logo.
     */
    @SerializedName(value = "lightBackgroundLogo", alternate = {"LightBackgroundLogo"})
    @Expose
	@Nullable
    public MimeContent lightBackgroundLogo;

    /**
     * The Online Support Site Name.
     * Display name of the company/organization’s IT helpdesk site.
     */
    @SerializedName(value = "onlineSupportSiteName", alternate = {"OnlineSupportSiteName"})
    @Expose
	@Nullable
    public String onlineSupportSiteName;

    /**
     * The Online Support Site Url.
     * URL to the company/organization’s IT helpdesk site.
     */
    @SerializedName(value = "onlineSupportSiteUrl", alternate = {"OnlineSupportSiteUrl"})
    @Expose
	@Nullable
    public String onlineSupportSiteUrl;

    /**
     * The Privacy Url.
     * URL to the company/organization’s privacy policy.
     */
    @SerializedName(value = "privacyUrl", alternate = {"PrivacyUrl"})
    @Expose
	@Nullable
    public String privacyUrl;

    /**
     * The Show Display Name Next To Logo.
     * Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     */
    @SerializedName(value = "showDisplayNameNextToLogo", alternate = {"ShowDisplayNameNextToLogo"})
    @Expose
	@Nullable
    public Boolean showDisplayNameNextToLogo;

    /**
     * The Show Logo.
     * Boolean that represents whether the administrator-supplied logo images are shown or not shown.
     */
    @SerializedName(value = "showLogo", alternate = {"ShowLogo"})
    @Expose
	@Nullable
    public Boolean showLogo;

    /**
     * The Show Name Next To Logo.
     * Boolean that represents whether the administrator-supplied display name will be shown next to the logo image.
     */
    @SerializedName(value = "showNameNextToLogo", alternate = {"ShowNameNextToLogo"})
    @Expose
	@Nullable
    public Boolean showNameNextToLogo;

    /**
     * The Theme Color.
     * Primary theme color used in the Company Portal applications and web portal.
     */
    @SerializedName(value = "themeColor", alternate = {"ThemeColor"})
    @Expose
	@Nullable
    public RgbColor themeColor;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}