// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.FeatureTarget;
import com.microsoft.graph.models.AdvancedConfigState;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Method Feature Configuration.
 */
public class AuthenticationMethodFeatureConfiguration implements IJsonBackedObject {

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
     * The Exclude Target.
     * A single entity that is excluded from this feature.
     */
    @SerializedName(value = "excludeTarget", alternate = {"ExcludeTarget"})
    @Expose
	@Nullable
    public FeatureTarget excludeTarget;

    /**
     * The Include Target.
     * A single entity that is included in this feature.
     */
    @SerializedName(value = "includeTarget", alternate = {"IncludeTarget"})
    @Expose
	@Nullable
    public FeatureTarget includeTarget;

    /**
     * The State.
     * Enable or disable the feature. Possible values are: default, enabled, disabled, unknownFutureValue. The default value is used when the configuration hasn't been explicitly set and uses the default behavior of Azure AD for the setting. The default value is disabled.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public AdvancedConfigState state;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}