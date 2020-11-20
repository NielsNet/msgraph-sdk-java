// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDegreesRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Degrees Request Builder.
 */
public class WorkbookFunctionsDegreesRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsDegrees
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param angle the angle
     */
    public WorkbookFunctionsDegreesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement angle) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("angle", angle);
    }

    /**
     * Creates the WorkbookFunctionsDegreesRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsDegreesRequest instance
     */
    @Nonnull
    public WorkbookFunctionsDegreesRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsDegreesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsDegreesRequest instance
     */
    @Nonnull
    public WorkbookFunctionsDegreesRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsDegreesRequest request = new WorkbookFunctionsDegreesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("angle")) {
            request.body.angle = getParameter("angle");
        }

        return request;
    }
}
