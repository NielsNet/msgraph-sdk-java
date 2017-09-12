// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner Bucket Collection Request.
 */
public class BasePlannerBucketCollectionRequest extends BaseCollectionRequest<BasePlannerBucketCollectionResponse, IPlannerBucketCollectionPage> implements IBasePlannerBucketCollectionRequest {

    /**
     * The request builder for this collection of PlannerBucket
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePlannerBucketCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BasePlannerBucketCollectionResponse.class, IPlannerBucketCollectionPage.class);
    }

    public void get(final ICallback<IPlannerBucketCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IPlannerBucketCollectionPage get() throws ClientException {
        final BasePlannerBucketCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PlannerBucket newPlannerBucket, final ICallback<PlannerBucket> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PlannerBucketRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPlannerBucket, callback);
    }

    public PlannerBucket post(final PlannerBucket newPlannerBucket) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PlannerBucketRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newPlannerBucket);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IPlannerBucketCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (PlannerBucketCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IPlannerBucketCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (PlannerBucketCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IPlannerBucketCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (PlannerBucketCollectionRequest)this;
    }

    public IPlannerBucketCollectionPage buildFromResponse(final BasePlannerBucketCollectionResponse response) {
        final IPlannerBucketCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PlannerBucketCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PlannerBucketCollectionPage page = new PlannerBucketCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
