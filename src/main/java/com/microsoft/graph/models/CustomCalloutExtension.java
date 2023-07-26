// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.CustomExtensionAuthenticationConfiguration;
import com.microsoft.graph.models.CustomExtensionClientConfiguration;
import com.microsoft.graph.models.CustomExtensionEndpointConfiguration;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Custom Callout Extension.
 */
public class CustomCalloutExtension extends Entity implements IJsonBackedObject {


    /**
     * The Authentication Configuration.
     * Configuration for securing the API call to the logic app. For example, using OAuth client credentials flow.
     */
    @SerializedName(value = "authenticationConfiguration", alternate = {"AuthenticationConfiguration"})
    @Expose
	@Nullable
    public CustomExtensionAuthenticationConfiguration authenticationConfiguration;

    /**
     * The Client Configuration.
     * HTTP connection settings that define how long Azure AD can wait for a connection to a logic app, how many times you can retry a timed-out connection and the exception scenarios when retries are allowed.
     */
    @SerializedName(value = "clientConfiguration", alternate = {"ClientConfiguration"})
    @Expose
	@Nullable
    public CustomExtensionClientConfiguration clientConfiguration;

    /**
     * The Description.
     * Description for the customCalloutExtension object.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Display name for the customCalloutExtension object.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Endpoint Configuration.
     * The type and details for configuring the endpoint to call the logic app's workflow.
     */
    @SerializedName(value = "endpointConfiguration", alternate = {"EndpointConfiguration"})
    @Expose
	@Nullable
    public CustomExtensionEndpointConfiguration endpointConfiguration;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}