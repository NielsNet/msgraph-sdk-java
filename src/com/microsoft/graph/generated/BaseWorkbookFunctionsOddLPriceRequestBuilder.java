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
 * The class for the Base Workbook Functions Odd LPrice Request Builder.
 */
public class BaseWorkbookFunctionsOddLPriceRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsOddLPrice
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsOddLPriceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement lastInterest, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement yld, final com.google.gson.JsonElement redemption, final com.google.gson.JsonElement frequency, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("settlement", settlement);
        mBodyParams.put("maturity", maturity);
        mBodyParams.put("lastInterest", lastInterest);
        mBodyParams.put("rate", rate);
        mBodyParams.put("yld", yld);
        mBodyParams.put("redemption", redemption);
        mBodyParams.put("frequency", frequency);
        mBodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsOddLPriceRequest
     *
     * @return The IWorkbookFunctionsOddLPriceRequest instance
     */
    public IWorkbookFunctionsOddLPriceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsOddLPriceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsOddLPriceRequest instance
     */
    public IWorkbookFunctionsOddLPriceRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsOddLPriceRequest request = new WorkbookFunctionsOddLPriceRequest(
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

        if (hasParameter("lastInterest")) {
            request.mBody.lastInterest = getParameter("lastInterest");
        }

        if (hasParameter("rate")) {
            request.mBody.rate = getParameter("rate");
        }

        if (hasParameter("yld")) {
            request.mBody.yld = getParameter("yld");
        }

        if (hasParameter("redemption")) {
            request.mBody.redemption = getParameter("redemption");
        }

        if (hasParameter("frequency")) {
            request.mBody.frequency = getParameter("frequency");
        }

        if (hasParameter("basis")) {
            request.mBody.basis = getParameter("basis");
        }

        return request;
    }
}
