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
 * The class for the Base Workbook Functions Network Days_Intl Request Builder.
 */
public class BaseWorkbookFunctionsNetworkDays_IntlRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNetworkDays_Intl
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsNetworkDays_IntlRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement endDate, final com.google.gson.JsonElement weekend, final com.google.gson.JsonElement holidays) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("startDate", startDate);
        mBodyParams.put("endDate", endDate);
        mBodyParams.put("weekend", weekend);
        mBodyParams.put("holidays", holidays);
    }

    /**
     * Creates the IWorkbookFunctionsNetworkDays_IntlRequest
     *
     * @return The IWorkbookFunctionsNetworkDays_IntlRequest instance
     */
    public IWorkbookFunctionsNetworkDays_IntlRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsNetworkDays_IntlRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsNetworkDays_IntlRequest instance
     */
    public IWorkbookFunctionsNetworkDays_IntlRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsNetworkDays_IntlRequest request = new WorkbookFunctionsNetworkDays_IntlRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("startDate")) {
            request.mBody.startDate = getParameter("startDate");
        }

        if (hasParameter("endDate")) {
            request.mBody.endDate = getParameter("endDate");
        }

        if (hasParameter("weekend")) {
            request.mBody.weekend = getParameter("weekend");
        }

        if (hasParameter("holidays")) {
            request.mBody.holidays = getParameter("holidays");
        }

        return request;
    }
}
