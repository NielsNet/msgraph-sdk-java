// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsQuotientRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Quotient Request Builder.
 */
public class WorkbookFunctionsQuotientRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsQuotient
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param numerator the numerator
     * @param denominator the denominator
     */
    public WorkbookFunctionsQuotientRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement numerator, @Nullable final com.google.gson.JsonElement denominator) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("numerator", numerator);
        bodyParams.put("denominator", denominator);
    }

    /**
     * Creates the WorkbookFunctionsQuotientRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsQuotientRequest instance
     */
    @Nonnull
    public WorkbookFunctionsQuotientRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsQuotientRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsQuotientRequest instance
     */
    @Nonnull
    public WorkbookFunctionsQuotientRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsQuotientRequest request = new WorkbookFunctionsQuotientRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("numerator")) {
            request.body.numerator = getParameter("numerator");
        }

        if (hasParameter("denominator")) {
            request.body.denominator = getParameter("denominator");
        }

        return request;
    }
}
