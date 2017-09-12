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
 * The class for the Base Workbook Functions Pduration Request Builder.
 */
public class BaseWorkbookFunctionsPdurationRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPduration
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsPdurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement fv) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("rate", rate);
        mBodyParams.put("pv", pv);
        mBodyParams.put("fv", fv);
    }

    /**
     * Creates the IWorkbookFunctionsPdurationRequest
     *
     * @return The IWorkbookFunctionsPdurationRequest instance
     */
    public IWorkbookFunctionsPdurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPdurationRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsPdurationRequest instance
     */
    public IWorkbookFunctionsPdurationRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsPdurationRequest request = new WorkbookFunctionsPdurationRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("rate")) {
            request.mBody.rate = getParameter("rate");
        }

        if (hasParameter("pv")) {
            request.mBody.pv = getParameter("pv");
        }

        if (hasParameter("fv")) {
            request.mBody.fv = getParameter("fv");
        }

        return request;
    }
}
