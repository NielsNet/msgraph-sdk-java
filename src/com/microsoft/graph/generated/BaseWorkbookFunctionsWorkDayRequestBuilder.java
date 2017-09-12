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
 * The class for the Base Workbook Functions Work Day Request Builder.
 */
public class BaseWorkbookFunctionsWorkDayRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsWorkDay
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsWorkDayRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement days, final com.google.gson.JsonElement holidays) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("startDate", startDate);
        mBodyParams.put("days", days);
        mBodyParams.put("holidays", holidays);
    }

    /**
     * Creates the IWorkbookFunctionsWorkDayRequest
     *
     * @return The IWorkbookFunctionsWorkDayRequest instance
     */
    public IWorkbookFunctionsWorkDayRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsWorkDayRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsWorkDayRequest instance
     */
    public IWorkbookFunctionsWorkDayRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsWorkDayRequest request = new WorkbookFunctionsWorkDayRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("startDate")) {
            request.mBody.startDate = getParameter("startDate");
        }

        if (hasParameter("days")) {
            request.mBody.days = getParameter("days");
        }

        if (hasParameter("holidays")) {
            request.mBody.holidays = getParameter("holidays");
        }

        return request;
    }
}
