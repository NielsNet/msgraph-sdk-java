// Template Source: Templates\Java\models_extensions\BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ScheduleChangeRequestActor;
import com.microsoft.graph.models.generated.ScheduleChangeState;
import com.microsoft.graph.models.extensions.ChangeTrackedEntity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Change Request.
 */
public class ScheduleChangeRequest extends ChangeTrackedEntity implements IJsonBackedObject {


    /**
     * The Assigned To.
     * 
     */
    @SerializedName(value = "assignedTo", alternate = {"AssignedTo"})
    @Expose
	@Nullable
    public ScheduleChangeRequestActor assignedTo;

    /**
     * The Manager Action Date Time.
     * 
     */
    @SerializedName(value = "managerActionDateTime", alternate = {"ManagerActionDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar managerActionDateTime;

    /**
     * The Manager Action Message.
     * 
     */
    @SerializedName(value = "managerActionMessage", alternate = {"ManagerActionMessage"})
    @Expose
	@Nullable
    public String managerActionMessage;

    /**
     * The Manager User Id.
     * 
     */
    @SerializedName(value = "managerUserId", alternate = {"ManagerUserId"})
    @Expose
	@Nullable
    public String managerUserId;

    /**
     * The Sender Date Time.
     * 
     */
    @SerializedName(value = "senderDateTime", alternate = {"SenderDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar senderDateTime;

    /**
     * The Sender Message.
     * 
     */
    @SerializedName(value = "senderMessage", alternate = {"SenderMessage"})
    @Expose
	@Nullable
    public String senderMessage;

    /**
     * The Sender User Id.
     * 
     */
    @SerializedName(value = "senderUserId", alternate = {"SenderUserId"})
    @Expose
	@Nullable
    public String senderUserId;

    /**
     * The State.
     * 
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public ScheduleChangeState state;


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
