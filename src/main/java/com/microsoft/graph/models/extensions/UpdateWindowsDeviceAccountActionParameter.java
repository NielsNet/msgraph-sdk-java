// Template Source: Templates\Java\models_extensions\BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.WindowsDeviceAccount;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Update Windows Device Account Action Parameter.
 */
public class UpdateWindowsDeviceAccountActionParameter implements IJsonBackedObject {

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
     * The Calendar Sync Enabled.
     * Not yet documented
     */
    @SerializedName(value = "calendarSyncEnabled", alternate = {"CalendarSyncEnabled"})
    @Expose
	@Nullable
    public Boolean calendarSyncEnabled;

    /**
     * The Device Account.
     * Not yet documented
     */
    @SerializedName(value = "deviceAccount", alternate = {"DeviceAccount"})
    @Expose
	@Nullable
    public WindowsDeviceAccount deviceAccount;

    /**
     * The Device Account Email.
     * Not yet documented
     */
    @SerializedName(value = "deviceAccountEmail", alternate = {"DeviceAccountEmail"})
    @Expose
	@Nullable
    public String deviceAccountEmail;

    /**
     * The Exchange Server.
     * Not yet documented
     */
    @SerializedName(value = "exchangeServer", alternate = {"ExchangeServer"})
    @Expose
	@Nullable
    public String exchangeServer;

    /**
     * The Password Rotation Enabled.
     * Not yet documented
     */
    @SerializedName(value = "passwordRotationEnabled", alternate = {"PasswordRotationEnabled"})
    @Expose
	@Nullable
    public Boolean passwordRotationEnabled;

    /**
     * The Session Initiation Protocal Address.
     * Not yet documented
     */
    @SerializedName(value = "sessionInitiationProtocalAddress", alternate = {"SessionInitiationProtocalAddress"})
    @Expose
	@Nullable
    public String sessionInitiationProtocalAddress;


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
	@Override
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
