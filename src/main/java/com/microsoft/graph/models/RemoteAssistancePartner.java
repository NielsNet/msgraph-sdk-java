// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.RemoteAssistanceOnboardingStatus;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Remote Assistance Partner.
 */
public class RemoteAssistancePartner extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * Display name of the partner.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Connection Date Time.
     * Timestamp of the last request sent to Intune by the TEM partner.
     */
    @SerializedName(value = "lastConnectionDateTime", alternate = {"LastConnectionDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastConnectionDateTime;

    /**
     * The Onboarding Status.
     * TBD. Possible values are: notOnboarded, onboarding, onboarded.
     */
    @SerializedName(value = "onboardingStatus", alternate = {"OnboardingStatus"})
    @Expose
	@Nullable
    public RemoteAssistanceOnboardingStatus onboardingStatus;

    /**
     * The Onboarding Url.
     * URL of the partner's onboarding portal, where an administrator can configure their Remote Assistance service.
     */
    @SerializedName(value = "onboardingUrl", alternate = {"OnboardingUrl"})
    @Expose
	@Nullable
    public String onboardingUrl;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
