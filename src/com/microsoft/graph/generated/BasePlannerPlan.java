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
 * The class for the Base Planner Plan.
 */
public class BasePlannerPlan extends Entity implements IJsonBackedObject {


    public BasePlannerPlan() {
        oDataType = "microsoft.graph.plannerPlan";
    }

    /**
     * The Created By.
	 * Read-only. The user who created the plan.
     */
    @SerializedName("createdBy")
    @Expose
    public IdentitySet createdBy;

    /**
     * The Created Date Time.
	 * Read-only. Date and time at which the plan is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Owner.
	 * ID of the Group that owns the plan. A valid group must exist before this field can be set. Once set, this can only be updated by the owner.
     */
    @SerializedName("owner")
    @Expose
    public String owner;

    /**
     * The Title.
	 * Required. Title of the plan.
     */
    @SerializedName("title")
    @Expose
    public String title;

    /**
     * The Tasks.
	 * Read-only. Nullable. Collection of tasks in the plan.
     */
    public transient PlannerTaskCollectionPage tasks;

    /**
     * The Buckets.
	 * Read-only. Nullable. Collection of buckets in the plan.
     */
    public transient PlannerBucketCollectionPage buckets;

    /**
     * The Details.
	 * Read-only. Nullable. Additional details about the plan.
     */
    @SerializedName("details")
    @Expose
    public PlannerPlanDetails details;


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


        if (json.has("tasks")) {
            final BasePlannerTaskCollectionResponse response = new BasePlannerTaskCollectionResponse();
            if (json.has("tasks@odata.nextLink")) {
                response.nextLink = json.get("tasks@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tasks").toString(), JsonObject[].class);
            final PlannerTask[] array = new PlannerTask[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PlannerTask.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tasks = new PlannerTaskCollectionPage(response, null);
        }

        if (json.has("buckets")) {
            final BasePlannerBucketCollectionResponse response = new BasePlannerBucketCollectionResponse();
            if (json.has("buckets@odata.nextLink")) {
                response.nextLink = json.get("buckets@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("buckets").toString(), JsonObject[].class);
            final PlannerBucket[] array = new PlannerBucket[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PlannerBucket.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            buckets = new PlannerBucketCollectionPage(response, null);
        }
    }
}
