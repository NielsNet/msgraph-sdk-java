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
 * The class for the Base Workbook Chart Set Data Request Builder.
 */
public class BaseWorkbookChartSetDataRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookChartSetData
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookChartSetDataRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement sourceData, final String seriesBy) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("sourceData", sourceData);
        mBodyParams.put("seriesBy", seriesBy);
    }

    /**
     * Creates the IWorkbookChartSetDataRequest
     *
     * @return The IWorkbookChartSetDataRequest instance
     */
    public IWorkbookChartSetDataRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookChartSetDataRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookChartSetDataRequest instance
     */
    public IWorkbookChartSetDataRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookChartSetDataRequest request = new WorkbookChartSetDataRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("sourceData")) {
            request.mBody.sourceData = getParameter("sourceData");
        }

        if (hasParameter("seriesBy")) {
            request.mBody.seriesBy = getParameter("seriesBy");
        }

        return request;
    }
}
