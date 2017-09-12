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
 * The class for the Base Workbook Functions Tbill Yield Request Builder.
 */
public class BaseWorkbookFunctionsTbillYieldRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsTbillYield
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsTbillYieldRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement pr) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("settlement", settlement);
        mBodyParams.put("maturity", maturity);
        mBodyParams.put("pr", pr);
    }

    /**
     * Creates the IWorkbookFunctionsTbillYieldRequest
     *
     * @return The IWorkbookFunctionsTbillYieldRequest instance
     */
    public IWorkbookFunctionsTbillYieldRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsTbillYieldRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsTbillYieldRequest instance
     */
    public IWorkbookFunctionsTbillYieldRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsTbillYieldRequest request = new WorkbookFunctionsTbillYieldRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("settlement")) {
            request.mBody.settlement = getParameter("settlement");
        }

        if (hasParameter("maturity")) {
            request.mBody.maturity = getParameter("maturity");
        }

        if (hasParameter("pr")) {
            request.mBody.pr = getParameter("pr");
        }

        return request;
    }
}
