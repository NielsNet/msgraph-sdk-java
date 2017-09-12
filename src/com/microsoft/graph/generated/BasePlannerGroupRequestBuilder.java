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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Planner Group Request Builder.
 */
public class BasePlannerGroupRequestBuilder extends BaseRequestBuilder implements IBasePlannerGroupRequestBuilder {

    /**
     * The request builder for the PlannerGroup
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BasePlannerGroupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IPlannerGroupRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IPlannerGroupRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new PlannerGroupRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPlannerPlanCollectionRequestBuilder getPlans() {
        return new PlannerPlanCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("plans"), getClient(), null);
    }

    public IPlannerPlanRequestBuilder getPlans(final String id) {
        return new PlannerPlanRequestBuilder(getRequestUrlWithAdditionalSegment("plans") + "/" + id, getClient(), null);
    }
}
