// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Planner;
import com.microsoft.graph.requests.extensions.IPlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerBucketRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerBucketCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerBucketRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerPlanRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerPlanRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PlannerTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Request.
 */
public class PlannerRequest extends BaseRequest implements IPlannerRequest {
	
    /**
     * The request for the Planner
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Planner.class);
    }

    /**
     * Gets the Planner from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Planner> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Planner from the service
     *
     * @return the Planner from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Planner get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Planner> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Planner with a source
     *
     * @param sourcePlanner the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Planner sourcePlanner, final ICallback<Planner> callback) {
        send(HttpMethod.PATCH, callback, sourcePlanner);
    }

    /**
     * Patches this Planner with a source
     *
     * @param sourcePlanner the source object with updates
     * @return the updated Planner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Planner patch(final Planner sourcePlanner) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlanner);
    }

    /**
     * Creates a Planner with a new object
     *
     * @param newPlanner the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Planner newPlanner, final ICallback<Planner> callback) {
        send(HttpMethod.POST, callback, newPlanner);
    }

    /**
     * Creates a Planner with a new object
     *
     * @param newPlanner the new object to create
     * @return the created Planner
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Planner post(final Planner newPlanner) throws ClientException {
        return send(HttpMethod.POST, newPlanner);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PlannerRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PlannerRequest)this;
     }

}

