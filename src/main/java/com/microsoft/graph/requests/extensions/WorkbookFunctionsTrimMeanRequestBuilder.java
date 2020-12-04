// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsTrimMeanRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Trim Mean Request Builder.
 */
public class WorkbookFunctionsTrimMeanRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsTrimMean
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param array the array
     * @param percent the percent
     */
    public WorkbookFunctionsTrimMeanRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement array, @Nullable final com.google.gson.JsonElement percent) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("array", array);
        bodyParams.put("percent", percent);
    }

    /**
     * Creates the WorkbookFunctionsTrimMeanRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsTrimMeanRequest instance
     */
    @Nonnull
    public WorkbookFunctionsTrimMeanRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsTrimMeanRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsTrimMeanRequest instance
     */
    @Nonnull
    public WorkbookFunctionsTrimMeanRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsTrimMeanRequest request = new WorkbookFunctionsTrimMeanRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("array")) {
            request.body.array = getParameter("array");
        }

        if (hasParameter("percent")) {
            request.body.percent = getParameter("percent");
        }

        return request;
    }
}
