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
 * The class for the Base Workbook Functions Rri Request Builder.
 */
public class BaseWorkbookFunctionsRriRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRri
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsRriRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement fv) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("nper", nper);
        mBodyParams.put("pv", pv);
        mBodyParams.put("fv", fv);
    }

    /**
     * Creates the IWorkbookFunctionsRriRequest
     *
     * @return The IWorkbookFunctionsRriRequest instance
     */
    public IWorkbookFunctionsRriRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsRriRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsRriRequest instance
     */
    public IWorkbookFunctionsRriRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsRriRequest request = new WorkbookFunctionsRriRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("nper")) {
            request.mBody.nper = getParameter("nper");
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
