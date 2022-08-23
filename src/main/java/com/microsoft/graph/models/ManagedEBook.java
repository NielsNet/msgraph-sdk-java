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
import com.microsoft.graph.models.MimeContent;
import com.microsoft.graph.models.EBookInstallSummary;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ManagedEBookAssignmentCollectionPage;
import com.microsoft.graph.requests.DeviceInstallStateCollectionPage;
import com.microsoft.graph.requests.UserInstallStateSummaryCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook.
 */
public class ManagedEBook extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The date and time when the eBook file was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * Description.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Name of the eBook.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Information Url.
     * The more information Url.
     */
    @SerializedName(value = "informationUrl", alternate = {"InformationUrl"})
    @Expose
	@Nullable
    public String informationUrl;

    /**
     * The Large Cover.
     * Book cover.
     */
    @SerializedName(value = "largeCover", alternate = {"LargeCover"})
    @Expose
	@Nullable
    public MimeContent largeCover;

    /**
     * The Last Modified Date Time.
     * The date and time when the eBook was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Privacy Information Url.
     * The privacy statement Url.
     */
    @SerializedName(value = "privacyInformationUrl", alternate = {"PrivacyInformationUrl"})
    @Expose
	@Nullable
    public String privacyInformationUrl;

    /**
     * The Published Date Time.
     * The date and time when the eBook was published.
     */
    @SerializedName(value = "publishedDateTime", alternate = {"PublishedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime publishedDateTime;

    /**
     * The Publisher.
     * Publisher.
     */
    @SerializedName(value = "publisher", alternate = {"Publisher"})
    @Expose
	@Nullable
    public String publisher;

    /**
     * The Assignments.
     * The list of assignments for this eBook.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.ManagedEBookAssignmentCollectionPage assignments;

    /**
     * The Device States.
     * The list of installation states for this eBook.
     */
    @SerializedName(value = "deviceStates", alternate = {"DeviceStates"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DeviceInstallStateCollectionPage deviceStates;

    /**
     * The Install Summary.
     * Mobile App Install Summary.
     */
    @SerializedName(value = "installSummary", alternate = {"InstallSummary"})
    @Expose
	@Nullable
    public EBookInstallSummary installSummary;

    /**
     * The User State Summary.
     * The list of installation states for this eBook.
     */
    @SerializedName(value = "userStateSummary", alternate = {"UserStateSummary"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.UserInstallStateSummaryCollectionPage userStateSummary;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments"), com.microsoft.graph.requests.ManagedEBookAssignmentCollectionPage.class);
        }

        if (json.has("deviceStates")) {
            deviceStates = serializer.deserializeObject(json.get("deviceStates"), com.microsoft.graph.requests.DeviceInstallStateCollectionPage.class);
        }

        if (json.has("userStateSummary")) {
            userStateSummary = serializer.deserializeObject(json.get("userStateSummary"), com.microsoft.graph.requests.UserInstallStateSummaryCollectionPage.class);
        }
    }
}
