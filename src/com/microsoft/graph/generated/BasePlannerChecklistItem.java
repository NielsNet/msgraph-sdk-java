// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner Checklist Item.
 */
public class BasePlannerChecklistItem implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose(serialize = false)
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager getAdditionalDataManager() {
        return additionalDataManager;
    }

    public BasePlannerChecklistItem() {
        oDataType = "microsoft.graph.plannerChecklistItem";
    }

    /**
     * The Is Checked.
	 * Value is true if the item is checked and false otherwise.
     */
    @SerializedName("isChecked")
    @Expose
    public Boolean isChecked;

    /**
     * The Title.
	 * Title of the checklist item
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Order Hint.
	 * Used to set the relative order of items in the checklist. The format is defined as outlined here.
     */
    @SerializedName("orderHint")
    @Expose
    public String orderHint;

    /**
     * The Last Modified By.
	 * Read-only. User ID by which this is last modified.
     */
    @SerializedName("lastModifiedBy")
    @Expose
    public IdentitySet lastModifiedBy;

    /**
     * The Last Modified Date Time.
	 * Read-only. Date and time at which this is last modified. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;

    }
}
