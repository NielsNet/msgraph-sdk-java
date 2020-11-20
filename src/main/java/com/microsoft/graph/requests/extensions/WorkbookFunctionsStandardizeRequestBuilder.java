// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsStandardizeRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Standardize Request Builder.
 */
public class WorkbookFunctionsStandardizeRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsStandardize
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param mean the mean
     * @param standardDev the standardDev
     */
    public WorkbookFunctionsStandardizeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement x, @Nullable final com.google.gson.JsonElement mean, @Nullable final com.google.gson.JsonElement standardDev) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
        bodyParams.put("mean", mean);
        bodyParams.put("standardDev", standardDev);
    }

    /**
     * Creates the WorkbookFunctionsStandardizeRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsStandardizeRequest instance
     */
    @Nonnull
    public WorkbookFunctionsStandardizeRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsStandardizeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsStandardizeRequest instance
     */
    @Nonnull
    public WorkbookFunctionsStandardizeRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsStandardizeRequest request = new WorkbookFunctionsStandardizeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        if (hasParameter("mean")) {
            request.body.mean = getParameter("mean");
        }

        if (hasParameter("standardDev")) {
            request.body.standardDev = getParameter("standardDev");
        }

        return request;
    }
}
