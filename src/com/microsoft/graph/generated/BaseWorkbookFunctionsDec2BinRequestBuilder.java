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
 * The class for the Base Workbook Functions Dec2Bin Request Builder.
 */
public class BaseWorkbookFunctionsDec2BinRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDec2Bin
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsDec2BinRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement places) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("number", number);
        mBodyParams.put("places", places);
    }

    /**
     * Creates the IWorkbookFunctionsDec2BinRequest
     *
     * @return The IWorkbookFunctionsDec2BinRequest instance
     */
    public IWorkbookFunctionsDec2BinRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDec2BinRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsDec2BinRequest instance
     */
    public IWorkbookFunctionsDec2BinRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsDec2BinRequest request = new WorkbookFunctionsDec2BinRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.mBody.number = getParameter("number");
        }

        if (hasParameter("places")) {
            request.mBody.places = getParameter("places");
        }

        return request;
    }
}
